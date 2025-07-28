package net.radzratz.eternalores.util.compat.mekanism;

import net.radzratz.eternalores.util.compat.mekanism.recipe_types.enums.*;

import java.util.HashMap;
import java.util.Map;

import static net.minecraft.tags.FluidTags.*;
import static net.neoforged.neoforge.common.Tags.Items.*;
import static net.radzratz.eternalores.item.EOItemRegistry.*;
import static net.radzratz.eternalores.util.compat.mekanism.item.EOMekCompatItems.*;
import static net.radzratz.eternalores.util.compat.mekanism.fluids.EOMekSlurries.*;
import static net.radzratz.eternalores.util.compat.mekanism.recipe_types.EOMekRecipes.*;
import static net.radzratz.eternalores.util.compat.mekanism.tags.EOItemMekTags.Items.*;
import static net.radzratz.eternalores.util.tags.item.EOItemsGeneralTags.Items.*;
import static net.radzratz.eternalores.util.tags.item.gems.EOGemTags.Items.*;
import static net.radzratz.eternalores.util.tags.item.ingots.EOIngotTags.Items.*;
import static net.radzratz.eternalores.util.tags.item.ores.EOOreBlockItemTags.Items.*;
import static net.radzratz.eternalores.util.tags.item.plates.EOPlates.Items.*;
import static net.radzratz.eternalores.util.tags.item.raw_materials.EORawMaterialTags.*;
import static net.radzratz.eternalores.util.tags.item.rods.EOGemRodsTags.Items.*;
import static net.radzratz.eternalores.util.tags.item.rods.EOMetalRodsTags.Items.*;
import static net.radzratz.eternalores.util.tags.item.rods.EOMiscRodsTags.Items.*;
import static net.radzratz.eternalores.util.tags.item.storage_blocks.EOStorageRawOreBlockItemTags.Items.*;

public class EOMekEntries
{
    ///
    /// Material Set/Clump -> Dirty Dust List
    ///
    public static final Map<String, EOCrushingType.Inputs> DIRTY_DUST_ENTRIES;
    static
    {
        Map<String, EOCrushingType.Inputs> map = new HashMap<>();

        registerDirtyDustRecipes(map, "aluminum", CLUMP_ALUMINUM_C, ALUMINUM_DIRTY_DUST);

        registerDirtyDustRecipes(map, "ardite", CLUMP_ARDITE_C, ARDITE_DIRTY_DUST);

        registerDirtyDustRecipes(map, "catalyrium", CLUMP_CATALYRIUM_C, CATALYRIUM_DIRTY_DUST);

        registerDirtyDustRecipes(map, "cobalt", CLUMP_COBALT_C, COBALT_DIRTY_DUST);

        registerDirtyDustRecipes(map, "gallium", CLUMP_GALLIUM_C, GALLIUM_DIRTY_DUST);

        registerDirtyDustRecipes(map, "iridium", CLUMP_IRIDIUM_C, IRIDIUM_DIRTY_DUST);

        registerDirtyDustRecipes(map, "nickel", CLUMP_NICKEL_C, NICKEL_DIRTY_DUST);

        registerDirtyDustRecipes(map, "platinum", CLUMP_PLATINUM_C, PLATINUM_DIRTY_DUST);

        registerDirtyDustRecipes(map, "silver", CLUMP_SILVER_C, SILVER_DIRTY_DUST);

        registerDirtyDustRecipes(map, "uraninite", CLUMP_URANINITE_C, URANINITE_DIRTY_DUST);

        registerDirtyDustRecipes(map, "zinc", CLUMP_ZINC_C, ZINC_DIRTY_DUST);

        DIRTY_DUST_ENTRIES = Map.copyOf(map);
    }

