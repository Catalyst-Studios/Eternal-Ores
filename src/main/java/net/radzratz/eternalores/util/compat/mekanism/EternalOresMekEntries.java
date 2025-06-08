package net.radzratz.eternalores.util.compat.mekanism;

import net.minecraft.tags.FluidTags;
import net.neoforged.neoforge.common.Tags;
import net.radzratz.eternalores.item.EternalGeneralItems;
import net.radzratz.eternalores.util.compat.mekanism.fluids.EternalOresMekFluids;
import net.radzratz.eternalores.util.compat.mekanism.recipe_types.enums.*;
import net.radzratz.eternalores.util.compat.mekanism.tags.EternalOresItemMekTags;
import net.radzratz.eternalores.util.tags.item.EternalItemsGeneralTags;
import net.radzratz.eternalores.util.tags.item.gems.EternalGemTags;
import net.radzratz.eternalores.util.tags.item.ingots.EternalIngotTags;
import net.radzratz.eternalores.util.tags.item.ores.EternalOreBlockItemTags;
import net.radzratz.eternalores.util.tags.item.plates.EternalPlates;
import net.radzratz.eternalores.util.tags.item.raw_materials.EternalRawMaterialTags;
import net.radzratz.eternalores.util.tags.item.rods.EternalGemRodsTags;
import net.radzratz.eternalores.util.tags.item.rods.EternalMetalRodsTags;
import net.radzratz.eternalores.util.tags.item.rods.EternalMiscRodsTags;
import net.radzratz.eternalores.util.tags.item.storage_blocks.EternalStorageRawOreBlockItemTags;

import java.util.HashMap;
import java.util.Map;

import static net.radzratz.eternalores.util.compat.mekanism.recipe_types.entries.CrushingRecipeEntry.*;
import static net.radzratz.eternalores.util.compat.mekanism.recipe_types.entries.CrystallizationRecipeEntry.registerCrystallizationRecipes;
import static net.radzratz.eternalores.util.compat.mekanism.recipe_types.entries.DissolutionRecipeEntry.registerDissolutionRecipes;
import static net.radzratz.eternalores.util.compat.mekanism.recipe_types.entries.DissolutionRecipeEntry.registerDissolutionTrueRecipes;
import static net.radzratz.eternalores.util.compat.mekanism.recipe_types.entries.EnrichingRecipeEntry.*;
import static net.radzratz.eternalores.util.compat.mekanism.recipe_types.entries.InjectingRecipeEntry.registerInjectingRecipes;
import static net.radzratz.eternalores.util.compat.mekanism.recipe_types.entries.InjectingRecipeEntry.registerInjectingTrueRecipes;
import static net.radzratz.eternalores.util.compat.mekanism.recipe_types.entries.PurificationRecipeEntry.registerPurificationRecipes;
import static net.radzratz.eternalores.util.compat.mekanism.recipe_types.entries.PurificationRecipeEntry.registerPurificationTrueRecipes;
import static net.radzratz.eternalores.util.compat.mekanism.recipe_types.entries.WashingRecipeEntry.registerWashingRecipes;

public class EternalOresMekEntries
{
    ///
    /// Material Set/Clump -> Dirty Dust List
    ///
    public static final Map<String, CrushingRecipeType.Inputs> DIRTY_DUST_ENTRIES;
    static
    {
        Map<String, CrushingRecipeType.Inputs> map = new HashMap<>();

        registerDirtyDustRecipes(map, "aluminum",
            EternalOresItemMekTags.Items.CLUMP_ALUMINUM_C,
            EternalOresMekanismCompatItems.ALUMINUM_DIRTY_DUST);

        registerDirtyDustRecipes(map, "catalyrium",
                EternalOresItemMekTags.Items.CLUMP_CATALYRIUM_C,
                EternalOresMekanismCompatItems.CATALYRIUM_DIRTY_DUST);

        registerDirtyDustRecipes(map, "cobalt",
                EternalOresItemMekTags.Items.CLUMP_COBALT_C,
                EternalOresMekanismCompatItems.COBALT_DIRTY_DUST);

        registerDirtyDustRecipes(map, "gallium",
                EternalOresItemMekTags.Items.CLUMP_GALLIUM_C,
                EternalOresMekanismCompatItems.GALLIUM_DIRTY_DUST);

        registerDirtyDustRecipes(map, "iridium",
                EternalOresItemMekTags.Items.CLUMP_IRIDIUM_C,
                EternalOresMekanismCompatItems.IRIDIUM_DIRTY_DUST);

        registerDirtyDustRecipes(map, "nickel",
                EternalOresItemMekTags.Items.CLUMP_NICKEL_C,
                EternalOresMekanismCompatItems.NICKEL_DIRTY_DUST);

        registerDirtyDustRecipes(map, "platinum",
                EternalOresItemMekTags.Items.CLUMP_PLATINUM_C,
                EternalOresMekanismCompatItems.PLATINUM_DIRTY_DUST);

        registerDirtyDustRecipes(map, "silver",
                EternalOresItemMekTags.Items.CLUMP_SILVER_C,
                EternalOresMekanismCompatItems.SILVER_DIRTY_DUST);

        registerDirtyDustRecipes(map, "uraninite",
                EternalOresItemMekTags.Items.CLUMP_URANINITE_C,
                EternalOresMekanismCompatItems.URANINITE_DIRTY_DUST);

        registerDirtyDustRecipes(map, "zinc",
                EternalOresItemMekTags.Items.CLUMP_ZINC_C,
                EternalOresMekanismCompatItems.ZINC_DIRTY_DUST);

        DIRTY_DUST_ENTRIES = Map.copyOf(map);
    }

