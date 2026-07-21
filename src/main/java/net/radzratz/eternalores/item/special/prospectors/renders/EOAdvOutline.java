package net.radzratz.eternalores.item.special.prospectors.renders;

import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.VertexFormat;
import net.minecraft.client.renderer.*;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.AABB;
import net.radzratz.eternalores.util.config.EOToolsConfig;

import java.awt.*;
import java.util.*;
import java.util.List;

public class EOAdvOutline {
    public static String currentMaterial = "";
    public static List<BlockPos> currentOrePositions = new ArrayList<>();
    public static long lastUpdateTime = 0;

    public static void updateOutlineData(String material, List<BlockPos> positions) {
        currentMaterial = material;
        currentOrePositions = new ArrayList<>(positions);
        lastUpdateTime = System.currentTimeMillis();
    }

    public static boolean hasValidOutline() {
        if (currentMaterial.isEmpty() || currentOrePositions.isEmpty()) return false;
        long duration = EOToolsConfig.CFG.advancedProspector.getOverlayDurationMs();
        return System.currentTimeMillis() - lastUpdateTime < duration;
    }

    public static void renderOutline(PoseStack poseStack, VertexConsumer vc, BlockPos pos, Color color) {
        AABB aabb = new AABB(pos).inflate(0.01);

        float r = color.getRed()   / 255f;
        float g = color.getGreen() / 255f;
        float b = color.getBlue()  / 255f;

        LevelRenderer.renderLineBox(poseStack, vc, aabb, r, g, b, 1.0f);
    }

    public static void clearOutline() {
        currentMaterial = "";
        currentOrePositions.clear();
    }

    @SuppressWarnings("unused")
    public static String getCurrentMaterial() {
        return currentMaterial;
    }

    @SuppressWarnings("unused")
    public static int getOutlineCount() {
        return currentOrePositions.size();
    }

    public static class OutlineEffect {
        private static final RenderType LINES_NO_DEPTH = RenderType.create(
                "eo_lines_no_depth",
                DefaultVertexFormat.POSITION_COLOR_NORMAL,
                VertexFormat.Mode.LINES,
                256,
                false,
                false,
                RenderType.CompositeState.builder()
                        .setShaderState(RenderType.RENDERTYPE_LINES_SHADER)
                        .setLineState(new RenderStateShard.LineStateShard(OptionalDouble.of(2.0)))
                        .setDepthTestState(RenderStateShard.NO_DEPTH_TEST)
                        .setCullState(RenderStateShard.NO_CULL)
                        .setTransparencyState(RenderStateShard.TRANSLUCENT_TRANSPARENCY)
                        .setOutputState(RenderStateShard.OUTLINE_TARGET)
                        .createCompositeState(false)
        );

        public static RenderType linesNoDepth() {
            return LINES_NO_DEPTH;
        }
    }
}
