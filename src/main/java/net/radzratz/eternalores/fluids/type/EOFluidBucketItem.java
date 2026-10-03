package net.radzratz.eternalores.fluids.type;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.material.Fluid;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class EOFluidBucketItem extends BucketItem {
    private final Fluid fluid;

    public EOFluidBucketItem(Fluid fluid, Item.Properties props) {
        super(fluid, props);
        this.fluid = fluid;
    }

    public Fluid getFluid() {
        return fluid;
    }

    @Override
    public boolean isEnabled(@NotNull FeatureFlagSet enabledFeatures) {
        if (fluid.getFluidType() instanceof EOFluidType type && !type.isEnabled()) return false;
        return super.isEnabled(enabledFeatures);
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext context, @NotNull List<Component> tooltip, @NotNull TooltipFlag tooltipFlag) {
        super.appendHoverText(stack, context, tooltip, tooltipFlag);

        if (fluid.getFluidType() instanceof EOFluidType type) {
            if (type.isHazardous()) {
                tooltip.add(Component.literal("Hazardous: Handle with care").withStyle(ChatFormatting.RED));
            }
        }
    }
}
