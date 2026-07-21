package net.radzratz.eternalores.util;

import net.minecraft.world.level.block.SoundType;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.radzratz.eternalores.block.types.*;
import net.radzratz.eternalores.block.types.enums.EOBlockTier;
import net.radzratz.eternalores.block.types.enums.EOreLayerType;
import net.radzratz.eternalores.block.types.special.EORedstoneBlock;
import net.radzratz.eternalores.item.special.ingots.EOUnstableIngot;
import net.radzratz.eternalores.item.types.*;
import net.radzratz.eternalores.util.config.util.EOMaterialConfigHelper;

import static net.radzratz.eternalores.block.EOBlockHelpers.*;
import static net.radzratz.eternalores.item.helpers.EOItemHelpers.*;
import static net.radzratz.eternalores.util.EOMaterials.materialPrefixSuffixes.*;

/**
 * Here be dragons
 * <p>
 * Tag, Lang, Recipe, and Item/Block Registry ids are handled with this monstrosity
 */
public class EOMaterials {
    public static class materialNames {
        public static final String ALUMINUM_ID = "aluminum";
        public static final String ARDITE_ID = "ardite";
        public static final String BERYLLIUM_ID = "beryllium";
        public static final String CATALYRIUM_ID = "catalyrium";
        public static final String COBALT_ID = "cobalt";
        public static final String GALLIUM_ID = "gallium";
        public static final String IRIDIUM_ID = "iridium";
        public static final String LEAD_ID = "lead";
        public static final String MOLYBDENUM_ID = "molybdenum";
        public static final String NICKEL_ID = "nickel";
        public static final String NEODYMIUM_ID = "neodymium";
        public static final String OSMIUM_ID = "osmium";
        public static final String PALLADIUM_ID = "palladium";
        public static final String PLATINUM_ID = "platinum";
        public static final String SCULKITE_ID = "sculkite";
        public static final String SILVER_ID = "silver";
        public static final String SULFUR_ID = "sulfur";
        public static final String TIN_ID = "tin";
        public static final String TITANIUM_ID = "titanium";
        public static final String TUNGSTEN_ID = "tungsten";
        public static final String ULTIMATITANIUM_ID = "ultimatitanium";
        public static final String URANINITE_ID = "uraninite";
        public static final String URANIUM_ID = "uranium";
        public static final String VANADIUM_ID = "vanadium";
        public static final String ZINC_ID = "zinc";

        public static final String NETHERITE_ID = "netherite";
        public static final String ANCIENT_DEBRI_ID = "ancient_debris";
        public static final String COPPER_ID = "copper";
        public static final String IRON_ID = "iron";
        public static final String GOLD_ID = "gold";
        public static final String AMETHYST_ID = "amethyst";
        public static final String LAPIS_ID = "lapis";
        public static final String DIAMOND_ID = "diamond";
        public static final String EMERALD_ID = "emerald";
        public static final String PRISMARINE_ID = "prismarine";
        public static final String COAL_ID = "coal";
        public static final String CHARCOAL_ID = "charcoal";
        public static final String QUARTZ_ID = "quartz";
        public static final String REDSTONE_ID = "redstone";
        public static final String GRAVEL_ID = "gravel";
        public static final String STONE_ID = "stone";
        public static final String BLACKSTONE_ID = "blackstone";
        public static final String GRANITE_ID = "granite";
        public static final String DIORITE_ID = "diorite";
        public static final String ANDESITE_ID = "andesite";
        public static final String BASALT_ID = "basalt";
        public static final String TUFF_ID = "tuff";
        public static final String CALCITE_ID = "calcite";
        public static final String DEEPSLATE_ID = "deepslate";
        public static final String END_STONE_ID = "end_stone";
        public static final String NETHERRACK_ID = "netherrack";
        public static final String BRICK_ID = "brick";
        public static final String DRIPSTONE_ID = "dripstone";
        public static final String PURPUR_ID = "purpur";
        public static final String NETHER_BRICK_ID = "nether_brick";
        public static final String CLAY_ID = "clay";
        public static final String SAND_ID = "sand";
        public static final String RED_SAND_ID = "red_sand";
        public static final String SOUL_SAND_ID = "soul_sand";
        public static final String NETHER_WART_ID = "nether_wart";
        public static final String WARPED_NETHER_WART_ID = "warped_nether_wart";
        public static final String ENDER_PEARL_ID = "ender_pearl";
        public static final String FLINT_ID = "flint";
        public static final String NAUTILUS_SHELL_ID = "nautilus";
        public static final String SHULKER_SHELL_ID = "shulker_shell";
        public static final String NETHER_STAR_ID = "nether_star";
        public static final String SCULK_ID = "sculk";
        public static final String BLAZE_ID = "blaze";
        public static final String GLOWSTONE_ID = "glowstone";
        public static final String ARMADILLO_SCUTE_ID = "armadillo_scute";
        public static final String TURTLE_ID = "turtle_scute";
        public static final String PHANTOM_MEMBRANE_ID = "phantom_membrane";
        public static final String ROTTEN_FLESH_ID = "rotten_flesh";
        public static final String ENDER_EYE_ID = "ender_eye";
        public static final String SUGAR_ID = "sugar";

        public static final String ANTHRACITE_ID = "anthracite_coal";
        public static final String BITUMINOUS_ID = "bituminous_coal";
        public static final String COKE_ID = "coke_coal";
        public static final String LIGNITE_ID = "lignite_coal";
        public static final String PEAT_ID = "peat_coal";

        public static final String AMBER_ID = "amber";
        public static final String APATITE_ID = "apatite";
        public static final String ARCANUM_ID = "arcanum";
        public static final String BLACK_QUARTZ_ID = "black_quartz";
        public static final String CERTUS_QUARTZ_ID = "certus_quartz";
        public static final String CINNABAR_ID = "cinnabar";
        public static final String FLUIX_ID = "fluix";
        public static final String FLUORITE_ID = "fluorite";
        public static final String GARNET_ID = "garnet";
        public static final String JADE_ID = "jade";
        public static final String MONAZITE_ID = "monazite";
        public static final String MORPHITE_ID = "morphite";
        public static final String NECROTICARITE_ID = "necroticarite";
        public static final String NITER_ID = "niter";
        public static final String OBSIDIAN_ID = "obsidian";
        public static final String ONYX_ID = "onyx";
        public static final String PEARL_ID = "pearl";
        public static final String PERIDOT_ID = "peridot";
        public static final String PRIMORNIUM_ID = "primornium";
        public static final String PYROLITE_ID = "pyrolite";
        public static final String QUANTIQUARITE_ID = "quantiquarite";
        public static final String RUBY_ID = "ruby";
        public static final String SANGUIS_VIVUS_ID = "sanguis_vivus";
        public static final String SAPPHIRE_ID = "sapphire";
        public static final String SOURCE_ID = "source";
        public static final String SPECTRAL_SKY_BLUERITE_ID = "spectral_sky_bluerite";
        public static final String SPINEL_ID = "spinel";
        public static final String TACHYARITE_ID = "tachyarite";
        public static final String TANZANITE_ID = "tanzanite";
        public static final String TEMICTETL_ID = "temictetl";
        public static final String VOIDERITE_ID = "voiderite";
        public static final String ZIRCON_ID = "zircon";

        public static final String ALUMITE_ID = "alumite";
        public static final String AMERICIUM_ID = "americium";
        public static final String ANNEALED_COPPER_ID = "annealed_copper";
        public static final String ANTIMATTER_ID = "antimatter";
        public static final String AURORIUM_ID = "aurorium";
        public static final String BATTERY_ALLOY_ID = "battery_alloy";
        public static final String BISMUTH_ID = "bismuth";
        public static final String BIOSTEEL_ID = "biosteel";
        public static final String BLACK_BRONZE_ID = "black_bronze";
        public static final String BLACK_STEEL_ID = "black_steel";
        public static final String BLUE_STEEL_ID = "blue_steel";
        public static final String BRASS_ID = "brass";
        public static final String BRITANNIA_SILVER_ID = "britannia_silver";
        public static final String BRONZE_ID = "bronze";
        public static final String CADMIUM_ID = "cadmium";
        public static final String CALIFORNIUM_ID = "californium";
        public static final String CAST_IRON_ID = "cast_iron";
        public static final String CAST_STEEL_ID = "cast_steel";
        public static final String CERIUM_ID = "cerium";
        public static final String CESIUM_ID = "cesium";
        public static final String CHROMIUM_ID = "chromium";
        public static final String CONSTANTAN_ID = "constantan";
        public static final String COSMIC_MATTER_ID = "cosmic_matter";
        public static final String CRYSTALLINE_ALLOY_ID = "crystalline_alloy";
        public static final String CUPRONICKEL_ID = "cupronickel";
        public static final String ELECTRUM_ID = "electrum";
        public static final String ENDERIUM_ID = "enderium";
        public static final String ENERGETIC_SILVER_ID = "energetic_silver";
        public static final String ETERNAL_DARK_ID = "eternal_dark";
        public static final String ETERNAL_LIGHT_ID = "eternal_light";
        public static final String ETERNITY_ID = "eternity";
        public static final String ETHERIUM_ID = "etherium";
        public static final String EXOTIC_MATTER_ID = "exotic_matter";
        public static final String FRANCIUM_ID = "francium";
        public static final String GRAPHITE_ID = "graphite";
        public static final String GRAVITRONIUM_ID = "gravitronium";
        public static final String HAFNIUM_ID = "hafnium";
        public static final String HEPATIZON_ID = "hepatizon";
        public static final String INDIUM_ID = "indium";
        public static final String INVAR_ID = "invar";
        public static final String KANTHAL_ID = "kanthal";
        public static final String LUMIUM_ID = "lumium";
        public static final String MAGNESIUM_ID = "magnesium";
        public static final String MANGANESE_ID = "manganese";
        public static final String MELODIC_ALLOY_ID = "melodic_alloy";
        public static final String MISSING_ID = "missing";
        public static final String MODULARIUM_ID = "modularium";
        public static final String NANITE_ID = "nanite";
        public static final String NEPTUNIUM_ID = "neptunium";
        public static final String NETHERSTEEL_ID = "nethersteel";
        public static final String NIOBIUM_ID = "niobium";
        public static final String NOVALLOY_ID = "novalloy";
        public static final String OSGLOGLAS_ID = "osgloglas";
        public static final String PEWTER_ID = "pewter";
        public static final String PIG_IRON_ID = "pig_iron";
        public static final String PLUTONIUM_ID = "plutonium";
        public static final String QUARTZ_ENRICHED_COPPER_ID = "quartz_enriched_copper";
        public static final String QUARTZ_ENRICHED_IRON_ID = "quartz_enriched_iron";
        public static final String RED_STEEL_ID = "red_steel";
        public static final String RHODIUM_ID = "rhodium";
        public static final String ROSE_GOLD_ID = "rose_gold";
        public static final String RUBIDIUM_ID = "rubidium";
        public static final String RUTHENIUM_ID = "ruthenium";
        public static final String SAMARIUM_ID = "samarium";
        public static final String SELENIUM_ID = "selenium";
        public static final String SHADOWSTEEL_ID = "shadowsteel";
        public static final String SIGNALUM_ID = "signalum";
        public static final String SILICON_ID = "silicon";
        public static final String STAINLESS_STEEL_ID = "stainless_steel";
        public static final String STEEL_ID = "steel";
        public static final String STELLAR_ALLOY_ID = "stellar_alloy";
        public static final String STELLARIUM_ID = "stellarium";
        public static final String STRANGE_MATTER_ID = "strange_matter";
        public static final String TANTALUM_ID = "tantalum";
        public static final String UNIVERSIUM_ID = "universium";
        public static final String UNSTABLE_ID = "unstable";
        public static final String UNSTABLE_STABLE_ID = "unstable_stable";
        public static final String VIVID_ALLOY_ID = "vivid_alloy";
        public static final String WROUGHT_IRON_ID = "wrought_iron";
        public static final String YTTRIUM_ID = "yttrium";

