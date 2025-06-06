package net.radzratz.eternalores.util.compat.mekanism.recipe_types;

import mekanism.api.chemical.Chemical;
import mekanism.api.chemical.ChemicalStack;
import mekanism.api.datagen.recipe.builder.FluidChemicalToChemicalRecipeBuilder;
import mekanism.api.providers.IChemicalProvider;
import mekanism.api.recipes.ingredients.ChemicalStackIngredient;
import mekanism.api.recipes.ingredients.FluidStackIngredient;
import mekanism.api.recipes.ingredients.creator.IngredientCreatorAccess;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.neoforge.common.conditions.ModLoadedCondition;
import net.radzratz.eternalores.util.compat.mekanism.recipe_types.interfaces.MekanismFluidChemicalRecipeType;

public class NeedChemicalFluidRecipeType
{
    public static void generateMekanismProcessingWithChemicalAndFluidRecipe(RecipeOutput output,
                                                                            String materialName,
                                                                            Chemical inputDirty,
                                                                            Fluid water,
                                                                            Chemical outputClean,
                                                                            MekanismFluidChemicalRecipeType recipeType)
    {

        ChemicalStackIngredient inputChemical = IngredientCreatorAccess.chemicalStack().from((IChemicalProvider) inputDirty, recipeType.inputSlurry());
        FluidStackIngredient inputFluid = IngredientCreatorAccess.fluid().from(water, recipeType.fluidAmount());

        generate(output, materialName, inputChemical, inputFluid, outputClean, recipeType);
    }

    public static void generateMekanismProcessingWithChemicalAndFluidRecipe(RecipeOutput output,
                                                                            String materialName,
                                                                            Chemical inputDirty,
                                                                            TagKey<Fluid> waterTag,
                                                                            Chemical outputClean,
                                                                            MekanismFluidChemicalRecipeType recipeType)
    {

        ChemicalStackIngredient inputChemical = IngredientCreatorAccess.chemicalStack().from((IChemicalProvider) inputDirty, recipeType.inputSlurry());
        FluidStackIngredient inputFluid = IngredientCreatorAccess.fluid().from(waterTag, recipeType.fluidAmount());

        generate(output, materialName, inputChemical, inputFluid, outputClean, recipeType);
    }

    private static void generate(RecipeOutput output,
                                 String materialName,
                                 ChemicalStackIngredient inputChemical,
                                 FluidStackIngredient inputFluid,
                                 Chemical outputChemical,
                                 MekanismFluidChemicalRecipeType recipeType)
    {

        String folder = "mekanism_compat/" + materialName + "/" + recipeType.folder() + "/";

        FluidChemicalToChemicalRecipeBuilder.washing(inputFluid, inputChemical, new ChemicalStack(outputChemical, recipeType.outputSlurryClean()))
                .addCondition(new ModLoadedCondition("mekanism"))
                .build(output, ResourceLocation.fromNamespaceAndPath("eternalores", folder + materialName + "_" + recipeType.suffix()));
    }
}
