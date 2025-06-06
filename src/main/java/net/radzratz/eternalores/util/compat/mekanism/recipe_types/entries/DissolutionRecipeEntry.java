package net.radzratz.eternalores.util.compat.mekanism.recipe_types.entries;

import mekanism.api.chemical.Chemical;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.util.compat.mekanism.recipe_types.enums.DissolutionRecipeType;

import java.util.Map;

public class DissolutionRecipeEntry
{
    public static void registerDissolutionTrueRecipes(Map<String, DissolutionRecipeType.Inputs> map,
                                                    String name,
                                                    TagKey<Item> rawOre,
                                                    TagKey<Item> rawBlock,
                                                    TagKey<Item> oreBlock,
                                                    Chemical dirtySlurrySupplier)
    {
        map.put(name, new DissolutionRecipeType.Inputs(
                rawOre,
                rawBlock,
                oreBlock,
                dirtySlurrySupplier
        ));
    }

    public static void registerDissolutionRecipes(Map<String, DissolutionRecipeType.InputsDiff> map,
                                                String name,
                                                TagKey<Item> rawOre,
                                                TagKey<Item> rawBlock,
                                                Chemical dirtySlurrySupplier)
    {
        map.put(name, new DissolutionRecipeType.InputsDiff(
                rawOre,
                rawBlock,
                dirtySlurrySupplier
        ));
    }
}
