package net.radzratz.eternalores.util.compat.mekanism.recipe_types.entries;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.util.compat.mekanism.recipe_types.enums.EnrichingRecipeType;

import java.util.Map;
import java.util.function.Supplier;

public class EnrichingRecipeEntry
{
    public static void registerEnrichingDustRecipes(Map<String, EnrichingRecipeType.InputsDiff> map,
                                                    String name,
                                                    TagKey<Item> rawOre,
                                                    TagKey<Item> dirtyDustItem,
                                                    TagKey<Item> rawBlock,
                                                    Supplier<Item> dirtyDustSupplier)
    {
        map.put(name, new EnrichingRecipeType.InputsDiff(
                rawOre,
                dirtyDustItem,
                rawBlock,
                dirtyDustSupplier.get()
        ));
    }

    public static void registerEnrichingDustTrueRecipes(Map<String, EnrichingRecipeType.Inputs> map,
                                                        String name,
                                                        TagKey<Item> rawOre,
                                                        TagKey<Item> dirtyDustItem,
                                                        TagKey<Item> rawBlock,
                                                        TagKey<Item> oreBlock,
                                                        Supplier<Item> dustSupplier)
    {
        map.put(name, new EnrichingRecipeType.Inputs(
                rawOre,
                dirtyDustItem,
                rawBlock,
                oreBlock,
                dustSupplier.get()
        ));
    }
}
