package net.radzratz.eternalores.util.compat.mekanism.recipe_types;

import mekanism.api.chemical.Chemical;
import mekanism.api.datagen.recipe.builder.ItemStackChemicalToItemStackRecipeBuilder;
import mekanism.api.recipes.ingredients.ChemicalStackIngredient;
import mekanism.api.recipes.ingredients.ItemStackIngredient;
import mekanism.api.recipes.ingredients.creator.IngredientCreatorAccess;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.radzratz.eternalores.block.types.EORawBlock;
import net.radzratz.eternalores.block.types.EOreBlock;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.item.types.EORawMaterialItem;
import net.radzratz.eternalores.item.types.EOShardItem;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;

import java.util.HashSet;
import java.util.Set;

import static mekanism.common.registries.MekanismChemicals.OXYGEN;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.*;

public class EOMKPurifyingRecipes {

    public static void purify(RecipeOutput output, Object inp, int iCnt, Holder<Chemical> iCh, int iChCnt, Item rlt, int rCnt, String sfx) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);
        EORecipePaths id = new EORecipePaths("");

        ItemStackIngredient inpT = IngredientCreatorAccess.item().from(itemTagInputs(inp), iCnt);
        ChemicalStackIngredient chInp = IngredientCreatorAccess.chemicalStack().fromHolder(iCh, iChCnt);
        var rlts = new ItemStack(rlt, rCnt);

        ItemStackChemicalToItemStackRecipeBuilder.purifying(inpT, chInp, rlts, true).addCondition(MEKANISM_MOD).build(yeet, EO(id.MPurifier() + sfx));
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Set<String> generatePurifyingRecipes = new HashSet<>();

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            // Shard -> Clump
            if (item instanceof EOShardItem) {
                if (generatePurifyingRecipes.add("shards:" + mat) && out.CLUMP != null) {
                    purify(yeet, inp.SHARD, 1, OXYGEN, 1, out.CLUMP, 1, id.Shards());
                }
            }

            // Raw Material -> 2x Clump
            if (item instanceof EORawMaterialItem || isVanillaRaw(inp.RAW)) {
                if (generatePurifyingRecipes.add("raw:" + mat) && out.CLUMP != null) {
                    purify(yeet, inp.RAW, 1, OXYGEN, 1, out.CLUMP, 2, id.RawProc());
                }
            }

            // Ore Block -> 3x Clump
            if (item instanceof BlockItem b && b.getBlock() instanceof EOreBlock || isVanillaMetalOre(inp.ORE)) {
                if (generatePurifyingRecipes.add("ore:" + mat) && out.CLUMP != null) {
                    purify(yeet, inp.ORE, 1, OXYGEN, 1, out.CLUMP, 3, id.OreProc());
                }
            }

            // Raw Block -> 18x Clump
            if (item instanceof BlockItem b && b.getBlock() instanceof EORawBlock || isVanillaRawBlock(inp.STORAGE_BLOCK_RAW)) {
                if (generatePurifyingRecipes.add("raw_block:" + mat) && out.CLUMP != null) {
                    purify(yeet, inp.STORAGE_BLOCK_RAW, 1, OXYGEN, 2, out.CLUMP, 18, id.RawProcBlock());
                }
            }
        });
    }
}