    ///
    /// Material Set Plates/Rods -> Dust
    ///
    public static final Map<String, CrushingRecipeType.InputsDeconstruction> DUST_DECONSTRUCTION_ENTRIES;
    static
    {
        Map<String, CrushingRecipeType.InputsDeconstruction> map = new HashMap<>();

        registerDecoRecipes(map, "aluminum",
                EternalPlates.Items.ALUMINUM_PLATE,
                EternalMetalRodsTags.Items.ROD_ALUMINUM,
                EternalGeneralItems.ALUMINUM_DUST);

        registerDecoRecipes(map, "blue_steel",
                EternalPlates.Items.BLUE_STEEL_PLATE,
                EternalMetalRodsTags.Items.ROD_BLUE_STEEL,
                EternalGeneralItems.BLUE_STEEL_DUST);

        registerDecoRecipes(map, "brass",
                EternalPlates.Items.BRASS_PLATE,
                EternalMetalRodsTags.Items.ROD_BRASS,
                EternalGeneralItems.BRASS_DUST);

        registerDecoRecipes(map, "bronze",
                EternalPlates.Items.BRONZE_PLATE,
                EternalMetalRodsTags.Items.ROD_BRONZE,
                EternalGeneralItems.BRONZE_DUST);

        registerDecoRecipes(map, "catalyrium",
                EternalPlates.Items.CATALYRIUM_PLATE,
                EternalMetalRodsTags.Items.ROD_CATALYRIUM,
                EternalGeneralItems.CATALYRIUM_DUST);

        registerDecoRecipes(map, "cast_iron",
                EternalPlates.Items.CAST_IRON_PLATE,
                EternalMetalRodsTags.Items.ROD_CAST_IRON,
                EternalGeneralItems.CAST_IRON_DUST);

        registerDecoRecipes(map, "cast_steel",
                EternalPlates.Items.CAST_STEEL_PLATE,
                EternalMetalRodsTags.Items.ROD_CAST_STEEL,
                EternalGeneralItems.CAST_STEEL_DUST);

        registerDecoRecipes(map, "cobalt",
                EternalPlates.Items.COBALT_PLATE,
                EternalMetalRodsTags.Items.ROD_COBALT,
                EternalGeneralItems.COBALT_DUST);

        registerDecoRecipes(map, "constantan",
                EternalPlates.Items.CONSTANTAN_PLATE,
                EternalMetalRodsTags.Items.ROD_CONSTANTAN,
                EternalGeneralItems.CONSTANTAN_DUST);

        registerDecoRecipes(map, "copper",
                EternalPlates.Items.COPPER_PLATE,
                EternalMetalRodsTags.Items.ROD_COPPER,
                EternalGeneralItems.COPPER_DUST);

        registerDecoRecipes(map, "diamond",
                EternalPlates.Items.DIAMOND_PLATE,
                EternalGemRodsTags.Items.ROD_DIAMOND,
                EternalGeneralItems.DIAMOND_DUST);

        registerDecoRecipes(map, "electrum",
                EternalPlates.Items.ELECTRUM_PLATE,
                EternalMetalRodsTags.Items.ROD_ELECTRUM,
                EternalGeneralItems.ELECTRUM_DUST);

        registerDecoRecipes(map, "enderium",
                EternalPlates.Items.ENDERIUM_PLATE,
                EternalMetalRodsTags.Items.ROD_ENDERIUM,
                EternalGeneralItems.ENDERIUM_DUST);

        registerDecoRecipes(map, "gallium",
                EternalPlates.Items.GALLIUM_PLATE,
                EternalMetalRodsTags.Items.ROD_GALLIUM,
                EternalGeneralItems.GALLIUM_DUST);

        registerDecoRecipes(map, "gold",
                EternalPlates.Items.GOLD_PLATE,
                EternalMetalRodsTags.Items.ROD_GOLD,
                EternalGeneralItems.GOLD_DUST);

        registerDecoRecipes(map, "copper",
                EternalPlates.Items.COPPER_PLATE,
                EternalMetalRodsTags.Items.ROD_COPPER,
                EternalGeneralItems.COPPER_DUST);

        registerDecoRecipes(map, "graphite",
                EternalPlates.Items.GRAPHITE_PLATE,
                EternalMiscRodsTags.Items.ROD_GRAPHITE,
                EternalGeneralItems.GRAPHITE_DUST);

        registerDecoRecipes(map, "invar",
                EternalPlates.Items.INVAR_PLATE,
                EternalMetalRodsTags.Items.ROD_INVAR,
                EternalGeneralItems.INVAR_DUST);

        registerDecoRecipes(map, "iridium",
                EternalPlates.Items.IRIDIUM_PLATE,
                EternalMetalRodsTags.Items.ROD_IRIDIUM,
                EternalGeneralItems.IRIDIUM_DUST);

        registerDecoRecipes(map, "iron",
                EternalPlates.Items.IRON_PLATE,
                EternalMetalRodsTags.Items.ROD_IRON,
                EternalGeneralItems.IRON_DUST);

        registerDecoRecipes(map, "lead",
                EternalPlates.Items.LEAD_PLATE,
                EternalMetalRodsTags.Items.ROD_LEAD,
                EternalGeneralItems.LEAD_DUST);

        registerDecoRecipes(map, "lumium",
                EternalPlates.Items.LUMIUM_PLATE,
                EternalMetalRodsTags.Items.ROD_LUMIUM,
                EternalGeneralItems.LUMIUM_DUST);

        registerDecoRecipes(map, "necroticarite",
                EternalPlates.Items.NECROTICARITE_PLATE,
                EternalGemRodsTags.Items.ROD_NECROTICARITE,
                EternalGeneralItems.NECROTICARITE_DUST);

        registerDecoRecipes(map, "netherite",
                EternalPlates.Items.NETHERITE_PLATE,
                EternalMetalRodsTags.Items.ROD_NETHERITE,
                EternalGeneralItems.NETHERITE_DUST);

        registerDecoRecipes(map, "nethersteel",
                EternalPlates.Items.NETHERSTEEL_PLATE,
                EternalMetalRodsTags.Items.ROD_NETHERSTEEL,
                EternalGeneralItems.NETHERSTEEL_DUST);

        registerDecoRecipes(map, "nickel",
                EternalPlates.Items.NICKEL_PLATE,
                EternalMetalRodsTags.Items.ROD_NICKEL,
                EternalGeneralItems.NICKEL_DUST);

        registerDecoRecipes(map, "osmium",
                EternalPlates.Items.OSMIUM_PLATE,
                EternalMetalRodsTags.Items.ROD_OSMIUM,
                EternalGeneralItems.OSMIUM_DUST);

        registerDecoRecipes(map, "pig_iron",
                EternalPlates.Items.PIG_IRON_PLATE,
                EternalMetalRodsTags.Items.ROD_PIG_IRON,
                EternalGeneralItems.PIG_IRON_DUST);

        registerDecoRecipes(map, "platinum",
                EternalPlates.Items.PLATINUM_PLATE,
                EternalMetalRodsTags.Items.ROD_PLATINUM,
                EternalGeneralItems.PLATINUM_DUST);

        registerDecoRecipes(map, "plutonium",
                EternalPlates.Items.PLUTONIUM_PLATE,
                EternalMetalRodsTags.Items.ROD_PLUTONIUM,
                EternalGeneralItems.PLUTONIUM_DUST);

        registerDecoRecipes(map, "rose_gold",
                EternalPlates.Items.ROSE_GOLD_PLATE,
                EternalMetalRodsTags.Items.ROD_ROSE_GOLD,
                EternalGeneralItems.ROSE_GOLD_DUST);

        registerDecoRecipes(map, "sapphire",
                EternalPlates.Items.SAPPHIRE_PLATE,
                EternalGemRodsTags.Items.ROD_SAPPHIRE,
                EternalGeneralItems.SAPPHIRE_DUST);

        registerDecoRecipes(map, "signalum",
                EternalPlates.Items.SIGNALUM_PLATE,
                EternalMetalRodsTags.Items.ROD_SIGNALUM,
                EternalGeneralItems.SIGNALUM_DUST);

        registerDecoRecipes(map, "silver",
                EternalPlates.Items.SILVER_PLATE,
                EternalMetalRodsTags.Items.ROD_SILVER,
                EternalGeneralItems.SILVER_DUST);

        registerDecoRecipes(map, "shadowsteel",
                EternalPlates.Items.SHADOWSTEEL_PLATE,
                EternalMetalRodsTags.Items.ROD_SHADOWSTEEL,
                EternalGeneralItems.SHADOWSTEEL_DUST);

        registerDecoRecipes(map, "steel",
                EternalPlates.Items.STEEL_PLATE,
                EternalMetalRodsTags.Items.ROD_STEEL,
                EternalGeneralItems.STEEL_DUST);

        registerDecoRecipes(map, "tin",
                EternalPlates.Items.TIN_PLATE,
                EternalMetalRodsTags.Items.ROD_TIN,
                EternalGeneralItems.TIN_DUST);

        registerDecoRecipes(map, "titanium",
                EternalPlates.Items.TITANIUM_PLATE,
                EternalMetalRodsTags.Items.ROD_TITANIUM,
                EternalGeneralItems.TITANIUM_DUST);

        registerDecoRecipes(map, "ultimatitanium",
                EternalPlates.Items.ULTIMATITANIUM_PLATE,
                EternalMetalRodsTags.Items.ROD_ULTIMATITANIUM,
                EternalGeneralItems.ULTIMATITANIUM_DUST);

        registerDecoRecipes(map, "uranium",
                EternalPlates.Items.URANIUM_PLATE,
                EternalMetalRodsTags.Items.ROD_URANIUM,
                EternalGeneralItems.URANIUM_DUST);

        registerDecoRecipes(map, "wrought_iron",
                EternalPlates.Items.WROUGHT_IRON_PLATE,
                EternalMetalRodsTags.Items.ROD_WROUGHT_IRON,
                EternalGeneralItems.WROUGHT_IRON_DUST);

        registerDecoRecipes(map, "zinc",
                EternalPlates.Items.ZINC_PLATE,
                EternalMetalRodsTags.Items.ROD_ZINC,
                EternalGeneralItems.ZINC_DUST);

        DUST_DECONSTRUCTION_ENTRIES = Map.copyOf(map);
    }

