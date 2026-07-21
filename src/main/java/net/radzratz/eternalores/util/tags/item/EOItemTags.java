package net.radzratz.eternalores.util.tags.item;

import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.tags.EOTagIds.*;

// delete this if you want to see at least 300+ warns LMAO
@SuppressWarnings("all")
public class EOItemTags {
    public static class Common {
        public static final TagKey<Item> MUSHROOM_BLOCKS = crteCGeneralTag("mushroom_blocks");
        public static final TagKey<Item> RAW_POLYMER = crteCGeneralTag("raw_biopolymer");
    }

    public static class Compat {
        public static final TagKey<Item> PRESS_MOLDS = crteEPTag("metal_press/press_molds");
        public static final TagKey<Item> ETERNAL_BLACKLIST = crteFAModifierTag("eternal_incompatible");
        public static final TagKey<Item> STONE_REPLACEABLES_ITEM = crteEOGeneralTag("stone_replaceables");
        public static final TagKey<Item> SLATE_REPLACEABLES_ITEM = crteEOGeneralTag("slate_replaceables");
        public static final TagKey<Item> GEO_BUDDING_BLOCKS_ITEM = crteGeOreBuddingTag();
        public static final TagKey<Item> CREATE_CRUSHED_RAW_MATERIALS = crteCreateTag("crushed_raw_materials");
        public static final TagKey<Item> MEK_ENRICHED = crteMekEnriched("enriched");

        private static TagKey<Item> crteEPTag(String name) {
            return ItemTags.create(EP(name));
        }

        public static TagKey<Item> crteFAModifierTag(String path) {
            return ItemTags.create(FA("modifier/" + path));
        }

        private static TagKey<Item> crteGeOreBuddingTag() {
            return ItemTags.create(GEO("geore_budding"));
        }

        private static TagKey<Item> crteCreateTag(String path) {
            return ItemTags.create(CTE(path));
        }

        private static TagKey<Item> crteMekEnriched(String path) {
            return ItemTags.create(MEK(path));
        }
    }

    public static class Tools {
        public static final TagKey<Item> COBALT_HAMMER = crteToolC("hammers/cobalt");
        public static final TagKey<Item> COPPER_HAMMER = crteToolC("hammers/copper");
        public static final TagKey<Item> DIAMOND_HAMMER = crteToolC("hammers/diamond");
        public static final TagKey<Item> IRON_HAMMER = crteToolC("hammers/iron");
        public static final TagKey<Item> STONE_HAMMER = crteToolC("hammers/stone");

        public static final TagKey<Item> IRON_GEM_CUTTER = crteToolC("gem_cutter/iron");

        public static final TagKey<Item> COBALT_WIRE_CUTTER = crteToolC("wire_cutter/cobalt");
        public static final TagKey<Item> COPPER_WIRE_CUTTER = crteToolC("wire_cutter/copper");
        public static final TagKey<Item> DIAMOND_WIRE_CUTTER = crteToolC("wire_cutter/diamond");
        public static final TagKey<Item> GOLD_WIRE_CUTTER = crteToolC("wire_cutter/gold");
        public static final TagKey<Item> IRON_WIRE_CUTTER = crteToolC("wire_cutter/iron");

        public static final TagKey<Item> BASIC_PROSPECTOR = crteToolC("prospectors/basic_prospector");
        public static final TagKey<Item> ADVANCED_PROSPECTOR = crteToolC("prospectors/advanced_prospector");

        public static final TagKey<Item> PLATE_MOLD = crteToolC("molds/plate");
        public static final TagKey<Item> ROD_MOLD = crteToolC("molds/rod");
        public static final TagKey<Item> GEAR_MOLD = crteToolC("molds/gear");
        public static final TagKey<Item> FOIL_MOLD = crteToolC("molds/foil");
        public static final TagKey<Item> WIRE_MOLD = crteToolC("molds/wire");

        public static final TagKey<Item> HAMMERS = crteToolC("crushing_hammers");
        public static final TagKey<Item> GEM_CUTTERS = crteToolC("gem_cutters");
        public static final TagKey<Item> WIRE_CUTTERS = crteToolC("wire_cutters");
        public static final TagKey<Item> PROSPECTORS = crteToolC("prospectors");
        public static final TagKey<Item> MOLDS = crteToolC("molds");

        private static TagKey<Item> crteToolC(String path) {
            return ItemTags.create(C("tools/" + path));
        }
    }

    public static class Items {
        public static final TagKey<Item> SALT = crteCGeneralTag("salt");
        public static final TagKey<Item> SCULKS = crteCGeneralTag("sculk");
        public static final TagKey<Item> SILICON = crteCGeneralTag("silicon");
        public static final TagKey<Item> BISMUTH = crteCGeneralTag("bismuth");
    }

    public static class Fuels {
        public static final TagKey<Item> FUELS_BIO = crteFuelTagC("bio");

        private static TagKey<Item> crteFuelTagC(String path) {
            return ItemTags.create(C(fuelTag + path));
        }
    }

    public static class Ingots {
        public static final TagKey<Item> INGOTS_ALUMINUM = crteIngotTagC("aluminum");
        public static final TagKey<Item> INGOTS_ARDITE = crteIngotTagC("ardite");
        public static final TagKey<Item> INGOTS_AURORIUM = crteIngotTagC("aurorium");
        public static final TagKey<Item> INGOTS_BERYLLIUM = crteIngotTagC("beryllium");
        public static final TagKey<Item> INGOTS_BIOSTEEL = crteIngotTagC("biosteel");
        public static final TagKey<Item> INGOTS_BLACK_STEEL = crteIngotTagC("black_steel");
        public static final TagKey<Item> INGOTS_BLUE_STEEL = crteIngotTagC("blue_steel");
        public static final TagKey<Item> INGOTS_BRASS = crteIngotTagC("brass");
        public static final TagKey<Item> INGOTS_BRITANNIA_SILVER = crteIngotTagC("britannia_silver");
        public static final TagKey<Item> INGOTS_BRONZE = crteIngotTagC("bronze");
        public static final TagKey<Item> INGOTS_CAST_IRON = crteIngotTagC("cast_iron");
        public static final TagKey<Item> INGOTS_CAST_STEEL = crteIngotTagC("cast_steel");
        public static final TagKey<Item> INGOTS_CATALYRIUM = crteIngotTagC("catalyrium");
        public static final TagKey<Item> INGOTS_CHROMIUM = crteIngotTagC("chromium");
        public static final TagKey<Item> INGOTS_COBALT = crteIngotTagC("cobalt");
        public static final TagKey<Item> INGOTS_CONSTANTAN = crteIngotTagC("constantan");
        public static final TagKey<Item> INGOTS_COSMIC_MATTER = crteIngotTagC("cosmic_matter");
        public static final TagKey<Item> INGOTS_ELECTRUM = crteIngotTagC("electrum");
        public static final TagKey<Item> INGOTS_ENDERIUM = crteIngotTagC("enderium");
        public static final TagKey<Item> INGOTS_ETERNAL_DARK = crteIngotTagC("eternal_dark");
        public static final TagKey<Item> INGOTS_ETERNAL_LIGHT = crteIngotTagC("eternal_light");
        public static final TagKey<Item> INGOTS_ETERNITY = crteIngotTagC("eternity");
        public static final TagKey<Item> INGOTS_ETHERIUM = crteIngotTagC("etherium");
        public static final TagKey<Item> INGOTS_GALLIUM = crteIngotTagC("gallium");
        public static final TagKey<Item> INGOTS_GRAPHITE = crteIngotTagC("graphite");
        public static final TagKey<Item> INGOTS_INVAR = crteIngotTagC("invar");
        public static final TagKey<Item> INGOTS_IRIDIUM = crteIngotTagC("iridium");
        public static final TagKey<Item> INGOTS_LEAD = crteIngotTagC("lead");
        public static final TagKey<Item> INGOTS_LUMIUM = crteIngotTagC("lumium");
        public static final TagKey<Item> INGOTS_MISSING = crteIngotTagC("missing");
        public static final TagKey<Item> INGOTS_NICKEL = crteIngotTagC("nickel");
        public static final TagKey<Item> INGOTS_OSMIUM = crteIngotTagC("osmium");
        public static final TagKey<Item> INGOTS_PEWTER = crteIngotTagC("pewter");
        public static final TagKey<Item> INGOTS_PIG_IRON = crteIngotTagC("pig_iron");
        public static final TagKey<Item> INGOTS_PLATINUM = crteIngotTagC("platinum");
        public static final TagKey<Item> INGOTS_PLUTONIUM = crteIngotTagC("plutonium");
        public static final TagKey<Item> INGOTS_QUARTZ_ENRICHED_COPPER = crteIngotTagC("quartz_enriched_copper");
        public static final TagKey<Item> INGOTS_QUARTZ_ENRICHED_IRON = crteIngotTagC("quartz_enriched_iron");
        public static final TagKey<Item> INGOTS_REDSTONE = crteIngotTagC("redstone");
        public static final TagKey<Item> INGOTS_ROSE_GOLD = crteIngotTagC("rose_gold");
        public static final TagKey<Item> INGOTS_SCULKITE = crteIngotTagC("sculkite");
        public static final TagKey<Item> INGOTS_SHADOWSTEEL = crteIngotTagC("shadowsteel");
        public static final TagKey<Item> INGOTS_SIGNALUM = crteIngotTagC("signalum");
        public static final TagKey<Item> INGOTS_SILICON = crteIngotTagC("silicon");
        public static final TagKey<Item> INGOTS_SILVER = crteIngotTagC("silver");
        public static final TagKey<Item> INGOTS_STEEL = crteIngotTagC("steel");
        public static final TagKey<Item> INGOTS_STELLARIUM = crteIngotTagC("stellarium");
        public static final TagKey<Item> INGOTS_TIN = crteIngotTagC("tin");
        public static final TagKey<Item> INGOTS_TITANIUM = crteIngotTagC("titanium");
        public static final TagKey<Item> INGOTS_TUNGSTEN = crteIngotTagC("tungsten");
        public static final TagKey<Item> INGOTS_ULTIMATITANIUM = crteIngotTagC("ultimatitanium");
        public static final TagKey<Item> INGOTS_UNIVERSIUM = crteIngotTagC("universium");
        public static final TagKey<Item> INGOTS_URANINITE = crteIngotTagC("uraninite");
        public static final TagKey<Item> INGOTS_URANIUM = crteIngotTagC("uranium");
        public static final TagKey<Item> INGOTS_WROUGHT_IRON = crteIngotTagC("wrought_iron");
        public static final TagKey<Item> INGOTS_ZINC = crteIngotTagC("zinc");

