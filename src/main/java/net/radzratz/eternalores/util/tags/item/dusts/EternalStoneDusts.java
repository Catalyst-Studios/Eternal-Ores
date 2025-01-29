package net.radzratz.eternalores.util.tags.item.dusts;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class EternalStoneDusts {
    public static class Items {

        //Overworld Dimension
        //Stone/Cobblestone/Stone Brick
        public static final TagKey<Item> DUST_STONE = createTag("dusts/stone");
        //Mossy Cobblestone/Stone Brick
        public static final TagKey<Item> DUST_MOSSY_STONE = createTag("dusts/mossy_stone");
        //Andesite
        public static final TagKey<Item> DUST_ANDESITE = createTag("dusts/andesite");
        //Diorite
        public static final TagKey<Item> DUST_DIORITE = createTag("dusts/diorite");
        //Calcite
        public static final TagKey<Item> DUST_CALCITE = createTag("dusts/calcite");
        //Granite
        public static final TagKey<Item> DUST_GRANITE = createTag("dusts/granite");
        //Concrete
        public static final TagKey<Item> DUST_CONCRETE = createTag("dusts/concrete");
        //Brick
        public static final TagKey<Item> DUST_BRICK = createTag("dusts/brick");
        //Terracotta
        public static final TagKey<Item> DUST_TERRACOTTA = createTag("dusts/terracotta");
        //Deepslate/Cobble Deepslate
        public static final TagKey<Item> DUST_DEEPSLATE = createTag("dusts/deepslate");
        //Tuff
        public static final TagKey<Item> DUST_TUFF = createTag("dusts/tuff");
        //Dripstone
        public static final TagKey<Item> DUST_DRIPSTONE = createTag("dusts/dripstone");

        //Nether Dimension
        //Netherrack/Nether Brick
        public static final TagKey<Item> DUST_NETHERRACK = createTag("dusts/netherrack");
        //Basalt
        public static final TagKey<Item> DUST_BASALT = createTag("dusts/basalt");
        //Blackstone
        public static final TagKey<Item> DUST_BLACKSTONE = createTag("dusts/blackstone");

        //End Dimension
        //Endstone
        public static final TagKey<Item> DUST_ENDSTONE = createTag("dusts/endstone");
        //Purpur
        public static final TagKey<Item> DUST_PURPUR = createTag("dusts/purpur");

        private static TagKey<Item> createTag(String path) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }
    }
}
