package net.radzratz.eternalores.util.compat.mekanism.recipe_types.entries;

import mekanism.api.chemical.Chemical;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.util.compat.mekanism.recipe_types.enums.CrystallizingRecipeType;

import java.util.Map;
import java.util.function.Supplier;

public class CrystallizationRecipeEntry
{
    public static void registerCrystallizationRecipes(Map<String, CrystallizingRecipeType.Inputs> map,
                                                      String name,
                                                      Chemical inputCleanSlurry,
                                                      Supplier<Item> crystalOutput)
    {
        map.put(name, new CrystallizingRecipeType.Inputs(
                inputCleanSlurry, crystalOutput.get()
        ));
    }
}
