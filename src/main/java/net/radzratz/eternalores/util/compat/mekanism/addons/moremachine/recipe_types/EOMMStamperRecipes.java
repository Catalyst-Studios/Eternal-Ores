package net.radzratz.eternalores.util.compat.mekanism.addons.moremachine.recipe_types;

import com.jerry.mekmm.api.datagen.recipe.builder.StamperRecipeBuilder;
import mekanism.api.recipes.ingredients.ItemStackIngredient;
import mekanism.api.recipes.ingredients.creator.IngredientCreatorAccess;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.item.types.EOFoilItem;
import net.radzratz.eternalores.item.types.EOGemItem;
import net.radzratz.eternalores.item.types.EOIngotItem;
import net.radzratz.eternalores.item.types.EORodItem;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;

import java.util.HashSet;
import java.util.Set;

import static net.minecraft.world.item.Items.*;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeOutputs.formTypeExclusions;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Tools.*;

public class EOMMStamperRecipes {
    public static void stamping(RecipeOutput output, Object inp, int iCnt, Object mold, Item rlt, int rCnt, String sfx) {
        if (rlt == null) return;

        RecipeOutput yeet = new EOAdvancementYeeter(output);
        EORecipePaths id = new EORecipePaths("");

        ItemStackIngredient input = IngredientCreatorAccess.item().from(itemTagInputs(inp), iCnt);
        ItemStackIngredient cast = IngredientCreatorAccess.item().from(itemTagInputs(mold));
        ItemStack out = new ItemStack(rlt, rCnt);

        StamperRecipeBuilder.stamping(input, cast, out).addCondition(MEKANISM_MORE_MACHINE_MOD).build(yeet, EO(id.MStamping() + sfx));
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Set<String> generateStampingRecipes = new HashSet<>();

        // Rods
        stamping(yeet, BLAZE_POWDER, 5, PLATE_MOLD, BLAZE_ROD, 1, "rods/blaze");
        stamping(yeet, WIND_CHARGE, 5, PLATE_MOLD, BREEZE_ROD, 1, "rods/breeze");

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            // Plates
            if (item instanceof EOIngotItem || isVanillaIngot(inp.INGOT)) {
                if (generateStampingRecipes.add("plate_ingot:" + mat) && out.PLATE != null) {
                    stamping(yeet, inp.INGOT, 1, PLATE_MOLD, out.PLATE, 1, id.Plate());
                }
            }

            if (item instanceof EOGemItem || isVanillaGem(inp.GEM)) {
                if (generateStampingRecipes.add("plate_gem:" + mat) && out.PLATE != null) {
                    stamping(yeet, inp.GEM, 1, PLATE_MOLD, out.PLATE, 1, id.Plate());
                }
            }

            // Rods
            if (item instanceof EORodItem) {
                if (generateStampingRecipes.add("rods:" + mat) && !mat.equals("samarium") && !formTypeExclusions().contains(mat) && out.ROD != null) {
                    stamping(yeet, inp.PLATE, 1, ROD_MOLD, out.ROD, 2, id.Rod());
                }
            }

            // Gears
            if (item instanceof EOIngotItem || isVanillaIngot(inp.INGOT)) {
                if (generateStampingRecipes.add("gears:" + mat) && out.GEAR != null) {
                    stamping(yeet, inp.PLATE, 1, GEAR_MOLD, out.GEAR, 1, id.Gear());
                }
            }

            // Foils
            if (item instanceof EOFoilItem || isVanillaPlate(inp.PLATE)) {
                if (generateStampingRecipes.add("foils:" + mat) && out.FOIL != null) {
                    stamping(yeet, inp.PLATE, 1, FOIL_MOLD, out.FOIL, 1, id.Foil());
                }
            }
        });
    }
}
