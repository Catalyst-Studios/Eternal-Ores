package net.radzratz.eternalores.util.compat.railcraft.recipe_types;

import mods.railcraft.world.item.crafting.RollingRecipe;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.ShapedRecipePattern;
import net.radzratz.eternalores.item.types.EOPlateItem;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static net.radzratz.eternalores.util.EOUtils.EO;
import static net.radzratz.eternalores.util.EOUtils.RAILCRAFT_MOD;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeOutputs.formTypeExclusions;
import static net.radzratz.eternalores.util.recipes.util.EORecipePaths.PATH;

public class REOMetalRollingRecipes {
    private static void rolling(RecipeOutput output, Object input, Item result, int resultCount, String sfx) {
        if (result == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        ShapedRecipePattern pattern = ShapedRecipePattern.of(Map.of('#', itemTagInputs(input)), "## ", "## ", "   ");

        RollingRecipe bldr = new RollingRecipe(pattern, new ItemStack(result, resultCount), 100);

        yeet.withConditions(RAILCRAFT_MOD).accept(EO(PATH.RAILRolling() + sfx), bldr, null);
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);
        Set<String> generatedRollingRecipes = new HashSet<>();

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            if (item instanceof EOPlateItem || isVanillaIngot(inp.GEM_INGOT) || isVanillaGem(inp.GEM_INGOT)) {
                if (generatedRollingRecipes.add("rolling_material_plate:" + mat) && !formTypeExclusions().contains(mat) && inp.GEM_INGOT != null) {
                    rolling(yeet, inp.GEM_INGOT, out.PLATE, 4, id.Plate());
                }
            }
        });
    }
}
