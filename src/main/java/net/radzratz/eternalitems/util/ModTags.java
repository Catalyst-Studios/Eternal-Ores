package net.radzratz.eternalitems.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.radzratz.eternalitems.EternalItems;



public class ModTags {
    public static class Blocks {

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(EternalItems.MOD_ID, name));
        }
    }
    public static class Items {

        //Ingots
        public static final TagKey<Item> ALUMINUM_INGOT = createTag("aluminum_ingot");
        public static final TagKey<Item> COBALT_INGOT = createTag("cobalt_ingot");
        //Raw Ores
        public static final TagKey<Item> ALUMINUM = createTag("raw_aluminum");
        public static final TagKey<Item> COBALT = createTag("raw_cobalt");
        public static final TagKey<Item> LEAD = createTag("raw_lead");
        public static final TagKey<Item> URANIUM = createTag("raw_uranium");
        //Nuggets
        //Plates
        //Rods


        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", name));
        }
    }

}
