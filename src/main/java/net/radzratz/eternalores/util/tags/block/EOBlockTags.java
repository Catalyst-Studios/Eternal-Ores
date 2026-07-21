package net.radzratz.eternalores.util.tags.block;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import static net.radzratz.eternalores.util.EOUtils.C;
import static net.radzratz.eternalores.util.EOUtils.GEO;
import static net.radzratz.eternalores.util.tags.EOTagIds.*;

@SuppressWarnings("unused")
public class EOBlockTags {
    public static class Common {
        public static final TagKey<Block> MUSHROOM_BLOCKS = crteGeneralBlockTagC("mushroom_blocks");
    }

    public static class StorageBlocks {
        public static String material;

        public static final TagKey<Block> BLOCK_METAL = crteGeneralBlockTagC("metal_block");
        public static final TagKey<Block> BLOCK_GEM = crteGeneralBlockTagC("gem_block");
        public static final TagKey<Block> BLOCK_MISC = crteGeneralBlockTagC("misc_block");
        public static final TagKey<Block> SCULKS = crteGeneralBlockTagC("sculk");
        public static final TagKey<Block> BLOCK_STORAGE_BLOCKS_RAW = crteStorageBlockTagC("raw");

        public static final TagKey<Block> BLOCK_STORAGE_ALUMINUM = crteStorageBlockTagC("aluminum");
        public static final TagKey<Block> BLOCK_STORAGE_AMBER = crteStorageBlockTagC("amber");
        public static final TagKey<Block> BLOCK_STORAGE_ANTIMATTER = crteStorageBlockTagC("antimatter");
        public static final TagKey<Block> BLOCK_STORAGE_APATITE = crteStorageBlockTagC("apatite");
        public static final TagKey<Block> BLOCK_STORAGE_ARDITE = crteStorageBlockTagC("ardite");
        public static final TagKey<Block> BLOCK_STORAGE_ARMADILLO_SCUTE = crteStorageBlockTagC("armadillo_scute");
        public static final TagKey<Block> BLOCK_STORAGE_BIOSTEEL = crteStorageBlockTagC("biosteel");
        public static final TagKey<Block> BLOCK_STORAGE_BLACK_STEEL = crteStorageBlockTagC("black_steel");
        public static final TagKey<Block> BLOCK_STORAGE_BLAZE = crteStorageBlockTagC("blaze");
        public static final TagKey<Block> BLOCK_STORAGE_BLUE_STEEL = crteStorageBlockTagC("blue_steel");
        public static final TagKey<Block> BLOCK_STORAGE_BRASS = crteStorageBlockTagC("brass");
        public static final TagKey<Block> BLOCK_STORAGE_BRITANNIA_SILVER = crteStorageBlockTagC("britannia_silver");
        public static final TagKey<Block> BLOCK_STORAGE_BRONZE = crteStorageBlockTagC("bronze");
        public static final TagKey<Block> BLOCK_STORAGE_CAST_IRON = crteStorageBlockTagC("cast_iron");
        public static final TagKey<Block> BLOCK_STORAGE_CAST_STEEL = crteStorageBlockTagC("cast_steel");
        public static final TagKey<Block> BLOCK_STORAGE_CATALYRIUM = crteStorageBlockTagC("catalyrium");
        public static final TagKey<Block> BLOCK_STORAGE_CINNABAR = crteStorageBlockTagC("cinnabar");
        public static final TagKey<Block> BLOCK_STORAGE_COBALT = crteStorageBlockTagC("cobalt");
        public static final TagKey<Block> BLOCK_STORAGE_CONSTANTAN = crteStorageBlockTagC("constantan");
        public static final TagKey<Block> BLOCK_STORAGE_DUST = crteStorageBlockTagC("dust");
        public static final TagKey<Block> BLOCK_STORAGE_ELECTRUM = crteStorageBlockTagC("electrum");
        public static final TagKey<Block> BLOCK_STORAGE_ENDER_PEARL = crteStorageBlockTagC("ender_pearl");
        public static final TagKey<Block> BLOCK_STORAGE_ENDERIUM = crteStorageBlockTagC("enderium");
        public static final TagKey<Block> BLOCK_STORAGE_ETHERIUM = crteStorageBlockTagC("etherium");
        public static final TagKey<Block> BLOCK_STORAGE_EXOTIC_MATTER = crteStorageBlockTagC("exotic_matter");
        public static final TagKey<Block> BLOCK_STORAGE_FLINT = crteStorageBlockTagC("flint");
        public static final TagKey<Block> BLOCK_STORAGE_FLUIX = crteStorageBlockTagC("fluix");
        public static final TagKey<Block> BLOCK_STORAGE_FLUORITE = crteStorageBlockTagC("fluorite");
        public static final TagKey<Block> BLOCK_STORAGE_GALLIUM = crteStorageBlockTagC("gallium");
        public static final TagKey<Block> BLOCK_STORAGE_GARNET = crteStorageBlockTagC("garnet");
        public static final TagKey<Block> BLOCK_STORAGE_GRAPHITE = crteStorageBlockTagC("graphite");
        public static final TagKey<Block> BLOCK_STORAGE_INVAR = crteStorageBlockTagC("invar");
        public static final TagKey<Block> BLOCK_STORAGE_IRIDIUM = crteStorageBlockTagC("iridium");
        public static final TagKey<Block> BLOCK_STORAGE_LEAD = crteStorageBlockTagC("lead");
        public static final TagKey<Block> BLOCK_STORAGE_LUMIUM = crteStorageBlockTagC("lumium");
        public static final TagKey<Block> BLOCK_STORAGE_NAUTILUS = crteStorageBlockTagC("nautilus");
        public static final TagKey<Block> BLOCK_STORAGE_NECROTICARITE = crteStorageBlockTagC("necroticarite");
        public static final TagKey<Block> BLOCK_STORAGE_NETHER_STAR = crteStorageBlockTagC("nether_star");
        public static final TagKey<Block> BLOCK_STORAGE_NETHERSTEEL = crteStorageBlockTagC("nethersteel");
        public static final TagKey<Block> BLOCK_STORAGE_NICKEL = crteStorageBlockTagC("nickel");
        public static final TagKey<Block> BLOCK_STORAGE_NITER = crteStorageBlockTagC("niter");
        public static final TagKey<Block> BLOCK_STORAGE_OBSIDIAN = crteStorageBlockTagC("obsidian");
        public static final TagKey<Block> BLOCK_STORAGE_ONYX = crteStorageBlockTagC("onyx");
        public static final TagKey<Block> BLOCK_STORAGE_OSMIUM = crteStorageBlockTagC("osmium");
        public static final TagKey<Block> BLOCK_STORAGE_PEARL = crteStorageBlockTagC("pearl");
        public static final TagKey<Block> BLOCK_STORAGE_PERIDOT = crteStorageBlockTagC("peridot");
        public static final TagKey<Block> BLOCK_STORAGE_PEWTER = crteStorageBlockTagC("pewter");
        public static final TagKey<Block> BLOCK_STORAGE_PIG_IRON = crteStorageBlockTagC("pig_iron");
        public static final TagKey<Block> BLOCK_STORAGE_PLATINUM = crteStorageBlockTagC("platinum");
        public static final TagKey<Block> BLOCK_STORAGE_PLUTONIUM = crteStorageBlockTagC("plutonium");
        public static final TagKey<Block> BLOCK_STORAGE_PYROLITE = crteStorageBlockTagC("pyrolite");
        public static final TagKey<Block> BLOCK_STORAGE_QUANTIQUARITE = crteStorageBlockTagC("quantiquarite");
        public static final TagKey<Block> BLOCK_STORAGE_ROSE_GOLD = crteStorageBlockTagC("rose_gold");
        public static final TagKey<Block> BLOCK_STORAGE_RUBY = crteStorageBlockTagC("ruby");
        public static final TagKey<Block> BLOCK_STORAGE_SALT = crteStorageBlockTagC("salt");
        public static final TagKey<Block> BLOCK_STORAGE_SANGUIS_VIVUS = crteStorageBlockTagC("sanguis_vivus");
        public static final TagKey<Block> BLOCK_STORAGE_SAPPHIRE = crteStorageBlockTagC("sapphire");
        public static final TagKey<Block> BLOCK_STORAGE_SCULKITE = crteStorageBlockTagC("sculkite");
        public static final TagKey<Block> BLOCK_STORAGE_SHADOWSTEEL = crteStorageBlockTagC("shadowsteel");
        public static final TagKey<Block> BLOCK_STORAGE_SIGNALUM = crteStorageBlockTagC("signalum");
        public static final TagKey<Block> BLOCK_STORAGE_SILICON = crteStorageBlockTagC("silicon");
        public static final TagKey<Block> BLOCK_STORAGE_SILVER = crteStorageBlockTagC("silver");
        public static final TagKey<Block> BLOCK_STORAGE_STEEL = crteStorageBlockTagC("steel");
        public static final TagKey<Block> BLOCK_STORAGE_STELLARIUM = crteStorageBlockTagC("stellarium");
        public static final TagKey<Block> BLOCK_STORAGE_STRANGE_MATTER = crteStorageBlockTagC("strange_matter");
        public static final TagKey<Block> BLOCK_STORAGE_SOURCE = crteStorageBlockTagC("source");
        public static final TagKey<Block> BLOCK_STORAGE_SUGAR = crteStorageBlockTagC("sugar");
        public static final TagKey<Block> BLOCK_STORAGE_TANZANITE = crteStorageBlockTagC("tanzanite");
        public static final TagKey<Block> BLOCK_STORAGE_TEMICTETL = crteStorageBlockTagC("temictetl");
        public static final TagKey<Block> BLOCK_STORAGE_TIN = crteStorageBlockTagC("tin");
        public static final TagKey<Block> BLOCK_STORAGE_TITANIUM = crteStorageBlockTagC("titanium");
        public static final TagKey<Block> BLOCK_STORAGE_TUNGSTEN = crteStorageBlockTagC("tungsten");
        public static final TagKey<Block> BLOCK_STORAGE_TURTLE_SCUTE = crteStorageBlockTagC("turtle_scute");
        public static final TagKey<Block> BLOCK_STORAGE_ULTIMATITANIUM = crteStorageBlockTagC("ultimatitanium");
        public static final TagKey<Block> BLOCK_STORAGE_URANINITE = crteStorageBlockTagC("uraninite");
        public static final TagKey<Block> BLOCK_STORAGE_URANIUM = crteStorageBlockTagC("uranium");
        public static final TagKey<Block> BLOCK_STORAGE_WROUGHT_IRON = crteStorageBlockTagC("wrought_iron");
        public static final TagKey<Block> BLOCK_STORAGE_ZINC = crteStorageBlockTagC("zinc");
        public static final TagKey<Block> BLOCK_STORAGE_ZIRCON = crteStorageBlockTagC("zircon");

