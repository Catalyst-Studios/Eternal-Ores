package net.radzratz.eternalores.util.tags.item.storage_blocks;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class EternalStorageGemBlockItemTags
{
    public static class Items
    {

        //Amber
        public static final TagKey<Item> AMBER_BLOCK_ST_ITEM = createGemStorageBlockItemTags("storage_blocks/amber");
        //Apatite
        public static final TagKey<Item> APATITE_BLOCK_ST_ITEM = createGemStorageBlockItemTags("storage_blocks/apatite");
        //Cinnabar
        public static final TagKey<Item> CINNABAR_BLOCK_ST_ITEM = createGemStorageBlockItemTags("storage_blocks/cinnabar");
        //Fluorite
        public static final TagKey<Item> FLUORITE_BLOCK_ST_ITEM = createGemStorageBlockItemTags("storage_blocks/fluorite");
        //Necroticarite
        public static final TagKey<Item> NECROTICARITE_BLOCK_ST_ITEM = createGemStorageBlockItemTags("storage_blocks/necroticarite");
        //Niter
        public static final TagKey<Item> NITER_BLOCK_ST_ITEM = createGemStorageBlockItemTags("storage_blocks/niter");
        //Onxy
        public static final TagKey<Item> ONYX_BLOCK_ST_ITEM = createGemStorageBlockItemTags("storage_blocks/onyx");
        //Peridot
        public static final TagKey<Item> PERIDOT_BLOCK_ST_ITEM = createGemStorageBlockItemTags("storage_blocks/peridot");
        //Ruby
        public static final TagKey<Item> RUBY_BLOCK_ST_ITEM = createGemStorageBlockItemTags("storage_blocks/ruby");
        //Sapphire
        public static final TagKey<Item> SAPPHIRE_BLOCK_ST_ITEM = createGemStorageBlockItemTags("storage_blocks/sapphire");

        private static TagKey<Item> createGemStorageBlockItemTags(String path)
        {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }
    }
}
