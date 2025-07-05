package net.radzratz.eternalores.util.compat.oritech.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static net.radzratz.eternalores.util.compat.oritech.recipe_types.pulverizer.EOPulverizerRecipes.registerAllPulverizerRecipes;

public class EOritechRecipeProvider extends RecipeProvider
{
    public EOritechRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    public void buildRecipes(@NotNull RecipeOutput output)
    {
        registerAllPulverizerRecipes(output);
    }
}
