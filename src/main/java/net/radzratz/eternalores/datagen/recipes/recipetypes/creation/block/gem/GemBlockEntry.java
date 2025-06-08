package net.radzratz.eternalores.datagen.recipes.recipetypes.creation.block.gem;

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

public class GemBlockEntry extends RecipeProvider
{
    public GemBlockEntry(PackOutput output,
                         CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    public static void generateGemToBlockRecipe(@NotNull RecipeOutput recipeOutput,
                                          String material,
                                          Item gem,
                                          Item block)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, block, 1)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', gem)
                .unlockedBy("has_" + material + "_ingot", has(gem))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", "blocks/" + material + "_gem_to_block"));
    }
}
