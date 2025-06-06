package net.radzratz.eternalores.util.compat.mekanism.recipe_types.entries;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.util.compat.mekanism.recipe_types.enums.PurificationRecipeType;

import java.util.Map;
import java.util.function.Supplier;

public class PurificationRecipeEntry
{
    public static void registerPurificationRecipes(Map<String, PurificationRecipeType.InputsDiff> map,
                                                   String name,
                                                   TagKey<Item> rawOre,
                                                   TagKey<Item> shardItem,
                                                   TagKey<Item> rawBlock,
                                                   Supplier<Item> clumpSupplier)
    {
        map.put(name, new PurificationRecipeType.InputsDiff(
                rawOre,
                shardItem,
                rawBlock,
                clumpSupplier.get()
        ));
    }

    public static void registerPurificationTrueRecipes(Map<String, PurificationRecipeType.Inputs> map,
                                                       String name,
                                                       TagKey<Item> rawOre,
                                                       TagKey<Item> shardItem,
                                                       TagKey<Item> rawBlock,
                                                       TagKey<Item> oreBlock,
                                                       Supplier<Item> clumpSupplier)
    {
        map.put(name, new PurificationRecipeType.Inputs(
                rawOre,
                shardItem,
                rawBlock,
                oreBlock,
                clumpSupplier.get()
        ));
    }
}
