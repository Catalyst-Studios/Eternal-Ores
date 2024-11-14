package net.radzratz.eternalitems.worldgen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.radzratz.eternalitems.EternalItems;

import java.util.List;

public class EternalPlacedFeatures {
    //Aluminum
    public static final ResourceKey<PlacedFeature> ALUMINUM_ORE_PLACED_KEY = registerKey("aluminum_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_ALUMINUM_ORE_PLACED_KEY = registerKey("nether_aluminum_ore_placed");
    public static final ResourceKey<PlacedFeature> END_ALUMINUM_ORE_PLACED_KEY = registerKey("end_aluminum_ore_placed");
    //Cobalt
    public static final ResourceKey<PlacedFeature> COBALT_ORE_PLACED_KEY = registerKey("cobalt_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_COBALT_ORE_PLACED_KEY = registerKey("nether_cobalt_ore_placed");
    public static final ResourceKey<PlacedFeature> END_COBALT_ORE_PLACED_KEY = registerKey("end_cobalt_ore_placed");
    //Fluorite
    public static final ResourceKey<PlacedFeature> FLUORITE_ORE_PLACED_KEY = registerKey("fluorite_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_FLUORITE_ORE_PLACED_KEY = registerKey("nether_fluorite_ore_placed");
    public static final ResourceKey<PlacedFeature> END_FLUORITE_ORE_PLACED_KEY = registerKey("end_fluorite_ore_placed");
    //Lead
    public static final ResourceKey<PlacedFeature> LEAD_ORE_PLACED_KEY = registerKey("lead_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_LEAD_ORE_PLACED_KEY = registerKey("nether_lead_ore_placed");
    public static final ResourceKey<PlacedFeature> END_LEAD_ORE_PLACED_KEY = registerKey("end_lead_ore_placed");
    //Nickel
    public static final ResourceKey<PlacedFeature> NICKEL_ORE_PLACED_KEY = registerKey("nickel_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_NICKEL_ORE_PLACED_KEY = registerKey("nether_nickel_ore_placed");
    public static final ResourceKey<PlacedFeature> END_NICKEL_ORE_PLACED_KEY = registerKey("end_nickel_ore_placed");
    //Osmium
    public static final ResourceKey<PlacedFeature> OSMIUM_ORE_PLACED_KEY = registerKey("osmium_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_OSMIUM_ORE_PLACED_KEY = registerKey("nether_osmium_ore_placed");
    public static final ResourceKey<PlacedFeature> END_OSMIUM_ORE_PLACED_KEY = registerKey("end_osmium_ore_placed");
    //Platinum
    public static final ResourceKey<PlacedFeature> PLATINUM_ORE_PLACED_KEY = registerKey("platinum_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_PLATINUM_ORE_PLACED_KEY = registerKey("nether_platinum_ore_placed");
    public static final ResourceKey<PlacedFeature> END_PLATINUM_ORE_PLACED_KEY = registerKey("end_platinum_ore_placed");
    //Plutonium
    public static final ResourceKey<PlacedFeature> PLUTONIUM_ORE_PLACED_KEY = registerKey("plutonium_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_PLUTONIUM_ORE_PLACED_KEY = registerKey("nether_plutonium_ore_placed");
    public static final ResourceKey<PlacedFeature> END_PLUTONIUM_ORE_PLACED_KEY = registerKey("end_plutonium_ore_placed");
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
        HolderGetter<ConfiguredFeature<?, ?>> ConfiguredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

    //ALUMINUM
    register(context, ALUMINUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.OVERWORLD_ALUMINUM_ORE_KEY),
            EternalOrePlacement.commonOrePlacement(18,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, NETHER_ALUMINUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.NETHER_ALUMINUM_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_ALUMINUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.END_ALUMINUM_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //COBALT
    register(context, COBALT_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.OVERWORLD_COBALT_ORE_KEY),
            EternalOrePlacement.commonOrePlacement(18,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, NETHER_COBALT_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.NETHER_ALUMINUM_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_COBALT_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.END_ALUMINUM_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //FLUORITE
    register(context, FLUORITE_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.OVERWORLD_FLUORITE_ORE_KEY),
            EternalOrePlacement.commonOrePlacement(18,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, NETHER_FLUORITE_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.NETHER_FLUORITE_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_FLUORITE_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.END_FLUORITE_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //LEAD
    register(context, LEAD_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.OVERWORLD_LEAD_ORE_KEY),
            EternalOrePlacement.commonOrePlacement(18,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, NETHER_LEAD_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.NETHER_LEAD_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_LEAD_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.END_LEAD_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //NICKEL
    register(context, NICKEL_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.OVERWORLD_NICKEL_ORE_KEY),
            EternalOrePlacement.commonOrePlacement(18,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, NETHER_NICKEL_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.NETHER_NICKEL_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_NICKEL_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.END_NICKEL_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //OSMIUM
    register(context, OSMIUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.OVERWORLD_OSMIUM_ORE_KEY),
            EternalOrePlacement.commonOrePlacement(18,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, NETHER_OSMIUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.NETHER_OSMIUM_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_OSMIUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.END_OSMIUM_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //PLATINUM
    register(context, PLATINUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.OVERWORLD_PLATINUM_ORE_KEY),
            EternalOrePlacement.commonOrePlacement(18,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, NETHER_PLATINUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.NETHER_PLATINUM_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_PLATINUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.END_PLATINUM_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //PLUTONIUM
    register(context, PLUTONIUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.OVERWORLD_PLUTONIUM_ORE_KEY),
            EternalOrePlacement.commonOrePlacement(18,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, NETHER_PLUTONIUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.NETHER_PLATINUM_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_PLUTONIUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.END_PLATINUM_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //SILVER
    register(context, SILVER_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.OVERWORLD_SILVER_ORE_KEY),
            EternalOrePlacement.commonOrePlacement(18,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, NETHER_SILVER_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.NETHER_SILVER_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_SILVER_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.END_SILVER_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //SAPPHIRE
    register(context, SAPPHIRE_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.OVERWORLD_SAPPHIRE_ORE_KEY),
            EternalOrePlacement.commonOrePlacement(18,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, NETHER_SAPPHIRE_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.NETHER_SAPPHIRE_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_SAPPHIRE_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.END_SAPPHIRE_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //SULFUR
    register(context, SULFUR_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.OVERWORLD_SULFUR_ORE_KEY),
            EternalOrePlacement.commonOrePlacement(18,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, NETHER_SULFUR_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.NETHER_SULFUR_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_SULFUR_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.END_SULFUR_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //TIN
    register(context, TIN_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.OVERWORLD_TIN_ORE_KEY),
            EternalOrePlacement.commonOrePlacement(18,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, NETHER_TIN_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.NETHER_TIN_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_TIN_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.END_TIN_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //URANIUM
    register(context, URANIUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.OVERWORLD_URANIUM_ORE_KEY),
            EternalOrePlacement.commonOrePlacement(18,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, NETHER_URANIUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.NETHER_URANIUM_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_URANIUM_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.END_URANIUM_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

    //ZINC
    register(context, ZINC_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.OVERWORLD_ZINC_ORE_KEY),
            EternalOrePlacement.commonOrePlacement(18,
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, NETHER_ZINC_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.NETHER_ZINC_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    //register(context, END_ZINC_ORE_PLACED_KEY, ConfiguredFeatures.getOrThrow(EternalConfiguredFeatures.END_ZINC_ORE_KEY),
    //        EternalOrePlacement.commonOrePlacement(12,
    //                HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    }


    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(EternalItems.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key,
                                 Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
