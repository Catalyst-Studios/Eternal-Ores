package net.radzratz.eternalores.util.compat.oritech.recipe_types.foundry;

import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.conditions.ModLoadedCondition;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.interfaces.foundry.IFoundryCreation;
import rearth.oritech.api.recipe.FoundryRecipeBuilder;

public class EOFoundryAlloy
{
    public static void generateOritechFoundryRecipes(RecipeOutput output, String materialName,
                                                     TagKey<Item> inputTagOne,
                                                     TagKey<Item> inputTagTwo,
                                                     Item outputItem,
                                                     IFoundryCreation recipeType)
    {
        Ingredient inputIngredient = Ingredient.of(inputTagOne);
        Ingredient inputIngredientTwo = Ingredient.of(inputTagTwo);
        generateFoundryInternal(output, materialName, inputIngredient, inputIngredientTwo, outputItem, recipeType);
    }

    private static void generateFoundryInternal(RecipeOutput output, String materialName,
                                               Ingredient inputIngredient,
                                               Ingredient inputIngredientTwo,
                                               Item outputItem,
                                               IFoundryCreation recipeType)
    {
        String folder = "eternal_ores_compat/" + materialName + "/" + recipeType.folder() + "/";
        String name = folder + materialName + "_" + recipeType.suffix();

        ItemStack resultStack = new ItemStack(outputItem, recipeType.output());

        FoundryRecipeBuilder.build()
                .input(inputIngredient)
                .input(inputIngredientTwo)
                .result(resultStack)
                .export(output.withConditions(new ModLoadedCondition("oritech")), name);
    }
}
