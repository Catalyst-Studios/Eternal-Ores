package net.radzratz.eternalores.util.recipes.types;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.util.tags.item.EOItemTags;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static net.minecraft.tags.ItemTags.*;
import static net.minecraft.world.item.Items.*;
import static net.minecraft.world.item.Items.AMETHYST_SHARD;
import static net.minecraft.world.item.Items.COAL;
import static net.minecraft.world.item.Items.DIAMOND;
import static net.minecraft.world.item.Items.EMERALD;
import static net.minecraft.world.item.Items.SAND;
import static net.neoforged.neoforge.common.Tags.Items.*;
import static net.radzratz.eternalores.util.EOMaterials.materialNames.*;
import static net.radzratz.eternalores.util.EOMaterials.materialSets.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Blends.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Coals.COAL_COKE;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Common.MUSHROOM_BLOCKS;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.DustBlocks.ITEM_DUST_BLOCK_SILICON;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Dusts.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Fuels.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Ingots.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Items.*;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.StorageBlocks.*;

public class EOCommonRecipes {
    public enum Grp { DUST, ORE, ORE_PROC, BLOCK, SMALL_DUST, DUPLICATION, ALLOYS, PEARL, ROD, MISC, STAR, SCUTES, GEM, STORAGE, CRUSH, RECYCLE, DUST_BLOCK, GEM_SHARD, INGOT, BIO, COAL }

    public record Common(Object input, Item result, int resultCount, @Nullable Item byproduct, int byproductCount, String sfx, Grp grp) {}

    public record Alloys(
            Object input, int inputCount,
            @Nullable Object inputTwo, int inputTwoCount,
            @Nullable Object inputThree, int inputThreeCount,
            Item result, int resultCount, String sfx, Grp grp) {}

    public record Smeltables(TagKey<Item> input, Item result, String sfx, Grp grp) {}

     public record PulverizerChances(double[] mainNormal, double[] mainAdvanced, double[] byproductNormal, double[] byproductAdvanced) {}

     public record OreProcessing(
             Item primary, int primaryCount,
             Item byproduct, int byproductCount,
             @Nullable Item clump, @Nullable Item smallClump,
             @Nullable Item byproductSmallClump, @Nullable Item byproductDust, @Nullable Item byproductSmallDust,
             String sfx, Grp group,
             PulverizerChances chances) {}

     public static final List<Smeltables> SMELTABLES = List.of(
             new Smeltables(DUSTS_QUARTZ, SILICON_SET.ITEM.get(), "quartz", Grp.DUST),
             new Smeltables(DUSTS_AMETHYST, SILICON_SET.ITEM.get(), "amethyst", Grp.DUST),
             new Smeltables(DUSTS_COAL, GRAPHITE_SET.DUST.get(), "coal", Grp.DUST),
             new Smeltables(DUSTS_CLAY, BRICK, "brick", Grp.DUST),
             new Smeltables(DUSTS_BRICK, BRICK, "brick_var", Grp.DUST),
             new Smeltables(DUSTS_NETHERRACK, NETHER_BRICK, "nether_brick", Grp.DUST),
             new Smeltables(DUSTS_NETHER_BRICK, NETHER_BRICK, "nether_brick_var", Grp.DUST),
             new Smeltables(DUSTS_IRON, IRON_INGOT, "iron", Grp.DUST),
             new Smeltables(DUSTS_COPPER, COPPER_INGOT, "copper", Grp.DUST),
             new Smeltables(DUSTS_GOLD, GOLD_INGOT, "gold", Grp.DUST),
             new Smeltables(DUSTS_NETHERITE, NETHERITE_INGOT, "netherite", Grp.DUST),
             new Smeltables(ITEM_DUST_BLOCK_SILICON, SILICON_SET.BLOCK.get().asItem(), "silicon", Grp.STORAGE)
     );

    public static final List<Common> BASIC_CRUSHING = List.of(
            new Common(EOItemTags.RawMaterials.SULFUR, SULFUR_SET.DUST.get(), 1, null, 0, "sulfur", Grp.DUST),
            new Common(EOItemTags.Items.SILICON, SILICON_SET.DUST.get(), 1, null, 0, "silicon_var_1", Grp.DUST),
            new Common(COAL, COAL_SET.DUST.get(), 1, null, 0, "coal", Grp.DUST),
            new Common(CHARCOAL, CHARCOAL_SET.DUST.get(), 1, null, 0, "charcoal", Grp.DUST),
            new Common(NETHER_STAR, NETHER_STAR_SET.DUST.get(), 1, null, 0, "nether_star", Grp.DUST),
            new Common(SCULKS, SCULK_SET.DUST.get(), 1, null, 0, "sculk", Grp.DUST),
            new Common(BRICK, BRICK_SET.DUST.get(), 1, null, 0, "brick", Grp.DUST),
            new Common(NETHER_BRICK, NETHER_BRICK_SET.DUST.get(), 1, null, 0, "nether_brick", Grp.DUST),
            new Common(NAUTILUS_SHELL, NAUTILUS_SHELL_SET.DUST.get(), 1, null, 0, "nautilus", Grp.DUST),
            new Common(FLINT, FLINT_SET.DUST.get(), 1, null, 0, "flint", Grp.DUST),
            new Common(CLAY_BALL, CLAY_SET.DUST.get(), 1, null, 0, "clay", Grp.DUST),
            new Common(POINTED_DRIPSTONE, DRIPSTONE_SET.DUST.get(), 1, null, 0, "dripstone", Grp.DUST),
            new Common(SHULKER_SHELL, SHULKER_SHELL_SET.DUST.get(), 1, null, 0, "shulker", Grp.DUST),
            new Common(NETHERRACKS, NETHERRACK_SET.DUST.get(), 1, null, 0, "netherrack", Grp.DUST),
            new Common(BASALT, BASALT_SET.DUST.get(), 1, null, 0, "basalt", Grp.DUST),
            new Common(BLACKSTONE, BLACKSTONE_SET.DUST.get(), 1, null, 0, "blackstone", Grp.DUST),
            new Common(PURPUR_BLOCK, PURPUR_SET.DUST.get(), 1, null, 0, "purpur", Grp.DUST),
            new Common(ENDER_PEARLS, ENDER_PEARL_SET.DUST.get(), 1, null, 0, "ender", Grp.DUST),
            new Common(WARPED_WART_BLOCK, WARPED_NETHER_WART_SET.DUST.get(), 1, null, 0, "warped_nether_wart", Grp.DUST),
            new Common(NETHER_WART_BLOCK, NETHER_WART_SET.DUST.get(), 1, null, 0, "nether_wart", Grp.DUST),
            new Common(OBSIDIANS, OBSIDIAN_SET.DUST.get(), 4, null, 0, "obsidian_var", Grp.DUST),
            new Common(END_STONES, END_STONE_SET.DUST.get(), 1, null, 0, "end_stone", Grp.DUST),
            new Common(BONES, BONE_MEAL, 6, CALCIUM_SET.DUST.get(), 1, "calcium", Grp.DUST),
            new Common(BISMUTH, BISMUTH_SET.DUST.get(), 1, null, 0, "bismuth", Grp.CRUSH),
            new Common(FLINT_SET.DUST.get(), GUNPOWDER.asItem(), 1, null, 0, "gunpowder", Grp.CRUSH),
            new Common(DARK_PRISMARINE.asItem(), PRISMARINE_SHARD.asItem(), 8, null, 0, "dark_prismarine", Grp.CRUSH),
            new Common(PRISMARINE.asItem(), PRISMARINE_SHARD.asItem(), 4, null, 0, "prismarine_block", Grp.CRUSH),
            new Common(PRISMARINE_BRICKS.asItem(), PRISMARINE_SHARD.asItem(), 9, null, 0, "prismarine_brick", Grp.CRUSH),

            new Common(STONE, COBBLESTONE, 1, STONE_SET.SMALL_DUST.get(), 2, "cobblestone", Grp.BLOCK),
            new Common(ANDESITE, COBBLESTONE, 1, STONE_SET.SMALL_DUST.get(), 2, "cobblestone_var_1", Grp.BLOCK),
            new Common(TUFF, COBBLESTONE, 1, TUFF_SET.SMALL_DUST.get(), 2, "cobblestone_var_2", Grp.BLOCK),
            new Common(DIORITE, COBBLESTONE, 1, DIORITE_SET.SMALL_DUST.get(), 2, "cobblestone_var_3", Grp.BLOCK),
            new Common(DEEPSLATE, COBBLED_DEEPSLATE, 1, DEEPSLATE_SET.SMALL_DUST.get(), 2, "cobbled_deepslate", Grp.BLOCK),
            new Common(COBBLESTONES, GRAVEL, 1, STONE_SET.SMALL_DUST.get(), 2, "gravel", Grp.BLOCK),
            new Common(GRAVELS, SAND, 1, STONE_SET.SMALL_DUST.get(), 2, "sand", Grp.BLOCK),
            new Common(GRANITE, RED_SAND, 1, GRANITE_SET.SMALL_DUST.get(), 2, "red_sand", Grp.BLOCK),
            new Common(SAND, DUST_SET.BLOCK.get().asItem(), 1, SAND_SET.SMALL_DUST.get(), 2, "dust", Grp.BLOCK),
            new Common(RED_SAND, DUST_SET.BLOCK.get().asItem(), 1, RED_SAND_SET.SMALL_DUST.get(), 2, "dust_var", Grp.BLOCK),

            new Common(ITEM_STORAGE_COAL_COKE, COKE_SET.DUST_BLOCK.get().asItem(), 1, null, 0, "coal_coke", Grp.DUST_BLOCK),

            new Common(NUGGETS_IRON, IRON_SET.SMALL_DUST.get(), 1, null, 0, "iron", Grp.SMALL_DUST),
            new Common(NUGGETS_GOLD, GOLD_SET.SMALL_DUST.get(), 1, null, 0, "gold", Grp.SMALL_DUST),

            new Common(STONE_SET.PEBBLE.get(), STONE_SET.SMALL_DUST.get(), 2, null, 0, "stone_pebble", Grp.SMALL_DUST),
            new Common(ANDESITE_SET.PEBBLE.get(), ANDESITE_SET.SMALL_DUST.get(), 2, null, 0, "andesite_pebble", Grp.SMALL_DUST),
            new Common(BASALT_SET.PEBBLE.get(), BASALT_SET.SMALL_DUST.get(), 2, null, 0, "basalt_pebble", Grp.SMALL_DUST),
            new Common(BLACKSTONE_SET.PEBBLE.get(), BLACKSTONE_SET.SMALL_DUST.get(), 2, null, 0, "blackstone_pebble", Grp.SMALL_DUST),
            new Common(CALCITE_SET.PEBBLE.get(), CALCITE_SET.SMALL_DUST.get(), 2, null, 0, "calcite_pebble", Grp.SMALL_DUST),
            new Common(DEEPSLATE_SET.PEBBLE.get(), DEEPSLATE_SET.SMALL_DUST.get(), 2, null, 0, "deepslate_pebble", Grp.SMALL_DUST),
            new Common(DIORITE_SET.PEBBLE.get(), DIORITE_SET.SMALL_DUST.get(), 2, null, 0, "diorite_pebble", Grp.SMALL_DUST),
            new Common(END_STONE_SET.PEBBLE.get(), END_STONE_SET.SMALL_DUST.get(), 2, null, 0, "end_stone_pebble", Grp.SMALL_DUST),
            new Common(GRANITE_SET.PEBBLE.get(), GRANITE_SET.SMALL_DUST.get(), 2, null, 0, "granite_pebble", Grp.SMALL_DUST),
            new Common(NETHERRACK_SET.PEBBLE.get(), NETHERRACK_SET.SMALL_DUST.get(), 2, null, 0, "netherrack_pebble", Grp.SMALL_DUST),
            new Common(TUFF_SET.PEBBLE.get(), TUFF_SET.SMALL_DUST.get(), 2, null, 0, "tuff_pebble", Grp.SMALL_DUST),

            new Common(INGOTS_REDSTONE, REDSTONE.asItem(), 1, null, 0, "redstone", Grp.DUST)
    );