    ///
    /// Material Set Plates/Rods -> Dust
    ///
    public static final Map<String, EOCrushingType.InputsDeconstruction> DUST_DECONSTRUCTION_ENTRIES;
    static
    {
        Map<String, EOCrushingType.InputsDeconstruction> map = new HashMap<>();

        registerDecoRecipes(map, "aluminum", TAG_ALUMINUM_PLATE, TAG_ROD_ALUMINUM, ALUMINUM_DUST);

        registerDecoRecipes(map, "ardite", TAG_ARDITE_PLATE, TAG_ROD_ARDITE, ARDITE_DUST);

        registerDecoRecipes(map, "blue_steel", TAG_BLUE_STEEL_PLATE, TAG_ROD_BLUE_STEEL, BLUE_STEEL_DUST);

        registerDecoRecipes(map, "brass", TAG_BRASS_PLATE, TAG_ROD_BRASS, BRASS_DUST);

        registerDecoRecipes(map, "bronze", TAG_BRONZE_PLATE, TAG_ROD_BRONZE, BRONZE_DUST);

        registerDecoRecipes(map, "catalyrium", TAG_CATALYRIUM_PLATE, TAG_ROD_CATALYRIUM, CATALYRIUM_DUST);

        registerDecoRecipes(map, "cast_iron", TAG_CAST_IRON_PLATE, TAG_ROD_CAST_IRON, CAST_IRON_DUST);

        registerDecoRecipes(map, "cast_steel", TAG_CAST_STEEL_PLATE, TAG_ROD_CAST_STEEL, CAST_STEEL_DUST);

        registerDecoRecipes(map, "cobalt", TAG_COBALT_PLATE, TAG_ROD_COBALT, COBALT_DUST);

        registerDecoRecipes(map, "constantan", TAG_CONSTANTAN_PLATE, TAG_ROD_CONSTANTAN, CONSTANTAN_DUST);

        registerDecoRecipes(map, "copper", TAG_COPPER_PLATE, TAG_ROD_COPPER, COPPER_DUST);

        registerDecoRecipes(map, "diamond", TAG_DIAMOND_PLATE, TAG_ROD_DIAMOND, DIAMOND_DUST);

        registerDecoRecipes(map, "electrum", TAG_ELECTRUM_PLATE, TAG_ROD_ELECTRUM, ELECTRUM_DUST);

        registerDecoRecipes(map, "enderium", TAG_ENDERIUM_PLATE, TAG_ROD_ENDERIUM, ENDERIUM_DUST);

        registerDecoRecipes(map, "gallium", TAG_GALLIUM_PLATE, TAG_ROD_GALLIUM, GALLIUM_DUST);

        registerDecoRecipes(map, "gold", TAG_GOLD_PLATE, TAG_ROD_GOLD, GOLD_DUST);

        registerDecoRecipes(map, "copper", TAG_COPPER_PLATE, TAG_ROD_COPPER, COPPER_DUST);

        registerDecoRecipes(map, "graphite", TAG_GRAPHITE_PLATE, TAG_ROD_GRAPHITE, GRAPHITE_DUST);

        registerDecoRecipes(map, "invar", TAG_INVAR_PLATE, TAG_ROD_INVAR, INVAR_DUST);

        registerDecoRecipes(map, "iridium", TAG_IRIDIUM_PLATE, TAG_ROD_IRIDIUM, IRIDIUM_DUST);

        registerDecoRecipes(map, "iron", TAG_IRON_PLATE, TAG_ROD_IRON, IRON_DUST);

        registerDecoRecipes(map, "lead", TAG_LEAD_PLATE, TAG_ROD_LEAD, LEAD_DUST);

        registerDecoRecipes(map, "lumium", TAG_LUMIUM_PLATE, TAG_ROD_LUMIUM, LUMIUM_DUST);

        registerDecoRecipes(map, "necroticarite", TAG_NECROTICARITE_PLATE, TAG_ROD_NECROTICARITE, NECROTICARITE_DUST);

        registerDecoRecipes(map, "netherite", TAG_NETHERITE_PLATE, TAG_ROD_NETHERITE, NETHERITE_DUST);

        registerDecoRecipes(map, "nethersteel", TAG_NETHERSTEEL_PLATE, TAG_ROD_NETHERSTEEL, NETHERSTEEL_DUST);

        registerDecoRecipes(map, "nickel", TAG_NICKEL_PLATE, TAG_ROD_NICKEL, NICKEL_DUST);

        registerDecoRecipes(map, "osmium", TAG_OSMIUM_PLATE, TAG_ROD_OSMIUM, OSMIUM_DUST);

        registerDecoRecipes(map, "pig_iron", TAG_PIG_IRON_PLATE, TAG_ROD_PIG_IRON, PIG_IRON_DUST);

        registerDecoRecipes(map, "platinum", TAG_PLATINUM_PLATE, TAG_ROD_PLATINUM, PLATINUM_DUST);

        registerDecoRecipes(map, "plutonium", TAG_PLUTONIUM_PLATE, TAG_ROD_PLUTONIUM, PLUTONIUM_DUST);

        registerDecoRecipes(map, "rose_gold", TAG_ROSE_GOLD_PLATE, TAG_ROD_ROSE_GOLD, ROSE_GOLD_DUST);

        registerDecoRecipes(map, "sapphire", TAG_SAPPHIRE_PLATE, TAG_ROD_SAPPHIRE, SAPPHIRE_DUST);

        registerDecoRecipes(map, "signalum", TAG_SIGNALUM_PLATE, TAG_ROD_SIGNALUM, SIGNALUM_DUST);

        registerDecoRecipes(map, "silver", TAG_SILVER_PLATE, TAG_ROD_SILVER, SILVER_DUST);

        registerDecoRecipes(map, "shadowsteel", TAG_SHADOWSTEEL_PLATE, TAG_ROD_SHADOWSTEEL, SHADOWSTEEL_DUST);

        registerDecoRecipes(map, "steel", TAG_STEEL_PLATE, TAG_ROD_STEEL, STEEL_DUST);

        registerDecoRecipes(map, "tin", TAG_TIN_PLATE, TAG_ROD_TIN, TIN_DUST);

        registerDecoRecipes(map, "titanium", TAG_TITANIUM_PLATE, TAG_ROD_TITANIUM, TITANIUM_DUST);

        registerDecoRecipes(map, "ultimatitanium", TAG_ULTIMATITANIUM_PLATE, TAG_ROD_ULTIMATITANIUM, ULTIMATITANIUM_DUST);

        registerDecoRecipes(map, "uranium", TAG_URANIUM_PLATE, TAG_ROD_URANIUM, URANIUM_DUST);

        registerDecoRecipes(map, "wrought_iron", TAG_WROUGHT_IRON_PLATE, TAG_ROD_WROUGHT_IRON, WROUGHT_IRON_DUST);

        registerDecoRecipes(map, "zinc", TAG_ZINC_PLATE, TAG_ROD_ZINC, ZINC_DUST);

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

        registerEnrichingDustTrueRecipes(map, "aluminum", TAG_RAW_ALUMINUM, DIRTY_ALUMINUM_C, RAW_ALUMINUM_ST_ITEM, ITEM_ALUMINUM_ORE_OW, ALUMINUM_DUST);

        registerEnrichingDustTrueRecipes(map, "ardite", TAG_RAW_ARDITE, DIRTY_ARDITE_C, RAW_ARDITE_ST_ITEM, ITEM_ARDITE_ORE_NETHER, ARDITE_DUST);

        registerEnrichingDustTrueRecipes(map, "cobalt", TAG_RAW_COBALT, DIRTY_COBALT_C, RAW_COBALT_ST_ITEM, ITEM_COBALT_ORE_OW, COBALT_DUST);

        registerEnrichingDustTrueRecipes(map, "gallium", TAG_RAW_GALLIUM, DIRTY_GALLIUM_C, RAW_GALLIUM_ST_ITEM, ITEM_GALLIUM_ORE_OW, GALLIUM_DUST);

        registerEnrichingDustTrueRecipes(map, "iridium", TAG_RAW_IRIDIUM, DIRTY_IRIDIUM_C, RAW_IRIDIUM_ST_ITEM, ITEM_IRIDIUM_ORE_OW, GALLIUM_DUST);

        registerEnrichingDustTrueRecipes(map, "nickel", TAG_RAW_NICKEL, DIRTY_NICKEL_C, RAW_NICKEL_ST_ITEM, ITEM_NICKEL_ORE_OW, NICKEL_DUST);

        registerEnrichingDustTrueRecipes(map, "platinum", TAG_RAW_PLATINUM, DIRTY_PLATINUM_C, RAW_PLATINUM_ST_ITEM, ITEM_PLATINUM_ORE_OW, PLATINUM_DUST);

        registerEnrichingDustTrueRecipes(map, "silver", TAG_RAW_SILVER, DIRTY_SILVER_C, RAW_SILVER_ST_ITEM, ITEM_SILVER_ORE_OW, SILVER_DUST);

        registerEnrichingDustTrueRecipes(map, "uraninite", TAG_RAW_URANINITE, DIRTY_URANINITE_C, RAW_URANINITE_ST_ITEM, ITEM_URANINITE_ORE_OW, URANINITE_DUST);

        registerEnrichingDustTrueRecipes(map, "zinc", TAG_RAW_ZINC, DIRTY_ZINC_C, RAW_ZINC_ST_ITEM, ITEM_ZINC_ORE_OW, ZINC_DUST);

        DUST_ENTRIES = Map.copyOf(map);
    }
    /// Catalyrium Only
    public static final Map<String, EOEnrichingType.InputsDiff> DUST_WITHOUT_ORE_ENTRIES;
    static
    {
        Map<String, EOEnrichingType.InputsDiff> map = new HashMap<>();

        registerEnrichingDustRecipes(map, "catalyrium", TAG_RAW_CATALYRIUM, DIRTY_CATALYRIUM_C, RAW_CATALYRIUM_ST_ITEM, CATALYRIUM_DUST);

        DUST_WITHOUT_ORE_ENTRIES = Map.copyOf(map);
    }

