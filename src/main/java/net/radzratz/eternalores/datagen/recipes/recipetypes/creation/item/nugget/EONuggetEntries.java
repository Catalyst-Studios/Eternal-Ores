package net.radzratz.eternalores.datagen.recipes.recipetypes.creation.item.nugget;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.radzratz.eternalores.item.EOItems;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static net.radzratz.eternalores.datagen.recipes.recipetypes.creation.item.nugget.EONuggetRecipe.generateIngotToNuggetRecipe;

public class EONuggetEntries extends RecipeProvider implements IConditionBuilder
{
    public EONuggetEntries(PackOutput output,
                           CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput)
    {
        //Vanilla Mats
        generateIngotToNuggetRecipe(recipeOutput, "copper", Items.COPPER_INGOT, EOItems.COPPER_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "netherite", Items.NETHERITE_INGOT, EOItems.NETHERITE_NUGGET.get());

        //EO Mats
        generateIngotToNuggetRecipe(recipeOutput, "aluminum", EOItems.ALUMINUM_INGOT.get(), EOItems.ALUMINUM_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "ardite", EOItems.ARDITE_INGOT.get(), EOItems.ARDITE_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "blue_steel", EOItems.BLUE_STEEL_INGOT.get(), EOItems.BLUE_STEEL_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "brass", EOItems.BRASS_INGOT.get(), EOItems.BRASS_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "britannia", EOItems.BRITANNIA_SILVER_INGOT.get(), EOItems.BRITANNIA_SILVER_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "bronze", EOItems.BRONZE_INGOT.get(), EOItems.BRONZE_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "catalyrium", EOItems.CATALYRIUM_INGOT.get(), EOItems.CATALYRIUM_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "cast_iron", EOItems.CAST_IRON_INGOT.get(), EOItems.CAST_IRON_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "cast_steel", EOItems.CAST_STEEL_INGOT.get(), EOItems.CAST_STEEL_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "cobalt", EOItems.COBALT_INGOT.get(), EOItems.COBALT_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "constantan", EOItems.CONSTANTAN_INGOT.get(), EOItems.CONSTANTAN_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "electrum", EOItems.ELECTRUM_INGOT.get(), EOItems.ELECTRUM_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "enderium", EOItems.ENDERIUM_INGOT.get(), EOItems.ENDERIUM_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "gallium", EOItems.GALLIUM_INGOT.get(), EOItems.GALLIUM_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "graphite", EOItems.GRAPHITE_INGOT.get(), EOItems.GRAPHITE_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "invar", EOItems.INVAR_INGOT.get(), EOItems.INVAR_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "iridium", EOItems.IRIDIUM_INGOT.get(), EOItems.IRIDIUM_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "lead", EOItems.LEAD_INGOT.get(), EOItems.LEAD_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "lumium", EOItems.LUMIUM_INGOT.get(), EOItems.LUMIUM_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "nethersteel", EOItems.NETHERSTEEL_INGOT.get(), EOItems.NETHERSTEEL_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "nickel", EOItems.NICKEL_INGOT.get(), EOItems.NICKEL_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "osmium", EOItems.OSMIUM_INGOT.get(), EOItems.OSMIUM_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "pewter", EOItems.PEWTER_INGOT.get(), EOItems.PEWTER_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "pig_iron", EOItems.PIG_IRON_INGOT.get(), EOItems.PIG_IRON_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "platinum", EOItems.PLATINUM_INGOT.get(), EOItems.PLATINUM_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "plutonium", EOItems.PLUTONIUM_INGOT.get(), EOItems.PLUTONIUM_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "rose_gold", EOItems.ROSE_GOLD_INGOT.get(), EOItems.ROSE_GOLD_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "signalum", EOItems.SIGNALUM_INGOT.get(), EOItems.SIGNALUM_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "silver", EOItems.SILVER_INGOT.get(), EOItems.SILVER_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "shadowsteel", EOItems.SHADOWSTEEL_INGOT.get(), EOItems.SHADOWSTEEL_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "steel", EOItems.STEEL_INGOT.get(), EOItems.STEEL_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "tin", EOItems.TIN_INGOT.get(), EOItems.TIN_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "titanium", EOItems.TITANIUM_INGOT.get(), EOItems.TITANIUM_NUGGET.get());
        //generateIngotToNuggetRecipe(recipeOutput, "tungsten", EOItems.TUNGSTEN_INGOT.get(), EOItems.TUNGSTEN_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "ultimatitanium", EOItems.ULTIMATITANIUM_INGOT.get(), EOItems.ULTIMATITANIUM_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "uraninite", EOItems.URANINITE_INGOT.get(), EOItems.URANINITE_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "uranium", EOItems.URANIUM_INGOT.get(), EOItems.URANIUM_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "wrought_iron", EOItems.WROUGHT_IRON_INGOT.get(), EOItems.WROUGHT_IRON_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "zinc", EOItems.ZINC_INGOT.get(), EOItems.ZINC_NUGGET.get());
    }
}
