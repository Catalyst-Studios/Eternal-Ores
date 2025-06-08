package net.radzratz.eternalores.datagen.recipes.recipetypes.creation.item.ingot;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.radzratz.eternalores.item.EternalGeneralItems;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static net.radzratz.eternalores.datagen.recipes.recipetypes.creation.item.ingot.IngotRecipeEntry.generateNuggetToIngotRecipe;

public class EternalIngotProvider extends RecipeProvider implements IConditionBuilder
{
    public EternalIngotProvider(PackOutput output,
                                CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput)
    {
        //Vanilla Mats
        generateNuggetToIngotRecipe(recipeOutput, "copper", EternalGeneralItems.COPPER_NUGGET.get(), Items.COPPER_INGOT);
        generateNuggetToIngotRecipe(recipeOutput, "netherite", EternalGeneralItems.NETHERITE_NUGGET.get(), Items.NETHERITE_INGOT);

        //EO Mats
        generateNuggetToIngotRecipe(recipeOutput, "aluminum", EternalGeneralItems.ALUMINUM_NUGGET.get(), EternalGeneralItems.ALUMINUM_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "blue_steel", EternalGeneralItems.BLUE_STEEL_NUGGET.get(), EternalGeneralItems.BLUE_STEEL_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "brass", EternalGeneralItems.BRASS_NUGGET.get(), EternalGeneralItems.BRASS_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "britannia", EternalGeneralItems.BRITANNIA_SILVER_NUGGET.get(), EternalGeneralItems.BRITANNIA_SILVER_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "bronze", EternalGeneralItems.BRONZE_NUGGET.get(), EternalGeneralItems.BRONZE_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "catalyrium", EternalGeneralItems.CATALYRIUM_NUGGET.get(), EternalGeneralItems.CATALYRIUM_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "cast_iron", EternalGeneralItems.CAST_IRON_NUGGET.get(), EternalGeneralItems.CAST_IRON_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "cast_steel", EternalGeneralItems.CAST_STEEL_NUGGET.get(), EternalGeneralItems.CAST_STEEL_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "cobalt", EternalGeneralItems.COBALT_NUGGET.get(), EternalGeneralItems.COBALT_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "constantan", EternalGeneralItems.CONSTANTAN_NUGGET.get(), EternalGeneralItems.CONSTANTAN_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "electrum", EternalGeneralItems.ELECTRUM_NUGGET.get(), EternalGeneralItems.ELECTRUM_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "enderium", EternalGeneralItems.ENDERIUM_NUGGET.get(), EternalGeneralItems.ENDERIUM_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "gallium", EternalGeneralItems.GALLIUM_NUGGET.get(), EternalGeneralItems.GALLIUM_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "graphite", EternalGeneralItems.GRAPHITE_NUGGET.get(), EternalGeneralItems.GRAPHITE_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "invar", EternalGeneralItems.INVAR_NUGGET.get(), EternalGeneralItems.INVAR_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "iridium", EternalGeneralItems.IRIDIUM_NUGGET.get(), EternalGeneralItems.IRIDIUM_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "lead", EternalGeneralItems.LEAD_NUGGET.get(), EternalGeneralItems.LEAD_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "lumium", EternalGeneralItems.LUMIUM_NUGGET.get(), EternalGeneralItems.LUMIUM_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "nethersteel", EternalGeneralItems.NETHERSTEEL_NUGGET.get(), EternalGeneralItems.NETHERSTEEL_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "nickel", EternalGeneralItems.NICKEL_NUGGET.get(), EternalGeneralItems.NICKEL_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "osmium", EternalGeneralItems.OSMIUM_NUGGET.get(), EternalGeneralItems.OSMIUM_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "pewter", EternalGeneralItems.PEWTER_NUGGET.get(), EternalGeneralItems.PEWTER_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "pig_iron", EternalGeneralItems.PIG_IRON_NUGGET.get(), EternalGeneralItems.PIG_IRON_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "platinum", EternalGeneralItems.PLATINUM_NUGGET.get(), EternalGeneralItems.PLATINUM_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "plutonium", EternalGeneralItems.PLUTONIUM_NUGGET.get(), EternalGeneralItems.PLUTONIUM_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "rose_gold", EternalGeneralItems.ROSE_GOLD_NUGGET.get(), EternalGeneralItems.ROSE_GOLD_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "signalum", EternalGeneralItems.SIGNALUM_NUGGET.get(), EternalGeneralItems.SIGNALUM_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "silver", EternalGeneralItems.SILVER_NUGGET.get(), EternalGeneralItems.SILVER_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "shadowsteel", EternalGeneralItems.SHADOWSTEEL_NUGGET.get(), EternalGeneralItems.SHADOWSTEEL_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "steel", EternalGeneralItems.STEEL_NUGGET.get(), EternalGeneralItems.STEEL_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "tin", EternalGeneralItems.TIN_NUGGET.get(), EternalGeneralItems.TIN_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "titanium", EternalGeneralItems.TITANIUM_NUGGET.get(), EternalGeneralItems.TITANIUM_INGOT.get());
        //generateNuggetToIngotRecipe(recipeOutput, "tungsten", EternalGeneralItems.TUNGSTEN_NUGGET.get(), EternalGeneralItems.TUNGSTEN_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "ultimatitanium", EternalGeneralItems.ULTIMATITANIUM_NUGGET.get(), EternalGeneralItems.ULTIMATITANIUM_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "uraninite", EternalGeneralItems.URANINITE_NUGGET.get(), EternalGeneralItems.URANINITE_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "uranium", EternalGeneralItems.URANIUM_NUGGET.get(), EternalGeneralItems.URANIUM_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "wrought_iron", EternalGeneralItems.WROUGHT_IRON_NUGGET.get(), EternalGeneralItems.WROUGHT_IRON_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "zinc", EternalGeneralItems.ZINC_NUGGET.get(), EternalGeneralItems.ZINC_INGOT.get());
    }
}