        private static TagKey<Item> crteIngotTagC(String path) {
            return ItemTags.create(C(ingotTag + path));
        }
    }

    public static class Gems {
        public static final TagKey<Item> GEMS_AMBER = crteGemTagC("amber");
        public static final TagKey<Item> GEMS_APATITE = crteGemTagC("apatite");
        public static final TagKey<Item> GEMS_CINNABAR = crteGemTagC("cinnabar");
        public static final TagKey<Item> GEMS_FLUORITE = crteGemTagC("fluorite");
        public static final TagKey<Item> GEMS_NECROTICARITE = crteGemTagC("necroticarite");
        public static final TagKey<Item> GEMS_NITER = crteGemTagC("niter");
        public static final TagKey<Item> GEMS_OBSIDIAN = crteGemTagC("obsidian");
        public static final TagKey<Item> GEMS_ONYX = crteGemTagC("onyx");
        public static final TagKey<Item> GEMS_PERIDOT = crteGemTagC("peridot");
        public static final TagKey<Item> GEMS_RUBY = crteGemTagC("ruby");
        public static final TagKey<Item> GEMS_SAPPHIRE = crteGemTagC("sapphire");
        public static final TagKey<Item> GEMS_QUANTIQUARITE = crteGemTagC("quantiquarite");
        public static final TagKey<Item> GEMS_TACHYARITE = crteGemTagC("tachyarite");
        public static final TagKey<Item> GEMS_VOIDERITE = crteGemTagC("voiderite");

        private static TagKey<Item> crteGemTagC(String path) {
            return ItemTags.create(C(gemTag + path));
        }
    }

    public static class Dusts {
        public static final TagKey<Item> DUSTS_ALUMINUM = crteDustTags("aluminum");
        public static final TagKey<Item> DUSTS_AMBER = crteDustTags("amber");
        public static final TagKey<Item> DUSTS_AMETHYST = crteDustTags("amethyst");
        public static final TagKey<Item> DUSTS_ANDESITE = crteDustTags("andesite");
        public static final TagKey<Item> DUSTS_ANTHRACITE = crteDustTags("anthracite_coal");
        public static final TagKey<Item> DUSTS_APATITE = crteDustTags("apatite");
        public static final TagKey<Item> DUSTS_ARDITE = crteDustTags("ardite");
        public static final TagKey<Item> DUSTS_BASALT = crteDustTags("basalt");
        public static final TagKey<Item> DUSTS_BITUMINOUS = crteDustTags("bituminous_coal");
        public static final TagKey<Item> DUSTS_BIOSTEEL = crteDustTags("biosteel");
        public static final TagKey<Item> DUSTS_BLACKSTONE = crteDustTags("blackstone");
        public static final TagKey<Item> DUSTS_BLAZE = crteDustTags("blaze");
        public static final TagKey<Item> DUSTS_BLUE_STEEL = crteDustTags("blue_steel");
        public static final TagKey<Item> DUSTS_BONE = crteDustTags("bone");
        public static final TagKey<Item> DUSTS_BRASS = crteDustTags("brass");
        public static final TagKey<Item> DUSTS_BRICK = crteDustTags("brick");
        public static final TagKey<Item> DUSTS_BRITANNIA_SILVER = crteDustTags("britannia_silver");
        public static final TagKey<Item> DUSTS_BRONZE = crteDustTags("bronze");
        public static final TagKey<Item> DUSTS_CALCITE = crteDustTags("calcite");
        public static final TagKey<Item> DUSTS_CALCIUM = crteDustTags("calcium");
        public static final TagKey<Item> DUSTS_CAST_IRON = crteDustTags("cast_iron");
        public static final TagKey<Item> DUSTS_CAST_STEEL = crteDustTags("cast_steel");
        public static final TagKey<Item> DUSTS_CATALYRIUM = crteDustTags("catalyrium");
        public static final TagKey<Item> DUSTS_CHARCOAL = crteDustTags("charcoal");
        public static final TagKey<Item> DUSTS_CINNABAR = crteDustTags("cinnabar");
        public static final TagKey<Item> DUSTS_CLAY = crteDustTags("clay");
        public static final TagKey<Item> DUSTS_COAL = crteDustTags("coal");
        public static final TagKey<Item> DUSTS_COBALT = crteDustTags("cobalt");
        public static final TagKey<Item> DUSTS_COKE = crteDustTags("coal_coke");
        public static final TagKey<Item> DUSTS_CONCRETE = crteDustTags("concrete");
        public static final TagKey<Item> DUSTS_CONSTANTAN = crteDustTags("constantan");
        public static final TagKey<Item> DUSTS_COPPER = crteDustTags("copper");
        public static final TagKey<Item> DUSTS_CORAL = crteDustTags("coral");
        public static final TagKey<Item> DUSTS_DEEPSLATE = crteDustTags("deepslate");
        public static final TagKey<Item> DUSTS_DIAMOND = crteDustTags("diamond");
        public static final TagKey<Item> DUSTS_DIORITE = crteDustTags("diorite");
        public static final TagKey<Item> DUSTS_DRIPSTONE = crteDustTags("dripstone");
        public static final TagKey<Item> DUSTS_DUST = crteDustTags("dust");
        public static final TagKey<Item> DUSTS_ELECTRUM = crteDustTags("electrum");
        public static final TagKey<Item> DUSTS_EMERALD = crteDustTags("emerald");
        public static final TagKey<Item> DUSTS_ENDER = crteDustTags("ender_pearl");
        public static final TagKey<Item> DUSTS_ENDERIUM = crteDustTags("enderium");
        public static final TagKey<Item> DUSTS_ENDSTONE = crteDustTags("end_stone");
        public static final TagKey<Item> DUSTS_FLINT = crteDustTags("flint");
        public static final TagKey<Item> DUSTS_FLUORITE = crteDustTags("fluorite");
        public static final TagKey<Item> DUSTS_GALLIUM = crteDustTags("gallium");
        public static final TagKey<Item> DUSTS_GLASS = crteDustTags("glass");
        public static final TagKey<Item> DUSTS_GOLD = crteDustTags("gold");
        public static final TagKey<Item> DUSTS_GRAPHITE = crteDustTags("graphite");
        public static final TagKey<Item> DUSTS_GRANITE = crteDustTags("granite");
        public static final TagKey<Item> DUSTS_GRAVEL = crteDustTags("gravel");
        public static final TagKey<Item> DUSTS_INVAR = crteDustTags("invar");
        public static final TagKey<Item> DUSTS_IRIDIUM = crteDustTags("iridium");
        public static final TagKey<Item> DUSTS_IRON = crteDustTags("iron");
        public static final TagKey<Item> DUSTS_LAPIS = crteDustTags("lapis");
        public static final TagKey<Item> DUSTS_LEAD = crteDustTags("lead");
        public static final TagKey<Item> DUSTS_LIGNITE = crteDustTags("lignite_coal");
        public static final TagKey<Item> DUSTS_LUMIUM = crteDustTags("lumium");
        public static final TagKey<Item> DUSTS_MOSSY_STONE = crteDustTags("mossy_stone");
        public static final TagKey<Item> DUSTS_NAUTILUS = crteDustTags("nautilus");
        public static final TagKey<Item> DUSTS_NECROTICARITE = crteDustTags("necroticarite");
        public static final TagKey<Item> DUSTS_NETHERITE = crteDustTags("netherite");
        public static final TagKey<Item> DUSTS_NETHERRACK = crteDustTags("netherrack");
        public static final TagKey<Item> DUSTS_NETHER_BRICK = crteDustTags("nether_brick");
        public static final TagKey<Item> DUSTS_NETHER_STAR = crteDustTags("nether_star");
        public static final TagKey<Item> DUSTS_NETHER_WART = crteDustTags("nether_wart");
        public static final TagKey<Item> DUSTS_NETHERSTEEL = crteDustTags("nethersteel");
        public static final TagKey<Item> DUSTS_NICKEL = crteDustTags("nickel");
        public static final TagKey<Item> DUSTS_NITER = crteDustTags("niter");
        public static final TagKey<Item> DUSTS_OBSIDIAN = crteDustTags("obsidian");
        public static final TagKey<Item> DUSTS_ONYX = crteDustTags("onyx");
        public static final TagKey<Item> DUSTS_OSMIUM = crteDustTags("osmium");
        public static final TagKey<Item> DUSTS_PEAT = crteDustTags("peat_coal");
        public static final TagKey<Item> DUSTS_PERIDOT = crteDustTags("peridot");
        public static final TagKey<Item> DUSTS_PEWTER = crteDustTags("pewter");
        public static final TagKey<Item> DUSTS_PIG_IRON = crteDustTags("pig_iron");
        public static final TagKey<Item> DUSTS_PHOSPHORUS = crteDustTags("phosphorus");
        public static final TagKey<Item> DUSTS_PLATINUM = crteDustTags("platinum");
        public static final TagKey<Item> DUSTS_PRISMARINE = crteDustTags("prismarine");
        public static final TagKey<Item> DUSTS_PURPUR = crteDustTags("purpur");
        public static final TagKey<Item> DUSTS_QUANTIQUARITE = crteDustTags("quantiquarite");
        public static final TagKey<Item> DUSTS_QUARTZ = crteDustTags("quartz");
        public static final TagKey<Item> DUSTS_RED_SAND = crteDustTags("red_sand");
        public static final TagKey<Item> DUSTS_ROSE_GOLD = crteDustTags("rose_gold");
        public static final TagKey<Item> DUSTS_RUBY = crteDustTags("ruby");
        public static final TagKey<Item> DUSTS_SALTPETER = crteDustTags("saltpeter");
        public static final TagKey<Item> DUSTS_SAND = crteDustTags("sand");
        public static final TagKey<Item> DUSTS_SAPPHIRE = crteDustTags("sapphire");
        public static final TagKey<Item> DUSTS_SCULK = crteDustTags("sculk");
        public static final TagKey<Item> DUSTS_SHADOWSTEEL = crteDustTags("shadowsteel");
        public static final TagKey<Item> DUSTS_SHULKER = crteDustTags("shulker_shell");
        public static final TagKey<Item> DUSTS_SIGNALUM = crteDustTags("signalum");
        public static final TagKey<Item> DUSTS_SILICON = crteDustTags("silicon");
        public static final TagKey<Item> DUSTS_SILVER = crteDustTags("silver");
        public static final TagKey<Item> DUSTS_SOUL_SAND = crteDustTags("soul_sand");
        public static final TagKey<Item> DUSTS_STEEL = crteDustTags("steel");
        public static final TagKey<Item> DUSTS_STONES = crteDustTags("stones");
        public static final TagKey<Item> DUSTS_SULFUR = crteDustTags("sulfur");
        public static final TagKey<Item> DUSTS_TACHYARITE = crteDustTags("tachyarite");
        public static final TagKey<Item> DUSTS_TIN = crteDustTags("tin");
        public static final TagKey<Item> DUSTS_TITANIUM = crteDustTags("titanium");
        public static final TagKey<Item> DUSTS_TUFF = crteDustTags("tuff");
        public static final TagKey<Item> DUSTS_TUNGSTEN = crteDustTags("tungsten");
        public static final TagKey<Item> DUSTS_ULTIMATITANIUM = crteDustTags("ultimatitanium");
        public static final TagKey<Item> DUSTS_URANINITE = crteDustTags("uraninite");
        public static final TagKey<Item> DUSTS_URANIUM = crteDustTags("uranium");
        public static final TagKey<Item> DUSTS_VOIDERITE = crteDustTags("voiderite");
        public static final TagKey<Item> DUSTS_WARPED_NETHER_WART = crteDustTags("warped_nether_wart");
        public static final TagKey<Item> DUSTS_WOOD = crteDustTags("wood");
        public static final TagKey<Item> DUSTS_WROUGHT_IRON = crteDustTags("wrought_iron");
        public static final TagKey<Item> DUSTS_ZINC = crteDustTags("zinc");

