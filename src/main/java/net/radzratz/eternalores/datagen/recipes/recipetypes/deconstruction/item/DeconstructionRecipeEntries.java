package net.radzratz.eternalores.datagen.recipes.recipetypes.deconstruction.item;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class DeconstructionRecipeEntries extends RecipeProvider
{
    public DeconstructionRecipeEntries(PackOutput output,
                                       CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    public static void generateRodPlateToDustRecipe(@NotNull RecipeOutput recipeOutput,
                                                    String material,
                                                    Item rod,
                                                    Item plate,
                                                    Item dust)
    {
        // Rod -> 2 Dusts
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, dust, 2)
                .requires(rod)
                .requires(ItemTags.create(ResourceLocation.fromNamespaceAndPath("eternalores","tools/hammers")))
                .unlockedBy("has_" + material + "_rod", has(rod))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", "deconstruction/" + material + "_rod_to_dust_deconstruction"));

        // Plate -> 2 Dusts
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, dust, 2)
                .requires(plate)
                .requires(ItemTags.create(ResourceLocation.fromNamespaceAndPath("eternalores","tools/hammers")))
                .unlockedBy("has_" + material + "_plate", has(plate))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", "deconstruction/" + material + "_plate_to_dust_deconstruction"));
    }
}
