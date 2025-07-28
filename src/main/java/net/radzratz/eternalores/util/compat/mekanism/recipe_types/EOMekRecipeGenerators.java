package net.radzratz.eternalores.util.compat.mekanism.recipe_types;

import mekanism.api.chemical.Chemical;
import mekanism.api.chemical.ChemicalStack;
import mekanism.api.datagen.recipe.builder.ChemicalCrystallizerRecipeBuilder;
import mekanism.api.datagen.recipe.builder.ChemicalDissolutionRecipeBuilder;
import mekanism.api.providers.IChemicalProvider;
import mekanism.api.recipes.ingredients.ChemicalStackIngredient;
import mekanism.api.recipes.ingredients.FluidStackIngredient;
import mekanism.api.recipes.ingredients.ItemStackIngredient;
import mekanism.api.recipes.ingredients.creator.IngredientCreatorAccess;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.neoforge.common.conditions.ModLoadedCondition;
import net.radzratz.eternalores.util.compat.mekanism.recipe_types.enums.EOCrystallizationType;
import net.radzratz.eternalores.util.compat.mekanism.recipe_types.enums.EODissolutionType;
import net.radzratz.eternalores.util.compat.mekanism.recipe_types.interfaces.IEOMekChemType;
import net.radzratz.eternalores.util.compat.mekanism.recipe_types.interfaces.IEOMekFluidChemType;
import net.radzratz.eternalores.util.compat.mekanism.recipe_types.interfaces.IEOMekItemType;

import static net.radzratz.eternalores.util.compat.mekanism.recipe_types.EOMekInternals.*;

public class EOMekRecipeGenerators
{
    /// No need to mention it
    ///
    /// My adhd won over yet again causing the creation of this
    ///
    /// Simply because EOMekRecipeProvider.java wasn't clean enough
    ///

    /// Washer Recipe Generator
    /// Material Dirty Slurry -> Clean Slurry
    public static void generateMekanismProcessingWithChemicalAndFluidRecipe(RecipeOutput output, String materialName, Chemical inputDirty,
                                                                            TagKey<Fluid> waterTag, Chemical outputClean, IEOMekFluidChemType recipeType)
    {

        ChemicalStackIngredient inputChemical = IngredientCreatorAccess.chemicalStack().from((IChemicalProvider) inputDirty, recipeType.inputSlurry());
        FluidStackIngredient inputFluid = IngredientCreatorAccess.fluid().from(waterTag, recipeType.fluidAmount());

        generateProcessingWithChemicalAndFluidInternal(output, materialName, inputChemical, inputFluid, outputClean, recipeType);
    }

    /// Enriching and Crushing Recipe Generator
    ///
    /// Dust Recipes 1 (Material Set/Dirty Dust -> Dust),
    /// Dust Recipes 2 (Material Set Plate/Rod -> Dust),
    /// Ore Block -> Gem,
    /// Dust Recipes 3 (Material Set Oreless -> Dust),
    /// Dust Recipes 4 (Material Set -> Dust),
    /// Dirty Dust Recipes (Material Set Clump -> Dirty Dust)
    public static void generateMekanismProcessingWithoutChemicalRecipe(RecipeOutput output, String materialName, TagKey<Item> tag,
                                                                       Item outputItem, IEOMekItemType recipeType)
    {
        ItemStackIngredient inputIngredient = IngredientCreatorAccess.item().from(tag, recipeType.inputCount());
        generateMekanismRecipeInternal(output, materialName, inputIngredient, outputItem, recipeType);
    }

    /// Crystallization Recipe Generator
    /// Clean Slurry -> Crystal
    public static void generateMekanismCrystallizingRecipe(RecipeOutput output, String materialName, Chemical slurryInput,
                                                           Item outputCrystal, EOCrystallizationType recipeType)
    {
        ChemicalStackIngredient inputChemical = IngredientCreatorAccess.chemicalStack().from((IChemicalProvider) slurryInput, recipeType.inputSlurry());
        var result = new ItemStack(outputCrystal, recipeType.outputSlurryClean());

        String folder = "mekanism_compat/" + materialName + "/" + recipeType.folder() + "/";

        ChemicalCrystallizerRecipeBuilder.crystallizing(inputChemical, result)
                .addCondition(new ModLoadedCondition("mekanism"))
                .build(output, ResourceLocation.fromNamespaceAndPath("eternalores", folder + materialName + "_" + recipeType.suffix()));
    }

    /// Dissolution Recipe Generator
    /// Material Set -> Dirty Slurry
    public static void generateMekanismDissolutionRecipe(RecipeOutput output, String materialName, TagKey<Item> itemTag,
                                                         Chemical outputSlurry, EODissolutionType recipeType)
    {
        ItemStackIngredient inputItem = IngredientCreatorAccess.item().from(itemTag, recipeType.inputCount());
        ChemicalStackIngredient acid = IngredientCreatorAccess.chemicalStack().from(recipeType.chemical(), recipeType.chemicalAmount());
        ChemicalStack result = new ChemicalStack(outputSlurry, recipeType.outputCount());

        String folder = "mekanism_compat/" + materialName + "/" + recipeType.folder() + "/";

        ChemicalDissolutionRecipeBuilder.dissolution(inputItem, acid, result, true)
                .addCondition(new ModLoadedCondition("mekanism"))
                .build(output, ResourceLocation.fromNamespaceAndPath("eternalores", folder + materialName + "_" + recipeType.suffix()));
    }

    /// Purifying and Injector Recipe Generator
    ///
    /// Shard Recipes (Material Set/Crystal -> Shard),
    /// Clump Recipes (Material Set/Shard -> Clump)
    public static void generateMekanismProcessingWithChemicalRecipe(RecipeOutput output, String materialName, TagKey<Item> tag,
                                                                    Item outputItem, IEOMekChemType recipeType)
    {
        ItemStackIngredient inputIngredient = IngredientCreatorAccess.item().from(tag, recipeType.inputCount());
        generateMekanismRecipeInternal(output, materialName, inputIngredient, outputItem, recipeType);
    }
}
