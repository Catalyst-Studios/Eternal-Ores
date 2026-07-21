package net.radzratz.eternalores.util.compat.geore.blocks;

import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.radzratz.eternalores.block.types.enums.EOBlockTier;

public class GEOreShardBlock extends Block {
    private final EOBlockTier tier;

    public GEOreShardBlock(Properties properties, EOBlockTier tier) {
        super(properties);
        this.tier = tier;
    }

    public EOBlockTier getTier() {
        return tier;
    }

    public static DeferredBlock<GEOreShardBlock> CATALYRIUM_SHARD_BLOCK;
    public static DeferredBlock<GEOreShardBlock> ARDITE_SHARD_BLOCK;
    public static DeferredBlock<GEOreShardBlock> BERYLLIUM_SHARD_BLOCK;
    public static DeferredBlock<GEOreShardBlock> COBALT_SHARD_BLOCK;
    public static DeferredBlock<GEOreShardBlock> GALLIUM_SHARD_BLOCK;
    public static DeferredBlock<GEOreShardBlock> IRIDIUM_SHARD_BLOCK;
    public static DeferredBlock<GEOreShardBlock> SCULKITE_SHARD_BLOCK;
    public static DeferredBlock<GEOreShardBlock> TITANIUM_SHARD_BLOCK;
    public static DeferredBlock<GEOreShardBlock> ULTIMATITANIUM_SHARD_BLOCK;
    public static DeferredBlock<GEOreShardBlock> FLUORITE_SHARD_BLOCK;
    public static DeferredBlock<GEOreShardBlock> APATITE_SHARD_BLOCK;
    public static DeferredBlock<GEOreShardBlock> CINNABAR_SHARD_BLOCK;
    public static DeferredBlock<GEOreShardBlock> GARNET_SHARD_BLOCK;
    public static DeferredBlock<GEOreShardBlock> JADE_SHARD_BLOCK;
    public static DeferredBlock<GEOreShardBlock> NECROTICARITE_SHARD_BLOCK;
    public static DeferredBlock<GEOreShardBlock> NITER_SHARD_BLOCK;
    public static DeferredBlock<GEOreShardBlock> OBSIDIAN_SHARD_BLOCK;
    public static DeferredBlock<GEOreShardBlock> ONYX_SHARD_BLOCK;
    public static DeferredBlock<GEOreShardBlock> PEARL_SHARD_BLOCK;
    public static DeferredBlock<GEOreShardBlock> PERIDOT_SHARD_BLOCK;
    public static DeferredBlock<GEOreShardBlock> PYROLITE_SHARD_BLOCK;
    public static DeferredBlock<GEOreShardBlock> TANZANITE_SHARD_BLOCK;
    public static DeferredBlock<GEOreShardBlock> ZIRCON_SHARD_BLOCK;
    public static DeferredBlock<GEOreShardBlock> MOLYBDENUM_SHARD_BLOCK;
    public static DeferredBlock<GEOreShardBlock> NEODYMIUM_SHARD_BLOCK;
    public static DeferredBlock<GEOreShardBlock> SPINEL_SHARD_BLOCK;
    public static DeferredBlock<GEOreShardBlock> PALLADIUM_SHARD_BLOCK;
}