        // Tags to Remove
        public static final TagKey<Item> DUSTS_SAWDUST_R = crteDustTags("sawdust");
        public static final TagKey<Item> DUSTS_COKE_R = crteDustTags("coke");
        public static final TagKey<Item> DUSTS_COKE_COAL_R = crteDustTags("coke_coal");
        public static final TagKey<Item> DUSTS_ENDSTONE_R = crteDustTags("endstone");

        private static TagKey<Item> crteDustTags(String path) {
            return ItemTags.create(C(dustTag + path));
        }
    }

    public static class Blends {
        public static final TagKey<Item> BLENDS = crteCGeneralTag("blends");

        public static final TagKey<Item> BLENDS_CARBON = crteBlendTags("carbon");
        public static final TagKey<Item> BLENDS_ENERGETIC = crteBlendTags("energetic");
        public static final TagKey<Item> BLENDS_ENDERGETIC = crteBlendTags("endergetic");
        public static final TagKey<Item> BLENDS_NETHER_ENRICHED = crteBlendTags("nether");
        public static final TagKey<Item> BLENDS_CARBON_ENRICHED = crteBlendTags("highly_enriched_carbon");
        public static final TagKey<Item> BLENDS_LOW_CARBON = crteBlendTags("low_enriched_carbon");
        public static final TagKey<Item> BLENDS_SHADOW = crteBlendTags("shadow");
        public static final TagKey<Item> BLENDS_SILICON = crteBlendTags("silicon");

        private static TagKey<Item> crteBlendTags(String path) {
            return ItemTags.create(C(blends + path));
        }
    }

    public static class Nuggets {
        public static final TagKey<Item> NUGGETS_ALUMINUM = createNuggetsTags("aluminum");
        public static final TagKey<Item> NUGGETS_ARDITE = createNuggetsTags("ardite");
        public static final TagKey<Item> NUGGETS_BLUE_STEEL = createNuggetsTags("blue_steel");
        public static final TagKey<Item> NUGGETS_BRASS = createNuggetsTags("brass");
        public static final TagKey<Item> NUGGETS_BRITANNIA_SILVER = createNuggetsTags("britannia_silver");
        public static final TagKey<Item> NUGGETS_BRONZE = createNuggetsTags("bronze");
        public static final TagKey<Item> NUGGETS_CATALYRIUM = createNuggetsTags("catalyrium");
        public static final TagKey<Item> NUGGETS_CAST_IRON = createNuggetsTags("cast_iron");
        public static final TagKey<Item> NUGGETS_CAST_STEEL = createNuggetsTags("cast_steel");
        public static final TagKey<Item> NUGGETS_COBALT = createNuggetsTags("cobalt");
        public static final TagKey<Item> NUGGETS_CONSTANTAN = createNuggetsTags("constantan");
        public static final TagKey<Item> NUGGETS_COPPER = createNuggetsTags("copper");
        public static final TagKey<Item> NUGGETS_ELECTRUM = createNuggetsTags("electrum");
        public static final TagKey<Item> NUGGETS_ENDERIUM = createNuggetsTags("enderium");
        public static final TagKey<Item> NUGGETS_GALLIUM = createNuggetsTags("gallium");
        public static final TagKey<Item> NUGGETS_GRAPHITE = createNuggetsTags("graphite");
        public static final TagKey<Item> NUGGETS_INVAR = createNuggetsTags("invar");
        public static final TagKey<Item> NUGGETS_IRIDIUM = createNuggetsTags("iridium");
        public static final TagKey<Item> NUGGETS_LEAD = createNuggetsTags("lead");
        public static final TagKey<Item> NUGGETS_LUMIUM = createNuggetsTags("lumium");
        public static final TagKey<Item> NUGGETS_NETHERITE = createNuggetsTags("netherite");
        public static final TagKey<Item> NUGGETS_NETHERSTEEL = createNuggetsTags("nethersteel");
        public static final TagKey<Item> NUGGETS_NICKEL = createNuggetsTags("nickel");
        public static final TagKey<Item> NUGGETS_OSMIUM = createNuggetsTags("osmium");
        public static final TagKey<Item> NUGGETS_PEWTER = createNuggetsTags("pewter");
        public static final TagKey<Item> NUGGETS_PIG_IRON = createNuggetsTags("pig_iron");
        public static final TagKey<Item> NUGGETS_PLATINUM = createNuggetsTags("platinum");
        public static final TagKey<Item> NUGGETS_PLUTONIUM = createNuggetsTags("plutonium");
        public static final TagKey<Item> NUGGETS_ROSE_GOLD = createNuggetsTags("rose_gold");
        public static final TagKey<Item> NUGGETS_SIGNALUM = createNuggetsTags("signalum");
        public static final TagKey<Item> NUGGETS_SHADOWSTEEL = createNuggetsTags("shadowsteel");
        public static final TagKey<Item> NUGGETS_STEEL = createNuggetsTags("steel");
        public static final TagKey<Item> NUGGETS_TIN = createNuggetsTags("tin");
        public static final TagKey<Item> NUGGETS_TITANIUM = createNuggetsTags("titanium");
        public static final TagKey<Item> NUGGETS_TUNGSTEN = createNuggetsTags("tungsten");
        public static final TagKey<Item> NUGGETS_ULTIMATITANIUM = createNuggetsTags("ultimatitanium");
        public static final TagKey<Item> NUGGETS_URANINITE = createNuggetsTags("uraninite");
        public static final TagKey<Item> NUGGETS_URANIUM = createNuggetsTags("uranium");
        public static final TagKey<Item> NUGGETS_WROUGHT_IRON = createNuggetsTags("wrought_iron");
        public static final TagKey<Item> NUGGETS_ZINC = createNuggetsTags("zinc");

