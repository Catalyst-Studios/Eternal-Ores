package net.radzratz.eternalores.block.types;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.LootParams;
import net.radzratz.eternalores.block.types.enums.EOBlockTier;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;

public class EOCoalBlock extends EOBlock {
    private int burnTime = 0;

    public EOCoalBlock(EOBlockTier blockTier, int burnTime, Properties properties) {
        super(blockTier, properties);
        this.burnTime = burnTime;
    }

    public int getBurnTime() {
        return this.burnTime;
    }

    @Override
    protected @NotNull List<ItemStack> getDrops(@NotNull BlockState state, LootParams.@NotNull Builder params) {
        return Collections.singletonList(new ItemStack(this));
    }
}
