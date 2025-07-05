package net.radzratz.eternalores.item.tools;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class EOHammers extends Item
{
    public EOHammers(Properties properties, int maxDurability)
    {
        super(properties.stacksTo(1).durability(maxDurability));
    }

    @Override
    public boolean isRepairable(@NotNull ItemStack stack)
    {
        return false;
    }

    @Override
    public @NotNull SoundEvent getBreakingSound()
    {
        return SoundEvents.ITEM_BREAK;
    }

    @Override
    public boolean hasCraftingRemainingItem(@NotNull ItemStack stack)
    {
        return true;
    }

    @Override
    public @NotNull ItemStack getCraftingRemainingItem(ItemStack itemStack)
    {
        ItemStack copy = itemStack.copy();
        copy.setDamageValue(itemStack.getDamageValue() + 1);

        if(copy.getDamageValue() >= copy.getMaxDamage())
        {
            return ItemStack.EMPTY;
        }
        else
        {
            return copy;
        }
    }

}
