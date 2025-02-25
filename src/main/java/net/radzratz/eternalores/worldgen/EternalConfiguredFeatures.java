package net.radzratz.eternalores.worldgen;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.block.EternalGeneralBlocks;

import java.util.List;

public class EternalConfiguredFeatures {
    //Aluminum
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ALUMINUM_ORE_KEY = registerKey("aluminum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_ALUMINUM_ORE_KEY = registerKey("nether_aluminum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_ALUMINUM_ORE_KEY = registerKey("end_aluminum_ore");
    //Amber
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_AMBER_ORE_KEY = registerKey("amber_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_AMBER_ORE_KEY = registerKey("nether_amber_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_AMBER_ORE_KEY = registerKey("end_amber_ore");
    //Apatite
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_APATITE_ORE_KEY = registerKey("apatite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_APATITE_ORE_KEY = registerKey("nether_apatite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_APATITE_ORE_KEY = registerKey("end_apatite_ore");
    //Cinnabar
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_CINNABAR_ORE_KEY = registerKey("cinnabar_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_CINNABAR_ORE_KEY = registerKey("nether_cinnabar_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_CINNABAR_ORE_KEY = registerKey("end_cinnabar_ore");
    //Cobalt
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_COBALT_ORE_KEY = registerKey("cobalt_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_COBALT_ORE_KEY = registerKey("nether_cobalt_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_COBALT_ORE_KEY = registerKey("end_cobalt_ore");
    //Fluorite
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_FLUORITE_ORE_KEY = registerKey("fluorite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_FLUORITE_ORE_KEY = registerKey("nether_fluorite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_FLUORITE_ORE_KEY = registerKey("end_fluorite_ore");
    //Gallium
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GALLIUM_ORE_KEY = registerKey("gallium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_GALLIUM_ORE_KEY = registerKey("nether_gallium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_GALLIUM_ORE_KEY = registerKey("end_gallium_ore");
    //Iridium
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_IRIDIUM_ORE_KEY = registerKey("iridium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_IRIDIUM_ORE_KEY = registerKey("nether_iridium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_IRIDIUM_ORE_KEY = registerKey("end_iridium_ore");
    //Lead
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LEAD_ORE_KEY = registerKey("lead_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_LEAD_ORE_KEY = registerKey("nether_lead_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_LEAD_ORE_KEY = registerKey("end_lead_ore");
    //Nickel
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_NICKEL_ORE_KEY = registerKey("nickel_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_NICKEL_ORE_KEY = registerKey("nether_nickel_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_NICKEL_ORE_KEY = registerKey("end_nickel_ore");
    //Niter
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_NITER_ORE_KEY = registerKey("niter_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_NITER_ORE_KEY = registerKey("nether_niter_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_NITER_ORE_KEY = registerKey("end_niter_ore");
    //Obsidian
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_OBSIDIAN_ORE_KEY = registerKey("nether_obsidian_ore");
    //Onyx
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_ONYX_ORE_KEY = registerKey("onyx_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_ONYX_ORE_KEY = registerKey("nether_onyx_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_ONYX_ORE_KEY = registerKey("end_onyx_ore");
    //Osmium
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_OSMIUM_ORE_KEY = registerKey("osmium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_OSMIUM_ORE_KEY = registerKey("nether_osmium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_OSMIUM_ORE_KEY = registerKey("end_osmium_ore");
    //Peridot
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_PERIDOT_ORE_KEY = registerKey("peridot_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_PERIDOT_ORE_KEY = registerKey("nether_peridot_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_PERIDOT_ORE_KEY = registerKey("end_peridot_ore");
    //Platinum
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_PLATINUM_ORE_KEY = registerKey("platinum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_PLATINUM_ORE_KEY = registerKey("nether_platinum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_PLATINUM_ORE_KEY = registerKey("end_platinum_ore");
    //Ruby
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RUBY_ORE_KEY = registerKey("ruby_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_RUBY_ORE_KEY = registerKey("nether_ruby_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_RUBY_ORE_KEY = registerKey("end_ruby_ore");
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
        System.out.println("Bootstrap of ConfiguredFeature is Loading");

        RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        //RuleTest endReplaceables = new BlockMatchTest(Blocks.END_STONE);

        System.out.println("Loading Configured Features");

        //ALUMINUM ORES
            List<OreConfiguration.TargetBlockState> overworldAluminumOres = List.of(
                    OreConfiguration.target(stoneReplaceable,
                            EternalGeneralBlocks.ALUMINUM_ORE_BLOCK.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,
                            EternalGeneralBlocks.DEEPSLATE_ALUMINUM_ORE_BLOCK.get().defaultBlockState()));

            register(context, OVERWORLD_ALUMINUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldAluminumOres, 9));
            //register(context, NETHER_ALUMINUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
            //        EternalGeneralBlocks.NETHER_ALUMINUM_ORE_BLOCK.get().defaultBlockState(9)));
            //register(context, END_ALUMINUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
            //        EternalGeneralBlocks.END_ALUMINUM_ORE_BLOCK.get().defaultBlockState(9)));

        //AMBER
            List<OreConfiguration.TargetBlockState> overworldAmberOres = List.of(OreConfiguration.target(stoneReplaceable,
                            EternalGeneralBlocks.AMBER_ORE_BLOCK.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,
                            EternalGeneralBlocks.DEEPSLATE_AMBER_ORE_BLOCK.get().defaultBlockState()));

            register(context, OVERWORLD_AMBER_ORE_KEY, Feature.ORE, new OreConfiguration(overworldAmberOres, 9));
            //register(context, NETHER_AMBER_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
            //        EternalGeneralBlocks.NETHER_AMBER_ORE_BLOCK.get().defaultBlockState(9)));
            //register(context, END_AMBER_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
            //        EternalGeneralBlocks.END_AMBER_ORE_BLOCK.get().defaultBlockState(9)));

        //APATITE ORES
            List<OreConfiguration.TargetBlockState> overworldApatiteOres = List.of(OreConfiguration.target(stoneReplaceable,
                            EternalGeneralBlocks.APATITE_ORE_BLOCK.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,
                            EternalGeneralBlocks.DEEPSLATE_APATITE_ORE_BLOCK.get().defaultBlockState()));
            register(context, OVERWORLD_APATITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldApatiteOres, 5));
            //register(context, NETHER_APATITE_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
            //        EternalGeneralBlocks.NETHER_APATITE_ORE_BLOCK.get().defaultBlockState(9)));
            //register(context, END_APATITE_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
            //        EternalGeneralBlocks.END_APATITE_ORE_BLOCK.get().defaultBlockState(9)));

        //CINNABAR ORES
            List<OreConfiguration.TargetBlockState> overworldCinnabarOres = List.of(OreConfiguration.target(stoneReplaceable,
                            EternalGeneralBlocks.CINNABAR_ORE_BLOCK.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,
                            EternalGeneralBlocks.DEEPSLATE_CINNABAR_ORE_BLOCK.get().defaultBlockState()));

            register(context, OVERWORLD_CINNABAR_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCinnabarOres, 5));
            //register(context, NETHER_CINNABAR_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
            //        EternalGeneralBlocks.NETHER_CINNABAR_ORE_BLOCK.get().defaultBlockState(9)));
            //register(context, END_CINNABAR_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
            //        EternalGeneralBlocks.END_CINNABAR_ORE_BLOCK.get().defaultBlockState(9)));

        //COBALT ORES
            List<OreConfiguration.TargetBlockState> overworldCobaltOres = List.of(OreConfiguration.target(stoneReplaceable,
                            EternalGeneralBlocks.COBALT_ORE_BLOCK.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,
                            EternalGeneralBlocks.DEEPSLATE_COBALT_ORE_BLOCK.get().defaultBlockState()));

            register(context, OVERWORLD_COBALT_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCobaltOres, 9));
            //register(context, NETHER_COBALT_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
            //        EternalGeneralBlocks.NETHER_COBALT_ORE_BLOCK.get().defaultBlockState(9)));
            //register(context, END_COBALT_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
            //        EternalGeneralBlocks.END_COBALT_ORE_BLOCK.get().defaultBlockState(9)));

        //FLUORITE ORES
            List<OreConfiguration.TargetBlockState> overworldFluoriteOres = List.of(OreConfiguration.target(stoneReplaceable,
                            EternalGeneralBlocks.FLUORITE_ORE_BLOCK.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,
                            EternalGeneralBlocks.DEEPSLATE_FLUORITE_ORE_BLOCK.get().defaultBlockState()));

            register(context, OVERWORLD_FLUORITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldFluoriteOres, 6));
            //register(context, NETHER_FLUORITE_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
            //        EternalGeneralBlocks.NETHER_FLUORITE_ORE_BLOCK.get().defaultBlockState(9)));
            //register(context, END_FLUORITE_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
            //        EternalGeneralBlocks.END_FLUORITE_ORE_BLOCK.get().defaultBlockState(9)));

        //GALLIUM ORES
            List<OreConfiguration.TargetBlockState> overworldGalliumOres = List.of(OreConfiguration.target(stoneReplaceable,
                            EternalGeneralBlocks.GALLIUM_ORE_BLOCK.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,
                            EternalGeneralBlocks.DEEPSLATE_GALLIUM_ORE_BLOCK.get().defaultBlockState()));

            register(context, OVERWORLD_GALLIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldGalliumOres, 8));
            //register(context, NETHER_GALLIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
            //        EternalGeneralBlocks.NETHER_GALLIUM_ORE_BLOCK.get().defaultBlockState(9)));
            //register(context, END_GALLIUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
            //        EternalGeneralBlocks.END_GALLIUM_ORE_BLOCK.get().defaultBlockState(9)));

        //Iridium
        //Lead
        List<OreConfiguration.TargetBlockState> overworldIridiumOres = List.of(OreConfiguration.target(stoneReplaceable,
                        EternalGeneralBlocks.IRIDIUM_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        EternalGeneralBlocks.DEEPSLATE_IRIDIUM_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_IRIDIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldIridiumOres, 9));
        //register(context, NETHER_IRIDIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        EternalGeneralBlocks.NETHER_IRIDIUM_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_IRIDIUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        EternalGeneralBlocks.END_IRIDIUM_ORE_BLOCK.get().defaultBlockState(9)));

        //Lead
            List<OreConfiguration.TargetBlockState> overworldLeadOres = List.of(OreConfiguration.target(stoneReplaceable,
                            EternalGeneralBlocks.LEAD_ORE_BLOCK.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,
                            EternalGeneralBlocks.DEEPSLATE_LEAD_ORE_BLOCK.get().defaultBlockState()));
            register(context, OVERWORLD_LEAD_ORE_KEY, Feature.ORE, new OreConfiguration(overworldLeadOres, 9));
            //register(context, NETHER_LEAD_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
            //        EternalGeneralBlocks.NETHER_LEAD_ORE_BLOCK.get().defaultBlockState(9)));
            //register(context, END_LEAD_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
            //        EternalGeneralBlocks.END_LEAD_ORE_BLOCK.get().defaultBlockState(9)));

        //Nickel
        List<OreConfiguration.TargetBlockState> overworldNickelOres = List.of(OreConfiguration.target(stoneReplaceable,
                        EternalGeneralBlocks.NICKEL_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        EternalGeneralBlocks.DEEPSLATE_NICKEL_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_NICKEL_ORE_KEY, Feature.ORE, new OreConfiguration(overworldNickelOres,9));
        //register(context, NETHER_NICKEL_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        EternalGeneralBlocks.NETHER_NICKEL_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_NICKEL_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        EternalGeneralBlocks.END_NICKEL_ORE_BLOCK.get().defaultBlockState(9)));

        //Niter
        List<OreConfiguration.TargetBlockState> overworldNiterOres = List.of(OreConfiguration.target(stoneReplaceable,
                        EternalGeneralBlocks.NITER_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        EternalGeneralBlocks.DEEPSLATE_NITER_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_NITER_ORE_KEY, Feature.ORE, new OreConfiguration(overworldNiterOres,4));
        //register(context, NETHER_NITER_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        EternalGeneralBlocks.NETHER_NITER_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_NITER_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        EternalGeneralBlocks.END_NITER_ORE_BLOCK.get().defaultBlockState(9)));

        //Obsidian
        register(context, NETHER_OBSIDIAN_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
                EternalGeneralBlocks.OBSIDIAN_ORE_BLOCK.get().defaultBlockState(), 8));

        //Onyx
        List<OreConfiguration.TargetBlockState> overworldOnyxOres = List.of(OreConfiguration.target(stoneReplaceable,
                        EternalGeneralBlocks.ONYX_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        EternalGeneralBlocks.DEEPSLATE_ONYX_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_ONYX_ORE_KEY, Feature.ORE, new OreConfiguration(overworldOnyxOres,9));
        //register(context, NETHER_ONYX_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        EternalGeneralBlocks.NETHER_ONYX_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_ONYX_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        EternalGeneralBlocks.END_ONYX_ORE_BLOCK.get().defaultBlockState(9)));

        //Osmium
        List<OreConfiguration.TargetBlockState> overworldOsmiumOres = List.of(OreConfiguration.target(stoneReplaceable,
                        EternalGeneralBlocks.OSMIUM_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        EternalGeneralBlocks.DEEPSLATE_OSMIUM_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_OSMIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldOsmiumOres,9));
        //register(context, NETHER_OSMIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        EternalGeneralBlocks.NETHER_OSMIUM_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_OSMIUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        EternalGeneralBlocks.END_OSMIUM_ORE_BLOCK.get().defaultBlockState(9)));

        //Peridot
        List<OreConfiguration.TargetBlockState> overworldPeridotOres = List.of(OreConfiguration.target(stoneReplaceable,
                        EternalGeneralBlocks.PERIDOT_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        EternalGeneralBlocks.DEEPSLATE_PERIDOT_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_PERIDOT_ORE_KEY, Feature.ORE, new OreConfiguration(overworldPeridotOres,4));
        //register(context, NETHER_PERIDOT_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        EternalGeneralBlocks.NETHER_PERIDOT_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_PERIDOT_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        EternalGeneralBlocks.END_PERIDOT_ORE_BLOCK.get().defaultBlockState(9)));

        //Platinum
        List<OreConfiguration.TargetBlockState> overworldPlatinumOres = List.of(OreConfiguration.target(stoneReplaceable,
                        EternalGeneralBlocks.PLATINUM_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        EternalGeneralBlocks.DEEPSLATE_PLATINUM_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_PLATINUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldPlatinumOres,9));
        //register(context, NETHER_PLATINUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        EternalGeneralBlocks.NETHER_PLATINUM_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_PLATINUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        EternalGeneralBlocks.END_PLATINUM_ORE_BLOCK.get().defaultBlockState(9)));

        //Ruby
        List<OreConfiguration.TargetBlockState> overworldRubyOres = List.of(OreConfiguration.target(stoneReplaceable,
                        EternalGeneralBlocks.RUBY_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        EternalGeneralBlocks.DEEPSLATE_RUBY_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(overworldRubyOres,5));
        //register(context, NETHER_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        EternalGeneralBlocks.NETHER_RUBY_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        EternalGeneralBlocks.END_RUBY_ORE_BLOCK.get().defaultBlockState(9)));

        //Sapphire
        List<OreConfiguration.TargetBlockState> overworldSapphireOres = List.of(OreConfiguration.target(stoneReplaceable,
                        EternalGeneralBlocks.SAPPHIRE_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        EternalGeneralBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSapphireOres,4));
        //register(context, NETHER_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        EternalGeneralBlocks.NETHER_SAPPHIRE_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        EternalGeneralBlocks.END_SAPPHIRE_ORE_BLOCK.get().defaultBlockState(9)));

        //Silver
        List<OreConfiguration.TargetBlockState> overworldSilverOres = List.of(OreConfiguration.target(stoneReplaceable,
                        EternalGeneralBlocks.SILVER_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        EternalGeneralBlocks.DEEPSLATE_SILVER_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSilverOres,9));
        //register(context, NETHER_SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        EternalGeneralBlocks.NETHER_SILVER_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        EternalGeneralBlocks.END_SILVER_ORE_BLOCK.get().defaultBlockState(9)));

        //Sulfur
        List<OreConfiguration.TargetBlockState> overworldSulfurOres = List.of(OreConfiguration.target(stoneReplaceable,
                        EternalGeneralBlocks.SULFUR_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        EternalGeneralBlocks.DEEPSLATE_SULFUR_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_SULFUR_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSulfurOres,5));
        //register(context, NETHER_SULFUR_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        EternalGeneralBlocks.NETHER_SULFUR_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_SULFUR_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        EternalGeneralBlocks.END_SULFUR_ORE_BLOCK.get().defaultBlockState(9)));

        //Tin
        List<OreConfiguration.TargetBlockState> overworldTinOres = List.of(OreConfiguration.target(stoneReplaceable,
                        EternalGeneralBlocks.TIN_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        EternalGeneralBlocks.DEEPSLATE_TIN_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_TIN_ORE_KEY, Feature.ORE, new OreConfiguration(overworldTinOres,9));
        //register(context, NETHER_TIN_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        EternalGeneralBlocks.NETHER_TIN_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_TIN_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        EternalGeneralBlocks.END_TIN_ORE_BLOCK.get().defaultBlockState(9)));

        //Uranium
        List<OreConfiguration.TargetBlockState> overworldUraniumOres = List.of(OreConfiguration.target(stoneReplaceable,
                        EternalGeneralBlocks.URANIUM_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        EternalGeneralBlocks.DEEPSLATE_URANIUM_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_URANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldUraniumOres,9));
        //register(context, NETHER_URANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        EternalGeneralBlocks.NETHER_URANIUM_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_URANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        EternalGeneralBlocks.END_URANIUM_ORE_BLOCK.get().defaultBlockState(9)));

        //Zinc
        List<OreConfiguration.TargetBlockState> overworldZincOres = List.of(OreConfiguration.target(stoneReplaceable,
                        EternalGeneralBlocks.ZINC_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        EternalGeneralBlocks.DEEPSLATE_ZINC_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_ZINC_ORE_KEY, Feature.ORE, new OreConfiguration(overworldZincOres,9));
        //register(context, NETHER_ZINC_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        EternalGeneralBlocks.NETHER_ZINC_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_ZINC_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        EternalGeneralBlocks.END_ZINC_ORE_BLOCK.get().defaultBlockState(9)));
    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        System.out.println("Loading Register Key of Configured Feature");
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(EternalOres.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register
            (BootstrapContext<ConfiguredFeature<?, ?>> context,
             ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        System.out.println("Loading Feature Configuration of Configured Feature");
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}
