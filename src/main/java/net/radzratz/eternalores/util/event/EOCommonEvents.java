package net.radzratz.eternalores.util.event;

import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.PackLocationInfo;
import net.minecraft.server.packs.PackSelectionConfig;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.AddPackFindersEvent;
import net.neoforged.neoforge.event.AddReloadListenerEvent;
import net.neoforged.neoforge.event.OnDatapackSyncEvent;
import net.neoforged.neoforge.event.server.ServerStartedEvent;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.registration.PayloadRegistrar;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.util.data.EODataPack;
import net.radzratz.eternalores.item.special.prospectors.packets.EOAdvScanPacket;
import net.radzratz.eternalores.item.special.prospectors.EOBasicProspector;
import net.radzratz.eternalores.item.special.prospectors.packets.EOBasicScanPacket;
import net.radzratz.eternalores.util.config.EOToolsConfig;
import net.radzratz.eternalores.util.recipes.duplicate_handler.EORecipeCache;

import java.util.Optional;

import static net.radzratz.eternalores.util.recipes.duplicate_handler.EODuplicateRecipeHandler.*;

@EventBusSubscriber(modid = EternalOres.id)
public class EOCommonEvents {
    @SubscribeEvent
    public static void onPlayerTick(PlayerTickEvent.Post event) {
        Player player = event.getEntity();

        if (player.level().isClientSide()) return;

        int interval = EOToolsConfig.CFG.basicProspector.getOverlayUpdateInterval();
        if (player.level().getGameTime() % interval != 0) return;

        try {
            ItemStack main = player.getMainHandItem();
            ItemStack off  = player.getOffhandItem();

            if (main.getItem() instanceof EOBasicProspector) {
                EOBasicProspector.performServerScanForOverlay(player, main);
            } else if (off.getItem() instanceof EOBasicProspector) {
                EOBasicProspector.performServerScanForOverlay(player, off);
            }
        } catch (Exception e) {
            EternalOres.LOG.error("[EOTickEventHandler] Error during prospector tick scan", e);
        }
    }

    @SubscribeEvent
    public static void registerPackets(final RegisterPayloadHandlersEvent event) {
        final PayloadRegistrar registrar = event.registrar(EternalOres.id)
                .versioned("1.0")
                .optional();

        registrar.playToClient(EOBasicScanPacket.TYPE,
                EOBasicScanPacket.STREAM_CODEC, EOBasicScanPacket::handle);

        registrar.playToClient(EOAdvScanPacket.TYPE,
                EOAdvScanPacket.STREAM_CODEC, EOAdvScanPacket::handle);

        EternalOres.LOG.info("[EternalOres] Packets registered correctly");
    }

    @SubscribeEvent
    public static void onAddPackFinders(AddPackFindersEvent event) {
        if (event.getPackType() != PackType.SERVER_DATA) return;

        event.addRepositorySource(consumer -> {
            Pack built = Pack.readMetaAndCreate(
                    new PackLocationInfo(
                            "eternalores:data_virtual",
                            Component.literal("EternalOres Data Virtual Pack"),
                            PackSource.BUILT_IN,
                            Optional.empty()
                    ),
                    EODataPack.packResources(),
                    PackType.SERVER_DATA,
                    new PackSelectionConfig(
                            true,
                            Pack.Position.TOP,
                            false
                    )
            );

            if (built != null) consumer.accept(built);
        });
    }

    @SubscribeEvent
    public static void registerCache(AddReloadListenerEvent event) {
        event.addListener(new EORecipeCache());
    }

    @SubscribeEvent
    public static void onServerStarted(ServerStartedEvent event) {
        runDuplicateHandlers(event.getServer().getRecipeManager(), event.getServer().registryAccess());
    }

    @SubscribeEvent
    public static void onRecipeReload(OnDatapackSyncEvent event) {
        if (event.getPlayer() != null) return;
        runDuplicateHandlers(event.getPlayerList().getServer().getRecipeManager(), event.getPlayerList().getServer().registryAccess());
    }
}
