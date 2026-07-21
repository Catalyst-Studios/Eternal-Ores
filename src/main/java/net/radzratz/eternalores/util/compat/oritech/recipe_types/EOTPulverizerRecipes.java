package net.radzratz.eternalores.util.compat.oritech.recipe_types;

import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.*;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.block.types.*;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.item.types.*;
import net.radzratz.eternalores.util.recipes.types.EOCommonRecipes;
import net.radzratz.eternalores.item.types.EOClumpItem;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;
import org.jetbrains.annotations.Nullable;
import rearth.oritech.api.recipe.PulverizerRecipeBuilder;

import java.util.*;
import java.util.stream.Stream;

import static net.neoforged.neoforge.common.Tags.Items.*;
import static net.radzratz.eternalores.util.EOMaterials.materialSets.*;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeOutputs.crushingExclusions;
import static net.radzratz.eternalores.util.recipes.types.EOCommonRecipes.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipePaths.resolveRecipeId;
import static rearth.oritech.init.ItemContent.ENDERIC_COMPOUND;

public class EOTPulverizerRecipes {
    public static void pulverize(RecipeOutput output, Object inp, Item rlt, int rCnt, @Nullable Item bRlt, int bRCnt, String sfx) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        PulverizerRecipeBuilder bldr = (PulverizerRecipeBuilder)
                PulverizerRecipeBuilder.build()
                .input(itemTagInputs(inp))
                .result(rlt, rCnt);

        if (bRlt != null) {
            bldr.result(bRlt, bRCnt);
        }

        bldr.export(yeet.withConditions(ORITECH_MOD), sfx, EternalOres.id);
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Set<String> generatedPulverizerRecipes = new HashSet<>();

        EORecipePaths paths = new EORecipePaths("");

        pulverize(yeet, ENDER_PEARLS, ENDERIC_COMPOUND.asItem(), 8, ENDER_PEARL_SET.DUST.get(), 1, paths.Dust() + "ender");

        Stream.of(BASIC_CRUSHING).flatMap(List::stream).forEach(r -> {
            String base = resolveRecipeId(r.grp(), paths);

            if (r.input().equals(ENDER_PEARLS)) return;

            pulverize(yeet, r.input(), r.result(), r.resultCount(), r.byproduct(), r.byproductCount(), base + r.sfx());
        });

        Stream.of(BIO_FUEL_BASIC).flatMap(List::stream).forEach(r -> {
            String base = resolveRecipeId(r.grp(), paths);
            pulverize(yeet, r.input(), r.result(), r.resultCount(), r.byproduct(), r.byproductCount(), base + r.sfx());
        });

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            EOCommonRecipes.OreProcessing found = ORE_PROCESSING.stream()
                    .filter(r -> r.sfx().equals(mat))
                    .findFirst()
                    .orElse(null);


            // Ingot -> Dust
            if (item instanceof EOIngotItem || isVanillaIngot(inp.INGOT)) {
                if (generatedPulverizerRecipes.add("dusts_ingot:" + mat) && out.DUST != null) {
                    pulverize(yeet, inp.INGOT, out.DUST, 1, null, 0, id.Dust());
                }
            }

            // Gem -> Dust
            if (item instanceof EOGemItem || isVanillaGem(inp.GEM)) {
                if (generatedPulverizerRecipes.add("dusts_gem:" + mat) && out.DUST != null) {
                    pulverize(yeet, inp.GEM, out.DUST, 1, null, 0, id.Dust());
                }
            }

            // Coal -> Dust
            if (item instanceof EOCoalItem) {
                if (generatedPulverizerRecipes.add("ori_pulv_coal:" + mat) && out.DUST != null) {
                    pulverize(yeet, inp.COALS, out.DUST, 1, null, 0, id.Dust());
                }
            }

            // Material Block -> Dust Block
            if (item instanceof BlockItem b && b.getBlock() instanceof EODustBlock || isVanillaBlock(inp.STORAGE_BLOCK)) {
                if (generatedPulverizerRecipes.add("ori_pulv_dust_block:" + mat) && !crushingExclusions().contains(mat) && out.DUST_BLOCK != null) {
                    pulverize(yeet, inp.STORAGE_BLOCK, out.DUST_BLOCK, 1, null, 0, id.DustBlock());
                }
            }

            // Nugget -> Small Dust
            if (item instanceof EONuggetItem) {
                if (generatedPulverizerRecipes.add("dusts_small:" + mat) && out.SMALL_DUST != null) {
                    pulverize(yeet, inp.NUGGET, out.SMALL_DUST, 1, null, 0, id.SmallDust());
                }
            }

            // Nugget -> Small Dust
            if (item instanceof EOGemShardItem) {
                if (generatedPulverizerRecipes.add("dusts_small_gem:" + mat) && out.SMALL_DUST != null) {
                    pulverize(yeet, inp.GEM_SHARDS, out.SMALL_DUST, 1, null, 0, id.SmallDust());
                }
            }

            // Clump -> Dirty Dust
            if (item instanceof EOClumpItem) {
                if (generatedPulverizerRecipes.add("clump_dirty:" + mat) && out.DIRTY_DUST != null) {
                    pulverize(yeet, inp.CLUMP, out.DIRTY_DUST, 1, STONE_SET.SMALL_DUST.get(), 3, id.DirtyDust());
                }
            }

            // Raw Material -> Dust/Byproduct
            if (item instanceof EORawMaterialItem || isVanillaRaw(inp.RAW)) {
                if (generatedPulverizerRecipes.add("raw_material:" + mat) && !mat.equals("sulfur") && out.DUST != null && out.SMALL_DUST != null) {
                    pulverize(yeet, inp.RAW, out.DUST, 1, out.SMALL_DUST, 3, id.RawProc());
                }
            }

            // Ore Block -> Material
            if (item instanceof BlockItem oreBlocks && oreBlocks.getBlock() instanceof EOreBlock || isVanillaOre(inp.ORE)) {
                if (generatedPulverizerRecipes.add("processing" + mat) && found != null && found.primary() != null && found.byproduct() != null) {
                    pulverize(yeet, inp.ORE, found.primary(), found.primaryCount(), null, 0, id.OreProc());
                }
            }
        });
    }
}
