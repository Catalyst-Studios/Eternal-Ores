package net.radzratz.eternalores.datagen.recipes.recipetypes.deconstruction.item;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.radzratz.eternalores.item.EternalGeneralItems;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static net.radzratz.eternalores.datagen.recipes.recipetypes.deconstruction.item.DeconstructionRecipeEntries.generateRodPlateToDustRecipe;

public class EternalDeconstructionProvider extends RecipeProvider implements IConditionBuilder
{

    public EternalDeconstructionProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput)
    {
        generateRodPlateToDustRecipe(recipeOutput, "iron", EternalGeneralItems.PLATE_IRON.get(), EternalGeneralItems.ROD_IRON.get(), EternalGeneralItems.IRON_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "gold", EternalGeneralItems.PLATE_GOLD.get(), EternalGeneralItems.ROD_GOLD.get(), EternalGeneralItems.GOLD_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "copper", EternalGeneralItems.PLATE_COPPER.get(), EternalGeneralItems.ROD_COPPER.get(), EternalGeneralItems.COPPER_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "netherite", EternalGeneralItems.PLATE_NETHERITE.get(), EternalGeneralItems.ROD_NETHERITE.get(), EternalGeneralItems.NETHERITE_DUST.get());

        generateRodPlateToDustRecipe(recipeOutput, "diamond", EternalGeneralItems.PLATE_DIAMOND.get(), EternalGeneralItems.ROD_DIAMOND.get(), EternalGeneralItems.DIAMOND_DUST.get());

        //EO Mats
        generateRodPlateToDustRecipe(recipeOutput, "aluminum", EternalGeneralItems.PLATE_ALUMINUM.get(), EternalGeneralItems.ROD_ALUMINUM.get(), EternalGeneralItems.ALUMINUM_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "blue_steel", EternalGeneralItems.PLATE_BLUE_STEEL.get(), EternalGeneralItems.ROD_BLUE_STEEL.get(), EternalGeneralItems.BLUE_STEEL_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "brass", EternalGeneralItems.PLATE_BRASS.get(), EternalGeneralItems.ROD_BRASS.get(), EternalGeneralItems.BRASS_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "bronze", EternalGeneralItems.PLATE_BRONZE.get(), EternalGeneralItems.ROD_BRONZE.get(), EternalGeneralItems.BRONZE_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "cast_iron", EternalGeneralItems.PLATE_CAST_IRON.get(), EternalGeneralItems.ROD_CAST_IRON.get(), EternalGeneralItems.CAST_IRON_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "cast_steel", EternalGeneralItems.PLATE_CAST_STEEL.get(), EternalGeneralItems.ROD_CAST_STEEL.get(), EternalGeneralItems.CAST_STEEL_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "cobalt", EternalGeneralItems.PLATE_COBALT.get(), EternalGeneralItems.ROD_COBALT.get(), EternalGeneralItems.COBALT_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "constantan", EternalGeneralItems.PLATE_CONSTANTAN.get(), EternalGeneralItems.ROD_CONSTANTAN.get(), EternalGeneralItems.CONSTANTAN_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "electrum", EternalGeneralItems.PLATE_ELECTRUM.get(), EternalGeneralItems.ROD_ELECTRUM.get(), EternalGeneralItems.ELECTRUM_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "enderium", EternalGeneralItems.PLATE_ENDERIUM.get(), EternalGeneralItems.ROD_ENDERIUM.get(), EternalGeneralItems.ENDERIUM_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "gallium", EternalGeneralItems.PLATE_GALLIUM.get(), EternalGeneralItems.ROD_GALLIUM.get(), EternalGeneralItems.GALLIUM_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "graphite", EternalGeneralItems.PLATE_GRAPHITE.get(), EternalGeneralItems.ROD_GRAPHITE.get(), EternalGeneralItems.GRAPHITE_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "invar", EternalGeneralItems.PLATE_INVAR.get(), EternalGeneralItems.ROD_INVAR.get(), EternalGeneralItems.INVAR_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "iridium", EternalGeneralItems.ROD_IRIDIUM.get(), EternalGeneralItems.PLATE_IRIDIUM.get(), EternalGeneralItems.IRIDIUM_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "lead", EternalGeneralItems.PLATE_LEAD.get(), EternalGeneralItems.ROD_LEAD.get(), EternalGeneralItems.LEAD_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "lumium", EternalGeneralItems.PLATE_LUMIUM.get(), EternalGeneralItems.ROD_LUMIUM.get(), EternalGeneralItems.LUMIUM_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "nethersteel", EternalGeneralItems.PLATE_NETHERSTEEL.get(), EternalGeneralItems.ROD_NETHERSTEEL.get(), EternalGeneralItems.NETHERSTEEL_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "nickel", EternalGeneralItems.PLATE_NICKEL.get(), EternalGeneralItems.ROD_NICKEL.get(), EternalGeneralItems.NICKEL_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "osmium", EternalGeneralItems.PLATE_OSMIUM.get(), EternalGeneralItems.ROD_OSMIUM.get(), EternalGeneralItems.OSMIUM_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "pig_iron", EternalGeneralItems.PLATE_PIG_IRON.get(), EternalGeneralItems.ROD_PIG_IRON.get(), EternalGeneralItems.PIG_IRON_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "platinum", EternalGeneralItems.PLATE_PLATINUM.get(), EternalGeneralItems.ROD_PLATINUM.get(), EternalGeneralItems.PLATINUM_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "plutonium", EternalGeneralItems.PLATE_PLUTONIUM.get(), EternalGeneralItems.ROD_PLUTONIUM.get(), EternalGeneralItems.PLUTONIUM_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "rose_gold", EternalGeneralItems.PLATE_ROSE_GOLD.get(), EternalGeneralItems.ROD_ROSE_GOLD.get(), EternalGeneralItems.ROSE_GOLD_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "signalum", EternalGeneralItems.PLATE_SIGNALUM.get(), EternalGeneralItems.ROD_SIGNALUM.get(), EternalGeneralItems.SIGNALUM_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "silver", EternalGeneralItems.PLATE_SILVER.get(), EternalGeneralItems.ROD_SILVER.get(), EternalGeneralItems.SILVER_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "shadowsteel", EternalGeneralItems.PLATE_SHADOWSTEEL.get(), EternalGeneralItems.ROD_SHADOWSTEEL.get(), EternalGeneralItems.SHADOWSTEEL_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "steel", EternalGeneralItems.PLATE_STEEL.get(), EternalGeneralItems.ROD_STEEL.get(), EternalGeneralItems.STEEL_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "tin", EternalGeneralItems.PLATE_TIN.get(), EternalGeneralItems.ROD_TIN.get(), EternalGeneralItems.TIN_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "titanium", EternalGeneralItems.PLATE_TITANIUM.get(), EternalGeneralItems.ROD_TITANIUM.get(), EternalGeneralItems.TITANIUM_DUST.get());
        //generateRodPlateToDustRecipe(recipeOutput, "tungsten", EternalGeneralItems.PLATE_TUNGSTEN.get(), EternalGeneralItems.ROD_TUNGSTEN.get(), EternalGeneralItems.TUNGSTEN_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "ultimatitanium", EternalGeneralItems.PLATE_ULTIMATITANIUM.get(), EternalGeneralItems.ROD_ULTIMATITANIUM.get(), EternalGeneralItems.ULTIMATITANIUM_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "uranium", EternalGeneralItems.PLATE_URANIUM.get(), EternalGeneralItems.ROD_URANIUM.get(),EternalGeneralItems.URANIUM_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "wrought_iron", EternalGeneralItems.PLATE_WROUGHT_IRON.get(), EternalGeneralItems.ROD_WROUGHT_IRON.get(),EternalGeneralItems.WROUGHT_IRON_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "zinc", EternalGeneralItems.PLATE_ZINC.get(), EternalGeneralItems.ROD_ZINC.get(), EternalGeneralItems.ZINC_DUST.get());

        generateRodPlateToDustRecipe(recipeOutput, "necroticarite", EternalGeneralItems.PLATE_NECROTICARITE.get(), EternalGeneralItems.ROD_NECROTICARITE.get(), EternalGeneralItems.NECROTICARITE_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "sapphire", EternalGeneralItems.PLATE_SAPPHIRE.get(), EternalGeneralItems.ROD_SAPPHIRE.get(), EternalGeneralItems.SAPPHIRE_DUST.get());
    }
}
