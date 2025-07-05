package net.radzratz.eternalores.util.tags.item.dusts;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class EOStoneDustsTags
{
    public static class Items
    {

        //Overworld Dimension
        //Stone/Cobblestone/Stone Brick
        public static final TagKey<Item> DUST_STONE = createStoneDustTag("dusts/stone");
        //Mossy Cobblestone/Stone Brick
        public static final TagKey<Item> DUST_MOSSY_STONE = createStoneDustTag("dusts/mossy_stone");
        //Andesite
        public static final TagKey<Item> DUST_ANDESITE = createStoneDustTag("dusts/andesite");
        //Diorite
        public static final TagKey<Item> DUST_DIORITE = createStoneDustTag("dusts/diorite");
        //Calcite
        public static final TagKey<Item> DUST_CALCITE = createStoneDustTag("dusts/calcite");
        //Granite
        public static final TagKey<Item> DUST_GRANITE = createStoneDustTag("dusts/granite");
        //Concrete
        public static final TagKey<Item> DUST_CONCRETE = createStoneDustTag("dusts/concrete");
        //Brick
        public static final TagKey<Item> DUST_BRICK = createStoneDustTag("dusts/brick");
        //Terracotta
        public static final TagKey<Item> DUST_TERRACOTTA = createStoneDustTag("dusts/terracotta");
        //Deepslate/Cobble Deepslate
        public static final TagKey<Item> DUST_DEEPSLATE = createStoneDustTag("dusts/deepslate");
        //Tuff
        public static final TagKey<Item> DUST_TUFF = createStoneDustTag("dusts/tuff");
        //Dripstone
        public static final TagKey<Item> DUST_DRIPSTONE = createStoneDustTag("dusts/dripstone");

        //Nether Dimension
        //Netherrack/Nether Brick
        public static final TagKey<Item> DUST_NETHERRACK = createStoneDustTag("dusts/netherrack");
        //Basalt
        public static final TagKey<Item> DUST_BASALT = createStoneDustTag("dusts/basalt");
        //Blackstone
        public static final TagKey<Item> DUST_BLACKSTONE = createStoneDustTag("dusts/blackstone");

        //End Dimension
        //Endstone
        public static final TagKey<Item> DUST_ENDSTONE = createStoneDustTag("dusts/endstone");
        //Purpur
        public static final TagKey<Item> DUST_PURPUR = createStoneDustTag("dusts/purpur");

        private static TagKey<Item> createStoneDustTag(String path)
        {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }
    }
}
