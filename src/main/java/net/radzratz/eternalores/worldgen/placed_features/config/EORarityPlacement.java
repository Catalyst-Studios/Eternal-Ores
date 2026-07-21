package net.radzratz.eternalores.worldgen.placed_features.config;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.levelgen.placement.PlacementContext;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.placement.PlacementModifierType;
import net.radzratz.eternalores.util.config.EOWorldGenConfig;
import net.radzratz.eternalores.worldgen.EOWorldGenRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.stream.Stream;

public class EORarityPlacement extends PlacementModifier {
    private final ResourceLocation oreId;

    public EORarityPlacement(ResourceLocation oreId) {
        this.oreId = oreId;
    }

    public static final MapCodec<EORarityPlacement> CODEC =
            RecordCodecBuilder.mapCodec(inst -> inst.group(
                    ResourceLocation.CODEC.fieldOf("ore").forGetter(p -> p.oreId)
            ).apply(inst, EORarityPlacement::new));

    @Override
    public @NotNull Stream<BlockPos> getPositions(@NotNull PlacementContext context, @NotNull RandomSource random, @NotNull BlockPos pos) {

        boolean rare = EOWorldGenConfig.CONFIG.ores.isRare(oreId);

        if (!rare) {
            return Stream.of(pos);
        }

        if (random.nextInt(10) == 0) {
            return Stream.of(pos);
        }

        return Stream.empty();
    }

    @Override
    public @NotNull PlacementModifierType<?> type() {
        return EOWorldGenRegistries.CONFIG_RARITY_PLACEMENT.get();
    }
}
