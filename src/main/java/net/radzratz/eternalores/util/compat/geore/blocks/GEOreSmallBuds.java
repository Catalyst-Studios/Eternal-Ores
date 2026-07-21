package net.radzratz.eternalores.util.compat.geore.blocks;

import net.minecraft.world.level.block.AmethystClusterBlock;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.radzratz.eternalores.block.types.enums.EOBlockTier;

public class GEOreSmallBuds extends AmethystClusterBlock {
    private final EOBlockTier tier;

    public GEOreSmallBuds(EOBlockTier tier, float height, float aabbOffset, Properties properties) {
        super(height, aabbOffset, properties);
        this.tier = tier;
    }

    public EOBlockTier getTier() {
        return tier;
    }

    public static DeferredBlock<GEOreSmallBuds> SMALL_CATALYRIUM_BUD;
    public static DeferredBlock<GEOreSmallBuds> SMALL_ARDITE_BUD;
    public static DeferredBlock<GEOreSmallBuds> SMALL_BERYLLIUM_BUD;
    public static DeferredBlock<GEOreSmallBuds> SMALL_COBALT_BUD;
    public static DeferredBlock<GEOreSmallBuds> SMALL_GALLIUM_BUD;
    public static DeferredBlock<GEOreSmallBuds> SMALL_IRIDIUM_BUD;
    public static DeferredBlock<GEOreSmallBuds> SMALL_SCULKITE_BUD;
    public static DeferredBlock<GEOreSmallBuds> SMALL_TITANIUM_BUD;
    public static DeferredBlock<GEOreSmallBuds> SMALL_ULTIMATITANIUM_BUD;
    public static DeferredBlock<GEOreSmallBuds> SMALL_FLUORITE_BUD;
    public static DeferredBlock<GEOreSmallBuds> SMALL_APATITE_BUD;
    public static DeferredBlock<GEOreSmallBuds> SMALL_CINNABAR_BUD;
    public static DeferredBlock<GEOreSmallBuds> SMALL_GARNET_BUD;
    public static DeferredBlock<GEOreSmallBuds> SMALL_JADE_BUD;
    public static DeferredBlock<GEOreSmallBuds> SMALL_NECROTICARITE_BUD;
    public static DeferredBlock<GEOreSmallBuds> SMALL_NITER_BUD;
    public static DeferredBlock<GEOreSmallBuds> SMALL_OBSIDIAN_BUD;
    public static DeferredBlock<GEOreSmallBuds> SMALL_ONYX_BUD;
    public static DeferredBlock<GEOreSmallBuds> SMALL_PEARL_BUD;
    public static DeferredBlock<GEOreSmallBuds> SMALL_PERIDOT_BUD;
    public static DeferredBlock<GEOreSmallBuds> SMALL_PYROLITE_BUD;
    public static DeferredBlock<GEOreSmallBuds> SMALL_TANZANITE_BUD;
    public static DeferredBlock<GEOreSmallBuds> SMALL_ZIRCON_BUD;
    public static DeferredBlock<GEOreSmallBuds> SMALL_MOLYBDENUM_BUD;
    public static DeferredBlock<GEOreSmallBuds> SMALL_NEODYMIUM_BUD;
    public static DeferredBlock<GEOreSmallBuds> SMALL_SPINEL_BUD;
    public static DeferredBlock<GEOreSmallBuds> SMALL_PALLADIUM_BUD;

}
