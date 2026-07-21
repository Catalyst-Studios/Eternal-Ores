package net.radzratz.eternalores.item.types;

import net.minecraft.core.Direction;
import net.minecraft.core.Position;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ProjectileItem;
import net.minecraft.world.level.Level;
import net.radzratz.eternalores.entities.EOEntityRegistry;
import net.radzratz.eternalores.item.special.throwables.EOPebble;
import org.jetbrains.annotations.NotNull;

import java.util.function.BooleanSupplier;

import static net.radzratz.eternalores.util.config.EOEventsConfig.CFG;

public class EOPebbleItem extends EOConfigItem implements ProjectileItem {
    public EOPebbleItem(Properties properties, BooleanSupplier materialSet, BooleanSupplier individualItem) {
        super(properties, materialSet, individualItem);
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(@NotNull Level level, Player player, @NotNull InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);

        if (!CFG.EO_EVENTS.pebbleThrow.get()) {
            return InteractionResultHolder.pass(stack);
        }

        level.playSound(
                null,
                player.getX(),
                player.getY(),
                player.getZ(),
                SoundEvents.SNOWBALL_THROW,
                SoundSource.NEUTRAL,
                0.5F,
                0.4F / (level.getRandom().nextFloat() * 0.4F + 0.8F)
        );

        if (!level.isClientSide()) {
            EOPebble pebble = new EOPebble(EOEntityRegistry.PEBBLE.get(), player, level);
            pebble.setItem(stack);
            pebble.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 1.5F, 1.0F);
            level.addFreshEntity(pebble);
        }

        if (!player.getAbilities().instabuild) {
            stack.shrink(1);
        }

        player.awardStat(Stats.ITEM_USED.get(this));
        return InteractionResultHolder.sidedSuccess(stack, level.isClientSide());
    }

    @Override
    public @NotNull Projectile asProjectile(@NotNull Level level, Position pos, @NotNull ItemStack itemStack, @NotNull Direction direction) {
        EOPebble pebble = new EOPebble(level, pos.x(), pos.y(), pos.z());
        pebble.setItem(itemStack);
        return pebble;
    }
}
