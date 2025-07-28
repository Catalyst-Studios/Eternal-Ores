package net.radzratz.eternalores.util.compat.oritech.recipe_types.foundry;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.radzratz.eternalores.item.types.EODustItem;
import net.radzratz.eternalores.item.types.EOIngotItem;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.enums.foundry.EOFoundryCreationType;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.enums.foundry.EOFoundryGemType;

import java.util.Map;

public class EOFoundryInputRegistry
{
    public static void registerAlloyCreationRecipes(Map<String, EOFoundryCreationType.InputsAlloyDust> map, String name,
                                                    TagKey<Item> inputTagOne, TagKey<Item> inputTagTwo, DeferredItem<EOIngotItem> output)
    {
        map.put(name, new EOFoundryCreationType.InputsAlloyDust(inputTagOne, inputTagTwo, output.get()));
    }

    public static void registerGemToIngotRecipes(Map<String, EOFoundryGemType.InputsGemDust> map, String name,
                                                 TagKey<Item> inputTagOne, TagKey<Item> inputTagTwo, DeferredItem<EOIngotItem> output)
    {
        map.put(name, new EOFoundryGemType.InputsGemDust(inputTagOne, inputTagTwo, output.get()));
    }
    public static void registerGemToIngotRecipesVar(Map<String, EOFoundryGemType.InputsGemDust> map, String name,
                                                 TagKey<Item> inputTagOne, TagKey<Item> inputTagTwo, DeferredItem<EODustItem> output)
    {
        map.put(name, new EOFoundryGemType.InputsGemDust(inputTagOne, inputTagTwo, output.get()));
    }
}
