package net.radzratz.eternalores.datagen.recipes.recipetypes.creation.block.gem;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.radzratz.eternalores.block.EOBlocks;
import net.radzratz.eternalores.item.EOItems;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static net.radzratz.eternalores.datagen.recipes.recipetypes.creation.block.gem.EOGemBlockRecipe.generateGemToBlockRecipe;

public class EOGemBlockEntries extends RecipeProvider implements IConditionBuilder
{
    public EOGemBlockEntries(PackOutput output,
                             CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput)
    {
        generateGemToBlockRecipe(recipeOutput, "amber", EOItems.GEM_AMBER.get(), EOBlocks.AMBER_BLOCK.asItem());
        generateGemToBlockRecipe(recipeOutput, "apatite", EOItems.GEM_APATITE.get(), EOBlocks.APATITE_BLOCK.asItem());
        generateGemToBlockRecipe(recipeOutput, "cinnabar", EOItems.GEM_CINNABAR.get(), EOBlocks.CINNABAR_BLOCK.asItem());
        generateGemToBlockRecipe(recipeOutput, "fluorite", EOItems.FLUORITE.get(), EOBlocks.FLUORITE_BLOCK.asItem());
        generateGemToBlockRecipe(recipeOutput, "necroticarite", EOItems.GEM_NECROTICARITE.get(), EOBlocks.NECROTICARITE_BLOCK.asItem());
        generateGemToBlockRecipe(recipeOutput, "niter", EOItems.GEM_NITER.get(), EOBlocks.NITER_BLOCK.asItem());
        generateGemToBlockRecipe(recipeOutput, "onyx", EOItems.GEM_ONYX.get(), EOBlocks.ONYX_BLOCK.asItem());
        generateGemToBlockRecipe(recipeOutput, "peridot", EOItems.GEM_PERIDOT.get(), EOBlocks.PERIDOT_BLOCK.asItem());
        generateGemToBlockRecipe(recipeOutput, "ruby", EOItems.GEM_RUBY.get(), EOBlocks.RUBY_BLOCK.asItem());
        generateGemToBlockRecipe(recipeOutput, "sapphire", EOItems.GEM_SAPPHIRE.get(), EOBlocks.SAPPHIRE_BLOCK.asItem());

        //not a gem but m'kay
        generateGemToBlockRecipe(recipeOutput, "nether_star", Items.NETHER_STAR, EOBlocks.NETHER_STAR_BLOCK.asItem());
    }
}