        public static final String WOOD_ID = "wooden";
        public static final String SAWDUST_ID = "sawdust";
        public static final String BIOMASS_ID = "biomass";
        public static final String RARE_EARTH_ID = "rare_earth";
        public static final String CALCIUM_ID = "calcium";
        public static final String DUST_ID = "dust";
        public static final String PHOSPHORUS_ID = "phosphorus";
        public static final String SALT_ID = "salt";

        public static final String SHADOW_BLEND_ID = "shadow";
        public static final String CARBON_BLEND_ID = "carbon";
        public static final String LE_CARBON_BLEND_ID = "low_enriched_carbon";
        public static final String HE_CARBON_BLEND_ID = "highly_enriched_carbon";
        public static final String NETHER_BLEND_ID = "nether";
        public static final String ENERGETIC_BLEND_ID = "energetic";
        public static final String ENDERGETIC_BLEND_ID = "endergetic";
    }

    public static class materialPrefixSuffixes {
        public static final String WIRE_CUT = "_wire_cutter";
        public static final String GEM_CUT = "_gem_cutter";
        public static final String HAMMER = "_hammer";

        public static final String PLATE = "plate_";
        public static final String ROD = "rod_";
        public static final String GEAR = "gear_";
        public static final String RAW = "raw_";
        public static final String SHARD = "shard_";
        public static final String GEM = "gem_";
        public static final String GEM_SHARD = "_shard";
        public static final String WIRE = "wire_";
        public static final String CRYSTAL = "crystal_";
        public static final String DUST = "_dust";
        public static final String DIRTY_DUST = "dirty_";
        public static final String INGOT = "_ingot";
        public static final String NUGGET = "_nugget";
        public static final String SMALL_CLUMP = "_small_clump";
        public static final String SMALL_DUST = "_small_dust";
        public static final String ORE_GEM = "_gem";
        public static final String CLUMP = "clump_";
        public static final String COAL = "_coal";
        public static final String ENRICHED = "enriched_";
        public static final String BLEND = "_blend";
        public static final String MOLD = "mold_";
        public static final String FOIL = "_foil";
        public static final String GRINDING_BALL = "_grinding_ball";
        public static final String CAPACITOR = "_capacitor";
        public static final String GEOSHARDS = "_geoshard";
        public static final String PEBBLE = "_pebble";
        public static final String wPlate = "wooden_plate_";

        public static final String ORE = "_ore_block";
        public static final String SLATE_ORE = "deepslate_";
        public static final String NETHER_ORE = "nether_";
        public static final String END_ORE = "end_";
        public static final String BLOCK = "_block";
        @SuppressWarnings("unused")
        public static final String COMPRESSED = "compressed_";
        public static final String DUST_BLOCK = "_dust_block";
        public static final String COAL_BLOCK = "_coal_block";
        public static final String GEORE_BLOCK = "_geo_block";
        public static final String SMALL_GEO = "small_";
        public static final String MEDIUM_GEO = "medium_";
        public static final String LARGE_GEO = "large_";
        public static final String CLUSTER = "_cluster";
        public static final String BUD = "_bud";
        public static final String BUDDING = "budding_";

        public static final String CLEAN = "clean_";
        public static final String DIRTY = "dirty_";
    }

    public static final class materialTypes {
        public final DeferredItem<EOItems> ITEM;
        public final DeferredItem<EOIngotItem> INGOT;
        public final DeferredItem<EOUnstableIngot> UNSTABLE;
        public final DeferredItem<EONuggetItem> NUGGET;
        public final DeferredItem<EODustItem> DUST;
        public final DeferredItem<EOBlends> BLEND;
        public final DeferredItem<EOSmallDustItem> SMALL_DUST;
        public final DeferredItem<EOPlateItem> PLATE;
        public final DeferredItem<EORodItem> ROD;
        public final DeferredItem<EOGearItem> GEAR;
        public final DeferredItem<EOFoilItem> FOIL;
        public final DeferredItem<EORawMaterialItem> RAW;
        public final DeferredItem<EOGemItem> GEM;
        public final DeferredItem<EOGemShardItem> GEM_SHARD;
        public final DeferredItem<EOCoalItem> COAL;
        public final DeferredItem<EOPebbleItem> PEBBLE;
        public final DeferredItem<EOEnrichedItems> ENRICHED;
        public final DeferredItem<EODirtyDustItem> DIRTY_DUST;
        public final DeferredItem<EOClumpItem> CLUMP;
        public final DeferredItem<EOSmallClumpItem> SMALL_CLUMP;
        public final DeferredItem<EOShardItem> SHARD;
        public final DeferredItem<EOrGemItem> ORE_GEM;
        public final DeferredItem<EOCrystalItem> CRYSTAL;
        public final DeferredBlock<EOStorageBlock> BLOCK;
        public final DeferredBlock<EOStorageBlock> BLOCK_TWO;
        public final DeferredBlock<EORawBlock> RAW_BLOCK;
        public final DeferredBlock<EORedstoneBlock> REDSTONE_BLOCK;
        public final DeferredBlock<EOCoalBlock> COAL_BLOCK;
        public final DeferredBlock<EODustBlock> DUST_BLOCK;
        public final DeferredBlock<EOreBlock> ORE;
        public final DeferredBlock<EOreBlock> SLATE_ORE;
        public final DeferredBlock<EOreBlock> NETHER_ORE;
        public final DeferredBlock<EOreBlock> END_ORE;
        public final DeferredBlock<EOreBlock> SAND_ORE;
        public final DeferredBlock<EOreBlock> SCULK_ORE;

        materialTypes(Builder builder) {
            this.ITEM = builder.item;
            this.INGOT = builder.ingot;
            this.UNSTABLE = builder.unstable;
            this.NUGGET = builder.nugget;
            this.DUST = builder.dust;
            this.BLEND = builder.blend;
            this.SMALL_DUST = builder.smallDust;
            this.PLATE = builder.plate;
            this.ROD = builder.rod;
            this.GEAR = builder.gear;
            this.FOIL = builder.foil;
            this.RAW = builder.raw;
            this.GEM = builder.gem;
            this.GEM_SHARD = builder.gemShard;
            this.COAL = builder.coal;
            this.PEBBLE = builder.pebble;
            this.ENRICHED = builder.enriched;
            this.DIRTY_DUST = builder.dirtyDust;
            this.CLUMP = builder.clump;
            this.SMALL_CLUMP = builder.smallClump;
            this.SHARD = builder.shard;
            this.ORE_GEM = builder.oreGem;
            this.CRYSTAL = builder.crystal;
            this.BLOCK = builder.block;
            this.BLOCK_TWO = builder.blockTwo;
            this.RAW_BLOCK = builder.rawBlock;
            this.REDSTONE_BLOCK = builder.redstoneBlock;
            this.COAL_BLOCK = builder.coalBlock;
            this.DUST_BLOCK = builder.dustBlock;
            this.ORE = builder.ore;
            this.SLATE_ORE = builder.slateOre;
            this.NETHER_ORE = builder.netherOre;
            this.END_ORE = builder.endOre;
            this.SAND_ORE = builder.sandOre;
            this.SCULK_ORE = builder.sculkOre;
        }

        static final class Builder {
            DeferredItem<EOItems> item;
            DeferredItem<EOIngotItem> ingot;
            DeferredItem<EOUnstableIngot> unstable;
            DeferredItem<EONuggetItem> nugget;
            DeferredItem<EODustItem> dust;
            DeferredItem<EOBlends> blend;
            DeferredItem<EOSmallDustItem> smallDust;
            DeferredItem<EOPlateItem> plate;
            DeferredItem<EORodItem> rod;
            DeferredItem<EOGearItem> gear;
            DeferredItem<EOFoilItem> foil;
            DeferredItem<EORawMaterialItem> raw;
            DeferredItem<EOGemItem> gem;
            DeferredItem<EOGemShardItem> gemShard;
            DeferredItem<EOCoalItem> coal;
            DeferredItem<EOPebbleItem> pebble;
            DeferredItem<EOEnrichedItems> enriched;
            DeferredItem<EODirtyDustItem> dirtyDust;
            DeferredItem<EOClumpItem> clump;
            DeferredItem<EOSmallClumpItem> smallClump;
            DeferredItem<EOShardItem> shard;
            DeferredItem<EOrGemItem> oreGem;
            DeferredItem<EOCrystalItem> crystal;
            DeferredBlock<EOStorageBlock> block;
            DeferredBlock<EOStorageBlock> blockTwo;
            DeferredBlock<EORawBlock> rawBlock;
            DeferredBlock<EORedstoneBlock> redstoneBlock;
            DeferredBlock<EOCoalBlock> coalBlock;
            DeferredBlock<EODustBlock> dustBlock;
            DeferredBlock<EOreBlock> ore;
            DeferredBlock<EOreBlock> slateOre;
            DeferredBlock<EOreBlock> netherOre;
            DeferredBlock<EOreBlock> endOre;
            DeferredBlock<EOreBlock> sandOre;
            DeferredBlock<EOreBlock> sculkOre;

