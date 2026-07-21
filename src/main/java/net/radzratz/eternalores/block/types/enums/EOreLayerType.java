package net.radzratz.eternalores.block.types.enums;

import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import static net.neoforged.neoforge.common.Tags.Blocks.*;
import static net.radzratz.eternalores.util.tags.block.EOBlockTags.OreBlocks.*;

public enum EOreLayerType {
    ORE_SAND(BLOCK_ORES_IN_GROUND_SAND),
    ORE_STONE(ORES_IN_GROUND_STONE),
    ORE_SLATE(ORES_IN_GROUND_DEEPSLATE),
    ORE_SCULK(BLOCK_ORES_IN_GROUND_SCULK),
    ORE_NETHER(ORES_IN_GROUND_NETHERRACK),
    ORE_END(BLOCK_ORES_IN_GROUND_END);

    private final TagKey<Block> oreTag;

    EOreLayerType(TagKey<Block> oreTag) {
        this.oreTag = oreTag;
    }

    public TagKey<Block> getOreTag() {
        return oreTag;
    }
}

