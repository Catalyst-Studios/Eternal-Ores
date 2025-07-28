package net.radzratz.eternalores.block;

import net.radzratz.eternalores.EternalOres;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.radzratz.eternalores.block.types.*;

import static net.minecraft.world.level.block.SoundType.*;
import static net.radzratz.eternalores.block.EOBlockHelpers.*;
import static net.radzratz.eternalores.block.types.enums.EOBlockTier.*;
import static net.radzratz.eternalores.block.types.enums.EOStorageBlockType.*;
import static net.radzratz.eternalores.block.types.enums.EOreLayerType.*;

@SuppressWarnings("all")
public class EOBlockRegistry
{
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(EternalOres.id);

    //ORE BLOCKS
    //Aluminum
    public static final DeferredBlock<EOreBlock> ALUMINUM_ORE_BLOCK = oreBlock("aluminum_ore_block", 3f, STONE, ORE_STONE, T_STONE);
    public static final DeferredBlock<EOreBlock> DEEPSLATE_ALUMINUM_ORE_BLOCK = oreBlock("deepslate_aluminum_ore_block", 3f, DEEPSLATE, ORE_DEEPSLATE, T_STONE);
    //Lead
    public static final DeferredBlock<EOreBlock> LEAD_ORE_BLOCK = oreBlock("lead_ore_block", 4f, STONE, ORE_STONE, T_IRON);
    public static final DeferredBlock<EOreBlock> DEEPSLATE_LEAD_ORE_BLOCK = oreBlock("deepslate_lead_ore_block", 4f, DEEPSLATE, ORE_DEEPSLATE, T_IRON);
    //Uranium
    public static final DeferredBlock<EOreBlock> URANIUM_ORE_BLOCK = oreBlock("uranium_ore_block", 4f, STONE, ORE_STONE, T_DIAMOND);
    public static final DeferredBlock<EOreBlock> DEEPSLATE_URANIUM_ORE_BLOCK = oreBlock("deepslate_uranium_ore_block", 4f, DEEPSLATE, ORE_DEEPSLATE, T_DIAMOND);
    //Osmium
    public static final DeferredBlock<EOreBlock> OSMIUM_ORE_BLOCK = oreBlock("osmium_ore_block", 3f, STONE, ORE_STONE, T_IRON);
    public static final DeferredBlock<EOreBlock> DEEPSLATE_OSMIUM_ORE_BLOCK = oreBlock("deepslate_osmium_ore_block", 3f, DEEPSLATE, ORE_DEEPSLATE, T_IRON);
    //Platinum
    public static final DeferredBlock<EOreBlock> PLATINUM_ORE_BLOCK = oreBlock("platinum_ore_block", 3f, STONE, ORE_STONE, T_DIAMOND);
    public static final DeferredBlock<EOreBlock> DEEPSLATE_PLATINUM_ORE_BLOCK = oreBlock("deepslate_platinum_ore_block", 3f, DEEPSLATE, ORE_DEEPSLATE, T_DIAMOND);
    //Fluorite
    public static final DeferredBlock<EOreBlock> FLUORITE_ORE_BLOCK = oreBlock("fluorite_ore_block", 4f, STONE, ORE_STONE, T_IRON);
    public static final DeferredBlock<EOreBlock> DEEPSLATE_FLUORITE_ORE_BLOCK = oreBlock("deepslate_fluorite_ore_block", 4f, DEEPSLATE, ORE_DEEPSLATE, T_IRON);
    //Cobalt
    public static final DeferredBlock<EOreBlock> COBALT_ORE_BLOCK = oreBlock("cobalt_ore_block", 4f, STONE, ORE_STONE, T_IRON);
    public static final DeferredBlock<EOreBlock> DEEPSLATE_COBALT_ORE_BLOCK = oreBlock("deepslate_cobalt_ore_block", 4f, DEEPSLATE, ORE_DEEPSLATE, T_IRON);
    //Tin
    public static final DeferredBlock<EOreBlock> TIN_ORE_BLOCK = oreBlock("tin_ore_block", 3f, STONE, ORE_STONE, T_STONE);
    public static final DeferredBlock<EOreBlock> DEEPSLATE_TIN_ORE_BLOCK = oreBlock("deepslate_tin_ore_block", 3f, DEEPSLATE, ORE_DEEPSLATE, T_STONE);
    //Nickel
    public static final DeferredBlock<EOreBlock> NICKEL_ORE_BLOCK = oreBlock("nickel_ore_block", 3f, STONE, ORE_STONE, T_IRON);
    public static final DeferredBlock<EOreBlock> DEEPSLATE_NICKEL_ORE_BLOCK = oreBlock("deepslate_nickel_ore_block", 3f, DEEPSLATE, ORE_DEEPSLATE, T_IRON);
    //Sulfur
    public static final DeferredBlock<EOreBlock> SULFUR_ORE_BLOCK = oreBlock("sulfur_ore_block", 3f, STONE, ORE_STONE, T_STONE);
    public static final DeferredBlock<EOreBlock> DEEPSLATE_SULFUR_ORE_BLOCK = oreBlock("deepslate_sulfur_ore_block", 3f, DEEPSLATE, ORE_DEEPSLATE, T_STONE);
    //Plutonium {this is going to be deleted, ore not, I dunno honestly}
    public static final DeferredBlock<EOreBlock> PLUTONIUM_ORE_BLOCK = oreBlock("plutonium_ore_block", 3f, STONE, ORE_STONE, T_DIAMOND);
    public static final DeferredBlock<EOreBlock> DEEPSLATE_PLUTONIUM_ORE_BLOCK = oreBlock("deepslate_plutonium_ore_block", 3f, DEEPSLATE, ORE_DEEPSLATE, T_DIAMOND);
    //Silver
    public static final DeferredBlock<EOreBlock> SILVER_ORE_BLOCK = oreBlock("silver_ore_block", 3f, STONE, ORE_STONE, T_IRON);
    public static final DeferredBlock<EOreBlock> DEEPSLATE_SILVER_ORE_BLOCK = oreBlock("deepslate_silver_ore_block", 3f, DEEPSLATE, ORE_DEEPSLATE, T_IRON);
    //Zinc
    public static final DeferredBlock<EOreBlock> ZINC_ORE_BLOCK = oreBlock("zinc_ore_block", 3f, STONE, ORE_STONE, T_STONE);
    public static final DeferredBlock<EOreBlock> DEEPSLATE_ZINC_ORE_BLOCK = oreBlock("deepslate_zinc_ore_block", 3f, DEEPSLATE, ORE_DEEPSLATE, T_STONE);
    //Sapphire
    public static final DeferredBlock<EOreBlock> SAPPHIRE_ORE_BLOCK = oreBlock("sapphire_ore_block", 3f, STONE, ORE_STONE, T_IRON);
    public static final DeferredBlock<EOreBlock> DEEPSLATE_SAPPHIRE_ORE_BLOCK = oreBlock("deepslate_sapphire_ore_block", 3f, DEEPSLATE, ORE_DEEPSLATE, T_IRON);
    //Apatite
    public static final DeferredBlock<EOreBlock> APATITE_ORE_BLOCK = oreBlock("apatite_ore_block", 3f, STONE, ORE_STONE, T_IRON);
    public static final DeferredBlock<EOreBlock> DEEPSLATE_APATITE_ORE_BLOCK = oreBlock("deepslate_apatite_ore_block", 3f, DEEPSLATE, ORE_DEEPSLATE, T_IRON);
    //Cinnabar
    public static final DeferredBlock<EOreBlock> CINNABAR_ORE_BLOCK = oreBlock("cinnabar_ore_block", 3f, STONE, ORE_STONE, T_IRON);
    public static final DeferredBlock<EOreBlock> DEEPSLATE_CINNABAR_ORE_BLOCK = oreBlock("deepslate_cinnabar_ore_block", 3f, DEEPSLATE, ORE_DEEPSLATE, T_IRON);
    //Onyx
    public static final DeferredBlock<EOreBlock> ONYX_ORE_BLOCK = oreBlock("onyx_ore_block", 3f, STONE, ORE_STONE, T_IRON);
    public static final DeferredBlock<EOreBlock> DEEPSLATE_ONYX_ORE_BLOCK = oreBlock("deepslate_onyx_ore_block", 3f, DEEPSLATE, ORE_DEEPSLATE, T_IRON);
    //Niter
    public static final DeferredBlock<EOreBlock> NITER_ORE_BLOCK = oreBlock("niter_ore_block", 3f, STONE, ORE_STONE, T_IRON);
    public static final DeferredBlock<EOreBlock> DEEPSLATE_NITER_ORE_BLOCK = oreBlock("deepslate_niter_ore_block", 3f, DEEPSLATE, ORE_DEEPSLATE, T_IRON);
    //Amber
    public static final DeferredBlock<EOreBlock> AMBER_ORE_BLOCK = oreBlock("amber_ore_block", 3f, STONE, ORE_STONE, T_IRON);
    public static final DeferredBlock<EOreBlock> DEEPSLATE_AMBER_ORE_BLOCK = oreBlock("deepslate_amber_ore_block", 3f, DEEPSLATE, ORE_DEEPSLATE, T_IRON);
    //Ruby
    public static final DeferredBlock<EOreBlock> RUBY_ORE_BLOCK = oreBlock("ruby_ore_block", 3f, STONE, ORE_STONE, T_IRON);
    public static final DeferredBlock<EOreBlock> DEEPSLATE_RUBY_ORE_BLOCK = oreBlock("deepslate_ruby_ore_block", 3f, DEEPSLATE, ORE_DEEPSLATE, T_IRON);
    //Gallium
    public static final DeferredBlock<EOreBlock> GALLIUM_ORE_BLOCK = oreBlock("gallium_ore_block", 3f, STONE, ORE_STONE, T_STONE);
    public static final DeferredBlock<EOreBlock> DEEPSLATE_GALLIUM_ORE_BLOCK = oreBlock("deepslate_gallium_ore_block", 3f, DEEPSLATE, ORE_DEEPSLATE, T_STONE);
    //Peridot
    public static final DeferredBlock<EOreBlock> PERIDOT_ORE_BLOCK = oreBlock("peridot_ore_block", 3f, STONE, ORE_STONE, T_IRON);
    public static final DeferredBlock<EOreBlock> DEEPSLATE_PERIDOT_ORE_BLOCK = oreBlock("deepslate_peridot_ore_block", 3f, DEEPSLATE, ORE_DEEPSLATE, T_IRON);
    //Obsidian
    public static final DeferredBlock<EOreBlock> OBSIDIAN_ORE_BLOCK = oreBlock("obsidian_ore_block", 4f, NETHERRACK, ORE_NETHER, T_DIAMOND);
    //Iridium
    public static final DeferredBlock<EOreBlock> IRIDIUM_ORE_BLOCK = oreBlock("iridium_ore_block", 4f, STONE, ORE_STONE, T_IRON);
    public static final DeferredBlock<EOreBlock> DEEPSLATE_IRIDIUM_ORE_BLOCK = oreBlock("deepslate_iridium_ore_block", 4f, DEEPSLATE, ORE_DEEPSLATE, T_IRON);
    //Uraninite
    public static final DeferredBlock<EOreBlock> URANINITE_ORE_BLOCK = oreBlock("uraninite_ore_block", 3f, STONE, ORE_STONE, T_IRON);
    public static final DeferredBlock<EOreBlock> DEEPSLATE_URANINITE_ORE_BLOCK = oreBlock("deepslate_uraninite_ore_block", 3f, DEEPSLATE, ORE_DEEPSLATE, T_IRON);
    //Necroticarite
    public static final DeferredBlock<EOreBlock> NECROTICARITE_ORE_BLOCK = oreBlock("necroticarite_ore_block", 4f, NETHERRACK, ORE_NETHER, T_DIAMOND);
    //Ardite
    public static final DeferredBlock<EOreBlock> ARDITE_ORE_BLOCK = oreBlock("ardite_ore_block", 7f, NETHERRACK, ORE_NETHER, T_NETHERITE);
    //Tungsten
    public static final DeferredBlock<EOreBlock> TUNGSTEN_ORE_BLOCK = oreBlock("tungsten_ore_block", 4f, DEEPSLATE, ORE_DEEPSLATE, T_DIAMOND);

