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
        public static final TagKey<Block> NEEDS_COPPER_TOOLS = createTag("needs_copper_tools");
        public static final TagKey<Block> INCORRECT_FOR_COPPER_TOOLS = createTag("incorrect_for_copper_tools");

        public static final TagKey<Block> NEEDS_ETERNAL_DARK_TOOLS = createTag("needs_eternal_dark_tools");
        public static final TagKey<Block> INCORRECT_FOR_ETERNAL_DARK_TOOLS = createTag("incorrect_for_eternal_dark_tools");

        public static final TagKey<Block> NEEDS_BONE_TOOLS = createTag("needs_bone_tools");
        public static final TagKey<Block> INCORRECT_FOR_BONE_TOOLS = createTag("incorrect_for_bone_tools");

        public static final TagKey<Block> NEEDS_ETERNAL_LIGHT_TOOLS = createTag("needs_eternal_light_tools");
        public static final TagKey<Block> INCORRECT_FOR_ETERNAL_LIGHT_TOOLS = createTag("incorrect_for_eternal_light_tools");

        public static final TagKey<Block> NEEDS_ETERNAL_GRAY_TOOLS = createTag("needs_eternal_gray_tools");
        public static final TagKey<Block> INCORRECT_FOR_ETERNAL_GRAY_TOOLS = createTag("incorrect_for_eternal_gray_tools");

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

        //Hammers
        public static final TagKey<Item> HAMMERS = createTagHammers("hammers");
        private static TagKey<Item> createTagHammers(String hammers) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("hammers", hammers));
        }
        //Bone Tools
        public static final TagKey<Item> BONE_TOOLS = createTagBoneTools("bone_tools");
        private static TagKey<Item> createTagBoneTools(String bone_tools) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("bone_tools", bone_tools));
        }

        //Eternal Dark Tools
        public static final TagKey<Item> ETERNAL_DARK_TOOLS = createTagEternalDarkTools("eternal_dark_tools");
        private static TagKey<Item> createTagEternalDarkTools(String eternal_dark_tools) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("eternal_dark_tools", eternal_dark_tools));
        }
        //Eternal Light Tools
        public static final TagKey<Item> ETERNAL_LIGHT_TOOLS = createTagEternalLightTools("eternal_light_tools");
        private static TagKey<Item> createTagEternalLightTools(String eternal_light_tools) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("eternal_light_tools", eternal_light_tools));
        }
        //Eternal Gray Tools
        public static final TagKey<Item> ETERNAL_GRAY_TOOLS = createTagEternalGrayTools("eternal_gray_tools");
        private static TagKey<Item> createTagEternalGrayTools(String eternal_gray_tools) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("eternal_gray_tools", eternal_gray_tools));
        }
    }
}
