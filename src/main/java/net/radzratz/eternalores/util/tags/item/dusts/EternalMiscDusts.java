package net.radzratz.eternalores.util.tags.item.dusts;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class EternalMiscDusts {
    public static class Items {

        public static final TagKey<Item> DUST_ENDER = createTag("dusts/ender");

        public static final TagKey<Item> DUST_GLASS = createTag("dusts/glass");

        public static final TagKey<Item> DUST_BONE = createTag("dusts/bone");

        public static final TagKey<Item> DUST_WOOD = createTag("dusts/wood");

        public static final TagKey<Item> DUST_CORAL = createTag("dusts/coral");

        public static final TagKey<Item> DUST_BLAZE = createTag("dusts/blaze");

        private static TagKey<Item> createTag(String path) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }
    }
}
