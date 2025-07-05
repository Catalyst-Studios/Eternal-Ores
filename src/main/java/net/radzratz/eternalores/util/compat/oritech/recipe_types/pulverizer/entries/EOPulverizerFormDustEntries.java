package net.radzratz.eternalores.util.compat.oritech.recipe_types.pulverizer.entries;

import net.radzratz.eternalores.item.EOItems;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.enums.EOPulverizerDustConversionType;
import net.radzratz.eternalores.util.tags.item.plates.EOPlates;
import net.radzratz.eternalores.util.tags.item.rods.EOGemRodsTags;
import net.radzratz.eternalores.util.tags.item.rods.EOMetalRodsTags;
import net.radzratz.eternalores.util.tags.item.rods.EOMiscRodsTags;

import java.util.HashMap;
import java.util.Map;

import static net.radzratz.eternalores.util.compat.oritech.recipe_types.pulverizer.EOPulverizerInputRegistry.registerDeconstructionRecipes;

public class EOPulverizerFormDustEntries
{
    /// Material Plate/Rod -> Dust
    public static final Map<String, EOPulverizerDustConversionType.InputsDeco> DECO_DUST_ENTRIES;
    static
    {
        Map<String, EOPulverizerDustConversionType.InputsDeco> map = new HashMap<>();

        registerDeconstructionRecipes(map, "aluminum", EOPlates.Items.ALUMINIUM_PLATE, EOMetalRodsTags.Items.ROD_ALUMINUM, EOItems.ALUMINUM_DUST);
        registerDeconstructionRecipes(map, "ardite", EOPlates.Items.ARDITE_PLATE, EOMetalRodsTags.Items.ROD_ARDITE, EOItems.ARDITE_DUST);
        registerDeconstructionRecipes(map, "blue_steel", EOPlates.Items.BLUE_STEEL_PLATE, EOMetalRodsTags.Items.ROD_BLUE_STEEL, EOItems.BLUE_STEEL_DUST);
        registerDeconstructionRecipes(map, "brass", EOPlates.Items.BRASS_PLATE, EOMetalRodsTags.Items.ROD_BRASS, EOItems.BRASS_DUST);
        registerDeconstructionRecipes(map, "bronze", EOPlates.Items.BRONZE_PLATE, EOMetalRodsTags.Items.ROD_BRONZE, EOItems.BRONZE_DUST);
        registerDeconstructionRecipes(map, "catalyrium", EOPlates.Items.CATALYRIUM_PLATE, EOMetalRodsTags.Items.ROD_CATALYRIUM, EOItems.CATALYRIUM_DUST);
        registerDeconstructionRecipes(map, "cast_iron", EOPlates.Items.CAST_IRON_PLATE, EOMetalRodsTags.Items.ROD_CAST_IRON, EOItems.CAST_IRON_DUST);
        registerDeconstructionRecipes(map, "cast_steel", EOPlates.Items.CAST_STEEL_PLATE, EOMetalRodsTags.Items.ROD_CAST_STEEL, EOItems.CAST_STEEL_DUST);
        registerDeconstructionRecipes(map, "cobalt", EOPlates.Items.COBALT_PLATE, EOMetalRodsTags.Items.ROD_COBALT, EOItems.COBALT_DUST);
        registerDeconstructionRecipes(map, "constantan", EOPlates.Items.CONSTANTAN_PLATE, EOMetalRodsTags.Items.ROD_CONSTANTAN, EOItems.CONSTANTAN_DUST);
        registerDeconstructionRecipes(map, "copper", EOPlates.Items.COPPER_PLATE, EOMetalRodsTags.Items.ROD_COPPER, EOItems.COPPER_DUST);
        registerDeconstructionRecipes(map, "diamond", EOPlates.Items.DIAMOND_PLATE, EOGemRodsTags.Items.ROD_DIAMOND, EOItems.DIAMOND_DUST);
        registerDeconstructionRecipes(map, "electrum", EOPlates.Items.ELECTRUM_PLATE, EOMetalRodsTags.Items.ROD_ELECTRUM, EOItems.ELECTRUM_DUST);
        registerDeconstructionRecipes(map, "gallium", EOPlates.Items.GALLIUM_PLATE, EOMetalRodsTags.Items.ROD_GALLIUM, EOItems.GALLIUM_DUST);
        registerDeconstructionRecipes(map, "gold", EOPlates.Items.GOLD_PLATE, EOMetalRodsTags.Items.ROD_GOLD, EOItems.GOLD_DUST);
        registerDeconstructionRecipes(map, "graphite", EOPlates.Items.GRAPHITE_PLATE, EOMiscRodsTags.Items.ROD_GRAPHITE, EOItems.GRAPHITE_DUST);
        registerDeconstructionRecipes(map, "invar", EOPlates.Items.INVAR_PLATE, EOMetalRodsTags.Items.ROD_INVAR, EOItems.INVAR_DUST);
        registerDeconstructionRecipes(map, "iridium", EOPlates.Items.IRIDIUM_PLATE, EOMetalRodsTags.Items.ROD_IRIDIUM, EOItems.IRIDIUM_DUST);
        registerDeconstructionRecipes(map, "iron", EOPlates.Items.IRON_PLATE, EOMetalRodsTags.Items.ROD_IRON, EOItems.IRON_DUST);
        registerDeconstructionRecipes(map, "lead", EOPlates.Items.LEAD_PLATE, EOMetalRodsTags.Items.ROD_LEAD, EOItems.LEAD_DUST);
        registerDeconstructionRecipes(map, "lumium", EOPlates.Items.LUMIUM_PLATE, EOMetalRodsTags.Items.ROD_LUMIUM, EOItems.LUMIUM_DUST);
        registerDeconstructionRecipes(map, "necroticarite", EOPlates.Items.NECROTICARITE_PLATE, EOGemRodsTags.Items.ROD_NECROTICARITE, EOItems.NECROTICARITE_DUST);
        registerDeconstructionRecipes(map, "netherite", EOPlates.Items.NETHERITE_PLATE, EOMetalRodsTags.Items.ROD_NETHERITE, EOItems.NETHERITE_DUST);
        registerDeconstructionRecipes(map, "nethersteel", EOPlates.Items.NETHERSTEEL_PLATE, EOMetalRodsTags.Items.ROD_NETHERSTEEL, EOItems.NETHERSTEEL_DUST);
        registerDeconstructionRecipes(map, "nickel", EOPlates.Items.NICKEL_PLATE, EOMetalRodsTags.Items.ROD_NICKEL, EOItems.NICKEL_DUST);
        registerDeconstructionRecipes(map, "osmium", EOPlates.Items.OSMIUM_PLATE, EOMetalRodsTags.Items.ROD_OSMIUM, EOItems.OSMIUM_DUST);
        registerDeconstructionRecipes(map, "pig_iron", EOPlates.Items.PIG_IRON_PLATE, EOMetalRodsTags.Items.ROD_PIG_IRON, EOItems.PIG_IRON_DUST);
        registerDeconstructionRecipes(map, "platinum", EOPlates.Items.PLATINUM_PLATE, EOMetalRodsTags.Items.ROD_PLATINUM, EOItems.PLATINUM_DUST);
        registerDeconstructionRecipes(map, "plutonium", EOPlates.Items.PLUTONIUM_PLATE, EOMetalRodsTags.Items.ROD_PLUTONIUM, EOItems.PLUTONIUM_DUST);
        registerDeconstructionRecipes(map, "quantiquarite", EOPlates.Items.QUANTIQUARITE_PLATE, EOGemRodsTags.Items.ROD_QUANTIQUARITE, EOItems.QUANTIQUARITE_DUST);
        registerDeconstructionRecipes(map, "rose_gold", EOPlates.Items.ROSE_GOLD_PLATE, EOMetalRodsTags.Items.ROD_ROSE_GOLD, EOItems.ROSE_GOLD_DUST);
        registerDeconstructionRecipes(map, "sapphire", EOPlates.Items.SAPPHIRE_PLATE, EOGemRodsTags.Items.ROD_SAPPHIRE, EOItems.SAPPHIRE_DUST);
        registerDeconstructionRecipes(map, "shadowsteel", EOPlates.Items.SHADOWSTEEL_PLATE, EOMetalRodsTags.Items.ROD_SHADOWSTEEL, EOItems.SHADOWSTEEL_DUST);
        registerDeconstructionRecipes(map, "signalum", EOPlates.Items.SIGNALUM_PLATE, EOMetalRodsTags.Items.ROD_SIGNALUM, EOItems.SIGNALUM_DUST);
        registerDeconstructionRecipes(map, "silver", EOPlates.Items.SILVER_PLATE, EOMetalRodsTags.Items.ROD_SILVER, EOItems.SILVER_DUST);
        registerDeconstructionRecipes(map, "steel", EOPlates.Items.STEEL_PLATE, EOMetalRodsTags.Items.ROD_STEEL, EOItems.STEEL_DUST);
        registerDeconstructionRecipes(map, "tachyarite", EOPlates.Items.TACHYARITE_PLATE, EOGemRodsTags.Items.ROD_TACHYARITE, EOItems.TACHYARITE_DUST);
        registerDeconstructionRecipes(map, "tin", EOPlates.Items.TIN_PLATE, EOMetalRodsTags.Items.ROD_TIN, EOItems.TIN_DUST);
        registerDeconstructionRecipes(map, "titanium", EOPlates.Items.TITANIUM_PLATE, EOMetalRodsTags.Items.ROD_TITANIUM, EOItems.TITANIUM_DUST);
        registerDeconstructionRecipes(map, "ultimatitanium", EOPlates.Items.ULTIMATITANIUM_PLATE, EOMetalRodsTags.Items.ROD_ULTIMATITANIUM, EOItems.ULTIMATITANIUM_DUST);
        registerDeconstructionRecipes(map, "uranium", EOPlates.Items.URANIUM_PLATE, EOMetalRodsTags.Items.ROD_URANIUM, EOItems.URANIUM_DUST);
        registerDeconstructionRecipes(map, "voiderite", EOPlates.Items.VOIDERITE_PLATE, EOGemRodsTags.Items.ROD_VOIDERITE, EOItems.VOIDERITE_DUST);
        registerDeconstructionRecipes(map, "wrought_iron", EOPlates.Items.WROUGHT_IRON_PLATE, EOMetalRodsTags.Items.ROD_WROUGHT_IRON, EOItems.WROUGHT_IRON_DUST);
        registerDeconstructionRecipes(map, "zinc", EOPlates.Items.ZINC_PLATE, EOMetalRodsTags.Items.ROD_ZINC, EOItems.ZINC_DUST);

        DECO_DUST_ENTRIES = Map.copyOf(map);
    }
}
