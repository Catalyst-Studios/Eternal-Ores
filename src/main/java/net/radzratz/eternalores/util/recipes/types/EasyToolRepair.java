package net.radzratz.eternalores.util.recipes.types;

import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CraftingBookCategory;
import net.minecraft.world.item.crafting.CraftingInput;
import net.minecraft.world.item.crafting.CustomRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.Level;
import net.radzratz.eternalores.item.tools.EOGemCutter;
import net.radzratz.eternalores.item.tools.EOHammers;
import net.radzratz.eternalores.item.tools.EOWireCutter;
import net.radzratz.eternalores.util.recipes.EORecipeRegistry;
import net.radzratz.eternalores.util.config.EOToolsConfig;
import org.jetbrains.annotations.NotNull;

public class EasyToolRepair extends CustomRecipe {
    public EasyToolRepair(CraftingBookCategory category) {
        super(category);
    }

    @Override
    public boolean matches(CraftingInput inv, @NotNull Level level) {
        ItemStack tool = ItemStack.EMPTY;
        int materials = 0;

        for (int i = 0; i < inv.size(); i++) {
            ItemStack stack = inv.getItem(i);
            if (!stack.isEmpty()) {
                if (stack.getItem() instanceof EOHammers || stack.getItem() instanceof EOGemCutter || stack.getItem() instanceof EOWireCutter) {
                    if (!tool.isEmpty()) return false;
                    tool = stack;
                } else {
                    materials++;
                }
            }
        }

        if (tool.isEmpty() || materials == 0) return false;

        // Respects the config easyRepair toggle
        if (!isRepairEnabledForTool(tool)) return false;

        for (int i = 0; i < inv.size(); i++) {
            ItemStack stack = inv.getItem(i);
            if (!stack.isEmpty() && !(stack.getItem() instanceof EOHammers || stack.getItem() instanceof EOGemCutter || stack.getItem() instanceof EOWireCutter)) {
                if (!tool.getItem().isValidRepairItem(tool, stack)) return false;
            }
        }

        return true;
    }

    private boolean isRepairEnabledForTool(ItemStack stack) {
        var cfg = EOToolsConfig.CFG;
        Item item = stack.getItem();

        if (item == EOHammers.COBALT_HAMMER.get()) return cfg.hammers.cobalt.getEasyRepair();
        if (item == EOHammers.COPPER_HAMMER.get()) return cfg.hammers.copper.getEasyRepair();
        if (item == EOHammers.STONE_HAMMER.get()) return cfg.hammers.stone.getEasyRepair();
        if (item == EOHammers.DIAMOND_HAMMER.get()) return cfg.hammers.diamond.getEasyRepair();
        if (item == EOHammers.IRON_HAMMER.get()) return cfg.hammers.iron.getEasyRepair();

        if (item == EOGemCutter.IRON_GEM_CUTTER.get()) return cfg.gemCutter.iron.getEasyRepair();
        if (item == EOGemCutter.GOLD_GEM_CUTTER.get()) return cfg.gemCutter.gold.getEasyRepair();
        if (item == EOGemCutter.COPPER_GEM_CUTTER.get()) return cfg.gemCutter.copper.getEasyRepair();
        if (item == EOGemCutter.NETHERITE_GEM_CUTTER.get()) return cfg.gemCutter.netherite.getEasyRepair();

        if (item == EOWireCutter.IRON_CUTTER.get()) return cfg.wireCutters.iron.getEasyRepair();
        if (item == EOWireCutter.GOLD_CUTTER.get()) return cfg.wireCutters.gold.getEasyRepair();
        if (item == EOWireCutter.COPPER_CUTTER.get()) return cfg.wireCutters.copper.getEasyRepair();
        if (item == EOWireCutter.DIAMOND_CUTTER.get()) return cfg.wireCutters.diamond.getEasyRepair();
        if (item == EOWireCutter.COBALT_CUTTER.get()) return cfg.wireCutters.cobalt.getEasyRepair();

        return true;
    }

    @Override
    public @NotNull ItemStack assemble(CraftingInput inv, HolderLookup.@NotNull Provider provider) {
        ItemStack tools = ItemStack.EMPTY;
        int materials = 0;

        for (int i = 0; i < inv.size(); i++) {
            ItemStack stack = inv.getItem(i);
            if (!stack.isEmpty()) {
                if (stack.getItem() instanceof EOHammers || stack.getItem() instanceof EOGemCutter) {
                    tools = stack;
                } else {
                    materials += stack.getCount();
                }
            }
        }

        if (tools.isEmpty()) return ItemStack.EMPTY;

        // Durability per nugget from config - default 30
        int durPerNugget = getRepairAmountForTool(tools);
        int totalRepair = durPerNugget * materials;
        int newDamage = Math.max(0, tools.getDamageValue() - totalRepair);

        ItemStack result = tools.copy();
        result.setDamageValue(newDamage);
        return result;
    }

    private int getRepairAmountForTool(ItemStack stack) {
        var config = EOToolsConfig.CFG;
        Item item = stack.getItem();
        if (item == EOHammers.COBALT_HAMMER.get()) return config.hammers.cobalt.getDurabilityPerMaterial();
        if (item == EOHammers.COPPER_HAMMER.get()) return config.hammers.copper.getDurabilityPerMaterial();
        if (item == EOHammers.STONE_HAMMER.get()) return config.hammers.stone.getDurabilityPerMaterial();
        if (item == EOHammers.DIAMOND_HAMMER.get()) return config.hammers.diamond.getDurabilityPerMaterial();
        if (item == EOHammers.IRON_HAMMER.get()) return config.hammers.iron.getDurabilityPerMaterial();

        if (item == EOGemCutter.IRON_GEM_CUTTER.get()) return config.gemCutter.iron.getDurabilityPerMaterial();
        if (item == EOGemCutter.GOLD_GEM_CUTTER.get()) return config.gemCutter.gold.getDurabilityPerMaterial();
        if (item == EOGemCutter.COPPER_GEM_CUTTER.get()) return config.gemCutter.copper.getDurabilityPerMaterial();
        if (item == EOGemCutter.NETHERITE_GEM_CUTTER.get()) return config.gemCutter.netherite.getDurabilityPerMaterial();

        if (item == EOWireCutter.IRON_CUTTER.get()) return config.wireCutters.iron.getDurabilityPerMaterial();
        if (item == EOWireCutter.GOLD_CUTTER.get()) return config.wireCutters.gold.getDurabilityPerMaterial();
        if (item == EOWireCutter.COPPER_CUTTER.get()) return config.wireCutters.copper.getDurabilityPerMaterial();
        if (item == EOWireCutter.DIAMOND_CUTTER.get()) return config.wireCutters.diamond.getDurabilityPerMaterial();
        if (item == EOWireCutter.COBALT_CUTTER.get()) return config.wireCutters.cobalt.getDurabilityPerMaterial();

        return 30; // fallback
    }

    @Override
    public boolean canCraftInDimensions(int width, int height) {
        return width * height >= 2;
    }

    @Override
    public @NotNull RecipeSerializer<?> getSerializer() {
        return EORecipeRegistry.EASY_TOOL_REPAIR.get();
    }
}