    /// Ore Block -> Gem
    public static final Map<String, EOEnrichingType.InputsGem> ORE_GEM_ENTRIES;
    static
    {
        Map<String, EOEnrichingType.InputsGem> map = new HashMap<>();

        registerEnrichingGemRecipes(map, "amber", ITEM_AMBER_ORE_OW, GEM_AMBER);

        registerEnrichingGemRecipes(map, "apatite", ITEM_APATITE_ORE_OW, GEM_APATITE);

        registerEnrichingGemRecipes(map, "cinnabar", ITEM_CINNABAR_ORE_OW, GEM_CINNABAR);

        registerEnrichingGemRecipes(map, "fluorite", ITEM_FLUORITE_ORE_OW, FLUORITE);

        registerEnrichingGemRecipes(map, "necroticarite", ITEM_NECROTICARITE_ORE_NETHER, GEM_NECROTICARITE);

        registerEnrichingGemRecipes(map, "niter", ITEM_NITER_ORE_OW, GEM_NITER);

        registerEnrichingGemRecipes(map, "onyx", ITEM_ONYX_ORE_OW, GEM_ONYX);

        registerEnrichingGemRecipes(map, "peridot", ITEM_PERIDOT_ORE_OW, GEM_PERIDOT);

        registerEnrichingGemRecipes(map, "ruby", ITEM_RUBY_ORE_OW, GEM_RUBY);

        registerEnrichingGemRecipes(map, "sapphire", ITEM_SAPPHIRE_ORE_OW, GEM_SAPPHIRE);

        registerEnrichingGemRecipes(map, "obsidian", ITEM_OBSIDIAN_ORE_NETHER, GEM_OBSIDIAN_SHARD);

        ORE_GEM_ENTRIES = Map.copyOf(map);
    }

