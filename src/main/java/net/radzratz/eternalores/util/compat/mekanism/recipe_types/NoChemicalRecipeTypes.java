package net.radzratz.eternalores.util.compat.mekanism.recipe_types;

import mekanism.api.datagen.recipe.builder.ItemStackToItemStackRecipeBuilder;
import mekanism.api.recipes.ingredients.ItemStackIngredient;
import mekanism.api.recipes.ingredients.creator.IngredientCreatorAccess;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.common.conditions.ModLoadedCondition;
import net.radzratz.eternalores.util.compat.mekanism.recipe_types.interfaces.MekanismItemRecipeType;

public class NoChemicalRecipeTypes
{
    /// No need to mention it
    ///
    /// My adhd won over yet again causing the creation of this
    ///
    /// Simply because EternalOresMekanismRecipes.java wasn't clean enough
    ///
    /// This class handles Enrichment and Crushing Recipes registry at the same time
    ///
    public static void generateMekanismProcessingWithoutChemicalRecipe(RecipeOutput output,
                                                                String materialName,
                                                                Item input,
                                                                Item outputItem,
                                                                MekanismItemRecipeType recipeType)
    {
        ItemStackIngredient inputIngredient = IngredientCreatorAccess.item().from(input, recipeType.inputCount());
        generateMekanismRecipeInternal(output, materialName, inputIngredient, outputItem, recipeType);
    }

    public static void generateMekanismProcessingWithoutChemicalRecipe(RecipeOutput output,
                                                                       String materialName,
                                                                       TagKey<Item> tag,
                                                                       Item outputItem,
                                                                       MekanismItemRecipeType recipeType)
    {
        ItemStackIngredient inputIngredient = IngredientCreatorAccess.item().from(tag, recipeType.inputCount());
        generateMekanismRecipeInternal(output, materialName, inputIngredient, outputItem, recipeType);
    }

    private static void generateMekanismRecipeInternal(RecipeOutput output,
                                                       String materialName,
                                                       ItemStackIngredient inputIngredient,
                                                       Item outputItem,
                                                       MekanismItemRecipeType recipeType)
    {
        String folder = "mekanism_compat/" + materialName + "/" + recipeType.folder() + "/";
        var result = new ItemStack(outputItem, recipeType.outputCount());

        if(recipeType.isCrushing())
        {
            ItemStackToItemStackRecipeBuilder.crushing(inputIngredient, result)
                    .addCondition(new ModLoadedCondition("mekanism"))
                    .build(output, ResourceLocation.fromNamespaceAndPath("eternalores", folder + materialName + "_" + recipeType.suffix()));
        }
        if(recipeType.isEnriching())
        {
            ItemStackToItemStackRecipeBuilder.enriching(inputIngredient, result)
                    .addCondition(new ModLoadedCondition("mekanism"))
                    .build(output, ResourceLocation.fromNamespaceAndPath("eternalores", folder + materialName + "_" + recipeType.suffix()));
        }
    }
}
