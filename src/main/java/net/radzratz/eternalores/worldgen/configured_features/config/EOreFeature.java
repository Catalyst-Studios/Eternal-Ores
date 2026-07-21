package net.radzratz.eternalores.worldgen.configured_features.config;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.radzratz.eternalores.util.config.EOWorldGenConfig;

import java.util.List;
import java.util.Optional;

public class EOreFeature extends Feature<EOreFeature.EOreFeatureConfig> {
    public EOreFeature() {
        super(EOreFeatureConfig.CODEC);
    }

    public record EOreFeatureConfig(List<OreConfiguration.TargetBlockState> targetList, ResourceLocation oreId) implements FeatureConfiguration {
        public static final Codec<EOreFeatureConfig> CODEC =
                RecordCodecBuilder.create(app -> app.group(
                        Codec.list(OreConfiguration.TargetBlockState.CODEC)
                                .fieldOf("targets")
                                .forGetter(cfg -> cfg.targetList),
                        ResourceLocation.CODEC
                                .fieldOf("ore")
                                .forGetter(cfg -> cfg.oreId)
                ).apply(app, EOreFeatureConfig::new));

        public int getSize() {
            return EOWorldGenConfig.CONFIG.ores.getVeinSize(oreId);
        }

        public double getDiscardChance() {
            return EOWorldGenConfig.CONFIG.ores.getDiscardChance(oreId);
        }
    }

    @Override
    public boolean place(FeaturePlaceContext<EOreFeatureConfig> ctx) {
        OreConfiguration vanillaConfig =
                new OreConfiguration(
                        ctx.config().targetList, ctx.config().getSize(), (float) ctx.config().getDiscardChance());

        return Feature.ORE.place(new FeaturePlaceContext<>(
                Optional.empty(), ctx.level(), ctx.chunkGenerator(), ctx.random(), ctx.origin(), vanillaConfig));
    }
}
