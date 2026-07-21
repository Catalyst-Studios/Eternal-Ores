package net.radzratz.eternalores.util.compat.immersive_engineering.recipe_types;

import blusunrize.immersiveengineering.api.crafting.CrusherRecipe;
import blusunrize.immersiveengineering.api.crafting.StackWithChance;
import blusunrize.immersiveengineering.api.crafting.TagOutput;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.block.types.EODustBlock;
import net.radzratz.eternalores.block.types.EORawBlock;
import net.radzratz.eternalores.block.types.EOreBlock;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.item.types.*;
import net.radzratz.eternalores.util.recipes.types.EOCommonRecipes;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.stream.Stream;

import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.types.EOCommonRecipes.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeOutputs.crushingExclusions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipePaths.resolveRecipeId;

public class IEOCrusherRecipes {
    private static void crusher(RecipeOutput output, Object input, Item result, int resultCount, @Nullable Item byproduct, int byproductCount, float byChance, int energy, String sfx) {
        if (result == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);
        EORecipePaths id = new EORecipePaths("");

        TagOutput out = new TagOutput(result, resultCount);

        List<StackWithChance> secondaryOutputs = new ArrayList<>();

        if (byproduct != null) {
            secondaryOutputs.add(new StackWithChance(new TagOutput(byproduct, byproductCount), byChance));
        }

        CrusherRecipe bldr = new CrusherRecipe(out, itemTagInputs(input), energy, secondaryOutputs);

        yeet.withConditions().accept(EO(id.IECrusher() + sfx), bldr, null, IMMERSIVE_ENGINEERING_MOD);
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Set<String> generatedCrusherRecipes = new HashSet<>();

        EORecipePaths paths = new EORecipePaths("");

        Stream.of(BASIC_CRUSHING).flatMap(List::stream).forEach(r -> {
            String base = resolveRecipeId(r.grp(), paths);

            if (r.sfx().contains("gravel") || r.sfx().contains("sand")) return;

            crusher(yeet, r.input(), r.result(), r.resultCount(), null, 0, 0f, 3000, base + r.sfx());
        });

        Stream.of(BIO_FUEL_BASIC).flatMap(List::stream).forEach(r -> {
            String base = resolveRecipeId(r.grp(), paths);
            crusher(yeet, r.input(), r.result(), r.resultCount(), r.byproduct(), r.byproductCount(), 1f, 2000, base + r.sfx());
        });

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            EOCommonRecipes.OreProcessing found = ORE_PROCESSING.stream()
                    .filter(r -> r.sfx().equals(mat))
                    .findFirst()
                    .orElse(null);

            // Dusts
            if (item instanceof EOIngotItem || isVanillaIngot(inp.INGOT)) {
                if (generatedCrusherRecipes.add("ie_crusher_ingot:" + mat) && out.DUST != null) {
                    crusher(yeet, inp.INGOT, out.DUST, 1, null, 0, 0f, 3000, id.Dust());
                }
            }

            if (item instanceof EOGemItem || isVanillaGem(inp.GEM)) {
                if (generatedCrusherRecipes.add("ie_crusher_gem:" + mat) && out.DUST != null) {
                    crusher(yeet, inp.GEM, out.DUST, 1, null, 0, 0f, 3000, id.Dust());
                }
            }

            if (item instanceof EOCoalItem) {
                if (generatedCrusherRecipes.add("ie_crusher_coal:" + mat) && out.DUST != null) {
                    crusher(yeet, inp.COALS, out.DUST, 1, null, 0, 0f, 3000, id.Dust());
                }
            }

            // Small Dusts
            if (item instanceof EONuggetItem) {
                if (generatedCrusherRecipes.add("ie_crusher_nugget:" + mat) && out.SMALL_DUST != null) {
                    crusher(yeet, inp.NUGGET, out.SMALL_DUST, 1, null, 0, 0f, 1500, id.SmallDust());
                }
            }

            if (item instanceof EOGemShardItem) {
                if (generatedCrusherRecipes.add("ie_crusher_gem_shard:" + mat) && out.SMALL_DUST != null) {
                    crusher(yeet, inp.GEM_SHARDS, out.SMALL_DUST, 1, null, 0, 0f, 1500, id.SmallDust());
                }
            }

            // Dust Block
            if (item instanceof BlockItem b && b.getBlock() instanceof EODustBlock || isVanillaBlock(inp.STORAGE_BLOCK)) {
                if (generatedCrusherRecipes.add("dust_block:" + mat) && !crushingExclusions().contains(mat) && out.DUST_BLOCK != null) {
                    crusher(yeet, inp.STORAGE_BLOCK, out.DUST_BLOCK, 1, null, 0, 0f, 9500, id.DustBlock());
                }
            }

            // Raw Processing
            if (item instanceof EORawMaterialItem || isVanillaRaw(inp.RAW)) {
                if (generatedCrusherRecipes.add("raw_proc:" + mat) && !mat.contains("sulfur") && out.DUST != null) {
                    crusher(yeet, inp.RAW, out.DUST, 2, out.SMALL_DUST, 3, 0.25f, 6000, id.Raw());
                }
            }

            if (item instanceof BlockItem b && b.getBlock() instanceof EORawBlock || isVanillaRawBlock(inp.STORAGE_BLOCK_RAW)) {
                if (generatedCrusherRecipes.add("raw_block_proc:" + mat) && !mat.equals("sulfur") && out.DUST != null && out.SMALL_DUST != null) {
                    crusher(yeet, inp.STORAGE_BLOCK_RAW, out.DUST, 18, out.SMALL_DUST, 27, 0.25f, 11000, id.RawBlock());
                }
            }

            // Dirty Dust
            if (item instanceof EODirtyDustItem) {
                if (generatedCrusherRecipes.add("dirty_dust:" + mat) && out.DIRTY_DUST != null) {
                    crusher(yeet, inp.CLUMP, out.DIRTY_DUST, 1, out.DIRTY_DUST, 1, 0.10f, 5000, id.DirtyDust());
                }
            }

            // Ore -> Material/Byproduct/Extra
            if (item instanceof BlockItem b && b.getBlock() instanceof EOreBlock || isVanillaOre(inp.ORE)) {
                if (generatedCrusherRecipes.add("ore_block:" + mat) && found != null && found.primary() != null && found.byproduct() != null) {
                    crusher(yeet, inp.ORE, found.primary(), found.primaryCount(), found.byproduct(), found.byproductCount(), 0.22f, 8250, id.Ore());
                }
            }
        });
    }
}
