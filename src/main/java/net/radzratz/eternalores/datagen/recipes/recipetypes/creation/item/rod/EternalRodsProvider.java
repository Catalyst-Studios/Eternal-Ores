package net.radzratz.eternalores.datagen.recipes.recipetypes.creation.item.rod;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.radzratz.eternalores.item.EternalGeneralItems;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static net.radzratz.eternalores.datagen.recipes.recipetypes.creation.item.rod.RodRecipeEntries.generateGemRodsRecipe;
import static net.radzratz.eternalores.datagen.recipes.recipetypes.creation.item.rod.RodRecipeEntries.generateIngotRodsRecipe;

public class EternalRodsProvider extends RecipeProvider implements IConditionBuilder
{
    public EternalRodsProvider(PackOutput output,
                               CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput)
    {
        //Vanilla Mats
        generateIngotRodsRecipe(recipeOutput, "iron", EternalGeneralItems.ROD_IRON.get());
        generateIngotRodsRecipe(recipeOutput, "gold", EternalGeneralItems.ROD_GOLD.get());
        generateIngotRodsRecipe(recipeOutput, "copper", EternalGeneralItems.ROD_COPPER.get());
        generateIngotRodsRecipe(recipeOutput, "netherite", EternalGeneralItems.ROD_NETHERITE.get());

        generateGemRodsRecipe(recipeOutput, "diamond", EternalGeneralItems.ROD_DIAMOND.get());

        //EO Mats
        generateIngotRodsRecipe(recipeOutput, "aluminum", EternalGeneralItems.ROD_ALUMINUM.get());
        generateIngotRodsRecipe(recipeOutput, "blue_steel", EternalGeneralItems.ROD_BLUE_STEEL.get());
        generateIngotRodsRecipe(recipeOutput, "brass", EternalGeneralItems.ROD_BRASS.get());
        generateIngotRodsRecipe(recipeOutput, "bronze", EternalGeneralItems.ROD_BRONZE.get());
        generateIngotRodsRecipe(recipeOutput, "cast_iron", EternalGeneralItems.ROD_CAST_IRON.get());
        generateIngotRodsRecipe(recipeOutput, "cast_steel", EternalGeneralItems.ROD_CAST_STEEL.get());
        generateIngotRodsRecipe(recipeOutput, "cobalt", EternalGeneralItems.ROD_COBALT.get());
        generateIngotRodsRecipe(recipeOutput, "constantan", EternalGeneralItems.ROD_CONSTANTAN.get());
        generateIngotRodsRecipe(recipeOutput, "electrum", EternalGeneralItems.ROD_ELECTRUM.get());
        generateIngotRodsRecipe(recipeOutput, "enderium", EternalGeneralItems.ROD_ENDERIUM.get());
        generateIngotRodsRecipe(recipeOutput, "gallium", EternalGeneralItems.ROD_GALLIUM.get());
        generateIngotRodsRecipe(recipeOutput, "graphite", EternalGeneralItems.ROD_GRAPHITE.get());
        generateIngotRodsRecipe(recipeOutput, "invar", EternalGeneralItems.ROD_INVAR.get());
        generateIngotRodsRecipe(recipeOutput, "iridium", EternalGeneralItems.ROD_IRIDIUM.get());
        generateIngotRodsRecipe(recipeOutput, "lead", EternalGeneralItems.ROD_LEAD.get());
        generateIngotRodsRecipe(recipeOutput, "lumium", EternalGeneralItems.ROD_LUMIUM.get());
        generateIngotRodsRecipe(recipeOutput, "nethersteel", EternalGeneralItems.ROD_NETHERSTEEL.get());
        generateIngotRodsRecipe(recipeOutput, "nickel", EternalGeneralItems.ROD_NICKEL.get());
        generateIngotRodsRecipe(recipeOutput, "osmium", EternalGeneralItems.ROD_OSMIUM.get());
        generateIngotRodsRecipe(recipeOutput, "pig_iron", EternalGeneralItems.ROD_PIG_IRON.get());
        generateIngotRodsRecipe(recipeOutput, "platinum", EternalGeneralItems.ROD_PLATINUM.get());
        generateIngotRodsRecipe(recipeOutput, "plutonium", EternalGeneralItems.ROD_PLUTONIUM.get());
        generateIngotRodsRecipe(recipeOutput, "rose_gold", EternalGeneralItems.ROD_ROSE_GOLD.get());
        generateIngotRodsRecipe(recipeOutput, "signalum", EternalGeneralItems.ROD_SIGNALUM.get());
        generateIngotRodsRecipe(recipeOutput, "silver", EternalGeneralItems.ROD_SILVER.get());
        generateIngotRodsRecipe(recipeOutput, "shadowsteel", EternalGeneralItems.ROD_SHADOWSTEEL.get());
        generateIngotRodsRecipe(recipeOutput, "steel", EternalGeneralItems.ROD_STEEL.get());
        generateIngotRodsRecipe(recipeOutput, "tin", EternalGeneralItems.ROD_TIN.get());
        generateIngotRodsRecipe(recipeOutput, "titanium", EternalGeneralItems.ROD_TITANIUM.get());
        //generateIngotRodsRecipe(recipeOutput, "tungsten", EternalGeneralItems.ROD_TUNGSTEN.get());
        generateIngotRodsRecipe(recipeOutput, "ultimatitanium", EternalGeneralItems.ROD_ULTIMATITANIUM.get());
        generateIngotRodsRecipe(recipeOutput, "uranium", EternalGeneralItems.ROD_URANIUM.get());
        generateIngotRodsRecipe(recipeOutput, "wrought_iron", EternalGeneralItems.ROD_WROUGHT_IRON.get());
        generateIngotRodsRecipe(recipeOutput, "zinc", EternalGeneralItems.ROD_ZINC.get());

        generateGemRodsRecipe(recipeOutput, "necroticarite", EternalGeneralItems.ROD_NECROTICARITE.get());
        generateGemRodsRecipe(recipeOutput, "sapphire", EternalGeneralItems.ROD_SAPPHIRE.get());
    }
}
