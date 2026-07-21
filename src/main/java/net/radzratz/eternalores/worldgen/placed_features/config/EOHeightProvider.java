package net.radzratz.eternalores.worldgen.placed_features.config;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.WorldGenerationContext;
import net.minecraft.world.level.levelgen.heightproviders.HeightProvider;
import net.minecraft.world.level.levelgen.heightproviders.HeightProviderType;
import net.minecraft.world.level.levelgen.heightproviders.TrapezoidHeight;
import net.minecraft.world.level.levelgen.heightproviders.UniformHeight;
import net.radzratz.eternalores.util.config.EOWorldGenConfig;
import net.radzratz.eternalores.worldgen.EOWorldGenRegistries;
import org.jetbrains.annotations.NotNull;

public class EOHeightProvider extends HeightProvider {
    private final ResourceLocation oreId;

    public EOHeightProvider(ResourceLocation oreId) {
        this.oreId = oreId;
    }
    public static final MapCodec<EOHeightProvider> CODEC =
            RecordCodecBuilder.mapCodec(inst -> inst.group(
                    ResourceLocation.CODEC.fieldOf("ore").forGetter(p -> p.oreId)
            ).apply(inst, EOHeightProvider::new));

    @Override
    public int sample(@NotNull RandomSource random, @NotNull WorldGenerationContext context) {

        int min = EOWorldGenConfig.CONFIG.ores.getMinY(oreId);
        int max = EOWorldGenConfig.CONFIG.ores.getMaxY(oreId);
        boolean triangle = EOWorldGenConfig.CONFIG.ores.isTriangle(oreId);

        HeightProvider provider = triangle
                ? TrapezoidHeight.of(
                VerticalAnchor.absolute(min),
                VerticalAnchor.absolute(max))
                : UniformHeight.of(
                VerticalAnchor.absolute(min),
                VerticalAnchor.absolute(max));

        return provider.sample(random, context);
    }

    @Override
    public @NotNull HeightProviderType<?> getType() {
        return EOWorldGenRegistries.CONFIG_HEIGHT.get();
    }
}
