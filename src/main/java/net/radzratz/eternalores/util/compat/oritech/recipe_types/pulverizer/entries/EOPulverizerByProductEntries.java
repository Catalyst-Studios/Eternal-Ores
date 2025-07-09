package net.radzratz.eternalores.util.compat.oritech.recipe_types.pulverizer.entries;

import net.radzratz.eternalores.item.EOItems;
import net.radzratz.eternalores.util.compat.oritech.items.EOritechItemRegistry;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.enums.EOPulverizerRawOreByproductType;
import net.radzratz.eternalores.util.tags.item.raw_materials.EORawMaterialTags;

import java.util.HashMap;
import java.util.Map;

import static net.radzratz.eternalores.util.compat.oritech.recipe_types.pulverizer.EOPulverizerInputRegistry.registerRawByproductRecipes;

public class EOPulverizerByProductEntries
{
    public static final Map<String, EOPulverizerRawOreByproductType.InputsByproduct> BYPRODUCT_FORM_DUST;
    static
    {
        Map<String, EOPulverizerRawOreByproductType.InputsByproduct> map = new HashMap<>();

        registerRawByproductRecipes(map, "aluminum",
                EORawMaterialTags.RAW_ALUMINIUM,
                EOItems.ALUMINUM_DUST,
                EOritechItemRegistry.O_ALUMINUM_SMALL_DUST);

        registerRawByproductRecipes(map, "ardite",
                EORawMaterialTags.RAW_ARDITE,
                EOItems.ARDITE_DUST,
                EOritechItemRegistry.O_ARDITE_SMALL_DUST);

        registerRawByproductRecipes(map, "catalyrium",
                EORawMaterialTags.RAW_CATALYRIUM,
                EOItems.CATALYRIUM_DUST,
                EOritechItemRegistry.O_CATALYRIUM_SMALL_DUST);

        registerRawByproductRecipes(map, "cobalt",
                EORawMaterialTags.RAW_COBALT,
                EOItems.COBALT_DUST,
                EOritechItemRegistry.O_COBALT_SMALL_DUST);

        registerRawByproductRecipes(map, "gallium",
                EORawMaterialTags.RAW_GALLIUM,
                EOItems.GALLIUM_DUST,
                EOritechItemRegistry.O_GALLIUM_SMALL_DUST);

        registerRawByproductRecipes(map, "iridium",
                EORawMaterialTags.RAW_IRIDIUM,
                EOItems.IRIDIUM_DUST,
                EOritechItemRegistry.O_IRIDIUM_SMALL_DUST);

        registerRawByproductRecipes(map, "lead",
                EORawMaterialTags.RAW_LEAD,
                EOItems.LEAD_DUST,
                EOritechItemRegistry.O_LEAD_SMALL_DUST);

        registerRawByproductRecipes(map, "osmium",
                EORawMaterialTags.RAW_OSMIUM,
                EOItems.OSMIUM_DUST,
                EOritechItemRegistry.O_OSMIUM_SMALL_DUST);

        registerRawByproductRecipes(map, "silver",
                EORawMaterialTags.RAW_SILVER,
                EOItems.SILVER_DUST,
                EOritechItemRegistry.O_SILVER_SMALL_DUST);

        registerRawByproductRecipes(map, "tin",
                EORawMaterialTags.RAW_TIN,
                EOItems.TIN_DUST,
                EOritechItemRegistry.O_TIN_SMALL_DUST);

        registerRawByproductRecipes(map, "tungsten",
                EORawMaterialTags.RAW_TUNGSTEN,
                EOItems.TUNGSTEN_DUST,
                EOritechItemRegistry.O_TUNGSTEN_SMALL_DUST);

        registerRawByproductRecipes(map, "uraninite",
                EORawMaterialTags.RAW_URANINITE,
                EOItems.URANINITE_DUST,
                EOritechItemRegistry.O_URANINITE_SMALL_DUST);

        registerRawByproductRecipes(map, "uranium",
                EORawMaterialTags.RAW_URANIUM,
                EOItems.URANIUM_DUST,
                EOritechItemRegistry.O_URANIUM_SMALL_DUST);

        registerRawByproductRecipes(map, "zinc",
                EORawMaterialTags.RAW_ZINC,
                EOItems.ZINC_DUST,
                EOritechItemRegistry.O_ZINC_SMALL_DUST);

        BYPRODUCT_FORM_DUST = Map.copyOf(map);
    }
}
