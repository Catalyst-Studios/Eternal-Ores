package net.radzratz.eternalores.util.compat.actually_additions;

import de.ellpeck.actuallyadditions.data.CrushingRecipeGenerator;
import de.ellpeck.actuallyadditions.mod.crafting.CrushingRecipe;
import de.ellpeck.actuallyadditions.mod.crafting.MiningLensRecipe;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.radzratz.eternalores.block.types.EODustBlock;
import net.radzratz.eternalores.block.types.EOreBlock;
import net.radzratz.eternalores.util.EOMaterials;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.item.types.*;
import net.radzratz.eternalores.item.types.EODirtyDustItem;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;

import static net.minecraft.world.item.Items.*;
import static net.neoforged.neoforge.common.Tags.Items.*;
import static net.neoforged.neoforge.common.Tags.Items.SANDS;
import static net.radzratz.eternalores.util.EOMaterials.materialNames.*;
import static net.radzratz.eternalores.util.EOMaterials.materialNames.PEAT_ID;
import static net.radzratz.eternalores.util.EOMaterials.materialSets.*;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeOutputs.crushingExclusions;
import static net.radzratz.eternalores.util.recipes.types.EOCommonRecipes.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeOutputs.formTypeExclusions;
import static net.radzratz.eternalores.util.recipes.util.EORecipePaths.PATH;
import static net.radzratz.eternalores.util.recipes.util.EORecipePaths.resolveRecipeId;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Compat.SLATE_REPLACEABLES_ITEM;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Compat.STONE_REPLACEABLES_ITEM;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Items.SCULKS;

public class ActuallyAdditionsCompatRecipes {
    private record LensVariant(Object tagInput, String suffix, Function<EOMaterials.materialTypes, DeferredBlock<?>> field) {}

    private static final LensVariant[] VARIANTS = new LensVariant[]{
            new LensVariant(STONE_REPLACEABLES_ITEM, "_stone", set -> set.ORE),
            new LensVariant(SLATE_REPLACEABLES_ITEM, "_slate", set -> set.SLATE_ORE),
            new LensVariant(NETHERRACKS, "_nether", set -> set.NETHER_ORE),
            new LensVariant(END_STONES, "_end", set -> set.END_ORE)
    };

    private static void lens(RecipeOutput output, Object block, int weight, Item ore, String sfx) {
        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        MiningLensRecipe bldr = new MiningLensRecipe(itemTagInputs(block), weight, new ItemStack(ore));

        yeet.withConditions().accept(EO(PATH.Lens() + sfx), bldr, null, ACTUALLY_ADDITIONS_MOD);
    }

    private static void lensesFor(RecipeOutput output, EOMaterials.materialTypes set, String matId, int weight) {
        for (LensVariant variant : VARIANTS) {
            DeferredBlock<?> oreBlock = variant.field().apply(set);
            if (oreBlock == null) continue;

            lens(output, variant.tagInput(), weight, oreBlock.get().asItem(), matId + variant.suffix());
        }
    }

    public static void crusher(RecipeOutput output, Ingredient inp, Item rlt, int rCnt, float rChc, @Nullable Item bRlt, int bCnt, float bChc, String sfx) {
        if (rlt == null) return;
        if (bRlt == null && bCnt > 0) return;

        // YEET
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        ItemStack rItem = new ItemStack(rlt, rCnt);
        CrushingRecipe.CrushingResult main =
                new CrushingRecipe.CrushingResult(rItem, rChc);

        CrushingRecipeGenerator.CrushingBuilder bldr =
                new CrushingRecipeGenerator.CrushingBuilder(inp, main);

        if (bRlt != null) {
            ItemStack bItem = new ItemStack(bRlt, bCnt);
            CrushingRecipe.CrushingResult by =
                    new CrushingRecipe.CrushingResult(bItem, bChc);
            bldr.addResult(by);
        }

        bldr.save(yeet.withConditions(ACTUALLY_ADDITIONS_MOD), EO(PATH.Crush() + sfx));
    }

    public static void crusher(RecipeOutput output, Object inp, Item rlt, int rCnt, float rChc, String sfx) {
        crusher(output, itemTagInputs(inp), rlt, rCnt, rChc, null, 0, 0.0f, sfx);
    }

