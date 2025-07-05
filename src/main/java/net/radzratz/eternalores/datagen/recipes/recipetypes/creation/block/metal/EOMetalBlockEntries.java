package net.radzratz.eternalores.datagen.recipes.recipetypes.creation.block.metal;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.radzratz.eternalores.block.EOBlocks;
import net.radzratz.eternalores.item.EOItems;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static net.radzratz.eternalores.datagen.recipes.recipetypes.creation.block.metal.EOMetalBlockRecipe.generateIngotToBlockRecipe;

public class EOMetalBlockEntries extends RecipeProvider implements IConditionBuilder
{
    public EOMetalBlockEntries(PackOutput output,
                               CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput)
    {
        generateIngotToBlockRecipe(recipeOutput, "aluminum", EOItems.ALUMINUM_INGOT.get(), EOBlocks.ALUMINUM_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "ardite", EOItems.ARDITE_INGOT.get(), EOBlocks.ARDITE_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "blue_steel", EOItems.BLUE_STEEL_INGOT.get(), EOBlocks.BLUE_STEEL_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "brass", EOItems.BRASS_INGOT.get(), EOBlocks.BRASS_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "britannia", EOItems.BRITANNIA_SILVER_INGOT.get(), EOBlocks.BRITANNIA_SILVER_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "bronze", EOItems.BRONZE_INGOT.get(), EOBlocks.BRONZE_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "catalyrium", EOItems.CATALYRIUM_INGOT.get(), EOBlocks.CATALYRIUM_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "cast_iron", EOItems.CAST_IRON_INGOT.get(), EOBlocks.CAST_IRON_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "cast_steel", EOItems.CAST_STEEL_INGOT.get(), EOBlocks.CAST_STEEL_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "cobalt", EOItems.COBALT_INGOT.get(), EOBlocks.COBALT_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "constantan", EOItems.CONSTANTAN_INGOT.get(), EOBlocks.CONSTANTAN_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "electrum", EOItems.ELECTRUM_INGOT.get(), EOBlocks.ELECTRUM_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "enderium", EOItems.ENDERIUM_INGOT.get(), EOBlocks.ENDERIUM_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "gallium", EOItems.GALLIUM_INGOT.get(), EOBlocks.GALLIUM_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "graphite", EOItems.GRAPHITE_INGOT.get(), EOBlocks.GRAPHITE_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "invar", EOItems.INVAR_INGOT.get(), EOBlocks.INVAR_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "iridium", EOItems.IRIDIUM_INGOT.get(), EOBlocks.IRIDIUM_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "lead", EOItems.LEAD_INGOT.get(), EOBlocks.LEAD_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "lumium", EOItems.LUMIUM_INGOT.get(), EOBlocks.LUMIUM_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "nethersteel", EOItems.NETHERSTEEL_INGOT.get(), EOBlocks.NETHERSTEEL_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "nickel", EOItems.NICKEL_INGOT.get(), EOBlocks.NICKEL_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "osmium", EOItems.OSMIUM_INGOT.get(), EOBlocks.OSMIUM_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "pewter", EOItems.PEWTER_INGOT.get(), EOBlocks.PEWTER_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "pig_iron", EOItems.PIG_IRON_INGOT.get(), EOBlocks.PIG_IRON_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "platinum", EOItems.PLATINUM_INGOT.get(), EOBlocks.PLATINUM_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "plutonium", EOItems.PLUTONIUM_INGOT.get(), EOBlocks.PLUTONIUM_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "rose_gold", EOItems.ROSE_GOLD_INGOT.get(), EOBlocks.ROSE_GOLD_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "signalum", EOItems.SIGNALUM_INGOT.get(), EOBlocks.SIGNALUM_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "silver", EOItems.SILVER_INGOT.get(), EOBlocks.SILVER_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "shadowsteel", EOItems.SHADOWSTEEL_INGOT.get(), EOBlocks.SHADOWSTEEL_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "steel", EOItems.STEEL_INGOT.get(), EOBlocks.STEEL_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "tin", EOItems.TIN_INGOT.get(), EOBlocks.TIN_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "titanium", EOItems.TITANIUM_INGOT.get(), EOBlocks.TITANIUM_BLOCK.asItem());
        //generateIngotToBlockRecipe(recipeOutput, "tungsten", EOItems.TUNGSTEN_INGOT.get(), EOBlocks.TUNGSTEN_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "ultimatitanium", EOItems.ULTIMATITANIUM_INGOT.get(), EOBlocks.ULTIMATITANIUM_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "uranium", EOItems.URANIUM_INGOT.get(), EOBlocks.URANIUM_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "uraninite", EOItems.URANINITE_INGOT.get(), EOBlocks.URANINITE_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "wrought_iron", EOItems.WROUGHT_IRON_INGOT.get(), EOBlocks.WROUGHT_IRON_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "zinc", EOItems.ZINC_INGOT.get(), EOBlocks.ZINC_BLOCK.asItem());
    }
}
