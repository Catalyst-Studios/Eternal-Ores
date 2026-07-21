package net.radzratz.eternalores.item.special.prospectors.renders;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.ChatFormatting;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.radzratz.eternalores.item.special.prospectors.EOBasicProspector;
import net.radzratz.eternalores.item.special.prospectors.hud.EOBasicHudPos;
import net.radzratz.eternalores.util.config.EOToolsConfig;

import static net.radzratz.eternalores.util.lang.EOLangKeys.*;

public class EOBasicOverlay {
    public static ScanData currentScanData = null;

    public static class ScanData {
        public static final long EXPIRY_MS = 3000;

        public final String material;
        final int oreCount;
        final int nearestDistance;
        final int scanRadius;
        final long timestamp;

        public ScanData(String material, int oreCount, int nearestDistance, int scanRadius) {
            this.material = material;
            this.oreCount = oreCount;
            this.nearestDistance = nearestDistance;
            this.scanRadius = scanRadius;
            this.timestamp = System.currentTimeMillis();
        }

        public boolean isValid() {
            return System.currentTimeMillis() - timestamp < EXPIRY_MS;
        }
    }

    public static final KeyMapping EDIT_PROSPECTOR_HUD = new KeyMapping(
            BASIC_PROSPECTOR_CAT,
            InputConstants.Type.KEYSYM,
            InputConstants.KEY_H,
            ETERNAL_ORES_CAT
    );

    public static Component buildScanComponent(ScanData data) {
        Component header = Component.translatable(BASIC_PROSPECTOR_HEADER)
                .withStyle(ChatFormatting.YELLOW)
                .append(Component.literal(data.material.toUpperCase())
                        .withStyle(ChatFormatting.GOLD))
                .append(Component.literal(": ").withStyle(ChatFormatting.WHITE));

        if (data.oreCount == 0) {
            return header.copy()
                    .append(Component.translatable(BASIC_PROSPECTOR_NOT_FOUND)
                            .withStyle(ChatFormatting.RED))
                    .append(Component.literal("[" + data.scanRadius + "m]")
                            .withStyle(ChatFormatting.DARK_GRAY));
        }

        boolean useColors = EOToolsConfig.CFG.basicProspector.shouldShowDistanceColors();
        ChatFormatting distColor;
        if (useColors) {
            if (data.nearestDistance <= 8) distColor = ChatFormatting.GREEN;
            else if (data.nearestDistance <= 16) distColor = ChatFormatting.YELLOW;
            else if (data.nearestDistance <= 32) distColor = ChatFormatting.GOLD;
            else distColor = ChatFormatting.RED;
        } else {
            distColor = ChatFormatting.YELLOW;
        }

        return header.copy()
                .append(Component.literal(data.nearestDistance + "m ")
                        .withStyle(distColor))
                .append(Component.literal("(" + data.oreCount + ") ")
                        .withStyle(ChatFormatting.GRAY))
                .append(Component.literal("[" + data.scanRadius + "m]")
                        .withStyle(ChatFormatting.DARK_GRAY));
    }

    @SuppressWarnings("unused")
    public static void renderText(GuiGraphics gui, Component text, int yUnused) {
        Minecraft mc = Minecraft.getInstance();
        int textWidth = mc.font.width(text);
        int screenW = mc.getWindow().getGuiScaledWidth();
        int screenH = mc.getWindow().getGuiScaledHeight();

        int[] pos = EOBasicHudPos.get().resolveScreenPosition(screenW, screenH, textWidth);
        int x = pos[0], y = pos[1];

        gui.fill(x - 2, y - 2, x + textWidth + 2, y + 10, 0x80000000);
        gui.drawString(mc.font, text, x, y, 0xFFFFFF, false);
    }

    public static ItemStack getProspectorInHand(Player player) {
        ItemStack main = player.getMainHandItem();
        ItemStack off = player.getOffhandItem();
        if (main.getItem() instanceof EOBasicProspector) return main;
        if (off.getItem() instanceof EOBasicProspector) return off;
        return null;
    }

    public static void updateFromServer(String material, int oreCount, int nearestDistance, int scanRadius) {
        currentScanData = new ScanData(material, oreCount, nearestDistance, scanRadius);
    }

    @SuppressWarnings("unused")
    public static void clearOverlay() {
        currentScanData = null;
    }
}
