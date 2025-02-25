package net.radzratz.eternalores.util.tags.item.ores;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class EternalOreBlockItemTags {
    public static class Items {

        ///OverWorld
        //Aluminum
        public static final TagKey<Item> ITEM_ALUMINUM_ORE_OW = createOreBlockTags("ores/aluminum");
        //Amber
        public static final TagKey<Item> ITEM_AMBER_ORE_OW = createOreBlockTags("ores/amber");
        //Apatite
        public static final TagKey<Item> ITEM_APATITE_ORE_OW = createOreBlockTags("ores/apatite");
        //Cinnabar
        public static final TagKey<Item> ITEM_CINNABAR_ORE_OW = createOreBlockTags("ores/cinnabar");
        //Cobalt
        public static final TagKey<Item> ITEM_COBALT_ORE_OW = createOreBlockTags("ores/cobalt");
        //Fluorite
        public static final TagKey<Item> ITEM_FLUORITE_ORE_OW = createOreBlockTags("ores/fluorite");
        //Gallium
        public static final TagKey<Item> ITEM_GALLIUM_ORE_OW = createOreBlockTags("ores/gallium");
        //Iridium
        public static final TagKey<Item> ITEM_IRIDIUM_ORE_OW = createOreBlockTags("ores/iridium");
        //Lead
        public static final TagKey<Item> ITEM_LEAD_ORE_OW = createOreBlockTags("ores/lead");
        //Nickel
        public static final TagKey<Item> ITEM_NICKEL_ORE_OW = createOreBlockTags("ores/nickel");
        //Niter
        public static final TagKey<Item> ITEM_NITER_ORE_OW = createOreBlockTags("ores/niter");
        //Onyx
        public static final TagKey<Item> ITEM_ONYX_ORE_OW = createOreBlockTags("ores/onyx");
        //Osmium
        public static final TagKey<Item> ITEM_OSMIUM_ORE_OW = createOreBlockTags("ores/osmium");
        //Platinum
        public static final TagKey<Item> ITEM_PLATINUM_ORE_OW = createOreBlockTags("ores/platinum");
        //Ruby
        public static final TagKey<Item> ITEM_RUBY_ORE_OW = createOreBlockTags("ores/ruby");
        //Sapphire
        public static final TagKey<Item> ITEM_SAPPHIRE_ORE_OW = createOreBlockTags("ores/sapphire");
        //Silver
        public static final TagKey<Item> ITEM_SILVER_ORE_OW = createOreBlockTags("ores/silver");
        //Sulfur
        public static final TagKey<Item> ITEM_SULFUR_ORE_OW = createOreBlockTags("ores/sulfur");
        //Tin
        public static final TagKey<Item> ITEM_TIN_ORE_OW = createOreBlockTags("ores/tin");
        //Uranium
        public static final TagKey<Item> ITEM_URANIUM_ORE_OW = createOreBlockTags("ores/uranium");
        //Zinc
        public static final TagKey<Item> ITEM_ZINC_ORE_OW = createOreBlockTags("ores/zinc");
        ///Nether
        public static final TagKey<Item> ITEM_OBSIDIAN_ORE_NETHER = createOreBlockTags("ores/obsidian");
        ///End

        private static TagKey<Item> createOreBlockTags(String path) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }
    }
}