            materialTypes build() {
                return new materialTypes(this);
            }
        }
    }

    public static class materialSets {
        public static materialTypes ALUMINUM_SET;
        public static materialTypes ARDITE_SET;
        public static materialTypes BERYLLIUM_SET;
        public static materialTypes CATALYRIUM_SET;
        public static materialTypes COBALT_SET;
        public static materialTypes GALLIUM_SET;
        public static materialTypes IRIDIUM_SET;
        public static materialTypes LEAD_SET;
        public static materialTypes MOLYBDENUM_SET;
        public static materialTypes NICKEL_SET;
        public static materialTypes OSMIUM_SET;
        public static materialTypes PALLADIUM_SET;
        public static materialTypes PLATINUM_SET;
        public static materialTypes SCULKITE_SET;
        public static materialTypes SILVER_SET;
        public static materialTypes SULFUR_SET;
        public static materialTypes TIN_SET;
        public static materialTypes TITANIUM_SET;
        public static materialTypes TUNGSTEN_SET;
        public static materialTypes ULTIMATITANIUM_SET;
        public static materialTypes URANINITE_SET;
        public static materialTypes URANIUM_SET;
        public static materialTypes VANADIUM_SET;
        public static materialTypes ZINC_SET;

        public static materialTypes NETHERITE_SET;
        public static materialTypes COPPER_SET;
        public static materialTypes IRON_SET;
        public static materialTypes GOLD_SET;
        public static materialTypes AMETHYST_SET;
        public static materialTypes LAPIS_SET;
        public static materialTypes DIAMOND_SET;
        public static materialTypes EMERALD_SET;
        public static materialTypes PRISMARINE_SET;
        public static materialTypes COAL_SET;
        public static materialTypes CHARCOAL_SET;
        public static materialTypes QUARTZ_SET;
        public static materialTypes REDSTONE_SET;
        public static materialTypes GRAVEL_SET;
        public static materialTypes STONE_SET;
        public static materialTypes BLACKSTONE_SET;
        public static materialTypes GRANITE_SET;
        public static materialTypes DIORITE_SET;
        public static materialTypes ANDESITE_SET;
        public static materialTypes BASALT_SET;
        public static materialTypes TUFF_SET;
        public static materialTypes CALCITE_SET;
        public static materialTypes DEEPSLATE_SET;
        public static materialTypes END_STONE_SET;
        public static materialTypes NETHERRACK_SET;
        public static materialTypes BRICK_SET;
        public static materialTypes DRIPSTONE_SET;
        public static materialTypes PURPUR_SET;
        public static materialTypes NETHER_BRICK_SET;
        public static materialTypes CLAY_SET;
        public static materialTypes SAND_SET;
        public static materialTypes RED_SAND_SET;
        public static materialTypes SOUL_SAND_SET;
        public static materialTypes NETHER_WART_SET;
        public static materialTypes WARPED_NETHER_WART_SET;
        public static materialTypes ENDER_PEARL_SET;
        public static materialTypes FLINT_SET;
        public static materialTypes NAUTILUS_SHELL_SET;
        public static materialTypes SHULKER_SHELL_SET;
        public static materialTypes NETHER_STAR_SET;
        public static materialTypes SCULK_SET;
        public static materialTypes BLAZE_SET;
        public static materialTypes GLOWSTONE_SET;
        public static materialTypes ARMADILLO_SCUTE_SET;
        public static materialTypes TURTLE_SET;
        public static materialTypes ROTTEN_FLESH_SET;
        public static materialTypes PHANTOM_MEMBRANE_SET;
        public static materialTypes ENDER_EYE_SET;
        public static materialTypes SUGAR_SET;

        public static materialTypes ANTHRACITE_SET;
        public static materialTypes BITUMINOUS_SET;
        public static materialTypes COKE_SET;
        public static materialTypes LIGNITE_SET;
        public static materialTypes PEAT_SET;

        public static materialTypes AMBER_SET;
        public static materialTypes APATITE_SET;
        public static materialTypes ARCANUM_SET;
        public static materialTypes BLACK_QUARTZ_SET;
        public static materialTypes CERTUS_QUARTZ_SET;
        public static materialTypes CINNABAR_SET;
        public static materialTypes FLUIX_SET;
        public static materialTypes FLUORITE_SET;
        public static materialTypes GARNET_SET;
        public static materialTypes JADE_SET;
        public static materialTypes MONAZITE_SET;
        public static materialTypes MORPHITE_SET;
        public static materialTypes NECROTICARITE_SET;
        public static materialTypes NITER_SET;
        public static materialTypes OBSIDIAN_SET;
        public static materialTypes ONYX_SET;
        public static materialTypes PEARL_SET;
        public static materialTypes PERIDOT_SET;
        public static materialTypes PRIMORNIUM_SET;
        public static materialTypes PYROLITE_SET;
        public static materialTypes QUANTIQUARITE_SET;
        public static materialTypes RUBY_SET;
        public static materialTypes SANGUIS_VIVUS_SET;
        public static materialTypes SAPPHIRE_SET;
        public static materialTypes SOURCE_SET;
        public static materialTypes SPECTRAL_SKY_BLUERITE_SET;
        public static materialTypes SPINEL_SET;
        public static materialTypes TACHYARITE_SET;
        public static materialTypes TANZANITE_SET;
        public static materialTypes TEMICTETL_SET;
        public static materialTypes VOIDERITE_SET;
        public static materialTypes ZIRCON_SET;

        public static materialTypes ALUMITE_SET;
        public static materialTypes AMERICIUM_SET;
        public static materialTypes ANNEALED_COPPER_SET;
        public static materialTypes AURORIUM_SET;
        public static materialTypes BATTERY_ALLOY_SET;
        public static materialTypes BISMUTH_SET;
        public static materialTypes BIOSTEEL_SET;
        public static materialTypes BLACK_BRONZE_SET;
        public static materialTypes BLACK_STEEL_SET;
        public static materialTypes BLUE_STEEL_SET;
        public static materialTypes BRASS_SET;
        public static materialTypes BRITANNIA_SILVER_SET;
        public static materialTypes BRONZE_SET;
        public static materialTypes CADMIUM_SET;
        public static materialTypes CALIFORNIUM_SET;
        public static materialTypes CAST_IRON_SET;
        public static materialTypes CAST_STEEL_SET;
        public static materialTypes CERIUM_SET;
        public static materialTypes CESIUM_SET;
        public static materialTypes CHROMIUM_SET;
        public static materialTypes CONSTANTAN_SET;
        public static materialTypes COSMIC_MATTER_SET;
        public static materialTypes CRYSTALLINE_ALLOY_SET;
        public static materialTypes CUPRONICKEL_SET;
        public static materialTypes ELECTRUM_SET;
        public static materialTypes ENDERIUM_SET;
        public static materialTypes ENERGETIC_SILVER_SET;
        public static materialTypes ETERNAL_DARK_SET;
        public static materialTypes ETERNAL_LIGHT_SET;
        public static materialTypes ETERNITY_SET;
        public static materialTypes ETHERIUM_SET;
        public static materialTypes FRANCIUM_SET;
        public static materialTypes GRAPHITE_SET;
        public static materialTypes GRAVITRONIUM_SET;
        public static materialTypes HAFNIUM_SET;
        public static materialTypes HEPATIZON_SET;
        public static materialTypes INDIUM_SET;
        public static materialTypes INVAR_SET;
        public static materialTypes KANTHAL_SET;
        public static materialTypes LUMIUM_SET;
        public static materialTypes MAGNESIUM_SET;
        public static materialTypes MANGANESE_SET;
        public static materialTypes MELODIC_ALLOY_SET;
        public static materialTypes MISSING_SET;
        public static materialTypes MODULARIUM_SET;
        public static materialTypes NANITE_SET;
        public static materialTypes NEODYMIUM_SET;
        public static materialTypes NEPTUNIUM_SET;
        public static materialTypes NETHERSTEEL_SET;
        public static materialTypes NIOBIUM_SET;
        public static materialTypes NOVALLOY_SET;
        public static materialTypes OSGLOGLAS_SET;
        public static materialTypes PEWTER_SET;
        public static materialTypes PIG_IRON_SET;
        public static materialTypes PLUTONIUM_SET;
        public static materialTypes QUARTZ_ENRICHED_COPPER_SET;
        public static materialTypes QUARTZ_ENRICHED_IRON_SET;
        public static materialTypes RED_STEEL_SET;
        public static materialTypes RHODIUM_SET;
        public static materialTypes ROSE_GOLD_SET;
        public static materialTypes RUBIDIUM_SET;
        public static materialTypes RUTHENIUM_SET;
        public static materialTypes SAMARIUM_SET;
        public static materialTypes SELENIUM_SET;
        public static materialTypes SHADOWSTEEL_SET;
        public static materialTypes SIGNALUM_SET;
        public static materialTypes SILICON_SET;
        public static materialTypes STAINLESS_STEEL_SET;
        public static materialTypes STEEL_SET;
        public static materialTypes STELLAR_ALLOY_SET;
        public static materialTypes STELLARIUM_SET;
        public static materialTypes TANTALUM_SET;
        public static materialTypes UNIVERSIUM_SET;
        public static materialTypes UNSTABLE_SET;
        public static materialTypes VIVID_ALLOY_SET;
        public static materialTypes WROUGHT_IRON_SET;
        public static materialTypes YTTRIUM_SET;

        public static materialTypes WOOD_SET;
        public static materialTypes BIOMASS_SET;
        public static materialTypes RARE_EARTH_SET;
        public static materialTypes CALCIUM_SET;
        public static materialTypes DUST_SET;
        public static materialTypes PHOSPHORUS_SET;
        public static materialTypes SALT_SET;
        public static materialTypes ANTIMATTER_SET;
        public static materialTypes STRANGE_MATTER_SET;
        public static materialTypes EXOTIC_MATTER_SET;

        public static materialTypes SHADOW_BLEND_SET;
        public static materialTypes CARBON_BLEND_SET;
        public static materialTypes HE_CARBON_BLEND_SET;
        public static materialTypes LE_CARBON_BLEND_SET;
        public static materialTypes ENERGETIC_BLEND_SET;
        public static materialTypes ENDERGETIC_BLEND_SET;
        public static materialTypes NETHER_BLEND_SET;
    }

