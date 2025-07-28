package net.radzratz.eternalores.util.tags.item.gems;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class EOGemTags
{
    public static class Items
    {

        //Amber
        public static final TagKey<Item> TAG_GEM_AMBER = createGemTags("gems/amber");
        //Apatite
        public static final TagKey<Item> TAG_GEM_APATITE = createGemTags("gems/apatite");
        //Cinnabar
        public static final TagKey<Item> TAG_GEM_CINNABAR = createGemTags("gems/cinnabar");
        //Fluorite
        public static final TagKey<Item> TAG_GEM_FLUORITE = createGemTags("gems/fluorite");
        //Necroticarite
        public static final TagKey<Item> TAG_GEM_NECROTICARITE = createGemTags("gems/necroticarite");
        //Niter
        public static final TagKey<Item> TAG_GEM_NITER = createGemTags("gems/niter");
        //Obsidian
        public static final TagKey<Item> TAG_GEM_OBSIDIAN = createGemTags("gems/obsidian");
        //Onyx
        public static final TagKey<Item> TAG_GEM_ONYX = createGemTags("gems/onyx");
        //Peridot
        public static final TagKey<Item> TAG_GEM_PERIDOT = createGemTags("gems/peridot");
        //Ruby
        public static final TagKey<Item> TAG_GEM_RUBY = createGemTags("gems/ruby");
        //Sapphire
        public static final TagKey<Item> TAG_GEM_SAPPHIRE = createGemTags("gems/sapphire");
        //Quantiquarite
        public static final TagKey<Item> TAG_GEM_QUANTIQUARITE = createGemTags("gems/quantiquarite");
        //Tachyarite
        public static final TagKey<Item> TAG_GEM_TACHYARITE = createGemTags("gems/tachyarite");
        //Voiderite
        public static final TagKey<Item> TAG_GEM_VOIDERITE = createGemTags("gems/voiderite");

        private static TagKey<Item> createGemTags(String path)
        {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }
    }
}
