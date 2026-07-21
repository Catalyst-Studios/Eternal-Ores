package net.radzratz.eternalores.util.compat.oritech.recipe_types;

import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.block.types.EODustBlock;
import net.radzratz.eternalores.block.types.EOreBlock;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.item.types.*;
import net.radzratz.eternalores.util.recipes.types.EOCommonRecipes;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;
import org.jetbrains.annotations.Nullable;
import rearth.oritech.api.recipe.GrinderRecipeBuilder;

import java.util.*;
import java.util.stream.Stream;

import static net.neoforged.neoforge.common.Tags.Items.ENDER_PEARLS;
import static net.neoforged.neoforge.common.Tags.Items.END_STONES;
import static net.radzratz.eternalores.util.EOMaterials.materialSets.ENDER_PEARL_SET;
import static net.radzratz.eternalores.util.EOMaterials.materialSets.END_STONE_SET;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeOutputs.crushingExclusions;
import static net.radzratz.eternalores.util.recipes.types.EOCommonRecipes.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipePaths.resolveRecipeId;
import static rearth.oritech.init.ItemContent.ENDERIC_COMPOUND;

public class EOTFragmentForgeRecipes {
    private static void grinder(RecipeOutput output, Object inp, Item rlt, int rCnt, @Nullable Item bRlt, int bRCnt, @Nullable Item eRlt, int eRCnt, String sfx) {
        if (rlt == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        GrinderRecipeBuilder bldr = (GrinderRecipeBuilder)
                GrinderRecipeBuilder.build().input(itemTagInputs(inp)).result(rlt, rCnt).time(140).timeMultiplier(1.5f);

        if (bRlt != null) {
            bldr.result(bRlt, bRCnt);
        }

        if (eRlt != null) {
            bldr.result(eRlt, eRCnt);
        }

        bldr.export(yeet.withConditions(ORITECH_MOD), sfx.toLowerCase(Locale.ROOT), EternalOres.id);
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Set<String> generatedFragmentForgeRecipes = new HashSet<>();

        EORecipePaths paths = new EORecipePaths("");

        Stream.of(BASIC_CRUSHING).flatMap(List::stream).forEach(r -> {
            String base = resolveRecipeId(r.grp(), paths);

            if (r.input().equals(ENDER_PEARLS) || r.input().equals(END_STONES)) return;

            grinder(yeet, r.input(), r.result(), r.resultCount(), r.byproduct(), r.byproductCount(), null, 0, base + r.sfx());
        });

        grinder(yeet, ENDER_PEARLS, ENDERIC_COMPOUND.asItem(), 12, ENDER_PEARL_SET.DUST.get(), 1, null, 0, paths.Dust() + "ender");
        grinder(yeet, END_STONES, ENDERIC_COMPOUND.asItem(), 1, END_STONE_SET.DUST.get(), 1, null, 0, paths.Dust() + "end_stone");

        Stream.of(BIO_FUEL_BASIC).flatMap(List::stream).forEach(r -> {
            String base = resolveRecipeId(r.grp(), paths);
            grinder(yeet, r.input(), r.result(), r.resultCount(), r.byproduct(), r.byproductCount(), null, 0, base + r.sfx());
        });

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            EOCommonRecipes.OreProcessing found = ORE_PROCESSING.stream()
                    .filter(r -> r.sfx().equals(mat))
                    .findFirst()
                    .orElse(null);

            // Ingot -> Dust
            if (item instanceof EOIngotItem || isVanillaIngot(inp.INGOT)) {
                if (generatedFragmentForgeRecipes.add("dusts_ingot:" + mat) && out.DUST != null) {
                    grinder(yeet, inp.INGOT, out.DUST, 1, null, 0, null, 0, id.Dust());
                }
            }

            // Gem -> Dust
            if (item instanceof EOGemItem || isVanillaGem(inp.GEM)) {
                if (generatedFragmentForgeRecipes.add("dusts_gem:" + mat) && out.DUST != null) {
                    grinder(yeet, inp.GEM, out.DUST, 1, null, 0, null, 0, id.Dust());
                }
            }

            // Material Block -> Dust Block
            if (item instanceof BlockItem b && b.getBlock() instanceof EODustBlock || isVanillaBlock(inp.STORAGE_BLOCK)) {
                if (generatedFragmentForgeRecipes.add("dusts_block:" + mat) && !crushingExclusions().contains(mat) && out.DUST_BLOCK != null) {
                    grinder(yeet, inp.STORAGE_BLOCK, out.DUST_BLOCK, 1, null, 0, null, 0, id.DustBlock());
                }
            }

            // Nugget -> Small Dust
            if (item instanceof EONuggetItem) {
                if (generatedFragmentForgeRecipes.add("dusts_small:" + mat) && out.SMALL_DUST != null) {
                    grinder(yeet, inp.NUGGET, out.SMALL_DUST, 1, null, 0, null, 0, id.SmallDust());
                }
            }

            // Gem Shard -> Small Dust
            if (item instanceof EOGemShardItem) {
                if (generatedFragmentForgeRecipes.add("dusts_small_gem:" + mat) && out.SMALL_DUST != null) {
                    grinder(yeet, inp.GEM_SHARDS, out.SMALL_DUST, 1, null, 0, null, 0, id.SmallDust());
                }
            }

            // Raw Material -> Clump/Small Clump/Byproduct
            if (item instanceof EORawMaterialItem || isVanillaRaw(inp.RAW)) {
                if (generatedFragmentForgeRecipes.add("fragment_raw:" + mat) && !mat.equals("sulfur") && found != null && found.byproductSmallClump() != null) {
                    grinder(yeet, inp.RAW, out.CLUMP, 1, out.SMALL_CLUMP, 3, found.byproductSmallClump(), 3, id.OreProc());
                }
            }

            if (item instanceof EOCoalItem) {
                if (generatedFragmentForgeRecipes.add("dusts_coal:" + mat) && out.DUST != null) {
                    grinder(yeet, inp.COALS, out.DUST, 1, null, 0, null, 0, id.Dust());
                }
            }

            // Ore -> Material/Byproduct/Extra
            if (item instanceof BlockItem b && b.getBlock() instanceof EOreBlock || isVanillaOre(inp.ORE)) {
                if (generatedFragmentForgeRecipes.add("ore_block:" + mat) && found != null && found.primary() != null && found.byproduct() != null) {
                    grinder(yeet, inp.ORE, found.primary(), found.primaryCount(), found.byproduct(), found.byproductCount(), null, 0, id.Ore());
                }
            }
        });

    }
}
