package net.radzratz.eternalores.util.compat.oritech.recipe_types;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.item.types.EOrGemItem;
import rearth.oritech.api.recipe.AtomicForgeRecipeBuilder;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.itemTagInputs;

public class EOTAtomicForgeRecipes {
    private static final TagKey<Item> FLUXITE_TAG = TagKey.create(Registries.ITEM, C("gems/fluxite"));

    public static void forge(RecipeOutput output, Object mInp, Object sInp, Item rlt, int rCnt, String sfx) {
        if (rlt == null || mInp == null) return;

        RecipeOutput yeet = new EOAdvancementYeeter(output);

        AtomicForgeRecipeBuilder builder = (AtomicForgeRecipeBuilder)
                AtomicForgeRecipeBuilder.build()
                        .input(itemTagInputs(mInp))
                        .input(itemTagInputs(sInp))
                        .input(itemTagInputs(sInp))
                        .time(20)
                        .result(rlt, rCnt);


        builder.export(yeet.withConditions(ORITECH_MOD), sfx.toLowerCase(Locale.ROOT), EternalOres.id);
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Set<String> generatedForgeRecipes = new HashSet<>();

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            if (item instanceof EOrGemItem) {
                if (generatedForgeRecipes.add("forge_ore_gems:" + mat) && out.DUST != null) {
                    forge(yeet, inp.ORE_GEM, FLUXITE_TAG, out.DUST, 2, id.Dust());
                }
            }
        });
    }
}
