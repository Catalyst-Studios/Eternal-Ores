package net.radzratz.eternalores.util.tags.item.rods;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class EOGemRodsTags
{
    public static class Items
    {

        //Diamond
        public static final TagKey<Item> TAG_ROD_DIAMOND = createGemRodTag("rods/diamond");
        //Necroticarite
        public static final TagKey<Item> TAG_ROD_NECROTICARITE = createGemRodTag("rods/necroticarite");
        //Sapphire
        public static final TagKey<Item> TAG_ROD_SAPPHIRE = createGemRodTag("rods/sapphire");
        //Quantiquarite
        public static final TagKey<Item> TAG_ROD_QUANTIQUARITE = createGemRodTag("rods/quantiquarite");
        //Voiderite
        public static final TagKey<Item> TAG_ROD_TACHYARITE = createGemRodTag("rods/tachyarite");
        //Tachyarite
        public static final TagKey<Item> TAG_ROD_VOIDERITE = createGemRodTag("rods/voiderite");

        private static TagKey<Item> createGemRodTag(String path)
        {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }
    }
}
