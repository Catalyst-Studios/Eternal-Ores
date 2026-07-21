package net.radzratz.eternalores.util.compat.oritech.recipe_types;

import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.item.types.EOIngotItem;
import net.radzratz.eternalores.util.recipes.types.EOCommonRecipes;
import net.radzratz.eternalores.item.types.EOrGemItem;
import rearth.oritech.api.recipe.FoundryRecipeBuilder;

import java.util.*;

import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.itemTagInputs;

public class EOTFoundryRecipes {
    public static void alloy(RecipeOutput output, Object inp, Object inpO, Item rlt, int rCnt, String sfx) {
        if (rlt == null || inp == null || inpO == null) return;

        RecipeOutput yeet = new EOAdvancementYeeter(output);

        FoundryRecipeBuilder bldr = (FoundryRecipeBuilder)
                FoundryRecipeBuilder.build()
                .input(itemTagInputs(inp))
                .input(itemTagInputs(inpO))
                .result(rlt, rCnt);

        bldr.export(yeet.withConditions(ORITECH_MOD), sfx, EternalOres.id);
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Set<String> generatedFoundryRecipes = new HashSet<>();

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            // Ore Gem -> Ingot / Dust
            if (item instanceof EOrGemItem) {
                if (generatedFoundryRecipes.add("gem:" + mat) && out.DUST_INGOT != null) {
                    alloy(yeet, inp.ORE_GEM, inp.ORE_GEM, out.DUST_INGOT, 3, id.OreGem());
                }
            }

            // Alloys
            if (item instanceof EOIngotItem) {
                for (EOCommonRecipes.Alloys r : EOCommonRecipes.ALLOYS) {
                    if (!r.sfx().startsWith(mat)) continue;
                    if (generatedFoundryRecipes.add("alloy:" + r.sfx()) && r.input() != null && r.inputTwo() != null && r.result() != null) {
                        alloy(yeet, r.input(), r.inputTwo(), r.result(), 1, "alloys/" + r.sfx());
                    }
                }
            }
        });
    }
}
