package net.radzratz.eternalores.block.types;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.block.Block;
import net.radzratz.eternalores.block.types.enums.EOBlockTier;
import org.jetbrains.annotations.NotNull;

import java.util.List;

import static net.radzratz.eternalores.util.EOMaterials.materialSets.*;
import static net.radzratz.eternalores.util.config.EOTooltipConfig.CFG;
import static net.radzratz.eternalores.util.lang.EOLangKeys.*;

public class EOStorageBlock extends EOBlock {
    public EOStorageBlock(EOBlockTier blockTier, Properties properties) {
        super(blockTier, properties);
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, Item.@NotNull TooltipContext context, @NotNull List<Component> tooltip, @NotNull TooltipFlag flag) {
        super.appendHoverText(stack, context, tooltip, flag);

        Block block = ((BlockItem) stack.getItem()).getBlock();

        if (CFG.EO_TOOLTIPS.nickelback.get()) {
            if (block == NICKEL_SET.BLOCK.get()) {
                tooltip.add(Component.translatable(NICKELBACK).withStyle(ChatFormatting.WHITE));
            }
        }

        if (CFG.EO_TOOLTIPS.temictetlBlock.get()) {
            if (block == TEMICTETL_SET.BLOCK.get()) {
                tooltip.add(Component.translatable(TEMICTETL_BLOCK_DESC).withStyle(ChatFormatting.WHITE));
            }
        }

        if (CFG.EO_TOOLTIPS.exoticButter.get()) {
            if (block == EXOTIC_MATTER_SET.BLOCK.get()) {
                tooltip.add(Component.translatable(EXOTIC_BUTTER).withStyle(ChatFormatting.STRIKETHROUGH, ChatFormatting.WHITE));
            }
        }
    }
}
