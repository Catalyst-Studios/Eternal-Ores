package net.radzratz.eternalores.util.tags.item.gears;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class EternalMetalGearTags {
    public static class Items {

        //Aluminum
        public static final TagKey<Item> GEAR_ALUMINUM = createMetalGearTag("gears/aluminum");
        //Blue Steel
        public static final TagKey<Item> GEAR_BLUE_STEEL = createMetalGearTag("gears/blue_steel");
        //Brass
        public static final TagKey<Item> GEAR_BRASS = createMetalGearTag("gears/brass");
        //Bronze
        public static final TagKey<Item> GEAR_BRONZE = createMetalGearTag("gears/bronze");
        //Cobalt
        public static final TagKey<Item> GEAR_COBALT = createMetalGearTag("gears/cobalt");
        //Constantan
        public static final TagKey<Item> GEAR_CONSTANTAN = createMetalGearTag("gears/constantan");
        //Copper
        public static final TagKey<Item> GEAR_COPPER = createMetalGearTag("gears/copper");
        //Enderium
        public static final TagKey<Item> GEAR_ENDERIUM = createMetalGearTag("gears/enderium");
        //Eternal Dark
        public static final TagKey<Item> GEAR_ETERNAL_DARK = createMetalGearTag("gears/eternal_dark");
        //Eternal Light
        public static final TagKey<Item> GEAR_ETERNAL_LIGHT = createMetalGearTag("gears/bronze");
        //Gallium
        public static final TagKey<Item> GEAR_GALLIUM = createMetalGearTag("gears/gallium");
        //Invar
        public static final TagKey<Item> GEAR_INVAR = createMetalGearTag("gears/invar");
        //Iron
        public static final TagKey<Item> GEAR_IRON = createMetalGearTag("gears/iron");
        //
        public static final TagKey<Item> GEAR_GOLD = createMetalGearTag("gears/gold");
        //Lead
        public static final TagKey<Item> GEAR_LEAD = createMetalGearTag("gears/lead");
        //Lumium
        public static final TagKey<Item> GEAR_LUMIUM = createMetalGearTag("gears/lumium");
        //Nickel
        public static final TagKey<Item> GEAR_NICKEL = createMetalGearTag("gears/nickel");
        //Osmium
        public static final TagKey<Item> GEAR_OSMIUM = createMetalGearTag("gears/osmium");
        //Pewter
        public static final TagKey<Item> GEAR_PEWTER = createMetalGearTag("gears/pewter");
        //Signalum
        public static final TagKey<Item> GEAR_SIGNALUM = createMetalGearTag("gears/signalum");
        //Silver
        public static final TagKey<Item> GEAR_SILVER = createMetalGearTag("gears/silver");
        //Steel
        public static final TagKey<Item> GEAR_STEEL = createMetalGearTag("gears/steel");
        //Tin
        public static final TagKey<Item> GEAR_TIN = createMetalGearTag("gears/tin");
        //Titanium
        public static final TagKey<Item> GEAR_TITANIUM = createMetalGearTag("gears/titanium");
        //Ultimatitanium
        public static final TagKey<Item> GEAR_ULTIMATITANIUM = createMetalGearTag("gears/ultimatitanium");
        //Uranium
        public static final TagKey<Item> GEAR_URANIUM = createMetalGearTag("gears/uranium");
        //Zinc
        public static final TagKey<Item> GEAR_ZINC = createMetalGearTag("gears/zinc");

        private static TagKey<Item> createMetalGearTag(String path) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }
    }
}
