package net.radzratz.eternalores.util.compat.mekanism.recipe_types.entries;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.util.compat.mekanism.recipe_types.enums.*;

import java.util.Map;
import java.util.function.Supplier;

public class CrushingRecipeEntry
{
    public static void registerDecoRecipes(Map<String, CrushingRecipeType.InputsDeconstruction> map,
                                            String name,
                                            TagKey<Item> plateTag,
                                            TagKey<Item> rodTag,
                                            Supplier<Item> dustSupplier)
    {
        map.put(name, new CrushingRecipeType.InputsDeconstruction(
                plateTag,
                rodTag,
                dustSupplier.get()
        ));
    }

    public static void registerDirtyDustRecipes(Map<String, CrushingRecipeType.Inputs> map,
                                                 String name,
                                                 TagKey<Item> clumpTag,
                                                 Supplier<Item> dirtyDustSupplier)
    {
        map.put(name, new CrushingRecipeType.Inputs(
                clumpTag,
                dirtyDustSupplier.get()
        ));
    }

    public static void registerMaterialCrushingRecipes(Map<String, CrushingRecipeType.InputsMaterials> map,
                                                       String name,
                                                       TagKey<Item> materialTag,
                                                       Supplier<Item> dustSupplier)
    {
        map.put(name, new CrushingRecipeType.InputsMaterials(
                materialTag,
                dustSupplier.get()
        ));
    }
}
