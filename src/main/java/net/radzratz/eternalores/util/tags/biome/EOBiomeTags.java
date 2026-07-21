package net.radzratz.eternalores.util.tags.biome;

import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;

import static net.radzratz.eternalores.util.EOUtils.C;
import static net.radzratz.eternalores.util.EOUtils.EO;

public class EOBiomeTags {
    public static class Biomes {
        public static final TagKey<Biome> IS_MINING_DIM = crteBiomeTags("is_mining_dim");
        public static final TagKey<Biome> IS_DEEP_DARK = crteBiomeCTags("is_deep_dark");
        public static final TagKey<Biome> IS_CRIMSON_FOREST = crteBiomeCTags("is_crimson_forest");
        public static final TagKey<Biome> IS_WARPED_FOREST = crteBiomeCTags("is_warped_forest");
        public static final TagKey<Biome> IS_WASTES = crteBiomeCTags("is_wastes");
        public static final TagKey<Biome> IS_MEADOW = crteBiomeCTags("is_meadow");
        public static final TagKey<Biome> IS_END_HIGHLANDS = crteBiomeCTags("is_end_highlands");
        public static final TagKey<Biome> IS_END_BARRENS = crteBiomeCTags("is_end_barrens");
        public static final TagKey<Biome> IS_SNOWY_MOUNTAINS = crteBiomeCTags("is_snowy_mountains");
        public static final TagKey<Biome> IS_SOUL_SAND_VALLEY = crteBiomeCTags("is_soul_sand_valley");
        public static final TagKey<Biome> IS_DRIPSTONE_CAVES = crteBiomeCTags("is_dripstone_caves");
        public static final TagKey<Biome> IS_OLD_GROWTH_TAIGA = crteBiomeCTags("is_old_growth_taiga");
        public static final TagKey<Biome> IS_OLD_GROWTH_PINE_TAIGA = crteBiomeCTags("is_old_growth_pine_taiga");
        public static final TagKey<Biome> IS_JAGGED_PEAKS = crteBiomeCTags("is_jagged_peaks");
        public static final TagKey<Biome> IS_WARM_OCEAN = crteBiomeCTags("is_warm_ocean");
        public static final TagKey<Biome> IS_BASALT_DELTAS = crteBiomeCTags("is_basalt_deltas");

        @SuppressWarnings("all")
        private static TagKey<Biome> crteBiomeTags(String id) {
            return TagKey.create(Registries.BIOME, EO(id));
        }

        private static TagKey<Biome> crteBiomeCTags(String id) {
            return TagKey.create(Registries.BIOME, C(id));
        }
    }
}
