package net.radzratz.eternalores.util.compat.geore;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.radzratz.eternalores.block.types.enums.EOBlockTier;
import net.radzratz.eternalores.util.compat.geore.blocks.*;
import net.radzratz.eternalores.util.compat.geore.item.GEOreShardItem;

import java.util.function.Supplier;

import static net.radzratz.eternalores.util.compat.geore.GEOreRegistry.GEORE_BLOCKS;
import static net.radzratz.eternalores.util.compat.geore.GEOreRegistry.GEORE_ITEMS;

public class GEOreHelpers {
    public static DeferredBlock<GEOreShardBlock> rgtrGeOreBlock(String id, EOBlockTier tier) {
        return rgtrBlock(id + "_geo_block", () -> new GEOreShardBlock(
                BlockBehaviour.Properties.of()
                .strength(0.9f)
                .requiresCorrectToolForDrops()
                .sound(SoundType.AMETHYST), tier));
    }

    public static DeferredBlock<GEOreSmallBuds> rgtrSmallBudBlock(String id, EOBlockTier tier) {
        return rgtrBlock("small_" + id + "_bud", () -> new GEOreSmallBuds(tier, 3.0f, 4.0f,
                BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_CLUSTER)
                .noOcclusion()
                .randomTicks()
                .sound(SoundType.AMETHYST_CLUSTER)
                .strength(1.5f)
                .lightLevel(state -> 1))
        );
    }

    public static DeferredBlock<GEOreMediumBuds> rgtrMediumBudBlock(String id, EOBlockTier tier) {
        return rgtrBlock("medium_" + id + "_bud", () -> new GEOreMediumBuds(tier, 4.0f, 3.0f,
                BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_CLUSTER)
                .noOcclusion()
                .randomTicks()
                .sound(SoundType.AMETHYST_CLUSTER)
                .strength(1.5F)
                .lightLevel(state -> 2))
        );
    }

    public static DeferredBlock<GEOreLargeBuds> rgtrLargeBudBlock(String id, EOBlockTier tier) {
        return rgtrBlock("large_" + id + "_bud", () -> new GEOreLargeBuds(tier, 5.0f, 3.0f,
                BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_CLUSTER)
                .noOcclusion()
                .randomTicks()
                .sound(SoundType.AMETHYST_CLUSTER)
                .strength(1.5f)
                .lightLevel(state -> 4))
        );
    }

    public static DeferredBlock<GEOreClusterBlock> rgtrClusterBlock(String id, EOBlockTier tier, DeferredItem<?> drop) {
        return rgtrBlock(id + "_cluster", () -> new GEOreClusterBlock(tier, drop, 7.0f, 3.0f,
                BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_CLUSTER)
                .noOcclusion()
                .randomTicks()
                .sound(SoundType.AMETHYST_CLUSTER)
                .strength(1.5f)
                .lightLevel(state -> 5))
        );
    }

    public static DeferredBlock<GEOreBuddingBlock> rgtrBuddingBlock(String id, EOBlockTier tier, DeferredBlock<GEOreSmallBuds> small, DeferredBlock<GEOreMediumBuds> medium,
                                                                    DeferredBlock<GEOreLargeBuds> large, DeferredBlock<GEOreClusterBlock> cluster) {
        return rgtrBlock("budding_" + id, () -> new GEOreBuddingBlock(
                BlockBehaviour.Properties.ofFullCopy(Blocks.BUDDING_AMETHYST)
                        .randomTicks()
                        .strength(1.5f)
                        .sound(SoundType.AMETHYST)
                        .requiresCorrectToolForDrops(), tier, small, medium, large, cluster)
        );
    }

    public static <T extends Block> DeferredBlock<T> rgtrBlock(String id, Supplier<T> block) {
        DeferredBlock<T> toReturn = GEORE_BLOCKS.register(id, block);
        GEORE_ITEMS.register(id, () -> new BlockItem(toReturn.get(), new Item.Properties()));
        return toReturn;
    }

    public static DeferredItem<GEOreShardItem> rgtrShard(String id) {
        return GEORE_ITEMS.register(id + "_geoshard", () -> new GEOreShardItem(new Item.Properties()));
    }
}
