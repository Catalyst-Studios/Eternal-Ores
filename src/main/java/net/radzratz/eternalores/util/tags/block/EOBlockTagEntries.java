package net.radzratz.eternalores.util.tags.block;

import net.minecraft.core.HolderLookup;
import net.radzratz.eternalores.block.types.*;
import net.radzratz.eternalores.datagen.tags.EOBlockTagProvider;
import net.radzratz.eternalores.util.tags.block.util.BlockTagAutoRegister;
import net.radzratz.eternalores.util.tags.block.util.ITagBlockEntryProvider;

import java.util.Comparator;

import static net.minecraft.tags.BlockTags.*;
import static net.neoforged.neoforge.common.Tags.Blocks.*;
import static net.radzratz.eternalores.util.EOUtils.allBlockEntries;
import static net.radzratz.eternalores.util.tags.block.EOBlockTags.DustBlocks.*;
import static net.radzratz.eternalores.util.tags.block.EOBlockTags.OreBlocks.*;
import static net.radzratz.eternalores.util.tags.block.EOBlockTags.StorageBlocks.BLOCK_STORAGE_BLOCKS_RAW;

public class EOBlockTagEntries implements ITagBlockEntryProvider {
    @Override
    public void addTags(EOBlockTagProvider provider, HolderLookup.Provider lookup) {
        BlockTagAutoRegister register = new BlockTagAutoRegister(provider);

        allBlockEntries().sorted(Comparator.comparing(entry -> entry.getId().getPath())).forEach(entry -> {
            Object blocks = entry.get();
            if (blocks instanceof EOStorageBlock block) {
                register.register(entry, STORAGE_BLOCKS, true, false);

                register.registerWithoutIndividual(entry, MINEABLE_WITH_PICKAXE, block.getTier(), false, NEEDS_WOOD_TOOL, NEEDS_STONE_TOOL,
                        NEEDS_IRON_TOOL, NEEDS_DIAMOND_TOOL, NEEDS_NETHERITE_TOOL);
            }

            if (blocks instanceof EORawBlock block) {
                register.registerPrefixedOnly(entry, BLOCK_STORAGE_BLOCKS_RAW, false);

                register.register(entry, STORAGE_BLOCKS, false, false);

                register.registerWithoutIndividual(entry, MINEABLE_WITH_PICKAXE, block.getTier(), false, NEEDS_WOOD_TOOL, NEEDS_STONE_TOOL,
                        NEEDS_IRON_TOOL, NEEDS_DIAMOND_TOOL, NEEDS_NETHERITE_TOOL);
            }

            if (blocks instanceof EODustBlock block) {
                register.register(entry, BLOCK_DUST, true, false);

                register.registerWithoutIndividual(entry, MINEABLE_WITH_SHOVEL, block.getTier(), false, NEEDS_WOOD_TOOL, NEEDS_STONE_TOOL,
                        NEEDS_IRON_TOOL, NEEDS_DIAMOND_TOOL, NEEDS_NETHERITE_TOOL);
            }

            if (blocks instanceof EOreBlock block) {
                register.registerWithoutIndividual(entry, MINEABLE_WITH_PICKAXE, block.getTier(), false, NEEDS_WOOD_TOOL, NEEDS_STONE_TOOL,
                        NEEDS_IRON_TOOL, NEEDS_DIAMOND_TOOL, NEEDS_NETHERITE_TOOL);

                register.register(entry, ORES, block.getLayerType(), BLOCK_ORES_IN_GROUND_SAND, ORES_IN_GROUND_STONE, ORES_IN_GROUND_DEEPSLATE, BLOCK_ORES_IN_GROUND_SCULK,
                        ORES_IN_GROUND_NETHERRACK, BLOCK_ORES_IN_GROUND_END);
            }

            if (blocks instanceof EOCoalBlock block) {
                register.register(entry, STORAGE_BLOCKS, block.getTier());

                register.registerWithoutIndividual(entry, MINEABLE_WITH_PICKAXE, block.getTier(), false, NEEDS_STONE_TOOL);
            }
        });
    }
}