    public static final List<Common> HAMMER_CRUSHING = List.of(
            new Common(EOItemTags.RawMaterials.SULFUR, SULFUR_SET.DUST.get(), 1, null, 0, "sulfur", Grp.CRUSH),
            new Common(EOItemTags.Items.SILICON, SILICON_SET.DUST.get(), 1, null, 0, "silicon_var_1", Grp.CRUSH),
            new Common(COAL, COAL_SET.DUST.get(), 1, null, 0, "coal", Grp.CRUSH),
            new Common(CHARCOAL, CHARCOAL_SET.DUST.get(), 1, null, 0, "charcoal", Grp.CRUSH),
            new Common(NETHER_STAR, NETHER_STAR_SET.DUST.get(), 1, null, 0, "nether_star", Grp.CRUSH),
            new Common(SCULKS, SCULK_SET.DUST.get(), 1, null, 0, "sculk", Grp.CRUSH),
            new Common(BRICK, BRICK_SET.DUST.get(), 1, null, 0, "brick", Grp.CRUSH),
            new Common(NETHER_BRICK, NETHER_BRICK_SET.DUST.get(), 1, null, 0, "nether_brick", Grp.CRUSH),
            new Common(NAUTILUS_SHELL, NAUTILUS_SHELL_SET.DUST.get(), 1, null, 0, "nautilus", Grp.CRUSH),
            new Common(FLINT, FLINT_SET.DUST.get(), 1, null, 0, "flint", Grp.CRUSH),
            new Common(CLAY_BALL, CLAY_SET.DUST.get(), 1, null, 0, "clay", Grp.CRUSH),
            new Common(POINTED_DRIPSTONE, DRIPSTONE_SET.DUST.get(), 1, null, 0, "dripstone", Grp.CRUSH),
            new Common(SHULKER_SHELL, SHULKER_SHELL_SET.DUST.get(), 1, null, 0, "shulker", Grp.CRUSH),
            new Common(NETHERRACKS, NETHERRACK_SET.DUST.get(), 1, null, 0, "netherrack", Grp.CRUSH),
            new Common(BASALT, BASALT_SET.DUST.get(), 1, null, 0, "basalt", Grp.CRUSH),
            new Common(BLACKSTONE, BLACKSTONE_SET.DUST.get(), 1, null, 0, "blackstone", Grp.CRUSH),
            new Common(PURPUR_BLOCK, PURPUR_SET.DUST.get(), 1, null, 0, "purpur", Grp.CRUSH),
            new Common(ENDER_PEARLS, ENDER_PEARL_SET.DUST.get(), 1, null, 0, "ender", Grp.CRUSH),
            new Common(WARPED_WART_BLOCK, WARPED_NETHER_WART_SET.DUST.get(), 1, null, 0, "warped_nether_wart", Grp.CRUSH),
            new Common(NETHER_WART_BLOCK, NETHER_WART_SET.DUST.get(), 1, null, 0, "nether_wart", Grp.CRUSH),
            new Common(OBSIDIANS, OBSIDIAN_SET.DUST.get(), 1, null, 0, "obsidian_var", Grp.CRUSH),
            new Common(END_STONES, END_STONE_SET.DUST.get(), 1, null, 0, "end_stone", Grp.CRUSH),
            new Common(DIORITE, DIORITE_SET.DUST.get(), 1, null, 0, "diorite", Grp.CRUSH),
            new Common(GRANITE, GRANITE_SET.DUST.get(), 1, null, 0, "granite", Grp.CRUSH),
            new Common(TUFF, TUFF_SET.DUST.get(), 1, null, 0, "tuff", Grp.CRUSH),
            new Common(STONE, STONE_SET.DUST.get(), 1, null, 0, "stone", Grp.CRUSH),
            new Common(BONES, CALCIUM_SET.DUST.get(), 1, null, 0, "calcium", Grp.CRUSH),
            new Common(ANDESITE_SET.GEAR.get(), ANDESITE_SET.DUST.get(), 1, null, 0, "andesite_gear", Grp.RECYCLE),
            new Common(ANDESITE_SET.PLATE.get(), ANDESITE_SET.DUST.get(), 1, null, 0, "andesite_plate", Grp.RECYCLE),
            new Common(ANDESITE_SET.ROD.get(), ANDESITE_SET.DUST.get(), 1, null, 0, "andesite_rod", Grp.RECYCLE),
            new Common(BASALT_SET.GEAR.get(), BASALT_SET.DUST.get(), 1, null, 0, "basalt_gear", Grp.RECYCLE),
            new Common(BASALT_SET.ROD.get(), BASALT_SET.DUST.get(), 1, null, 0, "basalt_rod", Grp.RECYCLE),
            new Common(BASALT_SET.PLATE.get(), BASALT_SET.DUST.get(), 1, null, 0, "basalt_plate", Grp.RECYCLE),
            new Common(BLACKSTONE_SET.GEAR.get(), BLACKSTONE_SET.DUST.get(), 1, null, 0, "blackstone_gear", Grp.RECYCLE),
            new Common(BLACKSTONE_SET.ROD.get(), BLACKSTONE_SET.DUST.get(), 1, null, 0, "blackstone_rod", Grp.RECYCLE),
            new Common(BLACKSTONE_SET.PLATE.get(), BLACKSTONE_SET.DUST.get(), 1, null, 0, "blackstone_plate", Grp.RECYCLE),
            new Common(CALCITE_SET.GEAR.get(), CALCITE_SET.DUST.get(), 1, null, 0, "calcite_gear", Grp.RECYCLE),
            new Common(CALCITE_SET.ROD.get(), CALCITE_SET.DUST.get(), 1, null, 0, "calcite_rod", Grp.RECYCLE),
            new Common(CALCITE_SET.PLATE.get(), CALCITE_SET.DUST.get(), 1, null, 0, "calcite_plate", Grp.RECYCLE),
            new Common(DIORITE_SET.GEAR.get(), DIORITE_SET.DUST.get(), 1, null, 0, "diorite_gear", Grp.RECYCLE),
            new Common(DIORITE_SET.ROD.get(), DIORITE_SET.DUST.get(), 1, null, 0, "diorite_rod", Grp.RECYCLE),
            new Common(DIORITE_SET.PLATE.get(), DIORITE_SET.DUST.get(), 1, null, 0, "diorite_plate", Grp.RECYCLE),
            new Common(DEEPSLATE_SET.GEAR.get(), DEEPSLATE_SET.DUST.get(), 1, null, 0, "deepslate_gear", Grp.RECYCLE),
            new Common(DEEPSLATE_SET.ROD.get(), DEEPSLATE_SET.DUST.get(), 1, null, 0, "deepslate_rod", Grp.RECYCLE),
            new Common(DEEPSLATE_SET.PLATE.get(), DEEPSLATE_SET.DUST.get(), 1, null, 0, "deepslate_plate", Grp.RECYCLE),
            new Common(GRANITE_SET.GEAR.get(), GRANITE_SET.DUST.get(), 1, null, 0, "granite_gear", Grp.RECYCLE),
            new Common(GRANITE_SET.ROD.get(), GRANITE_SET.DUST.get(), 1, null, 0, "granite_rod", Grp.RECYCLE),
            new Common(GRANITE_SET.PLATE.get(), GRANITE_SET.DUST.get(), 1, null, 0, "granite_plate", Grp.RECYCLE),
            new Common(END_STONE_SET.GEAR.get(), END_STONE_SET.DUST.get(), 1, null, 0, "end_stone_gear", Grp.RECYCLE),
            new Common(END_STONE_SET.ROD.get(), END_STONE_SET.DUST.get(), 1, null, 0, "end_stone_rod", Grp.RECYCLE),
            new Common(END_STONE_SET.PLATE.get(), END_STONE_SET.DUST.get(), 1, null, 0, "end_stone_plate", Grp.RECYCLE),
            new Common(NETHERRACK_SET.GEAR.get(), NETHERRACK_SET.DUST.get(), 1, null, 0, "netherrack_gear", Grp.RECYCLE),
            new Common(NETHERRACK_SET.ROD.get(), NETHERRACK_SET.DUST.get(), 1, null, 0, "netherrack_rod", Grp.RECYCLE),
            new Common(NETHERRACK_SET.PLATE.get(), NETHERRACK_SET.DUST.get(), 1, null, 0, "netherrack_plate", Grp.RECYCLE),
            new Common(STONE_SET.GEAR.get(), STONE_SET.DUST.get(), 1, null, 0, "stone_gear", Grp.RECYCLE),
            new Common(STONE_SET.ROD.get(), STONE_SET.DUST.get(), 1, null, 0, "stone_rod", Grp.RECYCLE),
            new Common(STONE_SET.PLATE.get(), STONE_SET.DUST.get(), 1, null, 0, "stone_plate", Grp.RECYCLE),
            new Common(TUFF_SET.GEAR.get(), TUFF_SET.DUST.get(), 1, null, 0, "tuff_gear", Grp.RECYCLE),
            new Common(TUFF_SET.ROD.get(), TUFF_SET.DUST.get(), 1, null, 0, "tuff_rod", Grp.RECYCLE),
            new Common(TUFF_SET.PLATE.get(), TUFF_SET.DUST.get(), 1, null, 0, "tuff_plate", Grp.RECYCLE)
    );

