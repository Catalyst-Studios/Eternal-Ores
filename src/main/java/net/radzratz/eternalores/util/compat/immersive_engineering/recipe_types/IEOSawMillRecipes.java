package net.radzratz.eternalores.util.compat.immersive_engineering.recipe_types;

import blusunrize.immersiveengineering.api.crafting.SawmillRecipe;
import blusunrize.immersiveengineering.api.crafting.TagOutput;
import blusunrize.immersiveengineering.api.crafting.TagOutputList;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;

import java.util.List;

import static net.minecraft.tags.ItemTags.WOODEN_SLABS;
import static net.radzratz.eternalores.util.EOMaterials.materialSets.WOOD_SET;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.itemTagInputs;

public class IEOSawMillRecipes {
    private static void saw(RecipeOutput output, Object input, Item result, int rCnt, Item extra, String sfx) {
        if (result == null || extra == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);
        EORecipePaths id = new EORecipePaths("");

        TagOutput main = new TagOutput(result, rCnt);

        TagOutput outputs = TagOutput.EMPTY;

        TagOutputList emptyList = new TagOutputList(List.of());
        TagOutputList byproduct = new TagOutputList(new TagOutput(extra, 1));

        SawmillRecipe bldr = new SawmillRecipe(main, outputs, itemTagInputs(input), 800, emptyList, byproduct);

        yeet.withConditions().accept(EO(id.IESawmill() + sfx), bldr, null, IMMERSIVE_ENGINEERING_MOD);
    }

    public static void generate(RecipeOutput output) {
        // Don't think this is necessary here, but YEET
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        EORecipePaths id = new EORecipePaths("");

        saw(yeet, WOODEN_SLABS, WOOD_SET.PLATE.get(), 4, WOOD_SET.DUST.get(), id.Plate() + "wooden");
        saw(yeet, WOOD_SET.PLATE.get(), WOOD_SET.GEAR.get(), 1, WOOD_SET.DUST.get(), id.Gear() + "wooden");
    }
}
