package net.radzratz.eternalores.util.compat.hephaestus_forge.recipe_types;

import com.titammods.recipe.AlloyRecipe;
import com.titammods.setup.ModRecipes;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.neoforge.fluids.FluidStack;
import net.radzratz.eternalores.block.types.EOBlock;
import net.radzratz.eternalores.block.types.EODustBlock;
import net.radzratz.eternalores.block.types.EORawBlock;
import net.radzratz.eternalores.block.types.EOreBlock;
import net.radzratz.eternalores.item.types.*;
import net.radzratz.eternalores.util.compat.geore.blocks.GEOreShardBlock;
import net.radzratz.eternalores.util.compat.geore.item.GEOreShardItem;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static net.minecraft.world.level.material.Fluids.LAVA;
import static net.radzratz.eternalores.util.EOMaterials.materialRegistrar.*;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.types.EOCommonRecipes.FLUID_ALLOYS;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeOutputs.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipePaths.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Tools.*;

public class EOHFSmelteryRecipes {
    private static void smelting(RecipeOutput output, Object input, Fluid result, int amount, Fluid fuel, int fAmount, int temp, int time, String sfx) {
        if (result == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        ModRecipes.MeltingRecipe builder =
                new ModRecipes.MeltingRecipe(itemTagInputs(input), new FluidStack(result, amount), new FluidStack(fuel, fAmount), temp, time);

        yeet.withConditions(HEPHAESTUS_MOD).accept(EO(PATH.HPFSmelt() + sfx), builder, null);
    }

    private static void smeltingCompat(RecipeOutput output, Object input, Fluid result, int amount, Fluid fuel, int fAmount, int temp, int time, String sfx) {
        if (result == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        ModRecipes.MeltingRecipe builder =
                new ModRecipes.MeltingRecipe(itemTagInputs(input), new FluidStack(result, amount), new FluidStack(fuel, fAmount), temp, time);

        yeet.withConditions(HEPHAESTUS_MOD, GEORE_MOD).accept(EO(PATH.HPFSmelt() + sfx), builder, null);
    }

    private static void basin(RecipeOutput output, Fluid input, int amount, Item result, int time, String sfx) {
        if (result == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        ModRecipes.CastingBasinRecipe builder =
                new ModRecipes.CastingBasinRecipe(new FluidStack(input, amount), new ItemStack(result), time);

        yeet.withConditions(HEPHAESTUS_MOD).accept(EO(PATH.HPFBasin() + sfx), builder, null);
    }

    private static void table(RecipeOutput output, Object inputItem, Fluid inputFluid, int fluidAmount, Item result, int time, String sfx) {
        if (result == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        ModRecipes.CastingTableRecipe builder =
                new ModRecipes.CastingTableRecipe(itemTagInputs(inputItem), false, new FluidStack(inputFluid, fluidAmount), new ItemStack(result), time);

        yeet.withConditions(HEPHAESTUS_MOD).accept(EO(PATH.HPFCasting() + sfx), builder, null);
    }

    private static void alloying(RecipeOutput output, Fluid inputOne, int iCount, Fluid inputTwo, int iTCount, @Nullable Fluid inputThree, int iTHCount, Fluid result, int rCount, int temp, String sfx) {
        List<FluidStack> stacks = new ArrayList<>();

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        stacks.add(new FluidStack(inputOne, iCount));
        stacks.add(new FluidStack(inputTwo, iTCount));

        if (inputThree != null) {
            stacks.add(new FluidStack(inputThree, iTHCount));
        }

        AlloyRecipe builder = new AlloyRecipe(stacks, new FluidStack(result, rCount), temp);

        yeet.withConditions(HEPHAESTUS_MOD).accept(EO(PATH.HPFAlloying() + sfx), builder, null);
    }

    public static void generate(RecipeOutput output, Registry<Item> reg, Registry<Fluid> fluidReg) {
        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);
        Set<String> generatedSmelteryRecipes = new HashSet<>();

        EORecipePaths paths = new EORecipePaths("");

        Stream.of(FLUID_ALLOYS).flatMap(List::stream).forEach(r -> {
            String base = resolveRecipeId(r.grp(), paths);
            alloying(yeet, r.input(), r.inputCount(), r.inputTwo(), r.inputTwoCount(), r.inputThree(), r.inputThreeCount(), r.result(), r.resultCount(), r.temp(), base + r.sfx());
        });

        itemFluidRecipeActions(reg, fluidReg, (item, path, mat, inp, out, id) -> {
            boolean isFours = FOURS_DUST_MATERIALS.contains(mat) && !formTypeExclusions().contains(mat);

            if (item instanceof BlockItem b && b.getBlock() instanceof EOreBlock || isVanillaBlock(inp.ORE)) {
                // ore -> molten
                if (generatedSmelteryRecipes.add("smelting_ore:" + mat) && out.MOLTEN_FLUID != null) {
                    smelting(yeet, inp.ORE, out.MOLTEN_FLUID, 270, LAVA, 100, getTemp(mat), 50, id.OreProc());
                }
            }

            if (item instanceof BlockItem b && b.getBlock() instanceof EOBlock || isVanillaBlock(inp.STORAGE_BLOCK)) {
                // block -> molten
                if (generatedSmelteryRecipes.add("smelting_blocks:" + mat) && out.MOLTEN_FLUID != null) {
                    smelting(yeet, inp.STORAGE_BLOCK, out.MOLTEN_FLUID, isFours ? 360 : 810, LAVA, 50, getTemp(mat), 100, id.Storage());
                }
                // molten -> block
                if (generatedSmelteryRecipes.add("casting_blocks:" + mat) && out.MOLTEN_FLUID != null && out.BLOCK != null) {
                    basin(yeet, out.MOLTEN_FLUID, isFours ? 360 : 810, out.BLOCK, 100, id.Storage());
                }
            }

            if (item instanceof EORawMaterialItem || isVanillaRaw(inp.RAW)) {
                // raw mat -> molten
                if (generatedSmelteryRecipes.add("smelting_raw_mats:" + mat) && !mat.equals("sulfur") && out.MOLTEN_FLUID != null) {
                    smelting(yeet, inp.RAW, out.MOLTEN_FLUID, 180, LAVA, 100, getTemp(mat), 50, id.RawProc());
                }
            }

            if (item instanceof BlockItem b && b.getBlock() instanceof EODustBlock) {
                if (generatedSmelteryRecipes.add("smelting_dust_blocks:" + mat) && out.MOLTEN_FLUID != null) {
                    smelting(yeet, inp.DUST_BLOCK, out.MOLTEN_FLUID, isFours ? 360 : 810, LAVA, 100, getTemp(mat), 50, id.DustBlock());
                }
            }

            if (item instanceof BlockItem b && b.getBlock() instanceof EORawBlock || isVanillaRaw(inp.STORAGE_BLOCK_RAW)) {
                // raw mat block -> molten
                if (generatedSmelteryRecipes.add("smelting_raw_mat_blocks:" + mat)) {
                    smelting(yeet, inp.STORAGE_BLOCK_RAW, out.MOLTEN_FLUID, 1620, LAVA, 100, getTemp(mat), 50, id.RawProcBlock());
                }
            }

            if (item instanceof EOIngotItem || isVanillaIngot(inp.INGOT)) {
                // ingot -> molten
                if (generatedSmelteryRecipes.add("smelting_ingots:" + mat) && out.MOLTEN_FLUID != null) {
                    smelting(yeet, inp.INGOT, out.MOLTEN_FLUID, 90, LAVA, 100, getTemp(mat), 50, id.Ingot());
                }
                // molten -> ingot
                if (generatedSmelteryRecipes.add("casting_ingots:" + mat) && out.MOLTEN_FLUID != null && out.INGOT != null) {
                    table(yeet, INGOT_MOLD, out.MOLTEN_FLUID, 90, out.INGOT, 10, id.Ingot());
                }
            }

            if (item instanceof EOGemItem || isVanillaGem(inp.GEM)) {
                // gem -> molten
                if (generatedSmelteryRecipes.add("smelting_gems:" + mat) && out.MOLTEN_FLUID != null) {
                    smelting(yeet, inp.GEM, out.MOLTEN_FLUID, 90, LAVA, 100, getTemp(mat), 50, id.Gem());
                }
                // molten -> gem
                if (generatedSmelteryRecipes.add("casting_gems:" + mat) && out.MOLTEN_FLUID != null  && out.GEM != null) {
                    table(yeet, GEM_MOLD, out.MOLTEN_FLUID, 90, out.GEM, 10, id.Gem());
                }
            }

            if (item instanceof EODustItem) {
                // dust -> molten
                if (generatedSmelteryRecipes.add("smelting_dusts:" + mat) && out.MOLTEN_FLUID != null) {
                    smelting(yeet, inp.DUST, out.MOLTEN_FLUID, 90, LAVA, 100, getTemp(mat), 50, id.Dust());
                }
            }

            if (item instanceof EOSmallDustItem) {
                // small dust -> molten
                if (generatedSmelteryRecipes.add("smelting_small_dusts:" + mat) && out.MOLTEN_FLUID != null) {
                    smelting(yeet, inp.SMALL_DUST, out.MOLTEN_FLUID, 10, LAVA, 100, getTemp(mat), 50, id.SmallDust());
                }
            }

            if (item instanceof EONuggetItem || isVanillaNuggets(inp.NUGGET)) {
                // nugget -> molten
                if (generatedSmelteryRecipes.add("smelting_nuggets:" + mat) && out.MOLTEN_FLUID != null) {
                    smelting(yeet, inp.NUGGET, out.MOLTEN_FLUID, 10, LAVA, 100, getTemp(mat), 50, id.Nugget());
                }
                // molten -> nugget
                if (generatedSmelteryRecipes.add("casting_nuggets:" + mat) && out.MOLTEN_FLUID != null  && out.NUGGET != null) {
                    table(yeet, NUGGET_MOLD, out.MOLTEN_FLUID, 10, out.NUGGET, 10, id.Nugget());
                }
            }

            if (item instanceof EOGemShardItem) {
                // gem shard -> molten
                if (generatedSmelteryRecipes.add("smelting_gem_shards:" + mat) && out.MOLTEN_FLUID != null) {
                    smelting(yeet, inp.GEM_SHARDS, out.MOLTEN_FLUID,  isFours ? 23 : 10, LAVA, 100, getTemp(mat), 50, id.Nugget());
                }
                // molten -> gem shard
                if (generatedSmelteryRecipes.add("casting_gem_shards:" + mat) && out.MOLTEN_FLUID != null  && out.GEM_SHARD != null) {
                    table(yeet, NUGGET_MOLD, out.MOLTEN_FLUID, isFours ? 23 : 10, out.GEM_SHARD, 10, id.Nugget());
                }
            }

            if (item instanceof EORodItem) {
                // rod -> molten
                if (generatedSmelteryRecipes.add("smelting_rods:" + mat) && out.MOLTEN_FLUID != null) {
                    smelting(yeet, inp.ROD, out.MOLTEN_FLUID, 45, LAVA, 100, getTemp(mat), 50, id.Rod());
                }
                // molten -> rod
                if (generatedSmelteryRecipes.add("casting_rods:" + mat) && out.MOLTEN_FLUID != null && out.ROD != null) {
                    table(yeet, ROD_MOLD, out.MOLTEN_FLUID, 45, out.ROD, 10, id.Rod());
                }
            }

            if (item instanceof EOPlateItem) {
                // plate -> molten
                if (generatedSmelteryRecipes.add("smelting_plates:" + mat) && out.MOLTEN_FLUID != null) {
                    smelting(yeet, inp.PLATE, out.MOLTEN_FLUID, 45, LAVA, 100, getTemp(mat), 50, id.Plate());
                }
                // molten -> plate
                if (generatedSmelteryRecipes.add("casting_plates:" + mat) && out.MOLTEN_FLUID != null  && out.PLATE != null) {
                    table(yeet, PLATE_MOLD, out.MOLTEN_FLUID, 45, out.PLATE, 10, id.Plate());
                }
            }

            if (item instanceof EOFoilItem) {
                // plate -> molten
                if (generatedSmelteryRecipes.add("smelting_foils:" + mat) && out.MOLTEN_FLUID != null) {
                    smelting(yeet, inp.FOIL, out.MOLTEN_FLUID, 45, LAVA, 100, getTemp(mat), 50, id.Foil());
                }
                // molten -> plate
                if (generatedSmelteryRecipes.add("casting_foils:" + mat) && out.MOLTEN_FLUID != null  && out.FOIL != null) {
                    table(yeet, FOIL_MOLD, out.MOLTEN_FLUID, 45, out.FOIL, 10, id.Foil());
                }
            }

            if (item instanceof EOGearItem) {
                // gear -> molten
                if (generatedSmelteryRecipes.add("smelting_gears:" + mat) && out.MOLTEN_FLUID != null) {
                    smelting(yeet, inp.GEAR, out.MOLTEN_FLUID, 360, LAVA, 100, getTemp(mat), 50, id.Gear());
                }
                // molten -> gear
                if (generatedSmelteryRecipes.add("casting_gears:" + mat) && out.MOLTEN_FLUID != null  && out.GEAR != null) {
                    table(yeet, GEAR_MOLD, out.MOLTEN_FLUID, 360, out.GEAR, 10, id.Gear());
                }
            }
        });

        itemFluidGeOreRecipeActions(reg, fluidReg, (item, path, mat, inp, out, id) -> {
            if (item instanceof GEOreShardItem) {
                // geore shard -> molten
                if (generatedSmelteryRecipes.add("smelting_geore_shards:" + mat) && out.MOLTEN_FLUID != null) {
                    smeltingCompat(yeet, inp.GEOSHARDS, out.MOLTEN_FLUID, 202, LAVA, 100, getTemp(mat), 50, id.Geo() + "_shard");
                }
            }

            if (item instanceof BlockItem b && b.getBlock() instanceof GEOreShardBlock) {
                // geore block -> molten
                if (generatedSmelteryRecipes.add("smelting_geore_blocks:" + mat) && out.MOLTEN_FLUID != null) {
                    smeltingCompat(yeet, inp.GEOSHARD_BLOCKS, out.MOLTEN_FLUID, 810, LAVA, 100, getTemp(mat), 50, id.Geo() + "_block");
                }
            }
        });
    }
}
