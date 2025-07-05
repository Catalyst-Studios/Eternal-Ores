package net.radzratz.eternalores.util.compat.oritech.recipe_types.pulverizer.entries;

import net.neoforged.neoforge.common.Tags;
import net.radzratz.eternalores.item.EOItems;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.enums.EOPulverizerOreFormToDustType;
import net.radzratz.eternalores.util.tags.item.storage_blocks.EOStorageGemBlockItemTags;
import net.radzratz.eternalores.util.tags.item.storage_blocks.EOStorageMetalBlockItemTags;
import net.radzratz.eternalores.util.tags.item.storage_blocks.EOStorageRawOreBlockItemTags;

import java.util.HashMap;
import java.util.Map;

import static net.radzratz.eternalores.util.compat.oritech.recipe_types.pulverizer.EOPulverizerInputRegistry.registerBlocksToDustRecipes;

public class EOPulverizerBlockFormDustEntries
{
    /// Material Block -> Dust
    public static final Map<String, EOPulverizerOreFormToDustType.InputsBlock> BLOCK_FORM_DUST;
    static
    {
        Map<String, EOPulverizerOreFormToDustType.InputsBlock> map = new HashMap<>();

        registerBlocksToDustRecipes(map, "aluminum", EOStorageMetalBlockItemTags.Items.ALUMINUM_BLOCK_ST_ITEM, EOItems.ALUMINUM_DUST);
        registerBlocksToDustRecipes(map, "ardite", EOStorageMetalBlockItemTags.Items.ARDITE_BLOCK_ST_ITEM, EOItems.ARDITE_DUST);
        registerBlocksToDustRecipes(map, "blue_steel", EOStorageMetalBlockItemTags.Items.BLUE_STEEL_BLOCK_ST_ITEM, EOItems.BLUE_STEEL_DUST);
        registerBlocksToDustRecipes(map, "brass", EOStorageMetalBlockItemTags.Items.BRASS_BLOCK_ST_ITEM, EOItems.BRASS_DUST);
        registerBlocksToDustRecipes(map, "britannia_silver", EOStorageMetalBlockItemTags.Items.BRITANNIA_BLOCK_ST_ITEM, EOItems.BRITANNIA_SILVER_DUST);
        registerBlocksToDustRecipes(map, "bronze", EOStorageMetalBlockItemTags.Items.BRONZE_BLOCK_ST_ITEM, EOItems.BRONZE_DUST);
        registerBlocksToDustRecipes(map, "catalyrium", EOStorageMetalBlockItemTags.Items.CATALYRIUM_BLOCK_ST_ITEM, EOItems.CATALYRIUM_DUST);
        registerBlocksToDustRecipes(map, "cast_iron", EOStorageMetalBlockItemTags.Items.CAST_IRON_BLOCK_ST_ITEM, EOItems.CAST_IRON_DUST);
        registerBlocksToDustRecipes(map, "cast_steel", EOStorageMetalBlockItemTags.Items.CAST_STEEL_BLOCK_ST_ITEM, EOItems.CAST_STEEL_DUST);
        registerBlocksToDustRecipes(map, "cobalt", EOStorageMetalBlockItemTags.Items.COBALT_BLOCK_ST_ITEM, EOItems.COBALT_DUST);
        registerBlocksToDustRecipes(map, "constantan", EOStorageMetalBlockItemTags.Items.CONSTANTAN_BLOCK_ST_ITEM, EOItems.CONSTANTAN_DUST);
        registerBlocksToDustRecipes(map, "copper", Tags.Items.STORAGE_BLOCKS_COPPER, EOItems.COPPER_DUST);
        registerBlocksToDustRecipes(map, "electrum", EOStorageMetalBlockItemTags.Items.ELECTRUM_BLOCK_ST_ITEM, EOItems.ELECTRUM_DUST);
        registerBlocksToDustRecipes(map, "enderium", EOStorageMetalBlockItemTags.Items.ENDERIUM_BLOCK_ST_ITEM, EOItems.ENDERIUM_DUST);
        registerBlocksToDustRecipes(map, "gallium", EOStorageMetalBlockItemTags.Items.GALLIUM_BLOCK_ST_ITEM, EOItems.GALLIUM_DUST);
        registerBlocksToDustRecipes(map, "gold", Tags.Items.STORAGE_BLOCKS_GOLD, EOItems.GOLD_DUST);
        registerBlocksToDustRecipes(map, "invar", EOStorageMetalBlockItemTags.Items.INVAR_BLOCK_ST_ITEM, EOItems.INVAR_DUST);
        registerBlocksToDustRecipes(map, "iron", Tags.Items.STORAGE_BLOCKS_IRON, EOItems.IRON_DUST);
        registerBlocksToDustRecipes(map, "lead", EOStorageMetalBlockItemTags.Items.LEAD_BLOCK_ST_ITEM, EOItems.LEAD_DUST);
        registerBlocksToDustRecipes(map, "lumium", EOStorageMetalBlockItemTags.Items.LUMIUM_BLOCK_ST_ITEM, EOItems.LUMIUM_DUST);
        registerBlocksToDustRecipes(map, "netherite", Tags.Items.STORAGE_BLOCKS_NETHERITE, EOItems.NETHERITE_DUST);
        registerBlocksToDustRecipes(map, "nethersteel", EOStorageMetalBlockItemTags.Items.NETHERSTEEL_BLOCK_ST_ITEM, EOItems.NETHERSTEEL_DUST);
        registerBlocksToDustRecipes(map, "nickel", EOStorageMetalBlockItemTags.Items.NICKEL_BLOCK_ST_ITEM, EOItems.NICKEL_DUST);
        registerBlocksToDustRecipes(map, "osmium", EOStorageMetalBlockItemTags.Items.OSMIUM_BLOCK_ST_ITEM, EOItems.OSMIUM_DUST);
        registerBlocksToDustRecipes(map, "pewter", EOStorageMetalBlockItemTags.Items.PEWTER_BLOCK_ST_ITEM, EOItems.PEWTER_DUST);
        registerBlocksToDustRecipes(map, "pig_iron", EOStorageMetalBlockItemTags.Items.PIG_IRON_BLOCK_ST_ITEM, EOItems.PIG_IRON_DUST);
        registerBlocksToDustRecipes(map, "platinum", EOStorageMetalBlockItemTags.Items.PLATINUM_BLOCK_ST_ITEM, EOItems.PIG_IRON_DUST);
        registerBlocksToDustRecipes(map, "rose_gold", EOStorageMetalBlockItemTags.Items.ROSE_GOLD_BLOCK_ST_ITEM, EOItems.ROSE_GOLD_DUST);
        registerBlocksToDustRecipes(map, "signalum", EOStorageMetalBlockItemTags.Items.SIGNALUM_BLOCK_ST_ITEM, EOItems.SIGNALUM_DUST);
        registerBlocksToDustRecipes(map, "silver", EOStorageMetalBlockItemTags.Items.SILVER_BLOCK_ST_ITEM, EOItems.SILVER_DUST);
        registerBlocksToDustRecipes(map, "shadowsteel", EOStorageMetalBlockItemTags.Items.SHADOWSTEEL_BLOCK_ST_ITEM, EOItems.SHADOWSTEEL_DUST);
        registerBlocksToDustRecipes(map, "steel", EOStorageMetalBlockItemTags.Items.STEEL_BLOCK_ST_ITEM, EOItems.STEEL_DUST);
        registerBlocksToDustRecipes(map, "tin", EOStorageMetalBlockItemTags.Items.TIN_BLOCK_ST_ITEM, EOItems.TIN_DUST);
        registerBlocksToDustRecipes(map, "titanium", EOStorageMetalBlockItemTags.Items.TITANIUM_BLOCK_ST_ITEM, EOItems.TITANIUM_DUST);
        registerBlocksToDustRecipes(map, "uraninite", EOStorageMetalBlockItemTags.Items.URANINITE_BLOCK_ST_ITEM, EOItems.URANINITE_DUST);
        registerBlocksToDustRecipes(map, "uranium", EOStorageMetalBlockItemTags.Items.URANIUM_BLOCK_ST_ITEM, EOItems.URANIUM_DUST);
        registerBlocksToDustRecipes(map, "wrought_iron", EOStorageMetalBlockItemTags.Items.WROUGHT_IRON_BLOCK_ST_ITEM, EOItems.WROUGHT_IRON_DUST);
        registerBlocksToDustRecipes(map, "zinc", EOStorageMetalBlockItemTags.Items.ALUMINUM_BLOCK_ST_ITEM, EOItems.ZINC_DUST);

        registerBlocksToDustRecipes(map, "amber", EOStorageGemBlockItemTags.Items.AMBER_BLOCK_ST_ITEM, EOItems.AMBER_DUST);
        registerBlocksToDustRecipes(map, "apatite", EOStorageGemBlockItemTags.Items.APATITE_BLOCK_ST_ITEM, EOItems.APATITE_DUST);
        registerBlocksToDustRecipes(map, "cinnabar", EOStorageGemBlockItemTags.Items.CINNABAR_BLOCK_ST_ITEM, EOItems.CINNABAR_DUST);
        registerBlocksToDustRecipes(map, "coal", Tags.Items.STORAGE_BLOCKS_COAL, EOItems.COAL_DUST);
        registerBlocksToDustRecipes(map, "diamond", Tags.Items.STORAGE_BLOCKS_DIAMOND, EOItems.DIAMOND_DUST);
        registerBlocksToDustRecipes(map, "emerald", Tags.Items.STORAGE_BLOCKS_EMERALD, EOItems.EMERALD_DUST);
        registerBlocksToDustRecipes(map, "fluorite", EOStorageGemBlockItemTags.Items.FLUORITE_BLOCK_ST_ITEM, EOItems.FLUORITE_DUST);
        registerBlocksToDustRecipes(map, "lapis", Tags.Items.STORAGE_BLOCKS_LAPIS, EOItems.LAPIS_LAZULI_DUST);
        registerBlocksToDustRecipes(map, "necroticarite", EOStorageGemBlockItemTags.Items.NECROTICARITE_BLOCK_ST_ITEM, EOItems.NECROTICARITE_DUST);
        registerBlocksToDustRecipes(map, "niter", EOStorageGemBlockItemTags.Items.NITER_BLOCK_ST_ITEM, EOItems.NITER_DUST);
        registerBlocksToDustRecipes(map, "obsidian", Tags.Items.OBSIDIANS, EOItems.OBSIDIAN_DUST);
        registerBlocksToDustRecipes(map, "onyx", EOStorageGemBlockItemTags.Items.ONYX_BLOCK_ST_ITEM, EOItems.ONYX_DUST);
        registerBlocksToDustRecipes(map, "peridot", EOStorageGemBlockItemTags.Items.PERIDOT_BLOCK_ST_ITEM, EOItems.PERIDOT_DUST);
        registerBlocksToDustRecipes(map, "ruby", EOStorageGemBlockItemTags.Items.RUBY_BLOCK_ST_ITEM, EOItems.RUBY_DUST);
        registerBlocksToDustRecipes(map, "sapphire", EOStorageGemBlockItemTags.Items.SAPPHIRE_BLOCK_ST_ITEM, EOItems.SAPPHIRE_DUST);
        registerBlocksToDustRecipes(map, "sulfur", EOStorageRawOreBlockItemTags.Items.SULFUR_ST_ITEM, EOItems.SULFUR_DUST);

        BLOCK_FORM_DUST = Map.copyOf(map);
    }
}
