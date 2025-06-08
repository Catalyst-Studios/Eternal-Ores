package net.radzratz.eternalores.datagen.recipes.recipetypes.creation.item.dust;

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

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class DustDupeDecoEntries extends RecipeProvider
{
    public DustDupeDecoEntries(PackOutput output,
                               CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    private static final Set<String> EXCLUDED_MAT_DUPE_RECIPES = Set.of(
            "netherite", "apatite", "fluorite", "amber", "diamond", "emerald", "brass", "blue_steel",
            "britannia", "bronze", "constantan", "electrum", "coal", "ender", "endstone", "netherrack",
            "invar", "lapis", "cinnabar", "lumium", "niter", "obsidian", "peridot", "pewter", "plutonium",
            "quartz", "rose_gold", "ruby", "sapphire", "signalum", "steel", "titanium", "enderium",
            "cast_iron", "cast_steel", "wrought_iron", "nethersteel", "shadowsteel", "pig_iron",
            "necroticarite", "sculk", "amethyst", "nether_star"
    );

    public static void generateHammerRecipes(@NotNull RecipeOutput recipeOutput,
                                             String material,
                                             Item input,
                                             Item dust)
    {
        boolean isIngot = material.endsWith("_ingot");
        boolean isGem = material.endsWith("_gem");
        boolean isMisc = !isIngot && !isGem;

        String baseMaterial = material.replace("_ingot", "").replace("_gem", "");

        //Ingot/Gem/Misc -> Dust (1x)
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, dust, 1)
                .requires(input)
                .requires(ItemTags.create(ResourceLocation.fromNamespaceAndPath("eternalores","tools/hammers")))
                .unlockedBy("has_" + material, has(input))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", "dust_dupe/" + material + "_to_dust"));

        //Raw Materials -> Dust (2x)
        if(isIngot && !EXCLUDED_MAT_DUPE_RECIPES.contains(baseMaterial))
        {
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, dust, 2)
                    .requires(ItemTags.create(ResourceLocation.parse("c:raw_materials/" + baseMaterial)))
                    .requires(ItemTags.create(ResourceLocation.fromNamespaceAndPath("eternalores","tools/hammers")))
                    .unlockedBy("has_" + baseMaterial + "_raw", has(ItemTags.create(ResourceLocation.parse("c:raw_materials/" + baseMaterial))))
                    .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", "dust_dupe/" + baseMaterial + "_raw_to_dust"));
        }
    }
}
