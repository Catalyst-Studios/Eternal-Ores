package net.radzratz.eternalores.util.compat.immersive_engineering.recipe_types;

import blusunrize.immersiveengineering.api.crafting.AlloyRecipe;
import blusunrize.immersiveengineering.api.crafting.IngredientWithSize;
import blusunrize.immersiveengineering.api.crafting.TagOutput;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.item.types.EOIngotItem;
import net.radzratz.eternalores.item.types.EOrGemItem;
import net.radzratz.eternalores.util.recipes.types.EOCommonRecipes;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;

import java.util.HashSet;
import java.util.Set;

import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.itemTagInputs;

public class IEOKilnRecipes {
    private static void kiln(RecipeOutput output, Object input, int inputCount, Object inputTwo, int inputTwoCount, Item result, int resultCount, int time, String sfx) {
        if (result == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);
        EORecipePaths id = new EORecipePaths("");

        IngredientWithSize inpOne = new IngredientWithSize(itemTagInputs(input), inputCount);
        IngredientWithSize inpTwo = new IngredientWithSize(itemTagInputs(inputTwo), inputTwoCount);
        TagOutput out = new TagOutput(result, resultCount);

        AlloyRecipe bldr = new AlloyRecipe(out, inpOne, inpTwo, time);

        yeet.withConditions().accept(EO(id.IEKiln() + sfx), bldr, null, IMMERSIVE_ENGINEERING_MOD);
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Set<String> generatedKilnRecipes = new HashSet<>();

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            // Ore Gem -> Ingot / Dust
            if (item instanceof EOrGemItem) {
                if (generatedKilnRecipes.add("gem:" + mat) && out.DUST_INGOT != null) {
                    kiln(yeet, inp.ORE_GEM, 1, inp.ORE_GEM, 1, out.DUST_INGOT, 3, 8, id.OreGem());
                }
            }

            // Alloys
            if (item instanceof EOIngotItem) {
                for (EOCommonRecipes.Alloys r : EOCommonRecipes.ALLOYS) {
                    if (!r.sfx().startsWith(mat)) continue;
                    if (generatedKilnRecipes.add("alloy:" + r.sfx()) && !mat.equals("steel") && r.input() != null && r.inputTwo() != null) {
                        kiln(yeet, r.input(), r.inputCount(), r.inputTwo(), r.inputTwoCount(), r.result(), r.resultCount(), 8, "alloys/" + r.sfx());
                    }
                }
            }
        });
    }
}
