package net.radzratz.eternalores.util.compat.oritech.recipe_types.foundry;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.enums.EOFoundryCreationType;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.enums.EOFoundryGemType;

import java.util.Map;
import java.util.function.Supplier;

public class EOFoundryInputRegistry
{
    public static void registerAlloyCreationRecipes(Map<String, EOFoundryCreationType.InputsAlloyDust> map, String name,
                                                    TagKey<Item> inputTagOne, TagKey<Item> inputTagTwo, Supplier<Item> output)
    {
        map.put(name, new EOFoundryCreationType.InputsAlloyDust(inputTagOne, inputTagTwo, output.get()));
    }

    public static void registerGemToIngotRecipes(Map<String, EOFoundryGemType.InputsGemDust> map, String name,
                                                 TagKey<Item> inputTagOne, TagKey<Item> inputTagTwo, Supplier<Item> output)
    {
        map.put(name, new EOFoundryGemType.InputsGemDust(inputTagOne, inputTagTwo, output.get()));
    }
}