        public static final TagKey<Block> BLOCK_STORAGE_RAW_ALUMINUM = crteRawStorageBlockTagC("aluminum");
        public static final TagKey<Block> BLOCK_STORAGE_RAW_ARDITE = crteRawStorageBlockTagC("ardite");
        public static final TagKey<Block> BLOCK_STORAGE_RAW_CATALYRIUM = crteRawStorageBlockTagC("catalyrium");
        public static final TagKey<Block> BLOCK_STORAGE_RAW_COBALT = crteRawStorageBlockTagC("cobalt");
        public static final TagKey<Block> BLOCK_STORAGE_RAW_GALLIUM = crteRawStorageBlockTagC("gallium");
        public static final TagKey<Block> BLOCK_STORAGE_RAW_IRIDIUM = crteRawStorageBlockTagC("iridium");
        public static final TagKey<Block> BLOCK_STORAGE_RAW_LEAD = crteRawStorageBlockTagC("lead");
        public static final TagKey<Block> BLOCK_STORAGE_RAW_NICKEL = crteRawStorageBlockTagC("nickel");
        public static final TagKey<Block> BLOCK_STORAGE_RAW_OSMIUM = crteRawStorageBlockTagC("osmium");
        public static final TagKey<Block> BLOCK_STORAGE_RAW_PLATINUM = crteRawStorageBlockTagC("platinum");
        public static final TagKey<Block> BLOCK_STORAGE_RAW_SCULKITE = crteRawStorageBlockTagC("sculkite");
        public static final TagKey<Block> BLOCK_STORAGE_RAW_SILVER = crteRawStorageBlockTagC("silver");
        public static final TagKey<Block> BLOCK_STORAGE_SULFUR = crteStorageBlockTagC("sulfur");
        public static final TagKey<Block> BLOCK_STORAGE_RAW_TIN = crteRawStorageBlockTagC("tin");
        public static final TagKey<Block> BLOCK_STORAGE_RAW_TITANIUM = crteRawStorageBlockTagC("titanium");
        public static final TagKey<Block> BLOCK_STORAGE_RAW_TUNGSTEN = crteRawStorageBlockTagC("tungsten");
        public static final TagKey<Block> BLOCK_STORAGE_RAW_ULTIMATITANIUM = crteRawStorageBlockTagC("ultimatitanium");
        public static final TagKey<Block> BLOCK_STORAGE_RAW_URANINITE = crteRawStorageBlockTagC("uraninite");
        public static final TagKey<Block> BLOCK_STORAGE_RAW_URANIUM = crteRawStorageBlockTagC("uranium");
        public static final TagKey<Block> BLOCK_STORAGE_RAW_ZINC = crteRawStorageBlockTagC("zinc");

