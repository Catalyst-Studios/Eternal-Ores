package net.radzratz.eternalores.util.compat.oritech.recipe_types.foundry.entries;

import net.neoforged.neoforge.common.Tags;
import net.radzratz.eternalores.item.EOItems;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.enums.EOFoundryCreationType;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.enums.EOFoundryGemType;
import net.radzratz.eternalores.util.compat.oritech.tags.EOItemOritechTags;
import net.radzratz.eternalores.util.tags.item.dusts.EOMiscDustsTags;
import net.radzratz.eternalores.util.tags.item.ingots.EOIngotTags;

import java.util.HashMap;
import java.util.Map;

import static net.radzratz.eternalores.util.compat.oritech.recipe_types.foundry.EOFoundryInputRegistry.registerAlloyCreationRecipes;
import static net.radzratz.eternalores.util.compat.oritech.recipe_types.foundry.EOFoundryInputRegistry.registerGemToIngotRecipes;


public class EOFoundryMachineEntries
{
    public static final Map<String, EOFoundryCreationType.InputsAlloyDust> MATERIAL_TO_ALLOY;
    static
    {
        Map<String, EOFoundryCreationType.InputsAlloyDust> map = new HashMap<>();

        registerAlloyCreationRecipes(map, "brass",
                Tags.Items.INGOTS_COPPER,
                EOIngotTags.Items.ZINC_INGOT,
                EOItems.BRASS_INGOT);

        registerAlloyCreationRecipes(map, "britannia_silver",
                Tags.Items.INGOTS_COPPER,
                EOIngotTags.Items.SILVER_INGOT,
                EOItems.BRITANNIA_SILVER_INGOT);

        registerAlloyCreationRecipes(map, "bronze",
                Tags.Items.INGOTS_COPPER,
                EOIngotTags.Items.TIN_INGOT,
                EOItems.BRONZE_INGOT);

        registerAlloyCreationRecipes(map, "cast_iron",
                Tags.Items.INGOTS_IRON,
                EOMiscDustsTags.Items.CARBON_BLEND,
                EOItems.CAST_IRON_INGOT);

        registerAlloyCreationRecipes(map, "cast_steel",
                EOIngotTags.Items.STEEL_INGOT,
                EOMiscDustsTags.Items.CARBON_BLEND,
                EOItems.CAST_STEEL_INGOT);

        registerAlloyCreationRecipes(map, "constantan",
                EOIngotTags.Items.NICKEL_INGOT,
                Tags.Items.INGOTS_COPPER,
                EOItems.CONSTANTAN_INGOT);

        registerAlloyCreationRecipes(map, "electrum",
                EOIngotTags.Items.SILVER_INGOT,
                Tags.Items.INGOTS_GOLD,
                EOItems.ELECTRUM_INGOT);

        registerAlloyCreationRecipes(map, "enderium",
                EOIngotTags.Items.LEAD_INGOT,
                EOMiscDustsTags.Items.ENDERGETIC_BLEND,
                EOItems.ENDERIUM_INGOT);

        registerAlloyCreationRecipes(map, "lumium",
                EOIngotTags.Items.TIN_INGOT,
                EOMiscDustsTags.Items.ENERGETIC_BLEND,
                EOItems.LUMIUM_INGOT);

        registerAlloyCreationRecipes(map, "pewter",
                EOIngotTags.Items.TIN_INGOT,
                EOIngotTags.Items.SILVER_INGOT,
                EOItems.PEWTER_INGOT);

        registerAlloyCreationRecipes(map, "pig_iron",
                Tags.Items.RAW_MATERIALS_IRON,
                EOMiscDustsTags.Items.CARBON_BLEND,
                EOItems.PIG_IRON_INGOT);

        registerAlloyCreationRecipes(map, "signalum",
                Tags.Items.INGOTS_COPPER,
                EOMiscDustsTags.Items.ENERGETIC_BLEND,
                EOItems.SIGNALUM_INGOT);

        registerAlloyCreationRecipes(map, "steel",
                EOIngotTags.Items.WROUGHT_IRON_INGOT,
                EOMiscDustsTags.Items.CARBON_BLEND,
                EOItems.STEEL_INGOT);

        registerAlloyCreationRecipes(map, "wrought_iron",
                Tags.Items.INGOTS_IRON,
                Tags.Items.STORAGE_BLOCKS_COAL,
                EOItems.WROUGHT_IRON_INGOT);

        MATERIAL_TO_ALLOY = Map.copyOf(map);
    }

