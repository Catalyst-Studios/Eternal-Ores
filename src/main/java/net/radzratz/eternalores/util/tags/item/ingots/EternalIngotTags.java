package net.radzratz.eternalores.util.tags.item.ingots;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class EternalIngotTags {
    public static class Items {

        //Aluminum / Aluminium
        public static final TagKey<Item> ALUMINUM_INGOT = createIngotTags("ingots/aluminum");
        public static final TagKey<Item> ALUMINIUM_INGOT = createIngotTags("ingots/aluminium");
        //Blue Steel
        public static final TagKey<Item> BLUE_STEEL_INGOT = createIngotTags("ingots/blue_steel");
        //Brass
        public static final TagKey<Item> BRASS_INGOT = createIngotTags("ingots/brass");
        //Britannia Silver
        public static final TagKey<Item> BRITANNIA_INGOT = createIngotTags("ingots/britannia_silver");
        //Bronze
        public static final TagKey<Item> BRONZE_INGOT = createIngotTags("ingots/bronze");
        //Cast Iron
        public static final TagKey<Item> CAST_IRON_INGOT = createIngotTags("ingots/cast_iron");
        //Cast Steel
        public static final TagKey<Item> CAST_STEEL_INGOT = createIngotTags("ingots/cast_steel");
        //Cobalt
        public static final TagKey<Item> COBALT_INGOT = createIngotTags("ingots/cobalt");
        //Constantan
        public static final TagKey<Item> CONSTANTAN_INGOT = createIngotTags("ingots/constantan");
        //Electrum
        public static final TagKey<Item> ELECTRUM_INGOT = createIngotTags("ingots/electrum");
        //Enderium
        public static final TagKey<Item> ENDERIUM_INGOT = createIngotTags("ingots/enderium");
        //Eternal Dark
        public static final TagKey<Item> ETERNAL_DARK_INGOT = createIngotTags("ingots/eternal_dark");
        //Eternal Light
        public static final TagKey<Item> ETERNAL_LIGHT_INGOT = createIngotTags("ingots/eternal_light");
        //Gallium
        public static final TagKey<Item> GALLIUM_INGOT = createIngotTags("ingots/gallium");
        //Graphite
        public static final TagKey<Item> GRAPHITE_INGOT = createIngotTags("ingots/graphite");
        //Invar
        public static final TagKey<Item> INVAR_INGOT = createIngotTags("ingots/invar");
        //Iridium
        public static final TagKey<Item> IRIDIUM_INGOT = createIngotTags("ingots/iridium");
        //Lead
        public static final TagKey<Item> LEAD_INGOT = createIngotTags("ingots/lead");
        //Lumium
        public static final TagKey<Item> LUMIUM_INGOT = createIngotTags("ingots/lumium");
        //Nickel
        public static final TagKey<Item> NICKEL_INGOT = createIngotTags("ingots/nickel");
        //Osmium
        public static final TagKey<Item> OSMIUM_INGOT = createIngotTags("ingots/osmium");
        //Pewter
        public static final TagKey<Item> PEWTER_INGOT = createIngotTags("ingots/pewter");
        //Platinum
        public static final TagKey<Item> PLATINUM_INGOT = createIngotTags("ingots/platinum");
        //Plutonium
        public static final TagKey<Item> PLUTONIUM_INGOT = createIngotTags("ingots/plutonium");
        //Redstone
        public static final TagKey<Item> REDSTONE_INGOT = createIngotTags("ingots/redstone");
        //Rose Gold
        public static final TagKey<Item> ROSE_GOLD_INGOT = createIngotTags("ingots/rose_gold");
        //Signalum
        public static final TagKey<Item> SIGNALUM_INGOT = createIngotTags("ingots/signalum");
        //Silver
        public static final TagKey<Item> SILVER_INGOT = createIngotTags("ingots/silver");
        //Steel
        public static final TagKey<Item> STEEL_INGOT = createIngotTags("ingots/steel");
        //Tin
        public static final TagKey<Item> TIN_INGOT = createIngotTags("ingots/tin");
        //Titanium
        public static final TagKey<Item> TITANIUM_INGOT = createIngotTags("ingots/titanium");
        //Ultimatitanium
        public static final TagKey<Item> ULTIMATITANIUM_INGOT = createIngotTags("ingots/ultimatitanium");
        //Uraninite
        public static final TagKey<Item> URANINITE_INGOT = createIngotTags("ingots/uraninite");
        //Uranium
        public static final TagKey<Item> URANIUM_INGOT = createIngotTags("ingots/uranium");
        //Zinc
        public static final TagKey<Item> ZINC_INGOT = createIngotTags("ingots/zinc");

        private static TagKey<Item> createIngotTags(String path) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }
    }
}