        public static final TagKey<Block> BLOCK_STORAGE_COAL_COKE = crteStorageBlockTagC("coal_coke");
        public static final TagKey<Block> BLOCK_STORAGE_COKE = crteStorageBlockTagC("coke");

        public static final TagKey<Block> BLOCK_STORAGE_COKE_COAL = crteStorageBlockTagC("coke_coal");
        public static final TagKey<Block> BLOCK_STORAGE_FLUIX_R = crteStorageBlockTagC("fluix_crystal");
        public static final TagKey<Block> BLOCK_STORAGE_SOURCE_R = crteStorageBlockTagC("source_gemstone");

        private static TagKey<Block> crteStorageBlockTagC(String path) {
            return BlockTags.create(C(storage + path));
        }

        private static TagKey<Block> crteRawStorageBlockTagC(String path) {
            return BlockTags.create(C(storage + "raw_" + path));
        }
    }

    public static class OreBlocks {
        // Ores
        public static final TagKey<Block> BLOCK_ALUMINUM_ORE = crteOreBlockTagC("aluminum");
        public static final TagKey<Block> BLOCK_AMBER_ORE = crteOreBlockTagC("amber");
        public static final TagKey<Block> BLOCK_ANTHRACITE_ORE = crteOreBlockTagC("anthracite");
        public static final TagKey<Block> BLOCK_APATITE_ORE = crteOreBlockTagC("apatite");
        public static final TagKey<Block> BLOCK_ARDITE_ORE = crteOreBlockTagC("ardite");
        public static final TagKey<Block> BLOCK_BITUMINOUS_ORE = crteOreBlockTagC("bituminous");
        public static final TagKey<Block> BLOCK_CINNABAR_ORE = crteOreBlockTagC("cinnabar");
        public static final TagKey<Block> BLOCK_COBALT_ORE = crteOreBlockTagC("cobalt");
        public static final TagKey<Block> BLOCK_FLUORITE_ORE = crteOreBlockTagC("fluorite");
        public static final TagKey<Block> BLOCK_GALLIUM_ORE = crteOreBlockTagC("gallium");
        public static final TagKey<Block> BLOCK_GARNET_ORE = crteOreBlockTagC("garnet");
        public static final TagKey<Block> BLOCK_IRIDIUM_ORE = crteOreBlockTagC("iridium");
        public static final TagKey<Block> BLOCK_JADE_ORE = crteOreBlockTagC("jade");
        public static final TagKey<Block> BLOCK_LEAD_ORE = crteOreBlockTagC("lead");
        public static final TagKey<Block> BLOCK_NECROTICARITE_ORE = crteOreBlockTagC("necroticarite");
        public static final TagKey<Block> BLOCK_NICKEL_ORE = crteOreBlockTagC("nickel");
        public static final TagKey<Block> BLOCK_NITER_ORE = crteOreBlockTagC("niter");
        public static final TagKey<Block> BLOCK_OBSIDIAN_ORE = crteOreBlockTagC("obsidian");
        public static final TagKey<Block> BLOCK_ONYX_ORE = crteOreBlockTagC("onyx");
        public static final TagKey<Block> BLOCK_OSMIUM_ORE = crteOreBlockTagC("osmium");
        public static final TagKey<Block> BLOCK_PEARL_ORE = crteOreBlockTagC("pearl");
        public static final TagKey<Block> BLOCK_PEAT_ORE = crteOreBlockTagC("peat");
        public static final TagKey<Block> BLOCK_PERIDOT_ORE = crteOreBlockTagC("peridot");
        public static final TagKey<Block> BLOCK_PLATINUM_ORE = crteOreBlockTagC("platinum");
        public static final TagKey<Block> BLOCK_PYROLITE_ORE = crteOreBlockTagC("pyrolite");
        public static final TagKey<Block> BLOCK_RUBY_ORE = crteOreBlockTagC("ruby");
        public static final TagKey<Block> BLOCK_SALT_ORE = crteOreBlockTagC("salt");
        public static final TagKey<Block> BLOCK_SAPPHIRE_ORE = crteOreBlockTagC("sapphire");
        public static final TagKey<Block> BLOCK_SCULKITE_ORE = crteOreBlockTagC("sculkite");
        public static final TagKey<Block> BLOCK_SILVER_ORE = crteOreBlockTagC("silver");
        public static final TagKey<Block> BLOCK_SULFUR_ORE = crteOreBlockTagC("sulfur");
        public static final TagKey<Block> BLOCK_TANZANITE_ORE = crteOreBlockTagC("tanzanite");
        public static final TagKey<Block> BLOCK_TIN_ORE = crteOreBlockTagC("tin");
        public static final TagKey<Block> BLOCK_TITANIUM_ORE = crteOreBlockTagC("titanium");
        public static final TagKey<Block> BLOCK_TUNGSTEN_ORE = crteOreBlockTagC("tungsten");
        public static final TagKey<Block> BLOCK_ULTIMATITANIUM_ORE = crteOreBlockTagC("ultimatitanium");
        public static final TagKey<Block> BLOCK_URANINITE_ORE = crteOreBlockTagC("uraninite_regular");
        public static final TagKey<Block> BLOCK_URANINITE_ORE_ = crteOreBlockTagC("uraninite");
        public static final TagKey<Block> BLOCK_URANIUM_ORE = crteOreBlockTagC("uranium");
        public static final TagKey<Block> BLOCK_ZINC_ORE = crteOreBlockTagC("zinc");
        public static final TagKey<Block> BLOCK_ZIRCON_ORE = crteOreBlockTagC("zircon");

