package net.radzratz.eternalores.worldgen.biomes.mining;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.levelgen.carver.ConfiguredWorldCarver;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class EOMiningBiome {
    public static Biome miningBiome(BootstrapContext<Biome> ctx) {
        HolderGetter<PlacedFeature> placedFeatures = ctx.lookup(Registries.PLACED_FEATURE);
        HolderGetter<ConfiguredWorldCarver<?>> carvers = ctx.lookup(Registries.CONFIGURED_CARVER);
        MobSpawnSettings spawnSettings = new MobSpawnSettings.Builder().build();
        BiomeGenerationSettings generationSettings = new BiomeGenerationSettings.Builder(placedFeatures, carvers).build();

        // Biome
        return biomeBuilder(
                0.8f,
                0.0f,
                false,
                biomeEffects(
                        12638463,
                        7907327,
                        4159204,
                        329011,
                        SoundEvents.AMBIENT_CAVE,
                        6000,
                        8,
                        2.0D
                ),
                spawnSettings,
                generationSettings);
    }

    public static Biome biomeBuilder(float temperature, float downFall, boolean precipitation, BiomeSpecialEffects effects, MobSpawnSettings spawnSets, BiomeGenerationSettings biomeSets) {
        return new Biome.BiomeBuilder()
                .temperature(temperature)
                .downfall(downFall)
                .hasPrecipitation(precipitation)
                .specialEffects(effects)
                .mobSpawnSettings(spawnSets)
                .generationSettings(biomeSets)
                .build();
    }

    public static BiomeSpecialEffects biomeEffects(int fogColor, int skyColor, int waterColor, int waterFogColor, Holder<SoundEvent> soundType, int tickDelay, int blockSearch, double soundPos) {
        return new BiomeSpecialEffects.Builder()
                .fogColor(fogColor)
                .skyColor(skyColor)
                .waterColor(waterColor)
                .waterFogColor(waterFogColor)
                .ambientMoodSound(
                        new AmbientMoodSettings(
                                soundType,
                                tickDelay,
                                blockSearch,
                                soundPos
                        )
                )
                .build();
    }
}
