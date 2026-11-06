package net.radzratz.eternalores.util.compat.enderio;

import com.enderio.enderio.content.machines.alloy.AlloySmeltingRecipe;
import com.enderio.enderio.content.machines.sag_mill.SagMillingRecipe;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.crafting.SizedIngredient;
import net.radzratz.eternalores.block.types.EODustBlock;
import net.radzratz.eternalores.block.types.EOreBlock;
import net.radzratz.eternalores.item.types.*;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.util.recipes.types.EOCommonRecipes;
import net.radzratz.eternalores.util.recipes.util.EORecipeOutputs;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.stream.Stream;

import static net.minecraft.world.item.Items.*;
import static net.minecraft.world.item.Items.COAL;
import static net.minecraft.world.item.Items.COAL_ORE;
import static net.minecraft.world.item.Items.COBBLED_DEEPSLATE;
import static net.minecraft.world.item.Items.COBBLESTONE;
import static net.minecraft.world.item.Items.DEEPSLATE_COAL_ORE;
import static net.minecraft.world.item.Items.DEEPSLATE_COPPER_ORE;
import static net.minecraft.world.item.Items.DEEPSLATE_DIAMOND_ORE;
import static net.minecraft.world.item.Items.DEEPSLATE_EMERALD_ORE;
import static net.minecraft.world.item.Items.DEEPSLATE_GOLD_ORE;
import static net.minecraft.world.item.Items.DEEPSLATE_IRON_ORE;
import static net.minecraft.world.item.Items.DEEPSLATE_LAPIS_ORE;
import static net.minecraft.world.item.Items.DEEPSLATE_REDSTONE_ORE;
import static net.minecraft.world.item.Items.DIAMOND;
import static net.minecraft.world.item.Items.DIAMOND_ORE;
import static net.minecraft.world.item.Items.EMERALD;
import static net.minecraft.world.item.Items.EMERALD_ORE;
import static net.minecraft.world.item.Items.GOLD_ORE;
import static net.minecraft.world.item.Items.IRON_ORE;
import static net.minecraft.world.item.Items.LAPIS_LAZULI;
import static net.minecraft.world.item.Items.LAPIS_ORE;
import static net.minecraft.world.item.Items.NETHERRACK;
import static net.minecraft.world.item.Items.NETHER_GOLD_ORE;
import static net.minecraft.world.item.Items.NETHER_QUARTZ_ORE;
import static net.minecraft.world.item.Items.QUARTZ;
import static net.minecraft.world.item.Items.RAW_COPPER;
import static net.minecraft.world.item.Items.RAW_GOLD;
import static net.minecraft.world.item.Items.RAW_IRON;
import static net.minecraft.world.item.Items.REDSTONE;
import static net.minecraft.world.item.Items.REDSTONE_ORE;
import static net.radzratz.eternalores.util.EOMaterials.materialSets.*;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.types.EOCommonRecipes.BASIC_CRUSHING;
import static net.radzratz.eternalores.util.recipes.types.EOCommonRecipes.ORE_PROCESSING;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeOutputs.crushingExclusions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeOutputs.formTypeExclusions;
import static net.radzratz.eternalores.util.recipes.util.EORecipePaths.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipePaths.resolveRecipeId;

public class EnderIOCompatRecipes {
    private static final SagMillingRecipe.BonusType none = SagMillingRecipe.BonusType.NONE;
    private static final SagMillingRecipe.BonusType mtply = SagMillingRecipe.BonusType.MULTIPLY_OUTPUT;
    @SuppressWarnings("unused")
    private static final SagMillingRecipe.BonusType chc = SagMillingRecipe.BonusType.CHANCE_ONLY;

    private static void smelter(RecipeOutput output, Object input1, int inputCount1, Object input2, int inputCount2,
                                @Nullable Object input3, int inputCount3, Item result, int resultCount, int energy, String sfx) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        List<SizedIngredient> inputs = new ArrayList<>();

        if (input1 != null) {
            inputs.add(new SizedIngredient(itemTagInputs(input1), inputCount1));
        }

        if (input2 != null) {
            inputs.add(new SizedIngredient(itemTagInputs(input2), inputCount2));
        }

