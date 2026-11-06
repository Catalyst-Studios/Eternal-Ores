package net.radzratz.eternalores.util.models;

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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

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
        EOVirtualModels.addAll(resources);
        EternalOres.LOG.info("[EOResourcePack] Generated {} virtual resources.", resources.size());
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