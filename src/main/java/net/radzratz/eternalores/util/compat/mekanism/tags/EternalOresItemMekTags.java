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
        public static final TagKey<Item> DIRTY_CATALYRIUM_C = createDirtyDustTag("dirty_dust/catalyrium");
        public static final TagKey<Item> DIRTY_COBALT_C = createDirtyDustTag("dirty_dust/cobalt");
        public static final TagKey<Item> DIRTY_GALLIUM_C = createDirtyDustTag("dirty_dust/gallium");
        public static final TagKey<Item> DIRTY_IRIDIUM_C = createDirtyDustTag("dirty_dust/iridium");
        public static final TagKey<Item> DIRTY_NICKEL_C = createDirtyDustTag("dirty_dust/nickel");
        public static final TagKey<Item> DIRTY_PLATINUM_C = createDirtyDustTag("dirty_dust/platinum");
        public static final TagKey<Item> DIRTY_SILVER_C = createDirtyDustTag("dirty_dust/silver");
        public static final TagKey<Item> DIRTY_URANINITE_C = createDirtyDustTag("dirty_dust/uraninite");
        public static final TagKey<Item> DIRTY_ZINC_C = createDirtyDustTag("dirty_dust/zinc");

        private static TagKey<Item> createDirtyDustTag(String path)
        {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }

        /// Clump C Tag
        public static final TagKey<Item> CLUMP_ALUMINUM_C = createClumpTag("clumps/aluminum");
        public static final TagKey<Item> CLUMP_CATALYRIUM_C = createClumpTag("clumps/catalyrium");
        public static final TagKey<Item> CLUMP_COBALT_C = createClumpTag("clumps/cobalt");
        public static final TagKey<Item> CLUMP_GALLIUM_C = createClumpTag("clumps/gallium");
        public static final TagKey<Item> CLUMP_IRIDIUM_C = createClumpTag("clumps/iridium");
        public static final TagKey<Item> CLUMP_NICKEL_C = createClumpTag("clumps/nickel");
        public static final TagKey<Item> CLUMP_PLATINUM_C = createClumpTag("clumps/platinum");
        public static final TagKey<Item> CLUMP_SILVER_C = createClumpTag("clumps/silver");
        public static final TagKey<Item> CLUMP_URANINITE_C = createClumpTag("clumps/uraninite");
        public static final TagKey<Item> CLUMP_ZINC_C = createClumpTag("clumps/zinc");

        private static TagKey<Item> createClumpTag(String path)
        {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }

        /// Shard C Tag
        public static final TagKey<Item> SHARD_ALUMINUM_C = createShardTag("shards/aluminum");
        public static final TagKey<Item> SHARD_CATALYRIUM_C = createShardTag("shards/catalyrium");
        public static final TagKey<Item> SHARD_COBALT_C = createShardTag("shards/cobalt");
        public static final TagKey<Item> SHARD_GALLIUM_C = createShardTag("shards/gallium");
        public static final TagKey<Item> SHARD_IRIDIUM_C = createShardTag("shards/iridium");
        public static final TagKey<Item> SHARD_NICKEL_C = createShardTag("shards/nickel");
        public static final TagKey<Item> SHARD_PLATINUM_C = createShardTag("shards/platinum");
        public static final TagKey<Item> SHARD_SILVER_C = createShardTag("shards/silver");
        public static final TagKey<Item> SHARD_URANINITE_C = createShardTag("shards/uraninite");
        public static final TagKey<Item> SHARD_ZINC_C = createShardTag("shards/zinc");

        private static TagKey<Item> createShardTag(String path)
        {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }

        /// Crystal C Tag
        public static final TagKey<Item> CRYSTAL_ALUMINUM_C = createCrystalTag("crystals/aluminum");
        public static final TagKey<Item> CRYSTAL_CATALYRIUM_C = createCrystalTag("crystals/catalyrium");
        public static final TagKey<Item> CRYSTAL_COBALT_C = createCrystalTag("crystals/cobalt");
        public static final TagKey<Item> CRYSTAL_GALLIUM_C = createCrystalTag("crystals/gallium");
        public static final TagKey<Item> CRYSTAL_IRIDIUM_C = createCrystalTag("crystals/iridium");
        public static final TagKey<Item> CRYSTAL_NICKEL_C = createCrystalTag("crystals/nickel");
        public static final TagKey<Item> CRYSTAL_PLATINUM_C = createCrystalTag("crystals/platinum");
        public static final TagKey<Item> CRYSTAL_SILVER_C = createCrystalTag("crystals/silver");
        public static final TagKey<Item> CRYSTAL_URANINITE_C = createCrystalTag("crystals/uraninite");
        public static final TagKey<Item> CRYSTAL_ZINC_C = createCrystalTag("crystals/zinc");

        private static TagKey<Item> createCrystalTag(String path)
        {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }
    }
}
