package net.radzratz.eternalores.util.compat.oritech.recipe_types.laser;

import net.minecraft.data.recipes.RecipeOutput;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.enums.EOLaserCreationType;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.laser.entries.EOLaserTransformationEntries;

import static net.radzratz.eternalores.util.compat.oritech.recipe_types.laser.EOLaserBlockTransformation.generateOritechLaserRecipes;

public class EOLaserRecipes
{
    public static void registerAllLaserRecipes(RecipeOutput output)
    {
        EOLaserTransformationEntries.RAW_BLOCK_TO_MATERIAL_BLOCK.forEach((name, inputs) ->
        {
            generateOritechLaserRecipes(output, name, inputs.oreBlockTag(), inputs.outputBlock().asItem(), EOLaserCreationType.BLOCK_TO_MATERIAL);
        });
    }
}
