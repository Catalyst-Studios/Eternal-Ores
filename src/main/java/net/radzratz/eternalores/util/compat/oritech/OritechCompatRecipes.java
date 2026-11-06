package net.radzratz.eternalores.util.compat.oritech;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.Fluid;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.block.types.EODustBlock;
import net.radzratz.eternalores.block.types.EOreBlock;
import net.radzratz.eternalores.item.types.*;
import net.radzratz.eternalores.util.recipes.types.EOCommonRecipes;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;
import org.jetbrains.annotations.Nullable;
import rearth.oritech.api.recipe.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static net.minecraft.tags.FluidTags.WATER;
import static net.minecraft.world.level.material.Fluids.LAVA;
import static net.neoforged.neoforge.common.Tags.Items.*;
import static net.radzratz.eternalores.util.EOMaterials.materialSets.*;
import static net.radzratz.eternalores.util.EOMaterials.materialSets.END_STONE_SET;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.types.EOCommonRecipes.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.isVanillaOre;
import static net.radzratz.eternalores.util.recipes.util.EORecipeOutputs.crushingExclusions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeOutputs.formTypeExclusions;
import static net.radzratz.eternalores.util.recipes.util.EORecipePaths.resolveRecipeId;
import static rearth.oritech.init.FluidContent.STILL_MINERAL_SLURRY;
import static rearth.oritech.init.FluidContent.STILL_SHEOL_FIRE;
import static rearth.oritech.init.ItemContent.ENDERIC_COMPOUND;

public class OritechCompatRecipes {
    private static final TagKey<Item> FLUXITE_TAG = TagKey.create(Registries.ITEM, C("gems/fluxite"));

    public static void forge(RecipeOutput output, Object mInp, Object sInp, Item rlt, int rCnt, String sfx) {
        if (rlt == null || mInp == null) return;

        RecipeOutput yeet = new EOAdvancementYeeter(output);

        AtomicForgeRecipeBuilder builder = (AtomicForgeRecipeBuilder)
                AtomicForgeRecipeBuilder.build()
                        .input(itemTagInputs(mInp))
                        .input(itemTagInputs(sInp))
                        .input(itemTagInputs(sInp))
                        .time(20)
                        .result(rlt, rCnt);

        builder.export(yeet.withConditions(ORITECH_MOD), sfx, EternalOres.id);
    }

    public static void ctrfg(RecipeOutput output, Object inp, Item rlt, int rCnt, @Nullable Item bRlt, int bCnt, String sfx) {
        if (inp == null || rlt == null) return;

        RecipeOutput yeet = new EOAdvancementYeeter(output);

        CentrifugeRecipeBuilder bldr = (CentrifugeRecipeBuilder)
                CentrifugeRecipeBuilder.build().input(itemTagInputs(inp));

        bldr.result(rlt, rCnt);

        if (bRlt != null && bCnt > 0) {
            bldr.result(bRlt, bCnt);
        }

        bldr.export(yeet.withConditions(ORITECH_MOD), sfx, EternalOres.id);
    }

    public static void ctrfg(RecipeOutput output, Object inp, @Nullable TagKey<Fluid> fInp, float fInpCnt, Item rlt, int rCnt, @Nullable Item bRlt,
                             int bCnt, @Nullable Fluid fRlt, float fRltCnt, String sfx) {
        if (inp == null || rlt == null) return;

        RecipeOutput yeet = new EOAdvancementYeeter(output);

        CentrifugeFluidRecipeBuilder bldr = (CentrifugeFluidRecipeBuilder)
                CentrifugeFluidRecipeBuilder.build().input(itemTagInputs(inp));

        if (fInp != null && fInpCnt > 0) {
            bldr.fluidInput(fInp, fInpCnt);
        }

        bldr.result(rlt, rCnt);

        if (bRlt != null && bCnt > 0) {
            bldr.result(bRlt, bCnt);
        }

        if (fRlt != null && fRltCnt > 0) {
            bldr.fluidOutput(fRlt, fRltCnt);
        }

        bldr.export(yeet.withConditions(ORITECH_MOD), sfx, EternalOres.id);
    }

