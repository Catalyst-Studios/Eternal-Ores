package net.radzratz.eternalores.util.compat.oritech.recipe_types.pulverizer.entries;

import net.neoforged.neoforge.common.Tags;
import net.radzratz.eternalores.item.EOItems;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.enums.EOPulverizerOreFormToDustType;
import net.radzratz.eternalores.util.tags.item.gems.EOGemTags;
import net.radzratz.eternalores.util.tags.item.ingots.EOIngotTags;

import java.util.HashMap;
import java.util.Map;

import static net.radzratz.eternalores.util.compat.oritech.recipe_types.pulverizer.EOPulverizerInputRegistry.registerGemToDustRecipes;
import static net.radzratz.eternalores.util.compat.oritech.recipe_types.pulverizer.EOPulverizerInputRegistry.registerIngotToDustRecipes;

public class EOPulverizerOreFormDustEntries
{
    /// Material -> Dust
    public static final Map<String, EOPulverizerOreFormToDustType.InputsIngot> INGOT_FORM_DUST;
    static
    {
        Map<String, EOPulverizerOreFormToDustType.InputsIngot> map = new HashMap<>();

        registerIngotToDustRecipes(map, "aluminum", EOIngotTags.Items.ALUMINIUM_INGOT, EOItems.ALUMINUM_DUST);
        registerIngotToDustRecipes(map, "ardite", EOIngotTags.Items.ARDITE_INGOT, EOItems.ARDITE_DUST);
        registerIngotToDustRecipes(map, "blue_steel", EOIngotTags.Items.BLUE_STEEL_INGOT, EOItems.BLUE_STEEL_DUST);
        registerIngotToDustRecipes(map, "brass", EOIngotTags.Items.BRASS_INGOT, EOItems.BRASS_DUST);
        registerIngotToDustRecipes(map, "bronze", EOIngotTags.Items.BRONZE_INGOT, EOItems.BRONZE_DUST);
        registerIngotToDustRecipes(map, "cast_iron", EOIngotTags.Items.CAST_IRON_INGOT, EOItems.CAST_IRON_DUST);
        registerIngotToDustRecipes(map, "cast_steel", EOIngotTags.Items.CAST_STEEL_INGOT, EOItems.CAST_STEEL_DUST);
        registerIngotToDustRecipes(map, "cobalt", EOIngotTags.Items.COBALT_INGOT, EOItems.COBALT_DUST);
        registerIngotToDustRecipes(map, "constantan", EOIngotTags.Items.CONSTANTAN_INGOT, EOItems.CONSTANTAN_DUST);
        registerIngotToDustRecipes(map, "gallium", EOIngotTags.Items.GALLIUM_INGOT, EOItems.GALLIUM_DUST);
        registerIngotToDustRecipes(map, "invar", EOIngotTags.Items.INVAR_INGOT, EOItems.INVAR_DUST);
        registerIngotToDustRecipes(map, "lead", EOIngotTags.Items.LEAD_INGOT, EOItems.LEAD_DUST);
        registerIngotToDustRecipes(map, "lumium", EOIngotTags.Items.LUMIUM_INGOT, EOItems.LUMIUM_DUST);
        registerIngotToDustRecipes(map, "netherite", Tags.Items.INGOTS_NETHERITE, EOItems.NETHERITE_DUST);
        registerIngotToDustRecipes(map, "nethersteel", EOIngotTags.Items.NETHERSTEEL_INGOT, EOItems.NETHERSTEEL_DUST);
        registerIngotToDustRecipes(map, "osmium", EOIngotTags.Items.OSMIUM_INGOT, EOItems.OSMIUM_DUST);
        registerIngotToDustRecipes(map, "pig_iron", EOIngotTags.Items.PIG_IRON_INGOT, EOItems.PIG_IRON_DUST);
        registerIngotToDustRecipes(map, "rose_gold", EOIngotTags.Items.ROSE_GOLD_INGOT, EOItems.ROSE_GOLD_DUST);
        registerIngotToDustRecipes(map, "shadowsteel", EOIngotTags.Items.SHADOWSTEEL_INGOT, EOItems.SHADOWSTEEL_DUST);
        registerIngotToDustRecipes(map, "signalum", EOIngotTags.Items.SIGNALUM_INGOT, EOItems.SIGNALUM_DUST);
        registerIngotToDustRecipes(map, "silver", EOIngotTags.Items.SILVER_INGOT, EOItems.SILVER_DUST);
        registerIngotToDustRecipes(map, "tin", EOIngotTags.Items.TIN_INGOT, EOItems.TIN_DUST);
        registerIngotToDustRecipes(map, "titanium", EOIngotTags.Items.TITANIUM_INGOT, EOItems.TITANIUM_DUST);
        registerIngotToDustRecipes(map, "ultimatitanium", EOIngotTags.Items.ULTIMATITANIUM_INGOT, EOItems.ULTIMATITANIUM_DUST);
        registerIngotToDustRecipes(map, "wrought_iron", EOIngotTags.Items.WROUGHT_IRON_INGOT, EOItems.WROUGHT_IRON_DUST);
        registerIngotToDustRecipes(map, "zinc", EOIngotTags.Items.ZINC_INGOT, EOItems.ZINC_DUST);

        INGOT_FORM_DUST = Map.copyOf(map);
    }

