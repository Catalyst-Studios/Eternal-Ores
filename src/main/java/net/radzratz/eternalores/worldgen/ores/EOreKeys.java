package net.radzratz.eternalores.worldgen.ores;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.neoforged.neoforge.common.world.BiomeModifier;

import static net.neoforged.neoforge.registries.NeoForgeRegistries.Keys.BIOME_MODIFIERS;
import static net.radzratz.eternalores.util.EOMaterials.materialNames.*;
import static net.radzratz.eternalores.util.EOUtils.EO;

public class EOreKeys {
    // sath if ya see this, yes its horrible, but it works 'insert a kek.png in here'
    public record OreKeys(String name,
                          ResourceKey<ConfiguredFeature<?, ?>> configuredOverworldFeature,
                          ResourceKey<ConfiguredFeature<?, ?>> configuredNetherFeature,
                          ResourceKey<ConfiguredFeature<?, ?>> configuredEndFeature,
                          ResourceKey<ConfiguredFeature<?, ?>> configuredMiningFeature,

                          ResourceKey<PlacedFeature> placedOverworldFeature,
                          ResourceKey<PlacedFeature> placedNetherFeature,
                          ResourceKey<PlacedFeature> placedEndFeature,
                          ResourceKey<PlacedFeature> placedMiningFeature,

                          ResourceKey<BiomeModifier> biomeModifierOverworld,
                          ResourceKey<BiomeModifier> biomeModifierNether,
                          ResourceKey<BiomeModifier> biomeModifierEnd,
                          ResourceKey<BiomeModifier> biomeModifierMining) {}

