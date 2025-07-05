package net.radzratz.eternalores.util.compat.oritech.items.helpers;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;

import static net.radzratz.eternalores.util.compat.oritech.items.EOritechItemRegistry.ORITECH_COMPAT_ITEMS;

public class EOritechItemRegistryHelper
{
    public static DeferredItem<Item> registerSmallDust(String name)
    {
        return ORITECH_COMPAT_ITEMS.register(name, () -> new Item(new Item.Properties()));
    }
    public static DeferredItem<Item> registerGems(String name)
    {
        return ORITECH_COMPAT_ITEMS.register(name, () -> new Item(new Item.Properties()));
    }
    public static DeferredItem<Item> registerClump(String name)
    {
        return ORITECH_COMPAT_ITEMS.register(name, () -> new Item(new Item.Properties()));
    }
    public static DeferredItem<Item> registerSmallClump(String name)
    {
        return ORITECH_COMPAT_ITEMS.register(name, () -> new Item(new Item.Properties()));
    }
}
