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
import net.radzratz.eternalores.item.special.prospectors.packets.EOBasicScanPacket;
import net.radzratz.eternalores.item.special.prospectors.utils.EOBasicScanner;
import net.radzratz.eternalores.item.special.prospectors.utils.EOProspectors;
import net.radzratz.eternalores.util.config.EOToolsConfig;
import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.function.BooleanSupplier;

import static net.radzratz.eternalores.item.special.prospectors.renders.EOBasicOverlay.EDIT_PROSPECTOR_HUD;
import static net.radzratz.eternalores.util.EOUtils.capitalizeWords;
import static net.radzratz.eternalores.util.config.EOTooltipConfig.CFG;
import static net.radzratz.eternalores.util.lang.EOLangKeys.*;

public class EOBasicProspector extends EOProspectors {
    public EOBasicProspector(Properties properties, BooleanSupplier enabled) {
        super(properties, enabled);
    }

    public static DeferredItem<EOBasicProspector> PROSPECTOR;

    public static void performServerScanForOverlay(Player player, ItemStack stack) {
        if (!(player instanceof ServerPlayer serverPlayer)) return;
        String material = getLinkedMaterial(stack);
        if (material.isEmpty()) return;

        EOBasicProspector prospector = PROSPECTOR.get();
        prospector.performScan(serverPlayer, stack, material);
    }

    @Override
    protected void performScan(ServerPlayer player, ItemStack stack, String material) {
        int radius = EOToolsConfig.getScanRadius();
        BlockPos center = player.blockPosition();

        EOBasicScanner.ScanResult result =
                EOBasicScanner.scanForOres(
                        player.level(),
                        center,
                        material,
                        radius
                );

        PacketDistributor.sendToPlayer(player,
                new EOBasicScanPacket(
                        material,
                        result.oreCount(),
                        result.nearestDistance(),
                        radius
                )
        );
    }

    @Override
    protected void onMaterialLinked(Player player, Level level, String material) {
        player.displayClientMessage(
                Component.translatable(BASIC_PROSPECTOR_HEADER)
                        .withStyle(ChatFormatting.GREEN)
                        .append(Component.translatable(BASIC_PROSPECTOR_LINKED_TO_ORE)
                                .withStyle(ChatFormatting.WHITE))
                        .append(Component.literal(capitalizeWords(material))
                                .withStyle(ChatFormatting.GOLD)),
                true
        );
    }

    @Override
    protected void onLinkCleared(Player player, String previousMaterial) {
        player.displayClientMessage(
                Component.translatable(BASIC_PROSPECTOR_HEADER)
                        .withStyle(ChatFormatting.GREEN)
                        .append(Component.translatable(BASIC_PROSPECTOR_LINK_CLEAR)
                                .withStyle(ChatFormatting.WHITE))
                        .append(Component.literal(capitalizeWords(previousMaterial))
                                .withStyle(ChatFormatting.GOLD)),
                true
        );
    }

    @Override
    protected void sendNotValidMessage(Player player) {
        player.displayClientMessage(
                Component.translatable(BASIC_PROSPECTOR_HEADER)
                        .withStyle(ChatFormatting.RED)
                        .append(Component.translatable(BASIC_PROSPECTOR_INVALID_BLOCK)
                                .withStyle(ChatFormatting.WHITE)),
                true
        );
    }

    @Override
    protected void sendBlacklistedMessage(Player player, String material) {
        player.displayClientMessage(
                Component.translatable(BASIC_PROSPECTOR_HEADER)
                        .withStyle(ChatFormatting.RED)
                        .append(Component.literal(capitalizeWords(material))
                                .withStyle(ChatFormatting.GOLD))
                        .append(Component.translatable(BASIC_PROSPECTOR_IS_BLACKLISTED)
                                .withStyle(ChatFormatting.WHITE)),
                true
        );
    }

    @Override
    protected void sendNoMaterialLinkedMessage(Player player) {
        player.displayClientMessage(
                Component.translatable(BASIC_PROSPECTOR_HEADER)
                        .withStyle(ChatFormatting.YELLOW)
                        .append(Component.translatable(BASIC_PROSPECTOR_NO_MATERIAL_LINKED)
                                .withStyle(ChatFormatting.WHITE)),
                true
        );
    }

    @Override
    protected void sendScanningMessage(Player player, String material) {
        int radius = EOToolsConfig.getScanRadius();
        player.displayClientMessage(
                Component.translatable(BASIC_PROSPECTOR_HEADER)
                        .withStyle(ChatFormatting.GREEN)
                        .append(Component.translatable(BASIC_PROSPECTOR_SEARCHING)
                                .withStyle(ChatFormatting.WHITE))
                        .append(Component.literal(material.toUpperCase())
                                .withStyle(ChatFormatting.GOLD))
                        .append(Component.literal("... (" + radius)
                                .append(Component.translatable(BASIC_PROSPECTOR_RADIUS_SEARCH))
                                .append(Component.literal(")"))
                                .withStyle(ChatFormatting.GRAY)),
                true
        );
    }

    @Override
    protected void sendNothingToClearMessage(Player player) {
        player.displayClientMessage(
                Component.translatable(BASIC_PROSPECTOR_HEADER)
                        .withStyle(ChatFormatting.YELLOW)
                        .append(Component.translatable(BASIC_PROSPECTOR_NOTHING_TO_CLEAR)
                                .withStyle(ChatFormatting.WHITE)),
                true
        );
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext context, @NotNull List<Component> tooltip, @NotNull TooltipFlag flag) {
        super.appendHoverText(stack, context, tooltip, flag);

        String linked = getLinkedMaterial(stack);
        int radius = EOToolsConfig.getScanRadius();

        if (CFG.EO_TOOLTIPS.prospectorTooltips.get()) {
            tooltip.add(Component.translatable(BASIC_PROSPECTOR_KEY)
                    .append(EDIT_PROSPECTOR_HUD.getTranslatedKeyMessage())
                    .withStyle(ChatFormatting.WHITE));

            if (!linked.isEmpty()) {
                tooltip.add(Component.translatable(BASIC_PROSPECTOR_LINKED_TO)
                        .withStyle(ChatFormatting.GRAY)
                        .append(Component.literal(capitalizeWords(linked))
                                .withStyle(ChatFormatting.GOLD)));
                tooltip.add(Component.translatable(BASIC_PROSPECTOR_SCAN_RADIUS)
                        .withStyle(ChatFormatting.GRAY)
                        .append(Component.literal(radius + "")
                                .append(Component.translatable(BASIC_PROSPECTOR_SCAN_BLOCKS_IN_SCAN))
                                .withStyle(ChatFormatting.YELLOW)));
                tooltip.add(Component.translatable(BASIC_PROSPECTOR_CLICK_TO_SCAN)
                        .withStyle(ChatFormatting.DARK_GRAY));
                tooltip.add(Component.translatable(BASIC_PROSPECTOR_CLICK_TO_CLEAR)
                        .withStyle(ChatFormatting.DARK_GRAY));
            } else {
                tooltip.add(Component.translatable(BASIC_PROSPECTOR_UNLINKED)
                        .withStyle(ChatFormatting.GRAY));
                tooltip.add(Component.translatable(BASIC_PROSPECTOR_SCAN_CLICK_TO_LINK)
                        .withStyle(ChatFormatting.DARK_GRAY));
            }
        }
    }
}
