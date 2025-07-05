package net.radzratz.eternalores.util.compat.mekanism;

import net.minecraft.tags.FluidTags;
import net.neoforged.neoforge.common.Tags;
import net.radzratz.eternalores.item.EOItems;
import net.radzratz.eternalores.util.compat.mekanism.fluids.EOMekFluids;
import net.radzratz.eternalores.util.compat.mekanism.recipe_types.enums.*;
import net.radzratz.eternalores.util.compat.mekanism.tags.EOItemMekTags;
import net.radzratz.eternalores.util.tags.item.EOItemsGeneralTags;
import net.radzratz.eternalores.util.tags.item.gems.EOGemTags;
import net.radzratz.eternalores.util.tags.item.ingots.EOIngotTags;
import net.radzratz.eternalores.util.tags.item.ores.EOOreBlockItemTags;
import net.radzratz.eternalores.util.tags.item.plates.EOPlates;
import net.radzratz.eternalores.util.tags.item.raw_materials.EORawMaterialTags;
import net.radzratz.eternalores.util.tags.item.rods.EOGemRodsTags;
import net.radzratz.eternalores.util.tags.item.rods.EOMetalRodsTags;
import net.radzratz.eternalores.util.tags.item.rods.EOMiscRodsTags;
import net.radzratz.eternalores.util.tags.item.storage_blocks.EOStorageRawOreBlockItemTags;

import java.util.HashMap;
import java.util.Map;

import static net.radzratz.eternalores.util.compat.mekanism.recipe_types.EOMekRecipes.*;

public class EOMekEntries
{
    ///
    /// Material Set/Clump -> Dirty Dust List
    ///
    public static final Map<String, EOCrushingType.Inputs> DIRTY_DUST_ENTRIES;
    static
    {
        Map<String, EOCrushingType.Inputs> map = new HashMap<>();

        registerDirtyDustRecipes(map, "aluminum",
            EOItemMekTags.Items.CLUMP_ALUMINUM_C,
            EOMekCompatItems.ALUMINUM_DIRTY_DUST);

        registerDirtyDustRecipes(map, "aluminum",
                EOItemMekTags.Items.CLUMP_ARDITE_C,
                EOMekCompatItems.ARDITE_DIRTY_DUST);

        registerDirtyDustRecipes(map, "catalyrium",
                EOItemMekTags.Items.CLUMP_CATALYRIUM_C,
                EOMekCompatItems.CATALYRIUM_DIRTY_DUST);

        registerDirtyDustRecipes(map, "cobalt",
                EOItemMekTags.Items.CLUMP_COBALT_C,
                EOMekCompatItems.COBALT_DIRTY_DUST);

        registerDirtyDustRecipes(map, "gallium",
                EOItemMekTags.Items.CLUMP_GALLIUM_C,
                EOMekCompatItems.GALLIUM_DIRTY_DUST);

        registerDirtyDustRecipes(map, "iridium",
                EOItemMekTags.Items.CLUMP_IRIDIUM_C,
                EOMekCompatItems.IRIDIUM_DIRTY_DUST);

        registerDirtyDustRecipes(map, "nickel",
                EOItemMekTags.Items.CLUMP_NICKEL_C,
                EOMekCompatItems.NICKEL_DIRTY_DUST);

        registerDirtyDustRecipes(map, "platinum",
                EOItemMekTags.Items.CLUMP_PLATINUM_C,
                EOMekCompatItems.PLATINUM_DIRTY_DUST);

        registerDirtyDustRecipes(map, "silver",
                EOItemMekTags.Items.CLUMP_SILVER_C,
                EOMekCompatItems.SILVER_DIRTY_DUST);

        registerDirtyDustRecipes(map, "uraninite",
                EOItemMekTags.Items.CLUMP_URANINITE_C,
                EOMekCompatItems.URANINITE_DIRTY_DUST);

        registerDirtyDustRecipes(map, "zinc",
                EOItemMekTags.Items.CLUMP_ZINC_C,
                EOMekCompatItems.ZINC_DIRTY_DUST);

        DIRTY_DUST_ENTRIES = Map.copyOf(map);
    }

