package net.radzratz.eternalores.util.compat.mekanism.conditions;

import com.mojang.serialization.MapCodec;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.conditions.ICondition;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.radzratz.eternalores.EternalOres;

public class EOMKConditionRegistry {
    public static final DeferredRegister<MapCodec<? extends ICondition>> CONDITIONS = DeferredRegister.create(NeoForgeRegistries.CONDITION_SERIALIZERS, EternalOres.id);

    public static final DeferredHolder<MapCodec<? extends ICondition>, MapCodec<EOChemicalCondition>> CHEMICAL_ENABLED =
            CONDITIONS.register("chemical_enabled", () -> EOChemicalCondition.CODEC);

    public static void rgtr(IEventBus bus) {
        CONDITIONS.register(bus);
    }
}
