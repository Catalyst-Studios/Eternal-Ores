package net.radzratz.eternalores.util.tags.block.storage_blocks;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class EternalStorageGemBlockTags {
    public static class Blocks {

        //Amber
        public static final TagKey<Block> AMBER_BLOCK_ST = createGemStorageBlockTags("storage_blocks/amber");
        //Apatite
        public static final TagKey<Block> APATITE_BLOCK_ST = createGemStorageBlockTags("storage_blocks/apatite");
        //Cinnabar
        public static final TagKey<Block> CINNABAR_BLOCK_ST = createGemStorageBlockTags("storage_blocks/cinnabar");
        //Fluorite
        public static final TagKey<Block> FLUORITE_BLOCK_ST = createGemStorageBlockTags("storage_blocks/fluorite");
        //Necroticarite
        public static final TagKey<Block> NECROTICARITE_BLOCK_ST = createGemStorageBlockTags("storage_blocks/necroticarite");
        //Niter
        public static final TagKey<Block> NITER_BLOCK_ST = createGemStorageBlockTags("storage_blocks/niter");
        //Onxy
        public static final TagKey<Block> ONYX_BLOCK_ST = createGemStorageBlockTags("storage_blocks/onyx");
        //Peridot
        public static final TagKey<Block> PERIDOT_BLOCK_ST = createGemStorageBlockTags("storage_blocks/peridot");
        //Ruby
        public static final TagKey<Block> RUBY_BLOCK_ST = createGemStorageBlockTags("storage_blocks/ruby");
        //Sapphire
        public static final TagKey<Block> SAPPHIRE_BLOCK_ST = createGemStorageBlockTags("storage_blocks/sapphire");

        private static TagKey<Block> createGemStorageBlockTags(String path) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }
    }
}
