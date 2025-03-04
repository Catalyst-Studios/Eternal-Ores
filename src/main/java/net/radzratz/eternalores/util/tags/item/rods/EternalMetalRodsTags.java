package net.radzratz.eternalores.util.tags.item.rods;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class EternalMetalRodsTags {
    public static class Items {

        //Aluminum
        public static final TagKey<Item> ROD_ALUMINUM = createMetalRodTag("rods/aluminum");
        //Blue Steel
        public static final TagKey<Item> ROD_BLUE_STEEL = createMetalRodTag("rods/blue_steel");
        //Brass
        public static final TagKey<Item> ROD_BRASS = createMetalRodTag("rods/brass");
        //Bronze
        public static final TagKey<Item> ROD_BRONZE = createMetalRodTag("rods/bronze");
        //Cast Iron
        public static final TagKey<Item> ROD_CAST_IRON = createMetalRodTag("rods/cast_iron");
        //Cast Steel
        public static final TagKey<Item> ROD_CAST_STEEL = createMetalRodTag("rods/cast_steel");
        //Cobalt
        public static final TagKey<Item> ROD_COBALT = createMetalRodTag("rods/cobalt");
        //Constantan
        public static final TagKey<Item> ROD_CONSTANTAN = createMetalRodTag("rods/constantan");
        //Copper
        public static final TagKey<Item> ROD_COPPER = createMetalRodTag("rods/copper");
        //Electrum
        public static final TagKey<Item> ROD_ELECTRUM = createMetalRodTag("rods/electrum");
        //Enderium
        public static final TagKey<Item> ROD_ENDERIUM = createMetalRodTag("rods/enderium");
        //Gallium
        public static final TagKey<Item> ROD_GALLIUM = createMetalRodTag("rods/gallium");
        //Gold
        public static final TagKey<Item> ROD_GOLD = createMetalRodTag("rods/gold");
        //Invar
        public static final TagKey<Item> ROD_INVAR = createMetalRodTag("rods/invar");
        //Iridium
        public static final TagKey<Item> ROD_IRIDIUM = createMetalRodTag("rods/iridium");
        //Iron
        public static final TagKey<Item> ROD_IRON = createMetalRodTag("rods/iron");
        //Lead
        public static final TagKey<Item> ROD_LEAD = createMetalRodTag("rods/lead");
        //Lumium
        public static final TagKey<Item> ROD_LUMIUM = createMetalRodTag("rods/lumium");
        //Netherite
        public static final TagKey<Item> ROD_NETHERITE = createMetalRodTag("rods/netherite");
        //Nethersteel
        public static final TagKey<Item> ROD_NETHERSTEEL = createMetalRodTag("rods/nethersteel");
        //Nickel
        public static final TagKey<Item> ROD_NICKEL = createMetalRodTag("rods/nickel");
        //Osmium
        public static final TagKey<Item> ROD_OSMIUM = createMetalRodTag("rods/osmium");
        //Platinum
        public static final TagKey<Item> ROD_PLATINUM = createMetalRodTag("rods/platinum");
        //Rose Gold
        public static final TagKey<Item> ROD_ROSE_GOLD = createMetalRodTag("rods/rose_gold");
        //Signalum
        public static final TagKey<Item> ROD_SIGNALUM = createMetalRodTag("rods/signalum");
        //Silver
        public static final TagKey<Item> ROD_SILVER = createMetalRodTag("rods/silver");
        //Shadowsteel
        public static final TagKey<Item> ROD_SHADOWSTEEL = createMetalRodTag("rods/shadowsteel");
        //Steel
        public static final TagKey<Item> ROD_STEEL = createMetalRodTag("rods/steel");
        //Tin
        public static final TagKey<Item> ROD_TIN = createMetalRodTag("rods/tin");
        //Titanium
        public static final TagKey<Item> ROD_TITANIUM = createMetalRodTag("rods/titanium");
        //Ultimatitanium
        public static final TagKey<Item> ROD_ULTIMATITANIUM = createMetalRodTag("rods/ultimatitanium");
        //Uranium
        public static final TagKey<Item> ROD_URANIUM = createMetalRodTag("rods/uranium");
        //Wrought Iron
        public static final TagKey<Item> ROD_WROUGHT_IRON = createMetalRodTag("rods/wrought_iron");
        //Zinc
        public static final TagKey<Item> ROD_ZINC = createMetalRodTag("rods/zinc");

        private static TagKey<Item> createMetalRodTag(String path) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }
    }
}
