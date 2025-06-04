package net.radzratz.eternalores.util.compat.mekanism.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.radzratz.eternalores.util.compat.mekanism.EternalOresMekEntries;
import net.radzratz.eternalores.util.compat.mekanism.recipe_types.*;
import net.radzratz.eternalores.util.compat.mekanism.recipe_types.enums.PurificationRecipeType;
import net.radzratz.eternalores.util.compat.mekanism.recipe_types.enums.CrushingRecipeType;
import net.radzratz.eternalores.util.compat.mekanism.recipe_types.enums.EnrichingRecipeType;
import net.radzratz.eternalores.util.compat.mekanism.recipe_types.enums.InjectorRecipeType;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class EternalOresMekanismRecipes extends RecipeProvider
{
    public EternalOresMekanismRecipes(PackOutput output,
                                      CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput output)
    {
        /// Dirty Dust Recipes (Material Set Clump -> Dirty Dust)
        EternalOresMekEntries.DIRTY_DUST_ENTRIES.forEach((name, inputs) ->
        {
            NoChemicalRecipeTypes.generateMekanismProcessingWithoutChemicalRecipe(
                    output, name, inputs.clumpItem(), inputs.outputDirtyDust(), CrushingRecipeType.CLUMP);
        });

        /// Dust Recipes 2 (Material Set Plate/Rod -> Dust)
        EternalOresMekEntries.DUST_DECONSTRUCTION_ENTRIES.forEach((name, inputs) ->
        {
            NoChemicalRecipeTypes.generateMekanismProcessingWithoutChemicalRecipe(
                    output, name, inputs.plate(), inputs.outputDust(), CrushingRecipeType.PLATE);
            NoChemicalRecipeTypes.generateMekanismProcessingWithoutChemicalRecipe(
                    output, name, inputs.rod(), inputs.outputDust(), CrushingRecipeType.ROD);
        });

        /// Dust Recipes 1 (Material Set/Dirty Dust -> Dust)
        EternalOresMekEntries.DUST_ENTRIES.forEach((name, inputs) ->
        {
            NoChemicalRecipeTypes.generateMekanismProcessingWithoutChemicalRecipe(
                    output, name, inputs.rawOre(), inputs.outputDust(), EnrichingRecipeType.RAW_ORE);
            NoChemicalRecipeTypes.generateMekanismProcessingWithoutChemicalRecipe(
                    output, name, inputs.dirtyDustItem(), inputs.outputDust(), EnrichingRecipeType.DIRTY_DUST);
            NoChemicalRecipeTypes.generateMekanismProcessingWithoutChemicalRecipe(
                    output, name, inputs.rawBlock(), inputs.outputDust(), EnrichingRecipeType.RAW_BLOCK);
            NoChemicalRecipeTypes.generateMekanismProcessingWithoutChemicalRecipe(
                    output, name, inputs.oreBlock(), inputs.outputDust(), EnrichingRecipeType.ORE_BLOCK);
        });

        /// Clump Recipes (Material Set/Shard -> Clump)
        EternalOresMekEntries.CLUMP_ENTRIES.forEach((name, inputs) ->
        {
            NeedChemicalRecipeTypes.generateMekanismProcessingWithChemicalRecipe(
                    output, name, inputs.rawOre(), inputs.outputClump(), PurificationRecipeType.RAW_ORE);
            NeedChemicalRecipeTypes.generateMekanismProcessingWithChemicalRecipe(
                    output, name, inputs.shard(), inputs.outputClump(), PurificationRecipeType.SHARD);
            NeedChemicalRecipeTypes.generateMekanismProcessingWithChemicalRecipe(
                    output, name, inputs.rawBlock(), inputs.outputClump(), PurificationRecipeType.RAW_BLOCK);
            NeedChemicalRecipeTypes.generateMekanismProcessingWithChemicalRecipe(
                    output, name, inputs.oreBlock(), inputs.outputClump(), PurificationRecipeType.ORE_BLOCK);
        });

        /// Shard Recipes (Material Set/Crystal -> Shard)
        EternalOresMekEntries.SHARD_ENTRIES.forEach((name, inputs) ->
        {
            NeedChemicalRecipeTypes.generateMekanismProcessingWithChemicalRecipe(
                    output, name, inputs.rawOre(), inputs.outputShard(), InjectorRecipeType.RAW_ORE);
            NeedChemicalRecipeTypes.generateMekanismProcessingWithChemicalRecipe(
                    output, name, inputs.crystal(), inputs.outputShard(), InjectorRecipeType.SHARD);
            NeedChemicalRecipeTypes.generateMekanismProcessingWithChemicalRecipe(
                    output, name, inputs.rawBlock(), inputs.outputShard(), InjectorRecipeType.RAW_BLOCK);
            NeedChemicalRecipeTypes.generateMekanismProcessingWithChemicalRecipe(
                    output, name, inputs.oreBlock(), inputs.outputShard(), InjectorRecipeType.ORE_BLOCK);
        });
    }
}