    ///
    /// Material Set/Dirty Dust -> Dust
    ///
    ///
    /// Catalyrium Set does not have an Ore Block
    ///
    /// As it's a Synthetic ore, cannot be found nor mined
    public static final Map<String, EnrichingRecipeType.Inputs> DUST_ENTRIES;
    static
    {
        Map<String, EnrichingRecipeType.Inputs> map = new HashMap<>();

        registerEnrichingDustTrueRecipes(map, "aluminum",
                EternalRawMaterialTags.RAW_ALUMINUM,
                EternalOresItemMekTags.Items.DIRTY_ALUMINUM_C,
                EternalStorageRawOreBlockItemTags.Items.RAW_ALUMINUM_ST_ITEM,
                EternalOreBlockItemTags.Items.ITEM_ALUMINUM_ORE_OW,
                EternalGeneralItems.ALUMINUM_DUST);

        registerEnrichingDustTrueRecipes(map, "cobalt",
                EternalRawMaterialTags.RAW_COBALT,
                EternalOresItemMekTags.Items.DIRTY_COBALT_C,
                EternalStorageRawOreBlockItemTags.Items.RAW_COBALT_ST_ITEM,
                EternalOreBlockItemTags.Items.ITEM_COBALT_ORE_OW,
                EternalGeneralItems.COBALT_DUST);

        registerEnrichingDustTrueRecipes(map, "gallium",
                EternalRawMaterialTags.RAW_GALLIUM,
                EternalOresItemMekTags.Items.DIRTY_GALLIUM_C,
                EternalStorageRawOreBlockItemTags.Items.RAW_GALLIUM_ST_ITEM,
                EternalOreBlockItemTags.Items.ITEM_GALLIUM_ORE_OW,
                EternalGeneralItems.GALLIUM_DUST);

        registerEnrichingDustTrueRecipes(map, "iridium",
                EternalRawMaterialTags.RAW_IRIDIUM,
                EternalOresItemMekTags.Items.DIRTY_IRIDIUM_C,
                EternalStorageRawOreBlockItemTags.Items.RAW_IRIDIUM_ST_ITEM,
                EternalOreBlockItemTags.Items.ITEM_IRIDIUM_ORE_OW,
                EternalGeneralItems.GALLIUM_DUST);

        registerEnrichingDustTrueRecipes(map, "nickel",
                EternalRawMaterialTags.RAW_NICKEL,
                EternalOresItemMekTags.Items.DIRTY_NICKEL_C,
                EternalStorageRawOreBlockItemTags.Items.RAW_NICKEL_ST_ITEM,
                EternalOreBlockItemTags.Items.ITEM_NICKEL_ORE_OW,
                EternalGeneralItems.NICKEL_DUST);

        registerEnrichingDustTrueRecipes(map, "platinum",
                EternalRawMaterialTags.RAW_PLATINUM,
                EternalOresItemMekTags.Items.DIRTY_PLATINUM_C,
                EternalStorageRawOreBlockItemTags.Items.RAW_PLATINUM_ST_ITEM,
                EternalOreBlockItemTags.Items.ITEM_PLATINUM_ORE_OW,
                EternalGeneralItems.PLATINUM_DUST);

        registerEnrichingDustTrueRecipes(map, "silver",
                EternalRawMaterialTags.RAW_SILVER,
                EternalOresItemMekTags.Items.DIRTY_SILVER_C,
                EternalStorageRawOreBlockItemTags.Items.RAW_SILVER_ST_ITEM,
                EternalOreBlockItemTags.Items.ITEM_SILVER_ORE_OW,
                EternalGeneralItems.SILVER_DUST);

        registerEnrichingDustTrueRecipes(map, "uraninite",
                EternalRawMaterialTags.RAW_URANINITE,
                EternalOresItemMekTags.Items.DIRTY_URANINITE_C,
                EternalStorageRawOreBlockItemTags.Items.RAW_URANINITE_ST_ITEM,
                EternalOreBlockItemTags.Items.ITEM_URANINITE_ORE_OW,
                EternalGeneralItems.URANINITE_DUST);

        registerEnrichingDustTrueRecipes(map, "zinc",
                EternalRawMaterialTags.RAW_ZINC,
                EternalOresItemMekTags.Items.DIRTY_ZINC_C,
                EternalStorageRawOreBlockItemTags.Items.RAW_ZINC_ST_ITEM,
                EternalOreBlockItemTags.Items.ITEM_ZINC_ORE_OW,
                EternalGeneralItems.ZINC_DUST);

        DUST_ENTRIES = Map.copyOf(map);
    }
    /// Catalyrium Only
    public static final Map<String, EnrichingRecipeType.InputsDiff> DUST_WITHOUT_ORE_ENTRIES;
    static
    {
        Map<String, EnrichingRecipeType.InputsDiff> map = new HashMap<>();

        registerEnrichingDustRecipes(map, "catalyrium",
                EternalRawMaterialTags.RAW_CATALYRIUM,
                EternalOresItemMekTags.Items.DIRTY_CATALYRIUM_C,
                EternalStorageRawOreBlockItemTags.Items.RAW_CATALYRIUM_ST_ITEM,
                EternalGeneralItems.CATALYRIUM_DUST);

        DUST_WITHOUT_ORE_ENTRIES = Map.copyOf(map);
    }

