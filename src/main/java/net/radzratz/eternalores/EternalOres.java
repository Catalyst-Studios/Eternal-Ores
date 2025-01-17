package net.radzratz.eternalores;

import net.radzratz.eternalores.block.ModBlocks;
import net.radzratz.eternalores.item.ModCreativeModeTabs;
import net.radzratz.eternalores.item.Moditems;
import net.radzratz.eternalores.util.ModCompatibility;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(EternalOres.MOD_ID)
public class EternalOres
{
    public static final String MOD_ID = "eternalores";
    private static final Logger LOGGER = LogUtils.getLogger();

    public EternalOres(IEventBus modEventBus, ModContainer modContainer)
    {
        LOGGER.info("Starting Eternal Ores Load");
        System.out.println("addListener Started.");
        modEventBus.addListener(this::commonSetup);

        System.out.println("Registering Blocks and Items");
        Moditems.register(modEventBus);
        ModBlocks.register(modEventBus);

        System.out.println("ModCreativeModeTabs Register Initialized.");
        ModCreativeModeTabs.register(modEventBus);
    }

    @SubscribeEvent
    private void commonSetup(final FMLCommonSetupEvent event)
    {
        System.out.println("Common setup is running.");
        System.out.println("Checking on ModCompat class");
        ModCompatibility.checkOtherModsMekanism();
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
