package net.radzratz.eternalores.util.compat.powah.recipes.orb;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.radzratz.eternalores.datagen.recipes.EOAdvancementYeeter;
import owmii.powah.Powah;
import owmii.powah.block.energizing.EnergizingRecipe;
import owmii.powah.item.Itms;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static net.minecraft.world.item.Items.*;
import static net.neoforged.neoforge.common.Tags.Items.*;
import static net.radzratz.eternalores.item.EOItemRegistry.*;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.tags.item.dusts.EOGemDustsTags.Items.*;
import static net.radzratz.eternalores.util.tags.item.dusts.EOMetalDustsTags.Items.*;
import static net.radzratz.eternalores.util.tags.item.dusts.EOMiscDustsTags.Items.*;
import static net.radzratz.eternalores.util.tags.item.dusts.EOStoneDustsTags.Items.*;
import static net.radzratz.eternalores.util.tags.item.gems.EOGemTags.Items.*;
import static net.radzratz.eternalores.util.tags.item.ingots.EOIngotTags.Items.*;
import static net.radzratz.eternalores.util.tags.item.ores.EOOreBlockItemTags.Items.*;
import static net.radzratz.eternalores.util.tags.item.raw_materials.EORawMaterialTags.*;
import static owmii.powah.data.ITags.Items.*;

