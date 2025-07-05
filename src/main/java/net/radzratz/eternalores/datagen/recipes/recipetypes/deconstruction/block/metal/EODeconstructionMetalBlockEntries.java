package net.radzratz.eternalores.datagen.recipes.recipetypes.deconstruction.block.metal;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.radzratz.eternalores.block.EOBlocks;
import net.radzratz.eternalores.item.EOItems;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static net.radzratz.eternalores.datagen.recipes.recipetypes.deconstruction.block.metal.EODeconstructionMetalBlockRecipe.generateBlockToIngotMaterialRecipe;

public class EODeconstructionMetalBlockEntries extends RecipeProvider implements IConditionBuilder
{
    public EODeconstructionMetalBlockEntries(PackOutput output,
                                             CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput)
    {
        generateBlockToIngotMaterialRecipe(recipeOutput, "aluminum", EOBlocks.ALUMINUM_BLOCK.asItem(), EOItems.ALUMINUM_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "ardite", EOBlocks.ARDITE_BLOCK.asItem(), EOItems.ARDITE_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "blue_steel", EOBlocks.BLUE_STEEL_BLOCK.asItem(), EOItems.BLUE_STEEL_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "brass", EOBlocks.BRASS_BLOCK.asItem(), EOItems.BRASS_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "britannia", EOBlocks.BRITANNIA_SILVER_BLOCK.asItem(), EOItems.BRITANNIA_SILVER_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "bronze", EOBlocks.BRONZE_BLOCK.asItem(), EOItems.BRONZE_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "catalyrium", EOBlocks.CATALYRIUM_BLOCK.asItem(), EOItems.CATALYRIUM_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "cast_iron", EOBlocks.CAST_IRON_BLOCK.asItem(), EOItems.CAST_IRON_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "cast_steel", EOBlocks.CAST_STEEL_BLOCK.asItem(), EOItems.CAST_STEEL_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "cobalt", EOBlocks.COBALT_BLOCK.asItem(), EOItems.COBALT_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "constantan", EOBlocks.CONSTANTAN_BLOCK.asItem(), EOItems.CONSTANTAN_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "electrum", EOBlocks.ELECTRUM_BLOCK.asItem(), EOItems.ELECTRUM_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "enderium", EOBlocks.ENDERIUM_BLOCK.asItem(), EOItems.ENDERIUM_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "gallium", EOBlocks.GALLIUM_BLOCK.asItem(), EOItems.GALLIUM_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "graphite", EOBlocks.GRAPHITE_BLOCK.asItem(), EOItems.GRAPHITE_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "invar", EOBlocks.INVAR_BLOCK.asItem(), EOItems.INVAR_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "iridium", EOBlocks.IRIDIUM_BLOCK.asItem(), EOItems.IRIDIUM_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "lead", EOBlocks.LEAD_BLOCK.asItem(), EOItems.LEAD_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "lumium", EOBlocks.LUMIUM_BLOCK.asItem(), EOItems.LUMIUM_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "nethersteel", EOBlocks.NETHERSTEEL_BLOCK.asItem(), EOItems.NETHERSTEEL_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "nickel", EOBlocks.NICKEL_BLOCK.asItem(), EOItems.NICKEL_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "osmium", EOBlocks.OSMIUM_BLOCK.asItem(), EOItems.OSMIUM_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "pewter", EOBlocks.PEWTER_BLOCK.asItem(), EOItems.PEWTER_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "pig_iron", EOBlocks.PIG_IRON_BLOCK.asItem(), EOItems.PIG_IRON_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "platinum", EOBlocks.PLATINUM_BLOCK.asItem(), EOItems.PLATINUM_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "plutonium", EOBlocks.PLUTONIUM_BLOCK.asItem(), EOItems.PLUTONIUM_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "rose_gold", EOBlocks.ROSE_GOLD_BLOCK.asItem(), EOItems.ROSE_GOLD_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "signalum", EOBlocks.SIGNALUM_BLOCK.asItem(), EOItems.SIGNALUM_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "silver", EOBlocks.SILVER_BLOCK.asItem(), EOItems.SILVER_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "shadowsteel", EOBlocks.SHADOWSTEEL_BLOCK.asItem(), EOItems.SHADOWSTEEL_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "steel", EOBlocks.STEEL_BLOCK.asItem(), EOItems.STEEL_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "tin", EOBlocks.TIN_BLOCK.asItem(), EOItems.TIN_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "titanium", EOBlocks.TITANIUM_BLOCK.asItem(), EOItems.TITANIUM_INGOT.get());
        //generateBlockToIngotMaterialRecipe(recipeOutput, "tungsten", EOBlocks.TUNGSTEN_BLOCK.asItem(), EOItems.TUNGSTEN_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "ultimatitanium", EOBlocks.ULTIMATITANIUM_BLOCK.asItem(), EOItems.ULTIMATITANIUM_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "uraninite", EOBlocks.URANINITE_BLOCK.asItem(), EOItems.URANINITE_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "uranium", EOBlocks.URANIUM_BLOCK.asItem(), EOItems.URANIUM_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "wrought_iron", EOBlocks.WROUGHT_IRON_BLOCK.asItem(), EOItems.WROUGHT_IRON_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "zinc", EOBlocks.ZINC_BLOCK.asItem(), EOItems.ZINC_INGOT.get());
    }
}
