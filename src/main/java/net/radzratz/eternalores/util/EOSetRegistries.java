package net.radzratz.eternalores.util;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.item.tools.*;
import net.radzratz.eternalores.util.config.EOToolsConfig;

import static net.minecraft.tags.ItemTags.STONE_BUTTONS;
import static net.minecraft.world.level.block.SoundType.*;
import static net.neoforged.neoforge.common.Tags.Items.*;
import static net.radzratz.eternalores.block.types.enums.EOBlockTier.*;
import static net.radzratz.eternalores.block.types.enums.EOreLayerType.*;
import static net.radzratz.eternalores.item.helpers.EOItemHelpers.*;
import static net.radzratz.eternalores.item.tools.EOWireCutter.*;
import static net.radzratz.eternalores.item.tools.EOHammers.*;
import static net.radzratz.eternalores.item.tools.EOGemCutter.*;
import static net.radzratz.eternalores.item.special.prospectors.EOBasicProspector.*;
import static net.radzratz.eternalores.item.special.prospectors.EOAdvProspector.*;
import static net.radzratz.eternalores.item.special.destroyer.EOChunkDestroyer.*;
import static net.radzratz.eternalores.item.special.teleporter.EOTeleporter.*;
import static net.radzratz.eternalores.util.EOMaterials.materialNames.*;
import static net.radzratz.eternalores.util.EOMaterials.materialRegistrar.of;
import static net.radzratz.eternalores.util.config.EOMaterialConfig.CFG;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.GemShards.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Nuggets.*;
import static net.radzratz.eternalores.util.EOMaterials.materialSets.*;

public class EOSetRegistries {
    public static final DeferredRegister.Items EO_ITEMS = DeferredRegister.createItems(EternalOres.id);
    public static final DeferredRegister.Blocks EO_BLOCKS = DeferredRegister.createBlocks(EternalOres.id);

    public static final DeferredItem<EOMolds> MOLD_ROD;
    public static final DeferredItem<EOMolds> MOLD_PLATE;
    public static final DeferredItem<EOMolds> MOLD_GEAR;
    public static final DeferredItem<EOMolds> MOLD_FOIL;

