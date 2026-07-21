package net.radzratz.eternalores.util.compat.oritech.recipe_types;

import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.Fluid;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.item.types.EOClumpItem;
import rearth.oritech.api.recipe.RefineryRecipeBuilder;

import java.util.HashSet;
import java.util.Set;

import static net.minecraft.world.level.material.Fluids.LAVA;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.itemTagInputs;
import static rearth.oritech.init.FluidContent.STILL_SHEOL_FIRE;

public class EOTRefineryRecipes {
    public static void refine(RecipeOutput output, Object inp, Fluid fInp, float fCnt, Item rlt, int rCnt, Fluid fRlt, float fRltCnt, String sfx) {
        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        RefineryRecipeBuilder bldr = (RefineryRecipeBuilder)
                RefineryRecipeBuilder.build()
                        .input(itemTagInputs(inp))
                        .fluidInput(fInp, fCnt)
                        .result(rlt, rCnt)
                        .fluidOutput(fRlt, fRltCnt);

        bldr.export(yeet.withConditions(ORITECH_MOD), sfx, EternalOres.id);
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        Set<String> generatedRefineryRecipes = new HashSet<>();

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            // Recipe Suffix
            String refineryPath = "rawsheol/" + mat;

            if (item instanceof EOClumpItem) {
                if (generatedRefineryRecipes.add("refine:" + mat) && out.CLUMP != null) {
                    refine(yeet, inp.RAW, STILL_SHEOL_FIRE.get(), 0.250f, out.CLUMP, 2, LAVA, 0.100f, refineryPath);
                }
            }
        });
    }
}
