package net.radzratz.eternalores.util.compat.mekanism.recipe_types;

import mekanism.api.datagen.recipe.builder.ItemStackToItemStackRecipeBuilder;
import mekanism.api.recipes.ingredients.ItemStackIngredient;
import mekanism.api.recipes.ingredients.creator.IngredientCreatorAccess;
import mekanism.common.registries.MekanismItems;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.radzratz.eternalores.block.types.EORawBlock;
import net.radzratz.eternalores.block.types.EOreBlock;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.item.types.*;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;

import java.util.HashSet;
import java.util.Set;

import static mekanism.common.registries.MekanismItems.ENRICHED_CARBON;
import static net.minecraft.world.item.Items.*;
import static net.radzratz.eternalores.util.EOMaterials.materialPrefixSuffixes.GEM;
import static net.radzratz.eternalores.util.EOMaterials.materialPrefixSuffixes.RAW;
import static net.radzratz.eternalores.util.EOMaterials.materialSets.*;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Blends.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Coals.COAL_COKE;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Dusts.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.StorageBlocks.ITEM_STORAGE_DUST;

public class EOMKEnrichingRecipes {
    public static void enriching(RecipeOutput output, Object inp, int iCnt, Item rlt, int rCnt, String sfx) {
        if (rlt == null) return;

        // Why of course, we yeet any advancement!
        RecipeOutput yeet = new EOAdvancementYeeter(output);
        EORecipePaths id = new EORecipePaths("");

        ItemStackIngredient inputStackAsTag = IngredientCreatorAccess.item().from(itemTagInputs(inp), iCnt);
        ItemStack outputItem = new ItemStack(rlt, rCnt);

        ItemStackToItemStackRecipeBuilder.enriching(inputStackAsTag, outputItem).addCondition(MEKANISM_MOD).build(yeet, EO(id.MEnriching() + sfx));
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Set<String> generateEnrichingRecipes = new HashSet<>();

        EORecipePaths paths = new EORecipePaths("");

        String stars = "stars/";
        enriching(yeet, DUSTS_NETHER_STAR, 1, NETHER_STAR, 1, stars + "nether_star");

        enriching(yeet, NETHER_STAR, 1, NETHER_STAR_SET.ENRICHED.get(), 1, paths.Enriched() + "nether_star");
        enriching(yeet, DUSTS_URANIUM, 1, URANIUM_SET.ENRICHED.get(), 1, paths.Enriched() + "uranium");
        enriching(yeet, URANIUM_SET.ENRICHED.get(), 1, MekanismItems.YELLOW_CAKE_URANIUM.get(), 4, paths.Enriched() + "yellow_cake");
        enriching(yeet, BLAZE_POWDER, 3, BLAZE_SET.ENRICHED.get(), 1, paths.Enriched() + "blaze");
        enriching(yeet, GLOWSTONE_DUST, 1, GLOWSTONE_SET.ENRICHED.get(), 1, paths.Enriched() + "glowstone");
        enriching(yeet, BLENDS_CARBON_ENRICHED, 1, HE_CARBON_BLEND_SET.ENRICHED.get(), 1, paths.Enriched() + "highly_carbon");
        enriching(yeet, BLENDS_LOW_CARBON, 1, LE_CARBON_BLEND_SET.ENRICHED.get(), 1, paths.Enriched() + "low_carbon");
        enriching(yeet, BLENDS_CARBON, 1, ENRICHED_CARBON.asItem(), 3, paths.Enriched() + "carbon");

        enriching(yeet, COAL_COKE, 1, COKE_SET.COAL.get(), 1, paths.Coal() + "coke");

        String pearls = "pearls/";
        enriching(yeet, DUSTS_ENDER, 1, ENDER_PEARL, 1, pearls + "ender");
        enriching(yeet, ENDER_PEARL, 1, ENDER_PEARL_SET.ENRICHED.get(), 1, paths.Enriched() + "ender");

        String shells = "shells/";
        enriching(yeet, DUSTS_NAUTILUS, 1, NAUTILUS_SHELL, 1, shells + "nautilus");
        enriching(yeet, DUSTS_SHULKER, 1, SHULKER_SHELL, 1, shells + "shulker");

        String misc = "misc/";
        enriching(yeet, DUSTS_FLINT, 1, FLINT, 1, misc + "flint");
        enriching(yeet, DUSTS_DRIPSTONE, 1, POINTED_DRIPSTONE, 1, misc + "dripstone");

        String block = "blocks/";
        enriching(yeet, ITEM_STORAGE_DUST, 1, SAND, 1, block + "sand");

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            // Blends -> Enriched
            if (item instanceof EOBlends) {
                if (generateEnrichingRecipes.add("mek_enriching_blend:" + mat) && out.ENRICHED != null) {
                    enriching(yeet, inp.BLENDS, 1, out.ENRICHED, 1, id.Enriched());
                }
            }

            if (item instanceof EOGemItem || isVanillaGem(inp.GEM)) {
                // Gem -> Enriched
                if (generateEnrichingRecipes.add("mek_enriching_gem:" + mat) && out.ENRICHED != null) {
                    enriching(yeet, inp.GEM, 1, out.ENRICHED, 1, id.Enriched());
                }

                // Gem Dust -> Gem
                if (generateEnrichingRecipes.add("mek_enriching_dust_gem:" + mat) && out.GEM != null) {
                    enriching(yeet, inp.DUST, 1, out.GEM, 1, id.Gem());
                }
            }

            // Coal Dust -> Coal
            if (item instanceof EOCoalItem) {
                if (generateEnrichingRecipes.add("mek_enriching_dust_coal:" + mat) && !mat.contains("coke_coal") && out.COALS != null) {
                    enriching(yeet, inp.DUST, 1, out.COALS, 1, id.Coal());
                }
            }

            // Dirty Dust -> Dust
            if (item instanceof EODirtyDustItem) {
                if (generateEnrichingRecipes.add("dust_dirty:" + mat) && out.DUST != null) {
                    enriching(yeet, inp.DIRTY_DUST, 1, out.DUST, 1, id.DirtyDust());
                }
            }

            // Ingot -> Enriched
            if (item instanceof EOIngotItem || isVanillaIngot(inp.INGOT)) {
                if (generateEnrichingRecipes.add("mek_enriching_ingot:" + mat) && !mat.equals("uranium") && !mat.equals("iron") && out.ENRICHED != null) {
                    enriching(yeet, inp.INGOT, 1, out.ENRICHED, 1, id.Enriched());
                }
            }

            // Ore -> Dust
            // Ore -> 2x Gem/Dust
            if (item instanceof BlockItem b && b.getBlock() instanceof EOreBlock || isVanillaOre(inp.ORE)) {
                // Determines whether the output is a gem or the raw ore
                boolean isGemType = reg.getOptional(EO(GEM + mat)).isPresent();
                boolean isRawType = reg.getOptional(EO(RAW + mat)).isPresent();

                if (generateEnrichingRecipes.add("mek_enriching_ores:" + mat)) {
                    if (isGemType || mat.equals("fluorite")) {
                        enriching(yeet, inp.ORE, 1, out.GEM, 2, id.OreProc());
                    }

                    if (isRawType || mat.equals("sulfur")) {
                        enriching(yeet, inp.ORE, 1, out.DUST, 2, id.OreProc());
                    }
                }
            }

            // Raw Material -> Dust
            if (item instanceof EORawMaterialItem || isVanillaRaw(inp.RAW)) {
                if (generateEnrichingRecipes.add("mek_enriching_raw_mats:" + mat) && !mat.equals("sulfur") && out.DUST != null) {
                    enriching(yeet, inp.RAW, 3, out.DUST, 4, id.RawProc());
                }
            }

            // Raw Block Material -> 12x Dust
            if (item instanceof BlockItem b && b.getBlock() instanceof EORawBlock || isVanillaRawBlock(inp.STORAGE_BLOCK_RAW)) {
                if (generateEnrichingRecipes.add("mek_enriching_raw_blocks:" + mat) && !mat.equals("sulfur") && out.CLEAN_DUST != null) {
                    enriching(yeet, inp.STORAGE_BLOCK_RAW, 1, out.CLEAN_DUST, 12, id.RawProcBlock());
                }
            }
        });
    }
}
