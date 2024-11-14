package net.radzratz.eternalitems.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class EternalGemCutter extends Item {
    public EternalGemCutter(Properties properties, int maxDurability) {
        super(properties.stacksTo(1).durability(maxDurability));
    }

    @Override
    public boolean hasCraftingRemainingItem(@NotNull ItemStack stack) {
        return true;
    }

    @Override
    public @NotNull ItemStack getCraftingRemainingItem(ItemStack itemStack) {
        ItemStack copy = itemStack.copy();
        copy.setDamageValue(itemStack.getDamageValue() + 1);

        if(copy.getDamageValue() >= copy.getMaxDamage()) {
            return ItemStack.EMPTY;
        } else {
            return copy;
        }
    }

}
