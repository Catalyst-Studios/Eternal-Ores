package net.radzratz.eternalores.util.compat.iron_furnaces.furnaces;

import ironfurnaces.blocks.furnaces.BlockIronFurnaceBase;

/**
 * This class extends base furnace block and abstracts its methods so we can implement them into
 * each furnace block type
 */
public abstract class EOIFurnacesFurnaceBlock extends BlockIronFurnaceBase {
    public EOIFurnacesFurnaceBlock(Properties properties) {
        super(properties);
    }
}
