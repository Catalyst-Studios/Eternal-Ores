package net.radzratz.eternalores.worldgen.configured_features;

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
import net.radzratz.eternalores.block.EOBlocks;

import java.util.List;

import static net.radzratz.eternalores.worldgen.configured_features.EOConfiguredKeys.*;

public class EOConfiguredFeatures
{
    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context)
    {
        RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        //RuleTest endReplaceables = new BlockMatchTest(Blocks.END_STONE);

        //ALUMINUM ORES
            List<OreConfiguration.TargetBlockState> overworldAluminumOres = List.of(
                    OreConfiguration.target(stoneReplaceable,
                            EOBlocks.ALUMINUM_ORE_BLOCK.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,
                            EOBlocks.DEEPSLATE_ALUMINUM_ORE_BLOCK.get().defaultBlockState()));

            register(context, OVERWORLD_ALUMINUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldAluminumOres, 9));
            //register(context, NETHER_ALUMINUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
            //        EOBlocks.NETHER_ALUMINUM_ORE_BLOCK.get().defaultBlockState(9)));
            //register(context, END_ALUMINUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
            //        EOBlocks.END_ALUMINUM_ORE_BLOCK.get().defaultBlockState(9)));

        //AMBER
            List<OreConfiguration.TargetBlockState> overworldAmberOres = List.of(OreConfiguration.target(stoneReplaceable,
                            EOBlocks.AMBER_ORE_BLOCK.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,
                            EOBlocks.DEEPSLATE_AMBER_ORE_BLOCK.get().defaultBlockState()));

            register(context, OVERWORLD_AMBER_ORE_KEY, Feature.ORE, new OreConfiguration(overworldAmberOres, 9));
            //register(context, NETHER_AMBER_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
            //        EOBlocks.NETHER_AMBER_ORE_BLOCK.get().defaultBlockState(9)));
            //register(context, END_AMBER_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
            //        EOBlocks.END_AMBER_ORE_BLOCK.get().defaultBlockState(9)));

        //APATITE ORES
            List<OreConfiguration.TargetBlockState> overworldApatiteOres = List.of(OreConfiguration.target(stoneReplaceable,
                            EOBlocks.APATITE_ORE_BLOCK.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,
                            EOBlocks.DEEPSLATE_APATITE_ORE_BLOCK.get().defaultBlockState()));
            register(context, OVERWORLD_APATITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldApatiteOres, 5));
            //register(context, NETHER_APATITE_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
            //        EOBlocks.NETHER_APATITE_ORE_BLOCK.get().defaultBlockState(9)));
            //register(context, END_APATITE_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
            //        EOBlocks.END_APATITE_ORE_BLOCK.get().defaultBlockState(9)));

        register(context, NETHER_ARDITE_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
                EOBlocks.ARDITE_ORE_BLOCK.get().defaultBlockState(), 3));

        //CINNABAR ORES
            List<OreConfiguration.TargetBlockState> overworldCinnabarOres = List.of(OreConfiguration.target(stoneReplaceable,
                            EOBlocks.CINNABAR_ORE_BLOCK.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,
                            EOBlocks.DEEPSLATE_CINNABAR_ORE_BLOCK.get().defaultBlockState()));

            register(context, OVERWORLD_CINNABAR_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCinnabarOres, 5));
            //register(context, NETHER_CINNABAR_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
            //        EOBlocks.NETHER_CINNABAR_ORE_BLOCK.get().defaultBlockState(9)));
            //register(context, END_CINNABAR_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
            //        EOBlocks.END_CINNABAR_ORE_BLOCK.get().defaultBlockState(9)));

        //COBALT ORES
            List<OreConfiguration.TargetBlockState> overworldCobaltOres = List.of(OreConfiguration.target(stoneReplaceable,
                            EOBlocks.COBALT_ORE_BLOCK.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,
                            EOBlocks.DEEPSLATE_COBALT_ORE_BLOCK.get().defaultBlockState()));

            register(context, OVERWORLD_COBALT_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCobaltOres, 9));
            //register(context, NETHER_COBALT_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
            //        EOBlocks.NETHER_COBALT_ORE_BLOCK.get().defaultBlockState(9)));
            //register(context, END_COBALT_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
            //        EOBlocks.END_COBALT_ORE_BLOCK.get().defaultBlockState(9)));

        //FLUORITE ORES
            List<OreConfiguration.TargetBlockState> overworldFluoriteOres = List.of(OreConfiguration.target(stoneReplaceable,
                            EOBlocks.FLUORITE_ORE_BLOCK.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,
                            EOBlocks.DEEPSLATE_FLUORITE_ORE_BLOCK.get().defaultBlockState()));

            register(context, OVERWORLD_FLUORITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldFluoriteOres, 6));
            //register(context, NETHER_FLUORITE_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
            //        EOBlocks.NETHER_FLUORITE_ORE_BLOCK.get().defaultBlockState(9)));
            //register(context, END_FLUORITE_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
            //        EOBlocks.END_FLUORITE_ORE_BLOCK.get().defaultBlockState(9)));

        //GALLIUM ORES
            List<OreConfiguration.TargetBlockState> overworldGalliumOres = List.of(OreConfiguration.target(stoneReplaceable,
                            EOBlocks.GALLIUM_ORE_BLOCK.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,
                            EOBlocks.DEEPSLATE_GALLIUM_ORE_BLOCK.get().defaultBlockState()));

            register(context, OVERWORLD_GALLIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldGalliumOres, 8));
            //register(context, NETHER_GALLIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
            //        EOBlocks.NETHER_GALLIUM_ORE_BLOCK.get().defaultBlockState(9)));
            //register(context, END_GALLIUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
            //        EOBlocks.END_GALLIUM_ORE_BLOCK.get().defaultBlockState(9)));

        //Iridium
        //Lead
        List<OreConfiguration.TargetBlockState> overworldIridiumOres = List.of(OreConfiguration.target(stoneReplaceable,
                        EOBlocks.IRIDIUM_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        EOBlocks.DEEPSLATE_IRIDIUM_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_IRIDIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldIridiumOres, 9));
        //register(context, NETHER_IRIDIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        EOBlocks.NETHER_IRIDIUM_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_IRIDIUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        EOBlocks.END_IRIDIUM_ORE_BLOCK.get().defaultBlockState(9)));

        //Lead
            List<OreConfiguration.TargetBlockState> overworldLeadOres = List.of(OreConfiguration.target(stoneReplaceable,
                            EOBlocks.LEAD_ORE_BLOCK.get().defaultBlockState()),
                    OreConfiguration.target(deepslateReplaceables,
                            EOBlocks.DEEPSLATE_LEAD_ORE_BLOCK.get().defaultBlockState()));
            register(context, OVERWORLD_LEAD_ORE_KEY, Feature.ORE, new OreConfiguration(overworldLeadOres, 9));
            //register(context, NETHER_LEAD_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
            //        EOBlocks.NETHER_LEAD_ORE_BLOCK.get().defaultBlockState(9)));
            //register(context, END_LEAD_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
            //        EOBlocks.END_LEAD_ORE_BLOCK.get().defaultBlockState(9)));

        //Necroticarite
        register(context, NETHER_NECROTICARITE_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
                EOBlocks.NECROTICARITE_ORE_BLOCK.get().defaultBlockState(), 4));

        //Nickel
        List<OreConfiguration.TargetBlockState> overworldNickelOres = List.of(OreConfiguration.target(stoneReplaceable,
                        EOBlocks.NICKEL_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        EOBlocks.DEEPSLATE_NICKEL_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_NICKEL_ORE_KEY, Feature.ORE, new OreConfiguration(overworldNickelOres,9));
        //register(context, NETHER_NICKEL_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        EOBlocks.NETHER_NICKEL_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_NICKEL_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        EOBlocks.END_NICKEL_ORE_BLOCK.get().defaultBlockState(9)));

        //Niter
        List<OreConfiguration.TargetBlockState> overworldNiterOres = List.of(OreConfiguration.target(stoneReplaceable,
                        EOBlocks.NITER_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        EOBlocks.DEEPSLATE_NITER_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_NITER_ORE_KEY, Feature.ORE, new OreConfiguration(overworldNiterOres,4));
        //register(context, NETHER_NITER_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        EOBlocks.NETHER_NITER_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_NITER_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        EOBlocks.END_NITER_ORE_BLOCK.get().defaultBlockState(9)));

        //Obsidian
        register(context, NETHER_OBSIDIAN_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
                EOBlocks.OBSIDIAN_ORE_BLOCK.get().defaultBlockState(), 8));

        //Onyx
        List<OreConfiguration.TargetBlockState> overworldOnyxOres = List.of(OreConfiguration.target(stoneReplaceable,
                        EOBlocks.ONYX_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        EOBlocks.DEEPSLATE_ONYX_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_ONYX_ORE_KEY, Feature.ORE, new OreConfiguration(overworldOnyxOres,9));
        //register(context, NETHER_ONYX_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        EOBlocks.NETHER_ONYX_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_ONYX_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        EOBlocks.END_ONYX_ORE_BLOCK.get().defaultBlockState(9)));

        //Osmium
        List<OreConfiguration.TargetBlockState> overworldOsmiumOres = List.of(OreConfiguration.target(stoneReplaceable,
                        EOBlocks.OSMIUM_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        EOBlocks.DEEPSLATE_OSMIUM_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_OSMIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldOsmiumOres,9));
        //register(context, NETHER_OSMIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        EOBlocks.NETHER_OSMIUM_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_OSMIUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        EOBlocks.END_OSMIUM_ORE_BLOCK.get().defaultBlockState(9)));

        //Peridot
        List<OreConfiguration.TargetBlockState> overworldPeridotOres = List.of(OreConfiguration.target(stoneReplaceable,
                        EOBlocks.PERIDOT_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        EOBlocks.DEEPSLATE_PERIDOT_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_PERIDOT_ORE_KEY, Feature.ORE, new OreConfiguration(overworldPeridotOres,4));
        //register(context, NETHER_PERIDOT_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        EOBlocks.NETHER_PERIDOT_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_PERIDOT_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        EOBlocks.END_PERIDOT_ORE_BLOCK.get().defaultBlockState(9)));

        //Platinum
        List<OreConfiguration.TargetBlockState> overworldPlatinumOres = List.of(OreConfiguration.target(stoneReplaceable,
                        EOBlocks.PLATINUM_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        EOBlocks.DEEPSLATE_PLATINUM_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_PLATINUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldPlatinumOres,9));
        //register(context, NETHER_PLATINUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        EOBlocks.NETHER_PLATINUM_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_PLATINUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        EOBlocks.END_PLATINUM_ORE_BLOCK.get().defaultBlockState(9)));

        //Ruby
        List<OreConfiguration.TargetBlockState> overworldRubyOres = List.of(OreConfiguration.target(stoneReplaceable,
                        EOBlocks.RUBY_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        EOBlocks.DEEPSLATE_RUBY_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(overworldRubyOres,5));
        //register(context, NETHER_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        EOBlocks.NETHER_RUBY_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        EOBlocks.END_RUBY_ORE_BLOCK.get().defaultBlockState(9)));

        //Sapphire
        List<OreConfiguration.TargetBlockState> overworldSapphireOres = List.of(OreConfiguration.target(stoneReplaceable,
                        EOBlocks.SAPPHIRE_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        EOBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSapphireOres,4));
        //register(context, NETHER_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        EOBlocks.NETHER_SAPPHIRE_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        EOBlocks.END_SAPPHIRE_ORE_BLOCK.get().defaultBlockState(9)));

        //Silver
        List<OreConfiguration.TargetBlockState> overworldSilverOres = List.of(OreConfiguration.target(stoneReplaceable,
                        EOBlocks.SILVER_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        EOBlocks.DEEPSLATE_SILVER_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSilverOres,9));
        //register(context, NETHER_SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        EOBlocks.NETHER_SILVER_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        EOBlocks.END_SILVER_ORE_BLOCK.get().defaultBlockState(9)));

        //Sulfur
        List<OreConfiguration.TargetBlockState> overworldSulfurOres = List.of(OreConfiguration.target(stoneReplaceable,
                        EOBlocks.SULFUR_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        EOBlocks.DEEPSLATE_SULFUR_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_SULFUR_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSulfurOres,5));
        //register(context, NETHER_SULFUR_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        EOBlocks.NETHER_SULFUR_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_SULFUR_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        EOBlocks.END_SULFUR_ORE_BLOCK.get().defaultBlockState(9)));

        //Tin
        List<OreConfiguration.TargetBlockState> overworldTinOres = List.of(OreConfiguration.target(stoneReplaceable,
                        EOBlocks.TIN_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        EOBlocks.DEEPSLATE_TIN_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_TIN_ORE_KEY, Feature.ORE, new OreConfiguration(overworldTinOres,9));
        //register(context, NETHER_TIN_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        EOBlocks.NETHER_TIN_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_TIN_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        EOBlocks.END_TIN_ORE_BLOCK.get().defaultBlockState(9)));

        //Uraninite
        List<OreConfiguration.TargetBlockState> overworldUraniniteOres = List.of(OreConfiguration.target(stoneReplaceable,
                        EOBlocks.URANINITE_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        EOBlocks.DEEPSLATE_URANINITE_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_URANINITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldUraniniteOres,9));
        //register(context, NETHER_URANINITE_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        EOBlocks.NETHER_URANINITE_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_URANINITE_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        EOBlocks.END_URANINITE_ORE_BLOCK.get().defaultBlockState(9)));

        //Uranium
        List<OreConfiguration.TargetBlockState> overworldUraniumOres = List.of(OreConfiguration.target(stoneReplaceable,
                        EOBlocks.URANIUM_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        EOBlocks.DEEPSLATE_URANIUM_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_URANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldUraniumOres,9));
        //register(context, NETHER_URANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        EOBlocks.NETHER_URANIUM_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_URANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        EOBlocks.END_URANIUM_ORE_BLOCK.get().defaultBlockState(9)));

        //Zinc
        List<OreConfiguration.TargetBlockState> overworldZincOres = List.of(OreConfiguration.target(stoneReplaceable,
                        EOBlocks.ZINC_ORE_BLOCK.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables,
                        EOBlocks.DEEPSLATE_ZINC_ORE_BLOCK.get().defaultBlockState()));
        register(context, OVERWORLD_ZINC_ORE_KEY, Feature.ORE, new OreConfiguration(overworldZincOres,9));
        //register(context, NETHER_ZINC_ORE_KEY, Feature.ORE, new OreConfiguration(netherReplaceables,
        //        EOBlocks.NETHER_ZINC_ORE_BLOCK.get().defaultBlockState(9)));
        //register(context, END_ZINC_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
        //        EOBlocks.END_ZINC_ORE_BLOCK.get().defaultBlockState(9)));
    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name)
    {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(EternalOres.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register
            (BootstrapContext<ConfiguredFeature<?, ?>> context,
             ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration)
    {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
