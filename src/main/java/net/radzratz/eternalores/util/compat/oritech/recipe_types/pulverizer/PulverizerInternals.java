package net.radzratz.eternalores.util.compat.oritech.recipe_types.pulverizer;

import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.conditions.ModLoadedCondition;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.interfaces.IEOritechRecipeType;
import rearth.oritech.api.recipe.PulverizerRecipeBuilder;

import static net.radzratz.eternalores.util.EOUtils.ORI;

public class PulverizerInternals
{
    public static void generatePulverizerRecipeInternal(RecipeOutput output, String materialName,
                                                         Ingredient inputIngredient, Item outputItem,
                                                         IEOritechRecipeType recipeType)
    {
        String folder = "eternal_ores_compat/" + materialName + "/" + recipeType.folder() + "/";
        String name = folder + materialName + "_" + recipeType.suffix();

        ItemStack resultStack = new ItemStack(outputItem, recipeType.outputs());

        if(recipeType.isPulverizer())
        {
            PulverizerRecipeBuilder.build()
                    .input(inputIngredient)
                    .addToGrinder()
                    .result(resultStack)
                    .export(output.withConditions(ORI), name);
        }
    }

    public static void generatePulverizerRecipeByproductInternal(RecipeOutput output, String materialName,
                                                                  Ingredient inputIngredient, Item outputItem,
                                                                  Item outputByproduct, IEOritechRecipeType recipeType)
    {
        String folder = "eternal_ores_compat/" + materialName + "/" + recipeType.folder() + "/";
        String name = folder + materialName + "_" + recipeType.suffix();

        ItemStack resultStack = new ItemStack(outputItem, recipeType.outputs());
        ItemStack resultStackByproduct = new ItemStack(outputByproduct, recipeType.outputs());

        if (recipeType.isPulverizerByproduct())
        {
            PulverizerRecipeBuilder.build()
                    .input(inputIngredient)
                    .result(resultStack)
                    .result(resultStackByproduct.getItem(), 3)
                    .export(output.withConditions(ORI), name);
        }
    }
}