    ///
    /// Material Set Plates/Rods -> Dust
    ///
    public static final Map<String, EOCrushingType.InputsDeconstruction> DUST_DECONSTRUCTION_ENTRIES;
    static
    {
        Map<String, EOCrushingType.InputsDeconstruction> map = new HashMap<>();

        registerDecoRecipes(map, "aluminum",
                EOPlates.Items.ALUMINUM_PLATE,
                EOMetalRodsTags.Items.ROD_ALUMINUM,
                EOItems.ALUMINUM_DUST);

        registerDecoRecipes(map, "ardite",
                EOPlates.Items.ARDITE_PLATE,
                EOMetalRodsTags.Items.ROD_ARDITE,
                EOItems.ARDITE_DUST);

        registerDecoRecipes(map, "blue_steel",
                EOPlates.Items.BLUE_STEEL_PLATE,
                EOMetalRodsTags.Items.ROD_BLUE_STEEL,
                EOItems.BLUE_STEEL_DUST);

        registerDecoRecipes(map, "brass",
                EOPlates.Items.BRASS_PLATE,
                EOMetalRodsTags.Items.ROD_BRASS,
                EOItems.BRASS_DUST);

        registerDecoRecipes(map, "bronze",
                EOPlates.Items.BRONZE_PLATE,
                EOMetalRodsTags.Items.ROD_BRONZE,
                EOItems.BRONZE_DUST);

        registerDecoRecipes(map, "catalyrium",
                EOPlates.Items.CATALYRIUM_PLATE,
                EOMetalRodsTags.Items.ROD_CATALYRIUM,
                EOItems.CATALYRIUM_DUST);

        registerDecoRecipes(map, "cast_iron",
                EOPlates.Items.CAST_IRON_PLATE,
                EOMetalRodsTags.Items.ROD_CAST_IRON,
                EOItems.CAST_IRON_DUST);

        registerDecoRecipes(map, "cast_steel",
                EOPlates.Items.CAST_STEEL_PLATE,
                EOMetalRodsTags.Items.ROD_CAST_STEEL,
                EOItems.CAST_STEEL_DUST);

        registerDecoRecipes(map, "cobalt",
                EOPlates.Items.COBALT_PLATE,
                EOMetalRodsTags.Items.ROD_COBALT,
                EOItems.COBALT_DUST);

        registerDecoRecipes(map, "constantan",
                EOPlates.Items.CONSTANTAN_PLATE,
                EOMetalRodsTags.Items.ROD_CONSTANTAN,
                EOItems.CONSTANTAN_DUST);

        registerDecoRecipes(map, "copper",
                EOPlates.Items.COPPER_PLATE,
                EOMetalRodsTags.Items.ROD_COPPER,
                EOItems.COPPER_DUST);

        registerDecoRecipes(map, "diamond",
                EOPlates.Items.DIAMOND_PLATE,
                EOGemRodsTags.Items.ROD_DIAMOND,
                EOItems.DIAMOND_DUST);

        registerDecoRecipes(map, "electrum",
                EOPlates.Items.ELECTRUM_PLATE,
                EOMetalRodsTags.Items.ROD_ELECTRUM,
                EOItems.ELECTRUM_DUST);

        registerDecoRecipes(map, "enderium",
                EOPlates.Items.ENDERIUM_PLATE,
                EOMetalRodsTags.Items.ROD_ENDERIUM,
                EOItems.ENDERIUM_DUST);

        registerDecoRecipes(map, "gallium",
                EOPlates.Items.GALLIUM_PLATE,
                EOMetalRodsTags.Items.ROD_GALLIUM,
                EOItems.GALLIUM_DUST);

        registerDecoRecipes(map, "gold",
                EOPlates.Items.GOLD_PLATE,
                EOMetalRodsTags.Items.ROD_GOLD,
                EOItems.GOLD_DUST);

        registerDecoRecipes(map, "copper",
                EOPlates.Items.COPPER_PLATE,
                EOMetalRodsTags.Items.ROD_COPPER,
                EOItems.COPPER_DUST);

        registerDecoRecipes(map, "graphite",
                EOPlates.Items.GRAPHITE_PLATE,
                EOMiscRodsTags.Items.ROD_GRAPHITE,
                EOItems.GRAPHITE_DUST);

        registerDecoRecipes(map, "invar",
                EOPlates.Items.INVAR_PLATE,
                EOMetalRodsTags.Items.ROD_INVAR,
                EOItems.INVAR_DUST);

        registerDecoRecipes(map, "iridium",
                EOPlates.Items.IRIDIUM_PLATE,
                EOMetalRodsTags.Items.ROD_IRIDIUM,
                EOItems.IRIDIUM_DUST);

        registerDecoRecipes(map, "iron",
                EOPlates.Items.IRON_PLATE,
                EOMetalRodsTags.Items.ROD_IRON,
                EOItems.IRON_DUST);

        registerDecoRecipes(map, "lead",
                EOPlates.Items.LEAD_PLATE,
                EOMetalRodsTags.Items.ROD_LEAD,
                EOItems.LEAD_DUST);

        registerDecoRecipes(map, "lumium",
                EOPlates.Items.LUMIUM_PLATE,
                EOMetalRodsTags.Items.ROD_LUMIUM,
                EOItems.LUMIUM_DUST);

        registerDecoRecipes(map, "necroticarite",
                EOPlates.Items.NECROTICARITE_PLATE,
                EOGemRodsTags.Items.ROD_NECROTICARITE,
                EOItems.NECROTICARITE_DUST);

        registerDecoRecipes(map, "netherite",
                EOPlates.Items.NETHERITE_PLATE,
                EOMetalRodsTags.Items.ROD_NETHERITE,
                EOItems.NETHERITE_DUST);

        registerDecoRecipes(map, "nethersteel",
                EOPlates.Items.NETHERSTEEL_PLATE,
                EOMetalRodsTags.Items.ROD_NETHERSTEEL,
                EOItems.NETHERSTEEL_DUST);

        registerDecoRecipes(map, "nickel",
                EOPlates.Items.NICKEL_PLATE,
                EOMetalRodsTags.Items.ROD_NICKEL,
                EOItems.NICKEL_DUST);

        registerDecoRecipes(map, "osmium",
                EOPlates.Items.OSMIUM_PLATE,
                EOMetalRodsTags.Items.ROD_OSMIUM,
                EOItems.OSMIUM_DUST);

        registerDecoRecipes(map, "pig_iron",
                EOPlates.Items.PIG_IRON_PLATE,
                EOMetalRodsTags.Items.ROD_PIG_IRON,
                EOItems.PIG_IRON_DUST);

        registerDecoRecipes(map, "platinum",
                EOPlates.Items.PLATINUM_PLATE,
                EOMetalRodsTags.Items.ROD_PLATINUM,
                EOItems.PLATINUM_DUST);

        registerDecoRecipes(map, "plutonium",
                EOPlates.Items.PLUTONIUM_PLATE,
                EOMetalRodsTags.Items.ROD_PLUTONIUM,
                EOItems.PLUTONIUM_DUST);

        registerDecoRecipes(map, "rose_gold",
                EOPlates.Items.ROSE_GOLD_PLATE,
                EOMetalRodsTags.Items.ROD_ROSE_GOLD,
                EOItems.ROSE_GOLD_DUST);

        registerDecoRecipes(map, "sapphire",
                EOPlates.Items.SAPPHIRE_PLATE,
                EOGemRodsTags.Items.ROD_SAPPHIRE,
                EOItems.SAPPHIRE_DUST);

        registerDecoRecipes(map, "signalum",
                EOPlates.Items.SIGNALUM_PLATE,
                EOMetalRodsTags.Items.ROD_SIGNALUM,
                EOItems.SIGNALUM_DUST);

        registerDecoRecipes(map, "silver",
                EOPlates.Items.SILVER_PLATE,
                EOMetalRodsTags.Items.ROD_SILVER,
                EOItems.SILVER_DUST);

        registerDecoRecipes(map, "shadowsteel",
                EOPlates.Items.SHADOWSTEEL_PLATE,
                EOMetalRodsTags.Items.ROD_SHADOWSTEEL,
                EOItems.SHADOWSTEEL_DUST);

        registerDecoRecipes(map, "steel",
                EOPlates.Items.STEEL_PLATE,
                EOMetalRodsTags.Items.ROD_STEEL,
                EOItems.STEEL_DUST);

        registerDecoRecipes(map, "tin",
                EOPlates.Items.TIN_PLATE,
                EOMetalRodsTags.Items.ROD_TIN,
                EOItems.TIN_DUST);

        registerDecoRecipes(map, "titanium",
                EOPlates.Items.TITANIUM_PLATE,
                EOMetalRodsTags.Items.ROD_TITANIUM,
                EOItems.TITANIUM_DUST);

        registerDecoRecipes(map, "ultimatitanium",
                EOPlates.Items.ULTIMATITANIUM_PLATE,
                EOMetalRodsTags.Items.ROD_ULTIMATITANIUM,
                EOItems.ULTIMATITANIUM_DUST);

        registerDecoRecipes(map, "uranium",
                EOPlates.Items.URANIUM_PLATE,
                EOMetalRodsTags.Items.ROD_URANIUM,
                EOItems.URANIUM_DUST);

        registerDecoRecipes(map, "wrought_iron",
                EOPlates.Items.WROUGHT_IRON_PLATE,
                EOMetalRodsTags.Items.ROD_WROUGHT_IRON,
                EOItems.WROUGHT_IRON_DUST);

        registerDecoRecipes(map, "zinc",
                EOPlates.Items.ZINC_PLATE,
                EOMetalRodsTags.Items.ROD_ZINC,
                EOItems.ZINC_DUST);

        DUST_DECONSTRUCTION_ENTRIES = Map.copyOf(map);
    }

