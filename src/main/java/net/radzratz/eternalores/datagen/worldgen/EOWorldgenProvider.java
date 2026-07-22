package net.radzratz.eternalores.datagen.worldgen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.worldgen.biome_modifier.EOBiomeModifier;
import net.radzratz.eternalores.worldgen.configured_features.EOConfiguredFeatures;
import net.radzratz.eternalores.worldgen.dimensions.EODimensionRegistry;
import net.radzratz.eternalores.worldgen.placed_features.EOPlacedFeatures;
import net.radzratz.eternalores.worldgen.biomes.EOBiomeRegistry;
import net.radzratz.eternalores.worldgen.dimension_type.EODimensionTypeRegistry;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

import static net.minecraft.core.registries.Registries.*;
import static net.neoforged.neoforge.registries.NeoForgeRegistries.Keys.BIOME_MODIFIERS;

public class EOWorldgenProvider extends DatapackBuiltinEntriesProvider {
    public EOWorldgenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> reg) {
        super(output, reg, ETERNAL_ORES_WORLD_GEN, Set.of(EternalOres.id));
    }

    public static final RegistrySetBuilder ETERNAL_ORES_WORLD_GEN = new RegistrySetBuilder()
            .add(Registries.BIOME, EOBiomeRegistry::biomeRegistry)

            .add(Registries.DIMENSION_TYPE, EODimensionTypeRegistry::dimensionTypeRegistry)

            .add(Registries.LEVEL_STEM, EODimensionRegistry::dimensionRegistry)

            .add(CONFIGURED_FEATURE, EOConfiguredFeatures::configuredFeaturesRegistry)
            .add(PLACED_FEATURE, EOPlacedFeatures::placedFeaturesRegistry)
            .add(BIOME_MODIFIERS, EOBiomeModifier::biomeModifierRegistry);
}
