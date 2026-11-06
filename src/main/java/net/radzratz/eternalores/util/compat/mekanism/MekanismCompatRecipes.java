package net.radzratz.eternalores.util.compat.mekanism;

import mekanism.api.chemical.Chemical;
import mekanism.api.chemical.ChemicalStack;
import mekanism.api.datagen.recipe.builder.*;
import mekanism.api.recipes.ingredients.ChemicalStackIngredient;
import mekanism.api.recipes.ingredients.FluidStackIngredient;
import mekanism.api.recipes.ingredients.ItemStackIngredient;
import mekanism.api.recipes.ingredients.creator.IngredientCreatorAccess;
import mekanism.common.registration.impl.DeferredChemical;
import mekanism.common.registries.MekanismItems;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.neoforge.common.conditions.ICondition;
import net.radzratz.eternalores.block.types.EODustBlock;
import net.radzratz.eternalores.block.types.EOEnrichedBlock;
import net.radzratz.eternalores.block.types.EORawBlock;
import net.radzratz.eternalores.block.types.EOreBlock;
import net.radzratz.eternalores.util.compat.mekanism.chemicals.EOInfusionCompatRegistry;
import net.radzratz.eternalores.util.compat.mekanism.chemicals.EOSlurryCompatRegistry;
import net.radzratz.eternalores.util.compat.mekanism.conditions.EOChemicalCondition;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.item.types.*;
import net.radzratz.eternalores.item.types.EODirtyDustItem;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;

import java.util.*;
import java.util.stream.Stream;

import static mekanism.common.registries.MekanismChemicals.*;
import static mekanism.common.registries.MekanismChemicals.DIAMOND;
import static mekanism.common.registries.MekanismChemicals.HYDROGEN_CHLORIDE;
import static mekanism.common.registries.MekanismChemicals.WATER_VAPOR;
import static mekanism.common.registries.MekanismItems.ENRICHED_CARBON;
import static mekanism.common.tags.MekanismTags.Items.ENRICHED_GOLD;
import static net.minecraft.tags.ItemTags.WOODEN_SLABS;
import static net.minecraft.world.item.Items.*;
import static net.neoforged.neoforge.common.Tags.Fluids.WATER;
import static net.neoforged.neoforge.common.Tags.Items.*;
import static net.radzratz.eternalores.util.EOMaterials.materialPrefixSuffixes.GEM;
import static net.radzratz.eternalores.util.EOMaterials.materialPrefixSuffixes.RAW;
import static net.radzratz.eternalores.util.EOMaterials.materialSets.*;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.compat.mekanism.chemicals.EOChemical.*;
import static net.radzratz.eternalores.util.compat.mekanism.chemicals.EOChemical.INF_SHADOW;
import static net.radzratz.eternalores.util.recipes.types.EOCommonRecipes.BASIC_CRUSHING;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeOutputs.formTypeExclusions;
import static net.radzratz.eternalores.util.recipes.util.EORecipePaths.PATH;
import static net.radzratz.eternalores.util.recipes.util.EORecipePaths.resolveRecipeId;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Blends.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Dusts.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Enriched.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Enriched.TIN_ENRICHED;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Ingots.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.RawMaterials.SULFUR;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.SmallDusts.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.StorageBlocks.ITEM_STORAGE_DUST;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.StorageBlocks.ITEM_STORAGE_SULFUR;

public class MekanismCompatRecipes {
    public static void crusher(RecipeOutput output, Object inp, Item rlt, int cnt, String sfx) {
        if (rlt == null) return;

        RecipeOutput yeet = new EOAdvancementYeeter(output);

        ItemStackIngredient inpT = IngredientCreatorAccess.item().from(itemTagInputs(inp));
        ItemStack rltT = new ItemStack(rlt, cnt);

        ItemStackToItemStackRecipeBuilder.crushing(inpT, rltT).addCondition(MEKANISM_MOD).build(yeet, EO(PATH.MCrusher() + sfx));
    }

