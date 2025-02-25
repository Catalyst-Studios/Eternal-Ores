package net.radzratz.eternalores.util.tags.block.ores;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class EternalOreBlockTags {
    public static class Blocks {

        ///OverWorld
        //Aluminum
        public static final TagKey<Block> ALUMINUM_ORE_OW = createOreBlockTags("ores/aluminum");
        //Amber
        public static final TagKey<Block> AMBER_ORE_OW = createOreBlockTags("ores/amber");
        //Apatite
        public static final TagKey<Block> APATITE_ORE_OW = createOreBlockTags("ores/apatite");
        //Cinnabar
        public static final TagKey<Block> CINNABAR_ORE_OW = createOreBlockTags("ores/cinnabar");
        //Cobalt
        public static final TagKey<Block> COBALT_ORE_OW = createOreBlockTags("ores/cobalt");
        //Fluorite
        public static final TagKey<Block> FLUORITE_ORE_OW = createOreBlockTags("ores/fluorite");
        //Gallium
        public static final TagKey<Block> GALLIUM_ORE_OW = createOreBlockTags("ores/gallium");
        //Iridium
        public static final TagKey<Block> IRIDIUM_ORE_OW = createOreBlockTags("ores/iridium");
        //Lead
        public static final TagKey<Block> LEAD_ORE_OW = createOreBlockTags("ores/lead");
        //Nickel
        public static final TagKey<Block> NICKEL_ORE_OW = createOreBlockTags("ores/nickel");
        //Niter
        public static final TagKey<Block> NITER_ORE_OW = createOreBlockTags("ores/niter");
        //Onyx
        public static final TagKey<Block> ONYX_ORE_OW = createOreBlockTags("ores/onyx");
        //Osmium
        public static final TagKey<Block> OSMIUM_ORE_OW = createOreBlockTags("ores/osmium");
        //Platinum
        public static final TagKey<Block> PLATINUM_ORE_OW = createOreBlockTags("ores/platinum");
        //Ruby
        public static final TagKey<Block> RUBY_ORE_OW = createOreBlockTags("ores/ruby");
        //Sapphire
        public static final TagKey<Block> SAPPHIRE_ORE_OW = createOreBlockTags("ores/sapphire");
        //Silver
        public static final TagKey<Block> SILVER_ORE_OW = createOreBlockTags("ores/silver");
        //Sulfur
        public static final TagKey<Block> SULFUR_ORE_OW = createOreBlockTags("ores/sulfur");
        //Tin
        public static final TagKey<Block> TIN_ORE_OW = createOreBlockTags("ores/tin");
        //Uranium
        public static final TagKey<Block> URANIUM_ORE_OW = createOreBlockTags("ores/uranium");
        //Zinc
        public static final TagKey<Block> ZINC_ORE_OW = createOreBlockTags("ores/zinc");
        ///Nether
        public static final TagKey<Block> OBSIDIAN_ORE_NETHER = createOreBlockTags("ores/obsidian");
        ///End

        private static TagKey<net.minecraft.world.level.block.Block> createOreBlockTags(String path) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", path));
        }
    }
}
