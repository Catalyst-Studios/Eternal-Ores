package net.radzratz.eternalores.datagen.recipes.recipetypes.deconstruction.block.gem;

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

public class GemBlockDecoEntry extends RecipeProvider
{
    public GemBlockDecoEntry(PackOutput output,
                             CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    public static void generateBlockToGemMaterialRecipe(@NotNull RecipeOutput recipeOutput,
                                                        String material,
                                                        Item block,
                                                        Item gem)
    {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, gem, 9)
                .requires(block)
                .unlockedBy("has_" + material + "_block", has(block))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", "block_deconstruction/" + material + "_block_to_gem"));
    }
}
