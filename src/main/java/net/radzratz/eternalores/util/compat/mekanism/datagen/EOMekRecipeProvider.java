package net.radzratz.eternalores.util.compat.mekanism.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.radzratz.eternalores.util.compat.mekanism.EOMekEntries;
import net.radzratz.eternalores.util.compat.mekanism.recipe_types.*;
import net.radzratz.eternalores.util.compat.mekanism.recipe_types.enums.*;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("all")
public class EOMekRecipeProvider extends RecipeProvider
{
    public EOMekRecipeProvider(PackOutput output,
                               CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput output)
    {
        /// Dirty Dust Recipes (Material Set Clump -> Dirty Dust)
        EOMekEntries.DIRTY_DUST_ENTRIES.forEach((name, inputs) ->
        {
            NoChemicalRecipeTypes.generateMekanismProcessingWithoutChemicalRecipe(
                    output, name, inputs.clumpItem(), inputs.outputDirtyDust(), EOCrushingType.CLUMP);
        });

        /// Dust Recipes 4 (Material Set -> Dust)
        EOMekEntries.DUST_MATERIAL_ENTRIES.forEach((name, inputs) ->
        {
            NoChemicalRecipeTypes.generateMekanismProcessingWithoutChemicalRecipe(
                    output, name, inputs.material(), inputs.outputDust(), EOCrushingType.MATERIAL);
        });

        /// Dust Recipes 3 (Material Set Oreless -> Dust)
        EOMekEntries.DUST_WITHOUT_ORE_ENTRIES.forEach((name, inputs) ->
        {
            NoChemicalRecipeTypes.generateMekanismProcessingWithoutChemicalRecipe(
                    output, name, inputs.rawBlock(), inputs.outputDust(), EOEnrichingType.RAW_BLOCK);
            NoChemicalRecipeTypes.generateMekanismProcessingWithoutChemicalRecipe(
                    output, name, inputs.rawOre(), inputs.outputDust(), EOEnrichingType.RAW_ORE);
            NoChemicalRecipeTypes.generateMekanismProcessingWithoutChemicalRecipe(
                    output, name, inputs.dirtyDustItem(), inputs.outputDust(), EOEnrichingType.DIRTY_DUST);
        });

        /// Ore Block -> Gem
        EOMekEntries.ORE_GEM_ENTRIES.forEach((name, inputs) ->
        {
            NoChemicalRecipeTypes.generateMekanismProcessingWithoutChemicalRecipe(
                    output, name, inputs.oreBlock(), inputs.outputGem(), EOEnrichingType.GEM_ORE_BLOCK);
        });

        /// Dust Recipes 2 (Material Set Plate/Rod -> Dust)
        EOMekEntries.DUST_DECONSTRUCTION_ENTRIES.forEach((name, inputs) ->
        {
            NoChemicalRecipeTypes.generateMekanismProcessingWithoutChemicalRecipe(
                    output, name, inputs.plate(), inputs.outputDust(), EOCrushingType.PLATE);
            NoChemicalRecipeTypes.generateMekanismProcessingWithoutChemicalRecipe(
                    output, name, inputs.rod(), inputs.outputDust(), EOCrushingType.ROD);
        });

        /// Dust Recipes 1 (Material Set/Dirty Dust -> Dust)
        EOMekEntries.DUST_ENTRIES.forEach((name, inputs) ->
        {
            NoChemicalRecipeTypes.generateMekanismProcessingWithoutChemicalRecipe(
                    output, name, inputs.rawOre(), inputs.outputDust(), EOEnrichingType.RAW_ORE);
            NoChemicalRecipeTypes.generateMekanismProcessingWithoutChemicalRecipe(
                    output, name, inputs.dirtyDustItem(), inputs.outputDust(), EOEnrichingType.DIRTY_DUST);
            NoChemicalRecipeTypes.generateMekanismProcessingWithoutChemicalRecipe(
                    output, name, inputs.rawBlock(), inputs.outputDust(), EOEnrichingType.RAW_BLOCK);
            NoChemicalRecipeTypes.generateMekanismProcessingWithoutChemicalRecipe(
                    output, name, inputs.oreBlock(), inputs.outputDust(), EOEnrichingType.ORE_BLOCK);
        });

        /// Clump Recipes (Material Set/Shard -> Clump)
        EOMekEntries.CLUMP_ENTRIES.forEach((name, inputs) ->
        {
            NeedChemicalRecipeTypes.generateMekanismProcessingWithChemicalRecipe(
                    output, name, inputs.rawOre(), inputs.outputClump(), EOPurificationType.RAW_ORE);
            NeedChemicalRecipeTypes.generateMekanismProcessingWithChemicalRecipe(
                    output, name, inputs.shard(), inputs.outputClump(), EOPurificationType.SHARD);
            NeedChemicalRecipeTypes.generateMekanismProcessingWithChemicalRecipe(
                    output, name, inputs.rawBlock(), inputs.outputClump(), EOPurificationType.RAW_BLOCK);
            NeedChemicalRecipeTypes.generateMekanismProcessingWithChemicalRecipe(
                    output, name, inputs.oreBlock(), inputs.outputClump(), EOPurificationType.ORE_BLOCK);
        });

        EOMekEntries.CLUMP_WITHOUT_ORE_ENTRIES.forEach((name, inputs) ->
        {
            NeedChemicalRecipeTypes.generateMekanismProcessingWithChemicalRecipe(
                    output, name, inputs.rawOre(), inputs.outputClump(), EOPurificationType.RAW_ORE);
            NeedChemicalRecipeTypes.generateMekanismProcessingWithChemicalRecipe(
                    output, name, inputs.shard(), inputs.outputClump(), EOPurificationType.SHARD);
            NeedChemicalRecipeTypes.generateMekanismProcessingWithChemicalRecipe(
                    output, name, inputs.rawBlock(), inputs.outputClump(), EOPurificationType.RAW_BLOCK);
        });

        /// Shard Recipes (Material Set/Crystal -> Shard)
        EOMekEntries.SHARD_ENTRIES.forEach((name, inputs) ->
        {
            NeedChemicalRecipeTypes.generateMekanismProcessingWithChemicalRecipe(
                    output, name, inputs.rawOre(), inputs.outputShard(), EOInjectionType.RAW_ORE);
            NeedChemicalRecipeTypes.generateMekanismProcessingWithChemicalRecipe(
                    output, name, inputs.crystal(), inputs.outputShard(), EOInjectionType.SHARD);
            NeedChemicalRecipeTypes.generateMekanismProcessingWithChemicalRecipe(
                    output, name, inputs.rawBlock(), inputs.outputShard(), EOInjectionType.RAW_BLOCK);
            NeedChemicalRecipeTypes.generateMekanismProcessingWithChemicalRecipe(
                    output, name, inputs.oreBlock(), inputs.outputShard(), EOInjectionType.ORE_BLOCK);
        });

        EOMekEntries.SHARD_WITHOUT_ORE_ENTRIES.forEach((name, inputs) ->
        {
            NeedChemicalRecipeTypes.generateMekanismProcessingWithChemicalRecipe(
                    output, name, inputs.rawOre(), inputs.outputShard(), EOInjectionType.RAW_ORE);
            NeedChemicalRecipeTypes.generateMekanismProcessingWithChemicalRecipe(
                    output, name, inputs.crystal(), inputs.outputShard(), EOInjectionType.SHARD);
            NeedChemicalRecipeTypes.generateMekanismProcessingWithChemicalRecipe(
                    output, name, inputs.rawBlock(), inputs.outputShard(), EOInjectionType.RAW_BLOCK);
        });

        /// Material Dirty Slurry -> Clean Slurry
        EOMekEntries.DIRTY_SLURRY_TO_CLEAN.forEach((name, inputs) ->
        {
            NeedChemicalFluidRecipeType.generateMekanismProcessingWithChemicalAndFluidRecipe(
                    output, name, inputs.inputDirtySlurry(), inputs.inputWater(), inputs.outputCleanSlurry(), EOWasherType.DIRTY_SLURRY
            );
        });

        /// Material Set -> Dirty Slurry
        EOMekEntries.MATERIAL_TO_DIRTY_SLURRY.forEach((name, inputs) ->
        {
            NeedChemicalRecipeTypes.generateMekanismDissolutionRecipe(
                    output, name, inputs.oreBlock(), inputs.outputDirtySlurry(), EODissolutionType.ORE_BLOCK);
            NeedChemicalRecipeTypes.generateMekanismDissolutionRecipe(
                    output, name, inputs.rawOre(), inputs.outputDirtySlurry(), EODissolutionType.RAW_ORE);
            NeedChemicalRecipeTypes.generateMekanismDissolutionRecipe(
                    output, name, inputs.rawBlock(), inputs.outputDirtySlurry(), EODissolutionType.RAW_BLOCK);
        });

        EOMekEntries.MATERIAL_WITHOUT_ORES_TO_DIRTY_SLURRY.forEach((name, inputs) ->
        {
            NeedChemicalRecipeTypes.generateMekanismDissolutionRecipe(
                    output, name, inputs.rawBlock(), inputs.outputDirtySlurry(), EODissolutionType.RAW_BLOCK);
            NeedChemicalRecipeTypes.generateMekanismDissolutionRecipe(
                    output, name, inputs.rawOre(), inputs.outputDirtySlurry(), EODissolutionType.RAW_ORE);
        });

        /// Clean Slurry -> Crystal
        EOMekEntries.CLEAN_SLURRY_TO_CRYSTAL.forEach((name, inputs) ->
        {
            NeedChemicalRecipeTypes.generateMekanismCrystallizingRecipe(
                    output, name, inputs.inputCleanSlurry(), inputs.crystalOutput(), EOCrystallizationType.CLEAN_SLURRY);
        });
    }
}
