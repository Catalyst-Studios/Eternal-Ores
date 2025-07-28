package net.radzratz.eternalores.block.types;

import net.minecraft.world.level.block.Block;
import net.radzratz.eternalores.block.types.enums.EOBlockTier;
import net.radzratz.eternalores.block.types.enums.EOStorageBlockType;

public class EOMiscBlock extends Block
{
    private final EOStorageBlockType miscBlock;
    private final EOBlockTier blockTier;

    public EOMiscBlock(EOStorageBlockType miscBlock, EOBlockTier blockTier,Properties properties)
    {
        super(properties);
        this.miscBlock = miscBlock;
        this.blockTier = blockTier;
    }

    public EOStorageBlockType getMiscBlock()
    {
        return miscBlock;
    }

    public EOBlockTier getTier() { return blockTier; }
}