    /// Ore Block -> Gem
    public static final Map<String, EnrichingRecipeType.InputsGem> ORE_GEM_ENTRIES;
    static
    {
        Map<String, EnrichingRecipeType.InputsGem> map = new HashMap<>();

        registerEnrichingGemRecipes(map, "amber",
                EternalOreBlockItemTags.Items.ITEM_AMBER_ORE_OW,
                EternalGeneralItems.GEM_AMBER);

        registerEnrichingGemRecipes(map, "apatite",
                EternalOreBlockItemTags.Items.ITEM_APATITE_ORE_OW,
                EternalGeneralItems.GEM_APATITE);

        registerEnrichingGemRecipes(map, "cinnabar",
                EternalOreBlockItemTags.Items.ITEM_CINNABAR_ORE_OW,
                EternalGeneralItems.GEM_CINNABAR);

        registerEnrichingGemRecipes(map, "fluorite",
                EternalOreBlockItemTags.Items.ITEM_FLUORITE_ORE_OW,
                EternalGeneralItems.FLUORITE);

        registerEnrichingGemRecipes(map, "necroticarite",
                EternalOreBlockItemTags.Items.ITEM_NECROTICARITE_ORE_NETHER,
                EternalGeneralItems.GEM_NECROTICARITE);

        registerEnrichingGemRecipes(map, "niter",
                EternalOreBlockItemTags.Items.ITEM_NITER_ORE_OW,
                EternalGeneralItems.GEM_NITER);

        registerEnrichingGemRecipes(map, "onyx",
                EternalOreBlockItemTags.Items.ITEM_ONYX_ORE_OW,
                EternalGeneralItems.GEM_ONYX);

        registerEnrichingGemRecipes(map, "peridot",
                EternalOreBlockItemTags.Items.ITEM_PERIDOT_ORE_OW,
                EternalGeneralItems.GEM_PERIDOT);

        registerEnrichingGemRecipes(map, "ruby",
                EternalOreBlockItemTags.Items.ITEM_RUBY_ORE_OW,
                EternalGeneralItems.GEM_RUBY);

        registerEnrichingGemRecipes(map, "sapphire",
                EternalOreBlockItemTags.Items.ITEM_SAPPHIRE_ORE_OW,
                EternalGeneralItems.GEM_SAPPHIRE);

        registerEnrichingGemRecipes(map, "obsidian",
                EternalOreBlockItemTags.Items.ITEM_OBSIDIAN_ORE_NETHER,
                EternalGeneralItems.GEM_OBSIDIAN_SHARD);

        ORE_GEM_ENTRIES = Map.copyOf(map);
    }

