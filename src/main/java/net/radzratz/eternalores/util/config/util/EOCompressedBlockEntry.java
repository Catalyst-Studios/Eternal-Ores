package net.radzratz.eternalores.util.config.util;

import java.util.List;

public record EOCompressedBlockEntry(String id, String modelOverride, List<TextureLayer> layers, boolean noOcclusion) {
    public record TextureLayer(String texture, boolean tint) {}

    public String namespace() {
        int idx = id.indexOf(':');
        return idx == -1 ? "minecraft" : id.substring(0, idx);
    }

    public String blockId() {
        int idx = id.indexOf(':');
        return idx == -1 ? id : id.substring(idx + 1);
    }

    public String key() {
        return blockId();
    }
}