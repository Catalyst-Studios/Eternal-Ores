package net.radzratz.eternalores.fluids.type;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FlowingFluid;
import org.jetbrains.annotations.NotNull;

public class EOHazardousLiquidBlocks extends LiquidBlock {
    public EOHazardousLiquidBlocks(FlowingFluid fluid, Properties properties) {
        super(fluid, properties);
    }

    @Override
    protected void entityInside(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull Entity entity) {
        if (!(this.fluid.getFluidType() instanceof EOFluidType type)) return;

        switch (type.type()) {
            case MOLTEN -> entity.setRemainingFireTicks(100);
            case GAS -> {
                if (type.isHazardous()) entity.hurt(level.damageSources().drown(), 1f);
            }
            case FLUID -> {
                if (type.isHazardous()) entity.hurt(level.damageSources().wither(), 1f);
            }
            case CHEMICAL -> {
                if (type.isHazardous()) entity.hurt(level.damageSources().cactus(), 1f);
            }
        }
    }
}
