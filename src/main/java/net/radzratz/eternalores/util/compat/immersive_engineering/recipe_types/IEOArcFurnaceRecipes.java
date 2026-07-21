package net.radzratz.eternalores.util.compat.immersive_engineering.recipe_types;

import blusunrize.immersiveengineering.api.crafting.*;
import blusunrize.immersiveengineering.common.register.IEItems;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.block.types.EORawBlock;
import net.radzratz.eternalores.block.types.EOreBlock;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.item.types.EOIngotItem;
import net.radzratz.eternalores.item.types.EORawMaterialItem;
import net.radzratz.eternalores.item.types.EOrGemItem;
import net.radzratz.eternalores.util.recipes.types.EOCommonRecipes;
import net.radzratz.eternalores.util.recipes.util.EORecipeOutputs;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.stream.Stream;

import static net.radzratz.eternalores.util.EOMaterials.materialSets.SULFUR_SET;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.types.EOCommonRecipes.SMELTABLES;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipePaths.resolveRecipeId;

public class IEOArcFurnaceRecipes {
    private static void arc(RecipeOutput output, Object input, int inputCount, @Nullable Object additiveOne, int additiveCount,
                            @Nullable Object additiveTwo, int additiveCountTwo, Item rlt, int rCnt, @Nullable Item slag, @Nullable Item sec,
                            float secChance, int secCnt, int time, int energy, String sfx) {
        if (rlt == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);
        EORecipePaths id = new EORecipePaths("");

        // Main Input
        IngredientWithSize main = new IngredientWithSize(itemTagInputs(input), inputCount);

        // Additives
        List<IngredientWithSize> additives = new ArrayList<>();
        if (additiveOne != null) {
            additives.add(new IngredientWithSize(itemTagInputs(additiveOne), additiveCount));
        }
        if (additiveTwo != null) {
            additives.add(new IngredientWithSize(itemTagInputs(additiveTwo), additiveCountTwo));
        }

        // Main Output
        TagOutputList outputs = new TagOutputList(new TagOutput(rlt, rCnt));

        // Slag
        TagOutput slagOut = slag != null
                ? new TagOutput(slag, 1)
                : TagOutput.EMPTY;

        // Secondary Outputs
        List<StackWithChance> secondaries = new ArrayList<>();
        if (sec != null && secChance > 0f) {
            secondaries.add(new StackWithChance(new TagOutput(sec, secCnt), secChance));
        }

        ArcFurnaceRecipe recipe = new ArcFurnaceRecipe(outputs, slagOut, secondaries, time, energy, main, additives);

        yeet.withConditions().accept(EO(id.IEArc() + sfx), recipe, null, IMMERSIVE_ENGINEERING_MOD);
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Set<String> generatedArcRecipes = new HashSet<>();

        EORecipePaths paths = new EORecipePaths("");

        Stream.of(SMELTABLES).flatMap(List::stream).forEach(r -> {
            String base = resolveRecipeId(r.grp(), paths);
            arc(yeet, r.input(), 1, null, 0, null,
                    0, r.result(), 1, null, null, 0f, 0, 100, 51200, base + r.sfx());
        });

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            // Ignores excluded materials
            if (EORecipeOutputs.furnaceExclusions().contains(mat)) return;

            // Ingot
            if (item instanceof EOIngotItem) {
                // Dust -> ingot
                if (generatedArcRecipes.add("ingot_dust:" + mat) && !mat.equals("missing") && out.DUST_INGOT != null) {
                    arc(yeet, inp.DUST, 1, null, 0, null,
                            0, out.DUST_INGOT, 1, null, null, 0f, 0, 100, 51200, id.Ingot());
                }

                // Alloys
                for (EOCommonRecipes.Alloys r : EOCommonRecipes.ALLOYS) {
                    if (r.input() != null && r.inputTwo() != null && r.inputThree() != null) {
                        if (generatedArcRecipes.add("alloys/" + r.sfx())) {
                            arc(yeet, r.input(), r.inputCount(), r.inputTwo(), r.inputTwoCount(), r.inputThree(), r.inputThreeCount(),
                                    r.result(), r.resultCount(), null, null, 0f, 0, 100, 51200, "alloys/" + r.sfx());
                        }
                    } else if (r.input() != null && r.inputTwo() != null) {
                        if (generatedArcRecipes.add("alloys/" + r.sfx())) {
                            arc(yeet, r.input(), r.inputCount(), r.inputTwo(), r.inputTwoCount(), null, 0,
                                    r.result(), r.resultCount(), null, null, 0f, 0, 100, 51200, "alloys/" + r.sfx());
                        }
                    }
                }
            }

            // Ore Gems
            if (item instanceof EOrGemItem) {
                if (generatedArcRecipes.add("ore_gem:" + mat) && out.ORE_GEM != null) {
                    arc(yeet, inp.ORE_GEM, 1, inp.ORE_GEM, 1, null,
                            0, out.DUST_INGOT, 4, null, null, 0f, 0, 100, 51200, id.OreGem());
                }
            }

            // Raw Processing
            if (item instanceof EORawMaterialItem || isVanillaRaw(inp.RAW)) {
                if (generatedArcRecipes.add("raw_smelt:" + mat) && !mat.contains("sulfur") && out.DUST_INGOT != null) {
                    arc(yeet, inp.RAW, 1, null, 0, null,
                            0, out.DUST_INGOT, 2, null, out.DUST_INGOT, 0.22f, 1, 100, 25600, id.Raw());
                }
            }

            if (item instanceof BlockItem b && b.getBlock() instanceof EORawBlock || isVanillaRawBlock(inp.RAW_BLOCK_CASE)) {
                if (generatedArcRecipes.add("raw_block_smelt:" + mat) && out.DUST_INGOT != null) {
                    arc(yeet, inp.RAW_BLOCK_CASE, 1, null, 0, null,
                            0, out.DUST_INGOT, 13, null, out.DUST_INGOT, 0.5f, 1, 100, 25600, id.RawBlock());
                }
            }

            // Ore smelting
            if (item instanceof BlockItem b && b.getBlock() instanceof EOreBlock || isVanillaOre(inp.ORE)) {
                if (generatedArcRecipes.add("ore_smelt:" + mat)) {
                    Item result = null;

                    // Sulfur special case
                    if (out.INGOT != null) {
                        result = out.INGOT;
                    } else if (out.GEM != null) {
                        result = out.GEM;
                    } else if (out.COALS != null) {
                        result = out.COALS;
                    } else if (mat.contains("sulfur")) {
                        result = SULFUR_SET.RAW.get();
                    }

                    if (result == null) return;

                    arc(yeet, inp.ORE, 1, null, 0, null, 0, result, 2,
                            IEItems.Ingredients.SLAG.get(), result, 0.22f, 1, 200, 102400, id.Smelt());
                }
            }
        });
    }
}
