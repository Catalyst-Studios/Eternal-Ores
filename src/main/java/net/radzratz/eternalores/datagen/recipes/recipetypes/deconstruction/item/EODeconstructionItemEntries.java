package net.radzratz.eternalores.datagen.recipes.recipetypes.deconstruction.item;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.radzratz.eternalores.item.EOItems;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static net.radzratz.eternalores.datagen.recipes.recipetypes.deconstruction.item.EODeconstructionItemRecipe.generateRodPlateToDustRecipe;

public class EODeconstructionItemEntries extends RecipeProvider implements IConditionBuilder
{

    public EODeconstructionItemEntries(PackOutput output, CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput)
    {
        generateRodPlateToDustRecipe(recipeOutput, "iron", EOItems.PLATE_IRON.get(), EOItems.ROD_IRON.get(), EOItems.IRON_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "gold", EOItems.PLATE_GOLD.get(), EOItems.ROD_GOLD.get(), EOItems.GOLD_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "copper", EOItems.PLATE_COPPER.get(), EOItems.ROD_COPPER.get(), EOItems.COPPER_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "netherite", EOItems.PLATE_NETHERITE.get(), EOItems.ROD_NETHERITE.get(), EOItems.NETHERITE_DUST.get());

        generateRodPlateToDustRecipe(recipeOutput, "diamond", EOItems.PLATE_DIAMOND.get(), EOItems.ROD_DIAMOND.get(), EOItems.DIAMOND_DUST.get());

        //EO Mats
        generateRodPlateToDustRecipe(recipeOutput, "aluminum", EOItems.PLATE_ALUMINUM.get(), EOItems.ROD_ALUMINUM.get(), EOItems.ALUMINUM_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "ardite", EOItems.PLATE_ARDITE.get(), EOItems.ROD_ARDITE.get(), EOItems.ARDITE_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "blue_steel", EOItems.PLATE_BLUE_STEEL.get(), EOItems.ROD_BLUE_STEEL.get(), EOItems.BLUE_STEEL_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "brass", EOItems.PLATE_BRASS.get(), EOItems.ROD_BRASS.get(), EOItems.BRASS_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "bronze", EOItems.PLATE_BRONZE.get(), EOItems.ROD_BRONZE.get(), EOItems.BRONZE_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "cast_iron", EOItems.PLATE_CAST_IRON.get(), EOItems.ROD_CAST_IRON.get(), EOItems.CAST_IRON_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "cast_steel", EOItems.PLATE_CAST_STEEL.get(), EOItems.ROD_CAST_STEEL.get(), EOItems.CAST_STEEL_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "cobalt", EOItems.PLATE_COBALT.get(), EOItems.ROD_COBALT.get(), EOItems.COBALT_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "constantan", EOItems.PLATE_CONSTANTAN.get(), EOItems.ROD_CONSTANTAN.get(), EOItems.CONSTANTAN_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "electrum", EOItems.PLATE_ELECTRUM.get(), EOItems.ROD_ELECTRUM.get(), EOItems.ELECTRUM_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "enderium", EOItems.PLATE_ENDERIUM.get(), EOItems.ROD_ENDERIUM.get(), EOItems.ENDERIUM_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "gallium", EOItems.PLATE_GALLIUM.get(), EOItems.ROD_GALLIUM.get(), EOItems.GALLIUM_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "graphite", EOItems.PLATE_GRAPHITE.get(), EOItems.ROD_GRAPHITE.get(), EOItems.GRAPHITE_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "invar", EOItems.PLATE_INVAR.get(), EOItems.ROD_INVAR.get(), EOItems.INVAR_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "iridium", EOItems.ROD_IRIDIUM.get(), EOItems.PLATE_IRIDIUM.get(), EOItems.IRIDIUM_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "lead", EOItems.PLATE_LEAD.get(), EOItems.ROD_LEAD.get(), EOItems.LEAD_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "lumium", EOItems.PLATE_LUMIUM.get(), EOItems.ROD_LUMIUM.get(), EOItems.LUMIUM_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "nethersteel", EOItems.PLATE_NETHERSTEEL.get(), EOItems.ROD_NETHERSTEEL.get(), EOItems.NETHERSTEEL_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "nickel", EOItems.PLATE_NICKEL.get(), EOItems.ROD_NICKEL.get(), EOItems.NICKEL_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "osmium", EOItems.PLATE_OSMIUM.get(), EOItems.ROD_OSMIUM.get(), EOItems.OSMIUM_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "pig_iron", EOItems.PLATE_PIG_IRON.get(), EOItems.ROD_PIG_IRON.get(), EOItems.PIG_IRON_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "platinum", EOItems.PLATE_PLATINUM.get(), EOItems.ROD_PLATINUM.get(), EOItems.PLATINUM_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "plutonium", EOItems.PLATE_PLUTONIUM.get(), EOItems.ROD_PLUTONIUM.get(), EOItems.PLUTONIUM_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "rose_gold", EOItems.PLATE_ROSE_GOLD.get(), EOItems.ROD_ROSE_GOLD.get(), EOItems.ROSE_GOLD_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "signalum", EOItems.PLATE_SIGNALUM.get(), EOItems.ROD_SIGNALUM.get(), EOItems.SIGNALUM_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "silver", EOItems.PLATE_SILVER.get(), EOItems.ROD_SILVER.get(), EOItems.SILVER_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "shadowsteel", EOItems.PLATE_SHADOWSTEEL.get(), EOItems.ROD_SHADOWSTEEL.get(), EOItems.SHADOWSTEEL_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "steel", EOItems.PLATE_STEEL.get(), EOItems.ROD_STEEL.get(), EOItems.STEEL_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "tin", EOItems.PLATE_TIN.get(), EOItems.ROD_TIN.get(), EOItems.TIN_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "titanium", EOItems.PLATE_TITANIUM.get(), EOItems.ROD_TITANIUM.get(), EOItems.TITANIUM_DUST.get());
        //generateRodPlateToDustRecipe(recipeOutput, "tungsten", EOItems.PLATE_TUNGSTEN.get(), EOItems.ROD_TUNGSTEN.get(), EOItems.TUNGSTEN_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "ultimatitanium", EOItems.PLATE_ULTIMATITANIUM.get(), EOItems.ROD_ULTIMATITANIUM.get(), EOItems.ULTIMATITANIUM_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "uranium", EOItems.PLATE_URANIUM.get(), EOItems.ROD_URANIUM.get(), EOItems.URANIUM_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "wrought_iron", EOItems.PLATE_WROUGHT_IRON.get(), EOItems.ROD_WROUGHT_IRON.get(), EOItems.WROUGHT_IRON_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "zinc", EOItems.PLATE_ZINC.get(), EOItems.ROD_ZINC.get(), EOItems.ZINC_DUST.get());

        generateRodPlateToDustRecipe(recipeOutput, "necroticarite", EOItems.PLATE_NECROTICARITE.get(), EOItems.ROD_NECROTICARITE.get(), EOItems.NECROTICARITE_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "sapphire", EOItems.PLATE_SAPPHIRE.get(), EOItems.ROD_SAPPHIRE.get(), EOItems.SAPPHIRE_DUST.get());
    }
}