    public static void alloy(RecipeOutput output, Object inp, Object inpO, Item rlt, int rCnt, String sfx) {
        if (rlt == null || inp == null || inpO == null) return;

        RecipeOutput yeet = new EOAdvancementYeeter(output);

        FoundryRecipeBuilder bldr = (FoundryRecipeBuilder)
                FoundryRecipeBuilder.build()
                        .input(itemTagInputs(inp))
                        .input(itemTagInputs(inpO))
                        .result(rlt, rCnt);

        bldr.export(yeet.withConditions(ORITECH_MOD), sfx, EternalOres.id);
    }

    public static void refine(RecipeOutput output, Object inp, Fluid fInp, float fCnt, Item rlt, int rCnt, Fluid fRlt, float fRltCnt, String sfx) {
        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        RefineryRecipeBuilder bldr = (RefineryRecipeBuilder)
                RefineryRecipeBuilder.build()
                        .input(itemTagInputs(inp))
                        .fluidInput(fInp, fCnt)
                        .result(rlt, rCnt)
                        .fluidOutput(fRlt, fRltCnt);

        bldr.export(yeet.withConditions(ORITECH_MOD), sfx, EternalOres.id);
    }

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

        bldr.export(yeet.withConditions(ORITECH_MOD), sfx, EternalOres.id);
    }

    public static void pulverize(RecipeOutput output, Object inp, Item rlt, int rCnt, @Nullable Item bRlt, int bRCnt, String sfx) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        PulverizerRecipeBuilder bldr = (PulverizerRecipeBuilder)
                PulverizerRecipeBuilder.build()
                        .input(itemTagInputs(inp))
                        .result(rlt, rCnt);

        if (bRlt != null) {
            bldr.result(bRlt, bRCnt);
        }

        bldr.export(yeet.withConditions(ORITECH_MOD), sfx, EternalOres.id);
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Set<String> generatedOritechRecipes = new HashSet<>();

        EORecipePaths paths = new EORecipePaths("");

        // Atomic Forge
        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            if (item instanceof EOrGemItem) {
                if (generatedOritechRecipes.add("ori_forge_ore_gems:" + mat) && out.DUST != null) {
                    forge(yeet, inp.ORE_GEM, FLUXITE_TAG, out.DUST, 2, id.Dust());
                }
            }
        });

        // Centrifuge
        ctrfg(yeet, DUSTS_REDSTONE, URANIUM_SET.SMALL_DUST.get(), 1, null, 0, paths.SmallDust() + "uranium");

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            TagKey<Fluid> acid = TagKey.create(Registries.FLUID, C("sulfuric_acid"));

            if (item instanceof EODirtyDustItem) {
                if (generatedOritechRecipes.add("ori_centri_dirty_dust:" + mat) && out.DUST != null) {
                    ctrfg(yeet, inp.DIRTY_DUST, out.DUST, 1, STONE_SET.SMALL_DUST.get(), 2, id.DirtyDust());
                }
            }

            if (item instanceof EOClumpItem) {
                if (generatedOritechRecipes.add("ori_centri_ore_clump:" + mat) && out.ORE_GEM != null && out.SMALL_DUST != null) {
                    ctrfg(yeet, inp.CLUMP, out.ORE_GEM, 1, out.SMALL_DUST, 1, id.OreGem());
                }

                if (generatedOritechRecipes.add("ori_centri_ore_clump_fluids:" + mat) && out.ORE_GEM != null) {
                    ctrfg(yeet, inp.CLUMP, WATER, 1.0f, out.ORE_GEM, 2, null, 0, null, 0, id.OreGem() + "_water");
                    ctrfg(yeet, inp.CLUMP, acid, 1.0f, out.ORE_GEM, 3, null, 0, STILL_MINERAL_SLURRY.get(), 0.25f, id.OreGem() + "_acid");
                }
            }
        });

        // Foundry
        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            // Ore Gem -> Ingot / Dust
            if (item instanceof EOrGemItem) {
                if (generatedOritechRecipes.add("ori_foundry_gem:" + mat) && out.DUST_INGOT != null) {
                    alloy(yeet, inp.ORE_GEM, inp.ORE_GEM, out.DUST_INGOT, 3, id.OreGem());
                }
            }

            // Alloys
            if (item instanceof EOIngotItem) {
                for (EOCommonRecipes.Alloys r : EOCommonRecipes.ALLOYS) {
                    if (!r.sfx().startsWith(mat)) continue;
                    if (generatedOritechRecipes.add("ori_foundry_alloy:" + r.sfx()) && r.input() != null && r.inputTwo() != null && r.result() != null) {
                        alloy(yeet, r.input(), r.inputTwo(), r.result(), 1, "alloys/" + r.sfx());
                    }
                }
            }
        });

        // Refinery
        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            if (item instanceof EOClumpItem) {
                if (generatedOritechRecipes.add("ori_refine_raw:" + mat) && out.CLUMP != null) {
                    refine(yeet, inp.RAW, STILL_SHEOL_FIRE.get(), 0.250f, out.CLUMP, 2, LAVA, 0.100f, "rawsheol/" + mat);
                }
            }
        });

        // Fragment Forge - Grinder (they're the same tbh)
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
                if (generatedOritechRecipes.add("ori_grinder_dusts_ingot:" + mat) && out.DUST != null) {
                    grinder(yeet, inp.INGOT, out.DUST, 1, null, 0, null, 0, id.Dust());
                }
            }

            // Gem -> Dust
            if (item instanceof EOGemItem || isVanillaGem(inp.GEM)) {
                if (generatedOritechRecipes.add("ori_grinder_dusts_gem:" + mat) && out.DUST != null) {
                    grinder(yeet, inp.GEM, out.DUST, 1, null, 0, null, 0, id.Dust());
                }
            }

            // Material Block -> Dust Block
            if (item instanceof BlockItem b && b.getBlock() instanceof EODustBlock || isVanillaBlock(inp.STORAGE_BLOCK)) {
                if (generatedOritechRecipes.add("ori_grinder_dusts_block:" + mat) && !crushingExclusions().contains(mat) && !formTypeExclusions().contains(mat) && out.DUST_BLOCK != null) {
                    grinder(yeet, inp.STORAGE_BLOCK, out.DUST_BLOCK, 1, null, 0, null, 0, id.DustBlock());
                }
            }

            // Nugget -> Small Dust
            if (item instanceof EONuggetItem) {
                if (generatedOritechRecipes.add("ori_grinder_dusts_small:" + mat) && out.SMALL_DUST != null) {
                    grinder(yeet, inp.NUGGET, out.SMALL_DUST, 1, null, 0, null, 0, id.SmallDust());
                }
            }

            // Gem Shard -> Small Dust
            if (item instanceof EOGemShardItem) {
                if (generatedOritechRecipes.add("ori_grinder_dusts_small_gem:" + mat) && out.SMALL_DUST != null) {
                    grinder(yeet, inp.GEM_SHARDS, out.SMALL_DUST, 1, null, 0, null, 0, id.SmallDust());
                }
            }

            // Raw Material -> Clump/Small Clump/Byproduct
            if (item instanceof EORawMaterialItem || isVanillaRaw(inp.RAW)) {
                if (generatedOritechRecipes.add("ori_grinder__raw:" + mat) && !mat.equals("sulfur") && found != null && found.byproductSmallClump() != null) {
                    grinder(yeet, inp.RAW, out.CLUMP, 1, out.SMALL_CLUMP, 3, found.byproductSmallClump(), 3, id.OreProc());
                }
            }

            if (item instanceof EOCoalItem) {
                if (generatedOritechRecipes.add("ori_grinder_dusts_coal:" + mat) && out.DUST != null) {
                    grinder(yeet, inp.COALS, out.DUST, 1, null, 0, null, 0, id.Dust());
                }
            }

            // Ore -> Material/Byproduct/Extra
            if (item instanceof BlockItem b && b.getBlock() instanceof EOreBlock || isVanillaOre(inp.ORE)) {
                if (generatedOritechRecipes.add("ori_grinder_ore_block:" + mat) && found != null && found.primary() != null && found.byproduct() != null) {
                    grinder(yeet, inp.ORE, found.primary(), found.primaryCount(), found.byproduct(), found.byproductCount(), null, 0, id.Ore());
                }
            }
        });

        // Pulverizer
        pulverize(yeet, ENDER_PEARLS, ENDERIC_COMPOUND.asItem(), 8, ENDER_PEARL_SET.DUST.get(), 1, paths.Dust() + "ender");

        Stream.of(BASIC_CRUSHING).flatMap(List::stream).forEach(r -> {
            String base = resolveRecipeId(r.grp(), paths);

            if (r.input().equals(ENDER_PEARLS)) return;

            pulverize(yeet, r.input(), r.result(), r.resultCount(), r.byproduct(), r.byproductCount(), base + r.sfx());
        });

        Stream.of(BIO_FUEL_BASIC).flatMap(List::stream).forEach(r -> {
            String base = resolveRecipeId(r.grp(), paths);
            pulverize(yeet, r.input(), r.result(), r.resultCount(), r.byproduct(), r.byproductCount(), base + r.sfx());
        });

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            EOCommonRecipes.OreProcessing found = ORE_PROCESSING.stream()
                    .filter(r -> r.sfx().equals(mat))
                    .findFirst()
                    .orElse(null);


            // Ingot -> Dust
            if (item instanceof EOIngotItem || isVanillaIngot(inp.INGOT)) {
                if (generatedOritechRecipes.add("ori_pulv_dusts_ingot:" + mat) && out.DUST != null) {
                    pulverize(yeet, inp.INGOT, out.DUST, 1, null, 0, id.Dust());
                }
            }

            // Gem -> Dust
            if (item instanceof EOGemItem || isVanillaGem(inp.GEM)) {
                if (generatedOritechRecipes.add("ori_pulv_dusts_gem:" + mat) && out.DUST != null) {
                    pulverize(yeet, inp.GEM, out.DUST, 1, null, 0, id.Dust());
                }
            }

            // Coal -> Dust
            if (item instanceof EOCoalItem) {
                if (generatedOritechRecipes.add("ori_pulv_coal:" + mat) && out.DUST != null) {
                    pulverize(yeet, inp.COALS, out.DUST, 1, null, 0, id.Dust());
                }
            }

            // Material Block -> Dust Block
            if (item instanceof BlockItem b && b.getBlock() instanceof EODustBlock || isVanillaBlock(inp.STORAGE_BLOCK)) {
                if (generatedOritechRecipes.add("ori_pulv_dust_block:" + mat) && !crushingExclusions().contains(mat) && !formTypeExclusions().contains(mat) && out.DUST_BLOCK != null) {
                    pulverize(yeet, inp.STORAGE_BLOCK, out.DUST_BLOCK, 1, null, 0, id.DustBlock());
                }
            }

            // Nugget -> Small Dust
            if (item instanceof EONuggetItem) {
                if (generatedOritechRecipes.add("ori_pulv_dusts_small:" + mat) && out.SMALL_DUST != null) {
                    pulverize(yeet, inp.NUGGET, out.SMALL_DUST, 1, null, 0, id.SmallDust());
                }
            }

            // Nugget -> Small Dust
            if (item instanceof EOGemShardItem) {
                if (generatedOritechRecipes.add("ori_pulv_dusts_small_gem:" + mat) && out.SMALL_DUST != null) {
                    pulverize(yeet, inp.GEM_SHARDS, out.SMALL_DUST, 1, null, 0, id.SmallDust());
                }
            }

            // Clump -> Dirty Dust
            if (item instanceof EOClumpItem) {
                if (generatedOritechRecipes.add("ori_pulv_clump_dirty:" + mat) && out.DIRTY_DUST != null) {
                    pulverize(yeet, inp.CLUMP, out.DIRTY_DUST, 1, STONE_SET.SMALL_DUST.get(), 3, id.DirtyDust());
                }
            }

            // Raw Material -> Dust/Byproduct
            if (item instanceof EORawMaterialItem || isVanillaRaw(inp.RAW)) {
                if (generatedOritechRecipes.add("ori_pulv_raw_material:" + mat) && !mat.equals("sulfur") && out.DUST != null && out.SMALL_DUST != null) {
                    pulverize(yeet, inp.RAW, out.DUST, 1, out.SMALL_DUST, 3, id.RawProc());
                }
            }

            // Ore Block -> Material
            if (item instanceof BlockItem oreBlocks && oreBlocks.getBlock() instanceof EOreBlock || isVanillaOre(inp.ORE)) {
                if (generatedOritechRecipes.add("ori_pulv_processing" + mat) && found != null && found.primary() != null && found.byproduct() != null) {
                    pulverize(yeet, inp.ORE, found.primary(), found.primaryCount(), null, 0, id.OreProc());
                }
            }
        });
    }
}