    public static final class materialRegistrar {
        private final String mat;
        private final EOMaterialConfigHelper config;
        private final materialTypes.Builder builder = new materialTypes.Builder();

        private materialRegistrar(String mat, EOMaterialConfigHelper cfg) {
            this.mat = mat;
            this.config = cfg;
        }

        public static materialRegistrar of(String mat, EOMaterialConfigHelper cfg) {
            return new materialRegistrar(mat, cfg);
        }

        public materialRegistrar mainAllMetal(float hardness, SoundType soundMain, EOBlockTier tier) {
            builder.ingot = rgtrIngot(mat, config::getMaterialSet, config::getMaterialIngot);
            builder.nugget = rgtrNugget(mat + NUGGET, config::getMaterialSet, config::getMaterialNugget);
            builder.raw = rgtrRaw(RAW + mat, config::getMaterialSet, config::getRawMaterial);
            builder.block = rgtrBlock(mat + BLOCK, hardness, soundMain, tier, config::getMaterialSet, config::getMaterialBlock);
            builder.rawBlock = rgtrRawBlock(RAW + mat + BLOCK, hardness, soundMain, tier, config::getMaterialSet, config::getMaterialRawBlock);
            builder.foil = rgtrFoil(mat + FOIL, config::getMaterialSet, config::getMaterialFoil);
            builder.dustBlock = rgtrDustBlock(mat + DUST_BLOCK, hardness, tier, config::getMaterialSet, config::getMaterialDustBlock);
            builder.dust = rgtrDust(mat + DUST, config::getMaterialSet, config::getMaterialDust);
            builder.smallDust = rgtrSmallDust(mat + SMALL_DUST, config::getMaterialSet, config::getMaterialSmallDust);
            builder.plate = rgtrPlate(PLATE + mat, config::getMaterialSet, config::getMaterialPlate);
            builder.rod = rgtrRod(ROD + mat, config::getMaterialSet, config::getMaterialRod);
            builder.gear = rgtrGear(GEAR + mat, config::getMaterialSet, config::getMaterialGear);
            builder.enriched = rgtrEnriched(ENRICHED + mat, config::getMaterialSet, config::getMaterialEnriched);
            builder.dirtyDust = rgtrDirtyDust(mat, config::getMaterialSet, config::getMaterialDirtyDust);
            builder.clump = rgtrClumps(CLUMP + mat, config::getMaterialSet, config::getMaterialClumps);
            builder.smallClump = rgtrSmallClumps(mat + SMALL_CLUMP, config::getMaterialSet, config::getMaterialSmallClump);
            builder.shard = rgtrMetalShards(SHARD + mat, config::getMaterialSet, config::getMaterialShard);
            builder.oreGem = rgtrOreGems(mat + ORE_GEM, config::getMaterialSet, config::getMaterialOreGem);
            builder.crystal = rgrtCrystals(CRYSTAL + mat, config::getMaterialSet, config::getMaterialCrystal);
            return this;
        }

        public materialRegistrar secondaryAllMetal(float hardness, SoundType sound, EOBlockTier tier) {
            builder.ingot = rgtrIngot(mat, config::getMaterialSet, config::getMaterialIngot);
            builder.nugget = rgtrNugget(mat + NUGGET, config::getMaterialSet, config::getMaterialNugget);
            builder.raw = rgtrRaw(RAW + mat, config::getMaterialSet, config::getRawMaterial);
            builder.block = rgtrBlock(mat + BLOCK, hardness, sound, tier, config::getMaterialSet, config::getMaterialBlock);
            builder.rawBlock = rgtrRawBlock(RAW + mat + BLOCK, hardness, sound, tier, config::getMaterialSet, config::getMaterialRawBlock);
            builder.dustBlock = rgtrDustBlock(mat + DUST_BLOCK, hardness, tier, config::getMaterialSet, config::getMaterialDustBlock);
            builder.dust = rgtrDust(mat + DUST, config::getMaterialSet, config::getMaterialDust);
            builder.smallDust = rgtrSmallDust(mat + SMALL_DUST, config::getMaterialSet, config::getMaterialSmallDust);
            builder.plate = rgtrPlate(PLATE + mat, config::getMaterialSet, config::getMaterialPlate);
            builder.rod = rgtrRod(ROD + mat, config::getMaterialSet, config::getMaterialRod);
            builder.dirtyDust = rgtrDirtyDust(mat, config::getMaterialSet, config::getMaterialDirtyDust);
            builder.clump = rgtrClumps(CLUMP + mat, config::getMaterialSet, config::getMaterialClumps);
            builder.smallClump = rgtrSmallClumps(mat + SMALL_CLUMP, config::getMaterialSet, config::getMaterialSmallClump);
            builder.shard = rgtrMetalShards(SHARD + mat, config::getMaterialSet, config::getMaterialShard);
            builder.oreGem = rgtrOreGems(mat + ORE_GEM, config::getMaterialSet, config::getMaterialOreGem);
            builder.crystal = rgrtCrystals(CRYSTAL + mat, config::getMaterialSet, config::getMaterialCrystal);
            return this;
        }

        public materialRegistrar catalyriumSet(float hardness, SoundType sound, EOBlockTier tier) {
            builder.ingot = rgtrIngot(mat, config::getMaterialSet, config::getMaterialIngot);
            builder.nugget = rgtrNugget(mat + NUGGET, config::getMaterialSet, config::getMaterialNugget);
            builder.raw = rgtrRaw(RAW + mat, config::getMaterialSet, config::getRawMaterial);
            builder.block = rgtrBlock(mat + BLOCK, hardness, sound, tier, config::getMaterialSet, config::getMaterialBlock);
            builder.rawBlock = rgtrRawBlock(RAW + mat + BLOCK, hardness, sound, tier, config::getMaterialSet, config::getMaterialRawBlock);
            builder.dustBlock = rgtrDustBlock(mat + DUST_BLOCK, hardness, tier, config::getMaterialSet, config::getMaterialDustBlock);
            builder.dust = rgtrDust(mat + DUST, config::getMaterialSet, config::getMaterialDust);
            builder.smallDust = rgtrSmallDust(mat + SMALL_DUST, config::getMaterialSet, config::getMaterialSmallDust);
            builder.plate = rgtrPlate(PLATE + mat, config::getMaterialSet, config::getMaterialPlate);
            builder.rod = rgtrRod(ROD + mat, config::getMaterialSet, config::getMaterialRod);
            builder.gear = rgtrGear(GEAR + mat, config::getMaterialSet, config::getMaterialGear);
            builder.foil = rgtrFoil(mat + FOIL, config::getMaterialSet, config::getMaterialFoil);
            builder.enriched = rgtrEnriched(ENRICHED + mat, config::getMaterialSet, config::getMaterialEnriched);
            builder.dirtyDust = rgtrDirtyDust(mat, config::getMaterialSet, config::getMaterialDirtyDust);
            builder.clump = rgtrClumps(CLUMP + mat, config::getMaterialSet, config::getMaterialClumps);
            builder.smallClump = rgtrSmallClumps(mat + SMALL_CLUMP, config::getMaterialSet, config::getMaterialSmallClump);
            builder.shard = rgtrMetalShards(SHARD + mat, config::getMaterialSet, config::getMaterialShard);
            builder.oreGem = rgtrOreGems(mat + ORE_GEM, config::getMaterialSet, config::getMaterialOreGem);
            builder.crystal = rgrtCrystals(CRYSTAL + mat, config::getMaterialSet, config::getMaterialCrystal);
            return this;
        }

        public materialRegistrar sulfurSet(String name, float hardness, SoundType sound, EOBlockTier tier) {
            builder.raw = rgtrRaw(name, config::getMaterialSet, config::getRawMaterial);
            builder.block = rgtrBlock(mat + BLOCK, hardness, sound, tier, config::getMaterialSet, config::getMaterialRawBlock);
            builder.dust = rgtrDust(mat + DUST, config::getMaterialSet, config::getMaterialDust);
            builder.smallDust = rgtrSmallDust(mat + SMALL_DUST, config::getMaterialSet, config::getMaterialSmallDust);
            return this;
        }

        public materialRegistrar mainVanillaMetal(float hardness, EOBlockTier tier) {
            builder.dustBlock = rgtrDustBlock(mat + DUST_BLOCK, hardness, tier, config::getMaterialSet, config::getMaterialDustBlock);
            builder.dust = rgtrDust(mat + DUST, config::getMaterialSet, config::getMaterialDust);
            builder.smallDust = rgtrSmallDust(mat + SMALL_DUST, config::getMaterialSet, config::getMaterialSmallDust);
            builder.plate = rgtrPlate(PLATE + mat, config::getMaterialSet, config::getMaterialPlate);
            builder.rod = rgtrRod(ROD + mat, config::getMaterialSet, config::getMaterialRod);
            builder.gear = rgtrGear(GEAR + mat, config::getMaterialSet, config::getMaterialGear);
            builder.foil = rgtrFoil(mat + FOIL, config::getMaterialSet, config::getMaterialFoil);
            builder.enriched = rgtrEnriched(ENRICHED + mat, config::getMaterialSet, config::getMaterialEnriched);
            builder.dirtyDust = rgtrDirtyDust(mat, config::getMaterialSet, config::getMaterialDirtyDust);
            builder.clump = rgtrClumps(CLUMP + mat, config::getMaterialSet, config::getMaterialClumps);
            builder.smallClump = rgtrSmallClumps(mat + SMALL_CLUMP, config::getMaterialSet, config::getMaterialSmallClump);
            builder.shard = rgtrMetalShards(SHARD + mat, config::getMaterialSet, config::getMaterialShard);
            builder.oreGem = rgtrOreGems(mat + ORE_GEM, config::getMaterialSet, config::getMaterialOreGem);
            builder.crystal = rgrtCrystals(CRYSTAL + mat, config::getMaterialSet, config::getMaterialCrystal);
            return this;
        }

