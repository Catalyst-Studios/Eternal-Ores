package net.radzratz.eternalores.datagen.recipes.recipetypes.deconstruction.block.raw;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.radzratz.eternalores.block.EOBlocks;
import net.radzratz.eternalores.item.EOItems;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static net.radzratz.eternalores.datagen.recipes.recipetypes.deconstruction.block.raw.EODeconstructionRawBlockRecipe.generateBlockToRawMaterialRecipe;

public class EODeconstructionRawBlockEntries extends RecipeProvider implements IConditionBuilder
{
    public EODeconstructionRawBlockEntries(PackOutput output,
                                           CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput)
    {
        generateBlockToRawMaterialRecipe(recipeOutput, "aluminum", EOBlocks.RAW_ALUMINUM_BLOCK.asItem(), EOItems.RAW_ALUMINUM.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "ardite", EOBlocks.RAW_ARDITE_BLOCK.asItem(), EOItems.RAW_ARDITE.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "catalyrium", EOBlocks.RAW_CATALYRIUM_BLOCK.asItem(), EOItems.RAW_CATALYRIUM.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "cobalt", EOBlocks.RAW_COBALT_BLOCK.asItem(), EOItems.RAW_COBALT.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "gallium", EOBlocks.RAW_GALLIUM_BLOCK.asItem(), EOItems.RAW_GALLIUM.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "iridium", EOBlocks.RAW_IRIDIUM_BLOCK.asItem(), EOItems.RAW_IRIDIUM.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "lead", EOBlocks.RAW_LEAD_BLOCK.asItem(), EOItems.RAW_LEAD.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "nickel", EOBlocks.RAW_NICKEL_BLOCK.asItem(), EOItems.RAW_NICKEL.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "osmium", EOBlocks.RAW_OSMIUM_BLOCK.asItem(), EOItems.RAW_OSMIUM.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "platinum", EOBlocks.RAW_PLATINUM_BLOCK.asItem(), EOItems.RAW_PLATINUM.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "plutonium", EOBlocks.RAW_PLUTONIUM_BLOCK.asItem(), EOItems.RAW_PLUTONIUM.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "silver", EOBlocks.RAW_SILVER_BLOCK.asItem(), EOItems.RAW_SILVER.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "sulfur", EOBlocks.SULFUR_BLOCK.asItem(), EOItems.SULFUR.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "tin", EOBlocks.RAW_TIN_BLOCK.asItem(), EOItems.RAW_TIN.get());
        //generateBlockToRawMaterialRecipe(recipeOutput, "tungsten", EOBlocks.RAW_TUNGSTEN_BLOCK.asItem(), EOItems.RAW_TUNGSTEN.get());
        //generateBlockToRawMaterialRecipe(recipeOutput, "ultimatitanium", EOBlocks.RAW_ULTIMATITANIUM_BLOCK.asItem(), EOItems.RAW_ULTIMATITANIUM.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "uraninite", EOBlocks.RAW_URANINITE_BLOCK.asItem(), EOItems.RAW_URANINITE.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "uranium", EOBlocks.RAW_URANIUM_BLOCK.asItem(), EOItems.RAW_URANIUM.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "zinc", EOBlocks.RAW_ZINC_BLOCK.asItem(), EOItems.RAW_ZINC.get());
    }
}
