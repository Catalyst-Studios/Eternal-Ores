package net.radzratz.eternalores.block;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.item.EternalGeneralItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

@SuppressWarnings("all")
public class EternalGeneralBlocks
{
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(EternalOres.MOD_ID);

    //ORE BLOCKS
    private static DeferredBlock<Block> registerOreBlock(String name, float hardness, SoundType sound)
    {
        return registerBlock(name, () -> new Block(BlockBehaviour.Properties.of()
                .strength(hardness)
                .requiresCorrectToolForDrops()
                .sound(sound)));
    }
    //Aluminum
    public static final DeferredBlock<Block> ALUMINUM_ORE_BLOCK = registerOreBlock("aluminum_ore_block", 3f, SoundType.STONE);
    public static final DeferredBlock<Block> DEEPSLATE_ALUMINUM_ORE_BLOCK = registerOreBlock("deepslate_aluminum_ore_block", 3f, SoundType.DEEPSLATE);
    //Lead
    public static final DeferredBlock<Block> LEAD_ORE_BLOCK = registerOreBlock("lead_ore_block", 4f, SoundType.STONE);
    public static final DeferredBlock<Block> DEEPSLATE_LEAD_ORE_BLOCK = registerOreBlock("deepslate_lead_ore_block", 4f, SoundType.DEEPSLATE);
    //Uranium
    public static final DeferredBlock<Block> URANIUM_ORE_BLOCK = registerOreBlock("uranium_ore_block", 4f, SoundType.STONE);
    public static final DeferredBlock<Block> DEEPSLATE_URANIUM_ORE_BLOCK = registerOreBlock("deepslate_uranium_ore_block", 4f, SoundType.DEEPSLATE);
    //Osmium
    public static final DeferredBlock<Block> OSMIUM_ORE_BLOCK = registerOreBlock("osmium_ore_block", 3f, SoundType.STONE);
    public static final DeferredBlock<Block> DEEPSLATE_OSMIUM_ORE_BLOCK = registerOreBlock("deepslate_osmium_ore_block", 3f, SoundType.DEEPSLATE);
    //Platinum
    public static final DeferredBlock<Block> PLATINUM_ORE_BLOCK = registerOreBlock("platinum_ore_block", 3f, SoundType.STONE);
    public static final DeferredBlock<Block> DEEPSLATE_PLATINUM_ORE_BLOCK = registerOreBlock("deepslate_platinum_ore_block", 3f, SoundType.DEEPSLATE);
    //Fluorite
    public static final DeferredBlock<Block> FLUORITE_ORE_BLOCK = registerOreBlock("fluorite_ore_block", 4f, SoundType.STONE);
    public static final DeferredBlock<Block> DEEPSLATE_FLUORITE_ORE_BLOCK = registerOreBlock("deepslate_fluorite_ore_block", 4f, SoundType.DEEPSLATE);
    //Cobalt
    public static final DeferredBlock<Block> COBALT_ORE_BLOCK = registerOreBlock("cobalt_ore_block", 4f, SoundType.STONE);
    public static final DeferredBlock<Block> DEEPSLATE_COBALT_ORE_BLOCK = registerOreBlock("deepslate_cobalt_ore_block", 4f, SoundType.DEEPSLATE);
    //Tin
    public static final DeferredBlock<Block> TIN_ORE_BLOCK = registerOreBlock("tin_ore_block", 3f, SoundType.STONE);
    public static final DeferredBlock<Block> DEEPSLATE_TIN_ORE_BLOCK = registerOreBlock("deepslate_tin_ore_block", 3f, SoundType.DEEPSLATE);
    //Nickel
    public static final DeferredBlock<Block> NICKEL_ORE_BLOCK = registerOreBlock("nickel_ore_block", 3f, SoundType.STONE);
    public static final DeferredBlock<Block> DEEPSLATE_NICKEL_ORE_BLOCK = registerOreBlock("deepslate_nickel_ore_block", 3f, SoundType.DEEPSLATE);
    //Sulfur
    public static final DeferredBlock<Block> SULFUR_ORE_BLOCK = registerOreBlock("sulfur_ore_block", 3f, SoundType.STONE);
    public static final DeferredBlock<Block> DEEPSLATE_SULFUR_ORE_BLOCK = registerOreBlock("deepslate_sulfur_ore_block", 3f, SoundType.DEEPSLATE);
    //Plutonium {this is going to be deleted}
    public static final DeferredBlock<Block> PLUTONIUM_ORE_BLOCK = registerOreBlock("plutonium_ore_block", 3f, SoundType.STONE);
    public static final DeferredBlock<Block> DEEPSLATE_PLUTONIUM_ORE_BLOCK = registerOreBlock("deepslate_plutonium_ore_block", 3f, SoundType.DEEPSLATE);
    //Silver
    public static final DeferredBlock<Block> SILVER_ORE_BLOCK = registerOreBlock("silver_ore_block", 3f, SoundType.STONE);
    public static final DeferredBlock<Block> DEEPSLATE_SILVER_ORE_BLOCK = registerOreBlock("deepslate_silver_ore_block", 3f, SoundType.DEEPSLATE);
    //Zinc
    public static final DeferredBlock<Block> ZINC_ORE_BLOCK = registerOreBlock("zinc_ore_block", 3f, SoundType.STONE);
    public static final DeferredBlock<Block> DEEPSLATE_ZINC_ORE_BLOCK = registerOreBlock("deepslate_zinc_ore_block", 3f, SoundType.DEEPSLATE);
    //Sapphire
    public static final DeferredBlock<Block> SAPPHIRE_ORE_BLOCK = registerOreBlock("sapphire_ore_block", 3f, SoundType.STONE);
    public static final DeferredBlock<Block> DEEPSLATE_SAPPHIRE_ORE_BLOCK = registerOreBlock("deepslate_sapphire_ore_block", 3f, SoundType.DEEPSLATE);
    //Apatite
    public static final DeferredBlock<Block> APATITE_ORE_BLOCK = registerOreBlock("apatite_ore_block", 3f, SoundType.STONE);
    public static final DeferredBlock<Block> DEEPSLATE_APATITE_ORE_BLOCK = registerOreBlock("deepslate_apatite_ore_block", 3f, SoundType.DEEPSLATE);
    //Cinnabar
    public static final DeferredBlock<Block> CINNABAR_ORE_BLOCK = registerOreBlock("cinnabar_ore_block", 3f, SoundType.STONE);
    public static final DeferredBlock<Block> DEEPSLATE_CINNABAR_ORE_BLOCK = registerOreBlock("deepslate_cinnabar_ore_block", 3f, SoundType.DEEPSLATE);
    //Onyx
    public static final DeferredBlock<Block> ONYX_ORE_BLOCK = registerOreBlock("onyx_ore_block", 3f, SoundType.STONE);
    public static final DeferredBlock<Block> DEEPSLATE_ONYX_ORE_BLOCK = registerOreBlock("deepslate_onyx_ore_block", 3f, SoundType.DEEPSLATE);
    //Niter
    public static final DeferredBlock<Block> NITER_ORE_BLOCK = registerOreBlock("niter_ore_block", 3f, SoundType.STONE);
    public static final DeferredBlock<Block> DEEPSLATE_NITER_ORE_BLOCK = registerOreBlock("deepslate_niter_ore_block", 3f, SoundType.DEEPSLATE);
    //Amber
    public static final DeferredBlock<Block> AMBER_ORE_BLOCK = registerOreBlock("amber_ore_block", 3f, SoundType.STONE);
    public static final DeferredBlock<Block> DEEPSLATE_AMBER_ORE_BLOCK = registerOreBlock("deepslate_amber_ore_block", 3f, SoundType.DEEPSLATE);
    //Ruby
    public static final DeferredBlock<Block> RUBY_ORE_BLOCK = registerOreBlock("ruby_ore_block", 3f, SoundType.STONE);
    public static final DeferredBlock<Block> DEEPSLATE_RUBY_ORE_BLOCK = registerOreBlock("deepslate_ruby_ore_block", 3f, SoundType.DEEPSLATE);
    //Gallium
    public static final DeferredBlock<Block> GALLIUM_ORE_BLOCK = registerOreBlock("gallium_ore_block", 3f, SoundType.STONE);
    public static final DeferredBlock<Block> DEEPSLATE_GALLIUM_ORE_BLOCK = registerOreBlock("deepslate_gallium_ore_block", 3f, SoundType.DEEPSLATE);
    //Peridot
    public static final DeferredBlock<Block> PERIDOT_ORE_BLOCK = registerOreBlock("peridot_ore_block", 3f, SoundType.STONE);
    public static final DeferredBlock<Block> DEEPSLATE_PERIDOT_ORE_BLOCK = registerOreBlock("deepslate_peridot_ore_block", 3f, SoundType.DEEPSLATE);
    //Obsidian
    public static final DeferredBlock<Block> OBSIDIAN_ORE_BLOCK = registerOreBlock("obsidian_ore_block", 4f, SoundType.NETHERRACK);
    //Iridium
    public static final DeferredBlock<Block> IRIDIUM_ORE_BLOCK = registerOreBlock("iridium_ore_block", 4f, SoundType.STONE);
    public static final DeferredBlock<Block> DEEPSLATE_IRIDIUM_ORE_BLOCK = registerOreBlock("deepslate_iridium_ore_block", 4f, SoundType.DEEPSLATE);
    //Uraninite
    public static final DeferredBlock<Block> URANINITE_ORE_BLOCK = registerOreBlock("uraninite_ore_block", 3f, SoundType.STONE);
    public static final DeferredBlock<Block> DEEPSLATE_URANINITE_ORE_BLOCK = registerOreBlock("deepslate_uraninite_ore_block", 3f, SoundType.DEEPSLATE);
    //Necroticarite
    public static final DeferredBlock<Block> NECROTICARITE_ORE_BLOCK = registerOreBlock("necroticarite_ore_block", 4f, SoundType.NETHERRACK);

