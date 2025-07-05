package net.radzratz.eternalores.datagen.recipes.recipetypes.creation.item.ingot;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.radzratz.eternalores.item.EOItems;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static net.radzratz.eternalores.datagen.recipes.recipetypes.creation.item.ingot.EOIngotRecipe.generateNuggetToIngotRecipe;

public class EOIngotEntries extends RecipeProvider implements IConditionBuilder
{
    public EOIngotEntries(PackOutput output,
                          CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput)
    {
        //Vanilla Mats
        generateNuggetToIngotRecipe(recipeOutput, "copper", EOItems.COPPER_NUGGET.get(), Items.COPPER_INGOT);
        generateNuggetToIngotRecipe(recipeOutput, "netherite", EOItems.NETHERITE_NUGGET.get(), Items.NETHERITE_INGOT);

        //EO Mats
        generateNuggetToIngotRecipe(recipeOutput, "aluminum", EOItems.ALUMINUM_NUGGET.get(), EOItems.ALUMINUM_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "ardite", EOItems.ARDITE_NUGGET.get(), EOItems.ARDITE_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "blue_steel", EOItems.BLUE_STEEL_NUGGET.get(), EOItems.BLUE_STEEL_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "brass", EOItems.BRASS_NUGGET.get(), EOItems.BRASS_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "britannia", EOItems.BRITANNIA_SILVER_NUGGET.get(), EOItems.BRITANNIA_SILVER_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "bronze", EOItems.BRONZE_NUGGET.get(), EOItems.BRONZE_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "catalyrium", EOItems.CATALYRIUM_NUGGET.get(), EOItems.CATALYRIUM_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "cast_iron", EOItems.CAST_IRON_NUGGET.get(), EOItems.CAST_IRON_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "cast_steel", EOItems.CAST_STEEL_NUGGET.get(), EOItems.CAST_STEEL_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "cobalt", EOItems.COBALT_NUGGET.get(), EOItems.COBALT_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "constantan", EOItems.CONSTANTAN_NUGGET.get(), EOItems.CONSTANTAN_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "electrum", EOItems.ELECTRUM_NUGGET.get(), EOItems.ELECTRUM_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "enderium", EOItems.ENDERIUM_NUGGET.get(), EOItems.ENDERIUM_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "gallium", EOItems.GALLIUM_NUGGET.get(), EOItems.GALLIUM_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "graphite", EOItems.GRAPHITE_NUGGET.get(), EOItems.GRAPHITE_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "invar", EOItems.INVAR_NUGGET.get(), EOItems.INVAR_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "iridium", EOItems.IRIDIUM_NUGGET.get(), EOItems.IRIDIUM_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "lead", EOItems.LEAD_NUGGET.get(), EOItems.LEAD_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "lumium", EOItems.LUMIUM_NUGGET.get(), EOItems.LUMIUM_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "nethersteel", EOItems.NETHERSTEEL_NUGGET.get(), EOItems.NETHERSTEEL_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "nickel", EOItems.NICKEL_NUGGET.get(), EOItems.NICKEL_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "osmium", EOItems.OSMIUM_NUGGET.get(), EOItems.OSMIUM_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "pewter", EOItems.PEWTER_NUGGET.get(), EOItems.PEWTER_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "pig_iron", EOItems.PIG_IRON_NUGGET.get(), EOItems.PIG_IRON_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "platinum", EOItems.PLATINUM_NUGGET.get(), EOItems.PLATINUM_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "plutonium", EOItems.PLUTONIUM_NUGGET.get(), EOItems.PLUTONIUM_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "rose_gold", EOItems.ROSE_GOLD_NUGGET.get(), EOItems.ROSE_GOLD_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "signalum", EOItems.SIGNALUM_NUGGET.get(), EOItems.SIGNALUM_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "silver", EOItems.SILVER_NUGGET.get(), EOItems.SILVER_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "shadowsteel", EOItems.SHADOWSTEEL_NUGGET.get(), EOItems.SHADOWSTEEL_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "steel", EOItems.STEEL_NUGGET.get(), EOItems.STEEL_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "tin", EOItems.TIN_NUGGET.get(), EOItems.TIN_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "titanium", EOItems.TITANIUM_NUGGET.get(), EOItems.TITANIUM_INGOT.get());
        //generateNuggetToIngotRecipe(recipeOutput, "tungsten", EOItems.TUNGSTEN_NUGGET.get(), EOItems.TUNGSTEN_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "ultimatitanium", EOItems.ULTIMATITANIUM_NUGGET.get(), EOItems.ULTIMATITANIUM_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "uraninite", EOItems.URANINITE_NUGGET.get(), EOItems.URANINITE_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "uranium", EOItems.URANIUM_NUGGET.get(), EOItems.URANIUM_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "wrought_iron", EOItems.WROUGHT_IRON_NUGGET.get(), EOItems.WROUGHT_IRON_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "zinc", EOItems.ZINC_NUGGET.get(), EOItems.ZINC_INGOT.get());
    }
}
