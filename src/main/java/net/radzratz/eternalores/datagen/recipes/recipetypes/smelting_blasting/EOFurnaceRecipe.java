package net.radzratz.eternalores.datagen.recipes.recipetypes.smelting_blasting;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class EOFurnaceRecipe extends RecipeProvider
{
    public EOFurnaceRecipe(PackOutput output,
                           CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    ///Raw Material to Ingot Furnace/Blasting
    public static void generateRawOreToIngotFurnace(@NotNull RecipeOutput recipeOutput, String material, Item rawOre, Item ingot)
    {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(rawOre), RecipeCategory.MISC, ingot, 0.7f, 200)
                .unlockedBy("has_" + material + "_raw", has(rawOre))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", "raw_ore_smelting/" + material + "_raw_to_ingot_furnace"));
    }

    public static void generateRawOreToIngotBlasting(@NotNull RecipeOutput recipeOutput, String material, Item rawOre, Item ingot)
    {
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(rawOre), RecipeCategory.MISC, ingot, 0.7f, 100)
                .unlockedBy("has_" + material + "_raw", has(rawOre))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", "raw_ore_smelting/" + material + "_raw_to_ingot_blasting"));
    }

    ///Dust to Material Furnace/Blasting
    public static void generateDustToMaterialFurnace(@NotNull RecipeOutput recipeOutput, String material, Item dust, Item output)
    {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(dust), RecipeCategory.MISC, output, 0.7f, 200)
                .unlockedBy("has_" + material + "_dust", has(dust))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", "dust_smelting/" + material + "_dust_to_material_furnace"));
    }

    public static void generateDustToMaterialBlasting(@NotNull RecipeOutput recipeOutput, String material, Item dust, Item output)
    {
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(dust), RecipeCategory.MISC, output, 0.7f, 100)
                .unlockedBy("has_" + material + "_dust", has(dust))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", "dust_smelting/" + material + "_dust_to_material_blasting"));
    }

    ///Raw Ore Block to Block Furnace/Blasting
    public static void generateRawBlockToMaterialFurnace(@NotNull RecipeOutput recipeOutput, String material, Item rawBlock, Item output)
    {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(rawBlock), RecipeCategory.MISC, output, 0.7f, 200)
                .unlockedBy("has_" + material + "_raw_block", has(rawBlock))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", "raw_ore_block_smelting/" + material + "_raw_block_to_material_furnace"));
    }

    public static void generateRawBlockToMaterialBlasting(@NotNull RecipeOutput recipeOutput, String material, Item rawBlock, Item output)
    {
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(rawBlock), RecipeCategory.MISC, output, 0.7f, 100)
                .unlockedBy("has_" + material + "_raw_block", has(rawBlock))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", "raw_ore_block_smelting/" + material + "_raw_block_to_material_blasting"));
    }

    ///Ore Block to Material
    public static void generateOreBlockToMaterialFurnace(@NotNull RecipeOutput recipeOutput, String material, Item oreBlock, Item output)
    {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(oreBlock), RecipeCategory.MISC, output, 0.7f, 200)
                .unlockedBy("has_" + material + "_ore_block", has(oreBlock))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", "ore_block_smelting/" + material + "_ore_block_to_material_furnace"));
    }

    public static void generateOreBlockToMaterialBlasting(@NotNull RecipeOutput recipeOutput, String material, Item oreBlock, Item output)
    {
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(oreBlock), RecipeCategory.MISC, output, 0.7f, 100)
                .unlockedBy("has_" + material + "_ore_block", has(oreBlock))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", "ore_block_smelting/" + material + "_ore_block_to_material_blasting"));
    }
}
