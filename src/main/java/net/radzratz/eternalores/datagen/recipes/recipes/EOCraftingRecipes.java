package net.radzratz.eternalores.datagen.recipes.recipes;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.block.types.EOCoalBlock;
import net.radzratz.eternalores.block.types.EODustBlock;
import net.radzratz.eternalores.block.types.EOStorageBlock;
import net.radzratz.eternalores.block.types.EOreBlock;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.item.types.*;
import net.radzratz.eternalores.item.types.EOSmallDustItem;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

import static net.radzratz.eternalores.util.EOMaterials.materialPrefixSuffixes.*;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeOutputs.formTypeExclusions;
import static net.radzratz.eternalores.util.recipes.types.EOCommonRecipes.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipePaths.resolveRecipeId;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Tools.*;

public class EOCraftingRecipes extends RecipeProvider {
    public EOCraftingRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    public static void shapeless(RecipeOutput output, Object inp, @Nullable Object oInp, Item rlt, int rCnt, String sfx) {
        if (rlt == null) return;

        RecipeOutput yeet = new EOAdvancementYeeter(output);
        EORecipePaths id = new EORecipePaths("");

        ShapelessRecipeBuilder builder = ShapelessRecipeBuilder
                .shapeless(RecipeCategory.MISC, rlt, rCnt)
                .unlockedBy("has_" + rlt, has(rlt));

        builder.requires(itemTagInputs(inp));

        if (oInp != null) {
            builder.requires(itemTagInputs(oInp));
        }

        builder.save(yeet, EO(id.Shapeless() + sfx));
    }

    public static void shaped(RecipeOutput output, Object inp, @Nullable Object oInp, Item rlt, int rCnt, String sfx, String pat) {
        if (rlt == null) return;

        RecipeOutput yeet = new EOAdvancementYeeter(output);
        EORecipePaths id = new EORecipePaths("");

        char H = 'H';
        char I = 'I';
        char P = '#';

        // Define the possible patterns
        String[] pattern;
        switch (pat.toLowerCase()) {
            case "rod" -> pattern = new String[] {"H  ", " I ", "  I"};
            case "plate" -> pattern = new String[] {" H ", " I ", " I "};
            case "gear" -> pattern = new String[] {" I ", "IHI", " I "};
            case "foils" -> pattern = new String[] {" I ", " I ", " H "};
            case "block" -> pattern = new String[] {"###", "###", "###"};
            case "fours" -> pattern = new String[] {"## ", "## ", "   "};
            default -> {
                return;
            }
        }

        ShapedRecipeBuilder bldr = ShapedRecipeBuilder
                .shaped(RecipeCategory.MISC, rlt, rCnt)
                .unlockedBy("has_" + rlt, has(rlt));

        // Defines the Character/Ingredient for each type
        switch (pat.toLowerCase()) {
            case "rod", "plate", "gear", "foils" -> {
                bldr.define(H, itemTagInputs(inp));

                if (oInp != null) {
                    bldr.define(I, itemTagInputs(oInp));
                }
            }

            case "block", "fours" -> bldr.define(P, itemTagInputs(inp));
        }

        for (String line : pattern) bldr.pattern(line);

        bldr.save(yeet, EO(id.Shaped() + sfx));
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);
        Set<String> generatedRecipes = new HashSet<>();
        EORecipePaths paths = new EORecipePaths("");

        Stream.of(HAMMER_CRUSHING).flatMap(List::stream).forEach(r -> {
            String base = resolveRecipeId(r.grp(), paths);
            shapeless(yeet, HAMMERS, r.input(), r.result(), r.resultCount(), base + r.sfx());
        });

        Stream.of(FROM_BLOCK).flatMap(List::stream).forEach(r -> {
            String base = resolveRecipeId(r.grp(), paths);
            shapeless(yeet, r.input(), null, r.result(), r.resultCount(), base + r.sfx());
        });

        Stream.of(TO_BLOCK).flatMap(List::stream).forEach(r -> {
            String base = resolveRecipeId(r.grp(), paths);
            shaped(yeet, r.input(), null, r.result(), r.resultCount(), base + r.sfx(), "block");
        });

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            Item rawBlockOutput = reg.getOptional(mat.equals("sulfur") ? EO("sulfur_block") : EO(RAW + mat + BLOCK)).orElse(null);

            if (item instanceof BlockItem b && b.getBlock() instanceof EODustBlock) {
                boolean isFours = FOURS_DUST_MATERIALS.contains(mat);

                // Dust -> Dust Block
                if (generatedRecipes.add("dust_block:" + mat) && !mat.equals("coke_coal") && out.DUST_BLOCK != null) {
                    shaped(yeet, inp.DUST, null, out.DUST_BLOCK, 1, id.DustBlock(), isFours ? "fours" : "block");
                }

                // Dust Block -> Dust
                if (generatedRecipes.add("dust_blocks_:" + mat) && !mat.equals("coke_coal") && out.DUST != null) {
                    shapeless(yeet, inp.DUST_BLOCK, null, out.DUST, isFours ? 4 : 9, id.Dust());
                }
            }

