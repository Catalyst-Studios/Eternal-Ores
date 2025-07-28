package net.radzratz.eternalores.util.compat.oritech.recipe_types.pulverizer;

import net.minecraft.data.recipes.RecipeOutput;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.enums.pulverizer.*;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.pulverizer.entries.*;

import static net.radzratz.eternalores.util.compat.oritech.recipe_types.pulverizer.EOPulverizerRecipe.*;

@SuppressWarnings("all")
public class EOPulverizerRecipeGenerators
{
    public static void registerAllPulverizerRecipes(RecipeOutput output)
    {
        EOPulverizerFormDustEntries.DECO_DUST_ENTRIES.forEach((name, inputs) ->
        {
            generatePulverizerRecipes(output, name, inputs.rod(), inputs.outputDust(), EOPulverizerDustConversionType.ROD);

            generatePulverizerRecipes(output, name, inputs.plate(), inputs.outputDust(), EOPulverizerDustConversionType.PLATE);
        });

        EOPulverizerOreFormDustEntries.INGOT_FORM_DUST.forEach((name, inputs) ->
        {
            generatePulverizerRecipes(output, name, inputs.ingotTag(), inputs.outputDust(), EOPulverizerDustConversionType.INGOT);
        });

        EOPulverizerOreFormDustEntries.GEM_FORM_DUST.forEach((name, inputs) ->
        {
            generatePulverizerRecipes(output, name, inputs.gemTag(), inputs.outputDust(), EOPulverizerDustConversionType.GEM);
        });

        EOPulverizerBlockFormDustEntries.BLOCK_FORM_DUST.forEach((name, inputs) ->
        {
            generatePulverizerRecipes(output, name, inputs.blockTag(), inputs.outputDust(), EOPulverizerDustConversionType.BLOCK);
        });

        EOPulverizerOreBlockFormEntries.ORE_BLOCK_FORM_RAW.forEach((name, inputs) ->
        {
            generatePulverizerRecipes(output, name, inputs.oreBlockTag(), inputs.outputRaw(), EOPulverizerDustConversionType.ORE_BLOCK);
        });

        EOPulverizerByProductEntries.BYPRODUCT_FORM_DUST.forEach((name, inputs) ->
        {
            generatePulverizerByproductRecipes(output, name, inputs.rawOre(), inputs.outputDust(), inputs.outputByproduct(), EOPulverizerRawOreByproductType.RAW_ORE);
        });
    }
}
