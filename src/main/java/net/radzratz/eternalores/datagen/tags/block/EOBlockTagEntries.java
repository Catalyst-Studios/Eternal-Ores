package net.radzratz.eternalores.datagen.tags.block;

import net.minecraft.core.HolderLookup;
import net.radzratz.eternalores.block.types.EOMiscBlock;
import net.radzratz.eternalores.block.types.EOBlock;
import net.radzratz.eternalores.block.types.EOCompressedBlock;
import net.radzratz.eternalores.block.types.EORawBlock;
import net.radzratz.eternalores.block.types.EOreBlock;
import net.radzratz.eternalores.datagen.tags.EOBlockTagProvider;
import net.radzratz.eternalores.datagen.tags.util.block.BlockTagAutoRegister;
import net.radzratz.eternalores.datagen.tags.util.block.ITagBlockEntryProvider;

import java.util.Comparator;

import static net.minecraft.tags.BlockTags.*;
import static net.neoforged.neoforge.common.Tags.Blocks.*;
import static net.radzratz.eternalores.util.EOUtils.allBlockEntries;
import static net.radzratz.eternalores.util.tags.block.EOGeneralBlockTags.Blocks.*;

/**
 * Registers all block tag entries for the Eternal Ores mod.
 * <p>
 * This class serves as a unified entry point that automatically detects block types
 * and applies the appropriate tags using {@link BlockTagAutoRegister}.
 * <p>
 * It significantly reduces boilerplate code by replacing individual tag entry classes with
 * a streamlined, type-based registration system.
 */
public class EOBlockTagEntries implements ITagBlockEntryProvider
{
    @Override
    public void addTags(EOBlockTagProvider provider, HolderLookup.Provider lookup)
    {
        BlockTagAutoRegister register = new BlockTagAutoRegister(provider);

        /// C Tags
        allBlockEntries().sorted(Comparator.comparing(entry -> entry.getId().getPath())).forEach(entry ->
        {
            Object obj = entry.get();

            switch (obj)
            {
                case EOBlock block -> register.register(entry, STORAGE_BLOCKS, block.getBlockType(), METAL_BLOCK, GEM_BLOCK, MISC_BLOCK);

                case EORawBlock block -> register.register(entry, STORAGE_BLOCKS, block.rawType(), RAW_ORE_BLOCK);

                case EOMiscBlock block -> register.register(entry, STORAGE_BLOCKS, block.getMiscBlock(), MISC_BLOCK);

                case EOreBlock ore -> register.register(entry, ORES, ore.getLayerType(), ORES_IN_GROUND_STONE, ORES_IN_GROUND_DEEPSLATE, ORES_IN_GROUND_NETHERRACK);

                default -> {}
            }
        });

        /// Mineable with Tool & Needs Tool Tier Tags
        allBlockEntries().sorted(Comparator.comparing(entry -> entry.getId().getPath())).forEach(entry ->
        {
            Object obj = entry.get();

            switch (obj)
            {
                case EOreBlock block -> register.register(entry, MINEABLE_WITH_PICKAXE, block.getTier(), NEEDS_STONE_TOOL, NEEDS_IRON_TOOL, NEEDS_DIAMOND_TOOL, NEEDS_NETHERITE_TOOL);

                case EOMiscBlock block -> register.register(entry, MINEABLE_WITH_PICKAXE, block.getTier(), NEEDS_STONE_TOOL, NEEDS_IRON_TOOL);

                case EOCompressedBlock block -> register.register(entry, MINEABLE_WITH_PICKAXE, block.getTier(), NEEDS_STONE_TOOL);

                case EORawBlock block -> register.register(entry, MINEABLE_WITH_PICKAXE, block.getTier(), NEEDS_STONE_TOOL, NEEDS_IRON_TOOL, NEEDS_DIAMOND_TOOL, NEEDS_NETHERITE_TOOL);

                case EOBlock block -> register.register(entry, MINEABLE_WITH_PICKAXE, block.getTier(), NEEDS_STONE_TOOL, NEEDS_IRON_TOOL, NEEDS_DIAMOND_TOOL, NEEDS_NETHERITE_TOOL);

                default -> {}
            }
        });

        /// Custom Tags
        allBlockEntries().sorted(Comparator.comparing(entry -> entry.getId().getPath())).forEach(entry ->
        {
            Object obj = entry.get();

            switch (obj)
            {
                case EOCompressedBlock block -> register.register(entry, COMPRESSED_BLOCK, true);

                case EORawBlock block -> register.register(entry, RAW_ORE_BLOCK, true);

                default -> {}
            }
        });
    }
}