public class EOPowahOrbRecipe extends RecipeProvider
{
    public EOPowahOrbRecipe(PackOutput output, CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    public static void registerEnergizingRecipe(RecipeOutput output, String recipeName, ItemStack result, int energy, Ingredient... inputs)
    {
        List<Ingredient> ingredients = List.of(inputs);
        EnergizingRecipe recipe = new EnergizingRecipe(result, energy, ingredients);
        output.accept(Powah.id("energizing/" + recipeName), recipe, null);
    }

    public static void registerEOCompatRecipes(RecipeOutput output, String recipeName, ItemStack result, int energy, Ingredient... inputs)
    {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        List<Ingredient> ingredients = List.of(inputs);
        EnergizingRecipe recipe = new EnergizingRecipe(result, energy, ingredients);
        yeet.accept(EO("powah_compat/" + recipeName), recipe, null);
    }

    public static void energizingOrbRecipes(RecipeOutput output)
    {
        if (eternaloresMod)
        {
            EOPowahOrbRecipe.registerEnergizingRecipe(output,
                    "uraninite_from_raw",
                    URANINITE_INGOT.toStack(2), 2000,
                    Ingredient.of(TAG_RAW_URANINITE));

            EOPowahOrbRecipe.registerEnergizingRecipe(output,
                    "uraninite_from_uranium",
                    URANINITE_INGOT.toStack(1), 30000,
                    Ingredient.of(TAG_URANIUM_INGOT));

            EOPowahOrbRecipe.registerEnergizingRecipe(output,
                    "uraninite_from_ore",
                    URANINITE_INGOT.toStack(5), 50000,
                    Ingredient.of(I_URANINITE_ORE));

            EOPowahOrbRecipe.registerEnergizingRecipe(output,
                    "uraninite_from_ore_poor",
                    URANINITE_INGOT.toStack(3), 25000,
                    Ingredient.of(URANINITE_ORE_POOR));

            EOPowahOrbRecipe.registerEnergizingRecipe(output,
                    "uraninite_from_ore_dense",
                    URANINITE_INGOT.toStack(10), 100000,
                    Ingredient.of(URANINITE_ORE_DENSE));
        }

        /// EO Alloys
        EOPowahOrbRecipe.registerEOCompatRecipes(output,
                "brass_orb_alloying",
                BRASS_INGOT.toStack(2), 16000,
                Ingredient.of(INGOTS_COPPER), Ingredient.of(TAG_ZINC_INGOT));

        EOPowahOrbRecipe.registerEOCompatRecipes(output,
                "britannia_orb_alloying",
                BRITANNIA_SILVER_INGOT.toStack(2), 16000,
                Ingredient.of(INGOTS_COPPER), Ingredient.of(TAG_SILVER_INGOT));

        EOPowahOrbRecipe.registerEOCompatRecipes(output,
                "bronze_orb_alloying",
                BRONZE_INGOT.toStack(2), 16000,
                Ingredient.of(INGOTS_COPPER), Ingredient.of(TAG_TIN_INGOT));

        EOPowahOrbRecipe.registerEOCompatRecipes(output,
                "cast_iron_orb_alloying",
                CAST_IRON_INGOT.toStack(2), 16000,
                Ingredient.of(INGOTS_IRON), Ingredient.of(CARBON_BLEND));

        EOPowahOrbRecipe.registerEOCompatRecipes(output,
                "cast_steel_orb_alloying",
                CAST_STEEL_INGOT.toStack(2), 16000,
                Ingredient.of(TAG_STEEL_INGOT), Ingredient.of(CARBON_BLEND));

        EOPowahOrbRecipe.registerEOCompatRecipes(output,
                "constantan_orb_alloying",
                CONSTANTAN_INGOT.toStack(2), 16000,
                Ingredient.of(INGOTS_COPPER), Ingredient.of(TAG_NICKEL_INGOT));

        EOPowahOrbRecipe.registerEOCompatRecipes(output,
                "electrum_orb_alloying",
                ELECTRUM_INGOT.toStack(2), 16000,
                Ingredient.of(INGOTS_GOLD), Ingredient.of(TAG_SILVER_INGOT));

        EOPowahOrbRecipe.registerEOCompatRecipes(output,
                "enderium_orb_alloying",
                ENDERIUM_INGOT.toStack(2), 16000,
                Ingredient.of(TAG_LEAD_INGOT), Ingredient.of(DUST_ENDER), Ingredient.of(DUSTS_GLOWSTONE));

        EOPowahOrbRecipe.registerEOCompatRecipes(output,
                "enderium_var_orb_alloying",
                ENDERIUM_INGOT.toStack(2), 16000,
                Ingredient.of(TAG_LEAD_INGOT), Ingredient.of(ENDERGETIC_BLEND));

        EOPowahOrbRecipe.registerEOCompatRecipes(output,
                "graphite_orb_alloying",
                GRAPHITE_INGOT.toStack(1), 16000,
                Ingredient.of(COAL_DUST));

        EOPowahOrbRecipe.registerEOCompatRecipes(output,
                "invar_orb_alloying",
                INVAR_INGOT.toStack(2), 16000,
                Ingredient.of(INGOTS_IRON), Ingredient.of(TAG_NICKEL_INGOT));

        EOPowahOrbRecipe.registerEOCompatRecipes(output,
                "lumium_orb_alloying",
                LUMIUM_INGOT.toStack(2), 16000,
                Ingredient.of(TAG_SILVER_INGOT), Ingredient.of(DUSTS_GLOWSTONE), Ingredient.of(TAG_TIN_INGOT));

        EOPowahOrbRecipe.registerEOCompatRecipes(output,
                "lumium_var_orb_alloying",
                LUMIUM_INGOT.toStack(2), 16000,
                Ingredient.of(TAG_SILVER_INGOT), Ingredient.of(ENERGETIC_BLEND));

        EOPowahOrbRecipe.registerEOCompatRecipes(output,
                "nethersteel_orb_alloying",
                NETHERSTEEL_INGOT.toStack(2), 16000,
                Ingredient.of(DUST_NETHERRACK), Ingredient.of(INGOTS_NETHERITE), Ingredient.of(TAG_STEEL_INGOT));

        EOPowahOrbRecipe.registerEOCompatRecipes(output,
                "pewter_orb_alloying",
                PEWTER_INGOT.toStack(2), 16000,
                Ingredient.of(TAG_SILVER_INGOT), Ingredient.of(TAG_TIN_INGOT));

        EOPowahOrbRecipe.registerEOCompatRecipes(output,
                "pig_iron_orb_alloying",
                PIG_IRON_INGOT.toStack(2), 16000,
                Ingredient.of(RAW_MATERIALS_IRON), Ingredient.of(CARBON_BLEND));

        EOPowahOrbRecipe.registerEOCompatRecipes(output,
                "rose_gold_orb_alloying",
                ROSE_GOLD_INGOT.toStack(2), 16000,
                Ingredient.of(INGOTS_COPPER), Ingredient.of(INGOTS_GOLD));

        EOPowahOrbRecipe.registerEOCompatRecipes(output,
                "signalum_orb_alloying",
                SIGNALUM_INGOT.toStack(2), 16000,
                Ingredient.of(INGOTS_COPPER), Ingredient.of(DUSTS_REDSTONE), Ingredient.of(DUST_SILVER));

        EOPowahOrbRecipe.registerEOCompatRecipes(output,
                "signalum_var_orb_alloying",
                SIGNALUM_INGOT.toStack(2), 16000,
                Ingredient.of(INGOTS_COPPER), Ingredient.of(ENERGETIC_BLEND));

        EOPowahOrbRecipe.registerEOCompatRecipes(output,
                "shadowsteel_orb_alloying",
                SHADOWSTEEL_INGOT.toStack(2), 16000,
                Ingredient.of(TAG_GEM_NECROTICARITE), Ingredient.of(TAG_STEEL_INGOT), Ingredient.of(DUST_SCULK));

        EOPowahOrbRecipe.registerEOCompatRecipes(output,
                "steel_orb_alloying",
                STEEL_INGOT.toStack(2), 16000,
                Ingredient.of(INGOTS_IRON), Ingredient.of(DUST_COAL));

        EOPowahOrbRecipe.registerEOCompatRecipes(output,
                "steel_var_orb_alloying",
                STEEL_INGOT.toStack(2), 16000,
                Ingredient.of(WROUGHT_IRON_INGOT), Ingredient.of(CARBON_BLEND));

        EOPowahOrbRecipe.registerEOCompatRecipes(output,
                "wrought_iron_orb_alloying",
                WROUGHT_IRON_INGOT.toStack(2), 16000,
                Ingredient.of(INGOTS_IRON), Ingredient.of(COAL_BLOCK));

        /// Powah Crystals
        EOPowahOrbRecipe.registerEOCompatRecipes(output,
                "niotic_from_sapphire",
                Itms.NIOTIC_CRYSTAL.toStack(1), 300000,
                Ingredient.of(TAG_GEM_SAPPHIRE));

        EOPowahOrbRecipe.registerEOCompatRecipes(output,
                "spirited_from_peridot",
                Itms.SPIRITED_CRYSTAL.toStack(1), 1000000,
                Ingredient.of(TAG_GEM_PERIDOT));
    }
}
