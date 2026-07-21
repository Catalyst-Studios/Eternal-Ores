package net.radzratz.eternalores.block.types;

import net.minecraft.world.level.block.Block;
import net.radzratz.eternalores.block.types.enums.EOBlockTier;

public class EOBlock extends Block {
    private final EOBlockTier blockTier;

    public EOBlock(EOBlockTier blockTier, Properties properties) {
        super(properties);
        this.blockTier = blockTier;
    }

    public EOBlockTier getTier() {
        return blockTier;
    }
}
