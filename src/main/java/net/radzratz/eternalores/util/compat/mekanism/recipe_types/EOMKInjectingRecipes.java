package net.radzratz.eternalores.util.compat.mekanism.recipe_types;

import mekanism.api.datagen.recipe.builder.ItemStackChemicalToItemStackRecipeBuilder;
import mekanism.api.recipes.ingredients.ChemicalStackIngredient;
import mekanism.api.recipes.ingredients.ItemStackIngredient;
import mekanism.api.recipes.ingredients.creator.IngredientCreatorAccess;
import mekanism.common.registration.impl.DeferredChemical;
import net.minecraft.core.Registry;

import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.radzratz.eternalores.block.types.EORawBlock;
import net.radzratz.eternalores.block.types.EOreBlock;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.item.types.EORawMaterialItem;
import net.radzratz.eternalores.item.types.EOCrystalItem;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;

import java.util.HashSet;
import java.util.Set;

import static mekanism.common.registries.MekanismChemicals.HYDROGEN_CHLORIDE;
import static mekanism.common.registries.MekanismChemicals.WATER_VAPOR;
import static net.radzratz.eternalores.util.EOMaterials.materialSets.CLAY_SET;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Dusts.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.SmallDusts.SMALL_DUSTS_BRICK;

public class EOMKInjectingRecipes {

    public static void injecting(RecipeOutput output, Object inp, int iCnt, DeferredChemical<?> iCh, long iChCnt, Item rlt, int rCnt, String sfx) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);
        EORecipePaths id = new EORecipePaths("");

        ItemStackIngredient inpT = IngredientCreatorAccess.item().from(itemTagInputs(inp), iCnt);
        ChemicalStackIngredient chInp = IngredientCreatorAccess.chemicalStack().fromHolder(iCh, iChCnt);
        var rlts = new ItemStack(rlt, rCnt);

        ItemStackChemicalToItemStackRecipeBuilder.injecting(inpT, chInp, rlts, true).addCondition(MEKANISM_MOD).build(yeet, EO(id.MInjecting() + sfx));
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Set<String> generateInjectingRecipes = new HashSet<>();

        injecting(yeet, DUSTS_BRICK, 1, WATER_VAPOR, 1, CLAY_SET.DUST.get(), 1, "materials/clay");
        injecting(yeet, SMALL_DUSTS_BRICK, 9, WATER_VAPOR, 1, CLAY_SET.SMALL_DUST.get(), 9, "materials/clay_var");

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            // Crystal -> Shard
            if (item instanceof EOCrystalItem) {
                if (generateInjectingRecipes.add("crystal:" + mat) && out.SHARD != null) {
                    injecting(yeet, inp.CRYSTAL, 1, HYDROGEN_CHLORIDE, 1, out.SHARD, 1, id.Crystal());
                }
            }

            // Raw Material -> 8x Shard
            if (item instanceof EORawMaterialItem || isVanillaRaw(inp.RAW)) {
                if (generateInjectingRecipes.add("raw:" + mat) && out.SHARD != null) {
                    injecting(yeet, inp.RAW, 3, HYDROGEN_CHLORIDE, 1, out.SHARD, 8, id.RawProc());
                }
            }

            // Ore Block -> 4x Shard
            if (item instanceof BlockItem b && b.getBlock() instanceof EOreBlock || isVanillaMetalOre(inp.ORE)) {
                if (generateInjectingRecipes.add("ore:" + mat) && out.SHARD != null) {
                    injecting(yeet, inp.ORE, 1, HYDROGEN_CHLORIDE, 1, out.SHARD, 4, id.OreProc());
                }
            }

            // Raw Block -> 24x Shard
            if (item instanceof BlockItem b && b.getBlock() instanceof EORawBlock || isVanillaRawBlock(inp.STORAGE_BLOCK_RAW)) {
                if (generateInjectingRecipes.add("raw_block:" + mat) && out.SHARD != null) {
                    injecting(yeet, inp.STORAGE_BLOCK_RAW, 1, HYDROGEN_CHLORIDE, 2, out.SHARD, 24, id.RawProcBlock());
                }
            }
        });
    }
}
