package net.radzratz.eternalores.util.compat.create;

import com.simibubi.create.AllItems;
import com.simibubi.create.content.kinetics.crusher.CrushingRecipe;
import com.simibubi.create.content.kinetics.fan.processing.HauntingRecipe;
import com.simibubi.create.content.kinetics.fan.processing.SplashingRecipe;
import com.simibubi.create.content.kinetics.mixer.MixingRecipe;
import com.simibubi.create.content.kinetics.press.PressingRecipe;
import com.simibubi.create.content.kinetics.saw.CuttingRecipe;
import com.simibubi.create.content.processing.recipe.HeatCondition;
import com.simibubi.create.content.processing.recipe.StandardProcessingRecipe;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.block.types.EODustBlock;
import net.radzratz.eternalores.block.types.EORawBlock;
import net.radzratz.eternalores.block.types.EOreBlock;
import net.radzratz.eternalores.item.types.*;
import net.radzratz.eternalores.util.recipes.types.EOCommonRecipes;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.util.recipes.util.EORecipeOutputs;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;
import org.jetbrains.annotations.Nullable;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static net.minecraft.tags.ItemTags.WOODEN_SLABS;
import static net.minecraft.world.item.Items.*;
import static net.radzratz.eternalores.util.EOMaterials.materialSets.*;
import static net.radzratz.eternalores.util.EOMaterials.materialSets.SULFUR_SET;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.types.EOCommonRecipes.BASIC_CRUSHING;
import static net.radzratz.eternalores.util.recipes.types.EOCommonRecipes.ORE_PROCESSING;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeOutputs.crushingExclusions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeOutputs.formTypeExclusions;
import static net.radzratz.eternalores.util.recipes.util.EORecipePaths.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Dusts.DUSTS_BRICK;

