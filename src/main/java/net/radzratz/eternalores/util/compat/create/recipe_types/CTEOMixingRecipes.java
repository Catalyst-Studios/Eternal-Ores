package net.radzratz.eternalores.util.compat.create.recipe_types;

import com.simibubi.create.content.kinetics.mixer.MixingRecipe;
import com.simibubi.create.content.processing.recipe.HeatCondition;
import com.simibubi.create.content.processing.recipe.StandardProcessingRecipe;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.item.types.EOIngotItem;
import net.radzratz.eternalores.item.types.EOrGemItem;
import net.radzratz.eternalores.util.recipes.types.EOCommonRecipes;
import org.jetbrains.annotations.Nullable;

import java.util.HashSet;
import java.util.Set;

import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.itemTagInputs;

public class CTEOMixingRecipes {
    private static void mix(RecipeOutput output, Object input, int inputCount, Object inputTwo, int inputTwoCount,
                            @Nullable Object inputThree, int inputThreeCount, Item result, int resultCount, String sfx) {
        if (result == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        StandardProcessingRecipe.Builder<MixingRecipe> bldr =
                new StandardProcessingRecipe.Builder<>(MixingRecipe::new, EO(sfx));

        bldr.requiresHeat(HeatCondition.HEATED).output(result, resultCount);

        for(int i = 0; i < inputCount; ++i) {
            bldr.require(itemTagInputs(input));
        }

        for(int i = 0; i < inputTwoCount; ++i) {
            bldr.require(itemTagInputs(inputTwo));
        }

        if (inputThree != null) {
            for(int i = 0; i < inputThreeCount; ++i) {
                bldr.require(itemTagInputs(inputThree));
            }
        }

        bldr.withCondition(CREATE_MOD).build(yeet);
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Set<String> generatedMixingRecipes = new HashSet<>();

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            // Ore Gem -> Ingot / Dust
            if (item instanceof EOrGemItem) {
                if (generatedMixingRecipes.add("gem:" + mat) && out.DUST_INGOT != null) {
                    mix(yeet, inp.ORE_GEM, 1, inp.ORE_GEM, 1, null, 0, out.DUST_INGOT, 3, id.OreGem());
                }
            }

            // Alloys
            if (item instanceof EOIngotItem) {
                for (EOCommonRecipes.Alloys r : EOCommonRecipes.ALLOYS) {
                    if (r.input() != null && r.inputTwo() != null && r.inputThree() != null) {
                        if (generatedMixingRecipes.add("alloys/" + r.sfx())) {
                            mix(yeet, r.input(), r.inputCount(), r.inputTwo(), r.inputTwoCount(), r.inputThree(), r.inputThreeCount(),
                                    r.result(), r.resultCount(), "alloys/" + r.sfx());
                        }
                    } else if (r.input() != null && r.inputTwo() != null) {
                        if (generatedMixingRecipes.add("alloys/" + r.sfx())) {
                            mix(yeet, r.input(), r.inputCount(), r.inputTwo(), r.inputTwoCount(), null, 0,
                                    r.result(), r.resultCount(), "alloys/" + r.sfx());
                        }
                    }
                }
            }
        });
    }
}
