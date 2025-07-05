package net.radzratz.eternalores.util.tags.block.storage_blocks;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class EOStorageMiscBlockTags
{
    public static class Blocks
    {
        //Nether Star Block
        public static final TagKey<Block> NETHER_STAR_BLOCK_ST = createMiscStorageBlockTags("storage_blocks/nether_star");

        private static TagKey<Block> createMiscStorageBlockTags(String path)
        {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }
    }
}
