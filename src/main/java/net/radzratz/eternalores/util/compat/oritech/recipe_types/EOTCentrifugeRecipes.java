package net.radzratz.eternalores.util.compat.oritech.recipe_types;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.Fluid;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.item.types.EOClumpItem;
import net.radzratz.eternalores.item.types.EODirtyDustItem;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;
import org.jetbrains.annotations.Nullable;
import rearth.oritech.api.recipe.CentrifugeFluidRecipeBuilder;
import rearth.oritech.api.recipe.CentrifugeRecipeBuilder;

import java.util.*;

import static net.minecraft.tags.FluidTags.WATER;
import static net.neoforged.neoforge.common.Tags.Items.DUSTS_REDSTONE;
import static net.radzratz.eternalores.util.EOMaterials.materialSets.*;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.itemTagInputs;
import static rearth.oritech.init.FluidContent.STILL_MINERAL_SLURRY;

public class EOTCentrifugeRecipes {
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

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Set<String> generatedCentrifugeRecipes = new HashSet<>();

        EORecipePaths paths = new EORecipePaths("");

        ctrfg(yeet, DUSTS_REDSTONE, URANIUM_SET.SMALL_DUST.get(), 1, null, 0, paths.SmallDust() + "uranium");

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            TagKey<Fluid> acid = TagKey.create(Registries.FLUID, C("sulfuric_acid"));

            if (item instanceof EODirtyDustItem) {
                if (generatedCentrifugeRecipes.add("dirty_dust:" + mat) && out.DUST != null) {
                    ctrfg(yeet, inp.DIRTY_DUST, out.DUST, 1, STONE_SET.SMALL_DUST.get(), 2, id.DirtyDust());
                }
            }

            if (item instanceof EOClumpItem) {
                if (generatedCentrifugeRecipes.add("ore_clump:" + mat) && out.ORE_GEM != null && out.SMALL_DUST != null) {
                    ctrfg(yeet, inp.CLUMP, out.ORE_GEM, 1, out.SMALL_DUST, 1, id.OreGem());
                }

                if (generatedCentrifugeRecipes.add("ore_clump_fluids:" + mat) && out.ORE_GEM != null) {
                    ctrfg(yeet, inp.CLUMP, WATER, 1.0f, out.ORE_GEM, 2, null, 0, null, 0, id.OreGem() + "_water");
                    ctrfg(yeet, inp.CLUMP, acid, 1.0f, out.ORE_GEM, 3, null, 0, STILL_MINERAL_SLURRY.get(), 0.25f, id.OreGem() + "_acid");
                }
            }
        });
    }
}