    // Raw Blocks
    public static final DeferredBlock<EORawBlock> RAW_ALUMINUM_BLOCK = rawOreBlock("raw_aluminum_block", 3f, STONE, T_RAW, T_IRON);
    public static final DeferredBlock<EORawBlock> RAW_ARDITE_BLOCK = rawOreBlock("raw_ardite_block", 3f, STONE, T_RAW, T_NETHERITE);
    public static final DeferredBlock<EORawBlock> RAW_COBALT_BLOCK = rawOreBlock("raw_cobalt_block", 4f, STONE, T_RAW, T_IRON);
    public static final DeferredBlock<EORawBlock> RAW_LEAD_BLOCK = rawOreBlock("raw_lead_block", 3f, STONE, T_RAW, T_IRON);
    public static final DeferredBlock<EORawBlock> RAW_OSMIUM_BLOCK = rawOreBlock("raw_osmium_block", 3f, STONE, T_RAW, T_IRON);
    public static final DeferredBlock<EORawBlock> RAW_URANIUM_BLOCK = rawOreBlock("raw_uranium_block", 4f, STONE, T_RAW, T_DIAMOND);
    public static final DeferredBlock<EORawBlock> RAW_PLATINUM_BLOCK = rawOreBlock("raw_platinum_block", 4f, STONE, T_RAW, T_DIAMOND);
    public static final DeferredBlock<EORawBlock> RAW_TIN_BLOCK = rawOreBlock("raw_tin_block", 3f, STONE, T_RAW, T_STONE);
    public static final DeferredBlock<EORawBlock> RAW_NICKEL_BLOCK = rawOreBlock("raw_nickel_block", 3f, STONE, T_RAW, T_IRON);
    public static final DeferredBlock<EORawBlock> SULFUR_BLOCK = rawOreBlock("sulfur_block", 3f, STONE, T_RAW, T_STONE);
    public static final DeferredBlock<EORawBlock> RAW_PLUTONIUM_BLOCK = rawOreBlock("raw_plutonium_block", 4f, STONE, T_RAW, T_DIAMOND);
    public static final DeferredBlock<EORawBlock> RAW_SILVER_BLOCK = rawOreBlock("raw_silver_block", 3f, STONE, T_RAW, T_IRON);
    public static final DeferredBlock<EORawBlock> RAW_ZINC_BLOCK = rawOreBlock("raw_zinc_block", 3f, STONE, T_RAW, T_STONE);
    public static final DeferredBlock<EORawBlock> RAW_GALLIUM_BLOCK = rawOreBlock("raw_gallium_block", 3f, STONE, T_RAW, T_STONE);
    public static final DeferredBlock<EORawBlock> RAW_IRIDIUM_BLOCK = rawOreBlock("raw_iridium_block", 4f, STONE, T_RAW, T_IRON);
    public static final DeferredBlock<EORawBlock> RAW_URANINITE_BLOCK = rawOreBlock("raw_uraninite_block", 3f, STONE, T_RAW, T_IRON);
    public static final DeferredBlock<EORawBlock> RAW_CATALYRIUM_BLOCK = rawOreBlock("raw_catalyrium_block", 7f, STONE, T_RAW, T_NETHERITE);
    public static final DeferredBlock<EORawBlock> RAW_TUNGSTEN_BLOCK = rawOreBlock("raw_tungsten_block", 4f, STONE, T_RAW, T_DIAMOND);

