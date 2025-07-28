package net.radzratz.eternalores.util.compat.oritech.recipe_types.atomic_forge;

import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.interfaces.IEOritechRecipeType;
import rearth.oritech.api.recipe.AtomicForgeRecipeBuilder;

import static net.radzratz.eternalores.util.EOUtils.ORI;

public class EOAtomicForgeConversion
{
    public static void generateOritechAtomicForgeRecipes(RecipeOutput output, String materialName, TagKey<Item> inputTagOne, TagKey<Item> inputItemTwo,
                                                         Item outputItem, IEOritechRecipeType recipeType)
    {
        Ingredient inputIngredient = Ingredient.of(inputTagOne);
        Ingredient inputIngredientTwo = Ingredient.of(inputItemTwo);

        generateAtomicForgeInternal(output, materialName, inputIngredient, inputIngredientTwo, outputItem, recipeType);
    }

    private static void generateAtomicForgeInternal(RecipeOutput output, String materialName, Ingredient inputIngredient, Ingredient inputIngredientTwo,
                                                    Item outputItem, IEOritechRecipeType recipeType)
    {
        String folder = "eternal_ores_compat/" + materialName + "/" + recipeType.folder() + "/";
        String name = folder + materialName + "_" + recipeType.suffix();

        ItemStack resultStack = new ItemStack(outputItem, recipeType.outputs());

        if(recipeType.isAtomicForge())
        {
            AtomicForgeRecipeBuilder.build()
                    .input(inputIngredient)
                    .input(inputIngredientTwo)
                    .input(inputIngredientTwo)
                    .result(resultStack)
                    .timeInSeconds(1)
                    .export(output.withConditions(ORI), name);
        }
    }
}
