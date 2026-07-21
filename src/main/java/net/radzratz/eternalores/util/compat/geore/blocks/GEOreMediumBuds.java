package net.radzratz.eternalores.util.compat.geore.blocks;

import net.minecraft.world.level.block.AmethystClusterBlock;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.radzratz.eternalores.block.types.enums.EOBlockTier;

public class GEOreMediumBuds extends AmethystClusterBlock {
    private final EOBlockTier tier;

    public GEOreMediumBuds(EOBlockTier tier, float height, float aabbOffset, Properties properties) {
        super(height, aabbOffset, properties);
        this.tier = tier;
    }

    public EOBlockTier getTier() {
        return tier;
    }

    public static DeferredBlock<GEOreMediumBuds> MEDIUM_CATALYRIUM_BUD;
    public static DeferredBlock<GEOreMediumBuds> MEDIUM_ARDITE_BUD;
    public static DeferredBlock<GEOreMediumBuds> MEDIUM_BERYLLIUM_BUD;
    public static DeferredBlock<GEOreMediumBuds> MEDIUM_COBALT_BUD;
    public static DeferredBlock<GEOreMediumBuds> MEDIUM_GALLIUM_BUD;
    public static DeferredBlock<GEOreMediumBuds> MEDIUM_IRIDIUM_BUD;
    public static DeferredBlock<GEOreMediumBuds> MEDIUM_SCULKITE_BUD;
    public static DeferredBlock<GEOreMediumBuds> MEDIUM_TITANIUM_BUD;
    public static DeferredBlock<GEOreMediumBuds> MEDIUM_ULTIMATITANIUM_BUD;
    public static DeferredBlock<GEOreMediumBuds> MEDIUM_FLUORITE_BUD;
    public static DeferredBlock<GEOreMediumBuds> MEDIUM_APATITE_BUD;
    public static DeferredBlock<GEOreMediumBuds> MEDIUM_CINNABAR_BUD;
    public static DeferredBlock<GEOreMediumBuds> MEDIUM_GARNET_BUD;
    public static DeferredBlock<GEOreMediumBuds> MEDIUM_JADE_BUD;
    public static DeferredBlock<GEOreMediumBuds> MEDIUM_NECROTICARITE_BUD;
    public static DeferredBlock<GEOreMediumBuds> MEDIUM_NITER_BUD;
    public static DeferredBlock<GEOreMediumBuds> MEDIUM_OBSIDIAN_BUD;
    public static DeferredBlock<GEOreMediumBuds> MEDIUM_ONYX_BUD;
    public static DeferredBlock<GEOreMediumBuds> MEDIUM_PEARL_BUD;
    public static DeferredBlock<GEOreMediumBuds> MEDIUM_PERIDOT_BUD;
    public static DeferredBlock<GEOreMediumBuds> MEDIUM_PYROLITE_BUD;
    public static DeferredBlock<GEOreMediumBuds> MEDIUM_TANZANITE_BUD;
    public static DeferredBlock<GEOreMediumBuds> MEDIUM_ZIRCON_BUD;
    public static DeferredBlock<GEOreMediumBuds> MEDIUM_MOLYBDENUM_BUD;
    public static DeferredBlock<GEOreMediumBuds> MEDIUM_NEODYMIUM_BUD;
    public static DeferredBlock<GEOreMediumBuds> MEDIUM_SPINEL_BUD;
    public static DeferredBlock<GEOreMediumBuds> MEDIUM_PALLADIUM_BUD;

}