        public materialRegistrar secondaryVanillaMetal(float hardness, EOBlockTier tier) {
            builder.nugget = rgtrNugget(mat + NUGGET, config::getMaterialSet, config::getMaterialNugget);
            builder.foil = rgtrFoil(mat + FOIL, config::getMaterialSet, config::getMaterialFoil);
            builder.dustBlock = rgtrDustBlock(mat + DUST_BLOCK, hardness, tier, config::getMaterialSet, config::getMaterialDustBlock);
            builder.dust = rgtrDust(mat + DUST, config::getMaterialSet, config::getMaterialDust);
            builder.smallDust = rgtrSmallDust(mat + SMALL_DUST, config::getMaterialSet, config::getMaterialSmallDust);
            builder.plate = rgtrPlate(PLATE + mat, config::getMaterialSet, config::getMaterialPlate);
            builder.rod = rgtrRod(ROD + mat, config::getMaterialSet, config::getMaterialRod);
            builder.gear = rgtrGear(GEAR + mat, config::getMaterialSet, config::getMaterialGear);
            builder.enriched = rgtrEnriched(ENRICHED + mat, config::getMaterialSet, config::getMaterialEnriched);
            builder.dirtyDust = rgtrDirtyDust(mat, config::getMaterialSet, config::getMaterialDirtyDust);
            builder.clump = rgtrClumps(CLUMP + mat, config::getMaterialSet, config::getMaterialClumps);
            builder.smallClump = rgtrSmallClumps(mat + SMALL_CLUMP, config::getMaterialSet, config::getMaterialSmallClump);
            builder.shard = rgtrMetalShards(SHARD + mat, config::getMaterialSet, config::getMaterialShard);
            builder.oreGem = rgtrOreGems(mat + ORE_GEM, config::getMaterialSet, config::getMaterialOreGem);
            builder.crystal = rgrtCrystals(CRYSTAL + mat, config::getMaterialSet, config::getMaterialCrystal);
            return this;
        }

        public materialRegistrar netheriteMetal(float hardness, EOBlockTier tier) {
            builder.nugget = rgtrNugget(mat + NUGGET, config::getMaterialSet, config::getMaterialNugget);
            builder.dustBlock = rgtrDustBlock(mat + DUST_BLOCK, hardness, tier, config::getMaterialSet, config::getMaterialDustBlock);
            builder.dust = rgtrDust(mat + DUST, config::getMaterialSet, config::getMaterialDust);
            builder.smallDust = rgtrSmallDust(mat + SMALL_DUST, config::getMaterialSet, config::getMaterialSmallDust);
            builder.plate = rgtrPlate(PLATE + mat, config::getMaterialSet, config::getMaterialPlate);
            builder.rod = rgtrRod(ROD + mat, config::getMaterialSet, config::getMaterialRod);
            builder.gear = rgtrGear(GEAR + mat, config::getMaterialSet, config::getMaterialGear);
            builder.foil = rgtrFoil(mat + FOIL, config::getMaterialSet, config::getMaterialFoil);
            builder.enriched = rgtrEnriched(ENRICHED + mat, config::getMaterialSet, config::getMaterialEnriched);
            return this;
        }

        public materialRegistrar redstoneSet(String materialName, float hardness, SoundType sound, EOBlockTier tier) {
            builder.ingot = rgtrIngot(mat, config::getMaterialSet, config::getMaterialIngot);
            builder.nugget = rgtrNugget(mat + NUGGET, config::getMaterialSet, config::getMaterialNugget);
            builder.redstoneBlock = rgtrRedstoneBlock(materialName + BLOCK, hardness, sound, tier, config::getMaterialSet, config::getMaterialDustBlock);
            builder.smallDust = rgtrSmallDust(mat + SMALL_DUST, config::getMaterialSet, config::getMaterialSmallDust);
            builder.plate = rgtrPlate(PLATE + mat, config::getMaterialSet, config::getMaterialPlate);
            builder.rod = rgtrRod(ROD + mat, config::getMaterialSet, config::getMaterialRod);
            builder.gear = rgtrGear(GEAR + mat, config::getMaterialSet, config::getMaterialGear);
            builder.foil = rgtrFoil(mat + FOIL, config::getMaterialSet, config::getMaterialFoil);
            return this;
        }

        public materialRegistrar mainAllVanillaGems(float hardness, EOBlockTier tier) {
            builder.gemShard = rgtrShards(mat + GEM_SHARD, config::getMaterialSet, config::getMaterialGemShard);
            builder.dustBlock = rgtrDustBlock(mat + DUST_BLOCK, hardness, tier, config::getMaterialSet, config::getMaterialDustBlock);
            builder.dust = rgtrDust(mat + DUST, config::getMaterialSet, config::getMaterialDust);
            builder.smallDust = rgtrSmallDust(mat + SMALL_DUST, config::getMaterialSet, config::getMaterialSmallDust);
            builder.plate = rgtrPlate(PLATE + mat, config::getMaterialSet, config::getMaterialPlate);
            builder.rod = rgtrRod(ROD + mat, config::getMaterialSet, config::getMaterialRod);
            builder.gear = rgtrGear(GEAR + mat, config::getMaterialSet, config::getMaterialGear);
            builder.enriched = rgtrEnriched(ENRICHED + mat, config::getMaterialSet, config::getMaterialEnriched);
            return this;
        }

        public materialRegistrar prismarineSet(float hardness, SoundType sound, EOBlockTier tier) {
            builder.gemShard = rgtrShards(mat + GEM_SHARD, config::getMaterialSet, config::getMaterialGemShard);
            builder.block = rgtrBlock(mat + BLOCK, hardness, sound, tier, config::getMaterialSet, config::getMaterialBlock);
            builder.dustBlock = rgtrDustBlock(mat + DUST_BLOCK, hardness, tier, config::getMaterialSet, config::getMaterialDustBlock);
            builder.dust = rgtrDust(mat + DUST, config::getMaterialSet, config::getMaterialDust);
            builder.smallDust = rgtrSmallDust(mat + SMALL_DUST, config::getMaterialSet, config::getMaterialSmallDust);
            builder.plate = rgtrPlate(PLATE + mat, config::getMaterialSet, config::getMaterialPlate);
            builder.rod = rgtrRod(ROD + mat, config::getMaterialSet, config::getMaterialRod);
            builder.gear = rgtrGear(GEAR + mat, config::getMaterialSet, config::getMaterialGear);
            builder.enriched = rgtrEnriched(ENRICHED + mat, config::getMaterialSet, config::getMaterialEnriched);
            return this;
        }

        public materialRegistrar coal(int burnTimeLarge, int burnTimeMedium, int burnTimeSmall, float hardness, SoundType sound, EOBlockTier tier) {
            builder.dustBlock = rgtrDustBlock(mat + DUST_BLOCK, hardness, burnTimeLarge, sound, tier, config::getMaterialSet, config::getMaterialDustBlock);
            builder.dust = rgtrDust(mat + DUST, burnTimeMedium, config::getMaterialSet, config::getMaterialDust);
            builder.smallDust = rgtrSmallDust(mat + SMALL_DUST, burnTimeSmall, config::getMaterialSet, config::getMaterialSmallDust);
            return this;
        }

        public materialRegistrar mainAllVanillaCoal(int burnTimeLarge, int burnTimeMedium, int burnTimeSmall, float hardness, SoundType sound, EOBlockTier tier) {
            builder.coalBlock = rgtrCoalBlock(mat + BLOCK, hardness, burnTimeLarge, sound, tier, config::getMaterialSet, config::getMaterialBlock);
            builder.dustBlock = rgtrDustBlock(mat + DUST_BLOCK, hardness, burnTimeLarge, sound, tier, config::getMaterialSet, config::getMaterialDustBlock);
            builder.dust = rgtrDust(mat + DUST, burnTimeMedium, config::getMaterialSet, config::getMaterialDust);
            builder.smallDust = rgtrSmallDust(mat + SMALL_DUST, burnTimeSmall, config::getMaterialSet, config::getMaterialSmallDust);
            return this;
        }

        public materialRegistrar stoneSets() {
            builder.dust = rgtrDust(mat + DUST, config::getMaterialSet, config::getMaterialDust);
            builder.smallDust = rgtrSmallDust(mat + SMALL_DUST, config::getMaterialSet, config::getMaterialSmallDust);
            builder.plate = rgtrPlate(PLATE + mat, config::getMaterialSet, config::getMaterialPlate);
            builder.rod = rgtrRod(ROD + mat, config::getMaterialSet, config::getMaterialRod);
            builder.gear = rgtrGear(GEAR + mat, config::getMaterialSet, config::getMaterialGear);
            builder.pebble = rgtrPebble(mat + PEBBLE, config::getMaterialSet, config::getMaterialPebble);
            return this;
        }

        public materialRegistrar mainAllAlloy(float hardness, SoundType sound, EOBlockTier tier) {
            builder.ingot = rgtrIngot(mat, config::getMaterialSet, config::getMaterialIngot);
            builder.nugget = rgtrNugget(mat + NUGGET, config::getMaterialSet, config::getMaterialNugget);
            builder.block = rgtrBlock(mat + BLOCK, hardness, sound, tier, config::getMaterialSet, config::getMaterialBlock);
            builder.dustBlock = rgtrDustBlock(mat + DUST_BLOCK, hardness, tier, config::getMaterialSet, config::getMaterialDustBlock);
            builder.dust = rgtrDust(mat + DUST, config::getMaterialSet, config::getMaterialDust);
            builder.smallDust = rgtrSmallDust(mat + SMALL_DUST, config::getMaterialSet, config::getMaterialSmallDust);
            builder.plate = rgtrPlate(PLATE + mat, config::getMaterialSet, config::getMaterialPlate);
            builder.rod = rgtrRod(ROD + mat, config::getMaterialSet, config::getMaterialRod);
            builder.gear = rgtrGear(GEAR + mat, config::getMaterialSet, config::getMaterialGear);
            builder.foil = rgtrFoil(mat + FOIL, config::getMaterialSet, config::getMaterialFoil);
            return this;
        }

        public materialRegistrar alloyFoiless(float hardness, SoundType sound, EOBlockTier tier) {
            builder.ingot = rgtrIngot(mat, config::getMaterialSet, config::getMaterialIngot);
            builder.nugget = rgtrNugget(mat + NUGGET, config::getMaterialSet, config::getMaterialNugget);
            builder.block = rgtrBlock(mat + BLOCK, hardness, sound, tier, config::getMaterialSet, config::getMaterialBlock);
            builder.dustBlock = rgtrDustBlock(mat + DUST_BLOCK, hardness, tier, config::getMaterialSet, config::getMaterialDustBlock);
            builder.dust = rgtrDust(mat + DUST, config::getMaterialSet, config::getMaterialDust);
            builder.smallDust = rgtrSmallDust(mat + SMALL_DUST, config::getMaterialSet, config::getMaterialSmallDust);
            builder.plate = rgtrPlate(PLATE + mat, config::getMaterialSet, config::getMaterialPlate);
            builder.rod = rgtrRod(ROD + mat, config::getMaterialSet, config::getMaterialRod);
            builder.gear = rgtrGear(GEAR + mat, config::getMaterialSet, config::getMaterialGear);
            return this;
        }

