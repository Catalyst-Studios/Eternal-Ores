package net.radzratz.eternalores.util.compat.create.addons.craftsandadditions;

import com.mrh0.createaddition.recipe.rolling.RollingRecipe;
import com.simibubi.create.content.processing.recipe.StandardProcessingRecipe;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.item.types.EOIngotItem;
import net.radzratz.eternalores.item.types.EOWireItem;

import java.util.HashSet;
import java.util.Set;

import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.isVanillaIngot;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.itemTagInputs;

public class EOAdRollingMillRecipes {
    @SuppressWarnings("all")
    private static void rolling(RecipeOutput output, Object input, Item result, int resultCount, String sfx) {
        if (result == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        StandardProcessingRecipe.Builder<RollingRecipe> bldr =
                new StandardProcessingRecipe.Builder<>(RollingRecipe::new, EO(sfx));

        bldr.require(itemTagInputs(input)).output(result, resultCount);

        bldr.withCondition(CREATE_CRAFTS_ADDITIONS_MOD).build(yeet);
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Set<String> generatedRollingMillRecipes = new HashSet<>();

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            if (item instanceof EOIngotItem || isVanillaIngot(inp.INGOT)) {
                if (generatedRollingMillRecipes.add("ingot_rods:" + mat) && out.ROD != null) {
                    rolling(yeet, inp.INGOT, out.ROD, 2, id.Rod());
                }
            }

            if (item instanceof EOWireItem) {
                if (generatedRollingMillRecipes.add("wires:" + mat) && inp.PLATE != null) {
                    rolling(yeet, inp.PLATE, out.WIRE, 2, id.Wire());
                }
            }
        });
    }
}
