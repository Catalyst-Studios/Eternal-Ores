package net.radzratz.eternalores.block;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.function.BooleanSupplier;

public class EOConfigBlockItem extends BlockItem {
    private final BooleanSupplier materialSet;
    private final BooleanSupplier enabled;

    public EOConfigBlockItem(Block block, Properties properties, BooleanSupplier materialSet, BooleanSupplier enabled) {
        super(block, properties);
        this.materialSet = materialSet;
        this.enabled = enabled;
    }

    @Override
    public boolean isEnabled(@NotNull FeatureFlagSet flags) {
        return materialSet.getAsBoolean() && enabled.getAsBoolean();
    }

    @Override
    public @NotNull InteractionResult place(BlockPlaceContext ctx) {
        if (!isEnabled(ctx.getLevel().enabledFeatures())) return InteractionResult.FAIL;
        return super.place(ctx);
    }

    @Override
    public @NotNull InteractionResult useOn(UseOnContext ctx) {
        if (!isEnabled(ctx.getLevel().enabledFeatures())) return InteractionResult.FAIL;
        return super.useOn(ctx);
    }
}
