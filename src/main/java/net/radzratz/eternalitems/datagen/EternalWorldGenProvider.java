package net.radzratz.eternalitems.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.radzratz.eternalitems.EternalItems;
import net.radzratz.eternalitems.worldgen.EternalBiomeModifier;
import net.radzratz.eternalitems.worldgen.EternalConfiguredFeatures;
import net.radzratz.eternalitems.worldgen.EternalPlacedFeatures;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class EternalWorldGenProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, EternalConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, EternalPlacedFeatures::bootstrap)
            .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, EternalBiomeModifier::bootstrap);

    public EternalWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(EternalItems.MOD_ID));
    }
}
