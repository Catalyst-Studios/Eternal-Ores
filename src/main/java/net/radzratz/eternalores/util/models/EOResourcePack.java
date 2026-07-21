package net.radzratz.eternalores.util.models;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.SharedConstants;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.AbstractPackResources;
import net.minecraft.server.packs.PackLocationInfo;
import net.minecraft.server.packs.PackResources;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.metadata.MetadataSectionSerializer;
import net.minecraft.server.packs.metadata.pack.PackMetadataSection;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.resources.IoSupplier;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.block.EOCompressedBlockRegistry;
import net.radzratz.eternalores.util.config.util.EOCompressedBlockEntry;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import static net.radzratz.eternalores.util.EOUtils.EO;

public class EOResourcePack extends AbstractPackResources {
    private final Map<ResourceLocation, String> resources = new LinkedHashMap<>();

    @SuppressWarnings("all")
    public EOResourcePack() {
        super(new PackLocationInfo(
                "eternalores:virtual",
                Component.literal("EternalOres Virtual Pack"),
                null,
                Optional.empty()
        ));
        build();
    }

    @SuppressWarnings("all")
    public static Pack.ResourcesSupplier getResourcesSupplier() {
        EOResourcePack pack = new EOResourcePack();
        Pack.ResourcesSupplier supplier = new Pack.ResourcesSupplier() {
            @Override
            public PackResources openPrimary(PackLocationInfo info) {
                return pack;
            }

            @Override
            public PackResources openFull(PackLocationInfo info, Pack.Metadata metadata) {
                return pack;
            }
        };
        return supplier;
    }

    private void build() {
        JsonObject langEntries = new JsonObject();

        EOCompressedBlockRegistry.getAll().forEach((key, set) -> {
            EOCompressedBlockEntry entry = EOCompressedBlockRegistry.getEntry(key);
            if (entry == null) return;

            for (int lvl = 1; lvl <= 9; lvl++) {
                var holder = set.get(lvl);
                if (holder == null || !holder.isBound()) continue;

                String blockPath = "compressed_" + key + "_" + lvl + "x";

                ResourceLocation blockStateLoc = EO("blockstates/" + blockPath + ".json");
                resources.put(blockStateLoc, buildBlockstates(blockPath));

                ResourceLocation blockModelLoc = EO("models/block/" + blockPath + ".json");
                resources.put(blockModelLoc, buildBlockModel(entry, lvl));

                ResourceLocation itemModelLoc = EO("models/item/" + blockPath + ".json");
                resources.put(itemModelLoc, buildItemModel(blockPath));

                String translationKey = "block.eternalores." + blockPath;
                String displayName = buildDisplayName(entry.blockId(), lvl);
                langEntries.addProperty(translationKey, displayName);
            }
        });

        ResourceLocation langLoc = EO("lang/en_us.json");
        resources.put(langLoc, langEntries.toString());

        EternalOres.LOG.info("[EOResourcePack] Generated {} virtual resources.", resources.size());
    }

    private String buildBlockstates(String blockPath) {
        JsonObject root = new JsonObject();
        JsonObject variants = new JsonObject();
        JsonObject normal = new JsonObject();
        normal.addProperty("model", EternalOres.id + ":block/" + blockPath);
        variants.add("", normal);
        root.add("variants", variants);
        return root.toString();
    }

    private String buildBlockModel(EOCompressedBlockEntry entry, int level) {
        JsonObject root = new JsonObject();
        root.addProperty("parent", "minecraft:block/block");
        root.addProperty("loader", EternalOres.id + ":compressed");
        root.addProperty("source_namespace", entry.namespace());
        root.addProperty("source_block_id", entry.blockId());
        root.addProperty("level", level);

        if (entry.modelOverride() != null) {
            root.addProperty("model_override", entry.modelOverride());
        }

        if (entry.layers() != null && !entry.layers().isEmpty()) {
            JsonArray layersArr = new JsonArray();
            for (var layer : entry.layers()) {
                JsonObject l = new JsonObject();
                l.addProperty("texture", layer.texture());
                l.addProperty("tint", layer.tint());
                layersArr.add(l);
            }
            root.add("layers", layersArr);
        }
        return root.toString();
    }

    private String buildItemModel(String blockPath) {
        JsonObject root = new JsonObject();
        root.addProperty("parent", EternalOres.id + ":block/" + blockPath);
        return root.toString();
    }

    private String buildDisplayName(String blockId, int level) {
        String cleaned = blockId.replace("_block", "").replace("_", " ");
        String[] words = cleaned.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            if (w.isEmpty()) continue;
            sb.append(Character.toUpperCase(w.charAt(0))).append(w.substring(1)).append(" ");
        }
        return sb.toString().trim() + " " + level + "x";
    }

    @Override
    public @Nullable IoSupplier<InputStream> getRootResource(String @NotNull ... paths) {
        return null;
    }

    @SuppressWarnings("all")
    @Override
    public @Nullable IoSupplier<InputStream> getResource(PackType type, ResourceLocation location) {
        if (type != PackType.CLIENT_RESOURCES) return null;
        String json = resources.get(location);
        if (json == null) return null;
        byte[] bytes = json.getBytes(StandardCharsets.UTF_8);
        return () -> new ByteArrayInputStream(bytes);
    }

    @SuppressWarnings("all")
    @Override
    public void listResources(PackType type, String namespace, String prefix, ResourceOutput output) {
        if (type != PackType.CLIENT_RESOURCES) return;
        resources.forEach((loc, json) -> {
            if (loc.getNamespace().equals(namespace) && loc.getPath().startsWith(prefix)) {
                byte[] bytes = json.getBytes(StandardCharsets.UTF_8);
                output.accept(loc, () -> new ByteArrayInputStream(bytes));
            }
        });
    }

    @SuppressWarnings("all")
    @Override
    public Set<String> getNamespaces(PackType type) {
        if (type != PackType.CLIENT_RESOURCES) return Set.of();
        return Set.of(EternalOres.id);
    }

    @SuppressWarnings("unchecked")
    @Override
    public @Nullable <T> T getMetadataSection(@NotNull MetadataSectionSerializer<T> serializer) {
        if (serializer == PackMetadataSection.TYPE) {
            return (T) new PackMetadataSection(
                    Component.literal("EternalOres Virtual Pack"),
                    SharedConstants.getCurrentVersion().getPackVersion(PackType.CLIENT_RESOURCES),
                    Optional.empty()
            );
        }

        return null;
    }

    @SuppressWarnings("all")
    @Override
    public String packId() {
        return "eternalores:virtual";
    }

    @Override
    public void close() {}
}