    //RAW ORE BLOCKS
    private static DeferredBlock<Block> registerRawOreBlock(String name, float hardness, SoundType sound)
    {
        return registerBlock(name, () -> new Block(BlockBehaviour.Properties.of()
                .strength(hardness)
                .requiresCorrectToolForDrops()
                .sound(sound)));
    }
    public static final DeferredBlock<Block> RAW_ALUMINUM_BLOCK = registerRawOreBlock("raw_aluminum_block", 3f, SoundType.STONE);
    public static final DeferredBlock<Block> RAW_COBALT_BLOCK = registerRawOreBlock("raw_cobalt_block", 4f, SoundType.STONE);
    public static final DeferredBlock<Block> RAW_LEAD_BLOCK = registerRawOreBlock("raw_lead_block", 3f, SoundType.STONE);
    public static final DeferredBlock<Block> RAW_OSMIUM_BLOCK = registerRawOreBlock("raw_osmium_block", 3f, SoundType.STONE);
    public static final DeferredBlock<Block> RAW_URANIUM_BLOCK = registerRawOreBlock("raw_uranium_block", 4f, SoundType.STONE);
    public static final DeferredBlock<Block> RAW_PLATINUM_BLOCK = registerRawOreBlock("raw_platinum_block", 4f, SoundType.STONE);
    public static final DeferredBlock<Block> RAW_TIN_BLOCK = registerRawOreBlock("raw_tin_block", 3f, SoundType.STONE);
    public static final DeferredBlock<Block> RAW_NICKEL_BLOCK = registerRawOreBlock("raw_nickel_block", 3f, SoundType.STONE);
    public static final DeferredBlock<Block> SULFUR_BLOCK = registerRawOreBlock("sulfur_block", 3f, SoundType.STONE);
    public static final DeferredBlock<Block> RAW_PLUTONIUM_BLOCK = registerRawOreBlock("raw_plutonium_block", 4f, SoundType.STONE);
    public static final DeferredBlock<Block> RAW_SILVER_BLOCK = registerRawOreBlock("raw_silver_block", 3f, SoundType.STONE);
    public static final DeferredBlock<Block> RAW_ZINC_BLOCK = registerRawOreBlock("raw_zinc_block", 3f, SoundType.STONE);
    public static final DeferredBlock<Block> RAW_GALLIUM_BLOCK = registerRawOreBlock("raw_gallium_block", 3f, SoundType.STONE);
    public static final DeferredBlock<Block> RAW_IRIDIUM_BLOCK = registerRawOreBlock("raw_iridium_block", 4f, SoundType.STONE);
    public static final DeferredBlock<Block> RAW_URANINITE_BLOCK = registerRawOreBlock("raw_uraninite_block", 3f, SoundType.STONE);
    public static final DeferredBlock<Block> RAW_CATALYRIUM_BLOCK = registerRawOreBlock("raw_catalyrium_block", 7f, SoundType.STONE);

