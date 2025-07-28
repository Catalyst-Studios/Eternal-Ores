package net.radzratz.eternalores.util.compat.oritech.recipe_types.atomic_forge;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.radzratz.eternalores.item.types.EODustItem;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.enums.EOAtomicForgeConversionType;

import java.util.Map;

public class EOAtomicForgeInputRegistry
{
    public static void registerOreGemConversionRecipes(Map<String, EOAtomicForgeConversionType.InputsOreGem> map, String name,
                                                       TagKey<Item> inputTag, TagKey<Item> inputFluxite, DeferredItem<EODustItem> output)
    {
        map.put(name, new EOAtomicForgeConversionType.InputsOreGem(inputTag, inputFluxite, output.get()));
    }
}