    /// Material -> Dust Only
    public static final Map<String, EOCrushingType.InputsMaterials> DUST_MATERIAL_ENTRIES;
    static
    {
        Map<String, EOCrushingType.InputsMaterials> map = new HashMap<>();

        registerMaterialCrushingRecipes(map, "aluminum", TAG_ALUMINIUM_INGOT, ALUMINUM_DUST);

        registerMaterialCrushingRecipes(map, "ardite", TAG_ARDITE_INGOT, ARDITE_DUST);

        registerMaterialCrushingRecipes(map, "amber", TAG_GEM_AMBER, AMBER_DUST);

        registerMaterialCrushingRecipes(map, "amethyst", GEMS_AMETHYST, AMETHYST_DUST);

        registerMaterialCrushingRecipes(map, "apatite", TAG_GEM_APATITE, APATITE_DUST);

        registerMaterialCrushingRecipes(map, "blue_steel", TAG_BLUE_STEEL_INGOT, BLUE_STEEL_DUST);

        registerMaterialCrushingRecipes(map, "brass", TAG_BRASS_INGOT, BRASS_DUST);

        registerMaterialCrushingRecipes(map, "britannia", TAG_BRITANNIA_INGOT, BRITANNIA_SILVER_DUST)
        ;
        registerMaterialCrushingRecipes(map, "bronze", TAG_BRONZE_INGOT, BRONZE_DUST);

        registerMaterialCrushingRecipes(map, "catalyrium", TAG_CATALYRIUM_INGOT, CATALYRIUM_DUST);

        registerMaterialCrushingRecipes(map, "cast_iron", TAG_CAST_IRON_INGOT, CAST_IRON_DUST);

        registerMaterialCrushingRecipes(map, "cast_steel", TAG_CAST_STEEL_INGOT, CAST_STEEL_DUST);

        registerMaterialCrushingRecipes(map, "coal", COAL, COAL_DUST);

        registerMaterialCrushingRecipes(map, "cobalt", TAG_COBALT_INGOT, COBALT_DUST);

        registerMaterialCrushingRecipes(map, "constantan", TAG_CONSTANTAN_INGOT, CONSTANTAN_DUST);

        registerMaterialCrushingRecipes(map, "copper", INGOTS_COPPER, COPPER_DUST);

        registerMaterialCrushingRecipes(map, "diamond", GEMS_DIAMOND, DIAMOND_DUST);

        registerMaterialCrushingRecipes(map, "electrum", TAG_ELECTRUM_INGOT, ELECTRUM_DUST);

        registerMaterialCrushingRecipes(map, "emerald", GEMS_EMERALD, EMERALD_DUST);

        registerMaterialCrushingRecipes(map, "ender_pearl", ENDER_PEARLS, ENDER_DUST);

        registerMaterialCrushingRecipes(map, "enderium", TAG_ENDERIUM_INGOT, ENDERIUM_DUST);

        registerMaterialCrushingRecipes(map, "endstone", END_STONES, ENDSTONE_DUST);

        registerMaterialCrushingRecipes(map, "fluorite", TAG_GEM_FLUORITE, FLUORITE_DUST);

        registerMaterialCrushingRecipes(map, "gallium", TAG_GALLIUM_INGOT, GALLIUM_DUST);

        registerMaterialCrushingRecipes(map, "gold", INGOTS_GOLD, GOLD_DUST);

        registerMaterialCrushingRecipes(map, "graphite", TAG_GRAPHITE_INGOT, GRAPHITE_DUST);

        registerMaterialCrushingRecipes(map, "invar", TAG_INVAR_INGOT, INVAR_DUST);

        registerMaterialCrushingRecipes(map, "iridium", TAG_IRIDIUM_INGOT, IRIDIUM_DUST);

        registerMaterialCrushingRecipes(map, "iron", INGOTS_IRON, IRON_DUST);

        registerMaterialCrushingRecipes(map, "lapis", GEMS_LAPIS, LAPIS_LAZULI_DUST);

        registerMaterialCrushingRecipes(map, "lead", TAG_LEAD_INGOT, LEAD_DUST);

        registerMaterialCrushingRecipes(map, "lumium", TAG_LUMIUM_INGOT, LUMIUM_DUST);

        registerMaterialCrushingRecipes(map, "necroticarite", TAG_GEM_NECROTICARITE, NECROTICARITE_DUST);

        registerMaterialCrushingRecipes(map, "nether_star", NETHER_STARS, NETHER_STAR_DUST);

        registerMaterialCrushingRecipes(map, "netherite", INGOTS_NETHERITE, NETHERITE_DUST);

        registerMaterialCrushingRecipes(map, "netherrack", NETHERRACKS, NETHERRACK_DUST);

        registerMaterialCrushingRecipes(map, "nethersteel", TAG_NETHERSTEEL_INGOT, NETHERSTEEL_DUST);

        registerMaterialCrushingRecipes(map, "nickel", TAG_NICKEL_INGOT, NICKEL_DUST);

        registerMaterialCrushingRecipes(map, "niter", TAG_GEM_NITER, NITER_DUST);

        registerMaterialCrushingRecipes(map, "obsidian_block", OBSIDIANS, OBSIDIAN_DUST);

        registerMaterialCrushingRecipes(map, "obsidian_gem", TAG_GEM_OBSIDIAN, OBSIDIAN_DUST);

        registerMaterialCrushingRecipes(map, "onyx", TAG_GEM_ONYX, ONYX_DUST);

        registerMaterialCrushingRecipes(map, "osmium", TAG_OSMIUM_INGOT, OSMIUM_DUST);

        registerMaterialCrushingRecipes(map, "peridot", TAG_GEM_PERIDOT, PERIDOT_DUST);

        registerMaterialCrushingRecipes(map, "pewter", TAG_PEWTER_INGOT, PEWTER_DUST);

        registerMaterialCrushingRecipes(map, "pig_iron", TAG_PIG_IRON_INGOT, PIG_IRON_DUST);

        registerMaterialCrushingRecipes(map, "platinum", TAG_PLATINUM_INGOT, PLATINUM_DUST);

        registerMaterialCrushingRecipes(map, "plutonium", TAG_PLUTONIUM_INGOT, PLUTONIUM_DUST);

        registerMaterialCrushingRecipes(map, "prismarine", GEMS_PRISMARINE, PRISMARINE_DUST);

        registerMaterialCrushingRecipes(map, "quartz", GEMS_QUARTZ, QUARTZ_DUST);

        registerMaterialCrushingRecipes(map, "rose_gold", TAG_ROSE_GOLD_INGOT, ROSE_GOLD_DUST);

        registerMaterialCrushingRecipes(map, "ruby", TAG_GEM_RUBY, RUBY_DUST);

        registerMaterialCrushingRecipes(map, "sapphire", TAG_GEM_SAPPHIRE, SAPPHIRE_DUST);

        registerMaterialCrushingRecipes(map, "sculk", SCULK, SCULK_DUST);

        registerMaterialCrushingRecipes(map, "signalum", TAG_SIGNALUM_INGOT, SIGNALUM_DUST);

        registerMaterialCrushingRecipes(map, "silver", TAG_SILVER_INGOT, SILVER_DUST);

        registerMaterialCrushingRecipes(map, "sulfur", TAG_SULFUR, SULFUR_DUST);

        registerMaterialCrushingRecipes(map, "shadowsteel", TAG_SHADOWSTEEL_INGOT, SHADOWSTEEL_DUST);

        registerMaterialCrushingRecipes(map, "steel", TAG_STEEL_INGOT, STEEL_DUST);

        registerMaterialCrushingRecipes(map, "tin", TAG_TIN_INGOT, TIN_DUST);

        registerMaterialCrushingRecipes(map, "titanium", TAG_TITANIUM_INGOT, TITANIUM_DUST);

        registerMaterialCrushingRecipes(map, "ultimatitanium", TAG_ULTIMATITANIUM_INGOT, ULTIMATITANIUM_DUST);

        registerMaterialCrushingRecipes(map, "uraninite", TAG_URANINITE_INGOT, URANINITE_DUST);

        registerMaterialCrushingRecipes(map, "uranium", TAG_URANIUM_INGOT, URANIUM_DUST);

        registerMaterialCrushingRecipes(map, "wrought_iron", TAG_WROUGHT_IRON_INGOT, WROUGHT_IRON_DUST);

        registerMaterialCrushingRecipes(map, "zinc", TAG_ZINC_INGOT, ZINC_DUST);

        DUST_MATERIAL_ENTRIES = Map.copyOf(map);
    }

