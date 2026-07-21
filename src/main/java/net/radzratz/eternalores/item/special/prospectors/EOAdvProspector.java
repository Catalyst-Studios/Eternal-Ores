package net.radzratz.eternalores.item.special.prospectors;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.registries.DeferredItem;
import net.radzratz.eternalores.item.special.prospectors.utils.EOProspectorUtils;
import net.radzratz.eternalores.item.special.prospectors.utils.EOProspectors;
import net.radzratz.eternalores.item.special.prospectors.packets.EOAdvScanPacket;
import net.radzratz.eternalores.item.special.prospectors.renders.EOAdvOutline;
import net.radzratz.eternalores.util.config.EOToolsConfig;
import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.function.BooleanSupplier;

import static net.radzratz.eternalores.util.EOUtils.capitalizeWords;
import static net.radzratz.eternalores.util.config.EOTooltipConfig.CFG;
import static net.radzratz.eternalores.util.lang.EOLangKeys.*;

public class EOAdvProspector extends EOProspectors {
    public EOAdvProspector(Properties properties, BooleanSupplier enabled) {
        super(properties, enabled);
    }

    public static DeferredItem<EOAdvProspector> ADV_PROSPECTOR;

    @Override
    protected void performScan(ServerPlayer player, ItemStack stack, String material) {
        int radius = EOToolsConfig.getOverlayRadius();

        BlockPos center = player.blockPosition();
        int minY = Math.max(center.getY() - radius, player.level().getMinBuildHeight());
        int maxY = Math.min(center.getY() + radius, player.level().getMaxBuildHeight());

        List<BlockPos> foundOres = new ArrayList<>();

        for (int x = center.getX() - radius; x <= center.getX() + radius; x++) {
            for (int y = minY; y <= maxY; y++) {
                for (int z = center.getZ() - radius; z <= center.getZ() + radius; z++) {
                    int dx = x - center.getX();
                    int dy = y - center.getY();
                    int dz = z - center.getZ();
                    if ((dx * dx + dy * dy + dz * dz) > (radius * radius)) continue;

                    BlockPos pos = new BlockPos(x, y, z);
                    if (player.level().getBlockState(pos).is(EOProspectorUtils.resolveOreTag(material))) {
                        foundOres.add(pos.immutable());
                    }
                }
            }
        }

        PacketDistributor.sendToPlayer(player, new EOAdvScanPacket(material, foundOres));
    }

    @Override
    protected void onMaterialLinked(Player player, Level level, String material) {
        EOAdvOutline.clearOutline();
        player.displayClientMessage(
                Component.translatable(ADVANCED_PROSPECTOR_HEADER)
                        .withStyle(ChatFormatting.GREEN)
                        .append(Component.translatable(ADVANCED_PROSPECTOR_LINKED_TO_MATERIAL)
                                .withStyle(ChatFormatting.WHITE))
                        .append(Component.literal(capitalizeWords(material))
                                .withStyle(ChatFormatting.GOLD)),
                true
        );
    }

    @Override
    protected void onLinkCleared(Player player, String previousMaterial) {
        EOAdvOutline.clearOutline();
        player.displayClientMessage(
                Component.translatable(ADVANCED_PROSPECTOR_HEADER)
                        .withStyle(ChatFormatting.GREEN)
                        .append(Component.translatable(ADVANCED_PROSPECTOR_LINK_CLEARED)
                                .withStyle(ChatFormatting.WHITE))
                        .append(Component.literal(capitalizeWords(previousMaterial))
                                .withStyle(ChatFormatting.GOLD)),
                true
        );
    }

    @Override
    protected void sendNotValidMessage(Player player) {
        player.displayClientMessage(
                Component.translatable(ADVANCED_PROSPECTOR_HEADER)
                        .withStyle(ChatFormatting.RED)
                        .append(Component.translatable(ADVANCED_PROSPECTOR_NOT_VALID)
                                .withStyle(ChatFormatting.WHITE)),
                true
        );
    }

