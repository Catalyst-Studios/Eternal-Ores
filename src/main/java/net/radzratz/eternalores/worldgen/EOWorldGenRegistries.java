package net.radzratz.eternalores.worldgen;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.heightproviders.HeightProviderType;
import net.minecraft.world.level.levelgen.placement.PlacementModifierType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.worldgen.biome_modifier.config.EOBiomeModifierFeatures;
import net.radzratz.eternalores.worldgen.placed_features.config.EOCountPlacement;
import net.radzratz.eternalores.worldgen.placed_features.config.EOHeightProvider;
import net.radzratz.eternalores.worldgen.placed_features.config.EORarityPlacement;
import net.radzratz.eternalores.worldgen.configured_features.config.EOreFeature;

import java.util.function.Supplier;

public class EOWorldGenRegistries {
    public static final DeferredRegister<MapCodec<? extends BiomeModifier>> BIOME_MODIFIER_SERIALIZERS =
            DeferredRegister.create(NeoForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, EternalOres.id);

    public static final DeferredRegister<PlacementModifierType<?>> PLACEMENT_MODIFIERS =
            DeferredRegister.create(Registries.PLACEMENT_MODIFIER_TYPE, EternalOres.id);

    public static final DeferredRegister<HeightProviderType<?>> HEIGHT_PROVIDERS =
            DeferredRegister.create(Registries.HEIGHT_PROVIDER_TYPE, EternalOres.id);

    public static final DeferredRegister<Feature<?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registries.FEATURE, EternalOres.id);

    public static final Supplier<PlacementModifierType<EOCountPlacement>> CONFIG_COUNT_PLACEMENT ;
    public static final Supplier<PlacementModifierType<EORarityPlacement>> CONFIG_RARITY_PLACEMENT;
    public static final Supplier<HeightProviderType<EOHeightProvider>> CONFIG_HEIGHT;
    public static final DeferredHolder<MapCodec<? extends BiomeModifier>, MapCodec<EOBiomeModifierFeatures>> CONFIG_ORE;
    public static final Supplier<EOreFeature> CONFIG_ORE_FEATURE;

    static {
        CONFIG_COUNT_PLACEMENT = PLACEMENT_MODIFIERS.register("config_ore_count", () -> () -> EOCountPlacement.CODEC);
        CONFIG_RARITY_PLACEMENT = PLACEMENT_MODIFIERS.register("config_ore_rarity", () -> () -> EORarityPlacement.CODEC);
        CONFIG_HEIGHT = HEIGHT_PROVIDERS.register("config_ore_height", () -> () -> EOHeightProvider.CODEC);
        CONFIG_ORE = BIOME_MODIFIER_SERIALIZERS.register("config_ore_modifier", () -> EOBiomeModifierFeatures.CODEC);
        CONFIG_ORE_FEATURE = CONFIGURED_FEATURES.register("config_ore_feature", EOreFeature::new);
    }

    public static void rgtr(IEventBus bus) {
        PLACEMENT_MODIFIERS.register(bus);
        HEIGHT_PROVIDERS.register(bus);
        BIOME_MODIFIER_SERIALIZERS.register(bus);
        CONFIGURED_FEATURES.register(bus);
    }
}
