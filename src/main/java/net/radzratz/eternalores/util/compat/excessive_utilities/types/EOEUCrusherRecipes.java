package net.radzratz.eternalores.util.compat.excessive_utilities.types;

import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import dev.aaronhowser.mods.excessive_utilities.datagen.recipe.builder.machine.CrusherRecipeBuilder;
import net.minecraft.world.item.ItemStack;
import net.radzratz.eternalores.block.types.EODustBlock;
import net.radzratz.eternalores.block.types.EOreBlock;
import net.radzratz.eternalores.item.types.*;
import net.radzratz.eternalores.util.recipes.types.EOCommonRecipes;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;
import org.jetbrains.annotations.Nullable;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static net.radzratz.eternalores.util.EOUtils.EO;
import static net.radzratz.eternalores.util.EOUtils.EUTILS_MOD;
import static net.radzratz.eternalores.util.recipes.types.EOCommonRecipes.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeOutputs.crushingExclusions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeOutputs.formTypeExclusions;
import static net.radzratz.eternalores.util.recipes.util.EORecipePaths.resolveRecipeId;

public class EOEUCrusherRecipes {
    public static void crusher(RecipeOutput output, Object input, Item result, int rCount, @Nullable Item eResult, int eRCount, float chance, int fe, int ticks, String sfx) {
        if (result == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        CrusherRecipeBuilder builder =
                new CrusherRecipeBuilder(itemTagInputs(input), new ItemStack(result, rCount), ItemStack.EMPTY, chance, fe, ticks);

        if (eResult != null) {
            builder = new CrusherRecipeBuilder(itemTagInputs(input), new ItemStack(result, rCount), new ItemStack(eResult, eRCount), chance, fe, ticks);
        }

        builder.save(yeet.withConditions(EUTILS_MOD), EO(sfx));
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Set<String> generateCrushingRecipes = new HashSet<>();

        EORecipePaths paths = new EORecipePaths("");

        Stream.of(BASIC_CRUSHING).flatMap(List::stream).forEach(r -> {
            String base = resolveRecipeId(r.grp(), paths);
            crusher(yeet, r.input(), r.result(), r.resultCount(), r.byproduct(), r.byproductCount(), 1.0f, 100, 50, base + r.sfx());
        });

        Stream.of(BIO_FUEL_BASIC).flatMap(List::stream).forEach(r -> {
            String base = resolveRecipeId(r.grp(), paths);
            crusher(yeet, r.input(), r.result(), r.resultCount(), r.byproduct(), r.byproductCount(), 1.0f, 100, 50, base + r.sfx());
        });

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            EOCommonRecipes.OreProcessing found = ORE_PROCESSING.stream()
                    .filter(r -> r.sfx().equals(mat))
                    .findFirst()
                    .orElse(null);

            // Raw Material -> Dust/Small Dust
            if (item instanceof EORawMaterialItem) {
                if (generateCrushingRecipes.add("actually_crushing_raw:" + mat) && !mat.equals("sulfur") && out.DUST != null && out.SMALL_DUST != null) {
                    crusher(yeet, inp.RAW, out.DUST, 2, out.SMALL_DUST, 3, 0.25f, 200, 50, id.Duplication());
                }
            }

            // Clump -> Dirty Dust
            if (item instanceof EODirtyDustItem) {
                if (generateCrushingRecipes.add("actually_crushing_dirty_dust:" + mat) && out.DIRTY_DUST != null) {
                    crusher(yeet, inp.CLUMP, out.DIRTY_DUST, 1,  null, 0, 0.0f, 200, 50, id.DirtyDust());
                }
            }

            // Block -> Dust Block
            if (item instanceof BlockItem b && b.getBlock() instanceof EODustBlock | isVanillaBlock(inp.STORAGE_BLOCK)) {
                if (generateCrushingRecipes.add("actually_crushing_block:" + mat) && !crushingExclusions().contains(mat) && !formTypeExclusions().contains(mat) && out.DUST_BLOCK != null) {
                    crusher(yeet, inp.STORAGE_BLOCK, out.DUST_BLOCK, 1, null, 0, 0.0f, 200, 50, id.DustBlock());
                }
            }

            // Ingot -> Dust
            if (item instanceof EOIngotItem || isVanillaIngot(inp.INGOT)) {
                if (generateCrushingRecipes.add("actually_crushing_ingot:" + mat) && out.DUST != null) {
                    crusher(yeet, inp.INGOT, out.DUST, 1, null, 0, 0.0f, 100, 50, id.Dust());
                }
            }

            // Gem -> Dust
            if (item instanceof EOGemItem || isVanillaGem(inp.GEM)) {
                if (generateCrushingRecipes.add("actually_crushing_gem:" + mat) && out.DUST != null) {
                    crusher(yeet, inp.GEM, out.DUST, 1, null, 0, 0.0f, 100, 50, id.Dust());
                }
            }

            // Nugget -> Small Dust
            if (item instanceof EONuggetItem) {
                if (generateCrushingRecipes.add("actually_crushing_nugget:" + mat) && out.SMALL_DUST != null) {
                    crusher(yeet, inp.NUGGET, out.SMALL_DUST, 1, null, 0, 0.0f, 50, 50, id.SmallDust());
                }
            }

            // Gem Shard -> Small Dust
            if (item instanceof EOGemShardItem) {
                if (generateCrushingRecipes.add("actually_crushing_gem_shard:" + mat) && out.SMALL_DUST != null) {
                    crusher(yeet, inp.GEM_SHARDS, out.SMALL_DUST, 1, null, 0, 0.0f, 100, 50, id.SmallDust());
                }
            }

            // Coals -> Dust
            if (item instanceof EOCoalItem) {
                if (generateCrushingRecipes.add("actually_crushing_coal:" + mat) && out.DUST != null) {
                    crusher(yeet, inp.COALS, out.DUST, 1, null, 0, 0.0f, 100, 50, id.Dust());
                }
            }

            // Ore -> Material - Byproduct
            if (item instanceof BlockItem b && b.getBlock() instanceof EOreBlock || isVanillaOre(inp.ORE)) {
                if (generateCrushingRecipes.add("ore_proc:" + mat) && found != null && found.primary() != null && found.byproduct() != null) {
                    crusher(yeet, inp.ORE, found.primary(), found.primaryCount(), found.byproduct(), found.byproductCount(), 1.0f, 100, 50, id.OreProc());
                }
            }
        });
    }
}