        private static TagKey<Item> createNuggetsTags(String path) {
            return ItemTags.create(C(nuggetTag + path));
        }
    }

    public static class GemShards {
        public static final TagKey<Item> GEM_SHARDS = crteCGeneralTag("gem_shards");

        public static final TagKey<Item> GEM_SHARDS_DIAMOND = createGemShardTags("diamond");
        public static final TagKey<Item> GEM_SHARDS_EMERALD = createGemShardTags("emerald");
        public static final TagKey<Item> GEM_SHARDS_PRISMARINE = createGemShardTags("prismarine");
        public static final TagKey<Item> GEM_SHARDS_LAPIS = createGemShardTags("lapis");
        public static final TagKey<Item> GEM_SHARDS_QUARTZ = createGemShardTags("quartz");
        public static final TagKey<Item> GEM_SHARDS_AMETHYST = createGemShardTags("amethyst");

        private static TagKey<Item> createGemShardTags(String path) {
            return ItemTags.create(C(gemShardTag + path));
        }
    }

    public static class RawMaterials {
        public static final TagKey<Item> RAW_ALUMINUM = crteRawMatTags("aluminum");
        public static final TagKey<Item> RAW_ARDITE = crteRawMatTags("ardite");
        public static final TagKey<Item> RAW_BERYLLIUM = crteRawMatTags("beryllium");
        public static final TagKey<Item> RAW_CATALYRIUM = crteRawMatTags("catalyrium");
        public static final TagKey<Item> RAW_COBALT = crteRawMatTags("cobalt");
        public static final TagKey<Item> RAW_GALLIUM = crteRawMatTags("gallium");
        public static final TagKey<Item> RAW_IRIDIUM = crteRawMatTags("iridium");
        public static final TagKey<Item> RAW_LEAD = crteRawMatTags("lead");
        public static final TagKey<Item> RAW_MOLYBDENUM = crteRawMatTags("molybdenum");
        public static final TagKey<Item> RAW_NEODYMIUM = crteRawMatTags("neodymium");
        public static final TagKey<Item> RAW_NICKEL = crteRawMatTags("nickel");
        public static final TagKey<Item> RAW_OSMIUM = crteRawMatTags("osmium");
        public static final TagKey<Item> RAW_PALLADIUM = crteRawMatTags("palladium");
        public static final TagKey<Item> RAW_PLATINUM = crteRawMatTags("platinum");
        public static final TagKey<Item> RAW_SCULKITE = crteRawMatTags("sculkite");
        public static final TagKey<Item> RAW_SILVER = crteRawMatTags("silver");
        public static final TagKey<Item> SULFUR = crteRawMatTags("sulfur");
        public static final TagKey<Item> RAW_TIN = crteRawMatTags("tin");
        public static final TagKey<Item> RAW_TITANIUM = crteRawMatTags("titanium");
        public static final TagKey<Item> RAW_TUNGSTEN = crteRawMatTags("tungsten");
        public static final TagKey<Item> RAW_ULTIMATITANIUM = crteRawMatTags("ultimatitanium");
        public static final TagKey<Item> RAW_URANINITE = crteRawMatTags("uraninite");
        public static final TagKey<Item> RAW_URANIUM = crteRawMatTags("uranium");
        public static final TagKey<Item> RAW_VANADIUM = crteRawMatTags("vanadium");
        public static final TagKey<Item> RAW_ZINC = crteRawMatTags("zinc");

        private static TagKey<Item> crteRawMatTags(String path) {
            return ItemTags.create(C(rawTag + path));
        }
    }

    public static class Plates {
        public static final TagKey<Item> PLATES = crteCGeneralTag("plates");

        public static final TagKey<Item> PLATES_IRON = crtePlateTagC("iron");
        public static final TagKey<Item> PLATES_GOLD = crtePlateTagC("gold");
        public static final TagKey<Item> PLATES_NETHERITE = crtePlateTagC("netherite");
        public static final TagKey<Item> PLATES_COPPER = crtePlateTagC("copper");
        public static final TagKey<Item> PLATES_STONES = crtePlateTagC("stones");

        private static TagKey<Item> crtePlateTagC(String path) {
            return ItemTags.create(C(plateTag + path));
        }
    }

    public static class Rods {
        public static final TagKey<Item> RODS_STONES = crteRodTagC("stones");

        private static TagKey<Item> crteRodTagC(String path) {
            return ItemTags.create(C(rodTag + path));
        }
    }

    public static class Gears {
        public static final TagKey<Item> GEARS = crteCGeneralTag("gears");

        public static final TagKey<Item> GEAR_STONES = crteGearTagC("stones");

        private static TagKey<Item> crteGearTagC(String path) {
            return ItemTags.create(C(gearTag + path));
        }
    }

    public static class Foils {
        public static final TagKey<Item> FOILS = crteCGeneralTag("foils");

        private static TagKey<Item> crteFoilTagC(String path) {
            return ItemTags.create(C(foilTag + path));
        }
    }

    public static class Wires {
        public static final TagKey<Item> WIRES = crteCGeneralTag("wires");
    }

    public static class SmallDusts {
         public static final TagKey<Item> SMALL_DUSTS = crteCGeneralTag("small_dusts");

        public static final TagKey<Item> SMALL_DUSTS_BRICK = crteSmallDustTagC("brick");
        public static final TagKey<Item> SMALL_DUSTS_ENDSTONE = crteSmallDustTagC("end_stone");
        public static final TagKey<Item> SMALL_DUSTS_SULFUR = crteSmallDustTagC("sulfur");
        public static final TagKey<Item> SMALL_DUSTS_STEEL = crteSmallDustTagC("steel");
        public static final TagKey<Item> SMALL_DUSTS_STONES = crteSmallDustTagC("stones");
        public static final TagKey<Item> SMALL_DUSTS_WROUGHT_IRON = crteSmallDustTagC("wrought_iron");

        public static final TagKey<Item> SMALL_DUSTS_IRON = crteSmallDustTagC("iron");
        public static final TagKey<Item> SMALL_DUSTS_COPPER = crteSmallDustTagC("copper");
        public static final TagKey<Item> SMALL_DUSTS_GOLD = crteSmallDustTagC("gold");
        public static final TagKey<Item> SMALL_DUSTS_PLATINUM = crteSmallDustTagC("platinum");
        public static final TagKey<Item> SMALL_DUSTS_NICKEL = crteSmallDustTagC("nickel");
        public static final TagKey<Item> SMALL_DUSTS_URANIUM = crteSmallDustTagC("uranium");
        public static final TagKey<Item> SMALL_DUSTS_PLUTONIUM = crteSmallDustTagC("plutonium");

        public static final TagKey<Item> SMALL_DUSTS_COAL_COKE = crteSmallDustTagC("coal_coke");

        // Tags to Remove
        public static final TagKey<Item> SMALL_DUSTS_COKE_COAL_R = crteSmallDustTagC("coke_coal");

        private static TagKey<Item> crteSmallDustTagC(String path) {
            return ItemTags.create(C(smallDustTag + path));
        }
    }

    public static class Clumps {
        public static final TagKey<Item> CLUMPS = crteCGeneralTag("clumps");