        public materialRegistrar secondaryAllAlloy(float hardness, SoundType sound, EOBlockTier tier) {
            builder.ingot = rgtrIngot(mat, config::getMaterialSet, config::getMaterialIngot);
            builder.nugget = rgtrNugget(mat + NUGGET, config::getMaterialSet, config::getMaterialNugget);
            builder.block = rgtrBlock(mat + BLOCK, hardness, sound, tier, config::getMaterialSet, config::getMaterialBlock);
            builder.dustBlock = rgtrDustBlock(mat + DUST_BLOCK, hardness, tier, config::getMaterialSet, config::getMaterialDustBlock);
            builder.dust = rgtrDust(mat + DUST, config::getMaterialSet, config::getMaterialDust);
            builder.smallDust = rgtrSmallDust(mat + SMALL_DUST, config::getMaterialSet, config::getMaterialSmallDust);
            builder.plate = rgtrPlate(PLATE + mat, config::getMaterialSet, config::getMaterialPlate);
            builder.rod = rgtrRod(ROD + mat, config::getMaterialSet, config::getMaterialRod);
            builder.gear = rgtrGear(GEAR + mat, config::getMaterialSet, config::getMaterialGear);
            builder.foil = rgtrFoil(mat + FOIL, config::getMaterialSet, config::getMaterialFoil);
            builder.enriched = rgtrEnriched(ENRICHED + mat, config::getMaterialSet, config::getMaterialEnriched);
            return this;
        }

        public materialRegistrar tertiaryAllAlloy(float hardness, SoundType sound, EOBlockTier tier) {
            builder.ingot = rgtrIngot(mat, config::getMaterialSet, config::getMaterialIngot);
            builder.nugget = rgtrNugget(mat + NUGGET, config::getMaterialSet, config::getMaterialNugget);
            builder.block = rgtrBlock(mat + BLOCK, hardness, sound, tier, config::getMaterialSet, config::getMaterialBlock);
            builder.dustBlock = rgtrDustBlock(mat + DUST_BLOCK, hardness, tier, config::getMaterialSet, config::getMaterialDustBlock);
            builder.dust = rgtrDust(mat + DUST, config::getMaterialSet, config::getMaterialDust);
            builder.smallDust = rgtrSmallDust(mat + SMALL_DUST, config::getMaterialSet, config::getMaterialSmallDust);
            builder.plate = rgtrPlate(PLATE + mat, config::getMaterialSet, config::getMaterialPlate);
            builder.rod = rgtrRod(ROD + mat, config::getMaterialSet, config::getMaterialRod);
            builder.foil = rgtrFoil(mat + FOIL, config::getMaterialSet, config::getMaterialFoil);
            builder.enriched = rgtrEnriched(ENRICHED + mat, config::getMaterialSet, config::getMaterialEnriched);
            return this;
        }

        public materialRegistrar alloyWithoutGearEnriched(float hardness, SoundType sound, EOBlockTier tier) {
            builder.ingot = rgtrIngot(mat, config::getMaterialSet, config::getMaterialIngot);
            builder.nugget = rgtrNugget(mat + NUGGET, config::getMaterialSet, config::getMaterialNugget);
            builder.block = rgtrBlock(mat + BLOCK, hardness, sound, tier, config::getMaterialSet, config::getMaterialBlock);
            builder.dustBlock = rgtrDustBlock(mat + DUST_BLOCK, hardness, tier, config::getMaterialSet, config::getMaterialDustBlock);
            builder.dust = rgtrDust(mat + DUST, config::getMaterialSet, config::getMaterialDust);
            builder.smallDust = rgtrSmallDust(mat + SMALL_DUST, config::getMaterialSet, config::getMaterialSmallDust);
            builder.plate = rgtrPlate(PLATE + mat, config::getMaterialSet, config::getMaterialPlate);
            builder.rod = rgtrRod(ROD + mat, config::getMaterialSet, config::getMaterialRod);
            builder.foil = rgtrFoil(mat + FOIL, config::getMaterialSet, config::getMaterialFoil);
            return this;
        }

        public materialRegistrar alloyWithoutGearFoil(float hardness, SoundType sound, EOBlockTier tier) {
            builder.ingot = rgtrIngot(mat, config::getMaterialSet, config::getMaterialIngot);
            builder.nugget = rgtrNugget(mat + NUGGET, config::getMaterialSet, config::getMaterialNugget);
            builder.block = rgtrBlock(mat + BLOCK, hardness, sound, tier, config::getMaterialSet, config::getMaterialBlock);
            builder.dustBlock = rgtrDustBlock(mat + DUST_BLOCK, hardness, tier, config::getMaterialSet, config::getMaterialDustBlock);
            builder.dust = rgtrDust(mat + DUST, config::getMaterialSet, config::getMaterialDust);
            builder.smallDust = rgtrSmallDust(mat + SMALL_DUST, config::getMaterialSet, config::getMaterialSmallDust);
            builder.plate = rgtrPlate(PLATE + mat, config::getMaterialSet, config::getMaterialPlate);
            builder.rod = rgtrRod(ROD + mat, config::getMaterialSet, config::getMaterialRod);
            return this;
        }

        public materialRegistrar alloyWithoutGearPlateFoil(float hardness, SoundType sound, EOBlockTier tier) {
            builder.ingot = rgtrIngot(mat, config::getMaterialSet, config::getMaterialIngot);
            builder.nugget = rgtrNugget(mat + NUGGET, config::getMaterialSet, config::getMaterialNugget);
            builder.block = rgtrBlock(mat + BLOCK, hardness, sound, tier, config::getMaterialSet, config::getMaterialBlock);
            builder.dustBlock = rgtrDustBlock(mat + DUST_BLOCK, hardness, tier, config::getMaterialSet, config::getMaterialDustBlock);
            builder.dust = rgtrDust(mat + DUST, config::getMaterialSet, config::getMaterialDust);
            builder.smallDust = rgtrSmallDust(mat + SMALL_DUST, config::getMaterialSet, config::getMaterialSmallDust);
            builder.rod = rgtrRod(ROD + mat, config::getMaterialSet, config::getMaterialRod);
            return this;
        }

        public materialRegistrar alloyWithoutGearRod(float hardness, SoundType sound, EOBlockTier tier) {
            builder.ingot = rgtrIngot(mat, config::getMaterialSet, config::getMaterialIngot);
            builder.nugget = rgtrNugget(mat + NUGGET, config::getMaterialSet, config::getMaterialNugget);
            builder.block = rgtrBlock(mat + BLOCK, hardness, sound, tier, config::getMaterialSet, config::getMaterialBlock);
            builder.dustBlock = rgtrDustBlock(mat + DUST_BLOCK, hardness, tier, config::getMaterialSet, config::getMaterialDustBlock);
            builder.dust = rgtrDust(mat + DUST, config::getMaterialSet, config::getMaterialDust);
            builder.smallDust = rgtrSmallDust(mat + SMALL_DUST, config::getMaterialSet, config::getMaterialSmallDust);
            builder.plate = rgtrPlate(PLATE + mat, config::getMaterialSet, config::getMaterialPlate);
            builder.foil = rgtrFoil(mat + FOIL, config::getMaterialSet, config::getMaterialFoil);
            return this;
        }

        public materialRegistrar alloyWithoutFeatures(float hardness, SoundType sound, EOBlockTier tier) {
            builder.ingot = rgtrIngot(mat, config::getMaterialSet, config::getMaterialIngot);
            builder.nugget = rgtrNugget(mat + NUGGET, config::getMaterialSet, config::getMaterialNugget);
            builder.block = rgtrBlock(mat + BLOCK, hardness, sound, tier, config::getMaterialSet, config::getMaterialBlock);
            builder.dustBlock = rgtrDustBlock(mat + DUST_BLOCK, hardness, tier, config::getMaterialSet, config::getMaterialDustBlock);
            builder.dust = rgtrDust(mat + DUST, config::getMaterialSet, config::getMaterialDust);
            builder.smallDust = rgtrSmallDust(mat + SMALL_DUST, config::getMaterialSet, config::getMaterialSmallDust);
            return this;
        }

        public materialRegistrar siliconSet(String materialName, float hardness, SoundType sound, EOBlockTier tier) {
            builder.item = rgtrMisc(mat, config::getMaterialSet, config::getMaterialItem);
            builder.ingot = rgtrIngot(mat, config::getMaterialSet, config::getMaterialIngot);
            builder.nugget = rgtrNugget(mat + NUGGET, config::getMaterialSet, config::getMaterialNugget);
            builder.block = rgtrBlock(materialName + BLOCK, hardness, sound, tier, config::getMaterialSet, config::getMaterialBlock);
            builder.blockTwo = rgtrBlock(mat + BLOCK, hardness, sound, tier, config::getMaterialSet, config::getMaterialBlock);
            builder.dustBlock = rgtrDustBlock(mat + DUST_BLOCK, hardness, tier, config::getMaterialSet, config::getMaterialDustBlock);
            builder.dust = rgtrDust(mat + DUST, config::getMaterialSet, config::getMaterialDust);
            builder.smallDust = rgtrSmallDust(mat + SMALL_DUST, config::getMaterialSet, config::getMaterialSmallDust);
            builder.plate = rgtrPlate(PLATE + mat, config::getMaterialSet, config::getMaterialPlate);
            builder.rod = rgtrRod(ROD + mat, config::getMaterialSet, config::getMaterialRod);
            builder.gear = rgtrGear(GEAR + mat, config::getMaterialSet, config::getMaterialGear);
            builder.foil = rgtrFoil(mat + FOIL, config::getMaterialSet, config::getMaterialFoil);
            builder.enriched = rgtrEnriched(ENRICHED + mat, config::getMaterialSet, config::getMaterialEnriched);
            return this;
        }

