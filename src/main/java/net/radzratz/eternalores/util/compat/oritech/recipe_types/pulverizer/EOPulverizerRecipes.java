package net.radzratz.eternalores.util.compat.oritech.recipe_types.pulverizer;

import net.minecraft.data.recipes.RecipeOutput;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.enums.EOPulverizerDustConversionType;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.enums.EOPulverizerOreBlockToMaterialType;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.enums.EOPulverizerOreFormToDustType;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.pulverizer.entries.EOPulverizerBlockFormDustEntries;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.pulverizer.entries.EOPulverizerFormDustEntries;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.pulverizer.entries.EOPulverizerOreBlockFormEntries;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.pulverizer.entries.EOPulverizerOreFormDustEntries;

import static net.radzratz.eternalores.util.compat.oritech.recipe_types.pulverizer.EOPulverizerBlockRecipes.generateOritechPulverizerBlockRecipes;
import static net.radzratz.eternalores.util.compat.oritech.recipe_types.pulverizer.EOPulverizerDustRecipes.generateOritechPulverizerRecipe;

@SuppressWarnings("all")
public class EOPulverizerRecipes
{
    public static void registerAllPulverizerRecipes(RecipeOutput output)
    {
        EOPulverizerFormDustEntries.DECO_DUST_ENTRIES.forEach((name, inputs) ->
        {
            generateOritechPulverizerRecipe(output, name, inputs.rod(), inputs.outputDust(), EOPulverizerDustConversionType.ROD);

            generateOritechPulverizerRecipe(output, name, inputs.plate(), inputs.outputDust(), EOPulverizerDustConversionType.PLATE);
        });

        EOPulverizerOreFormDustEntries.INGOT_FORM_DUST.forEach((name, inputs) ->
        {
            generateOritechPulverizerRecipe(output, name, inputs.ingotTag(), inputs.outputDust(), EOPulverizerOreFormToDustType.INGOT);
        });

        EOPulverizerOreFormDustEntries.GEM_FORM_DUST.forEach((name, inputs) ->
        {
            generateOritechPulverizerRecipe(output, name, inputs.gemTag(), inputs.outputDust(), EOPulverizerOreFormToDustType.GEM);
        });

        EOPulverizerBlockFormDustEntries.BLOCK_FORM_DUST.forEach((name, inputs) ->
        {
            generateOritechPulverizerRecipe(output, name, inputs.blockTag(), inputs.outputDust(), EOPulverizerOreFormToDustType.BLOCK);
        });

        EOPulverizerOreBlockFormEntries.ORE_BLOCK_FORM_RAW.forEach((name, inputs) ->
        {
            generateOritechPulverizerBlockRecipes(output, name, inputs.oreBlockTag(), inputs.outputRaw(), EOPulverizerOreBlockToMaterialType.ORE_BLOCK);
        });
    }
}
