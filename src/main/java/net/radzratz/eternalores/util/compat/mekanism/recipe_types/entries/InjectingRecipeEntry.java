package net.radzratz.eternalores.util.compat.mekanism.recipe_types.entries;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.util.compat.mekanism.recipe_types.enums.InjectorRecipeType;

import java.util.Map;
import java.util.function.Supplier;

public class InjectingRecipeEntry
{
    public static void registerInjectingTrueRecipes(Map<String, InjectorRecipeType.Inputs> map,
                                                    String name,
                                                    TagKey<Item> rawOre,
                                                    TagKey<Item> crystalItem,
                                                    TagKey<Item> rawBlock,
                                                    TagKey<Item> oreBlock,
                                                    Supplier<Item> shardSupplier)
    {
        map.put(name, new InjectorRecipeType.Inputs(
                rawOre,
                crystalItem,
                rawBlock,
                oreBlock,
                shardSupplier.get()
        ));
    }

    public static void registerInjectingRecipes(Map<String, InjectorRecipeType.InputsDiff> map,
                                                String name,
                                                TagKey<Item> rawOre,
                                                TagKey<Item> crystalItem,
                                                TagKey<Item> rawBlock,
                                                Supplier<Item> shardSupplier)
    {
        map.put(name, new InjectorRecipeType.InputsDiff(
                rawOre,
                crystalItem,
                rawBlock,
                shardSupplier.get()
        ));
    }
}
