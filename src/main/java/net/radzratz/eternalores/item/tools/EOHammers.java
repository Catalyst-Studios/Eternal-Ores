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

public class EOHammers extends Item {
    private final TagKey<Item> repairMat;
    private final BooleanSupplier enabled;

    public EOHammers(Properties properties, int maxDurability, TagKey<Item> repairMat, BooleanSupplier enabled) {
        super(properties.stacksTo(1).durability(maxDurability));
        this.repairMat = repairMat;
        this.enabled = enabled;
    }

    @Override
    public boolean isRepairable(@NotNull ItemStack stack) {
        var cfg = EOToolsConfig.CFG.hammers;
        Item item = stack.getItem();

        if (item == COBALT_HAMMER.get()) return cfg.cobalt.getNormalRepair();
        if (item == COPPER_HAMMER.get()) return cfg.copper.getNormalRepair();
        if (item == STONE_HAMMER.get()) return cfg.stone.getNormalRepair();
        if (item == DIAMOND_HAMMER.get()) return cfg.diamond.getNormalRepair();
        if (item == IRON_HAMMER.get()) return cfg.iron.getNormalRepair();

        return true;
    }

    @Override
    public boolean isEnabled(@NotNull FeatureFlagSet enabledFeatures) {
        return this.enabled.getAsBoolean();
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
    public boolean isValidRepairItem(@NotNull ItemStack stack, ItemStack repairCandidate) {
        return repairCandidate.is(repairMat);
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

    public static DeferredItem<EOHammers> COBALT_HAMMER;
    public static DeferredItem<EOHammers> COPPER_HAMMER;
    public static DeferredItem<EOHammers> STONE_HAMMER;
    public static DeferredItem<EOHammers> DIAMOND_HAMMER;
    public static DeferredItem<EOHammers> IRON_HAMMER;
}