    ///
    /// Material Set/Dirty Dust -> Dust
    ///
    ///
    /// Catalyrium Set does not have an Ore Block
    ///
    /// As it's a Synthetic ore, cannot be found nor mined
    public static final Map<String, EOEnrichingType.Inputs> DUST_ENTRIES;
    static
    {
        Map<String, EOEnrichingType.Inputs> map = new HashMap<>();

        registerEnrichingDustTrueRecipes(map, "aluminum",
                EORawMaterialTags.RAW_ALUMINUM,
                EOItemMekTags.Items.DIRTY_ALUMINUM_C,
                EOStorageRawOreBlockItemTags.Items.RAW_ALUMINUM_ST_ITEM,
                EOOreBlockItemTags.Items.ITEM_ALUMINUM_ORE_OW,
                EOItems.ALUMINUM_DUST);

        registerEnrichingDustTrueRecipes(map, "ardite",
                EORawMaterialTags.RAW_ARDITE,
                EOItemMekTags.Items.DIRTY_ARDITE_C,
                EOStorageRawOreBlockItemTags.Items.RAW_ARDITE_ST_ITEM,
                EOOreBlockItemTags.Items.ITEM_ARDITE_ORE_NETHER,
                EOItems.ARDITE_DUST);

        registerEnrichingDustTrueRecipes(map, "cobalt",
                EORawMaterialTags.RAW_COBALT,
                EOItemMekTags.Items.DIRTY_COBALT_C,
                EOStorageRawOreBlockItemTags.Items.RAW_COBALT_ST_ITEM,
                EOOreBlockItemTags.Items.ITEM_COBALT_ORE_OW,
                EOItems.COBALT_DUST);

        registerEnrichingDustTrueRecipes(map, "gallium",
                EORawMaterialTags.RAW_GALLIUM,
                EOItemMekTags.Items.DIRTY_GALLIUM_C,
                EOStorageRawOreBlockItemTags.Items.RAW_GALLIUM_ST_ITEM,
                EOOreBlockItemTags.Items.ITEM_GALLIUM_ORE_OW,
                EOItems.GALLIUM_DUST);

        registerEnrichingDustTrueRecipes(map, "iridium",
                EORawMaterialTags.RAW_IRIDIUM,
                EOItemMekTags.Items.DIRTY_IRIDIUM_C,
                EOStorageRawOreBlockItemTags.Items.RAW_IRIDIUM_ST_ITEM,
                EOOreBlockItemTags.Items.ITEM_IRIDIUM_ORE_OW,
                EOItems.GALLIUM_DUST);

        registerEnrichingDustTrueRecipes(map, "nickel",
                EORawMaterialTags.RAW_NICKEL,
                EOItemMekTags.Items.DIRTY_NICKEL_C,
                EOStorageRawOreBlockItemTags.Items.RAW_NICKEL_ST_ITEM,
                EOOreBlockItemTags.Items.ITEM_NICKEL_ORE_OW,
                EOItems.NICKEL_DUST);

        registerEnrichingDustTrueRecipes(map, "platinum",
                EORawMaterialTags.RAW_PLATINUM,
                EOItemMekTags.Items.DIRTY_PLATINUM_C,
                EOStorageRawOreBlockItemTags.Items.RAW_PLATINUM_ST_ITEM,
                EOOreBlockItemTags.Items.ITEM_PLATINUM_ORE_OW,
                EOItems.PLATINUM_DUST);

        registerEnrichingDustTrueRecipes(map, "silver",
                EORawMaterialTags.RAW_SILVER,
                EOItemMekTags.Items.DIRTY_SILVER_C,
                EOStorageRawOreBlockItemTags.Items.RAW_SILVER_ST_ITEM,
                EOOreBlockItemTags.Items.ITEM_SILVER_ORE_OW,
                EOItems.SILVER_DUST);

        registerEnrichingDustTrueRecipes(map, "uraninite",
                EORawMaterialTags.RAW_URANINITE,
                EOItemMekTags.Items.DIRTY_URANINITE_C,
                EOStorageRawOreBlockItemTags.Items.RAW_URANINITE_ST_ITEM,
                EOOreBlockItemTags.Items.ITEM_URANINITE_ORE_OW,
                EOItems.URANINITE_DUST);

        registerEnrichingDustTrueRecipes(map, "zinc",
                EORawMaterialTags.RAW_ZINC,
                EOItemMekTags.Items.DIRTY_ZINC_C,
                EOStorageRawOreBlockItemTags.Items.RAW_ZINC_ST_ITEM,
                EOOreBlockItemTags.Items.ITEM_ZINC_ORE_OW,
                EOItems.ZINC_DUST);

        DUST_ENTRIES = Map.copyOf(map);
    }
    /// Catalyrium Only
    public static final Map<String, EOEnrichingType.InputsDiff> DUST_WITHOUT_ORE_ENTRIES;
    static
    {
        Map<String, EOEnrichingType.InputsDiff> map = new HashMap<>();

        registerEnrichingDustRecipes(map, "catalyrium",
                EORawMaterialTags.RAW_CATALYRIUM,
                EOItemMekTags.Items.DIRTY_CATALYRIUM_C,
                EOStorageRawOreBlockItemTags.Items.RAW_CATALYRIUM_ST_ITEM,
                EOItems.CATALYRIUM_DUST);

        DUST_WITHOUT_ORE_ENTRIES = Map.copyOf(map);
    }

