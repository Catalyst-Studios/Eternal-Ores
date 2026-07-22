package net.radzratz.eternalores.worldgen.dimensions;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.FixedBiomeSource;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.LevelStem;
import net.radzratz.eternalores.worldgen.biomes.EOBiomeRegistry;
import net.radzratz.eternalores.worldgen.chunk.mining_dim.EOMiningChunkGenerator;
import net.radzratz.eternalores.worldgen.dimension_type.EODimensionTypeRegistry;

import static net.radzratz.eternalores.util.EOUtils.EO;

public class EODimensionRegistry {
    public static final ResourceKey<LevelStem> MINING = ResourceKey.create(Registries.LEVEL_STEM, EO("mining_dimension"));

    public static void dimensionRegistry(BootstrapContext<LevelStem> ctx) {
        HolderGetter<DimensionType> dimensionTypes = ctx.lookup(Registries.DIMENSION_TYPE);
        HolderGetter<Biome> biomes = ctx.lookup(Registries.BIOME);

        Holder<DimensionType> miningType = dimensionTypes.getOrThrow(EODimensionTypeRegistry.MINING);
        Holder<Biome> miningBiome = biomes.getOrThrow(EOBiomeRegistry.MINING);

        ctx.register(MINING, new LevelStem(miningType, new EOMiningChunkGenerator(new FixedBiomeSource(miningBiome))));
    }
}
