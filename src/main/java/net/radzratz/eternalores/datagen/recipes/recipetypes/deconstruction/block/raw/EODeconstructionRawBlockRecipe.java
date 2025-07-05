package net.radzratz.eternalores.datagen.recipes.recipetypes.deconstruction.block.raw;

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

public class EODeconstructionRawBlockRecipe extends RecipeProvider
{
    public EODeconstructionRawBlockRecipe(PackOutput output,
                                          CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    public static void generateBlockToRawMaterialRecipe(@NotNull RecipeOutput recipeOutput,
                                                  String material,
                                                  Item block,
                                                  Item raw)
    {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, raw, 9)
                .requires(block)
                .unlockedBy("has_" + material + "_block", has(block))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", "block_deconstruction/" + material + "_raw_block_to_ore"));
    }
}
