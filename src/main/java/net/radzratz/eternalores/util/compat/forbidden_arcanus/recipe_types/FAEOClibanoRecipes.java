package net.radzratz.eternalores.util.compat.forbidden_arcanus.recipe_types;

import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.stal111.forbidden_arcanus.common.item.enhancer.EnhancerDefinition;
import com.stal111.forbidden_arcanus.core.registry.FARegistries;
import com.stal111.forbidden_arcanus.data.enhancer.ModEnhancerDefinitions;
import com.stal111.forbidden_arcanus.data.recipes.builder.ClibanoRecipeBuilder;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.radzratz.eternalores.block.types.EORawBlock;
import net.radzratz.eternalores.block.types.EOreBlock;
import net.radzratz.eternalores.item.types.EOIngotItem;
import net.radzratz.eternalores.item.types.EOrGemItem;
import net.radzratz.eternalores.util.recipes.types.EOCommonRecipes;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.item.types.EORawMaterialItem;
import net.radzratz.eternalores.util.recipes.util.EORecipeOutputs;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.concurrent.CompletableFuture;

import static net.radzratz.eternalores.util.EOMaterials.materialSets.SULFUR_SET;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.itemTagInputs;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.isVanillaRawBlock;

public class FAEOClibanoRecipes extends RecipeProvider {
    public FAEOClibanoRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    private static void clibano(RecipeOutput output, HolderLookup.Provider lookupProvider, Object inp, @Nullable Object inpT, Item rlt, int rCnt, float exp, int time, String sfx) {
        if (rlt == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);
        EORecipePaths id = new EORecipePaths("");

        ClibanoRecipeBuilder bldr;

        HolderLookup.RegistryLookup<EnhancerDefinition> enhancerLookup =
                lookupProvider.lookupOrThrow(FARegistries.ENHANCER_DEFINITION);
        Holder<EnhancerDefinition> artisanRelic =
                enhancerLookup.getOrThrow(ModEnhancerDefinitions.ARTISAN_RELIC);

        if (inpT == null) {
            bldr = new ClibanoRecipeBuilder(RecipeCategory.MISC, CookingBookCategory.MISC, new ItemStack(rlt, rCnt), Either.left(itemTagInputs(inp)), exp, time);
        } else {
            Either<Ingredient, Pair<Ingredient, Ingredient>> ingredients = Either.right(Pair.of(itemTagInputs(inp), itemTagInputs(inpT)));

            bldr = new ClibanoRecipeBuilder(RecipeCategory.MISC, CookingBookCategory.MISC, new ItemStack(rlt, rCnt), ingredients, exp, time).enhancer(artisanRelic);
        }

        bldr.unlockedBy("has_" + rlt, has(rlt));

        bldr.save(yeet.withConditions(FORBIDDEN_ARCANUS_MOD), EO(id.FAClibano() + sfx));
    }

    public static void generate(RecipeOutput output, Registry<Item> reg, HolderLookup.Provider lookupProvider) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);
        Set<String> generatedClibanoRecipes = new HashSet<>();

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            if (EORecipeOutputs.furnaceExclusions().contains(mat)) return;

            if (item instanceof EORawMaterialItem) {
                if (generatedClibanoRecipes.add("forbidden_raw_smelting:" + mat) && out.INGOT != null) {
                    clibano(yeet, lookupProvider, inp.RAW, null, out.INGOT, 1, 0.9f, 100, id.Raw());
                }
            }

            if (item instanceof BlockItem b && b.getBlock() instanceof EORawBlock || isVanillaRawBlock(inp.RAW_BLOCK_CASE)) {
                if (generatedClibanoRecipes.add("forbidden_raw_block_smelting:" + mat) && out.BLOCK != null) {
                    clibano(yeet, lookupProvider, inp.RAW_BLOCK_CASE, null, out.BLOCK, 1, 0.9f, 100, id.RawBlock());
                }
            }

            // Ore Smelt
            if (item instanceof BlockItem b && b.getBlock() instanceof EOreBlock) {
                if (generatedClibanoRecipes.add("forbidden_ore_smelting:" + mat)) {
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

                    clibano(yeet, lookupProvider, inp.ORE, null, result, 1, 1.2f, 100, id.Smelt());
                }
            }


            if (item instanceof EOIngotItem) {
                for (EOCommonRecipes.Alloys r : EOCommonRecipes.ALLOYS) {
                    if (generatedClibanoRecipes.add("alloy:" + r.sfx()) && r.input() != null && r.inputTwo() != null) {
                        clibano(yeet, lookupProvider, r.input(), r.inputTwo(), r.result(), r.resultCount(), 1.5f, 50, "alloys/" + r.sfx());
                    }
                }
            }

            if (item instanceof EOrGemItem) {
                if (generatedClibanoRecipes.add("forbidden_ore_gem_alloy:" + mat) && out.DUST_INGOT != null) {
                    clibano(yeet, lookupProvider, inp.ORE_GEM, inp.ORE_GEM, out.DUST_INGOT, 3, 1.0f, 100, id.OreGem());
                }
            }
        });
    }
}
