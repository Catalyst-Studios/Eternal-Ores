package net.radzratz.eternalitems.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;



public class ModTags {
    public static class Blocks {

    }
    public static class Items {
        //Hammers
        public static final TagKey<Item> HAMMERS = createTagHammers("hammers");
        private static TagKey<Item> createTagHammers(String hammers) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("hammers", hammers));
        }
        //Gem Cutter
        public static final TagKey<Item> GEMCUTTER = createTagGemCutter("gemcutter");
        private static TagKey<Item> createTagGemCutter(String gemcutter) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("gemcutter", gemcutter));
        }
    }
}
