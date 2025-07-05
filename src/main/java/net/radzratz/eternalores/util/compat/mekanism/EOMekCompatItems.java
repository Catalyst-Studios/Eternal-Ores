package net.radzratz.eternalores.util.compat.mekanism;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.radzratz.eternalores.EternalOres;

public class EOMekCompatItems
{
    public static final DeferredRegister.Items MEK_COMPAT_ITEMS = DeferredRegister.createItems(EternalOres.MOD_ID);

    ///Dirty Dusts
    public static final DeferredItem<Item> ALUMINUM_DIRTY_DUST = registerDirtyDust("dirty_aluminum_dust");
    public static final DeferredItem<Item> ARDITE_DIRTY_DUST = registerDirtyDust("dirty_ardite_dust");
    public static final DeferredItem<Item> CATALYRIUM_DIRTY_DUST = registerDirtyDust("dirty_catalyrium_dust");
    public static final DeferredItem<Item> COBALT_DIRTY_DUST = registerDirtyDust("dirty_cobalt_dust");
    public static final DeferredItem<Item> GALLIUM_DIRTY_DUST = registerDirtyDust("dirty_gallium_dust");
    public static final DeferredItem<Item> IRIDIUM_DIRTY_DUST = registerDirtyDust("dirty_iridium_dust");
    public static final DeferredItem<Item> NICKEL_DIRTY_DUST = registerDirtyDust("dirty_nickel_dust");
    public static final DeferredItem<Item> PLATINUM_DIRTY_DUST = registerDirtyDust("dirty_platinum_dust");
    public static final DeferredItem<Item> SILVER_DIRTY_DUST = registerDirtyDust("dirty_silver_dust");
    public static final DeferredItem<Item> URANINITE_DIRTY_DUST = registerDirtyDust("dirty_uraninite_dust");
    public static final DeferredItem<Item> ZINC_DIRTY_DUST = registerDirtyDust("dirty_zinc_dust");
    ///Clumps
    public static final DeferredItem<Item> ALUMINUM_CLUMP = registerClumps("clump_aluminum");
    public static final DeferredItem<Item> ARDITE_CLUMP = registerClumps("clump_ardite");
    public static final DeferredItem<Item> CATALYRIUM_CLUMP = registerClumps("clump_catalyrium");
    public static final DeferredItem<Item> COBALT_CLUMP = registerClumps("clump_cobalt");
    public static final DeferredItem<Item> GALLIUM_CLUMP = registerClumps("clump_gallium");
    public static final DeferredItem<Item> IRIDIUM_CLUMP = registerClumps("clump_iridium");
    public static final DeferredItem<Item> NICKEL_CLUMP = registerClumps("clump_nickel");
    public static final DeferredItem<Item> PLATINUM_CLUMP = registerClumps("clump_platinum");
    public static final DeferredItem<Item> SILVER_CLUMP = registerClumps("clump_silver");
    public static final DeferredItem<Item> URANINITE_CLUMP = registerClumps("clump_uraninite");
    public static final DeferredItem<Item> ZINC_CLUMP = registerClumps("clump_zinc");
    ///Shards
    public static final DeferredItem<Item> ALUMINUM_SHARD = registerShards("shard_aluminum");
    public static final DeferredItem<Item> ARDITE_SHARD = registerShards("shard_ardite");
    public static final DeferredItem<Item> CATALYRIUM_SHARD = registerShards("shard_catalyrium");
    public static final DeferredItem<Item> COBALT_SHARD = registerShards("shard_cobalt");
    public static final DeferredItem<Item> GALLIUM_SHARD = registerShards("shard_gallium");
    public static final DeferredItem<Item> IRIDIUM_SHARD = registerShards("shard_iridium");
    public static final DeferredItem<Item> NICKEL_SHARD = registerShards("shard_nickel");
    public static final DeferredItem<Item> PLATINUM_SHARD = registerShards("shard_platinum");
    public static final DeferredItem<Item> SILVER_SHARD = registerShards("shard_silver");
    public static final DeferredItem<Item> URANINITE_SHARD = registerShards("shard_uraninite");
    public static final DeferredItem<Item> ZINC_SHARD = registerShards("shard_zinc");
    ///Crystals
    public static final DeferredItem<Item> ALUMINUM_CRYSTAL = registerCrystals("crystal_aluminum");
    public static final DeferredItem<Item> ARDITE_CRYSTAL = registerCrystals("crystal_ardite");
    public static final DeferredItem<Item> CATALYRIUM_CRYSTAL = registerCrystals("crystal_catalyrium");
    public static final DeferredItem<Item> COBALT_CRYSTAL = registerCrystals("crystal_cobalt");
    public static final DeferredItem<Item> GALLIUM_CRYSTAL = registerCrystals("crystal_gallium");
    public static final DeferredItem<Item> IRIDIUM_CRYSTAL = registerCrystals("crystal_iridium");
    public static final DeferredItem<Item> NICKEL_CRYSTAL = registerCrystals("crystal_nickel");
    public static final DeferredItem<Item> PLATINUM_CRYSTAL = registerCrystals("crystal_platinum");
    public static final DeferredItem<Item> SILVER_CRYSTAL = registerCrystals("crystal_silver");
    public static final DeferredItem<Item> URANINITE_CRYSTAL = registerCrystals("crystal_uraninite");
    public static final DeferredItem<Item> ZINC_CRYSTAL = registerCrystals("crystal_zinc");

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
