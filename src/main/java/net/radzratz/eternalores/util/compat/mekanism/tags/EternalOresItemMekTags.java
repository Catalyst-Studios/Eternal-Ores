package net.radzratz.eternalores.util.compat.mekanism.tags;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class EternalOresItemMekTags
{
    public static class Items
    {
        /// Dirty Dust C Tag
        public static final TagKey<Item> DIRTY_ALUMINUM_C = createDirtyDustTag("dirty_dust/aluminum");

        private static TagKey<Item> createDirtyDustTag(String path)
        {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }

        /// Clump C Tag
        public static final TagKey<Item> CLUMP_ALUMINUM_C = createClumpTag("clumps/aluminum");

        private static TagKey<Item> createClumpTag(String path)
        {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }

        /// Shard C Tag
        public static final TagKey<Item> SHARD_ALUMINUM_C = createShardTag("shards/aluminum");

        private static TagKey<Item> createShardTag(String path)
        {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }

        /// Crystal C Tag
        public static final TagKey<Item> CRYSTAL_ALUMINUM_C = createCrystalTag("crystals/aluminum");

        private static TagKey<Item> createCrystalTag(String path)
        {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }
    }
}
