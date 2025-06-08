package net.radzratz.eternalores.datagen.recipes.recipetypes.creation.item.plate;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.radzratz.eternalores.item.EternalGeneralItems;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static net.radzratz.eternalores.datagen.recipes.recipetypes.creation.item.plate.PlateRecipeEntries.generateGemPlateRecipe;
import static net.radzratz.eternalores.datagen.recipes.recipetypes.creation.item.plate.PlateRecipeEntries.generateIngotPlateRecipe;

public class EternalPlatesProvider extends RecipeProvider implements IConditionBuilder
{
    public EternalPlatesProvider(PackOutput output,
                                 CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput)
    {
        //Vanilla Mats
        generateIngotPlateRecipe(recipeOutput, "iron", EternalGeneralItems.PLATE_IRON.get());
        generateIngotPlateRecipe(recipeOutput, "gold", EternalGeneralItems.PLATE_GOLD.get());
        generateIngotPlateRecipe(recipeOutput, "copper", EternalGeneralItems.PLATE_COPPER.get());
        generateIngotPlateRecipe(recipeOutput, "netherite", EternalGeneralItems.PLATE_NETHERITE.get());

        generateGemPlateRecipe(recipeOutput, "diamond", EternalGeneralItems.PLATE_DIAMOND.get());

        //EO Mats
        generateIngotPlateRecipe(recipeOutput, "aluminum", EternalGeneralItems.PLATE_ALUMINUM.get());
        generateIngotPlateRecipe(recipeOutput, "blue_steel", EternalGeneralItems.PLATE_BLUE_STEEL.get());
        generateIngotPlateRecipe(recipeOutput, "brass", EternalGeneralItems.PLATE_BRASS.get());
        generateIngotPlateRecipe(recipeOutput, "bronze", EternalGeneralItems.PLATE_BRONZE.get());
        generateIngotPlateRecipe(recipeOutput, "cast_iron", EternalGeneralItems.PLATE_CAST_IRON.get());
        generateIngotPlateRecipe(recipeOutput, "cast_steel", EternalGeneralItems.PLATE_CAST_STEEL.get());
        generateIngotPlateRecipe(recipeOutput, "cobalt", EternalGeneralItems.PLATE_COBALT.get());
        generateIngotPlateRecipe(recipeOutput, "constantan", EternalGeneralItems.PLATE_CONSTANTAN.get());
        generateIngotPlateRecipe(recipeOutput, "electrum", EternalGeneralItems.PLATE_ELECTRUM.get());
        generateIngotPlateRecipe(recipeOutput, "enderium", EternalGeneralItems.PLATE_ENDERIUM.get());
        generateIngotPlateRecipe(recipeOutput, "gallium", EternalGeneralItems.PLATE_GALLIUM.get());
        generateIngotPlateRecipe(recipeOutput, "graphite", EternalGeneralItems.PLATE_GRAPHITE.get());
        generateIngotPlateRecipe(recipeOutput, "invar", EternalGeneralItems.PLATE_INVAR.get());
        generateIngotPlateRecipe(recipeOutput, "iridium", EternalGeneralItems.PLATE_IRIDIUM.get());
        generateIngotPlateRecipe(recipeOutput, "lead", EternalGeneralItems.PLATE_LEAD.get());
        generateIngotPlateRecipe(recipeOutput, "lumium", EternalGeneralItems.PLATE_LUMIUM.get());
        generateIngotPlateRecipe(recipeOutput, "nethersteel", EternalGeneralItems.PLATE_NETHERSTEEL.get());
        generateIngotPlateRecipe(recipeOutput, "nickel", EternalGeneralItems.PLATE_NICKEL.get());
        generateIngotPlateRecipe(recipeOutput, "osmium", EternalGeneralItems.PLATE_OSMIUM.get());
        generateIngotPlateRecipe(recipeOutput, "pig_iron", EternalGeneralItems.PLATE_PIG_IRON.get());
        generateIngotPlateRecipe(recipeOutput, "platinum", EternalGeneralItems.PLATE_PLATINUM.get());
        generateIngotPlateRecipe(recipeOutput, "plutonium", EternalGeneralItems.PLATE_PLUTONIUM.get());
        generateIngotPlateRecipe(recipeOutput, "rose_gold", EternalGeneralItems.PLATE_ROSE_GOLD.get());
        generateIngotPlateRecipe(recipeOutput, "signalum", EternalGeneralItems.PLATE_SIGNALUM.get());
        generateIngotPlateRecipe(recipeOutput, "silver", EternalGeneralItems.PLATE_SILVER.get());
        generateIngotPlateRecipe(recipeOutput, "shadowsteel", EternalGeneralItems.PLATE_SHADOWSTEEL.get());
        generateIngotPlateRecipe(recipeOutput, "steel", EternalGeneralItems.PLATE_STEEL.get());
        generateIngotPlateRecipe(recipeOutput, "tin", EternalGeneralItems.PLATE_TIN.get());
        generateIngotPlateRecipe(recipeOutput, "titanium", EternalGeneralItems.PLATE_TITANIUM.get());
        //generateIngotPlateRecipe(recipeOutput, "tungsten", EternalGeneralItems.PLATE_TUNGSTEN.get());
        generateIngotPlateRecipe(recipeOutput, "ultimatitanium", EternalGeneralItems.PLATE_ULTIMATITANIUM.get());
        generateIngotPlateRecipe(recipeOutput, "uranium", EternalGeneralItems.PLATE_URANIUM.get());
        generateIngotPlateRecipe(recipeOutput, "wrought_iron", EternalGeneralItems.PLATE_WROUGHT_IRON.get());
        generateIngotPlateRecipe(recipeOutput, "zinc", EternalGeneralItems.PLATE_ZINC.get());

        generateGemPlateRecipe(recipeOutput, "necroticarite", EternalGeneralItems.PLATE_NECROTICARITE.get());
        generateGemPlateRecipe(recipeOutput, "sapphire", EternalGeneralItems.PLATE_SAPPHIRE.get());
    }
}
