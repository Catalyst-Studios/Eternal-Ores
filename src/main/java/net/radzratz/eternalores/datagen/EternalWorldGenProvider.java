package net.radzratz.eternalores.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.worldgen.EternalBiomeModifier;
import net.radzratz.eternalores.worldgen.EternalConfiguredFeatures;
import net.radzratz.eternalores.worldgen.EternalPlacedFeatures;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class EternalWorldGenProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, EternalConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, EternalPlacedFeatures::bootstrap)
            .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, EternalBiomeModifier::bootstrap);

    public EternalWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(EternalOres.MOD_ID));
    }
}
