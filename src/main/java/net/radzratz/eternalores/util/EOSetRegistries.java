package net.radzratz.eternalores.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.fluids.capability.wrappers.FluidBucketWrapper;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.fluids.type.EOFluidBucketItem;
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
import static net.radzratz.eternalores.util.EOUtils.allItemEntries;
import static net.radzratz.eternalores.util.config.EOMaterialConfig.CFG;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.GemShards.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Nuggets.*;
import static net.radzratz.eternalores.util.EOMaterials.materialSets.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Tools.CASTS_INGOT;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Tools.CASTS_ROD;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Tools.CASTS_PLATE;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Tools.CASTS_GEAR;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Tools.CASTS_GEM;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Tools.CASTS_NUGGET;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Tools.CASTS_FOIL;

public class EOSetRegistries {
    public static final DeferredRegister.Items EO_ITEMS = DeferredRegister.createItems(EternalOres.id);
    public static final DeferredRegister.Blocks EO_BLOCKS = DeferredRegister.createBlocks(EternalOres.id);
    public static final DeferredRegister<FluidType> EO_FLUID_TYPES = DeferredRegister.create(NeoForgeRegistries.Keys.FLUID_TYPES, EternalOres.id);
    public static final DeferredRegister<Fluid> EO_FLUIDS = DeferredRegister.create(Registries.FLUID, EternalOres.id);

    public static final DeferredItem<EOMolds> MOLD_ROD;
    public static final DeferredItem<EOMolds> MOLD_PLATE;
    public static final DeferredItem<EOMolds> MOLD_GEAR;
    public static final DeferredItem<EOMolds> MOLD_FOIL;
    public static final DeferredItem<EOMolds> MOLD_NUGGET;
    public static final DeferredItem<EOMolds> MOLD_INGOT;
    public static final DeferredItem<EOMolds> MOLD_GEM;

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

        MOLD_ROD = rgtrMolds("mold_rod", EOToolsConfig.CFG.molds::rodEnabled, CASTS_ROD);
        MOLD_PLATE = rgtrMolds("mold_plate", EOToolsConfig.CFG.molds::plateEnabled, CASTS_PLATE);
        MOLD_GEAR = rgtrMolds("mold_gear", EOToolsConfig.CFG.molds::gearEnabled, CASTS_GEAR);
        MOLD_FOIL = rgtrMolds("mold_foil", EOToolsConfig.CFG.molds::foilEnabled, CASTS_FOIL);
        MOLD_INGOT = rgtrMolds("mold_ingot", EOToolsConfig.CFG.molds::ingotEnabled, CASTS_INGOT);
        MOLD_GEM = rgtrMolds("mold_gem", EOToolsConfig.CFG.molds::gemEnabled, CASTS_GEM);
        MOLD_NUGGET = rgtrMolds("mold_nugget", EOToolsConfig.CFG.molds::nuggetEnabled, CASTS_NUGGET);

        ALUMINUM_SET = of(ALUMINUM_ID, CFG.EOAluminumSet).mainAllMetal(3f, METAL, T_STONE).ores(3f, T_IRON, 1, 2, ORE_STONE, ORE_SLATE).temperature(660).tint(() -> 0xFFdedede).moltenTintable().build();
        ARDITE_SET = of(ARDITE_ID, CFG.EOArditeSet).mainAllMetal(7f, METAL, T_NETHERITE).ore("ardite_ore_block", 7f, ORE_NETHER, T_NETHERITE, 1, 1).temperature(1900).tint(() -> 0xFFff8616).moltenTintable().build();
        BERYLLIUM_SET = of(BERYLLIUM_ID, CFG.EOBerylliumSet).mainAllMetal(2f, METAL, T_DIAMOND).ores(2f, T_DIAMOND, 1, 1, ORE_STONE, ORE_SLATE).temperature(1789).tint(() -> 0xFF6ec394).moltenTintable().build();
        CATALYRIUM_SET = of(CATALYRIUM_ID, CFG.EOCatalyriumSet).catalyriumSet(5f, METAL, T_NETHERITE).temperature(7500).build();
        COBALT_SET = of(COBALT_ID, CFG.EOCobaltSet).mainAllMetal(4f, METAL, T_IRON).ores(4f, T_DIAMOND, 1, 1, ORE_STONE, ORE_SLATE, ORE_NETHER).temperature(1100).tint(() -> 0xFF9ce3e3).moltenTintable().build();
        GALLIUM_SET = of(GALLIUM_ID, CFG.EOGalliumSet).mainAllMetal(3f, METAL, T_STONE).ores(3f, T_STONE, 1, 1, ORE_STONE, ORE_SLATE, ORE_NETHER).temperature(900).tint(() -> 0xFFc2cad3).moltenTintable().build();
        IRIDIUM_SET = of(IRIDIUM_ID, CFG.EOIridiumSet).mainAllMetal(3f, METAL, T_IRON).ores(3f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_END).temperature(1440).build();
        LEAD_SET = of(LEAD_ID, CFG.EOLeadSet).mainAllMetal(4f, METAL, T_IRON).ores(4f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_END).temperature(327).build();
        MOLYBDENUM_SET = of(MOLYBDENUM_ID, CFG.EOMolybdenumSet).mainAllMetal(3f, METAL, T_IRON).ores(3f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_NETHER, ORE_END).temperature(2152).build();
        NICKEL_SET = of(NICKEL_ID, CFG.EONickelSet).mainAllMetal(3f, METAL, T_IRON).ores(3f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_NETHER).temperature(1450).tint(() -> 0xFFd3c8ab).moltenTintable().build();
        NEODYMIUM_SET = of(NEODYMIUM_ID, CFG.EONeodymiumSet).secondaryAllMetal(3f, METAL, T_IRON).ores(3f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_END).temperature(2100).build();
        OSMIUM_SET = of(OSMIUM_ID, CFG.EOOsmiumSet).mainAllMetal(3f, METAL, T_IRON).ores(3f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_NETHER).temperature(1990).build();
        PALLADIUM_SET = of(PALLADIUM_ID, CFG.EOPalladiumSet).mainAllMetal(3f, METAL, T_DIAMOND).ores(4f, T_DIAMOND, 1, 1, ORE_STONE, ORE_SLATE, ORE_END).temperature(2400).build();
        PLATINUM_SET = of(PLATINUM_ID, CFG.EOPlatinumSet).mainAllMetal(4f, METAL, T_DIAMOND).ores(4f, T_DIAMOND, 1, 1, ORE_STONE, ORE_SLATE, ORE_END).temperature(1768).build();
        SCULKITE_SET = of(SCULKITE_ID, CFG.EOSculkiteSet).mainAllMetal(3f, METAL, T_NETHERITE).ore("sculkite_ore_block", 3f, ORE_SCULK, T_NETHERITE, 1, 1).temperature(1950).build();
        SILVER_SET = of(SILVER_ID, CFG.EOSilverSet).mainAllMetal(3f, METAL, T_IRON).ores(3f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_NETHER).temperature(960).tint(() -> 0xFFb9cbe3).moltenTintable().build();
        SULFUR_SET = of(SULFUR_ID, CFG.EOSulfurSet).sulfurSet(SULFUR_ID, 1f, METAL, T_STONE).ores(1f, T_STONE, 1, 2, ORE_STONE, ORE_SLATE, ORE_NETHER).build();
        TIN_SET = of(TIN_ID, CFG.EOTinSet).mainAllMetal(3f, METAL, T_STONE).ores(3f, T_STONE, 1, 1, ORE_STONE, ORE_SLATE, ORE_END).temperature(230).tint(() -> 0xFFb9c5ce).moltenTintable().build();
        TITANIUM_SET = of(TITANIUM_ID, CFG.EOTitaniumSet).mainAllMetal(4f, METAL, T_DIAMOND).ores(4f, T_DIAMOND, 1, 1, ORE_STONE, ORE_SLATE, ORE_END).temperature(2700).build();
        TUNGSTEN_SET = of(TUNGSTEN_ID, CFG.EOTungstenSet).mainAllMetal(4f, METAL, T_DIAMOND).ore("tungsten_ore_block", 4f, ORE_SLATE, T_DIAMOND, 1, 1).ore("end_tungsten_ore_block", 4f, ORE_END, T_DIAMOND, 1, 1).temperature(4500).build();
        ULTIMATITANIUM_SET = of(ULTIMATITANIUM_ID, CFG.EOUltimatitaniumSet).mainAllMetal(4f, METAL, T_DIAMOND).ore("ultimatitanium_ore_block", 4f, ORE_END, T_DIAMOND, 1, 1).temperature(5125).build();
        URANINITE_SET = of(URANINITE_ID, CFG.EOUraniniteSet).mainAllMetal(3f, METAL, T_IRON).ores(3f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_NETHER).temperature(1130).build();
        URANIUM_SET = of(URANIUM_ID, CFG.EOUraniumSet).mainAllMetal(4f, METAL, T_DIAMOND).ores(4f, T_DIAMOND, 1, 1, ORE_STONE, ORE_SLATE, ORE_NETHER, ORE_END).temperature(1130).build();
        VANADIUM_SET = of(VANADIUM_ID, CFG.EOVanadiumSet).mainAllMetal(3f, METAL, T_IRON).ores(3f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_END).temperature(2150).build();
        ZINC_SET = of(ZINC_ID, CFG.EOZincSet).mainAllMetal(3f, METAL, T_STONE).ores(3f, T_STONE, 1, 1, ORE_STONE, ORE_SLATE).temperature(419).tint(() -> 0xFFaac5c6).moltenTintable().build();

