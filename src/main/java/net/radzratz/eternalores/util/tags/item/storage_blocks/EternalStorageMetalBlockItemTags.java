package net.radzratz.eternalores.util.tags.item.storage_blocks;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class EternalStorageMetalBlockItemTags {
    public static class Blocks{

        //Aluminum
        public static final TagKey<Item> ALUMINUM_BLOCK_ST_ITEM = createMetalStorageBlockItemTags("storage_blocks/aluminum");
        //Blue Steel
        public static final TagKey<Item> BLUE_STEEL_BLOCK_ST_ITEM = createMetalStorageBlockItemTags("storage_blocks/blue_steel");
        //Brass
        public static final TagKey<Item> BRASS_BLOCK_ST_ITEM = createMetalStorageBlockItemTags("storage_blocks/brass");
        //Britannia Silver
        public static final TagKey<Item> BRITANNIA_BLOCK_ST_ITEM = createMetalStorageBlockItemTags("storage_blocks/britannia_silver");
        //Bronze
        public static final TagKey<Item> BRONZE_BLOCK_ST_ITEM = createMetalStorageBlockItemTags("storage_blocks/bronze");
        //Cobalt
        public static final TagKey<Item> COBALT_BLOCK_ST_ITEM = createMetalStorageBlockItemTags("storage_blocks/cobalt");
        //Constantan
        public static final TagKey<Item> CONSTANTAN_BLOCK_ST_ITEM = createMetalStorageBlockItemTags("storage_blocks/constantan");
        //Electrum
        public static final TagKey<Item> ELECTRUM_BLOCK_ST_ITEM = createMetalStorageBlockItemTags("storage_blocks/electrum");
        //Enderium
        public static final TagKey<Item> ENDERIUM_BLOCK_ST_ITEM = createMetalStorageBlockItemTags("storage_blocks/enderium");
        //Gallium
        public static final TagKey<Item> GALLIUM_BLOCK_ST_ITEM = createMetalStorageBlockItemTags("storage_blocks/gallium");
        //Invar
        public static final TagKey<Item> INVAR_BLOCK_ST_ITEM = createMetalStorageBlockItemTags("storage_blocks/invar");
        //Iridium
        public static final TagKey<Item> IRIDIUM_BLOCK_ST_ITEM = createMetalStorageBlockItemTags("storage_blocks/iridium");
        //Lead
        public static final TagKey<Item> LEAD_BLOCK_ST_ITEM = createMetalStorageBlockItemTags("storage_blocks/lead");
        //Lumium
        public static final TagKey<Item> LUMIUM_BLOCK_ST_ITEM = createMetalStorageBlockItemTags("storage_blocks/lumium");
        //Nickel
        public static final TagKey<Item> NICKEL_BLOCK_ST_ITEM = createMetalStorageBlockItemTags("storage_blocks/nickel");
        //Osmium
        public static final TagKey<Item> OSMIUM_BLOCK_ST_ITEM = createMetalStorageBlockItemTags("storage_blocks/osmium");
        //Pewter
        public static final TagKey<Item> PEWTER_BLOCK_ST_ITEM = createMetalStorageBlockItemTags("storage_blocks/pewter");
        //Platinum
        public static final TagKey<Item> PLATINUM_BLOCK_ST_ITEM = createMetalStorageBlockItemTags("storage_blocks/platinum");
        //Rose Gold
        public static final TagKey<Item> ROSE_GOLD_BLOCK_ST_ITEM = createMetalStorageBlockItemTags("storage_blocks/rose_gold");
        //Signalum
        public static final TagKey<Item> SIGNALUM_BLOCK_ST_ITEM = createMetalStorageBlockItemTags("storage_blocks/signalum");
        //Silver
        public static final TagKey<Item> SILVER_BLOCK_ST_ITEM = createMetalStorageBlockItemTags("storage_blocks/silver");
        //Steel
        public static final TagKey<Item> STEEL_BLOCK_ST_ITEM = createMetalStorageBlockItemTags("storage_blocks/steel");
        //Tin
        public static final TagKey<Item> TIN_BLOCK_ST_ITEM = createMetalStorageBlockItemTags("storage_blocks/tin");
        //Titanium
        public static final TagKey<Item> TITANIUM_BLOCK_ST_ITEM = createMetalStorageBlockItemTags("storage_blocks/titanium");
        //Uranium
        public static final TagKey<Item> URANIUM_BLOCK_ST_ITEM = createMetalStorageBlockItemTags("storage_blocks/uranium");
        //Zinc
        public static final TagKey<Item> ZINC_BLOCK_ST_ITEM = createMetalStorageBlockItemTags("storage_blocks/zinc");

        private static TagKey<Item> createMetalStorageBlockItemTags(String path) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }
    }
}
