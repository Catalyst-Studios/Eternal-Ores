package net.radzratz.eternalores.util.tags.item.nuggets;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class EONuggetsTags
{
    public static class Items
    {

        //Aluminum
        public static final TagKey<Item> NUGGET_ALUMINUM = createNuggetsTags("nuggets/aluminum");
        //Ardite
        public static final TagKey<Item> NUGGET_ARDITE = createNuggetsTags("nuggets/ardite");
        //Blue Steel
        public static final TagKey<Item> NUGGET_BLUE_STEEL = createNuggetsTags("nuggets/blue_steel");
        //Brass
        public static final TagKey<Item> NUGGET_BRASS = createNuggetsTags("nuggets/brass");
        //Britannia Silver
        public static final TagKey<Item> NUGGET_BRITANNIA_SILVER = createNuggetsTags("nuggets/britannia_silver");
        //Bronze
        public static final TagKey<Item> NUGGET_BRONZE = createNuggetsTags("nuggets/bronze");
        //Catalyrium
        public static final TagKey<Item> NUGGET_CATALYRIUM = createNuggetsTags("nuggets/catalyrium");
        //Cast Iron
        public static final TagKey<Item> NUGGET_CAST_IRON = createNuggetsTags("nuggets/cast_iron");
        //Cast Steel
        public static final TagKey<Item> NUGGET_CAST_STEEL = createNuggetsTags("nuggets/cast_steel");
        //Cobalt
        public static final TagKey<Item> NUGGET_COBALT = createNuggetsTags("nuggets/cobalt");
        //Constantan
        public static final TagKey<Item> NUGGET_CONSTANTAN = createNuggetsTags("nuggets/constantan");
        //Copper
        public static final TagKey<Item> NUGGET_COPPER = createNuggetsTags("nuggets/copper");
        //Electrum
        public static final TagKey<Item> NUGGET_ELECTRUM = createNuggetsTags("nuggets/electrum");
        //Enderium
        public static final TagKey<Item> NUGGET_ENDERIUM = createNuggetsTags("nuggets/enderium");
        //Gallium
        public static final TagKey<Item> NUGGET_GALLIUM = createNuggetsTags("nuggets/gallium");
        //Graphite
        public static final TagKey<Item> NUGGET_GRAPHITE = createNuggetsTags("nuggets/graphite");
        //Invar
        public static final TagKey<Item> NUGGET_INVAR = createNuggetsTags("nuggets/invar");
        //Iridium
        public static final TagKey<Item> NUGGET_IRIDIUM = createNuggetsTags("nuggets/iridium");
        //Lead
        public static final TagKey<Item> NUGGET_LEAD = createNuggetsTags("nuggets/lead");
        //Lumium
        public static final TagKey<Item> NUGGET_LUMIUM = createNuggetsTags("nuggets/lumium");
        //Netherite
        public static final TagKey<Item> NUGGET_NETHERITE = createNuggetsTags("nuggets/netherite");
        //Nethersteel
        public static final TagKey<Item> NUGGET_NETHERSTEEL = createNuggetsTags("nuggets/nethersteel");
        //Nickel
        public static final TagKey<Item> NUGGET_NICKEL = createNuggetsTags("nuggets/nickel");
        //Osmium
        public static final TagKey<Item> NUGGET_OSMIUM = createNuggetsTags("nuggets/osmium");
        //Pewter
        public static final TagKey<Item> NUGGET_PEWTER = createNuggetsTags("nuggets/pewter");
        //Pig Iron
        public static final TagKey<Item> NUGGET_PIG_IRON = createNuggetsTags("nuggets/pig_iron");
        //Platinum
        public static final TagKey<Item> NUGGET_PLATINUM = createNuggetsTags("nuggets/platinum");
        //Plutonium
        public static final TagKey<Item> NUGGET_PLUTONIUM = createNuggetsTags("nuggets/plutonium");
        //Rose Gold
        public static final TagKey<Item> NUGGET_ROSE_GOLD = createNuggetsTags("nuggets/rose_gold");
        //Signalum
        public static final TagKey<Item> NUGGET_SIGNALUM = createNuggetsTags("nuggets/signalum");
        //Shadowsteel
        public static final TagKey<Item> NUGGET_SHADOWSTEEL = createNuggetsTags("nuggets/shadowsteel");
        //Steel
        public static final TagKey<Item> NUGGET_STEEL = createNuggetsTags("nuggets/steel");
        //Tin
        public static final TagKey<Item> NUGGET_TIN = createNuggetsTags("nuggets/tin");
        //Titanium
        public static final TagKey<Item> NUGGET_TITANIUM = createNuggetsTags("nuggets/titanium");
        //Ultimatitanium
        public static final TagKey<Item> NUGGET_ULTIMATITANIUM = createNuggetsTags("nuggets/ultimatitanium");
        //Uraninite
        public static final TagKey<Item> NUGGET_URANINITE = createNuggetsTags("nuggets/uraninite");
        //Uranium
        public static final TagKey<Item> NUGGET_URANIUM = createNuggetsTags("nuggets/uranium");
        //Wrought Iron
        public static final TagKey<Item> NUGGET_WROUGHT_IRON = createNuggetsTags("nuggets/wrought_iron");
        //Zinc
        public static final TagKey<Item> NUGGET_ZINC = createNuggetsTags("nuggets/zinc");

        private static TagKey<Item> createNuggetsTags(String path)
        {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }
    }
}
