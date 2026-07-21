package net.radzratz.eternalores.util.compat.energized_power.recipe_types;

import me.jddev0.ep.recipe.AlloyFurnaceRecipe;
import me.jddev0.ep.recipe.IngredientWithCount;
import me.jddev0.ep.recipe.OutputItemStackWithPercentages;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.item.types.EOIngotItem;
import net.radzratz.eternalores.util.recipes.types.EOCommonRecipes;
import net.radzratz.eternalores.item.types.EOrGemItem;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;
import org.jetbrains.annotations.Nullable;

import java.util.*;

import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.itemTagInputs;

public class EEPInductionRecipes {
    public static void induction(RecipeOutput output, Object input, int inputCount, @Nullable Object inputTwo, int inputTwoCount,
                                 @Nullable Object inputThree, int inputThreeCount, Item result, int resultCount, int time, String sfx) {
        if (result == null || input == null) return;

        // YEET
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        EORecipePaths id = new EORecipePaths("");

        List<IngredientWithCount> list = new ArrayList<>();

        list.add(new IngredientWithCount(itemTagInputs(input), inputCount));

        if (inputTwo != null)
            list.add(new IngredientWithCount(itemTagInputs(inputTwo), inputTwoCount));

        if (inputThree != null)
            list.add(new IngredientWithCount(itemTagInputs(inputThree), inputThreeCount));

        IngredientWithCount[] ingredients = list.toArray(new IngredientWithCount[0]);

        ItemStack outputItem = new ItemStack(result, resultCount);
        var secondary = OutputItemStackWithPercentages.EMPTY;

        AlloyFurnaceRecipe recipe = new AlloyFurnaceRecipe(outputItem, secondary, ingredients, time);

        yeet.accept(EO(id.EPSmelter() + sfx), recipe, null, ENERGIZED_POWER_MOD);
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Set<String> generatedSmelterRecipes = new HashSet<>();

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            // Ore Gem -> Ingot/Dust
            if (item instanceof EOrGemItem) {
                if (generatedSmelterRecipes.add("energized_induction_ore_gem:" + mat) && out.DUST_INGOT != null) {
                    induction(yeet, inp.ORE_GEM, 1, inp.ORE_GEM, 1, null, 0, out.DUST_INGOT, 3, 800, id.OreGem());
                }
            }

            // Alloys
            if (item instanceof EOIngotItem) {
                for (EOCommonRecipes.Alloys r : EOCommonRecipes.ALLOYS) {
                    if (r.input() != null && r.inputTwo() != null && r.inputThree() != null && r.result() != null) {
                        if (generatedSmelterRecipes.add("energized_induction_alloy:" + r.sfx())) {
                            induction(yeet, r.input(), r.inputCount(), r.inputTwo(), r.inputTwoCount(), r.inputThree(), r.inputThreeCount(),
                                    r.result(), r.resultCount(), 500, "alloys/" + r.sfx());
                        }
                    } else if (r.input() != null && r.inputTwo() != null && r.result() != null) {
                        if (generatedSmelterRecipes.add("energized_induction_alloy:" + r.sfx())) {
                            induction(yeet, r.input(), r.inputCount(), r.inputTwo(), r.inputTwoCount(), null, 0,
                                    r.result(), r.resultCount(), 500, "alloys/" + r.sfx());
                        }
                    }
                }
            }
        });
    }
}
