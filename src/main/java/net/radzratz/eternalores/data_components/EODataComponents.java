package net.radzratz.eternalores.data_components;

import com.mojang.serialization.Codec;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.Registries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.radzratz.eternalores.EternalOres;

public class EODataComponents {
    public static final DeferredRegister<DataComponentType<?>> DATA_COMPONENTS = DeferredRegister.create(Registries.DATA_COMPONENT_TYPE, EternalOres.id);

    public static final DeferredHolder<DataComponentType<?>, DataComponentType<Long>> UNSTABLE_INGOT_EXPLOSION =
            rgtrComponent("unstable_explosion", Codec.LONG);

    public static final DeferredHolder<DataComponentType<?>, DataComponentType<Integer>> UNSTABLE_INGOT_CRAFTED =
            rgtrComponent("unstable_crafted_in_menu", Codec.INT);

    private static <T> DeferredHolder<DataComponentType<?>, DataComponentType<T>> rgtrComponent(String name, Codec<T> codec) {
        return DATA_COMPONENTS.register(name, () -> DataComponentType.<T>builder()
                .persistent(codec)
                .build()
        );
    }

    public static void rgtr(IEventBus bus) {
        DATA_COMPONENTS.register(bus);
    }
}