            if (item instanceof EOIngotItem || isVanillaIngot(inp.INGOT)) {
                // Ingot -> Nugget
                if (generatedRecipes.add("ingot:" + mat) && out.NUGGET != null) {
                    shapeless(yeet, inp.INGOT, null, out.NUGGET, 9, id.Nugget());
                }

                // Ingot -> Dust
                if (generatedRecipes.add("dust_ingot:" + mat) && !mat.equals("silicon") && out.DUST != null) {
                    shapeless(yeet, HAMMERS, inp.INGOT, out.DUST, 1, id.Crushing());
                }

                // Ingot -> Block
                if (item instanceof EOIngotItem && generatedRecipes.add("ingot_block:" + mat) && out.BLOCK != null && !mat.equals("redstone") && !mat.equals("silicon")) {
                    shaped(yeet, inp.INGOT, null, out.BLOCK, 1, id.Storage(), "block");
                }
            }

            if (item instanceof EONuggetItem || isVanillaNuggets(inp.NUGGET)) {
                // Nugget -> Ingot
                if (generatedRecipes.add("nugget:" + mat) && out.INGOT != null) {
                    shaped(yeet, inp.NUGGET, null, out.INGOT, 1, id.Ingot(), "block");
                }
            }

            if (item instanceof EOClumpItem) {
                // Small Clump -> Clump
                if (generatedRecipes.add("clumps:" + mat) && out.CLUMP != null) {
                    shaped(yeet, inp.SMALL_CLUMP, null, out.CLUMP, 1, id.Clump(), "block");
                }

                // Clump -> Small Clump
                if (generatedRecipes.add("small_clumps:" + mat) && out.SMALL_CLUMP != null) {
                    shapeless(yeet, inp.CLUMP, null, out.SMALL_CLUMP, 9, id.Clump());
                }
            }

            if (item instanceof EOSmallDustItem) {
                // Small Dust -> Dust
                if (generatedRecipes.add("crafting_small_dust:" + mat) && !mat.equals("coke_coal") && out.DUST != null) {
                    shaped(yeet, inp.SMALL_DUST, null, out.DUST, 1, id.Dust(), "block");
                }
            }

            if (item instanceof EODustItem) {
                // Dust -> Small Dust
                if (generatedRecipes.add("small_dust:" + mat) && !mat.equals("coke_coal") && out.SMALL_DUST != null) {
                    shapeless(yeet, inp.DUST, null, out.SMALL_DUST, 9, id.SmallDust());
                }
            }

            if (item instanceof EOPlateItem || isVanillaSet(inp.GEM_INGOT)) {
                // Plate -> Dust
                if (item instanceof EOPlateItem && generatedRecipes.add("plate_:" + mat) && !formTypeExclusions().contains(mat) && out.DUST != null) {
                    shapeless(yeet, inp.PLATE, HAMMERS, out.DUST, 1, id.Recycle() + "_plate");
                }

                // Material -> Plate
                if (generatedRecipes.add("plate:" + mat) && !formTypeExclusions().contains(mat) && out.PLATE != null) {
                    shaped(yeet, inp.TOOLS, inp.GEM_INGOT, out.PLATE, 1, id.Plate(), "plate");
                }
            }

            if (item instanceof EORodItem || isVanillaSet(inp.GEM_INGOT)) {
                // Rod -> Dust
                if (item instanceof EORodItem && generatedRecipes.add("rod_:" + mat) && !formTypeExclusions().contains(mat) && out.DUST != null) {
                    shapeless(yeet, inp.ROD, HAMMERS, out.DUST, 1, id.Recycle() + "_rod");
                }

                // Material -> Rod
                if (generatedRecipes.add("rod:" + mat) && !formTypeExclusions().contains(mat) && out.ROD != null) {
                    shaped(yeet, inp.TOOLS, inp.GEM_INGOT, out.ROD, 1, id.Rod(), "rod");
                }
            }

            if (item instanceof EOGearItem || isVanillaSet(inp.GEM_INGOT)) {
                // Gear -> Dust
                if (item instanceof EOGearItem
                        && generatedRecipes.add("gear_:" + mat) && !formTypeExclusions().contains(mat) && out.DUST != null) {
                    shapeless(yeet, inp.GEAR, HAMMERS, out.DUST, 1, id.Recycle() + "_gear");
                }

                // Material -> Gear
                if (generatedRecipes.add("gear:" + mat) && !formTypeExclusions().contains(mat) && out.GEAR != null) {
                    shaped(yeet, inp.TOOLS, inp.GEM_INGOT, out.GEAR, 1, id.Gear(), "gear");
                }
            }

