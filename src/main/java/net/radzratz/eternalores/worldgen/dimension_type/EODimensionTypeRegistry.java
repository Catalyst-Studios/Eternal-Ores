package net.radzratz.eternalores.worldgen.dimension_type;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.dimension.DimensionType;

import java.util.OptionalLong;

import static net.minecraft.tags.BlockTags.INFINIBURN_OVERWORLD;
import static net.minecraft.world.level.dimension.BuiltinDimensionTypes.OVERWORLD_EFFECTS;
import static net.radzratz.eternalores.util.EOUtils.EO;

public class EODimensionTypeRegistry {
    public static final ResourceKey<DimensionType> MINING = ResourceKey.create(Registries.DIMENSION_TYPE, EO("mining"));

    public static void dimensionTypeRegistry(BootstrapContext<DimensionType> ctx) {
        dimType(ctx,
                MINING,
                true,
                false,
                false,
                false,
                1.0d,
                true,
                false,
                -192,
                384,
                384,
                INFINIBURN_OVERWORLD,
                OVERWORLD_EFFECTS,
                0.0f,
                false,
                false,
                0,
                7,
                0
        );
    }

    public static void dimType(BootstrapContext<DimensionType> ctx, ResourceKey<DimensionType> rKey, boolean hasSkyLight, boolean hasCeiling, boolean ultraWarm, boolean natural, double cords, boolean bedWorks, boolean respawnAnchorWorks, int minY, int maxY, int logicalHeight, TagKey<Block> bTag, ResourceLocation dType, float ambientLight, boolean pigSafe, boolean hasRaids, int minInclusive, int maxInclusive, int spawnLightLimit) {
        ctx.register(rKey, new DimensionType(OptionalLong.empty(), hasSkyLight, hasCeiling, ultraWarm, natural, cords, bedWorks, respawnAnchorWorks, minY, maxY, logicalHeight,
                bTag, dType, ambientLight, monsterSettings(pigSafe, hasRaids, minInclusive, maxInclusive, spawnLightLimit)));
    }

    public static DimensionType.MonsterSettings monsterSettings(boolean pigSafe, boolean hasRaids, int minInclusive, int maxInclusive, int spawnLightLimit) {
        return new DimensionType.MonsterSettings(pigSafe, hasRaids, UniformInt.of(minInclusive, maxInclusive), spawnLightLimit);
    }
}