    @Override
    protected void sendBlacklistedMessage(Player player, String material) {
        player.displayClientMessage(
                Component.translatable(ADVANCED_PROSPECTOR_HEADER)
                        .withStyle(ChatFormatting.RED)
                        .append(Component.literal(capitalizeWords(material))
                                .withStyle(ChatFormatting.GOLD))
                        .append(Component.translatable(ADVANCED_PROSPECTOR_IS_BLACKLISTED)
                                .withStyle(ChatFormatting.WHITE)),
                true
        );
    }

    @Override
    protected void sendNoMaterialLinkedMessage(Player player) {
        player.displayClientMessage(
                Component.translatable(ADVANCED_PROSPECTOR_HEADER)
                        .withStyle(ChatFormatting.YELLOW)
                        .append(Component.translatable(ADVANCED_PROSPECTOR_NO_MATERIAL_LINKED)
                                .withStyle(ChatFormatting.WHITE)),
                true
        );
    }

    @Override
    protected void sendScanningMessage(Player player, String material) {
        int radius = EOToolsConfig.getOverlayRadius();
        player.displayClientMessage(
                Component.translatable(ADVANCED_PROSPECTOR_HEADER)
                        .withStyle(ChatFormatting.GREEN)
                        .append(Component.translatable(ADVANCED_PROSPECTOR_SCANNING)
                                .withStyle(ChatFormatting.WHITE))
                        .append(Component.literal(material.toUpperCase())
                                .withStyle(ChatFormatting.GOLD))
                        .append(Component.literal("... (" + radius)
                                .append(Component.translatable(ADVANCED_PROSPECTOR_RADIUS_IN))
                                .append(Component.literal(")"))
                                .withStyle(ChatFormatting.GRAY)),
                true
        );
    }

    @Override
    protected void sendNothingToClearMessage(Player player) {
        player.displayClientMessage(
                Component.translatable(ADVANCED_PROSPECTOR_HEADER)
                        .withStyle(ChatFormatting.YELLOW)
                        .append(Component.translatable(ADVANCED_PROSPECTOR_NOTHING_TO_CLEAR)
                                .withStyle(ChatFormatting.WHITE)),
                true
        );
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext context, @NotNull List<Component> tooltip, @NotNull TooltipFlag flag) {
        super.appendHoverText(stack, context, tooltip, flag);

        String linked = getLinkedMaterial(stack);
        int radius = EOToolsConfig.getOverlayRadius();
        int durationSec = EOToolsConfig.CFG.advancedProspector.getOverlayDurationMs() / 1000;

        if (CFG.EO_TOOLTIPS.advancedProspectorTooltips.get()) {
            if (!linked.isEmpty()) {
                tooltip.add(Component.translatable(ADVANCED_PROSPECTOR_LINKED_TO)
                        .withStyle(ChatFormatting.GRAY)
                        .append(Component.literal(capitalizeWords(linked))
                                .withStyle(ChatFormatting.GOLD)));
                tooltip.add(Component.translatable(ADVANCED_PROSPECTOR_OUTLINE_RADIUS)
                        .withStyle(ChatFormatting.GRAY)
                        .append(Component.literal(radius + "")
                                .append(Component.translatable(ADVANCED_PROSPECTOR_OUTLINE_BLOCKS))
                                .withStyle(ChatFormatting.YELLOW)));
                tooltip.add(Component.translatable(ADVANCED_PROSPECTOR_OUTLINE_DURATION)
                        .withStyle(ChatFormatting.GRAY)
                        .append(Component.literal(durationSec + "")
                                .append(Component.translatable(ADVANCED_PROSPECTOR_SECONDS))
                                .withStyle(ChatFormatting.YELLOW)));
                tooltip.add(Component.translatable(ADVANCED_PROSPECTOR_CLICK_TO_CLEAR)
                        .withStyle(ChatFormatting.DARK_GRAY));
            } else {
                tooltip.add(Component.translatable(ADVANCED_PROSPECTOR_UNLINKED)
                        .withStyle(ChatFormatting.GRAY));
                tooltip.add(Component.translatable(ADVANCED_PROSPECTOR_CLICK_TO_LINK)
                        .withStyle(ChatFormatting.DARK_GRAY));
                tooltip.add(Component.translatable(ADVANCED_PROSPECTOR_CLICK_TO_SCAN)
                        .withStyle(ChatFormatting.DARK_GRAY));
            }
        }
    }
}
