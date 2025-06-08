package net.radzratz.eternalores.datagen.recipes.recipetypes.deconstruction.block.gem;

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

import static net.radzratz.eternalores.datagen.recipes.recipetypes.deconstruction.block.gem.GemBlockDecoEntry.generateBlockToGemMaterialRecipe;

public class EternalGemBlockDecoProvider extends RecipeProvider implements IConditionBuilder
{
    public EternalGemBlockDecoProvider(PackOutput output,
                                       CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput)
    {
        generateBlockToGemMaterialRecipe(recipeOutput, "amber", EternalGeneralBlocks.AMBER_BLOCK.asItem(), EternalGeneralItems.GEM_AMBER.get());
        generateBlockToGemMaterialRecipe(recipeOutput, "apatite", EternalGeneralBlocks.APATITE_BLOCK.asItem(), EternalGeneralItems.GEM_APATITE.get());
        generateBlockToGemMaterialRecipe(recipeOutput, "cinnabar", EternalGeneralBlocks.CINNABAR_BLOCK.asItem(), EternalGeneralItems.GEM_CINNABAR.get());
        generateBlockToGemMaterialRecipe(recipeOutput, "fluorite", EternalGeneralBlocks.FLUORITE_BLOCK.asItem(), EternalGeneralItems.FLUORITE.get());
        generateBlockToGemMaterialRecipe(recipeOutput, "necroticarite", EternalGeneralBlocks.NECROTICARITE_BLOCK.asItem(), EternalGeneralItems.GEM_NECROTICARITE.get());
        generateBlockToGemMaterialRecipe(recipeOutput, "niter", EternalGeneralBlocks.NITER_BLOCK.asItem(), EternalGeneralItems.GEM_NITER.get());
        generateBlockToGemMaterialRecipe(recipeOutput, "onyx", EternalGeneralBlocks.ONYX_BLOCK.asItem(), EternalGeneralItems.GEM_ONYX.get());
        generateBlockToGemMaterialRecipe(recipeOutput, "peridot", EternalGeneralBlocks.PERIDOT_BLOCK.asItem(), EternalGeneralItems.GEM_PERIDOT.get());
        generateBlockToGemMaterialRecipe(recipeOutput, "ruby", EternalGeneralBlocks.RUBY_BLOCK.asItem(), EternalGeneralItems.GEM_RUBY.get());
        generateBlockToGemMaterialRecipe(recipeOutput, "sapphire", EternalGeneralBlocks.SAPPHIRE_BLOCK.asItem(), EternalGeneralItems.GEM_SAPPHIRE.get());

        generateBlockToGemMaterialRecipe(recipeOutput, "nether_star", EternalGeneralBlocks.NETHER_STAR_BLOCK.asItem(), Items.NETHER_STAR);
    }
}
