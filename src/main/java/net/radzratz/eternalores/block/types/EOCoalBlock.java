package net.radzratz.eternalores.block.types;

import net.radzratz.eternalores.block.types.enums.EOBlockTier;

public class EOCoalBlock extends EOBlock {
    private int burnTime = 0;

    public EOCoalBlock(EOBlockTier blockTier, int burnTime, Properties properties) {
        super(blockTier, properties);
        this.burnTime = burnTime;
    }

    public int getBurnTime() {
        return this.burnTime;
    }
}
