package net.radzratz.eternalores.util.compat.energized_power.recipe_types;

import me.jddev0.ep.recipe.PulverizerRecipe;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.radzratz.eternalores.block.types.EODustBlock;
import net.radzratz.eternalores.block.types.EORawBlock;
import net.radzratz.eternalores.block.types.EOreBlock;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.item.types.*;
import net.radzratz.eternalores.item.types.EOClumpItem;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.stream.Stream;

import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeOutputs.crushingExclusions;
import static net.radzratz.eternalores.util.recipes.types.EOCommonRecipes.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipePaths.resolveRecipeId;

public class EEPPulverizerRecipes {
    private static final double[] ONE = {1.0};

    public static void plvr(RecipeOutput output, Object input, Item result, int resultCount, double[] chanceNormal, double[] chanceAdvanced, @Nullable Item byproduct,
                            int byproductCount, double[] chanceByNormal, double[] chanceByAdvanced, String sfx) {
        if (result == null || input == null) return;

        RecipeOutput yeet = new EOAdvancementYeeter(output);

        EORecipePaths id = new EORecipePaths("");

        // Primary
        PulverizerRecipe.OutputItemStackWithPercentages mRlt = new PulverizerRecipe.OutputItemStackWithPercentages(new ItemStack(result, resultCount), chanceNormal, chanceAdvanced);

        // Secondary (optional)
        PulverizerRecipe.OutputItemStackWithPercentages oRlt;

        if (byproduct != null && chanceByNormal != null && chanceByAdvanced != null) {
            oRlt = new PulverizerRecipe.OutputItemStackWithPercentages(new ItemStack(byproduct, byproductCount), chanceByNormal, chanceByAdvanced);
        } else {
            oRlt = new PulverizerRecipe.OutputItemStackWithPercentages(ItemStack.EMPTY, new double[0], new double[0]);
        }

        PulverizerRecipe recipe = new PulverizerRecipe(mRlt, oRlt, itemTagInputs(input));

        yeet.accept(EO(id.EPPulverizer() + sfx.toLowerCase(Locale.ROOT)), recipe, null, ENERGIZED_POWER_MOD);
    }


