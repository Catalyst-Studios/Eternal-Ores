package net.radzratz.eternalores.util.compat.oritech.recipe_types.atomic_forge;

import net.minecraft.data.recipes.RecipeOutput;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.atomic_forge.entries.EOAtomicForgeConversionEntries;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.enums.EOAtomicForgeConversionType;
import static net.radzratz.eternalores.util.compat.oritech.recipe_types.atomic_forge.EOAtomicForgeConversion.generateOritechAtomicForgeRecipes;

public class EOAtomicForgeRecipes
{
    public static void registerAllAtomicForgeRecipes(RecipeOutput output)
    {
        EOAtomicForgeConversionEntries.RAW_BLOCK_TO_MATERIAL_BLOCK.forEach((name, inputs) ->
        {
            generateOritechAtomicForgeRecipes(output, name, inputs.oreGemTag(), inputs.inputFluxite(), inputs.outputItem(), EOAtomicForgeConversionType.ORE_GEM_TO_DUST);
        });
    }
}
