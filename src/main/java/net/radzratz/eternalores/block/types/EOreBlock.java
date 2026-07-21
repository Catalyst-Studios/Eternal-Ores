package net.radzratz.eternalores.block.types;

import net.neoforged.neoforge.registries.DeferredItem;
import net.radzratz.eternalores.block.types.enums.EOBlockTier;
import net.radzratz.eternalores.block.types.enums.EOreLayerType;

public class EOreBlock extends EOBlock {
    private final EOreLayerType layerType;
    private final DeferredItem<?> drops;
    private final int minDrop;
    private final int maxDrop;

    public EOreBlock(EOreLayerType type, EOBlockTier tier, DeferredItem<?> drops, int minDrop, int maxDrop, Properties props) {
        super(tier, props);
        this.layerType = type;
        this.drops = drops;
        this.minDrop = minDrop;
        this.maxDrop = maxDrop;
    }

    public EOreLayerType getLayerType() {
        return layerType;
    }

    public DeferredItem<?> getDrops() {
        return drops;
    }

    public int getMinDrop() {
        return minDrop;
    }

    public int getMaxDrop() {
        return maxDrop;
    }
}
