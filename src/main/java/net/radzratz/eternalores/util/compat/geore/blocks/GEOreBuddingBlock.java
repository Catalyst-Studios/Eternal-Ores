package net.radzratz.eternalores.util.compat.geore.blocks;

import com.shynieke.geore.block.BuddingGeoreBlock;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.radzratz.eternalores.block.types.enums.EOBlockTier;

import java.util.function.Supplier;

public class GEOreBuddingBlock extends BuddingGeoreBlock {
    private final EOBlockTier tier;
    public GEOreBuddingBlock(Properties properties, EOBlockTier tier, Supplier<? extends AmethystClusterBlock> smallSupplier, Supplier<? extends AmethystClusterBlock> mediumSupplier,
                             Supplier<? extends AmethystClusterBlock> largeSupplier, Supplier<? extends AmethystClusterBlock> clusterSupplier) {
        super(properties, smallSupplier, mediumSupplier, largeSupplier, clusterSupplier);
        this.tier = tier;
    }

    public EOBlockTier getTier() {
        return tier;
    }

    public static DeferredBlock<GEOreBuddingBlock> BUDDING_CATALYRIUM_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_ARDITE_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_BERYLLIUM_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_COBALT_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_GALLIUM_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_IRIDIUM_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_SCULKITE_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_TITANIUM_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_ULTIMATITANIUM_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_FLUORITE_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_APATITE_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_CINNABAR_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_GARNET_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_JADE_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_NECROTICARITE_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_NITER_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_OBSIDIAN_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_ONYX_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_PEARL_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_PERIDOT_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_PYROLITE_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_TANZANITE_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_ZIRCON_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_MOLYBDENUM_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_NEODYMIUM_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_SPINEL_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_PALLADIUM_BLOCK;
}
