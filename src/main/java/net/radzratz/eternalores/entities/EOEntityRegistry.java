package net.radzratz.eternalores.entities;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.item.special.throwables.EOPebble;

public class EOEntityRegistry {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES;

    public static final DeferredHolder<EntityType<?>, EntityType<EOPebble>> PEBBLE;

    static {
        ENTITY_TYPES = DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, EternalOres.id);

        PEBBLE = ENTITY_TYPES.register("pebbles", () ->
                EntityType.Builder.<EOPebble>of(EOPebble::new, MobCategory.MISC)
                .sized(0.25F, 0.25F)
                .clientTrackingRange(4)
                .updateInterval(10)
                .build("eternal_ores_pebbles"));
    }

    public static void rgtr(IEventBus bus) {
        ENTITY_TYPES.register(bus);
    }
}
