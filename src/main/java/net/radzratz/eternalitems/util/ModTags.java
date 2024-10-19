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

        //Copper Tools
        public static final TagKey<Item> COPPER_TOOLS = createTagCopperTools("copper_tools");

        private static TagKey<Item> createTagCopperTools(String copper_tools) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("copper_tools", copper_tools));
        }

        //Eternal Dark Tools
        public static final TagKey<Item> ETERNAL_DARK_TOOLS = createTagEternalDarkTools("eternal_dark_tools");

        private static TagKey<Item> createTagEternalDarkTools(String eternal_dark_tools) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("eternal_dark_tools", eternal_dark_tools));
        }
    }

}