    //METAL BLOCK
    private static DeferredBlock<Block> registerMetalBlock(String name, float hardness, SoundType sound)
    {
        return registerBlock(name, () -> new Block(BlockBehaviour.Properties.of()
                .strength(hardness)
                .requiresCorrectToolForDrops()
                .sound(sound)));
    }
    public static final DeferredBlock<Block> ALUMINUM_BLOCK = registerMetalBlock("aluminum_block", 3f, SoundType.METAL);
    public static final DeferredBlock<Block> LEAD_BLOCK = registerMetalBlock("lead_block", 4f, SoundType.METAL);
    public static final DeferredBlock<Block> OSMIUM_BLOCK = registerMetalBlock("osmium_block", 3f, SoundType.METAL);
    public static final DeferredBlock<Block> URANIUM_BLOCK = registerMetalBlock("uranium_block", 4f, SoundType.METAL);
    public static final DeferredBlock<Block> PLATINUM_BLOCK = registerMetalBlock("platinum_block", 4f, SoundType.METAL);
    public static final DeferredBlock<Block> COBALT_BLOCK = registerMetalBlock("cobalt_block", 4f, SoundType.METAL);
    public static final DeferredBlock<Block> TIN_BLOCK = registerMetalBlock("tin_block", 3f, SoundType.METAL);
    public static final DeferredBlock<Block> ULTIMATITANIUM_BLOCK = registerMetalBlock("ultimatitanium_block", 4f, SoundType.METAL);
    public static final DeferredBlock<Block> NICKEL_BLOCK = registerMetalBlock("nickel_block", 3f, SoundType.METAL);
    public static final DeferredBlock<Block> SIGNALUM_BLOCK = registerMetalBlock("signalum_block", 3f, SoundType.METAL);
    public static final DeferredBlock<Block> PLUTONIUM_BLOCK = registerMetalBlock("plutonium_block", 4f, SoundType.METAL);
    public static final DeferredBlock<Block> LUMIUM_BLOCK = registerMetalBlock("lumium_block", 3f, SoundType.METAL);
    public static final DeferredBlock<Block> INVAR_BLOCK = registerMetalBlock("invar_block", 3f, SoundType.METAL);
    public static final DeferredBlock<Block> ENDERIUM_BLOCK = registerMetalBlock("enderium_block", 4f, SoundType.METAL);
    public static final DeferredBlock<Block> ELECTRUM_BLOCK = registerMetalBlock("electrum_block", 3f, SoundType.METAL);
    public static final DeferredBlock<Block> BRONZE_BLOCK = registerMetalBlock("bronze_block", 3f, SoundType.METAL);
    public static final DeferredBlock<Block> SILVER_BLOCK = registerMetalBlock("silver_block", 3f, SoundType.METAL);
    public static final DeferredBlock<Block> GRAPHITE_BLOCK = registerMetalBlock("graphite_block", 3f, SoundType.METAL);
    public static final DeferredBlock<Block> CONSTANTAN_BLOCK = registerMetalBlock("constantan_block", 3f, SoundType.METAL);
    public static final DeferredBlock<Block> BRASS_BLOCK = registerMetalBlock("brass_block", 3f, SoundType.METAL);
    public static final DeferredBlock<Block> ZINC_BLOCK = registerMetalBlock("zinc_block", 3f, SoundType.METAL);
    public static final DeferredBlock<Block> STEEL_BLOCK = registerMetalBlock("steel_block", 3f, SoundType.METAL);
    public static final DeferredBlock<Block> BLUE_STEEL_BLOCK = registerMetalBlock("blue_steel_block", 4f, SoundType.METAL);
    public static final DeferredBlock<Block> GALLIUM_BLOCK = registerMetalBlock("gallium_block", 3f, SoundType.METAL);
    public static final DeferredBlock<Block> TITANIUM_BLOCK = registerMetalBlock("titanium_block", 4f, SoundType.METAL);
    public static final DeferredBlock<Block> PEWTER_BLOCK = registerMetalBlock("pewter_block", 3f, SoundType.METAL);
    public static final DeferredBlock<Block> ROSE_GOLD_BLOCK = registerMetalBlock("rose_gold_block", 3f, SoundType.METAL);
    public static final DeferredBlock<Block> BRITANNIA_SILVER_BLOCK = registerMetalBlock("britannia_silver_block", 3f, SoundType.METAL);
    public static final DeferredBlock<Block> IRIDIUM_BLOCK = registerMetalBlock("iridium_block", 3f, SoundType.METAL);
    public static final DeferredBlock<Block> CAST_IRON_BLOCK = registerMetalBlock("cast_iron_block", 3f, SoundType.METAL);
    public static final DeferredBlock<Block> URANINITE_BLOCK = registerMetalBlock("uraninite_block", 3f, SoundType.METAL);
    public static final DeferredBlock<Block> CAST_STEEL_BLOCK = registerMetalBlock("cast_steel_block", 3f, SoundType.METAL);
    public static final DeferredBlock<Block> WROUGHT_IRON_BLOCK = registerMetalBlock("wrought_iron_block", 3f, SoundType.METAL);
    public static final DeferredBlock<Block> NETHERSTEEL_BLOCK = registerMetalBlock("nethersteel_block", 4f, SoundType.NETHERITE_BLOCK);
    public static final DeferredBlock<Block> SHADOWSTEEL_BLOCK = registerMetalBlock("shadowsteel_block", 4f, SoundType.NETHERITE_BLOCK);
    public static final DeferredBlock<Block> PIG_IRON_BLOCK = registerMetalBlock("pig_iron_block", 4f, SoundType.METAL);
    public static final DeferredBlock<Block> CATALYRIUM_BLOCK = registerMetalBlock("catalyrium_block", 7f, SoundType.METAL);