    public static final List<Common> SHAPELESS = List.of(
            new Common(ITEM_STORAGE_ENDER_PEARL, ENDER_PEARL, 9, null, 0, "ender_pearl", Grp.PEARL),
            new Common(ITEM_STORAGE_BLAZE, BLAZE_ROD, 9, null, 0, "blaze", Grp.ROD),
            new Common(ITEM_STORAGE_SUGAR, SUGAR, 9, null, 0, "sugar", Grp.MISC),
            new Common(ITEM_STORAGE_FLINT, FLINT, 9, null, 0, "flint", Grp.MISC),
            new Common(ITEM_STORAGE_NETHER_STAR, NETHER_STAR, 9, null, 0, "nether_star", Grp.STAR),
            new Common(ITEM_STORAGE_NAUTILUS, NAUTILUS_SHELL, 9, null, 0, "nautilus", Grp.SCUTES),
            new Common(ITEM_STORAGE_ARMADILLO_SCUTE, ARMADILLO_SCUTE, 9, null, 0, "armadillo", Grp.SCUTES),
            new Common(ITEM_STORAGE_TURTLE_SCUTE, TURTLE_SCUTE, 9, null, 0, "turtle", Grp.SCUTES),
            new Common(ITEM_STORAGE_QUARTZ, QUARTZ, 4, null, 0, "quartz", Grp.GEM),
            new Common(ITEM_STORAGE_AMETHYST, AMETHYST_SHARD, 4, null, 0, "amethyst", Grp.GEM),
            new Common(GRAVEL, GRAVEL_SET.DUST.get(), 9, null, 0, "gravel", Grp.DUST),
            new Common(ITEM_STORAGE_SILICON, SILICON_SET.ITEM.get(), 9, null, 0, "silicon", Grp.MISC),
            new Common(ITEM_STORAGE_SILICON_INGOT, SILICON_SET.INGOT.get(), 9, null, 0, "silicon_ingot", Grp.MISC),
            new Common(ITEM_STORAGE_BIOMASS, BIOMASS_SET.ITEM.get(), 9, null, 0, "biomass", Grp.MISC),
            new Common(SAND, SAND_SET.DUST.get(), 9, null, 0, "sand", Grp.MISC),
            new Common(RED_SAND, RED_SAND_SET.DUST.get(), 9, null, 0, "red_sand", Grp.MISC),
            new Common(SOUL_SAND, SOUL_SAND_SET.DUST.get(), 9, null, 0, "soul_sand", Grp.MISC),
            new Common(BLAZE_SET.DUST_BLOCK.get().asItem(), BLAZE_POWDER, 9, null, 0, "blaze", Grp.DUST),
            new Common(ENDER_EYE_SET.BLOCK.get().asItem(), ENDER_EYE, 9, null, 0, "ender_eye", Grp.PEARL),
            new Common(ITEM_STORAGE_DUST, DUST_SET.DUST.get(), 9, null, 0, "dust", Grp.DUST),
            new Common(ROTTEN_FLESH_SET.BLOCK.get().asItem(), ROTTEN_FLESH, 9, null, 0, "rotten_flesh", Grp.SCUTES),
            new Common(PHANTOM_MEMBRANE_SET.BLOCK.get().asItem(), PHANTOM_MEMBRANE, 9, null, 0, "phantom_membrane", Grp.SCUTES),
            new Common(REDSTONE_SET.REDSTONE_BLOCK.get().asItem(), REDSTONE_SET.INGOT.get(), 9, null, 0, "redstone", Grp.INGOT),
            new Common(REDSTONE, REDSTONE_SET.SMALL_DUST.get(), 9, null, 0, "redstone", Grp.SMALL_DUST),
            new Common(DUSTS_BLAZE, BLAZE_SET.SMALL_DUST.get(), 9, null, 0, "blaze", Grp.SMALL_DUST),
            new Common(PRISMARINE_SET.BLOCK.get().asItem(), PRISMARINE_CRYSTALS.asItem(), 9, null, 0, "prismarine", Grp.GEM),
            new Common(ITEM_STORAGE_SALT, SALT_SET.DUST.get(), 4, null, 0, "salt", Grp.DUST),
            new Common(CADMIUM_SET.BLOCK.get().asItem(), CADMIUM_SET.DUST.get(), 9, null, 0, "cadmium", Grp.DUST),
            new Common(SELENIUM_SET.BLOCK.get().asItem(), SELENIUM_SET.DUST.get(), 9, null, 0, "selenium", Grp.DUST),
            new Common(CALIFORNIUM_SET.BLOCK.get().asItem(), CALIFORNIUM_SET.DUST.get(), 9, null, 0, "californium", Grp.DUST),
            new Common(CALCIUM_SET.BLOCK.get().asItem(), CALCIUM_SET.DUST.get(), 9, null, 0, "calcium", Grp.DUST),
            new Common(PHOSPHORUS_SET.BLOCK.get().asItem(), PHOSPHORUS_SET.DUST.get(), 9, null, 0, "phosphorus", Grp.DUST),
            new Common(RARE_EARTH_SET.BLOCK.get().asItem(), RARE_EARTH_SET.DUST.get(), 9, null, 0, "rare_earth", Grp.DUST),
            new Common(CERIUM_SET.BLOCK.get().asItem(), CERIUM_SET.DUST.get(), 9, null, 0, "cerium", Grp.DUST),
            new Common(ITEM_STORAGE_COAL_COKE, COKE_SET.COAL.get(), 9, null, 0, "coal_coke", Grp.COAL),
            new Common(COKE_SET.DUST_BLOCK.get().asItem(), COKE_SET.DUST.get(), 9, null, 0, "coal_coke", Grp.DUST),
            new Common(COKE_SET.DUST.get().asItem(), COKE_SET.SMALL_DUST.get(), 9, null, 0, "coal_coke", Grp.SMALL_DUST)
    );

    public static final List<Common> SHAPED = List.of(
            new Common(ARMADILLO_SCUTE, ARMADILLO_SCUTE_SET.BLOCK.asItem(), 1, null, 0, "armadillo", Grp.STORAGE),
            new Common(TURTLE_SCUTE, TURTLE_SET.BLOCK.asItem(), 1, null, 0, "turtle", Grp.STORAGE),
            new Common(NAUTILUS_SHELL, NAUTILUS_SHELL_SET.BLOCK.asItem(), 1, null, 0, "nautilus", Grp.STORAGE),
            new Common(ENDER_PEARLS, ENDER_PEARL_SET.BLOCK.asItem(), 1, null, 0, "ender_pearl", Grp.STORAGE),
            new Common(RODS_BLAZE, BLAZE_SET.BLOCK.asItem(), 1, null, 0, "blaze", Grp.STORAGE),
            new Common(NETHER_STAR, NETHER_STAR_SET.BLOCK.asItem(), 1, null, 0, "nether_star", Grp.STORAGE),
            new Common(FLINT, FLINT_SET.BLOCK.asItem(), 1, null, 0, "flint", Grp.STORAGE),
            new Common(SUGAR, SUGAR_SET.BLOCK.asItem(), 1, null, 0, "sugar", Grp.STORAGE),
            new Common(DUSTS_GRAVEL, GRAVEL, 1, null, 0, "gravel", Grp.STORAGE),
            new Common(EOItemTags.Coals.CHARCOAL, CHARCOAL_SET.COAL_BLOCK.asItem(), 1, null, 0, "charcoal", Grp.STORAGE),
            new Common(INGOTS_SILICON, SILICON_SET.BLOCK.asItem(), 1, null, 0, "silicon_ingot", Grp.STORAGE),
            new Common(EOItemTags.Items.SILICON, SILICON_SET.BLOCK_TWO.asItem(), 1, null, 0, "silicon", Grp.STORAGE),
            new Common(FUELS_BIO, BIOMASS_SET.BLOCK.asItem(), 1, null, 0, "biomass", Grp.STORAGE),
            new Common(DUSTS_SAND, SAND, 1, null, 0, "sand", Grp.STORAGE),
            new Common(DUSTS_SOUL_SAND, SOUL_SAND, 1, null, 0, "soul_sand", Grp.STORAGE),
            new Common(DUSTS_RED_SAND, RED_SAND, 1, null, 0, "red_sand", Grp.STORAGE),
            new Common(ENDER_EYE, ENDER_EYE_SET.BLOCK.get().asItem(), 1, null, 0, "ender_eye", Grp.STORAGE),
            new Common(DUSTS_DUST, DUST_SET.BLOCK.get().asItem(), 1, null, 0, "dust", Grp.STORAGE),
            new Common(ROTTEN_FLESH, ROTTEN_FLESH_SET.BLOCK.get().asItem(), 1, null, 0, "rotten_flesh", Grp.STORAGE),
            new Common(PHANTOM_MEMBRANE, PHANTOM_MEMBRANE_SET.BLOCK.get().asItem(), 1, null, 0, "phantom_membrane", Grp.STORAGE),
            new Common(INGOTS_REDSTONE, REDSTONE_SET.REDSTONE_BLOCK.get().asItem(), 1, null, 0, "redstone", Grp.STORAGE),
            new Common(REDSTONE_SET.SMALL_DUST.get(), REDSTONE.asItem(), 1, null, 0, "redstone", Grp.DUST),
            new Common(BLAZE_SET.SMALL_DUST.get(), BLAZE_POWDER.asItem(), 1, null, 0, "blaze", Grp.DUST),
            new Common(GEMS_PRISMARINE, PRISMARINE_SET.BLOCK.get().asItem(), 1, null, 0, "prismarine", Grp.STORAGE),
            new Common(CADMIUM_SET.DUST.get().asItem(), CADMIUM_SET.BLOCK.get().asItem(), 1, null, 0, "cadmium", Grp.STORAGE),
            new Common(SELENIUM_SET.DUST.get().asItem(), SELENIUM_SET.BLOCK.get().asItem(), 1, null, 0, "selenium", Grp.STORAGE),
            new Common(CALIFORNIUM_SET.DUST.get().asItem(), CALIFORNIUM_SET.BLOCK.get().asItem(), 1, null, 0, "californium", Grp.STORAGE),
            new Common(CALCIUM_SET.DUST.get().asItem(), CALCIUM_SET.BLOCK.get().asItem(), 1, null, 0, "calcium", Grp.STORAGE),
            new Common(PHOSPHORUS_SET.DUST.get().asItem(), PHOSPHORUS_SET.BLOCK.get().asItem(), 1, null, 0, "phosphorus", Grp.STORAGE),
            new Common(RARE_EARTH_SET.DUST.get().asItem(), RARE_EARTH_SET.BLOCK.get().asItem(), 1, null, 0, "rare_earth", Grp.STORAGE),
            new Common(CERIUM_SET.DUST.get().asItem(), CERIUM_SET.BLOCK.get().asItem(), 1, null, 0, "cerium", Grp.STORAGE),
            new Common(COAL_COKE, COKE_SET.COAL_BLOCK.get().asItem(), 1, null, 0, "coal_coke", Grp.STORAGE),
            new Common(DUSTS_COKE, COKE_SET.DUST_BLOCK.get().asItem(), 1, null, 0, "coal_coke", Grp.DUST_BLOCK),
            new Common(COKE_SET.SMALL_DUST.get(), COKE_SET.DUST.get().asItem(), 1, null, 0, "coal_coke", Grp.DUST),
            new Common(FLUORITE_SET.GEM_SHARD.get(), FLUORITE_SET.GEM.get(), 1, null, 0, "fluorite", Grp.GEM)
    );