    ///
    /// Material Set/Shard -> Clump
    ///
    public static final Map<String, EOPurificationType.Inputs> CLUMP_ENTRIES;
    static
    {
        Map<String, EOPurificationType.Inputs> map = new HashMap<>();

        registerPurificationTrueRecipes(map, "aluminum", TAG_RAW_ALUMINUM, SHARD_ALUMINUM_C, RAW_ALUMINUM_ST_ITEM, ITEM_ALUMINUM_ORE_OW, ALUMINUM_CLUMP);

        registerPurificationTrueRecipes(map, "ardite", TAG_RAW_ARDITE, SHARD_ARDITE_C, RAW_ARDITE_ST_ITEM, ITEM_ARDITE_ORE_NETHER, ARDITE_CLUMP);

        registerPurificationTrueRecipes(map, "cobalt", TAG_RAW_COBALT, SHARD_COBALT_C, RAW_COBALT_ST_ITEM, ITEM_COBALT_ORE_OW, COBALT_CLUMP);

        registerPurificationTrueRecipes(map, "gallium", TAG_RAW_GALLIUM, SHARD_GALLIUM_C, RAW_GALLIUM_ST_ITEM, ITEM_GALLIUM_ORE_OW, GALLIUM_CLUMP);

        registerPurificationTrueRecipes(map, "iridium", TAG_RAW_IRIDIUM, SHARD_IRIDIUM_C, RAW_IRIDIUM_ST_ITEM, ITEM_IRIDIUM_ORE_OW, IRIDIUM_CLUMP);

        registerPurificationTrueRecipes(map, "nickel", TAG_RAW_NICKEL, SHARD_NICKEL_C, RAW_NICKEL_ST_ITEM, ITEM_NICKEL_ORE_OW, NICKEL_CLUMP);

        registerPurificationTrueRecipes(map, "platinum", TAG_RAW_PLATINUM, SHARD_PLATINUM_C, RAW_PLATINUM_ST_ITEM, ITEM_PLATINUM_ORE_OW, PLATINUM_CLUMP);

        registerPurificationTrueRecipes(map, "silver", TAG_RAW_SILVER, SHARD_SILVER_C, RAW_SILVER_ST_ITEM, ITEM_SILVER_ORE_OW, SILVER_CLUMP);

        registerPurificationTrueRecipes(map, "uraninite", TAG_RAW_URANINITE, SHARD_URANINITE_C, RAW_URANINITE_ST_ITEM, ITEM_URANINITE_ORE_OW, URANINITE_CLUMP);

        registerPurificationTrueRecipes(map, "zinc", TAG_RAW_ZINC, SHARD_ZINC_C, RAW_ZINC_ST_ITEM, ITEM_ZINC_ORE_OW, ZINC_CLUMP);

        CLUMP_ENTRIES = Map.copyOf(map);
    }

