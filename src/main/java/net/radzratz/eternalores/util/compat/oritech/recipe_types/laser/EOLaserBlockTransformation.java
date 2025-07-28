package net.radzratz.eternalores.util.compat.oritech.recipe_types.laser;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.interfaces.IEOritechRecipeType;
import rearth.oritech.api.recipe.LaserRecipeBuilder;

import static net.radzratz.eternalores.util.EOUtils.ORI;

public class EOLaserBlockTransformation
{
    public static void generateOritechLaserRecipes(RecipeOutput output, String materialName, TagKey<Block> blockTag,
                                                   Item outputItem, IEOritechRecipeType recipeType)
    {
        TagKey<Item> itemTag = TagKey.create(Registries.ITEM, blockTag.location());
        Ingredient inputIngredient = Ingredient.of(itemTag);
        generateLaserInternal(output, materialName, inputIngredient, outputItem, recipeType);
    }

    private static void generateLaserInternal(RecipeOutput output, String materialName, Ingredient inputIngredient,
                                              Item outputItem, IEOritechRecipeType recipeType)
    {
        String folder = "eternal_ores_compat/" + materialName + "/" + recipeType.folder() + "/";
        String name = folder + materialName + "_" + recipeType.suffix();

        ItemStack resultStack = new ItemStack(outputItem, recipeType.outputs());

        if(recipeType.isLaser())
        {
            LaserRecipeBuilder.build()
                    .input(inputIngredient)
                    .result(resultStack)
                    .export(output.withConditions(ORI), name);
        }
    }
}
