package net.radzratz.eternalores.datagen.recipes.recipetypes.creation.item.ingot;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class IngotRecipeEntry extends RecipeProvider
{

    public IngotRecipeEntry(PackOutput output,
                            CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    public static void generateNuggetToIngotRecipe(@NotNull RecipeOutput recipeOutput,
                                             String material,
                                             Item nugget,
                                             Item ingot)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingot, 1)
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', nugget)
                .unlockedBy("has_" + material + "_nugget", has(nugget))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", "ingots/" + material + "_nugget_to_ingot"));
    }
}
