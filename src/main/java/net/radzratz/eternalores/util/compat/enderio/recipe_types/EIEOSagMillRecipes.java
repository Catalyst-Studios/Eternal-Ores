package net.radzratz.eternalores.util.compat.enderio.recipe_types;

import com.enderio.enderio.content.machines.sag_mill.SagMillingRecipe;
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
import net.radzratz.eternalores.util.recipes.types.EOCommonRecipes;
import net.radzratz.eternalores.item.types.EODirtyDustItem;
import net.radzratz.eternalores.util.recipes.util.EORecipeOutputs;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;

import java.util.*;
import java.util.stream.Stream;

import static net.minecraft.world.item.Items.*;
import static net.radzratz.eternalores.util.EOMaterials.materialSets.*;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeOutputs.crushingExclusions;
import static net.radzratz.eternalores.util.recipes.types.EOCommonRecipes.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipePaths.resolveOrePath;
import static net.radzratz.eternalores.util.recipes.util.EORecipePaths.resolveRecipeId;

public class EIEOSagMillRecipes {
    private static final int ENERGY = 2400;
    private static final SagMillingRecipe.BonusType none = SagMillingRecipe.BonusType.NONE;
    private static final SagMillingRecipe.BonusType mtply = SagMillingRecipe.BonusType.MULTIPLY_OUTPUT;
    @SuppressWarnings("unused")
    private static final SagMillingRecipe.BonusType chc = SagMillingRecipe.BonusType.CHANCE_ONLY;

    private static void bldr(RecipeOutput output, Ingredient inp, List<SagMillingRecipe.OutputItem> rlt, SagMillingRecipe.BonusType bns, String sfx) {
        if (rlt.isEmpty()) return;

        RecipeOutput yeet = new EOAdvancementYeeter(output);
        EORecipePaths id = new EORecipePaths("");

        SagMillingRecipe recipe = new SagMillingRecipe(inp, rlt, ENERGY, bns);

        yeet.accept(EO(id.Sag() + sfx.toLowerCase(Locale.ROOT)), recipe, null, ENDERIO_MOD);
    }

    public static void sMill(RecipeOutput output, Object inp, Item rlt, String sfx) {
        if (rlt == null) return;

        bldr(output, itemTagInputs(inp), List.of(SagMillingRecipe.OutputItem.of(new ItemStack(rlt, 1), 1.0f, false)), none, sfx);
    }

    public static void sMill(RecipeOutput output, Object inp, Item rlt, Item bRlt, String sfx) {
        if (rlt == null || bRlt == null) return;

        bldr(output, itemTagInputs(inp), List.of(
                        SagMillingRecipe.OutputItem.of(new ItemStack(rlt, 1), 1.0f, false),
                        SagMillingRecipe.OutputItem.of(new ItemStack(bRlt, 3), 1.0f, false)
                ), none, sfx
        );
    }

    public static void sMill(RecipeOutput output, Object inp, Item rlt, Item bRlt, Item eRlt, String sfx) {
        if (rlt == null || bRlt == null || eRlt == null) return;

        bldr(output, itemTagInputs(inp), List.of(
                        SagMillingRecipe.OutputItem.of(new ItemStack(rlt, 2), 1.0f, false),
                        SagMillingRecipe.OutputItem.of(new ItemStack(bRlt, 1), 0.40f, false),
                        SagMillingRecipe.OutputItem.of(new ItemStack(eRlt, 1), 0.15f, false)
                ), mtply, sfx
        );
    }

