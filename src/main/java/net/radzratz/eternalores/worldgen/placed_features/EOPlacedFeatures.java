package net.radzratz.eternalores.worldgen.placed_features;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.radzratz.eternalores.worldgen.placed_features.config.EOCountPlacement;
import net.radzratz.eternalores.worldgen.placed_features.config.EOHeightProvider;
import net.radzratz.eternalores.worldgen.placed_features.config.EORarityPlacement;

import java.util.List;

import static net.radzratz.eternalores.util.EOUtils.EO;
import static net.radzratz.eternalores.worldgen.ores.EOreKeys.*;

public class EOPlacedFeatures {
    public static void placedFeaturesRegistry(BootstrapContext<PlacedFeature> ctx) {
        rgtrCfgOre(ctx, ALUMINUM_FEATURE.placedOverworldFeature(), ALUMINUM_FEATURE.configuredOverworldFeature(), EO("aluminum_overworld"));
        rgtrCfgOre(ctx, ALUMINUM_FEATURE.placedMiningFeature(), ALUMINUM_FEATURE.configuredMiningFeature(), EO("aluminum_mining"));

        rgtrCfgOre(ctx, AMBER_FEATURE.placedOverworldFeature(), AMBER_FEATURE.configuredOverworldFeature(), EO("amber_overworld"));
        rgtrCfgOre(ctx, AMBER_FEATURE.placedMiningFeature(), AMBER_FEATURE.configuredMiningFeature(), EO("amber_mining"));

        rgtrCfgOre(ctx, ANCIENT_DEBRIS_FEATURE.placedMiningFeature(), ANCIENT_DEBRIS_FEATURE.configuredMiningFeature(), EO("ancient_debris_mining"));

        rgtrCfgOre(ctx, ANTHRACITE_FEATURE.placedOverworldFeature(), ANTHRACITE_FEATURE.configuredOverworldFeature(), EO("anthracite_overworld"));
        rgtrCfgOre(ctx, ANTHRACITE_FEATURE.placedMiningFeature(), ANTHRACITE_FEATURE.configuredMiningFeature(), EO("anthracite_mining"));
        rgtrCfgOre(ctx, APATITE_FEATURE.placedOverworldFeature(), APATITE_FEATURE.configuredOverworldFeature(), EO("apatite_overworld"));
        rgtrCfgOre(ctx, APATITE_FEATURE.placedMiningFeature(), APATITE_FEATURE.configuredMiningFeature(), EO("apatite_mining"));

        rgtrCfgOre(ctx, ARDITE_FEATURE.placedNetherFeature(), ARDITE_FEATURE.configuredNetherFeature(), EO("ardite_nether"));
        rgtrCfgOre(ctx, ARDITE_FEATURE.placedMiningFeature(), ARDITE_FEATURE.configuredMiningFeature(), EO("ardite_mining"));

        rgtrCfgOre(ctx, BERYLLIUM_FEATURE.placedOverworldFeature(), BERYLLIUM_FEATURE.configuredOverworldFeature(), EO("beryllium_overworld"));
        rgtrCfgOre(ctx, BERYLLIUM_FEATURE.placedMiningFeature(), BERYLLIUM_FEATURE.configuredMiningFeature(), EO("beryllium_mining"));

        rgtrCfgOre(ctx, BITUMINOUS_FEATURE.placedOverworldFeature(), BITUMINOUS_FEATURE.configuredOverworldFeature(), EO("bituminous_overworld"));
        rgtrCfgOre(ctx, BITUMINOUS_FEATURE.placedMiningFeature(), BITUMINOUS_FEATURE.configuredMiningFeature(), EO("bituminous_mining"));

        rgtrCfgOre(ctx, CINNABAR_FEATURE.placedOverworldFeature(), CINNABAR_FEATURE.configuredOverworldFeature(), EO("cinnabar_overworld"));
        rgtrCfgOre(ctx, CINNABAR_FEATURE.placedNetherFeature(), CINNABAR_FEATURE.configuredNetherFeature(), EO("cinnabar_nether"));
        rgtrCfgOre(ctx, CINNABAR_FEATURE.placedMiningFeature(), CINNABAR_FEATURE.configuredMiningFeature(), EO("cinnabar_mining"));

        rgtrCfgOre(ctx, COAL_FEATURE.placedMiningFeature(), COAL_FEATURE.configuredMiningFeature(), EO("coal_mining"));

        rgtrCfgOre(ctx, COBALT_FEATURE.placedOverworldFeature(), COBALT_FEATURE.configuredOverworldFeature(), EO("cobalt_overworld"));
        rgtrCfgOre(ctx, COBALT_FEATURE.placedNetherFeature(), COBALT_FEATURE.configuredNetherFeature(), EO("cobalt_nether"));
        rgtrCfgOre(ctx, COBALT_FEATURE.placedMiningFeature(), COBALT_FEATURE.configuredMiningFeature(), EO("cobalt_mining"));

        rgtrCfgOre(ctx, COPPER_FEATURE.placedMiningFeature(), COPPER_FEATURE.configuredMiningFeature(), EO("copper_mining"));

        rgtrCfgOre(ctx, DIAMOND_FEATURE.placedMiningFeature(), DIAMOND_FEATURE.configuredMiningFeature(), EO("diamond_mining"));

        rgtrCfgOre(ctx, EMERALD_FEATURE.placedMiningFeature(), EMERALD_FEATURE.configuredMiningFeature(), EO("emerald_mining"));

        rgtrCfgOre(ctx, FLUORITE_FEATURE.placedOverworldFeature(), FLUORITE_FEATURE.configuredOverworldFeature(), EO("fluorite_overworld"));
        rgtrCfgOre(ctx, FLUORITE_FEATURE.placedEndFeature(), FLUORITE_FEATURE.configuredEndFeature(), EO("fluorite_end"));
        rgtrCfgOre(ctx, FLUORITE_FEATURE.placedMiningFeature(), FLUORITE_FEATURE.configuredMiningFeature(), EO("fluorite_mining"));

        rgtrCfgOre(ctx, GALLIUM_FEATURE.placedOverworldFeature(), GALLIUM_FEATURE.configuredOverworldFeature(), EO("gallium_overworld"));
        rgtrCfgOre(ctx, GALLIUM_FEATURE.placedNetherFeature(), GALLIUM_FEATURE.configuredNetherFeature(), EO("gallium_nether"));
        rgtrCfgOre(ctx, GALLIUM_FEATURE.placedMiningFeature(), GALLIUM_FEATURE.configuredMiningFeature(), EO("gallium_mining"));

        rgtrCfgOre(ctx, GARNET_FEATURE.placedOverworldFeature(), GARNET_FEATURE.configuredOverworldFeature(), EO("garnet_overworld"));
        rgtrCfgOre(ctx, GARNET_FEATURE.placedNetherFeature(), GARNET_FEATURE.configuredNetherFeature(), EO("garnet_nether"));
        rgtrCfgOre(ctx, GARNET_FEATURE.placedMiningFeature(), GARNET_FEATURE.configuredMiningFeature(), EO("garnet_mining"));

        rgtrCfgOre(ctx, GOLD_FEATURE.placedMiningFeature(), GOLD_FEATURE.configuredMiningFeature(), EO("gold_mining"));

        rgtrCfgOre(ctx, JADE_FEATURE.placedOverworldFeature(), JADE_FEATURE.configuredOverworldFeature(), EO("jade_overworld"));
        rgtrCfgOre(ctx, JADE_FEATURE.placedNetherFeature(), JADE_FEATURE.configuredNetherFeature(), EO("jade_nether"));
        rgtrCfgOre(ctx, JADE_FEATURE.placedMiningFeature(), JADE_FEATURE.configuredMiningFeature(), EO("jade_mining"));

        rgtrCfgOre(ctx, IRIDIUM_FEATURE.placedOverworldFeature(), IRIDIUM_FEATURE.configuredOverworldFeature(), EO("iridium_overworld"));
        rgtrCfgOre(ctx, IRIDIUM_FEATURE.placedEndFeature(), IRIDIUM_FEATURE.configuredEndFeature(), EO("iridium_end"));
        rgtrCfgOre(ctx, IRIDIUM_FEATURE.placedMiningFeature(), IRIDIUM_FEATURE.configuredMiningFeature(), EO("iridium_mining"));

        rgtrCfgOre(ctx, IRON_FEATURE.placedMiningFeature(), IRON_FEATURE.configuredMiningFeature(), EO("iron_mining"));

        rgtrCfgOre(ctx, LAPIS_FEATURE.placedMiningFeature(), LAPIS_FEATURE.configuredMiningFeature(), EO("lapis_mining"));

        rgtrCfgOre(ctx, LEAD_FEATURE.placedOverworldFeature(), LEAD_FEATURE.configuredOverworldFeature(), EO("lead_overworld"));
        rgtrCfgOre(ctx, LEAD_FEATURE.placedEndFeature(), LEAD_FEATURE.configuredEndFeature(), EO("lead_end"));
        rgtrCfgOre(ctx, LEAD_FEATURE.placedMiningFeature(), LEAD_FEATURE.configuredMiningFeature(), EO("lead_mining"));

        rgtrCfgOre(ctx, LIGNITE_FEATURE.placedOverworldFeature(), LIGNITE_FEATURE.configuredOverworldFeature(), EO("lignite_overworld"));
        rgtrCfgOre(ctx, LIGNITE_FEATURE.placedMiningFeature(), LIGNITE_FEATURE.configuredMiningFeature(), EO("lignite_mining"));

        rgtrCfgOre(ctx, MOLYBDENUM_FEATURE.placedOverworldFeature(), MOLYBDENUM_FEATURE.configuredOverworldFeature(), EO("molybdenum_overworld"));
        rgtrCfgOre(ctx, MOLYBDENUM_FEATURE.placedNetherFeature(), MOLYBDENUM_FEATURE.configuredNetherFeature(), EO("molybdenum_nether"));
        rgtrCfgOre(ctx, MOLYBDENUM_FEATURE.placedEndFeature(), MOLYBDENUM_FEATURE.configuredEndFeature(), EO("molybdenum_end"));
        rgtrCfgOre(ctx, MOLYBDENUM_FEATURE.placedMiningFeature(), MOLYBDENUM_FEATURE.configuredMiningFeature(), EO("molybdenum_mining"));

        rgtrCfgOre(ctx, NECROTICARITE_FEATURE.placedNetherFeature(), NECROTICARITE_FEATURE.configuredNetherFeature(), EO("necroticarite_nether"));
        rgtrCfgOre(ctx, NECROTICARITE_FEATURE.placedMiningFeature(), NECROTICARITE_FEATURE.configuredMiningFeature(), EO("necroticarite_mining"));

        rgtrCfgOre(ctx, NEODYMIUM_FEATURE.placedOverworldFeature(), NEODYMIUM_FEATURE.configuredOverworldFeature(), EO("neodymium_overworld"));
        rgtrCfgOre(ctx, NEODYMIUM_FEATURE.placedEndFeature(), NEODYMIUM_FEATURE.configuredEndFeature(), EO("neodymium_end"));
        rgtrCfgOre(ctx, NEODYMIUM_FEATURE.placedMiningFeature(), NEODYMIUM_FEATURE.configuredMiningFeature(), EO("neodymium_mining"));

        rgtrCfgOre(ctx, NITER_FEATURE.placedOverworldFeature(), NITER_FEATURE.configuredOverworldFeature(), EO("niter_overworld"));
        rgtrCfgOre(ctx, NITER_FEATURE.placedMiningFeature(), NITER_FEATURE.configuredMiningFeature(), EO("niter_mining"));

        rgtrCfgOre(ctx, NICKEL_FEATURE.placedOverworldFeature(), NICKEL_FEATURE.configuredOverworldFeature(), EO("nickel_overworld"));
        rgtrCfgOre(ctx, NICKEL_FEATURE.placedNetherFeature(), NICKEL_FEATURE.configuredNetherFeature(), EO("nickel_nether"));
        rgtrCfgOre(ctx, NICKEL_FEATURE.placedMiningFeature(), NICKEL_FEATURE.configuredMiningFeature(), EO("nickel_mining"));

        rgtrCfgOre(ctx, OBSIDIAN_FEATURE.placedNetherFeature(), OBSIDIAN_FEATURE.configuredNetherFeature(), EO("obsidian_nether"));
        rgtrCfgOre(ctx, OBSIDIAN_FEATURE.placedMiningFeature(), OBSIDIAN_FEATURE.configuredMiningFeature(), EO("obsidian_mining"));

        rgtrCfgOre(ctx, ONYX_FEATURE.placedOverworldFeature(), ONYX_FEATURE.configuredOverworldFeature(), EO("onyx_overworld"));
        rgtrCfgOre(ctx, ONYX_FEATURE.placedNetherFeature(), ONYX_FEATURE.configuredNetherFeature(), EO("onyx_nether"));
        rgtrCfgOre(ctx, ONYX_FEATURE.placedMiningFeature(), ONYX_FEATURE.configuredMiningFeature(), EO("onyx_mining"));

        rgtrCfgOre(ctx, OSMIUM_FEATURE.placedOverworldFeature(), OSMIUM_FEATURE.configuredOverworldFeature(), EO("osmium_overworld"));
        rgtrCfgOre(ctx, OSMIUM_FEATURE.placedNetherFeature(), OSMIUM_FEATURE.configuredNetherFeature(), EO("osmium_nether"));
        rgtrCfgOre(ctx, OSMIUM_FEATURE.placedMiningFeature(), OSMIUM_FEATURE.configuredMiningFeature(), EO("osmium_mining"));

        rgtrCfgOre(ctx, PALLADIUM_FEATURE.placedOverworldFeature(), PALLADIUM_FEATURE.configuredOverworldFeature(), EO("palladium_overworld"));
        rgtrCfgOre(ctx, PALLADIUM_FEATURE.placedEndFeature(), PALLADIUM_FEATURE.configuredEndFeature(), EO("palladium_end"));
        rgtrCfgOre(ctx, PALLADIUM_FEATURE.placedMiningFeature(), PALLADIUM_FEATURE.configuredMiningFeature(), EO("palladium_mining"));

        rgtrCfgOre(ctx, PEAT_FEATURE.placedOverworldFeature(), PEAT_FEATURE.configuredOverworldFeature(), EO("peat_overworld"));
        rgtrCfgOre(ctx, PEAT_FEATURE.placedMiningFeature(), PEAT_FEATURE.configuredMiningFeature(), EO("peat_mining"));

        rgtrCfgOre(ctx, PEARL_FEATURE.placedOverworldFeature(), PEARL_FEATURE.configuredOverworldFeature(), EO("pearl_overworld"));
        rgtrCfgOre(ctx, PEARL_FEATURE.placedMiningFeature(), PEARL_FEATURE.configuredMiningFeature(), EO("pearl_mining"));

        rgtrCfgOre(ctx, PERIDOT_FEATURE.placedOverworldFeature(), PERIDOT_FEATURE.configuredOverworldFeature(), EO("peridot_overworld"));
        rgtrCfgOre(ctx, PERIDOT_FEATURE.placedNetherFeature(), PERIDOT_FEATURE.configuredNetherFeature(), EO("peridot_nether"));
        rgtrCfgOre(ctx, PERIDOT_FEATURE.placedMiningFeature(), PERIDOT_FEATURE.configuredMiningFeature(), EO("peridot_mining"));

        rgtrCfgOre(ctx, PLATINUM_FEATURE.placedOverworldFeature(), PLATINUM_FEATURE.configuredOverworldFeature(), EO("platinum_overworld"));
        rgtrCfgOre(ctx, PLATINUM_FEATURE.placedEndFeature(), PLATINUM_FEATURE.configuredEndFeature(), EO("platinum_end"));
        rgtrCfgOre(ctx, PLATINUM_FEATURE.placedMiningFeature(), PLATINUM_FEATURE.configuredMiningFeature(), EO("platinum_mining"));

        rgtrCfgOre(ctx, PYROLITE_FEATURE.placedNetherFeature(), PYROLITE_FEATURE.configuredNetherFeature(), EO("pyrolite_nether"));
        rgtrCfgOre(ctx, PYROLITE_FEATURE.placedEndFeature(), PYROLITE_FEATURE.configuredEndFeature(), EO("pyrolite_end"));
        rgtrCfgOre(ctx, PYROLITE_FEATURE.placedMiningFeature(), PYROLITE_FEATURE.configuredMiningFeature(), EO("pyrolite_mining"));

        rgtrCfgOre(ctx, QUARTZ_FEATURE.placedMiningFeature(), QUARTZ_FEATURE.configuredMiningFeature(), EO("quartz_mining"));

        rgtrCfgOre(ctx, REDSTONE_FEATURE.placedMiningFeature(), REDSTONE_FEATURE.configuredMiningFeature(), EO("redstone_mining"));

        rgtrCfgOre(ctx, RUBY_FEATURE.placedOverworldFeature(), RUBY_FEATURE.configuredOverworldFeature(), EO("ruby_overworld"));
        rgtrCfgOre(ctx, RUBY_FEATURE.placedNetherFeature(), RUBY_FEATURE.configuredNetherFeature(), EO("ruby_nether"));
        rgtrCfgOre(ctx, RUBY_FEATURE.placedMiningFeature(), RUBY_FEATURE.configuredMiningFeature(), EO("ruby_mining"));

        rgtrCfgOre(ctx, SALT_FEATURE.placedOverworldFeature(), SALT_FEATURE.configuredOverworldFeature(), EO("salt_overworld"));
        rgtrCfgOre(ctx, SALT_FEATURE.placedMiningFeature(), SALT_FEATURE.configuredMiningFeature(), EO("salt_mining"));

        rgtrCfgOre(ctx, SAPPHIRE_FEATURE.placedOverworldFeature(), SAPPHIRE_FEATURE.configuredOverworldFeature(), EO("sapphire_overworld"));
        rgtrCfgOre(ctx, SAPPHIRE_FEATURE.placedEndFeature(), SAPPHIRE_FEATURE.configuredEndFeature(), EO("sapphire_end"));
        rgtrCfgOre(ctx, SAPPHIRE_FEATURE.placedMiningFeature(), SAPPHIRE_FEATURE.configuredMiningFeature(), EO("sapphire_mining"));

        rgtrCfgOre(ctx, SCULKITE_FEATURE.placedOverworldFeature(), SCULKITE_FEATURE.configuredOverworldFeature(), EO("sculkite_overworld"));
        rgtrCfgOre(ctx, SCULKITE_FEATURE.placedMiningFeature(), SCULKITE_FEATURE.configuredMiningFeature(), EO("sculkite_mining"));

        rgtrCfgOre(ctx, SILVER_FEATURE.placedOverworldFeature(), SILVER_FEATURE.configuredOverworldFeature(), EO("silver_overworld"));
        rgtrCfgOre(ctx, SILVER_FEATURE.placedNetherFeature(), SILVER_FEATURE.configuredNetherFeature(), EO("silver_nether"));
        rgtrCfgOre(ctx, SILVER_FEATURE.placedMiningFeature(), SILVER_FEATURE.configuredMiningFeature(), EO("silver_mining"));

        rgtrCfgOre(ctx, SULFUR_FEATURE.placedOverworldFeature(), SULFUR_FEATURE.configuredOverworldFeature(), EO("sulfur_overworld"));
        rgtrCfgOre(ctx, SULFUR_FEATURE.placedNetherFeature(), SULFUR_FEATURE.configuredNetherFeature(), EO("sulfur_nether"));
        rgtrCfgOre(ctx, SULFUR_FEATURE.placedMiningFeature(), SULFUR_FEATURE.configuredMiningFeature(), EO("sulfur_mining"));

        rgtrCfgOre(ctx, SPINEL_FEATURE.placedOverworldFeature(), SPINEL_FEATURE.configuredOverworldFeature(), EO("spinel_overworld"));
        rgtrCfgOre(ctx, SPINEL_FEATURE.placedNetherFeature(), SPINEL_FEATURE.configuredNetherFeature(), EO("spinel_nether"));
        rgtrCfgOre(ctx, SPINEL_FEATURE.placedMiningFeature(), SPINEL_FEATURE.configuredMiningFeature(), EO("spinel_mining"));

        rgtrCfgOre(ctx, TANZANITE_FEATURE.placedOverworldFeature(), TANZANITE_FEATURE.configuredOverworldFeature(), EO("tanzanite_overworld"));
        rgtrCfgOre(ctx, TANZANITE_FEATURE.placedNetherFeature(), TANZANITE_FEATURE.configuredNetherFeature(), EO("tanzanite_nether"));
        rgtrCfgOre(ctx, TANZANITE_FEATURE.placedMiningFeature(), TANZANITE_FEATURE.configuredMiningFeature(), EO("tanzanite_mining"));

        rgtrCfgOre(ctx, TIN_FEATURE.placedOverworldFeature(), TIN_FEATURE.configuredOverworldFeature(), EO("tin_overworld"));
        rgtrCfgOre(ctx, TIN_FEATURE.placedEndFeature(), TIN_FEATURE.configuredEndFeature(), EO("tin_end"));
        rgtrCfgOre(ctx, TIN_FEATURE.placedMiningFeature(), TIN_FEATURE.configuredMiningFeature(), EO("tin_mining"));

        rgtrCfgOre(ctx, TITANIUM_FEATURE.placedOverworldFeature(), TITANIUM_FEATURE.configuredOverworldFeature(), EO("titanium_overworld"));
        rgtrCfgOre(ctx, TITANIUM_FEATURE.placedEndFeature(), TITANIUM_FEATURE.configuredEndFeature(), EO("titanium_end"));
        rgtrCfgOre(ctx, TITANIUM_FEATURE.placedMiningFeature(), TITANIUM_FEATURE.configuredMiningFeature(), EO("titanium_mining"));

        rgtrCfgOre(ctx, TUNGSTEN_FEATURE.placedOverworldFeature(), TUNGSTEN_FEATURE.configuredOverworldFeature(), EO("tungsten_overworld"));
        rgtrCfgOre(ctx, TUNGSTEN_FEATURE.placedEndFeature(), TUNGSTEN_FEATURE.configuredEndFeature(), EO("tungsten_end"));
        rgtrCfgOre(ctx, TUNGSTEN_FEATURE.placedMiningFeature(), TUNGSTEN_FEATURE.configuredMiningFeature(), EO("tungsten_mining"));

        rgtrCfgOre(ctx, ULTIMATITANIUM_FEATURE.placedEndFeature(), ULTIMATITANIUM_FEATURE.configuredEndFeature(), EO("ultimatitanium_end"));
        rgtrCfgOre(ctx, ULTIMATITANIUM_FEATURE.placedMiningFeature(), ULTIMATITANIUM_FEATURE.configuredMiningFeature(), EO("ultimatitanium_mining"));

        rgtrCfgOre(ctx, URANINITE_FEATURE.placedOverworldFeature(), URANINITE_FEATURE.configuredOverworldFeature(), EO("uraninite_overworld"));
        rgtrCfgOre(ctx, URANINITE_FEATURE.placedNetherFeature(), URANINITE_FEATURE.configuredNetherFeature(), EO("uraninite_nether"));
        rgtrCfgOre(ctx, URANINITE_FEATURE.placedMiningFeature(), URANINITE_FEATURE.configuredMiningFeature(), EO("uraninite_mining"));

        rgtrCfgOre(ctx, URANIUM_FEATURE.placedOverworldFeature(), URANIUM_FEATURE.configuredOverworldFeature(), EO("uranium_overworld"));
        rgtrCfgOre(ctx, URANIUM_FEATURE.placedNetherFeature(), URANIUM_FEATURE.configuredNetherFeature(), EO("uranium_nether"));
        rgtrCfgOre(ctx, URANIUM_FEATURE.placedEndFeature(), URANIUM_FEATURE.configuredEndFeature(), EO("uranium_end"));
        rgtrCfgOre(ctx, URANIUM_FEATURE.placedMiningFeature(), URANIUM_FEATURE.configuredMiningFeature(), EO("uranium_mining"));

        rgtrCfgOre(ctx, VANADIUM_FEATURE.placedOverworldFeature(), VANADIUM_FEATURE.configuredOverworldFeature(), EO("vanadium_overworld"));
        rgtrCfgOre(ctx, VANADIUM_FEATURE.placedEndFeature(), VANADIUM_FEATURE.configuredEndFeature(), EO("vanadium_end"));
        rgtrCfgOre(ctx, VANADIUM_FEATURE.placedMiningFeature(), VANADIUM_FEATURE.configuredMiningFeature(), EO("vanadium_mining"));

        rgtrCfgOre(ctx, ZINC_FEATURE.placedOverworldFeature(), ZINC_FEATURE.configuredOverworldFeature(), EO("zinc_overworld"));
        rgtrCfgOre(ctx, ZINC_FEATURE.placedMiningFeature(), ZINC_FEATURE.configuredMiningFeature(), EO("zinc_mining"));

        rgtrCfgOre(ctx, ZIRCON_FEATURE.placedOverworldFeature(), ZIRCON_FEATURE.configuredOverworldFeature(), EO("zircon_overworld"));
        rgtrCfgOre(ctx, ZIRCON_FEATURE.placedNetherFeature(), ZIRCON_FEATURE.configuredNetherFeature(), EO("zircon_nether"));
        rgtrCfgOre(ctx, ZIRCON_FEATURE.placedMiningFeature(), ZIRCON_FEATURE.configuredMiningFeature(), EO("zircon_mining"));
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
