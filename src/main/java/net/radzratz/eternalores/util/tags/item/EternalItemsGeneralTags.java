package net.radzratz.eternalores.util.tags.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;



public class EternalItemsGeneralTags {
    public static class Items {

        //Tools
        public static final TagKey<Item> HAMMERS = createGeneralItemTags("eternalores","tools/hammers");
        public static final TagKey<Item> GEM_CUTTER = createGeneralItemTags("eternalores","tools/gem_cutter");

        //Stone, Metal & Gem Dust
        public static final TagKey<Item> METAL_DUSTS = createGeneralItemTags("c", "metal_dust");
        public static final TagKey<Item> GEM_DUSTS = createGeneralItemTags("c","gem_dust");
        public static final TagKey<Item> STONE_DUSTS = createGeneralItemTags("c","stone_dust");

        //Gears
        public static final TagKey<Item> GEARS = createGeneralItemTags("c","gears");
        public static final TagKey<Item> METAL_GEARS = createGeneralItemTags("c","metal_gears");
        public static final TagKey<Item> GEM_GEARS = createGeneralItemTags("c","gem_gears");

        public static final TagKey<Item> SMALL_GEARS = createGeneralItemTags("c","small_gears");
        public static final TagKey<Item> SMALL_METAL_GEARS = createGeneralItemTags("c","small_metal_gears");
        public static final TagKey<Item> SMALL_GEM_GEARS = createGeneralItemTags("c","small_gem_gears");

        //Rods
        public static final TagKey<Item> METAL_RODS = createGeneralItemTags("c","metal_rods");
        public static final TagKey<Item> GEM_RODS = createGeneralItemTags("c","gem_rods");

        //Plates
        public static final TagKey<Item> PLATES = createGeneralItemTags("c","plates");
        public static final TagKey<Item> METAL_PLATES = createGeneralItemTags("c","metal_plates");
        public static final TagKey<Item> GEM_PLATES = createGeneralItemTags("c","gem_plates");

        public static TagKey<Item> createGeneralItemTags(String namespace, String path) {
            System.out.println("Loading Custom Item tags");
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(namespace, path));
        }
    }
}