    public static void sMill(RecipeOutput output, Object inp, Item rlt, int rCnt, Item bRlt, Item eRlt, Item stone, String sfx) {
        if (rlt == null || bRlt == null || eRlt == null || stone == null) return;

        bldr(output, itemTagInputs(inp), List.of(
                        SagMillingRecipe.OutputItem.of(new ItemStack(rlt, rCnt), 1.0f, false),
                        SagMillingRecipe.OutputItem.of(new ItemStack(bRlt, 1), 0.1f, false),
                        SagMillingRecipe.OutputItem.of(new ItemStack(eRlt, 1), 1.0f, false),
                        SagMillingRecipe.OutputItem.of(new ItemStack(stone, 1), 0.15f, false)
                ), mtply, sfx
        );
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Set<String> generateSagMillingRecipes = new HashSet<>();

        EORecipePaths paths = new EORecipePaths("");

        sMill(yeet, COPPER_ORE, RAW_COPPER, 2, RAW_COPPER, ZINC_SET.RAW.get(), COBBLESTONE, "ore_proc/copper");
        sMill(yeet, DEEPSLATE_COPPER_ORE, RAW_COPPER, 2, RAW_COPPER, ZINC_SET.RAW.get(), COBBLED_DEEPSLATE, "ore_proc/copper_slate");
        sMill(yeet, DIAMOND_ORE, DIAMOND, 2, DIAMOND, COAL_SET.SMALL_DUST.get(), COBBLESTONE, "ore_proc/diamond");
        sMill(yeet, DEEPSLATE_DIAMOND_ORE, DIAMOND, 2, DIAMOND, COAL_SET.SMALL_DUST.get(), COBBLED_DEEPSLATE, "ore_proc/diamond_slate");
        sMill(yeet, EMERALD_ORE, EMERALD, 2, EMERALD, BERYLLIUM_SET.SMALL_DUST.get(), COBBLESTONE, "ore_proc/emerald");
        sMill(yeet, DEEPSLATE_EMERALD_ORE, EMERALD, 2, EMERALD, BERYLLIUM_SET.SMALL_DUST.get(), COBBLED_DEEPSLATE, "ore_proc/emerald_slate");
        sMill(yeet, IRON_ORE, RAW_IRON, 2, RAW_IRON, NICKEL_SET.RAW.get(), COBBLESTONE, "ore_proc/iron");
        sMill(yeet, DEEPSLATE_IRON_ORE, RAW_IRON, 2, RAW_IRON, NICKEL_SET.RAW.get(), COBBLED_DEEPSLATE, "ore_proc/iron_slate");
        sMill(yeet, GOLD_ORE, RAW_GOLD, 2, RAW_GOLD, SILVER_SET.RAW.get(), COBBLESTONE, "ore_proc/gold");
        sMill(yeet, DEEPSLATE_GOLD_ORE, RAW_GOLD, 2, RAW_GOLD, SILVER_SET.RAW.get(), COBBLED_DEEPSLATE, "ore_proc/gold_slate");
        sMill(yeet, NETHER_GOLD_ORE, RAW_GOLD, 2, RAW_GOLD, SILVER_SET.RAW.get(), NETHERRACK, "ore_proc/gold_nether");
        sMill(yeet, REDSTONE_ORE, REDSTONE, 8, REDSTONE, CINNABAR_SET.SMALL_DUST.get(), COBBLESTONE, "ore_proc/redstone");
        sMill(yeet, DEEPSLATE_REDSTONE_ORE, REDSTONE, 8, REDSTONE, CINNABAR_SET.SMALL_DUST.get(), COBBLED_DEEPSLATE, "ore_proc/redstone_slate");
        sMill(yeet, NETHER_QUARTZ_ORE, QUARTZ, 3, QUARTZ, SILICON_SET.ITEM.get(), NETHERRACK, "ore_proc/quartz_nether");
        sMill(yeet, LAPIS_ORE, LAPIS_LAZULI, 8, LAPIS_LAZULI, SULFUR_SET.SMALL_DUST.get(), COBBLESTONE, "ore_proc/lapis");
        sMill(yeet, DEEPSLATE_LAPIS_ORE, LAPIS_LAZULI, 8, LAPIS_LAZULI, SULFUR_SET.SMALL_DUST.get(), COBBLED_DEEPSLATE, "ore_proc/lapis_slate");
        sMill(yeet, COAL_ORE, COAL, 5, DIAMOND_SET.SMALL_DUST.get(), SULFUR_SET.SMALL_DUST.get(), COBBLESTONE, "ore_proc/coal");
        sMill(yeet, DEEPSLATE_COAL_ORE, COAL, 5, DIAMOND_SET.SMALL_DUST.get(), SULFUR_SET.SMALL_DUST.get(), COBBLED_DEEPSLATE, "ore_proc/coal_slate");

        Stream.of(BASIC_CRUSHING).flatMap(List::stream).forEach(r -> {
            String base = resolveRecipeId(r.grp(), paths);
            sMill(yeet, r.input(), r.result(), r.byproduct(), base + r.sfx());
        });

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            EOCommonRecipes.OreProcessing found = ORE_PROCESSING.stream()
                    .filter(r -> r.sfx().equals(mat))
                    .findFirst()
                    .orElse(null);

            // Ingot -> Dust
            if (item instanceof EOIngotItem || isVanillaIngot(inp.INGOT)) {
                if (generateSagMillingRecipes.add("enderio_sag_ingot_dust:" + mat) && out.DUST != null) {
                    sMill(yeet, inp.INGOT, out.DUST, id.Dust());
                }
            }

            // Gem -> Dust
            if (item instanceof EOGemItem || isVanillaGem(inp.GEM)) {
                if (generateSagMillingRecipes.add("enderio_sag_gem_dust:" + mat) && out.DUST != null) {
                    sMill(yeet, inp.GEM, out.DUST, id.Dust());
                }
            }

            // Coal -> Dust
            if (item instanceof EOCoalItem) {
                if (generateSagMillingRecipes.add("enderio_sag_gem_dust:" + mat) && out.DUST != null) {
                    sMill(yeet, inp.COALS, out.DUST, id.Dust());
                }
            }

            // Nugget -> Small Dust
            if (item instanceof EONuggetItem) {
                if (generateSagMillingRecipes.add("enderio_sag_smol_dust:" + mat) && out.SMALL_DUST != null) {
                    sMill(yeet, inp.NUGGET, out.SMALL_DUST, id.SmallDust());
                }
            }

            // Gem Shard -> Small Dust
            if (item instanceof EOGemShardItem) {
                if (generateSagMillingRecipes.add("enderio_sag_smol_dust_gem:" + mat) && out.SMALL_DUST != null) {
                    sMill(yeet, inp.GEM_SHARDS, out.SMALL_DUST, id.SmallDust());
                }
            }

            // Clumps -> Dirty Dust
            if (item instanceof EODirtyDustItem) {
                if (generateSagMillingRecipes.add("enderio_sag_dirty_dust:" + mat) && out.DIRTY_DUST != null) {
                    sMill(yeet, inp.CLUMP, out.DIRTY_DUST, STONE_SET.SMALL_DUST.get(), id.DirtyDust());
                }
            }

            // Raw Material -> Dust/Extra
            if (item instanceof EORawMaterialItem || isVanillaRaw(inp.RAW)) {
                if (generateSagMillingRecipes.add("enderio_sag_raw_mat_proc:" + mat) && !mat.contains("sulfur") && found != null && found.byproductDust() != null) {
                    sMill(yeet, inp.RAW, out.DUST, out.DUST, found.byproductSmallDust(), id.Duplication());
                }
            }

            // Block -> Dust Block
            if (item instanceof BlockItem b && b.getBlock() instanceof EODustBlock || isVanillaBlock(inp.STORAGE_BLOCK)) {
                if (generateSagMillingRecipes.add("enderio_sag_dust_block:" + mat) && !crushingExclusions().contains(mat) && out.DUST_BLOCK != null) {
                    sMill(yeet, inp.STORAGE_BLOCK, out.DUST_BLOCK, id.DustBlock());
                }
            }

            // Ore -> Result / Byproduct / Extra
            if (item instanceof BlockItem b && b.getBlock() instanceof EOreBlock) {
                String oreProc = resolveOrePath(path, mat);
                EORecipeOutputs.OreVariant variant;
                EORecipePaths none = new EORecipePaths("");

                if (generateSagMillingRecipes.add("enderio_sag_ore_proc:" + oreProc) && found != null && found.primary() != null && found.byproduct() != null) {
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

                    sMill(yeet, b.asItem(), found.primary(), 2, found.primary(), found.byproduct(), baseBlock, recipePath);
                }
            }
        });
    }
}
