package net.radzratz.eternalores.datagen.recipes.recipetypes.creation.item.plate;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.radzratz.eternalores.item.EOItems;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static net.radzratz.eternalores.datagen.recipes.recipetypes.creation.item.plate.EOPlateRecipe.generateGemPlateRecipe;
import static net.radzratz.eternalores.datagen.recipes.recipetypes.creation.item.plate.EOPlateRecipe.generateIngotPlateRecipe;

public class EOPlateEntries extends RecipeProvider implements IConditionBuilder
{
    public EOPlateEntries(PackOutput output,
                          CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput)
    {
        //Vanilla Mats
        generateIngotPlateRecipe(recipeOutput, "iron", EOItems.PLATE_IRON.get());
        generateIngotPlateRecipe(recipeOutput, "gold", EOItems.PLATE_GOLD.get());
        generateIngotPlateRecipe(recipeOutput, "copper", EOItems.PLATE_COPPER.get());
        generateIngotPlateRecipe(recipeOutput, "netherite", EOItems.PLATE_NETHERITE.get());

        generateGemPlateRecipe(recipeOutput, "diamond", EOItems.PLATE_DIAMOND.get());

        //EO Mats
        generateIngotPlateRecipe(recipeOutput, "aluminum", EOItems.PLATE_ALUMINUM.get());
        generateIngotPlateRecipe(recipeOutput, "ardite", EOItems.PLATE_ARDITE.get());
        generateIngotPlateRecipe(recipeOutput, "blue_steel", EOItems.PLATE_BLUE_STEEL.get());
        generateIngotPlateRecipe(recipeOutput, "brass", EOItems.PLATE_BRASS.get());
        generateIngotPlateRecipe(recipeOutput, "bronze", EOItems.PLATE_BRONZE.get());
        generateIngotPlateRecipe(recipeOutput, "cast_iron", EOItems.PLATE_CAST_IRON.get());
        generateIngotPlateRecipe(recipeOutput, "cast_steel", EOItems.PLATE_CAST_STEEL.get());
        generateIngotPlateRecipe(recipeOutput, "cobalt", EOItems.PLATE_COBALT.get());
        generateIngotPlateRecipe(recipeOutput, "constantan", EOItems.PLATE_CONSTANTAN.get());
        generateIngotPlateRecipe(recipeOutput, "electrum", EOItems.PLATE_ELECTRUM.get());
        generateIngotPlateRecipe(recipeOutput, "enderium", EOItems.PLATE_ENDERIUM.get());
        generateIngotPlateRecipe(recipeOutput, "gallium", EOItems.PLATE_GALLIUM.get());
        generateIngotPlateRecipe(recipeOutput, "graphite", EOItems.PLATE_GRAPHITE.get());
        generateIngotPlateRecipe(recipeOutput, "invar", EOItems.PLATE_INVAR.get());
        generateIngotPlateRecipe(recipeOutput, "iridium", EOItems.PLATE_IRIDIUM.get());
        generateIngotPlateRecipe(recipeOutput, "lead", EOItems.PLATE_LEAD.get());
        generateIngotPlateRecipe(recipeOutput, "lumium", EOItems.PLATE_LUMIUM.get());
        generateIngotPlateRecipe(recipeOutput, "nethersteel", EOItems.PLATE_NETHERSTEEL.get());
        generateIngotPlateRecipe(recipeOutput, "nickel", EOItems.PLATE_NICKEL.get());
        generateIngotPlateRecipe(recipeOutput, "osmium", EOItems.PLATE_OSMIUM.get());
        generateIngotPlateRecipe(recipeOutput, "pig_iron", EOItems.PLATE_PIG_IRON.get());
        generateIngotPlateRecipe(recipeOutput, "platinum", EOItems.PLATE_PLATINUM.get());
        generateIngotPlateRecipe(recipeOutput, "plutonium", EOItems.PLATE_PLUTONIUM.get());
        generateIngotPlateRecipe(recipeOutput, "rose_gold", EOItems.PLATE_ROSE_GOLD.get());
        generateIngotPlateRecipe(recipeOutput, "signalum", EOItems.PLATE_SIGNALUM.get());
        generateIngotPlateRecipe(recipeOutput, "silver", EOItems.PLATE_SILVER.get());
        generateIngotPlateRecipe(recipeOutput, "shadowsteel", EOItems.PLATE_SHADOWSTEEL.get());
        generateIngotPlateRecipe(recipeOutput, "steel", EOItems.PLATE_STEEL.get());
        generateIngotPlateRecipe(recipeOutput, "tin", EOItems.PLATE_TIN.get());
        generateIngotPlateRecipe(recipeOutput, "titanium", EOItems.PLATE_TITANIUM.get());
        //generateIngotPlateRecipe(recipeOutput, "tungsten", EOItems.PLATE_TUNGSTEN.get());
        generateIngotPlateRecipe(recipeOutput, "ultimatitanium", EOItems.PLATE_ULTIMATITANIUM.get());
        generateIngotPlateRecipe(recipeOutput, "uranium", EOItems.PLATE_URANIUM.get());
        generateIngotPlateRecipe(recipeOutput, "wrought_iron", EOItems.PLATE_WROUGHT_IRON.get());
        generateIngotPlateRecipe(recipeOutput, "zinc", EOItems.PLATE_ZINC.get());

        generateGemPlateRecipe(recipeOutput, "necroticarite", EOItems.PLATE_NECROTICARITE.get());
        generateGemPlateRecipe(recipeOutput, "sapphire", EOItems.PLATE_SAPPHIRE.get());
    }
}
