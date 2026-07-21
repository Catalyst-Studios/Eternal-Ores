package net.radzratz.eternalores.worldgen.biomes;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;

import static net.radzratz.eternalores.util.EOUtils.EO;
import static net.radzratz.eternalores.worldgen.biomes.mining.EOMiningBiome.miningBiome;

public class EOBiomeRegistry {
    public static final ResourceKey<Biome> MINING = ResourceKey.create(Registries.BIOME, EO("mining"));

    public static void biomeRegistry(BootstrapContext<Biome> ctx) {
        ctx.register(MINING, miningBiome(ctx));
    }
}
