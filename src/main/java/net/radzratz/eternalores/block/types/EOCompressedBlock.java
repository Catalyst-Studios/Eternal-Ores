package net.radzratz.eternalores.block.types;

import net.minecraft.ChatFormatting;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.LootParams;
import net.radzratz.eternalores.block.types.enums.EOBlockTier;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static net.radzratz.eternalores.util.config.EOTooltipConfig.CFG;

public class EOCompressedBlock extends EOBlock {
    public EOCompressedBlock(EOBlockTier blockTier, Properties properties) {
        super(blockTier, properties);
    }

    @Override
    protected @NotNull List<ItemStack> getDrops(@NotNull BlockState state, LootParams.@NotNull Builder params) {
        return Collections.singletonList(new ItemStack(this));
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, Item.@NotNull TooltipContext ctx, @NotNull List<Component> tooltip, @NotNull TooltipFlag flag) {
        super.appendHoverText(stack, ctx, tooltip, flag);

        if (CFG.EO_TOOLTIPS.compressionAmount.get()) {

            ResourceLocation id = BuiltInRegistries.ITEM.getKey(stack.getItem());
            String path = id.getPath();

            // Only applies to compressed
            if (!path.startsWith("compressed_")) return;

            // Extracts the compression level (e.g. "_3x")
            Matcher matcher = Pattern.compile("_(\\d+)x$").matcher(path);
            if (!matcher.find()) return;

            int level = Integer.parseInt(matcher.group(1));

            // 9^level
            long totalBlocks = (long) Math.pow(9, level);

            tooltip.add(Component.literal(level + "x Total Blocks: " + totalBlocks).withStyle(ChatFormatting.GRAY));
        }
    }
}
