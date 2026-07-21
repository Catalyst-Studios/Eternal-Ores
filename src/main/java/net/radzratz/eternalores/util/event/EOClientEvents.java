package net.radzratz.eternalores.util.event;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackLocationInfo;
import net.minecraft.server.packs.PackSelectionConfig;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraft.server.packs.resources.ResourceManagerReloadListener;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.Vec3;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.*;
import net.neoforged.neoforge.event.AddPackFindersEvent;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.block.EOCompressedBlockRegistry;
import net.radzratz.eternalores.item.special.prospectors.renders.EOAdvOutline;
import net.radzratz.eternalores.item.special.prospectors.EOBasicProspector;
import net.radzratz.eternalores.item.special.prospectors.hud.EOBasicHudScreen;
import net.radzratz.eternalores.item.special.prospectors.renders.EOBasicOverlay;
import net.radzratz.eternalores.util.config.EOToolsConfig;
import net.radzratz.eternalores.util.config.util.EOCompressedBlockEntry;
import net.radzratz.eternalores.util.models.EOModelLoader;

import java.awt.*;
import java.util.Optional;

import static net.radzratz.eternalores.item.special.prospectors.renders.EOBasicOverlay.EDIT_PROSPECTOR_HUD;
import static net.radzratz.eternalores.util.EOUtils.EO;
import static net.radzratz.eternalores.util.lang.EOLangKeys.*;
import static net.radzratz.eternalores.util.models.EOResourcePack.getResourcesSupplier;

@EventBusSubscriber(modid = EternalOres.id, value = Dist.CLIENT)
public class EOClientEvents {
    @SubscribeEvent
    public static void onRenderGui(RenderGuiEvent.Post event) {
        if (!EOToolsConfig.CFG.basicProspector.shouldShowOverlay()) return;

        Minecraft mc = Minecraft.getInstance();
        Player player = mc.player;
        if (player == null || mc.options.hideGui) return;
        if (mc.screen instanceof EOBasicHudScreen) return;

        ItemStack prospectorStack = EOBasicOverlay.getProspectorInHand(player);
        if (prospectorStack == null) {
            EOBasicOverlay.currentScanData = null;
            return;
        }

        String material = EOBasicProspector.getLinkedMaterial(prospectorStack);
        int y = mc.getWindow().getGuiScaledHeight() - 35;

        if (material.isEmpty()) {
            int scanRadius = EOToolsConfig.getScanRadius();
            EOBasicOverlay.renderText(event.getGuiGraphics(),
                    Component.translatable(BASIC_PROSPECTOR_HEADER)
                            .append(Component.translatable(BASIC_PROSPECTOR_NOT_LINKED))
                            .withStyle(ChatFormatting.GRAY)
                            .append(Component.literal("[" + scanRadius + "m]")
                                    .withStyle(ChatFormatting.DARK_GRAY)), y
            );
            EOBasicOverlay.currentScanData = null;
            return;
        }

        if (EOBasicOverlay.currentScanData == null
                || !EOBasicOverlay.currentScanData.material.equals(material)
                || !EOBasicOverlay.currentScanData.isValid()) {

            int scanRadius = EOToolsConfig.getScanRadius();
            EOBasicOverlay.renderText(event.getGuiGraphics(),
                    Component.translatable(BASIC_PROSPECTOR_HEADER)
                            .withStyle(ChatFormatting.YELLOW)
                            .append(Component.literal(material.toUpperCase())
                                    .withStyle(ChatFormatting.GOLD))
                            .append(Component.literal(":")
                                    .append(Component.translatable(BASIC_PROSPECTOR_SEARCHING_DOT))
                                    .withStyle(ChatFormatting.WHITE))
                            .append(Component.literal("[" + scanRadius + "m]")
                                    .withStyle(ChatFormatting.DARK_GRAY)), y
            );
            return;
        }

        EOBasicOverlay.renderText(event.getGuiGraphics(), EOBasicOverlay.buildScanComponent(EOBasicOverlay.currentScanData), y);
    }

