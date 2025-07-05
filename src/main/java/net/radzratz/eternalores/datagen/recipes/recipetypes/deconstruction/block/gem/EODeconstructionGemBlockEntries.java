package net.radzratz.eternalores.datagen.recipes.recipetypes.deconstruction.block.gem;

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

import static net.radzratz.eternalores.datagen.recipes.recipetypes.deconstruction.block.gem.EODeconstructionGemBlockRecipe.generateBlockToGemMaterialRecipe;

public class EODeconstructionGemBlockEntries extends RecipeProvider implements IConditionBuilder
{
    public EODeconstructionGemBlockEntries(PackOutput output,
                                           CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput)
    {
        generateBlockToGemMaterialRecipe(recipeOutput, "amber", EOBlocks.AMBER_BLOCK.asItem(), EOItems.GEM_AMBER.get());
        generateBlockToGemMaterialRecipe(recipeOutput, "apatite", EOBlocks.APATITE_BLOCK.asItem(), EOItems.GEM_APATITE.get());
        generateBlockToGemMaterialRecipe(recipeOutput, "cinnabar", EOBlocks.CINNABAR_BLOCK.asItem(), EOItems.GEM_CINNABAR.get());
        generateBlockToGemMaterialRecipe(recipeOutput, "fluorite", EOBlocks.FLUORITE_BLOCK.asItem(), EOItems.FLUORITE.get());
        generateBlockToGemMaterialRecipe(recipeOutput, "necroticarite", EOBlocks.NECROTICARITE_BLOCK.asItem(), EOItems.GEM_NECROTICARITE.get());
        generateBlockToGemMaterialRecipe(recipeOutput, "niter", EOBlocks.NITER_BLOCK.asItem(), EOItems.GEM_NITER.get());
        generateBlockToGemMaterialRecipe(recipeOutput, "onyx", EOBlocks.ONYX_BLOCK.asItem(), EOItems.GEM_ONYX.get());
        generateBlockToGemMaterialRecipe(recipeOutput, "peridot", EOBlocks.PERIDOT_BLOCK.asItem(), EOItems.GEM_PERIDOT.get());
        generateBlockToGemMaterialRecipe(recipeOutput, "ruby", EOBlocks.RUBY_BLOCK.asItem(), EOItems.GEM_RUBY.get());
        generateBlockToGemMaterialRecipe(recipeOutput, "sapphire", EOBlocks.SAPPHIRE_BLOCK.asItem(), EOItems.GEM_SAPPHIRE.get());

        generateBlockToGemMaterialRecipe(recipeOutput, "nether_star", EOBlocks.NETHER_STAR_BLOCK.asItem(), Items.NETHER_STAR);
    }
}