        AMBER_SET = of(AMBER_ID, CFG.EOAmberSet).mainAllGem(3f, METAL, T_IRON).ores(3f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE).temperature(200).build();
        APATITE_SET = of(APATITE_ID, CFG.EOApatiteSet).mainAllGem(3f, METAL, T_IRON).ores(3f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE).temperature(900).build();
        BLACK_QUARTZ_SET = of(BLACK_QUARTZ_ID, CFG.EOBlackQuartzSet).mainAllGem(3f, METAL, T_IRON).ores(3f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_NETHER).temperature(800).build();
        CINNABAR_SET = of(CINNABAR_ID, CFG.EOCinnabarSet).mainAllGem(3f, METAL, T_IRON).ores(3f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_NETHER).temperature(1320).build();
        FLUORITE_SET = of(FLUORITE_ID, CFG.EOFluoriteSet).fluoriteSet(FLUORITE_ID, 3f, METAL, T_IRON).ores(3f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_END).build();
        GARNET_SET = of(GARNET_ID, CFG.EOGarnetSet).mainAllGem(4f, METAL, T_IRON).ores(4f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_NETHER).temperature(1000).build();
        JADE_SET = of(JADE_ID, CFG.EOJadeSet).mainAllGem(3f, METAL, T_IRON).ores(3f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_NETHER).temperature(900).build();
        MONAZITE_SET = of(MONAZITE_ID, CFG.EOMonaziteSet).mainAllGem(4f, METAL, T_IRON).ores(4f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_NETHER).temperature(1200).build();
        NECROTICARITE_SET = of(NECROTICARITE_ID, CFG.EONecroticariteSet).mainAllGem(4f, METAL, T_DIAMOND).ore("necroticarite_ore_block", 4f, ORE_NETHER, T_DIAMOND, 1, 1).temperature(1800).build();
        NITER_SET = of(NITER_ID, CFG.EONiterSet).niterSet(3f, METAL, T_IRON).ores(3f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE).build();
        OBSIDIAN_SET = of(OBSIDIAN_ID, CFG.EObsidianSet).mainAllGem(4f, METAL, T_DIAMOND).ore("obsidian_ore_block", 4f, ORE_NETHER, T_DIAMOND, 1, 1).temperature(1400).tint(() -> 0xFF764cc2).moltenTintable().build();
        ONYX_SET = of(ONYX_ID, CFG.EOnyxSet).mainAllGem(3f, METAL, T_IRON).ores(3f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_NETHER).temperature(1100).build();
        PEARL_SET = of(PEARL_ID, CFG.EOPearlSet).mainAllGem(4f, METAL, T_IRON).ore("pearl_ore_block", 4f, ORE_SAND, T_IRON, 1, 1).temperature(243).build();
        PERIDOT_SET = of(PERIDOT_ID, CFG.EOPeridotSet).mainAllGem(3f, METAL, T_IRON).ores(3f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_NETHER).temperature(1000).build();
        PYROLITE_SET = of(PYROLITE_ID, CFG.EOPyroliteSet).mainAllGem(4f, METAL, T_DIAMOND).ore("pyrolite_ore_block", 4f, ORE_NETHER, T_DIAMOND, 1, 1).ore("end_pyrolite_ore_block", 4f, ORE_END, T_DIAMOND, 1, 1).temperature(2100).build();
        RUBY_SET = of(RUBY_ID, CFG.EORubySet).mainAllGem(3f, METAL, T_IRON).ores(3f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_NETHER).temperature(1200).build();
        SAPPHIRE_SET = of(SAPPHIRE_ID, CFG.EOSapphireSet).mainAllGem(3f, METAL, T_IRON).ores(3f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_END).temperature(1200).build();
        SPINEL_SET = of(SPINEL_ID, CFG.EOSpinelSet).mainAllGem(3f, METAL, T_IRON).ores(3f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_NETHER).temperature(900).build();
        TANZANITE_SET = of(TANZANITE_ID, CFG.EOTanzaniteSet).mainAllGem(4f, METAL, T_IRON).ores(4f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_NETHER).temperature(1005).build();
        ZIRCON_SET = of(ZIRCON_ID, CFG.EOZirconSet).mainAllGem(3f, METAL, T_IRON).ores(3f, T_IRON, 1, 1, ORE_STONE, ORE_SLATE, ORE_NETHER).temperature(1300).build();