public class CreateCompatRecipes {
    private static void sawing(RecipeOutput output, Object input, Item result, int resultCount, String sfx) {
        if (result == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        StandardProcessingRecipe.Builder<CuttingRecipe> bldr =
                new StandardProcessingRecipe.Builder<>(CuttingRecipe::new, EO(sfx));

        bldr.require(itemTagInputs(input)).output(result, resultCount);

        bldr.withCondition(CREATE_MOD).build(yeet);
    }

    private static void crushingWheel(RecipeOutput output, Object input, Item result, int resulCount, @Nullable Item byproduct, float byproductChance, int byproductCount,
                              @Nullable Item extraResult, float extraChance, int extraCount, @Nullable Item nugget, float nuggetChance, int nuggetCount, @Nullable Item block, float blockChance, int time, String sfx) {
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

    private static void crushingWheel(RecipeOutput output, Object input, Item result, int resultCount, Item byproduct, int byproductCount,
                                      Item extraResult, int extraCount, Item block, String sfx) {
        crushingWheel(output, input, result, resultCount, byproduct, 0.25f, byproductCount, extraResult, 0.75f, extraCount,
                AllItems.EXP_NUGGET.asItem(), 0.75f, 1, block, 0.10f, 200, PATH.OreProc() + sfx);
    }

    private static void mixing(RecipeOutput output, Object input, int inputCount, Object inputTwo, int inputTwoCount, @Nullable Object inputThree, int inputThreeCount, Item result, int resultCount, String sfx) {
        if (result == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        StandardProcessingRecipe.Builder<MixingRecipe> bldr =
                new StandardProcessingRecipe.Builder<>(MixingRecipe::new, EO(sfx));

        bldr.requiresHeat(HeatCondition.HEATED).output(result, resultCount);

        for(int i = 0; i < inputCount; ++i) {
            bldr.require(itemTagInputs(input));
        }

        for(int i = 0; i < inputTwoCount; ++i) {
            bldr.require(itemTagInputs(inputTwo));
        }

        if (inputThree != null) {
            for(int i = 0; i < inputThreeCount; ++i) {
                bldr.require(itemTagInputs(inputThree));
            }
        }

        bldr.withCondition(CREATE_MOD).build(yeet);
    }

    private static void fan(RecipeOutput output, Object input, Item result, int resultCount, @Nullable Item byproduct, float byproductChance, String sfx, boolean isHaunt) {
        if (result == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        StandardProcessingRecipe.Builder<?> bldr;

        if (isHaunt) {
            bldr = new StandardProcessingRecipe.Builder<>(HauntingRecipe::new, EO(sfx));
        } else {
            bldr = new StandardProcessingRecipe.Builder<>(SplashingRecipe::new, EO(sfx));
        }

        bldr.require(itemTagInputs(input)).output(result, resultCount);

        if (byproduct != null) {
            bldr.output(byproductChance, byproduct);
        }

        bldr.withCondition(CREATE_MOD).build(yeet);
    }

    private static void press(RecipeOutput output, Object input, Item result, String sfx) {
        if (result == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        StandardProcessingRecipe.Builder<PressingRecipe> bldr =
                new StandardProcessingRecipe.Builder<>(PressingRecipe::new, EO(sfx));

        bldr.require(itemTagInputs(input)).output(result);

        bldr.withCondition(CREATE_MOD).build(yeet);
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Set<String> generatedCreateRecipes = new HashSet<>();

        EORecipePaths paths = new EORecipePaths("");

        // Sawing
        sawing(yeet, WOODEN_SLABS, WOOD_SET.PLATE.get(), 4, paths.Plate() + "wooden");
        sawing(yeet, WOOD_SET.PLATE.get(), WOOD_SET.GEAR.get(), 1, paths.Gear() + "wooden");

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            // Rods
            if (item instanceof EOIngotItem || isVanillaIngot(inp.INGOT)) {
                if (generatedCreateRecipes.add("sawing_plate_ingot:" + mat) && out.ROD != null) {
                    sawing(yeet, inp.INGOT, out.ROD, 1, id.Rod());
                }
            }

            if (item instanceof EOGemItem || isVanillaGem(inp.GEM)) {
                if (generatedCreateRecipes.add("sawing_plate_gem:" + mat) && out.ROD != null) {
                    sawing(yeet, inp.GEM, out.ROD, 1, id.Rod());
                }
            }

            // Wires
            if (item instanceof EOWireItem) {
                if (generatedCreateRecipes.add("sawing_wires:" + mat) && out.WIRE != null) {
                    sawing(yeet, inp.PLATE, out.WIRE, 2, id.Wire());
                }
            }
        });

        // Crushing Wheels
        Stream.of(BASIC_CRUSHING).flatMap(List::stream).forEach(r -> {
            String base = resolveRecipeId(r.grp(), paths);

            if (r.sfx().equals("obsidian") || r.sfx().equals("obsidian_var") || r.sfx().equals("sand") || r.sfx().equals("netherrack")) return;

            crushingWheel(yeet, r.input(), r.result(), r.resultCount(), null, 0f, 0, null, 0f, 0,
                    null, 0f, 0, null, 0f,  100, base + r.sfx());
        });

        crushingWheel(yeet, COPPER_ORE, RAW_COPPER, 2, RAW_COPPER, 1, ZINC_SET.RAW.get(), 1, COBBLESTONE, "copper");
        crushingWheel(yeet, DEEPSLATE_COPPER_ORE, RAW_COPPER, 2, RAW_COPPER, 1, ZINC_SET.RAW.get(), 1, COBBLED_DEEPSLATE, "copper_slate");
        crushingWheel(yeet, DIAMOND_ORE, DIAMOND, 2, DIAMOND, 1, COAL_SET.SMALL_DUST.get(), 1, COBBLESTONE, "diamond");
        crushingWheel(yeet, DEEPSLATE_DIAMOND_ORE, DIAMOND, 2, DIAMOND, 1, COAL_SET.SMALL_DUST.get(), 1, COBBLED_DEEPSLATE, "diamond_slate");
        crushingWheel(yeet, EMERALD_ORE, EMERALD, 2, EMERALD, 1, BERYLLIUM_SET.SMALL_DUST.get(), 1, COBBLESTONE, "emerald");
        crushingWheel(yeet, DEEPSLATE_EMERALD_ORE, EMERALD, 2, EMERALD, 1, BERYLLIUM_SET.SMALL_DUST.get(), 1, COBBLED_DEEPSLATE, "emerald_slate");
        crushingWheel(yeet, IRON_ORE, RAW_IRON, 2, RAW_IRON, 1, NICKEL_SET.RAW.get(), 1, COBBLESTONE, "iron");
        crushingWheel(yeet, DEEPSLATE_IRON_ORE, RAW_IRON, 2, RAW_IRON, 1, NICKEL_SET.RAW.get(), 1, COBBLED_DEEPSLATE, "iron_slate");
        crushingWheel(yeet, GOLD_ORE, RAW_GOLD, 2, RAW_GOLD, 1, SILVER_SET.RAW.get(), 1, COBBLESTONE, "gold");
        crushingWheel(yeet, DEEPSLATE_GOLD_ORE, RAW_GOLD, 2, RAW_GOLD, 1, SILVER_SET.RAW.get(), 1, COBBLED_DEEPSLATE, "gold_slate");
        crushingWheel(yeet, NETHER_GOLD_ORE, RAW_GOLD, 2, RAW_GOLD, 1, SILVER_SET.RAW.get(), 1, NETHERRACK,  "gold_nether");
        crushingWheel(yeet, REDSTONE_ORE, REDSTONE, 8, REDSTONE, 4, CINNABAR_SET.SMALL_DUST.get(), 2, COBBLESTONE, "redstone");
        crushingWheel(yeet, DEEPSLATE_REDSTONE_ORE, REDSTONE, 8, REDSTONE, 4, CINNABAR_SET.SMALL_DUST.get(), 2, COBBLED_DEEPSLATE, "redstone_slate");
        crushingWheel(yeet, NETHER_QUARTZ_ORE, QUARTZ, 5, QUARTZ, 2, SILICON_SET.SMALL_DUST.get(), 3, NETHERRACK, "quartz_nether");
        crushingWheel(yeet, LAPIS_ORE, LAPIS_LAZULI, 9, LAPIS_LAZULI, 2, SULFUR_SET.SMALL_DUST.get(), 3, COBBLESTONE, "lapis");
        crushingWheel(yeet, DEEPSLATE_LAPIS_ORE, LAPIS_LAZULI, 9, LAPIS_LAZULI, 2, SULFUR_SET.SMALL_DUST.get(), 3, COBBLED_DEEPSLATE, "lapis_slate");
        crushingWheel(yeet, COAL_ORE, COAL, 6, COAL, 4, SULFUR_SET.SMALL_DUST.get(), 3, COBBLESTONE, "coal");
        crushingWheel(yeet, DEEPSLATE_COAL_ORE, COAL, 6, COAL, 4, SULFUR_SET.SMALL_DUST.get(), 3, COBBLED_DEEPSLATE, "coal_slate");

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            EOCommonRecipes.OreProcessing found = ORE_PROCESSING.stream()
                    .filter(r -> r.sfx().equals(mat))
                    .findFirst()
                    .orElse(null);

            // Dusts
            if (item instanceof EOIngotItem || isVanillaIngot(inp.INGOT)) {
                if (generatedCreateRecipes.add("wheel_crushing_ingot:" + mat) && out.DUST != null) {
                    crushingWheel(yeet, inp.INGOT, out.DUST, 1, null, 0f, 0, null, 0f, 0,
                            null, 0f, 0, null, 0f, 100, id.Dust());
                }
            }

            if (item instanceof EOGemItem || isVanillaGem(inp.GEM)) {
                if (generatedCreateRecipes.add("wheel_crushing_gem:" + mat) && out.DUST != null) {
                    crushingWheel(yeet, inp.GEM, out.DUST, 1, null, 0f, 0, null, 0f, 0,
                            null, 0f, 0, null, 0f, 100, id.Dust());
                }
            }

            if (item instanceof EOCoalItem) {
                if (generatedCreateRecipes.add("wheel_crushing_coal:" + mat) && out.DUST != null) {
                    crushingWheel(yeet, inp.COALS, out.DUST, 1, null, 0f, 0, null, 0f, 0,
                            null, 0f, 0, null, 0f, 100, id.Dust());
                }
            }

            // Small Dusts
            if (item instanceof EONuggetItem) {
                if (generatedCreateRecipes.add("wheel_crushing_nugget:" + mat) && out.SMALL_DUST != null) {
                    crushingWheel(yeet, inp.NUGGET, out.SMALL_DUST, 1, null, 0f, 0, null, 0f, 0,
                            null, 0f, 0, null, 0f, 100, id.SmallDust());
                }
            }

            if (item instanceof EOGemShardItem) {
                if (generatedCreateRecipes.add("wheel_crushing_gem_shard:" + mat) && out.SMALL_DUST != null) {
                    crushingWheel(yeet, inp.GEM_SHARDS, out.SMALL_DUST, 1, null, 0f, 0, null, 0f, 0,
                            null, 0f, 0, null, 0f, 100, id.SmallDust());
                }
            }

            // Dirty Dusts
            if (item instanceof EODirtyDustItem) {
                if (generatedCreateRecipes.add("wheel_crushing_dirty_dust:" + mat) && out.DIRTY_DUST != null) {
                    crushingWheel(yeet, inp.CLUMP, out.DIRTY_DUST, 1, null, 0f, 0 , null, 0f, 0,
                            null, 0f, 0, null, 0f, 200, id.DirtyDust());
                }
            }

            // Clumps
            if (item instanceof EOClumpItem) {
                if (generatedCreateRecipes.add("wheel_crushing_raw_proc:" + mat) && out.CLUMP != null) {
                    crushingWheel(yeet, inp.RAW, out.CLUMP, 2, out.SMALL_DUST, 0.35f, 3, null, 0f, 0,
                            AllItems.EXP_NUGGET.get(), 0.75f, 1, null, 0, 200, id.Clump());
                }
            }

            // Dust Block
            if (item instanceof BlockItem b && b.getBlock() instanceof EODustBlock || isVanillaBlock(inp.STORAGE_BLOCK)) {
                if (generatedCreateRecipes.add("wheel_crushing_dust_block:" + mat) && !crushingExclusions().contains(mat) && !formTypeExclusions().contains(mat) && out.DUST_BLOCK != null) {
                    crushingWheel(yeet, inp.STORAGE_BLOCK, out.DUST_BLOCK, 1, null, 0f, 0, null, 0f, 0,
                            null, 0f, 0, null, 0f, 200, id.DustBlock());
                }
            }

            // Raw Block
            if (item instanceof BlockItem b && b.getBlock() instanceof EORawBlock || isVanillaRawBlock(inp.STORAGE_BLOCK_RAW)) {
                if (generatedCreateRecipes.add("wheel_crushing_raw_block_proc:" + mat) && !mat.contains("sulfur") && out.CLUMP != null) {
                    crushingWheel(yeet, inp.STORAGE_BLOCK_RAW, out.CLUMP, 18, out.SMALL_DUST, 0.35f, 27, null, 0f, 0,
                            AllItems.EXP_NUGGET.get(), 0.75f, 18, null, 0f, 200, id.RawBlock());
                }
            }

            // Ore -> Result / Byproduct / Extra
            if (item instanceof BlockItem b && b.getBlock() instanceof EOreBlock) {
                String oreProc = resolveOrePath(path, mat);
                EORecipeOutputs.OreVariant variant;
                EORecipePaths none = new EORecipePaths("");

                if (generatedCreateRecipes.add("wheel_crushing_ore_block_raw:" + oreProc) && found != null && found.primary() != null && found.byproduct() != null) {
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

                    crushingWheel(yeet, b.asItem(), found.primary(), found.primaryCount(), found.primary(), 0.45f, 1, found.byproduct(), 0.25f, 1,
                            AllItems.EXP_NUGGET.get(), 0.75f, 1, baseBlock, 0.12f, 200, recipePath);
                }
            }
        });

        // Mixing
        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            // Ore Gem -> Ingot / Dust
            if (item instanceof EOrGemItem) {
                if (generatedCreateRecipes.add("mixing_gem_ore:" + mat) && out.DUST_INGOT != null) {
                    mixing(yeet, inp.ORE_GEM, 1, inp.ORE_GEM, 1, null, 0, out.DUST_INGOT, 3, id.OreGem());
                }
            }

            // Alloys
            if (item instanceof EOIngotItem) {
                for (EOCommonRecipes.Alloys r : EOCommonRecipes.ALLOYS) {
                    if (r.input() != null && r.inputTwo() != null && r.inputThree() != null) {
                        if (generatedCreateRecipes.add("mixing_alloys/" + r.sfx())) {
                            mixing(yeet, r.input(), r.inputCount(), r.inputTwo(), r.inputTwoCount(), r.inputThree(), r.inputThreeCount(),
                                    r.result(), r.resultCount(), "alloys/" + r.sfx());
                        }
                    } else if (r.input() != null && r.inputTwo() != null) {
                        if (generatedCreateRecipes.add("mixing_alloys/" + r.sfx())) {
                            mixing(yeet, r.input(), r.inputCount(), r.inputTwo(), r.inputTwoCount(), null, 0,
                                    r.result(), r.resultCount(), "alloys/" + r.sfx());
                        }
                    }
                }
            }
        });

