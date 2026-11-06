package net.radzratz.eternalores.util.compat.energized_power;

import me.jddev0.ep.recipe.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.radzratz.eternalores.block.types.EODustBlock;
import net.radzratz.eternalores.block.types.EORawBlock;
import net.radzratz.eternalores.block.types.EOStorageBlock;
import net.radzratz.eternalores.block.types.EOreBlock;
import net.radzratz.eternalores.item.types.*;
import net.radzratz.eternalores.util.recipes.types.EOCommonRecipes;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static net.minecraft.tags.ItemTags.WOODEN_SLABS;
import static net.radzratz.eternalores.util.EOMaterials.materialSets.*;
import static net.radzratz.eternalores.util.EOSetRegistries.*;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.types.EOCommonRecipes.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeOutputs.crushingExclusions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeOutputs.formTypeExclusions;
import static net.radzratz.eternalores.util.recipes.util.EORecipePaths.PATH;
import static net.radzratz.eternalores.util.recipes.util.EORecipePaths.resolveRecipeId;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Ingots.INGOTS_REDSTONE;

public class EnergizedPowerCompatRecipes {
    private static final double[] ONE = {1.0};

    public static void compressor(RecipeOutput output, Object input, int inputCount, Item result, int resultCount, String sfx) {
        if (result == null) return;

        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Ingredient ingredient = itemTagInputs(input);
        ItemStack resultStack = new ItemStack(result, resultCount);

        CompressorRecipe recipe = new CompressorRecipe(resultStack, ingredient, inputCount);

        yeet.accept(EO(PATH.EPCompressor() + sfx), recipe, null, ENERGIZED_POWER_MOD);
    }