    /// Catalyrium Only
    public static final Map<String, EOPurificationType.InputsDiff> CLUMP_WITHOUT_ORE_ENTRIES;
    static
    {
        Map<String, EOPurificationType.InputsDiff> map = new HashMap<>();

        registerPurificationRecipes(map, "catalyrium", TAG_RAW_CATALYRIUM, SHARD_CATALYRIUM_C, RAW_CATALYRIUM_ST_ITEM, CATALYRIUM_CLUMP);

        CLUMP_WITHOUT_ORE_ENTRIES = Map.copyOf(map);
    }

    ///
    /// Material Set/Crystal -> Shard
    ///
    public static final Map<String, EOInjectionType.Inputs> SHARD_ENTRIES;
    static
    {
        Map<String, EOInjectionType.Inputs> map = new HashMap<>();

        registerInjectingTrueRecipes(map,"aluminum", TAG_RAW_ALUMINUM, CRYSTAL_ALUMINUM_C, RAW_ALUMINUM_ST_ITEM, ITEM_ALUMINUM_ORE_OW, ALUMINUM_SHARD);

        registerInjectingTrueRecipes(map,"ardite", TAG_RAW_ARDITE, CRYSTAL_ARDITE_C, RAW_ARDITE_ST_ITEM, ITEM_ARDITE_ORE_NETHER, ARDITE_SHARD);

        registerInjectingTrueRecipes(map,"cobalt", TAG_RAW_COBALT, CRYSTAL_COBALT_C, RAW_COBALT_ST_ITEM, ITEM_COBALT_ORE_OW, COBALT_SHARD);

        registerInjectingTrueRecipes(map,"gallium", TAG_RAW_GALLIUM, CRYSTAL_GALLIUM_C, RAW_GALLIUM_ST_ITEM, ITEM_GALLIUM_ORE_OW, GALLIUM_SHARD);

        registerInjectingTrueRecipes(map,"iridium", TAG_RAW_IRIDIUM, CRYSTAL_IRIDIUM_C, RAW_IRIDIUM_ST_ITEM, ITEM_IRIDIUM_ORE_OW, IRIDIUM_SHARD);

        registerInjectingTrueRecipes(map,"nickel", TAG_RAW_NICKEL, CRYSTAL_NICKEL_C, RAW_NICKEL_ST_ITEM, ITEM_NICKEL_ORE_OW, NICKEL_SHARD);

        registerInjectingTrueRecipes(map,"platinum", TAG_RAW_PLATINUM, CRYSTAL_PLATINUM_C, RAW_PLATINUM_ST_ITEM, ITEM_PLATINUM_ORE_OW, PLATINUM_SHARD);

        registerInjectingTrueRecipes(map,"silver", TAG_RAW_SILVER, CRYSTAL_SILVER_C, RAW_SILVER_ST_ITEM, ITEM_SILVER_ORE_OW, SILVER_SHARD);

        registerInjectingTrueRecipes(map,"uraninite", TAG_RAW_URANINITE, CRYSTAL_URANINITE_C, RAW_URANINITE_ST_ITEM, ITEM_URANINITE_ORE_OW, URANINITE_SHARD);

        registerInjectingTrueRecipes(map,"zinc", TAG_RAW_ZINC, CRYSTAL_ZINC_C, RAW_ZINC_ST_ITEM, ITEM_ZINC_ORE_OW, ZINC_SHARD);

        SHARD_ENTRIES = Map.copyOf(map);
    }