    /// Material -> Dust Only
    public static final Map<String, CrushingRecipeType.InputsMaterials> DUST_MATERIAL_ENTRIES;
    static
    {
        Map<String, CrushingRecipeType.InputsMaterials> map = new HashMap<>();

        registerMaterialCrushingRecipes(map, "aluminum", EternalIngotTags.Items.ALUMINIUM_INGOT, EternalGeneralItems.ALUMINUM_DUST);
        registerMaterialCrushingRecipes(map, "amber", EternalGemTags.Items.GEM_AMBER, EternalGeneralItems.AMBER_DUST);
        registerMaterialCrushingRecipes(map, "amethyst", Tags.Items.GEMS_AMETHYST, EternalGeneralItems.AMETHYST_DUST);
        registerMaterialCrushingRecipes(map, "apatite", EternalGemTags.Items.GEM_APATITE, EternalGeneralItems.APATITE_DUST);
        registerMaterialCrushingRecipes(map, "blue_steel", EternalIngotTags.Items.BLUE_STEEL_INGOT, EternalGeneralItems.BLUE_STEEL_DUST);
        registerMaterialCrushingRecipes(map, "brass", EternalIngotTags.Items.BRASS_INGOT, EternalGeneralItems.BRASS_DUST);
        registerMaterialCrushingRecipes(map, "britannia", EternalIngotTags.Items.BRITANNIA_INGOT, EternalGeneralItems.BRITANNIA_SILVER_DUST);
        registerMaterialCrushingRecipes(map, "bronze", EternalIngotTags.Items.BRONZE_INGOT, EternalGeneralItems.BRONZE_DUST);
        registerMaterialCrushingRecipes(map, "catalyrium", EternalIngotTags.Items.CATALYRIUM_INGOT, EternalGeneralItems.CATALYRIUM_DUST);
        registerMaterialCrushingRecipes(map, "cast_iron", EternalIngotTags.Items.CAST_IRON_INGOT, EternalGeneralItems.CAST_IRON_DUST);
        registerMaterialCrushingRecipes(map, "cast_steel", EternalIngotTags.Items.CAST_STEEL_INGOT, EternalGeneralItems.CAST_STEEL_DUST);
        registerMaterialCrushingRecipes(map, "coal", EternalItemsGeneralTags.Items.COAL, EternalGeneralItems.COAL_DUST);
        registerMaterialCrushingRecipes(map, "cobalt", EternalIngotTags.Items.COBALT_INGOT, EternalGeneralItems.COBALT_DUST);
        registerMaterialCrushingRecipes(map, "constantan", EternalIngotTags.Items.CONSTANTAN_INGOT, EternalGeneralItems.CONSTANTAN_DUST);
        registerMaterialCrushingRecipes(map, "copper", Tags.Items.INGOTS_COPPER, EternalGeneralItems.COPPER_DUST);
        registerMaterialCrushingRecipes(map, "diamond", Tags.Items.GEMS_DIAMOND, EternalGeneralItems.DIAMOND_DUST);
        registerMaterialCrushingRecipes(map, "electrum", EternalIngotTags.Items.ELECTRUM_INGOT, EternalGeneralItems.ELECTRUM_DUST);
        registerMaterialCrushingRecipes(map, "emerald", Tags.Items.GEMS_EMERALD, EternalGeneralItems.EMERALD_DUST);
        registerMaterialCrushingRecipes(map, "ender_pearl", Tags.Items.ENDER_PEARLS, EternalGeneralItems.ENDER_DUST);
        registerMaterialCrushingRecipes(map, "enderium", EternalIngotTags.Items.ENDERIUM_INGOT, EternalGeneralItems.ENDERIUM_DUST);
        registerMaterialCrushingRecipes(map, "endstone", Tags.Items.END_STONES, EternalGeneralItems.ENDSTONE_DUST);
        registerMaterialCrushingRecipes(map, "fluorite", EternalGemTags.Items.GEM_FLUORITE, EternalGeneralItems.FLUORITE_DUST);
        registerMaterialCrushingRecipes(map, "gallium", EternalIngotTags.Items.GALLIUM_INGOT, EternalGeneralItems.GALLIUM_DUST);
        registerMaterialCrushingRecipes(map, "gold", Tags.Items.INGOTS_GOLD, EternalGeneralItems.GOLD_DUST);
        registerMaterialCrushingRecipes(map, "graphite", EternalIngotTags.Items.GRAPHITE_INGOT, EternalGeneralItems.GRAPHITE_DUST);
        registerMaterialCrushingRecipes(map, "invar", EternalIngotTags.Items.INVAR_INGOT, EternalGeneralItems.INVAR_DUST);
        registerMaterialCrushingRecipes(map, "iridium", EternalIngotTags.Items.IRIDIUM_INGOT, EternalGeneralItems.IRIDIUM_DUST);
        registerMaterialCrushingRecipes(map, "iron", Tags.Items.INGOTS_IRON, EternalGeneralItems.IRON_DUST);
        registerMaterialCrushingRecipes(map, "lapis", Tags.Items.GEMS_LAPIS, EternalGeneralItems.LAPIS_LAZULI_DUST);
        registerMaterialCrushingRecipes(map, "lead", EternalIngotTags.Items.LEAD_INGOT, EternalGeneralItems.LEAD_DUST);
        registerMaterialCrushingRecipes(map, "lumium", EternalIngotTags.Items.LUMIUM_INGOT, EternalGeneralItems.LUMIUM_DUST);
        registerMaterialCrushingRecipes(map, "necroticarite", EternalGemTags.Items.GEM_NECROTICARITE, EternalGeneralItems.NECROTICARITE_DUST);
        registerMaterialCrushingRecipes(map, "nether_star", Tags.Items.NETHER_STARS, EternalGeneralItems.NETHER_STAR_DUST);
        registerMaterialCrushingRecipes(map, "netherite", Tags.Items.INGOTS_NETHERITE, EternalGeneralItems.NETHERITE_DUST);
        registerMaterialCrushingRecipes(map, "netherrack", Tags.Items.NETHERRACKS, EternalGeneralItems.NETHERRACK_DUST);
        registerMaterialCrushingRecipes(map, "nethersteel", EternalIngotTags.Items.NETHERSTEEL_INGOT, EternalGeneralItems.NETHERSTEEL_DUST);
        registerMaterialCrushingRecipes(map, "nickel", EternalIngotTags.Items.NICKEL_INGOT, EternalGeneralItems.NICKEL_DUST);
        registerMaterialCrushingRecipes(map, "niter", EternalGemTags.Items.GEM_NITER, EternalGeneralItems.NITER_DUST);
        registerMaterialCrushingRecipes(map, "obsidian_block", Tags.Items.OBSIDIANS, EternalGeneralItems.OBSIDIAN_DUST);
        registerMaterialCrushingRecipes(map, "obsidian_gem", EternalGemTags.Items.GEM_OBSIDIAN, EternalGeneralItems.OBSIDIAN_DUST);
        registerMaterialCrushingRecipes(map, "onyx", EternalGemTags.Items.GEM_ONYX, EternalGeneralItems.ONYX_DUST);
        registerMaterialCrushingRecipes(map, "osmium", EternalIngotTags.Items.OSMIUM_INGOT, EternalGeneralItems.OSMIUM_DUST);
        registerMaterialCrushingRecipes(map, "peridot", EternalGemTags.Items.GEM_PERIDOT, EternalGeneralItems.PERIDOT_DUST);
        registerMaterialCrushingRecipes(map, "pewter", EternalIngotTags.Items.PEWTER_INGOT, EternalGeneralItems.PEWTER_DUST);
        registerMaterialCrushingRecipes(map, "pig_iron", EternalIngotTags.Items.PIG_IRON_INGOT, EternalGeneralItems.PIG_IRON_DUST);
        registerMaterialCrushingRecipes(map, "platinum", EternalIngotTags.Items.PLATINUM_INGOT, EternalGeneralItems.PLATINUM_DUST);
        registerMaterialCrushingRecipes(map, "plutonium", EternalIngotTags.Items.PLUTONIUM_INGOT, EternalGeneralItems.PLUTONIUM_DUST);
        registerMaterialCrushingRecipes(map, "quartz", Tags.Items.GEMS_QUARTZ, EternalGeneralItems.QUARTZ_DUST);
        registerMaterialCrushingRecipes(map, "rose_gold", EternalIngotTags.Items.ROSE_GOLD_INGOT, EternalGeneralItems.ROSE_GOLD_DUST);
        registerMaterialCrushingRecipes(map, "ruby", EternalGemTags.Items.GEM_RUBY, EternalGeneralItems.RUBY_DUST);
        registerMaterialCrushingRecipes(map, "sapphire", EternalGemTags.Items.GEM_SAPPHIRE, EternalGeneralItems.SAPPHIRE_DUST);
        registerMaterialCrushingRecipes(map, "sculk", EternalItemsGeneralTags.Items.SCULK, EternalGeneralItems.SCULK_DUST);
        registerMaterialCrushingRecipes(map, "signalum", EternalIngotTags.Items.SIGNALUM_INGOT, EternalGeneralItems.SIGNALUM_DUST);
        registerMaterialCrushingRecipes(map, "silver", EternalIngotTags.Items.SILVER_INGOT, EternalGeneralItems.SILVER_DUST);
        registerMaterialCrushingRecipes(map, "sulfur", EternalRawMaterialTags.SULFUR, EternalGeneralItems.SULFUR_DUST);
        registerMaterialCrushingRecipes(map, "shadowsteel", EternalIngotTags.Items.SHADOWSTEEL_INGOT, EternalGeneralItems.SHADOWSTEEL_DUST);
        registerMaterialCrushingRecipes(map, "steel", EternalIngotTags.Items.STEEL_INGOT, EternalGeneralItems.STEEL_DUST);
        registerMaterialCrushingRecipes(map, "tin", EternalIngotTags.Items.TIN_INGOT, EternalGeneralItems.TIN_DUST);
        registerMaterialCrushingRecipes(map, "titanium", EternalIngotTags.Items.TITANIUM_INGOT, EternalGeneralItems.TITANIUM_DUST);
        registerMaterialCrushingRecipes(map, "ultimatitanium", EternalIngotTags.Items.ULTIMATITANIUM_INGOT, EternalGeneralItems.ULTIMATITANIUM_DUST);
        registerMaterialCrushingRecipes(map, "uraninite", EternalIngotTags.Items.URANINITE_INGOT, EternalGeneralItems.URANINITE_DUST);
        registerMaterialCrushingRecipes(map, "uranium", EternalIngotTags.Items.URANIUM_INGOT, EternalGeneralItems.URANIUM_DUST);
        registerMaterialCrushingRecipes(map, "wrought_iron", EternalIngotTags.Items.WROUGHT_IRON_INGOT, EternalGeneralItems.WROUGHT_IRON_DUST);
        registerMaterialCrushingRecipes(map, "zinc", EternalIngotTags.Items.ZINC_INGOT, EternalGeneralItems.ZINC_DUST);

        DUST_MATERIAL_ENTRIES = Map.copyOf(map);
    }

