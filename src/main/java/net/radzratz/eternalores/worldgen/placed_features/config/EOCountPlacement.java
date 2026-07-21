package net.radzratz.eternalores.worldgen.placed_features.config;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.levelgen.placement.PlacementModifierType;
import net.minecraft.world.level.levelgen.placement.RepeatingPlacement;
import net.radzratz.eternalores.util.config.EOWorldGenConfig;
import net.radzratz.eternalores.worldgen.EOWorldGenRegistries;
import org.jetbrains.annotations.NotNull;

public class EOCountPlacement extends RepeatingPlacement {
    private final ResourceLocation oreId;

    public EOCountPlacement(ResourceLocation oreId) {
        this.oreId = oreId;
    }

    public static final MapCodec<EOCountPlacement> CODEC =
            RecordCodecBuilder.mapCodec(inst -> inst.group(
                    ResourceLocation.CODEC.fieldOf("ore").forGetter(p -> p.oreId)
            ).apply(inst, EOCountPlacement::new));

    @Override
    protected int count(@NotNull RandomSource randomSource, @NotNull BlockPos blockPos) {
        return EOWorldGenConfig.CONFIG.ores.getVeinsPerChunk(oreId);
    }

    @Override
    public @NotNull PlacementModifierType<?> type() {
        return EOWorldGenRegistries.CONFIG_COUNT_PLACEMENT.get();
    }
}
