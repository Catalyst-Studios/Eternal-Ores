package net.radzratz.eternalores.item.special.prospectors.hud;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.neoforged.fml.loading.FMLPaths;
import net.radzratz.eternalores.EternalOres;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;

public class EOBasicHudPos {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final Path FILE = FMLPaths.CONFIGDIR.get()
            .resolve("eternalores").resolve("prospector_hud.json");

    public float xFraction = 0.05f;
    public float yFraction = 0.95f;

    private static EOBasicHudPos instance;

    public static EOBasicHudPos get() {
        if (instance == null) instance = load();
        return instance;
    }

    private static EOBasicHudPos load() {
        try {
            if (Files.exists(FILE)) {
                try (Reader r = Files.newBufferedReader(FILE)) {
                    EOBasicHudPos pos = GSON.fromJson(r, EOBasicHudPos.class);
                    if (pos != null) return pos;
                }
            }
        } catch (IOException e) {
            EternalOres.LOG.error("[EOBasicHudPos] Failed to load HUD position, using default", e);
        }
        return new EOBasicHudPos();
    }

    public void save() {
        try {
            Files.createDirectories(FILE.getParent());
            try (Writer w = Files.newBufferedWriter(FILE)) {
                GSON.toJson(this, w);
            }
        } catch (IOException e) {
            EternalOres.LOG.error("[EOBasicHudPos] Failed to save HUD position", e);
        }
    }

    public int[] resolveScreenPosition(int screenW, int screenH, int textWidth) {
        int centerX = Math.round(xFraction * screenW);
        int y = Math.round(yFraction * screenH);
        int x = centerX - textWidth / 2;
        return new int[]{x, y};
    }

    public void setFromCenter(int centerX, int topY, int screenW, int screenH) {
        this.xFraction = clamp01((float) centerX / screenW);
        this.yFraction = clamp01((float) topY / screenH);
    }

    private static float clamp01(float v) {
        return Math.max(0f, Math.min(1f, v));
    }
}
