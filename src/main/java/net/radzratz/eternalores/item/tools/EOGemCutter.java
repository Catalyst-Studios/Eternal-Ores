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

public class EOGemCutter extends Item {
    private final TagKey<Item> repairMat;
    private final BooleanSupplier tool;

    public EOGemCutter(Properties properties, TagKey<Item> repairMat, int maxDurability, BooleanSupplier tool) {
        super(properties.stacksTo(1).durability(maxDurability));
        this.repairMat = repairMat;
        this.tool = tool;
    }

    @Override
    public boolean isRepairable(@NotNull ItemStack stack) {
        var cfg = EOToolsConfig.CFG.gemCutter;
        Item item = stack.getItem();

        if (item == EOGemCutter.IRON_GEM_CUTTER.get()) return cfg.iron.getNormalRepair();
        if (item == EOGemCutter.GOLD_GEM_CUTTER.get()) return cfg.gold.getNormalRepair();
        if (item == EOGemCutter.COPPER_GEM_CUTTER.get()) return cfg.copper.getNormalRepair();
        if (item == EOGemCutter.NETHERITE_GEM_CUTTER.get()) return cfg.netherite.getNormalRepair();

        return true;
    }

    @Override
    public boolean isEnabled(@NotNull FeatureFlagSet enabledFeatures) {
        return this.tool.getAsBoolean();
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

    public static DeferredItem<EOGemCutter> IRON_GEM_CUTTER;
    public static DeferredItem<EOGemCutter> GOLD_GEM_CUTTER;
    public static DeferredItem<EOGemCutter> COPPER_GEM_CUTTER;
    public static DeferredItem<EOGemCutter> NETHERITE_GEM_CUTTER;

}
