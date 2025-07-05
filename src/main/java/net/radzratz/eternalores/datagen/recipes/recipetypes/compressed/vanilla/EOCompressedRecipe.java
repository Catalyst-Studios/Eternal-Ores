package net.radzratz.eternalores.datagen.recipes.recipetypes.compressed.vanilla;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class EOCompressedRecipe extends RecipeProvider
{
    public EOCompressedRecipe(PackOutput output, CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    public static void generateCompressedBlockRecipe(@NotNull RecipeOutput recipeOutput, String material, Item input, Item output)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output)
                .pattern("EEE")
                .pattern("EEE")
                .pattern("EEE")
                .define('E', input)
                .unlockedBy("has_" + material + "_ingot", has(input))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", "compressed/" + material + "_compressed_block"));
    }
    public static void generateCompressedToMaterialShapeless(@NotNull RecipeOutput recipeOutput, String material, Item input, Item output)
    {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, output, 9)
                .requires(input)
                .unlockedBy("has_" + material + "_compressed_block", has(input))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", "compressed/" + material + "_compressed_block_to_block"));
    }
}