    public static final List<Common> BIO_FUEL_BASIC = List.of(
            new Common(APPLE.asItem(), BIOMASS_SET.ITEM.get(), 2, null, 0, "apple", Grp.BIO),
            new Common(GOLDEN_APPLE.asItem(), BIOMASS_SET.ITEM.get(), 4, GOLD_SET.SMALL_DUST.get(), 3, "golden_apple", Grp.BIO),
            new Common(ENCHANTED_GOLDEN_APPLE.asItem(), BIOMASS_SET.BLOCK.get().asItem(), 1, GOLD_SET.DUST.get(), 1, "enchanted_golden_apple", Grp.BIO),
            new Common(SAPLINGS, BIOMASS_SET.ITEM.get(), 1, null, 0, "saplings", Grp.BIO),
            new Common(LEAVES, BIOMASS_SET.ITEM.get(), 1, null, 0, "leaves", Grp.BIO),
            new Common(MOSS_BLOCK.asItem(), BIOMASS_SET.ITEM.get(), 3, null, 0, "moss", Grp.BIO),
            new Common(MOSS_CARPET.asItem(), BIOMASS_SET.ITEM.get(), 1, null, 0, "moss_carpet", Grp.BIO),
            new Common(CRIMSON_NYLIUM.asItem(), BIOMASS_SET.ITEM.get(), 1, NETHERRACK_SET.DUST.get(), 1, "crimson_nylium", Grp.BIO),
            new Common(WARPED_NYLIUM.asItem(), BIOMASS_SET.ITEM.get(), 1, NETHERRACK_SET.DUST.get(), 1, "warped_nylium", Grp.BIO),
            new Common(MUSHROOM_BLOCKS, BIOMASS_SET.ITEM.get(), 1, null, 0, "mushroom_blocks", Grp.BIO),
            new Common(MUSHROOMS, BIOMASS_SET.ITEM.get(), 1, null, 0, "mushrooms", Grp.BIO),
            new Common(CRIMSON_FUNGUS, BIOMASS_SET.ITEM.get(), 1, null, 0, "crimson_fungus", Grp.BIO),
            new Common(WARPED_FUNGUS, BIOMASS_SET.ITEM.get(), 1, null, 0, "warped_fungus", Grp.BIO),
            new Common(MANGROVE_ROOTS, BIOMASS_SET.ITEM.get(), 2, null, 0, "mangrove_roots", Grp.BIO),
            new Common(MUDDY_MANGROVE_ROOTS, BIOMASS_SET.ITEM.get(), 2, MUD.asItem(), 1, "muddy_mangrove_roots", Grp.BIO),
            new Common(SHROOMLIGHT, BIOMASS_SET.ITEM.get(), 5, null, 0, "shroomlight", Grp.BIO),
            new Common(DUSTS_WARPED_NETHER_WART, BIOMASS_SET.ITEM.get(), 2, null, 0, "warped_nether_wart_dust", Grp.BIO),
            new Common(DUSTS_NETHER_WART, BIOMASS_SET.ITEM.get(), 2, null, 0, "nether_wart_dust", Grp.BIO),
            new Common(SMALL_FLOWERS, BIOMASS_SET.ITEM.get(), 1, null, 0, "small_flowers", Grp.BIO),
            new Common(TALL_FLOWERS, BIOMASS_SET.ITEM.get(), 2, null, 0, "tall_flowers", Grp.BIO),
            new Common(SHORT_GRASS.asItem(), BIOMASS_SET.ITEM.get(), 1, null, 0, "short_grass", Grp.BIO),
            new Common(TALL_GRASS.asItem(), BIOMASS_SET.ITEM.get(), 2, null, 0, "tall_grass", Grp.BIO),
            new Common(FERN.asItem(), BIOMASS_SET.ITEM.get(), 1, null, 0, "fern", Grp.BIO),
            new Common(LARGE_FERN.asItem(), BIOMASS_SET.ITEM.get(), 2, null, 0, "large_fern", Grp.BIO),
            new Common(BAMBOO.asItem(), BIOMASS_SET.ITEM.get(), 2, null, 0, "bamboo", Grp.BIO),
            new Common(CROPS_SUGAR_CANE, BIOMASS_SET.ITEM.get(), 1, null, 0, "sugar_canes", Grp.BIO),
            new Common(CRIMSON_ROOTS.asItem(), BIOMASS_SET.ITEM.get(), 1, null, 0, "crimson_roots", Grp.BIO),
            new Common(WARPED_ROOTS.asItem(), BIOMASS_SET.ITEM.get(), 1, null, 0, "warped_roots", Grp.BIO),
            new Common(NETHER_SPROUTS, BIOMASS_SET.ITEM.get(), 1, null, 0, "nether_sprouts", Grp.BIO),
            new Common(WEEPING_VINES.asItem(), BIOMASS_SET.ITEM.get(), 1, null, 0, "weeping_vines", Grp.BIO),
            new Common(TWISTING_VINES.asItem(), BIOMASS_SET.ITEM.get(), 1, null, 0, "twisting_vines", Grp.BIO),
            new Common(VINE, BIOMASS_SET.ITEM.get(), 1, null, 0, "vines", Grp.BIO),
            new Common(BIG_DRIPLEAF.asItem(), BIOMASS_SET.ITEM.get(), 3, null, 0, "big_dripleaf", Grp.BIO),
            new Common(SMALL_DRIPLEAF.asItem(), BIOMASS_SET.ITEM.get(), 1, null, 0, "small_dripleaf", Grp.BIO),
            new Common(CHORUS_PLANT.asItem(), BIOMASS_SET.ITEM.get(), 2, null, 0, "chorus_plant", Grp.BIO),
            new Common(CHORUS_FLOWER.asItem(), BIOMASS_SET.ITEM.get(), 4, null, 0, "chorus_flower", Grp.BIO),
            new Common(GLOW_LICHEN.asItem(), BIOMASS_SET.ITEM.get(), 1, null, 0, "glow_lichen", Grp.BIO),
            new Common(HANGING_ROOTS.asItem(), BIOMASS_SET.ITEM.get(), 1, null, 0, "hanging_roots", Grp.BIO),
            new Common(LILY_PAD.asItem(), BIOMASS_SET.ITEM.get(), 1, null, 0, "lily_pad", Grp.BIO),
            new Common(SEAGRASS.asItem(), BIOMASS_SET.ITEM.get(), 1, null, 0, "seagrass", Grp.BIO),
            new Common(SEA_PICKLE.asItem(), BIOMASS_SET.ITEM.get(), 1, null, 0, "sea_pickle", Grp.BIO),
            new Common(KELP.asItem(), BIOMASS_SET.ITEM.get(), 1, null, 0, "kelp", Grp.BIO),
            new Common(DRIED_KELP.asItem(), BIOMASS_SET.ITEM.get(), 1, null, 0, "dried_kelp", Grp.BIO),
            new Common(DRIED_KELP_BLOCK.asItem(), BIOMASS_SET.ITEM.get(), 9, null, 0, "dried_kelp_block", Grp.BIO),
            new Common(CHORUS_FRUIT.asItem(), BIOMASS_SET.ITEM.get(), 1, null, 0, "chorus_fruit", Grp.BIO),
            new Common(FOODS_BERRY, BIOMASS_SET.ITEM.get(), 1, null, 0, "berries", Grp.BIO),
            new Common(CROPS_MELON, BIOMASS_SET.BLOCK.get().asItem(), 1, null, 0, "melons", Grp.BIO),
            new Common(CROPS_PUMPKIN, BIOMASS_SET.ITEM.get(), 6, null, 0, "pumpkins", Grp.BIO),
            new Common(STORAGE_BLOCKS_WHEAT, BIOMASS_SET.BLOCK.get().asItem(), 2, null, 0, "hay", Grp.BIO),
            new Common(MELON_SLICE.asItem(), BIOMASS_SET.ITEM.get(), 1, null, 0, "melon", Grp.BIO),
            new Common(CROPS_CARROT, BIOMASS_SET.ITEM.get(), 2, null, 0, "carrots", Grp.BIO),
            new Common(GOLDEN_CARROT.asItem(), BIOMASS_SET.ITEM.get(), 5, GOLD_SET.SMALL_DUST.get(), 1, "golden_carrot", Grp.BIO),
            new Common(CROPS_POTATO, BIOMASS_SET.ITEM.get(), 2, null, 0, "potatoes", Grp.BIO),
            new Common(POISONOUS_POTATO, BIOMASS_SET.ITEM.get(), 1, null, 0, "poisonous_potato", Grp.BIO),
            new Common(BAKED_POTATO.asItem(), BIOMASS_SET.ITEM.get(), 2, null, 0, "baked_potato", Grp.BIO),
            new Common(CROPS_WHEAT, BIOMASS_SET.ITEM.get(), 2, null, 0, "wheats", Grp.BIO),
            new Common(PUMPKIN_PIE.asItem(), BIOMASS_SET.ITEM.get(), 5, null, 0, "pumpkin_pie", Grp.BIO),
            new Common(ROTTEN_FLESH.asItem(), BIOMASS_SET.ITEM.get(), 1, null, 0, "rotten_flesh", Grp.BIO),
            new Common(CAKE.asItem(), BIOMASS_SET.ITEM.get(), 5, null, 0, "cake", Grp.BIO),
            new Common(FOODS_BREAD, BIOMASS_SET.ITEM.get(), 3, null, 0, "breads", Grp.BIO),
            new Common(FOODS_COOKIE, BIOMASS_SET.ITEM.get(), 2, null, 0, "cookies", Grp.BIO),
            new Common(CROPS_BEETROOT, BIOMASS_SET.ITEM.get(), 1, null, 0, "beetroots", Grp.BIO),
            new Common(CROPS_COCOA_BEAN, BIOMASS_SET.ITEM.get(), 2, null, 0, "cocoa_beans", Grp.BIO)
    );

