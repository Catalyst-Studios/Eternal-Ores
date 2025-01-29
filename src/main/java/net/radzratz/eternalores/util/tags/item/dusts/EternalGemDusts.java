package net.radzratz.eternalores.util.tags.item.dusts;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class EternalGemDusts {
    public static class Items {

        //Amber
        public static final TagKey<Item> DUST_AMBER = createTag("dusts/amber");
        //Apatite
        public static final TagKey<Item> DUST_APATITE = createTag("dusts/apatite");
        //Cinnabar
        public static final TagKey<Item> DUST_CINNABAR = createTag("dusts/cinnabar");
        //Coal (dunno if this should be here but oh well)
        public static final TagKey<Item> DUST_COAL = createTag("dusts/coal");
        //Diamond
        public static final TagKey<Item> DUST_DIAMOND = createTag("dusts/diamond");
        //Emerald
        public static final TagKey<Item> DUST_EMERALD = createTag("dusts/emerald");
        //Lapis
        public static final TagKey<Item> DUST_LAPIS = createTag("dusts/lapis");
        //Niter
        public static final TagKey<Item> DUST_NITER = createTag("dusts/niter");
        //Obsidian
        public static final TagKey<Item> DUST_OBSIDIAN = createTag("dusts/obsidian");
        //Onyx
        public static final TagKey<Item> DUST_ONYX = createTag("dusts/onyx");
        //Peridot
        public static final TagKey<Item> DUST_PERIDOT = createTag("dusts/peridot");
        //Quartz
        public static final TagKey<Item> DUST_QUARTZ = createTag("dusts/quartz");
        //Ruby
        public static final TagKey<Item> DUST_RUBY = createTag("dusts/ruby");
        //Sapphire
        public static final TagKey<Item> DUST_SAPPHIRE = createTag("dusts/sapphire");
        //Sulfur
        public static final TagKey<Item> DUST_SULFUR = createTag("dusts/sulfur");

        private static TagKey<Item> createTag(String path) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }
    }
}