        ANTHRACITE_SET = of(ANTHRACITE_ID, CFG.EOAnthraciteCoalSet).mainCoal(3f, 21600,2400, 267, METAL, T_STONE).ores(3f, T_STONE, 1, 1, ORE_STONE, ORE_SLATE).build();
        BITUMINOUS_SET = of(BITUMINOUS_ID, CFG.EOBituminousCoalSet).mainCoal(3f, 14400,1600, 178, METAL, T_STONE).ores(3f, T_STONE, 1, 1, ORE_STONE, ORE_SLATE).build();
        LIGNITE_SET = of(LIGNITE_ID, CFG.EOLigniteCoalSet).mainCoal(3f, 7200, 800, 89, METAL, T_STONE).ores(3, T_STONE, 1, 1, ORE_STONE, ORE_SLATE).build();
        PEAT_SET = of(PEAT_ID, CFG.EOPeatCoalSet).mainCoal(3f, 3600, 400, 45, METAL, T_STONE).ores(3f, T_STONE, 1, 1, ORE_STONE, ORE_SLATE).build();

        SALT_SET = of(SALT_ID, CFG.EOSaltSet).salt(1f, T_STONE).ore("salt_ore_block", 1f, ORE_SAND, T_STONE, 1, 3).build();

        COKE_SET = of(COKE_ID, CFG.EOCokeSet).mainCoal(3f, 28800, 3200, 356, METAL, T_STONE).build();

        COPPER_SET = of(COPPER_ID, CFG.EOCopperSet).secondaryVanillaMetal(2f, T_STONE).temperature(900).tint(() -> 0xFFe77c56).moltenTintable().build();
        GOLD_SET = of(GOLD_ID, CFG.EOGoldSet).mainVanillaMetal(2f, T_IRON).temperature(900).tint(() -> 0xFFedb006).moltenTintable().build();
        IRON_SET = of(IRON_ID, CFG.EOIronSet).mainVanillaMetal(2f, T_STONE).temperature(900).tint(() -> 0xFFffc49b).moltenTintable().build();
        NETHERITE_SET = of(NETHERITE_ID, CFG.EONetheriteSet).netheriteMetal(3f, T_DIAMOND).temperature(1500).tint(() -> 0xFF4c4143).moltenTintable().build();

        REDSTONE_SET = of(REDSTONE_ID, CFG.EORedstoneSet).redstoneSet("redstone_ingot", 1f, METAL, T_WOOD).temperature(900).tint(() -> 0xFFff0000).moltenTintable().build();

        DIAMOND_SET = of(DIAMOND_ID, CFG.EODiamondSet).mainAllVanillaGems(2f, T_IRON).temperature(1400).tint(() -> 0xFF4aedd9).moltenTintable().build();
        EMERALD_SET = of(EMERALD_ID, CFG.EOEmeraldSet).mainAllVanillaGems(2f, T_IRON).temperature(1200).tint(() -> 0xFF17dd62).moltenTintable().build();
        AMETHYST_SET = of(AMETHYST_ID, CFG.EOAmethystSet).mainAllVanillaGems(2f, T_IRON).temperature(1000).tint(() -> 0xFF8a47ff).moltenTintable().build();
        LAPIS_SET = of(LAPIS_ID, CFG.EOLapisSet).mainAllVanillaGems(2f, T_STONE).temperature(1300).tint(() -> 0xFF5a82e2).moltenTintable().build();
        QUARTZ_SET = of(QUARTZ_ID, CFG.EOQuartzSet).mainAllVanillaGems(2f, T_IRON).temperature(800).tint(() -> 0xFFe9d0b1).moltenTintable().build();
        PRISMARINE_SET = of(PRISMARINE_ID, CFG.EOPrismarineSet).prismarineSet(2f, METAL, T_IRON).temperature(1000).tint(() -> 0xFF9ce3e3).moltenTintable().build();

        COAL_SET = of(COAL_ID, CFG.EOCoalSet).coal(16000, 1600, 178, 3f, METAL, T_STONE).build();
        CHARCOAL_SET = of(CHARCOAL_ID, CFG.EOCharcoalSet).mainAllVanillaCoal(16000, 1600, 178, 3f, METAL, T_STONE).build();

        STONE_SET = of(STONE_ID, CFG.EOStoneSet).stoneSets(2f, T_WOOD).build();
        BLACKSTONE_SET = of(BLACKSTONE_ID, CFG.EOBlackstoneSet).stoneSets(2f, T_WOOD).build();
        GRANITE_SET = of(GRANITE_ID, CFG.EOGraniteSet).stoneSets(2f, T_WOOD).build();
        DIORITE_SET = of(DIORITE_ID, CFG.EODioriteSet).stoneSets(2f, T_WOOD).build();
        BASALT_SET = of(BASALT_ID, CFG.EOBasaltSet).stoneSets(2f, T_WOOD).build();
        CALCITE_SET = of(CALCITE_ID, CFG.EOCalciteSet).stoneSets(2f, T_WOOD).build();
        DEEPSLATE_SET = of(DEEPSLATE_ID, CFG.EODeepslateSet).stoneSets(2f, T_WOOD).build();
        NETHERRACK_SET = of(NETHERRACK_ID, CFG.EONetherrackSet).stoneSets(2f, T_WOOD).build();
        END_STONE_SET = of(END_STONE_ID, CFG.EOEndstoneSet).stoneSets(2f, T_WOOD).build();
        TUFF_SET = of(TUFF_ID, CFG.EOTuffSet).stoneSets(2f, T_WOOD).build();
        ANDESITE_SET = of(ANDESITE_ID, CFG.EOAndesiteSet).stoneSets(2f, T_WOOD).build();
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
        GLOWSTONE_SET = of(GLOWSTONE_ID, CFG.EOGlowstoneSet).enriched(2f, T_STONE).build();
        WOOD_SET = of(WOOD_ID, CFG.EOWoodenSet).woodSet(SAWDUST_ID).build();
        SUGAR_SET = of(SUGAR_ID, CFG.EOSugarSet).block(1f, SAND, T_WOOD).build();

