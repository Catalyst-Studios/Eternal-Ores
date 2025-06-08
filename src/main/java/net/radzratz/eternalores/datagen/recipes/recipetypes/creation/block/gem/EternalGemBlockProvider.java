package net.radzratz.eternalores.datagen.recipes.recipetypes.creation.block.gem;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.radzratz.eternalores.block.EternalGeneralBlocks;
import net.radzratz.eternalores.item.EternalGeneralItems;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static net.radzratz.eternalores.datagen.recipes.recipetypes.creation.block.gem.GemBlockEntry.generateGemToBlockRecipe;

public class EternalGemBlockProvider extends RecipeProvider implements IConditionBuilder
{
    public EternalGemBlockProvider(PackOutput output,
                                   CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput)
    {
        generateGemToBlockRecipe(recipeOutput, "amber", EternalGeneralItems.GEM_AMBER.get(), EternalGeneralBlocks.AMBER_BLOCK.asItem());
        generateGemToBlockRecipe(recipeOutput, "apatite", EternalGeneralItems.GEM_APATITE.get(), EternalGeneralBlocks.APATITE_BLOCK.asItem());
        generateGemToBlockRecipe(recipeOutput, "cinnabar", EternalGeneralItems.GEM_CINNABAR.get(), EternalGeneralBlocks.CINNABAR_BLOCK.asItem());
        generateGemToBlockRecipe(recipeOutput, "fluorite", EternalGeneralItems.FLUORITE.get(), EternalGeneralBlocks.FLUORITE_BLOCK.asItem());
        generateGemToBlockRecipe(recipeOutput, "necroticarite", EternalGeneralItems.GEM_NECROTICARITE.get(), EternalGeneralBlocks.NECROTICARITE_BLOCK.asItem());
        generateGemToBlockRecipe(recipeOutput, "niter", EternalGeneralItems.GEM_NITER.get(), EternalGeneralBlocks.NITER_BLOCK.asItem());
        generateGemToBlockRecipe(recipeOutput, "onyx", EternalGeneralItems.GEM_ONYX.get(), EternalGeneralBlocks.ONYX_BLOCK.asItem());
        generateGemToBlockRecipe(recipeOutput, "peridot", EternalGeneralItems.GEM_PERIDOT.get(), EternalGeneralBlocks.PERIDOT_BLOCK.asItem());
        generateGemToBlockRecipe(recipeOutput, "ruby", EternalGeneralItems.GEM_RUBY.get(), EternalGeneralBlocks.RUBY_BLOCK.asItem());
        generateGemToBlockRecipe(recipeOutput, "sapphire", EternalGeneralItems.GEM_SAPPHIRE.get(), EternalGeneralBlocks.SAPPHIRE_BLOCK.asItem());

        //not a gem but m'kay
        generateGemToBlockRecipe(recipeOutput, "nether_star", Items.NETHER_STAR, EternalGeneralBlocks.NETHER_STAR_BLOCK.asItem());
    }
}