    public static final Map<String, EOFoundryGemType.InputsGemDust> GEM_TO_MATERIAL;
    static
    {
        Map<String, EOFoundryGemType.InputsGemDust> map = new HashMap<>();

        registerGemToIngotRecipes(map, "aluminum",
                EOItemOritechTags.Items.O_GEM_ALUMINUM_C,
                EOItemOritechTags.Items.O_GEM_ALUMINUM_C,
                EOItems.ALUMINUM_INGOT);

        registerGemToIngotRecipes(map, "ardite",
                EOItemOritechTags.Items.O_GEM_ARDITE_C,
                EOItemOritechTags.Items.O_GEM_ARDITE_C,
                EOItems.ARDITE_INGOT);

        registerGemToIngotRecipes(map, "catalyrium",
                EOItemOritechTags.Items.O_GEM_CATALYRIUM_C,
                EOItemOritechTags.Items.O_GEM_CATALYRIUM_C,
                EOItems.CATALYRIUM_INGOT);

        registerGemToIngotRecipes(map, "cobalt",
                EOItemOritechTags.Items.O_GEM_COBALT_C,
                EOItemOritechTags.Items.O_GEM_COBALT_C,
                EOItems.COBALT_INGOT);

        registerGemToIngotRecipes(map, "gallium",
                EOItemOritechTags.Items.O_GEM_GALLIUM_C,
                EOItemOritechTags.Items.O_GEM_GALLIUM_C,
                EOItems.GALLIUM_INGOT);

        registerGemToIngotRecipes(map, "iridium",
                EOItemOritechTags.Items.O_GEM_IRIDIUM_C,
                EOItemOritechTags.Items.O_GEM_IRIDIUM_C,
                EOItems.IRIDIUM_INGOT);

        registerGemToIngotRecipes(map, "lead",
                EOItemOritechTags.Items.O_GEM_LEAD_C,
                EOItemOritechTags.Items.O_GEM_LEAD_C,
                EOItems.LEAD_INGOT);

        registerGemToIngotRecipes(map, "osmium",
                EOItemOritechTags.Items.O_GEM_OSMIUM_C,
                EOItemOritechTags.Items.O_GEM_OSMIUM_C,
                EOItems.OSMIUM_INGOT);

        registerGemToIngotRecipes(map, "silver",
                EOItemOritechTags.Items.O_GEM_SILVER_C,
                EOItemOritechTags.Items.O_GEM_SILVER_C,
                EOItems.SILVER_INGOT);

        registerGemToIngotRecipes(map, "tin",
                EOItemOritechTags.Items.O_GEM_TIN_C,
                EOItemOritechTags.Items.O_GEM_TIN_C,
                EOItems.TIN_INGOT);

        registerGemToIngotRecipes(map, "tungsten",
                EOItemOritechTags.Items.O_GEM_TUNGSTEN_C,
                EOItemOritechTags.Items.O_GEM_TUNGSTEN_C,
                EOItems.TUNGSTEN_INGOT);

        registerGemToIngotRecipes(map, "uraninite",
                EOItemOritechTags.Items.O_GEM_URANINITE_C,
                EOItemOritechTags.Items.O_GEM_URANINITE_C,
                EOItems.URANINITE_INGOT);

        registerGemToIngotRecipes(map, "uranium",
                EOItemOritechTags.Items.O_GEM_URANIUM_C,
                EOItemOritechTags.Items.O_GEM_URANIUM_C,
                EOItems.URANIUM_INGOT);

        registerGemToIngotRecipes(map, "zinc",
                EOItemOritechTags.Items.O_GEM_ZINC_C,
                EOItemOritechTags.Items.O_GEM_ZINC_C,
                EOItems.ZINC_INGOT);

        GEM_TO_MATERIAL = Map.copyOf(map);
    }
}
