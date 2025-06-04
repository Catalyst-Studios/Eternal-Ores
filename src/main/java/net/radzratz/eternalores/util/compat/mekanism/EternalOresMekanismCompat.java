package net.radzratz.eternalores.util.compat.mekanism;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.radzratz.eternalores.EternalOres;

public class EternalOresMekanismCompat
{
    public static final DeferredRegister.Items MEK_COMPAT_ITEMS = DeferredRegister.createItems(EternalOres.MOD_ID);

    ///Dirty Dusts
    public static final DeferredItem<Item> ALUMINUM_DIRTY_DUST = registerDirtyDust("dirty_aluminum_dust");
    ///Clumps
    public static final DeferredItem<Item> ALUMINUM_CLUMP = registerClumps("clump_aluminum");
    ///Shards
    public static final DeferredItem<Item> ALUMINUM_SHARD = registerShards("shard_aluminum");
    ///Crystals
    public static final DeferredItem<Item> ALUMINUM_CRYSTAL = registerCrystals("crystal_aluminum");

    private static DeferredItem<Item> registerDirtyDust(String name)
    {
        return MEK_COMPAT_ITEMS.register(name, () -> new Item(new Item.Properties()));
    }
    private static DeferredItem<Item> registerClumps(String name)
    {
        return MEK_COMPAT_ITEMS.register(name, () -> new Item(new Item.Properties()));
    }
    private static DeferredItem<Item> registerShards(String name)
    {
        return MEK_COMPAT_ITEMS.register(name, () -> new Item(new Item.Properties()));
    }
    private static DeferredItem<Item> registerCrystals(String name)
    {
        return MEK_COMPAT_ITEMS.register(name, () -> new Item(new Item.Properties()));
    }

    public static void registerMekCompatItems(IEventBus eventBus)
    {
        MEK_COMPAT_ITEMS.register(eventBus);
    }
}
