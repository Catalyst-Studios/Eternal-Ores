package net.radzratz.eternalores.datagen.recipes.recipetypes.creation.block.raw;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.radzratz.eternalores.block.EOBlocks;
import net.radzratz.eternalores.item.EOItems;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static net.radzratz.eternalores.datagen.recipes.recipetypes.creation.block.raw.EORawBlockRecipe.generateRawMaterialToBlockRecipe;

public class EORawBlockEntries extends RecipeProvider implements IConditionBuilder
{
    public EORawBlockEntries(PackOutput output,
                             CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput)
    {
        generateRawMaterialToBlockRecipe(recipeOutput, "aluminum", EOItems.RAW_ALUMINUM.get(), EOBlocks.RAW_ALUMINUM_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "ardite", EOItems.RAW_ARDITE.get(), EOBlocks.RAW_ARDITE_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "catalyrium", EOItems.RAW_CATALYRIUM.get(), EOBlocks.RAW_CATALYRIUM_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "cobalt", EOItems.RAW_COBALT.get(), EOBlocks.RAW_COBALT_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "gallium", EOItems.RAW_GALLIUM.get(), EOBlocks.RAW_GALLIUM_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "iridium", EOItems.RAW_IRIDIUM.get(), EOBlocks.RAW_IRIDIUM_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "lead", EOItems.RAW_LEAD.get(), EOBlocks.RAW_LEAD_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "nickel", EOItems.RAW_NICKEL.get(), EOBlocks.RAW_NICKEL_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "osmium", EOItems.RAW_OSMIUM.get(), EOBlocks.RAW_OSMIUM_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "platinum", EOItems.RAW_PLATINUM.get(), EOBlocks.RAW_PLATINUM_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "plutonium", EOItems.RAW_PLUTONIUM.get(), EOBlocks.RAW_PLUTONIUM_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "silver", EOItems.RAW_SILVER.get(), EOBlocks.RAW_SILVER_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "sulfur", EOItems.SULFUR.get(), EOBlocks.SULFUR_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "tin", EOItems.RAW_TIN.get(), EOBlocks.RAW_TIN_BLOCK.asItem());
        //generateRawMaterialToBlockRecipe(recipeOutput, "tungsten", EOItems.RAW_TUNGSTEN.get(), EOBlocks.RAW_TUNGSTEN_BLOCK.asItem());
        //generateRawMaterialToBlockRecipe(recipeOutput, "ultimatitanium", EOItems.RAW_ULTIMATITANIUM.get(), EOBlocks.RAW_ULTIMATITANIUM_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "uraninite", EOItems.RAW_URANINITE.get(), EOBlocks.RAW_URANINITE_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "uranium", EOItems.RAW_URANIUM.get(), EOBlocks.RAW_URANIUM_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "zinc", EOItems.RAW_ZINC.get(), EOBlocks.RAW_ZINC_BLOCK.asItem());
    }
}