    ///
    /// Material Set/Shard -> Clump
    ///
    public static final Map<String, PurificationRecipeType.Inputs> CLUMP_ENTRIES;
    static
    {
        Map<String, PurificationRecipeType.Inputs> map = new HashMap<>();

        registerPurificationTrueRecipes(map, "aluminum",
                EternalRawMaterialTags.RAW_ALUMINUM,
                EternalOresItemMekTags.Items.SHARD_ALUMINUM_C,
                EternalStorageRawOreBlockItemTags.Items.RAW_ALUMINUM_ST_ITEM,
                EternalOreBlockItemTags.Items.ITEM_ALUMINUM_ORE_OW,
                EternalOresMekanismCompatItems.ALUMINUM_CLUMP);

        registerPurificationTrueRecipes(map, "cobalt",
                EternalRawMaterialTags.RAW_COBALT,
                EternalOresItemMekTags.Items.SHARD_COBALT_C,
                EternalStorageRawOreBlockItemTags.Items.RAW_COBALT_ST_ITEM,
                EternalOreBlockItemTags.Items.ITEM_COBALT_ORE_OW,
                EternalOresMekanismCompatItems.COBALT_CLUMP);

        registerPurificationTrueRecipes(map, "gallium",
                EternalRawMaterialTags.RAW_GALLIUM,
                EternalOresItemMekTags.Items.SHARD_GALLIUM_C,
                EternalStorageRawOreBlockItemTags.Items.RAW_GALLIUM_ST_ITEM,
                EternalOreBlockItemTags.Items.ITEM_GALLIUM_ORE_OW,
                EternalOresMekanismCompatItems.GALLIUM_CLUMP);

        registerPurificationTrueRecipes(map, "iridium",
                EternalRawMaterialTags.RAW_IRIDIUM,
                EternalOresItemMekTags.Items.SHARD_IRIDIUM_C,
                EternalStorageRawOreBlockItemTags.Items.RAW_IRIDIUM_ST_ITEM,
                EternalOreBlockItemTags.Items.ITEM_IRIDIUM_ORE_OW,
                EternalOresMekanismCompatItems.IRIDIUM_CLUMP);

        registerPurificationTrueRecipes(map, "nickel",
                EternalRawMaterialTags.RAW_NICKEL,
                EternalOresItemMekTags.Items.SHARD_NICKEL_C,
                EternalStorageRawOreBlockItemTags.Items.RAW_NICKEL_ST_ITEM,
                EternalOreBlockItemTags.Items.ITEM_NICKEL_ORE_OW,
                EternalOresMekanismCompatItems.NICKEL_CLUMP);

        registerPurificationTrueRecipes(map, "platinum",
                EternalRawMaterialTags.RAW_PLATINUM,
                EternalOresItemMekTags.Items.SHARD_PLATINUM_C,
                EternalStorageRawOreBlockItemTags.Items.RAW_PLATINUM_ST_ITEM,
                EternalOreBlockItemTags.Items.ITEM_PLATINUM_ORE_OW,
                EternalOresMekanismCompatItems.PLATINUM_CLUMP);

        registerPurificationTrueRecipes(map, "silver",
                EternalRawMaterialTags.RAW_SILVER,
                EternalOresItemMekTags.Items.SHARD_SILVER_C,
                EternalStorageRawOreBlockItemTags.Items.RAW_SILVER_ST_ITEM,
                EternalOreBlockItemTags.Items.ITEM_SILVER_ORE_OW,
                EternalOresMekanismCompatItems.SILVER_CLUMP);

        registerPurificationTrueRecipes(map, "uraninite",
                EternalRawMaterialTags.RAW_URANINITE,
                EternalOresItemMekTags.Items.SHARD_URANINITE_C,
                EternalStorageRawOreBlockItemTags.Items.RAW_URANINITE_ST_ITEM,
                EternalOreBlockItemTags.Items.ITEM_URANINITE_ORE_OW,
                EternalOresMekanismCompatItems.URANINITE_CLUMP);

        registerPurificationTrueRecipes(map, "zinc",
                EternalRawMaterialTags.RAW_ZINC,
                EternalOresItemMekTags.Items.SHARD_ZINC_C,
                EternalStorageRawOreBlockItemTags.Items.RAW_ZINC_ST_ITEM,
                EternalOreBlockItemTags.Items.ITEM_ZINC_ORE_OW,
                EternalOresMekanismCompatItems.ZINC_CLUMP);

        CLUMP_ENTRIES = Map.copyOf(map);
    }

    /// Catalyrium Only
    public static final Map<String, PurificationRecipeType.InputsDiff> CLUMP_WITHOUT_ORE_ENTRIES;
    static
    {
        Map<String, PurificationRecipeType.InputsDiff> map = new HashMap<>();

        registerPurificationRecipes(map, "catalyrium",
                EternalRawMaterialTags.RAW_CATALYRIUM,
                EternalOresItemMekTags.Items.SHARD_CATALYRIUM_C,
                EternalStorageRawOreBlockItemTags.Items.RAW_CATALYRIUM_ST_ITEM,
                EternalOresMekanismCompatItems.CATALYRIUM_CLUMP);

        CLUMP_WITHOUT_ORE_ENTRIES = Map.copyOf(map);
    }

