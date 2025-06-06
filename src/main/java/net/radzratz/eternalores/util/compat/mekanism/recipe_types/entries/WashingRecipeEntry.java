package net.radzratz.eternalores.util.compat.mekanism.recipe_types.entries;

import mekanism.api.chemical.Chemical;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.material.Fluid;
import net.radzratz.eternalores.util.compat.mekanism.recipe_types.enums.WashingRecipeType;

import java.util.Map;

public class WashingRecipeEntry
{
    public static void registerWashingRecipes(Map<String, WashingRecipeType.Inputs> map,
                                              String name,
                                              Chemical dirtySlurry,
                                              TagKey<Fluid> inputWater,
                                              Chemical cleanSlurrySupplier)
    {
        map.put(name, new WashingRecipeType.Inputs(
                dirtySlurry,
                inputWater,
                cleanSlurrySupplier
        ));
    }
}