    public static void generate(RecipeOutput output, Registry<Item> reg) {
        // Don't think this is necessary here, but YEET
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        // Prevents the generation of duplicate recipes on both main and outside loops
        Set<String> generatePulverizerRecipes = new HashSet<>();

        EORecipePaths paths = new EORecipePaths("");

        Stream.of(BASIC_CRUSHING).flatMap(List::stream).forEach(r -> {
            String base = resolveRecipeId(r.grp(), paths);
            plvr(yeet, r.input(), r.result(), r.resultCount(), ONE, ONE, r.byproduct(), r.byproductCount(), ONE, ONE, base + r.sfx());
        });

        Stream.of(BIO_FUEL_BASIC).flatMap(List::stream).forEach(r -> {
            String base = resolveRecipeId(r.grp(), paths);
            plvr(yeet, r.input(), r.result(), r.resultCount(), ONE, ONE, r.byproduct(), r.byproductCount(), ONE, ONE, base + r.sfx());
        });

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            OreProcessing found = ORE_PROCESSING.stream()
                    .filter(r -> r.sfx().equals(mat))
                    .findFirst()
                    .orElse(null);

            // Ingot -> Dust
            if (item instanceof EOIngotItem || isVanillaIngot(inp.INGOT)) {
                if (generatePulverizerRecipes.add("energized_power_ingot_dust:" + mat) && out.DUST != null) {
                    plvr(yeet, inp.INGOT, out.DUST, 1, ONE, ONE, null, 0, null, null, id.Dust());
                }
            }

            // Nugget -> Small Dust
            if (item instanceof EONuggetItem) {
                if (generatePulverizerRecipes.add("energized_pulverizer_nugget:" + mat) && out.SMALL_DUST != null) {
                    plvr(yeet, inp.NUGGET, out.SMALL_DUST, 1, ONE, ONE, null, 0, null, null, id.SmallDust());
                }
            }

            // Gem -> Dust
            if (item instanceof EOGemItem || isVanillaGem(inp.GEM)) {
                if (generatePulverizerRecipes.add("energized_power_gem_dust:" + mat) && out.DUST != null) {
                    plvr(yeet, inp.GEM, out.DUST, 1, ONE, ONE, null, 0, null, null, id.Dust());
                }
            }

            // Gem Shard -> Small Dust
            if (item instanceof EOGemShardItem) {
                if (generatePulverizerRecipes.add("energized_pulverizer_gem_shard:" + mat) && out.SMALL_DUST != null) {
                    plvr(yeet, inp.GEM_SHARDS, out.SMALL_DUST, 1, ONE, ONE, null, 0, null, null, id.SmallDust());
                }
            }

            // Coal -> Dust
            if (item instanceof EOCoalItem) {
                if (generatePulverizerRecipes.add("energized_pulverizer_coal:" + mat) && out.DUST != null) {
                    plvr(yeet, inp.COALS, out.DUST, 1, ONE, ONE, null, 0, null, null, id.Dust());
                }
            }

            // Raw Mats -> 2x Dust - 3x Byproduct
            if (item instanceof EORawMaterialItem || isVanillaRaw(inp.RAW)) {
                if (generatePulverizerRecipes.add("energized_pulverizer_raw:" + mat) && !mat.contains("sulfur") && out.DUST != null && out.SMALL_DUST != null) {
                    double [] mNrml = {1.0, 1.0, 0.25};
                    double [] mAdv = {1.0, 1.0, 0.50};
                    double [] bNrml = {1.0, 0.10, 0.10};
                    double [] bAdv = {1.0, 0.75, 0.25};

                    plvr(yeet, inp.RAW, out.DUST, 2, mNrml, mAdv, out.SMALL_DUST, 3, bNrml, bAdv, id.RawProc());
                }
            }

            // Clump -> Dirty Dust
            if (item instanceof EOClumpItem) {
                if (generatePulverizerRecipes.add("energized_pulverizer_clump:" + mat) && out.DIRTY_DUST != null) {
                    double [] mNrml = {1.0, 0.10};
                    double [] mAdv = {1.0, 0.40};

                    plvr(yeet, inp.CLUMP, out.DIRTY_DUST, 2, mNrml, mAdv, null, 0, null, null, id.Clump());
                }
            }

            // Block -> Dust Block
            if (item instanceof BlockItem b && b.getBlock() instanceof EODustBlock || isVanillaBlock(inp.STORAGE_BLOCK)) {
                if (generatePulverizerRecipes.add("energized_pulverizer_block:" + mat) && !crushingExclusions().contains(mat) && out.DUST_BLOCK != null) {
                    plvr(yeet, inp.STORAGE_BLOCK, out.DUST_BLOCK, 1, ONE, ONE, null, 0, null, null, id.DustBlock());
                }
            }

            // Raw Block -> 12x Dust - 6x Byproduct
            if (item instanceof BlockItem b && b.getBlock() instanceof EORawBlock || isVanillaRawBlock(inp.STORAGE_BLOCK_RAW)) {
                if (generatePulverizerRecipes.add("energized_pulverizer_raw_block:" + mat) && !mat.contains("sulfur") && out.CLEAN_DUST != null && out.SMALL_DUST != null) {
                    double [] mNrml = {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.75, 0.50, 0.25, 0.25, 0.25, 0.10, 0.10};
                    double [] mAdv = {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.75, 0.50, 0.25, 0.25, 0.10};
                    double [] bNrml = {1.0, 1.0, 0.25, 0.10, 0.10, 0.10};
                    double [] bAdv = {1.0, 1.0, 0.75, 0.50, 0.25, 0.25};

                    plvr(yeet, inp.STORAGE_BLOCK_RAW, out.CLEAN_DUST, 12, mNrml, mAdv, out.SMALL_DUST, 6, bNrml, bAdv, id.RawProcBlock());
                }
            }

            // Ore Block -> Material
            if (item instanceof BlockItem b && b.getBlock() instanceof EOreBlock || isVanillaOre(inp.ORE)) {
                if (generatePulverizerRecipes.add("energized_pulverizer_ore:" + mat) && found != null && found.primary() != null && found.byproduct() != null) {
                    double[] mNrml = found.chances().mainNormal();
                    double[] mAdv = found.chances().mainAdvanced();
                    double[] bNrml = found.chances().byproductNormal();
                    double[] bAdv = found.chances().byproductAdvanced();

                    plvr(yeet, inp.ORE, found.primary(), found.primaryCount(), mNrml, mAdv, found.byproduct(), found.byproductCount(), bNrml, bAdv, id.OreProc());
                }
            }
        });
    }
}