            if (item instanceof EOGemItem || isVanillaGem(inp.GEM)) {
                // Gems -> Dust
                if (generatedRecipes.add("dust_gem:" + mat) && out.DUST != null) {
                    shapeless(yeet, HAMMERS, inp.GEM, out.DUST, 1, id.Crushing());
                }

                if (item instanceof EOGemItem) {
                    boolean isFours = FOURS_DUST_MATERIALS.contains(mat);

                    // Gem -> Block
                    if (generatedRecipes.add("gem_block:" + mat) && out.BLOCK != null) {
                        shaped(yeet, inp.GEM, null, out.BLOCK, 1, id.Storage(), isFours ? "fours" : "block");
                    }

                    // Block -> Gem
                    if (generatedRecipes.add("gem_block_:" + mat) && out.GEM != null) {
                        shapeless(yeet, inp.STORAGE_BLOCK, null, out.GEM, isFours ? 4 : 9, id.Gem());
                    }
                }
            }

            if (item instanceof EOGemShardItem || isVanillaGem(inp.GEM)) {
                // Gems -> Gem Shard
                if (generatedRecipes.add("crafting_gem_shards:" + mat) && out.GEM_SHARD != null) {
                    shapeless(yeet, inp.GEM, null, out.GEM_SHARD, 9, id.GemShard());
                }

                // Gem Shards -> Gem
                if (generatedRecipes.add("crafting_gem_from_shard:" + mat) && out.GEM != null) {
                    shaped(yeet, inp.GEM_SHARDS, null, out.GEM, 1, id.Gem(), "block");
                }
            }

            if (item instanceof EORawMaterialItem || isVanillaRaw(inp.RAW)) {
                // Raw Material -> Block
                if (item instanceof EORawMaterialItem) {
                    if (generatedRecipes.add("raw_block:" + mat) && rawBlockOutput != null) {
                        shaped(yeet, inp.RAW, null, rawBlockOutput, 1, id.RawBlock(), "block");
                    }

                    // Block -> Raw Material
                    if (generatedRecipes.add("raw_block_:" + mat) && out.RAW != null) {
                        shapeless(yeet, inp.RAW_BLOCK_CASE, null, out.RAW, 9, id.Raw());
                    }
                }

                // Raw Material -> 2x Dust skipping sulfur
                if (generatedRecipes.add("crafting_raw_mat_dupe:" + mat) && out.DUST != null && !mat.equals("sulfur")) {
                    shapeless(yeet, HAMMERS, inp.RAW, out.DUST, 2, id.Duplication());
                }
            }

            if (item instanceof EOCoalItem) {
                // Coal -> Dust
                if (generatedRecipes.add("coal_dust:" + mat) && !mat.equals("coal_coke") && out.DUST != null) {
                    shapeless(yeet, HAMMERS, inp.COALS, out.DUST, 1, id.Crushing());
                }

                // Coal -> Block
                if (generatedRecipes.add("coal_item:" + mat) && !mat.equals("coal_coke") && out.BLOCK != null) {
                    shaped(yeet, inp.COALS, null, out.BLOCK, 1, id.Storage(), "block");
                }
            }

            if (item instanceof BlockItem b && b.getBlock() instanceof EOCoalBlock) {
                // Coal Block -> Coal
                if (generatedRecipes.add("coal_block:" + mat) && out.COALS != null && !mat.equals("coke_coal")) {
                    shapeless(yeet, inp.STORAGE_BLOCK, null, out.COALS, 9, id.Coal());
                }
            }

            if (item instanceof BlockItem b && b.getBlock() instanceof EOStorageBlock) {
                // Block -> Ingot
                if (generatedRecipes.add("ingot_block_:" + mat) && out.INGOT != null && !mat.equals("redstone")) {
                    shapeless(yeet, inp.STORAGE_BLOCK, null, out.INGOT, 9, id.Ingot());
                }
            }

            if (item instanceof BlockItem b && b.getBlock() instanceof EOreBlock || isVanillaOre(inp.ORE)) {
                // Ore Block -> Dust
                if (generatedRecipes.add("ore_block:" + mat) && out.DUST != null) {
                    shapeless(yeet, inp.ORE, HAMMERS, out.DUST, 1, id.Ore());
                }
            }

            if (item instanceof EOFoilItem || isVanillaPlate(inp.PLATE)) {
                // Plate -> Foil
                if (generatedRecipes.add("foil:" + mat) && out.FOIL != null) {
                    shaped(yeet, WIRE_CUTTERS, inp.PLATE, out.FOIL, 1, id.Foil(), "foils");
                }

                // Foil -> Dust
                if (generatedRecipes.add("foil_recycle:" + mat) && out.DUST != null) {
                    shapeless(yeet, HAMMERS, inp.FOIL, out.DUST, 1, id.Recycle() + "_foil");
                }
            }
        });
    }
}