        public static final TagKey<Item> CLUMPS_LEAD = crteClumpTag("lead");
        public static final TagKey<Item> CLUMPS_TIN = crteClumpTag("tin");
        public static final TagKey<Item> CLUMPS_SILVER = crteClumpTag("silver");
        public static final TagKey<Item> CLUMPS_ALUMINUM = crteClumpTag("aluminum");

        private static TagKey<Item> crteClumpTag(String path) {
            return ItemTags.create(C(clumpTag + path));
        }
    }

    public static class Shards {
        public static final TagKey<Item> SHARDS = crteCGeneralTag("shards");
    }

    public static class Crystals {
        public static final TagKey<Item> CRYSTALS = crteCGeneralTag("crystals");
    }

    public static class DirtyDusts {
        public static final TagKey<Item> DIRTY_DUSTS = crteCGeneralTag("dirty_dusts");
    }

    public static class SmallClumps {
        public static final TagKey<Item> SMALL_CLUMPS = crteCGeneralTag("small_clumps");

        public static final TagKey<Item> SMALL_CLUMPS_IRON = crteSmallClumpTag("iron");
        public static final TagKey<Item> SMALL_CLUMPS_COPPER = crteSmallClumpTag("copper");
        public static final TagKey<Item> SMALL_CLUMPS_NICKEL = crteSmallClumpTag("nickel");
        public static final TagKey<Item> SMALL_CLUMPS_PLATINUM = crteSmallClumpTag("platinum");
        public static final TagKey<Item> SMALL_CLUMPS_GOLD = crteSmallClumpTag("platinum");

        private static TagKey<Item> crteSmallClumpTag(String path) {
            return ItemTags.create(C(sClumpTag + path));
        }
    }

    public static class OreGems {
        public static final TagKey<Item> ORE_GEMS = crteCGeneralTag("ore_gems");

        public static final TagKey<Item> ORE_GEMS_IRON = crteOreGemTag("iron");
        public static final TagKey<Item> ORE_GEMS_COPPER = crteOreGemTag("copper");
        public static final TagKey<Item> ORE_GEMS_NICKEL = crteOreGemTag("nickel");
        public static final TagKey<Item> ORE_GEMS_PLATINUM = crteOreGemTag("platinum");
        public static final TagKey<Item> ORE_GEMS_GOLD = crteOreGemTag("gold");

        private static TagKey<Item> crteOreGemTag(String path) {
            return ItemTags.create(C(oreGemTag + path));
        }
    }

    public static class Enriched {
        public static final TagKey<Item> ENRICHED = crteCGeneralTag("enriched");

        public static final TagKey<Item> LEAD_ENRICHED = crteEnrichedTag("lead");
        public static final TagKey<Item> NICKEL_ENRICHED = crteEnrichedTag("nickel");
        public static final TagKey<Item> COPPER_ENRICHED = crteEnrichedTag("copper");
        public static final TagKey<Item> SILVER_ENRICHED = crteEnrichedTag("silver");
        public static final TagKey<Item> TIN_ENRICHED = crteEnrichedTag("tin");
        public static final TagKey<Item> IRON_ENRICHED = crteEnrichedTag("iron");
        public static final TagKey<Item> DIAMOND_ENRICHED = crteEnrichedTag("diamond");
        public static final TagKey<Item> GOLD_ENRICHED = crteEnrichedTag("gold");

        private static TagKey<Item> crteEnrichedTag(String path) {
            return ItemTags.create(C(enrichedTag + path));
        }
    }

    public static class Coals {
        public static final TagKey<Item> COAL = crteCGeneralTag("coals");
        public static final TagKey<Item> CHARCOAL = crteCGeneralTag("charcoals");
        public static final TagKey<Item> COAL_COKE = crteCGeneralTag("coal_coke");
        public static final TagKey<Item> LIGNITE = crteCGeneralTag("coal_lignite");
        public static final TagKey<Item> ANTHRACITE = crteCGeneralTag("coal_anthracite");
        public static final TagKey<Item> PEAT = crteCGeneralTag("coal_peat");
        public static final TagKey<Item> BITUMINOUS = crteCGeneralTag("coal_bituminous");
    }

    public static class Pebbles {
        public static final TagKey<Item> PEBBLES = crteCGeneralTag("pebbles");
    }

    public static class StorageBlocks {
        public static final TagKey<Item> ITEM_STORAGE_RAW = crteRawStorageBlockGeneralTagC("raw");

