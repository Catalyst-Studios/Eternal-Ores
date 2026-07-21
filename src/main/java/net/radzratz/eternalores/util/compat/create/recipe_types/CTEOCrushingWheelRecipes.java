package net.radzratz.eternalores.util.compat.create.recipe_types;

import com.simibubi.create.AllItems;
import com.simibubi.create.content.kinetics.crusher.CrushingRecipe;
import com.simibubi.create.content.processing.recipe.StandardProcessingRecipe;
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
import net.radzratz.eternalores.util.recipes.util.EORecipeOutputs;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;
import org.jetbrains.annotations.Nullable;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static net.minecraft.world.item.Items.*;
import static net.radzratz.eternalores.util.EOMaterials.materialSets.*;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.types.EOCommonRecipes.ORE_PROCESSING;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeOutputs.crushingExclusions;
import static net.radzratz.eternalores.util.recipes.types.EOCommonRecipes.BASIC_CRUSHING;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipePaths.resolveOrePath;
import static net.radzratz.eternalores.util.recipes.util.EORecipePaths.resolveRecipeId;

public class CTEOCrushingWheelRecipes {
    private static void wheel(RecipeOutput output, Object input, Item result, int resulCount,
                              @Nullable Item byproduct, float byproductChance, int byproductCount,
                              @Nullable Item extraResult, float extraChance, int extraCount,
                              @Nullable Item nugget, float nuggetChance, int nuggetCount,
                              @Nullable Item block, float blockChance, int time, String sfx) {
        if (result == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        StandardProcessingRecipe.Builder<CrushingRecipe> bldr =
                new StandardProcessingRecipe.Builder<>(CrushingRecipe::new, EO(sfx));

        bldr.require(itemTagInputs(input)).output(result, resulCount).duration(time);

        if (byproduct != null)
            bldr.output(byproductChance, byproduct, byproductCount);

        if (extraResult != null)
            bldr.output(extraChance, extraResult, extraCount);

        if (nugget != null)
            bldr.output(nuggetChance, nugget, nuggetCount);

        if (block != null)
            bldr.output(blockChance, block);

        bldr.withCondition(CREATE_MOD).build(yeet);
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Set<String> generatedWheelRecipes = new HashSet<>();

        EORecipePaths paths = new EORecipePaths("");

        Stream.of(BASIC_CRUSHING).flatMap(List::stream).forEach(r -> {
            String base = resolveRecipeId(r.grp(), paths);

            if (r.sfx().equals("obsidian") || r.sfx().equals("obsidian_var") || r.sfx().equals("sand") || r.sfx().equals("netherrack")) return;

            wheel(yeet, r.input(), r.result(), r.resultCount(), null, 0f, 0, null, 0f, 0,
                    null, 0f, 0, null, 0f,  100, base + r.sfx());
        });

        wheel(yeet, COPPER_ORE, RAW_COPPER, 2, RAW_COPPER, 0.25f, 1, ZINC_SET.RAW.get(), 0.75f, 1,
                AllItems.EXP_NUGGET.get(), 0.75f, 1, COBBLESTONE, 0.10f, 50, paths.OreProc() + "copper");
        wheel(yeet, DEEPSLATE_COPPER_ORE, RAW_COPPER, 2, RAW_COPPER, 0.25f, 1, ZINC_SET.RAW.get(), 0.75f, 1,
                AllItems.EXP_NUGGET.get(), 0.75f, 1, COBBLED_DEEPSLATE, 0.10f, 50, paths.OreProc() + "copper_slate");
        wheel(yeet, DIAMOND_ORE, DIAMOND, 2, DIAMOND, 0.25f, 1, COAL_SET.SMALL_DUST.get(), 0.75f, 1,
                AllItems.EXP_NUGGET.get(), 0.75f, 1, COBBLESTONE, 0.10f, 50, paths.OreProc() + "diamond");
        wheel(yeet, DEEPSLATE_DIAMOND_ORE, DIAMOND, 2, DIAMOND, 0.25f, 1, COAL_SET.SMALL_DUST.get(), 0.75f, 1,
                AllItems.EXP_NUGGET.get(), 0.75f, 1, COBBLED_DEEPSLATE, 0.10f, 50, paths.OreProc() + "diamond_slate");
        wheel(yeet, EMERALD_ORE, EMERALD, 2, EMERALD, 0.25f, 1, BERYLLIUM_SET.SMALL_DUST.get(), 0.75f, 1,
                AllItems.EXP_NUGGET.get(), 0.75f, 1, COBBLESTONE, 0.10f, 50, paths.OreProc() + "emerald");
        wheel(yeet, DEEPSLATE_EMERALD_ORE, EMERALD, 2, EMERALD, 0.25f, 1, BERYLLIUM_SET.SMALL_DUST.get(), 0.75f, 1,
                AllItems.EXP_NUGGET.get(), 0.75f, 1, COBBLED_DEEPSLATE, 0.10f, 50, paths.OreProc() + "emerald_slate");
        wheel(yeet, IRON_ORE, RAW_IRON, 2, RAW_IRON, 0.25f, 1, NICKEL_SET.RAW.get(), 0.75f, 1,
                AllItems.EXP_NUGGET.get(), 0.75f, 1, COBBLESTONE, 0.10f, 50, paths.OreProc() + "iron");
        wheel(yeet, DEEPSLATE_IRON_ORE, RAW_IRON, 2, RAW_IRON, 0.25f, 1, NICKEL_SET.RAW.get(), 0.75f, 1,
                AllItems.EXP_NUGGET.get(), 0.75f, 1, COBBLED_DEEPSLATE, 0.10f, 50, paths.OreProc() + "iron_slate");
        wheel(yeet, GOLD_ORE, RAW_GOLD, 2, RAW_GOLD, 0.25f, 1, SILVER_SET.RAW.get(), 0.75f, 1,
                AllItems.EXP_NUGGET.get(), 0.75f, 1, COBBLESTONE, 0.10f, 50, paths.OreProc() + "gold");
        wheel(yeet, DEEPSLATE_GOLD_ORE, RAW_GOLD, 2, RAW_GOLD, 0.25f, 1, SILVER_SET.RAW.get(), 0.75f, 1,
                AllItems.EXP_NUGGET.get(), 0.75f, 1, COBBLED_DEEPSLATE, 0.10f, 50, paths.OreProc() + "gold_slate");
        wheel(yeet, NETHER_GOLD_ORE, RAW_GOLD, 2, RAW_GOLD, 0.25f, 1, SILVER_SET.RAW.get(), 0.75f, 1,
                AllItems.EXP_NUGGET.get(), 0.75f, 1, NETHERRACK, 0.10f, 50, paths.OreProc() + "gold_nether");
        wheel(yeet, REDSTONE_ORE, REDSTONE, 8, REDSTONE, 0.25f, 4, CINNABAR_SET.SMALL_DUST.get(), 0.75f, 2,
                AllItems.EXP_NUGGET.get(), 0.75f, 1, COBBLESTONE, 0.10f, 50, paths.OreProc() + "redstone");
        wheel(yeet, DEEPSLATE_REDSTONE_ORE, REDSTONE, 8, REDSTONE, 0.25f, 4, CINNABAR_SET.SMALL_DUST.get(), 0.75f, 2,
                AllItems.EXP_NUGGET.get(), 0.75f, 1, COBBLED_DEEPSLATE, 0.10f, 50, paths.OreProc() + "redstone_slate");
        wheel(yeet, NETHER_QUARTZ_ORE, QUARTZ, 5, QUARTZ, 0.25f, 2, SILICON_SET.SMALL_DUST.get(), 0.75f, 3,
                AllItems.EXP_NUGGET.get(), 0.75f, 1, NETHERRACK, 0.10f, 50, paths.OreProc() + "quartz_nether");
        wheel(yeet, LAPIS_ORE, LAPIS_LAZULI, 9, LAPIS_LAZULI, 0.25f, 2, SULFUR_SET.SMALL_DUST.get(), 0.75f, 3,
                AllItems.EXP_NUGGET.get(), 0.75f, 1, COBBLESTONE, 0.10f, 50, paths.OreProc() + "lapis");
        wheel(yeet, DEEPSLATE_LAPIS_ORE, LAPIS_LAZULI, 9, LAPIS_LAZULI, 0.25f, 2, SULFUR_SET.SMALL_DUST.get(), 0.75f, 3,
                AllItems.EXP_NUGGET.get(), 0.75f, 1, COBBLED_DEEPSLATE, 0.10f, 50, paths.OreProc() + "lapis_slate");
        wheel(yeet, COAL_ORE, COAL, 6, COAL, 0.25f, 4, SULFUR_SET.SMALL_DUST.get(), 0.75f, 3,
                AllItems.EXP_NUGGET.get(), 0.75f, 1,  COBBLESTONE, 0.10f, 50, paths.OreProc() + "coal");
        wheel(yeet, DEEPSLATE_COAL_ORE, COAL, 6, COAL, 0.25f, 4, SULFUR_SET.SMALL_DUST.get(), 0.75f, 3,
                AllItems.EXP_NUGGET.get(), 0.75f, 1, COBBLED_DEEPSLATE, 0.10f, 50, paths.OreProc() + "coal_slate");

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            EOCommonRecipes.OreProcessing found = ORE_PROCESSING.stream()
                    .filter(r -> r.sfx().equals(mat))
                    .findFirst()
                    .orElse(null);

            // Dusts
            if (item instanceof EOIngotItem || isVanillaIngot(inp.INGOT)) {
                if (generatedWheelRecipes.add("wheel_crushing_ingot:" + mat) && out.DUST != null) {
                    wheel(yeet, inp.INGOT, out.DUST, 1, null, 0f, 0, null, 0f, 0,
                            null, 0f, 0, null, 0f, 100, id.Dust());
                }
            }

            if (item instanceof EOGemItem || isVanillaGem(inp.GEM)) {
                if (generatedWheelRecipes.add("wheel_crushing_gem:" + mat) && out.DUST != null) {
                    wheel(yeet, inp.GEM, out.DUST, 1, null, 0f, 0, null, 0f, 0,
                            null, 0f, 0, null, 0f, 100, id.Dust());
                }
            }

            if (item instanceof EOCoalItem) {
                if (generatedWheelRecipes.add("wheel_crushing_coal:" + mat) && out.DUST != null) {
                    wheel(yeet, inp.COALS, out.DUST, 1, null, 0f, 0, null, 0f, 0,
                            null, 0f, 0, null, 0f, 100, id.Dust());
                }
            }

            // Small Dusts
            if (item instanceof EONuggetItem) {
                if (generatedWheelRecipes.add("wheel_crushing_nugget:" + mat) && out.SMALL_DUST != null) {
                    wheel(yeet, inp.NUGGET, out.SMALL_DUST, 1, null, 0f, 0, null, 0f, 0,
                            null, 0f, 0, null, 0f, 100, id.SmallDust());
                }
            }

            if (item instanceof EOGemShardItem) {
                if (generatedWheelRecipes.add("wheel_crushing_gem_shard:" + mat) && out.SMALL_DUST != null) {
                    wheel(yeet, inp.GEM_SHARDS, out.SMALL_DUST, 1, null, 0f, 0, null, 0f, 0,
                            null, 0f, 0, null, 0f, 100, id.SmallDust());
                }
            }

            // Dirty Dusts
            if (item instanceof EODirtyDustItem) {
                if (generatedWheelRecipes.add("wheel_dirty_dust:" + mat) && out.DIRTY_DUST != null) {
                    wheel(yeet, inp.CLUMP, out.DIRTY_DUST, 1, null, 0f, 0 , null, 0f, 0,
                            null, 0f, 0, null, 0f, 200, id.DirtyDust());
                }
            }

            // Clumps
            if (item instanceof EOClumpItem) {
                if (generatedWheelRecipes.add("raw_proc:" + mat) && out.CLUMP != null) {
                    wheel(yeet, inp.RAW, out.CLUMP, 2, out.SMALL_DUST, 0.35f, 3, null, 0f, 0,
                            AllItems.EXP_NUGGET.get(), 0.75f, 1, null, 0, 200, id.Clump());
                }
            }

            // Dust Block
            if (item instanceof BlockItem b && b.getBlock() instanceof EODustBlock || isVanillaBlock(inp.STORAGE_BLOCK)) {
                if (generatedWheelRecipes.add("dust_block:" + mat) && !crushingExclusions().contains(mat) && out.DUST_BLOCK != null) {
                    wheel(yeet, inp.STORAGE_BLOCK, out.DUST_BLOCK, 1, null, 0f, 0, null, 0f, 0,
                            null, 0f, 0, null, 0f, 200, id.DustBlock());
                }
            }

            // Raw Block
            if (item instanceof BlockItem b && b.getBlock() instanceof EORawBlock || isVanillaRawBlock(inp.STORAGE_BLOCK_RAW)) {
                if (generatedWheelRecipes.add("raw_block_proc:" + mat) && !mat.contains("sulfur") && out.CLUMP != null) {
                    wheel(yeet, inp.STORAGE_BLOCK_RAW, out.CLUMP, 18, out.SMALL_DUST, 0.35f, 27, null, 0f, 0,
                            AllItems.EXP_NUGGET.get(), 0.75f, 18, null, 0f, 200, id.RawBlock());
                }
            }

            // Ore -> Result / Byproduct / Extra
            if (item instanceof BlockItem b && b.getBlock() instanceof EOreBlock) {
                String oreProc = resolveOrePath(path, mat);
                EORecipeOutputs.OreVariant variant;
                EORecipePaths none = new EORecipePaths("");

                if (generatedWheelRecipes.add("ore_block_raw:" + oreProc) && found != null && found.primary() != null && found.byproduct() != null) {
                    if (path.startsWith("deepslate_")) {
                        variant = EORecipeOutputs.OreVariant.DEEPSLATE;
                    } else if (path.startsWith("nether_")) {
                        variant = EORecipeOutputs.OreVariant.NETHER;
                    } else if (path.startsWith("end_")) {
                        variant = EORecipeOutputs.OreVariant.END;
                    } else {
                        variant = EORecipeOutputs.OreVariant.STONE;
                    }

                    String basePath = resolveRecipeId(found.group(), none);
                    String recipePath = basePath + oreProc;

                    Item baseBlock = EORecipeOutputs.resolveOreCases(mat, variant);

                    wheel(yeet, b.asItem(), found.primary(), found.primaryCount(), found.primary(), 0.45f, 1, found.byproduct(), 0.25f, 1,
                            AllItems.EXP_NUGGET.get(), 0.75f, 1, baseBlock, 0.12f, 200, recipePath);
                }
            }
        });
    }
}
