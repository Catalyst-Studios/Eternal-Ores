package net.radzratz.eternalores.util.tags.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;



public class EternalItemsGeneralTags {
    public static class Items {

        //Tools
        public static final TagKey<Item> HAMMERS = createItemTag("eternalores","tools/hammers");
        public static final TagKey<Item> GEM_CUTTER = createItemTag("eternalores","tools/gem_cutter");

        //Stone, Metal & Gem Dust
        public static final TagKey<Item> METAL_DUSTS = createItemTag("c", "metal_dust");
        public static final TagKey<Item> GEM_DUSTS = createItemTag("c","gem_dust");
        public static final TagKey<Item> STONE_DUSTS = createItemTag("c","stone_dust");

        //Gears
        public static final TagKey<Item> GEARS = createItemTag("c","gears");
        public static final TagKey<Item> METAL_GEARS = createItemTag("c","metal_gears");
        public static final TagKey<Item> GEM_GEARS = createItemTag("c","gem_gears");

        public static final TagKey<Item> SMALL_GEARS = createItemTag("c","small_gears");
        public static final TagKey<Item> SMALL_METAL_GEARS = createItemTag("c","small_metal_gears");
        public static final TagKey<Item> SMALL_GEM_GEARS = createItemTag("c","small_gem_gears");

        //Rods
        public static final TagKey<Item> METAL_RODS = createItemTag("c","metal_rods");
        public static final TagKey<Item> GEM_RODS = createItemTag("c","gem_rods");

        //Plates
        public static final TagKey<Item> PLATES = createItemTag("c","plates");
        public static final TagKey<Item> METAL_PLATES = createItemTag("c","metal_plates");
        public static final TagKey<Item> GEM_PLATES = createItemTag("c","gem_plates");

        public static TagKey<Item> createItemTag(String namespace, String path) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(namespace, path));
        }
    }
}