        public static final TagKey<Item> ITEM_STORAGE_ALUMINUM = crteStorageBlockTagC("aluminum");
        public static final TagKey<Item> ITEM_STORAGE_AMBER = crteStorageBlockTagC("amber");
        public static final TagKey<Item> ITEM_STORAGE_AMETHYST = crteStorageBlockTagC("amethyst");
        public static final TagKey<Item> ITEM_STORAGE_ANTIMATTER = crteStorageBlockTagC("antimatter");
        public static final TagKey<Item> ITEM_STORAGE_APATITE = crteStorageBlockTagC("apatite");
        public static final TagKey<Item> ITEM_STORAGE_ARDITE = crteStorageBlockTagC("ardite");
        public static final TagKey<Item> ITEM_STORAGE_ARMADILLO_SCUTE = crteStorageBlockTagC("armadillo_scute");
        public static final TagKey<Item> ITEM_STORAGE_BERYLLIUM = crteStorageBlockTagC("beryllium");
        public static final TagKey<Item> ITEM_STORAGE_BIOMASS = crteStorageBlockTagC("biomass");
        public static final TagKey<Item> ITEM_STORAGE_BIOSTEEL = crteStorageBlockTagC("biosteel");
        public static final TagKey<Item> ITEM_STORAGE_BLACK_STEEL = crteStorageBlockTagC("black_steel");
        public static final TagKey<Item> ITEM_STORAGE_BLAZE = crteStorageBlockTagC("blaze");
        public static final TagKey<Item> ITEM_STORAGE_BLUE_STEEL = crteStorageBlockTagC("blue_steel");
        public static final TagKey<Item> ITEM_STORAGE_BRASS = crteStorageBlockTagC("brass");
        public static final TagKey<Item> ITEM_STORAGE_BRITANNIA_SILVER = crteStorageBlockTagC("britannia_silver");
        public static final TagKey<Item> ITEM_STORAGE_BRONZE = crteStorageBlockTagC("bronze");
        public static final TagKey<Item> ITEM_STORAGE_CAST_IRON = crteStorageBlockTagC("cast_iron");
        public static final TagKey<Item> ITEM_STORAGE_CAST_STEEL = crteStorageBlockTagC("cast_steel");
        public static final TagKey<Item> ITEM_STORAGE_CATALYRIUM = crteStorageBlockTagC("catalyrium");
        public static final TagKey<Item> ITEM_STORAGE_CINNABAR = crteStorageBlockTagC("cinnabar");
        public static final TagKey<Item> ITEM_STORAGE_COBALT = crteStorageBlockTagC("cobalt");
        public static final TagKey<Item> ITEM_STORAGE_CONSTANTAN = crteStorageBlockTagC("constantan");
        public static final TagKey<Item> ITEM_STORAGE_DUST = crteStorageBlockTagC("dust");
        public static final TagKey<Item> ITEM_STORAGE_ELECTRUM = crteStorageBlockTagC("electrum");
        public static final TagKey<Item> ITEM_STORAGE_ENDER_PEARL = crteStorageBlockTagC("ender_pearl");
        public static final TagKey<Item> ITEM_STORAGE_ENDERIUM = crteStorageBlockTagC("enderium");
        public static final TagKey<Item> ITEM_STORAGE_ETHERIUM = crteStorageBlockTagC("etherium");
        public static final TagKey<Item> ITEM_STORAGE_EXOTIC_MATTER = crteStorageBlockTagC("exotic_matter");
        public static final TagKey<Item> ITEM_STORAGE_FLINT = crteStorageBlockTagC("flint");
        public static final TagKey<Item> ITEM_STORAGE_FLUIX = crteStorageBlockTagC("fluix");
        public static final TagKey<Item> ITEM_STORAGE_FLUORITE = crteStorageBlockTagC("fluorite");
        public static final TagKey<Item> ITEM_STORAGE_GALLIUM = crteStorageBlockTagC("gallium");
        public static final TagKey<Item> ITEM_STORAGE_GARNET = crteStorageBlockTagC("garnet");
        public static final TagKey<Item> ITEM_STORAGE_GRAPHITE = crteStorageBlockTagC("graphite");
        public static final TagKey<Item> ITEM_STORAGE_INVAR = crteStorageBlockTagC("invar");
        public static final TagKey<Item> ITEM_STORAGE_IRIDIUM = crteStorageBlockTagC("iridium");
        public static final TagKey<Item> ITEM_STORAGE_LEAD = crteStorageBlockTagC("lead");
        public static final TagKey<Item> ITEM_STORAGE_LUMIUM = crteStorageBlockTagC("lumium");
        public static final TagKey<Item> ITEM_STORAGE_NAUTILUS = crteStorageBlockTagC("nautilus");
        public static final TagKey<Item> ITEM_STORAGE_NECROTICARITE = crteStorageBlockTagC("necroticarite");
        public static final TagKey<Item> ITEM_STORAGE_NETHER_STAR = crteStorageBlockTagC("nether_star");
        public static final TagKey<Item> ITEM_STORAGE_NETHERSTEEL = crteStorageBlockTagC("nethersteel");
        public static final TagKey<Item> ITEM_STORAGE_NICKEL = crteStorageBlockTagC("nickel");
        public static final TagKey<Item> ITEM_STORAGE_NITER = crteStorageBlockTagC("niter");
        public static final TagKey<Item> ITEM_STORAGE_OBSIDIAN = crteStorageBlockTagC("obsidian");
        public static final TagKey<Item> ITEM_STORAGE_ONYX = crteStorageBlockTagC("onyx");
        public static final TagKey<Item> ITEM_STORAGE_OSMIUM = crteStorageBlockTagC("osmium");
        public static final TagKey<Item> ITEM_STORAGE_PEARL = crteStorageBlockTagC("pearl");
        public static final TagKey<Item> ITEM_STORAGE_PERIDOT = crteStorageBlockTagC("peridot");
        public static final TagKey<Item> ITEM_STORAGE_PEWTER = crteStorageBlockTagC("pewter");
        public static final TagKey<Item> ITEM_STORAGE_PIG_IRON = crteStorageBlockTagC("pig_iron");
        public static final TagKey<Item> ITEM_STORAGE_PLATINUM = crteStorageBlockTagC("platinum");
        public static final TagKey<Item> ITEM_STORAGE_PLUTONIUM = crteStorageBlockTagC("plutonium");
        public static final TagKey<Item> ITEM_STORAGE_PRISMARINE = crteStorageBlockTagC("prismarine");
        public static final TagKey<Item> ITEM_STORAGE_PYROLITE = crteStorageBlockTagC("pyrolite");
        public static final TagKey<Item> ITEM_STORAGE_QUANTIQUARITE = crteStorageBlockTagC("quantiquarite");
        public static final TagKey<Item> ITEM_STORAGE_QUARTZ = crteStorageBlockTagC("quartz");
        public static final TagKey<Item> ITEM_STORAGE_ROSE_GOLD = crteStorageBlockTagC("rose_gold");
        public static final TagKey<Item> ITEM_STORAGE_RUBY = crteStorageBlockTagC("ruby");
        public static final TagKey<Item> ITEM_STORAGE_SALT = crteStorageBlockTagC("salt");
        public static final TagKey<Item> ITEM_STORAGE_SANGUIS_VIVUS = crteStorageBlockTagC("sanguis_vivus");
        public static final TagKey<Item> ITEM_STORAGE_SAPPHIRE = crteStorageBlockTagC("sapphire");
        public static final TagKey<Item> ITEM_STORAGE_SCULKITE = crteStorageBlockTagC("sculkite");
        public static final TagKey<Item> ITEM_STORAGE_SHADOWSTEEL = crteStorageBlockTagC("shadowsteel");
        public static final TagKey<Item> ITEM_STORAGE_SIGNALUM = crteStorageBlockTagC("signalum");
        public static final TagKey<Item> ITEM_STORAGE_SILICON = crteStorageBlockTagC("silicon");
        public static final TagKey<Item> ITEM_STORAGE_SILICON_INGOT = crteStorageBlockTagC("silicon_ingot");
        public static final TagKey<Item> ITEM_STORAGE_SILVER = crteStorageBlockTagC("silver");
        public static final TagKey<Item> ITEM_STORAGE_STEEL = crteStorageBlockTagC("steel");
        public static final TagKey<Item> ITEM_STORAGE_STELLARIUM = crteStorageBlockTagC("stellarium");
        public static final TagKey<Item> ITEM_STORAGE_STRANGE_MATTER = crteStorageBlockTagC("strange_matter");
        public static final TagKey<Item> ITEM_STORAGE_SOURCE = crteStorageBlockTagC("source");
        public static final TagKey<Item> ITEM_STORAGE_SUGAR = crteStorageBlockTagC("sugar");
        public static final TagKey<Item> ITEM_STORAGE_TANZANITE = crteStorageBlockTagC("tanzanite");
        public static final TagKey<Item> ITEM_STORAGE_TEMICTETL = crteStorageBlockTagC("temictetl");
        public static final TagKey<Item> ITEM_STORAGE_TIN = crteStorageBlockTagC("tin");
        public static final TagKey<Item> ITEM_STORAGE_TITANIUM = crteStorageBlockTagC("titanium");
        public static final TagKey<Item> ITEM_STORAGE_TUNGSTEN = crteStorageBlockTagC("tungsten");
        public static final TagKey<Item> ITEM_STORAGE_TURTLE_SCUTE = crteStorageBlockTagC("turtle_scute");
        public static final TagKey<Item> ITEM_STORAGE_ULTIMATITANIUM = crteStorageBlockTagC("ultimatitanium");
        public static final TagKey<Item> ITEM_STORAGE_URANINITE = crteStorageBlockTagC("uraninite");
        public static final TagKey<Item> ITEM_STORAGE_URANIUM = crteStorageBlockTagC("uranium");
        public static final TagKey<Item> ITEM_STORAGE_WROUGHT_IRON = crteStorageBlockTagC("wrought_iron");
        public static final TagKey<Item> ITEM_STORAGE_ZINC = crteStorageBlockTagC("zinc");
        public static final TagKey<Item> ITEM_STORAGE_ZIRCON = crteStorageBlockTagC("zircon");

        // Raw Blocks
        public static final TagKey<Item> ITEM_STORAGE_RAW_ALUMINUM = crteRawStorageBlockTagC("aluminum");
        public static final TagKey<Item> ITEM_STORAGE_RAW_ARDITE = crteRawStorageBlockTagC("ardite");
        public static final TagKey<Item> ITEM_STORAGE_RAW_CATALYRIUM = crteRawStorageBlockTagC("catalyrium");
        public static final TagKey<Item> ITEM_STORAGE_RAW_COBALT = crteRawStorageBlockTagC("cobalt");
        public static final TagKey<Item> ITEM_STORAGE_RAW_GALLIUM = crteRawStorageBlockTagC("gallium");
        public static final TagKey<Item> ITEM_STORAGE_RAW_IRIDIUM = crteRawStorageBlockTagC("iridium");
        public static final TagKey<Item> ITEM_STORAGE_RAW_LEAD = crteRawStorageBlockTagC("lead");
        public static final TagKey<Item> ITEM_STORAGE_RAW_NICKEL = crteRawStorageBlockTagC("nickel");
        public static final TagKey<Item> ITEM_STORAGE_RAW_OSMIUM = crteRawStorageBlockTagC("osmium");
        public static final TagKey<Item> ITEM_STORAGE_RAW_PLATINUM = crteRawStorageBlockTagC("platinum");
        public static final TagKey<Item> ITEM_STORAGE_RAW_SCULKITE = crteRawStorageBlockTagC("sculkite");
        public static final TagKey<Item> ITEM_STORAGE_RAW_SILVER = crteRawStorageBlockTagC("silver");
        public static final TagKey<Item> ITEM_STORAGE_SULFUR = crteStorageBlockTagC("sulfur");
        public static final TagKey<Item> ITEM_STORAGE_RAW_TIN = crteRawStorageBlockTagC("tin");
        public static final TagKey<Item> ITEM_STORAGE_RAW_TITANIUM = crteRawStorageBlockTagC("titanium");
        public static final TagKey<Item> ITEM_STORAGE_RAW_TUNGSTEN = crteRawStorageBlockTagC("tungsten");
        public static final TagKey<Item> ITEM_STORAGE_RAW_ULTIMATITANIUM = crteRawStorageBlockTagC("ultimatitanium");
        public static final TagKey<Item> ITEM_STORAGE_RAW_URANINITE = crteRawStorageBlockTagC("uraninite");
        public static final TagKey<Item> ITEM_STORAGE_RAW_URANIUM = crteRawStorageBlockTagC("uranium");
        public static final TagKey<Item> ITEM_STORAGE_RAW_ZINC = crteRawStorageBlockTagC("zinc");

        public static final TagKey<Item> ITEM_STORAGE_COAL_COKE = crteStorageBlockTagC("coal_coke");
        // Modern Industrialization Coke Coal Block tag
        public static final TagKey<Item> ITEM_STORAGE_COKE = crteStorageBlockTagC("coke");

        // To remove
        public static final TagKey<Item> ITEM_STORAGE_COKE_COAL_R = crteStorageBlockTagC("coke_coal");
        public static final TagKey<Item> ITEM_STORAGE_FLUIX_R = crteStorageBlockTagC("fluix_crystal");
        public static final TagKey<Item> ITEM_STORAGE_SOURCE_R = crteStorageBlockTagC("source_gemstone");

