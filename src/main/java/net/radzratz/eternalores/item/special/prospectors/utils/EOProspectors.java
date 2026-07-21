package net.radzratz.eternalores.item.special.prospectors.utils;

import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.radzratz.eternalores.util.config.EOToolsConfig;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;
import java.util.function.BooleanSupplier;

public abstract class EOProspectors extends Item {
    protected final BooleanSupplier enabled;

    protected EOProspectors(Properties properties, BooleanSupplier enabled) {
        super(properties.stacksTo(1));
        this.enabled = enabled;
    }

    @Override
    public int getMaxStackSize(@NotNull ItemStack stack) {
        return 1;
    }

    @Override
    public boolean isEnchantable(@NotNull ItemStack stack) {
        return false;
    }

    @Override
    public boolean isEnabled(@NotNull FeatureFlagSet enabledFeatures) {
        return enabled.getAsBoolean();
    }

    @Override
    public @NotNull InteractionResult onItemUseFirst(@NotNull ItemStack stack, @NotNull UseOnContext context) {
        return useOn(context);
    }

    @Override
    public @NotNull InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        Player player = context.getPlayer();
        ItemStack stack = context.getItemInHand();

        if (player == null) return InteractionResult.PASS;

        if (player.isShiftKeyDown()) {
            return clearLinkedMaterial(stack, player, level);
        }

        Optional<String> material = EOProspectorUtils.findMaterialFromBlock(level, context.getClickedPos());

        if (material.isEmpty()) {
            if (level.isClientSide()) sendNotValidMessage(player);
            return InteractionResult.FAIL;
        }

        String materialName = material.get();

        if (EOToolsConfig.CFG.prospectorListAndColors.getBlacklist().contains(materialName)) {
            if (level.isClientSide()) sendBlacklistedMessage(player, materialName);
            return InteractionResult.FAIL;
        }

        setLinkedMaterial(stack, materialName);
        onMaterialLinked(player, level, materialName);

        return InteractionResult.sidedSuccess(level.isClientSide());
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(@NotNull Level level, Player player, @NotNull InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);

        if (player.isShiftKeyDown()) {
            return new InteractionResultHolder<>(clearLinkedMaterial(stack, player, level), stack);
        }

        String linkedMaterial = getLinkedMaterial(stack);

        if (linkedMaterial.isEmpty()) {
            if (level.isClientSide()) sendNoMaterialLinkedMessage(player);
            return new InteractionResultHolder<>(InteractionResult.PASS, stack);
        }

        if (!level.isClientSide() && player instanceof ServerPlayer serverPlayer) {
            performScan(serverPlayer, stack, linkedMaterial);
        }

        if (level.isClientSide()) sendScanningMessage(player, linkedMaterial);

        return new InteractionResultHolder<>(InteractionResult.SUCCESS, stack);
    }

    protected InteractionResult clearLinkedMaterial(ItemStack stack, Player player, Level level) {
        String current = getLinkedMaterial(stack);

        if (current.isEmpty()) {
            if (level.isClientSide()) sendNothingToClearMessage(player);
            return InteractionResult.PASS;
        }

        clearLinkedMaterial(stack);

        if (level.isClientSide()) onLinkCleared(player, current);

        return InteractionResult.sidedSuccess(level.isClientSide());
    }

    protected abstract void performScan(ServerPlayer player, ItemStack stack, String material);
    protected abstract void onMaterialLinked(Player player, Level level, String material);
    protected abstract void onLinkCleared(Player player, String previousMaterial);

    protected abstract void sendNotValidMessage(Player player);
    protected abstract void sendBlacklistedMessage(Player player, String material);
    protected abstract void sendNoMaterialLinkedMessage(Player player);
    protected abstract void sendScanningMessage(Player player, String material);
    protected abstract void sendNothingToClearMessage(Player player);

    public static void setLinkedMaterial(ItemStack stack, String material) {
        CompoundTag tag = stack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag();
        tag.putString("linked_material", material);
        stack.set(DataComponents.CUSTOM_DATA, CustomData.of(tag));
    }

    public static String getLinkedMaterial(ItemStack stack) {
        CustomData data = stack.get(DataComponents.CUSTOM_DATA);
        if (data == null) return "";
        return data.copyTag().getString("linked_material");
    }

    public static void clearLinkedMaterial(ItemStack stack) {
        CompoundTag tag = stack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag();
        tag.remove("linked_material");
        stack.set(DataComponents.CUSTOM_DATA, CustomData.of(tag));
    }
}
