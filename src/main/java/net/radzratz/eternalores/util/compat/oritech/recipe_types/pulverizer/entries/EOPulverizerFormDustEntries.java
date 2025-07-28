package net.radzratz.eternalores.util.compat.oritech.recipe_types.pulverizer.entries;

import net.radzratz.eternalores.util.compat.oritech.recipe_types.enums.pulverizer.EOPulverizerDustConversionType;

import java.util.HashMap;
import java.util.Map;

import static net.radzratz.eternalores.item.EOItemRegistry.*;
import static net.radzratz.eternalores.util.compat.oritech.recipe_types.pulverizer.EOPulverizerInputRegistry.registerDeconstructionRecipes;
import static net.radzratz.eternalores.util.tags.item.plates.EOPlates.Items.*;
import static net.radzratz.eternalores.util.tags.item.rods.EOGemRodsTags.Items.*;
import static net.radzratz.eternalores.util.tags.item.rods.EOMetalRodsTags.Items.*;
import static net.radzratz.eternalores.util.tags.item.rods.EOMiscRodsTags.Items.*;

public class EOPulverizerFormDustEntries
{
    /// Material Plate/Rod -> Dust
    public static final Map<String, EOPulverizerDustConversionType.InputsDeco> DECO_DUST_ENTRIES;
    static
    {
        Map<String, EOPulverizerDustConversionType.InputsDeco> map = new HashMap<>();

        registerDeconstructionRecipes(map, "aluminum", TAG_ALUMINUM_PLATE, TAG_ROD_ALUMINUM, ALUMINUM_DUST);

        registerDeconstructionRecipes(map, "ardite", TAG_ARDITE_PLATE, TAG_ROD_ARDITE, ARDITE_DUST);

        registerDeconstructionRecipes(map, "blue_steel", TAG_BLUE_STEEL_PLATE, TAG_ROD_BLUE_STEEL, BLUE_STEEL_DUST);

        registerDeconstructionRecipes(map, "brass", TAG_BRASS_PLATE, TAG_ROD_BRASS, BRASS_DUST);

        registerDeconstructionRecipes(map, "bronze", TAG_BRONZE_PLATE, TAG_ROD_BRONZE, BRONZE_DUST);

        registerDeconstructionRecipes(map, "catalyrium", TAG_CATALYRIUM_PLATE, TAG_ROD_CATALYRIUM, CATALYRIUM_DUST);

        registerDeconstructionRecipes(map, "cast_iron", TAG_CAST_IRON_PLATE, TAG_ROD_CAST_IRON, CAST_IRON_DUST);

        registerDeconstructionRecipes(map, "cast_steel", TAG_CAST_STEEL_PLATE, TAG_ROD_CAST_STEEL, CAST_STEEL_DUST);

        registerDeconstructionRecipes(map, "cobalt", TAG_COBALT_PLATE, TAG_ROD_COBALT, COBALT_DUST);

        registerDeconstructionRecipes(map, "constantan", TAG_CONSTANTAN_PLATE, TAG_ROD_CONSTANTAN, CONSTANTAN_DUST);

        registerDeconstructionRecipes(map, "copper", TAG_COPPER_PLATE, TAG_ROD_COPPER, COPPER_DUST);

        registerDeconstructionRecipes(map, "diamond", TAG_DIAMOND_PLATE, TAG_ROD_DIAMOND, DIAMOND_DUST);

        registerDeconstructionRecipes(map, "electrum", TAG_ELECTRUM_PLATE, TAG_ROD_ELECTRUM, ELECTRUM_DUST);

        registerDeconstructionRecipes(map, "gallium", TAG_GALLIUM_PLATE, TAG_ROD_GALLIUM, GALLIUM_DUST);

        registerDeconstructionRecipes(map, "gold", TAG_GOLD_PLATE, TAG_ROD_GOLD, GOLD_DUST);

        registerDeconstructionRecipes(map, "graphite", TAG_GRAPHITE_PLATE, TAG_ROD_GRAPHITE, GRAPHITE_DUST);

        registerDeconstructionRecipes(map, "invar", TAG_INVAR_PLATE, TAG_ROD_INVAR, INVAR_DUST);

        registerDeconstructionRecipes(map, "iridium", TAG_IRIDIUM_PLATE, TAG_ROD_IRIDIUM, IRIDIUM_DUST);

        registerDeconstructionRecipes(map, "iron", TAG_IRON_PLATE, TAG_ROD_IRON, IRON_DUST);

        registerDeconstructionRecipes(map, "lead", TAG_LEAD_PLATE, TAG_ROD_LEAD, LEAD_DUST);

        registerDeconstructionRecipes(map, "lumium", TAG_LUMIUM_PLATE, TAG_ROD_LUMIUM, LUMIUM_DUST);

        registerDeconstructionRecipes(map, "necroticarite", TAG_NECROTICARITE_PLATE, TAG_ROD_NECROTICARITE, NECROTICARITE_DUST);

        registerDeconstructionRecipes(map, "netherite", TAG_NETHERITE_PLATE, TAG_ROD_NETHERITE, NETHERITE_DUST);

        registerDeconstructionRecipes(map, "nethersteel", TAG_NETHERSTEEL_PLATE, TAG_ROD_NETHERSTEEL, NETHERSTEEL_DUST);

        registerDeconstructionRecipes(map, "nickel", TAG_NICKEL_PLATE, TAG_ROD_NICKEL, NICKEL_DUST);

        registerDeconstructionRecipes(map, "osmium", TAG_OSMIUM_PLATE, TAG_ROD_OSMIUM, OSMIUM_DUST);

        registerDeconstructionRecipes(map, "pig_iron", TAG_PIG_IRON_PLATE, TAG_ROD_PIG_IRON, PIG_IRON_DUST);

        registerDeconstructionRecipes(map, "platinum", TAG_PLATINUM_PLATE, TAG_ROD_PLATINUM, PLATINUM_DUST);

        registerDeconstructionRecipes(map, "plutonium", TAG_PLUTONIUM_PLATE, TAG_ROD_PLUTONIUM, PLUTONIUM_DUST);

        registerDeconstructionRecipes(map, "quantiquarite", TAG_QUANTIQUARITE_PLATE, TAG_ROD_QUANTIQUARITE, QUANTIQUARITE_DUST);

        registerDeconstructionRecipes(map, "rose_gold", TAG_ROSE_GOLD_PLATE, TAG_ROD_ROSE_GOLD, ROSE_GOLD_DUST);

        registerDeconstructionRecipes(map, "sapphire", TAG_SAPPHIRE_PLATE, TAG_ROD_SAPPHIRE, SAPPHIRE_DUST);

        registerDeconstructionRecipes(map, "shadowsteel", TAG_SHADOWSTEEL_PLATE, TAG_ROD_SHADOWSTEEL, SHADOWSTEEL_DUST);

        registerDeconstructionRecipes(map, "signalum", TAG_SIGNALUM_PLATE, TAG_ROD_SIGNALUM, SIGNALUM_DUST);

        registerDeconstructionRecipes(map, "silver", TAG_SILVER_PLATE, TAG_ROD_SILVER, SILVER_DUST);

        registerDeconstructionRecipes(map, "steel", TAG_STEEL_PLATE, TAG_ROD_STEEL, STEEL_DUST);

        registerDeconstructionRecipes(map, "tachyarite", TAG_TACHYARITE_PLATE, TAG_ROD_TACHYARITE, TACHYARITE_DUST);

        registerDeconstructionRecipes(map, "tin", TAG_TIN_PLATE, TAG_ROD_TIN, TIN_DUST);

        registerDeconstructionRecipes(map, "titanium", TAG_TITANIUM_PLATE, TAG_ROD_TITANIUM, TITANIUM_DUST);

        registerDeconstructionRecipes(map, "ultimatitanium", TAG_ULTIMATITANIUM_PLATE, TAG_ROD_ULTIMATITANIUM, ULTIMATITANIUM_DUST);

        registerDeconstructionRecipes(map, "uranium", TAG_URANIUM_PLATE, TAG_ROD_URANIUM, URANIUM_DUST);

        registerDeconstructionRecipes(map, "voiderite", TAG_VOIDERITE_PLATE, TAG_ROD_VOIDERITE, VOIDERITE_DUST);

        registerDeconstructionRecipes(map, "wrought_iron", TAG_WROUGHT_IRON_PLATE, TAG_ROD_WROUGHT_IRON, WROUGHT_IRON_DUST);

        registerDeconstructionRecipes(map, "zinc", TAG_ZINC_PLATE, TAG_ROD_ZINC, ZINC_DUST);

        DECO_DUST_ENTRIES = Map.copyOf(map);
    }
}
