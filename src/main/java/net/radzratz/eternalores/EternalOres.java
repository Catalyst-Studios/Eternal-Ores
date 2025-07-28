package net.radzratz.eternalores;

import net.radzratz.eternalores.block.EOBlockRegistry;
import net.radzratz.eternalores.item.EOCreativeModeTabs;
import net.radzratz.eternalores.item.EOItemRegistry;
import net.radzratz.eternalores.util.compat.mekanism.fluids.EOMekSlurries;
import net.radzratz.eternalores.util.compat.mekanism.item.EOMekCompatItems;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.radzratz.eternalores.util.compat.oritech.items.EOritechItemRegistry;

import static net.radzratz.eternalores.util.EOUtils.mekanismMod;

@SuppressWarnings("all")
@Mod(EternalOres.id)
public class EternalOres
{
    public static final String id = "eternalores";

    public EternalOres(IEventBus modEventBus, ModContainer modContainer)
    {
        modEventBus.addListener(this::commonSetup);

        EOItemRegistry.register(modEventBus);
        EOMekCompatItems.registerMekCompatItems(modEventBus);
        EOritechItemRegistry.registerOriCompatItems(modEventBus);

        EOBlockRegistry.register(modEventBus);

        EOCreativeModeTabs.register(modEventBus);

        if(mekanismMod) { EOMekSlurries.registerEOMekFluids(modEventBus); }
    }

    @SubscribeEvent
    private void commonSetup(final FMLCommonSetupEvent event)
    {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
    }

    @EventBusSubscriber(modid = id, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
        }
    }
}
