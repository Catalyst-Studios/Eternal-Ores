package net.radzratz.eternalores.util.tags.item.storage_blocks;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class EternalStorageMiscBlockItemTags {
    public static class Items {

        //Nether Star
        public static final TagKey<Item> NETHER_STAR_BLOCK_ST_ITEM = createMiscStorageBlockItemTags("storage_blocks/nether_star");


        private static TagKey<Item> createMiscStorageBlockItemTags(String path) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }
    }
}