        private static TagKey<Item> crteStorageBlockTagC(String path) {
            return ItemTags.create(C(storage + path));
        }

        private static TagKey<Item> crteRawStorageBlockTagC(String path) {
            return ItemTags.create(C(storage + "raw_" + path));
        }

        private static TagKey<Item> crteRawStorageBlockGeneralTagC(String path) {
            return ItemTags.create(C(storage + path));
        }
    }

    public static class Ores {
        // Ores
        public static final TagKey<Item> ITEM_ALUMINUM_ORE = crteOreBlockTagC("aluminum");
        public static final TagKey<Item> ITEM_AMBER_ORE = crteOreBlockTagC("amber");
        public static final TagKey<Item> ITEM_ANTHRACITE_ORE = crteOreBlockTagC("anthracite_coal");
        public static final TagKey<Item> ITEM_APATITE_ORE = crteOreBlockTagC("apatite");
        public static final TagKey<Item> ITEM_ARDITE_ORE = crteOreBlockTagC("ardite");
        public static final TagKey<Item> ITEM_BERYLLIUM_ORE = crteOreBlockTagC("beryllium");
        public static final TagKey<Item> ITEM_BITUMINOUS_ORE = crteOreBlockTagC("bituminous_coal");
        public static final TagKey<Item> ITEM_CINNABAR_ORE = crteOreBlockTagC("cinnabar");
        public static final TagKey<Item> ITEM_COBALT_ORE = crteOreBlockTagC("cobalt");
        public static final TagKey<Item> ITEM_FLUORITE_ORE = crteOreBlockTagC("fluorite");
        public static final TagKey<Item> ITEM_GALLIUM_ORE = crteOreBlockTagC("gallium");
        public static final TagKey<Item> ITEM_GARNET_ORE = crteOreBlockTagC("garnet");
        public static final TagKey<Item> ITEM_IRIDIUM_ORE = crteOreBlockTagC("iridium");
        public static final TagKey<Item> ITEM_JADE_ORE = crteOreBlockTagC("jade");
        public static final TagKey<Item> ITEM_LEAD_ORE = crteOreBlockTagC("lead");
        public static final TagKey<Item> ITEM_LIGNITE_ORE = crteOreBlockTagC("lignite_coal");
        public static final TagKey<Item> ITEM_MONAZITE_ORE = crteOreBlockTagC("monazite");
        public static final TagKey<Item> ITEM_NECROTICARITE_ORE = crteOreBlockTagC("necroticarite");
        public static final TagKey<Item> ITEM_NICKEL_ORE = crteOreBlockTagC("nickel");
        public static final TagKey<Item> ITEM_NITER_ORE = crteOreBlockTagC("niter");
        public static final TagKey<Item> ITEM_OBSIDIAN_ORE = crteOreBlockTagC("obsidian");
        public static final TagKey<Item> ITEM_ONYX_ORE = crteOreBlockTagC("onyx");
        public static final TagKey<Item> ITEM_OSMIUM_ORE = crteOreBlockTagC("osmium");
        public static final TagKey<Item> ITEM_PEARL_ORE = crteOreBlockTagC("pearl");
        public static final TagKey<Item> ITEM_PEAT_ORE = crteOreBlockTagC("peat_coal");
        public static final TagKey<Item> ITEM_PERIDOT_ORE = crteOreBlockTagC("peridot");
        public static final TagKey<Item> ITEM_PLATINUM_ORE = crteOreBlockTagC("platinum");
        public static final TagKey<Item> ITEM_PYROLITE_ORE = crteOreBlockTagC("pyrolite");
        public static final TagKey<Item> ITEM_RUBY_ORE = crteOreBlockTagC("ruby");
        public static final TagKey<Item> ITEM_SALT_ORE = crteOreBlockTagC("salt");
        public static final TagKey<Item> ITEM_SAPPHIRE_ORE = crteOreBlockTagC("sapphire");
        public static final TagKey<Item> ITEM_SCULKITE_ORE = crteOreBlockTagC("sculkite");
        public static final TagKey<Item> ITEM_SILVER_ORE = crteOreBlockTagC("silver");
        public static final TagKey<Item> ITEM_SULFUR_ORE = crteOreBlockTagC("sulfur");
        public static final TagKey<Item> ITEM_TANZANITE_ORE = crteOreBlockTagC("tanzanite");
        public static final TagKey<Item> ITEM_TIN_ORE = crteOreBlockTagC("tin");
        public static final TagKey<Item> ITEM_TITANIUM_ORE = crteOreBlockTagC("titanium");
        public static final TagKey<Item> ITEM_TUNGSTEN_ORE = crteOreBlockTagC("tungsten");
        public static final TagKey<Item> ITEM_ULTIMATITANIUM_ORE = crteOreBlockTagC("ultimatitanium");
        public static final TagKey<Item> ITEM_URANINITE_ORE = crteOreBlockTagC("uraninite_regular");
        public static final TagKey<Item> ITEM_URANINITE_ORE_ = crteOreBlockTagC("uraninite");
        public static final TagKey<Item> ITEM_URANIUM_ORE = crteOreBlockTagC("uranium");
        public static final TagKey<Item> ITEM_ZINC_ORE = crteOreBlockTagC("zinc");
        public static final TagKey<Item> ITEM_ZIRCON_ORE = crteOreBlockTagC("zircon");

        // Ores in Ground
        public static final TagKey<Item> ITEM_ORES_IN_GROUND_SAND = crteOresInGroundTagC("sand");
        public static final TagKey<Item> ITEM_ORES_IN_GROUND_RED_SAND = crteOresInGroundTagC("red_sand");
        public static final TagKey<Item> ITEM_ORES_IN_GROUND_END = crteOresInGroundTagC("end_stone");
        public static final TagKey<Item> ITEM_ORES_IN_GROUND_SCULK = crteOresInGroundTagC("sculk");
        public static final TagKey<Item> ITEM_ORES_IN_GROUND_GRAVEL = crteOresInGroundTagC("gravel");
        public static final TagKey<Item> ITEM_ORES_IN_GROUND_DIORITE = crteOresInGroundTagC("diorite");
        public static final TagKey<Item> ITEM_ORES_IN_GROUND_GRANITE = crteOresInGroundTagC("granite");
        public static final TagKey<Item> ITEM_ORES_IN_GROUND_ANDESITE = crteOresInGroundTagC("andesite");
        public static final TagKey<Item> ITEM_ORES_IN_GROUND_BASALT = crteOresInGroundTagC("basalt");
        public static final TagKey<Item> ITEM_ORES_IN_GROUND_DIRT = crteOresInGroundTagC("dirt");
        public static final TagKey<Item> ITEM_ORES_IN_GROUND_SOUL_SAND = crteOresInGroundTagC("soul_sand");
        public static final TagKey<Item> ITEM_ORES_IN_GROUND_TUFF = crteOresInGroundTagC("tuff");
        public static final TagKey<Item> ITEM_ORES_IN_GROUND_CLAY = crteOresInGroundTagC("clay");
        public static final TagKey<Item> ITEM_ORES_IN_GROUND_SNOW = crteOresInGroundTagC("snow");
        public static final TagKey<Item> ITEM_ORES_IN_GROUND_BLACKSTONE = crteOresInGroundTagC("blackstone");
        public static final TagKey<Item> ITEM_ORES_IN_GROUND_CALCITE = crteOresInGroundTagC("calcite");

        private static TagKey<Item> crteOreBlockTagC (String path) {
            return ItemTags.create(C(ores + path));
        }

        private static TagKey<Item> crteOresInGroundTagC (String path) {
            return ItemTags.create(C(oresIn + path));
        }
    }

    public static class DustBlocks {
        public static final TagKey<Item> ITEM_DUST_BLOCK = crteCGeneralTag("dust_blocks");