    public static void crystallizer(RecipeOutput output, Holder<Chemical> inpCh, int iChCnt, Item rlt, int rCnt, String sfx) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        ChemicalStackIngredient inp = IngredientCreatorAccess.chemicalStack().fromHolder(inpCh, iChCnt);
        var rltS = new ItemStack(rlt, rCnt);

        ChemicalCrystallizerRecipeBuilder.crystallizing(inp, rltS).addCondition(MEKANISM_MOD).build(yeet, EO(PATH.MCrystal() + sfx));
    }

    public static void dissolution(RecipeOutput output, Object inp, int iCnt, Holder<Chemical> iCh, int iChCnt, Holder<Chemical> rltCh, int rltChCnt, String sfx) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        ItemStackIngredient inpI = IngredientCreatorAccess.item().from(itemTagInputs(inp), iCnt);
        ChemicalStackIngredient acid = IngredientCreatorAccess.chemicalStack().fromHolder(iCh, iChCnt);
        ChemicalStack rlt = new ChemicalStack(rltCh, rltChCnt);

        ChemicalDissolutionRecipeBuilder.dissolution(inpI, acid, rlt, true).addCondition(MEKANISM_MOD).build(yeet, EO(PATH.MDissolution() + sfx));
    }

    public static void enriching(RecipeOutput output, Object inp, int iCnt, Item rlt, int rCnt, String sfx) {
        if (rlt == null) return;

        RecipeOutput yeet = new EOAdvancementYeeter(output);

        ItemStackIngredient inputStackAsTag = IngredientCreatorAccess.item().from(itemTagInputs(inp), iCnt);
        ItemStack outputItem = new ItemStack(rlt, rCnt);

        ItemStackToItemStackRecipeBuilder.enriching(inputStackAsTag, outputItem).addCondition(MEKANISM_MOD).build(yeet, EO(PATH.MEnriching() + sfx));
    }

    public static void injecting(RecipeOutput output, Object inp, int iCnt, DeferredChemical<?> iCh, long iChCnt, Item rlt, int rCnt, String sfx) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        ItemStackIngredient inpT = IngredientCreatorAccess.item().from(itemTagInputs(inp), iCnt);
        ChemicalStackIngredient chInp = IngredientCreatorAccess.chemicalStack().fromHolder(iCh, iChCnt);
        var rlts = new ItemStack(rlt, rCnt);

        ItemStackChemicalToItemStackRecipeBuilder.injecting(inpT, chInp, rlts, true).addCondition(MEKANISM_MOD).build(yeet, EO(PATH.MInjecting() + sfx));
    }

    private static void saw(RecipeOutput output, Object inp, Item result, int rCnt, Item byproduct, double bCh, String sfx) {
        if (result == null || byproduct == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        ItemStackIngredient main = IngredientCreatorAccess.item().from(itemTagInputs(inp));
        ItemStack res = new ItemStack(result, rCnt);
        ItemStack extra = new ItemStack(byproduct);

        SawmillRecipeBuilder.sawing(main, res, extra, bCh).addCondition(MEKANISM_MOD).build(yeet, EO(PATH.MPrecision() + sfx));
    }

    public static void purify(RecipeOutput output, Object inp, int iCnt, Holder<Chemical> iCh, int iChCnt, Item rlt, int rCnt, String sfx) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        ItemStackIngredient inpT = IngredientCreatorAccess.item().from(itemTagInputs(inp), iCnt);
        ChemicalStackIngredient chInp = IngredientCreatorAccess.chemicalStack().fromHolder(iCh, iChCnt);
        var rlts = new ItemStack(rlt, rCnt);

        ItemStackChemicalToItemStackRecipeBuilder.purifying(inpT, chInp, rlts, true).addCondition(MEKANISM_MOD).build(yeet, EO(PATH.MPurifier() + sfx));
    }

    public static void washing(RecipeOutput output, TagKey<Fluid> fInp, int fCnt, Holder<Chemical> iCh, int iChCnt, Holder<Chemical> rltCh, int rChCnt, String sfx) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        FluidStackIngredient fIn = IngredientCreatorAccess.fluid().from(fInp, fCnt);
        ChemicalStackIngredient inpT = IngredientCreatorAccess.chemicalStack().fromHolder(iCh, iChCnt);
        ChemicalStack rlts = new ChemicalStack(rltCh, rChCnt);

        FluidChemicalToChemicalRecipeBuilder.washing(fIn, inpT, rlts).addCondition(MEKANISM_MOD).build(yeet, EO(PATH.MWasher() + sfx.toLowerCase(Locale.ROOT)));
    }

    public static void infusion(RecipeOutput output, Object inp, String chemName, int amount, String suffix) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Holder<Chemical> chemical = EOInfusionCompatRegistry.getChemical(chemName);
        if (chemical == null) return;

        ICondition condition = EOChemicalCondition.getCondition(chemName);

        ItemStackIngredient inputStackAsTag = IngredientCreatorAccess.item().from(itemTagInputs(inp));
        ChemicalStack result = new ChemicalStack(chemical, amount);

        ItemStackToChemicalRecipeBuilder.chemicalConversion(inputStackAsTag, result)
                .addCondition(MEKANISM_MOD)
                .addCondition(condition)
                .build(yeet, EO("compat/mekanism/infusions/" + suffix + "_conv"));

        ItemStackToChemicalRecipeBuilder.oxidizing(inputStackAsTag, result)
                .addCondition(MEKANISM_MOD)
                .addCondition(condition)
                .build(yeet, EO("compat/mekanism/infusions/" + suffix + "_oxidizer"));
    }

    public static void oxidizer(RecipeOutput output, Object inp, DeferredChemical<?> inputChemical, int amount, String suffix) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        ItemStackIngredient inputStackAsTag = IngredientCreatorAccess.item().from(itemTagInputs(inp));
        ChemicalStack result = new ChemicalStack(inputChemical, amount);

        ItemStackToChemicalRecipeBuilder.oxidizing(inputStackAsTag, result)
                .addCondition(MEKANISM_MOD)
                .build(yeet, EO("compat/mekanism/infusions/" + suffix + "_oxidizer"));
    }

    public static void metallurgic(RecipeOutput output, Object inp, int inputItemCount, DeferredChemical<?> iChem, int iChemCnt, Item rlt, int rCnt, String sfx) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        ItemStackIngredient itemInput = IngredientCreatorAccess.item().from(itemTagInputs(inp), inputItemCount);
        ChemicalStackIngredient chemInput = IngredientCreatorAccess.chemicalStack().fromHolder(iChem, iChemCnt);
        ItemStack itemOutput = new ItemStack(rlt, rCnt);

        ItemStackChemicalToItemStackRecipeBuilder.metallurgicInfusing(itemInput, chemInput, itemOutput, false)
                .addCondition(MEKANISM_MOD)
                .build(yeet, EO("compat/mekanism/metallurgic/" + sfx));
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        Set<String> generatedMekanismRecipes = new HashSet<>();

        EORecipePaths paths = new EORecipePaths("");

        // Crusher
        Stream.of(BASIC_CRUSHING).flatMap(List::stream).forEach(r -> {
            String base = resolveRecipeId(r.grp(), paths);
            crusher(yeet, r.input(), r.result(), r.resultCount(), base + r.sfx());
        });

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            // Clump -> Dirty Dust
            if (item instanceof EODirtyDustItem) {
                if (generatedMekanismRecipes.add("mek_crusher_dirty_dust:" + mat) && out.DIRTY_DUST != null) {
                    crusher(yeet, inp.CLUMP, out.DIRTY_DUST, 1, id.DirtyDust());
                }
            }

            // Block -> Dust Block
            if (item instanceof BlockItem b && b.getBlock() instanceof EODustBlock || isVanillaBlock(inp.STORAGE_BLOCK)) {
                if (generatedMekanismRecipes.add("mek_crusher_dust_block:" + mat) && !mat.contains("coke_coal") && !formTypeExclusions().contains(mat) && out.DUST_BLOCK != null) {
                    crusher(yeet, inp.STORAGE_BLOCK, out.DUST_BLOCK, 1, id.DustBlock());
                }
            }

            // Ingot -> Dust
            if (item instanceof EOIngotItem || isVanillaIngot(inp.INGOT)) {
                if (generatedMekanismRecipes.add("mek_crusher_ingot_dust:" + mat) && out.DUST != null) {
                    crusher(yeet, inp.INGOT, out.DUST, 1, id.Dust());
                }
            }

            // Nugget -> Small Dust
            if (item instanceof EONuggetItem) {
                if (generatedMekanismRecipes.add("mek_crusher_smol_dust:" + mat) && out.SMALL_DUST != null) {
                    crusher(yeet, inp.NUGGET, out.SMALL_DUST, 1, id.SmallDust());
                }
            }

            // Gem -> Dust
            if (item instanceof EOGemItem || isVanillaGem(inp.GEM)) {
                if (generatedMekanismRecipes.add("mek_crusher_gem_dust:" + mat) && out.DUST != null) {
                    crusher(yeet, inp.GEM, out.DUST, 1, id.Dust());
                }
            }

            // Gem Shard -> Small Dust
            if (item instanceof EOGemShardItem) {
                if (generatedMekanismRecipes.add("mek_crusher_gem_shard_dust:" + mat) && out.SMALL_DUST != null) {
                    crusher(yeet, inp.GEM_SHARDS, out.SMALL_DUST, 1, id.SmallDust());
                }
            }
        });

        // Crystallizer
        crystallizer(yeet, BRINE, 15, SALT_SET.DUST.get(), 1, paths.Crystal() + "salt");

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            var slurryObj = EOSlurryCompatRegistry.getSlurryMap().get(mat);
            if (slurryObj == null) return;

            Holder<Chemical> clean = slurryObj.getCleanSlurry();

            // Clean Slurry -> Crystal
            if (item instanceof EOCrystalItem) {
                if (generatedMekanismRecipes.add("mek_crystal_slurry:" + mat) && out.CRYSTAL != null) {
                    crystallizer(yeet, clean, 200, out.CRYSTAL, 1, id.Crystal());
                }
            }
        });

        // Dissolution Chamber
        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            var slurryObj = EOSlurryCompatRegistry.getSlurryMap().get(mat);
            if (slurryObj == null) return;

            // Raw Block -> Dirty Slurry
            if (item instanceof BlockItem b && b.getBlock() instanceof EORawBlock || isVanillaRawBlock(inp.STORAGE_BLOCK_RAW)) {
                if (generatedMekanismRecipes.add("mek_dissolution_raw_block:" + mat)) {
                    dissolution(yeet, inp.STORAGE_BLOCK_RAW, 1, SULFURIC_ACID, 2, slurryObj, 6000, id.RawProcBlock());
                }
            }

            // Raw Material -> Dirty Slurry
            if (item instanceof EORawMaterialItem || isVanillaRaw(inp.RAW)) {
                if (generatedMekanismRecipes.add("mek_dissolution_raw_item:" + mat)) {
                    dissolution(yeet, inp.RAW, 3, SULFURIC_ACID, 1, slurryObj, 2000, id.RawProc());
                }
            }

            // Ore Block -> Dirty Slurry
            if (item instanceof BlockItem b && b.getBlock() instanceof EOreBlock || isVanillaMetalOre(inp.ORE)) {
                if (generatedMekanismRecipes.add("mek_dissolution_ores:" + mat)) {
                    dissolution(yeet, inp.ORE, 1, SULFURIC_ACID, 1, slurryObj, 1000, id.Ore());
                }
            }
        });

        // Enrichment Chamber
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
                if (generatedMekanismRecipes.add("mek_enriching_blend:" + mat) && out.ENRICHED != null) {
                    enriching(yeet, inp.BLENDS, 1, out.ENRICHED, 1, id.Enriched());
                }
            }

            if (item instanceof EOGemItem || isVanillaGem(inp.GEM)) {
                // Gem -> Enriched
                if (generatedMekanismRecipes.add("mek_enriching_gem:" + mat) && out.ENRICHED != null) {
                    enriching(yeet, inp.GEM, 1, out.ENRICHED, 1, id.Enriched());
                }

                // Gem Dust -> Gem
                if (generatedMekanismRecipes.add("mek_enriching_dust_gem:" + mat) && out.GEM != null) {
                    enriching(yeet, inp.DUST, 1, out.GEM, 1, id.Gem());
                }
            }

            // Coal Dust -> Coal
            if (item instanceof EOCoalItem) {
                if (generatedMekanismRecipes.add("mek_enriching_dust_coal:" + mat) && !mat.equals("coke") && out.COALS != null) {
                    enriching(yeet, inp.DUST, 1, out.COALS, 1, id.Coal());
                }
            }

            // Dirty Dust -> Dust
            if (item instanceof EODirtyDustItem) {
                if (generatedMekanismRecipes.add("dust_dirty:" + mat) && out.DUST != null) {
                    enriching(yeet, inp.DIRTY_DUST, 1, out.DUST, 1, id.DirtyDust());
                }
            }

            // Ingot -> Enriched
            if (item instanceof EOIngotItem || isVanillaIngot(inp.INGOT)) {
                if (generatedMekanismRecipes.add("mek_enriching_ingot:" + mat) && !mat.equals("uranium") && !mat.equals("iron") && out.ENRICHED != null) {
                    enriching(yeet, inp.INGOT, 1, out.ENRICHED, 1, id.Enriched());
                }
            }

            // Ore -> Dust
            // Ore -> 2x Gem/Dust
            if (item instanceof BlockItem b && b.getBlock() instanceof EOreBlock || isVanillaOre(inp.ORE)) {
                // Determines whether the output is a gem or the raw ore
                boolean isGemType = reg.getOptional(EO(GEM + mat)).isPresent();
                boolean isRawType = reg.getOptional(EO(RAW + mat)).isPresent();

                if (generatedMekanismRecipes.add("mek_enriching_ores:" + mat)) {
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
                if (generatedMekanismRecipes.add("mek_enriching_raw_mats:" + mat) && !mat.equals("sulfur") && out.DUST != null) {
                    enriching(yeet, inp.RAW, 3, out.DUST, 4, id.RawProc());
                }
            }

            // Raw Block Material -> 12x Dust
            if (item instanceof BlockItem b && b.getBlock() instanceof EORawBlock || isVanillaRawBlock(inp.STORAGE_BLOCK_RAW)) {
                if (generatedMekanismRecipes.add("mek_enriching_raw_blocks:" + mat) && !mat.equals("sulfur") && out.CLEAN_DUST != null) {
                    enriching(yeet, inp.STORAGE_BLOCK_RAW, 1, out.CLEAN_DUST, 12, id.RawProcBlock());
                }
            }
        });

        // Injection Chamber
        injecting(yeet, DUSTS_BRICK, 1, WATER_VAPOR, 1, CLAY_SET.DUST.get(), 1, "materials/clay");
        injecting(yeet, SMALL_DUSTS_BRICK, 9, WATER_VAPOR, 1, CLAY_SET.SMALL_DUST.get(), 9, "materials/clay_var");

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            // Crystal -> Shard
            if (item instanceof EOCrystalItem) {
                if (generatedMekanismRecipes.add("mek_injecting_crystal:" + mat) && out.SHARD != null) {
                    injecting(yeet, inp.CRYSTAL, 1, HYDROGEN_CHLORIDE, 1, out.SHARD, 1, id.Crystal());
                }
            }

            // Raw Material -> 8x Shard
            if (item instanceof EORawMaterialItem || isVanillaRaw(inp.RAW)) {
                if (generatedMekanismRecipes.add("mek_injecting_raw:" + mat) && out.SHARD != null) {
                    injecting(yeet, inp.RAW, 3, HYDROGEN_CHLORIDE, 1, out.SHARD, 8, id.RawProc());
                }
            }

            // Ore Block -> 4x Shard
            if (item instanceof BlockItem b && b.getBlock() instanceof EOreBlock || isVanillaMetalOre(inp.ORE)) {
                if (generatedMekanismRecipes.add("mek_injecting_ore:" + mat) && out.SHARD != null) {
                    injecting(yeet, inp.ORE, 1, HYDROGEN_CHLORIDE, 1, out.SHARD, 4, id.OreProc());
                }
            }

            // Raw Block -> 24x Shard
            if (item instanceof BlockItem b && b.getBlock() instanceof EORawBlock || isVanillaRawBlock(inp.STORAGE_BLOCK_RAW)) {
                if (generatedMekanismRecipes.add("mek_injecting_raw_block:" + mat) && out.SHARD != null) {
                    injecting(yeet, inp.STORAGE_BLOCK_RAW, 1, HYDROGEN_CHLORIDE, 2, out.SHARD, 24, id.RawProcBlock());
                }
            }
        });

        // Precision Sawmill
        saw(yeet, WOODEN_SLABS, WOOD_SET.PLATE.get(), 4, WOOD_SET.DUST.get(), 1.0, paths.Plate() + "wooden");
        saw(yeet, WOOD_SET.PLATE.get(), WOOD_SET.GEAR.get(), 1, WOOD_SET.DUST.get(), 1.0, paths.Gear() + "wooden");

        // Purifying Chamber
        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            // Shard -> Clump
            if (item instanceof EOShardItem) {
                if (generatedMekanismRecipes.add("mek_purify_shards:" + mat) && out.CLUMP != null) {
                    purify(yeet, inp.SHARD, 1, OXYGEN, 1, out.CLUMP, 1, id.Shards());
                }
            }

            // Raw Material -> 2x Clump
            if (item instanceof EORawMaterialItem || isVanillaRaw(inp.RAW)) {
                if (generatedMekanismRecipes.add("mek_purify_raw:" + mat) && out.CLUMP != null) {
                    purify(yeet, inp.RAW, 1, OXYGEN, 1, out.CLUMP, 2, id.RawProc());
                }
            }

            // Ore Block -> 3x Clump
            if (item instanceof BlockItem b && b.getBlock() instanceof EOreBlock || isVanillaMetalOre(inp.ORE)) {
                if (generatedMekanismRecipes.add("mek_purify_ore:" + mat) && out.CLUMP != null) {
                    purify(yeet, inp.ORE, 1, OXYGEN, 1, out.CLUMP, 3, id.OreProc());
                }
            }

            // Raw Block -> 18x Clump
            if (item instanceof BlockItem b && b.getBlock() instanceof EORawBlock || isVanillaRawBlock(inp.STORAGE_BLOCK_RAW)) {
                if (generatedMekanismRecipes.add("mek_purify_raw_block:" + mat) && out.CLUMP != null) {
                    purify(yeet, inp.STORAGE_BLOCK_RAW, 1, OXYGEN, 2, out.CLUMP, 18, id.RawProcBlock());
                }
            }
        });

        // Chemical Washer
        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            var slurryObj = EOSlurryCompatRegistry.getSlurryMap().get(mat);
            if (slurryObj == null) return;

            Holder<Chemical> dirtySlurry = EOSlurryCompatRegistry.getSlurryMap().get(mat);
            Holder<Chemical> cleanSlurry = EOSlurryCompatRegistry.getSlurryMap().get(mat).getCleanSlurry();

            if (generatedMekanismRecipes.add("mek_wash_slurry:" + mat)) {
                washing(yeet, WATER, 5, dirtySlurry, 1, cleanSlurry, 1, id.Slurry());
            }
        });

        // Oxidizer - Metallurgic Infuser - Conversion
        infusion(yeet, BLENDS_CARBON, CARBON.getName(), 20, paths.Blend() + "carbon");
        infusion(yeet, BLENDS_CARBON_ENRICHED, INF_ENRICHED_CARBON.getName(), 20, paths.Blend() + "high_carbon");
        infusion(yeet, BLENDS_ENDERGETIC, INF_ENDERGETIC.getName(), 20, paths.Blend() + "endergetic");
        infusion(yeet, BLENDS_ENERGETIC, INF_ENERGETIC.getName(), 20, paths.Blend() + "energetic");
        infusion(yeet, BLENDS_LOW_CARBON, INF_LOW_CARBON.getName(), 20, paths.Blend() + "low_carbon");
        infusion(yeet, BLENDS_NETHER_ENRICHED, INF_NETHER_ENRICHED.getName(), 20, paths.Blend() + "nether");
        infusion(yeet, BLENDS_SHADOW, INF_SHADOW.getName(), 20, paths.Blend() + "shadow");

        oxidizer(yeet, ITEM_STORAGE_SULFUR, SULFUR_DIOXIDE, 900, paths.Block() + "sulfur");
        oxidizer(yeet, SULFUR, SULFUR_DIOXIDE, 100, paths.Raw() + "sulfur");
        oxidizer(yeet, SMALL_DUSTS_SULFUR, SULFUR_DIOXIDE, 10, paths.SmallDust() + "sulfur");

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            // Dust -> Chemical
            if (item instanceof EODustItem) {
                if (generatedMekanismRecipes.add("mek_infuser_dust_conv:" + mat)) {
                    infusion(yeet, inp.DUST, mat, 10, id.Dust());
                }
            }

            // Enriched -> Chemical
            if (item instanceof EOEnrichedItems) {
                if (generatedMekanismRecipes.add("mek_infuser_enriched_conv" + mat) && !mat.equals("iron")) {
                    infusion(yeet, inp.ENRICHED, mat, 80, id.Enriched());
                }
            }

            // Enriched Block -> Chemical
            if (item instanceof BlockItem b && b.getBlock() instanceof EOEnrichedBlock) {
                if (generatedMekanismRecipes.add("mek_infuser_enriched_block_conv:" + mat)) {
                    infusion(yeet, inp.ENRICHED_BLOCK, mat, 720, id.Enriched() + "_block");
                }
            }
        });

        metallurgic(yeet, OBSIDIAN_SET.ENRICHED.get(), 1, DIAMOND, 30, MekanismItems.ENRICHED_OBSIDIAN.get(), 3, "basic/refined_obsidian");

        metallurgic(yeet, SMALL_DUSTS_IRON, 1, CARBON, 5, WROUGHT_IRON_SET.SMALL_DUST.asItem(), 2, "basic/wrought_iron");

        metallurgic(yeet, DUSTS_IRON, 1, INF_LOW_CARBON, 10, PIG_IRON_SET.DUST.asItem(), 1, "basic/pig_iron_1");
        metallurgic(yeet, INGOTS_IRON, 1, INF_LOW_CARBON, 10, PIG_IRON_SET.DUST.asItem(), 1, "basic/pig_iron_2");

        metallurgic(yeet, INGOTS_STEEL, 1, BIO, 10, BIOSTEEL_SET.DUST.asItem(), 1, "basic/biosteel_1");
        metallurgic(yeet, DUSTS_STEEL, 1, BIO, 10, BIOSTEEL_SET.DUST.asItem(), 1, "basic/biosteel_2");

        metallurgic(yeet, INGOTS_STEEL, 1, CARBON, 10, CAST_STEEL_SET.DUST.asItem(), 1, "basic/cast_steel_1");
        metallurgic(yeet, DUSTS_STEEL, 1, CARBON, 10, CAST_STEEL_SET.DUST.asItem(), 1, "basic/cast_steel_2");

        metallurgic(yeet, INGOTS_GOLD, 1, INF_SILVER, 10, ELECTRUM_SET.DUST.asItem(), 1, "basic/electrum_1");
        metallurgic(yeet, DUSTS_GOLD, 1, INF_SILVER, 10, ELECTRUM_SET.DUST.asItem(), 1, "basic/electrum_2");
        metallurgic(yeet, ENRICHED_GOLD, 1, INF_SILVER, 40, ELECTRUM_SET.DUST.asItem(), 4, "basic/electrum_3");

        metallurgic(yeet, INGOTS_SILVER, 1, INF_ENERGETIC, 20, LUMIUM_SET.DUST.asItem(), 2, "infusion/lumium_1");
        metallurgic(yeet, DUSTS_SILVER, 1, INF_ENERGETIC, 20, LUMIUM_SET.DUST.asItem(), 2, "infusion/lumium_2");
        metallurgic(yeet, SILVER_ENRICHED, 1, INF_ENERGETIC, 40, LUMIUM_SET.DUST.asItem(), 4, "infusion/lumium_3");

        metallurgic(yeet, INGOTS_COPPER, 1, INF_ENERGETIC, 40, SIGNALUM_SET.DUST.asItem(), 2, "infusion/signalum_1");
        metallurgic(yeet, DUSTS_COPPER, 1, INF_ENERGETIC, 40, SIGNALUM_SET.DUST.asItem(), 2, "infusion/signalum_2");
        metallurgic(yeet, COPPER_ENRICHED, 1, INF_ENERGETIC, 40, SIGNALUM_SET.DUST.asItem(), 4, "infusion/signalum_3");

        metallurgic(yeet, INGOTS_LEAD, 1, INF_ENDERGETIC, 40, ENDERIUM_SET.DUST.asItem(), 2, "infusion/enderium_1");
        metallurgic(yeet, DUSTS_LEAD, 1, INF_ENDERGETIC, 40, ENDERIUM_SET.DUST.asItem(), 2, "infusion/enderium_2");
        metallurgic(yeet, LEAD_ENRICHED, 1, INF_ENDERGETIC, 60, ENDERIUM_SET.DUST.asItem(), 4, "infusion/enderium_3");

        metallurgic(yeet, INGOTS_NICKEL, 1, INF_COPPER, 20, CONSTANTAN_SET.DUST.asItem(), 2, "basic/constantan_1");
        metallurgic(yeet, DUSTS_NICKEL, 1, INF_COPPER, 20, CONSTANTAN_SET.DUST.asItem(), 2, "basic/constantan_2");
        metallurgic(yeet, NICKEL_ENRICHED, 1, INF_COPPER, 30, CONSTANTAN_SET.DUST.asItem(), 4, "infusion/constantan");

        metallurgic(yeet, INGOTS_GOLD, 2, INF_COPPER, 10, ROSE_GOLD_SET.DUST.asItem(), 3, "basic/rose_gold_1");
        metallurgic(yeet, DUSTS_GOLD, 2, INF_COPPER, 10, ROSE_GOLD_SET.DUST.asItem(), 3, "basic/rose_gold_2");
        metallurgic(yeet, ENRICHED_GOLD, 2, INF_COPPER, 20, ROSE_GOLD_SET.DUST.asItem(), 5, "infusion/rose_gold");

        metallurgic(yeet, INGOTS_COPPER, 3, TIN, 10, BRONZE_SET.DUST.asItem(), 4, "basic/bronze");
        metallurgic(yeet, COPPER_ENRICHED, 2, TIN, 10, BRONZE_SET.DUST.asItem(), 6, "infusion/bronze");

        metallurgic(yeet, INGOTS_TIN, 1, INF_COPPER, 20, PEWTER_SET.DUST.asItem(), 2, "basic/pewter_1");
        metallurgic(yeet, DUSTS_TIN, 1, INF_COPPER, 20, PEWTER_SET.DUST.asItem(), 2, "basic/pewter_2");
        metallurgic(yeet, TIN_ENRICHED, 1, INF_COPPER, 40, PEWTER_SET.DUST.asItem(), 4, "infusion/pewter");

        metallurgic(yeet, INGOTS_SILVER, 2, INF_COPPER, 10, BRITANNIA_SILVER_SET.DUST.asItem(), 3, "basic/britannia_1");
        metallurgic(yeet, DUSTS_SILVER, 2, INF_COPPER, 10, BRITANNIA_SILVER_SET.DUST.asItem(), 3, "basic/britannia_2");
        metallurgic(yeet, SILVER_SET.ENRICHED.get(), 1, INF_COPPER, 10, BRITANNIA_SILVER_SET.DUST.asItem(), 7, "basic/britannia");

        metallurgic(yeet, INGOTS_STEEL, 3, INF_NETHER_ENRICHED, 20, NETHERSTEEL_SET.DUST.asItem(), 2, "basic/nethersteel_1");
        metallurgic(yeet, DUSTS_STEEL, 7, INF_NETHER_ENRICHED, 20, NETHERSTEEL_SET.DUST.asItem(), 1, "basic/nethersteel_2");
    }
}
