package net.radzratz.eternalores.block.types;

import net.minecraft.world.level.block.Block;
import net.radzratz.eternalores.block.types.enums.EOBlockTier;
import net.radzratz.eternalores.block.types.enums.EOStorageBlockType;

public class EOCompressedBlock extends Block
{
    private final EOStorageBlockType compressedType;
    private final EOBlockTier blockTier;

    public EOCompressedBlock(EOStorageBlockType compressedType, EOBlockTier blockTier,Properties properties)
    {
        super(properties);
        this.compressedType = compressedType;
        this.blockTier = blockTier;
    }

    public EOStorageBlockType compressedType()
    {
        return compressedType;
    }

    public EOBlockTier getTier() { return blockTier; }
}
