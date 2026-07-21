package net.radzratz.eternalores.util.compat.powah.recipes;

import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.util.recipes.util.EORecipeInputs;
import owmii.powah.block.Blcks;
import owmii.powah.block.energizing.EnergizingRecipe;
import owmii.powah.item.Itms;

import java.util.Arrays;
import java.util.List;

import static net.neoforged.neoforge.common.Tags.Items.*;
import static net.radzratz.eternalores.util.EOMaterials.materialSets.URANINITE_SET;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipePaths.PATH;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Blends.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Ingots.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Ores.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.RawMaterials.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.StorageBlocks.*;
import static owmii.powah.data.ITags.Items.*;

public class EOEnergizingRecipes  {
    private static void orb(RecipeOutput output, Item rlt, int rCnt, int energy, String sfx, Object... inp) {
        if (rlt == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        List<Ingredient> inputs = Arrays.stream(inp).map(EORecipeInputs::itemTagInputs).toList();
        EnergizingRecipe bldr = new EnergizingRecipe(new ItemStack(rlt, rCnt), energy, inputs);

        yeet.withConditions(POWAH_MOD).accept(EO(PATH.PWHOrb() + sfx), bldr, null);
    }

    public static void generate(RecipeOutput output) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        orb(yeet, Blcks.ENERGIZED_STEEL.asItem(), 2, 90000, "block/energized_steel", STORAGE_BLOCKS_GOLD, STORAGE_BLOCKS_IRON);
        orb(yeet, Blcks.ENERGIZED_STEEL.asItem(), 4, 180000, "block/energized_steel_var_1", STORAGE_BLOCKS_GOLD, STORAGE_BLOCKS_IRON, STORAGE_BLOCKS_GOLD, STORAGE_BLOCKS_IRON);
        orb(yeet, Blcks.ENERGIZED_STEEL.asItem(), 6, 270000, "block/energized_steel_var_2", STORAGE_BLOCKS_GOLD, STORAGE_BLOCKS_IRON, STORAGE_BLOCKS_GOLD, STORAGE_BLOCKS_IRON, STORAGE_BLOCKS_GOLD, STORAGE_BLOCKS_IRON);

        orb(yeet, Blcks.BLAZING_CRYSTAL.asItem(), 1, 1080000, "block/blazing_crystal", ITEM_STORAGE_BLAZE);
        orb(yeet, Blcks.BLAZING_CRYSTAL.asItem(), 2, 2160000, "block/blazing_crystal_var_1", ITEM_STORAGE_BLAZE, ITEM_STORAGE_BLAZE);
        orb(yeet, Blcks.BLAZING_CRYSTAL.asItem(), 3, 3240000, "block/blazing_crystal_var_2", ITEM_STORAGE_BLAZE, ITEM_STORAGE_BLAZE, ITEM_STORAGE_BLAZE);
        orb(yeet, Blcks.BLAZING_CRYSTAL.asItem(), 4, 4320000, "block/blazing_crystal_var_3", ITEM_STORAGE_BLAZE, ITEM_STORAGE_BLAZE, ITEM_STORAGE_BLAZE, ITEM_STORAGE_BLAZE);
        orb(yeet, Blcks.BLAZING_CRYSTAL.asItem(), 5, 5400000, "block/blazing_crystal_var_4", ITEM_STORAGE_BLAZE, ITEM_STORAGE_BLAZE, ITEM_STORAGE_BLAZE, ITEM_STORAGE_BLAZE, ITEM_STORAGE_BLAZE);
        orb(yeet, Blcks.BLAZING_CRYSTAL.asItem(), 6, 6480000, "block/blazing_crystal_var_5", ITEM_STORAGE_BLAZE, ITEM_STORAGE_BLAZE, ITEM_STORAGE_BLAZE, ITEM_STORAGE_BLAZE, ITEM_STORAGE_BLAZE, ITEM_STORAGE_BLAZE);

        orb(yeet, Blcks.NIOTIC_CRYSTAL.asItem(), 1, 2700000, "block/niotic_crystal", STORAGE_BLOCKS_DIAMOND);
        orb(yeet, Blcks.NIOTIC_CRYSTAL.asItem(), 2, 5400000, "block/niotic_crystal_var_1", STORAGE_BLOCKS_DIAMOND, STORAGE_BLOCKS_DIAMOND);
        orb(yeet, Blcks.NIOTIC_CRYSTAL.asItem(), 3, 8100000, "block/niotic_crystal_var_2", STORAGE_BLOCKS_DIAMOND, STORAGE_BLOCKS_DIAMOND, STORAGE_BLOCKS_DIAMOND);
        orb(yeet, Blcks.NIOTIC_CRYSTAL.asItem(), 4, 10800000, "block/niotic_crystal_var_3", STORAGE_BLOCKS_DIAMOND, STORAGE_BLOCKS_DIAMOND, STORAGE_BLOCKS_DIAMOND, STORAGE_BLOCKS_DIAMOND);
        orb(yeet, Blcks.NIOTIC_CRYSTAL.asItem(), 5, 13500000, "block/niotic_crystal_var_4", STORAGE_BLOCKS_DIAMOND, STORAGE_BLOCKS_DIAMOND, STORAGE_BLOCKS_DIAMOND, STORAGE_BLOCKS_DIAMOND, STORAGE_BLOCKS_DIAMOND);
        orb(yeet, Blcks.NIOTIC_CRYSTAL.asItem(), 6, 16200000, "block/niotic_crystal_var_5", STORAGE_BLOCKS_DIAMOND, STORAGE_BLOCKS_DIAMOND, STORAGE_BLOCKS_DIAMOND, STORAGE_BLOCKS_DIAMOND, STORAGE_BLOCKS_DIAMOND, STORAGE_BLOCKS_DIAMOND);

        orb(yeet, Blcks.SPIRITED_CRYSTAL.asItem(), 1, 9000000, "block/spirited_crystal", STORAGE_BLOCKS_EMERALD);
        orb(yeet, Blcks.SPIRITED_CRYSTAL.asItem(), 2, 18000000, "block/spirited_crystal_var_1", STORAGE_BLOCKS_EMERALD, STORAGE_BLOCKS_EMERALD);
        orb(yeet, Blcks.SPIRITED_CRYSTAL.asItem(), 3, 27000000, "block/spirited_crystal_var_2", STORAGE_BLOCKS_EMERALD, STORAGE_BLOCKS_EMERALD, STORAGE_BLOCKS_EMERALD);
        orb(yeet, Blcks.SPIRITED_CRYSTAL.asItem(), 4, 36000000, "block/spirited_crystal_var_3", STORAGE_BLOCKS_EMERALD, STORAGE_BLOCKS_EMERALD, STORAGE_BLOCKS_EMERALD, STORAGE_BLOCKS_EMERALD);
        orb(yeet, Blcks.SPIRITED_CRYSTAL.asItem(), 5, 45000000, "block/spirited_crystal_var_4", STORAGE_BLOCKS_EMERALD, STORAGE_BLOCKS_EMERALD, STORAGE_BLOCKS_EMERALD, STORAGE_BLOCKS_EMERALD, STORAGE_BLOCKS_EMERALD);
        orb(yeet, Blcks.SPIRITED_CRYSTAL.asItem(), 5, 54000000, "block/spirited_crystal_var_5", STORAGE_BLOCKS_EMERALD, STORAGE_BLOCKS_EMERALD, STORAGE_BLOCKS_EMERALD, STORAGE_BLOCKS_EMERALD, STORAGE_BLOCKS_EMERALD, STORAGE_BLOCKS_EMERALD);

        orb(yeet, Itms.ENERGIZED_STEEL.get(), 4, 20000, "item/energized_steel", INGOTS_IRON, INGOTS_GOLD, INGOTS_IRON, INGOTS_GOLD);
        orb(yeet, Itms.ENERGIZED_STEEL.get(), 6, 30000, "item/energized_steel_var_1", INGOTS_IRON, INGOTS_GOLD, INGOTS_IRON, INGOTS_GOLD, INGOTS_IRON, INGOTS_GOLD);
        orb(yeet, Itms.ENERGIZED_STEEL.get(), 4, 15000, "item/energized_steel_var_2", INGOTS_IRON, INGOTS_GOLD, BLENDS_ENERGETIC);
        orb(yeet, Itms.ENERGIZED_STEEL.get(), 8, 60000, "item/energized_steel_var_3", INGOTS_IRON, INGOTS_GOLD, BLENDS_ENERGETIC, INGOTS_IRON, INGOTS_GOLD, BLENDS_ENERGETIC);
        orb(yeet, Itms.ENERGIZED_STEEL.get(), 4, 15000, "item/energized_steel_var_4", INGOTS_STEEL, INGOTS_STEEL, BLENDS_ENERGETIC);
        orb(yeet, Itms.ENERGIZED_STEEL.get(), 8, 60000, "item/energized_steel_var_5", INGOTS_STEEL, INGOTS_STEEL, BLENDS_ENERGETIC, INGOTS_STEEL, INGOTS_STEEL, BLENDS_ENERGETIC);

        orb(yeet, Itms.BLAZING_CRYSTAL.get(), 2, 240000, "item/blazing_crystal", RODS_BLAZE, RODS_BLAZE);
        orb(yeet, Itms.BLAZING_CRYSTAL.get(), 3, 360000, "item/blazing_crystal_var_1", RODS_BLAZE, RODS_BLAZE, RODS_BLAZE);
        orb(yeet, Itms.BLAZING_CRYSTAL.get(), 4, 480000, "item/blazing_crystal_var_2", RODS_BLAZE, RODS_BLAZE, RODS_BLAZE, RODS_BLAZE);
        orb(yeet, Itms.BLAZING_CRYSTAL.get(), 5, 600000, "item/blazing_crystal_var_3", RODS_BLAZE, RODS_BLAZE, RODS_BLAZE, RODS_BLAZE, RODS_BLAZE);
        orb(yeet, Itms.BLAZING_CRYSTAL.get(), 6, 720000, "item/blazing_crystal_var_4", RODS_BLAZE, RODS_BLAZE, RODS_BLAZE, RODS_BLAZE, RODS_BLAZE, RODS_BLAZE);

        orb(yeet, Itms.NIOTIC_CRYSTAL.get(), 2, 600000, "item/niotic_crystal", GEMS_DIAMOND, GEMS_DIAMOND);
        orb(yeet, Itms.NIOTIC_CRYSTAL.get(), 3, 1200000, "item/niotic_crystal_var_1", GEMS_DIAMOND, GEMS_DIAMOND, GEMS_DIAMOND);
        orb(yeet, Itms.NIOTIC_CRYSTAL.get(), 4, 1800000, "item/niotic_crystal_var_2", GEMS_DIAMOND, GEMS_DIAMOND, GEMS_DIAMOND, GEMS_DIAMOND);
        orb(yeet, Itms.NIOTIC_CRYSTAL.get(), 5, 2400000, "item/niotic_crystal_var_3", GEMS_DIAMOND, GEMS_DIAMOND, GEMS_DIAMOND, GEMS_DIAMOND, GEMS_DIAMOND);
        orb(yeet, Itms.NIOTIC_CRYSTAL.get(), 5, 3000000, "item/niotic_crystal_var_4", GEMS_DIAMOND, GEMS_DIAMOND, GEMS_DIAMOND, GEMS_DIAMOND, GEMS_DIAMOND, GEMS_DIAMOND);

        orb(yeet, Itms.SPIRITED_CRYSTAL.get(), 2, 2000000, "item/spirited_crystal", GEMS_EMERALD, GEMS_EMERALD);
        orb(yeet, Itms.SPIRITED_CRYSTAL.get(), 3, 3000000, "item/spirited_crystal_var_1", GEMS_EMERALD, GEMS_EMERALD, GEMS_EMERALD);
        orb(yeet, Itms.SPIRITED_CRYSTAL.get(), 4, 4000000, "item/spirited_crystal_var_2", GEMS_EMERALD, GEMS_EMERALD, GEMS_EMERALD, GEMS_EMERALD);
        orb(yeet, Itms.SPIRITED_CRYSTAL.get(), 5, 5000000, "item/spirited_crystal_var_3", GEMS_EMERALD, GEMS_EMERALD, GEMS_EMERALD, GEMS_EMERALD, GEMS_EMERALD);
        orb(yeet, Itms.SPIRITED_CRYSTAL.get(), 6, 6000000, "item/spirited_crystal_var_4", GEMS_EMERALD, GEMS_EMERALD, GEMS_EMERALD, GEMS_EMERALD, GEMS_EMERALD, GEMS_EMERALD);

        orb(yeet, URANINITE_SET.INGOT.get(), 2, 2000, "item/uraninite_raw", RAW_URANINITE);
        orb(yeet, URANINITE_SET.INGOT.get(), 3, 25000, "item/uraninite_poor", URANINITE_ORE_POOR);
        orb(yeet, URANINITE_SET.INGOT.get(), 1, 30000, "item/uraninite_uranium", INGOTS_URANIUM);
        orb(yeet, URANINITE_SET.INGOT.get(), 1, 50000, "item/uraninite_ore", ITEM_URANINITE_ORE);
        orb(yeet, URANINITE_SET.INGOT.get(), 1, 100000, "item/uraninite_dense", URANINITE_ORE_DENSE);
    }
}