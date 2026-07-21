package net.radzratz.eternalores.item.special.prospectors.hud;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;
import net.radzratz.eternalores.item.special.prospectors.renders.EOBasicOverlay;
import org.jetbrains.annotations.NotNull;

import static net.radzratz.eternalores.util.lang.EOLangKeys.*;

public class EOBasicHudScreen extends Screen {
    private boolean dragging = false;
    private int dragOffsetX, dragOffsetY;

    private int boxX, boxY;
    private int boxWidth, boxHeight;

    private int previousBlurriness;

    private static final EOBasicOverlay.ScanData PREVIEW_DATA =
            new EOBasicOverlay.ScanData("iron", 4, 12, 48);

    public EOBasicHudScreen() {
        super(Component.translatable(EDIT_HUD));
    }

    @Override
    protected void init() {
        super.init();
        recalculateBoxFromCurrentPosition();

        var blurOption = Minecraft.getInstance().options.menuBackgroundBlurriness();
        previousBlurriness = blurOption.get();
        blurOption.set(0);
    }

    @Override
    public void onClose() {
        Minecraft.getInstance().options.menuBackgroundBlurriness().set(previousBlurriness);
        super.onClose();
    }

    private void recalculateBoxFromCurrentPosition() {
        var overlay = EOBasicOverlay.buildScanComponent(PREVIEW_DATA);
        boxWidth = font.width(overlay) + 4;
        boxHeight = 12;

        int[] pos = EOBasicHudPos.get().resolveScreenPosition(width, height, boxWidth - 4);
        boxX = pos[0] - 2;
        boxY = pos[1] - 2;
    }

    @Override
    public void render(@NotNull GuiGraphics gui, int mouseX, int mouseY, float partialTick) {
        renderBackground(gui, mouseX, mouseY, partialTick);

        int bg = dragging ? 0xA000FF00 : 0x8000FF00;
        gui.fill(boxX, boxY, boxX + boxWidth, boxY + boxHeight, bg);
        gui.drawString(
                font,
                EOBasicOverlay.buildScanComponent(PREVIEW_DATA),
                boxX + 2,
                boxY + 2,
                0xFFFFFF,
                false
        );

        gui.drawCenteredString(font,
                Component.translatable(DRAG_BOX).withStyle(ChatFormatting.WHITE),
                width / 2,
                20,
                0xFFFFFF
        );

        gui.drawCenteredString(font,
                Component.translatable(PRESS_ESC_TO_CLOSE).withStyle(ChatFormatting.WHITE),
                width / 2,
                height - 20,
                0xFFFFFF
        );

        super.render(gui, mouseX, mouseY, partialTick);
    }

    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        if (button == 0 && isOverBox(mouseX, mouseY)) {
            dragging = true;
            dragOffsetX = (int) mouseX - boxX;
            dragOffsetY = (int) mouseY - boxY;
            return true;
        }
        return super.mouseClicked(mouseX, mouseY, button);
    }

    @Override
    public boolean mouseDragged(double mouseX, double mouseY, int button, double dragX, double dragY) {
        if (dragging) {
            boxX = clamp((int) mouseX - dragOffsetX, 0, width - boxWidth);
            boxY = clamp((int) mouseY - dragOffsetY, 0, height - boxHeight);
            return true;
        }
        return super.mouseDragged(mouseX, mouseY, button, dragX, dragY);
    }

    @Override
    public boolean mouseReleased(double mouseX, double mouseY, int button) {
        if (button == 0 && dragging) {
            dragging = false;
            EOBasicHudPos pos = EOBasicHudPos.get();
            int centerX = boxX + boxWidth / 2;
            int topY = boxY + 2;
            pos.setFromCenter(centerX, topY, width, height);
            pos.save();
            return true;
        }
        return super.mouseReleased(mouseX, mouseY, button);
    }

    private boolean isOverBox(double mouseX, double mouseY) {
        return mouseX >= boxX && mouseX <= boxX + boxWidth
                && mouseY >= boxY && mouseY <= boxY + boxHeight;
    }

    @SuppressWarnings("all")
    private int clamp(int val, int min, int max) {
        return Math.max(min, Math.min(max, val));
    }

    @Override
    public boolean isPauseScreen() {
        return false;
    }
}
