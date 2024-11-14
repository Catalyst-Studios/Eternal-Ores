package net.radzratz.eternalitems.worldgen;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.radzratz.eternalitems.EternalItems;
import net.radzratz.eternalitems.block.ModBlocks;

import java.util.List;

public class EternalConfiguredFeatures {
    //Aluminum
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ALUMINUM_ORE_KEY = registerKey("aluminum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_ALUMINUM_ORE_KEY = registerKey("nether_aluminum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_ALUMINUM_ORE_KEY = registerKey("end_aluminum_ore");
    //Cobalt
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_COBALT_ORE_KEY = registerKey("cobalt_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_COBALT_ORE_KEY = registerKey("nether_cobalt_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_COBALT_ORE_KEY = registerKey("end_cobalt_ore");
    //Fluorite
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_FLUORITE_ORE_KEY = registerKey("fluorite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_FLUORITE_ORE_KEY = registerKey("nether_fluorite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_FLUORITE_ORE_KEY = registerKey("end_fluorite_ore");
    //Lead
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LEAD_ORE_KEY = registerKey("lead_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_LEAD_ORE_KEY = registerKey("nether_lead_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_LEAD_ORE_KEY = registerKey("end_lead_ore");
    //Nickel
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_NICKEL_ORE_KEY = registerKey("nickel_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_NICKEL_ORE_KEY = registerKey("nether_nickel_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_NICKEL_ORE_KEY = registerKey("end_nickel_ore");
    //Osmium
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_OSMIUM_ORE_KEY = registerKey("osmium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_OSMIUM_ORE_KEY = registerKey("nether_osmium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_OSMIUM_ORE_KEY = registerKey("end_osmium_ore");
    //Platinum
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_PLATINUM_ORE_KEY = registerKey("platinum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_PLATINUM_ORE_KEY = registerKey("nether_platinum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_PLATINUM_ORE_KEY = registerKey("end_platinum_ore");
    //Plutonium
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_PLUTONIUM_ORE_KEY = registerKey("plutonium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_PLUTONIUM_ORE_KEY = registerKey("nether_plutonium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_PLUTONIUM_ORE_KEY = registerKey("end_plutonium_ore");
    //Sapphire
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SAPPHIRE_ORE_KEY = registerKey("sapphire_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SAPPHIRE_ORE_KEY = registerKey("nether_sapphire_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_SAPPHIRE_ORE_KEY = registerKey("end_sapphire_ore");
    //Silver
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SILVER_ORE_KEY = registerKey("silver_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SILVER_ORE_KEY = registerKey("nether_silver_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_SILVER_ORE_KEY = registerKey("end_silver_ore");
    //Sulfur
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SULFUR_ORE_KEY = registerKey("sulfur_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SULFUR_ORE_KEY = registerKey("nether_sulfur_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_SULFUR_ORE_KEY = registerKey("end_sulfur_ore");
    //Tin
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_TIN_ORE_KEY = registerKey("tin_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_TIN_ORE_KEY = registerKey("nether_tin_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_TIN_ORE_KEY = registerKey("end_tin_ore");
    //Uranium
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_URANIUM_ORE_KEY = registerKey("uranium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_URANIUM_ORE_KEY = registerKey("nether_uranium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_URANIUM_ORE_KEY = registerKey("end_uranium_ore");
    //Zinc
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ZINC_ORE_KEY = registerKey("zinc_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_ZINC_ORE_KEY = registerKey("nether_zinc_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_ZINC_ORE_KEY = registerKey("end_zinc_ore");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        //RuleTest netherReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        //RuleTest endReplaceables = new BlockMatchTest(Blocks.END_STONE);

        //ALUMINUM ORES
        List<OreConfiguration.TargetBlockState> overworldAluminumOres = List.of(OreConfiguration.target(stoneReplaceable,
                ModBlocks.ALUMINUM_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                ModBlocks.DEEPSLATE_ALUMINUM_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_ALUMINUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldAluminumOres,20));
        //register(context, NETHER_ALUMINUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        ModBlocks.NETHER_ALUMINUM_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_ALUMINUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        ModBlocks.END_ALUMINUM_ORE_BLOCK.get().defaultBlockState(9)));

        //COBALT ORES
        List<OreConfiguration.TargetBlockState> overworldCobaltOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.COBALT_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        ModBlocks.DEEPSLATE_COBALT_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_COBALT_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCobaltOres,20));
        //register(context, NETHER_COBALT_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        ModBlocks.NETHER_COBALT_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_COBALT_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        ModBlocks.END_COBALT_ORE_BLOCK.get().defaultBlockState(9)));

        //FLUORITE ORES
        List<OreConfiguration.TargetBlockState> overworldFluoriteOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.FLUORITE_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        ModBlocks.DEEPSLATE_FLUORITE_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_FLUORITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldFluoriteOres,20));
        //register(context, NETHER_FLUORITE_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        ModBlocks.NETHER_FLUORITE_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_FLUORITE_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        ModBlocks.END_FLUORITE_ORE_BLOCK.get().defaultBlockState(9)));

        //Lead
        List<OreConfiguration.TargetBlockState> overworldLeadOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.LEAD_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        ModBlocks.DEEPSLATE_LEAD_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_LEAD_ORE_KEY, Feature.ORE, new OreConfiguration(overworldLeadOres,20));
        //register(context, NETHER_LEAD_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        ModBlocks.NETHER_LEAD_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_LEAD_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        ModBlocks.END_LEAD_ORE_BLOCK.get().defaultBlockState(9)));

        //Nickel
        List<OreConfiguration.TargetBlockState> overworldNickelOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.NICKEL_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        ModBlocks.DEEPSLATE_NICKEL_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_NICKEL_ORE_KEY, Feature.ORE, new OreConfiguration(overworldNickelOres,20));
        //register(context, NETHER_NICKEL_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        ModBlocks.NETHER_NICKEL_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_NICKEL_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        ModBlocks.END_NICKEL_ORE_BLOCK.get().defaultBlockState(9)));

        //Osmium
        List<OreConfiguration.TargetBlockState> overworldOsmiumOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.OSMIUM_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        ModBlocks.DEEPSLATE_OSMIUM_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_OSMIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldOsmiumOres,20));
        //register(context, NETHER_OSMIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        ModBlocks.NETHER_OSMIUM_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_OSMIUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        ModBlocks.END_OSMIUM_ORE_BLOCK.get().defaultBlockState(9)));

        //Platinum
        List<OreConfiguration.TargetBlockState> overworldPlatinumOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.PLATINUM_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        ModBlocks.DEEPSLATE_PLATINUM_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_PLATINUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldPlatinumOres,20));
        //register(context, NETHER_PLATINUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        ModBlocks.NETHER_PLATINUM_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_PLATINUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        ModBlocks.END_PLATINUM_ORE_BLOCK.get().defaultBlockState(9)));

        //Plutonium
        List<OreConfiguration.TargetBlockState> overworldPlutoniumOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.PLUTONIUM_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        ModBlocks.DEEPSLATE_PLUTONIUM_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_PLUTONIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldPlutoniumOres,20));
        //register(context, NETHER_PLUTONIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        ModBlocks.NETHER_PLUTONIUM_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_PLUTONIUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        ModBlocks.END_PLUTONIUM_ORE_BLOCK.get().defaultBlockState(9)));

        //Sapphire
        List<OreConfiguration.TargetBlockState> overworldSapphireOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.SAPPHIRE_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        ModBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSapphireOres,20));
        //register(context, NETHER_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        ModBlocks.NETHER_SAPPHIRE_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        ModBlocks.END_SAPPHIRE_ORE_BLOCK.get().defaultBlockState(9)));

