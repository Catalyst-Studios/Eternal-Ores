package net.radzratz.eternalores.util.compat.mekanism.recipe_types;

import mekanism.api.chemical.Chemical;
import mekanism.api.datagen.recipe.builder.ChemicalCrystallizerRecipeBuilder;
import mekanism.api.recipes.ingredients.ChemicalStackIngredient;
import mekanism.api.recipes.ingredients.creator.IngredientCreatorAccess;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.util.compat.mekanism.chemicals.EOMekSlurries;
import net.radzratz.eternalores.item.types.EOCrystalItem;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import static mekanism.common.registries.MekanismChemicals.BRINE;
import static net.radzratz.eternalores.util.EOMaterials.materialSets.SALT_SET;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;

public class EOMKCrystallizerRecipes {
    public static void crystallizer(RecipeOutput output, Holder<Chemical> inpCh, int iChCnt, Item rlt, int rCnt, String sfx) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        EORecipePaths id = new EORecipePaths("");

        ChemicalStackIngredient inp = IngredientCreatorAccess.chemicalStack().fromHolder(inpCh, iChCnt);
        var rltS = new ItemStack(rlt, rCnt);

        ChemicalCrystallizerRecipeBuilder.crystallizing(inp, rltS).addCondition(MEKANISM_MOD).build(yeet, EO(id.MCrystal() + sfx.toLowerCase(Locale.ROOT)));
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Set<String> generateCrystallizerRecipe = new HashSet<>();

        EORecipePaths paths = new EORecipePaths("");

        crystallizer(yeet, BRINE, 15, SALT_SET.DUST.get(), 1, paths.Crystal() + "salt");

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            var slurryObj = EOMekSlurries.getSlurryMap().get(mat);
            if (slurryObj == null) return;

            Holder<Chemical> clean = slurryObj.getCleanSlurry();

            // Clean Slurry -> Crystal
            if (item instanceof EOCrystalItem) {
                if (generateCrystallizerRecipe.add("crystal:" + mat) && out.CRYSTAL != null) {
                    crystallizer(yeet, clean, 200, out.CRYSTAL, 1, id.Crystal());
                }
            }
        });
    }
}