    //Gem Blocks
    private static DeferredBlock<Block> registerGemBlock(String name, float hardness, SoundType sound)
    {
        return registerBlock(name, () -> new Block(BlockBehaviour.Properties.of()
                .strength(hardness)
                .requiresCorrectToolForDrops()
                .sound(sound)));
    }
    public static final DeferredBlock<Block> SAPPHIRE_BLOCK = registerGemBlock("sapphire_block", 3f, SoundType.METAL);
    public static final DeferredBlock<Block> FLUORITE_BLOCK = registerGemBlock("fluorite_block", 3f, SoundType.METAL);
    public static final DeferredBlock<Block> APATITE_BLOCK = registerGemBlock("apatite_block", 3f, SoundType.METAL);
    public static final DeferredBlock<Block> CINNABAR_BLOCK = registerGemBlock("cinnabar_block", 3f, SoundType.METAL);
    public static final DeferredBlock<Block> AMBER_BLOCK = registerGemBlock("amber_block", 3f, SoundType.METAL);
    public static final DeferredBlock<Block> ONYX_BLOCK = registerGemBlock("onyx_block", 3f, SoundType.METAL);
    public static final DeferredBlock<Block> NITER_BLOCK = registerGemBlock("niter_block", 3f, SoundType.METAL);
    public static final DeferredBlock<Block> RUBY_BLOCK = registerGemBlock("ruby_block", 3f, SoundType.METAL);
    public static final DeferredBlock<Block> PERIDOT_BLOCK = registerGemBlock("peridot_block", 3f, SoundType.METAL);
    public static final DeferredBlock<Block> NECROTICARITE_BLOCK = registerGemBlock("necroticarite_block", 4f, SoundType.METAL);

