package net.radzratz.eternalores.worldgen.biome_modifier;

import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.radzratz.eternalores.worldgen.biome_modifier.config.EOBiomeModifierFeatures;

import java.util.Arrays;

import static net.minecraft.tags.BiomeTags.*;
import static net.minecraft.world.level.levelgen.GenerationStep.Decoration.UNDERGROUND_ORES;
import static net.neoforged.neoforge.common.Tags.Biomes.IS_SWAMP;
import static net.radzratz.eternalores.util.EOUtils.EO;
import static net.radzratz.eternalores.util.tags.biome.EOBiomeTags.Biomes.IS_DEEP_DARK;
import static net.radzratz.eternalores.util.tags.biome.EOBiomeTags.Biomes.IS_MINING_DIM;
import static net.radzratz.eternalores.worldgen.ores.EOreKeys.*;

public class EOBiomeModifier {
    public static void biomeModifierRegistry(BootstrapContext<BiomeModifier> ctx) {
        var base = IS_OVERWORLD;
        var net = IS_NETHER;
        var end = IS_END;
        var min = IS_MINING_DIM;
        var oc = IS_OCEAN;
        var ground = UNDERGROUND_ORES;

        rgtrCfg(ctx, "aluminum_overworld", ALUMINUM_FEATURE.biomeModifierOverworld(), base, ground, new OreBiomeEntry(ALUMINUM_FEATURE.placedOverworldFeature()));
        rgtrCfg(ctx, "aluminum_mining", ALUMINUM_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(ALUMINUM_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "amber_overworld", AMBER_FEATURE.biomeModifierOverworld(), base, ground, new OreBiomeEntry(AMBER_FEATURE.placedOverworldFeature()));
        rgtrCfg(ctx, "amber_mining", AMBER_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(AMBER_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "ancient_debris_mining", ANCIENT_DEBRIS_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(ANCIENT_DEBRIS_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "anthracite_overworld", ANTHRACITE_FEATURE.biomeModifierOverworld(), base, ground, new OreBiomeEntry(ANTHRACITE_FEATURE.placedOverworldFeature()));
        rgtrCfg(ctx, "anthracite_mining", ANTHRACITE_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(ANTHRACITE_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "apatite_overworld", APATITE_FEATURE.biomeModifierOverworld(), base, ground, new OreBiomeEntry(APATITE_FEATURE.placedOverworldFeature()));
        rgtrCfg(ctx, "apatite_mining", APATITE_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(APATITE_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "ardite_nether", ARDITE_FEATURE.biomeModifierNether(), net, ground, new OreBiomeEntry(ARDITE_FEATURE.placedNetherFeature()));
        rgtrCfg(ctx, "ardite_mining", ARDITE_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(ARDITE_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "beryllium_overworld", BERYLLIUM_FEATURE.biomeModifierOverworld(), base, ground, new OreBiomeEntry(BERYLLIUM_FEATURE.placedOverworldFeature()));
        rgtrCfg(ctx, "beryllium_mining", BERYLLIUM_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(BERYLLIUM_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "bituminous_overworld", BITUMINOUS_FEATURE.biomeModifierOverworld(), base, ground, new OreBiomeEntry(BITUMINOUS_FEATURE.placedOverworldFeature()));
        rgtrCfg(ctx, "bituminous_mining", BITUMINOUS_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(BITUMINOUS_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "cinnabar_overworld", CINNABAR_FEATURE.biomeModifierOverworld(), base, ground, new OreBiomeEntry(CINNABAR_FEATURE.placedOverworldFeature()));
        rgtrCfg(ctx, "cinnabar_nether", CINNABAR_FEATURE.biomeModifierNether(), net, ground, new OreBiomeEntry(CINNABAR_FEATURE.placedNetherFeature()));
        rgtrCfg(ctx, "cinnabar_mining", CINNABAR_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(CINNABAR_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "coal_mining", COAL_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(COAL_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "cobalt_overworld", COBALT_FEATURE.biomeModifierOverworld(), base, ground, new OreBiomeEntry(COBALT_FEATURE.placedOverworldFeature()));
        rgtrCfg(ctx, "cobalt_nether", COBALT_FEATURE.biomeModifierNether(), net, ground, new OreBiomeEntry(COBALT_FEATURE.placedNetherFeature()));
        rgtrCfg(ctx, "cobalt_mining", COBALT_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(COBALT_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "copper_mining", COPPER_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(COPPER_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "diamond_mining", DIAMOND_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(DIAMOND_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "emerald_mining", EMERALD_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(EMERALD_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "fluorite_overworld", FLUORITE_FEATURE.biomeModifierOverworld(), base, ground, new OreBiomeEntry(FLUORITE_FEATURE.placedOverworldFeature()));
        rgtrCfg(ctx, "fluorite_end", FLUORITE_FEATURE.biomeModifierEnd(), end, ground, new OreBiomeEntry(FLUORITE_FEATURE.placedEndFeature()));
        rgtrCfg(ctx, "fluorite_mining", FLUORITE_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(FLUORITE_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "gallium_overworld", GALLIUM_FEATURE.biomeModifierOverworld(), base, ground, new OreBiomeEntry(GALLIUM_FEATURE.placedOverworldFeature()));
        rgtrCfg(ctx, "gallium_nether", GALLIUM_FEATURE.biomeModifierNether(), net, ground, new OreBiomeEntry(GALLIUM_FEATURE.placedNetherFeature()));
        rgtrCfg(ctx, "gallium_mining", GALLIUM_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(GALLIUM_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "garnet_overworld", GARNET_FEATURE.biomeModifierOverworld(), base, ground, new OreBiomeEntry(GARNET_FEATURE.placedOverworldFeature()));
        rgtrCfg(ctx, "garnet_nether", GARNET_FEATURE.biomeModifierNether(), net, ground, new OreBiomeEntry(GARNET_FEATURE.placedNetherFeature()));
        rgtrCfg(ctx, "garnet_mining", GARNET_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(GARNET_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "gold_mining", GOLD_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(GOLD_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "iridium_overworld", IRIDIUM_FEATURE.biomeModifierOverworld(), base, ground, new OreBiomeEntry(IRIDIUM_FEATURE.placedOverworldFeature()));
        rgtrCfg(ctx, "iridium_end", IRIDIUM_FEATURE.biomeModifierEnd(), end, ground, new OreBiomeEntry(IRIDIUM_FEATURE.placedEndFeature()));
        rgtrCfg(ctx, "iridium_mining", IRIDIUM_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(IRIDIUM_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "iron_mining", IRON_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(IRON_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "jade_overworld", JADE_FEATURE.biomeModifierOverworld(), base, ground, new OreBiomeEntry(JADE_FEATURE.placedOverworldFeature()));
        rgtrCfg(ctx, "jade_nether", JADE_FEATURE.biomeModifierNether(), net, ground, new OreBiomeEntry(JADE_FEATURE.placedNetherFeature()));
        rgtrCfg(ctx, "jade_mining", JADE_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(JADE_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "lapis_mining", LAPIS_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(LAPIS_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "lead_overworld", LEAD_FEATURE.biomeModifierOverworld(), base, ground, new OreBiomeEntry(LEAD_FEATURE.placedOverworldFeature()));
        rgtrCfg(ctx, "lead_end", LEAD_FEATURE.biomeModifierEnd(), end, ground, new OreBiomeEntry(LEAD_FEATURE.placedEndFeature()));
        rgtrCfg(ctx, "lead_mining", LEAD_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(LEAD_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "lignite_overworld", LIGNITE_FEATURE.biomeModifierOverworld(), base, ground, new OreBiomeEntry(LIGNITE_FEATURE.placedOverworldFeature()));
        rgtrCfg(ctx, "lignite_mining", LIGNITE_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(LIGNITE_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "molybdenum_overworld", MOLYBDENUM_FEATURE.biomeModifierOverworld(), base, ground, new OreBiomeEntry(MOLYBDENUM_FEATURE.placedOverworldFeature()));
        rgtrCfg(ctx, "molybdenum_nether", MOLYBDENUM_FEATURE.biomeModifierNether(), net, ground, new OreBiomeEntry(MOLYBDENUM_FEATURE.placedNetherFeature()));
        rgtrCfg(ctx, "molybdenum_end", MOLYBDENUM_FEATURE.biomeModifierEnd(), end, ground, new OreBiomeEntry(MOLYBDENUM_FEATURE.placedEndFeature()));
        rgtrCfg(ctx, "molybdenum_mining", MOLYBDENUM_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(MOLYBDENUM_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "necroticarite_nether", NECROTICARITE_FEATURE.biomeModifierNether(), net, ground, new OreBiomeEntry(NECROTICARITE_FEATURE.placedNetherFeature()));
        rgtrCfg(ctx, "necroticarite_mining", NECROTICARITE_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(NECROTICARITE_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "neodymium_overworld", NEODYMIUM_FEATURE.biomeModifierOverworld(), base, ground, new OreBiomeEntry(NEODYMIUM_FEATURE.placedOverworldFeature()));
        rgtrCfg(ctx, "neodymium_end", NEODYMIUM_FEATURE.biomeModifierEnd(), end, ground, new OreBiomeEntry(NEODYMIUM_FEATURE.placedEndFeature()));
        rgtrCfg(ctx, "neodymium_mining", NEODYMIUM_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(NEODYMIUM_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "niter_overworld", NITER_FEATURE.biomeModifierOverworld(), base, ground, new OreBiomeEntry(NITER_FEATURE.placedOverworldFeature()));
        rgtrCfg(ctx, "niter_mining", NITER_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(NITER_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "nickel_overworld", NICKEL_FEATURE.biomeModifierOverworld(), base, ground, new OreBiomeEntry(NICKEL_FEATURE.placedOverworldFeature()));
        rgtrCfg(ctx, "nickel_nether", NICKEL_FEATURE.biomeModifierNether(), net, ground, new OreBiomeEntry(NICKEL_FEATURE.placedNetherFeature()));
        rgtrCfg(ctx, "nickel_mining", NICKEL_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(NICKEL_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "onyx_overworld", ONYX_FEATURE.biomeModifierOverworld(), base, ground, new OreBiomeEntry(ONYX_FEATURE.placedOverworldFeature()));
        rgtrCfg(ctx, "onyx_nether", ONYX_FEATURE.biomeModifierNether(), net, ground, new OreBiomeEntry(ONYX_FEATURE.placedNetherFeature()));
        rgtrCfg(ctx, "onyx_mining", ONYX_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(ONYX_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "obsidian_nether", OBSIDIAN_FEATURE.biomeModifierNether(), net, ground, new OreBiomeEntry(OBSIDIAN_FEATURE.placedNetherFeature()));
        rgtrCfg(ctx, "obsidian_mining", OBSIDIAN_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(OBSIDIAN_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "osmium_overworld", OSMIUM_FEATURE.biomeModifierOverworld(), base, ground, new OreBiomeEntry(OSMIUM_FEATURE.placedOverworldFeature()));
        rgtrCfg(ctx, "osmium_nether", OSMIUM_FEATURE.biomeModifierNether(), net, ground, new OreBiomeEntry(OSMIUM_FEATURE.placedNetherFeature()));
        rgtrCfg(ctx, "osmium_mining", OSMIUM_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(OSMIUM_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "palladium_overworld", PALLADIUM_FEATURE.biomeModifierOverworld(), base, ground, new OreBiomeEntry(PALLADIUM_FEATURE.placedOverworldFeature()));
        rgtrCfg(ctx, "palladium_end", PALLADIUM_FEATURE.biomeModifierEnd(), end, ground, new OreBiomeEntry(PALLADIUM_FEATURE.placedEndFeature()));
        rgtrCfg(ctx, "palladium_mining", PALLADIUM_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(PALLADIUM_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "peat_overworld", PEAT_FEATURE.biomeModifierOverworld(), IS_SWAMP, ground, new OreBiomeEntry(PEAT_FEATURE.placedOverworldFeature()));
        rgtrCfg(ctx, "peat_mining", PEAT_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(PEAT_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "pearl_overworld", PEARL_FEATURE.biomeModifierOverworld(), oc, ground, new OreBiomeEntry(PEARL_FEATURE.placedOverworldFeature()));
        rgtrCfg(ctx, "pearl_mining", PEARL_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(PEARL_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "peridot_overworld", PERIDOT_FEATURE.biomeModifierOverworld(), base, ground, new OreBiomeEntry(PERIDOT_FEATURE.placedOverworldFeature()));
        rgtrCfg(ctx, "peridot_nether", PERIDOT_FEATURE.biomeModifierNether(), net, ground, new OreBiomeEntry(PERIDOT_FEATURE.placedNetherFeature()));
        rgtrCfg(ctx, "peridot_mining", PERIDOT_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(PERIDOT_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "platinum_overworld", PLATINUM_FEATURE.biomeModifierOverworld(), base, ground, new OreBiomeEntry(PLATINUM_FEATURE.placedOverworldFeature()));
        rgtrCfg(ctx, "platinum_end", PLATINUM_FEATURE.biomeModifierEnd(), end, ground, new OreBiomeEntry(PLATINUM_FEATURE.placedEndFeature()));
        rgtrCfg(ctx, "platinum_mining", PLATINUM_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(PLATINUM_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "pyrolite_nether", PYROLITE_FEATURE.biomeModifierNether(), net, ground, new OreBiomeEntry(PYROLITE_FEATURE.placedNetherFeature()));
        rgtrCfg(ctx, "pyrolite_end", PYROLITE_FEATURE.biomeModifierEnd(), end, ground, new OreBiomeEntry(PYROLITE_FEATURE.placedEndFeature()));
        rgtrCfg(ctx, "pyrolite_mining", PYROLITE_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(PYROLITE_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "quartz_mining", QUARTZ_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(QUARTZ_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "redstone_mining", REDSTONE_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(REDSTONE_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "ruby_overworld", RUBY_FEATURE.biomeModifierOverworld(), base, ground, new OreBiomeEntry(RUBY_FEATURE.placedOverworldFeature()));
        rgtrCfg(ctx, "ruby_nether", RUBY_FEATURE.biomeModifierNether(), net, ground, new OreBiomeEntry(RUBY_FEATURE.placedNetherFeature()));
        rgtrCfg(ctx, "ruby_mining", RUBY_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(RUBY_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "salt_overworld", SALT_FEATURE.biomeModifierOverworld(), oc, ground, new OreBiomeEntry(SALT_FEATURE.placedOverworldFeature()));
        rgtrCfg(ctx, "salt_mining", SALT_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(SALT_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "sapphire_overworld", SAPPHIRE_FEATURE.biomeModifierOverworld(), base, ground, new OreBiomeEntry(SAPPHIRE_FEATURE.placedOverworldFeature()));
        rgtrCfg(ctx, "sapphire_end", SAPPHIRE_FEATURE.biomeModifierEnd(), end, ground, new OreBiomeEntry(SAPPHIRE_FEATURE.placedEndFeature()));
        rgtrCfg(ctx, "sapphire_mining", SAPPHIRE_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(SAPPHIRE_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "sculkite_overworld", SCULKITE_FEATURE.biomeModifierOverworld(), IS_DEEP_DARK, ground, new OreBiomeEntry(SCULKITE_FEATURE.placedOverworldFeature()));
        rgtrCfg(ctx, "sculkite_mining", SCULKITE_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(SCULKITE_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "silver_overworld", SILVER_FEATURE.biomeModifierOverworld(), base, ground, new OreBiomeEntry(SILVER_FEATURE.placedOverworldFeature()));
        rgtrCfg(ctx, "silver_nether", SILVER_FEATURE.biomeModifierNether(), net, ground, new OreBiomeEntry(SILVER_FEATURE.placedNetherFeature()));
        rgtrCfg(ctx, "silver_mining", SILVER_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(SILVER_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "sulfur_overworld", SULFUR_FEATURE.biomeModifierOverworld(), base, ground, new OreBiomeEntry(SULFUR_FEATURE.placedOverworldFeature()));
        rgtrCfg(ctx, "sulfur_nether", SULFUR_FEATURE.biomeModifierNether(), net, ground, new OreBiomeEntry(SULFUR_FEATURE.placedNetherFeature()));
        rgtrCfg(ctx, "sulfur_mining", SULFUR_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(SULFUR_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "spinel_overworld", SPINEL_FEATURE.biomeModifierOverworld(), base, ground, new OreBiomeEntry(SPINEL_FEATURE.placedOverworldFeature()));
        rgtrCfg(ctx, "spinel_nether", SPINEL_FEATURE.biomeModifierNether(), net, ground, new OreBiomeEntry(SPINEL_FEATURE.placedNetherFeature()));
        rgtrCfg(ctx, "spinel_mining", SPINEL_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(SPINEL_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "tanzanite_overworld", TANZANITE_FEATURE.biomeModifierOverworld(), base, ground, new OreBiomeEntry(TANZANITE_FEATURE.placedOverworldFeature()));
        rgtrCfg(ctx, "tanzanite_nether", TANZANITE_FEATURE.biomeModifierNether(), net, ground, new OreBiomeEntry(TANZANITE_FEATURE.placedNetherFeature()));
        rgtrCfg(ctx, "tanzanite_mining", TANZANITE_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(TANZANITE_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "titanium_overworld", TITANIUM_FEATURE.biomeModifierOverworld(), base, ground, new OreBiomeEntry(TITANIUM_FEATURE.placedOverworldFeature()));
        rgtrCfg(ctx, "titanium_end", TITANIUM_FEATURE.biomeModifierEnd(), end, ground, new OreBiomeEntry(TITANIUM_FEATURE.placedEndFeature()));
        rgtrCfg(ctx, "titanium_mining", TITANIUM_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(TITANIUM_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "tin_overworld", TIN_FEATURE.biomeModifierOverworld(), base, ground, new OreBiomeEntry(TIN_FEATURE.placedOverworldFeature()));
        rgtrCfg(ctx, "tin_end", TIN_FEATURE.biomeModifierEnd(), end, ground, new OreBiomeEntry(TIN_FEATURE.placedEndFeature()));
        rgtrCfg(ctx, "tin_mining", TIN_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(TIN_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "tungsten_overworld", TUNGSTEN_FEATURE.biomeModifierOverworld(), base, ground, new OreBiomeEntry(TUNGSTEN_FEATURE.placedOverworldFeature()));
        rgtrCfg(ctx, "tungsten_end", TUNGSTEN_FEATURE.biomeModifierEnd(), end, ground, new OreBiomeEntry(TUNGSTEN_FEATURE.placedEndFeature()));
        rgtrCfg(ctx, "tungsten_mining", TUNGSTEN_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(TUNGSTEN_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "ultimatitanium_end", ULTIMATITANIUM_FEATURE.biomeModifierEnd(), end, ground, new OreBiomeEntry(ULTIMATITANIUM_FEATURE.placedEndFeature()));
        rgtrCfg(ctx, "ultimatitanium_mining", ULTIMATITANIUM_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(ULTIMATITANIUM_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "uraninite_overworld", URANINITE_FEATURE.biomeModifierOverworld(), base, ground, new OreBiomeEntry(URANINITE_FEATURE.placedOverworldFeature()));
        rgtrCfg(ctx, "uraninite_nether", URANINITE_FEATURE.biomeModifierNether(), net, ground, new OreBiomeEntry(URANINITE_FEATURE.placedNetherFeature()));
        rgtrCfg(ctx, "uraninite_mining", URANINITE_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(URANINITE_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "uranium_overworld", URANIUM_FEATURE.biomeModifierOverworld(), base, ground, new OreBiomeEntry(URANIUM_FEATURE.placedOverworldFeature()));
        rgtrCfg(ctx, "uranium_nether", URANIUM_FEATURE.biomeModifierNether(), net, ground, new OreBiomeEntry(URANIUM_FEATURE.placedNetherFeature()));
        rgtrCfg(ctx, "uranium_end", URANIUM_FEATURE.biomeModifierEnd(), end, ground, new OreBiomeEntry(URANIUM_FEATURE.placedEndFeature()));
        rgtrCfg(ctx, "uranium_mining", URANIUM_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(URANIUM_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "vanadium_overworld", VANADIUM_FEATURE.biomeModifierOverworld(), base, ground, new OreBiomeEntry(VANADIUM_FEATURE.placedOverworldFeature()));
        rgtrCfg(ctx, "vanadium_end", VANADIUM_FEATURE.biomeModifierEnd(), net, ground, new OreBiomeEntry(VANADIUM_FEATURE.placedEndFeature()));
        rgtrCfg(ctx, "vanadium_mining", VANADIUM_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(VANADIUM_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "zinc_overworld", ZINC_FEATURE.biomeModifierOverworld(), base, ground, new OreBiomeEntry(ZINC_FEATURE.placedOverworldFeature()));
        rgtrCfg(ctx, "zinc_mining", ZINC_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(ZINC_FEATURE.placedMiningFeature()));

        rgtrCfg(ctx, "zircon_overworld", ZIRCON_FEATURE.biomeModifierOverworld(), base, ground, new OreBiomeEntry(ZIRCON_FEATURE.placedOverworldFeature()));
        rgtrCfg(ctx, "zircon_nether", ZIRCON_FEATURE.biomeModifierNether(), net, ground, new OreBiomeEntry(ZIRCON_FEATURE.placedNetherFeature()));
        rgtrCfg(ctx, "zircon_mining", ZIRCON_FEATURE.biomeModifierMining(), min, ground, new OreBiomeEntry(ZIRCON_FEATURE.placedMiningFeature()));
    }

    // We use this instead of PlacedFeatures in case we add multiple keys on a single entry
    public record OreBiomeEntry(ResourceKey<PlacedFeature> placed) {}

    private static void rgtrCfg(BootstrapContext<BiomeModifier> ctx, String id, ResourceKey<BiomeModifier> mKey, TagKey<Biome> bTag,
                                GenerationStep.Decoration step, OreBiomeEntry... entries) {
        var biomes = ctx.lookup(Registries.BIOME);
        var placed = ctx.lookup(Registries.PLACED_FEATURE);

        HolderSet<PlacedFeature> features = HolderSet.direct(Arrays.stream(entries).map(e -> placed.getOrThrow(e.placed())).toList());

        ctx.register(mKey, new EOBiomeModifierFeatures(biomes.getOrThrow(bTag), features, step, EO(id)));
    }
}