        // Ores in Ground
        public static final TagKey<Block> BLOCK_ORES_IN_GROUND_SAND = crteOresInGroundTagC("sand");
        public static final TagKey<Block> BLOCK_ORES_IN_GROUND_RED_SAND = crteOresInGroundTagC("red_sand");
        public static final TagKey<Block> BLOCK_ORES_IN_GROUND_END = crteOresInGroundTagC("end_stone");
        public static final TagKey<Block> BLOCK_ORES_IN_GROUND_SCULK = crteOresInGroundTagC("sculk");
        public static final TagKey<Block> BLOCK_ORES_IN_GROUND_GRAVEL = crteOresInGroundTagC("gravel");
        public static final TagKey<Block> BLOCK_ORES_IN_GROUND_DIORITE = crteOresInGroundTagC("diorite");
        public static final TagKey<Block> BLOCK_ORES_IN_GROUND_GRANITE = crteOresInGroundTagC("granite");
        public static final TagKey<Block> BLOCK_ORES_IN_GROUND_ANDESITE = crteOresInGroundTagC("andesite");
        public static final TagKey<Block> BLOCK_ORES_IN_GROUND_BASALT = crteOresInGroundTagC("basalt");
        public static final TagKey<Block> BLOCK_ORES_IN_GROUND_DIRT = crteOresInGroundTagC("dirt");
        public static final TagKey<Block> BLOCK_ORES_IN_GROUND_SOUL_SAND = crteOresInGroundTagC("soul_sand");
        public static final TagKey<Block> BLOCK_ORES_IN_GROUND_TUFF = crteOresInGroundTagC("tuff");
        public static final TagKey<Block> BLOCK_ORES_IN_GROUND_CLAY = crteOresInGroundTagC("clay");
        public static final TagKey<Block> BLOCK_ORES_IN_GROUND_SNOW = crteOresInGroundTagC("snow");
        public static final TagKey<Block> BLOCK_ORES_IN_GROUND_BLACKSTONE = crteOresInGroundTagC("blackstone");
        public static final TagKey<Block> BLOCK_ORES_IN_GROUND_CALCITE = crteOresInGroundTagC("calcite");

