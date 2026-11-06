package net.radzratz.eternalores.util.compat.mekanism;

import com.jerry.mekmm.api.datagen.recipe.builder.StamperRecipeBuilder;
import com.jerry.mekmm.api.recipes.basic.BasicLatheRecipe;
import com.jerry.mekmm.api.recipes.basic.BasicRollingMillRecipe;
import mekanism.api.recipes.basic.BasicItemStackToItemStackRecipe;
import mekanism.api.recipes.ingredients.ItemStackIngredient;
import mekanism.api.recipes.ingredients.creator.IngredientCreatorAccess;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.radzratz.eternalores.item.types.*;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;

import java.util.HashSet;
import java.util.Set;

import static net.minecraft.world.item.Items.*;
import static net.minecraft.world.item.Items.BREEZE_ROD;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeOutputs.formTypeExclusions;
import static net.radzratz.eternalores.util.recipes.util.EORecipePaths.PATH;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Tools.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Tools.FOIL_MOLD;

public class MoreMachineCompatRecipes {
    public static void lathe(RecipeOutput output, Object inp, int iCnt, Item rlt, int rCnt, String sfx) {
        if (rlt == null) return;

        RecipeOutput yeet = new EOAdvancementYeeter(output);

        ItemStackIngredient input = IngredientCreatorAccess.item().from(itemTagInputs(inp), iCnt);
        ItemStack out = new ItemStack(rlt, rCnt);

        BasicItemStackToItemStackRecipe bldr = new BasicLatheRecipe(input, out);

        yeet.accept(EO(PATH.MLathe() + sfx), bldr, null, MEKANISM_MORE_MACHINE_MOD);
    }

    private static void roll(RecipeOutput output, Object inp, Item rlt, int rCnt, String sfx) {
        if (rlt == null) return;

        RecipeOutput yeet = new EOAdvancementYeeter(output);

        ItemStackIngredient inputItem = IngredientCreatorAccess.item().from(itemTagInputs(inp));
        ItemStack outputItem = new ItemStack(rlt, rCnt);

        BasicItemStackToItemStackRecipe bldr = new BasicRollingMillRecipe(inputItem, outputItem);

        yeet.accept(EO(PATH.MRolling() + sfx), bldr, null, MEKANISM_MORE_MACHINE_MOD);
    }

    public static void stamping(RecipeOutput output, Object inp, int iCnt, Object mold, Item rlt, int rCnt, String sfx) {
        if (rlt == null) return;

        RecipeOutput yeet = new EOAdvancementYeeter(output);

        ItemStackIngredient input = IngredientCreatorAccess.item().from(itemTagInputs(inp), iCnt);
        ItemStackIngredient cast = IngredientCreatorAccess.item().from(itemTagInputs(mold));
        ItemStack out = new ItemStack(rlt, rCnt);

        StamperRecipeBuilder.stamping(input, cast, out).addCondition(MEKANISM_MORE_MACHINE_MOD).build(yeet, EO(PATH.MStamping() + sfx));
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Set<String> generatedMekMMRecipes = new HashSet<>();

        // Lathe
        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            if (item instanceof EOIngotItem || isVanillaIngot(inp.INGOT)) {
                if (generatedMekMMRecipes.add("mm_lathe_rod_ingot:" + mat) && out.ROD != null) {
                    lathe(yeet, inp.INGOT, 1, out.ROD, 2, id.Rod());
                }
            }

            if (item instanceof EOGemItem || isVanillaGem(inp.GEM)) {
                if (generatedMekMMRecipes.add("mm_lathe_rod_gem:" + mat) && out.ROD != null) {
                    lathe(yeet, inp.GEM, 1, out.ROD, 2, id.Rod());
                }
            }
        });

        // Rolling
        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            if (item instanceof EOWireItem) {
                if (generatedMekMMRecipes.add("mm_rolling_wire:" + mat) && out.WIRE != null) {
                    roll(yeet, inp.PLATE, out.WIRE, 2, id.Wire());
                }
            }
        });

        // Stamper
        stamping(yeet, BLAZE_POWDER, 5, ROD_MOLD, BLAZE_ROD, 1, "rods/blaze");
        stamping(yeet, WIND_CHARGE, 5, ROD_MOLD, BREEZE_ROD, 1, "rods/breeze");

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            // Plates
            if (item instanceof EOIngotItem || isVanillaIngot(inp.INGOT)) {
                if (generatedMekMMRecipes.add("mm_stamp_plate_ingot:" + mat) && out.PLATE != null) {
                    stamping(yeet, inp.INGOT, 1, PLATE_MOLD, out.PLATE, 1, id.Plate());
                }
            }

            if (item instanceof EOGemItem || isVanillaGem(inp.GEM)) {
                if (generatedMekMMRecipes.add("mm_stamp_plate_gem:" + mat) && out.PLATE != null) {
                    stamping(yeet, inp.GEM, 1, PLATE_MOLD, out.PLATE, 1, id.Plate());
                }
            }

            // Rods
            if (item instanceof EORodItem) {
                if (generatedMekMMRecipes.add("mm_stamp_rods:" + mat) && !mat.equals("samarium") && !formTypeExclusions().contains(mat) && out.ROD != null) {
                    stamping(yeet, inp.PLATE, 1, ROD_MOLD, out.ROD, 2, id.Rod());
                }
            }

            // Gears
            if (item instanceof EOIngotItem || isVanillaIngot(inp.INGOT)) {
                if (generatedMekMMRecipes.add("mm_stamp_gears:" + mat) && out.GEAR != null) {
                    stamping(yeet, inp.PLATE, 1, GEAR_MOLD, out.GEAR, 1, id.Gear());
                }
            }

            // Foils
            if (item instanceof EOFoilItem || isVanillaPlate(inp.PLATE)) {
                if (generatedMekMMRecipes.add("mm_stamp_foils:" + mat) && out.FOIL != null) {
                    stamping(yeet, inp.PLATE, 1, FOIL_MOLD, out.FOIL, 1, id.Foil());
                }
            }
        });
    }
}
