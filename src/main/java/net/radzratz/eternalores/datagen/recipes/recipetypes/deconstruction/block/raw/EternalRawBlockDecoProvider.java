package net.radzratz.eternalores.datagen.recipes.recipetypes.deconstruction.block.raw;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.radzratz.eternalores.block.EternalGeneralBlocks;
import net.radzratz.eternalores.item.EternalGeneralItems;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static net.radzratz.eternalores.datagen.recipes.recipetypes.deconstruction.block.raw.RawBlockDecoEntry.generateBlockToRawMaterialRecipe;

public class EternalRawBlockDecoProvider extends RecipeProvider implements IConditionBuilder
{
    public EternalRawBlockDecoProvider(PackOutput output,
                                       CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput)
    {
        generateBlockToRawMaterialRecipe(recipeOutput, "aluminum", EternalGeneralBlocks.RAW_ALUMINUM_BLOCK.asItem(), EternalGeneralItems.RAW_ALUMINUM.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "catalyrium", EternalGeneralBlocks.RAW_CATALYRIUM_BLOCK.asItem(), EternalGeneralItems.RAW_CATALYRIUM.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "cobalt", EternalGeneralBlocks.RAW_COBALT_BLOCK.asItem(), EternalGeneralItems.RAW_COBALT.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "gallium", EternalGeneralBlocks.RAW_GALLIUM_BLOCK.asItem(), EternalGeneralItems.RAW_GALLIUM.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "iridium", EternalGeneralBlocks.RAW_IRIDIUM_BLOCK.asItem(), EternalGeneralItems.RAW_IRIDIUM.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "lead", EternalGeneralBlocks.RAW_LEAD_BLOCK.asItem(), EternalGeneralItems.RAW_LEAD.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "nickel", EternalGeneralBlocks.RAW_NICKEL_BLOCK.asItem(), EternalGeneralItems.RAW_NICKEL.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "osmium", EternalGeneralBlocks.RAW_OSMIUM_BLOCK.asItem(), EternalGeneralItems.RAW_OSMIUM.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "platinum", EternalGeneralBlocks.RAW_PLATINUM_BLOCK.asItem(), EternalGeneralItems.RAW_PLATINUM.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "plutonium", EternalGeneralBlocks.RAW_PLUTONIUM_BLOCK.asItem(), EternalGeneralItems.RAW_PLUTONIUM.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "silver", EternalGeneralBlocks.RAW_SILVER_BLOCK.asItem(), EternalGeneralItems.RAW_SILVER.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "sulfur", EternalGeneralBlocks.SULFUR_BLOCK.asItem(), EternalGeneralItems.SULFUR.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "tin", EternalGeneralBlocks.RAW_TIN_BLOCK.asItem(), EternalGeneralItems.RAW_TIN.get());
        //generateBlockToRawMaterialRecipe(recipeOutput, "tungsten", EternalGeneralBlocks.RAW_TUNGSTEN_BLOCK.asItem(), EternalGeneralItems.RAW_TUNGSTEN.get());
        //generateBlockToRawMaterialRecipe(recipeOutput, "ultimatitanium", EternalGeneralBlocks.RAW_ULTIMATITANIUM_BLOCK.asItem(), EternalGeneralItems.RAW_ULTIMATITANIUM.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "uraninite", EternalGeneralBlocks.RAW_URANINITE_BLOCK.asItem(), EternalGeneralItems.RAW_URANINITE.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "uranium", EternalGeneralBlocks.RAW_URANIUM_BLOCK.asItem(), EternalGeneralItems.RAW_URANIUM.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "zinc", EternalGeneralBlocks.RAW_ZINC_BLOCK.asItem(), EternalGeneralItems.RAW_ZINC.get());
    }
}