    /// Catalyrium Only
    public static final Map<String, EOInjectionType.InputsDiff> SHARD_WITHOUT_ORE_ENTRIES;
    static
    {
        Map<String, EOInjectionType.InputsDiff> map = new HashMap<>();

        registerInjectingRecipes(map,"catalyrium", TAG_RAW_CATALYRIUM, CRYSTAL_CATALYRIUM_C, RAW_CATALYRIUM_ST_ITEM, CATALYRIUM_SHARD);

        SHARD_WITHOUT_ORE_ENTRIES = Map.copyOf(map);
    }

    /// Material Dirty Slurry -> Clean Slurry
    public static final Map<String, EOWasherType.Inputs> DIRTY_SLURRY_TO_CLEAN;
    static
    {
        Map<String, EOWasherType.Inputs> map = new HashMap<>();

        registerWashingRecipes(map,"aluminum", ALUMINUM_SLURRY.getDirtySlurry(), WATER, ALUMINUM_SLURRY.getCleanSlurry());

        registerWashingRecipes(map,"ardite", ARDITE_SLURRY.getDirtySlurry(), WATER, ARDITE_SLURRY.getCleanSlurry());

        registerWashingRecipes(map,"catalyrium", CATALYRIUM_SLURRY.getDirtySlurry(), WATER, CATALYRIUM_SLURRY.getCleanSlurry());

        registerWashingRecipes(map,"cobalt", COBALT_SLURRY.getDirtySlurry(), WATER, COBALT_SLURRY.getCleanSlurry());

        registerWashingRecipes(map,"gallium", GALLIUM_SLURRY.getDirtySlurry(), WATER, GALLIUM_SLURRY.getCleanSlurry());

        registerWashingRecipes(map,"iridium", IRIDIUM_SLURRY.getDirtySlurry(), WATER, IRIDIUM_SLURRY.getCleanSlurry());

        registerWashingRecipes(map,"nickel", NICKEL_SLURRY.getDirtySlurry(), WATER, NICKEL_SLURRY.getCleanSlurry());

        registerWashingRecipes(map,"platinum", PLATINUM_SLURRY.getDirtySlurry(), WATER, PLATINUM_SLURRY.getCleanSlurry());

        registerWashingRecipes(map,"silver", SILVER_SLURRY.getDirtySlurry(), WATER, SILVER_SLURRY.getCleanSlurry());

        registerWashingRecipes(map,"uraninite", URANINITE_SLURRY.getDirtySlurry(), WATER, URANINITE_SLURRY.getCleanSlurry());

        registerWashingRecipes(map,"zinc", ZINC_SLURRY.getDirtySlurry(), WATER, ZINC_SLURRY.getCleanSlurry());

        DIRTY_SLURRY_TO_CLEAN = Map.copyOf(map);
    }

