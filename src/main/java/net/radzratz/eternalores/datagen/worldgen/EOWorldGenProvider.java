package net.radzratz.eternalores.datagen.worldgen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.worldgen.biome_modifier.EOBiomeModifier;
import net.radzratz.eternalores.worldgen.configured_features.EOConfiguredFeatures;
import net.radzratz.eternalores.worldgen.placed_features.EOPlacedFeatures;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class EOWorldGenProvider extends DatapackBuiltinEntriesProvider
{
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, EOConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, EOPlacedFeatures::bootstrap)
            .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, EOBiomeModifier::bootstrap);

    public EOWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries, BUILDER, Set.of(EternalOres.MOD_ID));
    }
}
