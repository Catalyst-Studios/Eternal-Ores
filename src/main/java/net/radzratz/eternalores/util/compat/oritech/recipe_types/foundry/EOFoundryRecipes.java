package net.radzratz.eternalores.util.compat.oritech.recipe_types.foundry;

import net.minecraft.data.recipes.RecipeOutput;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.enums.foundry.EOFoundryCreationType;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.enums.foundry.EOFoundryGemType;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.foundry.entries.EOFoundryMachineEntries;

import static net.radzratz.eternalores.util.compat.oritech.recipe_types.foundry.EOFoundryAlloy.generateOritechFoundryRecipes;

public class EOFoundryRecipes
{
    public static void registerAllFoundryRecipes(RecipeOutput output)
    {
        EOFoundryMachineEntries.MATERIAL_TO_ALLOY.forEach((name, inputs) ->
        {
            generateOritechFoundryRecipes(output, name, inputs.itemTagOne(), inputs.itemTagTwo(), inputs.outputIngot(), EOFoundryCreationType.ALLOYS_INGOTS);
        });

        EOFoundryMachineEntries.GEM_TO_MATERIAL.forEach((name, inputs) ->
        {
            generateOritechFoundryRecipes(output, name, inputs.itemTagOne(), inputs.itemTagTwo(), inputs.outputIngot(), EOFoundryGemType.METAL_GEM);
        });
    }
}