    /// Ore Block -> Gem
    public static final Map<String, EOEnrichingType.InputsGem> ORE_GEM_ENTRIES;
    static
    {
        Map<String, EOEnrichingType.InputsGem> map = new HashMap<>();

        registerEnrichingGemRecipes(map, "amber",
                EOOreBlockItemTags.Items.ITEM_AMBER_ORE_OW,
                EOItems.GEM_AMBER);

        registerEnrichingGemRecipes(map, "apatite",
                EOOreBlockItemTags.Items.ITEM_APATITE_ORE_OW,
                EOItems.GEM_APATITE);

        registerEnrichingGemRecipes(map, "cinnabar",
                EOOreBlockItemTags.Items.ITEM_CINNABAR_ORE_OW,
                EOItems.GEM_CINNABAR);

        registerEnrichingGemRecipes(map, "fluorite",
                EOOreBlockItemTags.Items.ITEM_FLUORITE_ORE_OW,
                EOItems.FLUORITE);

        registerEnrichingGemRecipes(map, "necroticarite",
                EOOreBlockItemTags.Items.ITEM_NECROTICARITE_ORE_NETHER,
                EOItems.GEM_NECROTICARITE);

        registerEnrichingGemRecipes(map, "niter",
                EOOreBlockItemTags.Items.ITEM_NITER_ORE_OW,
                EOItems.GEM_NITER);

        registerEnrichingGemRecipes(map, "onyx",
                EOOreBlockItemTags.Items.ITEM_ONYX_ORE_OW,
                EOItems.GEM_ONYX);

        registerEnrichingGemRecipes(map, "peridot",
                EOOreBlockItemTags.Items.ITEM_PERIDOT_ORE_OW,
                EOItems.GEM_PERIDOT);

        registerEnrichingGemRecipes(map, "ruby",
                EOOreBlockItemTags.Items.ITEM_RUBY_ORE_OW,
                EOItems.GEM_RUBY);

        registerEnrichingGemRecipes(map, "sapphire",
                EOOreBlockItemTags.Items.ITEM_SAPPHIRE_ORE_OW,
                EOItems.GEM_SAPPHIRE);

        registerEnrichingGemRecipes(map, "obsidian",
                EOOreBlockItemTags.Items.ITEM_OBSIDIAN_ORE_NETHER,
                EOItems.GEM_OBSIDIAN_SHARD);

        ORE_GEM_ENTRIES = Map.copyOf(map);
    }

