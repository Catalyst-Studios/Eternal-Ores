package net.radzratz.eternalores.util.compat.oritech.recipe_types.atomic_forge.entries;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.enums.EOAtomicForgeConversionType;

import java.util.HashMap;
import java.util.Map;

import static net.radzratz.eternalores.item.EOItemRegistry.*;
import static net.radzratz.eternalores.util.compat.oritech.recipe_types.atomic_forge.EOAtomicForgeInputRegistry.registerOreGemConversionRecipes;
import static net.radzratz.eternalores.util.compat.oritech.tags.EOItemOritechTags.Items.*;

public class EOAtomicForgeConversionEntries
{

    /// Atomic Forge Entries
    /// Ore Gem -> Dust
    private static final TagKey<Item> FLUXITE_TAG = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "gems/fluxite"));

    public static final Map<String, EOAtomicForgeConversionType.InputsOreGem> RAW_BLOCK_TO_MATERIAL_BLOCK;
    static
    {
        Map<String, EOAtomicForgeConversionType.InputsOreGem> map = new HashMap<>();

        registerOreGemConversionRecipes(map, "aluminum", O_GEM_ALUMINUM_C, FLUXITE_TAG, ALUMINUM_DUST);

        registerOreGemConversionRecipes(map, "ardite", O_GEM_ARDITE_C, FLUXITE_TAG, ARDITE_DUST);

        registerOreGemConversionRecipes(map, "catalyrium", O_GEM_CATALYRIUM_C, FLUXITE_TAG, CATALYRIUM_DUST);

        registerOreGemConversionRecipes(map, "cobalt", O_GEM_COBALT_C, FLUXITE_TAG, COBALT_DUST);

        registerOreGemConversionRecipes(map, "gallium", O_GEM_GALLIUM_C, FLUXITE_TAG, GALLIUM_DUST);

        registerOreGemConversionRecipes(map, "iridium", O_GEM_IRIDIUM_C, FLUXITE_TAG, IRIDIUM_DUST);

        registerOreGemConversionRecipes(map, "lead", O_GEM_LEAD_C, FLUXITE_TAG, LEAD_DUST);

        registerOreGemConversionRecipes(map, "osmium", O_GEM_OSMIUM_C, FLUXITE_TAG, OSMIUM_DUST);

        registerOreGemConversionRecipes(map, "silver", O_GEM_SILVER_C, FLUXITE_TAG, SILVER_DUST);

        registerOreGemConversionRecipes(map, "tin", O_GEM_TIN_C, FLUXITE_TAG, TIN_DUST);

        registerOreGemConversionRecipes(map, "tungsten", O_GEM_TUNGSTEN_C, FLUXITE_TAG, TUNGSTEN_DUST);

        registerOreGemConversionRecipes(map, "uraninite", O_GEM_URANINITE_C, FLUXITE_TAG, URANINITE_DUST);

        registerOreGemConversionRecipes(map, "uranium", O_GEM_URANIUM_C, FLUXITE_TAG, URANIUM_DUST);

        registerOreGemConversionRecipes(map, "zinc", O_GEM_ZINC_C, FLUXITE_TAG, ZINC_DUST);

        RAW_BLOCK_TO_MATERIAL_BLOCK = Map.copyOf(map);
    }
}