    ///
    /// Material Set/Crystal -> Shard
    ///
    public static final Map<String, InjectorRecipeType.Inputs> SHARD_ENTRIES;
    static
    {
        Map<String, InjectorRecipeType.Inputs> map = new HashMap<>();

        registerInjectingTrueRecipes(map,"aluminum",
                EternalRawMaterialTags.RAW_ALUMINUM,
                EternalOresItemMekTags.Items.CRYSTAL_ALUMINUM_C,
                EternalStorageRawOreBlockItemTags.Items.RAW_ALUMINUM_ST_ITEM,
                EternalOreBlockItemTags.Items.ITEM_ALUMINUM_ORE_OW,
                EternalOresMekanismCompatItems.ALUMINUM_SHARD);

        registerInjectingTrueRecipes(map,"cobalt",
                EternalRawMaterialTags.RAW_COBALT,
                EternalOresItemMekTags.Items.CRYSTAL_COBALT_C,
                EternalStorageRawOreBlockItemTags.Items.RAW_COBALT_ST_ITEM,
                EternalOreBlockItemTags.Items.ITEM_COBALT_ORE_OW,
                EternalOresMekanismCompatItems.COBALT_SHARD);

        registerInjectingTrueRecipes(map,"gallium",
                EternalRawMaterialTags.RAW_GALLIUM,
                EternalOresItemMekTags.Items.CRYSTAL_GALLIUM_C,
                EternalStorageRawOreBlockItemTags.Items.RAW_GALLIUM_ST_ITEM,
                EternalOreBlockItemTags.Items.ITEM_GALLIUM_ORE_OW,
                EternalOresMekanismCompatItems.GALLIUM_SHARD);

        registerInjectingTrueRecipes(map,"iridium",
                EternalRawMaterialTags.RAW_IRIDIUM,
                EternalOresItemMekTags.Items.CRYSTAL_IRIDIUM_C,
                EternalStorageRawOreBlockItemTags.Items.RAW_IRIDIUM_ST_ITEM,
                EternalOreBlockItemTags.Items.ITEM_IRIDIUM_ORE_OW,
                EternalOresMekanismCompatItems.IRIDIUM_SHARD);

        registerInjectingTrueRecipes(map,"nickel",
                EternalRawMaterialTags.RAW_NICKEL,
                EternalOresItemMekTags.Items.CRYSTAL_NICKEL_C,
                EternalStorageRawOreBlockItemTags.Items.RAW_NICKEL_ST_ITEM,
                EternalOreBlockItemTags.Items.ITEM_NICKEL_ORE_OW,
                EternalOresMekanismCompatItems.NICKEL_SHARD);

        registerInjectingTrueRecipes(map,"platinum",
                EternalRawMaterialTags.RAW_PLATINUM,
                EternalOresItemMekTags.Items.CRYSTAL_PLATINUM_C,
                EternalStorageRawOreBlockItemTags.Items.RAW_PLATINUM_ST_ITEM,
                EternalOreBlockItemTags.Items.ITEM_PLATINUM_ORE_OW,
                EternalOresMekanismCompatItems.PLATINUM_SHARD);

        registerInjectingTrueRecipes(map,"silver",
                EternalRawMaterialTags.RAW_SILVER,
                EternalOresItemMekTags.Items.CRYSTAL_SILVER_C,
                EternalStorageRawOreBlockItemTags.Items.RAW_SILVER_ST_ITEM,
                EternalOreBlockItemTags.Items.ITEM_SILVER_ORE_OW,
                EternalOresMekanismCompatItems.SILVER_SHARD);

        registerInjectingTrueRecipes(map,"uraninite",
                EternalRawMaterialTags.RAW_URANINITE,
                EternalOresItemMekTags.Items.CRYSTAL_URANINITE_C,
                EternalStorageRawOreBlockItemTags.Items.RAW_URANINITE_ST_ITEM,
                EternalOreBlockItemTags.Items.ITEM_URANINITE_ORE_OW,
                EternalOresMekanismCompatItems.URANINITE_SHARD);

        registerInjectingTrueRecipes(map,"zinc",
                EternalRawMaterialTags.RAW_ZINC,
                EternalOresItemMekTags.Items.CRYSTAL_ZINC_C,
                EternalStorageRawOreBlockItemTags.Items.RAW_ZINC_ST_ITEM,
                EternalOreBlockItemTags.Items.ITEM_ZINC_ORE_OW,
                EternalOresMekanismCompatItems.ZINC_SHARD);

        SHARD_ENTRIES = Map.copyOf(map);
    }

    /// Catalyrium Only
    public static final Map<String, InjectorRecipeType.InputsDiff> SHARD_WITHOUT_ORE_ENTRIES;
    static
    {
        Map<String, InjectorRecipeType.InputsDiff> map = new HashMap<>();

        registerInjectingRecipes(map,"catalyrium",
                EternalRawMaterialTags.RAW_CATALYRIUM,
                EternalOresItemMekTags.Items.CRYSTAL_CATALYRIUM_C,
                EternalStorageRawOreBlockItemTags.Items.RAW_CATALYRIUM_ST_ITEM,
                EternalOresMekanismCompatItems.CATALYRIUM_SHARD);

        SHARD_WITHOUT_ORE_ENTRIES = Map.copyOf(map);
    }

    /// Material Dirty Slurry -> Clean Slurry
    public static final Map<String, WashingRecipeType.Inputs> DIRTY_SLURRY_TO_CLEAN;
    static
    {
        Map<String, WashingRecipeType.Inputs> map = new HashMap<>();

        registerWashingRecipes(map,"aluminum",
                EternalOresMekFluids.ALUMINUM_SLURRY.getDirtySlurry(),
                FluidTags.WATER,
                EternalOresMekFluids.ALUMINUM_SLURRY.getCleanSlurry());

        registerWashingRecipes(map,"catalyrium",
                EternalOresMekFluids.CATALYRIUM_SLURRY.getDirtySlurry(),
                FluidTags.WATER,
                EternalOresMekFluids.CATALYRIUM_SLURRY.getCleanSlurry());

        registerWashingRecipes(map,"cobalt",
                EternalOresMekFluids.COBALT_SLURRY.getDirtySlurry(),
                FluidTags.WATER,
                EternalOresMekFluids.COBALT_SLURRY.getCleanSlurry());

        registerWashingRecipes(map,"gallium",
                EternalOresMekFluids.GALLIUM_SLURRY.getDirtySlurry(),
                FluidTags.WATER,
                EternalOresMekFluids.GALLIUM_SLURRY.getCleanSlurry());

        registerWashingRecipes(map,"iridium",
                EternalOresMekFluids.IRIDIUM_SLURRY.getDirtySlurry(),
                FluidTags.WATER,
                EternalOresMekFluids.IRIDIUM_SLURRY.getCleanSlurry());

        registerWashingRecipes(map,"nickel",
                EternalOresMekFluids.NICKEL_SLURRY.getDirtySlurry(),
                FluidTags.WATER,
                EternalOresMekFluids.NICKEL_SLURRY.getCleanSlurry());

        registerWashingRecipes(map,"platinum",
                EternalOresMekFluids.PLATINUM_SLURRY.getDirtySlurry(),
                FluidTags.WATER,
                EternalOresMekFluids.PLATINUM_SLURRY.getCleanSlurry());

        registerWashingRecipes(map,"silver",
                EternalOresMekFluids.SILVER_SLURRY.getDirtySlurry(),
                FluidTags.WATER,
                EternalOresMekFluids.SILVER_SLURRY.getCleanSlurry());

        registerWashingRecipes(map,"uraninite",
                EternalOresMekFluids.URANINITE_SLURRY.getDirtySlurry(),
                FluidTags.WATER,
                EternalOresMekFluids.URANINITE_SLURRY.getCleanSlurry());

        registerWashingRecipes(map,"zinc",
                EternalOresMekFluids.ZINC_SLURRY.getDirtySlurry(),
                FluidTags.WATER,
                EternalOresMekFluids.ZINC_SLURRY.getCleanSlurry());

        DIRTY_SLURRY_TO_CLEAN = Map.copyOf(map);
    }

