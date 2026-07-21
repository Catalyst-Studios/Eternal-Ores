package net.radzratz.eternalores.block.types.special;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.radzratz.eternalores.block.types.EOStorageBlock;
import net.radzratz.eternalores.block.types.enums.EOBlockTier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static net.radzratz.eternalores.util.config.EOEventsConfig.CFG;

public class EORedstoneBlock extends EOStorageBlock {
    public EORedstoneBlock(EOBlockTier blockTier, Properties properties) {
        super(blockTier, properties);
    }

    @Override
    protected boolean isSignalSource(@NotNull BlockState state) {
        return CFG.EO_EVENTS.redstoneEmission.get();
    }

    @Override
    protected int getSignal(@NotNull BlockState blockState, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull Direction side) {
        return CFG.EO_EVENTS.redstoneEmission.get()
                ? CFG.EO_EVENTS.redstoneEmissionLevel.get()
                : 0;
    }

    @Override
    public boolean canConnectRedstone(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @Nullable Direction direction) {
        return CFG.EO_EVENTS.canConnectToRedstone.get();
    }
}
