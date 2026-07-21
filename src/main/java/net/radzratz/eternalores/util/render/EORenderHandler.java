package net.radzratz.eternalores.util.render;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.radzratz.eternalores.entities.EOEntityRegistry;

import static net.radzratz.eternalores.util.EOMaterials.materialSets.*;

@SuppressWarnings("deprecation")
@EventBusSubscriber
public class EORenderHandler {
    @SubscribeEvent
    public static void registerRenderTypes(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(EOEntityRegistry.PEBBLE.get(), ThrownItemRenderer::new);

        ItemBlockRenderTypes.setRenderLayer(ETHERIUM_SET.BLOCK.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(STELLARIUM_SET.BLOCK.get(), RenderType.translucent());
    }
}
