package net.radzratz.eternalores.datagen.recipes.recipetypes.creation.item.nugget;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class EONuggetRecipe extends RecipeProvider
{

    public EONuggetRecipe(PackOutput output,
                          CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    public static void generateIngotToNuggetRecipe(@NotNull RecipeOutput recipeOutput,
                                             String material,
                                             Item ingot,
                                             Item nugget)
    {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nugget, 9)
                .requires(ingot)
                .unlockedBy("has_" + material + "_ingot", has(ingot))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", "nuggets/" + material + "_ingot_to_nugget"));
    }
}
