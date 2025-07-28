package net.radzratz.eternalores.util.compat.oritech.recipe_types.pulverizer.entries;

import net.radzratz.eternalores.util.compat.oritech.recipe_types.enums.pulverizer.EOPulverizerDustConversionType;

import java.util.HashMap;
import java.util.Map;

import static net.neoforged.neoforge.common.Tags.Items.*;
import static net.radzratz.eternalores.item.EOItemRegistry.*;
import static net.radzratz.eternalores.util.compat.oritech.recipe_types.pulverizer.EOPulverizerInputRegistry.*;
import static net.radzratz.eternalores.util.tags.item.gems.EOGemTags.Items.*;
import static net.radzratz.eternalores.util.tags.item.ingots.EOIngotTags.Items.*;
import static net.radzratz.eternalores.util.tags.item.raw_materials.EORawMaterialTags.*;

public class EOPulverizerOreFormDustEntries
{
    /// Material -> Dust
    public static final Map<String, EOPulverizerDustConversionType.InputsIngot> INGOT_FORM_DUST;
    static
    {
        Map<String, EOPulverizerDustConversionType.InputsIngot> map = new HashMap<>();

        registerIngotToDustRecipes(map, "aluminum", TAG_ALUMINIUM_INGOT, ALUMINUM_DUST);

        registerIngotToDustRecipes(map, "ardite", TAG_ARDITE_INGOT, ARDITE_DUST);

        registerIngotToDustRecipes(map, "blue_steel", TAG_BLUE_STEEL_INGOT, BLUE_STEEL_DUST);

        registerIngotToDustRecipes(map, "brass", TAG_BRASS_INGOT, BRASS_DUST);

        registerIngotToDustRecipes(map, "bronze", TAG_BRONZE_INGOT, BRONZE_DUST);

        registerIngotToDustRecipes(map, "cast_iron", TAG_CAST_IRON_INGOT, CAST_IRON_DUST);

        registerIngotToDustRecipes(map, "cast_steel", TAG_CAST_STEEL_INGOT, CAST_STEEL_DUST);

        registerIngotToDustRecipes(map, "cobalt", TAG_COBALT_INGOT, COBALT_DUST);

        registerIngotToDustRecipes(map, "constantan", TAG_CONSTANTAN_INGOT, CONSTANTAN_DUST);

        registerIngotToDustRecipes(map, "gallium", TAG_GALLIUM_INGOT, GALLIUM_DUST);

        registerIngotToDustRecipes(map, "invar", TAG_INVAR_INGOT, INVAR_DUST);

        registerIngotToDustRecipes(map, "lead", TAG_LEAD_INGOT, LEAD_DUST);

        registerIngotToDustRecipes(map, "lumium", TAG_LUMIUM_INGOT, LUMIUM_DUST);

        registerIngotToDustRecipes(map, "netherite", INGOTS_NETHERITE, NETHERITE_DUST);

        registerIngotToDustRecipes(map, "nethersteel", TAG_NETHERSTEEL_INGOT, NETHERSTEEL_DUST);

        registerIngotToDustRecipes(map, "osmium", TAG_OSMIUM_INGOT, OSMIUM_DUST);

        registerIngotToDustRecipes(map, "pig_iron", TAG_PIG_IRON_INGOT, PIG_IRON_DUST);

        registerIngotToDustRecipes(map, "rose_gold", TAG_ROSE_GOLD_INGOT, ROSE_GOLD_DUST);

        registerIngotToDustRecipes(map, "shadowsteel", TAG_SHADOWSTEEL_INGOT, SHADOWSTEEL_DUST);

        registerIngotToDustRecipes(map, "sulfur", TAG_SULFUR, SULFUR_DUST);

        registerIngotToDustRecipes(map, "signalum", TAG_SIGNALUM_INGOT, SIGNALUM_DUST);

        registerIngotToDustRecipes(map, "silver", TAG_SILVER_INGOT, SILVER_DUST);

        registerIngotToDustRecipes(map, "tin", TAG_TIN_INGOT, TIN_DUST);

        registerIngotToDustRecipes(map, "titanium", TAG_TITANIUM_INGOT, TITANIUM_DUST);

        registerIngotToDustRecipes(map, "ultimatitanium", TAG_ULTIMATITANIUM_INGOT, ULTIMATITANIUM_DUST);

        registerIngotToDustRecipes(map, "wrought_iron", TAG_WROUGHT_IRON_INGOT, WROUGHT_IRON_DUST);

        registerIngotToDustRecipes(map, "zinc", TAG_ZINC_INGOT, ZINC_DUST);

        INGOT_FORM_DUST = Map.copyOf(map);
    }

    public static final Map<String, EOPulverizerDustConversionType.InputsGem> GEM_FORM_DUST;
    static
    {
        Map<String, EOPulverizerDustConversionType.InputsGem> map = new HashMap<>();

        registerGemToDustRecipes(map, "amber", TAG_GEM_AMBER, AMBER_DUST);

        registerGemToDustRecipes(map, "amethyst", GEMS_AMETHYST, AMETHYST_DUST);

        registerGemToDustRecipes(map, "apatite", TAG_GEM_APATITE, APATITE_DUST);

        registerGemToDustRecipes(map, "cinnabar", TAG_GEM_CINNABAR, CINNABAR_DUST);

        registerGemToDustRecipes(map, "diamond", GEMS_DIAMOND, DIAMOND_DUST);

        registerGemToDustRecipes(map, "emerald", GEMS_EMERALD, EMERALD_DUST);

        registerGemToDustRecipes(map, "fluorite", TAG_GEM_FLUORITE, FLUORITE_DUST);

        registerGemToDustRecipes(map, "lapis", GEMS_LAPIS, LAPIS_LAZULI_DUST);

        registerGemToDustRecipes(map, "necroticarite", TAG_GEM_NECROTICARITE, NECROTICARITE_DUST);

        registerGemToDustRecipes(map, "niter", TAG_GEM_NITER, NITER_DUST);

        registerGemToDustRecipes(map, "obsidian", TAG_GEM_OBSIDIAN, OBSIDIAN_DUST);

        registerGemToDustRecipes(map, "onyx", TAG_GEM_ONYX, ONYX_DUST);

        registerGemToDustRecipes(map, "peridot", TAG_GEM_PERIDOT, PERIDOT_DUST);

        registerGemToDustRecipes(map, "prismarine", GEMS_PRISMARINE, PRISMARINE_DUST);

        registerGemToDustRecipes(map, "quantiquarite", TAG_GEM_QUANTIQUARITE, QUANTIQUARITE_DUST);

        registerGemToDustRecipes(map, "quartz", GEMS_QUARTZ, QUARTZ_DUST);

        registerGemToDustRecipes(map, "ruby", TAG_GEM_RUBY, RUBY_DUST);

        registerGemToDustRecipes(map, "sapphire", TAG_GEM_SAPPHIRE, SAPPHIRE_DUST);

        registerGemToDustRecipes(map, "tachyarite", TAG_GEM_TACHYARITE, TACHYARITE_DUST);

        registerGemToDustRecipes(map, "voiderite", TAG_GEM_VOIDERITE, VOIDERITE_DUST);

        GEM_FORM_DUST = Map.copyOf(map);
    }
}