        // Fan
        fan(yeet, PEAT_SET.COAL.get(), BIOMASS_SET.ITEM.get(), 1, null, 0f, "biomass", false);
        fan(yeet, DUSTS_BRICK, CLAY_BALL, 1, null, 0f, "clay", false);
        fan(yeet, DUSTS_BRICK, NETHER_BRICK, 1, null, 0f, "nether_brick", true);
        fan(yeet, SAPPHIRE_SET.GEM.get(), NECROTICARITE_SET.GEM.get(), 1, SOUL_SAND_SET.DUST.get(), 0.45f, "necroticarite", true);

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            if (item instanceof EODirtyDustItem) {
                if (generatedCreateRecipes.add("create_washing_dirty_dust:" + mat) && out.DUST != null) {
                    fan(yeet, inp.DIRTY_DUST, out.DUST, 1, STONE_SET.SMALL_DUST.get(), 0.22f, id.DirtyDust(), false);
                }
            }

            if (item instanceof EOClumpItem) {
                if (generatedCreateRecipes.add("create_washing_clump:" + mat) && out.DUST != null) {
                    fan(yeet, inp.CLUMP, out.DUST, 2, out.SMALL_DUST, 0.31f, id.Clump(), false);
                }
            }

            // Haunting... think of something really spooky while reading this...
        });

        // Mechanical Press
        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            // Plate
            if (item instanceof EOIngotItem || isVanillaIngot(inp.INGOT)) {
                if (generatedCreateRecipes.add("press_plate_ingot:" + mat) && out.PLATE != null) {
                    press(yeet, inp.INGOT, out.PLATE, id.Plate());
                }
            }

            if (item instanceof EOGemItem || isVanillaGem(inp.GEM)) {
                if (generatedCreateRecipes.add("press_plate_gem:" + mat) && out.PLATE != null) {
                    press(yeet, inp.GEM, out.PLATE, id.Plate());
                }
            }

            // Foil
            if (item instanceof EOFoilItem || isVanillaPlate(inp.PLATE)) {
                if (generatedCreateRecipes.add("press_foils:" + mat) && out.FOIL != null) {
                    press(yeet, inp.PLATE, out.FOIL, id.Foil());
                }
            }
        });
    }
}