    public static final List<OreProcessing> ORE_PROCESSING = List.of(
            raw(ALUMINUM_SET.RAW.get(), 2, RAW_IRON, 1, ALUMINUM_SET.CLUMP.get(), ALUMINUM_SET.SMALL_CLUMP.get(),
                    IRON_SET.SMALL_CLUMP.get(), IRON_SET.DUST.get(), IRON_SET.SMALL_DUST.get(), ALUMINUM_ID),
            raw(ARDITE_SET.RAW.get().asItem(), 2, COBALT_SET.RAW.get(), 1, ARDITE_SET.CLUMP.get(), ARDITE_SET.SMALL_CLUMP.get(),
                    COBALT_SET.SMALL_CLUMP.get(), COBALT_SET.DUST.get(), COBALT_SET.SMALL_DUST.get(), ARDITE_ID),
            raw(BERYLLIUM_SET.RAW.get().asItem(), 2, EMERALD_SET.SMALL_DUST.get(), 2, BERYLLIUM_SET.CLUMP.get(), BERYLLIUM_SET.SMALL_CLUMP.get(),
                    EMERALD_SET.SMALL_DUST.get(), EMERALD_SET.DUST.get(), EMERALD_SET.SMALL_DUST.get(), BERYLLIUM_ID),
            raw(CATALYRIUM_SET.RAW.get().asItem(), 2, RAW_GOLD, 1, CATALYRIUM_SET.CLUMP.get(), CATALYRIUM_SET.SMALL_CLUMP.get(),
                    GOLD_SET.SMALL_CLUMP.get(), GOLD_SET.DUST.get(), GOLD_SET.SMALL_DUST.get(), CATALYRIUM_ID),
            raw(COBALT_SET.RAW.get().asItem(), 2, NICKEL_SET.RAW.get(), 1, COBALT_SET.CLUMP.get(), COBALT_SET.SMALL_CLUMP.get(),
                    NICKEL_SET.SMALL_CLUMP.get(), NICKEL_SET.DUST.get(), NICKEL_SET.SMALL_DUST.get(), COBALT_ID),
            raw(GALLIUM_SET.RAW.get().asItem(), 2, ALUMINUM_SET.RAW.get(), 1, GALLIUM_SET.CLUMP.get(), GALLIUM_SET.SMALL_CLUMP.get(),
                    ALUMINUM_SET.SMALL_CLUMP.get(), ALUMINUM_SET.DUST.get().asItem(), ALUMINUM_SET.SMALL_DUST.get().asItem(), GALLIUM_ID),
            raw(IRIDIUM_SET.RAW.get().asItem(), 2, PLATINUM_SET.RAW.get(), 1, IRIDIUM_SET.CLUMP.get(), IRIDIUM_SET.SMALL_CLUMP.get(),
                    PLATINUM_SET.SMALL_CLUMP.get(), PLATINUM_SET.DUST.get(), PLATINUM_SET.SMALL_DUST.get(), IRIDIUM_ID),
            raw(LEAD_SET.RAW.get(), 2, SILVER_SET.RAW.get(), 1, LEAD_SET.CLUMP.get(), LEAD_SET.SMALL_CLUMP.get(),
                    SILVER_SET.SMALL_CLUMP.get(), SILVER_SET.DUST.get(), SILVER_SET.SMALL_DUST.get(), LEAD_ID),
            raw(NICKEL_SET.RAW.get(), 2, RAW_IRON, 1, NICKEL_SET.CLUMP.get(), NICKEL_SET.SMALL_CLUMP.get(),
                    IRON_SET.SMALL_CLUMP.get(), IRON_SET.DUST.get(), IRON_SET.SMALL_DUST.get(), NICKEL_ID),
            raw(OSMIUM_SET.RAW.get(), 2, PLATINUM_SET.RAW.get(), 1, OSMIUM_SET.CLUMP.get(), OSMIUM_SET.SMALL_CLUMP.get(),
                    PLATINUM_SET.SMALL_CLUMP.get(), PLATINUM_SET.DUST.get(), PLATINUM_SET.SMALL_DUST.get(), OSMIUM_ID),
            raw(PLATINUM_SET.RAW.get(), 2, IRIDIUM_SET.RAW.get(), 1, PLATINUM_SET.CLUMP.get(), PLATINUM_SET.SMALL_CLUMP.get(),
                    IRIDIUM_SET.SMALL_CLUMP.get(), IRIDIUM_SET.DUST.get(), IRIDIUM_SET.SMALL_DUST.get(), PLATINUM_ID),
            raw(SCULKITE_SET.RAW.get(), 2, LEAD_SET.RAW.get(), 1, SCULKITE_SET.CLUMP.get(), SCULKITE_SET.SMALL_CLUMP.get(),
                    LEAD_SET.SMALL_CLUMP.get(), LEAD_SET.DUST.get(), LEAD_SET.SMALL_DUST.get(), SCULKITE_ID),
            raw(SILVER_SET.RAW.get(), 2, LEAD_SET.RAW.get(), 1, SILVER_SET.CLUMP.get(), SILVER_SET.SMALL_CLUMP.get(),
                    LEAD_SET.SMALL_CLUMP.get(), LEAD_SET.DUST.get(), LEAD_SET.SMALL_DUST.get(), SILVER_ID),
            extendedRaw(SULFUR_SET.RAW.get(), 7, COAL, 3, SULFUR_ID),
            raw(TIN_SET.RAW.get(), 2, RAW_COPPER, 1, TIN_SET.CLUMP.get(), TIN_SET.SMALL_CLUMP.get(),
                    COPPER_SET.SMALL_CLUMP.get(), TIN_SET.DUST.get(), COPPER_SET.SMALL_DUST.get(), TIN_ID),
            raw(TITANIUM_SET.RAW.get(), 2, RAW_IRON, 1, TITANIUM_SET.CLUMP.get(), TITANIUM_SET.SMALL_CLUMP.get(),
                    IRON_SET.SMALL_CLUMP.get(), IRON_SET.DUST.get(), IRON_SET.SMALL_DUST.get(), TITANIUM_ID),
            raw(TUNGSTEN_SET.RAW.get(), 2, RAW_IRON, 1, TUNGSTEN_SET.CLUMP.get(), TUNGSTEN_SET.SMALL_CLUMP.get(),
                    IRON_SET.SMALL_CLUMP.get(), IRON_SET.DUST.get(), IRON_SET.SMALL_DUST.get(), TUNGSTEN_ID),
            raw(ULTIMATITANIUM_SET.RAW.get(), 2, TUNGSTEN_SET.RAW.get(), 1, ULTIMATITANIUM_SET.CLUMP.get(), ULTIMATITANIUM_SET.SMALL_CLUMP.get(),
                    LEAD_SET.SMALL_CLUMP.get(), LEAD_SET.DUST.get(), LEAD_SET.SMALL_DUST.get(), ULTIMATITANIUM_ID),
            raw(URANINITE_SET.RAW.get(), 2, URANIUM_SET.RAW.get(), 1, URANINITE_SET.CLUMP.get(), URANINITE_SET.SMALL_CLUMP.get(),
                    URANIUM_SET.SMALL_CLUMP.get(), URANIUM_SET.DUST.get(), URANIUM_SET.SMALL_DUST.get(), URANINITE_ID),
            raw(URANIUM_SET.RAW.get(), 2, PLUTONIUM_SET.SMALL_DUST.get(), 1, URANIUM_SET.CLUMP.get(), URANIUM_SET.SMALL_CLUMP.get(),
                    PLUTONIUM_SET.SMALL_DUST.get(), PLUTONIUM_SET.DUST.get(), PLUTONIUM_SET.SMALL_DUST.get(), URANIUM_ID),
            raw(ZINC_SET.RAW.get(), 2, RAW_COPPER, 1, ZINC_SET.CLUMP.get(), ZINC_SET.SMALL_CLUMP.get(),
                    COPPER_SET.SMALL_CLUMP.get(), COPPER_SET.DUST.get(), COPPER_SET.SMALL_DUST.get(), ZINC_ID),
            raw(RAW_IRON, 2, NICKEL_SET.RAW.get(), 1, IRON_SET.CLUMP.get(), IRON_SET.SMALL_CLUMP.get(),
                    NICKEL_SET.SMALL_CLUMP.get(), IRON_SET.DUST.get(), NICKEL_SET.SMALL_DUST.get(), IRON_ID),
            raw(RAW_COPPER, 2, ZINC_SET.RAW.get(), 1, COPPER_SET.CLUMP.get(), COPPER_SET.SMALL_CLUMP.get(),
                    ZINC_SET.SMALL_CLUMP.get(), COPPER_SET.DUST.get(), ZINC_SET.SMALL_DUST.get(), COPPER_ID),
            raw(RAW_GOLD, 2, SILVER_SET.RAW.get(), 1, GOLD_SET.CLUMP.get(), GOLD_SET.SMALL_CLUMP.get(),
                    SILVER_SET.SMALL_CLUMP.get(), GOLD_SET.DUST.get(), SILVER_SET.SMALL_DUST.get(), GOLD_ID),
            raw(VANADIUM_SET.RAW.get(), 2, RAW_IRON, 1, VANADIUM_SET.CLUMP.get(), VANADIUM_SET.SMALL_CLUMP.get(),
                    IRON_SET.SMALL_CLUMP.get(), VANADIUM_SET.DUST.get(), IRON_SET.SMALL_DUST.get(), VANADIUM_ID),
            raw(MOLYBDENUM_SET.RAW.get(), 2, TUNGSTEN_SET.RAW.get(), 1, MOLYBDENUM_SET.CLUMP.get(), MOLYBDENUM_SET.SMALL_CLUMP.get(),
                    TUNGSTEN_SET.SMALL_CLUMP.get(), MOLYBDENUM_SET.DUST.get(), TUNGSTEN_SET.SMALL_DUST.get(), MOLYBDENUM_ID),
            raw(NEODYMIUM_SET.RAW.get(), 2, RARE_EARTH_SET.DUST.get(), 1, NEODYMIUM_SET.CLUMP.get(), NEODYMIUM_SET.SMALL_CLUMP.get(),
                    URANIUM_SET.SMALL_CLUMP.get(), NEODYMIUM_SET.DUST.get(), RARE_EARTH_SET.SMALL_DUST.get(), NEODYMIUM_ID),
            raw(PALLADIUM_SET.RAW.get(), 2, PLATINUM_SET.RAW.get(), 1, PALLADIUM_SET.CLUMP.get(), PALLADIUM_SET.SMALL_CLUMP.get(),
                    PLATINUM_SET.SMALL_CLUMP.get(), PALLADIUM_SET.DUST.get(), RHODIUM_SET.SMALL_DUST.get(), PALLADIUM_ID),

            gem(AMBER_SET.GEM.get(), 3, COAL_SET.SMALL_DUST.get(), 3, AMBER_ID),
            gem(APATITE_SET.GEM.get(), 3, PHOSPHORUS_SET.SMALL_DUST.get(), 3, APATITE_ID),
            gem(CINNABAR_SET.GEM.get(), 3, SULFUR_SET.SMALL_DUST.get(), 5, CINNABAR_ID),
            gem(FLUORITE_SET.GEM.get(), 5, CALCIUM_SET.SMALL_DUST.get(), 2, FLUORITE_ID),
            gem(GARNET_SET.GEM.get(), 3, IRON_SET.SMALL_DUST.get(), 2, GARNET_ID),
            gem(JADE_SET.GEM.get(), 3, MAGNESIUM_SET.SMALL_DUST.get(), 3, JADE_ID),
            gem(MONAZITE_SET.GEM.get(), 4, PHOSPHORUS_SET.SMALL_DUST.get(), 2, MONAZITE_ID),
            gem(NECROTICARITE_SET.GEM.get(), 2, COBALT_SET.SMALL_DUST.get(), 2, NECROTICARITE_ID),
            gem(NITER_SET.GEM.get(), 5, SULFUR_SET.SMALL_DUST.get(), 4, NITER_ID),
            gem(OBSIDIAN_SET.GEM.get(), 2, SILICON_SET.SMALL_DUST.get(), 3, OBSIDIAN_ID),
            gem(ONYX_SET.GEM.get(), 3, SILICON_SET.SMALL_DUST.get(), 3, ONYX_ID),
            gem(PEARL_SET.GEM.get(), 2, CALCIUM_SET.SMALL_DUST.get(), 3, PEARL_ID),
            gem(PERIDOT_SET.GEM.get(), 3, NICKEL_SET.SMALL_DUST.get(), 2, PERIDOT_ID),
            gem(PYROLITE_SET.GEM.get(), 2, SULFUR_SET.SMALL_DUST.get(), 5, PYROLITE_ID),
            gem(RUBY_SET.GEM.get(), 3, CHROMIUM_SET.SMALL_DUST.get(), 1, RUBY_ID),
            gem(SAPPHIRE_SET.GEM.get(), 3, ALUMINUM_SET.SMALL_DUST.get(), 2, SAPPHIRE_ID),
            gem(TANZANITE_SET.GEM.get(), 3, SILICON_SET.SMALL_DUST.get(), 5, TANZANITE_ID),
            gem(ZIRCON_SET.GEM.get(), 3, HAFNIUM_SET.SMALL_DUST.get(), 3, ZIRCON_ID),
            extendedRaw(SALT_SET.DUST.get(), 5, MAGNESIUM_SET.SMALL_DUST.get(), 3, SALT_ID),
            gem(DIAMOND, 4, COAL_SET.SMALL_DUST.get(), 3, DIAMOND_ID),
            gem(EMERALD, 5, BERYLLIUM_SET.SMALL_DUST.get(), 2, EMERALD_ID),
            bulkOre(LAPIS_LAZULI, 9, SULFUR_SET.SMALL_DUST.get(), 3, LAPIS_ID),
            gem(QUARTZ, 5, SILICON_SET.SMALL_DUST.get(), 3, QUARTZ_ID),
            bulkOre(REDSTONE, 12, CINNABAR_SET.SMALL_DUST.get(), 2, REDSTONE_ID),

            coal(ANTHRACITE_SET.COAL.get(), 4, GRAPHITE_SET.SMALL_DUST.get(), 2, ANTHRACITE_ID),
            coal(BITUMINOUS_SET.COAL.get(), 5, SULFUR_SET.SMALL_DUST.get(), 2, BITUMINOUS_ID),
            coal(LIGNITE_SET.COAL.get(), 7, SULFUR_SET.SMALL_DUST.get(), 3, LIGNITE_ID),
            coal(PEAT_SET.COAL.get(), 8, BIOMASS_SET.ITEM.get(), 2, PEAT_ID),
            coal(COAL, 6, SULFUR_SET.SMALL_DUST.get(), 3, COAL_ID)
    );