        public materialRegistrar bismuthSet(float hardness, SoundType sound, EOBlockTier tier) {
            builder.item = rgtrMisc(mat, config::getMaterialSet, config::getMaterialItem);
            builder.ingot = rgtrIngot(mat, config::getMaterialSet, config::getMaterialIngot);
            builder.nugget = rgtrNugget(mat + NUGGET, config::getMaterialSet, config::getMaterialNugget);
            builder.block = rgtrBlock(mat + BLOCK, hardness, sound, tier, config::getMaterialSet, config::getMaterialBlock);
            builder.dustBlock = rgtrDustBlock(mat + DUST_BLOCK, hardness, tier, config::getMaterialSet, config::getMaterialDustBlock);
            builder.dust = rgtrDust(mat + DUST, config::getMaterialSet, config::getMaterialDust);
            builder.smallDust = rgtrSmallDust(mat + SMALL_DUST, config::getMaterialSet, config::getMaterialSmallDust);
            builder.plate = rgtrPlate(PLATE + mat, config::getMaterialSet, config::getMaterialPlate);
            builder.rod = rgtrRod(ROD + mat, config::getMaterialSet, config::getMaterialRod);
            builder.gear = rgtrGear(GEAR + mat, config::getMaterialSet, config::getMaterialGear);
            builder.enriched = rgtrEnriched(ENRICHED + mat, config::getMaterialSet, config::getMaterialEnriched);
            return this;
        }

        public materialRegistrar mainAllGem(float hardness, SoundType sound, EOBlockTier tier) {
            builder.gem = rgtrGem(GEM + mat, config::getMaterialSet, config::getMaterialGem);
            builder.block = rgtrBlock(mat + BLOCK, hardness, sound, tier, config::getMaterialSet, config::getMaterialBlock);
            builder.dustBlock = rgtrDustBlock(mat + DUST_BLOCK, hardness, tier, config::getMaterialSet, config::getMaterialDustBlock);
            builder.gemShard = rgtrShards(mat + GEM_SHARD, config::getMaterialSet, config::getMaterialGemShard);
            builder.dust = rgtrDust(mat + DUST, config::getMaterialSet, config::getMaterialDust);
            builder.smallDust = rgtrSmallDust(mat + SMALL_DUST, config::getMaterialSet, config::getMaterialSmallDust);
            builder.plate = rgtrPlate(PLATE + mat, config::getMaterialSet, config::getMaterialPlate);
            builder.rod = rgtrRod(ROD + mat, config::getMaterialSet, config::getMaterialRod);
            builder.gear = rgtrGear(GEAR + mat, config::getMaterialSet, config::getMaterialGear);
            builder.enriched = rgtrEnriched(ENRICHED + mat, config::getMaterialSet, config::getMaterialEnriched);
            return this;
        }

        public materialRegistrar mainAllGem(String materialName, float hardness, SoundType sound, EOBlockTier tier) {
            builder.gem = rgtrGem(GEM + mat, config::getMaterialSet, config::getMaterialGem);
            builder.block = rgtrBlock(materialName, hardness, sound, tier, config::getMaterialSet, config::getMaterialBlock);
            builder.dustBlock = rgtrDustBlock(mat + DUST_BLOCK, hardness, tier, config::getMaterialSet, config::getMaterialDustBlock);
            builder.gemShard = rgtrShards(mat + GEM_SHARD, config::getMaterialSet, config::getMaterialGemShard);
            builder.dust = rgtrDust(mat + DUST, config::getMaterialSet, config::getMaterialDust);
            builder.smallDust = rgtrSmallDust(mat + SMALL_DUST, config::getMaterialSet, config::getMaterialSmallDust);
            builder.plate = rgtrPlate(PLATE + mat, config::getMaterialSet, config::getMaterialPlate);
            builder.rod = rgtrRod(ROD + mat, config::getMaterialSet, config::getMaterialRod);
            builder.gear = rgtrGear(GEAR + mat, config::getMaterialSet, config::getMaterialGear);
            builder.enriched = rgtrEnriched(ENRICHED + mat, config::getMaterialSet, config::getMaterialEnriched);
            return this;
        }

        public materialRegistrar mainCoal(float hardness, int burnTimeLarge, int burnTimeMedium, int burnTimeSmall, SoundType sound, EOBlockTier tier) {
            builder.coal = rgtrCoal(mat, burnTimeMedium, config::getMaterialSet, config::getMaterialGem);
            builder.coalBlock = rgtrCoalBlock(mat + BLOCK, hardness, burnTimeLarge, sound, tier, config::getMaterialSet, config::getMaterialBlock);
            builder.dustBlock = rgtrDustBlock(mat + DUST_BLOCK, hardness, burnTimeLarge, sound, tier, config::getMaterialSet, config::getMaterialDustBlock);
            builder.dust = rgtrDust(mat + DUST, burnTimeMedium, config::getMaterialSet, config::getMaterialGem);
            builder.smallDust = rgtrSmallDust(mat + SMALL_DUST, burnTimeSmall, config::getMaterialSet, config::getMaterialGem);
            return this;
        }

        public materialRegistrar fluoriteSet(String materialName, float hardness, SoundType sound, EOBlockTier tier) {
            builder.gem = rgtrGem(materialName, config::getMaterialSet, config::getMaterialGem);
            builder.gemShard = rgtrShards(mat + GEM_SHARD, config::getMaterialSet, config::getMaterialGemShard);
            builder.block = rgtrBlock(mat + BLOCK, hardness, sound, tier, config::getMaterialSet, config::getMaterialBlock);
            builder.dustBlock = rgtrDustBlock(mat + DUST_BLOCK, hardness, tier, config::getMaterialSet, config::getMaterialDustBlock);
            builder.dust = rgtrDust(mat + DUST, config::getMaterialSet, config::getMaterialGem);
            builder.smallDust = rgtrSmallDust(mat + SMALL_DUST, config::getMaterialSet, config::getMaterialGem);
            return this;
        }

        public materialRegistrar niterSet(float hardness, SoundType sound, EOBlockTier tier) {
            builder.gem = rgtrGem(GEM + mat, config::getMaterialSet, config::getMaterialGem);
            builder.gemShard = rgtrShards(mat + GEM_SHARD, config::getMaterialSet, config::getMaterialGemShard);
            builder.block = rgtrBlock(mat + BLOCK, hardness, sound, tier, config::getMaterialSet, config::getMaterialBlock);
            builder.dustBlock = rgtrDustBlock(mat + DUST_BLOCK, hardness, tier, config::getMaterialSet, config::getMaterialDustBlock);
            builder.dust = rgtrDust(mat + DUST, config::getMaterialSet, config::getMaterialDust);
            builder.smallDust = rgtrSmallDust(mat + SMALL_DUST, config::getMaterialSet, config::getMaterialSmallDust);
            builder.enriched = rgtrEnriched(ENRICHED + mat, config::getMaterialSet, config::getMaterialEnriched);
            return this;
        }

        public materialRegistrar woodSet(String materialName) {
            builder.dust = rgtrDust(materialName, config::getMaterialSet, config::getMaterialDust);
            builder.plate = rgtrPlate(PLATE + mat, config::getMaterialSet, config::getMaterialPlate);
            builder.gear = rgtrGear(GEAR + mat, config::getMaterialSet, config::getMaterialGear);
            return this;
        }

        public materialRegistrar onlyDusts() {
            builder.dust = rgtrDust(mat + DUST, config::getMaterialSet, config::getMaterialDust);
            builder.smallDust = rgtrSmallDust(mat + SMALL_DUST, config::getMaterialSet, config::getMaterialSmallDust);
            return this;
        }

        public materialRegistrar special(float hardness, SoundType sound, EOBlockTier tier) {
            builder.block = rgtrBlock(mat + BLOCK, hardness, sound, tier, config::getMaterialSet, config::getMaterialBlock);
            builder.dustBlock = rgtrDustBlock(mat + DUST_BLOCK, hardness, tier, config::getMaterialSet, config::getMaterialDustBlock);
            builder.dust = rgtrDust(mat + DUST, config::getMaterialSet, config::getMaterialDust);
            builder.smallDust = rgtrSmallDust(mat + SMALL_DUST, config::getMaterialSet, config::getMaterialSmallDust);
            return this;
        }

        public materialRegistrar item(float hardness, SoundType sound, EOBlockTier tier) {
            builder.item = rgtrMisc(mat, config::getMaterialSet, config::getMaterialItem);
            builder.block = rgtrBlock(mat + BLOCK, hardness, sound, tier, config::getMaterialSet, config::getMaterialBlock);
            return this;
        }

        public materialRegistrar dustAndBlocks(float hardness, EOBlockTier tier) {
            builder.dust = rgtrDust(mat + DUST, config::getMaterialSet, config::getMaterialDust);
            builder.smallDust = rgtrSmallDust(mat + SMALL_DUST, config::getMaterialSet, config::getMaterialSmallDust);
            builder.block = rgtrBlock(mat + BLOCK, hardness, SoundType.SAND, tier, config::getMaterialSet, config::getMaterialDustBlock);
            return this;
        }

        public materialRegistrar salt(float hardness, EOBlockTier tier) {
            builder.dust = rgtrDust(mat + DUST, config::getMaterialSet, config::getMaterialDust);
            builder.smallDust = rgtrSmallDust(mat + SMALL_DUST, config::getMaterialSet, config::getMaterialSmallDust);
            builder.block = rgtrBlock(mat + BLOCK, hardness, SoundType.GRAVEL, tier, config::getMaterialSet, config::getMaterialDustBlock);
            return this;
        }

        public materialRegistrar dustAndBlocks(String materialName, float hardness, EOBlockTier tier) {
            builder.dust = rgtrDust(materialName, config::getMaterialSet, config::getMaterialDust);
            builder.smallDust = rgtrSmallDust(mat + SMALL_DUST, config::getMaterialSet, config::getMaterialSmallDust);
            builder.block = rgtrBlock(mat + BLOCK, hardness, SoundType.SAND, tier, config::getMaterialSet, config::getMaterialDustBlock);
            return this;
        }

        public materialRegistrar mainBlend() {
            builder.blend = rgtrBlend(mat + BLEND, config::getMaterialSet, config::getMaterialDust);
            builder.enriched = rgtrEnriched(ENRICHED + mat, config::getMaterialSet, config::getMaterialEnriched);
            return this;
        }

        public materialRegistrar carbonBlend() {
            builder.blend = rgtrBlend(mat + BLEND, config::getMaterialSet, config::getMaterialDust);
            return this;
        }