        ARMADILLO_SCUTE_SET = of(ARMADILLO_SCUTE_ID, CFG.EOArmadilloSet).block(1f, METAL, T_WOOD).build();
        ENDER_PEARL_SET = of(ENDER_PEARL_ID, CFG.EOEnderPearlSet).enrichedDust("enriched_ender", 1f, METAL, T_WOOD).temperature(1200).tint(() -> 0xFF63e0ca).moltenTintable().build();
        PHANTOM_MEMBRANE_SET = of(PHANTOM_MEMBRANE_ID, CFG.EOPhantomMembraneSet).block(3f, METAL, T_WOOD).build();
        SHULKER_SHELL_SET = of(SHULKER_SHELL_ID, CFG.EOShulkerSet).onlyDusts().temperature(1500).build();
        NETHER_STAR_SET = of(NETHER_STAR_ID, CFG.EONetherStarSet).enrichedDust(3f, METAL, T_DIAMOND).temperature(2100).build();
        ROTTEN_FLESH_SET = of(ROTTEN_FLESH_ID, CFG.EORottenFleshSet).block(1f, METAL, T_WOOD).build();
        BLAZE_SET = of(BLAZE_ID, CFG.EOBlazeSet).enrichedDusts(2f, METAL, T_IRON).build();
        TURTLE_SET = of(TURTLE_ID, CFG.EOTurtleSet).block(1f, METAL, T_WOOD).build();

