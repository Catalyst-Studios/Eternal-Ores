package net.radzratz.eternalores.util.compat.energized_power.recipe_types;

import me.jddev0.ep.recipe.CompressorRecipe;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.radzratz.eternalores.block.types.EOStorageBlock;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.item.types.EOPlateItem;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;

import java.util.HashSet;
import java.util.Set;

import static net.radzratz.eternalores.util.EOMaterials.materialSets.*;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeOutputs.formTypeExclusions;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Ingots.INGOTS_REDSTONE;

public class EEPCompressorRecipes {
    public static void compressor(RecipeOutput output, Object input, int inputCount, Item result, int resultCount, String sfx) {
        if (result == null) return;

        RecipeOutput yeet = new EOAdvancementYeeter(output);
        EORecipePaths id = new EORecipePaths("");

        Ingredient ingredient = itemTagInputs(input);
        ItemStack resultStack = new ItemStack(result, resultCount);

        CompressorRecipe recipe = new CompressorRecipe(resultStack, ingredient, inputCount);

        yeet.accept(EO(id.EPCompressor() + sfx), recipe, null, ENERGIZED_POWER_MOD);
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Set<String> generateCompressorRecipes = new HashSet<>();

        compressor(yeet, INGOTS_REDSTONE, 1, REDSTONE_SET.PLATE.get(), 1, "plates/redstone");
        compressor(yeet, REDSTONE_SET.REDSTONE_BLOCK.get().asItem(), 1, REDSTONE_SET.PLATE.get(), 9, "plates/redstone_block");
        compressor(yeet, SILICON_SET.BLOCK.get().asItem(), 1, SILICON_SET.PLATE.get(), 9, "plates/silicon_block");

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            // Ingot -> Plate
            if (item instanceof EOPlateItem || isVanillaIngot(inp.INGOT) || isVanillaGem(inp.GEM)) {
                if (generateCompressorRecipes.add("energized_compressed_base:" + mat) && !mat.equals("redstone") && !formTypeExclusions().contains(mat) && out.PLATE != null) {
                    compressor(yeet, inp.GEM_INGOT, 1, out.PLATE, 1, id.Plate());
                }
            }

            // Block -> 9x Plate
            if (item instanceof BlockItem b && b.getBlock() instanceof EOStorageBlock) {
                if (generateCompressorRecipes.add("energized_compressed_block:" + mat) && !formTypeExclusions().contains(mat)
                        && !mat.equals("redstone_ingot") && !mat.equals("silicon") && !mat.equals("silicon_ingot") && out.PLATE != null) {
                    boolean isFours = FOURS_DUST_MATERIALS.contains(mat);

                    compressor(yeet, inp.STORAGE_BLOCK, 1, out.PLATE, isFours ? 4 : 9, id.Plate() + "_block");
                }
            }
        });
    }
}
