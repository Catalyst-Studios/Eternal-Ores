package net.radzratz.eternalores.worldgen.configured_features;

import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.radzratz.eternalores.worldgen.EOWorldGenRegistries;
import net.radzratz.eternalores.worldgen.configured_features.config.EOreFeature;

import java.util.ArrayList;
import java.util.List;

import static net.minecraft.tags.BlockTags.*;
import static net.radzratz.eternalores.util.EOUtils.EO;
import static net.radzratz.eternalores.worldgen.ores.EOreKeys.*;

public class EOConfiguredFeatures {
    private static final RuleTest STONE_REPLACE = new TagMatchTest(STONE_ORE_REPLACEABLES);
    private static final RuleTest SLATE_REPLACE = new TagMatchTest(DEEPSLATE_ORE_REPLACEABLES);
    private static final RuleTest SAND_REPLACE = new TagMatchTest(SAND);
    private static final RuleTest SCULK_REPLACE = new TagMatchTest(SCULK_REPLACEABLE);
    private static final RuleTest NETHERRACK_REPLACE = new BlockMatchTest(Blocks.NETHERRACK);
    private static final RuleTest END_STONE_REPLACE = new BlockMatchTest(Blocks.END_STONE);
    private static final RuleTest STONE_REPLACE_MINING = new BlockMatchTest(Blocks.STONE);
    private static final RuleTest SLATE_REPLACE_MINING = new BlockMatchTest(Blocks.DEEPSLATE);

    public static void configuredFeaturesRegistry(BootstrapContext<ConfiguredFeature<?, ?>> ctx) {
        for (OreDefinitions ore : ORES) {
            String id = ore.id();

            if (ore.overworld() != null) {
                rgtr(ctx, ore.keys().configuredOverworldFeature(), overworldTargets(ore.overworld()), EO(id + "_overworld"));
            }
            if (ore.nether() != null) {
                rgtr(ctx, ore.keys().configuredNetherFeature(), List.of(target(NETHERRACK_REPLACE, ore.nether())), EO(id + "_nether"));
            }
            if (ore.end() != null) {
                rgtr(ctx, ore.keys().configuredEndFeature(), List.of(target(END_STONE_REPLACE, ore.end())), EO(id + "_end"));
            }
            if (ore.mining() != null) {
                rgtr(ctx, ore.keys().configuredMiningFeature(), miningTargets(ore.mining()), EO(id + "_mining"));
            }
        }
    }

    private static List<OreConfiguration.TargetBlockState> overworldTargets(OverworldSpec spec) {
        return switch (spec.type()) {
            case STONES -> List.of(target(STONE_REPLACE, spec.primary()), target(SLATE_REPLACE, spec.secondary()));
            case SLATE -> List.of(target(SLATE_REPLACE, spec.primary()));
            case SAND -> List.of(target(SAND_REPLACE, spec.primary()));
            case SCULK -> List.of(target(SCULK_REPLACE, spec.primary()));
        };
    }

    private static List<OreConfiguration.TargetBlockState> miningTargets(MiningSpec spec) {
        List<OreConfiguration.TargetBlockState> targets = new ArrayList<>();
        if (spec.stone() != null) targets.add(target(STONE_REPLACE_MINING, spec.stone()));
        if (spec.slate() != null) targets.add(target(SLATE_REPLACE_MINING, spec.slate()));
        if (spec.nether() != null) targets.add(target(NETHERRACK_REPLACE, spec.nether()));
        if (spec.end() != null) targets.add(target(END_STONE_REPLACE, spec.end()));
        return targets;
    }

    private static OreConfiguration.TargetBlockState target(RuleTest test, Block block) {
        return OreConfiguration.target(test, block.defaultBlockState());
    }

    private static void rgtr(BootstrapContext<ConfiguredFeature<?, ?>> ctx, ResourceKey<ConfiguredFeature<?, ?>> key, List<OreConfiguration.TargetBlockState> targets, ResourceLocation id) {
        if (targets.isEmpty()) return;
        ctx.register(key, new ConfiguredFeature<>(EOWorldGenRegistries.CONFIG_ORE_FEATURE.get(), new EOreFeature.EOreFeatureConfig(targets, id)));
    }
}