    //Misc Blocks
    private static DeferredBlock<Block> registerMiscBlock(String name, float hardness, SoundType sound)
    {
        return registerBlock(name, () -> new Block(BlockBehaviour.Properties.of()
                .strength(hardness)
                .requiresCorrectToolForDrops()
                .sound(sound)));
    }
    public static final DeferredBlock<Block> NETHER_STAR_BLOCK = registerMiscBlock("nether_star_block", 4, SoundType.METAL);

    //Compressed Blocks
    private static DeferredBlock<Block> registerCompressedBlockItem(String name, float hardness, SoundType sound)
    {
        return registerBlock(name, () -> new Block(BlockBehaviour.Properties.of()
                .strength(hardness)
                .requiresCorrectToolForDrops()
                .sound(sound)));
    }
    ///Cobblestone
    public static final DeferredBlock<Block> COBBLE_1 = registerCompressedBlockItem("compressed_cobble_1x", 2f, SoundType.STONE);
    public static final DeferredBlock<Block> COBBLE_2 = registerCompressedBlockItem("compressed_cobble_2x", 2f, SoundType.STONE);
    public static final DeferredBlock<Block> COBBLE_3 = registerCompressedBlockItem("compressed_cobble_3x", 2f, SoundType.STONE);
    public static final DeferredBlock<Block> COBBLE_4 = registerCompressedBlockItem("compressed_cobble_4x", 2f, SoundType.STONE);
    public static final DeferredBlock<Block> COBBLE_5 = registerCompressedBlockItem("compressed_cobble_5x", 2f, SoundType.STONE);
    public static final DeferredBlock<Block> COBBLE_6 = registerCompressedBlockItem("compressed_cobble_6x", 2f, SoundType.STONE);
    public static final DeferredBlock<Block> COBBLE_7 = registerCompressedBlockItem("compressed_cobble_7x", 2f, SoundType.STONE);
    public static final DeferredBlock<Block> COBBLE_8 = registerCompressedBlockItem("compressed_cobble_8x", 2f, SoundType.STONE);
    public static final DeferredBlock<Block> COBBLE_9 = registerCompressedBlockItem("compressed_cobble_9x", 2f, SoundType.STONE);
    ///Sand
    public static final DeferredBlock<Block> SAND_1 = registerCompressedBlockItem("compressed_sand_1x", 2f, SoundType.SAND);
    public static final DeferredBlock<Block> SAND_2 = registerCompressedBlockItem("compressed_sand_2x", 2f, SoundType.SAND);
    public static final DeferredBlock<Block> SAND_3 = registerCompressedBlockItem("compressed_sand_3x", 2f, SoundType.SAND);
    public static final DeferredBlock<Block> SAND_4 = registerCompressedBlockItem("compressed_sand_4x", 2f, SoundType.SAND);
    public static final DeferredBlock<Block> SAND_5 = registerCompressedBlockItem("compressed_sand_5x", 2f, SoundType.SAND);
    public static final DeferredBlock<Block> SAND_6 = registerCompressedBlockItem("compressed_sand_6x", 2f, SoundType.SAND);
    public static final DeferredBlock<Block> SAND_7 = registerCompressedBlockItem("compressed_sand_7x", 2f, SoundType.SAND);
    public static final DeferredBlock<Block> SAND_8 = registerCompressedBlockItem("compressed_sand_8x", 2f, SoundType.SAND);
    public static final DeferredBlock<Block> SAND_9 = registerCompressedBlockItem("compressed_sand_9x", 2f, SoundType.SAND);
    ///Dirt
    public static final DeferredBlock<Block> DIRT_1 = registerCompressedBlockItem("compressed_dirt_1x", 2f, SoundType.GRAVEL);
    public static final DeferredBlock<Block> DIRT_2 = registerCompressedBlockItem("compressed_dirt_2x", 2f, SoundType.GRAVEL);
    public static final DeferredBlock<Block> DIRT_3 = registerCompressedBlockItem("compressed_dirt_3x", 2f, SoundType.GRAVEL);
    public static final DeferredBlock<Block> DIRT_4 = registerCompressedBlockItem("compressed_dirt_4x", 2f, SoundType.GRAVEL);
    public static final DeferredBlock<Block> DIRT_5 = registerCompressedBlockItem("compressed_dirt_5x", 2f, SoundType.GRAVEL);
    public static final DeferredBlock<Block> DIRT_6 = registerCompressedBlockItem("compressed_dirt_6x", 2f, SoundType.GRAVEL);
    public static final DeferredBlock<Block> DIRT_7 = registerCompressedBlockItem("compressed_dirt_7x", 2f, SoundType.GRAVEL);
    public static final DeferredBlock<Block> DIRT_8 = registerCompressedBlockItem("compressed_dirt_8x", 2f, SoundType.GRAVEL);
    public static final DeferredBlock<Block> DIRT_9 = registerCompressedBlockItem("compressed_dirt_9x", 2f, SoundType.GRAVEL);
    ///Andesite
    public static final DeferredBlock<Block> ANDESITE_1 = registerCompressedBlockItem("compressed_andesite_1x", 2f, SoundType.STONE);
    public static final DeferredBlock<Block> ANDESITE_2 = registerCompressedBlockItem("compressed_andesite_2x", 2f, SoundType.STONE);
    public static final DeferredBlock<Block> ANDESITE_3 = registerCompressedBlockItem("compressed_andesite_3x", 2f, SoundType.STONE);
    public static final DeferredBlock<Block> ANDESITE_4 = registerCompressedBlockItem("compressed_andesite_4x", 2f, SoundType.STONE);
    public static final DeferredBlock<Block> ANDESITE_5 = registerCompressedBlockItem("compressed_andesite_5x", 2f, SoundType.STONE);
    public static final DeferredBlock<Block> ANDESITE_6 = registerCompressedBlockItem("compressed_andesite_6x", 2f, SoundType.STONE);
    public static final DeferredBlock<Block> ANDESITE_7 = registerCompressedBlockItem("compressed_andesite_7x", 2f, SoundType.STONE);
    public static final DeferredBlock<Block> ANDESITE_8 = registerCompressedBlockItem("compressed_andesite_8x", 2f, SoundType.STONE);
    public static final DeferredBlock<Block> ANDESITE_9 = registerCompressedBlockItem("compressed_andesite_9x", 2f, SoundType.STONE);
    ///Gravel
    public static final DeferredBlock<Block> GRAVEL_1 = registerCompressedBlockItem("compressed_gravel_1x", 2f, SoundType.GRAVEL);
    public static final DeferredBlock<Block> GRAVEL_2 = registerCompressedBlockItem("compressed_gravel_2x", 2f, SoundType.GRAVEL);
    public static final DeferredBlock<Block> GRAVEL_3 = registerCompressedBlockItem("compressed_gravel_3x", 2f, SoundType.GRAVEL);
    public static final DeferredBlock<Block> GRAVEL_4 = registerCompressedBlockItem("compressed_gravel_4x", 2f, SoundType.GRAVEL);
    public static final DeferredBlock<Block> GRAVEL_5 = registerCompressedBlockItem("compressed_gravel_5x", 2f, SoundType.GRAVEL);
    public static final DeferredBlock<Block> GRAVEL_6 = registerCompressedBlockItem("compressed_gravel_6x", 2f, SoundType.GRAVEL);
    public static final DeferredBlock<Block> GRAVEL_7 = registerCompressedBlockItem("compressed_gravel_7x", 2f, SoundType.GRAVEL);
    public static final DeferredBlock<Block> GRAVEL_8 = registerCompressedBlockItem("compressed_gravel_8x", 2f, SoundType.GRAVEL);
    public static final DeferredBlock<Block> GRAVEL_9 = registerCompressedBlockItem("compressed_gravel_9x", 2f, SoundType.GRAVEL);
    ///Granite
    public static final DeferredBlock<Block> GRANITE_1 = registerCompressedBlockItem("compressed_granite_1x", 2f, SoundType.STONE);
    public static final DeferredBlock<Block> GRANITE_2 = registerCompressedBlockItem("compressed_granite_2x", 2f, SoundType.STONE);
    public static final DeferredBlock<Block> GRANITE_3 = registerCompressedBlockItem("compressed_granite_3x", 2f, SoundType.STONE);
    public static final DeferredBlock<Block> GRANITE_4 = registerCompressedBlockItem("compressed_granite_4x", 2f, SoundType.STONE);
    public static final DeferredBlock<Block> GRANITE_5 = registerCompressedBlockItem("compressed_granite_5x", 2f, SoundType.STONE);
    public static final DeferredBlock<Block> GRANITE_6 = registerCompressedBlockItem("compressed_granite_6x", 2f, SoundType.STONE);
    public static final DeferredBlock<Block> GRANITE_7 = registerCompressedBlockItem("compressed_granite_7x", 2f, SoundType.STONE);
    public static final DeferredBlock<Block> GRANITE_8 = registerCompressedBlockItem("compressed_granite_8x", 2f, SoundType.STONE);
    public static final DeferredBlock<Block> GRANITE_9 = registerCompressedBlockItem("compressed_granite_9x", 2f, SoundType.STONE);
    ///Diorite
    public static final DeferredBlock<Block> DIORITE_1 = registerCompressedBlockItem("compressed_diorite_1x", 2f, SoundType.STONE);
    public static final DeferredBlock<Block> DIORITE_2 = registerCompressedBlockItem("compressed_diorite_2x", 2f, SoundType.STONE);
    public static final DeferredBlock<Block> DIORITE_3 = registerCompressedBlockItem("compressed_diorite_3x", 2f, SoundType.STONE);
    public static final DeferredBlock<Block> DIORITE_4 = registerCompressedBlockItem("compressed_diorite_4x", 2f, SoundType.STONE);
    public static final DeferredBlock<Block> DIORITE_5 = registerCompressedBlockItem("compressed_diorite_5x", 2f, SoundType.STONE);
    public static final DeferredBlock<Block> DIORITE_6 = registerCompressedBlockItem("compressed_diorite_6x", 2f, SoundType.STONE);
    public static final DeferredBlock<Block> DIORITE_7 = registerCompressedBlockItem("compressed_diorite_7x", 2f, SoundType.STONE);
    public static final DeferredBlock<Block> DIORITE_8 = registerCompressedBlockItem("compressed_diorite_8x", 2f, SoundType.STONE);
    public static final DeferredBlock<Block> DIORITE_9 = registerCompressedBlockItem("compressed_diorite_9x", 2f, SoundType.STONE);

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block)
    {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block)
    {
        EternalGeneralItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}
