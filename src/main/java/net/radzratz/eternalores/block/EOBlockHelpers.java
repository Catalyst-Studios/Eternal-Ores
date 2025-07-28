package net.radzratz.eternalores.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.radzratz.eternalores.block.types.*;
import net.radzratz.eternalores.block.types.enums.EOBlockTier;
import net.radzratz.eternalores.block.types.enums.EOStorageBlockType;
import net.radzratz.eternalores.block.types.enums.EOreLayerType;
import net.radzratz.eternalores.item.EOItemRegistry;

import java.util.function.Supplier;

import static net.radzratz.eternalores.block.EOBlockRegistry.BLOCKS;

public class EOBlockHelpers
{
    /// Main Block Helpers
    public static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block)
    {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block)
    {
        EOItemRegistry.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    /// Block Type Helpers
    // Ores
    public static DeferredBlock<EOreBlock> oreBlock(String name, float hardness, SoundType sound, EOreLayerType layerType, EOBlockTier tier)
    {
        return registerBlock(name, () -> new EOreBlock(layerType, tier,BlockBehaviour.Properties.of()
                .strength(hardness)
                .requiresCorrectToolForDrops()
                .sound(sound)));
    }
    // Raw Blocks
    public static DeferredBlock<EORawBlock> rawOreBlock(String name, float hardness, SoundType sound, EOStorageBlockType type, EOBlockTier tier)
    {
        return registerBlock(name, () -> new EORawBlock(type, tier,BlockBehaviour.Properties.of()
                .strength(hardness)
                .requiresCorrectToolForDrops()
                .sound(sound)));
    }
    // Metal Blocks
    public static DeferredBlock<EOBlock> metalBlock(String name, float hardness, SoundType sound, EOStorageBlockType type, EOBlockTier tier)
    {
        return registerBlock(name, () -> new EOBlock(type, tier, BlockBehaviour.Properties.of()
                .strength(hardness)
                .requiresCorrectToolForDrops()
                .sound(sound)));
    }
    // Gem Blocks
    public static DeferredBlock<EOBlock> gemBlock(String name, float hardness, SoundType sound, EOStorageBlockType type, EOBlockTier tier)
    {
        return registerBlock(name, () -> new EOBlock(type, tier,BlockBehaviour.Properties.of()
                .strength(hardness)
                .requiresCorrectToolForDrops()
                .sound(sound)));
    }
    // Misc Blocks
    public static DeferredBlock<EOMiscBlock> miscBlock(String name, float hardness, SoundType sound, EOStorageBlockType type, EOBlockTier tier)
    {
        return registerBlock(name, () -> new EOMiscBlock(type, tier, BlockBehaviour.Properties.of()
                .strength(hardness)
                .requiresCorrectToolForDrops()
                .sound(sound)));
    }
    // Compressed Blocks
    public static DeferredBlock<EOCompressedBlock> compressedBlock(String name, float hardness, SoundType sound, EOStorageBlockType type, EOBlockTier tier)
    {
        return registerBlock(name, () -> new EOCompressedBlock(type, tier, BlockBehaviour.Properties.of()
                .strength(hardness)
                .requiresCorrectToolForDrops()
                .sound(sound)));
    }
}
