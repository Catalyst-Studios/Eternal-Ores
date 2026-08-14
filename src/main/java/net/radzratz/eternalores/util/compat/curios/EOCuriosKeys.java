package net.radzratz.eternalores.util.compat.curios;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.neoforged.neoforge.network.PacketDistributor;
import net.radzratz.eternalores.item.special.prospectors.packets.EOProspectorCurioPacket;

import static net.radzratz.eternalores.util.lang.EOLangKeys.*;

// reminder to not mix logic when using stupid key mappings and client shenanigans
public class EOCuriosKeys {
    public static final KeyMapping PROSPECTOR_USE = new KeyMapping(
            PROSPECTOR_CURIO_CAT,
            InputConstants.Type.KEYSYM,
            InputConstants.KEY_TAB,
            ETERNAL_ORES_CAT
    );

    public static final KeyMapping PROSPECTOR_LINK = new KeyMapping(
            PROSPECTOR_CURIO_LINK,
            InputConstants.Type.KEYSYM,
            InputConstants.KEY_1,
            ETERNAL_ORES_CAT
    );

    public static final KeyMapping PROSPECTOR_UNLINK = new KeyMapping(
            PROSPECTOR_CURIO_UNLINK,
            InputConstants.Type.KEYSYM,
            InputConstants.KEY_2,
            ETERNAL_ORES_CAT
    );

    public static void sendCurioAction(String action) {
        Minecraft mc = Minecraft.getInstance();
        BlockPos targetPos = BlockPos.ZERO;

        if (mc.hitResult instanceof BlockHitResult blockHit
                && mc.hitResult.getType() == HitResult.Type.BLOCK) {
            targetPos = blockHit.getBlockPos();
        }

        PacketDistributor.sendToServer(new EOProspectorCurioPacket(action, targetPos));
    }
}