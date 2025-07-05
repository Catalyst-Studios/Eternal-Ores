package net.radzratz.eternalores.util.tags.item.dusts;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class EOMetalDustsTags
{
    public static class Items
    {

        //Aluminum
        public static final TagKey<Item> DUST_ALUMINUM = createMetalDustTag("dusts/aluminum");
        //Ardite
        public static final TagKey<Item> DUST_ARDITE = createMetalDustTag("dusts/ardite");
        //Blue Steel
        public static final TagKey<Item> DUST_BLUE_STEEL = createMetalDustTag("dusts/blue_steel");
        //Brass
        public static final TagKey<Item> DUST_BRASS = createMetalDustTag("dusts/brass");
        //Britannia Silver
        public static final TagKey<Item> DUST_BRITANNIA_SILVER = createMetalDustTag("dusts/britannia_silver");
        //Bronze
        public static final TagKey<Item> DUST_BRONZE = createMetalDustTag("dusts/bronze");
        //Catalyrium
        public static final TagKey<Item> DUST_CATALYRIUM = createMetalDustTag("dusts/catalyrium");
        //Cast Iron
        public static final TagKey<Item> DUST_CAST_IRON = createMetalDustTag("dusts/cast_iron");
        //Cast Steel
        public static final TagKey<Item> DUST_CAST_STEEL = createMetalDustTag("dusts/cast_steel");
        //Cobalt
        public static final TagKey<Item> DUST_COBALT = createMetalDustTag("dusts/cobalt");
        //Constantan
        public static final TagKey<Item> DUST_CONSTANTAN = createMetalDustTag("dusts/constantan");
        //Copper
        public static final TagKey<Item> DUST_COPPER = createMetalDustTag("dusts/copper");
        //Electrum
        public static final TagKey<Item> DUST_ELECTRUM = createMetalDustTag("dusts/electrum");
        //Enderium
        public static final TagKey<Item> DUST_ENDERIUM = createMetalDustTag("dusts/enderium");
        //Gallium
        public static final TagKey<Item> DUST_GALLIUM = createMetalDustTag("dusts/gallium");
        //Gold
        public static final TagKey<Item> DUST_GOLD = createMetalDustTag("dusts/gold");
        //Invar
        public static final TagKey<Item> DUST_INVAR = createMetalDustTag("dusts/invar");
        //Iridium
        public static final TagKey<Item> DUST_IRIDIUM = createMetalDustTag("dusts/iridium");
        //Iron
        public static final TagKey<Item> DUST_IRON = createMetalDustTag("dusts/iron");
        //Lead
        public static final TagKey<Item> DUST_LEAD = createMetalDustTag("dusts/lead");
        //Lumium
        public static final TagKey<Item> DUST_LUMIUM = createMetalDustTag("dusts/lumium");
        //Netherite
        public static final TagKey<Item> DUST_NETHERITE = createMetalDustTag("dusts/netherite");
        //Nethersteel
        public static final TagKey<Item> DUST_NETHERSTEEL = createMetalDustTag("dusts/nethersteel");
        //Nickel
        public static final TagKey<Item> DUST_NICKEL = createMetalDustTag("dusts/nickel");
        //Osmium
        public static final TagKey<Item> DUST_OSMIUM = createMetalDustTag("dusts/osmium");
        //Pig Iron
        public static final TagKey<Item> DUST_PIG_IRON = createMetalDustTag("dusts/pig_iron");
        //Pewter
        public static final TagKey<Item> DUST_PEWTER = createMetalDustTag("dusts/pewter");
        //Platinum
        public static final TagKey<Item> DUST_PLATINUM = createMetalDustTag("dusts/platinum");
        //Rose Gold
        public static final TagKey<Item> DUST_ROSE_GOLD = createMetalDustTag("dusts/rose_gold");
        //Signalum
        public static final TagKey<Item> DUST_SIGNALUM = createMetalDustTag("dusts/signalum");
        //Silver
        public static final TagKey<Item> DUST_SILVER = createMetalDustTag("dusts/silver");
        //Shadowsteel
        public static final TagKey<Item> DUST_SHADOWSTEEL = createMetalDustTag("dusts/shadowsteel");
        //Steel
        public static final TagKey<Item> DUST_STEEL = createMetalDustTag("dusts/steel");
        //Tin
        public static final TagKey<Item> DUST_TIN = createMetalDustTag("dusts/tin");
        //Titanium
        public static final TagKey<Item> DUST_TITANIUM = createMetalDustTag("dusts/titanium");
        //Ultimatitanium
        public static final TagKey<Item> DUST_ULTIMATITANIUM = createMetalDustTag("dusts/ultimatitanium");
        //Uraninite
        public static final TagKey<Item> DUST_URANINITE = createMetalDustTag("dusts/uraninite");
        //Uranium
        public static final TagKey<Item> DUST_URANIUM = createMetalDustTag("dusts/uranium");
        //Wrought
        public static final TagKey<Item> DUST_WROUGHT_IRON = createMetalDustTag("dusts/wrought_iron");
        //Zinc
        public static final TagKey<Item> DUST_ZINC = createMetalDustTag("dusts/zinc");

        private static TagKey<Item> createMetalDustTag(String path)
        {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }
    }
}
