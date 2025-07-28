package net.radzratz.eternalores.util.compat.oritech.items.helpers;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.radzratz.eternalores.util.compat.util.types.EOClumpItem;
import net.radzratz.eternalores.util.compat.util.types.EOSmallClumpItem;
import net.radzratz.eternalores.util.compat.util.types.EOSmallDustItem;
import net.radzratz.eternalores.util.compat.util.types.EOrGemItem;

import static net.radzratz.eternalores.util.compat.oritech.items.EOritechItemRegistry.ORITECH_COMPAT_ITEMS;

public class EOritechItemRegistryHelper
{
    public static DeferredItem<EOSmallDustItem> registerSmallDust(String name)
    {
        return ORITECH_COMPAT_ITEMS.register(name, () -> new EOSmallDustItem(new Item.Properties()));
    }
    public static DeferredItem<EOrGemItem> registerGems(String name)
    {
        return ORITECH_COMPAT_ITEMS.register(name, () -> new EOrGemItem(new Item.Properties()));
    }
    public static DeferredItem<EOClumpItem> registerClump(String name)
    {
        return ORITECH_COMPAT_ITEMS.register(name, () -> new EOClumpItem(new Item.Properties()));
    }
    public static DeferredItem<EOSmallClumpItem> registerSmallClump(String name)
    {
        return ORITECH_COMPAT_ITEMS.register(name, () -> new EOSmallClumpItem(new Item.Properties()));
    }
}
