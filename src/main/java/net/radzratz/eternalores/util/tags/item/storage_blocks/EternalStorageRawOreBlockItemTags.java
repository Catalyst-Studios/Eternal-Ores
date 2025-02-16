package net.radzratz.eternalores.util.tags.item.storage_blocks;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class EternalStorageRawOreBlockItemTags {
    public static class Blocks {

        //Aluminum
        public static final TagKey<Item> RAW_ALUMINUM_ST_ITEM = createRawOreBlockItemTags("storage_blocks/raw_aluminum");
        //Cobalt
        public static final TagKey<Item> RAW_COBALT_ST_ITEM = createRawOreBlockItemTags("storage_blocks/raw_cobalt");
        //Lead
        public static final TagKey<Item> RAW_LEAD_ST_ITEM = createRawOreBlockItemTags("storage_blocks/raw_lead");
        //Nickel
        public static final TagKey<Item> RAW_NICKEL_ST_ITEM = createRawOreBlockItemTags("storage_blocks/raw_nickel");
        //Osmium
        public static final TagKey<Item> RAW_OSMIUM_ST_ITEM = createRawOreBlockItemTags("storage_blocks/raw_osmium");
        //Platinum
        public static final TagKey<Item> RAW_PLATINUM_ST_ITEM = createRawOreBlockItemTags("storage_blocks/raw_platinum");
        //Silver
        public static final TagKey<Item> RAW_SILVER_ST_ITEM = createRawOreBlockItemTags("storage_blocks/raw_silver");
        //Sulfur
        public static final TagKey<Item> SULFUR_ST_ITEM = createRawOreBlockItemTags("storage_blocks/sulfur");
        //Tin
        public static final TagKey<Item> RAW_TIN_ST_ITEM = createRawOreBlockItemTags("storage_blocks/raw_tin");
        //Uranium
        public static final TagKey<Item> RAW_URANIUM_ST_ITEM = createRawOreBlockItemTags("storage_blocks/raw_uranium");
        //Zinc
        public static final TagKey<Item> RAW_ZINC_ST_ITEM = createRawOreBlockItemTags("storage_blocks/raw_zinc");

        private static TagKey<Item> createRawOreBlockItemTags(String path) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }
    }
}
