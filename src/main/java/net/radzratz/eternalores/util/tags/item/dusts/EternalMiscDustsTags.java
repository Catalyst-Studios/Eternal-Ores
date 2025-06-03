package net.radzratz.eternalores.util.tags.item.dusts;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class EternalMiscDustsTags
{
    public static class Items
    {

        public static final TagKey<Item> DUST_ENDER = createMiscDustTag("dusts/ender_pearl");

        public static final TagKey<Item> DUST_GLASS = createMiscDustTag("dusts/glass");

        public static final TagKey<Item> DUST_BONE = createMiscDustTag("dusts/bone");

        public static final TagKey<Item> DUST_WOOD = createMiscDustTag("dusts/wood");

        public static final TagKey<Item> DUST_CORAL = createMiscDustTag("dusts/coral");

        public static final TagKey<Item> DUST_BLAZE = createMiscDustTag("dusts/blaze");

        public static final TagKey<Item> DUST_SCULK = createMiscDustTag("dusts/sculk");

        public static final TagKey<Item> DUST_NETHER_STAR = createMiscDustTag("dusts/nether_star");

        private static TagKey<Item> createMiscDustTag(String path)
        {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }
    }
}
