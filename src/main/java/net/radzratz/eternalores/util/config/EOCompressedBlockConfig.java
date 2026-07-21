package net.radzratz.eternalores.util.config;

import net.neoforged.neoforge.common.ModConfigSpec;
import net.radzratz.eternalores.util.config.util.EOCompressedBlockDefinitions;
import net.radzratz.eternalores.util.config.util.EOCompressedBlockEntry;
import org.apache.commons.lang3.tuple.Pair;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BooleanSupplier;

public class EOCompressedBlockConfig {
    public static final EOCompressedBlockConfig COMP_CFG;
    public static final ModConfigSpec CONFIG_SPEC;

    private final Map<String, CompressedSetConfig> sets = new LinkedHashMap<>();

    static {
        Pair<EOCompressedBlockConfig, ModConfigSpec> pair = new ModConfigSpec.Builder().configure(EOCompressedBlockConfig::new);
        COMP_CFG = pair.getLeft();
        CONFIG_SPEC = pair.getRight();
    }

    private EOCompressedBlockConfig(ModConfigSpec.Builder bldr) {
        bldr.comment("""
                 Eternal Ores Compressed Block config.
                
                 This config allows you to add, remove or edit compressed block sets
                 in config/eternalores/compressed_blocks.json - this file only
                 controls which levels of each already-defined sets are enabled.

                 One toggle per compression level (1x - 9x) per material.
                
                 Compat compressed blocks need their corresponding mod to load; disabling
                 them here has no effect if the mod isn't present (it's already skipped with
                 a warning at startup.)

                 Each change requires a game restart.
                """).push("compressed_blocks");

        // same logic from de-dupe as comp block registry - keys must match 1:1
        Set<String> seenKeys = new HashSet<>();
        for (EOCompressedBlockEntry e : EOCompressedBlockDefinitions.load()) {
            String blockId = e.blockId();
            String key = seenKeys.add(blockId) ? blockId : blockId + "_" + e.namespace();
            sets.put(key, new CompressedSetConfig(bldr, key));
        }

        bldr.pop();
    }

    public CompressedSetConfig get(String key) {
        return sets.get(key);
    }

    public static class CompressedSetConfig {
        private final ModConfigSpec.BooleanValue[] levelDisabled;

        public CompressedSetConfig(ModConfigSpec.Builder b, String key) {
            b.comment("Compressed " + capitalize(key) + " blocks").push(key);

            this.levelDisabled = new ModConfigSpec.BooleanValue[9];
            for (int i = 0; i < 9; i++) {
                int lvl = i + 1;
                this.levelDisabled[i] = b
                        .comment("[Server] Disable Compressed " + capitalize(key) + " " + lvl + "x specifically.")
                        .gameRestart()
                        .define("is" + capitalize(key) + lvl + "xDisabled", false);
            }

            b.pop();
        }

        public BooleanSupplier forLevel(int level) {
            ModConfigSpec.BooleanValue levelVal = levelDisabled[level - 1];
            return () -> {
                try {
                    return !levelVal.get();
                } catch (IllegalStateException e) {
                    return true;
                }
            };
        }
    }

    private static String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}