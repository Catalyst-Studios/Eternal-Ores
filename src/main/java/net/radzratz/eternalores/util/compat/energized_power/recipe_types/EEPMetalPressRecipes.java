package net.radzratz.eternalores.util.compat.energized_power.recipe_types;

import me.jddev0.ep.recipe.MetalPressRecipe;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.item.types.*;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;

import java.util.HashSet;
import java.util.Set;

import static net.radzratz.eternalores.util.EOSetRegistries.*;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.isVanillaPlate;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.itemTagInputs;

public class EEPMetalPressRecipes {
    public static void metalPress(RecipeOutput output, Object input, int inputCount, Item mold, Item result, int resultCount, String sfx) {
        if (result == null) return;

        RecipeOutput yeet = new EOAdvancementYeeter(output);

        EORecipePaths id = new EORecipePaths("");

        Ingredient inputItem = itemTagInputs(input);

        ItemStack pressMold = new ItemStack(mold);
        ItemStack outputItem = new ItemStack(result, resultCount);

        MetalPressRecipe recipe = new MetalPressRecipe(outputItem, pressMold, inputItem, inputCount);

        yeet.accept(EO(id.EPPress() + sfx), recipe, null, ENERGIZED_POWER_MOD);
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Set<String> generatedMetalPressRecipes = new HashSet<>();

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            // Rods
            if (item instanceof EORodItem) {
                if (generatedMetalPressRecipes.add("energized_press_rod:" + mat) && !mat.equals("samarium") && out.ROD != null) {
                    metalPress(yeet, inp.PLATE, 1, MOLD_ROD.get(), out.ROD, 2, id.Rod());
                }
            }

            // Gears
            if (item instanceof EOGearItem) {
                if (generatedMetalPressRecipes.add("energized_press_gear:" + mat) && !mat.equals("wooden") && out.GEAR != null) {
                    metalPress(yeet, inp.PLATE, 2, MOLD_GEAR.get(), out.GEAR, 1, id.Gear());
                }
            }

            // Foils
            if (item instanceof EOFoilItem || isVanillaPlate(inp.PLATE)) {
                if (generatedMetalPressRecipes.add("energized_press_foil:" + mat) && out.FOIL != null) {
                    metalPress(yeet, inp.PLATE, 1, MOLD_FOIL.get(), out.FOIL, 2, id.Foil());
                }
            }
        });
    }
}
