package net.radzratz.eternalores.util.tags.item.gears;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class EOGemGearTags
{
    public static class Items
    {
        //Amber
        public static final TagKey<Item> GEAR_AMBER = createGemGearTag("gears/amber");
        //Cinnabar
        public static final TagKey<Item> GEAR_CINNABAR = createGemGearTag("gears/cinnabar");
        //Diamond
        public static final TagKey<Item> GEAR_DIAMOND = createGemGearTag("gears/diamond");
        //Necroticarite
        public static final TagKey<Item> GEAR_NECROTICARITE = createGemGearTag("gears/necroticarite");
        //Obsidian
        public static final TagKey<Item> GEAR_OBSIDIAN = createGemGearTag("gears/obsidian");
        //Peridot
        public static final TagKey<Item> GEAR_PERIDOT = createGemGearTag("gears/peridot");
        //Ruby
        public static final TagKey<Item> GEAR_RUBY = createGemGearTag("gears/ruby");
        //Sapphire
        public static final TagKey<Item> GEAR_SAPPHIRE = createGemGearTag("gears/sapphire");
        //Quantiquarite
        public static final TagKey<Item> GEAR_QUANTIQUARITE = createGemGearTag("gears/quantiquarite");
        //Tachyarite
        public static final TagKey<Item> GEAR_TACHYARITE = createGemGearTag("gears/tachyarite");
        //Voiderite
        public static final TagKey<Item> GEAR_VOIDERITE = createGemGearTag("gears/voiderite");

        private static TagKey<Item> createGemGearTag(String path)
        {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }
    }
}