        if (input3 != null) {
            inputs.add(new SizedIngredient(itemTagInputs(input3), inputCount3));
        }

        AlloySmeltingRecipe recipe = new AlloySmeltingRecipe(inputs, new ItemStack(result, resultCount), energy, 0.5f, false);

        yeet.accept(EO(PATH.ESmelter() + sfx), recipe, null, ENDERIO_MOD);
    }

    private static void sagMill(RecipeOutput output, Ingredient inp, List<SagMillingRecipe.OutputItem> rlt, SagMillingRecipe.BonusType bns, String sfx) {
        if (rlt.isEmpty()) return;

        RecipeOutput yeet = new EOAdvancementYeeter(output);

        SagMillingRecipe recipe = new SagMillingRecipe(inp, rlt, 2400, bns);

        yeet.accept(EO(PATH.Sag() + sfx), recipe, null, ENDERIO_MOD);
    }

    public static void sagMill(RecipeOutput output, Object inp, Item rlt, String sfx) {
        if (rlt == null) return;

        sagMill(output, itemTagInputs(inp), List.of(SagMillingRecipe.OutputItem.of(new ItemStack(rlt, 1), 1.0f, false)), none, sfx);
    }

    public static void sagMill(RecipeOutput output, Object inp, Item rlt, Item bRlt, String sfx) {
        if (rlt == null || bRlt == null) return;

        sagMill(output, itemTagInputs(inp), List.of(
                        SagMillingRecipe.OutputItem.of(new ItemStack(rlt, 1), 1.0f, false),
                        SagMillingRecipe.OutputItem.of(new ItemStack(bRlt, 3), 1.0f, false)
                ), none, sfx
        );
    }

    public static void sagMill(RecipeOutput output, Object inp, Item rlt, Item bRlt, Item eRlt, String sfx) {
        if (rlt == null || bRlt == null || eRlt == null) return;

        sagMill(output, itemTagInputs(inp), List.of(
                        SagMillingRecipe.OutputItem.of(new ItemStack(rlt, 2), 1.0f, false),
                        SagMillingRecipe.OutputItem.of(new ItemStack(bRlt, 1), 0.40f, false),
                        SagMillingRecipe.OutputItem.of(new ItemStack(eRlt, 1), 0.15f, false)
                ), mtply, sfx
        );
    }

    public static void sagMill(RecipeOutput output, Object inp, Item rlt, int rCnt, Item bRlt, Item eRlt, Item stone, String sfx) {
        if (rlt == null || bRlt == null || eRlt == null || stone == null) return;

        sagMill(output, itemTagInputs(inp), List.of(
                        SagMillingRecipe.OutputItem.of(new ItemStack(rlt, rCnt), 1.0f, false),
                        SagMillingRecipe.OutputItem.of(new ItemStack(bRlt, 1), 0.1f, false),
                        SagMillingRecipe.OutputItem.of(new ItemStack(eRlt, 1), 1.0f, false),
                        SagMillingRecipe.OutputItem.of(new ItemStack(stone, 1), 0.15f, false)
                ), mtply, sfx
        );
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Set<String> generatedEnderIORecipes = new HashSet<>();

        EORecipePaths paths = new EORecipePaths("");

        // Alloy Smelter
        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            // Ore Gem -> Ingot / Dust
            if (item instanceof EOrGemItem) {
                if (generatedEnderIORecipes.add("smelter_gem:" + mat) && out.DUST_INGOT != null) {
                    smelter(yeet, inp.ORE_GEM, 1, inp.ORE_GEM, 1, null, 0, out.DUST_INGOT, 3, 900, id.OreGem());
                }
            }

            // Alloys
            if (item instanceof EOIngotItem) {
                for (EOCommonRecipes.Alloys r : EOCommonRecipes.ALLOYS) {
                    if (r.input() != null && r.inputTwo() != null && r.inputThree() != null) {
                        if (generatedEnderIORecipes.add("smelter_alloys/" + r.sfx())) {
                            smelter(yeet, r.input(), r.inputCount(), r.inputTwo(), r.inputTwoCount(), r.inputThree(), r.inputThreeCount(),
                                    r.result(), r.resultCount(), 1500, "alloys/" + r.sfx());
                        }
                    } else if (r.input() != null && r.inputTwo() != null) {
                        if (generatedEnderIORecipes.add("smelter_alloys/" + r.sfx())) {
                            smelter(yeet, r.input(), r.inputCount(), r.inputTwo(), r.inputTwoCount(), null, 0,
                                    r.result(), r.resultCount(), 1500, "alloys/" + r.sfx());
                        }
                    }
                }
            }
        });

        // Sag Mill
        sagMill(yeet, COPPER_ORE, RAW_COPPER, 2, RAW_COPPER, ZINC_SET.RAW.get(), COBBLESTONE, "ore_proc/copper");
        sagMill(yeet, DEEPSLATE_COPPER_ORE, RAW_COPPER, 2, RAW_COPPER, ZINC_SET.RAW.get(), COBBLED_DEEPSLATE, "ore_proc/copper_slate");
        sagMill(yeet, DIAMOND_ORE, DIAMOND, 2, DIAMOND, COAL_SET.SMALL_DUST.get(), COBBLESTONE, "ore_proc/diamond");
        sagMill(yeet, DEEPSLATE_DIAMOND_ORE, DIAMOND, 2, DIAMOND, COAL_SET.SMALL_DUST.get(), COBBLED_DEEPSLATE, "ore_proc/diamond_slate");
        sagMill(yeet, EMERALD_ORE, EMERALD, 2, EMERALD, BERYLLIUM_SET.SMALL_DUST.get(), COBBLESTONE, "ore_proc/emerald");
        sagMill(yeet, DEEPSLATE_EMERALD_ORE, EMERALD, 2, EMERALD, BERYLLIUM_SET.SMALL_DUST.get(), COBBLED_DEEPSLATE, "ore_proc/emerald_slate");
        sagMill(yeet, IRON_ORE, RAW_IRON, 2, RAW_IRON, NICKEL_SET.RAW.get(), COBBLESTONE, "ore_proc/iron");
        sagMill(yeet, DEEPSLATE_IRON_ORE, RAW_IRON, 2, RAW_IRON, NICKEL_SET.RAW.get(), COBBLED_DEEPSLATE, "ore_proc/iron_slate");
        sagMill(yeet, GOLD_ORE, RAW_GOLD, 2, RAW_GOLD, SILVER_SET.RAW.get(), COBBLESTONE, "ore_proc/gold");
        sagMill(yeet, DEEPSLATE_GOLD_ORE, RAW_GOLD, 2, RAW_GOLD, SILVER_SET.RAW.get(), COBBLED_DEEPSLATE, "ore_proc/gold_slate");
        sagMill(yeet, NETHER_GOLD_ORE, RAW_GOLD, 2, RAW_GOLD, SILVER_SET.RAW.get(), NETHERRACK, "ore_proc/gold_nether");
        sagMill(yeet, REDSTONE_ORE, REDSTONE, 8, REDSTONE, CINNABAR_SET.SMALL_DUST.get(), COBBLESTONE, "ore_proc/redstone");
        sagMill(yeet, DEEPSLATE_REDSTONE_ORE, REDSTONE, 8, REDSTONE, CINNABAR_SET.SMALL_DUST.get(), COBBLED_DEEPSLATE, "ore_proc/redstone_slate");
        sagMill(yeet, NETHER_QUARTZ_ORE, QUARTZ, 3, QUARTZ, SILICON_SET.ITEM.get(), NETHERRACK, "ore_proc/quartz_nether");
        sagMill(yeet, LAPIS_ORE, LAPIS_LAZULI, 8, LAPIS_LAZULI, SULFUR_SET.SMALL_DUST.get(), COBBLESTONE, "ore_proc/lapis");
        sagMill(yeet, DEEPSLATE_LAPIS_ORE, LAPIS_LAZULI, 8, LAPIS_LAZULI, SULFUR_SET.SMALL_DUST.get(), COBBLED_DEEPSLATE, "ore_proc/lapis_slate");
        sagMill(yeet, COAL_ORE, COAL, 5, DIAMOND_SET.SMALL_DUST.get(), SULFUR_SET.SMALL_DUST.get(), COBBLESTONE, "ore_proc/coal");
        sagMill(yeet, DEEPSLATE_COAL_ORE, COAL, 5, DIAMOND_SET.SMALL_DUST.get(), SULFUR_SET.SMALL_DUST.get(), COBBLED_DEEPSLATE, "ore_proc/coal_slate");

        Stream.of(BASIC_CRUSHING).flatMap(List::stream).forEach(r -> {
            String base = resolveRecipeId(r.grp(), paths);
            sagMill(yeet, r.input(), r.result(), r.byproduct(), base + r.sfx());
        });

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            EOCommonRecipes.OreProcessing found = ORE_PROCESSING.stream()
                    .filter(r -> r.sfx().equals(mat))
                    .findFirst()
                    .orElse(null);

            // Ingot -> Dust
            if (item instanceof EOIngotItem || isVanillaIngot(inp.INGOT)) {
                if (generatedEnderIORecipes.add("enderio_sag_ingot_dust:" + mat) && out.DUST != null) {
                    sagMill(yeet, inp.INGOT, out.DUST, id.Dust());
                }
            }

            // Gem -> Dust
            if (item instanceof EOGemItem || isVanillaGem(inp.GEM)) {
                if (generatedEnderIORecipes.add("enderio_sag_gem_dust:" + mat) && out.DUST != null) {
                    sagMill(yeet, inp.GEM, out.DUST, id.Dust());
                }
            }

            // Coal -> Dust
            if (item instanceof EOCoalItem) {
                if (generatedEnderIORecipes.add("enderio_sag_gem_dust:" + mat) && out.DUST != null) {
                    sagMill(yeet, inp.COALS, out.DUST, id.Dust());
                }
            }

            // Nugget -> Small Dust
            if (item instanceof EONuggetItem) {
                if (generatedEnderIORecipes.add("enderio_sag_smol_dust:" + mat) && out.SMALL_DUST != null) {
                    sagMill(yeet, inp.NUGGET, out.SMALL_DUST, id.SmallDust());
                }
            }

            // Gem Shard -> Small Dust
            if (item instanceof EOGemShardItem) {
                if (generatedEnderIORecipes.add("enderio_sag_smol_dust_gem:" + mat) && out.SMALL_DUST != null) {
                    sagMill(yeet, inp.GEM_SHARDS, out.SMALL_DUST, id.SmallDust());
                }
            }

            // Clumps -> Dirty Dust
            if (item instanceof EODirtyDustItem) {
                if (generatedEnderIORecipes.add("enderio_sag_dirty_dust:" + mat) && out.DIRTY_DUST != null) {
                    sagMill(yeet, inp.CLUMP, out.DIRTY_DUST, STONE_SET.SMALL_DUST.get(), id.DirtyDust());
                }
            }

            // Raw Material -> Dust/Extra
            if (item instanceof EORawMaterialItem || isVanillaRaw(inp.RAW)) {
                if (generatedEnderIORecipes.add("enderio_sag_raw_mat_proc:" + mat) && !mat.contains("sulfur") && found != null && found.byproductDust() != null) {
                    sagMill(yeet, inp.RAW, out.DUST, out.DUST, found.byproductSmallDust(), id.Duplication());
                }
            }

            // Block -> Dust Block
            if (item instanceof BlockItem b && b.getBlock() instanceof EODustBlock || isVanillaBlock(inp.STORAGE_BLOCK)) {
                if (generatedEnderIORecipes.add("enderio_sag_dust_block:" + mat) && !crushingExclusions().contains(mat) && !formTypeExclusions().contains(mat) && out.DUST_BLOCK != null) {
                    sagMill(yeet, inp.STORAGE_BLOCK, out.DUST_BLOCK, id.DustBlock());
                }
            }

            // Ore -> Result / Byproduct / Extra
            if (item instanceof BlockItem b && b.getBlock() instanceof EOreBlock) {
                String oreProc = resolveOrePath(path, mat);
                EORecipeOutputs.OreVariant variant;
                EORecipePaths none = new EORecipePaths("");

                if (generatedEnderIORecipes.add("enderio_sag_ore_proc:" + oreProc) && found != null && found.primary() != null && found.byproduct() != null) {
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

                    sagMill(yeet, b.asItem(), found.primary(), 2, found.primary(), found.byproduct(), baseBlock, recipePath);
                }
            }
        });
    }
}
