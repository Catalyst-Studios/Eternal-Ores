package net.radzratz.eternalores.item.special.teleporter;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.Tag;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.saveddata.SavedData;
import net.neoforged.neoforge.registries.DeferredItem;
import net.radzratz.eternalores.util.config.EOMiningDimensionConfig;
import org.jetbrains.annotations.NotNull;

import java.util.*;

import static net.radzratz.eternalores.util.EOUtils.EO;
import static net.radzratz.eternalores.util.config.EOTooltipConfig.CFG;
import static net.radzratz.eternalores.util.lang.EOLangKeys.*;

public class EOTeleporter extends Item {
    public static DeferredItem<EOTeleporter> TELEPORTER;

    private static final ResourceKey<Level> MINING_DIM = ResourceKey.create(Registries.DIMENSION, EO("mining_dimension"));

    public EOTeleporter(Properties props) {
        super(props.stacksTo(1));
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(Level level, @NotNull Player player, @NotNull InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);

        if (level.isClientSide) return InteractionResultHolder.success(stack);

        ServerPlayer sp = (ServerPlayer) player;

        if (sp.level().dimension() == MINING_DIM) {
            return returnTo(sp, sp.server, stack);
        } else {
            return teleportToMiningDim(sp, sp.server, stack);
        }
    }

    private InteractionResultHolder<ItemStack> teleportToMiningDim(ServerPlayer sp, MinecraftServer server, ItemStack stack) {
        ServerLevel miningLevel = server.getLevel(MINING_DIM);
        if (miningLevel == null) {
            sp.sendSystemMessage(Component.translatable(TELEPORTER_NO_MINING_FOUND).withStyle(ChatFormatting.RED));
            return InteractionResultHolder.fail(stack);
        }

        EOTeleporterSavedData.get(server).setReturn(
                sp.getUUID(),
                sp.level().dimension(),
                sp.getX(), sp.getY(), sp.getZ());

        int safeY = EOMiningDimensionConfig.CONFIG.miningDimension.getSafeSpawnY();
        sp.teleportTo(miningLevel, sp.getX(), safeY, sp.getZ(), sp.getYRot(), sp.getXRot());

        return InteractionResultHolder.success(stack);
    }

    private InteractionResultHolder<ItemStack> returnTo(ServerPlayer sp, MinecraftServer server, ItemStack stack) {
        EOTeleporterSavedData data = EOTeleporterSavedData.get(server);
        Optional<EOTeleporterSavedData.ReturnPoint> returnPoint = data.getReturn(sp.getUUID());

        if (returnPoint.isEmpty()) {
            sp.sendSystemMessage(Component.translatable(TELEPORTER_NO_RETURN_FOUND).withStyle(ChatFormatting.YELLOW));
            fallbackToOverworld(sp, server);
            return InteractionResultHolder.success(stack);
        }

        EOTeleporterSavedData.ReturnPoint point = returnPoint.get();
        ServerLevel returnLevel = server.getLevel(point.dimension());

        if (returnLevel == null) {
            sp.sendSystemMessage(Component.translatable(TELEPORTER_NO_POINT_FOUND).withStyle(ChatFormatting.RED));
            fallbackToOverworld(sp, server);
            data.clearReturn(sp.getUUID());
            return InteractionResultHolder.success(stack);
        }

        sp.teleportTo(returnLevel, point.x(), point.y(), point.z(), sp.getYRot(), sp.getXRot());
        data.clearReturn(sp.getUUID());

        return InteractionResultHolder.success(stack);
    }

    private void fallbackToOverworld(ServerPlayer sp, MinecraftServer server) {
        ServerLevel overworld = server.overworld();
        BlockPos spawn = overworld.getSharedSpawnPos();
        sp.teleportTo(overworld, spawn.getX(), spawn.getY(), spawn.getZ(), sp.getYRot(), sp.getXRot());
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext context, @NotNull List<Component> tooltip, @NotNull TooltipFlag flag) {
        if (context.level() != null) {
            boolean inMiningDim = context.level().dimension() == MINING_DIM;
            if (CFG.EO_TOOLTIPS.teleporter.get()) {
                tooltip.add(Component.translatable(inMiningDim ? TELEPORTER_MINING_RETURN : TELEPORTER_MINING_ACCESS)
                        .withStyle(ChatFormatting.WHITE));
            }
        }
        super.appendHoverText(stack, context, tooltip, flag);
    }

    public static class EOTeleporterSavedData extends SavedData {
        private static final String DATA_NAME = "eternalores_teleporter";

        private static final SavedData.Factory<EOTeleporterSavedData> FACTORY = new SavedData.Factory<>(
                EOTeleporterSavedData::new,
                EOTeleporterSavedData::load,
                null
        );

        public record ReturnPoint(ResourceKey<Level> dimension, double x, double y, double z) {}
        private final Map<UUID, ReturnPoint> returnPoints = new HashMap<>();

        public static EOTeleporterSavedData get(MinecraftServer server) {
            return server.overworld().getDataStorage().computeIfAbsent(FACTORY, DATA_NAME);
        }

        public void setReturn(UUID uuid, ResourceKey<Level> dim, double x, double y, double z) {
            returnPoints.put(uuid, new ReturnPoint(dim, x, y, z));
            setDirty();
        }

        public Optional<ReturnPoint> getReturn(UUID uuid) {
            return Optional.ofNullable(returnPoints.get(uuid));
        }

        public void clearReturn(UUID uuid) {
            returnPoints.remove(uuid);
            setDirty();
        }

        @Override
        public @NotNull CompoundTag save(CompoundTag tag, HolderLookup.@NotNull Provider registries) {
            ListTag list = new ListTag();

            returnPoints.forEach((uuid, point) -> {
                CompoundTag entry = new CompoundTag();
                entry.putUUID("uuid", uuid);
                entry.putString("dim", point.dimension().location().toString());
                entry.putDouble("x", point.x());
                entry.putDouble("y", point.y());
                entry.putDouble("z", point.z());
                list.add(entry);
            });

            tag.put("returnPoints", list);
            return tag;
        }

        private static EOTeleporterSavedData load(CompoundTag tag, HolderLookup.Provider registries) {
            EOTeleporterSavedData data = new EOTeleporterSavedData();
            ListTag list = tag.getList("returnPoints", Tag.TAG_COMPOUND);

            for (int i = 0; i < list.size(); i++) {
                CompoundTag entry = list.getCompound(i);

                UUID uuid = entry.getUUID("uuid");
                ResourceKey<Level> dim = ResourceKey.create(
                        Registries.DIMENSION,
                        ResourceLocation.parse(entry.getString("dim")));

                data.returnPoints.put(uuid, new ReturnPoint(
                        dim,
                        entry.getDouble("x"),
                        entry.getDouble("y"),
                        entry.getDouble("z")));
            }

            return data;
        }
    }
}
