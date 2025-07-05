package net.radzratz.eternalores.datagen.recipes.recipetypes.creation.item.rod;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class EORodRecipe extends RecipeProvider
{
    public EORodRecipe(PackOutput output,
                       CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    public static void generateIngotRodsRecipe(@NotNull RecipeOutput recipeOutput,
                                         String material,
                                         Item rod)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, rod, 1)
                .pattern("H  ")
                .pattern(" I ")
                .pattern("  I")
                .define('I', ItemTags.create(ResourceLocation.parse("c:ingots/" + material)))
                .define('H', ItemTags.create(ResourceLocation.fromNamespaceAndPath("eternalores","tools/hammers")))
                .unlockedBy("has_" + material + "_ingot", has(ItemTags.create(ResourceLocation.parse("c:ingots/" + material))))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", "rods/" + material + "_rod"));
    }

    public static void generateGemRodsRecipe(@NotNull RecipeOutput recipeOutput,
                                             String material,
                                             Item rod)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, rod, 1)
                .pattern("H  ")
                .pattern(" I ")
                .pattern("  I")
                .define('I', ItemTags.create(ResourceLocation.parse("c:gems/" + material)))
                .define('H', ItemTags.create(ResourceLocation.fromNamespaceAndPath("eternalores","tools/gem_cutter")))
                .unlockedBy("has_" + material + "_ingot", has(ItemTags.create(ResourceLocation.parse("c:gems/" + material))))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", "rods/" + material + "_rod"));
    }
}
