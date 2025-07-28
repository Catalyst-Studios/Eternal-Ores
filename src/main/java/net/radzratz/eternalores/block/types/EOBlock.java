package net.radzratz.eternalores.block.types;

import net.minecraft.world.level.block.Block;
import net.radzratz.eternalores.block.types.enums.EOBlockTier;
import net.radzratz.eternalores.block.types.enums.EOStorageBlockType;

public class EOBlock extends Block
{
    private final EOStorageBlockType blockType;
    private final EOBlockTier blockTier;

    public EOBlock(EOStorageBlockType blockType, EOBlockTier blockTier,Properties properties)
    {
        super(properties);
        this.blockType = blockType;
        this.blockTier = blockTier;
    }

    public EOStorageBlockType getBlockType() { return blockType; }

    public EOBlockTier getTier() { return blockTier; }
}