        ALUMITE_SET = of(ALUMITE_ID, CFG.EOAlumiteSet).mainAllAlloy(4f, METAL, T_IRON).temperature(1500).tint(() -> 0xFFfbb4ec).moltenTintable().build();
        AMERICIUM_SET = of(AMERICIUM_ID, CFG.EOAmericiumSet).alloyWithoutGearEnriched(4f, METAL, T_DIAMOND).temperature(5100).build();
        ANNEALED_COPPER_SET = of(ANNEALED_COPPER_ID, CFG.EOAnnealedCopperSet).mainAllAlloy(2f, METAL, T_IRON).temperature(1200).build();
        AURORIUM_SET = of(AURORIUM_ID, CFG.EOAuroriumSet).secondaryAllAlloy(3f, METAL, T_DIAMOND).temperature(9000).build();
        BATTERY_ALLOY_SET = of(BATTERY_ALLOY_ID, CFG.EOBatteryAlloySet).alloyWithoutGearFoil(2f, METAL, T_IRON).temperature(1500).build();
        BISMUTH_SET = of(BISMUTH_ID, CFG.EOBismuthSet).bismuthSet(3f, METAL, T_IRON).temperature(2150).build();
        BIOSTEEL_SET = of(BIOSTEEL_ID, CFG.EOBiosteelSet).mainAllAlloy(3f, METAL, T_IRON).temperature(1600).build();
        BLACK_BRONZE_SET = of(BLACK_BRONZE_ID, CFG.EOBlackBronzeSet).alloyFoiless(3f, METAL, T_IRON).temperature(3500).build();
        BLACK_STEEL_SET = of(BLACK_STEEL_ID, CFG.EOBlackSteelSet).mainAllAlloy(3f, METAL, T_DIAMOND).temperature(3700).build();
        BLUE_STEEL_SET = of(BLUE_STEEL_ID, CFG.EOBlueSteelSet).mainAllAlloy(4f, METAL, T_IRON).temperature(4100).build();
        BRASS_SET = of(BRASS_ID, CFG.EOBrassSet).mainAllAlloy(3f, METAL, T_IRON).temperature(930).tint(() -> 0xFFd1c073).moltenTintable().build();
        BRITANNIA_SILVER_SET = of(BRITANNIA_SILVER_ID, CFG.EOBritanniaSilverSet).mainAllAlloy(3f, METAL, T_IRON).temperature(900).tint(() -> 0xFFdbdbdb).moltenTintable().build();
        BRONZE_SET = of(BRONZE_ID, CFG.EOBronzeSet).mainAllAlloy(3f, METAL, T_IRON).temperature(950).tint(() -> 0xFFcfa866).moltenTintable().build();
        CADMIUM_SET = of(CADMIUM_ID, CFG.EOCadmiumSet).dustAndBlocks(3f, T_IRON).temperature(2000).build();
        CALIFORNIUM_SET = of(CALIFORNIUM_ID, CFG.EOCaliforniumSet).dustAndBlocks(3f, T_DIAMOND).temperature(3250).build();
        CAST_IRON_SET = of(CAST_IRON_ID, CFG.EOCastIronSet).mainAllAlloy(3f, METAL, T_IRON).temperature(1000).tint(() -> 0xFF8192a7).moltenTintable().build();
        CAST_STEEL_SET = of(CAST_STEEL_ID, CFG.EOCastSteelSet).mainAllAlloy(3f, METAL, T_IRON).temperature(1000).tint(() -> 0xFF717877).moltenTintable().build();
        CERIUM_SET = of(CERIUM_ID, CFG.EOCeriumSet).dustAndBlocks(3f, T_DIAMOND).temperature(2000).build();
        CESIUM_SET = of(CESIUM_ID, CFG.EOCesiumSet).alloyWithoutFeatures(3f, METAL, T_DIAMOND).temperature(3150).build();
        CHROMIUM_SET = of(CHROMIUM_ID, CFG.EOChromiumSet).secondaryAllAlloy(3f, METAL, T_DIAMOND).temperature(2150).build();
        CONSTANTAN_SET = of(CONSTANTAN_ID, CFG.EOConstantanSet).mainAllAlloy(3f, METAL, T_IRON).temperature(1220).tint(() -> 0xFFe49138).moltenTintable().build();
        COSMIC_MATTER_SET = of(COSMIC_MATTER_ID, CFG.EOCosmicMatterSet).secondaryAllAlloy(3f, METAL, T_NETHERITE).temperature(21750).build();
        CRYSTALLINE_ALLOY_SET = of(CRYSTALLINE_ALLOY_ID, CFG.EOCrystallineAlloySet).mainAllAlloy(3f, METAL, T_IRON).temperature(2645).build();
        CUPRONICKEL_SET = of(CUPRONICKEL_ID, CFG.EOCupronickelSet).alloyWithoutGearEnriched(2f, METAL, T_IRON).temperature(1600).build();
        ELECTRUM_SET = of(ELECTRUM_ID, CFG.EOElectrumSet).secondaryAllAlloy(3f, METAL, T_IRON).temperature(1000).tint(() -> 0xFFeac66f).moltenTintable().build();
        ENDERIUM_SET = of(ENDERIUM_ID, CFG.EOEnderiumSet).secondaryAllAlloy(4f, METAL, T_IRON).temperature(1450).tint(() -> 0xFF309584).moltenTintable().build();
        ENERGETIC_SILVER_SET = of(ENERGETIC_SILVER_ID, CFG.EOEnergeticSilverSet).mainAllAlloy(3f, METAL, T_IRON).temperature(1850).build();
        ETERNAL_DARK_SET = of(ETERNAL_DARK_ID, CFG.EOEternalDarkSet).secondaryAllAlloy(3f, METAL, T_DIAMOND).temperature(11000).build();
        ETERNAL_LIGHT_SET = of(ETERNAL_LIGHT_ID, CFG.EOEternalLightSet).secondaryAllAlloy(3f, METAL, T_DIAMOND).temperature(11000).build();
        ETERNITY_SET = of(ETERNITY_ID, CFG.EOEternitySet).secondaryAllAlloy(3f, METAL, T_DIAMOND).temperature(21750).build();
        ETHERIUM_SET = of(ETHERIUM_ID, CFG.EOEtheriumSet).secondaryAllAlloy(3f, METAL, T_DIAMOND).temperature(7500).build();
        FRANCIUM_SET = of(FRANCIUM_ID, CFG.EOFranciumSet).alloyWithoutFeatures(3f, METAL, T_DIAMOND).temperature(2350).build();
        GRAPHITE_SET = of(GRAPHITE_ID, CFG.EOGraphiteSet).secondaryAllAlloy(3f, METAL, T_STONE).build();
        GRAVITRONIUM_SET = of(GRAVITRONIUM_ID, CFG.EOGravitroniumSet).secondaryAllAlloy(5f, METAL, T_NETHERITE).temperature(21750).build();
        HAFNIUM_SET = of(HAFNIUM_ID, CFG.EOHafniumSet).mainAllAlloy(3f, METAL, T_DIAMOND).temperature(4250).build();
        HEPATIZON_SET = of(HEPATIZON_ID, CFG.EOHepatizonSet).mainAllAlloy(3f, METAL, T_IRON).temperature(2450).tint(() -> 0xFF9883ae).moltenTintable().build();
        INDIUM_SET = of(INDIUM_ID, CFG.EOIndiumSet).alloyWithoutFeatures(1f, METAL, T_IRON).temperature(2050).build();
        INVAR_SET = of(INVAR_ID, CFG.EOInvarSet).secondaryAllAlloy(3f, METAL, T_IRON).temperature(1420).tint(() -> 0xFFbac1b7).moltenTintable().build();
        KANTHAL_SET = of(KANTHAL_ID, CFG.EOKanthalSet).alloyWithoutGearFoil(3f, METAL, T_IRON).temperature(2100).build();
        LUMIUM_SET = of(LUMIUM_ID, CFG.EOLumiumSet).secondaryAllAlloy(3f, METAL, T_IRON).temperature(1350).tint(() -> 0xFFf7e6a1).moltenTintable().build();
        MAGNESIUM_SET = of(MAGNESIUM_ID, CFG.EOMagnesiumSet).secondaryAllAlloy(3f, METAL, T_STONE).temperature(500).build();
        MANGANESE_SET = of(MANGANESE_ID, CFG.EOManganeseSet).tertiaryAllAlloy(3f, METAL, T_IRON).temperature(1350).build();
        MELODIC_ALLOY_SET = of(MELODIC_ALLOY_ID, CFG.EOMelodicAlloySet).mainAllAlloy(3f, METAL, T_IRON).temperature(2610).build();
        MISSING_SET = of(MISSING_ID, CFG.EOMissingSet).ingot().build();
        MODULARIUM_SET = of(MODULARIUM_ID, CFG.EOModulariumSet).mainAllAlloy(3f, METAL, T_IRON).temperature(1500).tint(() -> 0xFFf94a00).moltenTintable().build();
        NANITE_SET = of(NANITE_ID, CFG.EONaniteSet).mainAllAlloy(6f, METAL, T_NETHERITE).temperature(21750).build();
        NEPTUNIUM_SET = of(NEPTUNIUM_ID, CFG.EONeptuniumSet).alloyWithoutGearEnriched(4f, METAL, T_IRON).temperature(4150).build();
        NETHERSTEEL_SET = of(NETHERSTEEL_ID, CFG.EONethersteelSet).mainAllAlloy(4f, METAL, T_IRON).temperature(3100).build();
        NIOBIUM_SET = of(NIOBIUM_ID, CFG.EONiobiumSet).alloyWithoutFeatures(2f, METAL, T_IRON).temperature(2100).build();
        NOVALLOY_SET = of(NOVALLOY_ID, CFG.EONovalloySet).mainAllAlloy(5f, NETHERITE_BLOCK, T_NETHERITE).temperature(15750).build();
        OSGLOGLAS_SET = of(OSGLOGLAS_ID, CFG.EOsgloglasSet).mainAllAlloy(3f, METAL, T_IRON).temperature(1900).tint(() -> 0xFF64de25).moltenTintable().build();
        PEWTER_SET = of(PEWTER_ID, CFG.EOPewterSet).mainAllAlloy(3f, METAL, T_IRON).temperature(1430).tint(() -> 0xFFa0a9a0).moltenTintable().build();
        PIG_IRON_SET = of(PIG_IRON_ID, CFG.EOPigIronSet).mainAllAlloy(4f, METAL, T_IRON).temperature(1325).tint(() -> 0xFFb69488).moltenTintable().build();
        PLUTONIUM_SET = of(PLUTONIUM_ID, CFG.EOPlutoniumSet).secondaryAllAlloy(4f, METAL, T_DIAMOND).temperature(1800).build();
        QUARTZ_ENRICHED_COPPER_SET = of(QUARTZ_ENRICHED_COPPER_ID, CFG.EOQuartzEnrichedCopperSet).mainAllAlloy(1f, METAL, T_IRON).temperature(1100).tint(() -> 0xFFf4a688).moltenTintable().build();
        QUARTZ_ENRICHED_IRON_SET = of(QUARTZ_ENRICHED_IRON_ID, CFG.EOQuartzEnrichedIronSet).mainAllAlloy(1f, METAL, T_IRON).tint(() -> 0xFFfdf4e8).moltenTintable().temperature(1100).build();
        RED_STEEL_SET = of(RED_STEEL_ID, CFG.EORedSteelSet).mainAllAlloy(3f, METAL, T_IRON).temperature(3100).build();
        RHODIUM_SET = of(RHODIUM_ID, CFG.EORhodiumSet).mainAllAlloy(3f, METAL, T_DIAMOND).temperature(1875).build();
        ROSE_GOLD_SET = of(ROSE_GOLD_ID, CFG.EORoseGoldSet).mainAllAlloy(3f, METAL, T_IRON).temperature(1200).tint(() -> 0xFFf09885).moltenTintable().build();
        RUBIDIUM_SET = of(RUBIDIUM_ID, CFG.EORubidiumSet).alloyWithoutFeatures(3f, METAL, T_DIAMOND).temperature(3040).build();
        RUTHENIUM_SET = of(RUTHENIUM_ID, CFG.EORutheniumSet).mainAllAlloy(3f, METAL, T_DIAMOND).temperature(4100).build();
        SAMARIUM_SET = of(SAMARIUM_ID, CFG.EOSamariumSet).alloyWithoutGearPlateFoil(3f, METAL, T_IRON).temperature(2150).build();
        SHADOWSTEEL_SET = of(SHADOWSTEEL_ID, CFG.EOShadowsteelSet).mainAllAlloy(4f, METAL, T_IRON).temperature(3100).build();
        SIGNALUM_SET = of(SIGNALUM_ID, CFG.EOSignalumSet).secondaryAllAlloy(3f, METAL, T_IRON).temperature(1000).tint(() -> 0xFFd54e27).moltenTintable().build();
        SILICON_SET = of(SILICON_ID, CFG.EOSiliconSet).siliconSet("silicon_ingot", 2f, METAL, T_IRON).temperature(1600).tint(() -> 0xFF6d6aa8).moltenTintable().build();
        STAINLESS_STEEL_SET = of(STAINLESS_STEEL_ID, CFG.EOStainlessSteelSet).mainAllAlloy(3f, METAL, T_DIAMOND).temperature(3100).build();
        STEEL_SET = of(STEEL_ID, CFG.EOSteelSet).mainAllAlloy(3f, METAL, T_IRON).temperature(900).tint(() -> 0xFF7a7a7a).moltenTintable().build();
        STELLARIUM_SET = of(STELLARIUM_ID, CFG.EOStellariumSet).secondaryAllAlloy(3f, METAL, T_DIAMOND).temperature(11500).build();
        STELLAR_ALLOY_SET = of(STELLAR_ALLOY_ID, CFG.EOStellarAlloySet).mainAllAlloy(3f, METAL, T_IRON).temperature(2750).build();
        TANTALUM_SET = of(TANTALUM_ID, CFG.EOTantalumSet).alloyWithoutGearRod(3f, METAL, T_IRON).temperature(2100).build();
        UNIVERSIUM_SET = of(UNIVERSIUM_ID, CFG.EOUniversiumSet).secondaryAllAlloy(3f, METAL, T_NETHERITE).temperature(21500).build();
        UNSTABLE_SET = of(UNSTABLE_STABLE_ID, CFG.EOUnstableIngotSet).unstableIngot(UNSTABLE_ID).temperature(4000).build();
        VIVID_ALLOY_SET = of(VIVID_ALLOY_ID, CFG.EOVividAlloySet).mainAllAlloy(3f, METAL, T_IRON).temperature(3500).build();
        WROUGHT_IRON_SET = of(WROUGHT_IRON_ID, CFG.EOWroughtIronSet).secondaryAllAlloy(3f, METAL, T_IRON).temperature(1000).tint(() -> 0xFFa6a490).moltenTintable().build();
        YTTRIUM_SET = of(YTTRIUM_ID, CFG.EOYttriumSet).alloyWithoutFeatures(3f, METAL, T_DIAMOND).temperature(4200).build();

