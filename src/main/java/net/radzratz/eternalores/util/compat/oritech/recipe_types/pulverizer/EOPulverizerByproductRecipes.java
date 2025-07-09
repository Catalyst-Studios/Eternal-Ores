package net.radzratz.eternalores.util.compat.oritech.recipe_types.pulverizer;

import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.conditions.ModLoadedCondition;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.interfaces.pulverizer.IPulverizerConversion;
import rearth.oritech.api.recipe.PulverizerRecipeBuilder;

public class EOPulverizerByproductRecipes
{
    public static void generateOritechPulverizerByproductRecipes(RecipeOutput output, String materialName,
                                                             TagKey<Item> inputTag, Item outputItem,
                                                             Item outputByproduct, IPulverizerConversion recipeType)
    {
        Ingredient inputIngredient = Ingredient.of(inputTag);
        generateRawByproductInternal(output, materialName, inputIngredient, outputItem, outputByproduct, recipeType);
    }

    private static void generateRawByproductInternal(RecipeOutput output, String materialName,
                                                      Ingredient inputIngredient, Item outputItem,
                                                      Item outputByproduct, IPulverizerConversion recipeType)
    {
        String folder = "eternal_ores_compat/" + materialName + "/" + recipeType.folder() + "/";
        String name = folder + materialName + "_" + recipeType.suffix();

        ItemStack resultStack = new ItemStack(outputItem, recipeType.outputs());
        ItemStack resultStackByproduct = new ItemStack(outputByproduct, recipeType.outputs());

        PulverizerRecipeBuilder.build()
                .input(inputIngredient)
                .result(resultStack)
                .result(resultStackByproduct.getItem(), 3)
                .export(output.withConditions(new ModLoadedCondition("oritech")), name);
    }
}
