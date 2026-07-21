package net.radzratz.eternalores.item.types;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.BooleanSupplier;

import static net.radzratz.eternalores.util.EOMaterials.materialSets.*;
import static net.radzratz.eternalores.util.config.EOTooltipConfig.CFG;
import static net.radzratz.eternalores.util.lang.EOLangKeys.*;

public class EORodItem extends EOConfigItem {
    public EORodItem(Properties properties, BooleanSupplier materialSet, BooleanSupplier individual) {
        super(properties, materialSet, individual);
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, Item.@NotNull TooltipContext context, @NotNull List<Component> tooltip, @NotNull TooltipFlag flag) {
        super.appendHoverText(stack, context, tooltip, flag);

        Item item = stack.getItem();

        if (CFG.EO_TOOLTIPS.temictetlRod.get()) {
            if (item == TEMICTETL_SET.ROD.get()) {
                tooltip.add(Component.translatable(TEMICTETL_ROD_DESC).withStyle(ChatFormatting.WHITE));
            }
        }
    }
}