        ARCANUM_SET = of(ARCANUM_ID, CFG.EOArcanumSet).mainAllGem(5f, METAL, T_DIAMOND).temperature(2400).build();
        CERTUS_QUARTZ_SET = of(CERTUS_QUARTZ_ID, CFG.EOCertusQuartzSet).mainAllGem(2f, METAL, T_STONE).temperature(1200).build();
        FLUIX_SET = of(FLUIX_ID, CFG.EOFluixSet).mainAllGem("fluix_crystal_block", 2f, METAL, T_STONE).temperature(1200).build();
        MORPHITE_SET = of(MORPHITE_ID, CFG.EOMorphiteSet).mainAllGem(4f, METAL, T_DIAMOND).temperature(3300).build();
        PRIMORNIUM_SET = of(PRIMORNIUM_ID, CFG.EOPrimorniumSet).mainAllGem(6f, METAL, T_NETHERITE).temperature(8150).build();
        QUANTIQUARITE_SET = of(QUANTIQUARITE_ID, CFG.EOQuantiquariteSet).mainAllGem(4f, METAL, T_DIAMOND).temperature(8150).build();
        SANGUIS_VIVUS_SET = of(SANGUIS_VIVUS_ID, CFG.EOSanguisVivusSet).mainAllGem(3f, METAL, T_DIAMOND).temperature(10500).build();
        SOURCE_SET = of(SOURCE_ID, CFG.EOSourceSet).mainAllGem(1f, METAL, T_STONE).temperature(1500).build();
        SPECTRAL_SKY_BLUERITE_SET = of(SPECTRAL_SKY_BLUERITE_ID, CFG.EOSpectralSkyBlueriteSet).mainAllGem(4f, METAL, T_IRON).temperature(2100).build();
        TACHYARITE_SET = of(TACHYARITE_ID, CFG.EOTachyariteSet).mainAllGem(4f, METAL, T_IRON).temperature(5200).build();
        TEMICTETL_SET = of(TEMICTETL_ID, CFG.EOTemictetlSet).mainAllGem(3f, METAL, T_DIAMOND).temperature(7200).build();
        VOIDERITE_SET = of(VOIDERITE_ID, CFG.EOVoideriteSet).mainAllGem(4f, METAL, T_IRON).temperature(5100).build();

