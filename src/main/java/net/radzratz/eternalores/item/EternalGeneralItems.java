package net.radzratz.eternalores.item;

import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.item.tools.EternalGemCutter;
import net.radzratz.eternalores.item.tools.EternalHammers;

@SuppressWarnings("all")
public class EternalGeneralItems
{
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EternalOres.MOD_ID);

    //Hammers
    private static DeferredItem<Item> registerHammer(String name, int durability)
    {
        return ITEMS.register(name, () -> new EternalHammers(new Item.Properties(), durability));
    }
    public static final DeferredItem<Item> COBALT_HAMMER = registerHammer("cobalt_hammer", 1024);
    public static final DeferredItem<Item> COPPER_HAMMER = registerHammer("copper_hammer",128);
    public static final DeferredItem<Item> STONE_HAMMER = registerHammer("stone_hammer",64);
    public static final DeferredItem<Item> DIAMOND_HAMMER = registerHammer("diamond_hammer",512);
    public static final DeferredItem<Item> IRON_HAMMER = registerHammer("iron_hammer",256);

    //Gem Cutter
    private static DeferredItem<Item> registerGemCutter(String name, int durability)
    {
        return ITEMS.register(name, () -> new EternalGemCutter(new Item.Properties(), durability));
    }
    public static final DeferredItem<Item> IRON_GEM_CUTTER = registerGemCutter("iron_gem_cutter",256);

    //Misc Items
    private static DeferredItem<Item> registerMiscItem(String name)
    {
        return ITEMS.register(name, () -> new Item(new Item.Properties()));
    }
    public static final DeferredItem<Item> SILICON = registerMiscItem("silicon");

    //Ingots
    private static DeferredItem<Item> registerIngotItem(String name)
    {
        return ITEMS.register(name, () -> new Item(new Item.Properties()));
    }
    public static final DeferredItem<Item> ALUMINUM_INGOT = registerIngotItem("aluminum_ingot");
    public static final DeferredItem<Item> BLUE_STEEL_INGOT = registerIngotItem("blue_steel_ingot");
    public static final DeferredItem<Item> BRASS_INGOT = registerIngotItem("brass_ingot");
    public static final DeferredItem<Item> BRITANNIA_SILVER_INGOT = registerIngotItem("britannia_silver_ingot");
    public static final DeferredItem<Item> BRONZE_INGOT = registerIngotItem("bronze_ingot");
    public static final DeferredItem<Item> COBALT_INGOT = registerIngotItem("cobalt_ingot");
    public static final DeferredItem<Item> CONSTANTAN_INGOT = registerIngotItem("constantan_ingot");
    public static final DeferredItem<Item> ELECTRUM_INGOT = registerIngotItem("electrum_ingot");
    public static final DeferredItem<Item> ENDERIUM_INGOT = registerIngotItem("enderium_ingot");
    public static final DeferredItem<Item> ETERNAL_DARK_INGOT = registerIngotItem("eternal_dark_ingot");
    public static final DeferredItem<Item> ETERNAL_LIGHT_INGOT = registerIngotItem("eternal_light_ingot");
    public static final DeferredItem<Item> GALLIUM_INGOT = registerIngotItem("gallium_ingot");
    public static final DeferredItem<Item> GRAPHITE_INGOT = registerIngotItem("graphite_ingot");
    public static final DeferredItem<Item> INVAR_INGOT = registerIngotItem("invar_ingot");
    public static final DeferredItem<Item> IRIDIUM_INGOT = registerIngotItem("iridium_ingot");
    public static final DeferredItem<Item> LEAD_INGOT = registerIngotItem("lead_ingot");
    public static final DeferredItem<Item> LUMIUM_INGOT = registerIngotItem("lumium_ingot");
    public static final DeferredItem<Item> NICKEL_INGOT = registerIngotItem("nickel_ingot");
    public static final DeferredItem<Item> OSMIUM_INGOT = registerIngotItem("osmium_ingot");
    public static final DeferredItem<Item> PEWTER_INGOT = registerIngotItem("pewter_ingot");
    public static final DeferredItem<Item> PLATINUM_INGOT = registerIngotItem("platinum_ingot");
    public static final DeferredItem<Item> PLUTONIUM_INGOT = registerIngotItem("plutonium_ingot");
    public static final DeferredItem<Item> REDSTONE_INGOT = registerIngotItem("redstone_ingot");
    public static final DeferredItem<Item> ROSE_GOLD_INGOT = registerIngotItem("rose_gold_ingot");
    public static final DeferredItem<Item> SIGNALUM_INGOT = registerIngotItem("signalum_ingot");
    public static final DeferredItem<Item> SILVER_INGOT = registerIngotItem("silver_ingot");
    public static final DeferredItem<Item> STEEL_INGOT = registerIngotItem("steel_ingot");
    public static final DeferredItem<Item> TIN_INGOT = registerIngotItem("tin_ingot");
    public static final DeferredItem<Item> TITANIUM_INGOT = registerIngotItem("titanium_ingot");
    public static final DeferredItem<Item> ULTIMATITANIUM_INGOT = registerIngotItem("ultimatitanium_ingot");
    public static final DeferredItem<Item> URANIUM_INGOT = registerIngotItem("uranium_ingot");
    public static final DeferredItem<Item> ZINC_INGOT = registerIngotItem("zinc_ingot");
    public static final DeferredItem<Item> CAST_IRON_INGOT = registerIngotItem("cast_iron_ingot");
    public static final DeferredItem<Item> URANINITE_INGOT = registerIngotItem("uraninite_ingot");
    public static final DeferredItem<Item> CAST_STEEL_INGOT = registerIngotItem("cast_steel_ingot");
    public static final DeferredItem<Item> WROUGHT_IRON_INGOT = registerIngotItem("wrought_iron_ingot");
    public static final DeferredItem<Item> NETHERSTEEL_INGOT = registerIngotItem("nethersteel_ingot");
    public static final DeferredItem<Item> SHADOWSTEEL_INGOT = registerIngotItem("shadowsteel_ingot");
    public static final DeferredItem<Item> PIG_IRON_INGOT = registerIngotItem("pig_iron_ingot");
    public static final DeferredItem<Item> MISSING_INGOT = registerIngotItem("missing_ingot");
    public static final DeferredItem<Item> CATALYRIUM_INGOT = registerIngotItem("catalyrium_ingot");

    //Nuggets
    private static DeferredItem<Item> registerNuggetItem(String name)
    {
        return ITEMS.register(name, () -> new Item(new Item.Properties()));
    }
    public static final DeferredItem<Item> ALUMINUM_NUGGET = registerNuggetItem("aluminum_nugget");
    public static final DeferredItem<Item> BLUE_STEEL_NUGGET = registerNuggetItem("blue_steel_nugget");
    public static final DeferredItem<Item> BRASS_NUGGET = registerNuggetItem("brass_nugget");
    public static final DeferredItem<Item> BRITANNIA_SILVER_NUGGET = registerNuggetItem("britannia_silver_nugget");
    public static final DeferredItem<Item> BRONZE_NUGGET = registerNuggetItem("bronze_nugget");
    public static final DeferredItem<Item> COBALT_NUGGET = registerNuggetItem("cobalt_nugget");
    public static final DeferredItem<Item> CONSTANTAN_NUGGET = registerNuggetItem("constantan_nugget");
    public static final DeferredItem<Item> COPPER_NUGGET = registerNuggetItem("copper_nugget");
    public static final DeferredItem<Item> ELECTRUM_NUGGET = registerNuggetItem("electrum_nugget");
    public static final DeferredItem<Item> ENDERIUM_NUGGET = registerNuggetItem("enderium_nugget");
    public static final DeferredItem<Item> GALLIUM_NUGGET = registerNuggetItem("gallium_nugget");
    public static final DeferredItem<Item> GRAPHITE_NUGGET = registerNuggetItem("graphite_nugget");
    public static final DeferredItem<Item> INVAR_NUGGET = registerNuggetItem("invar_nugget");
    public static final DeferredItem<Item> IRIDIUM_NUGGET = registerNuggetItem("iridium_nugget");
    public static final DeferredItem<Item> LEAD_NUGGET = registerNuggetItem("lead_nugget");
    public static final DeferredItem<Item> LUMIUM_NUGGET = registerNuggetItem("lumium_nugget");
    public static final DeferredItem<Item> NETHERITE_NUGGET = registerNuggetItem("netherite_nugget");
    public static final DeferredItem<Item> NICKEL_NUGGET = registerNuggetItem("nickel_nugget");
    public static final DeferredItem<Item> OSMIUM_NUGGET = registerNuggetItem("osmium_nugget");
    public static final DeferredItem<Item> PEWTER_NUGGET = registerNuggetItem("pewter_nugget");
    public static final DeferredItem<Item> PLATINUM_NUGGET = registerNuggetItem("platinum_nugget");
    public static final DeferredItem<Item> PLUTONIUM_NUGGET = registerNuggetItem("plutonium_nugget");
    public static final DeferredItem<Item> ROSE_GOLD_NUGGET = registerNuggetItem("rose_gold_nugget");
    public static final DeferredItem<Item> SIGNALUM_NUGGET = registerNuggetItem("signalum_nugget");
    public static final DeferredItem<Item> SILVER_NUGGET = registerNuggetItem("silver_nugget");
    public static final DeferredItem<Item> STEEL_NUGGET = registerNuggetItem("steel_nugget");
    public static final DeferredItem<Item> TIN_NUGGET = registerNuggetItem("tin_nugget");
    public static final DeferredItem<Item> TITANIUM_NUGGET = registerNuggetItem("titanium_nugget");
    public static final DeferredItem<Item> ULTIMATITANIUM_NUGGET = registerNuggetItem("ultimatitanium_nugget");
    public static final DeferredItem<Item> URANIUM_NUGGET = registerNuggetItem("uranium_nugget");
    public static final DeferredItem<Item> ZINC_NUGGET = registerNuggetItem("zinc_nugget");
    public static final DeferredItem<Item> CAST_IRON_NUGGET = registerNuggetItem("cast_iron_nugget");
    public static final DeferredItem<Item> URANINITE_NUGGET = registerNuggetItem("uraninite_nugget");
    public static final DeferredItem<Item> CAST_STEEL_NUGGET = registerNuggetItem("cast_steel_nugget");
    public static final DeferredItem<Item> WROUGHT_IRON_NUGGET = registerNuggetItem("wrought_iron_nugget");
    public static final DeferredItem<Item> NETHERSTEEL_NUGGET = registerNuggetItem("nethersteel_nugget");
    public static final DeferredItem<Item> SHADOWSTEEL_NUGGET = registerNuggetItem("shadowsteel_nugget");
    public static final DeferredItem<Item> PIG_IRON_NUGGET = registerNuggetItem("pig_iron_nugget");
    public static final DeferredItem<Item> CATALYRIUM_NUGGET = registerNuggetItem("catalyrium_nugget");

    //Rods
    private static DeferredItem<Item> registerRodItem(String name)
    {
        return ITEMS.register(name, () -> new Item(new Item.Properties()));
    }
    public static final DeferredItem<Item> ROD_ALUMINUM = registerRodItem("rod_aluminum");
    public static final DeferredItem<Item> ROD_BLUE_STEEL = registerRodItem("rod_blue_steel");
    public static final DeferredItem<Item> ROD_BRASS = registerRodItem("rod_brass");
    public static final DeferredItem<Item> ROD_BRONZE = registerRodItem("rod_bronze");
    public static final DeferredItem<Item> ROD_COBALT = registerRodItem("rod_cobalt");
    public static final DeferredItem<Item> ROD_CONSTANTAN = registerRodItem("rod_constantan");
    public static final DeferredItem<Item> ROD_COPPER = registerRodItem("rod_copper");
    public static final DeferredItem<Item> ROD_DIAMOND = registerRodItem("rod_diamond");
    public static final DeferredItem<Item> ROD_ELECTRUM = registerRodItem("rod_electrum");
    public static final DeferredItem<Item> ROD_ENDERIUM = registerRodItem("rod_enderium");
    public static final DeferredItem<Item> ROD_GALLIUM = registerRodItem("rod_gallium");
    public static final DeferredItem<Item> ROD_GOLD = registerRodItem("rod_gold");
    public static final DeferredItem<Item> ROD_GRAPHITE = registerRodItem("rod_graphite");
    public static final DeferredItem<Item> ROD_INVAR = registerRodItem("rod_invar");
    public static final DeferredItem<Item> ROD_IRIDIUM = registerRodItem("rod_iridium");
    public static final DeferredItem<Item> ROD_IRON = registerRodItem("rod_iron");
    public static final DeferredItem<Item> ROD_LEAD = registerRodItem("rod_lead");
    public static final DeferredItem<Item> ROD_LUMIUM = registerRodItem("rod_lumium");
    public static final DeferredItem<Item> ROD_NETHERITE = registerRodItem("rod_netherite");
    public static final DeferredItem<Item> ROD_NICKEL = registerRodItem("rod_nickel");
    public static final DeferredItem<Item> ROD_OSMIUM = registerRodItem("rod_osmium");
    public static final DeferredItem<Item> ROD_PLATINUM = registerRodItem("rod_platinum");
    public static final DeferredItem<Item> ROD_PLUTONIUM = registerRodItem("rod_plutonium");
    public static final DeferredItem<Item> ROD_ROSE_GOLD = registerRodItem("rod_rose_gold");
    public static final DeferredItem<Item> ROD_SAPPHIRE = registerRodItem("rod_sapphire");
    public static final DeferredItem<Item> ROD_SIGNALUM = registerRodItem("rod_signalum");
    public static final DeferredItem<Item> ROD_SILVER = registerRodItem("rod_silver");
    public static final DeferredItem<Item> ROD_STEEL = registerRodItem("rod_steel");
    public static final DeferredItem<Item> ROD_TIN = registerRodItem("rod_tin");
    public static final DeferredItem<Item> ROD_TITANIUM = registerRodItem("rod_titanium");
    public static final DeferredItem<Item> ROD_ULTIMATITANIUM = registerRodItem("rod_ultimatitanium");
    public static final DeferredItem<Item> ROD_URANIUM = registerRodItem("rod_uranium");
    public static final DeferredItem<Item> ROD_ZINC = registerRodItem("rod_zinc");
    public static final DeferredItem<Item> ROD_CAST_IRON = registerRodItem("rod_cast_iron");
    public static final DeferredItem<Item> ROD_CAST_STEEL = registerRodItem("rod_cast_steel");
    public static final DeferredItem<Item> ROD_WROUGHT_IRON = registerRodItem("rod_wrought_iron");
    public static final DeferredItem<Item> ROD_NETHERSTEEL = registerRodItem("rod_nethersteel");
    public static final DeferredItem<Item> ROD_SHADOWSTEEL = registerRodItem("rod_shadowsteel");
    public static final DeferredItem<Item> ROD_PIG_IRON = registerRodItem("rod_pig_iron");
    public static final DeferredItem<Item> ROD_NECROTICARITE = registerRodItem("rod_necroticarite");
    public static final DeferredItem<Item> ROD_CATALYRIUM = registerRodItem("rod_catalyrium");

    //Plates
    private static DeferredItem<Item> registerPlateItem(String name)
    {
        return ITEMS.register(name, () -> new Item(new Item.Properties()));
    }
    public static final DeferredItem<Item> PLATE_ALUMINUM = registerPlateItem("plate_aluminum");
    public static final DeferredItem<Item> PLATE_BLUE_STEEL = registerPlateItem("plate_blue_steel");
    public static final DeferredItem<Item> PLATE_BRASS = registerPlateItem("plate_brass");
    public static final DeferredItem<Item> PLATE_BRONZE = registerPlateItem("plate_bronze");
    public static final DeferredItem<Item> PLATE_COBALT = registerPlateItem("plate_cobalt");
    public static final DeferredItem<Item> PLATE_CONSTANTAN = registerPlateItem("plate_constantan");
    public static final DeferredItem<Item> PLATE_COPPER = registerPlateItem("plate_copper");
    public static final DeferredItem<Item> PLATE_DIAMOND = registerPlateItem("plate_diamond");
    public static final DeferredItem<Item> PLATE_ELECTRUM = registerPlateItem("plate_electrum");
    public static final DeferredItem<Item> PLATE_ENDERIUM = registerPlateItem("plate_enderium");
    public static final DeferredItem<Item> PLATE_GALLIUM = registerPlateItem("plate_gallium");
    public static final DeferredItem<Item> PLATE_GOLD = registerPlateItem("plate_gold");
    public static final DeferredItem<Item> PLATE_GRAPHITE = registerPlateItem("plate_graphite");
    public static final DeferredItem<Item> PLATE_INVAR = registerPlateItem("plate_invar");
    public static final DeferredItem<Item> PLATE_IRIDIUM = registerPlateItem("plate_iridium");
    public static final DeferredItem<Item> PLATE_IRON = registerPlateItem("plate_iron");
    public static final DeferredItem<Item> PLATE_LEAD = registerPlateItem("plate_lead");
    public static final DeferredItem<Item> PLATE_LUMIUM = registerPlateItem("plate_lumium");
    public static final DeferredItem<Item> PLATE_NETHERITE = registerPlateItem("plate_netherite");
    public static final DeferredItem<Item> PLATE_NICKEL = registerPlateItem("plate_nickel");
    public static final DeferredItem<Item> PLATE_OSMIUM = registerPlateItem("plate_osmium");
    public static final DeferredItem<Item> PLATE_PLATINUM = registerPlateItem("plate_platinum");
    public static final DeferredItem<Item> PLATE_PLUTONIUM = registerPlateItem("plate_plutonium");
    public static final DeferredItem<Item> PLATE_ROSE_GOLD = registerPlateItem("plate_rose_gold");
    public static final DeferredItem<Item> PLATE_SAPPHIRE = registerPlateItem("plate_sapphire");
    public static final DeferredItem<Item> PLATE_SIGNALUM = registerPlateItem("plate_signalum");
    public static final DeferredItem<Item> PLATE_SILVER = registerPlateItem("plate_silver");
    public static final DeferredItem<Item> PLATE_STEEL = registerPlateItem("plate_steel");
    public static final DeferredItem<Item> PLATE_TIN = registerPlateItem("plate_tin");
    public static final DeferredItem<Item> PLATE_TITANIUM = registerPlateItem("plate_titanium");
    public static final DeferredItem<Item> PLATE_ULTIMATITANIUM = registerPlateItem("plate_ultimatitanium");
    public static final DeferredItem<Item> PLATE_URANIUM = registerPlateItem("plate_uranium");
    public static final DeferredItem<Item> PLATE_ZINC = registerPlateItem("plate_zinc");
    public static final DeferredItem<Item> PLATE_CAST_IRON = registerPlateItem("plate_cast_iron");
    public static final DeferredItem<Item> PLATE_CAST_STEEL = registerPlateItem("plate_cast_steel");
    public static final DeferredItem<Item> PLATE_WROUGHT_IRON = registerPlateItem("plate_wrought_iron");
    public static final DeferredItem<Item> PLATE_NETHERSTEEL = registerPlateItem("plate_nethersteel");
    public static final DeferredItem<Item> PLATE_SHADOWSTEEL = registerPlateItem("plate_shadowsteel");
    public static final DeferredItem<Item> PLATE_PIG_IRON = registerPlateItem("plate_pig_iron");
    public static final DeferredItem<Item> PLATE_NECROTICARITE = registerPlateItem("plate_necroticarite");
    public static final DeferredItem<Item> PLATE_CATALYRIUM = registerPlateItem("plate_catalyrium");

    //Gears
    private static DeferredItem<Item> registerGearItem(String name)
    {
        return ITEMS.register(name, () -> new Item(new Item.Properties()));
    }
    public static final DeferredItem<Item> ULTIMATE_GEAR = registerGearItem("ultimate_gear");
    public static final DeferredItem<Item> GEAR_IRON = registerGearItem("gear_iron");
    public static final DeferredItem<Item> GEAR_COPPER = registerGearItem("gear_copper");
    public static final DeferredItem<Item> GEAR_TIN = registerGearItem("gear_tin");
    public static final DeferredItem<Item> GEAR_LEAD = registerGearItem("gear_lead");
    public static final DeferredItem<Item> GEAR_ENDERIUM = registerGearItem("gear_enderium");
    public static final DeferredItem<Item> GEAR_GOLD = registerGearItem("gear_gold");
    public static final DeferredItem<Item> GEAR_BRONZE = registerGearItem("gear_bronze");
    public static final DeferredItem<Item> GEAR_STEEL = registerGearItem("gear_steel");
    public static final DeferredItem<Item> GEAR_OSMIUM = registerGearItem("gear_osmium");
    public static final DeferredItem<Item> GEAR_DIAMOND = registerGearItem("gear_diamond");
    public static final DeferredItem<Item> GEAR_ALUMINUM = registerGearItem("gear_aluminum");
    public static final DeferredItem<Item> GEAR_NECROTICARITE = registerGearItem("gear_necroticarite");
    public static final DeferredItem<Item> GEAR_CATALYRIUM = registerGearItem("gear_catalyrium");

    //Raw Ores
    private static DeferredItem<Item> registerRawItem(String name)
    {
        return ITEMS.register(name, () -> new Item(new Item.Properties()));
    }
    public static final DeferredItem<Item> RAW_ALUMINUM = registerRawItem("raw_aluminum");
    public static final DeferredItem<Item> RAW_COBALT = registerRawItem("raw_cobalt");
    public static final DeferredItem<Item> RAW_GALLIUM = registerRawItem("raw_gallium");
    public static final DeferredItem<Item> RAW_IRIDIUM = registerRawItem("raw_iridium");
    public static final DeferredItem<Item> RAW_LEAD = registerRawItem("raw_lead");
    public static final DeferredItem<Item> RAW_NICKEL = registerRawItem("raw_nickel");
    public static final DeferredItem<Item> RAW_OSMIUM = registerRawItem("raw_osmium");
    public static final DeferredItem<Item> RAW_PLATINUM = registerRawItem("raw_platinum");
    public static final DeferredItem<Item> RAW_PLUTONIUM = registerRawItem("raw_plutonium");
    public static final DeferredItem<Item> RAW_SILVER = registerRawItem("raw_silver");
    public static final DeferredItem<Item> RAW_TIN = registerRawItem("raw_tin");
    public static final DeferredItem<Item> RAW_ULTIMATITANIUM = registerRawItem("raw_ultimatitanium");
    public static final DeferredItem<Item> RAW_URANIUM = registerRawItem("raw_uranium");
    public static final DeferredItem<Item> RAW_ZINC = registerRawItem("raw_zinc");
    public static final DeferredItem<Item> SULFUR = registerRawItem("sulfur");
    public static final DeferredItem<Item> RAW_URANINITE = registerRawItem("raw_uraninite");
    public static final DeferredItem<Item> RAW_CATALYRIUM = registerRawItem("raw_catalyrium");

    //Ore Dust
    private static DeferredItem<Item> registerDustItem(String name)
    {
        return ITEMS.register(name, () -> new Item(new Item.Properties()));
    }
    public static final DeferredItem<Item> ALUMINUM_DUST = registerDustItem("aluminum_dust");
    public static final DeferredItem<Item> AMBER_DUST = registerDustItem("amber_dust");
    public static final DeferredItem<Item> APATITE_DUST = registerDustItem("apatite_dust");
    public static final DeferredItem<Item> BLUE_STEEL_DUST = registerDustItem("blue_steel_dust");
    public static final DeferredItem<Item> BRASS_DUST = registerDustItem("brass_dust");
    public static final DeferredItem<Item> BRITANNIA_SILVER_DUST = registerDustItem("britannia_silver_dust");
    public static final DeferredItem<Item> BRONZE_DUST = registerDustItem("bronze_dust");
    public static final DeferredItem<Item> CINNABAR_DUST = registerDustItem("cinnabar_dust");
    public static final DeferredItem<Item> COAL_DUST = registerDustItem("coal_dust");
    public static final DeferredItem<Item> COBALT_DUST = registerDustItem("cobalt_dust");
    public static final DeferredItem<Item> CONSTANTAN_DUST = registerDustItem("constantan_dust");
    public static final DeferredItem<Item> COPPER_DUST = registerDustItem("copper_dust");
    public static final DeferredItem<Item> DIAMOND_DUST = registerDustItem("diamond_dust");
    public static final DeferredItem<Item> ELECTRUM_DUST = registerDustItem("electrum_dust");
    public static final DeferredItem<Item> EMERALD_DUST = registerDustItem("emerald_dust");
    public static final DeferredItem<Item> ENDER_DUST = registerDustItem("ender_dust");
    public static final DeferredItem<Item> ENDERIUM_DUST = registerDustItem("enderium_dust");
    public static final DeferredItem<Item> ENDSTONE_DUST = registerDustItem("endstone_dust");
    public static final DeferredItem<Item> FLUORITE_DUST = registerDustItem("fluorite_dust");
    public static final DeferredItem<Item> GALLIUM_DUST = registerDustItem("gallium_dust");
    public static final DeferredItem<Item> GOLD_DUST = registerDustItem("gold_dust");
    public static final DeferredItem<Item> GRAPHITE_DUST = registerDustItem("graphite_dust");
    public static final DeferredItem<Item> INVAR_DUST = registerDustItem("invar_dust");
    public static final DeferredItem<Item> IRIDIUM_DUST = registerDustItem("iridium_dust");
    public static final DeferredItem<Item> IRON_DUST = registerDustItem("iron_dust");
    public static final DeferredItem<Item> LAPIS_LAZULI_DUST = registerDustItem("lapis_lazuli_dust");
    public static final DeferredItem<Item> LEAD_DUST = registerDustItem("lead_dust");
    public static final DeferredItem<Item> LUMIUM_DUST = registerDustItem("lumium_dust");
    public static final DeferredItem<Item> NETHERITE_DUST = registerDustItem("netherite_dust");
    public static final DeferredItem<Item> NETHERRACK_DUST = registerDustItem("netherrack_dust");
    public static final DeferredItem<Item> NICKEL_DUST = registerDustItem("nickel_dust");
    public static final DeferredItem<Item> NITER_DUST = registerDustItem("niter_dust");
    public static final DeferredItem<Item> OBSIDIAN_DUST = registerDustItem("obsidian_dust");
    public static final DeferredItem<Item> ONYX_DUST = registerDustItem("onyx_dust");
    public static final DeferredItem<Item> OSMIUM_DUST = registerDustItem("osmium_dust");
    public static final DeferredItem<Item> PEWTER_DUST = registerDustItem("pewter_dust");
    public static final DeferredItem<Item> PERIDOT_DUST = registerDustItem("peridot_dust");
    public static final DeferredItem<Item> PLATINUM_DUST = registerDustItem("platinum_dust");
    public static final DeferredItem<Item> PLUTONIUM_DUST = registerDustItem("plutonium_dust");
    public static final DeferredItem<Item> QUARTZ_DUST = registerDustItem("quartz_dust");
    public static final DeferredItem<Item> ROSE_GOLD_DUST = registerDustItem("rose_gold_dust");
    public static final DeferredItem<Item> RUBY_DUST = registerDustItem("ruby_dust");
    public static final DeferredItem<Item> SAPPHIRE_DUST = registerDustItem("sapphire_dust");
    public static final DeferredItem<Item> SILVER_DUST = registerDustItem("silver_dust");
    public static final DeferredItem<Item> SIGNALUM_DUST = registerDustItem("signalum_dust");
    public static final DeferredItem<Item> STEEL_DUST = registerDustItem("steel_dust");
    public static final DeferredItem<Item> SULFUR_DUST = registerDustItem("sulfur_dust");
    public static final DeferredItem<Item> TIN_DUST = registerDustItem("tin_dust");
    public static final DeferredItem<Item> TITANIUM_DUST = registerDustItem("titanium_dust");
    public static final DeferredItem<Item> ULTIMATITANIUM_DUST = registerDustItem("ultimatitanium_dust");
    public static final DeferredItem<Item> URANIUM_DUST = registerDustItem("uranium_dust");
    public static final DeferredItem<Item> ZINC_DUST = registerDustItem("zinc_dust");
    public static final DeferredItem<Item> CAST_IRON_DUST = registerDustItem("cast_iron_dust");
    public static final DeferredItem<Item> URANINITE_DUST = registerDustItem("uraninite_dust");
    public static final DeferredItem<Item> CAST_STEEL_DUST = registerDustItem("cast_steel_dust");
    public static final DeferredItem<Item> WROUGHT_IRON_DUST = registerDustItem("wrought_iron_dust");
    public static final DeferredItem<Item> NETHERSTEEL_DUST = registerDustItem("nethersteel_dust");
    public static final DeferredItem<Item> SHADOWSTEEL_DUST = registerDustItem("shadowsteel_dust");
    public static final DeferredItem<Item> PIG_IRON_DUST = registerDustItem("pig_iron_dust");
    public static final DeferredItem<Item> NECROTICARITE_DUST = registerDustItem("necroticarite_dust");
    public static final DeferredItem<Item> SCULK_DUST = registerDustItem("sculk_dust");
    public static final DeferredItem<Item> AMETHYST_DUST = registerDustItem("amethyst_dust");
    public static final DeferredItem<Item> NETHER_STAR_DUST = registerDustItem("nether_star_dust");
    public static final DeferredItem<Item> CATALYRIUM_DUST = registerDustItem("catalyrium_dust");

    //Gems
    private static DeferredItem<Item> registerGemItem(String name)
    {
        return ITEMS.register(name, () -> new Item(new Item.Properties()));
    }
    public static final DeferredItem<Item> GEM_ONYX = registerGemItem("gem_onyx");
    public static final DeferredItem<Item> GEM_PERIDOT = registerGemItem("gem_peridot");
    public static final DeferredItem<Item> GEM_RUBY = registerGemItem("gem_ruby");
    public static final DeferredItem<Item> GEM_SAPPHIRE = registerGemItem("gem_sapphire");
    public static final DeferredItem<Item> FLUORITE = registerGemItem("fluorite");
    public static final DeferredItem<Item> GEM_APATITE = registerGemItem("gem_apatite");
    public static final DeferredItem<Item> GEM_CINNABAR = registerGemItem("gem_cinnabar");
    public static final DeferredItem<Item> GEM_AMBER = registerGemItem("gem_amber");
    public static final DeferredItem<Item> GEM_NITER = registerGemItem("gem_niter");
    public static final DeferredItem<Item> GEM_TACHYARITE = registerGemItem("gem_tachyarite");
    public static final DeferredItem<Item> GEM_VOIDERITE = registerGemItem("gem_voiderite");
    public static final DeferredItem<Item> GEM_QUANTIQUARITE = registerGemItem("gem_quantiquarite");
    public static final DeferredItem<Item> GEM_NECROTICARITE = registerGemItem("gem_necroticarite");

    //Gem Shard (this might get removed)
    public static final DeferredItem<Item> GEM_SAPPHIRE_SHARD = ITEMS.register("gem_sapphire_shard",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GEM_OBSIDIAN_SHARD = ITEMS.register("gem_obsidian_shard",
            ()-> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
