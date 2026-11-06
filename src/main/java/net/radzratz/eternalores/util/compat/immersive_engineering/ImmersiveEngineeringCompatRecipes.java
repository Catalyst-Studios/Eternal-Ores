package net.radzratz.eternalores.util.compat.immersive_engineering;

import blusunrize.immersiveengineering.api.crafting.*;
import blusunrize.immersiveengineering.api.excavator.MineralMix;
import blusunrize.immersiveengineering.common.register.IEItems;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.radzratz.eternalores.block.types.EODustBlock;
import net.radzratz.eternalores.block.types.EORawBlock;
import net.radzratz.eternalores.block.types.EOreBlock;
import net.radzratz.eternalores.item.types.*;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.util.recipes.types.EOCommonRecipes;
import net.radzratz.eternalores.util.recipes.util.EORecipeOutputs;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.stream.Stream;

import static net.minecraft.tags.ItemTags.WOODEN_SLABS;
import static net.minecraft.world.item.Items.*;
import static net.minecraft.world.item.Items.GRAVEL;
import static net.neoforged.neoforge.common.Tags.Biomes.*;
import static net.radzratz.eternalores.util.EOMaterials.materialSets.*;
import static net.radzratz.eternalores.util.EOSetRegistries.*;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.types.EOCommonRecipes.*;
import static net.radzratz.eternalores.util.recipes.types.EOCommonRecipes.ORE_PROCESSING;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeOutputs.crushingExclusions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeOutputs.formTypeExclusions;
import static net.radzratz.eternalores.util.recipes.util.EORecipePaths.PATH;
import static net.radzratz.eternalores.util.recipes.util.EORecipePaths.resolveRecipeId;
import static net.radzratz.eternalores.util.tags.biome.EOBiomeTags.Biomes.*;

public class ImmersiveEngineeringCompatRecipes {
    private static List<StackWithChance> isStoneSpoil() {
        return List.of(
                new StackWithChance(COBBLESTONE.getDefaultInstance(), 0.5f),
                new StackWithChance(COBBLED_DEEPSLATE.getDefaultInstance(), 0.3f),
                new StackWithChance(GRAVEL.getDefaultInstance(), 0.2f)
        );
    }

    private static List<StackWithChance> isNetherrackSpoil() {
        return List.of(new StackWithChance(NETHERRACK.getDefaultInstance(), 0.5f),
                new StackWithChance(BLACKSTONE.getDefaultInstance(), 0.3f),
                new StackWithChance(SOUL_SOIL.getDefaultInstance(), 0.2f)
        );
    }

    private static List<StackWithChance> isEndStoneSpoil() {
        return List.of(
                new StackWithChance(END_STONE.getDefaultInstance(), 0.5f),
                new StackWithChance(GRAVEL.getDefaultInstance(), 0.3f),
                new StackWithChance(DUST_SET.BLOCK.get().asItem().getDefaultInstance(), 0.2f)
        );
    }