    public static final List<Alloys> ALLOYS = List.of(
            new Alloys(FUELS_BIO, 3, DUSTS_STEEL, 1, null, 0, BIOSTEEL_SET.INGOT.get(), 2, BIOSTEEL_ID, Grp.ALLOYS),
            new Alloys(FUELS_BIO, 3, INGOTS_STEEL, 1, null, 0, BIOSTEEL_SET.INGOT.get(), 2, BIOSTEEL_ID + "_var_1", Grp.ALLOYS),
            new Alloys(FUELS_BIO, 3, DUSTS_CAST_STEEL, 1, null, 0, BIOSTEEL_SET.INGOT.get(), 1, BIOSTEEL_ID + "_var_2", Grp.ALLOYS),
            new Alloys(FUELS_BIO, 3, INGOTS_CAST_STEEL, 1, null, 0, BIOSTEEL_SET.INGOT.get(), 1, BIOSTEEL_ID + "_var_3", Grp.ALLOYS),
            new Alloys(EOItemTags.Common.RAW_POLYMER, 1, INGOTS_CAST_STEEL, 1, null, 0, BIOSTEEL_SET.INGOT.get(), 1, BIOSTEEL_ID + "_var_4", Grp.ALLOYS),
            new Alloys(EOItemTags.Common.RAW_POLYMER, 1, DUSTS_CAST_STEEL, 1, null, 0, BIOSTEEL_SET.INGOT.get(), 1, BIOSTEEL_ID + "_var_5", Grp.ALLOYS),
            new Alloys(EOItemTags.Common.RAW_POLYMER, 1, INGOTS_STEEL, 1, null, 0, BIOSTEEL_SET.INGOT.get(), 2, BIOSTEEL_ID + "_var_6", Grp.ALLOYS),
            new Alloys(EOItemTags.Common.RAW_POLYMER, 1, DUSTS_STEEL, 1, null, 0, BIOSTEEL_SET.INGOT.get(), 2, BIOSTEEL_ID + "_var_7", Grp.ALLOYS),

            new Alloys(DUSTS_ZINC, 1, DUSTS_COPPER, 2, null, 0, BRASS_SET.INGOT.get(), 3, BRASS_ID, Grp.ALLOYS),
            new Alloys(INGOTS_ZINC, 1, INGOTS_COPPER, 2, null, 0, BRASS_SET.INGOT.get(), 3, BRASS_ID + "_var_1", Grp.ALLOYS),

            new Alloys(INGOTS_COPPER, 1, INGOTS_NICKEL, 1, null, 0, CUPRONICKEL_SET.INGOT.get(), 2, CUPRONICKEL_ID, Grp.ALLOYS),
            new Alloys(DUSTS_COPPER, 1, DUSTS_NICKEL, 1, null, 0, CUPRONICKEL_SET.INGOT.get(), 2, CUPRONICKEL_ID + "_var_1", Grp.ALLOYS),

            new Alloys(DUSTS_SILVER, 3, DUSTS_COPPER, 1, null, 0, BRITANNIA_SILVER_SET.INGOT.get(), 3, BRITANNIA_SILVER_ID, Grp.ALLOYS),
            new Alloys(INGOTS_SILVER, 3, INGOTS_COPPER, 1, null, 0, BRITANNIA_SILVER_SET.INGOT.get(), 3, BRITANNIA_SILVER_ID + "_var_1", Grp.ALLOYS),

            new Alloys(DUSTS_TIN, 1, DUSTS_COPPER, 3, null, 0, BRONZE_SET.INGOT.get(), 4, BRONZE_ID, Grp.ALLOYS),
            new Alloys(INGOTS_TIN, 1, INGOTS_COPPER, 3, null, 0, BRONZE_SET.INGOT.get(), 4, BRONZE_ID + "_var_1", Grp.ALLOYS),

            new Alloys(DUSTS_BITUMINOUS, 2, DUSTS_IRON, 1, null, 0, CAST_IRON_SET.INGOT.get(), 3, CAST_IRON_ID, Grp.ALLOYS),
            new Alloys(DUSTS_BITUMINOUS, 2, INGOTS_IRON, 1, null, 0, CAST_IRON_SET.INGOT.get(), 3, CAST_IRON_ID + "_var_1", Grp.ALLOYS),
            new Alloys(BITUMINOUS_SET.COAL.get(), 2, DUSTS_IRON, 1, null, 0, CAST_IRON_SET.INGOT.get(), 3, CAST_IRON_ID + "_var_2", Grp.ALLOYS),
            new Alloys(BITUMINOUS_SET.COAL.get(), 2, INGOTS_IRON, 1, null, 0, CAST_IRON_SET.INGOT.get(), 3, CAST_IRON_ID + "_var_3", Grp.ALLOYS),

            new Alloys(DUSTS_BITUMINOUS, 2, DUSTS_STEEL, 1, null, 0, CAST_STEEL_SET.INGOT.get(), 3, CAST_STEEL_ID, Grp.ALLOYS),
            new Alloys(DUSTS_BITUMINOUS, 2, INGOTS_STEEL, 1, null, 0, CAST_STEEL_SET.INGOT.get(), 3, CAST_STEEL_ID + "_var_1", Grp.ALLOYS),
            new Alloys(BITUMINOUS_SET.COAL.get(), 2, INGOTS_STEEL, 1, null, 0, CAST_STEEL_SET.INGOT.get(), 3, CAST_STEEL_ID + "_var_2", Grp.ALLOYS),
            new Alloys(BITUMINOUS_SET.COAL.get(), 2, INGOTS_STEEL, 1, null, 0, CAST_STEEL_SET.INGOT.get(), 3, CAST_STEEL_ID + "_var_3", Grp.ALLOYS),

            new Alloys(DUSTS_NICKEL, 1, DUSTS_COPPER, 1, null, 0, CONSTANTAN_SET.INGOT.get(), 2, CONSTANTAN_ID, Grp.ALLOYS),
            new Alloys(INGOTS_NICKEL, 1, INGOTS_COPPER, 1, null, 0, CONSTANTAN_SET.INGOT.get(), 2, CONSTANTAN_ID + "_var_1", Grp.ALLOYS),

            new Alloys(DUSTS_SILVER, 1, DUSTS_GOLD, 1, null, 0, ELECTRUM_SET.INGOT.get(), 2, ELECTRUM_ID, Grp.ALLOYS),
            new Alloys(INGOTS_SILVER, 1, INGOTS_GOLD, 1, null, 0, ELECTRUM_SET.INGOT.get(), 2, ELECTRUM_ID + "_var_1", Grp.ALLOYS),

            new Alloys(DUSTS_LEAD, 1, BLENDS_ENDERGETIC, 1, DUSTS_DIAMOND, 2, ENDERIUM_SET.INGOT.get(), 3, ENDERIUM_ID, Grp.ALLOYS),
            new Alloys(INGOTS_LEAD, 1, BLENDS_ENDERGETIC, 1, DUSTS_DIAMOND, 2, ENDERIUM_SET.INGOT.get(), 3, ENDERIUM_ID + "_var_1", Grp.ALLOYS),

            new Alloys(DUSTS_NICKEL, 1, DUSTS_IRON, 2, null, 0, INVAR_SET.INGOT.get(), 3, INVAR_ID, Grp.ALLOYS),
            new Alloys(INGOTS_NICKEL, 1, INGOTS_IRON, 2, null, 0, INVAR_SET.INGOT.get(), 3, INVAR_ID + "_var_1", Grp.ALLOYS),

            new Alloys(DUSTS_SILVER, 1, BLENDS_ENERGETIC, 1, DUSTS_REDSTONE, 3, LUMIUM_SET.INGOT.get(), 4, LUMIUM_ID, Grp.ALLOYS),
            new Alloys(INGOTS_SILVER, 1, BLENDS_ENERGETIC, 1, DUSTS_REDSTONE, 3, LUMIUM_SET.INGOT.get(), 4, LUMIUM_ID + "_var_1", Grp.ALLOYS),

            new Alloys(DUSTS_STEEL, 2, BLENDS_NETHER_ENRICHED, 1, FIRE_CHARGE, 1, NETHERSTEEL_SET.INGOT.get(), 4, NETHERSTEEL_ID, Grp.ALLOYS),
            new Alloys(INGOTS_STEEL, 2, BLENDS_NETHER_ENRICHED, 1, FIRE_CHARGE, 1, NETHERSTEEL_SET.INGOT.get(), 4, NETHERSTEEL_ID + "_var_1", Grp.ALLOYS),
            new Alloys(DUSTS_BIOSTEEL, 1, BLENDS_NETHER_ENRICHED, 1, FIRE_CHARGE, 1, NETHERSTEEL_SET.INGOT.get(), 1, NETHERSTEEL_ID + "_var_2", Grp.ALLOYS),
            new Alloys(INGOTS_BIOSTEEL, 1, BLENDS_NETHER_ENRICHED, 1, FIRE_CHARGE, 1, NETHERSTEEL_SET.INGOT.get(), 1, NETHERSTEEL_ID + "_var_3", Grp.ALLOYS),
            new Alloys(DUSTS_CAST_STEEL, 1, BLENDS_NETHER_ENRICHED, 1, FIRE_CHARGE, 1, NETHERSTEEL_SET.INGOT.get(), 2, NETHERSTEEL_ID + "_var_4", Grp.ALLOYS),
            new Alloys(INGOTS_CAST_STEEL, 1, BLENDS_NETHER_ENRICHED, 1, FIRE_CHARGE, 1, NETHERSTEEL_SET.INGOT.get(), 2, NETHERSTEEL_ID + "_var_5", Grp.ALLOYS),

            new Alloys(INGOTS_COPPER, 3, DUSTS_QUARTZ, 1, null, 0, QUARTZ_ENRICHED_COPPER_SET.INGOT.get(), 4, "quartz_enriched_copper", Grp.ALLOYS),
            new Alloys(DUSTS_COPPER, 3, DUSTS_QUARTZ, 1, null, 0, QUARTZ_ENRICHED_COPPER_SET.INGOT.get(), 4, "quartz_enriched_copper_var", Grp.ALLOYS),
            new Alloys(INGOTS_IRON, 3, DUSTS_QUARTZ, 1, null, 0, QUARTZ_ENRICHED_IRON_SET.INGOT.get(), 4, "quartz_enriched_iron", Grp.ALLOYS),
            new Alloys(DUSTS_IRON, 3, DUSTS_QUARTZ, 1, null, 0, QUARTZ_ENRICHED_IRON_SET.INGOT.get(), 4, "quartz_enriched_iron_var", Grp.ALLOYS),

            new Alloys(DUSTS_NICKEL, 1, DUSTS_TIN, 2, DUSTS_SILVER, 1, PEWTER_SET.INGOT.get(), 3, PEWTER_ID, Grp.ALLOYS),
            new Alloys(INGOTS_NICKEL, 1, INGOTS_TIN, 2, INGOTS_SILVER, 1, PEWTER_SET.INGOT.get(), 3, PEWTER_ID + "_var_1", Grp.ALLOYS),

            new Alloys(DUSTS_IRON, 1, DUSTS_LIGNITE, 2, null, 0, PIG_IRON_SET.INGOT.get(), 3, PIG_IRON_ID, Grp.ALLOYS),
            new Alloys(INGOTS_IRON, 1, DUSTS_LIGNITE, 2, null, 0, PIG_IRON_SET.INGOT.get(), 3, PIG_IRON_ID + "_var_1", Grp.ALLOYS),
            new Alloys(DUSTS_IRON, 2, BLENDS_LOW_CARBON, 1, null, 0, PIG_IRON_SET.INGOT.get(), 4, PIG_IRON_ID + "_var_2", Grp.ALLOYS),
            new Alloys(INGOTS_IRON, 2, BLENDS_LOW_CARBON, 1, null, 0, PIG_IRON_SET.INGOT.get(), 4, PIG_IRON_ID + "_var_3", Grp.ALLOYS),
            new Alloys(INGOTS_IRON, 1, DUSTS_PEAT, 1, null, 0, PIG_IRON_SET.INGOT.get(), 1, PIG_IRON_ID + "_var_4", Grp.ALLOYS),
            new Alloys(DUSTS_IRON, 1, DUSTS_PEAT, 1, null, 0, PIG_IRON_SET.INGOT.get(), 1, PIG_IRON_ID + "_var_5", Grp.ALLOYS),

            new Alloys(DUSTS_COPPER, 3, DUSTS_GOLD, 1, null, 0, ROSE_GOLD_SET.INGOT.get(), 4, ROSE_GOLD_ID, Grp.ALLOYS),
            new Alloys(INGOTS_COPPER, 3, INGOTS_GOLD, 1, null, 0, ROSE_GOLD_SET.INGOT.get(), 4, ROSE_GOLD_ID + "_var_1", Grp.ALLOYS),

            new Alloys(DUSTS_STEEL, 3, BLENDS_SHADOW, 1, null, 0, SHADOWSTEEL_SET.INGOT.get(), 4, SHADOWSTEEL_ID, Grp.ALLOYS),
            new Alloys(INGOTS_STEEL, 3, BLENDS_SHADOW, 1, null, 0, SHADOWSTEEL_SET.INGOT.get(), 4, SHADOWSTEEL_ID + "_var_1", Grp.ALLOYS),
            new Alloys(DUSTS_BIOSTEEL, 1, BLENDS_SHADOW, 1, null, 0, SHADOWSTEEL_SET.INGOT.get(), 1, SHADOWSTEEL_ID + "_var_2", Grp.ALLOYS),
            new Alloys(INGOTS_BIOSTEEL, 1, BLENDS_SHADOW, 1, null, 0, SHADOWSTEEL_SET.INGOT.get(), 1, SHADOWSTEEL_ID + "_var_3", Grp.ALLOYS),
            new Alloys(DUSTS_CAST_STEEL, 1, BLENDS_SHADOW, 1, null, 0, SHADOWSTEEL_SET.INGOT.get(), 2, SHADOWSTEEL_ID + "_var_4", Grp.ALLOYS),
            new Alloys(INGOTS_CAST_STEEL, 1, BLENDS_SHADOW, 1, null, 0, SHADOWSTEEL_SET.INGOT.get(), 2, SHADOWSTEEL_ID + "_var_5", Grp.ALLOYS),

            new Alloys(DUSTS_COPPER, 1, BLENDS_ENERGETIC, 1, DUSTS_REDSTONE, 1, SIGNALUM_SET.INGOT.get(), 3, SIGNALUM_ID, Grp.ALLOYS),
            new Alloys(INGOTS_COPPER, 1, BLENDS_ENERGETIC, 1, DUSTS_REDSTONE, 1, SIGNALUM_SET.INGOT.get(), 3, SIGNALUM_ID + "_var_1", Grp.ALLOYS),

            new Alloys(DUSTS_IRON, 1, BLENDS_CARBON, 1, null, 0, STEEL_SET.INGOT.get(), 2, STEEL_ID, Grp.ALLOYS),
            new Alloys(INGOTS_IRON, 1, BLENDS_CARBON, 1, null, 0, STEEL_SET.INGOT.get(), 2, STEEL_ID + "_var_1", Grp.ALLOYS),
            new Alloys(DUSTS_WROUGHT_IRON, 2, DUSTS_ANTHRACITE, 1, null, 0, STEEL_SET.INGOT.get(), 3, STEEL_ID + "_var_2", Grp.ALLOYS),
            new Alloys(INGOTS_WROUGHT_IRON, 2, DUSTS_ANTHRACITE, 1, null, 0, STEEL_SET.INGOT.get(), 3, STEEL_ID + "_var_3", Grp.ALLOYS),
            new Alloys(DUSTS_IRON, 1, DUSTS_COAL, 1, null, 0, STEEL_SET.INGOT.get(), 1, STEEL_ID + "_var_4", Grp.ALLOYS),
            new Alloys(INGOTS_IRON, 1, DUSTS_COAL, 1, null, 0, STEEL_SET.INGOT.get(), 1, STEEL_ID + "_var_5", Grp.ALLOYS),
            new Alloys(DUSTS_IRON, 1, DUSTS_COKE, 1, null, 0, STEEL_SET.INGOT.get(), 4, STEEL_ID + "_var_6", Grp.ALLOYS),
            new Alloys(INGOTS_IRON, 1, DUSTS_COKE, 1, null, 0, STEEL_SET.INGOT.get(), 4, STEEL_ID + "_var_7", Grp.ALLOYS),
            new Alloys(DUSTS_WROUGHT_IRON, 2, ANTHRACITE_SET.COAL.get(), 1, null, 0, STEEL_SET.INGOT.get(), 3, STEEL_ID + "_var_8", Grp.ALLOYS),
            new Alloys(INGOTS_WROUGHT_IRON, 2, ANTHRACITE_SET.COAL.get(), 1, null, 0, STEEL_SET.INGOT.get(), 3, STEEL_ID + "_var_9", Grp.ALLOYS),
            new Alloys(DUSTS_IRON, 1, COAL, 1, null, 0, STEEL_SET.INGOT.get(), 1, STEEL_ID + "_var_10", Grp.ALLOYS),
            new Alloys(INGOTS_IRON, 1, COAL, 1, null, 0, STEEL_SET.INGOT.get(), 1, STEEL_ID + "_var_11", Grp.ALLOYS),
            new Alloys(DUSTS_IRON, 1, COKE_SET.COAL.get(), 1, null, 0, STEEL_SET.INGOT.get(), 4, STEEL_ID + "_var_12", Grp.ALLOYS),
            new Alloys(INGOTS_IRON, 1, COKE_SET.COAL.get(), 1, null, 0, STEEL_SET.INGOT.get(), 4, STEEL_ID + "_var_13", Grp.ALLOYS),

            new Alloys(DUSTS_IRON, 1, DUSTS_CHARCOAL, 2, null, 0, WROUGHT_IRON_SET.INGOT.get(), 2, WROUGHT_IRON_ID, Grp.ALLOYS),
            new Alloys(INGOTS_IRON, 1, DUSTS_CHARCOAL, 2, null, 0, WROUGHT_IRON_SET.INGOT.get(), 2, WROUGHT_IRON_ID + "_var_1", Grp.ALLOYS),
            new Alloys(DUSTS_IRON, 1, CHARCOAL, 2, null, 0, WROUGHT_IRON_SET.INGOT.get(), 2, WROUGHT_IRON_ID + "_var_2", Grp.ALLOYS),
            new Alloys(INGOTS_IRON, 1, CHARCOAL, 2, null, 0, WROUGHT_IRON_SET.INGOT.get(), 2, WROUGHT_IRON_ID + "_var_3", Grp.ALLOYS),
            new Alloys(DUSTS_IRON, 1, DUSTS_COAL, 1, null, 0, WROUGHT_IRON_SET.INGOT.get(), 1, WROUGHT_IRON_ID + "_var_4", Grp.ALLOYS),
            new Alloys(INGOTS_IRON, 1, DUSTS_COAL, 1, null, 0, WROUGHT_IRON_SET.INGOT.get(), 1, WROUGHT_IRON_ID + "_var_5", Grp.ALLOYS),
            new Alloys(DUSTS_IRON, 1, COAL, 1, null, 0, WROUGHT_IRON_SET.INGOT.get(), 1, WROUGHT_IRON_ID + "_var_6", Grp.ALLOYS),
            new Alloys(INGOTS_IRON, 1, COAL, 1, null, 0, WROUGHT_IRON_SET.INGOT.get(), 1, WROUGHT_IRON_ID + "_var_7", Grp.ALLOYS)
    );

