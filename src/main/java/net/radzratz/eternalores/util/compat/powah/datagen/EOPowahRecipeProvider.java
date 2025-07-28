package net.radzratz.eternalores.util.compat.powah.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import org.jetbrains.annotations.NotNull;
import owmii.powah.Powah;
import owmii.powah.block.Tier;
import owmii.powah.item.Itms;

import java.util.concurrent.CompletableFuture;

import static net.radzratz.eternalores.util.EOUtils.POW;
import static net.radzratz.eternalores.util.compat.powah.recipes.orb.EOPowahOrbRecipe.energizingOrbRecipes;
import static net.radzratz.eternalores.util.compat.powah.recipes.reactors.EOPowahReactorRecipe.generateReactorUpgradeRecipe;
import static net.radzratz.eternalores.util.compat.powah.recipes.reactors.EOPowahReactorRecipe.generateStarterReactorRecipe;

public class EOPowahRecipeProvider extends RecipeProvider
{
    public EOPowahRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }


    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput)
    {
        generateStarterReactorRecipe(recipeOutput);

        generateReactorUpgradeRecipe(recipeOutput, Tier.BASIC, Tier.STARTER, Itms.CAPACITOR_BASIC_LARGE, Powah.id("crafting/reactor_basic"));
        generateReactorUpgradeRecipe(recipeOutput, Tier.HARDENED, Tier.BASIC, Itms.CAPACITOR_HARDENED, Powah.id("crafting/reactor_hardened"));
        generateReactorUpgradeRecipe(recipeOutput, Tier.BLAZING, Tier.HARDENED, Itms.CAPACITOR_BLAZING, Powah.id("crafting/reactor_blazing"));
        generateReactorUpgradeRecipe(recipeOutput, Tier.NIOTIC, Tier.BLAZING, Itms.CAPACITOR_NIOTIC, Powah.id("crafting/reactor_niotic"));
        generateReactorUpgradeRecipe(recipeOutput, Tier.SPIRITED, Tier.NIOTIC, Itms.CAPACITOR_SPIRITED, Powah.id("crafting/reactor_spirited"));
        generateReactorUpgradeRecipe(recipeOutput, Tier.NITRO, Tier.SPIRITED, Itms.CAPACITOR_NITRO, Powah.id("crafting/reactor_nitro"));

        energizingOrbRecipes(recipeOutput.withConditions(POW));
    }
}
