package net.radzratz.eternalores.item.tools;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.TagKey;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredItem;
import net.radzratz.eternalores.util.config.EOToolsConfig;
import org.jetbrains.annotations.NotNull;

import java.util.function.BooleanSupplier;

public class EOWireCutter extends Item {
    private final TagKey<Item> repairMat;
    private final BooleanSupplier enabled;

    public EOWireCutter(Properties properties, int maxDurability, TagKey<Item> repairMat, BooleanSupplier enabled) {
        super(properties.stacksTo(1).durability(maxDurability));
        this.repairMat = repairMat;
        this.enabled = enabled;
    }

    @Override
    public boolean isRepairable(@NotNull ItemStack stack) {
        var cfg = EOToolsConfig.CFG.wireCutters;
        Item item = stack.getItem();

        if (item == COPPER_CUTTER.get()) return cfg.copper.getNormalRepair();
        if (item == IRON_CUTTER.get()) return cfg.iron.getNormalRepair();
        if (item == GOLD_CUTTER.get()) return cfg.gold.getNormalRepair();
        if (item == DIAMOND_CUTTER.get()) return cfg.diamond.getNormalRepair();
        if (item == COBALT_CUTTER.get()) return cfg.cobalt.getNormalRepair();

        return true;
    }

    @Override
    public boolean isEnabled(@NotNull FeatureFlagSet enabledFeatures) {
        return this.enabled.getAsBoolean();
    }

    @Override
    public boolean isValidRepairItem(@NotNull ItemStack stack, ItemStack repairCandidate) {
        return repairCandidate.is(repairMat);
    }

    @Override
    public @NotNull SoundEvent getBreakingSound() {
        return SoundEvents.ITEM_BREAK;
    }

    @Override
    public boolean hasCraftingRemainingItem(@NotNull ItemStack stack) {
        return true;
    }

    @Override
    public @NotNull ItemStack getCraftingRemainingItem(ItemStack itemStack) {
        ItemStack copy = itemStack.copy();
        copy.setDamageValue(itemStack.getDamageValue() + 1);

        if (copy.getDamageValue() >= copy.getMaxDamage()) {
            return ItemStack.EMPTY;
        } else {
            return copy;
        }
    }

    public static DeferredItem<EOWireCutter> COPPER_CUTTER;
    public static DeferredItem<EOWireCutter> IRON_CUTTER;
    public static DeferredItem<EOWireCutter> GOLD_CUTTER;
    public static DeferredItem<EOWireCutter> DIAMOND_CUTTER;
    public static DeferredItem<EOWireCutter> COBALT_CUTTER;

}
