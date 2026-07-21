package net.radzratz.eternalores.block.types.enums;

import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import static net.minecraft.tags.BlockTags.*;
import static net.neoforged.neoforge.common.Tags.Blocks.NEEDS_NETHERITE_TOOL;
import static net.neoforged.neoforge.common.Tags.Blocks.NEEDS_WOOD_TOOL;

public enum EOBlockTier {
    T_WOOD(NEEDS_WOOD_TOOL),
    T_STONE(NEEDS_STONE_TOOL),
    T_IRON(NEEDS_IRON_TOOL),
    T_DIAMOND(NEEDS_DIAMOND_TOOL),
    T_NETHERITE(NEEDS_NETHERITE_TOOL);

    private final TagKey<Block> toolTag;

    EOBlockTier(TagKey<Block> toolTag) {
        this.toolTag = toolTag;
    }

    public TagKey<Block> getToolTag() {
        return toolTag;
    }
}
