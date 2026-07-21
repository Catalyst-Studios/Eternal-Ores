package net.radzratz.eternalores.util.compat.mekanism.recipe_types;

import mekanism.api.chemical.Chemical;
import mekanism.api.chemical.ChemicalStack;
import mekanism.api.datagen.recipe.builder.FluidChemicalToChemicalRecipeBuilder;
import mekanism.api.recipes.ingredients.ChemicalStackIngredient;
import mekanism.api.recipes.ingredients.FluidStackIngredient;
import mekanism.api.recipes.ingredients.creator.IngredientCreatorAccess;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.Fluid;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.util.compat.mekanism.chemicals.EOMekSlurries;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import static net.neoforged.neoforge.common.Tags.Fluids.WATER;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;

public class EOMKWashingRecipes {

    public static void washing(RecipeOutput output, TagKey<Fluid> fInp, int fCnt, Holder<Chemical> iCh, int iChCnt, Holder<Chemical> rltCh, int rChCnt, String sfx) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);
        EORecipePaths id = new EORecipePaths("");

        FluidStackIngredient fIn = IngredientCreatorAccess.fluid().from(fInp, fCnt);
        ChemicalStackIngredient inpT = IngredientCreatorAccess.chemicalStack().fromHolder(iCh, iChCnt);
        ChemicalStack rlts = new ChemicalStack(rltCh, rChCnt);

        FluidChemicalToChemicalRecipeBuilder.washing(fIn, inpT, rlts).addCondition(MEKANISM_MOD).build(yeet, EO(id.MWasher() + sfx.toLowerCase(Locale.ROOT)));
    }

    public static void generate(RecipeOutput output, Registry<Item> ignoreditemRegistry) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Set<String> generateWashingRecipes = new HashSet<>();

        itemRecipeActions(ignoreditemRegistry, (item, path, mat, inp, out, id) -> {
            var slurryObj = EOMekSlurries.getSlurryMap().get(mat);
            if (slurryObj == null) return;

            Holder<Chemical> dirtySlurry = EOMekSlurries.getSlurryMap().get(mat);
            Holder<Chemical> cleanSlurry = EOMekSlurries.getSlurryMap().get(mat).getCleanSlurry();

            if (generateWashingRecipes.add("slurry:" + mat)) {
                washing(yeet, WATER, 5, dirtySlurry, 1, cleanSlurry, 1, id.Slurry());
            }
        });
    }
}
