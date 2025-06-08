package net.radzratz.eternalores.datagen.recipes.recipetypes.creation.block.raw;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.radzratz.eternalores.block.EternalGeneralBlocks;
import net.radzratz.eternalores.item.EternalGeneralItems;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static net.radzratz.eternalores.datagen.recipes.recipetypes.creation.block.raw.RawBlockEntry.generateRawMaterialToBlockRecipe;

public class EternalRawBlockProvider extends RecipeProvider implements IConditionBuilder
{
    public EternalRawBlockProvider(PackOutput output,
                                   CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput)
    {
        generateRawMaterialToBlockRecipe(recipeOutput, "aluminum", EternalGeneralItems.RAW_ALUMINUM.get(), EternalGeneralBlocks.RAW_ALUMINUM_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "catalyrium", EternalGeneralItems.RAW_CATALYRIUM.get(), EternalGeneralBlocks.RAW_CATALYRIUM_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "cobalt", EternalGeneralItems.RAW_COBALT.get(), EternalGeneralBlocks.RAW_COBALT_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "gallium", EternalGeneralItems.RAW_GALLIUM.get(), EternalGeneralBlocks.RAW_GALLIUM_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "iridium", EternalGeneralItems.RAW_IRIDIUM.get(), EternalGeneralBlocks.RAW_IRIDIUM_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "lead", EternalGeneralItems.RAW_LEAD.get(), EternalGeneralBlocks.RAW_LEAD_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "nickel", EternalGeneralItems.RAW_NICKEL.get(), EternalGeneralBlocks.RAW_NICKEL_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "osmium", EternalGeneralItems.RAW_OSMIUM.get(), EternalGeneralBlocks.RAW_OSMIUM_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "platinum", EternalGeneralItems.RAW_PLATINUM.get(), EternalGeneralBlocks.RAW_PLATINUM_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "plutonium", EternalGeneralItems.RAW_PLUTONIUM.get(), EternalGeneralBlocks.RAW_PLUTONIUM_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "silver", EternalGeneralItems.RAW_SILVER.get(), EternalGeneralBlocks.RAW_SILVER_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "sulfur", EternalGeneralItems.SULFUR.get(), EternalGeneralBlocks.SULFUR_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "tin", EternalGeneralItems.RAW_TIN.get(), EternalGeneralBlocks.RAW_TIN_BLOCK.asItem());
        //generateRawMaterialToBlockRecipe(recipeOutput, "tungsten", EternalGeneralItems.RAW_TUNGSTEN.get(), EternalGeneralBlocks.RAW_TUNGSTEN_BLOCK.asItem());
        //generateRawMaterialToBlockRecipe(recipeOutput, "ultimatitanium", EternalGeneralItems.RAW_ULTIMATITANIUM.get(), EternalGeneralBlocks.RAW_ULTIMATITANIUM_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "uraninite", EternalGeneralItems.RAW_URANINITE.get(), EternalGeneralBlocks.RAW_URANINITE_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "uranium", EternalGeneralItems.RAW_URANIUM.get(), EternalGeneralBlocks.RAW_URANIUM_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "zinc", EternalGeneralItems.RAW_ZINC.get(), EternalGeneralBlocks.RAW_ZINC_BLOCK.asItem());
    }
}
