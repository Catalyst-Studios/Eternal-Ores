package net.radzratz.eternalores.datagen.recipes.recipetypes.creation.block.metal;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.radzratz.eternalores.block.EternalGeneralBlocks;
import net.radzratz.eternalores.item.EternalGeneralItems;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static net.radzratz.eternalores.datagen.recipes.recipetypes.creation.block.metal.MetalBlockEntry.generateIngotToBlockRecipe;

public class EternalMetalBlockProvider extends RecipeProvider implements IConditionBuilder
{
    public EternalMetalBlockProvider(PackOutput output,
                                     CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput)
    {
        generateIngotToBlockRecipe(recipeOutput, "aluminum", EternalGeneralItems.ALUMINUM_INGOT.get(), EternalGeneralBlocks.ALUMINUM_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "blue_steel", EternalGeneralItems.BLUE_STEEL_INGOT.get(), EternalGeneralBlocks.BLUE_STEEL_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "brass", EternalGeneralItems.BRASS_INGOT.get(), EternalGeneralBlocks.BRASS_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "britannia", EternalGeneralItems.BRITANNIA_SILVER_INGOT.get(), EternalGeneralBlocks.BRITANNIA_SILVER_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "bronze", EternalGeneralItems.BRONZE_INGOT.get(), EternalGeneralBlocks.BRONZE_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "catalyrium", EternalGeneralItems.CATALYRIUM_INGOT.get(), EternalGeneralBlocks.CATALYRIUM_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "cast_iron", EternalGeneralItems.CAST_IRON_INGOT.get(), EternalGeneralBlocks.CAST_IRON_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "cast_steel", EternalGeneralItems.CAST_STEEL_INGOT.get(), EternalGeneralBlocks.CAST_STEEL_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "cobalt", EternalGeneralItems.COBALT_INGOT.get(), EternalGeneralBlocks.COBALT_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "constantan", EternalGeneralItems.CONSTANTAN_INGOT.get(), EternalGeneralBlocks.CONSTANTAN_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "electrum", EternalGeneralItems.ELECTRUM_INGOT.get(), EternalGeneralBlocks.ELECTRUM_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "enderium", EternalGeneralItems.ENDERIUM_INGOT.get(), EternalGeneralBlocks.ENDERIUM_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "gallium", EternalGeneralItems.GALLIUM_INGOT.get(), EternalGeneralBlocks.GALLIUM_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "graphite", EternalGeneralItems.GRAPHITE_INGOT.get(), EternalGeneralBlocks.GRAPHITE_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "invar", EternalGeneralItems.INVAR_INGOT.get(), EternalGeneralBlocks.INVAR_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "iridium", EternalGeneralItems.IRIDIUM_INGOT.get(), EternalGeneralBlocks.IRIDIUM_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "lead", EternalGeneralItems.LEAD_INGOT.get(), EternalGeneralBlocks.LEAD_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "lumium", EternalGeneralItems.LUMIUM_INGOT.get(), EternalGeneralBlocks.LUMIUM_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "nethersteel", EternalGeneralItems.NETHERSTEEL_INGOT.get(), EternalGeneralBlocks.NETHERSTEEL_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "nickel", EternalGeneralItems.NICKEL_INGOT.get(), EternalGeneralBlocks.NICKEL_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "osmium", EternalGeneralItems.OSMIUM_INGOT.get(), EternalGeneralBlocks.OSMIUM_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "pewter", EternalGeneralItems.PEWTER_INGOT.get(), EternalGeneralBlocks.PEWTER_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "pig_iron", EternalGeneralItems.PIG_IRON_INGOT.get(), EternalGeneralBlocks.PIG_IRON_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "platinum", EternalGeneralItems.PLATINUM_INGOT.get(), EternalGeneralBlocks.PLATINUM_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "plutonium", EternalGeneralItems.PLUTONIUM_INGOT.get(), EternalGeneralBlocks.PLUTONIUM_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "rose_gold", EternalGeneralItems.ROSE_GOLD_INGOT.get(), EternalGeneralBlocks.ROSE_GOLD_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "signalum", EternalGeneralItems.SIGNALUM_INGOT.get(), EternalGeneralBlocks.SIGNALUM_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "silver", EternalGeneralItems.SILVER_INGOT.get(), EternalGeneralBlocks.SILVER_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "shadowsteel", EternalGeneralItems.SHADOWSTEEL_INGOT.get(), EternalGeneralBlocks.SHADOWSTEEL_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "steel", EternalGeneralItems.STEEL_INGOT.get(), EternalGeneralBlocks.STEEL_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "tin", EternalGeneralItems.TIN_INGOT.get(), EternalGeneralBlocks.TIN_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "titanium", EternalGeneralItems.TITANIUM_INGOT.get(), EternalGeneralBlocks.TITANIUM_BLOCK.asItem());
        //generateIngotToBlockRecipe(recipeOutput, "tungsten", EternalGeneralItems.TUNGSTEN_INGOT.get(), EternalGeneralBlocks.TUNGSTEN_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "ultimatitanium", EternalGeneralItems.ULTIMATITANIUM_INGOT.get(), EternalGeneralBlocks.ULTIMATITANIUM_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "uranium", EternalGeneralItems.URANIUM_INGOT.get(), EternalGeneralBlocks.URANIUM_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "uraninite", EternalGeneralItems.URANINITE_INGOT.get(), EternalGeneralBlocks.URANINITE_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "wrought_iron", EternalGeneralItems.WROUGHT_IRON_INGOT.get(), EternalGeneralBlocks.WROUGHT_IRON_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "zinc", EternalGeneralItems.ZINC_INGOT.get(), EternalGeneralBlocks.ZINC_BLOCK.asItem());
    }
}