        //Silver
        List<OreConfiguration.TargetBlockState> overworldSilverOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.SILVER_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        ModBlocks.DEEPSLATE_SILVER_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSilverOres,20));
        //register(context, NETHER_SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        ModBlocks.NETHER_SILVER_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        ModBlocks.END_SILVER_ORE_BLOCK.get().defaultBlockState(9)));

        //Sulfur
        List<OreConfiguration.TargetBlockState> overworldSulfurOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.SULFUR_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        ModBlocks.DEEPSLATE_SULFUR_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_SULFUR_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSulfurOres,20));
        //register(context, NETHER_SULFUR_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        ModBlocks.NETHER_SULFUR_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_SULFUR_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        ModBlocks.END_SULFUR_ORE_BLOCK.get().defaultBlockState(9)));

        //Tin
        List<OreConfiguration.TargetBlockState> overworldTinOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.TIN_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        ModBlocks.DEEPSLATE_TIN_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_TIN_ORE_KEY, Feature.ORE, new OreConfiguration(overworldTinOres,20));
        //register(context, NETHER_TIN_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        ModBlocks.NETHER_TIN_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_TIN_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        ModBlocks.END_TIN_ORE_BLOCK.get().defaultBlockState(9)));

        //Uranium
        List<OreConfiguration.TargetBlockState> overworldUraniumOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.URANIUM_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        ModBlocks.DEEPSLATE_URANIUM_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_URANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldUraniumOres,20));
        //register(context, NETHER_URANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        ModBlocks.NETHER_URANIUM_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_URANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        ModBlocks.END_URANIUM_ORE_BLOCK.get().defaultBlockState(9)));

        //Zinc
        List<OreConfiguration.TargetBlockState> overworldZincOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.ZINC_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        ModBlocks.DEEPSLATE_ZINC_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_ZINC_ORE_KEY, Feature.ORE, new OreConfiguration(overworldZincOres,20));
        //register(context, NETHER_ZINC_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        ModBlocks.NETHER_ZINC_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_ZINC_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        ModBlocks.END_ZINC_ORE_BLOCK.get().defaultBlockState(9)));
    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(EternalItems.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register
            (BootstrapContext<ConfiguredFeature<?, ?>> context,
             ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}