    /// Material -> Dust Only
    public static final Map<String, EOCrushingType.InputsMaterials> DUST_MATERIAL_ENTRIES;
    static
    {
        Map<String, EOCrushingType.InputsMaterials> map = new HashMap<>();

        registerMaterialCrushingRecipes(map, "aluminum", EOIngotTags.Items.ALUMINIUM_INGOT, EOItems.ALUMINUM_DUST);
        registerMaterialCrushingRecipes(map, "ardite", EOIngotTags.Items.ARDITE_INGOT, EOItems.ARDITE_DUST);
        registerMaterialCrushingRecipes(map, "amber", EOGemTags.Items.GEM_AMBER, EOItems.AMBER_DUST);
        registerMaterialCrushingRecipes(map, "amethyst", Tags.Items.GEMS_AMETHYST, EOItems.AMETHYST_DUST);
        registerMaterialCrushingRecipes(map, "apatite", EOGemTags.Items.GEM_APATITE, EOItems.APATITE_DUST);
        registerMaterialCrushingRecipes(map, "blue_steel", EOIngotTags.Items.BLUE_STEEL_INGOT, EOItems.BLUE_STEEL_DUST);
        registerMaterialCrushingRecipes(map, "brass", EOIngotTags.Items.BRASS_INGOT, EOItems.BRASS_DUST);
        registerMaterialCrushingRecipes(map, "britannia", EOIngotTags.Items.BRITANNIA_INGOT, EOItems.BRITANNIA_SILVER_DUST);
        registerMaterialCrushingRecipes(map, "bronze", EOIngotTags.Items.BRONZE_INGOT, EOItems.BRONZE_DUST);
        registerMaterialCrushingRecipes(map, "catalyrium", EOIngotTags.Items.CATALYRIUM_INGOT, EOItems.CATALYRIUM_DUST);
        registerMaterialCrushingRecipes(map, "cast_iron", EOIngotTags.Items.CAST_IRON_INGOT, EOItems.CAST_IRON_DUST);
        registerMaterialCrushingRecipes(map, "cast_steel", EOIngotTags.Items.CAST_STEEL_INGOT, EOItems.CAST_STEEL_DUST);
        registerMaterialCrushingRecipes(map, "coal", EOItemsGeneralTags.Items.COAL, EOItems.COAL_DUST);
        registerMaterialCrushingRecipes(map, "cobalt", EOIngotTags.Items.COBALT_INGOT, EOItems.COBALT_DUST);
        registerMaterialCrushingRecipes(map, "constantan", EOIngotTags.Items.CONSTANTAN_INGOT, EOItems.CONSTANTAN_DUST);
        registerMaterialCrushingRecipes(map, "copper", Tags.Items.INGOTS_COPPER, EOItems.COPPER_DUST);
        registerMaterialCrushingRecipes(map, "diamond", Tags.Items.GEMS_DIAMOND, EOItems.DIAMOND_DUST);
        registerMaterialCrushingRecipes(map, "electrum", EOIngotTags.Items.ELECTRUM_INGOT, EOItems.ELECTRUM_DUST);
        registerMaterialCrushingRecipes(map, "emerald", Tags.Items.GEMS_EMERALD, EOItems.EMERALD_DUST);
        registerMaterialCrushingRecipes(map, "ender_pearl", Tags.Items.ENDER_PEARLS, EOItems.ENDER_DUST);
        registerMaterialCrushingRecipes(map, "enderium", EOIngotTags.Items.ENDERIUM_INGOT, EOItems.ENDERIUM_DUST);
        registerMaterialCrushingRecipes(map, "endstone", Tags.Items.END_STONES, EOItems.ENDSTONE_DUST);
        registerMaterialCrushingRecipes(map, "fluorite", EOGemTags.Items.GEM_FLUORITE, EOItems.FLUORITE_DUST);
        registerMaterialCrushingRecipes(map, "gallium", EOIngotTags.Items.GALLIUM_INGOT, EOItems.GALLIUM_DUST);
        registerMaterialCrushingRecipes(map, "gold", Tags.Items.INGOTS_GOLD, EOItems.GOLD_DUST);
        registerMaterialCrushingRecipes(map, "graphite", EOIngotTags.Items.GRAPHITE_INGOT, EOItems.GRAPHITE_DUST);
        registerMaterialCrushingRecipes(map, "invar", EOIngotTags.Items.INVAR_INGOT, EOItems.INVAR_DUST);
        registerMaterialCrushingRecipes(map, "iridium", EOIngotTags.Items.IRIDIUM_INGOT, EOItems.IRIDIUM_DUST);
        registerMaterialCrushingRecipes(map, "iron", Tags.Items.INGOTS_IRON, EOItems.IRON_DUST);
        registerMaterialCrushingRecipes(map, "lapis", Tags.Items.GEMS_LAPIS, EOItems.LAPIS_LAZULI_DUST);
        registerMaterialCrushingRecipes(map, "lead", EOIngotTags.Items.LEAD_INGOT, EOItems.LEAD_DUST);
        registerMaterialCrushingRecipes(map, "lumium", EOIngotTags.Items.LUMIUM_INGOT, EOItems.LUMIUM_DUST);
        registerMaterialCrushingRecipes(map, "necroticarite", EOGemTags.Items.GEM_NECROTICARITE, EOItems.NECROTICARITE_DUST);
        registerMaterialCrushingRecipes(map, "nether_star", Tags.Items.NETHER_STARS, EOItems.NETHER_STAR_DUST);
        registerMaterialCrushingRecipes(map, "netherite", Tags.Items.INGOTS_NETHERITE, EOItems.NETHERITE_DUST);
        registerMaterialCrushingRecipes(map, "netherrack", Tags.Items.NETHERRACKS, EOItems.NETHERRACK_DUST);
        registerMaterialCrushingRecipes(map, "nethersteel", EOIngotTags.Items.NETHERSTEEL_INGOT, EOItems.NETHERSTEEL_DUST);
        registerMaterialCrushingRecipes(map, "nickel", EOIngotTags.Items.NICKEL_INGOT, EOItems.NICKEL_DUST);
        registerMaterialCrushingRecipes(map, "niter", EOGemTags.Items.GEM_NITER, EOItems.NITER_DUST);
        registerMaterialCrushingRecipes(map, "obsidian_block", Tags.Items.OBSIDIANS, EOItems.OBSIDIAN_DUST);
        registerMaterialCrushingRecipes(map, "obsidian_gem", EOGemTags.Items.GEM_OBSIDIAN, EOItems.OBSIDIAN_DUST);
        registerMaterialCrushingRecipes(map, "onyx", EOGemTags.Items.GEM_ONYX, EOItems.ONYX_DUST);
        registerMaterialCrushingRecipes(map, "osmium", EOIngotTags.Items.OSMIUM_INGOT, EOItems.OSMIUM_DUST);
        registerMaterialCrushingRecipes(map, "peridot", EOGemTags.Items.GEM_PERIDOT, EOItems.PERIDOT_DUST);
        registerMaterialCrushingRecipes(map, "pewter", EOIngotTags.Items.PEWTER_INGOT, EOItems.PEWTER_DUST);
        registerMaterialCrushingRecipes(map, "pig_iron", EOIngotTags.Items.PIG_IRON_INGOT, EOItems.PIG_IRON_DUST);
        registerMaterialCrushingRecipes(map, "platinum", EOIngotTags.Items.PLATINUM_INGOT, EOItems.PLATINUM_DUST);
        registerMaterialCrushingRecipes(map, "plutonium", EOIngotTags.Items.PLUTONIUM_INGOT, EOItems.PLUTONIUM_DUST);
        registerMaterialCrushingRecipes(map, "quartz", Tags.Items.GEMS_QUARTZ, EOItems.QUARTZ_DUST);
        registerMaterialCrushingRecipes(map, "rose_gold", EOIngotTags.Items.ROSE_GOLD_INGOT, EOItems.ROSE_GOLD_DUST);
        registerMaterialCrushingRecipes(map, "ruby", EOGemTags.Items.GEM_RUBY, EOItems.RUBY_DUST);
        registerMaterialCrushingRecipes(map, "sapphire", EOGemTags.Items.GEM_SAPPHIRE, EOItems.SAPPHIRE_DUST);
        registerMaterialCrushingRecipes(map, "sculk", EOItemsGeneralTags.Items.SCULK, EOItems.SCULK_DUST);
        registerMaterialCrushingRecipes(map, "signalum", EOIngotTags.Items.SIGNALUM_INGOT, EOItems.SIGNALUM_DUST);
        registerMaterialCrushingRecipes(map, "silver", EOIngotTags.Items.SILVER_INGOT, EOItems.SILVER_DUST);
        registerMaterialCrushingRecipes(map, "sulfur", EORawMaterialTags.SULFUR, EOItems.SULFUR_DUST);
        registerMaterialCrushingRecipes(map, "shadowsteel", EOIngotTags.Items.SHADOWSTEEL_INGOT, EOItems.SHADOWSTEEL_DUST);
        registerMaterialCrushingRecipes(map, "steel", EOIngotTags.Items.STEEL_INGOT, EOItems.STEEL_DUST);
        registerMaterialCrushingRecipes(map, "tin", EOIngotTags.Items.TIN_INGOT, EOItems.TIN_DUST);
        registerMaterialCrushingRecipes(map, "titanium", EOIngotTags.Items.TITANIUM_INGOT, EOItems.TITANIUM_DUST);
        registerMaterialCrushingRecipes(map, "ultimatitanium", EOIngotTags.Items.ULTIMATITANIUM_INGOT, EOItems.ULTIMATITANIUM_DUST);
        registerMaterialCrushingRecipes(map, "uraninite", EOIngotTags.Items.URANINITE_INGOT, EOItems.URANINITE_DUST);
        registerMaterialCrushingRecipes(map, "uranium", EOIngotTags.Items.URANIUM_INGOT, EOItems.URANIUM_DUST);
        registerMaterialCrushingRecipes(map, "wrought_iron", EOIngotTags.Items.WROUGHT_IRON_INGOT, EOItems.WROUGHT_IRON_DUST);
        registerMaterialCrushingRecipes(map, "zinc", EOIngotTags.Items.ZINC_INGOT, EOItems.ZINC_DUST);

        DUST_MATERIAL_ENTRIES = Map.copyOf(map);
    }

