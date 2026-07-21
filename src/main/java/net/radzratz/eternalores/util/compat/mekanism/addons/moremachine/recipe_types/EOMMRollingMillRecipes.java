package net.radzratz.eternalores.util.compat.mekanism.addons.moremachine.recipe_types;

import com.jerry.mekmm.api.recipes.basic.BasicRollingMillRecipe;
import mekanism.api.recipes.basic.BasicItemStackToItemStackRecipe;
import mekanism.api.recipes.ingredients.ItemStackIngredient;
import mekanism.api.recipes.ingredients.creator.IngredientCreatorAccess;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.item.types.EOWireItem;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;

import java.util.HashSet;
import java.util.Set;

import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.itemTagInputs;

public class EOMMRollingMillRecipes {
    private static void roll(RecipeOutput output, Object inp, Item rlt, int rCnt, String sfx) {
        if (rlt == null) return;

        RecipeOutput yeet = new EOAdvancementYeeter(output);
        EORecipePaths id = new EORecipePaths("");

        ItemStackIngredient inputItem = IngredientCreatorAccess.item().from(itemTagInputs(inp));
        ItemStack outputItem = new ItemStack(rlt, rCnt);

        BasicItemStackToItemStackRecipe bldr = new BasicRollingMillRecipe(inputItem, outputItem);

        yeet.accept(EO(id.MRolling() + sfx), bldr, null, MEKANISM_MORE_MACHINE_MOD);
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Set<String> generatedRollingMillRecipes = new HashSet<>();

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            if (item instanceof EOWireItem) {
                if (generatedRollingMillRecipes.add("wire:" + mat) && out.WIRE != null) {
                    roll(yeet, inp.PLATE, out.WIRE, 2, id.Wire());
                }
            }
        });

    }
}