    // Metal Blocks
    public static final DeferredBlock<EOBlock> ALUMINUM_BLOCK = metalBlock("aluminum_block", 3f, METAL, T_METAL, T_STONE);
    public static final DeferredBlock<EOBlock> ARDITE_BLOCK = metalBlock("ardite_block", 5f, NETHERITE_BLOCK, T_METAL, T_NETHERITE);
    public static final DeferredBlock<EOBlock> LEAD_BLOCK = metalBlock("lead_block", 4f, METAL, T_METAL, T_IRON);
    public static final DeferredBlock<EOBlock> OSMIUM_BLOCK = metalBlock("osmium_block", 3f, METAL, T_METAL, T_IRON);
    public static final DeferredBlock<EOBlock> URANIUM_BLOCK = metalBlock("uranium_block", 4f, METAL, T_METAL, T_DIAMOND);
    public static final DeferredBlock<EOBlock> PLATINUM_BLOCK = metalBlock("platinum_block", 4f, METAL, T_METAL, T_DIAMOND);
    public static final DeferredBlock<EOBlock> COBALT_BLOCK = metalBlock("cobalt_block", 4f, METAL, T_METAL, T_IRON);
    public static final DeferredBlock<EOBlock> TIN_BLOCK = metalBlock("tin_block", 3f, METAL, T_METAL, T_STONE);
    public static final DeferredBlock<EOBlock> ULTIMATITANIUM_BLOCK = metalBlock("ultimatitanium_block", 4f, METAL, T_METAL, T_DIAMOND);
    public static final DeferredBlock<EOBlock> NICKEL_BLOCK = metalBlock("nickel_block", 3f, METAL, T_METAL, T_IRON);
    public static final DeferredBlock<EOBlock> SIGNALUM_BLOCK = metalBlock("signalum_block", 3f, METAL, T_METAL, T_IRON);
    public static final DeferredBlock<EOBlock> PLUTONIUM_BLOCK = metalBlock("plutonium_block", 4f, METAL, T_METAL, T_DIAMOND);
    public static final DeferredBlock<EOBlock> LUMIUM_BLOCK = metalBlock("lumium_block", 3f, METAL, T_METAL, T_IRON);
    public static final DeferredBlock<EOBlock> INVAR_BLOCK = metalBlock("invar_block", 3f, METAL, T_METAL, T_IRON);
    public static final DeferredBlock<EOBlock> ENDERIUM_BLOCK = metalBlock("enderium_block", 4f, METAL, T_METAL, T_IRON);
    public static final DeferredBlock<EOBlock> ELECTRUM_BLOCK = metalBlock("electrum_block", 3f, METAL, T_METAL, T_IRON);
    public static final DeferredBlock<EOBlock> BRONZE_BLOCK = metalBlock("bronze_block", 3f, METAL, T_METAL, T_IRON);
    public static final DeferredBlock<EOBlock> SILVER_BLOCK = metalBlock("silver_block", 3f, METAL, T_METAL, T_IRON);
    public static final DeferredBlock<EOBlock> GRAPHITE_BLOCK = metalBlock("graphite_block", 3f, METAL, T_METAL, T_STONE);
    public static final DeferredBlock<EOBlock> CONSTANTAN_BLOCK = metalBlock("constantan_block", 3f, METAL, T_METAL, T_IRON);
    public static final DeferredBlock<EOBlock> BRASS_BLOCK = metalBlock("brass_block", 3f, METAL, T_METAL, T_IRON);
    public static final DeferredBlock<EOBlock> ZINC_BLOCK = metalBlock("zinc_block", 3f, METAL, T_METAL, T_STONE);
    public static final DeferredBlock<EOBlock> STEEL_BLOCK = metalBlock("steel_block", 3f, METAL, T_METAL, T_IRON);
    public static final DeferredBlock<EOBlock> BLUE_STEEL_BLOCK = metalBlock("blue_steel_block", 4f, METAL, T_METAL, T_IRON);
    public static final DeferredBlock<EOBlock> GALLIUM_BLOCK = metalBlock("gallium_block", 3f, METAL, T_METAL, T_STONE);
    public static final DeferredBlock<EOBlock> TITANIUM_BLOCK = metalBlock("titanium_block", 4f, METAL, T_METAL, T_DIAMOND);
    public static final DeferredBlock<EOBlock> PEWTER_BLOCK = metalBlock("pewter_block", 3f, METAL, T_METAL, T_IRON);
    public static final DeferredBlock<EOBlock> ROSE_GOLD_BLOCK = metalBlock("rose_gold_block", 3f, METAL, T_METAL, T_IRON);
    public static final DeferredBlock<EOBlock> BRITANNIA_SILVER_BLOCK = metalBlock("britannia_silver_block", 3f, METAL, T_METAL, T_IRON);
    public static final DeferredBlock<EOBlock> IRIDIUM_BLOCK = metalBlock("iridium_block", 3f, METAL, T_METAL, T_IRON);
    public static final DeferredBlock<EOBlock> CAST_IRON_BLOCK = metalBlock("cast_iron_block", 3f, METAL, T_METAL, T_IRON);
    public static final DeferredBlock<EOBlock> URANINITE_BLOCK = metalBlock("uraninite_block", 3f, METAL, T_METAL, T_IRON);
    public static final DeferredBlock<EOBlock> CAST_STEEL_BLOCK = metalBlock("cast_steel_block", 3f, METAL, T_METAL, T_IRON);
    public static final DeferredBlock<EOBlock> WROUGHT_IRON_BLOCK = metalBlock("wrought_iron_block", 3f, METAL, T_METAL, T_IRON);
    public static final DeferredBlock<EOBlock> NETHERSTEEL_BLOCK = metalBlock("nethersteel_block", 4f, NETHERITE_BLOCK, T_METAL, T_IRON);
    public static final DeferredBlock<EOBlock> SHADOWSTEEL_BLOCK = metalBlock("shadowsteel_block", 4f, NETHERITE_BLOCK, T_METAL, T_IRON);
    public static final DeferredBlock<EOBlock> PIG_IRON_BLOCK = metalBlock("pig_iron_block", 4f, METAL, T_METAL, T_IRON);
    public static final DeferredBlock<EOBlock> CATALYRIUM_BLOCK = metalBlock("catalyrium_block", 7f, METAL, T_METAL, T_NETHERITE);
    public static final DeferredBlock<EOBlock> TUNGSTEN_BLOCK = metalBlock("tungsten_block", 4f, METAL, T_METAL, T_DIAMOND);

