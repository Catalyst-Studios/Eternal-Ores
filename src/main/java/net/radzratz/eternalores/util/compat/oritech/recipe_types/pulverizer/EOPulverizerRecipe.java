package net.radzratz.eternalores.util.compat.oritech.recipe_types.pulverizer;

import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.interfaces.IEOritechRecipeType;

import static net.radzratz.eternalores.util.compat.oritech.recipe_types.pulverizer.PulverizerInternals.*;

public class EOPulverizerRecipe
{
    public static void generatePulverizerRecipes(RecipeOutput output, String materialName,
                                                 TagKey<Item> inputTag, Item outputItem,
                                                 IEOritechRecipeType recipeType)
    {
        Ingredient inputIngredient = Ingredient.of(inputTag);
        generatePulverizerRecipeInternal(output, materialName, inputIngredient, outputItem, recipeType);
    }

    public static void generatePulverizerByproductRecipes(RecipeOutput output, String materialName,
                                                          TagKey<Item> rawOreTag, Item outputItem,
                                                          Item outputByproduct, IEOritechRecipeType recipeType)
    {
        Ingredient inputIngredient = Ingredient.of(rawOreTag);
        generatePulverizerRecipeByproductInternal(output, materialName, inputIngredient, outputItem, outputByproduct, recipeType);
    }
}