    ///
    /// Material Set/Shard -> Clump
    ///
    public static final Map<String, EOPurificationType.Inputs> CLUMP_ENTRIES;
    static
    {
        Map<String, EOPurificationType.Inputs> map = new HashMap<>();

        registerPurificationTrueRecipes(map, "aluminum",
                EORawMaterialTags.RAW_ALUMINUM,
                EOItemMekTags.Items.SHARD_ALUMINUM_C,
                EOStorageRawOreBlockItemTags.Items.RAW_ALUMINUM_ST_ITEM,
                EOOreBlockItemTags.Items.ITEM_ALUMINUM_ORE_OW,
                EOMekCompatItems.ALUMINUM_CLUMP);

        registerPurificationTrueRecipes(map, "ardite",
                EORawMaterialTags.RAW_ARDITE,
                EOItemMekTags.Items.SHARD_ARDITE_C,
                EOStorageRawOreBlockItemTags.Items.RAW_ARDITE_ST_ITEM,
                EOOreBlockItemTags.Items.ITEM_ARDITE_ORE_NETHER,
                EOMekCompatItems.ARDITE_CLUMP);

        registerPurificationTrueRecipes(map, "cobalt",
                EORawMaterialTags.RAW_COBALT,
                EOItemMekTags.Items.SHARD_COBALT_C,
                EOStorageRawOreBlockItemTags.Items.RAW_COBALT_ST_ITEM,
                EOOreBlockItemTags.Items.ITEM_COBALT_ORE_OW,
                EOMekCompatItems.COBALT_CLUMP);

        registerPurificationTrueRecipes(map, "gallium",
                EORawMaterialTags.RAW_GALLIUM,
                EOItemMekTags.Items.SHARD_GALLIUM_C,
                EOStorageRawOreBlockItemTags.Items.RAW_GALLIUM_ST_ITEM,
                EOOreBlockItemTags.Items.ITEM_GALLIUM_ORE_OW,
                EOMekCompatItems.GALLIUM_CLUMP);

        registerPurificationTrueRecipes(map, "iridium",
                EORawMaterialTags.RAW_IRIDIUM,
                EOItemMekTags.Items.SHARD_IRIDIUM_C,
                EOStorageRawOreBlockItemTags.Items.RAW_IRIDIUM_ST_ITEM,
                EOOreBlockItemTags.Items.ITEM_IRIDIUM_ORE_OW,
                EOMekCompatItems.IRIDIUM_CLUMP);

        registerPurificationTrueRecipes(map, "nickel",
                EORawMaterialTags.RAW_NICKEL,
                EOItemMekTags.Items.SHARD_NICKEL_C,
                EOStorageRawOreBlockItemTags.Items.RAW_NICKEL_ST_ITEM,
                EOOreBlockItemTags.Items.ITEM_NICKEL_ORE_OW,
                EOMekCompatItems.NICKEL_CLUMP);

        registerPurificationTrueRecipes(map, "platinum",
                EORawMaterialTags.RAW_PLATINUM,
                EOItemMekTags.Items.SHARD_PLATINUM_C,
                EOStorageRawOreBlockItemTags.Items.RAW_PLATINUM_ST_ITEM,
                EOOreBlockItemTags.Items.ITEM_PLATINUM_ORE_OW,
                EOMekCompatItems.PLATINUM_CLUMP);

        registerPurificationTrueRecipes(map, "silver",
                EORawMaterialTags.RAW_SILVER,
                EOItemMekTags.Items.SHARD_SILVER_C,
                EOStorageRawOreBlockItemTags.Items.RAW_SILVER_ST_ITEM,
                EOOreBlockItemTags.Items.ITEM_SILVER_ORE_OW,
                EOMekCompatItems.SILVER_CLUMP);

        registerPurificationTrueRecipes(map, "uraninite",
                EORawMaterialTags.RAW_URANINITE,
                EOItemMekTags.Items.SHARD_URANINITE_C,
                EOStorageRawOreBlockItemTags.Items.RAW_URANINITE_ST_ITEM,
                EOOreBlockItemTags.Items.ITEM_URANINITE_ORE_OW,
                EOMekCompatItems.URANINITE_CLUMP);

        registerPurificationTrueRecipes(map, "zinc",
                EORawMaterialTags.RAW_ZINC,
                EOItemMekTags.Items.SHARD_ZINC_C,
                EOStorageRawOreBlockItemTags.Items.RAW_ZINC_ST_ITEM,
                EOOreBlockItemTags.Items.ITEM_ZINC_ORE_OW,
                EOMekCompatItems.ZINC_CLUMP);

        CLUMP_ENTRIES = Map.copyOf(map);
    }

    /// Catalyrium Only
    public static final Map<String, EOPurificationType.InputsDiff> CLUMP_WITHOUT_ORE_ENTRIES;
    static
    {
        Map<String, EOPurificationType.InputsDiff> map = new HashMap<>();

        registerPurificationRecipes(map, "catalyrium",
                EORawMaterialTags.RAW_CATALYRIUM,
                EOItemMekTags.Items.SHARD_CATALYRIUM_C,
                EOStorageRawOreBlockItemTags.Items.RAW_CATALYRIUM_ST_ITEM,
                EOMekCompatItems.CATALYRIUM_CLUMP);

        CLUMP_WITHOUT_ORE_ENTRIES = Map.copyOf(map);
    }

    ///
    /// Material Set/Crystal -> Shard
    ///
    public static final Map<String, EOInjectionType.Inputs> SHARD_ENTRIES;
    static
    {
        Map<String, EOInjectionType.Inputs> map = new HashMap<>();

        registerInjectingTrueRecipes(map,"aluminum",
                EORawMaterialTags.RAW_ALUMINUM,
                EOItemMekTags.Items.CRYSTAL_ALUMINUM_C,
                EOStorageRawOreBlockItemTags.Items.RAW_ALUMINUM_ST_ITEM,
                EOOreBlockItemTags.Items.ITEM_ALUMINUM_ORE_OW,
                EOMekCompatItems.ALUMINUM_SHARD);

        registerInjectingTrueRecipes(map,"ardite",
                EORawMaterialTags.RAW_ARDITE,
                EOItemMekTags.Items.CRYSTAL_ARDITE_C,
                EOStorageRawOreBlockItemTags.Items.RAW_ARDITE_ST_ITEM,
                EOOreBlockItemTags.Items.ITEM_ARDITE_ORE_NETHER,
                EOMekCompatItems.ARDITE_SHARD);

        registerInjectingTrueRecipes(map,"cobalt",
                EORawMaterialTags.RAW_COBALT,
                EOItemMekTags.Items.CRYSTAL_COBALT_C,
                EOStorageRawOreBlockItemTags.Items.RAW_COBALT_ST_ITEM,
                EOOreBlockItemTags.Items.ITEM_COBALT_ORE_OW,
                EOMekCompatItems.COBALT_SHARD);

        registerInjectingTrueRecipes(map,"gallium",
                EORawMaterialTags.RAW_GALLIUM,
                EOItemMekTags.Items.CRYSTAL_GALLIUM_C,
                EOStorageRawOreBlockItemTags.Items.RAW_GALLIUM_ST_ITEM,
                EOOreBlockItemTags.Items.ITEM_GALLIUM_ORE_OW,
                EOMekCompatItems.GALLIUM_SHARD);

        registerInjectingTrueRecipes(map,"iridium",
                EORawMaterialTags.RAW_IRIDIUM,
                EOItemMekTags.Items.CRYSTAL_IRIDIUM_C,
                EOStorageRawOreBlockItemTags.Items.RAW_IRIDIUM_ST_ITEM,
                EOOreBlockItemTags.Items.ITEM_IRIDIUM_ORE_OW,
                EOMekCompatItems.IRIDIUM_SHARD);

        registerInjectingTrueRecipes(map,"nickel",
                EORawMaterialTags.RAW_NICKEL,
                EOItemMekTags.Items.CRYSTAL_NICKEL_C,
                EOStorageRawOreBlockItemTags.Items.RAW_NICKEL_ST_ITEM,
                EOOreBlockItemTags.Items.ITEM_NICKEL_ORE_OW,
                EOMekCompatItems.NICKEL_SHARD);

        registerInjectingTrueRecipes(map,"platinum",
                EORawMaterialTags.RAW_PLATINUM,
                EOItemMekTags.Items.CRYSTAL_PLATINUM_C,
                EOStorageRawOreBlockItemTags.Items.RAW_PLATINUM_ST_ITEM,
                EOOreBlockItemTags.Items.ITEM_PLATINUM_ORE_OW,
                EOMekCompatItems.PLATINUM_SHARD);

        registerInjectingTrueRecipes(map,"silver",
                EORawMaterialTags.RAW_SILVER,
                EOItemMekTags.Items.CRYSTAL_SILVER_C,
                EOStorageRawOreBlockItemTags.Items.RAW_SILVER_ST_ITEM,
                EOOreBlockItemTags.Items.ITEM_SILVER_ORE_OW,
                EOMekCompatItems.SILVER_SHARD);

        registerInjectingTrueRecipes(map,"uraninite",
                EORawMaterialTags.RAW_URANINITE,
                EOItemMekTags.Items.CRYSTAL_URANINITE_C,
                EOStorageRawOreBlockItemTags.Items.RAW_URANINITE_ST_ITEM,
                EOOreBlockItemTags.Items.ITEM_URANINITE_ORE_OW,
                EOMekCompatItems.URANINITE_SHARD);

        registerInjectingTrueRecipes(map,"zinc",
                EORawMaterialTags.RAW_ZINC,
                EOItemMekTags.Items.CRYSTAL_ZINC_C,
                EOStorageRawOreBlockItemTags.Items.RAW_ZINC_ST_ITEM,
                EOOreBlockItemTags.Items.ITEM_ZINC_ORE_OW,
                EOMekCompatItems.ZINC_SHARD);

        SHARD_ENTRIES = Map.copyOf(map);
    }