        public materialRegistrar secondaryBlend(String material) {
            builder.blend = rgtrBlend(mat + BLEND, config::getMaterialSet, config::getMaterialDust);
            builder.enriched = rgtrEnriched(material, config::getMaterialSet, config::getMaterialEnriched);
            return this;
        }

        public materialRegistrar enrichedDust(float hardness, SoundType sound, EOBlockTier tier) {
            builder.block = rgtrBlock(mat + BLOCK, hardness, sound, tier, config::getMaterialSet, config::getMaterialBlock);
            builder.dustBlock = rgtrDustBlock(mat + DUST_BLOCK, hardness, tier, config::getMaterialSet, config::getMaterialDustBlock);
            builder.dust = rgtrDust(mat + DUST, config::getMaterialSet, config::getMaterialDust);
            builder.smallDust = rgtrSmallDust(mat + SMALL_DUST, config::getMaterialSet, config::getMaterialSmallDust);
            builder.enriched = rgtrEnriched(ENRICHED + mat, config::getMaterialSet, config::getMaterialEnriched);
            return this;
        }

        public materialRegistrar enrichedDust(String materialName, float hardness, SoundType sound, EOBlockTier tier) {
            builder.block = rgtrBlock(mat + BLOCK, hardness, sound, tier, config::getMaterialSet, config::getMaterialBlock);
            builder.dust = rgtrDust(mat + DUST, config::getMaterialSet, config::getMaterialDust);
            builder.smallDust = rgtrSmallDust(mat + SMALL_DUST, config::getMaterialSet, config::getMaterialSmallDust);
            builder.enriched = rgtrEnriched(materialName, config::getMaterialSet, config::getMaterialEnriched);
            return this;
        }

        public materialRegistrar enrichedDusts(float hardness, SoundType sound, EOBlockTier tier) {
            builder.block = rgtrBlock(mat + BLOCK, hardness, sound, tier, config::getMaterialSet, config::getMaterialBlock);
            builder.dustBlock = rgtrDustBlock(mat + DUST_BLOCK, hardness, tier, config::getMaterialSet, config::getMaterialBlock);
            builder.smallDust = rgtrSmallDust(mat + SMALL_DUST, config::getMaterialSet, config::getMaterialSmallDust);
            builder.enriched = rgtrEnriched(ENRICHED + mat, config::getMaterialSet, config::getMaterialEnriched);
            return this;
        }

        public materialRegistrar unstableIngot(String materialName) {
            builder.unstable = rgtrUnstableIngot(materialName, config::getMaterialSet, config::getMaterialItem);
            builder.ingot = rgtrIngot(mat, config::getMaterialSet, config::getMaterialIngot);
            builder.nugget = rgtrNugget(mat + NUGGET, config::getMaterialSet, config::getMaterialIngot);
            return this;
        }

        public materialRegistrar enriched() {
            builder.enriched = rgtrEnriched(ENRICHED + mat, config::getMaterialSet, config::getMaterialEnriched);
            return this;
        }

        public materialRegistrar ingot() {
            builder.ingot = rgtrIngot(mat, config::getMaterialSet, config::getMaterialIngot);
            return this;
        }

        public materialRegistrar nugget() {
            builder.nugget = rgtrNugget(mat + NUGGET, config::getMaterialSet, config::getMaterialNugget);
            return this;
        }

        public materialRegistrar block(float hardness, SoundType sound, EOBlockTier tier) {
            builder.block = rgtrBlock(mat + BLOCK, hardness, sound, tier, config::getMaterialSet, config::getMaterialBlock);
            return this;
        }

        public materialRegistrar ores(float hardness, EOBlockTier tier, int min, int max, EOreLayerType... layers) {
            DeferredItem<?> drop = getOreDrop();
            for (EOreLayerType layer : layers) {
                assignOre(layer, rgtrOreBlock(oreId(layer), hardness, soundFor(layer), layer, tier, drop, min, max, config::getMaterialOres, config::getMaterialSet));
            }
            return this;
        }

        public materialRegistrar ore(String customId, float hardness, EOreLayerType layer, EOBlockTier tier, int min, int max) {
            assignOre(layer, rgtrOreBlock(customId, hardness, soundFor(layer), layer, tier, getOreDrop(), min, max, config::getMaterialOres, config::getMaterialSet));
            return this;
        }

        private String oreId(EOreLayerType layer) {
            return switch (layer) {
                case ORE_STONE, ORE_SAND, ORE_SCULK -> mat + ORE;
                case ORE_SLATE -> SLATE_ORE + mat + ORE;
                case ORE_NETHER -> NETHER_ORE + mat + ORE;
                case ORE_END -> END_ORE + mat + ORE;
            };
        }

        private SoundType soundFor(EOreLayerType layer) {
            return switch (layer) {
                case ORE_STONE, ORE_END, ORE_SCULK -> SoundType.STONE;
                case ORE_SLATE -> SoundType.DEEPSLATE;
                case ORE_NETHER -> SoundType.NETHERRACK;
                case ORE_SAND -> SoundType.SAND;
            };
        }

        private DeferredItem<?> getOreDrop() {
            if (builder.raw != null) return builder.raw;
            if (builder.gem != null) return builder.gem;
            if (builder.coal != null) return builder.coal;
            if (builder.dust != null) return builder.dust;
            throw new IllegalStateException("No ore drop found for material: " + mat);
        }

        private void assignOre(EOreLayerType layer, DeferredBlock<EOreBlock> block) {
            switch (layer) {
                case ORE_STONE -> builder.ore = block;
                case ORE_SLATE -> builder.slateOre = block;
                case ORE_NETHER -> builder.netherOre = block;
                case ORE_END -> builder.endOre = block;
                case ORE_SAND -> builder.sandOre = block;
                case ORE_SCULK -> builder.sculkOre = block;
            }
        }

        public materialTypes build() {
            return builder.build();
        }
    }

    // I know that this is cursed and HORRIBLE so DON'T TELL ME TWICE
    @SuppressWarnings("all")
    public static String extractMaterialName(String path) {
        if (path.endsWith(HAMMER)) {
            return path.substring(0, path.length() - 7);
        }

        if (path.endsWith(WIRE_CUT)) {
            return path.substring(0, path.length() - 12);
        }

        if (path.endsWith(GEM_CUT)) {
            return path.substring(0, path.length() - 11);
        }

        // Items
        if (path.startsWith(PLATE)) {
            return path.substring(6);
        }

        if (path.startsWith(ROD)) {
            return path.substring(4);
        }

        if (path.startsWith(materialPrefixSuffixes.GEAR)) {
            return path.substring(5);
        }

        if (path.startsWith(RAW)) {
            if (path.endsWith(BLOCK)) {
                return path.substring(4, path.length() - 6);
            }

            return path.substring(4);
        }

        if (path.endsWith(GEOSHARDS)) {
            return path.substring(0, path.length() - 9);
        }

        if (path.startsWith(SHARD)) {
            return path.substring(6);
        }

        if (path.startsWith(GEM)) {
            return path.substring(4);
        }

        if (path.endsWith(GEM_SHARD)) {
            return path.substring(0, path.length() - 6);
        }

        if (path.startsWith(WIRE)) {
            return path.substring(5);
        }

        if (path.startsWith(CRYSTAL)) {
            return path.substring(8);
        }

        if (path.endsWith(DUST)) {
            if (path.startsWith(DIRTY_DUST)) {
                return path.substring(6, path.length() - 5);
            }

            if (path.endsWith(SMALL_DUST)) {
                return path.substring(0, path.length() - 11);
            }

            return path.substring(0, path.length() - 5);
        }

        if (path.endsWith(INGOT)) {
            return path.substring(0, path.length() - 6);
        }

        if (path.endsWith(NUGGET)) {
            return path.substring(0, path.length() - 7);
        }

        if (path.endsWith(SMALL_CLUMP)) {
            return path.substring(0, path.length() - 12);
        }

        if (path.endsWith(ORE_GEM)) {
            return path.substring(0, path.length() - 4);
        }

        if (path.startsWith(CLUMP)) {
            return path.substring(6);
        }

        if (path.startsWith(COAL)) {
            return path.substring(0, path.length() - 5);
        }

        if (path.startsWith(ENRICHED)) {
            if (path.startsWith("highly_" + ENRICHED)) {
                return path.substring(16);
            }

            if (path.startsWith("low_" + ENRICHED)) {
                return path.substring(13);
            }

            return path.substring(9);
        }

        if (path.endsWith(BLEND)) {
            return path.substring(0, path.length() - 6);
        }

        if (path.startsWith(MOLD)) {
            return path.substring(5);
        }

        if (path.endsWith(FOIL)) {
            return path.substring(0, path.length() - 5);
        }

        if (path.endsWith(PEBBLE)) {
            return path.substring(0, path.length() - 7);
        }

        if (path.startsWith(wPlate)) {
            return path.substring(13);
        }

        // Blocks
        if (path.endsWith(DUST_BLOCK)) {
            return path.substring(0, path.length() - 11);
        }

        if (path.endsWith(COAL_BLOCK)) {
            return path.substring(0, path.length() - 6);
        }

        if (path.startsWith(BUDDING)) {
            return path.substring(8, path.length());
        }

        if (path.endsWith(GEORE_BLOCK)) {
            return path.substring(0, path.length() - 10);
        }

        if (path.startsWith(SMALL_GEO) && path.endsWith(BUD)) {
            return path.substring(6, path.length() - 4);
        }

        if (path.startsWith(MEDIUM_GEO) && path.endsWith(BUD)) {
            return path.substring(7, path.length() - 4);
        }

        if (path.startsWith(LARGE_GEO) && path.endsWith(BUD)) {
            return path.substring(6, path.length() - 4);
        }

        if (path.endsWith(CLUSTER)) {
            return path.substring(0, path.length() - 8);
        }

        if (path.endsWith(ORE)) {
            String base = path.substring(0, path.length() - 10);
            if (base.startsWith(SLATE_ORE)) {
                return base.substring(10);
            }

            if (base.startsWith(NETHER_ORE)) {
                return base.substring(7);
            }

            if (base.startsWith(materialPrefixSuffixes.END_ORE)) {
                return base.substring(4);
            }

            return base;
        }

        if (path.endsWith(BLOCK)) {
            return path.substring(0, path.length() - 6);
        }

        if (path.endsWith(CAPACITOR)) {
            return path.substring(0, path.length() - 10);
        }

        if (path.endsWith(GRINDING_BALL)) {
            return path.substring(0, path.length() - 14);
        }

        return path;
    }
}