    public final static OreKeys ALUMINUM_FEATURE = rgtrOres(ALUMINUM_ID);
    public final static OreKeys AMBER_FEATURE = rgtrOres(AMBER_ID);
    public final static OreKeys ANCIENT_DEBRIS_FEATURE = rgtrOres(ANCIENT_DEBRI_ID);
    public final static OreKeys ANTHRACITE_FEATURE = rgtrOres(ANTHRACITE_ID);
    public final static OreKeys APATITE_FEATURE = rgtrOres(APATITE_ID);
    public final static OreKeys ARDITE_FEATURE = rgtrOres(ARDITE_ID);
    public final static OreKeys BERYLLIUM_FEATURE = rgtrOres(BERYLLIUM_ID);
    public final static OreKeys BITUMINOUS_FEATURE = rgtrOres(BITUMINOUS_ID);
    public final static OreKeys CINNABAR_FEATURE = rgtrOres(CINNABAR_ID);
    public final static OreKeys COAL_FEATURE = rgtrOres(COAL_ID);
    public final static OreKeys COBALT_FEATURE = rgtrOres(COBALT_ID);
    public final static OreKeys COPPER_FEATURE = rgtrOres(COPPER_ID);
    public final static OreKeys DIAMOND_FEATURE = rgtrOres(DIAMOND_ID);
    public final static OreKeys EMERALD_FEATURE = rgtrOres(EMERALD_ID);
    public final static OreKeys FLUORITE_FEATURE = rgtrOres(FLUORITE_ID);
    public final static OreKeys GALLIUM_FEATURE = rgtrOres(GALLIUM_ID);
    public final static OreKeys GARNET_FEATURE = rgtrOres(GARNET_ID);
    public final static OreKeys GOLD_FEATURE = rgtrOres(GOLD_ID);
    public final static OreKeys IRIDIUM_FEATURE = rgtrOres(IRIDIUM_ID);
    public final static OreKeys IRON_FEATURE = rgtrOres(IRON_ID);
    public final static OreKeys JADE_FEATURE = rgtrOres(JADE_ID);
    public final static OreKeys LAPIS_FEATURE = rgtrOres(LAPIS_ID);
    public final static OreKeys LEAD_FEATURE = rgtrOres(LEAD_ID);
    public final static OreKeys LIGNITE_FEATURE = rgtrOres(LIGNITE_ID);
    public final static OreKeys MOLYBDENUM_FEATURE = rgtrOres(MOLYBDENUM_ID);
    public final static OreKeys NECROTICARITE_FEATURE = rgtrOres(NECROTICARITE_ID);
    public final static OreKeys NEODYMIUM_FEATURE = rgtrOres(NEODYMIUM_ID);
    public final static OreKeys NITER_FEATURE = rgtrOres(NITER_ID);
    public final static OreKeys NICKEL_FEATURE = rgtrOres(NICKEL_ID);
    public final static OreKeys ONYX_FEATURE = rgtrOres(ONYX_ID);
    public final static OreKeys OBSIDIAN_FEATURE = rgtrOres(OBSIDIAN_ID);
    public final static OreKeys OSMIUM_FEATURE = rgtrOres(OSMIUM_ID);
    public final static OreKeys PALLADIUM_FEATURE = rgtrOres(PALLADIUM_ID);
    public final static OreKeys PEAT_FEATURE = rgtrOres(PEAT_ID);
    public final static OreKeys PEARL_FEATURE = rgtrOres(PEARL_ID);
    public final static OreKeys PERIDOT_FEATURE = rgtrOres(PERIDOT_ID);
    public final static OreKeys PLATINUM_FEATURE = rgtrOres(PLATINUM_ID);
    public final static OreKeys PYROLITE_FEATURE = rgtrOres(PYROLITE_ID);
    public final static OreKeys QUARTZ_FEATURE = rgtrOres(QUARTZ_ID);
    public final static OreKeys REDSTONE_FEATURE = rgtrOres(REDSTONE_ID);
    public final static OreKeys RUBY_FEATURE = rgtrOres(RUBY_ID);
    public final static OreKeys SALT_FEATURE = rgtrOres(SALT_ID);
    public final static OreKeys SAPPHIRE_FEATURE = rgtrOres(SAPPHIRE_ID);
    public final static OreKeys SCULKITE_FEATURE = rgtrOres(SCULKITE_ID);
    public final static OreKeys SILVER_FEATURE = rgtrOres(SILVER_ID);
    public final static OreKeys SULFUR_FEATURE = rgtrOres(SULFUR_ID);
    public final static OreKeys SPINEL_FEATURE = rgtrOres(SPINEL_ID);
    public final static OreKeys TANZANITE_FEATURE = rgtrOres(TANZANITE_ID);
    public final static OreKeys TITANIUM_FEATURE = rgtrOres(TITANIUM_ID);
    public final static OreKeys TIN_FEATURE = rgtrOres(TIN_ID);
    public final static OreKeys TUNGSTEN_FEATURE = rgtrOres(TUNGSTEN_ID);
    public final static OreKeys ULTIMATITANIUM_FEATURE = rgtrOres(ULTIMATITANIUM_ID);
    public final static OreKeys URANINITE_FEATURE = rgtrOres(URANINITE_ID);
    public final static OreKeys URANIUM_FEATURE = rgtrOres(URANIUM_ID);
    public final static OreKeys VANADIUM_FEATURE = rgtrOres(VANADIUM_ID);
    public final static OreKeys ZINC_FEATURE = rgtrOres(ZINC_ID);
    public final static OreKeys ZIRCON_FEATURE = rgtrOres(ZIRCON_ID);

    public static OreKeys rgtrOres(String id) {
        return new OreKeys(
                id,
                ResourceKey.create(Registries.CONFIGURED_FEATURE, EO("overworld_" + id + "_feature")),
                ResourceKey.create(Registries.CONFIGURED_FEATURE, EO("nether_" + id + "_feature")),
                ResourceKey.create(Registries.CONFIGURED_FEATURE, EO("end_" + id + "_feature")),
                ResourceKey.create(Registries.CONFIGURED_FEATURE, EO("mining_" + id + "_feature")),
                ResourceKey.create(Registries.PLACED_FEATURE, EO("overworld_" + id + "_placed")),
                ResourceKey.create(Registries.PLACED_FEATURE, EO("nether_" + id + "_placed")),
                ResourceKey.create(Registries.PLACED_FEATURE, EO("end_" + id + "_placed")),
                ResourceKey.create(Registries.PLACED_FEATURE, EO("mining_" + id + "_placed")),
                ResourceKey.create(BIOME_MODIFIERS, EO("overworld_" + id + "_modifier")),
                ResourceKey.create(BIOME_MODIFIERS, EO("nether_" + id + "_modifier")),
                ResourceKey.create(BIOME_MODIFIERS, EO("end_" + id + "_modifier")),
                ResourceKey.create(BIOME_MODIFIERS, EO("mining_" + id + "_modifier"))
        );
    }
}
