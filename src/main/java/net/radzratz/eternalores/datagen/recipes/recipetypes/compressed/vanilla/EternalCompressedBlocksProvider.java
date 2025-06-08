package net.radzratz.eternalores.datagen.recipes.recipetypes.compressed.vanilla;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.radzratz.eternalores.block.EternalGeneralBlocks;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static net.radzratz.eternalores.datagen.recipes.recipetypes.compressed.vanilla.CompressedRecipesEntries.generateCompressedBlockRecipe;
import static net.radzratz.eternalores.datagen.recipes.recipetypes.compressed.vanilla.CompressedRecipesEntries.generateCompressedToMaterialShapeless;

public class EternalCompressedBlocksProvider extends RecipeProvider implements IConditionBuilder
{
    public EternalCompressedBlocksProvider(PackOutput output,
                                           CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    protected void buildRecipes(@NotNull RecipeOutput recipeOutput)
    {
        ///Compressed Blocks
        //Cobblestone
        generateCompressedBlockRecipe(recipeOutput, "cobble_1x", Blocks.COBBLESTONE.asItem(), EternalGeneralBlocks.COBBLE_1.asItem());
        generateCompressedBlockRecipe(recipeOutput, "cobble_2x", EternalGeneralBlocks.COBBLE_1.asItem(), EternalGeneralBlocks.COBBLE_2.asItem());
        generateCompressedBlockRecipe(recipeOutput, "cobble_3x", EternalGeneralBlocks.COBBLE_2.asItem(), EternalGeneralBlocks.COBBLE_3.asItem());
        generateCompressedBlockRecipe(recipeOutput, "cobble_4x", EternalGeneralBlocks.COBBLE_3.asItem(), EternalGeneralBlocks.COBBLE_4.asItem());
        generateCompressedBlockRecipe(recipeOutput, "cobble_5x", EternalGeneralBlocks.COBBLE_4.asItem(), EternalGeneralBlocks.COBBLE_5.asItem());
        generateCompressedBlockRecipe(recipeOutput, "cobble_6x", EternalGeneralBlocks.COBBLE_5.asItem(), EternalGeneralBlocks.COBBLE_6.asItem());
        generateCompressedBlockRecipe(recipeOutput, "cobble_7x", EternalGeneralBlocks.COBBLE_6.asItem(), EternalGeneralBlocks.COBBLE_7.asItem());
        generateCompressedBlockRecipe(recipeOutput, "cobble_8x", EternalGeneralBlocks.COBBLE_7.asItem(), EternalGeneralBlocks.COBBLE_8.asItem());
        generateCompressedBlockRecipe(recipeOutput, "cobble_9x", EternalGeneralBlocks.COBBLE_8.asItem(), EternalGeneralBlocks.COBBLE_9.asItem());
        //Sand
        generateCompressedBlockRecipe(recipeOutput, "sand_1x", Blocks.SAND.asItem(), EternalGeneralBlocks.SAND_1.asItem());
        generateCompressedBlockRecipe(recipeOutput, "sand_2x", EternalGeneralBlocks.SAND_1.asItem(), EternalGeneralBlocks.SAND_2.asItem());
        generateCompressedBlockRecipe(recipeOutput, "sand_3x", EternalGeneralBlocks.SAND_2.asItem(), EternalGeneralBlocks.SAND_3.asItem());
        generateCompressedBlockRecipe(recipeOutput, "sand_4x", EternalGeneralBlocks.SAND_3.asItem(), EternalGeneralBlocks.SAND_4.asItem());
        generateCompressedBlockRecipe(recipeOutput, "sand_5x", EternalGeneralBlocks.SAND_4.asItem(), EternalGeneralBlocks.SAND_5.asItem());
        generateCompressedBlockRecipe(recipeOutput, "sand_6x", EternalGeneralBlocks.SAND_5.asItem(), EternalGeneralBlocks.SAND_6.asItem());
        generateCompressedBlockRecipe(recipeOutput, "sand_7x", EternalGeneralBlocks.SAND_6.asItem(), EternalGeneralBlocks.SAND_7.asItem());
        generateCompressedBlockRecipe(recipeOutput, "sand_8x", EternalGeneralBlocks.SAND_7.asItem(), EternalGeneralBlocks.SAND_8.asItem());
        generateCompressedBlockRecipe(recipeOutput, "sand_9x", EternalGeneralBlocks.SAND_8.asItem(), EternalGeneralBlocks.SAND_9.asItem());

        generateCompressedBlockRecipe(recipeOutput, "dirt_1x", Blocks.DIRT.asItem(), EternalGeneralBlocks.DIRT_1.asItem());
        generateCompressedBlockRecipe(recipeOutput, "dirt_2x", EternalGeneralBlocks.DIRT_1.asItem(), EternalGeneralBlocks.DIRT_2.asItem());
        generateCompressedBlockRecipe(recipeOutput, "dirt_3x", EternalGeneralBlocks.DIRT_2.asItem(), EternalGeneralBlocks.DIRT_3.asItem());
        generateCompressedBlockRecipe(recipeOutput, "dirt_4x", EternalGeneralBlocks.DIRT_3.asItem(), EternalGeneralBlocks.DIRT_4.asItem());
        generateCompressedBlockRecipe(recipeOutput, "dirt_5x", EternalGeneralBlocks.DIRT_4.asItem(), EternalGeneralBlocks.DIRT_5.asItem());
        generateCompressedBlockRecipe(recipeOutput, "dirt_6x", EternalGeneralBlocks.DIRT_5.asItem(), EternalGeneralBlocks.DIRT_6.asItem());
        generateCompressedBlockRecipe(recipeOutput, "dirt_7x", EternalGeneralBlocks.DIRT_6.asItem(), EternalGeneralBlocks.DIRT_7.asItem());
        generateCompressedBlockRecipe(recipeOutput, "dirt_8x", EternalGeneralBlocks.DIRT_7.asItem(), EternalGeneralBlocks.DIRT_8.asItem());
        generateCompressedBlockRecipe(recipeOutput, "dirt_9x", EternalGeneralBlocks.DIRT_8.asItem(), EternalGeneralBlocks.DIRT_9.asItem());

        generateCompressedBlockRecipe(recipeOutput, "andesite_1x", Blocks.ANDESITE.asItem(), EternalGeneralBlocks.ANDESITE_1.asItem());
        generateCompressedBlockRecipe(recipeOutput, "andesite_2x", EternalGeneralBlocks.ANDESITE_1.asItem(), EternalGeneralBlocks.ANDESITE_2.asItem());
        generateCompressedBlockRecipe(recipeOutput, "andesite_3x", EternalGeneralBlocks.ANDESITE_2.asItem(), EternalGeneralBlocks.ANDESITE_3.asItem());
        generateCompressedBlockRecipe(recipeOutput, "andesite_4x", EternalGeneralBlocks.ANDESITE_3.asItem(), EternalGeneralBlocks.ANDESITE_4.asItem());
        generateCompressedBlockRecipe(recipeOutput, "andesite_5x", EternalGeneralBlocks.ANDESITE_4.asItem(), EternalGeneralBlocks.ANDESITE_5.asItem());
        generateCompressedBlockRecipe(recipeOutput, "andesite_6x", EternalGeneralBlocks.ANDESITE_5.asItem(), EternalGeneralBlocks.ANDESITE_6.asItem());
        generateCompressedBlockRecipe(recipeOutput, "andesite_7x", EternalGeneralBlocks.ANDESITE_6.asItem(), EternalGeneralBlocks.ANDESITE_7.asItem());
        generateCompressedBlockRecipe(recipeOutput, "andesite_8x", EternalGeneralBlocks.ANDESITE_7.asItem(), EternalGeneralBlocks.ANDESITE_8.asItem());
        generateCompressedBlockRecipe(recipeOutput, "andesite_9x", EternalGeneralBlocks.ANDESITE_8.asItem(), EternalGeneralBlocks.ANDESITE_9.asItem());

        generateCompressedBlockRecipe(recipeOutput, "gravel_1x", Blocks.GRAVEL.asItem(), EternalGeneralBlocks.GRAVEL_1.asItem());
        generateCompressedBlockRecipe(recipeOutput, "gravel_2x", EternalGeneralBlocks.GRAVEL_1.asItem(), EternalGeneralBlocks.GRAVEL_2.asItem());
        generateCompressedBlockRecipe(recipeOutput, "gravel_3x", EternalGeneralBlocks.GRAVEL_2.asItem(), EternalGeneralBlocks.GRAVEL_3.asItem());
        generateCompressedBlockRecipe(recipeOutput, "gravel_4x", EternalGeneralBlocks.GRAVEL_3.asItem(), EternalGeneralBlocks.GRAVEL_4.asItem());
        generateCompressedBlockRecipe(recipeOutput, "gravel_5x", EternalGeneralBlocks.GRAVEL_4.asItem(), EternalGeneralBlocks.GRAVEL_5.asItem());
        generateCompressedBlockRecipe(recipeOutput, "gravel_6x", EternalGeneralBlocks.GRAVEL_5.asItem(), EternalGeneralBlocks.GRAVEL_6.asItem());
        generateCompressedBlockRecipe(recipeOutput, "gravel_7x", EternalGeneralBlocks.GRAVEL_6.asItem(), EternalGeneralBlocks.GRAVEL_7.asItem());
        generateCompressedBlockRecipe(recipeOutput, "gravel_8x", EternalGeneralBlocks.GRAVEL_7.asItem(), EternalGeneralBlocks.GRAVEL_8.asItem());
        generateCompressedBlockRecipe(recipeOutput, "gravel_9x", EternalGeneralBlocks.GRAVEL_8.asItem(), EternalGeneralBlocks.GRAVEL_9.asItem());

        generateCompressedBlockRecipe(recipeOutput, "granite_1x", Blocks.GRANITE.asItem(), EternalGeneralBlocks.GRANITE_1.asItem());
        generateCompressedBlockRecipe(recipeOutput, "granite_2x", EternalGeneralBlocks.GRANITE_1.asItem(), EternalGeneralBlocks.GRANITE_2.asItem());
        generateCompressedBlockRecipe(recipeOutput, "granite_3x", EternalGeneralBlocks.GRANITE_2.asItem(), EternalGeneralBlocks.GRANITE_3.asItem());
        generateCompressedBlockRecipe(recipeOutput, "granite_4x", EternalGeneralBlocks.GRANITE_3.asItem(), EternalGeneralBlocks.GRANITE_4.asItem());
        generateCompressedBlockRecipe(recipeOutput, "granite_5x", EternalGeneralBlocks.GRANITE_4.asItem(), EternalGeneralBlocks.GRANITE_5.asItem());
        generateCompressedBlockRecipe(recipeOutput, "granite_6x", EternalGeneralBlocks.GRANITE_5.asItem(), EternalGeneralBlocks.GRANITE_6.asItem());
        generateCompressedBlockRecipe(recipeOutput, "granite_7x", EternalGeneralBlocks.GRANITE_6.asItem(), EternalGeneralBlocks.GRANITE_7.asItem());
        generateCompressedBlockRecipe(recipeOutput, "granite_8x", EternalGeneralBlocks.GRANITE_7.asItem(), EternalGeneralBlocks.GRANITE_8.asItem());
        generateCompressedBlockRecipe(recipeOutput, "granite_9x", EternalGeneralBlocks.GRANITE_8.asItem(), EternalGeneralBlocks.GRANITE_9.asItem());

        generateCompressedBlockRecipe(recipeOutput, "diorite_1x", Blocks.DIORITE.asItem(), EternalGeneralBlocks.DIORITE_1.asItem());
        generateCompressedBlockRecipe(recipeOutput, "diorite_2x", EternalGeneralBlocks.DIORITE_1.asItem(), EternalGeneralBlocks.DIORITE_2.asItem());
        generateCompressedBlockRecipe(recipeOutput, "diorite_3x", EternalGeneralBlocks.DIORITE_2.asItem(), EternalGeneralBlocks.DIORITE_3.asItem());
        generateCompressedBlockRecipe(recipeOutput, "diorite_4x", EternalGeneralBlocks.DIORITE_3.asItem(), EternalGeneralBlocks.DIORITE_4.asItem());
        generateCompressedBlockRecipe(recipeOutput, "diorite_5x", EternalGeneralBlocks.DIORITE_4.asItem(), EternalGeneralBlocks.DIORITE_5.asItem());
        generateCompressedBlockRecipe(recipeOutput, "diorite_6x", EternalGeneralBlocks.DIORITE_5.asItem(), EternalGeneralBlocks.DIORITE_6.asItem());
        generateCompressedBlockRecipe(recipeOutput, "diorite_7x", EternalGeneralBlocks.DIORITE_6.asItem(), EternalGeneralBlocks.DIORITE_7.asItem());
        generateCompressedBlockRecipe(recipeOutput, "diorite_8x", EternalGeneralBlocks.DIORITE_7.asItem(), EternalGeneralBlocks.DIORITE_8.asItem());
        generateCompressedBlockRecipe(recipeOutput, "diorite_9x", EternalGeneralBlocks.DIORITE_8.asItem(), EternalGeneralBlocks.DIORITE_9.asItem());

        //Compressed Block to Uncompressed block? rat is confused
        generateCompressedToMaterialShapeless(recipeOutput, "cobble-1", EternalGeneralBlocks.COBBLE_1.asItem(), Blocks.COBBLESTONE.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "cobble-2", EternalGeneralBlocks.COBBLE_2.asItem(), EternalGeneralBlocks.COBBLE_1.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "cobble-3", EternalGeneralBlocks.COBBLE_3.asItem(), EternalGeneralBlocks.COBBLE_2.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "cobble-4", EternalGeneralBlocks.COBBLE_4.asItem(), EternalGeneralBlocks.COBBLE_3.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "cobble-5", EternalGeneralBlocks.COBBLE_5.asItem(), EternalGeneralBlocks.COBBLE_4.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "cobble-6", EternalGeneralBlocks.COBBLE_6.asItem(), EternalGeneralBlocks.COBBLE_5.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "cobble-7", EternalGeneralBlocks.COBBLE_7.asItem(), EternalGeneralBlocks.COBBLE_6.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "cobble-8", EternalGeneralBlocks.COBBLE_8.asItem(), EternalGeneralBlocks.COBBLE_7.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "cobble-9", EternalGeneralBlocks.COBBLE_9.asItem(), EternalGeneralBlocks.COBBLE_8.asItem());

        generateCompressedToMaterialShapeless(recipeOutput, "sand-1", EternalGeneralBlocks.SAND_1.asItem(), Blocks.SAND.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "sand-2", EternalGeneralBlocks.SAND_2.asItem(), EternalGeneralBlocks.SAND_1.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "sand-3", EternalGeneralBlocks.SAND_3.asItem(), EternalGeneralBlocks.SAND_2.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "sand-4", EternalGeneralBlocks.SAND_4.asItem(), EternalGeneralBlocks.SAND_3.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "sand-5", EternalGeneralBlocks.SAND_5.asItem(), EternalGeneralBlocks.SAND_4.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "sand-6", EternalGeneralBlocks.SAND_6.asItem(), EternalGeneralBlocks.SAND_5.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "sand-7", EternalGeneralBlocks.SAND_7.asItem(), EternalGeneralBlocks.SAND_6.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "sand-8", EternalGeneralBlocks.SAND_8.asItem(), EternalGeneralBlocks.SAND_7.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "sand-9", EternalGeneralBlocks.SAND_9.asItem(), EternalGeneralBlocks.SAND_8.asItem());

        generateCompressedToMaterialShapeless(recipeOutput, "dirt-1", EternalGeneralBlocks.DIRT_1.asItem(), Blocks.DIRT.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "dirt-2", EternalGeneralBlocks.DIRT_2.asItem(), EternalGeneralBlocks.DIRT_1.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "dirt-3", EternalGeneralBlocks.DIRT_3.asItem(), EternalGeneralBlocks.DIRT_2.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "dirt-4", EternalGeneralBlocks.DIRT_4.asItem(), EternalGeneralBlocks.DIRT_3.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "dirt-5", EternalGeneralBlocks.DIRT_5.asItem(), EternalGeneralBlocks.DIRT_4.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "dirt-6", EternalGeneralBlocks.DIRT_6.asItem(), EternalGeneralBlocks.DIRT_5.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "dirt-7", EternalGeneralBlocks.DIRT_7.asItem(), EternalGeneralBlocks.DIRT_6.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "dirt-8", EternalGeneralBlocks.DIRT_8.asItem(), EternalGeneralBlocks.DIRT_7.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "dirt-9", EternalGeneralBlocks.DIRT_9.asItem(), EternalGeneralBlocks.DIRT_8.asItem());

        generateCompressedToMaterialShapeless(recipeOutput, "andesite-1", EternalGeneralBlocks.ANDESITE_1.asItem(), Blocks.ANDESITE.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "andesite-2", EternalGeneralBlocks.ANDESITE_2.asItem(), EternalGeneralBlocks.ANDESITE_1.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "andesite-3", EternalGeneralBlocks.ANDESITE_3.asItem(), EternalGeneralBlocks.ANDESITE_2.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "andesite-4", EternalGeneralBlocks.ANDESITE_4.asItem(), EternalGeneralBlocks.ANDESITE_3.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "andesite-5", EternalGeneralBlocks.ANDESITE_5.asItem(), EternalGeneralBlocks.ANDESITE_4.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "andesite-6", EternalGeneralBlocks.ANDESITE_6.asItem(), EternalGeneralBlocks.ANDESITE_5.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "andesite-7", EternalGeneralBlocks.ANDESITE_7.asItem(), EternalGeneralBlocks.ANDESITE_6.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "andesite-8", EternalGeneralBlocks.ANDESITE_8.asItem(), EternalGeneralBlocks.ANDESITE_7.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "andesite-9", EternalGeneralBlocks.ANDESITE_9.asItem(), EternalGeneralBlocks.ANDESITE_8.asItem());

        generateCompressedToMaterialShapeless(recipeOutput, "gravel-1", EternalGeneralBlocks.GRAVEL_1.asItem(), Blocks.GRAVEL.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "gravel-2", EternalGeneralBlocks.GRAVEL_2.asItem(), EternalGeneralBlocks.GRAVEL_1.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "gravel-3", EternalGeneralBlocks.GRAVEL_3.asItem(), EternalGeneralBlocks.GRAVEL_2.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "gravel-4", EternalGeneralBlocks.GRAVEL_4.asItem(), EternalGeneralBlocks.GRAVEL_3.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "gravel-5", EternalGeneralBlocks.GRAVEL_5.asItem(), EternalGeneralBlocks.GRAVEL_4.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "gravel-6", EternalGeneralBlocks.GRAVEL_6.asItem(), EternalGeneralBlocks.GRAVEL_5.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "gravel-7", EternalGeneralBlocks.GRAVEL_7.asItem(), EternalGeneralBlocks.GRAVEL_6.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "gravel-8", EternalGeneralBlocks.GRAVEL_8.asItem(), EternalGeneralBlocks.GRAVEL_7.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "gravel-9", EternalGeneralBlocks.GRAVEL_9.asItem(), EternalGeneralBlocks.GRAVEL_8.asItem());

        generateCompressedToMaterialShapeless(recipeOutput, "granite-1", EternalGeneralBlocks.GRANITE_1.asItem(), Blocks.GRANITE.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "granite-2", EternalGeneralBlocks.GRANITE_2.asItem(), EternalGeneralBlocks.GRANITE_1.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "granite-3", EternalGeneralBlocks.GRANITE_3.asItem(), EternalGeneralBlocks.GRANITE_2.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "granite-4", EternalGeneralBlocks.GRANITE_4.asItem(), EternalGeneralBlocks.GRANITE_3.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "granite-5", EternalGeneralBlocks.GRANITE_5.asItem(), EternalGeneralBlocks.GRANITE_4.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "granite-6", EternalGeneralBlocks.GRANITE_6.asItem(), EternalGeneralBlocks.GRANITE_5.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "granite-7", EternalGeneralBlocks.GRANITE_7.asItem(), EternalGeneralBlocks.GRANITE_6.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "granite-8", EternalGeneralBlocks.GRANITE_8.asItem(), EternalGeneralBlocks.GRANITE_7.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "granite-9", EternalGeneralBlocks.GRANITE_9.asItem(), EternalGeneralBlocks.GRANITE_8.asItem());

        generateCompressedToMaterialShapeless(recipeOutput, "diorite-1", EternalGeneralBlocks.DIORITE_1.asItem(), Blocks.DIORITE.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "diorite-2", EternalGeneralBlocks.DIORITE_2.asItem(), EternalGeneralBlocks.DIORITE_1.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "diorite-3", EternalGeneralBlocks.DIORITE_3.asItem(), EternalGeneralBlocks.DIORITE_2.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "diorite-4", EternalGeneralBlocks.DIORITE_4.asItem(), EternalGeneralBlocks.DIORITE_3.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "diorite-5", EternalGeneralBlocks.DIORITE_5.asItem(), EternalGeneralBlocks.DIORITE_4.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "diorite-6", EternalGeneralBlocks.DIORITE_6.asItem(), EternalGeneralBlocks.DIORITE_5.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "diorite-7", EternalGeneralBlocks.DIORITE_7.asItem(), EternalGeneralBlocks.DIORITE_6.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "diorite-8", EternalGeneralBlocks.DIORITE_8.asItem(), EternalGeneralBlocks.DIORITE_7.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "diorite-9", EternalGeneralBlocks.DIORITE_9.asItem(), EternalGeneralBlocks.DIORITE_8.asItem());
    }
}
