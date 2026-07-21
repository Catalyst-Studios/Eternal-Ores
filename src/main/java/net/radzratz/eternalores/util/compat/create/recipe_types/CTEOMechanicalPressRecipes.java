package net.radzratz.eternalores.util.compat.create.recipe_types;

import com.simibubi.create.content.kinetics.press.PressingRecipe;
import com.simibubi.create.content.processing.recipe.StandardProcessingRecipe;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.item.types.EOFoilItem;
import net.radzratz.eternalores.item.types.EOGemItem;
import net.radzratz.eternalores.item.types.EOIngotItem;

import java.util.HashSet;
import java.util.Set;

import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.*;

public class CTEOMechanicalPressRecipes {
    private static void press(RecipeOutput output, Object input, Item result, String sfx) {
        if (result == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        StandardProcessingRecipe.Builder<PressingRecipe> bldr =
                new StandardProcessingRecipe.Builder<>(PressingRecipe::new, EO(sfx));

        bldr.require(itemTagInputs(input)).output(result);

        bldr.withCondition(CREATE_MOD).build(yeet);
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Set<String> generatedPressRecipes = new HashSet<>();

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            // Plate
            if (item instanceof EOIngotItem || isVanillaIngot(inp.INGOT)) {
                if (generatedPressRecipes.add("plate_ingot:" + mat) && out.PLATE != null) {
                    press(yeet, inp.INGOT, out.PLATE, id.Plate());
                }
            }

            if (item instanceof EOGemItem || isVanillaGem(inp.GEM)) {
                if (generatedPressRecipes.add("plate_gem:" + mat) && out.PLATE != null) {
                    press(yeet, inp.GEM, out.PLATE, id.Plate());
                }
            }

            // Foil
            if (item instanceof EOFoilItem || isVanillaPlate(inp.PLATE)) {
                if (generatedPressRecipes.add("foils:" + mat) && out.FOIL != null) {
                    press(yeet, inp.PLATE, out.FOIL, id.Foil());
                }
            }
        });
    }
}
