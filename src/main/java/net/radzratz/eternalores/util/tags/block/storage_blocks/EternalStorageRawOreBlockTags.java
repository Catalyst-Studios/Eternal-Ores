package net.radzratz.eternalores.util.tags.block.storage_blocks;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class EternalStorageRawOreBlockTags {
    public static class Blocks {

        //Aluminum
        public static final TagKey<Block> RAW_ALUMINUM_ST = createRawOreBlockTags("storage_blocks/raw_aluminum");
        //Cobalt
        public static final TagKey<Block> RAW_COBALT_ST = createRawOreBlockTags("storage_blocks/raw_cobalt");
        //Gallium
        public static final TagKey<Block> RAW_GALLIUM_ST = createRawOreBlockTags("storage_blocks/raw_gallium");
        //Iridium
        public static final TagKey<Block> RAW_IRIDIUM_ST = createRawOreBlockTags("storage_blocks/raw_iridium");
        //Lead
        public static final TagKey<Block> RAW_LEAD_ST = createRawOreBlockTags("storage_blocks/raw_lead");
        //Nickel
        public static final TagKey<Block> RAW_NICKEL_ST = createRawOreBlockTags("storage_blocks/raw_nickel");
        //Osmium
        public static final TagKey<Block> RAW_OSMIUM_ST = createRawOreBlockTags("storage_blocks/raw_osmium");
        //Platinum
        public static final TagKey<Block> RAW_PLATINUM_ST = createRawOreBlockTags("storage_blocks/raw_platinum");
        //Silver
        public static final TagKey<Block> RAW_SILVER_ST = createRawOreBlockTags("storage_blocks/raw_silver");
        //Sulfur
        public static final TagKey<Block> SULFUR_ST = createRawOreBlockTags("storage_blocks/sulfur");
        //Tin
        public static final TagKey<Block> RAW_TIN_ST = createRawOreBlockTags("storage_blocks/raw_tin");
        //Uraninite
        public static final TagKey<Block> RAW_URANINITE_ST = createRawOreBlockTags("storage_blocks/raw_uraninite");
        //Uranium
        public static final TagKey<Block> RAW_URANIUM_ST = createRawOreBlockTags("storage_blocks/raw_uranium");
        //Zinc
        public static final TagKey<Block> RAW_ZINC_ST = createRawOreBlockTags("storage_blocks/raw_zinc");

        private static TagKey<Block> createRawOreBlockTags(String path) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }
    }
}