    private static void arc(RecipeOutput output, Object input, int inputCount, @Nullable Object additiveOne, int additiveCount,
                            @Nullable Object additiveTwo, int additiveCountTwo, Item rlt, int rCnt, @Nullable Item slag, @Nullable Item sec,
                            float secChance, int secCnt, int time, int energy, String sfx) {
        if (rlt == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        IngredientWithSize main = new IngredientWithSize(itemTagInputs(input), inputCount);

        List<IngredientWithSize> additives = new ArrayList<>();
        if (additiveOne != null) {
            additives.add(new IngredientWithSize(itemTagInputs(additiveOne), additiveCount));
        }
        if (additiveTwo != null) {
            additives.add(new IngredientWithSize(itemTagInputs(additiveTwo), additiveCountTwo));
        }

        TagOutputList outputs = new TagOutputList(new TagOutput(rlt, rCnt));

        TagOutput slagOut = slag != null
                ? new TagOutput(slag, 1)
                : TagOutput.EMPTY;

        List<StackWithChance> secondaries = new ArrayList<>();
        if (sec != null && secChance > 0f) {
            secondaries.add(new StackWithChance(new TagOutput(sec, secCnt), secChance));
        }

        ArcFurnaceRecipe recipe = new ArcFurnaceRecipe(outputs, slagOut, secondaries, time, energy, main, additives);

        yeet.withConditions().accept(EO(PATH.IEArc() + sfx), recipe, null, IMMERSIVE_ENGINEERING_MOD);
    }

    private static void crusher(RecipeOutput output, Object input, Item result, int resultCount, @Nullable Item byproduct, int byproductCount, float byChance, int energy, String sfx) {
        if (result == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        TagOutput out = new TagOutput(result, resultCount);

        List<StackWithChance> secondaryOutputs = new ArrayList<>();

        if (byproduct != null) {
            secondaryOutputs.add(new StackWithChance(new TagOutput(byproduct, byproductCount), byChance));
        }

        CrusherRecipe bldr = new CrusherRecipe(out, itemTagInputs(input), energy, secondaryOutputs);

        yeet.withConditions().accept(EO(PATH.IECrusher() + sfx), bldr, null, IMMERSIVE_ENGINEERING_MOD);
    }

    private static void kiln(RecipeOutput output, Object input, int inputCount, Object inputTwo, int inputTwoCount, Item result, int resultCount, int time, String sfx) {
        if (result == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        IngredientWithSize inpOne = new IngredientWithSize(itemTagInputs(input), inputCount);
        IngredientWithSize inpTwo = new IngredientWithSize(itemTagInputs(inputTwo), inputTwoCount);
        TagOutput out = new TagOutput(result, resultCount);

        AlloyRecipe bldr = new AlloyRecipe(out, inpOne, inpTwo, time);

        yeet.withConditions().accept(EO(PATH.IEKiln() + sfx), bldr, null, IMMERSIVE_ENGINEERING_MOD);
    }

    private static void press(RecipeOutput output, Object inp, int iCnt, Item mold, Item rlt, int rCnt, String sfx) {
        if (rlt == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        IngredientWithSize inpOne = new IngredientWithSize(itemTagInputs(inp), iCnt);
        TagOutput out = new TagOutput(rlt, rCnt);

        MetalPressRecipe bldr = new MetalPressRecipe(out, inpOne, mold, 2400);

        yeet.withConditions().accept(EO(PATH.IEPress() + sfx), bldr, null, IMMERSIVE_ENGINEERING_MOD);
    }

    private static void saw(RecipeOutput output, Object input, Item result, int rCnt, Item extra, String sfx) {
        if (result == null || extra == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        TagOutput main = new TagOutput(result, rCnt);

        TagOutput outputs = TagOutput.EMPTY;

        TagOutputList emptyList = new TagOutputList(List.of());
        TagOutputList byproduct = new TagOutputList(new TagOutput(extra, 1));

        SawmillRecipe bldr = new SawmillRecipe(main, outputs, itemTagInputs(input), 800, emptyList, byproduct);

        yeet.withConditions().accept(EO(PATH.IESawmill() + sfx), bldr, null, IMMERSIVE_ENGINEERING_MOD);
    }

    private static void mix(RecipeOutput output, Item itemOne, float weightOne, @Nullable Item itemTwo, float weightTwo, @Nullable Item itemThree, float weightThree, @Nullable Item itemFour,
                            float weightFour, int rarity, float failChance, List<StackWithChance> spoils, Collection<MineralMix.BiomeTagPredicate> predicates, Block block, String name) {
        if (itemOne == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        List<StackWithChance> outputs = new ArrayList<>();

        outputs.add(new StackWithChance(new ItemStack(itemOne), weightOne));

        if (itemTwo != null) {
            outputs.add(new StackWithChance(new ItemStack(itemTwo), weightTwo));
        }

        if (itemThree != null) {
            outputs.add(new StackWithChance(new ItemStack(itemThree), weightThree));
        }

        if (itemFour != null) {
            outputs.add(new StackWithChance(new ItemStack(itemFour), weightFour));
        }

        MineralMix bldr = new MineralMix(outputs, spoils, rarity, failChance, predicates, block);

        yeet.withConditions().accept(EO(PATH.IExcavator() + name), bldr, null, IMMERSIVE_ENGINEERING_MOD);
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Set<String> generatedIERecipes = new HashSet<>();

        EORecipePaths paths = new EORecipePaths("");

        // Arc Furnace
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
                if (generatedIERecipes.add("ie_arc_ingot_dust:" + mat) && !mat.equals("missing") && out.DUST_INGOT != null) {
                    arc(yeet, inp.DUST, 1, null, 0, null,
                            0, out.DUST_INGOT, 1, null, null, 0f, 0, 100, 51200, id.Ingot());
                }

                // Alloys
                for (EOCommonRecipes.Alloys r : EOCommonRecipes.ALLOYS) {
                    if (r.input() != null && r.inputTwo() != null && r.inputThree() != null) {
                        if (generatedIERecipes.add("ie_arc_alloys/" + r.sfx())) {
                            arc(yeet, r.input(), r.inputCount(), r.inputTwo(), r.inputTwoCount(), r.inputThree(), r.inputThreeCount(),
                                    r.result(), r.resultCount(), null, null, 0f, 0, 100, 51200, "alloys/" + r.sfx());
                        }
                    } else if (r.input() != null && r.inputTwo() != null) {
                        if (generatedIERecipes.add("ie_arc_alloys/" + r.sfx())) {
                            arc(yeet, r.input(), r.inputCount(), r.inputTwo(), r.inputTwoCount(), null, 0,
                                    r.result(), r.resultCount(), null, null, 0f, 0, 100, 51200, "alloys/" + r.sfx());
                        }
                    }
                }
            }

            // Ore Gems
            if (item instanceof EOrGemItem) {
                if (generatedIERecipes.add("ie_arc_ore_gem:" + mat) && out.ORE_GEM != null) {
                    arc(yeet, inp.ORE_GEM, 1, inp.ORE_GEM, 1, null,
                            0, out.DUST_INGOT, 4, null, null, 0f, 0, 100, 51200, id.OreGem());
                }
            }

            // Raw Processing
            if (item instanceof EORawMaterialItem || isVanillaRaw(inp.RAW)) {
                if (generatedIERecipes.add("ie_arc_raw_smelt:" + mat) && !mat.contains("sulfur") && out.DUST_INGOT != null) {
                    arc(yeet, inp.RAW, 1, null, 0, null,
                            0, out.DUST_INGOT, 2, null, out.DUST_INGOT, 0.22f, 1, 100, 25600, id.Raw());
                }
            }

            if (item instanceof BlockItem b && b.getBlock() instanceof EORawBlock || isVanillaRawBlock(inp.RAW_BLOCK_CASE)) {
                if (generatedIERecipes.add("ie_arc_raw_block_smelt:" + mat) && out.DUST_INGOT != null) {
                    arc(yeet, inp.RAW_BLOCK_CASE, 1, null, 0, null,
                            0, out.DUST_INGOT, 13, null, out.DUST_INGOT, 0.5f, 1, 100, 25600, id.RawBlock());
                }
            }

            // Ore smelting
            if (item instanceof BlockItem b && b.getBlock() instanceof EOreBlock || isVanillaOre(inp.ORE)) {
                if (generatedIERecipes.add("ie_arc_ore_smelt:" + mat) && !mat.equals("redstone_ingot")) {
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

        // Crusher
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
                if (generatedIERecipes.add("ie_crusher_ingot:" + mat) && out.DUST != null) {
                    crusher(yeet, inp.INGOT, out.DUST, 1, null, 0, 0f, 3000, id.Dust());
                }
            }

            if (item instanceof EOGemItem || isVanillaGem(inp.GEM)) {
                if (generatedIERecipes.add("ie_crusher_gem:" + mat) && out.DUST != null) {
                    crusher(yeet, inp.GEM, out.DUST, 1, null, 0, 0f, 3000, id.Dust());
                }
            }

            if (item instanceof EOCoalItem) {
                if (generatedIERecipes.add("ie_crusher_coal:" + mat) && out.DUST != null) {
                    crusher(yeet, inp.COALS, out.DUST, 1, null, 0, 0f, 3000, id.Dust());
                }
            }

            // Small Dusts
            if (item instanceof EONuggetItem) {
                if (generatedIERecipes.add("ie_crusher_nugget:" + mat) && out.SMALL_DUST != null) {
                    crusher(yeet, inp.NUGGET, out.SMALL_DUST, 1, null, 0, 0f, 1500, id.SmallDust());
                }
            }

            if (item instanceof EOGemShardItem) {
                if (generatedIERecipes.add("ie_crusher_gem_shard:" + mat) && out.SMALL_DUST != null) {
                    crusher(yeet, inp.GEM_SHARDS, out.SMALL_DUST, 1, null, 0, 0f, 1500, id.SmallDust());
                }
            }

            // Dust Block
            if (item instanceof BlockItem b && b.getBlock() instanceof EODustBlock || isVanillaBlock(inp.STORAGE_BLOCK)) {
                if (generatedIERecipes.add("ie_crusher_dust_block:" + mat) && !crushingExclusions().contains(mat) && !formTypeExclusions().contains(mat) && out.DUST_BLOCK != null) {
                    crusher(yeet, inp.STORAGE_BLOCK, out.DUST_BLOCK, 1, null, 0, 0f, 9500, id.DustBlock());
                }
            }

            // Raw Processing
            if (item instanceof EORawMaterialItem || isVanillaRaw(inp.RAW)) {
                if (generatedIERecipes.add("ie_crusher_raw_proc:" + mat) && !mat.contains("sulfur") && out.DUST != null) {
                    crusher(yeet, inp.RAW, out.DUST, 2, out.SMALL_DUST, 3, 0.25f, 6000, id.Raw());
                }
            }

            if (item instanceof BlockItem b && b.getBlock() instanceof EORawBlock || isVanillaRawBlock(inp.STORAGE_BLOCK_RAW)) {
                if (generatedIERecipes.add("ie_crusher_raw_block_proc:" + mat) && !mat.equals("sulfur") && out.DUST != null && out.SMALL_DUST != null) {
                    crusher(yeet, inp.STORAGE_BLOCK_RAW, out.DUST, 18, out.SMALL_DUST, 27, 0.25f, 11000, id.RawBlock());
                }
            }

            // Dirty Dust
            if (item instanceof EODirtyDustItem) {
                if (generatedIERecipes.add("ie_crusher_dirty_dust:" + mat) && out.DIRTY_DUST != null) {
                    crusher(yeet, inp.CLUMP, out.DIRTY_DUST, 1, out.DIRTY_DUST, 1, 0.10f, 5000, id.DirtyDust());
                }
            }

            // Ore -> Material/Byproduct/Extra
            if (item instanceof BlockItem b && b.getBlock() instanceof EOreBlock || isVanillaOre(inp.ORE)) {
                if (generatedIERecipes.add("ie_crusher_ore_block:" + mat) && found != null && found.primary() != null && found.byproduct() != null) {
                    crusher(yeet, inp.ORE, found.primary(), found.primaryCount(), found.byproduct(), found.byproductCount(), 0.22f, 8250, id.Ore());
                }
            }
        });

        // Kiln
        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            // Ore Gem -> Ingot / Dust
            if (item instanceof EOrGemItem) {
                if (generatedIERecipes.add("ie_kiln_gem:" + mat) && out.DUST_INGOT != null) {
                    kiln(yeet, inp.ORE_GEM, 1, inp.ORE_GEM, 1, out.DUST_INGOT, 3, 8, id.OreGem());
                }
            }

            // Alloys
            if (item instanceof EOIngotItem) {
                for (EOCommonRecipes.Alloys r : EOCommonRecipes.ALLOYS) {
                    if (!r.sfx().startsWith(mat)) continue;
                    if (generatedIERecipes.add("ie_kiln_alloy:" + r.sfx()) && !mat.equals("steel") && r.input() != null && r.inputTwo() != null) {
                        kiln(yeet, r.input(), r.inputCount(), r.inputTwo(), r.inputTwoCount(), r.result(), r.resultCount(), 8, "alloys/" + r.sfx());
                    }
                }
            }
        });

        // Metal Press
        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            // Plates
            if (item instanceof EOIngotItem || isVanillaIngot(inp.INGOT)) {
                if (generatedIERecipes.add("ie_press_ingot_plate:" + mat) && out.PLATE != null) {
                    press(yeet, inp.INGOT, 1, MOLD_PLATE.get(), out.PLATE, 1, id.Plate());
                }
            }

            if (item instanceof EOGemItem || isVanillaGem(inp.GEM)) {
                if (generatedIERecipes.add("ie_press_gem_plate:" + mat) && out.PLATE != null) {
                    press(yeet, inp.GEM, 1, MOLD_PLATE.get(), out.PLATE, 1, id.Plate());
                }
            }

            // Rods
            if (item instanceof EOIngotItem || isVanillaIngot(inp.INGOT)) {
                if (generatedIERecipes.add("ie_press_ingot_rod:" + mat) && out.ROD != null) {
                    press(yeet, inp.INGOT, 1, MOLD_ROD.get(), out.ROD, 2, id.Rod());
                }
            }

            if (item instanceof EOGemItem || isVanillaGem(inp.GEM)) {
                if (generatedIERecipes.add("ie_press_gem_rod:" + mat) && out.ROD != null) {
                    press(yeet, inp.GEM, 1, MOLD_ROD.get(), out.ROD, 2, id.Rod());
                }
            }

            // Gears
            if (item instanceof EOIngotItem || isVanillaIngot(inp.INGOT)) {
                if (generatedIERecipes.add("ie_press_ingot_gear:" + mat) && out.GEAR != null) {
                    press(yeet, inp.INGOT, 4, MOLD_GEAR.get(), out.GEAR, 1, id.Gear());
                }
            }

            if (item instanceof EOGemItem || isVanillaGem(inp.GEM)) {
                if (generatedIERecipes.add("ie_press_gem_gear:" + mat) && out.GEAR != null) {
                    press(yeet, inp.GEM, 4, MOLD_GEAR.get(), out.GEAR, 1, id.Gear());
                }
            }

            if (item instanceof EOWireItem) {
                if (generatedIERecipes.add("ie_press_ingot_wire:" + mat) && out.WIRE != null) {
                    //press(yeet, inp.PLATE, 1, MOLD_WIRE.get(), out.WIRE, 2, 2400, id.Wire() + "_eternal");
                }
            }

            // Foils
            if (item instanceof EOFoilItem || isVanillaPlate(inp.PLATE)) {
                if (generatedIERecipes.add("ie_press_ingot_foil:" + mat) && out.FOIL != null) {
                    press(yeet, inp.PLATE, 1, MOLD_FOIL.get(), out.FOIL, 2, id.Foil());
                }
            }
        });

        // Sawmill
        saw(yeet, WOODEN_SLABS, WOOD_SET.PLATE.get(), 4, WOOD_SET.DUST.get(), paths.Plate() + "wooden");
        saw(yeet, WOOD_SET.PLATE.get(), WOOD_SET.GEAR.get(), 1, WOOD_SET.DUST.get(), paths.Gear() + "wooden");

        // Excavator - Mineral Mix
        mix(yeet,
                ALUMINUM_SET.ORE.asItem(), .4f,
                GALLIUM_SET.ORE.asItem(), .27f,
                IRON_ORE, .2f,
                TITANIUM_SET.ORE.asItem(), .1f,
                9,
                0.03f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_JUNGLE)),
                Blocks.STONE,
                "laterite"
        );

        mix(yeet,
                BERYLLIUM_SET.ORE.asItem(), .4f,
                TIN_SET.ORE.asItem(), .3f,
                FLUORITE_SET.ORE.asItem(), .2f,
                EMERALD_ORE.asItem(), .09f,
                11,
                0.01f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_MOUNTAIN)),
                Blocks.STONE,
                "granitic_pegmatite"
        );

        mix(yeet,
                COBALT_SET.ORE.asItem(), .3f,
                NICKEL_SET.ORE.asItem(), .3f,
                SILVER_SET.ORE.asItem(), .2f,
                URANINITE_SET.ORE.asItem(), .18f,
                11,
                0.02f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_TAIGA), new MineralMix.BiomeTagPredicate(IS_OLD_GROWTH)),
                Blocks.STONE,
                "five_element_vein_overworld"
        );

        mix(yeet,
                COBALT_SET.NETHER_ORE.asItem(), .3f,
                NICKEL_SET.NETHER_ORE.asItem(), .3f,
                SILVER_SET.NETHER_ORE.asItem(), .2f,
                URANINITE_SET.NETHER_ORE.asItem(), .18f,
                11,
                0.02f,
                isNetherrackSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_CRIMSON_FOREST)),
                Blocks.NETHERRACK,
                "five_element_vein_nether"
        );

        mix(yeet,
                GALLIUM_SET.ORE.asItem(), .5f,
                ZINC_SET.ORE.asItem(), .3f,
                ALUMINUM_SET.ORE.asItem(), .18f,
                null, 0f,
                17,
                0.02f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_MOUNTAIN)),
                Blocks.STONE,
                "sphalerite_overworld"
        );

        mix(yeet,
                GALLIUM_SET.NETHER_ORE.asItem(), .6f,
                ZINC_SET.RAW.get(), .2f,
                ALUMINUM_SET.RAW.get().asItem(), .18f,
                null, 0f,
                17,
                0.02f,
                isNetherrackSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_WASTES)),
                Blocks.NETHERRACK,
                "sphalerite_nether"
        );

        mix(yeet,
                IRIDIUM_SET.ORE.asItem(), .3f,
                OSMIUM_SET.ORE.asItem(), .3f,
                PLATINUM_SET.ORE.asItem(), .25f,
                NICKEL_SET.ORE.asItem(), .1f,
                10,
                0.05f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_SAVANNA)),
                Blocks.STONE,
                "pgm_reef_ir_overworld"
        );

        mix(yeet,
                IRIDIUM_SET.END_ORE.asItem(), .3f,
                OSMIUM_SET.RAW.get(), .3f,
                PLATINUM_SET.END_ORE.asItem(), .25f,
                NICKEL_SET.RAW.get(), .1f,
                10,
                0.05f,
                isEndStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_END_HIGHLANDS)),
                Blocks.END_STONE,
                "pgm_reef_ir_end"
        );

        mix(yeet,
                LEAD_SET.ORE.asItem(), .3f,
                NICKEL_SET.ORE.asItem(), .29f,
                SILVER_SET.ORE.asItem(), .2f,
                FLUORITE_SET.ORE.asItem(), .1f,
                15,
                0.01f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_PLAINS), new MineralMix.BiomeTagPredicate(IS_MEADOW)),
                Blocks.STONE,
                "mvt_deposit_overworld"
        );

        mix(yeet,
                LEAD_SET.END_ORE.asItem(), .3f,
                NICKEL_SET.RAW.get(), .29f,
                SILVER_SET.RAW.get(), .2f,
                FLUORITE_SET.END_ORE.asItem(), .1f,
                15,
                0.01f,
                isEndStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_END_BARRENS)),
                Blocks.END_STONE,
                "mvt_deposit_end"
        );

        mix(yeet,
                NICKEL_SET.ORE.asItem(), .5f,
                COBALT_SET.ORE.asItem(), .2f,
                PLATINUM_SET.ORE.asItem(), .19f,
                COPPER_ORE.asItem(), .1f,
                17,
                0.01f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_TAIGA)),
                Blocks.STONE,
                "sulfide_intrusion_overworld"
        );

        mix(yeet,
                NICKEL_SET.NETHER_ORE.asItem(), .5f,
                COBALT_SET.NETHER_ORE.asItem(), .2f,
                PLATINUM_SET.RAW.get(), .19f,
                RAW_COPPER, .1f,
                17,
                0.01f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_TAIGA)),
                Blocks.NETHERRACK,
                "sulfide_intrusion_nether"
        );

        mix(yeet,
                OSMIUM_SET.ORE.asItem(), .3f,
                IRIDIUM_SET.ORE.asItem(), .3f,
                PLATINUM_SET.ORE.asItem(), .25f,
                NICKEL_SET.ORE.asItem(), .1f,
                10,
                0.05f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_SAVANNA)),
                Blocks.STONE,
                "pgm_reef_os_overworld"
        );

        mix(yeet,
                OSMIUM_SET.NETHER_ORE.asItem(), .3f,
                IRIDIUM_SET.RAW.get(), .3f,
                PLATINUM_SET.RAW.get(), .25f,
                NICKEL_SET.NETHER_ORE.asItem(), .1f,
                10,
                0.05f,
                isNetherrackSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_WARPED_FOREST)),
                Blocks.NETHERRACK,
                "pgm_reef_os_nether"
        );

        mix(yeet,
                PLATINUM_SET.ORE.asItem(), .3f,
                NICKEL_SET.ORE.asItem(), .29f,
                OSMIUM_SET.ORE.asItem(), .2f,
                COBALT_SET.ORE.asItem(), .19f,
                10,
                0.02f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_SAVANNA)),
                Blocks.STONE,
                "merensky_reef"
        );

        mix(yeet,
                SILVER_SET.ORE.asItem(), .4f,
                LEAD_SET.ORE.asItem(), .29f,
                COBALT_SET.ORE.asItem(), .2f,
                URANINITE_SET.ORE.asItem(), .1f,
                13,
                0.01f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_MOUNTAIN)),
                Blocks.STONE,
                "epithermal_vein_overworld"
        );

        mix(yeet,
                SILVER_SET.NETHER_ORE.asItem(), .4f,
                LEAD_SET.RAW.get(), .29f,
                COBALT_SET.NETHER_ORE.asItem(), .2f,
                URANINITE_SET.NETHER_ORE.asItem(), .1f,
                13,
                0.01f,
                isNetherrackSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_WASTES)),
                Blocks.NETHERRACK,
                "epithermal_vein_nether"
        );

        mix(yeet,
                TIN_SET.ORE.asItem(), .5f,
                TUNGSTEN_SET.SLATE_ORE.asItem(), .27f,
                FLUORITE_SET.ORE.asItem(), .2f,
                BERYLLIUM_SET.ORE.asItem(), .1f,
                15,
                0.03f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_SNOWY_MOUNTAINS)),
                Blocks.STONE,
                "greisen_overworld"
        );

        mix(yeet,
                TIN_SET.ORE.asItem(), .5f,
                TUNGSTEN_SET.SLATE_ORE.asItem(), .27f,
                FLUORITE_SET.ORE.asItem(), .2f,
                BERYLLIUM_SET.ORE.asItem(), .1f,
                15,
                0.03f,
                isEndStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_END_HIGHLANDS)),
                Blocks.END_STONE,
                "greisen_end"
        );

        mix(yeet,
                TITANIUM_SET.ORE.asItem(), .4f,
                ZIRCON_SET.ORE.asItem(), .4f,
                MONAZITE_SET.ORE.asItem(), .1f,
                APATITE_SET.ORE.asItem(), .09f,
                8,
                0.01f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_BEACH), new MineralMix.BiomeTagPredicate(IS_RIVER)),
                Blocks.STONE,
                "ilmenite_placer"
        );

        mix(yeet,
                TITANIUM_SET.ORE.asItem(), .4f,
                ZIRCON_SET.ORE.asItem(), .4f,
                MONAZITE_SET.ORE.asItem(), .1f,
                APATITE_SET.ORE.asItem(), .09f,
                8,
                0.01f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_BEACH), new MineralMix.BiomeTagPredicate(IS_RIVER)),
                Blocks.STONE,
                "ilmenite_placer_overworld"
        );

        mix(yeet,
                TITANIUM_SET.END_ORE.asItem(), .4f,
                ZIRCON_SET.GEM.get(), .4f,
                MONAZITE_SET.GEM.get(), .1f,
                APATITE_SET.GEM.get(), .09f,
                8,
                0.01f,
                isEndStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_END_BARRENS)),
                Blocks.END_STONE,
                "ilmenite_placer_end"
        );

        mix(yeet,
                TUNGSTEN_SET.SLATE_ORE.asItem(), .3f,
                TIN_SET.ORE.asItem(), .25f,
                FLUORITE_SET.ORE.asItem(), .25f,
                BERYLLIUM_SET.ORE.asItem(), .15f,
                10,
                0.05f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_MOUNTAIN)),
                Blocks.STONE,
                "scheelite_skarn_overworld"
        );

        mix(yeet,
                TUNGSTEN_SET.END_ORE.asItem(), .3f,
                TIN_SET.END_ORE.asItem(), .25f,
                FLUORITE_SET.END_ORE.asItem(), .25f,
                BERYLLIUM_SET.RAW.get(), .15f,
                10,
                0.05f,
                isEndStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_END_HIGHLANDS)),
                Blocks.END_STONE,
                "scheelite_skarn_end"
        );

        mix(yeet,
                URANINITE_SET.ORE.asItem(), .45f,
                SILVER_SET.ORE.asItem(), .35f,
                COBALT_SET.ORE.asItem(), .15f,
                null, 0f,
                12,
                0.05f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_SNOWY_PLAINS), new MineralMix.BiomeTagPredicate(IS_JUNGLE)),
                Blocks.STONE,
                "pitchblende_vein_overworld"
        );

        mix(yeet,
                URANINITE_SET.ORE.asItem(), .45f,
                SILVER_SET.ORE.asItem(), .35f,
                COBALT_SET.ORE.asItem(), .15f,
                null, 0f,
                12,
                0.05f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_WASTES), new MineralMix.BiomeTagPredicate(IS_NETHER_FOREST)),
                Blocks.NETHERRACK,
                "pitchblende_vein_nether"
        );

        mix(yeet,
                URANIUM_SET.ORE.asItem(), .4f,
                COBALT_SET.ORE.asItem(), .25f,
                SILVER_SET.ORE.asItem(), .15f,
                URANINITE_SET.ORE.asItem(), .18f,
                11,
                0.02f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_SNOWY_PLAINS), new MineralMix.BiomeTagPredicate(IS_JUNGLE)),
                Blocks.STONE,
                "unconformity_deposit_overworld"
        );

        mix(yeet,
                URANIUM_SET.NETHER_ORE.asItem(), .4f,
                COBALT_SET.NETHER_ORE.asItem(), .25f,
                SILVER_SET.NETHER_ORE.asItem(), .15f,
                URANINITE_SET.NETHER_ORE.asItem(), .18f,
                11,
                0.02f,
                isNetherrackSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_NETHER_FOREST), new MineralMix.BiomeTagPredicate(IS_SOUL_SAND_VALLEY)),
                Blocks.NETHERRACK,
                "unconformity_deposit_nether"
        );

        mix(yeet,
                URANIUM_SET.END_ORE.asItem(), .4f,
                COBALT_SET.RAW.get(), .25f,
                SILVER_SET.RAW.get(), .15f,
                URANINITE_SET.RAW.get(), .18f,
                11,
                0.02f,
                isEndStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_END_BARRENS)),
                Blocks.END_STONE,
                "unconformity_deposit_end"
        );

        mix(yeet,
                PEAT_SET.ORE.asItem(), .7f,
                LIGNITE_SET.ORE.asItem(), .25f,
                null, 0f,
                null, 0f,
                17,
                0.05f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_SWAMP)),
                Blocks.STONE,
                "peat_bog"
        );

        mix(yeet,
                LIGNITE_SET.ORE.asItem(), .5f,
                PEAT_SET.ORE.asItem(), .3f,
                BITUMINOUS_SET.ORE.asItem(), .1f,
                SULFUR_SET.RAW.get(), 0.5f,
                19,
                0.05f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_FOREST), new MineralMix.BiomeTagPredicate(IS_SWAMP)),
                Blocks.STONE,
                "lignite_seam"
        );

        mix(yeet,
                BITUMINOUS_SET.ORE.asItem(), .5f,
                LIGNITE_SET.ORE.asItem(), .3f,
                ANTHRACITE_SET.ORE.asItem(), .15f,
                null, 0f,
                15,
                0.05f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_MOUNTAIN), new MineralMix.BiomeTagPredicate(IS_FOREST)),
                Blocks.STONE,
                "coal_seam"
        );

        mix(yeet,
                ANTHRACITE_SET.ORE.asItem(), .7f,
                BITUMINOUS_SET.ORE.asItem(), .25f,
                null, 0f,
                null, 0f,
                11,
                0.05f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_MOUNTAIN)),
                Blocks.STONE,
                "anthracite_seam"
        );

        mix(yeet,
                SALT_SET.SAND_ORE.asItem(), .5f,
                NITER_SET.ORE.asItem(), .3f,
                SULFUR_SET.ORE.asItem(), .15f,
                null, 0f,
                16,
                0.05f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_DESERT), new MineralMix.BiomeTagPredicate(IS_BADLANDS)),
                Blocks.STONE,
                "evaporite"
        );

        mix(yeet,
                NITER_SET.ORE.asItem(), .5f,
                SALT_SET.SAND_ORE.asItem(), .3f,
                SULFUR_SET.ORE.asItem(), .15f,
                null, 0f,
                16,
                0.05f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_DESERT)),
                Blocks.STONE,
                "caliche"
        );

        mix(yeet,
                SULFUR_SET.ORE.asItem(), .6f,
                CINNABAR_SET.ORE.asItem(), .17f,
                NITER_SET.ORE.asItem(), .1f,
                SALT_SET.SAND_ORE.asItem(), 1f,
                14,
                0.03f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_DESERT), new MineralMix.BiomeTagPredicate(IS_DRIPSTONE_CAVES)),
                Blocks.STONE,
                "solfatara_overworld"
        );

        mix(yeet,
                SULFUR_SET.NETHER_ORE.asItem(), .6f,
                CINNABAR_SET.NETHER_ORE.asItem(), .17f,
                NITER_SET.GEM.get(), .1f,
                SALT_SET.DUST.get(), 1f,
                14,
                0.03f,
                isNetherrackSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_NETHER)),
                Blocks.NETHERRACK,
                "solfatara_nether"
        );

        mix(yeet,
                APATITE_SET.ORE.asItem(), .5f,
                MONAZITE_SET.ORE.asItem(), .25f,
                ZIRCON_SET.ORE.asItem(), .2f,
                null, 0f,
                14,
                0.05f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_PLAINS), new MineralMix.BiomeTagPredicate(IS_FOREST)),
                Blocks.STONE,
                "phosphate_vein"
        );

        mix(yeet,
                AMBER_SET.ORE.asItem(), .6f,
                LIGNITE_SET.ORE.asItem(), .35f,
                null, 0f,
                null, 0f,
                11,
                0.05f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_TAIGA), new MineralMix.BiomeTagPredicate(IS_OLD_GROWTH_TAIGA), new MineralMix.BiomeTagPredicate(IS_OLD_GROWTH_PINE_TAIGA)),
                Blocks.STONE,
                "resinite_seam"
        );

        mix(yeet,
                CINNABAR_SET.ORE.asItem(), .45f,
                SULFUR_SET.ORE.asItem(), .25f,
                SALT_SET.SAND_ORE.asItem(), .25f,
                null, 0f,
                13,
                0.05f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_DESERT), new MineralMix.BiomeTagPredicate(IS_BADLANDS)),
                Blocks.STONE,
                "mercury_deposit_overworld"
        );

        mix(yeet,
                CINNABAR_SET.NETHER_ORE.asItem(), .45f,
                SULFUR_SET.NETHER_ORE.asItem(), .25f,
                SALT_SET.DUST.get(), .25f,
                null, 0f,
                13,
                0.05f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_WASTES)),
                Blocks.NETHERRACK,
                "mercury_deposit_nether"
        );

        mix(yeet,
                GARNET_SET.ORE.asItem(), .5f,
                RUBY_SET.ORE.asItem(), .25f,
                SAPPHIRE_SET.ORE.asItem(), .2f,
                null, 0f,
                11,
                0.05f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_WINDSWEPT), new MineralMix.BiomeTagPredicate(IS_MOUNTAIN)),
                Blocks.STONE,
                "garnet_schist_overworld"
        );

        mix(yeet,
                GARNET_SET.NETHER_ORE.asItem(), .5f,
                RUBY_SET.NETHER_ORE.asItem(), .25f,
                SAPPHIRE_SET.GEM.get(), .2f,
                null, 0f,
                11,
                0.05f,
                isNetherrackSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_WASTES), new MineralMix.BiomeTagPredicate(IS_NETHER_FOREST)),
                Blocks.NETHERRACK,
                "garnet_schist_nether"
        );

        mix(yeet,
                JADE_SET.ORE.asItem(),.7f,
                MAGNESIUM_SET.DUST.get(), .25f,
                null, 0f,
                null, 0f,
                9,
                0.05f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_JAGGED_PEAKS)),
                Blocks.STONE,
                "serpentinite_overworld"
        );

        mix(yeet,
                JADE_SET.NETHER_ORE.asItem(),.7f,
                MAGNESIUM_SET.DUST.get(), .25f,
                null, 0f,
                null, 0f,
                9,
                0.05f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_WASTES)),
                Blocks.STONE,
                "serpentinite_nether"
        );

        mix(yeet,
                MONAZITE_SET.ORE.asItem(), .47f,
                ZIRCON_SET.ORE.asItem(), .3f,
                APATITE_SET.ORE.asItem(), .2f,
                null, 0f,
                13,
                0.03f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_BEACH)),
                Blocks.STONE,
                "ree_placer_overworld"
        );

        mix(yeet,
                MONAZITE_SET.ORE.asItem(), .47f,
                ZIRCON_SET.ORE.asItem(), .3f,
                APATITE_SET.ORE.asItem(), .2f,
                null, 0f,
                13,
                0.03f,
                isNetherrackSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_SOUL_SAND_VALLEY), new MineralMix.BiomeTagPredicate(IS_WARPED_FOREST)),
                Blocks.STONE,
                "ree_placer_nether"
        );

        mix(yeet,
                ONYX_SET.ORE.asItem(), .55f,
                CALCIUM_SET.DUST.get(), .4f,
                null, 0f,
                null, 0f,
                12,
                0.05f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_DESERT), new MineralMix.BiomeTagPredicate(IS_BADLANDS)),
                Blocks.STONE,
                "chalcedony_deposit_overworld"
        );

        mix(yeet,
                ONYX_SET.NETHER_ORE.asItem(), .55f,
                CALCIUM_SET.DUST.get(), .4f,
                null, 0f,
                null, 0f,
                12,
                0.05f,
                isNetherrackSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_WASTES)),
                Blocks.NETHERRACK,
                "chalcedony_deposit_nether"
        );

        mix(yeet,
                PERIDOT_SET.ORE.asItem(), .5f,
                GARNET_SET.ORE.asItem(), .3f,
                RUBY_SET.ORE.asItem(), .18f,
                null, 0f,
                13,
                0.02f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_DESERT), new MineralMix.BiomeTagPredicate(IS_SAVANNA)),
                Blocks.STONE,
                "kimberlite_pipe_overworld"
        );

        mix(yeet,
                PERIDOT_SET.NETHER_ORE.asItem(), .5f,
                GARNET_SET.NETHER_ORE.asItem(), .3f,
                RUBY_SET.NETHER_ORE.asItem(), .18f,
                null, 0f,
                13,
                0.02f,
                isNetherrackSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_WASTES), new MineralMix.BiomeTagPredicate(IS_SOUL_SAND_VALLEY)),
                Blocks.NETHERRACK,
                "kimberlite_pipe_nether"
        );

        mix(yeet,
                PEARL_SET.SAND_ORE.asItem(), .4f,
                SALT_SET.SAND_ORE.asItem(), .3f,
                CALCIUM_SET.DUST.get(), .27f,
                null, 0f,
                9,
                0.03f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_WARM_OCEAN), new MineralMix.BiomeTagPredicate(IS_BEACH)),
                Blocks.STONE,
                "pearl_bed"
        );

        mix(yeet,
                OBSIDIAN_SET.NETHER_ORE.asItem(), .55f,
                SULFUR_SET.NETHER_ORE.asItem(), .3f,
                NETHER_QUARTZ_ORE.asItem(), .1f,
                null, 0f,
                14,
                0.05f,
                isNetherrackSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_BASALT_DELTAS), new MineralMix.BiomeTagPredicate(IS_SOUL_SAND_VALLEY)),
                Blocks.NETHERRACK,
                "rhyolite_flow"
        );

        mix(yeet,
                RUBY_SET.ORE.asItem(), .5f,
                GARNET_SET.ORE.asItem(), .2f,
                ZIRCON_SET.ORE.asItem(), .15f,
                TANZANITE_SET.ORE.asItem(), .1f,
                12,
                0.05f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_JUNGLE), new MineralMix.BiomeTagPredicate(IS_MOUNTAIN)),
                Blocks.STONE,
                "marble_skarn_overworld"
        );

        mix(yeet,
                RUBY_SET.NETHER_ORE.asItem(), .5f,
                GARNET_SET.NETHER_ORE.asItem(), .2f,
                ZIRCON_SET.NETHER_ORE.asItem(), .18f,
                TANZANITE_SET.NETHER_ORE.asItem(), .1f,
                12,
                0.02f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_WARPED_FOREST), new MineralMix.BiomeTagPredicate(IS_CRIMSON_FOREST), new MineralMix.BiomeTagPredicate(IS_WASTES)),
                Blocks.NETHERRACK,
                "marble_skarn_nether"
        );

        mix(yeet,
                SAPPHIRE_SET.ORE.asItem(), .45f,
                TANZANITE_SET.ORE.asItem(), .35f,
                GARNET_SET.ORE.asItem(), .17f,
                null, 0f,
                11,
                0.03f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_MOUNTAIN), new MineralMix.BiomeTagPredicate(IS_SAVANNA)),
                Blocks.STONE,
                "corundum_placer_overworld"
        );

        mix(yeet,
                SAPPHIRE_SET.END_ORE.asItem(), .45f,
                TANZANITE_SET.GEM.get(), .35f,
                GARNET_SET.GEM.get(), .17f,
                null, 0f,
                11,
                0.03f,
                isEndStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_END_BARRENS), new MineralMix.BiomeTagPredicate(IS_END_HIGHLANDS)),
                Blocks.NETHERRACK,
                "corundum_placer_end"
        );

        mix(yeet,
                TANZANITE_SET.ORE.asItem(), .4f,
                GARNET_SET.ORE.asItem(), .39f,
                ZIRCON_SET.ORE.asItem(), .2f,
                null, 0f,
                10,
                0.01f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_SAVANNA)),
                Blocks.STONE,
                "tectonic_vein_overworld"
        );

        mix(yeet,
                TANZANITE_SET.NETHER_ORE.asItem(), .4f,
                GARNET_SET.NETHER_ORE.asItem(), .39f,
                ZIRCON_SET.NETHER_ORE.asItem(), .2f,
                null, 0f,
                10,
                0.01f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_WARPED_FOREST)),
                Blocks.NETHERRACK,
                "tectonic_vein_nether"
        );

        mix(yeet,
                ZIRCON_SET.ORE.asItem(), .5f,
                MONAZITE_SET.ORE.asItem(), .3f,
                APATITE_SET.ORE.asItem(), .17f,
                null, 0f,
                13,
                0.03f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_BEACH)),
                Blocks.STONE,
                "heavy_mineral_placer_overworld"
        );

        mix(yeet,
                ZIRCON_SET.NETHER_ORE.asItem(), .5f,
                MONAZITE_SET.NETHER_ORE.asItem(), .3f,
                APATITE_SET.GEM.get(), .17f,
                null, 0f,
                13,
                0.03f,
                isNetherrackSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_WASTES)),
                Blocks.NETHERRACK,
                "heavy_mineral_placer_nether"
        );

        mix(yeet,
                FLUORITE_SET.ORE.asItem(), .4f,
                CALCIUM_SET.DUST.get(), .3f,
                LEAD_SET.ORE.asItem(), .18f,
                SILVER_SET.ORE.asItem(), .1f,
                12,
                0.02f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_MEADOW)),
                Blocks.STONE,
                "hydrothermal_vein_overworld"
        );

        mix(yeet,
                FLUORITE_SET.END_ORE.asItem(), .4f,
                CALCIUM_SET.DUST.get(), .3f,
                LEAD_SET.RAW.get(), .18f,
                SILVER_SET.RAW.get(), .1f,
                12,
                0.02f,
                isEndStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_END_BARRENS)),
                Blocks.END_STONE,
                "hydrothermal_vein_end"
        );

        mix(yeet,
                NECROTICARITE_SET.NETHER_ORE.asItem(), .6f,
                ONYX_SET.NETHER_ORE.asItem(), .27f,
                PYROLITE_SET.NETHER_ORE.asItem(), .1f,
                null, 0f,
                14,
                0.03f,
                isNetherrackSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_SOUL_SAND_VALLEY)),
                Blocks.STONE,
                "soul_vein"
        );

        mix(yeet,
                PYROLITE_SET.NETHER_ORE.asItem(), .55f,
                OBSIDIAN_SET.NETHER_ORE.asItem(), .25f,
                CINNABAR_SET.NETHER_ORE.asItem(), .1f,
                null, 0f,
                9,
                0.03f,
                isNetherrackSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_WASTES), new MineralMix.BiomeTagPredicate(IS_BASALT_DELTAS)),
                Blocks.NETHERRACK,
                "pyrolitic_formation_nether"
        );

        mix(yeet,
                PYROLITE_SET.END_ORE.asItem(), .55f,
                OBSIDIAN_SET.GEM.get(), .25f,
                CINNABAR_SET.GEM.get(), .1f,
                null, 0f,
                9,
                0.03f,
                isNetherrackSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_END_BARRENS), new MineralMix.BiomeTagPredicate(IS_END_HIGHLANDS)),
                Blocks.NETHERRACK,
                "pyrolitic_formation_end"
        );

        mix(yeet,
                SCULKITE_SET.SCULK_ORE.asItem(), .6f,
                LEAD_SET.SLATE_ORE.asItem(), .27f,
                SILVER_SET.SLATE_ORE.asItem(), .1f,
                null, 0f,
                14,
                0.03f,
                isStoneSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_DEEP_DARK)),
                Blocks.STONE,
                "galena_infested_vein"
        );

        mix(yeet,
                ARDITE_SET.NETHER_ORE.asItem(), .5f,
                COBALT_SET.NETHER_ORE.asItem(), .3f,
                SULFUR_SET.NETHER_ORE.asItem(), .2f,
                null, 0f,
                14,
                0.03f,
                isNetherrackSpoil(),
                List.of(new MineralMix.BiomeTagPredicate(IS_BASALT_DELTAS), new MineralMix.BiomeTagPredicate(IS_WARPED_FOREST)),
                Blocks.NETHERRACK,
                "ardarium_deposit"
        );
    }
}
