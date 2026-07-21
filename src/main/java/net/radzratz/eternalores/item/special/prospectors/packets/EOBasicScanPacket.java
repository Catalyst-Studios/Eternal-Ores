package net.radzratz.eternalores.item.special.prospectors.packets;

import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.item.special.prospectors.renders.EOBasicOverlay;
import org.jetbrains.annotations.NotNull;

public record EOBasicScanPacket(String material, int oreCount, int nearestDistance, int scanRadius) implements CustomPacketPayload {
    public static final Type<EOBasicScanPacket> TYPE = new Type<>(
            ResourceLocation.fromNamespaceAndPath(EternalOres.id, "prospector_scan")
    );

    public static final StreamCodec<RegistryFriendlyByteBuf, EOBasicScanPacket> STREAM_CODEC =
            StreamCodec.composite(
                    ByteBufCodecs.stringUtf8(64), EOBasicScanPacket::material,
                    ByteBufCodecs.INT, EOBasicScanPacket::oreCount,
                    ByteBufCodecs.INT, EOBasicScanPacket::nearestDistance,
                    ByteBufCodecs.INT, EOBasicScanPacket::scanRadius,
                    EOBasicScanPacket::new
            );

    @Override
    public @NotNull Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }

    public static void handle(EOBasicScanPacket packet, IPayloadContext context) {
        context.enqueueWork(() ->
                EOBasicOverlay.updateFromServer(
                        packet.material(),
                        packet.oreCount(),
                        packet.nearestDistance(),
                        packet.scanRadius()
                )
        );
    }
}
