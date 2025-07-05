package net.radzratz.eternalores.util.compat.oritech.items;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.radzratz.eternalores.EternalOres;

import static net.radzratz.eternalores.util.compat.oritech.items.helpers.EOritechItemRegistryHelper.*;

public class EOritechItemRegistry
{
    public static final DeferredRegister.Items ORITECH_COMPAT_ITEMS = DeferredRegister.createItems(EternalOres.MOD_ID);

    public static final DeferredItem<Item> O_ALUMINUM_CLUMP = registerClump("o_aluminum_clump");

    public static final DeferredItem<Item> O_ALUMINUM_SMALL_CLUMP = registerSmallClump("o_aluminum_small_clump");

    public static final DeferredItem<Item> O_ALUMINUM_GEM = registerGems("o_aluminum_gem");

    public static final DeferredItem<Item> O_ALUMINUM_SMALL_DUST = registerSmallDust("o_aluminum_small_dust");

    public static void registerOriCompatItems(IEventBus eventBus)
    {
        ORITECH_COMPAT_ITEMS.register(eventBus);
    }
}