    //Gem Blocks
    public static final DeferredBlock<EOBlock> SAPPHIRE_BLOCK = gemBlock("sapphire_block", 3f, METAL, T_GEM, T_IRON);
    public static final DeferredBlock<EOBlock> FLUORITE_BLOCK = gemBlock("fluorite_block", 3f, METAL, T_GEM, T_IRON);
    public static final DeferredBlock<EOBlock> APATITE_BLOCK = gemBlock("apatite_block", 3f, METAL, T_GEM, T_IRON);
    public static final DeferredBlock<EOBlock> CINNABAR_BLOCK = gemBlock("cinnabar_block", 3f, METAL, T_GEM, T_IRON);
    public static final DeferredBlock<EOBlock> AMBER_BLOCK = gemBlock("amber_block", 3f, METAL, T_GEM, T_IRON);
    public static final DeferredBlock<EOBlock> ONYX_BLOCK = gemBlock("onyx_block", 3f, METAL, T_GEM, T_IRON);
    public static final DeferredBlock<EOBlock> NITER_BLOCK = gemBlock("niter_block", 3f, METAL, T_GEM, T_IRON);
    public static final DeferredBlock<EOBlock> RUBY_BLOCK = gemBlock("ruby_block", 3f, METAL, T_GEM, T_IRON);
    public static final DeferredBlock<EOBlock> PERIDOT_BLOCK = gemBlock("peridot_block", 3f, METAL, T_GEM, T_IRON);
    public static final DeferredBlock<EOBlock> NECROTICARITE_BLOCK = gemBlock("necroticarite_block", 4f, METAL, T_GEM, T_DIAMOND);

