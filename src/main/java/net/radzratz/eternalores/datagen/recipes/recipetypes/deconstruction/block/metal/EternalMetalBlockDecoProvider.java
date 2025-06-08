package net.radzratz.eternalores.datagen.recipes.recipetypes.deconstruction.block.metal;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.radzratz.eternalores.block.EternalGeneralBlocks;
import net.radzratz.eternalores.item.EternalGeneralItems;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static net.radzratz.eternalores.datagen.recipes.recipetypes.deconstruction.block.metal.MetalBlockDecoEntry.generateBlockToIngotMaterialRecipe;

public class EternalMetalBlockDecoProvider extends RecipeProvider implements IConditionBuilder
{
    public EternalMetalBlockDecoProvider(PackOutput output,
                                         CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput)
    {
        generateBlockToIngotMaterialRecipe(recipeOutput, "aluminum", EternalGeneralBlocks.ALUMINUM_BLOCK.asItem(), EternalGeneralItems.ALUMINUM_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "blue_steel", EternalGeneralBlocks.BLUE_STEEL_BLOCK.asItem(), EternalGeneralItems.BLUE_STEEL_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "brass", EternalGeneralBlocks.BRASS_BLOCK.asItem(), EternalGeneralItems.BRASS_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "britannia", EternalGeneralBlocks.BRITANNIA_SILVER_BLOCK.asItem(), EternalGeneralItems.BRITANNIA_SILVER_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "bronze", EternalGeneralBlocks.BRONZE_BLOCK.asItem(), EternalGeneralItems.BRONZE_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "catalyrium", EternalGeneralBlocks.CATALYRIUM_BLOCK.asItem(), EternalGeneralItems.CATALYRIUM_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "cast_iron", EternalGeneralBlocks.CAST_IRON_BLOCK.asItem(), EternalGeneralItems.CAST_IRON_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "cast_steel", EternalGeneralBlocks.CAST_STEEL_BLOCK.asItem(), EternalGeneralItems.CAST_STEEL_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "cobalt", EternalGeneralBlocks.COBALT_BLOCK.asItem(), EternalGeneralItems.COBALT_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "constantan", EternalGeneralBlocks.CONSTANTAN_BLOCK.asItem(), EternalGeneralItems.CONSTANTAN_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "electrum", EternalGeneralBlocks.ELECTRUM_BLOCK.asItem(), EternalGeneralItems.ELECTRUM_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "enderium", EternalGeneralBlocks.ENDERIUM_BLOCK.asItem(), EternalGeneralItems.ENDERIUM_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "gallium", EternalGeneralBlocks.GALLIUM_BLOCK.asItem(), EternalGeneralItems.GALLIUM_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "graphite", EternalGeneralBlocks.GRAPHITE_BLOCK.asItem(), EternalGeneralItems.GRAPHITE_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "invar", EternalGeneralBlocks.INVAR_BLOCK.asItem(), EternalGeneralItems.INVAR_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "iridium", EternalGeneralBlocks.IRIDIUM_BLOCK.asItem(), EternalGeneralItems.IRIDIUM_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "lead", EternalGeneralBlocks.LEAD_BLOCK.asItem(), EternalGeneralItems.LEAD_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "lumium", EternalGeneralBlocks.LUMIUM_BLOCK.asItem(), EternalGeneralItems.LUMIUM_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "nethersteel", EternalGeneralBlocks.NETHERSTEEL_BLOCK.asItem(), EternalGeneralItems.NETHERSTEEL_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "nickel", EternalGeneralBlocks.NICKEL_BLOCK.asItem(), EternalGeneralItems.NICKEL_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "osmium", EternalGeneralBlocks.OSMIUM_BLOCK.asItem(), EternalGeneralItems.OSMIUM_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "pewter", EternalGeneralBlocks.PEWTER_BLOCK.asItem(), EternalGeneralItems.PEWTER_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "pig_iron", EternalGeneralBlocks.PIG_IRON_BLOCK.asItem(), EternalGeneralItems.PIG_IRON_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "platinum", EternalGeneralBlocks.PLATINUM_BLOCK.asItem(), EternalGeneralItems.PLATINUM_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "plutonium", EternalGeneralBlocks.PLUTONIUM_BLOCK.asItem(), EternalGeneralItems.PLUTONIUM_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "rose_gold", EternalGeneralBlocks.ROSE_GOLD_BLOCK.asItem(), EternalGeneralItems.ROSE_GOLD_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "signalum", EternalGeneralBlocks.SIGNALUM_BLOCK.asItem(), EternalGeneralItems.SIGNALUM_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "silver", EternalGeneralBlocks.SILVER_BLOCK.asItem(), EternalGeneralItems.SILVER_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "shadowsteel", EternalGeneralBlocks.SHADOWSTEEL_BLOCK.asItem(), EternalGeneralItems.SHADOWSTEEL_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "steel", EternalGeneralBlocks.STEEL_BLOCK.asItem(), EternalGeneralItems.STEEL_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "tin", EternalGeneralBlocks.TIN_BLOCK.asItem(), EternalGeneralItems.TIN_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "titanium", EternalGeneralBlocks.TITANIUM_BLOCK.asItem(), EternalGeneralItems.TITANIUM_INGOT.get());
        //generateBlockToIngotMaterialRecipe(recipeOutput, "tungsten", EternalGeneralBlocks.TUNGSTEN_BLOCK.asItem(), EternalGeneralItems.TUNGSTEN_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "ultimatitanium", EternalGeneralBlocks.ULTIMATITANIUM_BLOCK.asItem(), EternalGeneralItems.ULTIMATITANIUM_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "uraninite", EternalGeneralBlocks.URANINITE_BLOCK.asItem(), EternalGeneralItems.URANINITE_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "uranium", EternalGeneralBlocks.URANIUM_BLOCK.asItem(), EternalGeneralItems.URANIUM_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "wrought_iron", EternalGeneralBlocks.WROUGHT_IRON_BLOCK.asItem(), EternalGeneralItems.WROUGHT_IRON_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "zinc", EternalGeneralBlocks.ZINC_BLOCK.asItem(), EternalGeneralItems.ZINC_INGOT.get());
    }
}
