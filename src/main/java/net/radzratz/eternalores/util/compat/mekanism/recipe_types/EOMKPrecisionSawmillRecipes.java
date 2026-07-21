package net.radzratz.eternalores.util.compat.mekanism.recipe_types;

import mekanism.api.datagen.recipe.builder.SawmillRecipeBuilder;
import mekanism.api.recipes.ingredients.ItemStackIngredient;
import mekanism.api.recipes.ingredients.creator.IngredientCreatorAccess;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;

import static net.minecraft.tags.ItemTags.WOODEN_SLABS;
import static net.radzratz.eternalores.util.EOMaterials.materialSets.WOOD_SET;
import static net.radzratz.eternalores.util.EOUtils.EO;
import static net.radzratz.eternalores.util.EOUtils.MEKANISM_MOD;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.itemTagInputs;

public class EOMKPrecisionSawmillRecipes {
    private static void saw(RecipeOutput output, Object inp, Item result, int rCnt, Item byproduct, double bCh, String sfx) {
        if (result == null || byproduct == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);
        EORecipePaths id = new EORecipePaths("");

        ItemStackIngredient main = IngredientCreatorAccess.item().from(itemTagInputs(inp));
        ItemStack res = new ItemStack(result, rCnt);
        ItemStack extra = new ItemStack(byproduct);

        SawmillRecipeBuilder.sawing(main, res, extra, bCh).addCondition(MEKANISM_MOD).build(yeet, EO(id.MPrecision() + sfx));
    }

    public static void generate(RecipeOutput output) {
        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);
        EORecipePaths id = new EORecipePaths("");

        saw(yeet, WOODEN_SLABS, WOOD_SET.PLATE.get(), 4, WOOD_SET.DUST.get(), 1.0, id.Plate() + "wooden");
        saw(yeet, WOOD_SET.PLATE.get(), WOOD_SET.GEAR.get(), 1, WOOD_SET.DUST.get(), 1.0, id.Gear() + "wooden");
    }
}