        BIOMASS_SET = of(BIOMASS_ID, CFG.EOBiomassSet).item(1f, SAND, T_WOOD).build();
        CALCIUM_SET = of(CALCIUM_ID, CFG.EOCalciumSet).dustAndBlocks(3f, T_WOOD).build();
        DUST_SET = of(DUST_ID, CFG.EODustSet).dustAndBlocks(DUST_ID, 1f, T_WOOD).build();
        SELENIUM_SET = of(SELENIUM_ID, CFG.EOSeleniumSet).dustAndBlocks(3f, T_DIAMOND).build();
        PHOSPHORUS_SET = of(PHOSPHORUS_ID, CFG.EOPhosphorusSet).dustAndBlocks(1f, T_STONE).build();
        RARE_EARTH_SET = of(RARE_EARTH_ID, CFG.EORareEarthSet).dustAndBlocks(1f, T_IRON).build();

        ANTIMATTER_SET = of(ANTIMATTER_ID, CFG.EOAntimatterSet).matters(3f, METAL, T_NETHERITE).temperature(27000).build();
        EXOTIC_MATTER_SET = of(EXOTIC_MATTER_ID, CFG.EOExoticMatterSet).matters(3f, METAL, T_NETHERITE).temperature(27000).build();
        STRANGE_MATTER_SET = of(STRANGE_MATTER_ID, CFG.EOStrangeMatterSet).matters(3f, METAL, T_NETHERITE).temperature(27000).build();

        SHADOW_BLEND_SET = of(SHADOW_BLEND_ID, CFG.EOShadowBlendSet).mainBlend(2f, T_DIAMOND).build();
        CARBON_BLEND_SET = of(CARBON_BLEND_ID, CFG.EOCarbonBlend).carbonBlend().build();
        LE_CARBON_BLEND_SET = of(LE_CARBON_BLEND_ID, CFG.EOLCarbonBlend).secondaryBlend("low_enriched_carbon", 2f, T_IRON).build();
        HE_CARBON_BLEND_SET = of(HE_CARBON_BLEND_ID, CFG.EOHCarbonBlend).secondaryBlend("highly_enriched_carbon", 3f, T_DIAMOND).build();
        NETHER_BLEND_SET = of(NETHER_BLEND_ID, CFG.EONetherBlendSet).mainBlend(3f, T_IRON).build();
        ENERGETIC_BLEND_SET = of(ENERGETIC_BLEND_ID, CFG.EOEnergeticBlendSet).mainBlend(2f, T_IRON).build();
        ENDERGETIC_BLEND_SET = of(ENDERGETIC_BLEND_ID, CFG.EOEndergeticSet).mainBlend(2f, T_IRON).build();
        BIO_BLEND_SET = of(BIO_BLEND_ID, CFG.EOBioBlendSet).mainBlend(2f, T_IRON).build();

        // fluids
        LIQUID_AIR_SET = of(LIQUID_AIR_ID).tint(() -> 0xFF9ffffd).fluidTintable(false).build();
        HEAVY_WATER_SET = of(HEAVY_WATER_ID).tint(() -> 0xFF222b4e).fluidTintable(false).build();
        BRINE_SET = of(BRINE_ID).tint(() -> 0xFFf4d888).fluidTintable(false).build();
        DISTILLED_WATER_SET = of(DISTILLED_WATER_ID).tint(() -> 0xFF9fffec).fluidTintable(false).build();
        DIONIZED_WATER_SET = of(DIONIZED_WATER_ID).tint(() -> 0xFF8aeeff).fluidTintable(false).build();
        AMMONIA_SOLUTION_SET = of(AMMONIA_SOLUTION_ID).tint(() -> 0xFF626bb4).fluidTintable(false).build();

        ACETONE_SET = of(ACETONE_ID).tint(() -> 0xFFd0d0d0).fluidTintable(false).build();
        METHANOL_SET = of(METHANOL_ID).tint(() -> 0xFFd59659).fluidTintable(false).build();
        ETHANOL_SET = of(ETHANOL_ID).tint(() -> 0xFFff552c).fluidTintable(false).build();
        BENZENE_SET = of(BENZENE_ID).tint(() -> 0xFF2e2e2e).fluidTintable(false).build();
        TOLUENE_SET = of(TOLUENE_ID).tint(() -> 0xFFbd482b).fluidTintable(false).build();
        XYLENE_SET = of(XYLENE_ID).tint(() -> 0xFFd9ede4).fluidTintable(false).build();
        HEXANE_SET = of(HEXANE_ID).tint(() -> 0xFFf4be46).fluidTintable(false).build();
        HYDROGEN_PEROXIDE_SET = of(HYDROGEN_PEROXIDE_ID).tint(() -> 0xFF77e6f2).fluidTintable(false).build();
        PHENOL_SET = of(PHENOL_ID).tint(() -> 0xFF733312).fluidTintable(false).build();
        GLYCEROL_SET = of(GLYCEROL_ID).tint(() -> 0xFF56de94).fluidTintable(false).build();

        PLANT_OIL_SET = of(PLANT_OIL_ID).tint(() -> 0xFF9abd7b).fluidTintable(false).build();
        RESIN_SET = of(RESIN_ID).tint(() -> 0xFFdeb352).fluidTintable(false).build();
        RUBBER_SET = of(RUBBER_ID).tint(() -> 0xFF595959).fluidTintable(false).build();

        EXPERIENCE_SET = of(EXPERIENCE_ID).fluidCustomTexture(EXPERIENCE_ID, false).build();
        BLOOD_SET = of(BLOOD_ID).fluidCustomTexture(BLOOD_ID, false).build();
        HONEY_SET = of(HONEY_ID).fluidCustomTexture(HONEY_ID, false).build();

        LUBRICANT_SET = of(LUBRICANT_ID).tint(() -> 0xFFffc93d).fluidTintable(false).build();
        CREOSOTE_SET = of(CREOSOTE_ID).tint(() -> 0xFFa07f65).fluidTintable(false).build();
        BIODIESEL_SET = of(BIODIESEL_ID).tint(() -> 0xFF876149).fluidTintable(false).build();
        DIESEL_SET = of(DIESEL_ID).tint(() -> 0xFFc5de1d).fluidTintable(false).build();