    @SuppressWarnings("all")
     private static OreProcessing raw(Item primary, int pCnt, Item byproduct, int bCnt, Item clump, Item smallClump, Item byproductSmallClump,
                                      Item byproductDust, Item byproductSmallDust, String sfx) {
         return new OreProcessing(primary, pCnt, byproduct, bCnt, clump, smallClump,
                 byproductSmallClump, byproductDust, byproductSmallDust, sfx,
                 Grp.ORE_PROC, standardRawChances());
     }

     @SuppressWarnings("all")
     private static OreProcessing extendedRaw(Item primary, int pCnt, Item byproduct, int bCnt, String sfx) {
         return new OreProcessing(primary, pCnt, byproduct, bCnt, null, null, null, null, null,
                 sfx, Grp.ORE_PROC, extendedRawChances());
     }

     private static OreProcessing gem(Item gemItem, int pCnt, Item byproduct, int bCnt, String sfx) {
         return new OreProcessing(gemItem, pCnt, byproduct, bCnt, null, null, null, null, null,
                 sfx, Grp.ORE_PROC, standardGemChances());
     }

     private static OreProcessing bulkOre(Item gemItem, int pCnt, Item byproduct, int bCnt, String sfx) {
         return new OreProcessing(gemItem, pCnt, byproduct, bCnt, null, null, null, null, null,
                 sfx, Grp.ORE_PROC, bulkOreChances());
     }

