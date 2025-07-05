package net.radzratz.eternalores.util.compat.oritech.recipe_types.pulverizer;

import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.conditions.ModLoadedCondition;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.interfaces.pulverizer.IPulverizerConversion;
import rearth.oritech.api.recipe.PulverizerRecipeBuilder;

public class EOPulverizerBlockRecipes
{
    public static void generateOritechPulverizerBlockRecipes(RecipeOutput output, String materialName,
                                                        TagKey<Item> inputTag, Item outputItem,
                                                        IPulverizerConversion recipeType)
    {
        Ingredient inputIngredient = Ingredient.of(inputTag);
        generateOreBlockToRawInternal(output, materialName, inputIngredient, outputItem, recipeType);
    }

    private static void generateOreBlockToRawInternal(RecipeOutput output, String materialName,
                                                      Ingredient inputIngredient, Item outputItem,
                                                      IPulverizerConversion recipeType)
    {
        String folder = "eternal_ores_compat/" + materialName + "/" + recipeType.folder() + "/";
        String name = folder + materialName + "_" + recipeType.suffix();

        ItemStack resultStack = new ItemStack(outputItem, recipeType.outputs());

        PulverizerRecipeBuilder.build()
                .input(inputIngredient)
                .result(resultStack)
                .export(output.withConditions(new ModLoadedCondition("oritech")), name);
    }
}