        OIL_SET = of(OIL_ID).tint(() -> 0xFF101010).fluidTintable(false).build();
        BITUMEN_SET = of(BITUMEN_ID).tint(() -> 0xFF595959).fluidTintable(false).build();
        FUEL_OIL_SET = of(FUEL_OIL_ID).tint(() -> 0xFF7f8559).fluidTintable(false).build();
        NAPHTHA_SET = of(NAPHTHA_ID).tint(() -> 0xFFe0d20f).fluidTintable(false).build();
        KEROSENE_SET = of(KEROSENE_ID).tint(() -> 0xFFd59e25).fluidTintable(false).build();

        ETHYLENE_SET = of(ETHYLENE_ID).tint(() -> 0xFF999999).fluidTintable(false).build();
        PENTANE_SET = of(PENTANE_ID).tint(() -> 0xFFa99b89).fluidTintable(false).build();
        HEPTANE_SET = of(HEPTANE_ID).tint(() -> 0xFFad9170).fluidTintable(false).build();
        OCTANE_SET = of(OCTANE_ID).tint(() -> 0xFFaf2200).fluidTintable(false).build();
        CYCLOHEXANE_SET = of(CYCLOHEXANE_ID).tint(() -> 0xFFe9ac02).fluidTintable(false).build();

        END_PORTAL_FLUID_SET = of(END_PORTAL_FLUID_ID).fluidCustomTexture(END_PORTAL_FLUID_ID, true).build();
        NETHER_PORTAL_FLUID_SET = of(NETHER_PORTAL_FLUID_ID).fluidCustomTexture(NETHER_PORTAL_FLUID_ID, true).build();

        // chemicals
        HYDROCHLORIC_ACID_SET = of(HYDROCHLORIC_ACID_ID).tint(() -> 0xFFdef2f2).chemicalTintable(true).build();
        SULFURIC_ACID_SET = of(SULFURIC_ACID_ID).tint(() -> 0xFFff4b00).chemicalTintable(true).build();
        NITRIC_ACID_SET = of(NITRIC_ACID_ID).tint(() -> 0xFFffcf47).chemicalTintable(true).build();
        HYDROFLUORIC_ACID_SET = of(HYDROFLUORIC_ACID_ID).tint(() -> 0xFF57abe2).chemicalTintable(true).build();
        ACETIC_ACID_SET = of(ACETIC_ACID_ID).tint(() -> 0xFFc7a57d).chemicalTintable(true).build();
        PHOSPHORIC_ACID_SET = of(PHOSPHORIC_ACID_ID).tint(() -> 0xFFeeff2e).chemicalTintable(true).build();

        // gases
        HYDROGEN_SET = of(HYDROGEN_ID).tint(() -> 0xFF3e80d1).gasTintable(false).build();
        STEAM_SET = of(STEAM_ID).tint(() -> 0xFFf4f2ec).gasTintable(true).build();
        OXYGEN_SET = of(OXYGEN_ID).tint(() -> 0xFF46def2).gasTintable(false).build();
        NITROGEN_SET = of(NITROGEN_ID).tint(() -> 0xFF3eb4a0).gasTintable(true).build();
        CHLORINE_SET = of(CHLORINE_ID).tint(() -> 0xFF3fc1b4).gasTintable(true).build();
        FLUORINE_SET = of(FLUORINE_ID).tint(() -> 0xFF9be9d1).gasTintable(true).build();
        HELIUM_SET = of(HELIUM_ID).tint(() -> 0xFFfeff4e).gasTintable(true).build();
        CARBON_DIOXIDE_SET = of(CARBON_DIOXIDE_ID).tint(() -> 0xFF737373).gasTintable(true).build();
        SULFUR_DIOXIDE_SET = of(SULFUR_DIOXIDE_ID).tint(() -> 0xFFe09c06).gasTintable(true).build();
        AMMONIA_SET = of(AMMONIA_ID).tint(() -> 0xFF626bb4).gasTintable(true).build();
        NEON_SET = of(NEON_ID).tint(() -> 0xFF5d3df0).gasTintable(true).build();
        ARGON_SET = of(ARGON_ID).tint(() -> 0xFF00eb0f).gasTintable(true).build();
        KRYPTON_SET = of(KRYPTON_ID).tint(() -> 0xFF00fd04).gasTintable(true).build();
        XENON_SET = of(XENON_ID).tint(() -> 0xFF21ef94).gasTintable(true).build();
        RADON_SET = of(RADON_ID).tint(() -> 0xFFeb0087).gasTintable(true).build();
        METHANE_SET = of(METHANE_ID).tint(() -> 0xFFe9ac02).gasTintable(true).build();
        HYDROGEN_SULFIDE_SET = of(HYDROGEN_SULFIDE_ID).tint(() -> 0xFFe44300).gasTintable(true).build();
        HYDROGEN_CHLORIDE_SET = of(HYDROGEN_CHLORIDE_ID).tint(() -> 0xFF4b3ced).gasTintable(true).build();
        NITRIC_OXIDE_SET = of(NITRIC_OXIDE_ID).tint(() -> 0xFF86c2db).gasTintable(true).build();
        PHOSPHINE_SET = of(PHOSPHINE_ID).tint(() -> 0xFFdc7a1b).gasTintable(true).build();
        SULFUR_HEXAFLUORIDE_SET = of(SULFUR_HEXAFLUORIDE_ID).tint(() -> 0xFFdb6244).gasTintable(true).build();
        CHLORINE_DIOXIDE_SET = of(CHLORINE_DIOXIDE_ID).tint(() -> 0xFF62948f).gasTintable(true).build();
        OZONE_SET = of(OZONE_ID).tint(() -> 0xFF86f0e6).gasTintable(true).build();
        NITROUS_OXIDE_SET = of(NITROUS_OXIDE_ID).tint(() -> 0xFF65d5f0).gasTintable(true).build();
    }

    public static void rgtr(IEventBus bus) {
        EO_ITEMS.register(bus);
        EO_BLOCKS.register(bus);
        EO_FLUID_TYPES.register(bus);
        EO_FLUIDS.register(bus);
        bus.addListener(EOSetRegistries::rgtrCapabilities);
    }

    private static void rgtrCapabilities(RegisterCapabilitiesEvent event) {
        allItemEntries()
                .filter(e -> e.get() instanceof EOFluidBucketItem)
                .forEach(e -> event.registerItem(
                        Capabilities.FluidHandler.ITEM,
                        (stack, ctx) -> new FluidBucketWrapper(stack),
                        e.get())
                );
    }
}
