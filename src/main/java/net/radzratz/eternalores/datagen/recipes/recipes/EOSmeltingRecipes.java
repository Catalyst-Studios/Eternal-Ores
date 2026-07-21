package net.radzratz.eternalores.datagen.recipes.recipes;

import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.radzratz.eternalores.block.types.EODustBlock;
import net.radzratz.eternalores.block.types.EORawBlock;
import net.radzratz.eternalores.block.types.EOreBlock;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.item.types.EOIngotItem;
import net.radzratz.eternalores.item.types.EORawMaterialItem;
import net.radzratz.eternalores.item.types.EOClumpItem;
import net.radzratz.eternalores.item.types.EOSmallDustItem;
import net.radzratz.eternalores.item.types.EOrGemItem;
import net.radzratz.eternalores.util.recipes.util.EORecipeOutputs;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

import static net.radzratz.eternalores.util.EOMaterials.materialSets.*;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.types.EOCommonRecipes.SMELTABLES;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.isVanillaRawBlock;
import static net.radzratz.eternalores.util.recipes.util.EORecipeOutputs.dustBlockExclusions;
import static net.radzratz.eternalores.util.recipes.util.EORecipePaths.resolveRecipeId;

public class EOSmeltingRecipes extends RecipeProvider {
    public EOSmeltingRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    public static void furnaceAndBlasting(RecipeOutput output, TagKey<Item> inp, Item rlt, float xpS, float xpB, int tS, int tB, String sfx) {
        // WHY IS THIS A THING??
        String unlockName = "has_" + inp.location().getPath().replace('/', '_');

        RecipeOutput yeet = new EOAdvancementYeeter(output);
        EORecipePaths id = new EORecipePaths("");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(inp), RecipeCategory.MISC, rlt, xpS, tS)
                .unlockedBy(unlockName, inventoryTrigger(ItemPredicate.Builder.item().of(inp).build()))
                .save(yeet, EO(id.Furnace() + sfx + "_smelt"));

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(inp), RecipeCategory.MISC, rlt, xpB, tB)
                .unlockedBy(unlockName, inventoryTrigger(ItemPredicate.Builder.item().of(inp).build()))
                .save(yeet, EO(id.Furnace() + sfx + "_blast"));
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Set<String> generatedFurnaceRecipes = new HashSet<>();

        EORecipePaths paths = new EORecipePaths("");

        Stream.of(SMELTABLES).flatMap(List::stream).forEach(r -> {
            String base = resolveRecipeId(r.grp(), paths);
            furnaceAndBlasting(yeet, r.input(), r.result(), 0.3f, 0.5f, 200, 100, base + r.sfx());
        });

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            // Ignores excluded materials
            if (EORecipeOutputs.furnaceExclusions().contains(mat)) return;

            // Raw Material -> Ingot
            if (item instanceof EORawMaterialItem) {
                if (generatedFurnaceRecipes.add("raw:" + mat) && out.INGOT != null) {
                    furnaceAndBlasting(yeet, inp.RAW, out.INGOT, 0.5f, 0.8f, 200, 100, id.Raw());
                }
            }

            // Dust -> Ingot (gems not included anymore)
            if (item instanceof EOIngotItem) {
                if (generatedFurnaceRecipes.add("dust:" + mat) && !mat.contains("missing") && out.INGOT != null) {
                    furnaceAndBlasting(yeet, inp.DUST, out.INGOT, 0.7f, 1.0f, 200, 100, id.Dust());
                }
            }

            // Small Dust -> Output
            if (item instanceof EOSmallDustItem) {
                if (generatedFurnaceRecipes.add("small_dust:" + mat) && out.NUGGET != null) {
                    furnaceAndBlasting(yeet, inp.SMALL_DUST, out.NUGGET, 0.3f, 0.6f, 100, 50, id.SmallDust());
                }
            }

            // Ore Gem -> Dust/Ingot
            if (item instanceof EOrGemItem) {
                if (generatedFurnaceRecipes.add("ore_gem:" + mat) && out.DUST_INGOT != null) {
                    furnaceAndBlasting(yeet, inp.ORE_GEM, out.DUST_INGOT, 1.0f, 1.5f, 300, 150, id.OreGem());
                }
            }

            // Clump -> Dust/Ingot
            if (item instanceof EOClumpItem) {
                if (generatedFurnaceRecipes.add("clump:" + mat) && out.DUST_INGOT != null) {
                    furnaceAndBlasting(yeet, inp.CLUMP, out.DUST_INGOT, 1.0f, 1.5f, 300, 150, id.Clump());
                }
            }

            // Dust Block -> Block
            if (item instanceof BlockItem b && b.getBlock() instanceof EODustBlock) {
                if (generatedFurnaceRecipes.add("dust_block:" + mat) && !dustBlockExclusions().contains(mat) && !mat.equals("silicon") && out.BLOCK != null) {
                    furnaceAndBlasting(yeet, inp.DUST_BLOCK, out.BLOCK, 1.0f, 1.5f, 300, 150, id.DustBlock());
                }
            }

            // Raw Block -> Block
            if (item instanceof BlockItem b && b.getBlock() instanceof EORawBlock || isVanillaRawBlock(inp.STORAGE_BLOCK_RAW)) {
                if (generatedFurnaceRecipes.add("raw_block:" + mat) && !mat.contains("sulfur") && !mat.contains("catalyrium") && !mat.contains("vanadium") && out.BLOCK != null) {
                    furnaceAndBlasting(yeet, inp.STORAGE_BLOCK_RAW, out.BLOCK, 1.0f, 1.5f, 300, 150, id.RawBlock());
                }
            }

            // Ore Block -> Output (gem / ingot / sulfur)
            if (item instanceof BlockItem b && b.getBlock() instanceof EOreBlock) {
                if (generatedFurnaceRecipes.add("ores:" + mat)) {
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

                    furnaceAndBlasting(yeet, inp.ORE, result, 1.0f, 1.5f, 300, 150, id.Ore());
                }
            }
        });
    }
}