     private static OreProcessing coal(Item coalItem, int pCnt, Item byproduct, int bCnt, String sfx) {
         return new OreProcessing(coalItem, pCnt, byproduct, bCnt, null, null, null, null, null,
                 sfx, Grp.ORE_PROC, standardCoalChances());
     }

     private static PulverizerChances standardRawChances() {
         return new PulverizerChances(
                 new double[]{1.0, 1.0, 0.25, 0.25, 0.10},
                 new double[]{1.0, 1.0, 0.50, 0.50, 0.25},
                 new double[]{1.0, 0.25, 0.25},
                 new double[]{1.0, 0.50, 0.35}
         );
     }

     private static PulverizerChances extendedRawChances() {
         return new PulverizerChances(
                 new double[]{1.0, 1.0, 1.0, 1.0, 0.25, 0.25, 0.10},
                 new double[]{1.0, 1.0, 1.0, 1.0, 0.50, 0.50, 0.25},
                 new double[]{1.0, 0.45, 0.25, 0.10},
                 new double[]{1.0, 0.50, 0.50, 0.30}
         );
     }

     private static PulverizerChances bulkOreChances() {
         return new PulverizerChances(
                 new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 0.50, 0.50, 0.40, 0.25, 0.25, 0.10, 0.10},
                 new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.75, 0.75, 0.50, 0.50, 0.30, 0.30},
                 new double[]{1.0, 0.45, 0.25, 0.10},
                 new double[]{1.0, 0.55, 0.45, 0.30}
         );
     }

     private static PulverizerChances standardCoalChances() {
         return new PulverizerChances(
                 new double[]{1.0, 1.0, 1.0, 1.0, 0.25, 0.25, 0.10},
                 new double[]{1.0, 1.0, 1.0, 1.0, 0.50, 0.50, 0.25},
                 new double[]{1.0, 1.0, 1.0, 0.25},
                 new double[]{1.0, 1.0, 1.0, 0.50}
         );
     }

     private static PulverizerChances standardGemChances() {
         return new PulverizerChances(
                 new double[]{1.0, 1.0, 1.0, 0.25, 0.10},
                 new double[]{1.0, 1.0, 1.0, 0.50, 0.25},
                 new double[]{1.0, 1.0, 0.25},
                 new double[]{1.0, 1.0, 0.50}
         );
     }
}
