package net.radzratz.eternalores.datagen.recipes.recipetypes.creation.item.rod;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.radzratz.eternalores.item.EOItems;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static net.radzratz.eternalores.datagen.recipes.recipetypes.creation.item.rod.EORodRecipe.generateGemRodsRecipe;
import static net.radzratz.eternalores.datagen.recipes.recipetypes.creation.item.rod.EORodRecipe.generateIngotRodsRecipe;

public class EORodEntries extends RecipeProvider implements IConditionBuilder
{
    public EORodEntries(PackOutput output,
                        CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput)
    {
        //Vanilla Mats
        generateIngotRodsRecipe(recipeOutput, "iron", EOItems.ROD_IRON.get());
        generateIngotRodsRecipe(recipeOutput, "gold", EOItems.ROD_GOLD.get());
        generateIngotRodsRecipe(recipeOutput, "copper", EOItems.ROD_COPPER.get());
        generateIngotRodsRecipe(recipeOutput, "netherite", EOItems.ROD_NETHERITE.get());

        generateGemRodsRecipe(recipeOutput, "diamond", EOItems.ROD_DIAMOND.get());

        //EO Mats
        generateIngotRodsRecipe(recipeOutput, "aluminum", EOItems.ROD_ALUMINUM.get());
        generateIngotRodsRecipe(recipeOutput, "ardite", EOItems.ROD_ARDITE.get());
        generateIngotRodsRecipe(recipeOutput, "blue_steel", EOItems.ROD_BLUE_STEEL.get());
        generateIngotRodsRecipe(recipeOutput, "brass", EOItems.ROD_BRASS.get());
        generateIngotRodsRecipe(recipeOutput, "bronze", EOItems.ROD_BRONZE.get());
        generateIngotRodsRecipe(recipeOutput, "cast_iron", EOItems.ROD_CAST_IRON.get());
        generateIngotRodsRecipe(recipeOutput, "cast_steel", EOItems.ROD_CAST_STEEL.get());
        generateIngotRodsRecipe(recipeOutput, "cobalt", EOItems.ROD_COBALT.get());
        generateIngotRodsRecipe(recipeOutput, "constantan", EOItems.ROD_CONSTANTAN.get());
        generateIngotRodsRecipe(recipeOutput, "electrum", EOItems.ROD_ELECTRUM.get());
        generateIngotRodsRecipe(recipeOutput, "enderium", EOItems.ROD_ENDERIUM.get());
        generateIngotRodsRecipe(recipeOutput, "gallium", EOItems.ROD_GALLIUM.get());
        generateIngotRodsRecipe(recipeOutput, "graphite", EOItems.ROD_GRAPHITE.get());
        generateIngotRodsRecipe(recipeOutput, "invar", EOItems.ROD_INVAR.get());
        generateIngotRodsRecipe(recipeOutput, "iridium", EOItems.ROD_IRIDIUM.get());
        generateIngotRodsRecipe(recipeOutput, "lead", EOItems.ROD_LEAD.get());
        generateIngotRodsRecipe(recipeOutput, "lumium", EOItems.ROD_LUMIUM.get());
        generateIngotRodsRecipe(recipeOutput, "nethersteel", EOItems.ROD_NETHERSTEEL.get());
        generateIngotRodsRecipe(recipeOutput, "nickel", EOItems.ROD_NICKEL.get());
        generateIngotRodsRecipe(recipeOutput, "osmium", EOItems.ROD_OSMIUM.get());
        generateIngotRodsRecipe(recipeOutput, "pig_iron", EOItems.ROD_PIG_IRON.get());
        generateIngotRodsRecipe(recipeOutput, "platinum", EOItems.ROD_PLATINUM.get());
        generateIngotRodsRecipe(recipeOutput, "plutonium", EOItems.ROD_PLUTONIUM.get());
        generateIngotRodsRecipe(recipeOutput, "rose_gold", EOItems.ROD_ROSE_GOLD.get());
        generateIngotRodsRecipe(recipeOutput, "signalum", EOItems.ROD_SIGNALUM.get());
        generateIngotRodsRecipe(recipeOutput, "silver", EOItems.ROD_SILVER.get());
        generateIngotRodsRecipe(recipeOutput, "shadowsteel", EOItems.ROD_SHADOWSTEEL.get());
        generateIngotRodsRecipe(recipeOutput, "steel", EOItems.ROD_STEEL.get());
        generateIngotRodsRecipe(recipeOutput, "tin", EOItems.ROD_TIN.get());
        generateIngotRodsRecipe(recipeOutput, "titanium", EOItems.ROD_TITANIUM.get());
        //generateIngotRodsRecipe(recipeOutput, "tungsten", EOItems.ROD_TUNGSTEN.get());
        generateIngotRodsRecipe(recipeOutput, "ultimatitanium", EOItems.ROD_ULTIMATITANIUM.get());
        generateIngotRodsRecipe(recipeOutput, "uranium", EOItems.ROD_URANIUM.get());
        generateIngotRodsRecipe(recipeOutput, "wrought_iron", EOItems.ROD_WROUGHT_IRON.get());
        generateIngotRodsRecipe(recipeOutput, "zinc", EOItems.ROD_ZINC.get());

        generateGemRodsRecipe(recipeOutput, "necroticarite", EOItems.ROD_NECROTICARITE.get());
        generateGemRodsRecipe(recipeOutput, "sapphire", EOItems.ROD_SAPPHIRE.get());
    }
}
