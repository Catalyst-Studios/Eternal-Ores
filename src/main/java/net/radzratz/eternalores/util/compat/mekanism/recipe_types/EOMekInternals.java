package net.radzratz.eternalores.util.compat.mekanism.recipe_types;

import mekanism.api.chemical.Chemical;
import mekanism.api.chemical.ChemicalStack;
import mekanism.api.datagen.recipe.builder.FluidChemicalToChemicalRecipeBuilder;
import mekanism.api.datagen.recipe.builder.ItemStackChemicalToItemStackRecipeBuilder;
import mekanism.api.datagen.recipe.builder.ItemStackToItemStackRecipeBuilder;
import mekanism.api.recipes.ingredients.ChemicalStackIngredient;
import mekanism.api.recipes.ingredients.FluidStackIngredient;
import mekanism.api.recipes.ingredients.ItemStackIngredient;
import mekanism.api.recipes.ingredients.creator.IngredientCreatorAccess;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.radzratz.eternalores.util.compat.mekanism.recipe_types.interfaces.IEOMekChemType;
import net.radzratz.eternalores.util.compat.mekanism.recipe_types.interfaces.IEOMekFluidChemType;
import net.radzratz.eternalores.util.compat.mekanism.recipe_types.interfaces.IEOMekItemType;

import static net.radzratz.eternalores.util.EOUtils.*;

public class EOMekInternals
{
    /// No need to mention it
    ///
    /// My adhd won over yet again causing the creation of this
    ///
    /// Simply because EOMekRecipeProvider.java wasn't clean enough
    ///

    /// Washer Recipe Internal
    /// Material Dirty Slurry -> Clean Slurry
    public static void generateProcessingWithChemicalAndFluidInternal(RecipeOutput output, String materialName, ChemicalStackIngredient inputChemical,
                                                                       FluidStackIngredient inputFluid, Chemical outputChemical, IEOMekFluidChemType recipeType)
    {

        String folder = "mekanism_compat/" + materialName + "/" + recipeType.folder() + "/";

        FluidChemicalToChemicalRecipeBuilder.washing(inputFluid, inputChemical, new ChemicalStack(outputChemical, recipeType.outputSlurryClean()))
                .addCondition(MEK)
                .build(output, EO(folder + materialName + "_" + recipeType.suffix()));
    }

    /// Enriching and Crushing Internals
    ///
    /// Dust Recipes 1 (Material Set/Dirty Dust -> Dust)
    /// Dust Recipes 2 (Material Set Plate/Rod -> Dust)
    /// Ore Block -> Gem
    /// Dust Recipes 3 (Material Set Oreless -> Dust)
    /// Dust Recipes 4 (Material Set -> Dust)
    /// Dirty Dust Recipes (Material Set Clump -> Dirty Dust)
    public static void generateMekanismRecipeInternal(RecipeOutput output, String materialName, ItemStackIngredient inputIngredient,
                                                       Item outputItem, IEOMekItemType recipeType)
    {
        String folder = "mekanism_compat/" + materialName + "/" + recipeType.folder() + "/";
        var result = new ItemStack(outputItem, recipeType.outputCount());

        if(recipeType.isCrushing())
        {
            ItemStackToItemStackRecipeBuilder.crushing(inputIngredient, result)
                    .addCondition(MEK)
                    .build(output, ResourceLocation.fromNamespaceAndPath("eternalores", folder + materialName + "_" + recipeType.suffix()));
        }
        if(recipeType.isEnriching())
        {
            ItemStackToItemStackRecipeBuilder.enriching(inputIngredient, result)
                    .addCondition(MEK)
                    .build(output, ResourceLocation.fromNamespaceAndPath("eternalores", folder + materialName + "_" + recipeType.suffix()));
        }
    }

    /// Purifying and Injector Internals
    ///
    /// Shard Recipes (Material Set/Crystal -> Shard),
    /// Clump Recipes (Material Set/Shard -> Clump),
    public static void generateMekanismRecipeInternal(RecipeOutput output, String materialName, ItemStackIngredient inputIngredient,
                                                       Item outputItem, IEOMekChemType recipeType)
    {
        String folder = "mekanism_compat/" + materialName + "/" + recipeType.folder() + "/";
        var chemicalStack = IngredientCreatorAccess.chemicalStack().from(recipeType.chemical(), recipeType.chemicalAmount());
        var result = new ItemStack(outputItem, recipeType.outputCount());

        if(recipeType.isClump())
        {
            ItemStackChemicalToItemStackRecipeBuilder.purifying(inputIngredient, chemicalStack, result, true)
                    .addCondition(MEK)
                    .build(output, EO(folder + materialName + "_" + recipeType.suffix()));
        }
        else
        {
            ItemStackChemicalToItemStackRecipeBuilder.injecting(inputIngredient, chemicalStack, result, true)
                    .addCondition(MEK)
                    .build(output, EO(folder + materialName + "_" + recipeType.suffix()));
        }
    }
}
