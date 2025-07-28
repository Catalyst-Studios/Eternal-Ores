package net.radzratz.eternalores.item;

import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.item.tools.EOGemCutter;
import net.radzratz.eternalores.item.tools.EOHammers;
import net.radzratz.eternalores.item.types.*;

import static net.radzratz.eternalores.item.helpers.EOItemHelpers.*;
import static net.radzratz.eternalores.item.types.enums.EOMaterialFormType.*;

@SuppressWarnings("all")
public class EOItemRegistry
{
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EternalOres.id);

    //Hammers
    /// Eternal Ores Hammers
    public static final DeferredItem<EOHammers> COBALT_HAMMER = registerHammer("cobalt_hammer", 1024);
    public static final DeferredItem<EOHammers> COPPER_HAMMER = registerHammer("copper_hammer",128);
    public static final DeferredItem<EOHammers> STONE_HAMMER = registerHammer("stone_hammer",64);
    public static final DeferredItem<EOHammers> DIAMOND_HAMMER = registerHammer("diamond_hammer",512);
    public static final DeferredItem<EOHammers> IRON_HAMMER = registerHammer("iron_hammer",256);

    //Dev Tool
    /// This one should never have an Item Tag.
    public static final DeferredItem<Item> FINDER = registerFinder("finder",16);

    //Gem Cutter
    /// Eternal Ores Gem Cutter
    public static final DeferredItem<EOGemCutter> IRON_GEM_CUTTER = registerGemCutter("iron_gem_cutter",256);

    //Misc Items
    /// Eternal Ores Silicon... it ain't an ore, but whatever.
    public static final DeferredItem<Item> SILICON = registerMiscItem("silicon");

    //Ingots
    /// Eternal Ores Ingots
    public static final DeferredItem<EOIngotItem> ALUMINUM_INGOT = registerIngotItem("aluminum_ingot");
    public static final DeferredItem<EOIngotItem> ARDITE_INGOT = registerIngotItem("ardite_ingot");
    public static final DeferredItem<EOIngotItem> BLUE_STEEL_INGOT = registerIngotItem("blue_steel_ingot");
    public static final DeferredItem<EOIngotItem> BRASS_INGOT = registerIngotItem("brass_ingot");
    public static final DeferredItem<EOIngotItem> BRITANNIA_SILVER_INGOT = registerIngotItem("britannia_silver_ingot");
    public static final DeferredItem<EOIngotItem> BRONZE_INGOT = registerIngotItem("bronze_ingot");
    public static final DeferredItem<EOIngotItem> COBALT_INGOT = registerIngotItem("cobalt_ingot");
    public static final DeferredItem<EOIngotItem> CONSTANTAN_INGOT = registerIngotItem("constantan_ingot");
    public static final DeferredItem<EOIngotItem> ELECTRUM_INGOT = registerIngotItem("electrum_ingot");
    public static final DeferredItem<EOIngotItem> ENDERIUM_INGOT = registerIngotItem("enderium_ingot");
    public static final DeferredItem<EOIngotItem> ETERNAL_DARK_INGOT = registerIngotItem("eternal_dark_ingot");
    public static final DeferredItem<EOIngotItem> ETERNAL_LIGHT_INGOT = registerIngotItem("eternal_light_ingot");
    public static final DeferredItem<EOIngotItem> GALLIUM_INGOT = registerIngotItem("gallium_ingot");
    public static final DeferredItem<EOIngotItem> GRAPHITE_INGOT = registerIngotItem("graphite_ingot");
    public static final DeferredItem<EOIngotItem> INVAR_INGOT = registerIngotItem("invar_ingot");
    public static final DeferredItem<EOIngotItem> IRIDIUM_INGOT = registerIngotItem("iridium_ingot");
    public static final DeferredItem<EOIngotItem> LEAD_INGOT = registerIngotItem("lead_ingot");
    public static final DeferredItem<EOIngotItem> LUMIUM_INGOT = registerIngotItem("lumium_ingot");
    public static final DeferredItem<EOIngotItem> NICKEL_INGOT = registerIngotItem("nickel_ingot");
    public static final DeferredItem<EOIngotItem> OSMIUM_INGOT = registerIngotItem("osmium_ingot");
    public static final DeferredItem<EOIngotItem> PEWTER_INGOT = registerIngotItem("pewter_ingot");
    public static final DeferredItem<EOIngotItem> PLATINUM_INGOT = registerIngotItem("platinum_ingot");
    public static final DeferredItem<EOIngotItem> PLUTONIUM_INGOT = registerIngotItem("plutonium_ingot");
    public static final DeferredItem<EOIngotItem> REDSTONE_INGOT = registerIngotItem("redstone_ingot");
    public static final DeferredItem<EOIngotItem> ROSE_GOLD_INGOT = registerIngotItem("rose_gold_ingot");
    public static final DeferredItem<EOIngotItem> SIGNALUM_INGOT = registerIngotItem("signalum_ingot");
    public static final DeferredItem<EOIngotItem> SILVER_INGOT = registerIngotItem("silver_ingot");
    public static final DeferredItem<EOIngotItem> STEEL_INGOT = registerIngotItem("steel_ingot");
    public static final DeferredItem<EOIngotItem> TIN_INGOT = registerIngotItem("tin_ingot");
    public static final DeferredItem<EOIngotItem> TITANIUM_INGOT = registerIngotItem("titanium_ingot");
    public static final DeferredItem<EOIngotItem> TUNGSTEN_INGOT = registerIngotItem("tungsten_ingot");
    public static final DeferredItem<EOIngotItem> ULTIMATITANIUM_INGOT = registerIngotItem("ultimatitanium_ingot");
    public static final DeferredItem<EOIngotItem> URANIUM_INGOT = registerIngotItem("uranium_ingot");
    public static final DeferredItem<EOIngotItem> ZINC_INGOT = registerIngotItem("zinc_ingot");
    public static final DeferredItem<EOIngotItem> CAST_IRON_INGOT = registerIngotItem("cast_iron_ingot");
    public static final DeferredItem<EOIngotItem> URANINITE_INGOT = registerIngotItem("uraninite_ingot");
    public static final DeferredItem<EOIngotItem> CAST_STEEL_INGOT = registerIngotItem("cast_steel_ingot");
    public static final DeferredItem<EOIngotItem> WROUGHT_IRON_INGOT = registerIngotItem("wrought_iron_ingot");
    public static final DeferredItem<EOIngotItem> NETHERSTEEL_INGOT = registerIngotItem("nethersteel_ingot");
    public static final DeferredItem<EOIngotItem> SHADOWSTEEL_INGOT = registerIngotItem("shadowsteel_ingot");
    public static final DeferredItem<EOIngotItem> PIG_IRON_INGOT = registerIngotItem("pig_iron_ingot");
    public static final DeferredItem<EOIngotItem> MISSING_INGOT = registerIngotItem("missing_ingot");
    public static final DeferredItem<EOIngotItem> CATALYRIUM_INGOT = registerIngotItem("catalyrium_ingot");
    public static final DeferredItem<EOIngotItem> SILICON_INGOT = registerIngotItem("silicon_ingot");

    //Nuggets
    /// Eternal Ores Nuggets, metal nuggets not dino nuggets
    public static final DeferredItem<EONuggetItem> ALUMINUM_NUGGET = registerNuggetItem("aluminum_nugget");
    public static final DeferredItem<EONuggetItem> ARDITE_NUGGET = registerNuggetItem("ardite_nugget");
    public static final DeferredItem<EONuggetItem> BLUE_STEEL_NUGGET = registerNuggetItem("blue_steel_nugget");
    public static final DeferredItem<EONuggetItem> BRASS_NUGGET = registerNuggetItem("brass_nugget");
    public static final DeferredItem<EONuggetItem> BRITANNIA_SILVER_NUGGET = registerNuggetItem("britannia_silver_nugget");
    public static final DeferredItem<EONuggetItem> BRONZE_NUGGET = registerNuggetItem("bronze_nugget");
    public static final DeferredItem<EONuggetItem> COBALT_NUGGET = registerNuggetItem("cobalt_nugget");
    public static final DeferredItem<EONuggetItem> CONSTANTAN_NUGGET = registerNuggetItem("constantan_nugget");
    public static final DeferredItem<EONuggetItem> COPPER_NUGGET = registerNuggetItem("copper_nugget");
    public static final DeferredItem<EONuggetItem> ELECTRUM_NUGGET = registerNuggetItem("electrum_nugget");
    public static final DeferredItem<EONuggetItem> ENDERIUM_NUGGET = registerNuggetItem("enderium_nugget");
    public static final DeferredItem<EONuggetItem> GALLIUM_NUGGET = registerNuggetItem("gallium_nugget");
    public static final DeferredItem<EONuggetItem> GRAPHITE_NUGGET = registerNuggetItem("graphite_nugget");
    public static final DeferredItem<EONuggetItem> INVAR_NUGGET = registerNuggetItem("invar_nugget");
    public static final DeferredItem<EONuggetItem> IRIDIUM_NUGGET = registerNuggetItem("iridium_nugget");
    public static final DeferredItem<EONuggetItem> LEAD_NUGGET = registerNuggetItem("lead_nugget");
    public static final DeferredItem<EONuggetItem> LUMIUM_NUGGET = registerNuggetItem("lumium_nugget");
    public static final DeferredItem<EONuggetItem> NETHERITE_NUGGET = registerNuggetItem("netherite_nugget");
    public static final DeferredItem<EONuggetItem> NICKEL_NUGGET = registerNuggetItem("nickel_nugget");
    public static final DeferredItem<EONuggetItem> OSMIUM_NUGGET = registerNuggetItem("osmium_nugget");
    public static final DeferredItem<EONuggetItem> PEWTER_NUGGET = registerNuggetItem("pewter_nugget");
    public static final DeferredItem<EONuggetItem> PLATINUM_NUGGET = registerNuggetItem("platinum_nugget");
    public static final DeferredItem<EONuggetItem> PLUTONIUM_NUGGET = registerNuggetItem("plutonium_nugget");
    public static final DeferredItem<EONuggetItem> ROSE_GOLD_NUGGET = registerNuggetItem("rose_gold_nugget");
    public static final DeferredItem<EONuggetItem> SIGNALUM_NUGGET = registerNuggetItem("signalum_nugget");
    public static final DeferredItem<EONuggetItem> SILVER_NUGGET = registerNuggetItem("silver_nugget");
    public static final DeferredItem<EONuggetItem> STEEL_NUGGET = registerNuggetItem("steel_nugget");
    public static final DeferredItem<EONuggetItem> TIN_NUGGET = registerNuggetItem("tin_nugget");
    public static final DeferredItem<EONuggetItem> TITANIUM_NUGGET = registerNuggetItem("titanium_nugget");
    public static final DeferredItem<EONuggetItem> ULTIMATITANIUM_NUGGET = registerNuggetItem("ultimatitanium_nugget");
    public static final DeferredItem<EONuggetItem> URANIUM_NUGGET = registerNuggetItem("uranium_nugget");
    public static final DeferredItem<EONuggetItem> ZINC_NUGGET = registerNuggetItem("zinc_nugget");
    public static final DeferredItem<EONuggetItem> CAST_IRON_NUGGET = registerNuggetItem("cast_iron_nugget");
    public static final DeferredItem<EONuggetItem> URANINITE_NUGGET = registerNuggetItem("uraninite_nugget");
    public static final DeferredItem<EONuggetItem> CAST_STEEL_NUGGET = registerNuggetItem("cast_steel_nugget");
    public static final DeferredItem<EONuggetItem> WROUGHT_IRON_NUGGET = registerNuggetItem("wrought_iron_nugget");
    public static final DeferredItem<EONuggetItem> NETHERSTEEL_NUGGET = registerNuggetItem("nethersteel_nugget");
    public static final DeferredItem<EONuggetItem> SHADOWSTEEL_NUGGET = registerNuggetItem("shadowsteel_nugget");
    public static final DeferredItem<EONuggetItem> PIG_IRON_NUGGET = registerNuggetItem("pig_iron_nugget");
    public static final DeferredItem<EONuggetItem> CATALYRIUM_NUGGET = registerNuggetItem("catalyrium_nugget");
    public static final DeferredItem<EONuggetItem> TUNGSTEN_NUGGET = registerNuggetItem("tungsten_nugget");

    //Rods
    /// Eternal Ores Rods
    public static final DeferredItem<EORodItem> ROD_ALUMINUM = registerRodItem("rod_aluminum", METAL);
    public static final DeferredItem<EORodItem> ROD_ARDITE = registerRodItem("rod_ardite", METAL);
    public static final DeferredItem<EORodItem> ROD_BLUE_STEEL = registerRodItem("rod_blue_steel", METAL);
    public static final DeferredItem<EORodItem> ROD_BRASS = registerRodItem("rod_brass", METAL);
    public static final DeferredItem<EORodItem> ROD_BRONZE = registerRodItem("rod_bronze", METAL);
    public static final DeferredItem<EORodItem> ROD_COBALT = registerRodItem("rod_cobalt", METAL);
    public static final DeferredItem<EORodItem> ROD_CONSTANTAN = registerRodItem("rod_constantan", METAL);
    public static final DeferredItem<EORodItem> ROD_COPPER = registerRodItem("rod_copper", METAL);
    public static final DeferredItem<EORodItem> ROD_DIAMOND = registerRodItem("rod_diamond", GEM);
    public static final DeferredItem<EORodItem> ROD_ELECTRUM = registerRodItem("rod_electrum", METAL);
    public static final DeferredItem<EORodItem> ROD_ENDERIUM = registerRodItem("rod_enderium", METAL);
    public static final DeferredItem<EORodItem> ROD_GALLIUM = registerRodItem("rod_gallium", METAL);
    public static final DeferredItem<EORodItem> ROD_GOLD = registerRodItem("rod_gold", METAL);
    public static final DeferredItem<EORodItem> ROD_GRAPHITE = registerRodItem("rod_graphite", MISC);
    public static final DeferredItem<EORodItem> ROD_INVAR = registerRodItem("rod_invar", METAL);
    public static final DeferredItem<EORodItem> ROD_IRIDIUM = registerRodItem("rod_iridium", METAL);
    public static final DeferredItem<EORodItem> ROD_IRON = registerRodItem("rod_iron", METAL);
    public static final DeferredItem<EORodItem> ROD_LEAD = registerRodItem("rod_lead", METAL);
    public static final DeferredItem<EORodItem> ROD_LUMIUM = registerRodItem("rod_lumium", METAL);
    public static final DeferredItem<EORodItem> ROD_NETHERITE = registerRodItem("rod_netherite", METAL);
    public static final DeferredItem<EORodItem> ROD_NICKEL = registerRodItem("rod_nickel", METAL);
    public static final DeferredItem<EORodItem> ROD_OSMIUM = registerRodItem("rod_osmium", METAL);
    public static final DeferredItem<EORodItem> ROD_PLATINUM = registerRodItem("rod_platinum", METAL);
    public static final DeferredItem<EORodItem> ROD_PLUTONIUM = registerRodItem("rod_plutonium", METAL);
    public static final DeferredItem<EORodItem> ROD_ROSE_GOLD = registerRodItem("rod_rose_gold", METAL);
    public static final DeferredItem<EORodItem> ROD_SAPPHIRE = registerRodItem("rod_sapphire", GEM);
    public static final DeferredItem<EORodItem> ROD_SIGNALUM = registerRodItem("rod_signalum", METAL);
    public static final DeferredItem<EORodItem> ROD_SILVER = registerRodItem("rod_silver", METAL);
    public static final DeferredItem<EORodItem> ROD_STEEL = registerRodItem("rod_steel", METAL);
    public static final DeferredItem<EORodItem> ROD_TIN = registerRodItem("rod_tin", METAL);
    public static final DeferredItem<EORodItem> ROD_TITANIUM = registerRodItem("rod_titanium", METAL);
    public static final DeferredItem<EORodItem> ROD_ULTIMATITANIUM = registerRodItem("rod_ultimatitanium", METAL);
    public static final DeferredItem<EORodItem> ROD_URANIUM = registerRodItem("rod_uranium", METAL);
    public static final DeferredItem<EORodItem> ROD_ZINC = registerRodItem("rod_zinc", METAL);
    public static final DeferredItem<EORodItem> ROD_CAST_IRON = registerRodItem("rod_cast_iron", METAL);
    public static final DeferredItem<EORodItem> ROD_CAST_STEEL = registerRodItem("rod_cast_steel", METAL);
    public static final DeferredItem<EORodItem> ROD_WROUGHT_IRON = registerRodItem("rod_wrought_iron", METAL);
    public static final DeferredItem<EORodItem> ROD_NETHERSTEEL = registerRodItem("rod_nethersteel", METAL);
    public static final DeferredItem<EORodItem> ROD_SHADOWSTEEL = registerRodItem("rod_shadowsteel", METAL);
    public static final DeferredItem<EORodItem> ROD_PIG_IRON = registerRodItem("rod_pig_iron", METAL);
    public static final DeferredItem<EORodItem> ROD_NECROTICARITE = registerRodItem("rod_necroticarite", GEM);
    public static final DeferredItem<EORodItem> ROD_CATALYRIUM = registerRodItem("rod_catalyrium", METAL);
    public static final DeferredItem<EORodItem> ROD_VOIDERITE = registerRodItem("rod_voiderite", GEM);
    public static final DeferredItem<EORodItem> ROD_QUANTIQUARITE = registerRodItem("rod_quantiquarite", GEM);
    public static final DeferredItem<EORodItem> ROD_TACHYARITE = registerRodItem("rod_tachyarite", GEM);
    public static final DeferredItem<EORodItem> ROD_TUNGSTEN = registerRodItem("rod_tungsten", METAL);

    //Plates
    /// Eternal Ores Plates
    public static final DeferredItem<EOPlateItem> PLATE_ALUMINUM = registerPlateItem("plate_aluminum", METAL);
    public static final DeferredItem<EOPlateItem> PLATE_ARDITE = registerPlateItem("plate_ardite", METAL);
    public static final DeferredItem<EOPlateItem> PLATE_BLUE_STEEL = registerPlateItem("plate_blue_steel", METAL);
    public static final DeferredItem<EOPlateItem> PLATE_BRASS = registerPlateItem("plate_brass", METAL);
    public static final DeferredItem<EOPlateItem> PLATE_BRONZE = registerPlateItem("plate_bronze", METAL);
    public static final DeferredItem<EOPlateItem> PLATE_COBALT = registerPlateItem("plate_cobalt", METAL);
    public static final DeferredItem<EOPlateItem> PLATE_CONSTANTAN = registerPlateItem("plate_constantan", METAL);
    public static final DeferredItem<EOPlateItem> PLATE_COPPER = registerPlateItem("plate_copper", METAL);
    public static final DeferredItem<EOPlateItem> PLATE_DIAMOND = registerPlateItem("plate_diamond", GEM);
    public static final DeferredItem<EOPlateItem> PLATE_ELECTRUM = registerPlateItem("plate_electrum", METAL);
    public static final DeferredItem<EOPlateItem> PLATE_ENDERIUM = registerPlateItem("plate_enderium", METAL);
    public static final DeferredItem<EOPlateItem> PLATE_GALLIUM = registerPlateItem("plate_gallium", METAL);
    public static final DeferredItem<EOPlateItem> PLATE_GOLD = registerPlateItem("plate_gold", METAL);
    public static final DeferredItem<EOPlateItem> PLATE_GRAPHITE = registerPlateItem("plate_graphite", MISC);
    public static final DeferredItem<EOPlateItem> PLATE_INVAR = registerPlateItem("plate_invar", METAL);
    public static final DeferredItem<EOPlateItem> PLATE_IRIDIUM = registerPlateItem("plate_iridium", METAL);
    public static final DeferredItem<EOPlateItem> PLATE_IRON = registerPlateItem("plate_iron", METAL);
    public static final DeferredItem<EOPlateItem> PLATE_LEAD = registerPlateItem("plate_lead", METAL);
    public static final DeferredItem<EOPlateItem> PLATE_LUMIUM = registerPlateItem("plate_lumium", METAL);
    public static final DeferredItem<EOPlateItem> PLATE_NETHERITE = registerPlateItem("plate_netherite", METAL);
    public static final DeferredItem<EOPlateItem> PLATE_NICKEL = registerPlateItem("plate_nickel", METAL);
    public static final DeferredItem<EOPlateItem> PLATE_OSMIUM = registerPlateItem("plate_osmium", METAL);
    public static final DeferredItem<EOPlateItem> PLATE_PLATINUM = registerPlateItem("plate_platinum", METAL);
    public static final DeferredItem<EOPlateItem> PLATE_PLUTONIUM = registerPlateItem("plate_plutonium", METAL);
    public static final DeferredItem<EOPlateItem> PLATE_ROSE_GOLD = registerPlateItem("plate_rose_gold", METAL);
    public static final DeferredItem<EOPlateItem> PLATE_SAPPHIRE = registerPlateItem("plate_sapphire", METAL);
    public static final DeferredItem<EOPlateItem> PLATE_SIGNALUM = registerPlateItem("plate_signalum", METAL);
    public static final DeferredItem<EOPlateItem> PLATE_SILVER = registerPlateItem("plate_silver", METAL);
    public static final DeferredItem<EOPlateItem> PLATE_STEEL = registerPlateItem("plate_steel", METAL);
    public static final DeferredItem<EOPlateItem> PLATE_TIN = registerPlateItem("plate_tin", METAL);
    public static final DeferredItem<EOPlateItem> PLATE_TITANIUM = registerPlateItem("plate_titanium", METAL);
    public static final DeferredItem<EOPlateItem> PLATE_ULTIMATITANIUM = registerPlateItem("plate_ultimatitanium", METAL);
    public static final DeferredItem<EOPlateItem> PLATE_URANIUM = registerPlateItem("plate_uranium", METAL);
    public static final DeferredItem<EOPlateItem> PLATE_ZINC = registerPlateItem("plate_zinc", METAL);
    public static final DeferredItem<EOPlateItem> PLATE_CAST_IRON = registerPlateItem("plate_cast_iron", METAL);
    public static final DeferredItem<EOPlateItem> PLATE_CAST_STEEL = registerPlateItem("plate_cast_steel", METAL);
    public static final DeferredItem<EOPlateItem> PLATE_WROUGHT_IRON = registerPlateItem("plate_wrought_iron", METAL);
    public static final DeferredItem<EOPlateItem> PLATE_NETHERSTEEL = registerPlateItem("plate_nethersteel", METAL);
    public static final DeferredItem<EOPlateItem> PLATE_SHADOWSTEEL = registerPlateItem("plate_shadowsteel", METAL);
    public static final DeferredItem<EOPlateItem> PLATE_PIG_IRON = registerPlateItem("plate_pig_iron", METAL);
    public static final DeferredItem<EOPlateItem> PLATE_NECROTICARITE = registerPlateItem("plate_necroticarite", GEM);
    public static final DeferredItem<EOPlateItem> PLATE_CATALYRIUM = registerPlateItem("plate_catalyrium", METAL);
    public static final DeferredItem<EOPlateItem> PLATE_VOIDERITE = registerPlateItem("plate_voiderite", GEM);
    public static final DeferredItem<EOPlateItem> PLATE_QUANTIQUARITE = registerPlateItem("plate_quantiquarite", GEM);
    public static final DeferredItem<EOPlateItem> PLATE_TACHYARITE = registerPlateItem("plate_tachyarite", GEM);
    public static final DeferredItem<EOPlateItem> PLATE_TUNGSTEN = registerPlateItem("plate_tungsten", METAL);

    //Gears
    /// Eternal Ores Plates
    public static final DeferredItem<EOGearItem> ULTIMATE_GEAR = registerGearItem("ultimate_gear", METAL);
    public static final DeferredItem<EOGearItem> GEAR_IRON = registerGearItem("gear_iron", METAL);
    public static final DeferredItem<EOGearItem> GEAR_COPPER = registerGearItem("gear_copper", METAL);
    public static final DeferredItem<EOGearItem> GEAR_TIN = registerGearItem("gear_tin", METAL);
    public static final DeferredItem<EOGearItem> GEAR_LEAD = registerGearItem("gear_lead", METAL);
    public static final DeferredItem<EOGearItem> GEAR_ENDERIUM = registerGearItem("gear_enderium", METAL);
    public static final DeferredItem<EOGearItem> GEAR_GOLD = registerGearItem("gear_gold", METAL);
    public static final DeferredItem<EOGearItem> GEAR_BRONZE = registerGearItem("gear_bronze", METAL);
    public static final DeferredItem<EOGearItem> GEAR_STEEL = registerGearItem("gear_steel", METAL);
    public static final DeferredItem<EOGearItem> GEAR_OSMIUM = registerGearItem("gear_osmium", METAL);
    public static final DeferredItem<EOGearItem> GEAR_DIAMOND = registerGearItem("gear_diamond", GEM);
    public static final DeferredItem<EOGearItem> GEAR_ALUMINUM = registerGearItem("gear_aluminum", METAL);
    public static final DeferredItem<EOGearItem> GEAR_NECROTICARITE = registerGearItem("gear_necroticarite", GEM);
    public static final DeferredItem<EOGearItem> GEAR_CATALYRIUM = registerGearItem("gear_catalyrium", METAL);
    public static final DeferredItem<EOGearItem> GEAR_VOIDERITE = registerGearItem("gear_voiderite", GEM);
    public static final DeferredItem<EOGearItem> GEAR_QUANTIQUARITE = registerGearItem("gear_quantiquarite", GEM);
    public static final DeferredItem<EOGearItem> GEAR_TACHYARITE = registerGearItem("gear_tachyarite", GEM);
    public static final DeferredItem<EOGearItem> GEAR_ARDITE = registerGearItem("gear_ardite", METAL);
    public static final DeferredItem<EOGearItem> GEAR_TUNGSTEN = registerGearItem("gear_tungsten", METAL);

    //Raw Ores
    /// Eternal Ores Raw Ores
    public static final DeferredItem<EORawMaterialItem> RAW_ALUMINUM = registerRawItem("raw_aluminum");
    public static final DeferredItem<EORawMaterialItem> RAW_ARDITE = registerRawItem("raw_ardite");
    public static final DeferredItem<EORawMaterialItem> RAW_COBALT = registerRawItem("raw_cobalt");
    public static final DeferredItem<EORawMaterialItem> RAW_GALLIUM = registerRawItem("raw_gallium");
    public static final DeferredItem<EORawMaterialItem> RAW_IRIDIUM = registerRawItem("raw_iridium");
    public static final DeferredItem<EORawMaterialItem> RAW_LEAD = registerRawItem("raw_lead");
    public static final DeferredItem<EORawMaterialItem> RAW_NICKEL = registerRawItem("raw_nickel");
    public static final DeferredItem<EORawMaterialItem> RAW_OSMIUM = registerRawItem("raw_osmium");
    public static final DeferredItem<EORawMaterialItem> RAW_PLATINUM = registerRawItem("raw_platinum");
    public static final DeferredItem<EORawMaterialItem> RAW_PLUTONIUM = registerRawItem("raw_plutonium");
    public static final DeferredItem<EORawMaterialItem> RAW_SILVER = registerRawItem("raw_silver");
    public static final DeferredItem<EORawMaterialItem> RAW_TIN = registerRawItem("raw_tin");
    public static final DeferredItem<EORawMaterialItem> RAW_ULTIMATITANIUM = registerRawItem("raw_ultimatitanium");
    public static final DeferredItem<EORawMaterialItem> RAW_URANIUM = registerRawItem("raw_uranium");
    public static final DeferredItem<EORawMaterialItem> RAW_ZINC = registerRawItem("raw_zinc");
    public static final DeferredItem<EORawMaterialItem> SULFUR = registerRawItem("sulfur");
    public static final DeferredItem<EORawMaterialItem> RAW_URANINITE = registerRawItem("raw_uraninite");
    public static final DeferredItem<EORawMaterialItem> RAW_CATALYRIUM = registerRawItem("raw_catalyrium");
    public static final DeferredItem<EORawMaterialItem> RAW_TUNGSTEN = registerRawItem("raw_tungsten");

    //Dusts
    /// Eternal Ores Dusts
    public static final DeferredItem<EODustItem> ALUMINUM_DUST = registerDustItem("aluminum_dust", METAL);
    public static final DeferredItem<EODustItem> ARDITE_DUST = registerDustItem("ardite_dust", METAL);
    public static final DeferredItem<EODustItem> AMBER_DUST = registerDustItem("amber_dust", GEM);
    public static final DeferredItem<EODustItem> APATITE_DUST = registerDustItem("apatite_dust", GEM);
    public static final DeferredItem<EODustItem> BLUE_STEEL_DUST = registerDustItem("blue_steel_dust", METAL);
    public static final DeferredItem<EODustItem> BRASS_DUST = registerDustItem("brass_dust", METAL);
    public static final DeferredItem<EODustItem> BRITANNIA_SILVER_DUST = registerDustItem("britannia_silver_dust", METAL);
    public static final DeferredItem<EODustItem> BRONZE_DUST = registerDustItem("bronze_dust", METAL);
    public static final DeferredItem<EODustItem> CINNABAR_DUST = registerDustItem("cinnabar_dust", GEM);
    public static final DeferredItem<EODustItem> COAL_DUST = registerDustItem("coal_dust", GEM);
    public static final DeferredItem<EODustItem> COBALT_DUST = registerDustItem("cobalt_dust", METAL);
    public static final DeferredItem<EODustItem> CONSTANTAN_DUST = registerDustItem("constantan_dust", METAL);
    public static final DeferredItem<EODustItem> COPPER_DUST = registerDustItem("copper_dust", METAL);
    public static final DeferredItem<EODustItem> DIAMOND_DUST = registerDustItem("diamond_dust", GEM);
    public static final DeferredItem<EODustItem> ELECTRUM_DUST = registerDustItem("electrum_dust", METAL);
    public static final DeferredItem<EODustItem> EMERALD_DUST = registerDustItem("emerald_dust", GEM);
    public static final DeferredItem<EODustItem> ENDER_DUST = registerDustItem("ender_dust", MISC);
    public static final DeferredItem<EODustItem> ENDERIUM_DUST = registerDustItem("enderium_dust", METAL);
    public static final DeferredItem<EODustItem> ENDSTONE_DUST = registerDustItem("endstone_dust", STONE);
    public static final DeferredItem<EODustItem> FLUORITE_DUST = registerDustItem("fluorite_dust", GEM);
    public static final DeferredItem<EODustItem> GALLIUM_DUST = registerDustItem("gallium_dust", METAL);
    public static final DeferredItem<EODustItem> GOLD_DUST = registerDustItem("gold_dust", METAL);
    public static final DeferredItem<EODustItem> GRAPHITE_DUST = registerDustItem("graphite_dust", MISC);
    public static final DeferredItem<EODustItem> INVAR_DUST = registerDustItem("invar_dust", METAL);
    public static final DeferredItem<EODustItem> IRIDIUM_DUST = registerDustItem("iridium_dust", METAL);
    public static final DeferredItem<EODustItem> IRON_DUST = registerDustItem("iron_dust", METAL);
    public static final DeferredItem<EODustItem> LAPIS_LAZULI_DUST = registerDustItem("lapis_lazuli_dust", GEM);
    public static final DeferredItem<EODustItem> LEAD_DUST = registerDustItem("lead_dust", METAL);
    public static final DeferredItem<EODustItem> LUMIUM_DUST = registerDustItem("lumium_dust", METAL);
    public static final DeferredItem<EODustItem> NETHERITE_DUST = registerDustItem("netherite_dust", METAL);
    public static final DeferredItem<EODustItem> NETHERRACK_DUST = registerDustItem("netherrack_dust", STONE);
    public static final DeferredItem<EODustItem> NICKEL_DUST = registerDustItem("nickel_dust", METAL);
    public static final DeferredItem<EODustItem> NITER_DUST = registerDustItem("niter_dust", GEM);
    public static final DeferredItem<EODustItem> OBSIDIAN_DUST = registerDustItem("obsidian_dust", GEM);
    public static final DeferredItem<EODustItem> ONYX_DUST = registerDustItem("onyx_dust", GEM);
    public static final DeferredItem<EODustItem> OSMIUM_DUST = registerDustItem("osmium_dust", METAL);
    public static final DeferredItem<EODustItem> PEWTER_DUST = registerDustItem("pewter_dust", METAL);
    public static final DeferredItem<EODustItem> PERIDOT_DUST = registerDustItem("peridot_dust", GEM);
    public static final DeferredItem<EODustItem> PLATINUM_DUST = registerDustItem("platinum_dust", METAL);
    public static final DeferredItem<EODustItem> PLUTONIUM_DUST = registerDustItem("plutonium_dust", METAL);
    public static final DeferredItem<EODustItem> QUARTZ_DUST = registerDustItem("quartz_dust", GEM);
    public static final DeferredItem<EODustItem> ROSE_GOLD_DUST = registerDustItem("rose_gold_dust", METAL);
    public static final DeferredItem<EODustItem> RUBY_DUST = registerDustItem("ruby_dust", GEM);
    public static final DeferredItem<EODustItem> SAPPHIRE_DUST = registerDustItem("sapphire_dust", GEM);
    public static final DeferredItem<EODustItem> SILVER_DUST = registerDustItem("silver_dust", METAL);
    public static final DeferredItem<EODustItem> SIGNALUM_DUST = registerDustItem("signalum_dust", METAL);
    public static final DeferredItem<EODustItem> STEEL_DUST = registerDustItem("steel_dust", METAL);
    public static final DeferredItem<EODustItem> SULFUR_DUST = registerDustItem("sulfur_dust", MISC);
    public static final DeferredItem<EODustItem> TIN_DUST = registerDustItem("tin_dust", METAL);
    public static final DeferredItem<EODustItem> TITANIUM_DUST = registerDustItem("titanium_dust", METAL);
    public static final DeferredItem<EODustItem> ULTIMATITANIUM_DUST = registerDustItem("ultimatitanium_dust", METAL);
    public static final DeferredItem<EODustItem> URANIUM_DUST = registerDustItem("uranium_dust", METAL);
    public static final DeferredItem<EODustItem> ZINC_DUST = registerDustItem("zinc_dust", METAL);
    public static final DeferredItem<EODustItem> CAST_IRON_DUST = registerDustItem("cast_iron_dust", METAL);
    public static final DeferredItem<EODustItem> URANINITE_DUST = registerDustItem("uraninite_dust", METAL);
    public static final DeferredItem<EODustItem> CAST_STEEL_DUST = registerDustItem("cast_steel_dust", METAL);
    public static final DeferredItem<EODustItem> WROUGHT_IRON_DUST = registerDustItem("wrought_iron_dust", METAL);
    public static final DeferredItem<EODustItem> NETHERSTEEL_DUST = registerDustItem("nethersteel_dust", METAL);
    public static final DeferredItem<EODustItem> SHADOWSTEEL_DUST = registerDustItem("shadowsteel_dust", METAL);
    public static final DeferredItem<EODustItem> PIG_IRON_DUST = registerDustItem("pig_iron_dust", METAL);
    public static final DeferredItem<EODustItem> NECROTICARITE_DUST = registerDustItem("necroticarite_dust", GEM);
    public static final DeferredItem<EODustItem> SCULK_DUST = registerDustItem("sculk_dust", MISC);
    public static final DeferredItem<EODustItem> AMETHYST_DUST = registerDustItem("amethyst_dust", GEM);
    public static final DeferredItem<EODustItem> NETHER_STAR_DUST = registerDustItem("nether_star_dust", MISC);
    public static final DeferredItem<EODustItem> CATALYRIUM_DUST = registerDustItem("catalyrium_dust", METAL);
    public static final DeferredItem<EODustItem> VOIDERITE_DUST = registerDustItem("voiderite_dust", GEM);
    public static final DeferredItem<EODustItem> QUANTIQUARITE_DUST = registerDustItem("quantiquarite_dust", GEM);
    public static final DeferredItem<EODustItem> TACHYARITE_DUST = registerDustItem("tachyarite_dust", METAL);
    public static final DeferredItem<EODustItem> TUNGSTEN_DUST = registerDustItem("tungsten_dust", METAL);
    public static final DeferredItem<EODustItem> CARBON_BLEND = registerDustItem("carbon_blend", MISC);
    public static final DeferredItem<EODustItem> ENERGETIC_BLEND = registerDustItem("energetic_blend", MISC);
    public static final DeferredItem<EODustItem> ENDERGETIC_BLEND = registerDustItem("endergetic_blend", MISC);
    public static final DeferredItem<EODustItem> SILICON_DUST = registerDustItem("silicon_dust", MISC);
    public static final DeferredItem<EODustItem> PRISMARINE_DUST = registerDustItem("prismarine_dust", GEM);

    //Gems
    /// Eternal Ores Gems
    public static final DeferredItem<EOGemItem> GEM_ONYX = registerGemItem("gem_onyx");
    public static final DeferredItem<EOGemItem> GEM_PERIDOT = registerGemItem("gem_peridot");
    public static final DeferredItem<EOGemItem> GEM_RUBY = registerGemItem("gem_ruby");
    public static final DeferredItem<EOGemItem> GEM_SAPPHIRE = registerGemItem("gem_sapphire");
    public static final DeferredItem<EOGemItem> FLUORITE = registerGemItem("fluorite");
    public static final DeferredItem<EOGemItem> GEM_APATITE = registerGemItem("gem_apatite");
    public static final DeferredItem<EOGemItem> GEM_CINNABAR = registerGemItem("gem_cinnabar");
    public static final DeferredItem<EOGemItem> GEM_AMBER = registerGemItem("gem_amber");
    public static final DeferredItem<EOGemItem> GEM_NITER = registerGemItem("gem_niter");
    public static final DeferredItem<EOGemItem> GEM_TACHYARITE = registerGemItem("gem_tachyarite");
    public static final DeferredItem<EOGemItem> GEM_VOIDERITE = registerGemItem("gem_voiderite");
    public static final DeferredItem<EOGemItem> GEM_QUANTIQUARITE = registerGemItem("gem_quantiquarite");
    public static final DeferredItem<EOGemItem> GEM_NECROTICARITE = registerGemItem("gem_necroticarite");
    public static final DeferredItem<EOGemItem> GEM_OBSIDIAN_SHARD = registerGemItem("gem_obsidian");

    //Gem Shard (this might get removed)
    public static final DeferredItem<Item> GEM_SAPPHIRE_SHARD = ITEMS.register("gem_sapphire_shard",
            ()-> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