    @SubscribeEvent
    public static void onRenderLevel(RenderLevelStageEvent event) {
        if (event.getStage() != RenderLevelStageEvent.Stage.AFTER_ENTITIES) return;
        if (!EOAdvOutline.hasValidOutline()) return;

        Minecraft mc = Minecraft.getInstance();
        if (mc.player == null) return;

        Color color = EOToolsConfig.CFG.prospectorListAndColors
                .getMaterialColors()
                .getOrDefault(EOAdvOutline.currentMaterial, Color.WHITE);

        PoseStack poseStack = event.getPoseStack();
        Vec3 cam = event.getCamera().getPosition();

        VertexConsumer vc = mc.renderBuffers()
                .outlineBufferSource()
                .getBuffer(EOAdvOutline.OutlineEffect.linesNoDepth());

        poseStack.pushPose();
        poseStack.translate(
                -cam.x,
                -cam.y,
                -cam.z
        );

        for (BlockPos pos : EOAdvOutline.currentOrePositions) {
            EOAdvOutline.renderOutline(poseStack, vc, pos, color);
        }

        poseStack.popPose();

        mc.renderBuffers().outlineBufferSource().endOutlineBatch();
    }

    @SubscribeEvent
    public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
        event.register(EDIT_PROSPECTOR_HUD);
    }

    @SubscribeEvent
    public static void onClientTick(ClientTickEvent.Post event) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player == null || mc.screen != null) return;

        while (EDIT_PROSPECTOR_HUD.consumeClick()) {
            mc.setScreen(new EOBasicHudScreen());
        }
    }

    @SubscribeEvent
    public static void onRegisterGeometryLoaders(ModelEvent.RegisterGeometryLoaders event) {
        event.register(EO("compressed"), EOModelLoader.INSTANCE);
    }

    @SubscribeEvent
    public static void onAddPackFinders(AddPackFindersEvent event) {
        if (event.getPackType() != PackType.CLIENT_RESOURCES) return;

        event.addRepositorySource(consumer -> {
            Pack built = Pack.readMetaAndCreate(
                    new PackLocationInfo(
                            "eternalores:virtual",
                            Component.literal("EternalOres Virtual Pack"),
                            PackSource.BUILT_IN,
                            Optional.empty()
                    ),
                    getResourcesSupplier(),
                    PackType.CLIENT_RESOURCES,
                    new PackSelectionConfig(
                            true,
                            Pack.Position.BOTTOM,
                            false
                    )
            );

            if (built != null) consumer.accept(built);
        });
    }

    @SubscribeEvent
    public static void onRegisterBlockColors(RegisterColorHandlersEvent.Block event) {
        EOCompressedBlockRegistry.getAll().forEach((key, set) -> {
            EOCompressedBlockEntry entry = EOCompressedBlockRegistry.getEntry(key);
            if (entry == null) return;

            ResourceLocation origLoc = ResourceLocation.fromNamespaceAndPath(entry.namespace(), entry.blockId());
            Block original = BuiltInRegistries.BLOCK.get(origLoc);
            if (original == Blocks.AIR) return;

            for (int lvl = 1; lvl <= 9; lvl++) {
                var holder = set.get(lvl);
                if (holder == null || !holder.isBound()) continue;

                event.register((state, level, pos, tintIndex) -> event.getBlockColors().getColor(
                        original.defaultBlockState(),
                        level,
                        pos,
                        tintIndex
                ), holder.get());
            }
        });
    }

    @SubscribeEvent
    public static void onRegisterItemColors(RegisterColorHandlersEvent.Item event) {
        EOCompressedBlockRegistry.getAll().forEach((key, set) -> {
            EOCompressedBlockEntry entry = EOCompressedBlockRegistry.getEntry(key);
            if (entry == null) return;

            ResourceLocation origLoc = ResourceLocation.fromNamespaceAndPath(entry.namespace(), entry.blockId());
            Block original = BuiltInRegistries.BLOCK.get(origLoc);
            if (original == Blocks.AIR) return;

            for (int lvl = 1; lvl <= 9; lvl++) {
                var holder = set.get(lvl);
                if (holder == null || !holder.isBound()) continue;

                event.register((stack, tintIndex) -> Minecraft.getInstance().getBlockColors()
                                .getColor(original.defaultBlockState(),
                                        null,
                                        null,
                                        tintIndex
                                ),
                        holder.get().asItem());
            }
        });
    }

    @SubscribeEvent
    public static void onRegisterResourceReloadListeners(RegisterClientReloadListenersEvent event) {
        event.registerReloadListener((ResourceManagerReloadListener) manager -> EOModelLoader.EOGeometry.clearCaches());
    }
}
