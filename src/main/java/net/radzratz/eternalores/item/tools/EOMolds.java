package net.radzratz.eternalores.item.tools;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.BooleanSupplier;

import static net.radzratz.eternalores.util.EOSetRegistries.*;
import static net.radzratz.eternalores.util.config.EOTooltipConfig.CFG;
import static net.radzratz.eternalores.util.lang.EOLangKeys.METAL_GEAR;
import static net.radzratz.eternalores.util.lang.EOLangKeys.METAL_GEAR_EXTRA;

public class EOMolds extends Item {
    private final BooleanSupplier tool;

    public EOMolds(Properties properties, BooleanSupplier mold) {
        super(properties);
        this.tool = mold;
    }

    @Override
    public boolean isEnabled(@NotNull FeatureFlagSet enabledFeatures) {
        return this.tool.getAsBoolean();
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, Item.@NotNull TooltipContext cxt, @NotNull List<Component> tip, @NotNull TooltipFlag flag) {
        super.appendHoverText(stack, cxt, tip, flag);

        Item item = stack.getItem();

        if (CFG.EO_TOOLTIPS.metalGearMold.get()) {
            if (item == MOLD_GEAR.get()) {
                tip.add(Component.translatable(METAL_GEAR).withStyle(ChatFormatting.WHITE));
                tip.add(Component.translatable(METAL_GEAR_EXTRA).withStyle(ChatFormatting.WHITE));
            }
        }
    }
}
