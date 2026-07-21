package net.radzratz.eternalores.util.compat.immersive_engineering.recipe_types;

import blusunrize.immersiveengineering.api.crafting.IngredientWithSize;
import blusunrize.immersiveengineering.api.crafting.MetalPressRecipe;
import blusunrize.immersiveengineering.api.crafting.TagOutput;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.item.types.EOFoilItem;
import net.radzratz.eternalores.item.types.EOGemItem;
import net.radzratz.eternalores.item.types.EOIngotItem;
import net.radzratz.eternalores.item.types.EOWireItem;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;

import java.util.HashSet;
import java.util.Set;

import static net.radzratz.eternalores.util.EOSetRegistries.*;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.*;

public class IEOMetalPressRecipes {
    private static void press(RecipeOutput output, Object inp, int iCnt, Item mold, Item rlt, int rCnt, String sfx) {
        if (rlt == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);
        EORecipePaths id = new EORecipePaths("");

        IngredientWithSize inpOne = new IngredientWithSize(itemTagInputs(inp), iCnt);
        TagOutput out = new TagOutput(rlt, rCnt);

        MetalPressRecipe bldr = new MetalPressRecipe(out, inpOne, mold, 2400);

        yeet.withConditions().accept(EO(id.IEPress() + sfx), bldr, null, IMMERSIVE_ENGINEERING_MOD);
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Set<String> generatedPressRecipes = new HashSet<>();

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            // Plates
            if (item instanceof EOIngotItem || isVanillaIngot(inp.INGOT)) {
                if (generatedPressRecipes.add("ingot_plate:" + mat) && out.PLATE != null) {
                    press(yeet, inp.INGOT, 1, MOLD_PLATE.get(), out.PLATE, 1, id.Plate());
                }
            }

            if (item instanceof EOGemItem || isVanillaGem(inp.GEM)) {
                if (generatedPressRecipes.add("gem_plate:" + mat) && out.PLATE != null) {
                    press(yeet, inp.GEM, 1, MOLD_PLATE.get(), out.PLATE, 1, id.Plate());
                }
            }

            // Rods
            if (item instanceof EOIngotItem || isVanillaIngot(inp.INGOT)) {
                if (generatedPressRecipes.add("ingot_rod:" + mat) && out.ROD != null) {
                    press(yeet, inp.INGOT, 1, MOLD_ROD.get(), out.ROD, 2, id.Rod());
                }
            }

            if (item instanceof EOGemItem || isVanillaGem(inp.GEM)) {
                if (generatedPressRecipes.add("gem_rod:" + mat) && out.ROD != null) {
                    press(yeet, inp.GEM, 1, MOLD_ROD.get(), out.ROD, 2, id.Rod());
                }
            }

            // Gears
            if (item instanceof EOIngotItem || isVanillaIngot(inp.INGOT)) {
                if (generatedPressRecipes.add("ingot_gear:" + mat) && out.GEAR != null) {
                    press(yeet, inp.INGOT, 4, MOLD_GEAR.get(), out.GEAR, 1, id.Gear());
                }
            }

            if (item instanceof EOGemItem || isVanillaGem(inp.GEM)) {
                if (generatedPressRecipes.add("gem_gear:" + mat) && out.GEAR != null) {
                    press(yeet, inp.GEM, 4, MOLD_GEAR.get(), out.GEAR, 1, id.Gear());
                }
            }

            if (item instanceof EOWireItem) {
                if (generatedPressRecipes.add("ingot_wire:" + mat) && out.WIRE != null) {
                    //press(yeet, inp.PLATE, 1, MOLD_WIRE.get(), out.WIRE, 2, 2400, id.Wire() + "_eternal");
                }
            }

            // Foils
            if (item instanceof EOFoilItem || isVanillaPlate(inp.PLATE)) {
                if (generatedPressRecipes.add("ingot_foil:" + mat) && out.FOIL != null) {
                    press(yeet, inp.PLATE, 1, MOLD_FOIL.get(), out.FOIL, 2, id.Foil());
                }
            }
        });
    }
}
