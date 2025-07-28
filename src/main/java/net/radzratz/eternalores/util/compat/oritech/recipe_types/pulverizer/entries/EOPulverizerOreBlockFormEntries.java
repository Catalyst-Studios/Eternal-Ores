package net.radzratz.eternalores.util.compat.oritech.recipe_types.pulverizer.entries;


import net.radzratz.eternalores.util.compat.oritech.recipe_types.enums.pulverizer.EOPulverizerDustConversionType;

import java.util.HashMap;
import java.util.Map;

import static net.radzratz.eternalores.item.EOItemRegistry.*;
import static net.radzratz.eternalores.util.compat.oritech.recipe_types.pulverizer.EOPulverizerInputRegistry.*;
import static net.radzratz.eternalores.util.tags.item.ores.EOOreBlockItemTags.Items.*;

public class EOPulverizerOreBlockFormEntries
{
    /// Material Ore Block -> Raw Material
    public static final Map<String, EOPulverizerDustConversionType.InputsOreBlock> ORE_BLOCK_FORM_RAW;
    static
    {
        Map<String, EOPulverizerDustConversionType.InputsOreBlock> map = new HashMap<>();

        registerOreBlocksToRawRecipes(map, "aluminum", ITEM_ALUMINUM_ORE_OW, RAW_ALUMINUM);

        registerOreBlocksToRawRecipesVar1(map, "amber", ITEM_AMBER_ORE_OW, GEM_AMBER);

        registerOreBlocksToRawRecipesVar1(map, "apatite", ITEM_APATITE_ORE_OW, GEM_APATITE);

        registerOreBlocksToRawRecipesVar1(map, "cinnabar", ITEM_CINNABAR_ORE_OW, GEM_CINNABAR);

        registerOreBlocksToRawRecipes(map, "cobalt", ITEM_COBALT_ORE_OW, RAW_COBALT);

        registerOreBlocksToRawRecipesVar1(map, "fluorite", ITEM_FLUORITE_ORE_OW, FLUORITE);

        registerOreBlocksToRawRecipes(map, "gallium", ITEM_GALLIUM_ORE_OW, RAW_GALLIUM);

        registerOreBlocksToRawRecipes(map, "iridium", ITEM_IRIDIUM_ORE_OW, RAW_IRIDIUM);

        registerOreBlocksToRawRecipes(map, "lead", ITEM_LEAD_ORE_OW, RAW_LEAD);

        registerOreBlocksToRawRecipesVar1(map, "niter", ITEM_NITER_ORE_OW, GEM_NITER);

        registerOreBlocksToRawRecipesVar1(map, "onyx", ITEM_ONYX_ORE_OW, GEM_ONYX);

        registerOreBlocksToRawRecipes(map, "osmium", ITEM_OSMIUM_ORE_OW, RAW_OSMIUM);

        registerOreBlocksToRawRecipesVar1(map, "peridot", ITEM_PERIDOT_ORE_OW, GEM_PERIDOT);

        registerOreBlocksToRawRecipesVar1(map, "ruby", ITEM_RUBY_ORE_OW, GEM_RUBY);

        registerOreBlocksToRawRecipesVar1(map, "sapphire", ITEM_SAPPHIRE_ORE_OW, GEM_SAPPHIRE);

        registerOreBlocksToRawRecipes(map, "silver", ITEM_SILVER_ORE_OW, RAW_SILVER);

        registerOreBlocksToRawRecipes(map, "sulfur", ITEM_SULFUR_ORE_OW, SULFUR);

        registerOreBlocksToRawRecipes(map, "tin", ITEM_TIN_ORE_OW, RAW_TIN);

        registerOreBlocksToRawRecipes(map, "tungsten", ITEM_TUNGSTEN_ORE_OW, RAW_TUNGSTEN);

        registerOreBlocksToRawRecipes(map, "uraninite", ITEM_URANINITE_ORE_OW, RAW_URANINITE);

        registerOreBlocksToRawRecipes(map, "uranium", ITEM_URANIUM_ORE_OW, RAW_URANIUM);

        registerOreBlocksToRawRecipes(map, "zinc", ITEM_ZINC_ORE_OW, RAW_ZINC);

        registerOreBlocksToRawRecipes(map, "ardite", ITEM_ARDITE_ORE_NETHER, RAW_ARDITE);

        registerOreBlocksToRawRecipesVar1(map, "necroticarite", ITEM_NECROTICARITE_ORE_NETHER, GEM_NECROTICARITE);

        registerOreBlocksToRawRecipesVar1(map, "obsidian", ITEM_OBSIDIAN_ORE_NETHER, GEM_OBSIDIAN_SHARD);

        ORE_BLOCK_FORM_RAW = Map.copyOf(map);
    }
}