    /// Material Set -> Dirty Slurry
    public static final Map<String, DissolutionRecipeType.Inputs> MATERIAL_TO_DIRTY_SLURRY;
    static
    {
        Map<String, DissolutionRecipeType.Inputs> map = new HashMap<>();

        registerDissolutionTrueRecipes(map, "aluminum",
                EternalRawMaterialTags.RAW_ALUMINIUM,
                EternalStorageRawOreBlockItemTags.Items.RAW_ALUMINUM_ST_ITEM,
                EternalOreBlockItemTags.Items.ITEM_ALUMINUM_ORE_OW,
                EternalOresMekFluids.ALUMINUM_SLURRY.getDirtySlurry());

        registerDissolutionTrueRecipes(map, "cobalt",
                EternalRawMaterialTags.RAW_COBALT,
                EternalStorageRawOreBlockItemTags.Items.RAW_COBALT_ST_ITEM,
                EternalOreBlockItemTags.Items.ITEM_COBALT_ORE_OW,
                EternalOresMekFluids.COBALT_SLURRY.getDirtySlurry());

        registerDissolutionTrueRecipes(map, "gallium",
                EternalRawMaterialTags.RAW_GALLIUM,
                EternalStorageRawOreBlockItemTags.Items.RAW_GALLIUM_ST_ITEM,
                EternalOreBlockItemTags.Items.ITEM_GALLIUM_ORE_OW,
                EternalOresMekFluids.GALLIUM_SLURRY.getDirtySlurry());

        registerDissolutionTrueRecipes(map, "iridium",
                EternalRawMaterialTags.RAW_IRIDIUM,
                EternalStorageRawOreBlockItemTags.Items.RAW_IRIDIUM_ST_ITEM,
                EternalOreBlockItemTags.Items.ITEM_IRIDIUM_ORE_OW,
                EternalOresMekFluids.IRIDIUM_SLURRY.getDirtySlurry());

        registerDissolutionTrueRecipes(map, "nickel",
                EternalRawMaterialTags.RAW_NICKEL,
                EternalStorageRawOreBlockItemTags.Items.RAW_NICKEL_ST_ITEM,
                EternalOreBlockItemTags.Items.ITEM_NICKEL_ORE_OW,
                EternalOresMekFluids.NICKEL_SLURRY.getDirtySlurry());

        registerDissolutionTrueRecipes(map, "platinum",
                EternalRawMaterialTags.RAW_PLATINUM,
                EternalStorageRawOreBlockItemTags.Items.RAW_PLATINUM_ST_ITEM,
                EternalOreBlockItemTags.Items.ITEM_PLATINUM_ORE_OW,
                EternalOresMekFluids.PLATINUM_SLURRY.getDirtySlurry());

        registerDissolutionTrueRecipes(map, "silver",
                EternalRawMaterialTags.RAW_SILVER,
                EternalStorageRawOreBlockItemTags.Items.RAW_SILVER_ST_ITEM,
                EternalOreBlockItemTags.Items.ITEM_SILVER_ORE_OW,
                EternalOresMekFluids.SILVER_SLURRY.getDirtySlurry());

        registerDissolutionTrueRecipes(map, "uraninite",
                EternalRawMaterialTags.RAW_URANINITE,
                EternalStorageRawOreBlockItemTags.Items.RAW_URANINITE_ST_ITEM,
                EternalOreBlockItemTags.Items.ITEM_URANINITE_ORE_OW,
                EternalOresMekFluids.URANINITE_SLURRY.getDirtySlurry());

        registerDissolutionTrueRecipes(map, "zinc",
                EternalRawMaterialTags.RAW_ZINC,
                EternalStorageRawOreBlockItemTags.Items.RAW_ZINC_ST_ITEM,
                EternalOreBlockItemTags.Items.ITEM_ZINC_ORE_OW,
                EternalOresMekFluids.ZINC_SLURRY.getDirtySlurry());

        MATERIAL_TO_DIRTY_SLURRY = Map.copyOf(map);
    }

    public static final Map<String, DissolutionRecipeType.InputsDiff> MATERIAL_WITHOUT_ORES_TO_DIRTY_SLURRY;
    static
    {
        Map<String, DissolutionRecipeType.InputsDiff> map = new HashMap<>();

        registerDissolutionRecipes(map, "catalyrium",
                EternalRawMaterialTags.RAW_CATALYRIUM,
                EternalStorageRawOreBlockItemTags.Items.RAW_CATALYRIUM_ST_ITEM,
                EternalOresMekFluids.CATALYRIUM_SLURRY.getDirtySlurry());

        MATERIAL_WITHOUT_ORES_TO_DIRTY_SLURRY = Map.copyOf(map);
    }

    /// Clean Slurry -> Crystal
    public static final Map<String, CrystallizingRecipeType.Inputs> CLEAN_SLURRY_TO_CRYSTAL;
    static
    {
        Map<String, CrystallizingRecipeType.Inputs> map = new HashMap<>();

        registerCrystallizationRecipes(map, "aluminum",
                EternalOresMekFluids.ALUMINUM_SLURRY.getCleanSlurry(),
                EternalOresMekanismCompatItems.ALUMINUM_CRYSTAL);

        registerCrystallizationRecipes(map, "catalyrium",
                EternalOresMekFluids.CATALYRIUM_SLURRY.getCleanSlurry(),
                EternalOresMekanismCompatItems.CATALYRIUM_CRYSTAL);

        registerCrystallizationRecipes(map, "cobalt",
                EternalOresMekFluids.COBALT_SLURRY.getCleanSlurry(),
                EternalOresMekanismCompatItems.COBALT_CRYSTAL);

        registerCrystallizationRecipes(map, "gallium",
                EternalOresMekFluids.GALLIUM_SLURRY.getCleanSlurry(),
                EternalOresMekanismCompatItems.GALLIUM_CRYSTAL);

        registerCrystallizationRecipes(map, "iridium",
                EternalOresMekFluids.IRIDIUM_SLURRY.getCleanSlurry(),
                EternalOresMekanismCompatItems.IRIDIUM_CRYSTAL);

        registerCrystallizationRecipes(map, "nickel",
                EternalOresMekFluids.NICKEL_SLURRY.getCleanSlurry(),
                EternalOresMekanismCompatItems.NICKEL_CRYSTAL);

        registerCrystallizationRecipes(map, "platinum",
                EternalOresMekFluids.PLATINUM_SLURRY.getCleanSlurry(),
                EternalOresMekanismCompatItems.PLATINUM_CRYSTAL);

        registerCrystallizationRecipes(map, "silver",
                EternalOresMekFluids.SILVER_SLURRY.getCleanSlurry(),
                EternalOresMekanismCompatItems.SILVER_CRYSTAL);

        registerCrystallizationRecipes(map, "uraninite",
                EternalOresMekFluids.URANINITE_SLURRY.getCleanSlurry(),
                EternalOresMekanismCompatItems.URANINITE_CRYSTAL);

        registerCrystallizationRecipes(map, "zinc",
                EternalOresMekFluids.ZINC_SLURRY.getCleanSlurry(),
                EternalOresMekanismCompatItems.ZINC_CRYSTAL);

        CLEAN_SLURRY_TO_CRYSTAL = Map.copyOf(map);
    }
}
