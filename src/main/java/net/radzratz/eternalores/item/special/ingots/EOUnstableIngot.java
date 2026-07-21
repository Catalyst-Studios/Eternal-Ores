package net.radzratz.eternalores.item.special.ingots;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.CraftingMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.radzratz.eternalores.data_components.EODataComponents;
import net.radzratz.eternalores.util.config.EOTooltipConfig;
import net.radzratz.eternalores.util.lang.EOLangKeys;
import net.radzratz.eternalores.item.types.EOIngotItem;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.BooleanSupplier;

import static net.radzratz.eternalores.EternalOres.LOG;
import static net.radzratz.eternalores.util.EOMaterials.materialSets.UNSTABLE_SET;
import static net.radzratz.eternalores.util.config.EOEventsConfig.CFG;

public class EOUnstableIngot extends EOIngotItem {
    public EOUnstableIngot(Properties properties, BooleanSupplier materialSet, BooleanSupplier enabled) {
        super(properties.stacksTo(1), materialSet, enabled);
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, Item.@NotNull TooltipContext context, @NotNull List<Component> tooltip, @NotNull TooltipFlag flag) {
        super.appendHoverText(stack, context, tooltip, flag);

        if (stack.getItem() != UNSTABLE_SET.UNSTABLE.get()) return;

        if (EOTooltipConfig.CFG.EO_TOOLTIPS.unstableDesc.get()) {
            tooltip.add(Component.translatable(EOLangKeys.UNSTABLE_INGOT_DESC).withStyle(ChatFormatting.WHITE));
            tooltip.add(Component.translatable(EOLangKeys.UNSTABLE_INGOT_CRAFTING_TABLE).withStyle(ChatFormatting.YELLOW));
            tooltip.add(Component.translatable(EOLangKeys.UNSTABLE_INGOT_WARNING).withStyle(ChatFormatting.RED));
        }

        if (EOTooltipConfig.CFG.EO_TOOLTIPS.unstableTimer.get()) {
            Long explodeAt = stack.get(EODataComponents.UNSTABLE_INGOT_EXPLOSION.get());
            if (explodeAt != null) {
                var level = context.level();
                if (level != null) {
                    long remaining = explodeAt - level.getGameTime();
                    long seconds = Math.max(0, remaining / 20);

                    ChatFormatting color = seconds <= 3 ? ChatFormatting.RED : seconds <= 6 ? ChatFormatting.YELLOW : ChatFormatting.GREEN;
                    tooltip.add(Component.translatable(EOLangKeys.UNSTABLE_INGOT_TIMER, seconds).withStyle(color));
                }
            }
        }
    }

    @Override
    public void inventoryTick(@NotNull ItemStack stack, Level level, @NotNull Entity entity, int slot, boolean selected) {
        if (level.isClientSide || !(entity instanceof Player player)) return;

        if (!CFG.EO_EVENTS.unstableExplosion.getAsBoolean()) return;

        Long explodeAt = stack.get(EODataComponents.UNSTABLE_INGOT_EXPLOSION.get());

        if (explodeAt == null) {
            if (!stack.has(EODataComponents.UNSTABLE_INGOT_CRAFTED.get())) {
                if (player.containerMenu instanceof CraftingMenu craftingMenu) {
                    stack.set(EODataComponents.UNSTABLE_INGOT_CRAFTED.get(), craftingMenu.containerId);
                    stack.set(EODataComponents.UNSTABLE_INGOT_EXPLOSION.get(), level.getGameTime() + 200L);
                    return;
                }

                stack.setCount(0);
                return;
            }

            stack.set(EODataComponents.UNSTABLE_INGOT_EXPLOSION.get(), level.getGameTime() + 200L);
            return;
        }

        Integer craftedInId = stack.get(EODataComponents.UNSTABLE_INGOT_CRAFTED.get());
        if (craftedInId != null && player.containerMenu.containerId != craftedInId) {
            stack.remove(EODataComponents.UNSTABLE_INGOT_EXPLOSION.get());
            stack.remove(EODataComponents.UNSTABLE_INGOT_CRAFTED.get());
            stack.shrink(1);
            explode(level, entity.blockPosition(), player);
            return;
        }

        if (level.getGameTime() >= explodeAt) {
            stack.remove(EODataComponents.UNSTABLE_INGOT_EXPLOSION.get());
            stack.remove(EODataComponents.UNSTABLE_INGOT_CRAFTED.get());
            stack.shrink(1);
            explode(level, entity.blockPosition(), player);
        }
    }

    @Override
    public void onCraftedBy(@NotNull ItemStack stack, @NotNull Level level, @NotNull Player player) {
        if (level.isClientSide) return;

        if (!CFG.EO_EVENTS.unstableExplosion.getAsBoolean()) return;

        if (!(player.containerMenu instanceof CraftingMenu craftingMenu)) {
            stack.setCount(0);
            return;
        }

        stack.set(EODataComponents.UNSTABLE_INGOT_CRAFTED.get(), craftingMenu.containerId);
        stack.set(EODataComponents.UNSTABLE_INGOT_EXPLOSION.get(), level.getGameTime() + 200L);
    }

    @Override
    public boolean canFitInsideContainerItems(@NotNull ItemStack stack) {
        return !stack.has(EODataComponents.UNSTABLE_INGOT_CRAFTED.get());
    }

    @Override
    public void onCraftedPostProcess(@NotNull ItemStack stack, @NotNull Level level) {
        if (!CFG.EO_EVENTS.unstableDeletion.getAsBoolean()) return;
        stack.setCount(0);
    }

    @Override
    public boolean onEntityItemUpdate(@NotNull ItemStack stack, @NotNull ItemEntity entity) {
        if (entity.level().isClientSide() || entity.isRemoved()) return false;

        if (!CFG.EO_EVENTS.unstableDeletion.getAsBoolean()) return false;

        if (stack.has(EODataComponents.UNSTABLE_INGOT_EXPLOSION.get())) {
            entity.discard();
            Player nearest = entity.level().getNearestPlayer(entity, 5.0);
            if (nearest != null) {
                explode(entity.level(), entity.blockPosition(), nearest);
            } else {
                entity.level().explode(null, entity.getX(), entity.getY(), entity.getZ(),
                        5.0f, Level.ExplosionInteraction.TNT);
            }
            return true;
        }

        if (!stack.has(EODataComponents.UNSTABLE_INGOT_CRAFTED.get())) {
            entity.discard();
            return true;
        }

        return false;
    }

    public static void explode(Level level, BlockPos pos, Player player) {
        if (!CFG.EO_EVENTS.unstableDeletion.getAsBoolean()) return;
        if (!level.isClientSide) {
            LOG.info("[EOUnstableIngot] An unfortunate event happened at {} for player {}", pos, player.getName().getString());
            player.hurt(level.damageSources().explosion(null, null), 50.0f);
            level.explode(null, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5,
                    5.0f, Level.ExplosionInteraction.TNT);
        }
    }
}
