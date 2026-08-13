package net.radzratz.eternalores.item.special.prospectors.packets;

import net.minecraft.core.BlockPos;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.util.compat.curios.EOCurios;
import org.jetbrains.annotations.NotNull;

public record EOProspectorCurioPacket(String action, BlockPos targetPos) implements CustomPacketPayload {
    public static final Type<EOProspectorCurioPacket> TYPE = new Type<>(
            ResourceLocation.fromNamespaceAndPath(EternalOres.id, "curio_prospector_use")
    );

    public static final StreamCodec<RegistryFriendlyByteBuf, EOProspectorCurioPacket> STREAM_CODEC =
            StreamCodec.composite(
                    ByteBufCodecs.stringUtf8(16), EOProspectorCurioPacket::action,
                    BlockPos.STREAM_CODEC, EOProspectorCurioPacket::targetPos,
                    EOProspectorCurioPacket::new
            );

    @Override
    public @NotNull Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }

    public static void handle(EOProspectorCurioPacket packet, IPayloadContext context) {
        context.enqueueWork(() -> {
            if (context.player() instanceof ServerPlayer serverPlayer) {
                EOCurios.handleCurioAction(serverPlayer, packet.action(), packet.targetPos());
            }
        });
    }
}