    /// Catalyrium Only
    public static final Map<String, EOInjectionType.InputsDiff> SHARD_WITHOUT_ORE_ENTRIES;
    static
    {
        Map<String, EOInjectionType.InputsDiff> map = new HashMap<>();

        registerInjectingRecipes(map,"catalyrium",
                EORawMaterialTags.RAW_CATALYRIUM,
                EOItemMekTags.Items.CRYSTAL_CATALYRIUM_C,
                EOStorageRawOreBlockItemTags.Items.RAW_CATALYRIUM_ST_ITEM,
                EOMekCompatItems.CATALYRIUM_SHARD);

        SHARD_WITHOUT_ORE_ENTRIES = Map.copyOf(map);
    }

    /// Material Dirty Slurry -> Clean Slurry
    public static final Map<String, EOWasherType.Inputs> DIRTY_SLURRY_TO_CLEAN;
    static
    {
        Map<String, EOWasherType.Inputs> map = new HashMap<>();

        registerWashingRecipes(map,"aluminum",
                EOMekFluids.ALUMINUM_SLURRY.getDirtySlurry(),
                FluidTags.WATER,
                EOMekFluids.ALUMINUM_SLURRY.getCleanSlurry());

        registerWashingRecipes(map,"ardite",
                EOMekFluids.ARDITE_SLURRY.getDirtySlurry(),
                FluidTags.WATER,
                EOMekFluids.ARDITE_SLURRY.getCleanSlurry());

        registerWashingRecipes(map,"catalyrium",
                EOMekFluids.CATALYRIUM_SLURRY.getDirtySlurry(),
                FluidTags.WATER,
                EOMekFluids.CATALYRIUM_SLURRY.getCleanSlurry());

        registerWashingRecipes(map,"cobalt",
                EOMekFluids.COBALT_SLURRY.getDirtySlurry(),
                FluidTags.WATER,
                EOMekFluids.COBALT_SLURRY.getCleanSlurry());

        registerWashingRecipes(map,"gallium",
                EOMekFluids.GALLIUM_SLURRY.getDirtySlurry(),
                FluidTags.WATER,
                EOMekFluids.GALLIUM_SLURRY.getCleanSlurry());

        registerWashingRecipes(map,"iridium",
                EOMekFluids.IRIDIUM_SLURRY.getDirtySlurry(),
                FluidTags.WATER,
                EOMekFluids.IRIDIUM_SLURRY.getCleanSlurry());

        registerWashingRecipes(map,"nickel",
                EOMekFluids.NICKEL_SLURRY.getDirtySlurry(),
                FluidTags.WATER,
                EOMekFluids.NICKEL_SLURRY.getCleanSlurry());

        registerWashingRecipes(map,"platinum",
                EOMekFluids.PLATINUM_SLURRY.getDirtySlurry(),
                FluidTags.WATER,
                EOMekFluids.PLATINUM_SLURRY.getCleanSlurry());

        registerWashingRecipes(map,"silver",
                EOMekFluids.SILVER_SLURRY.getDirtySlurry(),
                FluidTags.WATER,
                EOMekFluids.SILVER_SLURRY.getCleanSlurry());

        registerWashingRecipes(map,"uraninite",
                EOMekFluids.URANINITE_SLURRY.getDirtySlurry(),
                FluidTags.WATER,
                EOMekFluids.URANINITE_SLURRY.getCleanSlurry());

        registerWashingRecipes(map,"zinc",
                EOMekFluids.ZINC_SLURRY.getDirtySlurry(),
                FluidTags.WATER,
                EOMekFluids.ZINC_SLURRY.getCleanSlurry());

        DIRTY_SLURRY_TO_CLEAN = Map.copyOf(map);
    }