        private static TagKey<Block> crteOreBlockTagC (String path) {
            return BlockTags.create(C(ores + path));
        }

        private static TagKey<Block> crteOresInGroundTagC (String path) {
            return BlockTags.create(C(oresIn + path));
        }
    }

    public static class DustBlocks {
        public static final TagKey<Block> BLOCK_DUST = crteGeneralBlockTagC("dust_blocks");

        public static final TagKey<Block> BLOCK_DUST_COAL_COKE = crteDustBlockTagC("coal_coke");
        public static final TagKey<Block> BLOCK_DUST_COKE = crteDustBlockTagC("coke");

        public static final TagKey<Block> BLOCK_DUST_COKE_COAL_R = crteDustBlockTagC("coke_coal");

        private static TagKey<Block> crteDustBlockTagC (String path) {
            return BlockTags.create(C(dustB + path));
        }
    }

    public static class CompressedBlocks {
        public static final TagKey<Block> BLOCK_COMPRESSED = crteGeneralBlockTagC("compressed_block");

        public static final TagKey<Block> COMPRESSED_COBBLESTONE = crteCompressedBlockTagC("cobble");
        public static final TagKey<Block> COMPRESSED_SAND = crteCompressedBlockTagC("sand");
        public static final TagKey<Block> COMPRESSED_DIRT = crteCompressedBlockTagC("dirt");
        public static final TagKey<Block> COMPRESSED_ANDESITE = crteCompressedBlockTagC("andesite");
        public static final TagKey<Block> COMPRESSED_GRAVEL = crteCompressedBlockTagC("gravel");
        public static final TagKey<Block> COMPRESSED_GRANITE = crteCompressedBlockTagC("granite");
        public static final TagKey<Block> COMPRESSED_DIORITE = crteCompressedBlockTagC("diorite");

