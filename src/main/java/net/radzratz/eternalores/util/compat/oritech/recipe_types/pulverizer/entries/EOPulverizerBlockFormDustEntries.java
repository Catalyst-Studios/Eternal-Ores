package net.radzratz.eternalores.util.compat.oritech.recipe_types.pulverizer.entries;

import net.radzratz.eternalores.util.compat.oritech.recipe_types.enums.pulverizer.EOPulverizerDustConversionType;

import java.util.HashMap;
import java.util.Map;

import static net.neoforged.neoforge.common.Tags.Items.*;
import static net.radzratz.eternalores.item.EOItemRegistry.*;
import static net.radzratz.eternalores.util.compat.oritech.recipe_types.pulverizer.EOPulverizerInputRegistry.registerBlocksToDustRecipes;
import static net.radzratz.eternalores.util.tags.item.storage_blocks.EOStorageGemBlockItemTags.Items.*;
import static net.radzratz.eternalores.util.tags.item.storage_blocks.EOStorageMetalBlockItemTags.Items.*;
import static net.radzratz.eternalores.util.tags.item.storage_blocks.EOStorageRawOreBlockItemTags.Items.*;

public class EOPulverizerBlockFormDustEntries
{
    /// Material Block -> Dust
    public static final Map<String, EOPulverizerDustConversionType.InputsBlock> BLOCK_FORM_DUST;
    static
    {
        Map<String, EOPulverizerDustConversionType.InputsBlock> map = new HashMap<>();

        registerBlocksToDustRecipes(map, "aluminum", ALUMINUM_BLOCK_ST_ITEM, ALUMINUM_DUST);

        registerBlocksToDustRecipes(map, "ardite", ARDITE_BLOCK_ST_ITEM, ARDITE_DUST);

        registerBlocksToDustRecipes(map, "blue_steel", BLUE_STEEL_BLOCK_ST_ITEM, BLUE_STEEL_DUST);

        registerBlocksToDustRecipes(map, "brass", BRASS_BLOCK_ST_ITEM, BRASS_DUST);

        registerBlocksToDustRecipes(map, "britannia_silver", BRITANNIA_BLOCK_ST_ITEM, BRITANNIA_SILVER_DUST);

        registerBlocksToDustRecipes(map, "bronze", BRONZE_BLOCK_ST_ITEM, BRONZE_DUST);

        registerBlocksToDustRecipes(map, "catalyrium", CATALYRIUM_BLOCK_ST_ITEM, CATALYRIUM_DUST);

        registerBlocksToDustRecipes(map, "cast_iron", CAST_IRON_BLOCK_ST_ITEM, CAST_IRON_DUST);

        registerBlocksToDustRecipes(map, "cast_steel", CAST_STEEL_BLOCK_ST_ITEM, CAST_STEEL_DUST);

        registerBlocksToDustRecipes(map, "cobalt", COBALT_BLOCK_ST_ITEM, COBALT_DUST);

        registerBlocksToDustRecipes(map, "constantan", CONSTANTAN_BLOCK_ST_ITEM, CONSTANTAN_DUST);

        registerBlocksToDustRecipes(map, "copper", STORAGE_BLOCKS_COPPER, COPPER_DUST);

        registerBlocksToDustRecipes(map, "electrum", ELECTRUM_BLOCK_ST_ITEM, ELECTRUM_DUST);

        registerBlocksToDustRecipes(map, "enderium", ENDERIUM_BLOCK_ST_ITEM, ENDERIUM_DUST);

        registerBlocksToDustRecipes(map, "gallium", GALLIUM_BLOCK_ST_ITEM, GALLIUM_DUST);

        registerBlocksToDustRecipes(map, "gold", STORAGE_BLOCKS_GOLD, GOLD_DUST);

        registerBlocksToDustRecipes(map, "invar", INVAR_BLOCK_ST_ITEM, INVAR_DUST);

        registerBlocksToDustRecipes(map, "iron", STORAGE_BLOCKS_IRON, IRON_DUST);

        registerBlocksToDustRecipes(map, "lead", LEAD_BLOCK_ST_ITEM, LEAD_DUST);

        registerBlocksToDustRecipes(map, "lumium", LUMIUM_BLOCK_ST_ITEM, LUMIUM_DUST);

        registerBlocksToDustRecipes(map, "netherite", STORAGE_BLOCKS_NETHERITE, NETHERITE_DUST);

        registerBlocksToDustRecipes(map, "nethersteel", NETHERSTEEL_BLOCK_ST_ITEM, NETHERSTEEL_DUST);

        registerBlocksToDustRecipes(map, "nickel", NICKEL_BLOCK_ST_ITEM, NICKEL_DUST);

        registerBlocksToDustRecipes(map, "osmium", OSMIUM_BLOCK_ST_ITEM, OSMIUM_DUST);

        registerBlocksToDustRecipes(map, "pewter", PEWTER_BLOCK_ST_ITEM, PEWTER_DUST);

        registerBlocksToDustRecipes(map, "pig_iron", PIG_IRON_BLOCK_ST_ITEM, PIG_IRON_DUST);

        registerBlocksToDustRecipes(map, "platinum", PLATINUM_BLOCK_ST_ITEM, PLATINUM_DUST);

        registerBlocksToDustRecipes(map, "rose_gold", ROSE_GOLD_BLOCK_ST_ITEM, ROSE_GOLD_DUST);

        registerBlocksToDustRecipes(map, "signalum", SIGNALUM_BLOCK_ST_ITEM, SIGNALUM_DUST);

        registerBlocksToDustRecipes(map, "silver", SILVER_BLOCK_ST_ITEM, SILVER_DUST);

        registerBlocksToDustRecipes(map, "shadowsteel", SHADOWSTEEL_BLOCK_ST_ITEM, SHADOWSTEEL_DUST);

        registerBlocksToDustRecipes(map, "steel", STEEL_BLOCK_ST_ITEM, STEEL_DUST);

        registerBlocksToDustRecipes(map, "tin", TIN_BLOCK_ST_ITEM, TIN_DUST);

        registerBlocksToDustRecipes(map, "titanium", TITANIUM_BLOCK_ST_ITEM, TITANIUM_DUST);

        registerBlocksToDustRecipes(map, "uraninite", URANINITE_BLOCK_ST_ITEM, URANINITE_DUST);

        registerBlocksToDustRecipes(map, "uranium", URANIUM_BLOCK_ST_ITEM, URANIUM_DUST);

        registerBlocksToDustRecipes(map, "wrought_iron", WROUGHT_IRON_BLOCK_ST_ITEM, WROUGHT_IRON_DUST);

        registerBlocksToDustRecipes(map, "zinc", ZINC_BLOCK_ST_ITEM, ZINC_DUST);

        registerBlocksToDustRecipes(map, "amber", AMBER_BLOCK_ST_ITEM, AMBER_DUST);

        registerBlocksToDustRecipes(map, "apatite", APATITE_BLOCK_ST_ITEM, APATITE_DUST);

        registerBlocksToDustRecipes(map, "cinnabar", CINNABAR_BLOCK_ST_ITEM, CINNABAR_DUST);

        registerBlocksToDustRecipes(map, "coal", STORAGE_BLOCKS_COAL, COAL_DUST);

        registerBlocksToDustRecipes(map, "diamond", STORAGE_BLOCKS_DIAMOND, DIAMOND_DUST);

        registerBlocksToDustRecipes(map, "emerald", STORAGE_BLOCKS_EMERALD, EMERALD_DUST);

        registerBlocksToDustRecipes(map, "fluorite", FLUORITE_BLOCK_ST_ITEM, FLUORITE_DUST);

        registerBlocksToDustRecipes(map, "lapis", STORAGE_BLOCKS_LAPIS, LAPIS_LAZULI_DUST);

        registerBlocksToDustRecipes(map, "necroticarite", NECROTICARITE_BLOCK_ST_ITEM, NECROTICARITE_DUST);

        registerBlocksToDustRecipes(map, "niter", NITER_BLOCK_ST_ITEM, NITER_DUST);

        registerBlocksToDustRecipes(map, "obsidian", OBSIDIANS, OBSIDIAN_DUST);

        registerBlocksToDustRecipes(map, "onyx", ONYX_BLOCK_ST_ITEM, ONYX_DUST);

        registerBlocksToDustRecipes(map, "peridot", PERIDOT_BLOCK_ST_ITEM, PERIDOT_DUST);

        registerBlocksToDustRecipes(map, "ruby", RUBY_BLOCK_ST_ITEM, RUBY_DUST);

        registerBlocksToDustRecipes(map, "sapphire", SAPPHIRE_BLOCK_ST_ITEM, SAPPHIRE_DUST);

        registerBlocksToDustRecipes(map, "sulfur", SULFUR_ST_ITEM, SULFUR_DUST);

        BLOCK_FORM_DUST = Map.copyOf(map);
    }
}
