package net.radzratz.eternalores.util.tags.item.dusts;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class EternalGemDustsTags
{
    public static class Items
    {

        //Amber
        public static final TagKey<Item> DUST_AMBER = createGemDustTag("dusts/amber");
        //Amethyst
        public static final TagKey<Item> DUST_AMETHYST = createGemDustTag("dusts/amethyst");
        //Apatite
        public static final TagKey<Item> DUST_APATITE = createGemDustTag("dusts/apatite");
        //Cinnabar
        public static final TagKey<Item> DUST_CINNABAR = createGemDustTag("dusts/cinnabar");
        //Coal (dunno if this should be here but oh well)
        public static final TagKey<Item> DUST_COAL = createGemDustTag("dusts/coal");
        //Diamond
        public static final TagKey<Item> DUST_DIAMOND = createGemDustTag("dusts/diamond");
        //Emerald
        public static final TagKey<Item> DUST_EMERALD = createGemDustTag("dusts/emerald");
        //Fluorite
        public static final TagKey<Item> DUST_FLUORITE = createGemDustTag("dusts/fluorite");
        //Lapis
        public static final TagKey<Item> DUST_LAPIS = createGemDustTag("dusts/lapis");
        //Necroticarite
        public static final TagKey<Item> DUST_NECROTICARITE = createGemDustTag("dusts/necroticarite");
        //Niter
        public static final TagKey<Item> DUST_NITER = createGemDustTag("dusts/niter");
        //Obsidian
        public static final TagKey<Item> DUST_OBSIDIAN = createGemDustTag("dusts/obsidian");
        //Onyx
        public static final TagKey<Item> DUST_ONYX = createGemDustTag("dusts/onyx");
        //Peridot
        public static final TagKey<Item> DUST_PERIDOT = createGemDustTag("dusts/peridot");
        //Quartz
        public static final TagKey<Item> DUST_QUARTZ = createGemDustTag("dusts/quartz");
        //Ruby
        public static final TagKey<Item> DUST_RUBY = createGemDustTag("dusts/ruby");
        //Sapphire
        public static final TagKey<Item> DUST_SAPPHIRE = createGemDustTag("dusts/sapphire");
        //Sulfur
        public static final TagKey<Item> DUST_SULFUR = createGemDustTag("dusts/sulfur");

        private static TagKey<Item> createGemDustTag(String path)
        {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }
    }
}
