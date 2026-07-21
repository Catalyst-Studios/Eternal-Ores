package net.radzratz.eternalores.util.compat.energized_power.recipe_types;

import me.jddev0.ep.recipe.SawmillRecipe;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;

import static net.minecraft.tags.ItemTags.WOODEN_SLABS;
import static net.radzratz.eternalores.util.EOMaterials.materialSets.WOOD_SET;
import static net.radzratz.eternalores.util.EOUtils.ENERGIZED_POWER_MOD;
import static net.radzratz.eternalores.util.EOUtils.EO;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.itemTagInputs;

public class EEPSawMill {
    @SuppressWarnings("all")
    private static void saw(RecipeOutput output, Object input, Item result, int resultCount, Item byproduct, int byproductCount, String sfx) {
        if (result == null || byproduct == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);
        EORecipePaths id = new EORecipePaths("");

        ItemStack main = new ItemStack(result, resultCount);
        ItemStack extra = new ItemStack(byproduct, byproductCount);

        SawmillRecipe bldr = new SawmillRecipe(main, extra, itemTagInputs(input));

        yeet.withConditions().accept(EO(id.EEPSawmill() + sfx), bldr, null, ENERGIZED_POWER_MOD);
    }

    public static void generate(RecipeOutput output) {
        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);
        EORecipePaths id = new EORecipePaths("");

        saw(yeet, WOODEN_SLABS, WOOD_SET.PLATE.get(), 4, WOOD_SET.DUST.get(), 1, id.Plate() + "wooden");
        saw(yeet, WOOD_SET.PLATE.get(), WOOD_SET.GEAR.get(), 1, WOOD_SET.DUST.get(), 1, id.Gear() + "wooden");
    }
}
