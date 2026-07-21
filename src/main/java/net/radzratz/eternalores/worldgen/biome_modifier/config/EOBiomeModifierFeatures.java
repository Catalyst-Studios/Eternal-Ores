package net.radzratz.eternalores.worldgen.biome_modifier.config;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.ModifiableBiomeInfo;
import net.radzratz.eternalores.util.config.EOWorldGenConfig;
import net.radzratz.eternalores.worldgen.EOWorldGenRegistries;
import org.jetbrains.annotations.NotNull;

public record EOBiomeModifierFeatures(HolderSet<Biome> bms, HolderSet<PlacedFeature> ftrs, GenerationStep.Decoration step, ResourceLocation oreId) implements BiomeModifier {
    @Override
    public void modify(@NotNull Holder<Biome> bme, @NotNull Phase phs, ModifiableBiomeInfo.BiomeInfo.@NotNull Builder bldr) {
        if (phs != Phase.ADD) return;
        if (!bms.contains(bme)) return;

        if (!EOWorldGenConfig.OreGenerationConfig.isOreEnabled(oreId)) {
            return;
        }

        var gen = bldr.getGenerationSettings();
        ftrs.forEach(f -> gen.addFeature(step, f));
    }

    public static final MapCodec<EOBiomeModifierFeatures> CODEC =
            RecordCodecBuilder.mapCodec(inst -> inst.group(
                    Biome.LIST_CODEC.fieldOf("biomes").forGetter(EOBiomeModifierFeatures::bms),
                    PlacedFeature.LIST_CODEC.fieldOf("features").forGetter(EOBiomeModifierFeatures::ftrs),
                    GenerationStep.Decoration.CODEC.fieldOf("step").forGetter(EOBiomeModifierFeatures::step),
                    ResourceLocation.CODEC.fieldOf("ore").forGetter(EOBiomeModifierFeatures::oreId)
            ).apply(inst, EOBiomeModifierFeatures::new));

    @Override
    public @NotNull MapCodec<? extends BiomeModifier> codec() {
        return EOWorldGenRegistries.CONFIG_ORE.get();
    }
}
