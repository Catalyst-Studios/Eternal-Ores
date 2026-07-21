package net.radzratz.eternalores.worldgen.chunk.mining_dim;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.WorldGenRegion;
import net.minecraft.world.level.LevelHeightAccessor;
import net.minecraft.world.level.NoiseColumn;
import net.minecraft.world.level.StructureManager;
import net.minecraft.world.level.biome.BiomeManager;
import net.minecraft.world.level.biome.BiomeSource;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.RandomState;
import net.minecraft.world.level.levelgen.blending.Blender;
import net.radzratz.eternalores.util.config.EOMiningDimensionConfig;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class EOMiningChunkGenerator extends ChunkGenerator {
    public static final MapCodec<EOMiningChunkGenerator> CODEC =
            RecordCodecBuilder.mapCodec(instance ->
                    instance.group(
                            BiomeSource.CODEC.fieldOf("biome_source").forGetter(gen -> gen.biomeSource)
                    ).apply(instance, EOMiningChunkGenerator::new)
            );

    public EOMiningChunkGenerator(BiomeSource biomeSource) {
        super(biomeSource);
    }

    @Override
    protected @NotNull MapCodec<? extends ChunkGenerator> codec() {
        return CODEC;
    }

    @Override
    public @NotNull CompletableFuture<ChunkAccess> fillFromNoise(@NotNull Blender bldr, @NotNull RandomState state, @NotNull StructureManager structures, @NotNull ChunkAccess chunk) {
        generateChunk(chunk);
        return CompletableFuture.completedFuture(chunk);
    }

    /**
     * Fills every column of the chunk with the appropriate block for each Y level.
     * Reads layer boundaries fresh from config on each call.
     */
    private void generateChunk(ChunkAccess chunk) {
        BlockPos.MutableBlockPos pos = new BlockPos.MutableBlockPos();
        int baseX = chunk.getPos().getMinBlockX();
        int baseZ = chunk.getPos().getMinBlockZ();

        int minY = getMinY();
        int maxY = minY + getGenDepth();

        for (int x = 0; x < 16; x++) {
            for (int z = 0; z < 16; z++) {
                for (int y = minY; y < maxY; y++) {
                    BlockState state = getBlockForHeight(y);
                    if (state.isAir()) continue;

                    pos.set(baseX + x, y, baseZ + z);
                    chunk.setBlockState(pos, state, false);
                }
            }
        }
    }

    /**
     * Layer order bottom to top:
     *
     * <pre>
     *   Bedrock > bedrockLevel (single layer)
     *   End Stone -> bedrockLevel+1 to endStart-1
     *   Nether -> endStart to netherStart-1
     *   Deepslate -> netherStart to deepslateStart-1
     *   Stone -> deepslateStart to stoneStart-1
     *   Deepslate -> stoneStart to dirtStart-1
     *   Dirt -> dirtStart to grassLevel-1
     *   Grass -> grassLevel
     *   Air -> above grassLevel
     * </pre>
     */
    private BlockState getBlockForHeight(int y) {
        var cfg = EOMiningDimensionConfig.CONFIG.miningDimension;

        int bedrock = cfg.bedrockLevel.get();
        int endStart = cfg.endStart.get();
        int netherStart = cfg.netherStart.get();
        int deepStart = cfg.deepslateStart.get();
        int dirtStart = cfg.dirtStart.get();
        int grassLevel = cfg.grassLevel.get();

        if (y <= bedrock) return Blocks.BEDROCK.defaultBlockState();
        if (y < endStart) return Blocks.END_STONE.defaultBlockState();
        if (y < netherStart) return Blocks.NETHERRACK.defaultBlockState();
        if (y < deepStart) return Blocks.DEEPSLATE.defaultBlockState();
        if (y < dirtStart) return Blocks.STONE.defaultBlockState();
        if (y < grassLevel) return Blocks.DIRT.defaultBlockState();
        if (y == grassLevel) return Blocks.GRASS_BLOCK.defaultBlockState();

        return Blocks.AIR.defaultBlockState();
    }

    @Override
    public int getSpawnHeight(@NotNull LevelHeightAccessor level) {
        return EOMiningDimensionConfig.CONFIG.miningDimension.getSafeSpawnY();
    }

    @Override
    public int getBaseHeight(int x, int z, Heightmap.@NotNull Types type, @NotNull LevelHeightAccessor level, @NotNull RandomState random) {
        return EOMiningDimensionConfig.CONFIG.miningDimension.grassLevel.get();
    }

    @Override
    public @NotNull NoiseColumn getBaseColumn(int x, int z, LevelHeightAccessor level, @NotNull RandomState random) {
        int minY = level.getMinBuildHeight();
        BlockState[] states = new BlockState[level.getHeight()];
        for (int i = 0; i < states.length; i++) {
            states[i] = getBlockForHeight(minY + i);
        }
        return new NoiseColumn(minY, states);
    }

    @Override
    public int getMinY() {
        return EOMiningDimensionConfig.CONFIG.miningDimension.bedrockLevel.get();
    }

    @Override
    public int getGenDepth() {
        int minY = getMinY();
        int top  = EOMiningDimensionConfig.CONFIG.miningDimension.worldTop.get();
        return top - minY + 1;
    }

    @Override
    public int getSeaLevel() {
        return 0;
    }

    @Override
    public void applyCarvers(@NotNull WorldGenRegion region, long seed, @NotNull RandomState random, @NotNull BiomeManager biomeManager,
                             @NotNull StructureManager structures, @NotNull ChunkAccess chunk, GenerationStep.@NotNull Carving step) {}

    @Override
    public void buildSurface(@NotNull WorldGenRegion region, @NotNull StructureManager structures, @NotNull RandomState random, @NotNull ChunkAccess chunk) {}

    @Override
    public void spawnOriginalMobs(@NotNull WorldGenRegion region) {}

    @Override
    public void addDebugScreenInfo(@NotNull List<String> info, @NotNull RandomState random, @NotNull BlockPos pos) {
        info.add("EO Mining Dimension");
    }
}
