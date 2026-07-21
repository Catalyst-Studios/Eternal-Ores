package net.radzratz.eternalores.block;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.radzratz.eternalores.block.types.*;
import net.radzratz.eternalores.block.types.enums.EOBlockTier;
import net.radzratz.eternalores.block.types.enums.EOreLayerType;
import net.radzratz.eternalores.block.types.special.EORedstoneBlock;
import net.radzratz.eternalores.util.config.EOCompressedBlockConfig;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

import static net.radzratz.eternalores.util.EOSetRegistries.EO_BLOCKS;
import static net.radzratz.eternalores.util.EOSetRegistries.EO_ITEMS;

public class EOBlockHelpers {
    public static <T extends Block> void rgtrBlockItem(String id, DeferredBlock<T> block, BooleanSupplier material, @Nullable BooleanSupplier set) {
        EO_ITEMS.register(id, () -> new EOConfigBlockItem(block.get(),
                new Item.Properties(),
                material,
                set
        ));
    }

    public static <T extends Block> DeferredBlock<T> rgtrBlock(String id, Supplier<T> block, BooleanSupplier material, BooleanSupplier set) {
        DeferredBlock<T> toReturn = EO_BLOCKS.register(id, block);
        rgtrBlockItem(id, toReturn, material, set);
        return toReturn;
    }

    public static DeferredBlock<EOreBlock> rgtrOreBlock(String id, float hardness, SoundType sound, EOreLayerType layerType,
                                                          EOBlockTier tier, DeferredItem<?> drop, int minDrop, int maxDrop, BooleanSupplier material, BooleanSupplier set) {
        return rgtrBlock(id, () -> new EOreBlock(layerType, tier, drop, minDrop, maxDrop, BlockBehaviour.Properties.of()
                .strength(hardness)
                .requiresCorrectToolForDrops()
                .sound(sound)), material, set);
    }

    public static DeferredBlock<EORawBlock> rgtrRawBlock(String id, float hardness, SoundType sound, EOBlockTier tier, BooleanSupplier material, BooleanSupplier set) {
        return rgtrBlock(id, () -> new EORawBlock(tier, BlockBehaviour.Properties.of()
                .strength(hardness)
                .requiresCorrectToolForDrops()
                .sound(sound)), material, set);
    }

    public static DeferredBlock<EOStorageBlock> rgtrBlock(String id, float hardness, SoundType sound, EOBlockTier tier, BooleanSupplier material, BooleanSupplier set) {
        return rgtrBlock(id, () -> new EOStorageBlock(tier, BlockBehaviour.Properties.of()
                .strength(hardness)
                .requiresCorrectToolForDrops()
                .sound(sound)), material, set);
    }

    public static DeferredBlock<EORedstoneBlock> rgtrRedstoneBlock(String id, float hardness, SoundType sound, EOBlockTier tier, BooleanSupplier material, BooleanSupplier set) {
        return rgtrBlock(id, () -> new EORedstoneBlock(tier, BlockBehaviour.Properties.of()
                .strength(hardness)
                .requiresCorrectToolForDrops()
                .sound(sound)), material, set);
    }

    public static DeferredBlock<EODustBlock> rgtrDustBlock(String id, float hardness, EOBlockTier tier, BooleanSupplier material, BooleanSupplier set) {
        return rgtrBlock(id, () -> new EODustBlock(tier, BlockBehaviour.Properties.of()
                .strength(hardness)
                .requiresCorrectToolForDrops()), material, set);
    }

    public static DeferredBlock<EODustBlock> rgtrDustBlock(String id, float hardness, int burnTime, SoundType sound, EOBlockTier tier, BooleanSupplier material, BooleanSupplier set) {
        return rgtrBlock(id, () -> new EODustBlock(tier, burnTime, BlockBehaviour.Properties.of()
                .strength(hardness)
                .requiresCorrectToolForDrops()
                .sound(sound)), material, set);
    }

    public static DeferredBlock<EOCoalBlock> rgtrCoalBlock(String id, float hardness, int burnTime, SoundType sound, EOBlockTier tier, BooleanSupplier material, BooleanSupplier set) {
        return rgtrBlock(id, () -> new EOCoalBlock(tier, burnTime, BlockBehaviour.Properties.of()
                .strength(hardness)
                .requiresCorrectToolForDrops()
                .sound(sound)), material, set);
    }

    public static DeferredBlock<EOCompressedBlock> rgtrCompressedBlock(String id, float hardness, Supplier<SoundType> soundSupplier, Supplier<Boolean> noOcclusionSupplier, EOBlockTier tier, BooleanSupplier ind) {
        return rgtrBlock(id, () -> {
            BlockBehaviour.Properties props = BlockBehaviour.Properties.of()
                    .strength(hardness)
                    .requiresCorrectToolForDrops()
                    .sound(soundSupplier.get())
                    .noLootTable();

            if (noOcclusionSupplier.get()) {
                props = props.noOcclusion();
            }

            return new EOCompressedBlock(tier, props);
        }, ind, ind);
    }

    public record EOCompressedSet(String name, List<DeferredBlock<EOCompressedBlock>> blocks) {
        public DeferredBlock<EOCompressedBlock> get(int level) {
            return blocks.get(level - 1);
        }

        public List<DeferredBlock<EOCompressedBlock>> getAll() {
            return blocks;
        }

        public static EOCompressedSet rgtrCompressed(String id, float hardness, Supplier<SoundType> soundSupplier, Supplier<Boolean> noOcclusionSupplier, EOBlockTier tier, EOCompressedBlockConfig.CompressedSetConfig cfg) {
            @SuppressWarnings("unchecked")
            DeferredBlock<EOCompressedBlock>[] arr = new DeferredBlock[9];
            for (int i = 0; i < 9; i++) {
                String path = "compressed_" + id + "_" + (i + 1) + "x";
                arr[i] = rgtrCompressedBlock(path, hardness, soundSupplier, noOcclusionSupplier, tier, cfg.forLevel(i + 1));
            }
            return new EOCompressedSet(id, List.of(arr));
        }
    }
}
