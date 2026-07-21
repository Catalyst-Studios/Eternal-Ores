package net.radzratz.eternalores.util.compat.railcraft.recipe_types;

import mods.railcraft.world.item.crafting.CrusherRecipe;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.block.types.EOBlock;
import net.radzratz.eternalores.block.types.EORawBlock;
import net.radzratz.eternalores.block.types.EOreBlock;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.item.types.*;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;
import net.radzratz.eternalores.util.recipes.types.EOCommonRecipes;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.stream.Stream;

import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.types.EOCommonRecipes.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeOutputs.crushingExclusions;
import static net.radzratz.eternalores.util.recipes.util.EORecipePaths.PATH;
import static net.radzratz.eternalores.util.recipes.util.EORecipePaths.resolveRecipeId;

public class REOCrusherRecipes {
    private static void crusher(RecipeOutput output, Object inp, Item rlt, int rCnt, @Nullable Item eRlt, int eCnt, double eRCh,
                                @Nullable Item exRlt, int exCnt, double exRCh, int time, String sfx) {
        if (rlt == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        List<CrusherRecipe.CrusherOutput> outputs = new ArrayList<>();
        outputs.add(new CrusherRecipe.CrusherOutput(itemTagInputs(rlt), rCnt, 1.0));

        CrusherRecipe bldr = new CrusherRecipe(itemTagInputs(inp), outputs, time);

        if (eRlt != null) {
            outputs.add(new CrusherRecipe.CrusherOutput(itemTagInputs(eRlt), eCnt, eRCh));
        }

        if (exRlt != null) {
            outputs.add(new CrusherRecipe.CrusherOutput(itemTagInputs(exRlt), exCnt, exRCh));
        }

        yeet.withConditions(RAILCRAFT_MOD).accept(EO(PATH.RAILCrusher() + sfx), bldr, null);
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        Set<String> generatedCrusherRecipes = new HashSet<>();

        EORecipePaths paths = new EORecipePaths("");

        Stream.of(BASIC_CRUSHING).flatMap(List::stream).forEach(r -> {
            String base = resolveRecipeId(r.grp(), paths);
            crusher(yeet, r.input(), r.result(), r.resultCount(), null, 0, 0.0, null, 0, 0.0, 200, base + r.sfx());
        });

        Stream.of(BIO_FUEL_BASIC).flatMap(List::stream).forEach(r -> {
            String base = resolveRecipeId(r.grp(), paths);
            crusher(yeet, r.input(), r.result(), r.resultCount(), r.byproduct(), r.byproductCount(), 1.0, null, 0, 0.0, 200, base + r.sfx());
        });

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            EOCommonRecipes.OreProcessing found = ORE_PROCESSING.stream()
                    .filter(r -> r.sfx().equals(mat))
                    .findFirst()
                    .orElse(null);

            if (item instanceof EOIngotItem || isVanillaIngot(inp.INGOT)) {
                if (generatedCrusherRecipes.add("railcraft_crushing_ingot:" + mat) && out.DUST != null) {
                    crusher(yeet, inp.INGOT, out.DUST, 1, null, 0, 0.0, null, 0, 0.0, 200, id.Dust());
                }
            }

            if (item instanceof EONuggetItem) {
                if (generatedCrusherRecipes.add("railcraft_crushing_nugget:" + mat) && out.SMALL_DUST != null) {
                    crusher(yeet, inp.NUGGET, out.SMALL_DUST, 1, null, 0, 0.0, null, 0, 0.0, 100, id.SmallDust());
                }
            }

            if (item instanceof EOGemShardItem) {
                if (generatedCrusherRecipes.add("railcraft_crushing_shards:" + mat) && out.SMALL_DUST != null) {
                    crusher(yeet, inp.GEM_SHARDS, out.SMALL_DUST, 1, null, 0, 0.0, null, 0, 0.0, 100, id.SmallDust());
                }
            }

            if (item instanceof EOGemItem || isVanillaGem(inp.GEM)) {
                if (generatedCrusherRecipes.add("railcraft_crushing_gem:" + mat) && out.DUST != null) {
                    crusher(yeet, inp.GEM, out.DUST, 1, null, 0, 0.0, null, 0, 0.0, 200, id.Dust());
                }
            }

            if (item instanceof EODirtyDustItem) {
                if (generatedCrusherRecipes.add("railcraft_crushing_clumps:" + mat) && out.DIRTY_DUST != null) {
                    crusher(yeet, inp.CLUMP, out.DIRTY_DUST, 1, null, 0, 0.0, null, 0, 0.0, 200, id.DirtyDust());
                }
            }

            if (item instanceof EOCoalItem) {
                if (generatedCrusherRecipes.add("railcraft_crushing_coals:" + mat) && out.DUST != null) {
                    crusher(yeet, inp.COALS, out.DUST, 1, null, 0, 0.0, null, 0, 0.0, 200, id.Dust());
                }
            }

            if (item instanceof BlockItem b && b.getBlock() instanceof EOBlock || isVanillaBlock(inp.STORAGE_BLOCK)) {
                if (generatedCrusherRecipes.add("railcraft_crushing_blocks:" + mat) && !crushingExclusions().contains(mat) && out.DUST_BLOCK != null) {
                    crusher(yeet, inp.STORAGE_BLOCK, out.DUST_BLOCK, 1, null, 0, 0.0, null, 0, 0.0, 200, id.DustBlock());
                }
            }

            if (item instanceof EORawMaterialItem || isVanillaRaw(inp.RAW)) {
                if (generatedCrusherRecipes.add("railcraft_crushing_raw_materials:" + mat) && !mat.equals("sulfur") && out.DUST != null) {
                    crusher(yeet, inp.RAW, out.DUST, 2, out.DUST, 1, 0.50, out.DUST, 1, 0.25, 200, id.RawProc());
                }
            }

            if (item instanceof BlockItem b && b.getBlock() instanceof EORawBlock || isVanillaRawBlock(inp.STORAGE_BLOCK_RAW)) {
                if (generatedCrusherRecipes.add("railcraft_crushing_raw_blocks:" + mat) && !mat.equals("sulfur") && out.DUST != null) {
                    crusher(yeet, inp.RAW_BLOCK_CASE, out.DUST, 12, out.DUST, 3, 0.50, out.DUST, 2, 0.25, 200, id.RawProcBlock());
                }
            }

            if (item instanceof BlockItem b && b.getBlock() instanceof EOreBlock || isVanillaOre(inp.ORE)) {
                if (generatedCrusherRecipes.add("railcraft_crushing_ore_proc:" + mat) && found != null && found.primary() != null && found.byproduct() != null && found.byproductDust() != null) {
                    crusher(yeet, inp.ORE, found.primary(), found.primaryCount(), found.byproduct(), found.byproductCount(), 0.75, found.byproductDust(), 2, 0.25, 200, id.OreProc());
                }
            }
        });
    }
}
