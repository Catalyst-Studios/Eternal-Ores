package net.radzratz.eternalores.util.compat.oritech.recipe_types.foundry.entries;

import net.radzratz.eternalores.util.compat.oritech.recipe_types.enums.foundry.EOFoundryCreationType;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.enums.foundry.EOFoundryGemType;

import java.util.HashMap;
import java.util.Map;

import static net.neoforged.neoforge.common.Tags.Items.*;
import static net.radzratz.eternalores.item.EOItemRegistry.*;
import static net.radzratz.eternalores.util.compat.oritech.recipe_types.foundry.EOFoundryInputRegistry.*;
import static net.radzratz.eternalores.util.compat.oritech.tags.EOItemOritechTags.Items.*;
import static net.radzratz.eternalores.util.tags.item.dusts.EOMiscDustsTags.Items.*;
import static net.radzratz.eternalores.util.tags.item.ingots.EOIngotTags.Items.*;


public class EOFoundryMachineEntries
{
    public static final Map<String, EOFoundryCreationType.InputsAlloyDust> MATERIAL_TO_ALLOY;
    static
    {
        Map<String, EOFoundryCreationType.InputsAlloyDust> map = new HashMap<>();

        registerAlloyCreationRecipes(map, "brass", INGOTS_COPPER, TAG_ZINC_INGOT, BRASS_INGOT);

        registerAlloyCreationRecipes(map, "britannia_silver", INGOTS_COPPER, TAG_SILVER_INGOT, BRITANNIA_SILVER_INGOT);

        registerAlloyCreationRecipes(map, "bronze", INGOTS_COPPER, TAG_TIN_INGOT, BRONZE_INGOT);

        registerAlloyCreationRecipes(map, "cast_iron", INGOTS_IRON, TAG_CARBON_BLEND, CAST_IRON_INGOT);

        registerAlloyCreationRecipes(map, "cast_steel", TAG_STEEL_INGOT, TAG_CARBON_BLEND, CAST_STEEL_INGOT);

        registerAlloyCreationRecipes(map, "constantan", TAG_NICKEL_INGOT, INGOTS_COPPER, CONSTANTAN_INGOT);

        registerAlloyCreationRecipes(map, "electrum", TAG_SILVER_INGOT, INGOTS_GOLD, ELECTRUM_INGOT);

        registerAlloyCreationRecipes(map, "enderium", TAG_LEAD_INGOT, TAG_ENDERGETIC_BLEND, ENDERIUM_INGOT);

        registerAlloyCreationRecipes(map, "lumium", TAG_TIN_INGOT, TAG_ENERGETIC_BLEND, LUMIUM_INGOT);

        registerAlloyCreationRecipes(map, "pewter", TAG_TIN_INGOT, TAG_SILVER_INGOT, PEWTER_INGOT);

        registerAlloyCreationRecipes(map, "pig_iron", RAW_MATERIALS_IRON, TAG_CARBON_BLEND, PIG_IRON_INGOT);

        registerAlloyCreationRecipes(map, "signalum", INGOTS_COPPER, TAG_ENERGETIC_BLEND, SIGNALUM_INGOT);

        registerAlloyCreationRecipes(map, "steel", TAG_WROUGHT_IRON_INGOT, TAG_CARBON_BLEND, STEEL_INGOT);

        registerAlloyCreationRecipes(map, "wrought_iron", INGOTS_IRON, STORAGE_BLOCKS_COAL, WROUGHT_IRON_INGOT);

        MATERIAL_TO_ALLOY = Map.copyOf(map);
    }

    public static final Map<String, EOFoundryGemType.InputsGemDust> GEM_TO_MATERIAL;
    static
    {
        Map<String, EOFoundryGemType.InputsGemDust> map = new HashMap<>();

        registerGemToIngotRecipes(map, "aluminum", O_GEM_ALUMINUM_C, O_GEM_ALUMINUM_C, ALUMINUM_INGOT);

        registerGemToIngotRecipesVar(map, "ardite", O_GEM_ARDITE_C, O_GEM_ARDITE_C, ARDITE_DUST);

        registerGemToIngotRecipesVar(map, "catalyrium", O_GEM_CATALYRIUM_C, O_GEM_CATALYRIUM_C, CATALYRIUM_DUST);

        registerGemToIngotRecipes(map, "cobalt", O_GEM_COBALT_C, O_GEM_COBALT_C, COBALT_INGOT);

        registerGemToIngotRecipes(map, "gallium", O_GEM_GALLIUM_C, O_GEM_GALLIUM_C, GALLIUM_INGOT);

        registerGemToIngotRecipes(map, "iridium", O_GEM_IRIDIUM_C, O_GEM_IRIDIUM_C, IRIDIUM_INGOT);

        registerGemToIngotRecipes(map, "lead", O_GEM_LEAD_C, O_GEM_LEAD_C, LEAD_INGOT);

        registerGemToIngotRecipes(map, "osmium", O_GEM_OSMIUM_C, O_GEM_OSMIUM_C, OSMIUM_INGOT);

        registerGemToIngotRecipes(map, "silver", O_GEM_SILVER_C, O_GEM_SILVER_C, SILVER_INGOT);

        registerGemToIngotRecipes(map, "tin", O_GEM_TIN_C, O_GEM_TIN_C, TIN_INGOT);

        registerGemToIngotRecipes(map, "tungsten", O_GEM_TUNGSTEN_C, O_GEM_TUNGSTEN_C, TUNGSTEN_INGOT);

        registerGemToIngotRecipes(map, "uraninite", O_GEM_URANINITE_C, O_GEM_URANINITE_C, URANINITE_INGOT);

        registerGemToIngotRecipes(map, "uranium", O_GEM_URANIUM_C, O_GEM_URANIUM_C, URANIUM_INGOT);

        registerGemToIngotRecipes(map, "zinc", O_GEM_ZINC_C, O_GEM_ZINC_C, ZINC_INGOT);

        GEM_TO_MATERIAL = Map.copyOf(map);
    }
}