    public static final Map<String, EOPulverizerOreFormToDustType.InputsGem> GEM_FORM_DUST;
    static
    {
        Map<String, EOPulverizerOreFormToDustType.InputsGem> map = new HashMap<>();

        registerGemToDustRecipes(map, "amber", EOGemTags.Items.GEM_AMBER, EOItems.AMBER_DUST);
        registerGemToDustRecipes(map, "amethyst", Tags.Items.GEMS_AMETHYST, EOItems.AMETHYST_DUST);
        registerGemToDustRecipes(map, "apatite", EOGemTags.Items.GEM_APATITE, EOItems.APATITE_DUST);
        registerGemToDustRecipes(map, "cinnabar", EOGemTags.Items.GEM_CINNABAR, EOItems.CINNABAR_DUST);
        registerGemToDustRecipes(map, "diamond", Tags.Items.GEMS_DIAMOND, EOItems.DIAMOND_DUST);
        registerGemToDustRecipes(map, "emerald", Tags.Items.GEMS_EMERALD, EOItems.EMERALD_DUST);
        registerGemToDustRecipes(map, "fluorite", EOGemTags.Items.GEM_FLUORITE, EOItems.FLUORITE_DUST);
        registerGemToDustRecipes(map, "lapis", Tags.Items.GEMS_LAPIS, EOItems.LAPIS_LAZULI_DUST);
        registerGemToDustRecipes(map, "necroticarite", EOGemTags.Items.GEM_NECROTICARITE, EOItems.NECROTICARITE_DUST);
        registerGemToDustRecipes(map, "niter", EOGemTags.Items.GEM_NITER, EOItems.NITER_DUST);
        registerGemToDustRecipes(map, "obsidian", EOGemTags.Items.GEM_OBSIDIAN, EOItems.OBSIDIAN_DUST);
        registerGemToDustRecipes(map, "onyx", EOGemTags.Items.GEM_ONYX, EOItems.ONYX_DUST);
        registerGemToDustRecipes(map, "peridot", EOGemTags.Items.GEM_PERIDOT, EOItems.PERIDOT_DUST);
        /*registerGemToDustRecipes(map, "prismarine", Tags.Items.GEMS_PRISMARINE, EOItems.PRISMARINE_DUST);*/
        registerGemToDustRecipes(map, "quantiquarite", EOGemTags.Items.GEM_QUANTIQUARITE, EOItems.QUANTIQUARITE_DUST);
        registerGemToDustRecipes(map, "quartz", Tags.Items.GEMS_QUARTZ, EOItems.QUARTZ_DUST);
        registerGemToDustRecipes(map, "ruby", EOGemTags.Items.GEM_RUBY, EOItems.RUBY_DUST);
        registerGemToDustRecipes(map, "sapphire", EOGemTags.Items.GEM_SAPPHIRE, EOItems.SAPPHIRE_DUST);
        registerGemToDustRecipes(map, "tachyarite", EOGemTags.Items.GEM_TACHYARITE, EOItems.TACHYARITE_DUST);
        registerGemToDustRecipes(map, "voiderite", EOGemTags.Items.GEM_VOIDERITE, EOItems.VOIDERITE_DUST);

        GEM_FORM_DUST = Map.copyOf(map);
    }
}
