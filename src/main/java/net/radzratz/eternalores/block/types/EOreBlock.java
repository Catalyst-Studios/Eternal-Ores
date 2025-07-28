package net.radzratz.eternalores.block.types;

import net.minecraft.world.level.block.Block;
import net.radzratz.eternalores.block.types.enums.EOBlockTier;
import net.radzratz.eternalores.block.types.enums.EOreLayerType;

public class EOreBlock extends Block
{
    private final EOreLayerType layerType;
    private final EOBlockTier blockTier;

    public EOreBlock(EOreLayerType layerType, EOBlockTier blockTier,Properties properties)
    {
        super(properties);
        this.layerType = layerType;
        this.blockTier = blockTier;
    }

    public EOreLayerType getLayerType()
    {
        return layerType;
    }
    public EOBlockTier getTier()
    {
        return blockTier;
    }
}