    public static void crusher(RecipeOutput output, Object inp, Item rlt, int rCnt, float rChc, Item bRlt, int bCnt, float bChc, String sfx) {
        crusher(output, itemTagInputs(inp), rlt, rCnt, rChc, bRlt, bCnt, bChc, sfx);
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Set<String> generateAARecipes = new HashSet<>();

        // Mining Lens
        EORecipePaths paths = new EORecipePaths("");
        lensesFor(yeet, ALUMINUM_SET, ALUMINUM_ID, 3000);
        lensesFor(yeet, ARDITE_SET, ARDITE_ID, 300);
        lensesFor(yeet, BERYLLIUM_SET, BERYLLIUM_ID, 500);
        lensesFor(yeet, COBALT_SET, COBALT_ID, 100);
        lensesFor(yeet, GALLIUM_SET, GALLIUM_ID, 2000);
        lensesFor(yeet, IRIDIUM_SET, IRIDIUM_ID, 200);
        lensesFor(yeet, LEAD_SET, LEAD_ID, 2000);
        lensesFor(yeet, MOLYBDENUM_SET, MOLYBDENUM_ID, 500);
        lensesFor(yeet, NICKEL_SET, NICKEL_ID, 2000);
        lensesFor(yeet, NEODYMIUM_SET, NEODYMIUM_ID, 100);
        lensesFor(yeet, OSMIUM_SET, OSMIUM_ID, 3000);
        lensesFor(yeet, PALLADIUM_SET, PALLADIUM_ID, 50);
        lensesFor(yeet, PLATINUM_SET, PLATINUM_ID, 1500);
        lensesFor(yeet, SILVER_SET, SILVER_ID, 1000);
        lensesFor(yeet, SULFUR_SET, SULFUR_ID, 3000);
        lensesFor(yeet, TIN_SET, TIN_ID, 2000);
        lensesFor(yeet, TITANIUM_SET, TITANIUM_ID, 250);
        lensesFor(yeet, TUNGSTEN_SET, TUNGSTEN_ID, 250);
        lensesFor(yeet, ULTIMATITANIUM_SET, ULTIMATITANIUM_ID, 50);
        lensesFor(yeet, URANINITE_SET, URANINITE_ID, 200);
        lensesFor(yeet, URANIUM_SET, URANIUM_ID, 500);
        lensesFor(yeet, VANADIUM_SET, VANADIUM_ID, 400);
        lensesFor(yeet, ZINC_SET, ZINC_ID, 3000);

        lensesFor(yeet, AMBER_SET, AMBER_ID, 50);
        lensesFor(yeet, APATITE_SET, APATITE_ID, 500);
        lensesFor(yeet, BLACK_QUARTZ_SET, BLACK_QUARTZ_ID, 3000);
        lensesFor(yeet, CINNABAR_SET, CINNABAR_ID, 1000);
        lensesFor(yeet, FLUORITE_SET, FLUORITE_ID, 1000);
        lensesFor(yeet, GARNET_SET, GARNET_ID, 100);
        lensesFor(yeet, JADE_SET, JADE_ID, 60);
        lensesFor(yeet, MONAZITE_SET, MONAZITE_ID, 100);
        lensesFor(yeet, NECROTICARITE_SET, NECROTICARITE_ID, 250);
        lensesFor(yeet, NITER_SET, NITER_ID, 2000);
        lensesFor(yeet, OBSIDIAN_SET, OBSIDIAN_ID, 500);
        lensesFor(yeet, ONYX_SET, ONYX_ID, 20);
        lensesFor(yeet, PERIDOT_SET, PERIDOT_ID, 100);
        lensesFor(yeet, PYROLITE_SET, PYROLITE_ID, 1);
        lensesFor(yeet, RUBY_SET, RUBY_ID, 50);
        lensesFor(yeet, SAPPHIRE_SET, SAPPHIRE_ID, 50);
        lensesFor(yeet, SPINEL_SET, SPINEL_ID, 50);
        lensesFor(yeet, TANZANITE_SET, TANZANITE_ID, 50);
        lensesFor(yeet, ZIRCON_SET, ZIRCON_ID, 50);

        lensesFor(yeet, ANTHRACITE_SET, ANTHRACITE_ID, 2000);
        lensesFor(yeet, BITUMINOUS_SET, BITUMINOUS_ID, 2000);
        lensesFor(yeet, LIGNITE_SET, LIGNITE_ID, 2000);
        lensesFor(yeet, PEAT_SET, PEAT_ID, 1500);

        lens(yeet, SCULKS, 50, SCULKITE_SET.SCULK_ORE.asItem(), "sculkite_sculk");
        lens(yeet, SANDS, 50, PEARL_SET.SAND_ORE.asItem(), "pearl_sand");
        lens(yeet, SANDS, 500, SALT_SET.SAND_ORE.asItem(), "salt_sand");

        // Crushing
        Stream.of(BASIC_CRUSHING).flatMap(List::stream).forEach(r -> {
            String base = resolveRecipeId(r.grp(), paths);
            crusher(yeet, r.input(), r.result(), r.resultCount(), 1.0f, r.byproduct(), r.byproductCount(), 1.0f, base + r.sfx());
        });

        Stream.of(BIO_FUEL_BASIC).flatMap(List::stream).forEach(r -> {
            String base = resolveRecipeId(r.grp(), paths);
            crusher(yeet, r.input(), r.result(), r.resultCount(), 1.0f, r.byproduct(), r.byproductCount(), 1.0f, base + r.sfx());
        });

        crusher(yeet, IRON_HORSE_ARMOR.asItem(), IRON_INGOT.asItem(), 6, 1.0f, paths.Dust() + "iron_horse_armor");
        crusher(yeet, GOLDEN_HORSE_ARMOR.asItem(), GOLD_INGOT.asItem(), 6, 1.0f, paths.Dust() + "gold_horse_armor");

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            OreProcessing found = ORE_PROCESSING.stream()
                    .filter(r -> r.sfx().equals(mat))
                    .findFirst()
                    .orElse(null);

            // Raw Material -> Dust/Small Dust
            if (item instanceof EORawMaterialItem) {
                if (generateAARecipes.add("actually_crushing_raw:" + mat) && !mat.equals("sulfur") && out.DUST != null && out.SMALL_DUST != null) {
                    crusher(yeet, inp.RAW, out.DUST, 2, 1.0f, out.SMALL_DUST, 3, 0.25f, id.Duplication());
                }
            }

            // Clump -> Dirty Dust
            if (item instanceof EODirtyDustItem) {
                if (generateAARecipes.add("actually_crushing_dirty_dust:" + mat) && out.DIRTY_DUST != null) {
                    crusher(yeet, inp.CLUMP, out.DIRTY_DUST, 1, 1.0f, id.DirtyDust());
                }
            }

            // Block -> Dust Block
            if (item instanceof BlockItem b && b.getBlock() instanceof EODustBlock | isVanillaBlock(inp.STORAGE_BLOCK)) {
                if (generateAARecipes.add("actually_crushing_block:" + mat) && !crushingExclusions().contains(mat) && !formTypeExclusions().contains(mat) && out.DUST_BLOCK != null) {
                    crusher(yeet, inp.STORAGE_BLOCK, out.DUST_BLOCK, 1, 1.0f, id.DustBlock());
                }
            }

            // Ingot -> Dust
            if (item instanceof EOIngotItem || isVanillaIngot(inp.INGOT)) {
                if (generateAARecipes.add("actually_crushing_ingot:" + mat) && out.DUST != null) {
                    crusher(yeet, inp.INGOT, out.DUST, 1, 1.0f, id.Dust());
                }
            }

            // Gem -> Dust
            if (item instanceof EOGemItem || isVanillaGem(inp.GEM)) {
                if (generateAARecipes.add("actually_crushing_gem:" + mat) && out.DUST != null) {
                    crusher(yeet, inp.GEM, out.DUST, 1, 1.0f, id.Dust());
                }
            }

            // Nugget -> Small Dust
            if (item instanceof EONuggetItem) {
                if (generateAARecipes.add("actually_crushing_nugget:" + mat) && out.SMALL_DUST != null) {
                    crusher(yeet, inp.NUGGET, out.SMALL_DUST, 1, 1.0f, id.SmallDust());
                }
            }

            // Gem Shard -> Small Dust
            if (item instanceof EOGemShardItem) {
                if (generateAARecipes.add("actually_crushing_gem_shard:" + mat) && out.SMALL_DUST != null) {
                    crusher(yeet, inp.GEM_SHARDS, out.SMALL_DUST, 1, 1.0f, id.SmallDust());
                }
            }

            // Coals -> Dust
            if (item instanceof EOCoalItem) {
                if (generateAARecipes.add("actually_crushing_coal:" + mat) && out.DUST != null) {
                    crusher(yeet, inp.COALS, out.DUST, 1, 1.0f, id.Dust());
                }
            }

            // Ore -> Material - Byproduct
            if (item instanceof BlockItem b && b.getBlock() instanceof EOreBlock || isVanillaOre(inp.ORE)) {
                if (generateAARecipes.add("ore_proc:" + mat) && found != null && found.primary() != null && found.byproduct() != null) {
                    crusher(yeet, inp.ORE, found.primary(), found.primaryCount(), 1.0f, found.byproduct(), found.byproductCount(), 1.0f, id.OreProc());
                }
            }
        });
    }
}
