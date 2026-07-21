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
import static net.radzratz.eternalores.util.lang.EOLangKeys.TEMICTETL_DUST_DESC;

public class EODustItem extends EOConfigItem {
    private int burnTime;

    public EODustItem(Properties properties, BooleanSupplier materialSet, BooleanSupplier individual) {
        super(properties, materialSet, individual);
    }

    public EODustItem(Properties properties, int burnTime, BooleanSupplier materialSet, BooleanSupplier enabled) {
        this(properties, materialSet, enabled);
        this.burnTime = burnTime;
    }

    public int getBurnTime() {
        return this.burnTime;
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, Item.@NotNull TooltipContext context, @NotNull List<Component> tooltip, @NotNull TooltipFlag flag) {
        super.appendHoverText(stack, context, tooltip, flag);

        Item item = stack.getItem();

        if (CFG.EO_TOOLTIPS.temictetlDust.get()) {
            if (item == TEMICTETL_SET.DUST.get()) {
                tooltip.add(Component.translatable(TEMICTETL_DUST_DESC).withStyle(ChatFormatting.WHITE));
            }
        }
    }
}
