package net.radzratz.eternalores.util.compat.slag_n_embers.recipe_types;

import dev.lopyluna.slag.content.datagen.AlloyingRecipeBuilder;
import dev.lopyluna.slag.content.datagen.BasinCastingRecipeBuilder;
import dev.lopyluna.slag.content.datagen.MeltingRecipeBuilder;
import dev.lopyluna.slag.content.datagen.TableCastingRecipeBuilder;
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.tags.TagKey;
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

import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.types.EOCommonRecipes.FLUID_ALLOYS;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemFluidGeOreRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemFluidRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeOutputs.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipePaths.PATH;
import static net.radzratz.eternalores.util.recipes.util.EORecipePaths.resolveRecipeId;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Tools.*;

public class EOSlagSmelteryRecipes {
    private static void smelting(RecipeOutput output, Object input, Fluid result, int rCount, String sfx) {
        if (result == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        MeltingRecipeBuilder bldr = (MeltingRecipeBuilder)
                MeltingRecipeBuilder.create(new FluidStack(result, rCount), itemTagInputs(input))
                        .unlockedBy("has_", RecipeUnlockedTrigger.unlocked(EO(PATH.SlagSmelt() + sfx)));

        bldr.save(yeet.withConditions(SLAG_MOD), EO(PATH.SlagSmelt() + sfx));
    }

    private static void smeltingCompat(RecipeOutput output, Object input, Fluid result, int rCount, String sfx) {
        if (result == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        MeltingRecipeBuilder bldr = (MeltingRecipeBuilder)
                MeltingRecipeBuilder.create(new FluidStack(result, rCount), itemTagInputs(input))
                        .unlockedBy("has_", RecipeUnlockedTrigger.unlocked(EO(PATH.SlagSmelt() + sfx)));

        bldr.save(yeet.withConditions(SLAG_MOD, GEORE_MOD), EO(PATH.SlagSmelt() + sfx));
    }

    private static void basin(RecipeOutput output, Fluid input, int iCount, Item result, String sfx) {
        if (result == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        BasinCastingRecipeBuilder bldr = (BasinCastingRecipeBuilder)
                BasinCastingRecipeBuilder.create(result, 1, input, iCount)
                        .unlockedBy("has_", RecipeUnlockedTrigger.unlocked(EO(PATH.SlagBasin() + sfx)));

        bldr.save(yeet.withConditions(SLAG_MOD), EO(PATH.SlagBasin() + sfx));
    }

    private static void table(RecipeOutput output, TagKey<Item> cast, Fluid fInput, int amount, Item result, String sfx) {
        if (result == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        TableCastingRecipeBuilder bldr = (TableCastingRecipeBuilder)
                TableCastingRecipeBuilder.create(new ItemStack(result), new FluidStack(fInput, amount), cast)
                        .unlockedBy("has_", RecipeUnlockedTrigger.unlocked(EO(PATH.SlagCasting() + sfx)));

        bldr.save(yeet.withConditions(SLAG_MOD), EO(PATH.SlagCasting() + sfx));
    }

    private static void alloying(RecipeOutput output, Fluid inputOne, int iCount, Fluid inputTwo, int iTCount, @Nullable Fluid inputThree,
                                 int iTHCount, @Nullable Fluid inputFour, int iFCount, Fluid result, int rCount, String sfx) {
        List<FluidStack> stacks = new ArrayList<>();

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        stacks.add(new FluidStack(inputOne, iCount));
        stacks.add(new FluidStack(inputTwo, iTCount));

        if (inputThree != null) {
            stacks.add(new FluidStack(inputThree, iTHCount));
        }

        if (inputFour != null) {
            stacks.add(new FluidStack(inputFour, iFCount));
        }

        AlloyingRecipeBuilder bldr = (AlloyingRecipeBuilder)
                AlloyingRecipeBuilder.create(result, rCount, stacks)
                        .unlockedBy("has_", RecipeUnlockedTrigger.unlocked(EO(PATH.SlagAlloying() + sfx)));

        bldr.save(yeet.withConditions(SLAG_MOD), EO(PATH.SlagAlloying() + sfx));
    }

    public static void generate(RecipeOutput output, Registry<Item> itemReg, Registry<Fluid> fluidReg) {
        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);
        Set<String> generatedSmelteryRecipes = new HashSet<>();

        EORecipePaths paths = new EORecipePaths("");

        Stream.of(FLUID_ALLOYS).flatMap(List::stream).forEach(r -> {
            String base = resolveRecipeId(r.grp(), paths);
            alloying(yeet, r.input(), r.inputCount(), r.inputTwo(), r.inputTwoCount(), r.inputThree(), r.inputThreeCount(), null, 0, r.result(), r.resultCount(), base + r.sfx());
        });

        itemFluidRecipeActions(itemReg, fluidReg, (item, path, mat, inp, out, id) -> {
            boolean isFours = FOURS_DUST_MATERIALS.contains(mat) && !formTypeExclusions().contains(mat);

            if (item instanceof BlockItem b && b.getBlock() instanceof EOreBlock || isVanillaBlock(inp.ORE)) {
                // ore -> molten
                if (generatedSmelteryRecipes.add("smelting_ore:" + mat) && out.MOLTEN_FLUID != null) {
                    smelting(yeet, inp.ORE, out.MOLTEN_FLUID, 96, id.OreProc());
                }
            }

            if (item instanceof BlockItem b && b.getBlock() instanceof EOBlock || isVanillaBlock(inp.STORAGE_BLOCK)) {
                // block -> molten
                if (generatedSmelteryRecipes.add("smelting_blocks:" + mat) && out.MOLTEN_FLUID != null) {
                    smelting(yeet, inp.STORAGE_BLOCK, out.MOLTEN_FLUID, isFours ? 288 : 648, id.Storage());
                }
                // molten -> block
                if (generatedSmelteryRecipes.add("casting_blocks:" + mat) && out.MOLTEN_FLUID != null && out.BLOCK != null) {
                    basin(yeet, out.MOLTEN_FLUID, isFours ? 288 : 648, out.BLOCK, id.Storage());
                }
            }

            if (item instanceof EORawMaterialItem || isVanillaRaw(inp.RAW)) {
                // raw mat -> molten
                if (generatedSmelteryRecipes.add("smelting_raw_mats:" + mat) && !mat.equals("sulfur") && out.MOLTEN_FLUID != null) {
                    smelting(yeet, inp.RAW, out.MOLTEN_FLUID, 96, id.RawProc());
                }
            }

            if (item instanceof BlockItem b && b.getBlock() instanceof EODustBlock) {
                if (generatedSmelteryRecipes.add("smelting_dust_blocks:" + mat) && out.MOLTEN_FLUID != null) {
                    smelting(yeet, inp.DUST_BLOCK, out.MOLTEN_FLUID, isFours ? 288 : 648, id.DustBlock());
                }
            }

            if (item instanceof BlockItem b && b.getBlock() instanceof EORawBlock || isVanillaRaw(inp.STORAGE_BLOCK_RAW)) {
                // raw mat block -> molten
                if (generatedSmelteryRecipes.add("smelting_raw_mat_blocks:" + mat)) {
                    smelting(yeet, inp.STORAGE_BLOCK_RAW, out.MOLTEN_FLUID, 864, id.RawProcBlock());
                }
            }

            if (item instanceof EOIngotItem || isVanillaIngot(inp.INGOT)) {
                // ingot -> molten
                if (generatedSmelteryRecipes.add("smelting_ingots:" + mat) && out.MOLTEN_FLUID != null) {
                    smelting(yeet, inp.INGOT, out.MOLTEN_FLUID, 72, id.Ingot());
                }
                // molten -> ingot
                if (generatedSmelteryRecipes.add("casting_ingots:" + mat) && out.MOLTEN_FLUID != null && out.INGOT != null) {
                    table(yeet, CASTS_INGOT, out.MOLTEN_FLUID, 72, out.INGOT, id.Ingot());
                }
            }

            if (item instanceof EOGemItem || isVanillaGem(inp.GEM)) {
                // gem -> molten
                if (generatedSmelteryRecipes.add("smelting_gems:" + mat) && out.MOLTEN_FLUID != null) {
                    smelting(yeet, inp.GEM, out.MOLTEN_FLUID, 72, id.Gem());
                }
                // molten -> gem
                if (generatedSmelteryRecipes.add("casting_gems:" + mat) && out.MOLTEN_FLUID != null  && out.GEM != null) {
                    table(yeet, CASTS_GEM, out.MOLTEN_FLUID, 72, out.GEM, id.Gem());
                }
            }

            if (item instanceof EODustItem) {
                // dust -> molten
                if (generatedSmelteryRecipes.add("smelting_dusts:" + mat) && out.MOLTEN_FLUID != null) {
                    smelting(yeet, inp.DUST, out.MOLTEN_FLUID, 72, id.Dust());
                }
            }

            if (item instanceof EOSmallDustItem) {
                // small dust -> molten
                if (generatedSmelteryRecipes.add("smelting_small_dusts:" + mat) && out.MOLTEN_FLUID != null) {
                    smelting(yeet, inp.SMALL_DUST, out.MOLTEN_FLUID, 8, id.SmallDust());
                }
            }

            if (item instanceof EONuggetItem || isVanillaNuggets(inp.NUGGET)) {
                // nugget -> molten
                if (generatedSmelteryRecipes.add("smelting_nuggets:" + mat) && out.MOLTEN_FLUID != null) {
                    smelting(yeet, inp.NUGGET, out.MOLTEN_FLUID, 8, id.Nugget());
                }
                // molten -> nugget
                if (generatedSmelteryRecipes.add("casting_nuggets:" + mat) && out.MOLTEN_FLUID != null  && out.NUGGET != null) {
                    table(yeet, CASTS_NUGGET, out.MOLTEN_FLUID, 8, out.NUGGET, id.Nugget());
                }
            }

            if (item instanceof EOGemShardItem) {
                // gem shard -> molten
                if (generatedSmelteryRecipes.add("smelting_gem_shards:" + mat) && out.MOLTEN_FLUID != null) {
                    smelting(yeet, inp.GEM_SHARDS, out.MOLTEN_FLUID,  isFours ? 16 : 8, id.Nugget());
                }
                // molten -> gem shard
                if (generatedSmelteryRecipes.add("casting_gem_shards:" + mat) && out.MOLTEN_FLUID != null  && out.GEM_SHARD != null) {
                    table(yeet, CASTS_NUGGET, out.MOLTEN_FLUID, isFours ? 16 : 8, out.GEM_SHARD, id.Nugget());
                }
            }

            if (item instanceof EORodItem) {
                // rod -> molten
                if (generatedSmelteryRecipes.add("smelting_rods:" + mat) && out.MOLTEN_FLUID != null) {
                    smelting(yeet, inp.ROD, out.MOLTEN_FLUID, 72, id.Rod());
                }
                // molten -> rod
                if (generatedSmelteryRecipes.add("casting_rods:" + mat) && out.MOLTEN_FLUID != null && out.ROD != null) {
                    table(yeet, CASTS_ROD, out.MOLTEN_FLUID, 144, out.ROD, id.Rod());
                }
            }

            if (item instanceof EOPlateItem) {
                // plate -> molten
                if (generatedSmelteryRecipes.add("smelting_plates:" + mat) && out.MOLTEN_FLUID != null) {
                    smelting(yeet, inp.PLATE, out.MOLTEN_FLUID, 72, id.Plate());
                }
                // molten -> plate
                if (generatedSmelteryRecipes.add("casting_plates:" + mat) && out.MOLTEN_FLUID != null  && out.PLATE != null) {
                    table(yeet, CASTS_PLATE, out.MOLTEN_FLUID, 144, out.PLATE, id.Plate());
                }
            }

            if (item instanceof EOFoilItem) {
                // plate -> molten
                if (generatedSmelteryRecipes.add("smelting_foils:" + mat) && out.MOLTEN_FLUID != null) {
                    smelting(yeet, inp.FOIL, out.MOLTEN_FLUID, 72, id.Foil());
                }
                // molten -> plate
                if (generatedSmelteryRecipes.add("casting_foils:" + mat) && out.MOLTEN_FLUID != null  && out.FOIL != null) {
                    table(yeet, CASTS_FOIL, out.MOLTEN_FLUID, 144, out.FOIL, id.Foil());
                }
            }

            if (item instanceof EOGearItem) {
                // gear -> molten
                if (generatedSmelteryRecipes.add("smelting_gears:" + mat) && out.MOLTEN_FLUID != null) {
                    smelting(yeet, inp.GEAR, out.MOLTEN_FLUID, 388, id.Gear());
                }
                // molten -> gear
                if (generatedSmelteryRecipes.add("casting_gears:" + mat) && out.MOLTEN_FLUID != null  && out.GEAR != null) {
                    table(yeet, CASTS_GEAR, out.MOLTEN_FLUID, 388, out.GEAR, id.Gear());
                }
            }
        });

        itemFluidGeOreRecipeActions(itemReg, fluidReg, (item, path, mat, inp, out, id) -> {
            if (item instanceof GEOreShardItem) {
                // geore shard -> molten
                if (generatedSmelteryRecipes.add("smelting_geore_shards:" + mat) && out.MOLTEN_FLUID != null) {
                    smeltingCompat(yeet, inp.GEOSHARDS, out.MOLTEN_FLUID, 162, id.Geo() + "_shard");
                }
            }

            if (item instanceof BlockItem b && b.getBlock() instanceof GEOreShardBlock) {
                // geore block -> molten
                if (generatedSmelteryRecipes.add("smelting_geore_blocks:" + mat) && out.MOLTEN_FLUID != null) {
                    smeltingCompat(yeet, inp.GEOSHARD_BLOCKS, out.MOLTEN_FLUID, 648, id.Geo() + "_block");
                }
            }
        });
    }
}
