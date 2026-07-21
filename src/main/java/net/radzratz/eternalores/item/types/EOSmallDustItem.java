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
import static net.radzratz.eternalores.util.lang.EOLangKeys.TEMICTETL_SMALL_DUST_DESC;

public class EOSmallDustItem extends EOConfigItem {
    private int burnTime;

    public EOSmallDustItem(Properties properties, BooleanSupplier materialSet, BooleanSupplier enabled) {
        super(properties, materialSet, enabled);
    }

    public EOSmallDustItem(Properties properties, int burnTime, BooleanSupplier materialSet, BooleanSupplier enabled) {
        this(properties, materialSet, enabled);
        this.burnTime = burnTime;
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext context, @NotNull List<Component> tooltipComponents, @NotNull TooltipFlag tooltipFlag) {
        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);

        Item item = stack.getItem();

        if (CFG.EO_TOOLTIPS.temictetlSmallDust.get()) {
            if (item == TEMICTETL_SET.SMALL_DUST.get()) {
                tooltipComponents.add(Component.translatable(TEMICTETL_SMALL_DUST_DESC).withStyle(ChatFormatting.WHITE));
            }
        }
    }

    public int getBurnTime() {
        return this.burnTime;
    }
}