    static {
        // Tools
        DESTROYA = rgtrFinder("finder");

        TELEPORTER = rgtrTeleporter("teleporter");

        PROSPECTOR = rgtrProspector("prospector", EOToolsConfig.CFG.basicProspector::isEnabled);
        ADV_PROSPECTOR = rgtrAdvProspector("advanced_prospector", EOToolsConfig.CFG.advancedProspector::isEnabled);

        COBALT_HAMMER = rgtrHammer("cobalt_hammer", 1024, NUGGETS_COBALT, EOToolsConfig.CFG.hammers.cobalt::isEnabled);
        COPPER_HAMMER = rgtrHammer("copper_hammer", 128, NUGGETS_COPPER, EOToolsConfig.CFG.hammers.copper::isEnabled);
        STONE_HAMMER = rgtrHammer("stone_hammer", 64, STONE_BUTTONS, EOToolsConfig.CFG.hammers.stone::isEnabled);
        DIAMOND_HAMMER = rgtrHammer("diamond_hammer", 512, GEMS_DIAMOND, EOToolsConfig.CFG.hammers.diamond::isEnabled);
        IRON_HAMMER = rgtrHammer("iron_hammer", 256, NUGGETS_IRON, EOToolsConfig.CFG.hammers.iron::isEnabled);

        IRON_GEM_CUTTER = rgtrCutter("iron_gem_cutter", NUGGETS_IRON, 256, EOToolsConfig.CFG.gemCutter.iron::isEnabled);
        COPPER_GEM_CUTTER = rgtrCutter("copper_gem_cutter", NUGGETS_COPPER, 64, EOToolsConfig.CFG.gemCutter.copper::isEnabled);
        GOLD_GEM_CUTTER = rgtrCutter("gold_gem_cutter", NUGGETS_GOLD, 128, EOToolsConfig.CFG.gemCutter.gold::isEnabled);
        NETHERITE_GEM_CUTTER = rgtrCutter("netherite_gem_cutter", NUGGETS_NETHERITE, 512, EOToolsConfig.CFG.gemCutter.netherite::isEnabled);

        COPPER_CUTTER = rgtrWCutter("copper_wire_cutter", 64, NUGGETS_COPPER, EOToolsConfig.CFG.wireCutters.copper::isEnabled);
        IRON_CUTTER = rgtrWCutter("iron_wire_cutter", 128, NUGGETS_IRON, EOToolsConfig.CFG.wireCutters.iron::isEnabled);
        GOLD_CUTTER = rgtrWCutter("gold_wire_cutter", 256, NUGGETS_GOLD, EOToolsConfig.CFG.wireCutters.gold::isEnabled);
        DIAMOND_CUTTER = rgtrWCutter("diamond_wire_cutter", 512, GEM_SHARDS_DIAMOND, EOToolsConfig.CFG.wireCutters.diamond::isEnabled);
        COBALT_CUTTER = rgtrWCutter("cobalt_wire_cutter", 1024, NUGGETS_COBALT, EOToolsConfig.CFG.wireCutters.cobalt::isEnabled);

        MOLD_ROD = rgtrMolds("mold_rod", EOToolsConfig.CFG.molds::rodEnabled);
        MOLD_PLATE = rgtrMolds("mold_plate", EOToolsConfig.CFG.molds::plateEnabled);
        MOLD_GEAR = rgtrMolds("mold_gear", EOToolsConfig.CFG.molds::gearEnabled);
        MOLD_FOIL = rgtrMolds("mold_foil", EOToolsConfig.CFG.molds::foilEnabled);

        ALUMINUM_SET = of(ALUMINUM_ID, CFG.EOAluminumSet).mainAllMetal(3f, METAL, T_STONE).ores(3f, T_IRON, 1, 2, ORE_STONE, ORE_SLATE).build();
        ARDITE_SET = of(ARDITE_ID, CFG.EOArditeSet).mainAllMetal(7f, METAL, T_NETHERITE).ore("ardite_ore_block", 7f, ORE_NETHER, T_NETHERITE, 1, 1).build();
        BERYLLIUM_SET = of(BERYLLIUM_ID, CFG.EOBerylliumSet).mainAllMetal(2f, METAL, T_DIAMOND).ores(2f, T_DIAMOND, 1, 1, ORE_STONE, ORE_SLATE).build();
        CATALYRIUM_SET = of(CATALYRIUM_ID, CFG.EOCatalyriumSet).catalyriumSet(5f, METAL, T_NETHERITE).build();
        COBALT_SET = of(COBALT_ID, CFG.EOCobaltSet).mainAllMetal(4f, METAL, T_IRON).ores(4f, T_DIAMOND, 1, 1, ORE_STONE, ORE_SLATE, ORE_NETHER).build();
        GALLIUM_SET = of(GALLIUM_ID, CFG.EOGalliumSet).mainAllMetal(3f, METAL, T_STONE).ores(3f, T_STONE, 1, 1, ORE_STONE, ORE_SLATE, ORE_NETHER).build();
        IRIDIUM_SET = of(IRIDIUM_ID, CFG.EOIridiumSet).mainAllMetal(3f, METAL, T_IRON).ores(3f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_END).build();
        LEAD_SET = of(LEAD_ID, CFG.EOLeadSet).mainAllMetal(4f, METAL, T_IRON).ores(4f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_END).build();
        MOLYBDENUM_SET = of(MOLYBDENUM_ID, CFG.EOMolybdenumSet).mainAllMetal(3f, METAL, T_IRON).ores(3f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_NETHER, ORE_END).build();
        NICKEL_SET = of(NICKEL_ID, CFG.EONickelSet).mainAllMetal(3f, METAL, T_IRON).ores(3f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_NETHER).build();
        NEODYMIUM_SET = of(NEODYMIUM_ID, CFG.EONeodymiumSet).secondaryAllMetal(3f, METAL, T_IRON).ores(3f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_END).build();
        OSMIUM_SET = of(OSMIUM_ID, CFG.EOOsmiumSet).mainAllMetal(3f, METAL, T_IRON).ores(3f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_NETHER).build();
        PALLADIUM_SET = of(PALLADIUM_ID, CFG.EOPalladiumSet).mainAllMetal(3f, METAL, T_DIAMOND).ores(4f, T_DIAMOND, 1, 1, ORE_STONE, ORE_SLATE, ORE_END).build();
        PLATINUM_SET = of(PLATINUM_ID, CFG.EOPlatinumSet).mainAllMetal(4f, METAL, T_DIAMOND).ores(4f, T_DIAMOND, 1, 1, ORE_STONE, ORE_SLATE, ORE_END).build();
        SCULKITE_SET = of(SCULKITE_ID, CFG.EOSculkiteSet).mainAllMetal(3f, METAL, T_NETHERITE).ore("sculkite_ore_block", 3f, ORE_SCULK, T_NETHERITE, 1, 1).build();
        SILVER_SET = of(SILVER_ID, CFG.EOSilverSet).mainAllMetal(3f, METAL, T_IRON).ores(3f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_NETHER).build();
        SULFUR_SET = of(SULFUR_ID, CFG.EOSulfurSet).sulfurSet(SULFUR_ID, 1f, METAL, T_STONE).ores(1f, T_STONE, 1, 2, ORE_STONE, ORE_SLATE, ORE_NETHER).build();
        TIN_SET = of(TIN_ID, CFG.EOTinSet).mainAllMetal(3f, METAL, T_STONE).ores(3f, T_STONE, 1, 1, ORE_STONE, ORE_SLATE, ORE_END).build();
        TITANIUM_SET = of(TITANIUM_ID, CFG.EOTitaniumSet).mainAllMetal(4f, METAL, T_DIAMOND).ores(4f, T_DIAMOND, 1, 1, ORE_STONE, ORE_SLATE, ORE_END).build();
        TUNGSTEN_SET = of(TUNGSTEN_ID, CFG.EOTungstenSet).mainAllMetal(4f, METAL, T_DIAMOND).ore("tungsten_ore_block", 4f, ORE_SLATE, T_DIAMOND, 1, 1).ore("end_tungsten_ore_block", 4f, ORE_END, T_DIAMOND, 1, 1).build();
        ULTIMATITANIUM_SET = of(ULTIMATITANIUM_ID, CFG.EOUltimatitaniumSet).mainAllMetal(4f, METAL, T_DIAMOND).ore("ultimatitanium_ore_block", 4f, ORE_END, T_DIAMOND, 1, 1).build();
        URANINITE_SET = of(URANINITE_ID, CFG.EOUraniniteSet).mainAllMetal(3f, METAL, T_IRON).ores(3f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_NETHER).build();
        URANIUM_SET = of(URANIUM_ID, CFG.EOUraniumSet).mainAllMetal(4f, METAL, T_DIAMOND).ores(4f, T_DIAMOND, 1, 1, ORE_STONE, ORE_SLATE, ORE_NETHER, ORE_END).build();
        VANADIUM_SET = of(VANADIUM_ID, CFG.EOVanadiumSet).mainAllMetal(3f, METAL, T_IRON).ores(3f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_END).build();
        ZINC_SET = of(ZINC_ID, CFG.EOZincSet).mainAllMetal(3f, METAL, T_STONE).ores(3f, T_STONE, 1, 1, ORE_STONE, ORE_SLATE).build();

        AMBER_SET = of(AMBER_ID, CFG.EOAmberSet).mainAllGem(3f, METAL, T_IRON).ores(3f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE).build();
        APATITE_SET = of(APATITE_ID, CFG.EOApatiteSet).mainAllGem(3f, METAL, T_IRON).ores(3f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE).build();
        BLACK_QUARTZ_SET = of(BLACK_QUARTZ_ID, CFG.EOBlackQuartzSet).mainAllGem(3f, METAL, T_IRON).ores(3f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_NETHER).build();
        CINNABAR_SET = of(CINNABAR_ID, CFG.EOCinnabarSet).mainAllGem(3f, METAL, T_IRON).ores(3f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_NETHER).build();
        FLUORITE_SET = of(FLUORITE_ID, CFG.EOFluoriteSet).fluoriteSet(FLUORITE_ID, 3f, METAL, T_IRON).ores(3f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_END).build();
        GARNET_SET = of(GARNET_ID, CFG.EOGarnetSet).mainAllGem(4f, METAL, T_IRON).ores(4f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_NETHER).build();
        JADE_SET = of(JADE_ID, CFG.EOJadeSet).mainAllGem(3f, METAL, T_IRON).ores(3f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_NETHER).build();
        MONAZITE_SET = of(MONAZITE_ID, CFG.EOMonaziteSet).mainAllGem(4f, METAL, T_IRON).ores(4f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_NETHER).build();
        NECROTICARITE_SET = of(NECROTICARITE_ID, CFG.EONecroticariteSet).mainAllGem(4f, METAL, T_DIAMOND).ore("necroticarite_ore_block", 4f, ORE_NETHER, T_DIAMOND, 1, 1).build();
        NITER_SET = of(NITER_ID, CFG.EONiterSet).niterSet(3f, METAL, T_IRON).ores(3f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE).build();
        OBSIDIAN_SET = of(OBSIDIAN_ID, CFG.EObsidianSet).mainAllGem(4f, METAL, T_DIAMOND).ore("obsidian_ore_block", 4f, ORE_NETHER, T_DIAMOND, 1, 1).build();
        ONYX_SET = of(ONYX_ID, CFG.EOnyxSet).mainAllGem(3f, METAL, T_IRON).ores(3f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_NETHER).build();
        PEARL_SET = of(PEARL_ID, CFG.EOPearlSet).mainAllGem(4f, METAL, T_IRON).ore("pearl_ore_block", 4f, ORE_SAND, T_IRON, 1, 1).build();
        PERIDOT_SET = of(PERIDOT_ID, CFG.EOPeridotSet).mainAllGem(3f, METAL, T_IRON).ores(3f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_NETHER).build();
        PYROLITE_SET = of(PYROLITE_ID, CFG.EOPyroliteSet).mainAllGem(4f, METAL, T_DIAMOND).ore("pyrolite_ore_block", 4f, ORE_NETHER, T_DIAMOND, 1, 1).ore("end_pyrolite_ore_block", 4f, ORE_END, T_DIAMOND, 1, 1).build();
        RUBY_SET = of(RUBY_ID, CFG.EORubySet).mainAllGem(3f, METAL, T_IRON).ores(3f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_NETHER).build();
        SAPPHIRE_SET = of(SAPPHIRE_ID, CFG.EOSapphireSet).mainAllGem(3f, METAL, T_IRON).ores(3f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_END).build();
        SPINEL_SET = of(SPINEL_ID, CFG.EOSpinelSet).mainAllGem(3f, METAL, T_IRON).ores(3f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_NETHER).build();
        TANZANITE_SET = of(TANZANITE_ID, CFG.EOTanzaniteSet).mainAllGem(4f, METAL, T_IRON).ores(4f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_NETHER).build();
        ZIRCON_SET = of(ZIRCON_ID, CFG.EOZirconSet).mainAllGem(3f, METAL, T_IRON).ores(3f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_NETHER).build();

        ANTHRACITE_SET = of(ANTHRACITE_ID, CFG.EOAnthraciteCoalSet).mainCoal(3f, 21600,2400, 267, METAL, T_STONE).ores(3f, T_STONE, 1, 1, ORE_STONE, ORE_SLATE).build();
        BITUMINOUS_SET = of(BITUMINOUS_ID, CFG.EOBituminousCoalSet).mainCoal(3f, 14400,1600, 178, METAL, T_STONE).ores(3f, T_STONE, 1, 1, ORE_STONE, ORE_SLATE).build();
        LIGNITE_SET = of(LIGNITE_ID, CFG.EOLigniteCoalSet).mainCoal(3f, 7200, 800, 89, METAL, T_STONE).ores(3, T_STONE, 1, 1, ORE_STONE, ORE_SLATE).build();
        PEAT_SET = of(PEAT_ID, CFG.EOPeatCoalSet).mainCoal(3f, 3600, 400, 45, METAL, T_STONE).ores(3f, T_STONE, 1, 1, ORE_STONE, ORE_SLATE).build();

        SALT_SET = of(SALT_ID, CFG.EOSaltSet).salt(1f, T_STONE).ore("salt_ore_block", 1f, ORE_SAND, T_STONE, 1, 3).build();

        COKE_SET = of(COKE_ID, CFG.EOCokeSet).mainCoal(3f, 28800, 3200, 356, METAL, T_STONE).build();

        IRON_SET = of(IRON_ID, CFG.EOIronSet).mainVanillaMetal(2f, T_STONE).build();
        GOLD_SET = of(GOLD_ID, CFG.EOGoldSet).mainVanillaMetal(2f, T_IRON).build();
        COPPER_SET = of(COPPER_ID, CFG.EOCopperSet).secondaryVanillaMetal(2f, T_STONE).build();
        NETHERITE_SET = of(NETHERITE_ID, CFG.EONetheriteSet).netheriteMetal(3f, T_DIAMOND).build();

        REDSTONE_SET = of(REDSTONE_ID, CFG.EORedstoneSet).redstoneSet("redstone_ingot", 1f, METAL, T_WOOD).build();

        AMETHYST_SET = of(AMETHYST_ID, CFG.EOAmethystSet).mainAllVanillaGems(2f, T_IRON).build();
        DIAMOND_SET = of(DIAMOND_ID, CFG.EODiamondSet).mainAllVanillaGems(2f, T_IRON).build();
        EMERALD_SET = of(EMERALD_ID, CFG.EOEmeraldSet).mainAllVanillaGems(2f, T_IRON).build();
        LAPIS_SET = of(LAPIS_ID, CFG.EOLapisSet).mainAllVanillaGems(2f, T_STONE).build();
        QUARTZ_SET = of(QUARTZ_ID, CFG.EOQuartzSet).mainAllVanillaGems(2f, T_IRON).build();
        PRISMARINE_SET = of(PRISMARINE_ID, CFG.EOPrismarineSet).prismarineSet(2f, METAL, T_IRON).build();

        COAL_SET = of(COAL_ID, CFG.EOCoalSet).coal(16000, 1600, 178, 3f, METAL, T_STONE).build();
        CHARCOAL_SET = of(CHARCOAL_ID, CFG.EOCharcoalSet).mainAllVanillaCoal(16000, 1600, 178, 3f, METAL, T_STONE).build();

        STONE_SET = of(STONE_ID, CFG.EOStoneSet).stoneSets().build();
        BLACKSTONE_SET = of(BLACKSTONE_ID, CFG.EOBlackstoneSet).stoneSets().build();
        GRANITE_SET = of(GRANITE_ID, CFG.EOGraniteSet).stoneSets().build();
        DIORITE_SET = of(DIORITE_ID, CFG.EODioriteSet).stoneSets().build();
        BASALT_SET = of(BASALT_ID, CFG.EOBasaltSet).stoneSets().build();
        CALCITE_SET = of(CALCITE_ID, CFG.EOCalciteSet).stoneSets().build();
        DEEPSLATE_SET = of(DEEPSLATE_ID, CFG.EODeepslateSet).stoneSets().build();
        NETHERRACK_SET = of(NETHERRACK_ID, CFG.EONetherrackSet).stoneSets().build();
        END_STONE_SET = of(END_STONE_ID, CFG.EOEndstoneSet).stoneSets().build();
        TUFF_SET = of(TUFF_ID, CFG.EOTuffSet).stoneSets().build();
        ANDESITE_SET = of(ANDESITE_ID, CFG.EOAndesiteSet).stoneSets().build();
        DRIPSTONE_SET = of(DRIPSTONE_ID, CFG.EODripstoneSet).onlyDusts().build();
        PURPUR_SET = of(PURPUR_ID, CFG.EOPurpurSet).onlyDusts().build();

        NETHER_BRICK_SET = of(NETHER_BRICK_ID, CFG.EONetherBrickSet).onlyDusts().build();
        BRICK_SET = of(BRICK_ID, CFG.EOBrickSet).onlyDusts().build();
        SAND_SET = of(SAND_ID, CFG.EOSandSet).onlyDusts().build();
        RED_SAND_SET = of(RED_SAND_ID, CFG.EORedSandSet).onlyDusts().build();
        SOUL_SAND_SET = of(SOUL_SAND_ID, CFG.EOSoulSandSet).onlyDusts().build();
        CLAY_SET = of(CLAY_ID, CFG.EOClaySet).onlyDusts().build();
        GRAVEL_SET = of(GRAVEL_ID, CFG.EOGravelSet).onlyDusts().build();
        FLINT_SET = of(FLINT_ID, CFG.EOFlintSet).special(1f, METAL, T_WOOD).build();
        ENDER_EYE_SET = of(ENDER_EYE_ID, CFG.EOEnderEyeSet).block(2f, METAL, T_IRON).build();
        NAUTILUS_SHELL_SET = of(NAUTILUS_SHELL_ID, CFG.EONautilusSet).special(1f, METAL, T_WOOD).build();
        NETHER_WART_SET = of(NETHER_WART_ID, CFG.EONetherWartSet).onlyDusts().build();
        WARPED_NETHER_WART_SET = of(WARPED_NETHER_WART_ID, CFG.EOWarpedNetherWartSet).onlyDusts().build();
        SCULK_SET = of(SCULK_ID, CFG.EOSculkSet).onlyDusts().build();
        GLOWSTONE_SET = of(GLOWSTONE_ID, CFG.EOBlazeSet).enriched().build();
        WOOD_SET = of(WOOD_ID, CFG.EOWoodenSet).woodSet(SAWDUST_ID).build();
        SUGAR_SET = of(SUGAR_ID, CFG.EOSugarSet).block(1f, SAND, T_WOOD).build();

        ARMADILLO_SCUTE_SET = of(ARMADILLO_SCUTE_ID, CFG.EOArmadilloSet).block(1f, METAL, T_WOOD).build();
        ENDER_PEARL_SET = of(ENDER_PEARL_ID, CFG.EOEnderPearlSet).enrichedDust("enriched_ender", 1f, METAL, T_WOOD).build();
        PHANTOM_MEMBRANE_SET = of(PHANTOM_MEMBRANE_ID, CFG.EOPhantomMembraneSet).block(3f, METAL, T_WOOD).build();
        SHULKER_SHELL_SET = of(SHULKER_SHELL_ID, CFG.EOShulkerSet).onlyDusts().build();
        NETHER_STAR_SET = of(NETHER_STAR_ID, CFG.EONetherStarSet).enrichedDust(3f, METAL, T_DIAMOND).build();
        ROTTEN_FLESH_SET = of(ROTTEN_FLESH_ID, CFG.EORottenFleshSet).block(1f, METAL, T_WOOD).build();
        BLAZE_SET = of(BLAZE_ID, CFG.EOBlazeSet).enrichedDusts(2f, METAL, T_IRON).build();
        TURTLE_SET = of(TURTLE_ID, CFG.EOTurtleSet).block(1f, METAL, T_WOOD).build();

        ALUMITE_SET = of(ALUMITE_ID, CFG.EOAlumiteSet).mainAllAlloy(4f, METAL, T_IRON).build();
        AMERICIUM_SET = of(AMERICIUM_ID, CFG.EOAmericiumSet).alloyWithoutGearEnriched(4f, METAL, T_DIAMOND).build();
        ANNEALED_COPPER_SET = of(ANNEALED_COPPER_ID, CFG.EOAnnealedCopperSet).mainAllAlloy(2f, METAL, T_IRON).build();
        AURORIUM_SET = of(AURORIUM_ID, CFG.EOAuroriumSet).secondaryAllAlloy(3f, METAL, T_DIAMOND).build();
        BATTERY_ALLOY_SET = of(BATTERY_ALLOY_ID, CFG.EOBatteryAlloySet).alloyWithoutGearFoil(2f, METAL, T_IRON).build();
        BISMUTH_SET = of(BISMUTH_ID, CFG.EOBismuthSet).bismuthSet(3f, METAL, T_IRON).build();
        BIOSTEEL_SET = of(BIOSTEEL_ID, CFG.EOBiosteelSet).mainAllAlloy(3f, METAL, T_IRON).build();
        BLACK_BRONZE_SET = of(BLACK_BRONZE_ID, CFG.EOBlackBronzeSet).alloyFoiless(3f, METAL, T_IRON).build();
        BLACK_STEEL_SET = of(BLACK_STEEL_ID, CFG.EOBlackSteelSet).mainAllAlloy(3f, METAL, T_DIAMOND).build();
        BLUE_STEEL_SET = of(BLUE_STEEL_ID, CFG.EOBlueSteelSet).mainAllAlloy(4f, METAL, T_IRON).build();
        BRASS_SET = of(BRASS_ID, CFG.EOBrassSet).mainAllAlloy(3f, METAL, T_IRON).build();
        BRITANNIA_SILVER_SET = of(BRITANNIA_SILVER_ID, CFG.EOBritanniaSilverSet).mainAllAlloy(3f, METAL, T_IRON).build();
        BRONZE_SET = of(BRONZE_ID, CFG.EOBronzeSet).mainAllAlloy(3f, METAL, T_IRON).build();
        CADMIUM_SET = of(CADMIUM_ID, CFG.EOCadmiumSet).dustAndBlocks(3f, T_IRON).build();
        CALIFORNIUM_SET = of(CALIFORNIUM_ID, CFG.EOCaliforniumSet).dustAndBlocks(3f, T_DIAMOND).build();
        CAST_IRON_SET = of(CAST_IRON_ID, CFG.EOCastIronSet).mainAllAlloy(3f, METAL, T_IRON).build();
        CAST_STEEL_SET = of(CAST_STEEL_ID, CFG.EOCastSteelSet).mainAllAlloy(3f, METAL, T_IRON).build();
        CERIUM_SET = of(CERIUM_ID, CFG.EOCeriumSet).dustAndBlocks(3f, T_DIAMOND).build();
        CESIUM_SET = of(CESIUM_ID, CFG.EOCesiumSet).alloyWithoutFeatures(3f, METAL, T_DIAMOND).build();
        CHROMIUM_SET = of(CHROMIUM_ID, CFG.EOChromiumSet).secondaryAllAlloy(3f, METAL, T_DIAMOND).build();
        CONSTANTAN_SET = of(CONSTANTAN_ID, CFG.EOConstantanSet).mainAllAlloy(3f, METAL, T_IRON).build();
        COSMIC_MATTER_SET = of(COSMIC_MATTER_ID, CFG.EOCosmicMatterSet).secondaryAllAlloy(3f, METAL, T_NETHERITE).build();
        CRYSTALLINE_ALLOY_SET = of(CRYSTALLINE_ALLOY_ID, CFG.EOCrystallineAlloySet).mainAllAlloy(3f, METAL, T_IRON).build();
        CUPRONICKEL_SET = of(CUPRONICKEL_ID, CFG.EOCupronickelSet).alloyWithoutGearEnriched(2f, METAL, T_IRON).build();
        ELECTRUM_SET = of(ELECTRUM_ID, CFG.EOElectrumSet).secondaryAllAlloy(3f, METAL, T_IRON).build();
        ENDERIUM_SET = of(ENDERIUM_ID, CFG.EOEnderiumSet).secondaryAllAlloy(4f, METAL, T_IRON).build();
        ENERGETIC_SILVER_SET = of(ENERGETIC_SILVER_ID, CFG.EOEnergeticSilverSet).mainAllAlloy(3f, METAL, T_IRON).build();
        ETERNAL_DARK_SET = of(ETERNAL_DARK_ID, CFG.EOEternalDarkSet).secondaryAllAlloy(3f, METAL, T_DIAMOND).build();
        ETERNAL_LIGHT_SET = of(ETERNAL_LIGHT_ID, CFG.EOEternalLightSet).secondaryAllAlloy(3f, METAL, T_DIAMOND).build();
        ETERNITY_SET = of(ETERNITY_ID, CFG.EOEternitySet).secondaryAllAlloy(3f, METAL, T_DIAMOND).build();
        ETHERIUM_SET = of(ETHERIUM_ID, CFG.EOEtheriumSet).secondaryAllAlloy(3f, METAL, T_DIAMOND).build();
        FRANCIUM_SET = of(FRANCIUM_ID, CFG.EOFranciumSet).alloyWithoutFeatures(3f, METAL, T_DIAMOND).build();
        GRAPHITE_SET = of(GRAPHITE_ID, CFG.EOGraphiteSet).secondaryAllAlloy(3f, METAL, T_STONE).build();
        GRAVITRONIUM_SET = of(GRAVITRONIUM_ID, CFG.EOGravitroniumSet).secondaryAllAlloy(5f, METAL, T_NETHERITE).build();
        HAFNIUM_SET = of(HAFNIUM_ID, CFG.EOHafniumSet).mainAllAlloy(3f, METAL, T_DIAMOND).build();
        HEPATIZON_SET = of(HEPATIZON_ID, CFG.EOHepatizonSet).mainAllAlloy(3f, METAL, T_IRON).build();
        INDIUM_SET = of(INDIUM_ID, CFG.EOIndiumSet).alloyWithoutFeatures(1f, METAL, T_IRON).build();
        INVAR_SET = of(INVAR_ID, CFG.EOInvarSet).secondaryAllAlloy(3f, METAL, T_IRON).build();
        KANTHAL_SET = of(KANTHAL_ID, CFG.EOKanthalSet).alloyWithoutGearFoil(3f, METAL, T_IRON).build();
        LUMIUM_SET = of(LUMIUM_ID, CFG.EOLumiumSet).secondaryAllAlloy(3f, METAL, T_IRON).build();
        MAGNESIUM_SET = of(MAGNESIUM_ID, CFG.EOMagnesiumSet).secondaryAllAlloy(3f, METAL, T_STONE).build();
        MANGANESE_SET = of(MANGANESE_ID, CFG.EOManganeseSet).tertiaryAllAlloy(3f, METAL, T_IRON).build();
        MELODIC_ALLOY_SET = of(MELODIC_ALLOY_ID, CFG.EOMelodicAlloySet).mainAllAlloy(3f, METAL, T_IRON).build();
        MISSING_SET = of(MISSING_ID, CFG.EOMissingSet).ingot().build();
        MODULARIUM_SET = of(MODULARIUM_ID, CFG.EOModulariumSet).mainAllAlloy(3f, METAL, T_IRON).build();
        NANITE_SET = of(NANITE_ID, CFG.EONaniteSet).mainAllAlloy(6f, METAL, T_NETHERITE).build();
        NEPTUNIUM_SET = of(NEPTUNIUM_ID, CFG.EONeptuniumSet).alloyWithoutGearEnriched(4f, METAL, T_IRON).build();
        NETHERSTEEL_SET = of(NETHERSTEEL_ID, CFG.EONethersteelSet).mainAllAlloy(4f, METAL, T_IRON).build();
        NIOBIUM_SET = of(NIOBIUM_ID, CFG.EONiobiumSet).alloyWithoutFeatures(2f, METAL, T_IRON).build();
        NOVALLOY_SET = of(NOVALLOY_ID, CFG.EONovalloySet).mainAllAlloy(5f, NETHERITE_BLOCK, T_NETHERITE).build();
        OSGLOGLAS_SET = of(OSGLOGLAS_ID, CFG.EOsgloglasSet).mainAllAlloy(3f, METAL, T_IRON).build();
        PEWTER_SET = of(PEWTER_ID, CFG.EOPewterSet).mainAllAlloy(3f, METAL, T_IRON).build();
        PIG_IRON_SET = of(PIG_IRON_ID, CFG.EOPigIronSet).mainAllAlloy(4f, METAL, T_IRON).build();
        PLUTONIUM_SET = of(PLUTONIUM_ID, CFG.EOPlutoniumSet).secondaryAllAlloy(4f, METAL, T_DIAMOND).build();
        QUARTZ_ENRICHED_COPPER_SET = of(QUARTZ_ENRICHED_COPPER_ID, CFG.EOQuartzEnrichedCopperSet).mainAllAlloy(1f, METAL, T_IRON).build();
        QUARTZ_ENRICHED_IRON_SET = of(QUARTZ_ENRICHED_IRON_ID, CFG.EOQuartzEnrichedIronSet).mainAllAlloy(1f, METAL, T_IRON).build();
        RED_STEEL_SET = of(RED_STEEL_ID, CFG.EORedSteelSet).mainAllAlloy(3f, METAL, T_IRON).build();
        RHODIUM_SET = of(RHODIUM_ID, CFG.EORhodiumSet).mainAllAlloy(3f, METAL, T_DIAMOND).build();
        ROSE_GOLD_SET = of(ROSE_GOLD_ID, CFG.EORoseGoldSet).mainAllAlloy(3f, METAL, T_IRON).build();
        RUBIDIUM_SET = of(RUBIDIUM_ID, CFG.EORubidiumSet).alloyWithoutFeatures(3f, METAL, T_DIAMOND).build();
        RUTHENIUM_SET = of(RUTHENIUM_ID, CFG.EORutheniumSet).mainAllAlloy(3f, METAL, T_DIAMOND).build();
        SAMARIUM_SET = of(SAMARIUM_ID, CFG.EOSamariumSet).alloyWithoutGearPlateFoil(3f, METAL, T_IRON).build();
        SHADOWSTEEL_SET = of(SHADOWSTEEL_ID, CFG.EOShadowsteelSet).mainAllAlloy(4f, METAL, T_IRON).build();
        SIGNALUM_SET = of(SIGNALUM_ID, CFG.EOSignalumSet).secondaryAllAlloy(3f, METAL, T_IRON).build();
        SILICON_SET = of(SILICON_ID, CFG.EOSiliconSet).siliconSet("silicon_ingot", 2f, METAL, T_IRON).build();
        STAINLESS_STEEL_SET = of(STAINLESS_STEEL_ID, CFG.EOStainlessSteelSet).mainAllAlloy(3f, METAL, T_DIAMOND).build();
        STEEL_SET = of(STEEL_ID, CFG.EOSteelSet).mainAllAlloy(3f, METAL, T_IRON).build();
        STELLARIUM_SET = of(STELLARIUM_ID, CFG.EOStellariumSet).secondaryAllAlloy(3f, METAL, T_DIAMOND).build();
        STELLAR_ALLOY_SET = of(STELLAR_ALLOY_ID, CFG.EOStellarAlloySet).mainAllAlloy(3f, METAL, T_IRON).build();
        TANTALUM_SET = of(TANTALUM_ID, CFG.EOTantalumSet).alloyWithoutGearRod(3f, METAL, T_IRON).build();
        UNIVERSIUM_SET = of(UNIVERSIUM_ID, CFG.EOUniversiumSet).secondaryAllAlloy(3f, METAL, T_NETHERITE).build();
        UNSTABLE_SET = of(UNSTABLE_STABLE_ID, CFG.EOUnstableIngotSet).unstableIngot(UNSTABLE_ID).build();
        VIVID_ALLOY_SET = of(VIVID_ALLOY_ID, CFG.EOVividAlloySet).mainAllAlloy(3f, METAL, T_IRON).build();
        WROUGHT_IRON_SET = of(WROUGHT_IRON_ID, CFG.EOWroughtIronSet).secondaryAllAlloy(3f, METAL, T_IRON).build();
        YTTRIUM_SET = of(YTTRIUM_ID, CFG.EOYttriumSet).alloyWithoutFeatures(3f, METAL, T_DIAMOND).build();

        ARCANUM_SET = of(ARCANUM_ID, CFG.EOArcanumSet).mainAllGem(5f, METAL, T_DIAMOND).build();
        CERTUS_QUARTZ_SET = of(CERTUS_QUARTZ_ID, CFG.EOCertusQuartzSet).mainAllGem(2f, METAL, T_STONE).build();
        FLUIX_SET = of(FLUIX_ID, CFG.EOFluixSet).mainAllGem("fluix_crystal_block", 2f, METAL, T_STONE).build();
        MORPHITE_SET = of(MORPHITE_ID, CFG.EOMorphiteSet).mainAllGem(4f, METAL, T_DIAMOND).build();
        PRIMORNIUM_SET = of(PRIMORNIUM_ID, CFG.EOPrimorniumSet).mainAllGem(6f, METAL, T_NETHERITE).build();
        QUANTIQUARITE_SET = of(QUANTIQUARITE_ID, CFG.EOQuantiquariteSet).mainAllGem(4f, METAL, T_DIAMOND).build();
        SANGUIS_VIVUS_SET = of(SANGUIS_VIVUS_ID, CFG.EOSanguisVivusSet).mainAllGem(3f, METAL, T_DIAMOND).build();
        SOURCE_SET = of(SOURCE_ID, CFG.EOSourceSet).mainAllGem(1f, METAL, T_STONE).build();
        SPECTRAL_SKY_BLUERITE_SET = of(SPECTRAL_SKY_BLUERITE_ID, CFG.EOSpectralSkyBlueriteSet).mainAllGem(4f, METAL, T_IRON).build();
        TACHYARITE_SET = of(TACHYARITE_ID, CFG.EOTachyariteSet).mainAllGem(4f, METAL, T_IRON).build();
        TEMICTETL_SET = of(TEMICTETL_ID, CFG.EOTemictetlSet).mainAllGem(3f, METAL, T_DIAMOND).build();
        VOIDERITE_SET = of(VOIDERITE_ID, CFG.EOVoideriteSet).mainAllGem(4f, METAL, T_IRON).build();

        BIOMASS_SET = of(BIOMASS_ID, CFG.EOBiomassSet).item(1f, SAND, T_WOOD).build();
        CALCIUM_SET = of(CALCIUM_ID, CFG.EOCalciumSet).dustAndBlocks(3f, T_WOOD).build();
        DUST_SET = of(DUST_ID, CFG.EODustSet).dustAndBlocks(DUST_ID, 1f, T_WOOD).build();
        SELENIUM_SET = of(SELENIUM_ID, CFG.EOSeleniumSet).dustAndBlocks(3f, T_DIAMOND).build();
        PHOSPHORUS_SET = of(PHOSPHORUS_ID, CFG.EOPhosphorusSet).dustAndBlocks(1f, T_STONE).build();
        RARE_EARTH_SET = of(RARE_EARTH_ID, CFG.EORareEarthSet).dustAndBlocks(1f, T_IRON).build();

        ANTIMATTER_SET = of(ANTIMATTER_ID, CFG.EOAntimatterSet).block(3f, METAL, T_NETHERITE).build();
        EXOTIC_MATTER_SET = of(EXOTIC_MATTER_ID, CFG.EOExoticMatterSet).block(3f, METAL, T_NETHERITE).build();
        STRANGE_MATTER_SET = of(STRANGE_MATTER_ID, CFG.EOStrangeMatterSet).block(3f, METAL, T_NETHERITE).build();

        SHADOW_BLEND_SET = of(SHADOW_BLEND_ID, CFG.EOShadowBlendSet).mainBlend().build();
        CARBON_BLEND_SET = of(CARBON_BLEND_ID, CFG.EOCarbonBlend).carbonBlend().build();
        LE_CARBON_BLEND_SET = of(LE_CARBON_BLEND_ID, CFG.EOLCarbonBlend).secondaryBlend("low_enriched_carbon").build();
        HE_CARBON_BLEND_SET = of(HE_CARBON_BLEND_ID, CFG.EOHCarbonBlend).secondaryBlend("highly_enriched_carbon").build();
        NETHER_BLEND_SET = of(NETHER_BLEND_ID, CFG.EONetherBlendSet).mainBlend().build();
        ENERGETIC_BLEND_SET = of(ENERGETIC_BLEND_ID, CFG.EOEnergeticBlendSet).mainBlend().build();
        ENDERGETIC_BLEND_SET = of(ENDERGETIC_BLEND_ID, CFG.EOEndergeticSet).mainBlend().build();
    }

    public static void rgtr(IEventBus bus) {
        EO_ITEMS.register(bus);
        EO_BLOCKS.register(bus);
    }
}
