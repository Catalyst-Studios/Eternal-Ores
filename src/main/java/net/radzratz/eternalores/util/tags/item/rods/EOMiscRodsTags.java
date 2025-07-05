package net.radzratz.eternalores.util.tags.item.rods;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class EOMiscRodsTags
{
    public static class Items
    {

        //Graphite
        public static final TagKey<Item> ROD_GRAPHITE = createMiscRodTag("rods/graphite");

        private static TagKey<Item> createMiscRodTag(String path)
        {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }
    }
}
