package net.radzratz.eternalores.block.types;

import net.minecraft.world.level.block.Block;
import net.radzratz.eternalores.block.types.enums.EOBlockTier;
import net.radzratz.eternalores.block.types.enums.EOStorageBlockType;

public class EORawBlock extends Block
{
    private final EOStorageBlockType rawType;
    private final EOBlockTier blockTier;

    public EORawBlock(EOStorageBlockType rawType, EOBlockTier blockTier,Properties properties)
    {
        super(properties);
        this.rawType = rawType;
        this.blockTier = blockTier;
    }

    public EOStorageBlockType rawType() { return rawType; }

    public EOBlockTier getTier() { return blockTier; }
}
