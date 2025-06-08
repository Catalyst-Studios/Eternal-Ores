package net.radzratz.eternalores.datagen.recipes.recipetypes.creation.item.nugget;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.radzratz.eternalores.item.EternalGeneralItems;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static net.radzratz.eternalores.datagen.recipes.recipetypes.creation.item.nugget.NuggetRecipeEntry.generateIngotToNuggetRecipe;

public class EternalNuggetProvider extends RecipeProvider implements IConditionBuilder
{
    public EternalNuggetProvider(PackOutput output,
                                 CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput)
    {
        //Vanilla Mats
        generateIngotToNuggetRecipe(recipeOutput, "copper", Items.COPPER_INGOT, EternalGeneralItems.COPPER_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "netherite", Items.NETHERITE_INGOT, EternalGeneralItems.NETHERITE_NUGGET.get());

        //EO Mats
        generateIngotToNuggetRecipe(recipeOutput, "aluminum", EternalGeneralItems.ALUMINUM_INGOT.get(), EternalGeneralItems.ALUMINUM_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "blue_steel", EternalGeneralItems.BLUE_STEEL_INGOT.get(), EternalGeneralItems.BLUE_STEEL_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "brass", EternalGeneralItems.BRASS_INGOT.get(), EternalGeneralItems.BRASS_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "britannia", EternalGeneralItems.BRITANNIA_SILVER_INGOT.get(), EternalGeneralItems.BRITANNIA_SILVER_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "bronze", EternalGeneralItems.BRONZE_INGOT.get(), EternalGeneralItems.BRONZE_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "catalyrium", EternalGeneralItems.CATALYRIUM_INGOT.get(), EternalGeneralItems.CATALYRIUM_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "cast_iron", EternalGeneralItems.CAST_IRON_INGOT.get(), EternalGeneralItems.CAST_IRON_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "cast_steel", EternalGeneralItems.CAST_STEEL_INGOT.get(), EternalGeneralItems.CAST_STEEL_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "cobalt", EternalGeneralItems.COBALT_INGOT.get(), EternalGeneralItems.COBALT_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "constantan", EternalGeneralItems.CONSTANTAN_INGOT.get(), EternalGeneralItems.CONSTANTAN_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "electrum", EternalGeneralItems.ELECTRUM_INGOT.get(), EternalGeneralItems.ELECTRUM_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "enderium", EternalGeneralItems.ENDERIUM_INGOT.get(), EternalGeneralItems.ENDERIUM_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "gallium", EternalGeneralItems.GALLIUM_INGOT.get(), EternalGeneralItems.GALLIUM_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "graphite", EternalGeneralItems.GRAPHITE_INGOT.get(), EternalGeneralItems.GRAPHITE_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "invar", EternalGeneralItems.INVAR_INGOT.get(), EternalGeneralItems.INVAR_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "iridium", EternalGeneralItems.IRIDIUM_INGOT.get(), EternalGeneralItems.IRIDIUM_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "lead", EternalGeneralItems.LEAD_INGOT.get(), EternalGeneralItems.LEAD_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "lumium", EternalGeneralItems.LUMIUM_INGOT.get(), EternalGeneralItems.LUMIUM_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "nethersteel", EternalGeneralItems.NETHERSTEEL_INGOT.get(), EternalGeneralItems.NETHERSTEEL_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "nickel", EternalGeneralItems.NICKEL_INGOT.get(), EternalGeneralItems.NICKEL_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "osmium", EternalGeneralItems.OSMIUM_INGOT.get(), EternalGeneralItems.OSMIUM_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "pewter", EternalGeneralItems.PEWTER_INGOT.get(), EternalGeneralItems.PEWTER_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "pig_iron", EternalGeneralItems.PIG_IRON_INGOT.get(), EternalGeneralItems.PIG_IRON_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "platinum", EternalGeneralItems.PLATINUM_INGOT.get(), EternalGeneralItems.PLATINUM_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "plutonium", EternalGeneralItems.PLUTONIUM_INGOT.get(), EternalGeneralItems.PLUTONIUM_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "rose_gold", EternalGeneralItems.ROSE_GOLD_INGOT.get(), EternalGeneralItems.ROSE_GOLD_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "signalum", EternalGeneralItems.SIGNALUM_INGOT.get(), EternalGeneralItems.SIGNALUM_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "silver", EternalGeneralItems.SILVER_INGOT.get(), EternalGeneralItems.SILVER_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "shadowsteel", EternalGeneralItems.SHADOWSTEEL_INGOT.get(), EternalGeneralItems.SHADOWSTEEL_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "steel", EternalGeneralItems.STEEL_INGOT.get(), EternalGeneralItems.STEEL_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "tin", EternalGeneralItems.TIN_INGOT.get(), EternalGeneralItems.TIN_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "titanium", EternalGeneralItems.TITANIUM_INGOT.get(), EternalGeneralItems.TITANIUM_NUGGET.get());
        //generateIngotToNuggetRecipe(recipeOutput, "tungsten", EternalGeneralItems.TUNGSTEN_INGOT.get(), EternalGeneralItems.TUNGSTEN_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "ultimatitanium", EternalGeneralItems.ULTIMATITANIUM_INGOT.get(), EternalGeneralItems.ULTIMATITANIUM_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "uraninite", EternalGeneralItems.URANINITE_INGOT.get(), EternalGeneralItems.URANINITE_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "uranium", EternalGeneralItems.URANIUM_INGOT.get(), EternalGeneralItems.URANIUM_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "wrought_iron", EternalGeneralItems.WROUGHT_IRON_INGOT.get(), EternalGeneralItems.WROUGHT_IRON_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "zinc", EternalGeneralItems.ZINC_INGOT.get(), EternalGeneralItems.ZINC_NUGGET.get());
    }
}