    @SuppressWarnings("all")
    private static void sawmill(RecipeOutput output, Object input, Item result, int resultCount, Item byproduct, int byproductCount, String sfx) {
        if (result == null || byproduct == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        ItemStack main = new ItemStack(result, resultCount);
        ItemStack extra = new ItemStack(byproduct, byproductCount);

        SawmillRecipe bldr = new SawmillRecipe(main, extra, itemTagInputs(input));

        yeet.withConditions().accept(EO(PATH.EEPSawmill() + sfx), bldr, null, ENERGIZED_POWER_MOD);
    }

    private static void filtrationPlant(RecipeOutput output, Item pebbleType, Item result, double resultChance, String sfx) {
        if (result == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        OutputItemStackWithPercentages pebble = new OutputItemStackWithPercentages(new ItemStack(pebbleType, 1), 0.33);
        OutputItemStackWithPercentages raw = new OutputItemStackWithPercentages(new ItemStack(result, 1), resultChance);

        FiltrationPlantRecipe bldr = new FiltrationPlantRecipe(pebble, raw, BuiltInRegistries.ITEM.getKey(result.asItem()));

        yeet.withConditions(ENERGIZED_POWER_MOD).accept(EO(PATH.EEPFiltration() + sfx), bldr, null);
    }

    public static void metalPress(RecipeOutput output, Object input, int inputCount, Item mold, Item result, int resultCount, String sfx) {
        if (result == null) return;

        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Ingredient inputItem = itemTagInputs(input);

        ItemStack pressMold = new ItemStack(mold);
        ItemStack outputItem = new ItemStack(result, resultCount);

        MetalPressRecipe recipe = new MetalPressRecipe(outputItem, pressMold, inputItem, inputCount);

        yeet.accept(EO(PATH.EPPress() + sfx), recipe, null, ENERGIZED_POWER_MOD);
    }

    public static void pulverizer(RecipeOutput output, Object input, Item result, int resultCount, double[] chanceNormal, double[] chanceAdvanced, @Nullable Item byproduct,
                                  int byproductCount, double[] chanceByNormal, double[] chanceByAdvanced, String sfx) {
        if (result == null || input == null) return;

        RecipeOutput yeet = new EOAdvancementYeeter(output);

        PulverizerRecipe.OutputItemStackWithPercentages mRlt =
                new PulverizerRecipe.OutputItemStackWithPercentages(new ItemStack(result, resultCount), chanceNormal, chanceAdvanced);

        PulverizerRecipe.OutputItemStackWithPercentages oRlt;

        if (byproduct != null && chanceByNormal != null && chanceByAdvanced != null) {
            oRlt = new PulverizerRecipe.OutputItemStackWithPercentages(new ItemStack(byproduct, byproductCount), chanceByNormal, chanceByAdvanced);
        } else {
            oRlt = new PulverizerRecipe.OutputItemStackWithPercentages(ItemStack.EMPTY, new double[0], new double[0]);
        }

        PulverizerRecipe recipe = new PulverizerRecipe(mRlt, oRlt, itemTagInputs(input));

        yeet.accept(EO(PATH.EPPulverizer() + sfx), recipe, null, ENERGIZED_POWER_MOD);
    }

    public static void induction(RecipeOutput output, Object input, int inputCount, @Nullable Object inputTwo, int inputTwoCount,
                                 @Nullable Object inputThree, int inputThreeCount, Item result, int resultCount, int time, String sfx) {
        if (result == null || input == null) return;

        RecipeOutput yeet = new EOAdvancementYeeter(output);

        List<IngredientWithCount> list = new ArrayList<>();

        list.add(new IngredientWithCount(itemTagInputs(input), inputCount));

        if (inputTwo != null)
            list.add(new IngredientWithCount(itemTagInputs(inputTwo), inputTwoCount));

        if (inputThree != null)
            list.add(new IngredientWithCount(itemTagInputs(inputThree), inputThreeCount));

        IngredientWithCount[] ingredients = list.toArray(new IngredientWithCount[0]);

        ItemStack outputItem = new ItemStack(result, resultCount);
        var secondary = OutputItemStackWithPercentages.EMPTY;

        AlloyFurnaceRecipe recipe = new AlloyFurnaceRecipe(outputItem, secondary, ingredients, time);

        yeet.accept(EO(PATH.EPSmelter() + sfx), recipe, null, ENERGIZED_POWER_MOD);
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Set<String> generatedEnergizedPowerRecipes = new HashSet<>();

        EORecipePaths paths = new EORecipePaths("");

        // Compressor
        compressor(yeet, INGOTS_REDSTONE, 1, REDSTONE_SET.PLATE.get(), 1, "plates/redstone");
        compressor(yeet, REDSTONE_SET.REDSTONE_BLOCK.get().asItem(), 1, REDSTONE_SET.PLATE.get(), 9, "plates/redstone_block");
        compressor(yeet, SILICON_SET.BLOCK.get().asItem(), 1, SILICON_SET.PLATE.get(), 9, "plates/silicon_block");

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            // Ingot -> Plate
            if (item instanceof EOPlateItem || isVanillaIngot(inp.INGOT) || isVanillaGem(inp.GEM)) {
                if (generatedEnergizedPowerRecipes.add("energized_compressor_base:" + mat) && !mat.equals("redstone") && !formTypeExclusions().contains(mat) && out.PLATE != null) {
                    compressor(yeet, inp.GEM_INGOT, 1, out.PLATE, 1, id.Plate());
                }
            }

            // Block -> 9x Plate
            if (item instanceof BlockItem b && b.getBlock() instanceof EOStorageBlock) {
                if (generatedEnergizedPowerRecipes.add("energized_compressor_block:" + mat) && !formTypeExclusions().contains(mat)
                        && !mat.equals("redstone_ingot") && !mat.equals("silicon") && !mat.equals("silicon_ingot") && out.PLATE != null) {
                    boolean isFours = FOURS_DUST_MATERIALS.contains(mat);

                    compressor(yeet, inp.STORAGE_BLOCK, 1, out.PLATE, isFours ? 4 : 9, id.Plate() + "_block");
                }
            }
        });

        // Sawmill
        sawmill(yeet, WOODEN_SLABS, WOOD_SET.PLATE.get(), 4, WOOD_SET.DUST.get(), 1, paths.Plate() + "wooden");
        sawmill(yeet, WOOD_SET.PLATE.get(), WOOD_SET.GEAR.get(), 1, WOOD_SET.DUST.get(), 1, paths.Gear() + "wooden");

        // Filtration Plant
        filtrationPlant(yeet, STONE_SET.PEBBLE.get(), ALUMINUM_SET.RAW.get(), 0.05, "aluminum");
        filtrationPlant(yeet, STONE_SET.PEBBLE.get(), ARDITE_SET.RAW.get(), 0.005, "ardite");
        filtrationPlant(yeet, STONE_SET.PEBBLE.get(), BERYLLIUM_SET.RAW.get(), 0.035, "beryllium");
        filtrationPlant(yeet, STONE_SET.PEBBLE.get(), COBALT_SET.RAW.get(), 0.025, "cobalt");
        filtrationPlant(yeet, STONE_SET.PEBBLE.get(), GALLIUM_SET.RAW.get(), 0.05, "gallium");
        filtrationPlant(yeet, STONE_SET.PEBBLE.get(), IRIDIUM_SET.RAW.get(), 0.025, "iridium");
        filtrationPlant(yeet, STONE_SET.PEBBLE.get(), LEAD_SET.RAW.get(), 0.045, "lead");
        filtrationPlant(yeet, STONE_SET.PEBBLE.get(), MOLYBDENUM_SET.RAW.get(), 0.045, "molybdenum");
        filtrationPlant(yeet, STONE_SET.PEBBLE.get(), NICKEL_SET.RAW.get(), 0.05, "nickel");
        filtrationPlant(yeet, STONE_SET.PEBBLE.get(), NEODYMIUM_SET.RAW.get(), 0.015, "neodymium");
        filtrationPlant(yeet, STONE_SET.PEBBLE.get(), OSMIUM_SET.RAW.get(), 0.035, "osmium");
        filtrationPlant(yeet, STONE_SET.PEBBLE.get(), PALLADIUM_SET.RAW.get(), 0.005, "palladium");
        filtrationPlant(yeet, STONE_SET.PEBBLE.get(), PLATINUM_SET.RAW.get(), 0.015, "platinum");
        filtrationPlant(yeet, STONE_SET.PEBBLE.get(), SCULKITE_SET.RAW.get(), 0.005, "sculkite");
        filtrationPlant(yeet, STONE_SET.PEBBLE.get(), SILVER_SET.RAW.get(), 0.035, "silver");
        filtrationPlant(yeet, STONE_SET.PEBBLE.get(), TIN_SET.RAW.get(), 0.05, "tin");
        filtrationPlant(yeet, STONE_SET.PEBBLE.get(), TITANIUM_SET.RAW.get(), 0.002, "titanium");
        filtrationPlant(yeet, STONE_SET.PEBBLE.get(), TUNGSTEN_SET.RAW.get(), 0.002, "tungsten");
        filtrationPlant(yeet, STONE_SET.PEBBLE.get(), ULTIMATITANIUM_SET.RAW.get(), 0.002, "ultimatitanium");
        filtrationPlant(yeet, STONE_SET.PEBBLE.get(), URANINITE_SET.RAW.get(), 0.05, "uraninite");
        filtrationPlant(yeet, STONE_SET.PEBBLE.get(), URANIUM_SET.RAW.get(), 0.025, "uranium");
        filtrationPlant(yeet, STONE_SET.PEBBLE.get(), VANADIUM_SET.RAW.get(), 0.010, "vanadium");
        filtrationPlant(yeet, STONE_SET.PEBBLE.get(), ZINC_SET.RAW.get(), 0.05, "zinc");

        // Metal Press
        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            // Rods
            if (item instanceof EORodItem) {
                if (generatedEnergizedPowerRecipes.add("energized_press_rod:" + mat) && !mat.equals("samarium") && out.ROD != null) {
                    metalPress(yeet, inp.PLATE, 1, MOLD_ROD.get(), out.ROD, 2, id.Rod());
                }
            }

            // Gears
            if (item instanceof EOGearItem) {
                if (generatedEnergizedPowerRecipes.add("energized_press_gear:" + mat) && !mat.equals("wooden") && out.GEAR != null) {
                    metalPress(yeet, inp.PLATE, 2, MOLD_GEAR.get(), out.GEAR, 1, id.Gear());
                }
            }

            // Foils
            if (item instanceof EOFoilItem || isVanillaPlate(inp.PLATE)) {
                if (generatedEnergizedPowerRecipes.add("energized_press_foil:" + mat) && out.FOIL != null) {
                    metalPress(yeet, inp.PLATE, 1, MOLD_FOIL.get(), out.FOIL, 2, id.Foil());
                }
            }
        });

        // Pulverizer
        Stream.of(BASIC_CRUSHING).flatMap(List::stream).forEach(r -> {
            String base = resolveRecipeId(r.grp(), paths);
            pulverizer(yeet, r.input(), r.result(), r.resultCount(), ONE, ONE, r.byproduct(), r.byproductCount(), ONE, ONE, base + r.sfx());
        });

        Stream.of(BIO_FUEL_BASIC).flatMap(List::stream).forEach(r -> {
            String base = resolveRecipeId(r.grp(), paths);
            pulverizer(yeet, r.input(), r.result(), r.resultCount(), ONE, ONE, r.byproduct(), r.byproductCount(), ONE, ONE, base + r.sfx());
        });

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            EOCommonRecipes.OreProcessing found = ORE_PROCESSING.stream()
                    .filter(r -> r.sfx().equals(mat))
                    .findFirst()
                    .orElse(null);

            // Ingot -> Dust
            if (item instanceof EOIngotItem || isVanillaIngot(inp.INGOT)) {
                if (generatedEnergizedPowerRecipes.add("energized_pulverizer_ingot_dust:" + mat) && out.DUST != null) {
                    pulverizer(yeet, inp.INGOT, out.DUST, 1, ONE, ONE, null, 0, null, null, id.Dust());
                }
            }

            // Nugget -> Small Dust
            if (item instanceof EONuggetItem) {
                if (generatedEnergizedPowerRecipes.add("energized_pulverizer_nugget:" + mat) && out.SMALL_DUST != null) {
                    pulverizer(yeet, inp.NUGGET, out.SMALL_DUST, 1, ONE, ONE, null, 0, null, null, id.SmallDust());
                }
            }

            // Gem -> Dust
            if (item instanceof EOGemItem || isVanillaGem(inp.GEM)) {
                if (generatedEnergizedPowerRecipes.add("energized_pulverizer_gem_dust:" + mat) && out.DUST != null) {
                    pulverizer(yeet, inp.GEM, out.DUST, 1, ONE, ONE, null, 0, null, null, id.Dust());
                }
            }

            // Gem Shard -> Small Dust
            if (item instanceof EOGemShardItem) {
                if (generatedEnergizedPowerRecipes.add("energized_pulverizer_gem_shard:" + mat) && out.SMALL_DUST != null) {
                    pulverizer(yeet, inp.GEM_SHARDS, out.SMALL_DUST, 1, ONE, ONE, null, 0, null, null, id.SmallDust());
                }
            }

            // Coal -> Dust
            if (item instanceof EOCoalItem) {
                if (generatedEnergizedPowerRecipes.add("energized_pulverizer_coal:" + mat) && out.DUST != null) {
                    pulverizer(yeet, inp.COALS, out.DUST, 1, ONE, ONE, null, 0, null, null, id.Dust());
                }
            }

            // Raw Mats -> 2x Dust - 3x Byproduct
            if (item instanceof EORawMaterialItem || isVanillaRaw(inp.RAW)) {
                if (generatedEnergizedPowerRecipes.add("energized_pulverizer_raw:" + mat) && !mat.contains("sulfur") && out.DUST != null && out.SMALL_DUST != null) {
                    double [] mNrml = {1.0, 1.0, 0.25};
                    double [] mAdv = {1.0, 1.0, 0.50};
                    double [] bNrml = {1.0, 0.10, 0.10};
                    double [] bAdv = {1.0, 0.75, 0.25};

                    pulverizer(yeet, inp.RAW, out.DUST, 2, mNrml, mAdv, out.SMALL_DUST, 3, bNrml, bAdv, id.RawProc());
                }
            }

            // Clump -> Dirty Dust
            if (item instanceof EOClumpItem) {
                if (generatedEnergizedPowerRecipes.add("energized_pulverizer_clump:" + mat) && out.DIRTY_DUST != null) {
                    double [] mNrml = {1.0, 0.10};
                    double [] mAdv = {1.0, 0.40};

                    pulverizer(yeet, inp.CLUMP, out.DIRTY_DUST, 2, mNrml, mAdv, null, 0, null, null, id.Clump());
                }
            }

            // Block -> Dust Block
            if (item instanceof BlockItem b && b.getBlock() instanceof EODustBlock || isVanillaBlock(inp.STORAGE_BLOCK)) {
                if (generatedEnergizedPowerRecipes.add("energized_pulverizer_block:" + mat) && !crushingExclusions().contains(mat) && !formTypeExclusions().contains(mat) && out.DUST_BLOCK != null) {
                    pulverizer(yeet, inp.STORAGE_BLOCK, out.DUST_BLOCK, 1, ONE, ONE, null, 0, null, null, id.DustBlock());
                }
            }

            // Raw Block -> 12x Dust - 6x Byproduct
            if (item instanceof BlockItem b && b.getBlock() instanceof EORawBlock || isVanillaRawBlock(inp.STORAGE_BLOCK_RAW)) {
                if (generatedEnergizedPowerRecipes.add("energized_pulverizer_raw_block:" + mat) && !mat.contains("sulfur") && out.CLEAN_DUST != null && out.SMALL_DUST != null) {
                    double [] mNrml = {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.75, 0.50, 0.25, 0.25, 0.25, 0.10, 0.10};
                    double [] mAdv = {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.75, 0.50, 0.25, 0.25, 0.10};
                    double [] bNrml = {1.0, 1.0, 0.25, 0.10, 0.10, 0.10};
                    double [] bAdv = {1.0, 1.0, 0.75, 0.50, 0.25, 0.25};

                    pulverizer(yeet, inp.STORAGE_BLOCK_RAW, out.CLEAN_DUST, 12, mNrml, mAdv, out.SMALL_DUST, 6, bNrml, bAdv, id.RawProcBlock());
                }
            }

            // Ore Block -> Material
            if (item instanceof BlockItem b && b.getBlock() instanceof EOreBlock || isVanillaOre(inp.ORE)) {
                if (generatedEnergizedPowerRecipes.add("energized_pulverizer_ore:" + mat) && found != null && found.primary() != null && found.byproduct() != null) {
                    double[] mNrml = found.chances().mainNormal();
                    double[] mAdv = found.chances().mainAdvanced();
                    double[] bNrml = found.chances().byproductNormal();
                    double[] bAdv = found.chances().byproductAdvanced();

                    pulverizer(yeet, inp.ORE, found.primary(), found.primaryCount(), mNrml, mAdv, found.byproduct(), found.byproductCount(), bNrml, bAdv, id.OreProc());
                }
            }
        });

        // Induction Smelter
        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            // Ore Gem -> Ingot/Dust
            if (item instanceof EOrGemItem) {
                if (generatedEnergizedPowerRecipes.add("energized_induction_ore_gem:" + mat) && out.DUST_INGOT != null) {
                    induction(yeet, inp.ORE_GEM, 1, inp.ORE_GEM, 1, null, 0, out.DUST_INGOT, 3, 800, id.OreGem());
                }
            }

            // Alloys
            if (item instanceof EOIngotItem) {
                for (EOCommonRecipes.Alloys r : EOCommonRecipes.ALLOYS) {
                    if (r.input() != null && r.inputTwo() != null && r.inputThree() != null && r.result() != null) {
                        if (generatedEnergizedPowerRecipes.add("energized_induction_alloy:" + r.sfx())) {
                            induction(yeet, r.input(), r.inputCount(), r.inputTwo(), r.inputTwoCount(), r.inputThree(), r.inputThreeCount(),
                                    r.result(), r.resultCount(), 500, "alloys/" + r.sfx());
                        }
                    } else if (r.input() != null && r.inputTwo() != null && r.result() != null) {
                        if (generatedEnergizedPowerRecipes.add("energized_induction_alloy:" + r.sfx())) {
                            induction(yeet, r.input(), r.inputCount(), r.inputTwo(), r.inputTwoCount(), null, 0,
                                    r.result(), r.resultCount(), 500, "alloys/" + r.sfx());
                        }
                    }
                }
            }
        });
    }
}
