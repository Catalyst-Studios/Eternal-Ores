package net.radzratz.eternalores.util.compat.oritech.recipe_types.pulverizer.entries;

import net.radzratz.eternalores.item.EOItems;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.enums.EOPulverizerOreBlockToMaterialType;
import net.radzratz.eternalores.util.tags.item.ores.EOOreBlockItemTags;

import java.util.HashMap;
import java.util.Map;

import static net.radzratz.eternalores.util.compat.oritech.recipe_types.pulverizer.EOPulverizerInputRegistry.registerOreBlocksToRawRecipes;

public class EOPulverizerOreBlockFormEntries
{
    /// Material Ore Block -> Raw Material
    public static final Map<String, EOPulverizerOreBlockToMaterialType.InputsOreBlock> ORE_BLOCK_FORM_RAW;
    static
    {
        Map<String, EOPulverizerOreBlockToMaterialType.InputsOreBlock> map = new HashMap<>();

        registerOreBlocksToRawRecipes(map, "aluminum", EOOreBlockItemTags.Items.ITEM_ALUMINUM_ORE_OW, EOItems.RAW_ALUMINUM);
        registerOreBlocksToRawRecipes(map, "amber", EOOreBlockItemTags.Items.ITEM_AMBER_ORE_OW, EOItems.GEM_AMBER);
        registerOreBlocksToRawRecipes(map, "apatite", EOOreBlockItemTags.Items.ITEM_APATITE_ORE_OW, EOItems.GEM_APATITE);
        registerOreBlocksToRawRecipes(map, "cinnabar", EOOreBlockItemTags.Items.ITEM_CINNABAR_ORE_OW, EOItems.GEM_CINNABAR);
        registerOreBlocksToRawRecipes(map, "cobalt", EOOreBlockItemTags.Items.ITEM_COBALT_ORE_OW, EOItems.RAW_COBALT);
        registerOreBlocksToRawRecipes(map, "fluorite", EOOreBlockItemTags.Items.ITEM_FLUORITE_ORE_OW, EOItems.FLUORITE);
        registerOreBlocksToRawRecipes(map, "gallium", EOOreBlockItemTags.Items.ITEM_GALLIUM_ORE_OW, EOItems.RAW_GALLIUM);
        registerOreBlocksToRawRecipes(map, "iridium", EOOreBlockItemTags.Items.ITEM_IRIDIUM_ORE_OW, EOItems.RAW_IRIDIUM);
        registerOreBlocksToRawRecipes(map, "lead", EOOreBlockItemTags.Items.ITEM_LEAD_ORE_OW, EOItems.RAW_LEAD);
        registerOreBlocksToRawRecipes(map, "niter", EOOreBlockItemTags.Items.ITEM_NITER_ORE_OW, EOItems.GEM_NITER);
        registerOreBlocksToRawRecipes(map, "onyx", EOOreBlockItemTags.Items.ITEM_ONYX_ORE_OW, EOItems.GEM_ONYX);
        registerOreBlocksToRawRecipes(map, "osmium", EOOreBlockItemTags.Items.ITEM_OSMIUM_ORE_OW, EOItems.RAW_OSMIUM);
        registerOreBlocksToRawRecipes(map, "peridot", EOOreBlockItemTags.Items.ITEM_PERIDOT_ORE_OW, EOItems.GEM_SAPPHIRE);
        registerOreBlocksToRawRecipes(map, "ruby", EOOreBlockItemTags.Items.ITEM_RUBY_ORE_OW, EOItems.GEM_SAPPHIRE);
        registerOreBlocksToRawRecipes(map, "sapphire", EOOreBlockItemTags.Items.ITEM_SAPPHIRE_ORE_OW, EOItems.GEM_SAPPHIRE);
        registerOreBlocksToRawRecipes(map, "silver", EOOreBlockItemTags.Items.ITEM_SILVER_ORE_OW, EOItems.RAW_SILVER);
        registerOreBlocksToRawRecipes(map, "sulfur", EOOreBlockItemTags.Items.ITEM_SULFUR_ORE_OW, EOItems.SULFUR);
        registerOreBlocksToRawRecipes(map, "tin", EOOreBlockItemTags.Items.ITEM_TIN_ORE_OW, EOItems.RAW_TIN);
        registerOreBlocksToRawRecipes(map, "uraninite", EOOreBlockItemTags.Items.ITEM_URANINITE_ORE_OW, EOItems.RAW_URANINITE);
        registerOreBlocksToRawRecipes(map, "uranium", EOOreBlockItemTags.Items.ITEM_URANIUM_ORE_OW, EOItems.RAW_URANIUM);
        registerOreBlocksToRawRecipes(map, "zinc", EOOreBlockItemTags.Items.ITEM_ZINC_ORE_OW, EOItems.RAW_ZINC);

        registerOreBlocksToRawRecipes(map, "ardite", EOOreBlockItemTags.Items.ITEM_ARDITE_ORE_NETHER, EOItems.RAW_ARDITE);
        registerOreBlocksToRawRecipes(map, "necroticarite", EOOreBlockItemTags.Items.ITEM_NECROTICARITE_ORE_NETHER, EOItems.GEM_NECROTICARITE);
        registerOreBlocksToRawRecipes(map, "obsidian", EOOreBlockItemTags.Items.ITEM_OBSIDIAN_ORE_NETHER, EOItems.GEM_OBSIDIAN_SHARD);

        ORE_BLOCK_FORM_RAW = Map.copyOf(map);
    }
}
