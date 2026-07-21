package net.radzratz.eternalores.util.compat.geore.blocks;

import net.minecraft.world.level.block.AmethystClusterBlock;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.radzratz.eternalores.block.types.enums.EOBlockTier;

public class GEOreLargeBuds extends AmethystClusterBlock {
    private final EOBlockTier tier;

    public GEOreLargeBuds(EOBlockTier tier, float height, float aabbOffset, Properties properties) {
        super(height, aabbOffset, properties);
        this.tier = tier;
    }

    public EOBlockTier getTier() {
        return tier;
    }

    public static DeferredBlock<GEOreLargeBuds> LARGE_CATALYRIUM_BUD;
    public static DeferredBlock<GEOreLargeBuds> LARGE_ARDITE_BUD;
    public static DeferredBlock<GEOreLargeBuds> LARGE_BERYLLIUM_BUD;
    public static DeferredBlock<GEOreLargeBuds> LARGE_COBALT_BUD;
    public static DeferredBlock<GEOreLargeBuds> LARGE_GALLIUM_BUD;
    public static DeferredBlock<GEOreLargeBuds> LARGE_IRIDIUM_BUD;
    public static DeferredBlock<GEOreLargeBuds> LARGE_SCULKITE_BUD;
    public static DeferredBlock<GEOreLargeBuds> LARGE_TITANIUM_BUD;
    public static DeferredBlock<GEOreLargeBuds> LARGE_ULTIMATITANIUM_BUD;
    public static DeferredBlock<GEOreLargeBuds> LARGE_FLUORITE_BUD;
    public static DeferredBlock<GEOreLargeBuds> LARGE_APATITE_BUD;
    public static DeferredBlock<GEOreLargeBuds> LARGE_CINNABAR_BUD;
    public static DeferredBlock<GEOreLargeBuds> LARGE_GARNET_BUD;
    public static DeferredBlock<GEOreLargeBuds> LARGE_JADE_BUD;
    public static DeferredBlock<GEOreLargeBuds> LARGE_NECROTICARITE_BUD;
    public static DeferredBlock<GEOreLargeBuds> LARGE_NITER_BUD;
    public static DeferredBlock<GEOreLargeBuds> LARGE_OBSIDIAN_BUD;
    public static DeferredBlock<GEOreLargeBuds> LARGE_ONYX_BUD;
    public static DeferredBlock<GEOreLargeBuds> LARGE_PEARL_BUD;
    public static DeferredBlock<GEOreLargeBuds> LARGE_PERIDOT_BUD;
    public static DeferredBlock<GEOreLargeBuds> LARGE_PYROLITE_BUD;
    public static DeferredBlock<GEOreLargeBuds> LARGE_TANZANITE_BUD;
    public static DeferredBlock<GEOreLargeBuds> LARGE_ZIRCON_BUD;
    public static DeferredBlock<GEOreLargeBuds> LARGE_MOLYBDENUM_BUD;
    public static DeferredBlock<GEOreLargeBuds> LARGE_NEODYMIUM_BUD;
    public static DeferredBlock<GEOreLargeBuds> LARGE_SPINEL_BUD;
    public static DeferredBlock<GEOreLargeBuds> LARGE_PALLADIUM_BUD;
}
