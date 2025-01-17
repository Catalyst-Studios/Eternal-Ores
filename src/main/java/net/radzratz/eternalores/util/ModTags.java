package net.radzratz.eternalores.util;

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
            System.out.println("Loading Hammer Tag");
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("hammers", hammers));
        }
        //Gem Cutter
        public static final TagKey<Item> GEMCUTTER = createTagGemCutter("gemcutter");
        private static TagKey<Item> createTagGemCutter(String gemcutter) {
            System.out.println("Loading Gem Cutter Tag");
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("gemcutter", gemcutter));
        }
    }
}
