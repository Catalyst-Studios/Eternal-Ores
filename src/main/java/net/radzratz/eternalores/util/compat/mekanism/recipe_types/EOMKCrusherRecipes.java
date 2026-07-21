package net.radzratz.eternalores.util.compat.mekanism.recipe_types;

import mekanism.api.datagen.recipe.builder.ItemStackToItemStackRecipeBuilder;
import mekanism.api.recipes.ingredients.ItemStackIngredient;
import mekanism.api.recipes.ingredients.creator.IngredientCreatorAccess;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.radzratz.eternalores.block.types.EODustBlock;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.item.types.*;
import net.radzratz.eternalores.item.types.EODirtyDustItem;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;

import java.util.*;
import java.util.stream.Stream;

import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.types.EOCommonRecipes.BASIC_CRUSHING;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipePaths.resolveRecipeId;

public class EOMKCrusherRecipes {
    public static void crusher(RecipeOutput output, Object inp, Item rlt, int cnt, String sfx) {
        if (rlt == null) return;

        RecipeOutput yeet = new EOAdvancementYeeter(output);
        EORecipePaths id = new EORecipePaths("");

        ItemStackIngredient inpT = IngredientCreatorAccess.item().from(itemTagInputs(inp));
        ItemStack rltT = new ItemStack(rlt, cnt);

        ItemStackToItemStackRecipeBuilder.crushing(inpT, rltT).addCondition(MEKANISM_MOD).build(yeet, EO(id.MCrusher() + sfx));
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Set<String> generateCrushingRecipes = new HashSet<>();

        EORecipePaths paths = new EORecipePaths("");

        Stream.of(BASIC_CRUSHING).flatMap(List::stream).forEach(r -> {
            String base = resolveRecipeId(r.grp(), paths);
            crusher(yeet, r.input(), r.result(), r.resultCount(), base + r.sfx());
        });

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            // Clump -> Dirty Dust
            if (item instanceof EODirtyDustItem) {
                if (generateCrushingRecipes.add("mek_crusher_dirty_dust:" + mat) && out.DIRTY_DUST != null) {
                    crusher(yeet, inp.CLUMP, out.DIRTY_DUST, 1, id.DirtyDust());
                }
            }

            // Block -> Dust Block
            if (item instanceof BlockItem b && b.getBlock() instanceof EODustBlock || isVanillaBlock(inp.STORAGE_BLOCK)) {
                if (generateCrushingRecipes.add("mek_crusher_dust_block:" + mat) && !mat.contains("coke_coal") && out.DUST_BLOCK != null) {
                    crusher(yeet, inp.STORAGE_BLOCK, out.DUST_BLOCK, 1, id.DustBlock());
                }
            }

            // Ingot -> Dust
            if (item instanceof EOIngotItem || isVanillaIngot(inp.INGOT)) {
                if (generateCrushingRecipes.add("mek_crusher_ingot_dust:" + mat) && out.DUST != null) {
                    crusher(yeet, inp.INGOT, out.DUST, 1, id.Dust());
                }
            }

            // Nugget -> Small Dust
            if (item instanceof EONuggetItem) {
                if (generateCrushingRecipes.add("mek_crusher_smol_dust:" + mat) && out.SMALL_DUST != null) {
                    crusher(yeet, inp.NUGGET, out.SMALL_DUST, 1, id.SmallDust());
                }
            }

            // Gem -> Dust
            if (item instanceof EOGemItem || isVanillaGem(inp.GEM)) {
                if (generateCrushingRecipes.add("mek_crusher_gem_dust:" + mat) && out.DUST != null) {
                    crusher(yeet, inp.GEM, out.DUST, 1, id.Dust());
                }
            }

            // Gem Shard -> Small Dust
            if (item instanceof EOGemShardItem) {
                if (generateCrushingRecipes.add("mek_crusher_gem_shard_dust:" + mat) && out.SMALL_DUST != null) {
                    crusher(yeet, inp.GEM_SHARDS, out.SMALL_DUST, 1, id.SmallDust());
                }
            }
        });
    }
}
