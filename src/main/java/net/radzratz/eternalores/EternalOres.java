package net.radzratz.eternalores;

import net.neoforged.fml.ModList;
import net.neoforged.fml.config.ModConfig;
import net.radzratz.eternalores.block.EternalGeneralBlocks;
import net.radzratz.eternalores.item.EternalCreativeModeTabs;
import net.radzratz.eternalores.item.EternalGeneralItems;
import net.radzratz.eternalores.util.compat.mekanism.fluids.EternalOresMekFluids;
import net.radzratz.eternalores.util.compat.mekanism.EternalOresMekanismCompatItems;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@SuppressWarnings("all")
@Mod(EternalOres.MOD_ID)
public class EternalOres
{
    public static final String MOD_ID = "eternalores";

    public EternalOres(IEventBus modEventBus, ModContainer modContainer)
    {
        modEventBus.addListener(this::commonSetup);

        EternalGeneralItems.register(modEventBus);
        EternalGeneralBlocks.register(modEventBus);

        EternalCreativeModeTabs.register(modEventBus);

        EternalOresMekanismCompatItems.registerMekCompatItems(modEventBus);

        if(ModList.get().isLoaded("mekanism"))
        {
            EternalOresMekFluids.registerEOMekFluids(modEventBus);
        }
    }

    @SubscribeEvent
    private void commonSetup(final FMLCommonSetupEvent event)
    {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
    }

    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
        }
    }
}
