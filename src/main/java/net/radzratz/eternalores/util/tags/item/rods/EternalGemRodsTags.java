package net.radzratz.eternalores.util.tags.item.rods;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class EternalGemRodsTags {
    public static class Items {

        //Diamond
        public static final TagKey<Item> ROD_DIAMOND = createGemRodTag("rods/diamond");
        //Sapphire
        public static final TagKey<Item> ROD_SAPPHIRE = createGemRodTag("rods/sapphire");

        private static TagKey<Item> createGemRodTag(String path) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }
    }
}
