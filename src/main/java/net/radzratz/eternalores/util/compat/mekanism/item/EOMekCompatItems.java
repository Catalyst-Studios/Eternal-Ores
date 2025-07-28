package net.radzratz.eternalores.util.compat.mekanism.item;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.util.compat.util.types.EOClumpItem;
import net.radzratz.eternalores.util.compat.util.types.EOCrystalItem;
import net.radzratz.eternalores.util.compat.util.types.EODirtyDustItem;
import net.radzratz.eternalores.util.compat.util.types.EOShardItem;

import static net.radzratz.eternalores.util.compat.mekanism.item.EOMekCompatItemHelpers.*;

public class EOMekCompatItems
{
    public static final DeferredRegister.Items MEK_COMPAT_ITEMS = DeferredRegister.createItems(EternalOres.id);

    ///Dirty Dusts
    public static final DeferredItem<EODirtyDustItem> ALUMINUM_DIRTY_DUST = registerDirtyDust("dirty_aluminum_dust");
    public static final DeferredItem<EODirtyDustItem> ARDITE_DIRTY_DUST = registerDirtyDust("dirty_ardite_dust");
    public static final DeferredItem<EODirtyDustItem> CATALYRIUM_DIRTY_DUST = registerDirtyDust("dirty_catalyrium_dust");
    public static final DeferredItem<EODirtyDustItem> COBALT_DIRTY_DUST = registerDirtyDust("dirty_cobalt_dust");
    public static final DeferredItem<EODirtyDustItem> GALLIUM_DIRTY_DUST = registerDirtyDust("dirty_gallium_dust");
    public static final DeferredItem<EODirtyDustItem> IRIDIUM_DIRTY_DUST = registerDirtyDust("dirty_iridium_dust");
    public static final DeferredItem<EODirtyDustItem> NICKEL_DIRTY_DUST = registerDirtyDust("dirty_nickel_dust");
    public static final DeferredItem<EODirtyDustItem> PLATINUM_DIRTY_DUST = registerDirtyDust("dirty_platinum_dust");
    public static final DeferredItem<EODirtyDustItem> SILVER_DIRTY_DUST = registerDirtyDust("dirty_silver_dust");
    public static final DeferredItem<EODirtyDustItem> URANINITE_DIRTY_DUST = registerDirtyDust("dirty_uraninite_dust");
    public static final DeferredItem<EODirtyDustItem> ZINC_DIRTY_DUST = registerDirtyDust("dirty_zinc_dust");
    ///Clumps
    public static final DeferredItem<EOClumpItem> ALUMINUM_CLUMP = registerClumps("clump_aluminum");
    public static final DeferredItem<EOClumpItem> ARDITE_CLUMP = registerClumps("clump_ardite");
    public static final DeferredItem<EOClumpItem> CATALYRIUM_CLUMP = registerClumps("clump_catalyrium");
    public static final DeferredItem<EOClumpItem> COBALT_CLUMP = registerClumps("clump_cobalt");
    public static final DeferredItem<EOClumpItem> GALLIUM_CLUMP = registerClumps("clump_gallium");
    public static final DeferredItem<EOClumpItem> IRIDIUM_CLUMP = registerClumps("clump_iridium");
    public static final DeferredItem<EOClumpItem> NICKEL_CLUMP = registerClumps("clump_nickel");
    public static final DeferredItem<EOClumpItem> PLATINUM_CLUMP = registerClumps("clump_platinum");
    public static final DeferredItem<EOClumpItem> SILVER_CLUMP = registerClumps("clump_silver");
    public static final DeferredItem<EOClumpItem> URANINITE_CLUMP = registerClumps("clump_uraninite");
    public static final DeferredItem<EOClumpItem> ZINC_CLUMP = registerClumps("clump_zinc");
    ///Shards
    public static final DeferredItem<EOShardItem> ALUMINUM_SHARD = registerShards("shard_aluminum");
    public static final DeferredItem<EOShardItem> ARDITE_SHARD = registerShards("shard_ardite");
    public static final DeferredItem<EOShardItem> CATALYRIUM_SHARD = registerShards("shard_catalyrium");
    public static final DeferredItem<EOShardItem> COBALT_SHARD = registerShards("shard_cobalt");
    public static final DeferredItem<EOShardItem> GALLIUM_SHARD = registerShards("shard_gallium");
    public static final DeferredItem<EOShardItem> IRIDIUM_SHARD = registerShards("shard_iridium");
    public static final DeferredItem<EOShardItem> NICKEL_SHARD = registerShards("shard_nickel");
    public static final DeferredItem<EOShardItem> PLATINUM_SHARD = registerShards("shard_platinum");
    public static final DeferredItem<EOShardItem> SILVER_SHARD = registerShards("shard_silver");
    public static final DeferredItem<EOShardItem> URANINITE_SHARD = registerShards("shard_uraninite");
    public static final DeferredItem<EOShardItem> ZINC_SHARD = registerShards("shard_zinc");
    ///Crystals
    public static final DeferredItem<EOCrystalItem> ALUMINUM_CRYSTAL = registerCrystals("crystal_aluminum");
    public static final DeferredItem<EOCrystalItem> ARDITE_CRYSTAL = registerCrystals("crystal_ardite");
    public static final DeferredItem<EOCrystalItem> CATALYRIUM_CRYSTAL = registerCrystals("crystal_catalyrium");
    public static final DeferredItem<EOCrystalItem> COBALT_CRYSTAL = registerCrystals("crystal_cobalt");
    public static final DeferredItem<EOCrystalItem> GALLIUM_CRYSTAL = registerCrystals("crystal_gallium");
    public static final DeferredItem<EOCrystalItem> IRIDIUM_CRYSTAL = registerCrystals("crystal_iridium");
    public static final DeferredItem<EOCrystalItem> NICKEL_CRYSTAL = registerCrystals("crystal_nickel");
    public static final DeferredItem<EOCrystalItem> PLATINUM_CRYSTAL = registerCrystals("crystal_platinum");
    public static final DeferredItem<EOCrystalItem> SILVER_CRYSTAL = registerCrystals("crystal_silver");
    public static final DeferredItem<EOCrystalItem> URANINITE_CRYSTAL = registerCrystals("crystal_uraninite");
    public static final DeferredItem<EOCrystalItem> ZINC_CRYSTAL = registerCrystals("crystal_zinc");

    public static void registerMekCompatItems(IEventBus eventBus)
    {
        MEK_COMPAT_ITEMS.register(eventBus);
    }
}
