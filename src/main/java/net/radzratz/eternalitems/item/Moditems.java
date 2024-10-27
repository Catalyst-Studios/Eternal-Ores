package net.radzratz.eternalitems.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.SwordItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.radzratz.eternalitems.EternalItems;
import net.radzratz.eternalitems.item.custom.EternalHammers;
import net.radzratz.eternalitems.item.custom.EternalToolTiers;
import net.radzratz.eternalitems.item.custom.FuelItem;
import net.radzratz.eternalitems.item.custom.ModFoodProperties;

public class Moditems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EternalItems.MOD_ID);

    //Items
    //Needs Occultism
    public static final DeferredItem<Item> DEMONIC_HEART = ITEMS.register("demonic_heart",
            ()-> new Item(new Item.Properties()));
    //Needs Ars Nouveau
    public static final DeferredItem<Item> SOURCE_MANIFESTATION = ITEMS.register("source_manifestation",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RATZ_HEAD = ITEMS.register("ratz_head",
            ()-> new Item(new Item.Properties()));
    //Needs Mekanism
    public static final DeferredItem<Item> ANTIMATTER_FUSE = ITEMS.register("antimatter_fuse",
            ()-> new Item(new Item.Properties()));
    //Needs GregTechCEU
    public static final DeferredItem<Item> GREGTASTIC_ATOMIC_PHD = ITEMS.register("gregtastic_atomic_phd",
            ()-> new Item(new Item.Properties()));
    //Needs AE2
    public static final DeferredItem<Item> MULTIPRESS = ITEMS.register("multipress",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DUMMYPRESS = ITEMS.register("dummypress",
            ()-> new Item(new Item.Properties()));
    //
    public static final DeferredItem<Item> CAPACITOR = ITEMS.register("capacitor",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BLACK_HOLE = ITEMS.register("black_hole",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COMET_SHARD = ITEMS.register("comet_shard",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FORGOTTEN_SEA_COIN = ITEMS.register("forgotten_sea_coin",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ETERNAL_VORTEX = ITEMS.register("eternal_vortex",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNDEAD_HAND = ITEMS.register("undead_hand",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GODS_TEAR = ITEMS.register("gods_tear",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DEVILS_TOOTH = ITEMS.register("devils_tooth",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ANGELS_STRING = ITEMS.register("angels_string",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SERAPHIMS_FEATHER = ITEMS.register("seraphims_feather",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FLATHEAD_SCREWDRIVER = ITEMS.register("flathead_screwdriver",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CROSSHEAD_SCREWDRIVER = ITEMS.register("crosshead_screwdriver",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FANG = ITEMS.register("fang",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILICON = ITEMS.register("silicon",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SULFUR = ITEMS.register("sulfur",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SULFUR_DUST = ITEMS.register("sulfur_dust",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FLUORITE_DUST = ITEMS.register("fluorite_dust",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FLUORITE = ITEMS.register("fluorite",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DRAGONS_SCALE = ITEMS.register("dragons_scale",
            ()-> new Item(new Item.Properties()));


    public static final DeferredItem<Item> WRENCH = ITEMS.register("wrench",
            ()-> new Item(new Item.Properties()));

    //Food
    public static final DeferredItem<Item> COOKED_APPLE = ITEMS.register("cooked_apple",
            ()-> new Item(new Item.Properties().food(ModFoodProperties.COOKED_APPLE)));
    public static final DeferredItem<Item> COOKED_CARROT = ITEMS.register("cooked_carrot",
            ()-> new Item(new Item.Properties().food(ModFoodProperties.COOKED_CARROT)));

    //Swords
    public static final DeferredItem<SwordItem> ETERNAL_DARK_SWORD = ITEMS.register("eternal_dark_sword",
            ()-> new SwordItem(EternalToolTiers.ETERNAL_DARK_TOOLS,new Item.Properties()
                    .attributes(SwordItem.createAttributes(EternalToolTiers.ETERNAL_DARK_TOOLS, 2450, 45))));

    public static final DeferredItem<SwordItem> COPPER_SWORD = ITEMS.register("copper_sword",
            ()-> new SwordItem(EternalToolTiers.COPPER_TOOLS, new Item.Properties()
                    .attributes(SwordItem.createAttributes(EternalToolTiers.COPPER_TOOLS, 5, 1.6f))));

    public static final DeferredItem<SwordItem> BONE_KNIFE = ITEMS.register("bone_knife",
            ()-> new SwordItem(EternalToolTiers.BONE_TOOLS,new Item.Properties()
                    .attributes(SwordItem.createAttributes(EternalToolTiers.BONE_TOOLS, 4,-1.4f))));

    //Tools
    public static final DeferredItem<PickaxeItem> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            ()-> new PickaxeItem(EternalToolTiers.COPPER_TOOLS, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(EternalToolTiers.COPPER_TOOLS, 3, 1.6f))));

    public static final DeferredItem<Item> ETERNAL_DARK_PICKAXE = ITEMS.register("eternal_dark_pickaxe",
            ()-> new Item(new Item.Properties()));

    public static final DeferredItem<Item> COPPER_AXE = ITEMS.register("copper_axe",
            ()-> new Item(new Item.Properties()));

    public static final DeferredItem<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            ()-> new Item(new Item.Properties()));

    public static final DeferredItem<Item> COPPER_HOE = ITEMS.register("copper_hoe",
            ()-> new Item(new Item.Properties()));

    //Fuels
    public static final DeferredItem<Item> TINY_COAL = ITEMS.register("tiny_coal",
            ()-> new FuelItem(new Item.Properties(), 200));
    public static final DeferredItem<Item> TINY_CHARCOAL = ITEMS.register("tiny_charcoal",
            ()-> new FuelItem(new Item.Properties(), 200));

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
    public static final DeferredItem<Item> ETERNAL_DARK_HAMMER = ITEMS.register("eternal_dark_hammer",
            ()-> new EternalHammers(new Item.Properties(),2048));

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

    //Gems
    public static final DeferredItem<Item> GEM_OBSIDIAN_SHARD = ITEMS.register("gem_obsidian_shard",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GEM_ONYX = ITEMS.register("gem_onyx",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GEM_PERIDOT = ITEMS.register("gem_peridot",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GEM_RUBY = ITEMS.register("gem_ruby",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GEM_SAPPHIRE = ITEMS.register("gem_sapphire",
            ()-> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
