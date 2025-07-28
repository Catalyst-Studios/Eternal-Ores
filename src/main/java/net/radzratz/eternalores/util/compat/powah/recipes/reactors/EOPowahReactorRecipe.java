package net.radzratz.eternalores.util.compat.powah.recipes.reactors;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.registries.DeferredItem;
import net.radzratz.eternalores.datagen.recipes.EOAdvancementYeeter;
import owmii.powah.Powah;
import owmii.powah.block.Blcks;
import owmii.powah.block.Tier;
import owmii.powah.item.CapacitorItem;
import owmii.powah.item.Itms;

import java.util.concurrent.CompletableFuture;

import static net.radzratz.eternalores.item.EOItemRegistry.URANINITE_INGOT;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.tags.item.ingots.EOIngotTags.Items.TAG_URANINITE_INGOT;

public class EOPowahReactorRecipe extends RecipeProvider
{
    public EOPowahReactorRecipe(PackOutput output, CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    public static void generateReactorUpgradeRecipe(RecipeOutput output, Tier currentTier, Tier previousTier, DeferredItem<CapacitorItem> capacitor, ResourceLocation recipeId)
    {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        if (eternaloresMod)
        {
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blcks.REACTOR.get(currentTier), 4)
                    .pattern("RCR")
                    .pattern("C#C")
                    .pattern("RCR")
                    .define('#', TAG_URANINITE_INGOT)
                    .define('C', capacitor)
                    .define('R', Blcks.REACTOR.get(previousTier))
                    .unlockedBy(getHasName(URANINITE_INGOT), has(TAG_URANINITE_INGOT))
                    .unlockedBy(getHasName(capacitor), has(capacitor))
                    .unlockedBy(getHasName(Blcks.REACTOR.get(previousTier)), has(Blcks.REACTOR.get(previousTier)))
                    .save(yeet.withConditions(POW), recipeId);
        }
    }

    public static void generateStarterReactorRecipe(RecipeOutput output)
    {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        if (eternaloresMod)
        {
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Blcks.REACTOR.get(Tier.STARTER), 4)
                    .pattern("UCU")
                    .pattern("CDC")
                    .pattern("UCU")
                    .define('U', TAG_URANINITE_INGOT)
                    .define('C', Itms.CAPACITOR_BASIC_TINY)
                    .define('D', Itms.DIELECTRIC_CASING)
                    .unlockedBy(getHasName(URANINITE_INGOT), has(TAG_URANINITE_INGOT))
                    .unlockedBy(getHasName(Itms.CAPACITOR_BASIC_TINY), has(Itms.CAPACITOR_BASIC_TINY))
                    .unlockedBy(getHasName(Itms.DIELECTRIC_CASING), has(Itms.DIELECTRIC_CASING))
                    .save(yeet.withConditions(POW), Powah.id("crafting/reactor_starter"));
        }
    }
}
