package net.radzratz.eternalores.block.types;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.radzratz.eternalores.block.types.enums.EOBlockTier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static net.radzratz.eternalores.util.EOMaterials.materialSets.TEMICTETL_SET;
import static net.radzratz.eternalores.util.config.EOTooltipConfig.CFG;
import static net.radzratz.eternalores.util.lang.EOLangKeys.TEMICTETL_DUST_BLOCK_DESC;

public class EODustBlock extends EOBlock {
    private int burnTime;

    public EODustBlock(EOBlockTier blockTier, Properties props) {
        super(blockTier, props);
    }

    public EODustBlock(EOBlockTier blockTier, int burnTime, Properties props) {
        this(blockTier, props);
        this.burnTime = burnTime;
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, Item.@NotNull TooltipContext context, @NotNull List<Component> tooltip, @NotNull TooltipFlag tooltipFlag) {
        super.appendHoverText(stack, context, tooltip, tooltipFlag);

        Block block = ((BlockItem) stack.getItem()).getBlock();

        if (CFG.EO_TOOLTIPS.temictetlDustBlock.get()) {
            if (block == TEMICTETL_SET.DUST_BLOCK.get()) {
                tooltip.add(Component.translatable(TEMICTETL_DUST_BLOCK_DESC).withStyle(ChatFormatting.WHITE));
            }
        }
    }

    @Override
    public @NotNull SoundType getSoundType(@NotNull BlockState state, @NotNull LevelReader level, @NotNull BlockPos pos, @Nullable Entity entity) {
        return SoundType.SAND;
    }

    public int getBurnTime() {
        return this.burnTime;
    }
}