    /// Material Set -> Dirty Slurry
    public static final Map<String, EODissolutionType.Inputs> MATERIAL_TO_DIRTY_SLURRY;
    static
    {
        Map<String, EODissolutionType.Inputs> map = new HashMap<>();

        registerDissolutionTrueRecipes(map, "aluminum",
                EORawMaterialTags.RAW_ALUMINIUM,
                EOStorageRawOreBlockItemTags.Items.RAW_ALUMINUM_ST_ITEM,
                EOOreBlockItemTags.Items.ITEM_ALUMINUM_ORE_OW,
                EOMekFluids.ALUMINUM_SLURRY.getDirtySlurry());

        registerDissolutionTrueRecipes(map, "ardite",
                EORawMaterialTags.RAW_ARDITE,
                EOStorageRawOreBlockItemTags.Items.RAW_ARDITE_ST_ITEM,
                EOOreBlockItemTags.Items.ITEM_ARDITE_ORE_NETHER,
                EOMekFluids.ARDITE_SLURRY.getDirtySlurry());

        registerDissolutionTrueRecipes(map, "cobalt",
                EORawMaterialTags.RAW_COBALT,
                EOStorageRawOreBlockItemTags.Items.RAW_COBALT_ST_ITEM,
                EOOreBlockItemTags.Items.ITEM_COBALT_ORE_OW,
                EOMekFluids.COBALT_SLURRY.getDirtySlurry());

        registerDissolutionTrueRecipes(map, "gallium",
                EORawMaterialTags.RAW_GALLIUM,
                EOStorageRawOreBlockItemTags.Items.RAW_GALLIUM_ST_ITEM,
                EOOreBlockItemTags.Items.ITEM_GALLIUM_ORE_OW,
                EOMekFluids.GALLIUM_SLURRY.getDirtySlurry());

        registerDissolutionTrueRecipes(map, "iridium",
                EORawMaterialTags.RAW_IRIDIUM,
                EOStorageRawOreBlockItemTags.Items.RAW_IRIDIUM_ST_ITEM,
                EOOreBlockItemTags.Items.ITEM_IRIDIUM_ORE_OW,
                EOMekFluids.IRIDIUM_SLURRY.getDirtySlurry());

        registerDissolutionTrueRecipes(map, "nickel",
                EORawMaterialTags.RAW_NICKEL,
                EOStorageRawOreBlockItemTags.Items.RAW_NICKEL_ST_ITEM,
                EOOreBlockItemTags.Items.ITEM_NICKEL_ORE_OW,
                EOMekFluids.NICKEL_SLURRY.getDirtySlurry());

        registerDissolutionTrueRecipes(map, "platinum",
                EORawMaterialTags.RAW_PLATINUM,
                EOStorageRawOreBlockItemTags.Items.RAW_PLATINUM_ST_ITEM,
                EOOreBlockItemTags.Items.ITEM_PLATINUM_ORE_OW,
                EOMekFluids.PLATINUM_SLURRY.getDirtySlurry());

        registerDissolutionTrueRecipes(map, "silver",
                EORawMaterialTags.RAW_SILVER,
                EOStorageRawOreBlockItemTags.Items.RAW_SILVER_ST_ITEM,
                EOOreBlockItemTags.Items.ITEM_SILVER_ORE_OW,
                EOMekFluids.SILVER_SLURRY.getDirtySlurry());

        registerDissolutionTrueRecipes(map, "uraninite",
                EORawMaterialTags.RAW_URANINITE,
                EOStorageRawOreBlockItemTags.Items.RAW_URANINITE_ST_ITEM,
                EOOreBlockItemTags.Items.ITEM_URANINITE_ORE_OW,
                EOMekFluids.URANINITE_SLURRY.getDirtySlurry());

        registerDissolutionTrueRecipes(map, "zinc",
                EORawMaterialTags.RAW_ZINC,
                EOStorageRawOreBlockItemTags.Items.RAW_ZINC_ST_ITEM,
                EOOreBlockItemTags.Items.ITEM_ZINC_ORE_OW,
                EOMekFluids.ZINC_SLURRY.getDirtySlurry());

        MATERIAL_TO_DIRTY_SLURRY = Map.copyOf(map);
    }

    public static final Map<String, EODissolutionType.InputsDiff> MATERIAL_WITHOUT_ORES_TO_DIRTY_SLURRY;
    static
    {
        Map<String, EODissolutionType.InputsDiff> map = new HashMap<>();

        registerDissolutionRecipes(map, "catalyrium",
                EORawMaterialTags.RAW_CATALYRIUM,
                EOStorageRawOreBlockItemTags.Items.RAW_CATALYRIUM_ST_ITEM,
                EOMekFluids.CATALYRIUM_SLURRY.getDirtySlurry());

        MATERIAL_WITHOUT_ORES_TO_DIRTY_SLURRY = Map.copyOf(map);
    }

    /// Clean Slurry -> Crystal
    public static final Map<String, EOCrystallizationType.Inputs> CLEAN_SLURRY_TO_CRYSTAL;
    static
    {
        Map<String, EOCrystallizationType.Inputs> map = new HashMap<>();

        registerCrystallizationRecipes(map, "aluminum",
                EOMekFluids.ALUMINUM_SLURRY.getCleanSlurry(),
                EOMekCompatItems.ALUMINUM_CRYSTAL);

        registerCrystallizationRecipes(map, "ardite",
                EOMekFluids.ARDITE_SLURRY.getCleanSlurry(),
                EOMekCompatItems.ARDITE_CRYSTAL);

        registerCrystallizationRecipes(map, "catalyrium",
                EOMekFluids.CATALYRIUM_SLURRY.getCleanSlurry(),
                EOMekCompatItems.CATALYRIUM_CRYSTAL);

        registerCrystallizationRecipes(map, "cobalt",
                EOMekFluids.COBALT_SLURRY.getCleanSlurry(),
                EOMekCompatItems.COBALT_CRYSTAL);

        registerCrystallizationRecipes(map, "gallium",
                EOMekFluids.GALLIUM_SLURRY.getCleanSlurry(),
                EOMekCompatItems.GALLIUM_CRYSTAL);

        registerCrystallizationRecipes(map, "iridium",
                EOMekFluids.IRIDIUM_SLURRY.getCleanSlurry(),
                EOMekCompatItems.IRIDIUM_CRYSTAL);

        registerCrystallizationRecipes(map, "nickel",
                EOMekFluids.NICKEL_SLURRY.getCleanSlurry(),
                EOMekCompatItems.NICKEL_CRYSTAL);

        registerCrystallizationRecipes(map, "platinum",
                EOMekFluids.PLATINUM_SLURRY.getCleanSlurry(),
                EOMekCompatItems.PLATINUM_CRYSTAL);

        registerCrystallizationRecipes(map, "silver",
                EOMekFluids.SILVER_SLURRY.getCleanSlurry(),
                EOMekCompatItems.SILVER_CRYSTAL);

        registerCrystallizationRecipes(map, "uraninite",
                EOMekFluids.URANINITE_SLURRY.getCleanSlurry(),
                EOMekCompatItems.URANINITE_CRYSTAL);

        registerCrystallizationRecipes(map, "zinc",
                EOMekFluids.ZINC_SLURRY.getCleanSlurry(),
                EOMekCompatItems.ZINC_CRYSTAL);

        CLEAN_SLURRY_TO_CRYSTAL = Map.copyOf(map);
    }
}
