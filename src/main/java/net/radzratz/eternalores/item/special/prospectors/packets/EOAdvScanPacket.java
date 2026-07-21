package net.radzratz.eternalores.item.special.prospectors.packets;

import net.minecraft.core.BlockPos;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.item.special.prospectors.renders.EOAdvOutline;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public record EOAdvScanPacket(String material, List<BlockPos> orePositions) implements CustomPacketPayload {
    public static final Type<EOAdvScanPacket> TYPE = new Type<>(
            ResourceLocation.fromNamespaceAndPath(EternalOres.id, "advanced_prospector_outline")
    );

    public static final StreamCodec<RegistryFriendlyByteBuf, EOAdvScanPacket> STREAM_CODEC =
            StreamCodec.composite(
                    ByteBufCodecs.stringUtf8(64), EOAdvScanPacket::material,
                    BlockPos.STREAM_CODEC.apply(ByteBufCodecs.list()), EOAdvScanPacket::orePositions,
                    EOAdvScanPacket::new
            );

    @Override
    public @NotNull Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }

    public static void handle(EOAdvScanPacket packet, IPayloadContext context) {
        context.enqueueWork(() ->
                EOAdvOutline.updateOutlineData(
                        packet.material(),
                        packet.orePositions()
                )
        );
    }
}
