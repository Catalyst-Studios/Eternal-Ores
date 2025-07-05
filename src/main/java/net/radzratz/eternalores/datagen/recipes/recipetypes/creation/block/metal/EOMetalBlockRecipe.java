package net.radzratz.eternalores.datagen.recipes.recipetypes.creation.block.metal;

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

public class EOMetalBlockRecipe extends RecipeProvider
{
    public EOMetalBlockRecipe(PackOutput output,
                              CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    public static void generateIngotToBlockRecipe(@NotNull RecipeOutput recipeOutput,
                                            String material,
                                            Item ingot,
                                            Item block)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, block, 1)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ingot)
                .unlockedBy("has_" + material + "_ingot", has(ingot))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", "blocks/" + material + "_ingot_to_block"));
    }
}
