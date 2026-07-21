package net.radzratz.eternalores.util.loot_tables;

import com.google.common.collect.Multimap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.minecraft.Util;
import net.minecraft.core.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.ProblemReporter;
import net.minecraft.world.RandomSequence;
import net.minecraft.world.level.levelgen.RandomSupport;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.neoforge.common.conditions.ConditionalOps;
import net.neoforged.neoforge.common.conditions.ICondition;
import net.neoforged.neoforge.common.conditions.WithConditions;
import org.jetbrains.annotations.NotNull;

import java.nio.file.Path;
import java.util.*;
import java.util.concurrent.CompletableFuture;

import static net.radzratz.eternalores.EternalOres.LOG;

public class EOConditionalLootTableProvider extends LootTableProvider {
    private static final Codec<Optional<WithConditions<LootTable>>> CONDITIONAL_CODEC =
            ConditionalOps.createConditionalCodecWithConditions(LootTable.DIRECT_CODEC);

    private final PackOutput.PathProvider pathProvider;
    private final CompletableFuture<HolderLookup.Provider> registries;

    public EOConditionalLootTableProvider(PackOutput output, Set<ResourceKey<LootTable>> tables, List<SubProviderEntry> sProvs, CompletableFuture<HolderLookup.Provider> reg) {
        super(output, tables, sProvs, reg);
        this.pathProvider = output.createRegistryElementsPathProvider(Registries.LOOT_TABLE);
        this.registries = reg;
    }

    @Override
    public @NotNull CompletableFuture<?> run(@NotNull CachedOutput cache) {
        return registries.thenCompose(provider -> run(cache, provider));
    }

    private CompletableFuture<?> run(CachedOutput cache, HolderLookup.Provider provider) {
        Map<ResourceKey<LootTable>, List<ICondition>> conditionMap = new HashMap<>();
        WritableRegistry<LootTable> reg = new MappedRegistry<>(Registries.LOOT_TABLE, Lifecycle.experimental());
        Map<RandomSupport.Seed128bit, ResourceLocation> sequenceMap = new Object2ObjectOpenHashMap<>();

        getTables().forEach(entry -> {
            LootTableSubProvider subProvider = entry.provider().apply(provider);
            subProvider.generate((key, builder) -> {
                ResourceLocation loc = key.location();

                ResourceLocation existing = sequenceMap.put(RandomSequence.seedForKey(loc), loc);
                if (existing != null) {
                    Util.logAndPauseIfInIde("Loot table random sequence seed collision on "
                            + existing + " and " + loc);
                }

                builder.setRandomSequence(loc);
                reg.register(key, builder.setParamSet(entry.paramSet()).build(), RegistrationInfo.BUILT_IN);
            });

            if (subProvider instanceof EOConditionalLootSubProvider conditional) {
                conditionMap.putAll(conditional.getConditionMap());
            }
        });

        reg.freeze();

        ProblemReporter.Collector reporter = new ProblemReporter.Collector();
        ValidationContext ctx = new ValidationContext(reporter, LootContextParamSets.ALL_PARAMS,
                new RegistryAccess.ImmutableRegistryAccess(List.of(reg)).freeze().asGetterLookup());
        super.validate(reg, ctx, reporter);

        Multimap<String, String> problems = reporter.get();
        if (!problems.isEmpty()) {
            problems.forEach((path, msg) -> LOG.warn("Found validation problem in {}: {}", path, msg));
            throw new IllegalStateException("Failed to validate loot tables, see logs");
        }

        return CompletableFuture.allOf(reg.entrySet().stream().map(entry -> {
            ResourceKey<LootTable> key = entry.getKey();
            LootTable table = entry.getValue();
            Path path = pathProvider.json(key.location());

            List<ICondition> conditions = conditionMap.get(key);
            if (conditions != null && !conditions.isEmpty()) {
                return DataProvider.saveStable(cache, provider, CONDITIONAL_CODEC,
                        Optional.of(new WithConditions<>(conditions, table)), path);
            }

            return DataProvider.saveStable(cache, provider, LootTable.DIRECT_CODEC, table, path);
        }).toArray(CompletableFuture[]::new));
    }
}
