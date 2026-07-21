package net.radzratz.eternalores.util.compat.mekanism.addons.moremachine.recipe_types;

import com.jerry.mekmm.api.recipes.basic.BasicLatheRecipe;
import mekanism.api.recipes.basic.BasicItemStackToItemStackRecipe;
import mekanism.api.recipes.ingredients.ItemStackIngredient;
import mekanism.api.recipes.ingredients.creator.IngredientCreatorAccess;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.item.types.EOGemItem;
import net.radzratz.eternalores.item.types.EOIngotItem;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;

import java.util.HashSet;
import java.util.Set;

import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.*;

public class EOMMLatheRecipes {
    public static void lathe(RecipeOutput output, Object inp, int iCnt, Item rlt, int rCnt, String sfx) {
        if (rlt == null) return;

        RecipeOutput yeet = new EOAdvancementYeeter(output);
        EORecipePaths id = new EORecipePaths("");

        ItemStackIngredient input = IngredientCreatorAccess.item().from(itemTagInputs(inp), iCnt);
        ItemStack out = new ItemStack(rlt, rCnt);

        BasicItemStackToItemStackRecipe bldr = new BasicLatheRecipe(input, out);

        yeet.accept(EO(id.MLathe() + sfx), bldr, null, MEKANISM_MORE_MACHINE_MOD);
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Set<String> generatedLatheRecipes = new HashSet<>();

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            if (item instanceof EOIngotItem || isVanillaIngot(inp.INGOT)) {
                if (generatedLatheRecipes.add("rod_ingot:" + mat) && out.ROD != null) {
                    lathe(yeet, inp.INGOT, 1, out.ROD, 2, id.Rod());
                }
            }

            if (item instanceof EOGemItem || isVanillaGem(inp.GEM)) {
                if (generatedLatheRecipes.add("rod_gem:" + mat) && out.ROD != null) {
                    lathe(yeet, inp.GEM, 1, out.ROD, 2, id.Rod());
                }
            }
        });
    }
}
