package net.radzratz.eternalores.util.compat.actually_additions.recipe_types;

import de.ellpeck.actuallyadditions.data.CrushingRecipeGenerator;
import de.ellpeck.actuallyadditions.mod.crafting.CrushingRecipe;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.radzratz.eternalores.block.types.EODustBlock;
import net.radzratz.eternalores.block.types.EOreBlock;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.item.types.*;
import net.radzratz.eternalores.item.types.EODirtyDustItem;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.stream.Stream;

import static net.minecraft.world.item.Items.*;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeOutputs.crushingExclusions;
import static net.radzratz.eternalores.util.recipes.types.EOCommonRecipes.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipePaths.resolveRecipeId;

public class EOAACrusherRecipes {
    public static void chsr(RecipeOutput output, Ingredient inp, Item rlt, int rCnt, float rChc, @Nullable Item bRlt, int bCnt, float bChc, String sfx) {
        if (rlt == null) return;
        if (bRlt == null && bCnt > 0) return;

        // YEET
        RecipeOutput yeet = new EOAdvancementYeeter(output);
        EORecipePaths id = new EORecipePaths("");

        ItemStack rItem = new ItemStack(rlt, rCnt);
        CrushingRecipe.CrushingResult main =
                new CrushingRecipe.CrushingResult(rItem, rChc);

        CrushingRecipeGenerator.CrushingBuilder bldr =
                new CrushingRecipeGenerator.CrushingBuilder(inp, main);

        if (bRlt != null) {
            ItemStack bItem = new ItemStack(bRlt, bCnt);
            CrushingRecipe.CrushingResult by =
                    new CrushingRecipe.CrushingResult(bItem, bChc);
            bldr.addResult(by);
        }

        bldr.save(yeet.withConditions(ACTUALLY_ADDITIONS_MOD), EO(id.Crush() + sfx));
    }

    public static void chsr(RecipeOutput output, Object inp, Item rlt, int rCnt, float rChc, String sfx) {
        chsr(output, itemTagInputs(inp), rlt, rCnt, rChc, null, 0, 0.0f, sfx);
    }

    public static void chsr(RecipeOutput output, Object inp, Item rlt, int rCnt, float rChc, Item bRlt, int bCnt, float bChc, String sfx) {
        chsr(output, itemTagInputs(inp), rlt, rCnt, rChc, bRlt, bCnt, bChc, sfx);
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Set<String> generateCrushingRecipes = new HashSet<>();

        EORecipePaths paths = new EORecipePaths("");

        Stream.of(BASIC_CRUSHING).flatMap(List::stream).forEach(r -> {
            String base = resolveRecipeId(r.grp(), paths);
            chsr(yeet, r.input(), r.result(), r.resultCount(), 1.0f, r.byproduct(), r.byproductCount(), 1.0f, base + r.sfx());
        });

        Stream.of(BIO_FUEL_BASIC).flatMap(List::stream).forEach(r -> {
            String base = resolveRecipeId(r.grp(), paths);
            chsr(yeet, r.input(), r.result(), r.resultCount(), 1.0f, r.byproduct(), r.byproductCount(), 1.0f, base + r.sfx());
        });

        chsr(yeet, IRON_HORSE_ARMOR.asItem(), IRON_INGOT.asItem(), 6, 1.0f, paths.Dust() + "iron_horse_armor");
        chsr(yeet, GOLDEN_HORSE_ARMOR.asItem(), GOLD_INGOT.asItem(), 6, 1.0f, paths.Dust() + "gold_horse_armor");

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            OreProcessing found = ORE_PROCESSING.stream()
                    .filter(r -> r.sfx().equals(mat))
                    .findFirst()
                    .orElse(null);

            // Raw Material -> Dust/Small Dust
            if (item instanceof EORawMaterialItem) {
                if (generateCrushingRecipes.add("actually_crushing_raw:" + mat) && !mat.equals("sulfur") && out.DUST != null && out.SMALL_DUST != null) {
                    chsr(yeet, inp.RAW, out.DUST, 2, 1.0f, out.SMALL_DUST, 3, 0.25f, id.Duplication());
                }
            }

            // Clump -> Dirty Dust
            if (item instanceof EODirtyDustItem) {
                if (generateCrushingRecipes.add("actually_crushing_dirty_dust:" + mat) && out.DIRTY_DUST != null) {
                    chsr(yeet, inp.CLUMP, out.DIRTY_DUST, 1, 1.0f, id.DirtyDust());
                }
            }

            // Block -> Dust Block
            if (item instanceof BlockItem b && b.getBlock() instanceof EODustBlock | isVanillaBlock(inp.STORAGE_BLOCK)) {
                if (generateCrushingRecipes.add("actually_crushing_block:" + mat) && !crushingExclusions().contains(mat) && out.DUST_BLOCK != null) {
                    chsr(yeet, inp.STORAGE_BLOCK, out.DUST_BLOCK, 1, 1.0f, id.DustBlock());
                }
            }

            // Ingot -> Dust
            if (item instanceof EOIngotItem || isVanillaIngot(inp.INGOT)) {
                if (generateCrushingRecipes.add("actually_crushing_ingot:" + mat) && out.DUST != null) {
                    chsr(yeet, inp.INGOT, out.DUST, 1, 1.0f, id.Dust());
                }
            }

            // Gem -> Dust
            if (item instanceof EOGemItem || isVanillaGem(inp.GEM)) {
                if (generateCrushingRecipes.add("actually_crushing_gem:" + mat) && out.DUST != null) {
                    chsr(yeet, inp.GEM, out.DUST, 1, 1.0f, id.Dust());
                }
            }

            // Nugget -> Small Dust
            if (item instanceof EONuggetItem) {
                if (generateCrushingRecipes.add("actually_crushing_nugget:" + mat) && out.SMALL_DUST != null) {
                    chsr(yeet, inp.NUGGET, out.SMALL_DUST, 1, 1.0f, id.SmallDust());
                }
            }

            // Gem Shard -> Small Dust
            if (item instanceof EOGemShardItem) {
                if (generateCrushingRecipes.add("actually_crushing_gem_shard:" + mat) && out.SMALL_DUST != null) {
                    chsr(yeet, inp.GEM_SHARDS, out.SMALL_DUST, 1, 1.0f, id.SmallDust());
                }
            }

            // Coals -> Dust
            if (item instanceof EOCoalItem) {
                if (generateCrushingRecipes.add("actually_crushing_coal:" + mat) && out.DUST != null) {
                    chsr(yeet, inp.COALS, out.DUST, 1, 1.0f, id.Dust());
                }
            }

            // Ore -> Material - Byproduct
            if (item instanceof BlockItem b && b.getBlock() instanceof EOreBlock || isVanillaOre(inp.ORE)) {
                if (generateCrushingRecipes.add("ore_proc:" + mat) && found != null && found.primary() != null && found.byproduct() != null) {
                    chsr(yeet, inp.ORE, found.primary(), found.primaryCount(), 1.0f, found.byproduct(), found.byproductCount(), 1.0f, id.OreProc());
                }
            }
        });
    }
}
