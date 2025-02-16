package net.radzratz.eternalores.util.tags.block.storage_blocks;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class EternalStorageMetalBlockTags {
    public static class Blocks{

        //Aluminum
        public static final TagKey<Block> ALUMINUM_BLOCK_ST = createMetalStorageBlockTags("storage_blocks/aluminum");
        //Blue Steel
        public static final TagKey<Block> BLUE_STEEL_BLOCK_ST = createMetalStorageBlockTags("storage_blocks/blue_steel");
        //Brass
        public static final TagKey<Block> BRASS_BLOCK_ST = createMetalStorageBlockTags("storage_blocks/brass");
        //Britannia Silver
        public static final TagKey<Block> BRITANNIA_BLOCK_ST = createMetalStorageBlockTags("storage_blocks/britannia_silver");
        //Bronze
        public static final TagKey<Block> BRONZE_BLOCK_ST = createMetalStorageBlockTags("storage_blocks/bronze");
        //Cobalt
        public static final TagKey<Block> COBALT_BLOCK_ST = createMetalStorageBlockTags("storage_blocks/cobalt");
        //Constantan
        public static final TagKey<Block> CONSTANTAN_BLOCK_ST = createMetalStorageBlockTags("storage_blocks/constantan");
        //Electrum
        public static final TagKey<Block> ELECTRUM_BLOCK_ST = createMetalStorageBlockTags("storage_blocks/electrum");
        //Enderium
        public static final TagKey<Block> ENDERIUM_BLOCK_ST = createMetalStorageBlockTags("storage_blocks/enderium");
        //Gallium
        public static final TagKey<Block> GALLIUM_BLOCK_ST = createMetalStorageBlockTags("storage_blocks/gallium");
        //Invar
        public static final TagKey<Block> INVAR_BLOCK_ST = createMetalStorageBlockTags("storage_blocks/invar");
        //Lead
        public static final TagKey<Block> LEAD_BLOCK_ST = createMetalStorageBlockTags("storage_blocks/lead");
        //Lumium
        public static final TagKey<Block> LUMIUM_BLOCK_ST = createMetalStorageBlockTags("storage_blocks/lumium");
        //Nickel
        public static final TagKey<Block> NICKEL_BLOCK_ST = createMetalStorageBlockTags("storage_blocks/nickel");
        //Osmium
        public static final TagKey<Block> OSMIUM_BLOCK_ST = createMetalStorageBlockTags("storage_blocks/osmium");
        //Pewter
        public static final TagKey<Block> PEWTER_BLOCK_ST = createMetalStorageBlockTags("storage_blocks/pewter");
        //Platinum
        public static final TagKey<Block> PLATINUM_BLOCK_ST = createMetalStorageBlockTags("storage_blocks/platinum");
        //Rose Gold
        public static final TagKey<Block> ROSE_GOLD_BLOCK_ST = createMetalStorageBlockTags("storage_blocks/rose_gold");
        //Signalum
        public static final TagKey<Block> SIGNALUM_BLOCK_ST = createMetalStorageBlockTags("storage_blocks/signalum");
        //Silver
        public static final TagKey<Block> SILVER_BLOCK_ST = createMetalStorageBlockTags("storage_blocks/silver");
        //Steel
        public static final TagKey<Block> STEEL_BLOCK_ST = createMetalStorageBlockTags("storage_blocks/steel");
        //Tin
        public static final TagKey<Block> TIN_BLOCK_ST = createMetalStorageBlockTags("storage_blocks/tin");
        //Titanium
        public static final TagKey<Block> TITANIUM_BLOCK_ST = createMetalStorageBlockTags("storage_blocks/titanium");
        //Uranium
        public static final TagKey<Block> URANIUM_BLOCK_ST = createMetalStorageBlockTags("storage_blocks/uranium");
        //Zinc
        public static final TagKey<Block> ZINC_BLOCK_ST = createMetalStorageBlockTags("storage_blocks/zinc");

        private static TagKey<Block> createMetalStorageBlockTags(String path) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }
    }
}
