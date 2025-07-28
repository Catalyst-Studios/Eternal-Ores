package net.radzratz.eternalores.util.compat.oritech.recipe_types.pulverizer.entries;

import net.radzratz.eternalores.util.compat.oritech.recipe_types.enums.pulverizer.EOPulverizerRawOreByproductType;

import java.util.HashMap;
import java.util.Map;

import static net.radzratz.eternalores.item.EOItemRegistry.*;
import static net.radzratz.eternalores.util.compat.oritech.items.EOritechItemRegistry.*;
import static net.radzratz.eternalores.util.compat.oritech.recipe_types.pulverizer.EOPulverizerInputRegistry.registerRawByproductRecipes;
import static net.radzratz.eternalores.util.tags.item.raw_materials.EORawMaterialTags.*;

public class EOPulverizerByProductEntries
{
    public static final Map<String, EOPulverizerRawOreByproductType.InputsByproduct> BYPRODUCT_FORM_DUST;
    static
    {
        Map<String, EOPulverizerRawOreByproductType.InputsByproduct> map = new HashMap<>();

        registerRawByproductRecipes(map, "aluminum", TAG_RAW_ALUMINIUM, ALUMINUM_DUST, O_ALUMINUM_SMALL_DUST);
        registerRawByproductRecipes(map, "aluminum", TAG_RAW_ALUMINUM, ALUMINUM_DUST, O_ALUMINUM_SMALL_DUST);

        registerRawByproductRecipes(map, "ardite", TAG_RAW_ARDITE, ARDITE_DUST, O_ARDITE_SMALL_DUST);

        registerRawByproductRecipes(map, "catalyrium", TAG_RAW_CATALYRIUM, CATALYRIUM_DUST, O_CATALYRIUM_SMALL_DUST);

        registerRawByproductRecipes(map, "cobalt", TAG_RAW_COBALT, COBALT_DUST, O_COBALT_SMALL_DUST);

        registerRawByproductRecipes(map, "gallium", TAG_RAW_GALLIUM, GALLIUM_DUST, O_GALLIUM_SMALL_DUST);

        registerRawByproductRecipes(map, "iridium", TAG_RAW_IRIDIUM, IRIDIUM_DUST, O_IRIDIUM_SMALL_DUST);

        registerRawByproductRecipes(map, "lead", TAG_RAW_LEAD, LEAD_DUST, O_LEAD_SMALL_DUST);

        registerRawByproductRecipes(map, "osmium", TAG_RAW_OSMIUM, OSMIUM_DUST, O_OSMIUM_SMALL_DUST);

        registerRawByproductRecipes(map, "silver", TAG_RAW_SILVER, SILVER_DUST, O_SILVER_SMALL_DUST);

        registerRawByproductRecipes(map, "tin", TAG_RAW_TIN, TIN_DUST, O_TIN_SMALL_DUST);

        registerRawByproductRecipes(map, "tungsten", TAG_RAW_TUNGSTEN, TUNGSTEN_DUST, O_TUNGSTEN_SMALL_DUST);

        registerRawByproductRecipes(map, "uraninite", TAG_RAW_URANINITE, URANINITE_DUST, O_URANINITE_SMALL_DUST);

        registerRawByproductRecipes(map, "uranium", TAG_RAW_URANIUM, URANIUM_DUST, O_URANIUM_SMALL_DUST);

        registerRawByproductRecipes(map, "zinc", TAG_RAW_ZINC, ZINC_DUST, O_ZINC_SMALL_DUST);

        BYPRODUCT_FORM_DUST = Map.copyOf(map);
    }
}
