package net.radzratz.eternalores.worldgen.placed_features;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.radzratz.eternalores.worldgen.placed_features.config.*;

import java.util.List;

import static net.radzratz.eternalores.util.EOUtils.EO;
import static net.radzratz.eternalores.worldgen.ores.EOreKeys.*;

public class EOPlacedFeatures {
    public static void placedFeaturesRegistry(BootstrapContext<PlacedFeature> ctx) {
        for (OreDefinitions ore : ORES) {
            String id = ore.id();

            if (ore.overworld() != null) {
                rgtrCfgOre(ctx, ore.keys().placedOverworldFeature(), ore.keys().configuredOverworldFeature(), EO(id + "_overworld"));
            }
            if (ore.nether() != null) {
                rgtrCfgOre(ctx, ore.keys().placedNetherFeature(), ore.keys().configuredNetherFeature(), EO(id + "_nether"));
            }
            if (ore.end() != null) {
                rgtrCfgOre(ctx, ore.keys().placedEndFeature(), ore.keys().configuredEndFeature(), EO(id + "_end"));
            }
            if (ore.mining() != null) {
                rgtrCfgOre(ctx, ore.keys().placedMiningFeature(), ore.keys().configuredMiningFeature(), EO(id + "_mining"));
            }
        }
    }

    private static void rgtrCfgOre(BootstrapContext<PlacedFeature> ctx, ResourceKey<PlacedFeature> pFtr, ResourceKey<ConfiguredFeature<?, ?>> cFtr, ResourceLocation oreId) {
        Holder<ConfiguredFeature<?, ?>> feature = ctx.lookup(Registries.CONFIGURED_FEATURE).getOrThrow(cFtr);

        List<PlacementModifier> modifiers = List.of(
                new EOCountPlacement(oreId),
                InSquarePlacement.spread(),
                new EORarityPlacement(oreId),
                BiomeFilter.biome(),
                HeightRangePlacement.of(new EOHeightProvider(oreId))
        );

        ctx.register(pFtr, new PlacedFeature(feature, modifiers));
    }
}
