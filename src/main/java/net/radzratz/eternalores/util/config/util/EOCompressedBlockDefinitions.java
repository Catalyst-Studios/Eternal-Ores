package net.radzratz.eternalores.util.config.util;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import net.neoforged.fml.loading.FMLPaths;
import net.radzratz.eternalores.EternalOres;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EOCompressedBlockDefinitions {
    private static final Gson GSON = new GsonBuilder()
            .setPrettyPrinting()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .create();

    private static final Path CONFIG_PATH = FMLPaths.CONFIGDIR.get().resolve("eternalores").resolve("compressed_blocks.json");
    private static final String BUNDLED_DEFAULTS = "/data/eternalores/compressed_blocks/defaults.json";

    private static List<EOCompressedBlockEntry> ENTRIES;

    public static synchronized List<EOCompressedBlockEntry> load() {
        if (ENTRIES != null) return ENTRIES;

        try {
            if (!Files.exists(CONFIG_PATH)) {
                Files.createDirectories(CONFIG_PATH.getParent());
                try (InputStream in = EOCompressedBlockDefinitions.class.getResourceAsStream(BUNDLED_DEFAULTS)) {
                    if (in == null) {
                        throw new IllegalStateException("Missing bundled defaults at " + BUNDLED_DEFAULTS);
                    }
                    Files.copy(in, CONFIG_PATH);
                    EternalOres.LOG.info("[EOCompressedBlockDefinitions] Seeded compressed_blocks.json with bundled defaults.");
                }
            }

            try (Reader r = Files.newBufferedReader(CONFIG_PATH)) {
                Type listType = new TypeToken<List<EOCompressedBlockEntry>>() {}.getType();
                ENTRIES = GSON.fromJson(r, listType);
            }

            for (EOCompressedBlockEntry e : ENTRIES) {
                if (e.id() == null || e.id().isBlank()) {
                    EternalOres.LOG.error("[EOCompressedBlockDefinitions] Malformed entry (missing/empty id): {}", e);
                }
            }

            EternalOres.LOG.info("[EOCompressedBlockDefinitions] Loaded {} compressed block definitions.", ENTRIES.size());
        } catch (IOException e) {
            EternalOres.LOG.error("[EOCompressedBlockDefinitions] Failed to load compressed_blocks.json. No compressed blocks will be generated.", e);
            ENTRIES = List.of();
        }

        return ENTRIES;
    }

    @SuppressWarnings("unused")
    public static void invalidate() {
        ENTRIES = null;
    }
}
