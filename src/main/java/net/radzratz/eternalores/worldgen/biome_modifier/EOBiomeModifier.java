package net.radzratz.eternalores.worldgen.biome_modifier;

import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.radzratz.eternalores.worldgen.biome_modifier.config.EOBiomeModifierFeatures;

import java.util.Arrays;

import static net.minecraft.tags.BiomeTags.*;
import static net.minecraft.world.level.levelgen.GenerationStep.Decoration.UNDERGROUND_ORES;
import static net.radzratz.eternalores.util.EOUtils.EO;
import static net.radzratz.eternalores.util.tags.biome.EOBiomeTags.Biomes.IS_MINING_DIM;
import static net.radzratz.eternalores.worldgen.ores.EOreKeys.*;

public class EOBiomeModifier {
    private static final GenerationStep.Decoration STEP = UNDERGROUND_ORES;

    public static void biomeModifierRegistry(BootstrapContext<BiomeModifier> ctx) {
        for (OreDefinitions ore : ORES) {
            String id = ore.id();

            if (ore.overworld() != null) {
                rgtrCfg(ctx, id + "_overworld", ore.keys().biomeModifierOverworld(), ore.overworldBiome(), new OreBiomeEntry(ore.keys().placedOverworldFeature()));
            }
            if (ore.nether() != null) {
                rgtrCfg(ctx, id + "_nether", ore.keys().biomeModifierNether(), IS_NETHER, new OreBiomeEntry(ore.keys().placedNetherFeature()));
            }
            if (ore.end() != null) {
                rgtrCfg(ctx, id + "_end", ore.keys().biomeModifierEnd(), IS_END, new OreBiomeEntry(ore.keys().placedEndFeature()));
            }
            if (ore.mining() != null) {
                rgtrCfg(ctx, id + "_mining", ore.keys().biomeModifierMining(), IS_MINING_DIM, new OreBiomeEntry(ore.keys().placedMiningFeature()));
            }
        }
    }

    // We use this instead of PlacedFeatures in case we add multiple keys on a single entry
    public record OreBiomeEntry(ResourceKey<PlacedFeature> placed) {}

    private static void rgtrCfg(BootstrapContext<BiomeModifier> ctx, String id, ResourceKey<BiomeModifier> mKey, TagKey<Biome> bTag, OreBiomeEntry... entries) {
        var biomes = ctx.lookup(Registries.BIOME);
        var placed = ctx.lookup(Registries.PLACED_FEATURE);

        HolderSet<PlacedFeature> features = HolderSet.direct(Arrays.stream(entries).map(e -> placed.getOrThrow(e.placed())).toList());

        ctx.register(mKey, new EOBiomeModifierFeatures(biomes.getOrThrow(bTag), features, STEP, EO(id)));
    }
}
