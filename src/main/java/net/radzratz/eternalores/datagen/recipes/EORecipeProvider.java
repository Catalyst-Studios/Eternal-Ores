package net.radzratz.eternalores.datagen.recipes;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.radzratz.eternalores.datagen.recipes.recipes.EOFurnaceRecipes;
import net.radzratz.eternalores.datagen.recipes.recipes.EOItemRecipes;
import net.radzratz.eternalores.util.EOUtils;
import net.radzratz.eternalores.datagen.recipes.recipes.EOBlockRecipes;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class EORecipeProvider extends RecipeProvider
{
    public EORecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput)
    {
        EOBlockRecipes.generate(recipeOutput, EOUtils.allItemEntries(), BuiltInRegistries.BLOCK);
        EOItemRecipes.generate(recipeOutput, EOUtils.allItemEntries(), BuiltInRegistries.ITEM);
        EOFurnaceRecipes.generate(recipeOutput, EOUtils.allItemEntries(), BuiltInRegistries.ITEM);
    }
}
