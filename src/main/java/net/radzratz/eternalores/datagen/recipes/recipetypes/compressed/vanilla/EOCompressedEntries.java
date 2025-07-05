package net.radzratz.eternalores.datagen.recipes.recipetypes.compressed.vanilla;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.radzratz.eternalores.block.EOBlocks;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static net.radzratz.eternalores.datagen.recipes.recipetypes.compressed.vanilla.EOCompressedRecipe.generateCompressedBlockRecipe;
import static net.radzratz.eternalores.datagen.recipes.recipetypes.compressed.vanilla.EOCompressedRecipe.generateCompressedToMaterialShapeless;

public class EOCompressedEntries extends RecipeProvider implements IConditionBuilder
{
    public EOCompressedEntries(PackOutput output, CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    protected void buildRecipes(@NotNull RecipeOutput recipeOutput)
    {
        ///Compressed Blocks
        //Cobblestone
        generateCompressedBlockRecipe(recipeOutput, "cobble_1x", Blocks.COBBLESTONE.asItem(), EOBlocks.COBBLE_1.asItem());
        generateCompressedBlockRecipe(recipeOutput, "cobble_2x", EOBlocks.COBBLE_1.asItem(), EOBlocks.COBBLE_2.asItem());
        generateCompressedBlockRecipe(recipeOutput, "cobble_3x", EOBlocks.COBBLE_2.asItem(), EOBlocks.COBBLE_3.asItem());
        generateCompressedBlockRecipe(recipeOutput, "cobble_4x", EOBlocks.COBBLE_3.asItem(), EOBlocks.COBBLE_4.asItem());
        generateCompressedBlockRecipe(recipeOutput, "cobble_5x", EOBlocks.COBBLE_4.asItem(), EOBlocks.COBBLE_5.asItem());
        generateCompressedBlockRecipe(recipeOutput, "cobble_6x", EOBlocks.COBBLE_5.asItem(), EOBlocks.COBBLE_6.asItem());
        generateCompressedBlockRecipe(recipeOutput, "cobble_7x", EOBlocks.COBBLE_6.asItem(), EOBlocks.COBBLE_7.asItem());
        generateCompressedBlockRecipe(recipeOutput, "cobble_8x", EOBlocks.COBBLE_7.asItem(), EOBlocks.COBBLE_8.asItem());
        generateCompressedBlockRecipe(recipeOutput, "cobble_9x", EOBlocks.COBBLE_8.asItem(), EOBlocks.COBBLE_9.asItem());
        //Sand
        generateCompressedBlockRecipe(recipeOutput, "sand_1x", Blocks.SAND.asItem(), EOBlocks.SAND_1.asItem());
        generateCompressedBlockRecipe(recipeOutput, "sand_2x", EOBlocks.SAND_1.asItem(), EOBlocks.SAND_2.asItem());
        generateCompressedBlockRecipe(recipeOutput, "sand_3x", EOBlocks.SAND_2.asItem(), EOBlocks.SAND_3.asItem());
        generateCompressedBlockRecipe(recipeOutput, "sand_4x", EOBlocks.SAND_3.asItem(), EOBlocks.SAND_4.asItem());
        generateCompressedBlockRecipe(recipeOutput, "sand_5x", EOBlocks.SAND_4.asItem(), EOBlocks.SAND_5.asItem());
        generateCompressedBlockRecipe(recipeOutput, "sand_6x", EOBlocks.SAND_5.asItem(), EOBlocks.SAND_6.asItem());
        generateCompressedBlockRecipe(recipeOutput, "sand_7x", EOBlocks.SAND_6.asItem(), EOBlocks.SAND_7.asItem());
        generateCompressedBlockRecipe(recipeOutput, "sand_8x", EOBlocks.SAND_7.asItem(), EOBlocks.SAND_8.asItem());
        generateCompressedBlockRecipe(recipeOutput, "sand_9x", EOBlocks.SAND_8.asItem(), EOBlocks.SAND_9.asItem());

        generateCompressedBlockRecipe(recipeOutput, "dirt_1x", Blocks.DIRT.asItem(), EOBlocks.DIRT_1.asItem());
        generateCompressedBlockRecipe(recipeOutput, "dirt_2x", EOBlocks.DIRT_1.asItem(), EOBlocks.DIRT_2.asItem());
        generateCompressedBlockRecipe(recipeOutput, "dirt_3x", EOBlocks.DIRT_2.asItem(), EOBlocks.DIRT_3.asItem());
        generateCompressedBlockRecipe(recipeOutput, "dirt_4x", EOBlocks.DIRT_3.asItem(), EOBlocks.DIRT_4.asItem());
        generateCompressedBlockRecipe(recipeOutput, "dirt_5x", EOBlocks.DIRT_4.asItem(), EOBlocks.DIRT_5.asItem());
        generateCompressedBlockRecipe(recipeOutput, "dirt_6x", EOBlocks.DIRT_5.asItem(), EOBlocks.DIRT_6.asItem());
        generateCompressedBlockRecipe(recipeOutput, "dirt_7x", EOBlocks.DIRT_6.asItem(), EOBlocks.DIRT_7.asItem());
        generateCompressedBlockRecipe(recipeOutput, "dirt_8x", EOBlocks.DIRT_7.asItem(), EOBlocks.DIRT_8.asItem());
        generateCompressedBlockRecipe(recipeOutput, "dirt_9x", EOBlocks.DIRT_8.asItem(), EOBlocks.DIRT_9.asItem());

        generateCompressedBlockRecipe(recipeOutput, "andesite_1x", Blocks.ANDESITE.asItem(), EOBlocks.ANDESITE_1.asItem());
        generateCompressedBlockRecipe(recipeOutput, "andesite_2x", EOBlocks.ANDESITE_1.asItem(), EOBlocks.ANDESITE_2.asItem());
        generateCompressedBlockRecipe(recipeOutput, "andesite_3x", EOBlocks.ANDESITE_2.asItem(), EOBlocks.ANDESITE_3.asItem());
        generateCompressedBlockRecipe(recipeOutput, "andesite_4x", EOBlocks.ANDESITE_3.asItem(), EOBlocks.ANDESITE_4.asItem());
        generateCompressedBlockRecipe(recipeOutput, "andesite_5x", EOBlocks.ANDESITE_4.asItem(), EOBlocks.ANDESITE_5.asItem());
        generateCompressedBlockRecipe(recipeOutput, "andesite_6x", EOBlocks.ANDESITE_5.asItem(), EOBlocks.ANDESITE_6.asItem());
        generateCompressedBlockRecipe(recipeOutput, "andesite_7x", EOBlocks.ANDESITE_6.asItem(), EOBlocks.ANDESITE_7.asItem());
        generateCompressedBlockRecipe(recipeOutput, "andesite_8x", EOBlocks.ANDESITE_7.asItem(), EOBlocks.ANDESITE_8.asItem());
        generateCompressedBlockRecipe(recipeOutput, "andesite_9x", EOBlocks.ANDESITE_8.asItem(), EOBlocks.ANDESITE_9.asItem());

        generateCompressedBlockRecipe(recipeOutput, "gravel_1x", Blocks.GRAVEL.asItem(), EOBlocks.GRAVEL_1.asItem());
        generateCompressedBlockRecipe(recipeOutput, "gravel_2x", EOBlocks.GRAVEL_1.asItem(), EOBlocks.GRAVEL_2.asItem());
        generateCompressedBlockRecipe(recipeOutput, "gravel_3x", EOBlocks.GRAVEL_2.asItem(), EOBlocks.GRAVEL_3.asItem());
        generateCompressedBlockRecipe(recipeOutput, "gravel_4x", EOBlocks.GRAVEL_3.asItem(), EOBlocks.GRAVEL_4.asItem());
        generateCompressedBlockRecipe(recipeOutput, "gravel_5x", EOBlocks.GRAVEL_4.asItem(), EOBlocks.GRAVEL_5.asItem());
        generateCompressedBlockRecipe(recipeOutput, "gravel_6x", EOBlocks.GRAVEL_5.asItem(), EOBlocks.GRAVEL_6.asItem());
        generateCompressedBlockRecipe(recipeOutput, "gravel_7x", EOBlocks.GRAVEL_6.asItem(), EOBlocks.GRAVEL_7.asItem());
        generateCompressedBlockRecipe(recipeOutput, "gravel_8x", EOBlocks.GRAVEL_7.asItem(), EOBlocks.GRAVEL_8.asItem());
        generateCompressedBlockRecipe(recipeOutput, "gravel_9x", EOBlocks.GRAVEL_8.asItem(), EOBlocks.GRAVEL_9.asItem());

        generateCompressedBlockRecipe(recipeOutput, "granite_1x", Blocks.GRANITE.asItem(), EOBlocks.GRANITE_1.asItem());
        generateCompressedBlockRecipe(recipeOutput, "granite_2x", EOBlocks.GRANITE_1.asItem(), EOBlocks.GRANITE_2.asItem());
        generateCompressedBlockRecipe(recipeOutput, "granite_3x", EOBlocks.GRANITE_2.asItem(), EOBlocks.GRANITE_3.asItem());
        generateCompressedBlockRecipe(recipeOutput, "granite_4x", EOBlocks.GRANITE_3.asItem(), EOBlocks.GRANITE_4.asItem());
        generateCompressedBlockRecipe(recipeOutput, "granite_5x", EOBlocks.GRANITE_4.asItem(), EOBlocks.GRANITE_5.asItem());
        generateCompressedBlockRecipe(recipeOutput, "granite_6x", EOBlocks.GRANITE_5.asItem(), EOBlocks.GRANITE_6.asItem());
        generateCompressedBlockRecipe(recipeOutput, "granite_7x", EOBlocks.GRANITE_6.asItem(), EOBlocks.GRANITE_7.asItem());
        generateCompressedBlockRecipe(recipeOutput, "granite_8x", EOBlocks.GRANITE_7.asItem(), EOBlocks.GRANITE_8.asItem());
        generateCompressedBlockRecipe(recipeOutput, "granite_9x", EOBlocks.GRANITE_8.asItem(), EOBlocks.GRANITE_9.asItem());

        generateCompressedBlockRecipe(recipeOutput, "diorite_1x", Blocks.DIORITE.asItem(), EOBlocks.DIORITE_1.asItem());
        generateCompressedBlockRecipe(recipeOutput, "diorite_2x", EOBlocks.DIORITE_1.asItem(), EOBlocks.DIORITE_2.asItem());
        generateCompressedBlockRecipe(recipeOutput, "diorite_3x", EOBlocks.DIORITE_2.asItem(), EOBlocks.DIORITE_3.asItem());
        generateCompressedBlockRecipe(recipeOutput, "diorite_4x", EOBlocks.DIORITE_3.asItem(), EOBlocks.DIORITE_4.asItem());
        generateCompressedBlockRecipe(recipeOutput, "diorite_5x", EOBlocks.DIORITE_4.asItem(), EOBlocks.DIORITE_5.asItem());
        generateCompressedBlockRecipe(recipeOutput, "diorite_6x", EOBlocks.DIORITE_5.asItem(), EOBlocks.DIORITE_6.asItem());
        generateCompressedBlockRecipe(recipeOutput, "diorite_7x", EOBlocks.DIORITE_6.asItem(), EOBlocks.DIORITE_7.asItem());
        generateCompressedBlockRecipe(recipeOutput, "diorite_8x", EOBlocks.DIORITE_7.asItem(), EOBlocks.DIORITE_8.asItem());
        generateCompressedBlockRecipe(recipeOutput, "diorite_9x", EOBlocks.DIORITE_8.asItem(), EOBlocks.DIORITE_9.asItem());

        //Compressed Block to Uncompressed block? rat is confused
        generateCompressedToMaterialShapeless(recipeOutput, "cobble-1", EOBlocks.COBBLE_1.asItem(), Blocks.COBBLESTONE.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "cobble-2", EOBlocks.COBBLE_2.asItem(), EOBlocks.COBBLE_1.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "cobble-3", EOBlocks.COBBLE_3.asItem(), EOBlocks.COBBLE_2.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "cobble-4", EOBlocks.COBBLE_4.asItem(), EOBlocks.COBBLE_3.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "cobble-5", EOBlocks.COBBLE_5.asItem(), EOBlocks.COBBLE_4.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "cobble-6", EOBlocks.COBBLE_6.asItem(), EOBlocks.COBBLE_5.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "cobble-7", EOBlocks.COBBLE_7.asItem(), EOBlocks.COBBLE_6.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "cobble-8", EOBlocks.COBBLE_8.asItem(), EOBlocks.COBBLE_7.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "cobble-9", EOBlocks.COBBLE_9.asItem(), EOBlocks.COBBLE_8.asItem());

        generateCompressedToMaterialShapeless(recipeOutput, "sand-1", EOBlocks.SAND_1.asItem(), Blocks.SAND.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "sand-2", EOBlocks.SAND_2.asItem(), EOBlocks.SAND_1.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "sand-3", EOBlocks.SAND_3.asItem(), EOBlocks.SAND_2.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "sand-4", EOBlocks.SAND_4.asItem(), EOBlocks.SAND_3.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "sand-5", EOBlocks.SAND_5.asItem(), EOBlocks.SAND_4.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "sand-6", EOBlocks.SAND_6.asItem(), EOBlocks.SAND_5.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "sand-7", EOBlocks.SAND_7.asItem(), EOBlocks.SAND_6.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "sand-8", EOBlocks.SAND_8.asItem(), EOBlocks.SAND_7.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "sand-9", EOBlocks.SAND_9.asItem(), EOBlocks.SAND_8.asItem());

        generateCompressedToMaterialShapeless(recipeOutput, "dirt-1", EOBlocks.DIRT_1.asItem(), Blocks.DIRT.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "dirt-2", EOBlocks.DIRT_2.asItem(), EOBlocks.DIRT_1.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "dirt-3", EOBlocks.DIRT_3.asItem(), EOBlocks.DIRT_2.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "dirt-4", EOBlocks.DIRT_4.asItem(), EOBlocks.DIRT_3.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "dirt-5", EOBlocks.DIRT_5.asItem(), EOBlocks.DIRT_4.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "dirt-6", EOBlocks.DIRT_6.asItem(), EOBlocks.DIRT_5.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "dirt-7", EOBlocks.DIRT_7.asItem(), EOBlocks.DIRT_6.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "dirt-8", EOBlocks.DIRT_8.asItem(), EOBlocks.DIRT_7.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "dirt-9", EOBlocks.DIRT_9.asItem(), EOBlocks.DIRT_8.asItem());

        generateCompressedToMaterialShapeless(recipeOutput, "andesite-1", EOBlocks.ANDESITE_1.asItem(), Blocks.ANDESITE.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "andesite-2", EOBlocks.ANDESITE_2.asItem(), EOBlocks.ANDESITE_1.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "andesite-3", EOBlocks.ANDESITE_3.asItem(), EOBlocks.ANDESITE_2.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "andesite-4", EOBlocks.ANDESITE_4.asItem(), EOBlocks.ANDESITE_3.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "andesite-5", EOBlocks.ANDESITE_5.asItem(), EOBlocks.ANDESITE_4.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "andesite-6", EOBlocks.ANDESITE_6.asItem(), EOBlocks.ANDESITE_5.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "andesite-7", EOBlocks.ANDESITE_7.asItem(), EOBlocks.ANDESITE_6.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "andesite-8", EOBlocks.ANDESITE_8.asItem(), EOBlocks.ANDESITE_7.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "andesite-9", EOBlocks.ANDESITE_9.asItem(), EOBlocks.ANDESITE_8.asItem());

        generateCompressedToMaterialShapeless(recipeOutput, "gravel-1", EOBlocks.GRAVEL_1.asItem(), Blocks.GRAVEL.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "gravel-2", EOBlocks.GRAVEL_2.asItem(), EOBlocks.GRAVEL_1.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "gravel-3", EOBlocks.GRAVEL_3.asItem(), EOBlocks.GRAVEL_2.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "gravel-4", EOBlocks.GRAVEL_4.asItem(), EOBlocks.GRAVEL_3.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "gravel-5", EOBlocks.GRAVEL_5.asItem(), EOBlocks.GRAVEL_4.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "gravel-6", EOBlocks.GRAVEL_6.asItem(), EOBlocks.GRAVEL_5.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "gravel-7", EOBlocks.GRAVEL_7.asItem(), EOBlocks.GRAVEL_6.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "gravel-8", EOBlocks.GRAVEL_8.asItem(), EOBlocks.GRAVEL_7.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "gravel-9", EOBlocks.GRAVEL_9.asItem(), EOBlocks.GRAVEL_8.asItem());

        generateCompressedToMaterialShapeless(recipeOutput, "granite-1", EOBlocks.GRANITE_1.asItem(), Blocks.GRANITE.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "granite-2", EOBlocks.GRANITE_2.asItem(), EOBlocks.GRANITE_1.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "granite-3", EOBlocks.GRANITE_3.asItem(), EOBlocks.GRANITE_2.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "granite-4", EOBlocks.GRANITE_4.asItem(), EOBlocks.GRANITE_3.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "granite-5", EOBlocks.GRANITE_5.asItem(), EOBlocks.GRANITE_4.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "granite-6", EOBlocks.GRANITE_6.asItem(), EOBlocks.GRANITE_5.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "granite-7", EOBlocks.GRANITE_7.asItem(), EOBlocks.GRANITE_6.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "granite-8", EOBlocks.GRANITE_8.asItem(), EOBlocks.GRANITE_7.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "granite-9", EOBlocks.GRANITE_9.asItem(), EOBlocks.GRANITE_8.asItem());

        generateCompressedToMaterialShapeless(recipeOutput, "diorite-1", EOBlocks.DIORITE_1.asItem(), Blocks.DIORITE.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "diorite-2", EOBlocks.DIORITE_2.asItem(), EOBlocks.DIORITE_1.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "diorite-3", EOBlocks.DIORITE_3.asItem(), EOBlocks.DIORITE_2.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "diorite-4", EOBlocks.DIORITE_4.asItem(), EOBlocks.DIORITE_3.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "diorite-5", EOBlocks.DIORITE_5.asItem(), EOBlocks.DIORITE_4.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "diorite-6", EOBlocks.DIORITE_6.asItem(), EOBlocks.DIORITE_5.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "diorite-7", EOBlocks.DIORITE_7.asItem(), EOBlocks.DIORITE_6.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "diorite-8", EOBlocks.DIORITE_8.asItem(), EOBlocks.DIORITE_7.asItem());
        generateCompressedToMaterialShapeless(recipeOutput, "diorite-9", EOBlocks.DIORITE_9.asItem(), EOBlocks.DIORITE_8.asItem());
    }
}
