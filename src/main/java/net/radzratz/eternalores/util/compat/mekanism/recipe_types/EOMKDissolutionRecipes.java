package net.radzratz.eternalores.util.compat.mekanism.recipe_types;

import mekanism.api.chemical.Chemical;
import mekanism.api.chemical.ChemicalStack;
import mekanism.api.datagen.recipe.builder.ChemicalDissolutionRecipeBuilder;
import mekanism.api.recipes.ingredients.ChemicalStackIngredient;
import mekanism.api.recipes.ingredients.ItemStackIngredient;
import mekanism.api.recipes.ingredients.creator.IngredientCreatorAccess;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.block.types.EORawBlock;
import net.radzratz.eternalores.block.types.EOreBlock;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.item.types.EORawMaterialItem;
import net.radzratz.eternalores.util.compat.mekanism.chemicals.EOMekSlurries;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;

import java.util.*;

import static mekanism.common.registries.MekanismChemicals.SULFURIC_ACID;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.*;

public class EOMKDissolutionRecipes {

    public static void dissolution(RecipeOutput output, Object inp, int iCnt, Holder<Chemical> iCh, int iChCnt, Holder<Chemical> rltCh, int rltChCnt, String sfx) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        EORecipePaths id = new EORecipePaths("");

        ItemStackIngredient inpI = IngredientCreatorAccess.item().from(itemTagInputs(inp), iCnt);
        ChemicalStackIngredient acid = IngredientCreatorAccess.chemicalStack().fromHolder(iCh, iChCnt);
        ChemicalStack rlt = new ChemicalStack(rltCh, rltChCnt);

        ChemicalDissolutionRecipeBuilder.dissolution(inpI, acid, rlt, true).addCondition(MEKANISM_MOD).build(yeet, EO(id.MDissolution() + sfx.toLowerCase(Locale.ROOT)));
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Set<String> generateDissolutionRecipes = new HashSet<>();

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            var slurryObj = EOMekSlurries.getSlurryMap().get(mat);
            if (slurryObj == null) return;

            // Raw Block -> Dirty Slurry
            if (item instanceof BlockItem b && b.getBlock() instanceof EORawBlock || isVanillaRawBlock(inp.STORAGE_BLOCK_RAW)) {
                if (generateDissolutionRecipes.add("dissolution_raw_block:" + mat)) {
                    dissolution(yeet, inp.STORAGE_BLOCK_RAW, 1, SULFURIC_ACID, 2, slurryObj, 6000, id.RawProcBlock());
                }
            }

            // Raw Material -> Dirty Slurry
            if (item instanceof EORawMaterialItem || isVanillaRaw(inp.RAW)) {
                if (generateDissolutionRecipes.add("dissolution_raw_item:" + mat)) {
                    dissolution(yeet, inp.RAW, 3, SULFURIC_ACID, 1, slurryObj, 2000, id.RawProc());
                }
            }

            // Ore Block -> Dirty Slurry
            if (item instanceof BlockItem b && b.getBlock() instanceof EOreBlock || isVanillaMetalOre(inp.ORE)) {
                if (generateDissolutionRecipes.add("dissolution_ores:" + mat)) {
                    dissolution(yeet, inp.ORE, 1, SULFURIC_ACID, 1, slurryObj, 1000, id.Ore());
                }
            }
        });
    }
}
