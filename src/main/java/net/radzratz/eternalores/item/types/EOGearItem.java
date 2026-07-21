package net.radzratz.eternalores.item.types;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.BooleanSupplier;

import static net.radzratz.eternalores.util.EOMaterials.materialSets.TEMICTETL_SET;
import static net.radzratz.eternalores.util.config.EOTooltipConfig.CFG;
import static net.radzratz.eternalores.util.lang.EOLangKeys.TEMICTETL_GEAR_DESC;

public class EOGearItem extends EOConfigItem {
    public EOGearItem(Properties properties, BooleanSupplier materialSet, BooleanSupplier individual) {
        super(properties, materialSet, individual);
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, Item.@NotNull TooltipContext context, @NotNull List<Component> tooltip, @NotNull TooltipFlag flag) {
        super.appendHoverText(stack, context, tooltip, flag);

        Item item = stack.getItem();

        if (CFG.EO_TOOLTIPS.temictetlGear.get()) {
            if (item == TEMICTETL_SET.GEAR.get()) {
                tooltip.add(Component.translatable(TEMICTETL_GEAR_DESC).withStyle(ChatFormatting.WHITE));
            }
        }
    }
}
