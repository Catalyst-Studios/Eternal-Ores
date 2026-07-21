package net.radzratz.eternalores.datagen.tags;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.BiomeTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.radzratz.eternalores.EternalOres;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

import static net.minecraft.world.level.biome.Biomes.*;
import static net.radzratz.eternalores.util.tags.biome.EOBiomeTags.Biomes.*;
import static net.radzratz.eternalores.worldgen.biomes.EOBiomeRegistry.*;

public class EOBiomeTagProvider extends BiomeTagsProvider {
    public EOBiomeTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> provider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, provider, EternalOres.id, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        this.tag(IS_MINING_DIM).addOptional(MINING.location());
        this.tag(IS_DEEP_DARK).add(DEEP_DARK);
        this.tag(IS_CRIMSON_FOREST).add(CRIMSON_FOREST);
        this.tag(IS_WARPED_FOREST).add(WARPED_FOREST);
        this.tag(IS_WASTES).add(NETHER_WASTES);
        this.tag(IS_MEADOW).add(MEADOW);
        this.tag(IS_END_HIGHLANDS).add(END_HIGHLANDS);
        this.tag(IS_END_BARRENS).add(END_BARRENS);
        this.tag(IS_SNOWY_MOUNTAINS).add(SNOWY_SLOPES);
        this.tag(IS_SOUL_SAND_VALLEY).add(SOUL_SAND_VALLEY);
        this.tag(IS_DRIPSTONE_CAVES).add(DRIPSTONE_CAVES);
        this.tag(IS_OLD_GROWTH_TAIGA).add(OLD_GROWTH_SPRUCE_TAIGA);
        this.tag(IS_OLD_GROWTH_PINE_TAIGA).add(OLD_GROWTH_PINE_TAIGA);
        this.tag(IS_JAGGED_PEAKS).add(JAGGED_PEAKS);
        this.tag(IS_WARM_OCEAN).add(WARM_OCEAN);
        this.tag(IS_BASALT_DELTAS).add(BASALT_DELTAS);
    }
}
