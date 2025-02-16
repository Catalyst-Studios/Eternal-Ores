package net.radzratz.eternalores.util.tags.block;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class EternalGeneralBlockTags {
    public static class Blocks {

        //Raw Ore Block
        public static final TagKey<Block> RAW_ORE_BLOCK = createGeneralBlockTags("c","raw_ore_block");

        //Metal and Gem Block
        public static final TagKey<Block> METAL_BLOCK = createGeneralBlockTags("c","metal_block");
        public static final TagKey<Block> GEM_BLOCK = createGeneralBlockTags("c","gem_block");

        public static TagKey<Block> createGeneralBlockTags(String namespace, String path) {
            System.out.println("Loading Custom Block tags");
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(namespace, path));
        }
    }
}

