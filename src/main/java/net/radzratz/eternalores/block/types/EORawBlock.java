package net.radzratz.eternalores.block.types;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.LootParams;
import net.radzratz.eternalores.block.types.enums.EOBlockTier;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;

public class EORawBlock extends EOBlock {
    public EORawBlock(EOBlockTier blockTier, Properties properties) {
        super(blockTier, properties);
    }

    @Override
    protected @NotNull List<ItemStack> getDrops(@NotNull BlockState state, LootParams.@NotNull Builder params) {
        return Collections.singletonList(new ItemStack(this));
    }
}
