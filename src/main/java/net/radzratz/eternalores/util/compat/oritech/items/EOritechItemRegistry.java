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
    public static final DeferredItem<Item> O_ARDITE_CLUMP = registerClump("o_ardite_clump");
    public static final DeferredItem<Item> O_CATALYRIUM_CLUMP = registerClump("o_catalyrium_clump");
    public static final DeferredItem<Item> O_COBALT_CLUMP = registerClump("o_cobalt_clump");
    public static final DeferredItem<Item> O_GALLIUM_CLUMP = registerClump("o_gallium_clump");
    public static final DeferredItem<Item> O_IRIDIUM_CLUMP = registerClump("o_iridium_clump");
    public static final DeferredItem<Item> O_LEAD_CLUMP = registerClump("o_lead_clump");
    public static final DeferredItem<Item> O_OSMIUM_CLUMP = registerClump("o_osmium_clump");
    public static final DeferredItem<Item> O_SILVER_CLUMP = registerClump("o_silver_clump");
    public static final DeferredItem<Item> O_TIN_CLUMP = registerClump("o_tin_clump");
    public static final DeferredItem<Item> O_TUNGSTEN_CLUMP = registerClump("o_tungsten_clump");
    public static final DeferredItem<Item> O_URANINITE_CLUMP = registerClump("o_uraninite_clump");
    public static final DeferredItem<Item> O_URANIUM_CLUMP = registerClump("o_uranium_clump");
    public static final DeferredItem<Item> O_ZINC_CLUMP = registerClump("o_zinc_clump");

    public static final DeferredItem<Item> O_ALUMINUM_SMALL_CLUMP = registerSmallClump("o_aluminum_small_clump");
    public static final DeferredItem<Item> O_ARDITE_SMALL_CLUMP = registerSmallClump("o_ardite_small_clump");
    public static final DeferredItem<Item> O_CATALYRIUM_SMALL_CLUMP = registerSmallClump("o_catalyrium_small_clump");
    public static final DeferredItem<Item> O_COBALT_SMALL_CLUMP = registerSmallClump("o_cobalt_small_clump");
    public static final DeferredItem<Item> O_GALLIUM_SMALL_CLUMP = registerSmallClump("o_gallium_small_clump");
    public static final DeferredItem<Item> O_IRIDIUM_SMALL_CLUMP = registerSmallClump("o_iridium_small_clump");
    public static final DeferredItem<Item> O_LEAD_SMALL_CLUMP = registerSmallClump("o_lead_small_clump");
    public static final DeferredItem<Item> O_OSMIUM_SMALL_CLUMP = registerSmallClump("o_osmium_small_clump");
    public static final DeferredItem<Item> O_SILVER_SMALL_CLUMP = registerSmallClump("o_silver_small_clump");
    public static final DeferredItem<Item> O_TIN_SMALL_CLUMP = registerSmallClump("o_tin_small_clump");
    public static final DeferredItem<Item> O_TUNGSTEN_SMALL_CLUMP = registerSmallClump("o_tungsten_small_clump");
    public static final DeferredItem<Item> O_URANINITE_SMALL_CLUMP = registerSmallClump("o_uraninite_small_clump");
    public static final DeferredItem<Item> O_URANIUM_SMALL_CLUMP = registerSmallClump("o_uranium_small_clump");
    public static final DeferredItem<Item> O_ZINC_SMALL_CLUMP = registerSmallClump("o_zinc_small_clump");

    public static final DeferredItem<Item> O_ALUMINUM_GEM = registerGems("o_aluminum_gem");
    public static final DeferredItem<Item> O_ARDITE_GEM = registerGems("o_ardite_gem");
    public static final DeferredItem<Item> O_CATALYRIUM_GEM = registerGems("o_catalyrium_gem");
    public static final DeferredItem<Item> O_COBALT_GEM = registerGems("o_cobalt_gem");
    public static final DeferredItem<Item> O_GALLIUM_GEM = registerGems("o_gallium_gem");
    public static final DeferredItem<Item> O_IRIDIUM_GEM = registerGems("o_iridium_gem");
    public static final DeferredItem<Item> O_LEAD_GEM = registerGems("o_lead_gem");
    public static final DeferredItem<Item> O_OSMIUM_GEM = registerGems("o_osmium_gem");
    public static final DeferredItem<Item> O_SILVER_GEM = registerGems("o_silver_gem");
    public static final DeferredItem<Item> O_TIN_GEM = registerGems("o_tin_gem");
    public static final DeferredItem<Item> O_TUNGSTEN_GEM = registerGems("o_tungsten_gem");
    public static final DeferredItem<Item> O_URANINITE_GEM = registerGems("o_uraninite_gem");
    public static final DeferredItem<Item> O_URANIUM_GEM = registerGems("o_uranium_gem");
    public static final DeferredItem<Item> O_ZINC_GEM = registerGems("o_zinc_gem");

    public static final DeferredItem<Item> O_ALUMINUM_SMALL_DUST = registerSmallDust("o_aluminum_small_dust");
    public static final DeferredItem<Item> O_ARDITE_SMALL_DUST = registerSmallDust("o_ardite_small_dust");
    public static final DeferredItem<Item> O_CATALYRIUM_SMALL_DUST = registerSmallDust("o_catalyrium_small_dust");
    public static final DeferredItem<Item> O_COBALT_SMALL_DUST = registerSmallDust("o_cobalt_small_dust");
    public static final DeferredItem<Item> O_GALLIUM_SMALL_DUST = registerSmallDust("o_gallium_small_dust");
    public static final DeferredItem<Item> O_IRIDIUM_SMALL_DUST = registerSmallDust("o_iridium_small_dust");
    public static final DeferredItem<Item> O_LEAD_SMALL_DUST = registerSmallDust("o_lead_small_dust");
    public static final DeferredItem<Item> O_OSMIUM_SMALL_DUST = registerSmallDust("o_osmium_small_dust");
    public static final DeferredItem<Item> O_SILVER_SMALL_DUST = registerSmallDust("o_silver_small_dust");
    public static final DeferredItem<Item> O_TIN_SMALL_DUST = registerSmallDust("o_tin_small_dust");
    public static final DeferredItem<Item> O_TUNGSTEN_SMALL_DUST = registerSmallDust("o_tungsten_small_dust");
    public static final DeferredItem<Item> O_URANINITE_SMALL_DUST = registerSmallDust("o_uraninite_small_dust");
    public static final DeferredItem<Item> O_URANIUM_SMALL_DUST = registerSmallDust("o_uranium_small_dust");
    public static final DeferredItem<Item> O_ZINC_SMALL_DUST = registerSmallDust("o_zinc_small_dust");

    public static void registerOriCompatItems(IEventBus eventBus)
    {
        ORITECH_COMPAT_ITEMS.register(eventBus);
    }
}