    //Misc Blocks
    public static final DeferredBlock<EOMiscBlock> NETHER_STAR_BLOCK = miscBlock("nether_star_block", 4, METAL, T_MISC, T_DIAMOND);
    public static final DeferredBlock<EOMiscBlock> SILICON_BLOCK = miscBlock("silicon_block", 2f, STONE, T_MISC, T_IRON);

    //Compressed Blocks
    ///Cobblestone
    public static final DeferredBlock<EOCompressedBlock> COBBLE_1 = compressedBlock("compressed_cobble_1x", 2f, STONE, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> COBBLE_2 = compressedBlock("compressed_cobble_2x", 2f, STONE, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> COBBLE_3 = compressedBlock("compressed_cobble_3x", 2f, STONE, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> COBBLE_4 = compressedBlock("compressed_cobble_4x", 2f, STONE, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> COBBLE_5 = compressedBlock("compressed_cobble_5x", 2f, STONE, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> COBBLE_6 = compressedBlock("compressed_cobble_6x", 2f, STONE, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> COBBLE_7 = compressedBlock("compressed_cobble_7x", 2f, STONE, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> COBBLE_8 = compressedBlock("compressed_cobble_8x", 2f, STONE, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> COBBLE_9 = compressedBlock("compressed_cobble_9x", 2f, STONE, T_COMPRESSED, T_STONE);
    ///Sand
    public static final DeferredBlock<EOCompressedBlock> SAND_1 = compressedBlock("compressed_sand_1x", 2f, SAND, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> SAND_2 = compressedBlock("compressed_sand_2x", 2f, SAND, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> SAND_3 = compressedBlock("compressed_sand_3x", 2f, SAND, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> SAND_4 = compressedBlock("compressed_sand_4x", 2f, SAND, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> SAND_5 = compressedBlock("compressed_sand_5x", 2f, SAND, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> SAND_6 = compressedBlock("compressed_sand_6x", 2f, SAND, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> SAND_7 = compressedBlock("compressed_sand_7x", 2f, SAND, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> SAND_8 = compressedBlock("compressed_sand_8x", 2f, SAND, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> SAND_9 = compressedBlock("compressed_sand_9x", 2f, SAND, T_COMPRESSED, T_STONE);
    ///Dirt
    public static final DeferredBlock<EOCompressedBlock> DIRT_1 = compressedBlock("compressed_dirt_1x", 2f, GRAVEL, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> DIRT_2 = compressedBlock("compressed_dirt_2x", 2f, GRAVEL, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> DIRT_3 = compressedBlock("compressed_dirt_3x", 2f, GRAVEL, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> DIRT_4 = compressedBlock("compressed_dirt_4x", 2f, GRAVEL, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> DIRT_5 = compressedBlock("compressed_dirt_5x", 2f, GRAVEL, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> DIRT_6 = compressedBlock("compressed_dirt_6x", 2f, GRAVEL, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> DIRT_7 = compressedBlock("compressed_dirt_7x", 2f, GRAVEL, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> DIRT_8 = compressedBlock("compressed_dirt_8x", 2f, GRAVEL, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> DIRT_9 = compressedBlock("compressed_dirt_9x", 2f, GRAVEL, T_COMPRESSED, T_STONE);
    ///Andesite
    public static final DeferredBlock<EOCompressedBlock> ANDESITE_1 = compressedBlock("compressed_andesite_1x", 2f, STONE, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> ANDESITE_2 = compressedBlock("compressed_andesite_2x", 2f, STONE, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> ANDESITE_3 = compressedBlock("compressed_andesite_3x", 2f, STONE, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> ANDESITE_4 = compressedBlock("compressed_andesite_4x", 2f, STONE, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> ANDESITE_5 = compressedBlock("compressed_andesite_5x", 2f, STONE, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> ANDESITE_6 = compressedBlock("compressed_andesite_6x", 2f, STONE, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> ANDESITE_7 = compressedBlock("compressed_andesite_7x", 2f, STONE, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> ANDESITE_8 = compressedBlock("compressed_andesite_8x", 2f, STONE, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> ANDESITE_9 = compressedBlock("compressed_andesite_9x", 2f, STONE, T_COMPRESSED, T_STONE);
    ///Gravel
    public static final DeferredBlock<EOCompressedBlock> GRAVEL_1 = compressedBlock("compressed_gravel_1x", 2f, GRAVEL, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> GRAVEL_2 = compressedBlock("compressed_gravel_2x", 2f, GRAVEL, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> GRAVEL_3 = compressedBlock("compressed_gravel_3x", 2f, GRAVEL, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> GRAVEL_4 = compressedBlock("compressed_gravel_4x", 2f, GRAVEL, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> GRAVEL_5 = compressedBlock("compressed_gravel_5x", 2f, GRAVEL, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> GRAVEL_6 = compressedBlock("compressed_gravel_6x", 2f, GRAVEL, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> GRAVEL_7 = compressedBlock("compressed_gravel_7x", 2f, GRAVEL, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> GRAVEL_8 = compressedBlock("compressed_gravel_8x", 2f, GRAVEL, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> GRAVEL_9 = compressedBlock("compressed_gravel_9x", 2f, GRAVEL, T_COMPRESSED, T_STONE);
    ///Granite
    public static final DeferredBlock<EOCompressedBlock> GRANITE_1 = compressedBlock("compressed_granite_1x", 2f, STONE, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> GRANITE_2 = compressedBlock("compressed_granite_2x", 2f, STONE, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> GRANITE_3 = compressedBlock("compressed_granite_3x", 2f, STONE, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> GRANITE_4 = compressedBlock("compressed_granite_4x", 2f, STONE, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> GRANITE_5 = compressedBlock("compressed_granite_5x", 2f, STONE, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> GRANITE_6 = compressedBlock("compressed_granite_6x", 2f, STONE, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> GRANITE_7 = compressedBlock("compressed_granite_7x", 2f, STONE, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> GRANITE_8 = compressedBlock("compressed_granite_8x", 2f, STONE, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> GRANITE_9 = compressedBlock("compressed_granite_9x", 2f, STONE, T_COMPRESSED, T_STONE);
    ///Diorite
    public static final DeferredBlock<EOCompressedBlock> DIORITE_1 = compressedBlock("compressed_diorite_1x", 2f, STONE, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> DIORITE_2 = compressedBlock("compressed_diorite_2x", 2f, STONE, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> DIORITE_3 = compressedBlock("compressed_diorite_3x", 2f, STONE, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> DIORITE_4 = compressedBlock("compressed_diorite_4x", 2f, STONE, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> DIORITE_5 = compressedBlock("compressed_diorite_5x", 2f, STONE, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> DIORITE_6 = compressedBlock("compressed_diorite_6x", 2f, STONE, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> DIORITE_7 = compressedBlock("compressed_diorite_7x", 2f, STONE, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> DIORITE_8 = compressedBlock("compressed_diorite_8x", 2f, STONE, T_COMPRESSED, T_STONE);
    public static final DeferredBlock<EOCompressedBlock> DIORITE_9 = compressedBlock("compressed_diorite_9x", 2f, STONE, T_COMPRESSED, T_STONE);

    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}
