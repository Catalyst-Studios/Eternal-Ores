package net.radzratz.eternalores.item;

import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.item.custom.EternalGemCutter;
import net.radzratz.eternalores.item.custom.EternalHammers;

public class Moditems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EternalOres.MOD_ID);

    //Hammers
    public static final DeferredItem<Item> COBALT_HAMMER = ITEMS.register("cobalt_hammer",
            ()-> new EternalHammers(new Item.Properties(),1024));
    public static final DeferredItem<Item> COPPER_HAMMER = ITEMS.register("copper_hammer",
            ()-> new EternalHammers(new Item.Properties(),128));
    public static final DeferredItem<Item> STONE_HAMMER = ITEMS.register("stone_hammer",
            ()-> new EternalHammers(new Item.Properties(),64));
    public static final DeferredItem<Item> DIAMOND_HAMMER = ITEMS.register("diamond_hammer",
            ()-> new EternalHammers(new Item.Properties(),512));
    public static final DeferredItem<Item> IRON_HAMMER = ITEMS.register("iron_hammer",
            ()-> new EternalHammers(new Item.Properties(),256));
    //public static final DeferredItem<Item> ETERNAL_DARK_HAMMER = ITEMS.register("eternal_dark_hammer",
    //        ()-> new EternalHammers(new Item.Properties(),2048));

    //Gem Cutter
    public static final DeferredItem<Item> IRON_GEM_CUTTER = ITEMS.register("iron_gem_cutter",
            ()-> new EternalGemCutter(new Item.Properties(),256));

    //Ingots
    public static final DeferredItem<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GRAPHITE_INGOT = ITEMS.register("graphite_ingot",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> OSMIUM_INGOT = ITEMS.register("osmium_ingot",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ETERNAL_DARK_INGOT = ITEMS.register("eternal_dark_ingot",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ETERNAL_LIGHT_INGOT = ITEMS.register("eternal_light_ingot",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LEAD_INGOT = ITEMS.register("lead_ingot",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COBALT_INGOT = ITEMS.register("cobalt_ingot",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ZINC_INGOT = ITEMS.register("zinc_ingot",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ULTIMATITANIUM_INGOT = ITEMS.register("ultimatitanium_ingot",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLUTONIUM_INGOT = ITEMS.register("plutonium_ingot",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ELECTRUM_INGOT = ITEMS.register("electrum_ingot",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ENDERIUM_INGOT = ITEMS.register("enderium_ingot",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INVAR_INGOT = ITEMS.register("invar_ingot",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LUMIUM_INGOT = ITEMS.register("lumium_ingot",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SIGNALUM_INGOT = ITEMS.register("signalum_ingot",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> REDSTONE_INGOT = ITEMS.register("redstone_ingot",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CONSTANTAN_INGOT = ITEMS.register("constantan_ingot",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRASS_INGOT = ITEMS.register("brass_ingot",
            ()-> new Item(new Item.Properties()));

    //Nuggets
    public static final DeferredItem<Item> ALUMINUM_NUGGET = ITEMS.register("aluminum_nugget",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LEAD_NUGGET = ITEMS.register("lead_nugget",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> OSMIUM_NUGGET = ITEMS.register("osmium_nugget",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> URANIUM_NUGGET = ITEMS.register("uranium_nugget",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_NUGGET = ITEMS.register("copper_nugget",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COBALT_NUGGET = ITEMS.register("cobalt_nugget",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIN_NUGGET = ITEMS.register("tin_nugget",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ZINC_NUGGET = ITEMS.register("zinc_nugget",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ULTIMATITANIUM_NUGGET = ITEMS.register("ultimatitanium_nugget",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NICKEL_NUGGET = ITEMS.register("nickel_nugget",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLUTONIUM_NUGGET = ITEMS.register("plutonium_nugget",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ELECTRUM_NUGGET = ITEMS.register("electrum_nugget",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ENDERIUM_NUGGET = ITEMS.register("enderium_nugget",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INVAR_NUGGET = ITEMS.register("invar_nugget",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LUMIUM_NUGGET = ITEMS.register("lumium_nugget",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SIGNALUM_NUGGET = ITEMS.register("signalum_nugget",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_NUGGET = ITEMS.register("silver_nugget",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GRAPHITE_NUGGET = ITEMS.register("graphite_nugget",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CONSTANTAN_NUGGET = ITEMS.register("constantan_nugget",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRASS_NUGGET = ITEMS.register("brass_nugget",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NETHERITE_NUGGET = ITEMS.register("netherite_nugget",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_NUGGET = ITEMS.register("steel_nugget",
            ()-> new Item(new Item.Properties()));

    //Rods
    public static final DeferredItem<Item> ROD_ALUMINUM = ITEMS.register("rod_aluminum",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROD_LEAD = ITEMS.register("rod_lead",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROD_OSMIUM = ITEMS.register("rod_osmium",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROD_URANIUM = ITEMS.register("rod_uranium",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROD_GOLD = ITEMS.register("rod_gold",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROD_PLATINUM = ITEMS.register("rod_platinum",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROD_COPPER = ITEMS.register("rod_copper",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROD_IRON = ITEMS.register("rod_iron",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROD_COBALT = ITEMS.register("rod_cobalt",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROD_TIN = ITEMS.register("rod_tin",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROD_ZINC = ITEMS.register("rod_zinc",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROD_ULTIMATITANIUM = ITEMS.register("rod_ultimatitanium",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROD_NICKEL = ITEMS.register("rod_nickel",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROD_PLUTONIUM = ITEMS.register("rod_plutonium",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROD_BRONZE = ITEMS.register("rod_bronze",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROD_ELECTRUM = ITEMS.register("rod_electrum",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROD_ENDERIUM = ITEMS.register("rod_enderium",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROD_INVAR = ITEMS.register("rod_invar",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROD_LUMIUM = ITEMS.register("rod_lumium",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROD_SIGNALUM = ITEMS.register("rod_signalum",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROD_SILVER = ITEMS.register("rod_silver",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROD_GRAPHITE = ITEMS.register("rod_graphite",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROD_CONSTANTAN = ITEMS.register("rod_constantan",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROD_BRASS = ITEMS.register("rod_brass",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROD_NETHERITE = ITEMS.register("rod_netherite",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROD_STEEL = ITEMS.register("rod_steel",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ROD_SAPPHIRE = ITEMS.register("rod_sapphire",
            ()-> new Item(new Item.Properties()));

    //Plates
    public static final DeferredItem<Item> PLATE_ALUMINUM = ITEMS.register("plate_aluminum",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATE_LEAD = ITEMS.register("plate_lead",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATE_OSMIUM = ITEMS.register("plate_osmium",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATE_URANIUM = ITEMS.register("plate_uranium",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATE_GOLD = ITEMS.register("plate_gold",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATE_PLATINUM = ITEMS.register("plate_platinum",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATE_COPPER = ITEMS.register("plate_copper",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATE_IRON = ITEMS.register("plate_iron",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATE_COBALT = ITEMS.register("plate_cobalt",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATE_TIN = ITEMS.register("plate_tin",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATE_ZINC = ITEMS.register("plate_zinc",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATE_ULTIMATITANIUM = ITEMS.register("plate_ultimatitanium",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATE_NICKEL = ITEMS.register("plate_nickel",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATE_PLUTONIUM = ITEMS.register("plate_plutonium",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATE_BRONZE = ITEMS.register("plate_bronze",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATE_ELECTRUM = ITEMS.register("plate_electrum",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATE_ENDERIUM = ITEMS.register("plate_enderium",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATE_INVAR = ITEMS.register("plate_invar",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATE_LUMIUM = ITEMS.register("plate_lumium",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATE_SIGNALUM = ITEMS.register("plate_signalum",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATE_SILVER = ITEMS.register("plate_silver",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATE_GRAPHITE = ITEMS.register("plate_graphite",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATE_CONSTANTAN = ITEMS.register("plate_constantan",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATE_BRASS = ITEMS.register("plate_brass",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATE_NETHERITE = ITEMS.register("plate_netherite",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATE_STEEL = ITEMS.register("plate_steel",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATE_SAPPHIRE = ITEMS.register("plate_sapphire",
            ()-> new Item(new Item.Properties()));

    //Gears
    public static final DeferredItem<Item> ULTIMATE_GEAR = ITEMS.register("ultimate_gear",
            ()-> new Item(new Item.Properties()));

    //Raw Ores
    public static final DeferredItem<Item> RAW_URANIUM = ITEMS.register("raw_uranium",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_OSMIUM = ITEMS.register("raw_osmium",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_PLATINUM = ITEMS.register("raw_platinum",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_TIN = ITEMS.register("raw_tin",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_LEAD = ITEMS.register("raw_lead",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_ALUMINUM = ITEMS.register("raw_aluminum",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_NICKEL = ITEMS.register("raw_nickel",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_SILVER = ITEMS.register("raw_silver",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_COBALT = ITEMS.register("raw_cobalt",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_ZINC = ITEMS.register("raw_zinc",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_ULTIMATITANIUM = ITEMS.register("raw_ultimatitanium",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_PLUTONIUM = ITEMS.register("raw_plutonium",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SULFUR = ITEMS.register("sulfur",
            ()-> new Item(new Item.Properties()));

    //Ore Dust
    public static final DeferredItem<Item> ALUMINUM_DUST = ITEMS.register("aluminum_dust",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LEAD_DUST = ITEMS.register("lead_dust",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> OSMIUM_DUST = ITEMS.register("osmium_dust",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> URANIUM_DUST = ITEMS.register("uranium_dust",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GOLD_DUST = ITEMS.register("gold_dust",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATINUM_DUST = ITEMS.register("platinum_dust",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_DUST = ITEMS.register("copper_dust",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IRON_DUST = ITEMS.register("iron_dust",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COBALT_DUST = ITEMS.register("cobalt_dust",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIN_DUST = ITEMS.register("tin_dust",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ZINC_DUST = ITEMS.register("zinc_dust",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ULTIMATITANIUM_DUST = ITEMS.register("ultimatitanium_dust",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NICKEL_DUST = ITEMS.register("nickel_dust",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLUTONIUM_DUST = ITEMS.register("plutonium_dust",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRONZE_DUST = ITEMS.register("bronze_dust",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ELECTRUM_DUST = ITEMS.register("electrum_dust",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ENDERIUM_DUST = ITEMS.register("enderium_dust",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INVAR_DUST = ITEMS.register("invar_dust",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LUMIUM_DUST = ITEMS.register("lumium_dust",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SIGNALUM_DUST = ITEMS.register("signalum_dust",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ENDER_DUST = ITEMS.register("ender_dust",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_DUST = ITEMS.register("silver_dust",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SULFUR_DUST = ITEMS.register("sulfur_dust",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FLUORITE_DUST = ITEMS.register("fluorite_dust",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CONSTANTAN_DUST = ITEMS.register("constantan_dust",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BRASS_DUST = ITEMS.register("brass_dust",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NETHERITE_DUST = ITEMS.register("netherite_dust",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GRAPHITE_DUST = ITEMS.register("graphite_dust",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_DUST = ITEMS.register("steel_dust",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SAPPHIRE_DUST = ITEMS.register("sapphire_dust",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COAL_DUST = ITEMS.register("coal_dust",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> APATITE_DUST = ITEMS.register("apatite_dust",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CINNABAR_DUST = ITEMS.register("cinnabar_dust",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AMBER_DUST = ITEMS.register("amber_dust",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NITER_DUST = ITEMS.register("niter_dust",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ONYX_DUST = ITEMS.register("onyx_dust",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RUBY_DUST = ITEMS.register("ruby_dust",
            ()-> new Item(new Item.Properties()));

    //Gems
    public static final DeferredItem<Item> GEM_ONYX = ITEMS.register("gem_onyx",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GEM_PERIDOT = ITEMS.register("gem_peridot",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GEM_RUBY = ITEMS.register("gem_ruby",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GEM_SAPPHIRE = ITEMS.register("gem_sapphire",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FLUORITE = ITEMS.register("fluorite",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GEM_APATITE = ITEMS.register("gem_apatite",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GEM_CINNABAR = ITEMS.register("gem_cinnabar",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GEM_AMBER = ITEMS.register("gem_amber",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GEM_NITER = ITEMS.register("gem_niter",
            ()-> new Item(new Item.Properties()));

    //Gem Shard
    public static final DeferredItem<Item> GEM_SAPPHIRE_SHARD = ITEMS.register("gem_sapphire_shard",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GEM_OBSIDIAN_SHARD = ITEMS.register("gem_obsidian_shard",
            ()-> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
