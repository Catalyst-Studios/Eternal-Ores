package net.radzratz.eternalores.util.compat.geore.blocks;

import net.minecraft.world.level.block.AmethystClusterBlock;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.radzratz.eternalores.block.types.enums.EOBlockTier;

public class GEOreClusterBlock extends AmethystClusterBlock {
    private final EOBlockTier tier;
    private final DeferredItem<?> drops;

    public GEOreClusterBlock(EOBlockTier tier, DeferredItem<?> drops, float height, float aabbOffset, Properties properties) {
        super(height, aabbOffset, properties);
        this.tier = tier;
        this.drops = drops;
    }

    public EOBlockTier getTier() {
        return tier;
    }

    public DeferredItem<?> getDrops() {
        return drops;
    }

    public static DeferredBlock<GEOreClusterBlock> CATALYRIUM_CLUSTER;
    public static DeferredBlock<GEOreClusterBlock> ARDITE_CLUSTER;
    public static DeferredBlock<GEOreClusterBlock> BERYLLIUM_CLUSTER;
    public static DeferredBlock<GEOreClusterBlock> COBALT_CLUSTER;
    public static DeferredBlock<GEOreClusterBlock> GALLIUM_CLUSTER;
    public static DeferredBlock<GEOreClusterBlock> IRIDIUM_CLUSTER;
    public static DeferredBlock<GEOreClusterBlock> SCULKITE_CLUSTER;
    public static DeferredBlock<GEOreClusterBlock> TITANIUM_CLUSTER;
    public static DeferredBlock<GEOreClusterBlock> ULTIMATITANIUM_CLUSTER;
    public static DeferredBlock<GEOreClusterBlock> FLUORITE_CLUSTER;
    public static DeferredBlock<GEOreClusterBlock> APATITE_CLUSTER;
    public static DeferredBlock<GEOreClusterBlock> CINNABAR_CLUSTER;
    public static DeferredBlock<GEOreClusterBlock> GARNET_CLUSTER;
    public static DeferredBlock<GEOreClusterBlock> JADE_CLUSTER;
    public static DeferredBlock<GEOreClusterBlock> NECROTICARITE_CLUSTER;
    public static DeferredBlock<GEOreClusterBlock> NITER_CLUSTER;
    public static DeferredBlock<GEOreClusterBlock> OBSIDIAN_CLUSTER;
    public static DeferredBlock<GEOreClusterBlock> ONYX_CLUSTER;
    public static DeferredBlock<GEOreClusterBlock> PEARL_CLUSTER;
    public static DeferredBlock<GEOreClusterBlock> PERIDOT_CLUSTER;
    public static DeferredBlock<GEOreClusterBlock> PYROLITE_CLUSTER;
    public static DeferredBlock<GEOreClusterBlock> TANZANITE_CLUSTER;
    public static DeferredBlock<GEOreClusterBlock> ZIRCON_CLUSTER;
    public static DeferredBlock<GEOreClusterBlock> MOLYBDENUM_CLUSTER;
    public static DeferredBlock<GEOreClusterBlock> NEODYMIUM_CLUSTER;
    public static DeferredBlock<GEOreClusterBlock> SPINEL_CLUSTER;
    public static DeferredBlock<GEOreClusterBlock> PALLADIUM_CLUSTER;
}
