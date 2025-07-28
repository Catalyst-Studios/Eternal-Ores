package net.radzratz.eternalores.util.compat.mekanism.item;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.radzratz.eternalores.util.compat.util.types.EOClumpItem;
import net.radzratz.eternalores.util.compat.util.types.EOCrystalItem;
import net.radzratz.eternalores.util.compat.util.types.EODirtyDustItem;
import net.radzratz.eternalores.util.compat.util.types.EOShardItem;

import static net.radzratz.eternalores.util.compat.mekanism.item.EOMekCompatItems.MEK_COMPAT_ITEMS;

public class EOMekCompatItemHelpers
{
    public static DeferredItem<EODirtyDustItem> registerDirtyDust(String name)
    {
        return MEK_COMPAT_ITEMS.register(name, () -> new EODirtyDustItem(new Item.Properties()));
    }
    public static DeferredItem<EOClumpItem> registerClumps(String name)
    {
        return MEK_COMPAT_ITEMS.register(name, () -> new EOClumpItem(new Item.Properties()));
    }
    public static DeferredItem<EOShardItem> registerShards(String name)
    {
        return MEK_COMPAT_ITEMS.register(name, () -> new EOShardItem(new Item.Properties()));
    }
    public static DeferredItem<EOCrystalItem> registerCrystals(String name)
    {
        return MEK_COMPAT_ITEMS.register(name, () -> new EOCrystalItem(new Item.Properties()));
    }
}