        public static final TagKey<Item> ITEM_DUST_BLOCK_ALUMINUM = crteDustBlockTagC("aluminum");
        public static final TagKey<Item> ITEM_DUST_BLOCK_AMBER = crteDustBlockTagC("amber");
        public static final TagKey<Item> ITEM_DUST_BLOCK_AMETHYST = crteDustBlockTagC("amethyst");
        public static final TagKey<Item> ITEM_DUST_BLOCK_APATITE = crteDustBlockTagC("apatite");
        public static final TagKey<Item> ITEM_DUST_BLOCK_ARDITE = crteDustBlockTagC("ardite");
        public static final TagKey<Item> ITEM_DUST_BLOCK_BERYLLIUM = crteDustBlockTagC("beryllium");
        public static final TagKey<Item> ITEM_DUST_BLOCK_BRONZE = crteDustBlockTagC("bronze");
        public static final TagKey<Item> ITEM_DUST_BLOCK_CHARCOAL = crteDustBlockTagC("charcoal");
        public static final TagKey<Item> ITEM_DUST_BLOCK_COAL = crteDustBlockTagC("coal");
        public static final TagKey<Item> ITEM_DUST_BLOCK_COAL_COKE = crteDustBlockTagC("coal_coke");
        public static final TagKey<Item> ITEM_DUST_BLOCK_COBALT = crteDustBlockTagC("cobalt");
        public static final TagKey<Item> ITEM_DUST_BLOCK_COPPER = crteDustBlockTagC("copper");
        public static final TagKey<Item> ITEM_DUST_BLOCK_DUST = crteDustBlockTagC("dust");
        public static final TagKey<Item> ITEM_DUST_BLOCK_DIAMOND = crteDustBlockTagC("diamond");
        public static final TagKey<Item> ITEM_DUST_BLOCK_EMERALD = crteDustBlockTagC("emerald");
        public static final TagKey<Item> ITEM_DUST_BLOCK_FLUORITE = crteDustBlockTagC("fluorite");
        public static final TagKey<Item> ITEM_DUST_BLOCK_GALLIUM = crteDustBlockTagC("gallium");
        public static final TagKey<Item> ITEM_DUST_BLOCK_GARNET = crteDustBlockTagC("garnet");
        public static final TagKey<Item> ITEM_DUST_BLOCK_GOLD = crteDustBlockTagC("gold");
        public static final TagKey<Item> ITEM_DUST_BLOCK_IRIDIUM = crteDustBlockTagC("iridium");
        public static final TagKey<Item> ITEM_DUST_BLOCK_IRON = crteDustBlockTagC("iron");
        public static final TagKey<Item> ITEM_DUST_BLOCK_LAPIS = crteDustBlockTagC("lapis");
        public static final TagKey<Item> ITEM_DUST_BLOCK_LEAD = crteDustBlockTagC("lead");
        public static final TagKey<Item> ITEM_DUST_BLOCK_NAUTILUS = crteDustBlockTagC("nautilus");
        public static final TagKey<Item> ITEM_DUST_BLOCK_NETHERITE = crteDustBlockTagC("netherite");
        public static final TagKey<Item> ITEM_DUST_BLOCK_NICKEL = crteDustBlockTagC("nickel");
        public static final TagKey<Item> ITEM_DUST_BLOCK_OSMIUM = crteDustBlockTagC("osmium");
        public static final TagKey<Item> ITEM_DUST_BLOCK_PERIDOT = crteDustBlockTagC("peridot");
        public static final TagKey<Item> ITEM_DUST_BLOCK_PLATINUM = crteDustBlockTagC("platinum");
        public static final TagKey<Item> ITEM_DUST_BLOCK_PLUTONIUM = crteDustBlockTagC("plutonium");
        public static final TagKey<Item> ITEM_DUST_BLOCK_QUARTZ = crteDustBlockTagC("quartz");
        public static final TagKey<Item> ITEM_DUST_BLOCK_RUBY = crteDustBlockTagC("ruby");
        public static final TagKey<Item> ITEM_DUST_BLOCK_SILICON = crteDustBlockTagC("silicon");
        public static final TagKey<Item> ITEM_DUST_BLOCK_SILVER = crteDustBlockTagC("silver");
        public static final TagKey<Item> ITEM_DUST_BLOCK_TITANIUM = crteDustBlockTagC("titanium");
        public static final TagKey<Item> ITEM_DUST_BLOCK_TUNGSTEN = crteDustBlockTagC("tungsten");
        public static final TagKey<Item> ITEM_DUST_BLOCK_ULTIMATITANIUM = crteDustBlockTagC("ultimatitanium");
        public static final TagKey<Item> ITEM_DUST_BLOCK_URANINITE = crteDustBlockTagC("uraninite");
        public static final TagKey<Item> ITEM_DUST_BLOCK_URANIUM = crteDustBlockTagC("uranium");
        public static final TagKey<Item> ITEM_DUST_BLOCK_ZINC = crteDustBlockTagC("zinc");

        public static final TagKey<Item> ITEM_DUST_BLOCK_COKE_COAL_R = crteDustBlockTagC("coke_coal");

        private static TagKey<Item> crteDustBlockTagC (String path) {
            return ItemTags.create(C(dustB + path));
        }
    }

    public static class GeOresShards {
        public static final TagKey<Item> GEOSHARDS = crteGeOresGeneralTag("geore_shards");

        public static final TagKey<Item> CATALYRIUM_GEOSHARD = crteGeOreShardsTag("catalyrium");

        private static TagKey<Item> crteGeOreShardsTag(String path) {
            return ItemTags.create(GEO(geoshards + path));
        }
    }

    public static class GeOreShardBlocks {
        public static final TagKey<Item> GEOSHARD_BLOCKS = crteGeOresGeneralTag("geore_blocks");
        public static final TagKey<Item> GEOSHARD_BLOCKS_STORAGE = crteGeOresGeneralTag("geore_blocks/storage_blocks");

        public static final TagKey<Item> CATALYRIUM_GEORE_BLOCK = crteGeOreShardBlocksTag("catalyrium");
        public static final TagKey<Item> CATALYRIUM_GEORE_BLOCK_STORAGE = crteGeOreShardStorageBlocksTag("catalyrium");

        private static TagKey<Item> crteGeOreShardBlocksTag(String path) {
            return ItemTags.create(GEO(geoshardBlock + path));
        }

        private static TagKey<Item> crteGeOreShardStorageBlocksTag(String path) {
            return ItemTags.create(GEO(geoshardBlockStorage + path));
        }
    }

    public static class GeOreBuds {
        public static final TagKey<Item> GEORE_SMALL_BUDS = crteGeOresGeneralTag("geore_small_buds");
        public static final TagKey<Item> GEORE_MEDIUM_BUDS = crteGeOresGeneralTag("geore_medium_buds");
        public static final TagKey<Item> GEORE_LARGE_BUDS = crteGeOresGeneralTag("geore_large_buds");
        public static final TagKey<Item> GEORE_CLUSTERS = crteGeOresGeneralTag("geore_clusters");

        private static TagKey<Item> crteSmallBudTag(String path) {
            return ItemTags.create(GEO(georeSmallBuds + path));
        }

        private static TagKey<Item> crteMediumBudTag(String path) {
            return ItemTags.create(GEO(georeMediumBuds + path));
        }

        private static TagKey<Item> crteLargeBudTag(String path) {
            return ItemTags.create(GEO(georeLargeBuds + path));
        }

        private static TagKey<Item> crteClusterTag(String path) {
            return ItemTags.create(GEO(georeClusters + path));
        }
    }

    public static class CrushedRawMaterials {

        public static final TagKey<Item> CREATE_CRUSHED_RAW_MATERIALS_IRON = crteCreateTag("iron");
        public static final TagKey<Item> CREATE_CRUSHED_RAW_MATERIALS_GOLD = crteCreateTag("gold");
        public static final TagKey<Item> CREATE_CRUSHED_RAW_MATERIALS_COPPER = crteCreateTag("copper");
        public static final TagKey<Item> CREATE_CRUSHED_RAW_MATERIALS_ZINC = crteCreateTag("zinc");
        public static final TagKey<Item> CREATE_CRUSHED_RAW_MATERIALS_OSMIUM = crteCreateTag("osmium");
        public static final TagKey<Item> CREATE_CRUSHED_RAW_MATERIALS_PLATINUM = crteCreateTag("platinum");
        public static final TagKey<Item> CREATE_CRUSHED_RAW_MATERIALS_SILVER = crteCreateTag("silver");
        public static final TagKey<Item> CREATE_CRUSHED_RAW_MATERIALS_TIN = crteCreateTag("tin");
        public static final TagKey<Item> CREATE_CRUSHED_RAW_MATERIALS_LEAD = crteCreateTag("lead");
        public static final TagKey<Item> CREATE_CRUSHED_RAW_MATERIALS_ALUMINUM = crteCreateTag("aluminum");
        public static final TagKey<Item> CREATE_CRUSHED_RAW_MATERIALS_URANIUM = crteCreateTag("uranium");
        public static final TagKey<Item> CREATE_CRUSHED_RAW_MATERIALS_NICKEL = crteCreateTag("nickel");

        private static TagKey<Item> crteCreateTag(String path) {
            return ItemTags.create(CTE(crushedRawMaterials + path));
        }
    }

    public static class CompressedBlocks {
        public static final TagKey<Item> ITEM_COMPRESSED_BLOCK = crteCGeneralTag("compressed_block");
    }

    private static TagKey<Item> crteEOGeneralTag(String path) {
        return ItemTags.create(EO(path));
    }

    private static TagKey<Item> crteCGeneralTag(String path) {
        return ItemTags.create(C(path));
    }

    private static TagKey<Item> crteGeOresGeneralTag(String path) {
        return ItemTags.create(GEO(path));
    }
}
