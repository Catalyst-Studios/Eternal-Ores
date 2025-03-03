package net.radzratz.eternalores.util.tags;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class EternalCompressedBlockTags {
    public static class Items {

        public static final TagKey<Item> COMPRESSED_COBBLESTONE = createCompressedBlockItemTags("compressed/blocks/cobble");

        private static TagKey<Item> createCompressedBlockItemTags(String path) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }
    }
    public static class Blocks {

        public static final TagKey<Block> COMPRESSED_COBBLESTONE = createCompressedBlockTags("compressed/blocks/cobble");

        private static TagKey<Block> createCompressedBlockTags(String path) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }
    }
}
