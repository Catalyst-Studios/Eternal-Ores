package net.radzratz.eternalores.worldgen.placed_features;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.worldgen.EOOrePlacement;
import net.radzratz.eternalores.worldgen.configured_features.EOConfiguredKeys;

import java.util.List;

import static net.radzratz.eternalores.worldgen.placed_features.EOPlacedKeys.*;

public class EOPlacedFeatures
{
    public static void bootstrap(BootstrapContext<PlacedFeature> context)
    {
        var ConfiguredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

    //ALUMINUM
    register(context, ALUMINUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredKeys.OVERWORLD_ALUMINUM_ORE_KEY),
            EOOrePlacement.commonOrePlacement(10,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

            //register(context, NETHER_ALUMINUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.NETHER_ALUMINUM_ORE_KEY),
            //        EOOrePlacement.commonOrePlacement(12,
            //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
            //register(context, END_ALUMINUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.END_ALUMINUM_ORE_KEY),
            //        EOOrePlacement.commonOrePlacement(12,
            //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //AMBER
    register(context, AMBER_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredKeys.OVERWORLD_AMBER_ORE_KEY),
            EOOrePlacement.rareOrePlacement(10,
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(78))));
    //register(context, NETHER_AMBER_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.NETHER_AMBER_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_AMBER_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.END_AMBER_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //APATITE
    register(context, APATITE_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredKeys.OVERWORLD_APATITE_ORE_KEY),
            EOOrePlacement.commonOrePlacement(10,
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(75))));
    //register(context, NETHER_APATITE_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.NETHER_APATITE_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_APATITE_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.END_APATITE_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    register(context, ARDITE_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredKeys.NETHER_ARDITE_ORE_KEY),
             EOOrePlacement.commonOrePlacement(10,
                     HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(128))));

    //CINNABAR
    register(context, CINNABAR_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredKeys.OVERWORLD_CINNABAR_ORE_KEY),
            EOOrePlacement.rareOrePlacement(10,
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(68))));
    //register(context, NETHER_CINNABAR_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.NETHER_CINNABAR_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_CINNABAR_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.END_CINNABAR_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //COBALT
    register(context, COBALT_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredKeys.OVERWORLD_COBALT_ORE_KEY),
            EOOrePlacement.rareOrePlacement(10,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(34))));
    //register(context, NETHER_COBALT_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.NETHER_ALUMINUM_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_COBALT_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.END_ALUMINUM_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //FLUORITE
    register(context, FLUORITE_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredKeys.OVERWORLD_FLUORITE_ORE_KEY),
            EOOrePlacement.commonOrePlacement(10,
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, NETHER_FLUORITE_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.NETHER_FLUORITE_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_FLUORITE_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.END_FLUORITE_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //GALLIUM
    register(context, GALLIUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredKeys.OVERWORLD_GALLIUM_ORE_KEY),
            EOOrePlacement.commonOrePlacement(10,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, NETHER_GALLIUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.NETHER_GALLIUM_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_GALLIUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.END_GALLIUM_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //IRIDIUM
    register(context, IRIDIUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredKeys.OVERWORLD_IRIDIUM_ORE_KEY),
             EOOrePlacement.commonOrePlacement(10,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, NETHER_IRIDIUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.NETHER_IRIDIUM_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_IRIDIUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.END_IRIDIUM_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //LEAD
    register(context, LEAD_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredKeys.OVERWORLD_LEAD_ORE_KEY),
            EOOrePlacement.commonOrePlacement(10,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, NETHER_LEAD_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.NETHER_LEAD_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_LEAD_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.END_LEAD_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //NECROTICARITE
    register(context, NECROTICARITE_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredKeys.NETHER_NECROTICARITE_ORE_KEY),
            EOOrePlacement.commonOrePlacement(10,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(128))));

    //NITER
    register(context, NITER_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredKeys.OVERWORLD_NITER_ORE_KEY),
            EOOrePlacement.commonOrePlacement(10,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, NETHER_NITER_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.NETHER_NITER_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_NITER_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.END_NITER_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //NICKEL
    register(context, NICKEL_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredKeys.OVERWORLD_NICKEL_ORE_KEY),
            EOOrePlacement.commonOrePlacement(10,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, NETHER_NICKEL_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.NETHER_NICKEL_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_NICKEL_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.END_NICKEL_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //OBSIDIAN
    register(context, OBSIDIAN_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredKeys.NETHER_OBSIDIAN_ORE_KEY),
             EOOrePlacement.commonOrePlacement(10,
                     HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(128))));

    //ONYX
    register(context, ONYX_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredKeys.OVERWORLD_ONYX_ORE_KEY),
            EOOrePlacement.rareOrePlacement(10,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, NETHER_ONYX_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.NETHER_ONYX_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_ONYX_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.END_ONYX_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //OSMIUM
    register(context, OSMIUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredKeys.OVERWORLD_OSMIUM_ORE_KEY),
            EOOrePlacement.commonOrePlacement(10,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, NETHER_OSMIUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.NETHER_OSMIUM_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_OSMIUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.END_OSMIUM_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //PERIDOT
    register(context, PERIDOT_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredKeys.OVERWORLD_PERIDOT_ORE_KEY),
            EOOrePlacement.rareOrePlacement(10,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(64))));
    //register(context, NETHER_PERIDOT_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.NETHER_PERIDOT_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_PERIDOT_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.END_PERIDOT_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //PLATINUM
    register(context, PLATINUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredKeys.OVERWORLD_PLATINUM_ORE_KEY),
            EOOrePlacement.rareOrePlacement(10,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(34))));
    //register(context, NETHER_PLATINUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.NETHER_PLATINUM_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_PLATINUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.END_PLATINUM_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //RUBY
    register(context, RUBY_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredKeys.OVERWORLD_RUBY_ORE_KEY),
            EOOrePlacement.rareOrePlacement(10,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, NETHER_RUBY_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.NETHER_RUBY_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_RUBY_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.END_RUBY_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //SILVER
    register(context, SILVER_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredKeys.OVERWORLD_SILVER_ORE_KEY),
            EOOrePlacement.commonOrePlacement(10,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, NETHER_SILVER_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.NETHER_SILVER_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_SILVER_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.END_SILVER_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //SAPPHIRE
    register(context, SAPPHIRE_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredKeys.OVERWORLD_SAPPHIRE_ORE_KEY),
            EOOrePlacement.rareOrePlacement(10,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, NETHER_SAPPHIRE_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.NETHER_SAPPHIRE_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_SAPPHIRE_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.END_SAPPHIRE_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //SULFUR
    register(context, SULFUR_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredKeys.OVERWORLD_SULFUR_ORE_KEY),
            EOOrePlacement.commonOrePlacement(10,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, NETHER_SULFUR_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.NETHER_SULFUR_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_SULFUR_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.END_SULFUR_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //TIN
    register(context, TIN_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredKeys.OVERWORLD_TIN_ORE_KEY),
            EOOrePlacement.commonOrePlacement(10,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, NETHER_TIN_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.NETHER_TIN_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_TIN_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.END_TIN_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //Uraninite
    register(context, URANINITE_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredKeys.OVERWORLD_URANINITE_ORE_KEY),
            EOOrePlacement.commonOrePlacement(10,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(40))));
    //register(context, NETHER_URANINITE_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.NETHER_URANINITE_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_URANINITE_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.END_URANINITE_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //URANIUM
    register(context, URANIUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredKeys.OVERWORLD_URANIUM_ORE_KEY),
            EOOrePlacement.commonOrePlacement(10,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(34))));
    //register(context, NETHER_URANIUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.NETHER_URANIUM_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_URANIUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.END_URANIUM_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //ZINC
    register(context, ZINC_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredKeys.OVERWORLD_ZINC_ORE_KEY),
            EOOrePlacement.commonOrePlacement(10,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, NETHER_ZINC_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.NETHER_ZINC_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_ZINC_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EOConfiguredFeatures.END_ZINC_ORE_KEY),
    //        EOOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    }


    public static ResourceKey<PlacedFeature> registerKey(String name)
    {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(EternalOres.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context,
                                 ResourceKey<PlacedFeature> key,
                                 Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers)
    {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