    /// Material Set -> Dirty Slurry
    public static final Map<String, EODissolutionType.Inputs> MATERIAL_TO_DIRTY_SLURRY;
    static
    {
        Map<String, EODissolutionType.Inputs> map = new HashMap<>();

        registerDissolutionTrueRecipes(map, "aluminum", TAG_RAW_ALUMINUM, RAW_ALUMINUM_ST_ITEM, ITEM_ALUMINUM_ORE_OW, ALUMINUM_SLURRY.getDirtySlurry());

        registerDissolutionTrueRecipes(map, "ardite", TAG_RAW_ARDITE, RAW_ARDITE_ST_ITEM, ITEM_ARDITE_ORE_NETHER, ARDITE_SLURRY.getDirtySlurry());

        registerDissolutionTrueRecipes(map, "cobalt", TAG_RAW_COBALT, RAW_COBALT_ST_ITEM, ITEM_COBALT_ORE_OW, COBALT_SLURRY.getDirtySlurry());

        registerDissolutionTrueRecipes(map, "gallium", TAG_RAW_GALLIUM, RAW_GALLIUM_ST_ITEM, ITEM_GALLIUM_ORE_OW, GALLIUM_SLURRY.getDirtySlurry());

        registerDissolutionTrueRecipes(map, "iridium", TAG_RAW_IRIDIUM, RAW_IRIDIUM_ST_ITEM, ITEM_IRIDIUM_ORE_OW, IRIDIUM_SLURRY.getDirtySlurry());

        registerDissolutionTrueRecipes(map, "nickel", TAG_RAW_NICKEL, RAW_NICKEL_ST_ITEM, ITEM_NICKEL_ORE_OW, NICKEL_SLURRY.getDirtySlurry());

        registerDissolutionTrueRecipes(map, "platinum", TAG_RAW_PLATINUM, RAW_PLATINUM_ST_ITEM, ITEM_PLATINUM_ORE_OW, PLATINUM_SLURRY.getDirtySlurry());

        registerDissolutionTrueRecipes(map, "silver", TAG_RAW_SILVER, RAW_SILVER_ST_ITEM, ITEM_SILVER_ORE_OW, SILVER_SLURRY.getDirtySlurry());

        registerDissolutionTrueRecipes(map, "uraninite", TAG_RAW_URANINITE, RAW_URANINITE_ST_ITEM, ITEM_URANINITE_ORE_OW, URANINITE_SLURRY.getDirtySlurry());

        registerDissolutionTrueRecipes(map, "zinc", TAG_RAW_ZINC, RAW_ZINC_ST_ITEM, ITEM_ZINC_ORE_OW, ZINC_SLURRY.getDirtySlurry());

        MATERIAL_TO_DIRTY_SLURRY = Map.copyOf(map);
    }

    public static final Map<String, EODissolutionType.InputsDiff> MATERIAL_WITHOUT_ORES_TO_DIRTY_SLURRY;
    static
    {
        Map<String, EODissolutionType.InputsDiff> map = new HashMap<>();

        registerDissolutionRecipes(map, "catalyrium", TAG_RAW_CATALYRIUM, RAW_CATALYRIUM_ST_ITEM, CATALYRIUM_SLURRY.getDirtySlurry());

        MATERIAL_WITHOUT_ORES_TO_DIRTY_SLURRY = Map.copyOf(map);
    }

    /// Clean Slurry -> Crystal
    public static final Map<String, EOCrystallizationType.Inputs> CLEAN_SLURRY_TO_CRYSTAL;
    static
    {
        Map<String, EOCrystallizationType.Inputs> map = new HashMap<>();

        registerCrystallizationRecipes(map, "aluminum", ALUMINUM_SLURRY.getCleanSlurry(), ALUMINUM_CRYSTAL);

        registerCrystallizationRecipes(map, "ardite", ARDITE_SLURRY.getCleanSlurry(), ARDITE_CRYSTAL);

        registerCrystallizationRecipes(map, "catalyrium", CATALYRIUM_SLURRY.getCleanSlurry(), CATALYRIUM_CRYSTAL);

        registerCrystallizationRecipes(map, "cobalt", COBALT_SLURRY.getCleanSlurry(), COBALT_CRYSTAL);

        registerCrystallizationRecipes(map, "gallium", GALLIUM_SLURRY.getCleanSlurry(), GALLIUM_CRYSTAL);

        registerCrystallizationRecipes(map, "iridium", IRIDIUM_SLURRY.getCleanSlurry(), IRIDIUM_CRYSTAL);

        registerCrystallizationRecipes(map, "nickel", NICKEL_SLURRY.getCleanSlurry(), NICKEL_CRYSTAL);

        registerCrystallizationRecipes(map, "platinum", PLATINUM_SLURRY.getCleanSlurry(), PLATINUM_CRYSTAL);

        registerCrystallizationRecipes(map, "silver", SILVER_SLURRY.getCleanSlurry(), SILVER_CRYSTAL);

        registerCrystallizationRecipes(map, "uraninite", URANINITE_SLURRY.getCleanSlurry(), URANINITE_CRYSTAL);

        registerCrystallizationRecipes(map, "zinc", ZINC_SLURRY.getCleanSlurry(), ZINC_CRYSTAL);

        CLEAN_SLURRY_TO_CRYSTAL = Map.copyOf(map);
    }
}
