package net.radzratz.eternalores.item.special.throwables;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.radzratz.eternalores.entities.EOEntityRegistry;
import org.jetbrains.annotations.NotNull;

import static net.radzratz.eternalores.util.EOMaterials.materialSets.STONE_SET;
import static net.radzratz.eternalores.util.config.EOEventsConfig.CFG;

public class EOPebble extends ThrowableItemProjectile {
    public EOPebble(EntityType<? extends ThrowableItemProjectile> entityType, Level level) {
        super(entityType, level);
    }

    public EOPebble(EntityType<? extends ThrowableItemProjectile> entityType, LivingEntity thrower, Level level) {
        super(entityType, thrower, level);
    }

    public EOPebble(Level level, double x, double y, double z) {
        super(EOEntityRegistry.PEBBLE.get(), x, y, z, level);
    }

    @Override
    protected void onHitEntity(@NotNull EntityHitResult result) {
        super.onHitEntity(result);
        result.getEntity().hurt(this.damageSources().thrown(this, this.getOwner()), CFG.EO_EVENTS.pebbleDamage.get());
    }

    @Override
    protected void onHit(@NotNull HitResult result) {
        super.onHit(result);
        if (!this.level().isClientSide()) {
            this.discard();
        }
    }

    @Override
    protected @NotNull Item getDefaultItem() {
        return STONE_SET.PEBBLE.get();
    }
}
