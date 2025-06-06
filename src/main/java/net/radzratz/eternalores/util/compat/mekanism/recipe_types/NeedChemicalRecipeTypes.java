package net.radzratz.eternalores.util.compat.mekanism.recipe_types;

import mekanism.api.chemical.Chemical;
import mekanism.api.chemical.ChemicalStack;
import mekanism.api.datagen.recipe.builder.ChemicalCrystallizerRecipeBuilder;
import mekanism.api.datagen.recipe.builder.ChemicalDissolutionRecipeBuilder;
import mekanism.api.datagen.recipe.builder.ItemStackChemicalToItemStackRecipeBuilder;
import mekanism.api.providers.IChemicalProvider;
import mekanism.api.recipes.ingredients.ChemicalStackIngredient;
import mekanism.api.recipes.ingredients.ItemStackIngredient;
import mekanism.api.recipes.ingredients.creator.IngredientCreatorAccess;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.common.conditions.ModLoadedCondition;
import net.radzratz.eternalores.util.compat.mekanism.recipe_types.enums.CrystallizingRecipeType;
import net.radzratz.eternalores.util.compat.mekanism.recipe_types.enums.DissolutionRecipeType;
import net.radzratz.eternalores.util.compat.mekanism.recipe_types.interfaces.MekanismChemicalRecipeType;

public class NeedChemicalRecipeTypes
{
    /// No need to mention it
    ///
    /// My adhd won over yet again causing the creation of this
    ///
    /// Simply because EternalOresMekanismRecipes.java wasn't clean enough
    ///
    /// This class handles Injecting, Purifying, Crystallizing and Dissolution Recipes registry at the same time
    ///
    /// Purifying and Injector Recipes
    public static void generateMekanismProcessingWithChemicalRecipe(RecipeOutput output,
                                                                    String materialName,
                                                                    Item input,
                                                                    Item outputItem,
                                                                    MekanismChemicalRecipeType recipeType)
    {
        ItemStackIngredient inputIngredient = IngredientCreatorAccess.item().from(input, recipeType.inputCount());
        generateMekanismRecipeInternal(output, materialName, inputIngredient, outputItem, recipeType);
    }

    public static void generateMekanismProcessingWithChemicalRecipe(RecipeOutput output,
                                                                    String materialName,
                                                                    TagKey<Item> tag,
                                                                    Item outputItem,
                                                                    MekanismChemicalRecipeType recipeType)
    {
        ItemStackIngredient inputIngredient = IngredientCreatorAccess.item().from(tag, recipeType.inputCount());
        generateMekanismRecipeInternal(output, materialName, inputIngredient, outputItem, recipeType);
    }

    public static void generateMekanismProcessingWithChemicalRecipe(RecipeOutput output,
                                                                    String materialName,
                                                                    ItemStackIngredient inputIngredient,
                                                                    Item outputItem,
                                                                    MekanismChemicalRecipeType recipeType)
    {
        generateMekanismRecipeInternal(output, materialName, inputIngredient, outputItem, recipeType);
    }

    private static void generateMekanismRecipeInternal(RecipeOutput output,
                                                       String materialName,
                                                       ItemStackIngredient inputIngredient,
                                                       Item outputItem,
                                                       MekanismChemicalRecipeType recipeType)
    {
        String folder = "mekanism_compat/" + materialName + "/" + recipeType.folder() + "/";
        var chemicalStack = IngredientCreatorAccess.chemicalStack().from(recipeType.chemical(), recipeType.chemicalAmount());
        var result = new ItemStack(outputItem, recipeType.outputCount());

        if(recipeType.isClump())
        {
            ItemStackChemicalToItemStackRecipeBuilder.purifying(inputIngredient, chemicalStack, result, true)
                    .addCondition(new ModLoadedCondition("mekanism"))
                    .build(output, ResourceLocation.fromNamespaceAndPath("eternalores", folder + materialName + "_" + recipeType.suffix()));
        }
            else
        {
            ItemStackChemicalToItemStackRecipeBuilder.injecting(inputIngredient, chemicalStack, result, true)
                    .addCondition(new ModLoadedCondition("mekanism"))
                    .build(output, ResourceLocation.fromNamespaceAndPath("eternalores", folder + materialName + "_" + recipeType.suffix()));
        }
    }

    /// Dissolution Recipe
    public static void generateMekanismDissolutionRecipe(RecipeOutput output,
                                                         String materialName,
                                                         TagKey<Item> itemTag,
                                                         Chemical outputSlurry,
                                                         DissolutionRecipeType recipeType)
    {
        ItemStackIngredient inputItem = IngredientCreatorAccess.item().from(itemTag, recipeType.inputCount());
        ChemicalStackIngredient acid = IngredientCreatorAccess.chemicalStack().from(recipeType.chemical(), recipeType.chemicalAmount());
        ChemicalStack result = new ChemicalStack(outputSlurry, recipeType.outputCount());

        String folder = "mekanism_compat/" + materialName + "/" + recipeType.folder() + "/";

        ChemicalDissolutionRecipeBuilder.dissolution(inputItem, acid, result, true)
                .addCondition(new ModLoadedCondition("mekanism"))
                .build(output, ResourceLocation.fromNamespaceAndPath("eternalores", folder + materialName + "_" + recipeType.suffix()));
    }

    /// Crystallization
    public static void generateMekanismCrystallizingRecipe(RecipeOutput output,
                                                           String materialName,
                                                           Chemical slurryInput,
                                                           Item outputCrystal,
                                                           CrystallizingRecipeType recipeType)
    {
        ChemicalStackIngredient inputChemical = IngredientCreatorAccess.chemicalStack().from((IChemicalProvider) slurryInput, recipeType.inputSlurry());
        var result = new ItemStack(outputCrystal, recipeType.outputSlurryClean());

        String folder = "mekanism_compat/" + materialName + "/" + recipeType.folder() + "/";

        ChemicalCrystallizerRecipeBuilder.crystallizing(inputChemical, result)
                .addCondition(new ModLoadedCondition("mekanism"))
                .build(output, ResourceLocation.fromNamespaceAndPath("eternalores", folder + materialName + "_" + recipeType.suffix()));
    }
}
