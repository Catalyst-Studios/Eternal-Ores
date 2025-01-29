package net.radzratz.eternalores.util.tags.item.dusts;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class EternalMetalDusts {
    public static class Items {

        //Aluminum
        public static final TagKey<Item> DUST_ALUMINUM = createTag("dusts/aluminum");
        //Blue Steel
        public static final TagKey<Item> DUST_BLUE_STEEL = createTag("dusts/blue_steel");
        //Brass
        public static final TagKey<Item> DUST_BRASS = createTag("dusts/brass");
        //Britannia Silver
        public static final TagKey<Item> DUST_BRITANNIA_SILVER = createTag("dusts/britannia_silver");
        //Bronze
        public static final TagKey<Item> DUST_BRONZE = createTag("dusts/bronze");
        //Cobalt
        public static final TagKey<Item> DUST_COBALT = createTag("dusts/cobalt");
        //Constantan
        public static final TagKey<Item> DUST_CONSTANTAN = createTag("dusts/constantan");
        //Copper
        public static final TagKey<Item> DUST_COPPER = createTag("dusts/copper");
        //Electrum
        public static final TagKey<Item> DUST_ELECTRUM = createTag("dusts/electrum");
        //Enderium
        public static final TagKey<Item> DUST_ENDERIUM = createTag("dusts/enderium");
        //Gallium
        public static final TagKey<Item> DUST_GALLIUM = createTag("dusts/gallium");
        //Gold
        public static final TagKey<Item> DUST_GOLD = createTag("dusts/gold");
        //Invar
        public static final TagKey<Item> DUST_INVAR = createTag("dusts/invar");
        //Iron
        public static final TagKey<Item> DUST_IRON = createTag("dusts/iron");
        //Lead
        public static final TagKey<Item> DUST_LEAD = createTag("dusts/lead");
        //Lumium
        public static final TagKey<Item> DUST_LUMIUM = createTag("dusts/lumium");
        //Netherite
        public static final TagKey<Item> DUST_NETHERITE = createTag("dusts/netherite");
        //Nickel
        public static final TagKey<Item> DUST_NICKEL = createTag("dusts/nickel");
        //Osmium
        public static final TagKey<Item> DUST_OSMIUM = createTag("dusts/osmium");
        //Pewter
        public static final TagKey<Item> DUST_PEWTER = createTag("dusts/pewter");
        //Platinum
        public static final TagKey<Item> DUST_PLATINUM = createTag("dusts/platinum");
        //Rose Gold
        public static final TagKey<Item> DUST_ROSE_GOLD = createTag("dusts/rose_gold");
        //Signalum
        public static final TagKey<Item> DUST_SIGNALUM = createTag("dusts/signalum");
        //Silver
        public static final TagKey<Item> DUST_SILVER = createTag("dusts/silver");
        //Steel
        public static final TagKey<Item> DUST_STEEL = createTag("dusts/steel");
        //Tin
        public static final TagKey<Item> DUST_TIN = createTag("dusts/tin");
        //Titanium
        public static final TagKey<Item> DUST_TITANIUM = createTag("dusts/titanium");
        //Ultimatitanium
        public static final TagKey<Item> DUST_ULTIMATITANIUM = createTag("dusts/ultimatitanium");
        //Uranium
        public static final TagKey<Item> DUST_URANIUM = createTag("dusts/uranium");
        //Zinc
        public static final TagKey<Item> DUST_ZINC = createTag("dusts/zinc");

        private static TagKey<Item> createTag(String path) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }
    }
}
