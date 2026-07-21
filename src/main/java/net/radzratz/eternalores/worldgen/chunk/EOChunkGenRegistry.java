package net.radzratz.eternalores.worldgen.chunk;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.worldgen.chunk.mining_dim.EOMiningChunkGenerator;

import java.util.function.Supplier;

public class EOChunkGenRegistry {
    public static final DeferredRegister<MapCodec<? extends ChunkGenerator>> CHUNK_GENERATORS =
            DeferredRegister.create(Registries.CHUNK_GENERATOR, EternalOres.id);

    public static final Supplier<MapCodec<EOMiningChunkGenerator>> MINING = CHUNK_GENERATORS.register("mining_chunk_generator", () -> EOMiningChunkGenerator.CODEC);

    public static void rgtr(IEventBus bus) {
        CHUNK_GENERATORS.register(bus);
    }
}