        private static TagKey<Block> crteCompressedBlockTagC(String path) {
            return BlockTags.create(C(compressedBlock + path));
        }
    }

    public static class GeOreShardBlocks {
        public static final TagKey<Block> GEOSHARD_BLOCKS = crteGeOresGeneralTag("geore_blocks");
        public static final TagKey<Block> GEOSHARD_BLOCKS_STORAGE = crteGeOresGeneralTag("geore_blocks/storage_blocks/");

        public static final TagKey<Block> CATALYRIUM_GEORE_BLOCK = crteGeOreShardBlocksTag("catalyrium");
        public static final TagKey<Block> CATALYRIUM_GEORE_BLOCK_STORAGE = crteGeOreShardStorageBlocksTag("catalyrium");

        @SuppressWarnings("all")
        private static TagKey<Block> crteGeOreShardBlocksTag(String path) {
            return BlockTags.create(GEO(geoshardBlock + path));
        }

        @SuppressWarnings("all")
        private static TagKey<Block> crteGeOreShardStorageBlocksTag(String path) {
            return BlockTags.create(GEO(geoshardBlockStorage + path));
        }
    }

    public static class GeOreBuds {
        public static final TagKey<Block> GEORE_SMALL_BUDS = crteGeOresGeneralTag("geore_small_buds");
        public static final TagKey<Block> GEORE_MEDIUM_BUDS = crteGeOresGeneralTag("geore_medium_buds");
        public static final TagKey<Block> GEORE_LARGE_BUDS = crteGeOresGeneralTag("geore_large_buds");
        public static final TagKey<Block> GEORE_CLUSTERS = crteGeOresGeneralTag("geore_clusters");
        public static final TagKey<Block> GEORE_BUDDING = crteGeOresGeneralTag("budding_geore");

        private static TagKey<Block> crteSmallBudTag(String path) {
            return BlockTags.create(GEO(georeSmallBuds + path));
        }

        private static TagKey<Block> crteMediumBudTag(String path) {
            return BlockTags.create(GEO(georeMediumBuds + path));
        }

        private static TagKey<Block> crteLargeBudTag(String path) {
            return BlockTags.create(GEO(georeLargeBuds + path));
        }
    }

    private static TagKey<Block> crteGeneralBlockTagC(String path) {
        return BlockTags.create(C(path));
    }

    private static TagKey<Block> crteGeOresGeneralTag(String path) {
        return BlockTags.create(GEO(path));
    }
}
