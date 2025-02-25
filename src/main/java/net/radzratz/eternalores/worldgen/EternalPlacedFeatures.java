package net.radzratz.eternalores.worldgen;

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

import java.util.List;

public class EternalPlacedFeatures {

    //Aluminum
    public static final ResourceKey<PlacedFeature> ALUMINUM_ORE_PLACED_KEY = registerKey("aluminum_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_ALUMINUM_ORE_PLACED_KEY = registerKey("nether_aluminum_ore_placed");
    public static final ResourceKey<PlacedFeature> END_ALUMINUM_ORE_PLACED_KEY = registerKey("end_aluminum_ore_placed");
    //Amber
    public static final ResourceKey<PlacedFeature> AMBER_ORE_PLACED_KEY = registerKey("amber_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_AMBER_ORE_PLACED_KEY = registerKey("nether_amber_ore_placed");
    public static final ResourceKey<PlacedFeature> END_AMBER_ORE_PLACED_KEY = registerKey("end_amber_ore_placed");
    //Apatite
    public static final ResourceKey<PlacedFeature> APATITE_ORE_PLACED_KEY = registerKey("apatite_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_APATITE_ORE_PLACED_KEY = registerKey("nether_apatite_ore_placed");
    public static final ResourceKey<PlacedFeature> END_APATITE_ORE_PLACED_KEY = registerKey("end_apatite_ore_placed");
    //Cinnabar
    public static final ResourceKey<PlacedFeature> CINNABAR_ORE_PLACED_KEY = registerKey("cinnabar_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_CINNABAR_ORE_PLACED_KEY = registerKey("nether_cinnabar_ore_placed");
    public static final ResourceKey<PlacedFeature> END_CINNABAR_ORE_PLACED_KEY = registerKey("end_cinnabar_ore_placed");
    //Cobalt
    public static final ResourceKey<PlacedFeature> COBALT_ORE_PLACED_KEY = registerKey("cobalt_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_COBALT_ORE_PLACED_KEY = registerKey("nether_cobalt_ore_placed");
    public static final ResourceKey<PlacedFeature> END_COBALT_ORE_PLACED_KEY = registerKey("end_cobalt_ore_placed");
    //Fluorite
    public static final ResourceKey<PlacedFeature> FLUORITE_ORE_PLACED_KEY = registerKey("fluorite_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_FLUORITE_ORE_PLACED_KEY = registerKey("nether_fluorite_ore_placed");
    public static final ResourceKey<PlacedFeature> END_FLUORITE_ORE_PLACED_KEY = registerKey("end_fluorite_ore_placed");
    //Gallium
    public static final ResourceKey<PlacedFeature> GALLIUM_ORE_PLACED_KEY = registerKey("gallium_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_GALLIUM_ORE_PLACED_KEY = registerKey("nether_gallium_ore_placed");
    public static final ResourceKey<PlacedFeature> END_GALLIUM_ORE_PLACED_KEY = registerKey("end_gallium_ore_placed");
    //Iridium
    public static final ResourceKey<PlacedFeature> IRIDIUM_ORE_PLACED_KEY = registerKey("iridium_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_IRIDIUM_ORE_PLACED_KEY = registerKey("nether_iridium_ore_placed");
    public static final ResourceKey<PlacedFeature> END_IRIDIUM_ORE_PLACED_KEY = registerKey("end_iridium_ore_placed");
    //Lead
    public static final ResourceKey<PlacedFeature> LEAD_ORE_PLACED_KEY = registerKey("lead_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_LEAD_ORE_PLACED_KEY = registerKey("nether_lead_ore_placed");
    public static final ResourceKey<PlacedFeature> END_LEAD_ORE_PLACED_KEY = registerKey("end_lead_ore_placed");
    //Nickel
    public static final ResourceKey<PlacedFeature> NICKEL_ORE_PLACED_KEY = registerKey("nickel_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_NICKEL_ORE_PLACED_KEY = registerKey("nether_nickel_ore_placed");
    public static final ResourceKey<PlacedFeature> END_NICKEL_ORE_PLACED_KEY = registerKey("end_nickel_ore_placed");
    //Niter
    public static final ResourceKey<PlacedFeature> NITER_ORE_PLACED_KEY = registerKey("niter_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_NITER_ORE_PLACED_KEY = registerKey("nether_niter_ore_placed");
    public static final ResourceKey<PlacedFeature> END_NITER_ORE_PLACED_KEY = registerKey("end_niter_ore_placed");
    //Obsidian
    public static final ResourceKey<PlacedFeature> OBSIDIAN_ORE_PLACED_KEY = registerKey("obsidian_ore_placed");
    //Onyx
    public static final ResourceKey<PlacedFeature> ONYX_ORE_PLACED_KEY = registerKey("onyx_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_ONYX_ORE_PLACED_KEY = registerKey("nether_onyx_ore_placed");
    public static final ResourceKey<PlacedFeature> END_ONYX_ORE_PLACED_KEY = registerKey("end_onyx_ore_placed");
    //Osmium
    public static final ResourceKey<PlacedFeature> OSMIUM_ORE_PLACED_KEY = registerKey("osmium_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_OSMIUM_ORE_PLACED_KEY = registerKey("nether_osmium_ore_placed");
    public static final ResourceKey<PlacedFeature> END_OSMIUM_ORE_PLACED_KEY = registerKey("end_osmium_ore_placed");
    //Peridot
    public static final ResourceKey<PlacedFeature> PERIDOT_ORE_PLACED_KEY = registerKey("peridot_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_PERIDOT_ORE_PLACED_KEY = registerKey("nether_peridot_ore_placed");
    public static final ResourceKey<PlacedFeature> END_PERIDOT_ORE_PLACED_KEY = registerKey("end_peridot_ore_placed");
    //Platinum
    public static final ResourceKey<PlacedFeature> PLATINUM_ORE_PLACED_KEY = registerKey("platinum_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_PLATINUM_ORE_PLACED_KEY = registerKey("nether_platinum_ore_placed");
    public static final ResourceKey<PlacedFeature> END_PLATINUM_ORE_PLACED_KEY = registerKey("end_platinum_ore_placed");
    //Ruby
    public static final ResourceKey<PlacedFeature> RUBY_ORE_PLACED_KEY = registerKey("ruby_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_RUBY_ORE_PLACED_KEY = registerKey("nether_ruby_ore_placed");
    public static final ResourceKey<PlacedFeature> END_RUBY_ORE_PLACED_KEY = registerKey("end_ruby_ore_placed");
    //Sapphire
    public static final ResourceKey<PlacedFeature> SAPPHIRE_ORE_PLACED_KEY = registerKey("sapphire_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_SAPPHIRE_ORE_PLACED_KEY = registerKey("nether_sapphire_ore_placed");
    public static final ResourceKey<PlacedFeature> END_SAPPHIRE_ORE_PLACED_KEY = registerKey("end_sapphire_ore_placed");
    //Silver
    public static final ResourceKey<PlacedFeature> SILVER_ORE_PLACED_KEY = registerKey("silver_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_SILVER_ORE_PLACED_KEY = registerKey("nether_silver_ore_placed");
    public static final ResourceKey<PlacedFeature> END_SILVER_ORE_PLACED_KEY = registerKey("end_silver_ore_placed");
    //Sulfur
    public static final ResourceKey<PlacedFeature> SULFUR_ORE_PLACED_KEY = registerKey("sulfur_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_SULFUR_ORE_PLACED_KEY = registerKey("nether_sulfur_ore_placed");
    public static final ResourceKey<PlacedFeature> END_SULFUR_ORE_PLACED_KEY = registerKey("end_sulfur_ore_placed");
    //Tin
    public static final ResourceKey<PlacedFeature> TIN_ORE_PLACED_KEY = registerKey("tin_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_TIN_ORE_PLACED_KEY = registerKey("nether_tin_ore_placed");
    public static final ResourceKey<PlacedFeature> END_TIN_ORE_PLACED_KEY = registerKey("end_tin_ore_placed");
    //Uranium
    public static final ResourceKey<PlacedFeature> URANIUM_ORE_PLACED_KEY = registerKey("uranium_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_URANIUM_ORE_PLACED_KEY = registerKey("nether_uranium_ore_placed");
    public static final ResourceKey<PlacedFeature> END_URANIUM_ORE_PLACED_KEY = registerKey("end_uranium_ore_placed");
    //Zinc
    public static final ResourceKey<PlacedFeature> ZINC_ORE_PLACED_KEY = registerKey("zinc_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_ZINC_ORE_PLACED_KEY = registerKey("nether_zinc_ore_placed");
    public static final ResourceKey<PlacedFeature> END_ZINC_ORE_PLACED_KEY = registerKey("end_zinc_ore_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        System.out.println("Bootstrap of PlacedFeature is Loading");
        var ConfiguredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        System.out.println("Loading Placed Features");

    //ALUMINUM
    register(context, ALUMINUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.OVERWORLD_ALUMINUM_ORE_KEY),
            EternalOrePlacement.commonOrePlacement(10,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

            //register(context, NETHER_ALUMINUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.NETHER_ALUMINUM_ORE_KEY),
            //        EternalOrePlacement.commonOrePlacement(12,
            //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
            //register(context, END_ALUMINUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.END_ALUMINUM_ORE_KEY),
            //        EternalOrePlacement.commonOrePlacement(12,
            //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //AMBER
    register(context, AMBER_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.OVERWORLD_AMBER_ORE_KEY),
            EternalOrePlacement.rareOrePlacement(10,
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(78))));
    //register(context, NETHER_AMBER_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.NETHER_AMBER_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_AMBER_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.END_AMBER_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //APATITE
    register(context, APATITE_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.OVERWORLD_APATITE_ORE_KEY),
            EternalOrePlacement.commonOrePlacement(10,
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(75))));
    //register(context, NETHER_APATITE_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.NETHER_APATITE_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_APATITE_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.END_APATITE_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //CINNABAR
    register(context, CINNABAR_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.OVERWORLD_CINNABAR_ORE_KEY),
            EternalOrePlacement.rareOrePlacement(10,
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(68))));
    //register(context, NETHER_CINNABAR_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.NETHER_CINNABAR_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_CINNABAR_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.END_CINNABAR_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //COBALT
    register(context, COBALT_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.OVERWORLD_COBALT_ORE_KEY),
            EternalOrePlacement.rareOrePlacement(10,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(34))));
    //register(context, NETHER_COBALT_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.NETHER_ALUMINUM_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_COBALT_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.END_ALUMINUM_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //FLUORITE
    register(context, FLUORITE_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.OVERWORLD_FLUORITE_ORE_KEY),
            EternalOrePlacement.commonOrePlacement(10,
                    HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, NETHER_FLUORITE_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.NETHER_FLUORITE_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_FLUORITE_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.END_FLUORITE_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //GALLIUM
    register(context, GALLIUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.OVERWORLD_GALLIUM_ORE_KEY),
            EternalOrePlacement.commonOrePlacement(10,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, NETHER_GALLIUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.NETHER_GALLIUM_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_GALLIUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.END_GALLIUM_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //IRIDIUM
    register(context, IRIDIUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.OVERWORLD_IRIDIUM_ORE_KEY),
             EternalOrePlacement.commonOrePlacement(10,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, NETHER_IRIDIUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.NETHER_IRIDIUM_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_IRIDIUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.END_IRIDIUM_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //LEAD
    register(context, LEAD_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.OVERWORLD_LEAD_ORE_KEY),
            EternalOrePlacement.commonOrePlacement(10,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, NETHER_LEAD_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.NETHER_LEAD_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_LEAD_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.END_LEAD_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //NITER
    register(context, NITER_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.OVERWORLD_NITER_ORE_KEY),
            EternalOrePlacement.commonOrePlacement(10,
                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, NETHER_NITER_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.NETHER_NITER_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_NITER_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.END_NITER_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //NICKEL
    register(context, NICKEL_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.OVERWORLD_NICKEL_ORE_KEY),
            EternalOrePlacement.commonOrePlacement(10,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, NETHER_NICKEL_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.NETHER_NICKEL_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_NICKEL_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.END_NICKEL_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //OBSIDIAN
    register(context, OBSIDIAN_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.NETHER_OBSIDIAN_ORE_KEY),
             EternalOrePlacement.commonOrePlacement(10,
                     HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(128))));

    //ONYX
    register(context, ONYX_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.OVERWORLD_ONYX_ORE_KEY),
            EternalOrePlacement.rareOrePlacement(10,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, NETHER_ONYX_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.NETHER_ONYX_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_ONYX_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.END_ONYX_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //OSMIUM
    register(context, OSMIUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.OVERWORLD_OSMIUM_ORE_KEY),
            EternalOrePlacement.commonOrePlacement(10,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, NETHER_OSMIUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.NETHER_OSMIUM_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_OSMIUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.END_OSMIUM_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //PERIDOT
    register(context, PERIDOT_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.OVERWORLD_PERIDOT_ORE_KEY),
            EternalOrePlacement.rareOrePlacement(10,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(64))));
    //register(context, NETHER_PERIDOT_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.NETHER_PERIDOT_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_PERIDOT_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.END_PERIDOT_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //PLATINUM
    register(context, PLATINUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.OVERWORLD_PLATINUM_ORE_KEY),
            EternalOrePlacement.rareOrePlacement(10,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(34))));
    //register(context, NETHER_PLATINUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.NETHER_PLATINUM_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_PLATINUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.END_PLATINUM_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //RUBY
    register(context, RUBY_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.OVERWORLD_RUBY_ORE_KEY),
            EternalOrePlacement.rareOrePlacement(10,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, NETHER_RUBY_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.NETHER_RUBY_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_RUBY_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.END_RUBY_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //SILVER
    register(context, SILVER_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.OVERWORLD_SILVER_ORE_KEY),
            EternalOrePlacement.commonOrePlacement(10,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, NETHER_SILVER_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.NETHER_SILVER_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_SILVER_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.END_SILVER_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //SAPPHIRE
    register(context, SAPPHIRE_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.OVERWORLD_SAPPHIRE_ORE_KEY),
            EternalOrePlacement.rareOrePlacement(10,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, NETHER_SAPPHIRE_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.NETHER_SAPPHIRE_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_SAPPHIRE_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.END_SAPPHIRE_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //SULFUR
    register(context, SULFUR_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.OVERWORLD_SULFUR_ORE_KEY),
            EternalOrePlacement.commonOrePlacement(10,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, NETHER_SULFUR_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.NETHER_SULFUR_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_SULFUR_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.END_SULFUR_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //TIN
    register(context, TIN_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.OVERWORLD_TIN_ORE_KEY),
            EternalOrePlacement.commonOrePlacement(10,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, NETHER_TIN_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.NETHER_TIN_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_TIN_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.END_TIN_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //URANIUM
    register(context, URANIUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.OVERWORLD_URANIUM_ORE_KEY),
            EternalOrePlacement.commonOrePlacement(10,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(34))));
    //register(context, NETHER_URANIUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.NETHER_URANIUM_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_URANIUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.END_URANIUM_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //ZINC
    register(context, ZINC_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.OVERWORLD_ZINC_ORE_KEY),
            EternalOrePlacement.commonOrePlacement(10,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, NETHER_ZINC_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.NETHER_ZINC_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_ZINC_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.END_ZINC_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    }


    private static ResourceKey<PlacedFeature> registerKey(String name) {
        System.out.println("Loading Register Key of Placed Features");
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(EternalOres.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key,
                                 Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        System.out.println("Loading Bootstrap Context of Placed Features");
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
