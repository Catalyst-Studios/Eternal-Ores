package net.radzratz.eternalores.worldgen.ores;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.neoforged.neoforge.common.world.BiomeModifier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static net.minecraft.tags.BiomeTags.IS_OCEAN;
import static net.minecraft.tags.BiomeTags.IS_OVERWORLD;
import static net.neoforged.neoforge.common.Tags.Biomes.IS_SWAMP;
import static net.neoforged.neoforge.registries.NeoForgeRegistries.Keys.BIOME_MODIFIERS;
import static net.radzratz.eternalores.util.EOMaterials.materialNames.*;
import static net.radzratz.eternalores.util.EOMaterials.materialSets.*;
import static net.radzratz.eternalores.util.EOUtils.EO;
import static net.radzratz.eternalores.util.tags.biome.EOBiomeTags.Biomes.IS_DEEP_DARK;

@SuppressWarnings("unused")
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

    // to whoever is reading, stones is for both stone and slate, and slate is only for, well, slate
    public enum OverworldBlockType {STONES, SLATE, SAND, SCULK}

    public record OverworldSpec(OverworldBlockType type, Block primary, Block secondary) {}

    public record MiningSpec(Block stone, Block slate, Block nether, Block end) {}

    public record OreDefinitions(OreKeys keys, OverworldSpec overworld, TagKey<Biome> overworldBiome, Block nether, Block end, MiningSpec mining) {
        public String id() {
            return keys().name();
        }
    }

    private static final List<OreDefinitions> ORE_DEFINITIONS = new ArrayList<>();
    public static final List<OreDefinitions> ORES = Collections.unmodifiableList(ORE_DEFINITIONS);

    public final static OreKeys ALUMINUM_FEATURE = ore(ALUMINUM_ID)
            .dimensionOverworld(ALUMINUM_SET.ORE.get(), ALUMINUM_SET.SLATE_ORE.get())
            .rgtrOre();
    public final static OreKeys AMBER_FEATURE = ore(AMBER_ID)
            .dimensionOverworld(AMBER_SET.ORE.get(), AMBER_SET.SLATE_ORE.get())
            .rgtrOre();
    public final static OreKeys ANCIENT_DEBRIS_FEATURE = ore(ANCIENT_DEBRI_ID)
            .miningOnly(null, null, Blocks.ANCIENT_DEBRIS, null)
            .rgtrOre();
    public final static OreKeys ANTHRACITE_FEATURE = ore(ANTHRACITE_ID)
            .dimensionOverworld(ANTHRACITE_SET.ORE.get(), ANTHRACITE_SET.SLATE_ORE.get())
            .rgtrOre();
    public final static OreKeys APATITE_FEATURE = ore(APATITE_ID)
            .dimensionOverworld(APATITE_SET.ORE.get(), APATITE_SET.SLATE_ORE.get())
            .rgtrOre();
    public final static OreKeys ARDITE_FEATURE = ore(ARDITE_ID)
            .dimensionNether(ARDITE_SET.NETHER_ORE.get())
            .rgtrOre();
    public final static OreKeys BERYLLIUM_FEATURE = ore(BERYLLIUM_ID)
            .dimensionOverworld(BERYLLIUM_SET.ORE.get(), BERYLLIUM_SET.SLATE_ORE.get())
            .rgtrOre();
    public final static OreKeys BITUMINOUS_FEATURE = ore(BITUMINOUS_ID)
            .dimensionOverworld(BITUMINOUS_SET.ORE.get(), BITUMINOUS_SET.SLATE_ORE.get())
            .rgtrOre();
    public final static OreKeys CINNABAR_FEATURE = ore(CINNABAR_ID)
            .dimensionOverworld(CINNABAR_SET.ORE.get(), CINNABAR_SET.SLATE_ORE.get())
            .dimensionNether(CINNABAR_SET.NETHER_ORE.get())
            .rgtrOre();
    public final static OreKeys COAL_FEATURE = ore(COAL_ID)
            .miningOnly(Blocks.COAL_ORE, Blocks.DEEPSLATE_COAL_ORE, null, null)
            .rgtrOre();
    public final static OreKeys COBALT_FEATURE = ore(COBALT_ID)
            .dimensionOverworld(COBALT_SET.ORE.get(), COBALT_SET.SLATE_ORE.get())
            .dimensionNether(COBALT_SET.NETHER_ORE.get())
            .rgtrOre();
    public final static OreKeys COPPER_FEATURE = ore(COPPER_ID)
            .miningOnly(Blocks.COPPER_ORE, Blocks.DEEPSLATE_COPPER_ORE, null, null)
            .rgtrOre();
    public final static OreKeys DIAMOND_FEATURE = ore(DIAMOND_ID)
            .miningOnly(Blocks.DIAMOND_ORE, Blocks.DEEPSLATE_DIAMOND_ORE, null, null)
            .rgtrOre();
    public final static OreKeys EMERALD_FEATURE = ore(EMERALD_ID)
            .miningOnly(Blocks.EMERALD_ORE, Blocks.DEEPSLATE_EMERALD_ORE, null, null)
            .rgtrOre();
    public final static OreKeys FLUORITE_FEATURE = ore(FLUORITE_ID)
            .dimensionOverworld(FLUORITE_SET.ORE.get(), FLUORITE_SET.SLATE_ORE.get())
            .dimensionEnd(FLUORITE_SET.END_ORE.get())
            .rgtrOre();
    public final static OreKeys GALLIUM_FEATURE = ore(GALLIUM_ID)
            .dimensionOverworld(GALLIUM_SET.ORE.get(), GALLIUM_SET.SLATE_ORE.get())
            .dimensionNether(GALLIUM_SET.NETHER_ORE.get())
            .rgtrOre();
    public final static OreKeys GARNET_FEATURE = ore(GARNET_ID)
            .dimensionOverworld(GARNET_SET.ORE.get(), GARNET_SET.SLATE_ORE.get())
            .dimensionNether(GARNET_SET.NETHER_ORE.get())
            .rgtrOre();
    public final static OreKeys GOLD_FEATURE = ore(GOLD_ID)
            .miningOnly(Blocks.GOLD_ORE, Blocks.DEEPSLATE_GOLD_ORE, Blocks.NETHER_GOLD_ORE, null)
            .rgtrOre();
    public final static OreKeys IRIDIUM_FEATURE = ore(IRIDIUM_ID)
            .dimensionOverworld(IRIDIUM_SET.ORE.get(), IRIDIUM_SET.SLATE_ORE.get())
            .dimensionEnd(IRIDIUM_SET.END_ORE.get())
            .rgtrOre();
    public final static OreKeys IRON_FEATURE = ore(IRON_ID)
            .miningOnly(Blocks.IRON_ORE, Blocks.DEEPSLATE_IRON_ORE, null, null)
            .rgtrOre();
    public final static OreKeys JADE_FEATURE = ore(JADE_ID)
            .dimensionOverworld(JADE_SET.ORE.get(), JADE_SET.SLATE_ORE.get())
            .dimensionNether(JADE_SET.NETHER_ORE.get())
            .rgtrOre();
    public final static OreKeys LAPIS_FEATURE = ore(LAPIS_ID)
            .miningOnly(Blocks.LAPIS_ORE, Blocks.DEEPSLATE_LAPIS_ORE, null, null)
            .rgtrOre();
    public final static OreKeys LEAD_FEATURE = ore(LEAD_ID)
            .dimensionOverworld(LEAD_SET.ORE.get(), LEAD_SET.SLATE_ORE.get())
            .dimensionEnd(LEAD_SET.END_ORE.get())
            .rgtrOre();
    public final static OreKeys LIGNITE_FEATURE = ore(LIGNITE_ID)
            .dimensionOverworld(LIGNITE_SET.ORE.get(), LIGNITE_SET.SLATE_ORE.get())
            .rgtrOre();
    public final static OreKeys MOLYBDENUM_FEATURE = ore(MOLYBDENUM_ID)
            .dimensionOverworld(MOLYBDENUM_SET.ORE.get(), MOLYBDENUM_SET.SLATE_ORE.get())
            .dimensionNether(MOLYBDENUM_SET.NETHER_ORE.get())
            .dimensionEnd(MOLYBDENUM_SET.END_ORE.get())
            .rgtrOre();
    public final static OreKeys NECROTICARITE_FEATURE = ore(NECROTICARITE_ID)
            .dimensionNether(NECROTICARITE_SET.NETHER_ORE.get())
            .rgtrOre();
    public final static OreKeys NEODYMIUM_FEATURE = ore(NEODYMIUM_ID)
            .dimensionOverworld(NEODYMIUM_SET.ORE.get(), NEODYMIUM_SET.SLATE_ORE.get())
            .dimensionEnd(NEODYMIUM_SET.END_ORE.get())
            .rgtrOre();
    public final static OreKeys NITER_FEATURE = ore(NITER_ID)
            .dimensionOverworld(NITER_SET.ORE.get(), NITER_SET.SLATE_ORE.get())
            .rgtrOre();
    public final static OreKeys NICKEL_FEATURE = ore(NICKEL_ID)
            .dimensionOverworld(NICKEL_SET.ORE.get(), NICKEL_SET.SLATE_ORE.get())
            .dimensionNether(NICKEL_SET.NETHER_ORE.get())
            .rgtrOre();
    public final static OreKeys ONYX_FEATURE = ore(ONYX_ID)
            .dimensionOverworld(ONYX_SET.ORE.get(), ONYX_SET.SLATE_ORE.get())
            .dimensionNether(ONYX_SET.NETHER_ORE.get())
            .rgtrOre();
    public final static OreKeys OBSIDIAN_FEATURE = ore(OBSIDIAN_ID)
            .dimensionNether(OBSIDIAN_SET.NETHER_ORE.get())
            .rgtrOre();
    public final static OreKeys OSMIUM_FEATURE = ore(OSMIUM_ID)
            .dimensionOverworld(OSMIUM_SET.ORE.get(), OSMIUM_SET.SLATE_ORE.get())
            .dimensionNether(OSMIUM_SET.NETHER_ORE.get())
            .rgtrOre();
    public final static OreKeys PALLADIUM_FEATURE = ore(PALLADIUM_ID)
            .dimensionOverworld(PALLADIUM_SET.ORE.get(), PALLADIUM_SET.SLATE_ORE.get())
            .dimensionEnd(PALLADIUM_SET.END_ORE.get())
            .rgtrOre();
    public final static OreKeys PEAT_FEATURE = ore(PEAT_ID)
            .dimensionOverworld(PEAT_SET.ORE.get(), PEAT_SET.SLATE_ORE.get())
            .biomesOverworld(IS_SWAMP)
            .rgtrOre();
    public final static OreKeys PEARL_FEATURE = ore(PEARL_ID)
            .sandBlocks(PEARL_SET.SAND_ORE.get())
            .biomesOverworld(IS_OCEAN)
            .rgtrOre();
    public final static OreKeys PERIDOT_FEATURE = ore(PERIDOT_ID)
            .dimensionOverworld(PERIDOT_SET.ORE.get(), PERIDOT_SET.SLATE_ORE.get())
            .dimensionNether(PERIDOT_SET.NETHER_ORE.get())
            .rgtrOre();
    public final static OreKeys PLATINUM_FEATURE = ore(PLATINUM_ID)
            .dimensionOverworld(PLATINUM_SET.ORE.get(), PLATINUM_SET.SLATE_ORE.get())
            .dimensionEnd(PLATINUM_SET.END_ORE.get())
            .rgtrOre();
    public final static OreKeys PYROLITE_FEATURE = ore(PYROLITE_ID)
            .dimensionNether(PYROLITE_SET.NETHER_ORE.get())
            .dimensionEnd(PYROLITE_SET.END_ORE.get())
            .rgtrOre();
    public final static OreKeys QUARTZ_FEATURE = ore(QUARTZ_ID)
            .miningOnly(null, null, Blocks.NETHER_QUARTZ_ORE, null)
            .rgtrOre();
    public final static OreKeys REDSTONE_FEATURE = ore(REDSTONE_ID)
            .miningOnly(Blocks.REDSTONE_ORE, Blocks.DEEPSLATE_REDSTONE_ORE, null, null)
            .rgtrOre();
    public final static OreKeys RUBY_FEATURE = ore(RUBY_ID)
            .dimensionOverworld(RUBY_SET.ORE.get(), RUBY_SET.SLATE_ORE.get())
            .dimensionNether(RUBY_SET.NETHER_ORE.get())
            .rgtrOre();
    public final static OreKeys SALT_FEATURE = ore(SALT_ID)
            .sandBlocks(SALT_SET.SAND_ORE.get())
            .biomesOverworld(IS_OCEAN)
            .rgtrOre();
    public final static OreKeys SAPPHIRE_FEATURE = ore(SAPPHIRE_ID)
            .dimensionOverworld(SAPPHIRE_SET.ORE.get(), SAPPHIRE_SET.SLATE_ORE.get())
            .dimensionEnd(SAPPHIRE_SET.END_ORE.get())
            .rgtrOre();
    public final static OreKeys SCULKITE_FEATURE = ore(SCULKITE_ID)
            .sculkBlocks(SCULKITE_SET.SCULK_ORE.get())
            .biomesOverworld(IS_DEEP_DARK)
            .rgtrOre();
    public final static OreKeys SILVER_FEATURE = ore(SILVER_ID)
            .dimensionOverworld(SILVER_SET.ORE.get(), SILVER_SET.SLATE_ORE.get())
            .dimensionNether(SILVER_SET.NETHER_ORE.get())
            .rgtrOre();
    public final static OreKeys SULFUR_FEATURE = ore(SULFUR_ID)
            .dimensionOverworld(SULFUR_SET.ORE.get(), SULFUR_SET.SLATE_ORE.get())
            .dimensionNether(SULFUR_SET.NETHER_ORE.get())
            .rgtrOre();
    public final static OreKeys SPINEL_FEATURE = ore(SPINEL_ID)
            .dimensionOverworld(SPINEL_SET.ORE.get(), SPINEL_SET.SLATE_ORE.get())
            .dimensionNether(SPINEL_SET.NETHER_ORE.get())
            .rgtrOre();
    public final static OreKeys TANZANITE_FEATURE = ore(TANZANITE_ID)
            .dimensionOverworld(TANZANITE_SET.ORE.get(), TANZANITE_SET.SLATE_ORE.get())
            .dimensionNether(TANZANITE_SET.NETHER_ORE.get())
            .rgtrOre();
    public final static OreKeys TITANIUM_FEATURE = ore(TITANIUM_ID)
            .dimensionOverworld(TITANIUM_SET.ORE.get(), TITANIUM_SET.SLATE_ORE.get())
            .dimensionEnd(TITANIUM_SET.END_ORE.get())
            .rgtrOre();
    public final static OreKeys TIN_FEATURE = ore(TIN_ID)
            .dimensionOverworld(TIN_SET.ORE.get(), TIN_SET.SLATE_ORE.get())
            .dimensionEnd(TIN_SET.END_ORE.get())
            .rgtrOre();
    public final static OreKeys TUNGSTEN_FEATURE = ore(TUNGSTEN_ID)
            .slateBlocks(TUNGSTEN_SET.SLATE_ORE.get())
            .dimensionEnd(TUNGSTEN_SET.END_ORE.get())
            .rgtrOre();
    public final static OreKeys ULTIMATITANIUM_FEATURE = ore(ULTIMATITANIUM_ID)
            .dimensionEnd(ULTIMATITANIUM_SET.END_ORE.get())
            .rgtrOre();
    public final static OreKeys URANINITE_FEATURE = ore(URANINITE_ID)
            .dimensionOverworld(URANINITE_SET.ORE.get(), URANINITE_SET.SLATE_ORE.get())
            .dimensionNether(URANINITE_SET.NETHER_ORE.get())
            .rgtrOre();
    public final static OreKeys URANIUM_FEATURE = ore(URANIUM_ID)
            .dimensionOverworld(URANIUM_SET.ORE.get(), URANIUM_SET.SLATE_ORE.get())
            .dimensionNether(URANIUM_SET.NETHER_ORE.get())
            .dimensionEnd(URANIUM_SET.END_ORE.get())
            .rgtrOre();
    public final static OreKeys VANADIUM_FEATURE = ore(VANADIUM_ID)
            .dimensionOverworld(VANADIUM_SET.ORE.get(), VANADIUM_SET.SLATE_ORE.get())
            .dimensionEnd(VANADIUM_SET.END_ORE.get())
            .rgtrOre();
    public final static OreKeys ZINC_FEATURE = ore(ZINC_ID)
            .dimensionOverworld(ZINC_SET.ORE.get(), ZINC_SET.SLATE_ORE.get())
            .rgtrOre();
    public final static OreKeys ZIRCON_FEATURE = ore(ZIRCON_ID)
            .dimensionOverworld(ZIRCON_SET.ORE.get(), ZIRCON_SET.SLATE_ORE.get())
            .dimensionNether(ZIRCON_SET.NETHER_ORE.get())
            .rgtrOre();

    public static OreBuilder ore(String id) {
        return new OreBuilder(id);
    }

    public static final class OreBuilder {
        private final String id;
        private OverworldSpec overworld;
        private TagKey<Biome> overworldBiomeTag = IS_OVERWORLD;
        private Block nether;
        private Block end;
        private MiningSpec mining;

        private OreBuilder(String id) {
            this.id = id;
        }

        public OreBuilder dimensionOverworld(Block stone, Block slate) {
            this.overworld = new OverworldSpec(OverworldBlockType.STONES, stone, slate);
            return this;
        }

        public OreBuilder sandBlocks(Block sand) {
            this.overworld = new OverworldSpec(OverworldBlockType.SAND, sand, null);
            return this;
        }

        public OreBuilder sculkBlocks(Block sculk) {
            this.overworld = new OverworldSpec(OverworldBlockType.SCULK, sculk, null);
            return this;
        }

        public OreBuilder slateBlocks(Block slate) {
            this.overworld = new OverworldSpec(OverworldBlockType.SLATE, slate, null);
            return this;
        }

        public OreBuilder biomesOverworld(TagKey<Biome> tag) {
            this.overworldBiomeTag = tag;
            return this;
        }

        public OreBuilder dimensionNether(Block block) {
            this.nether = block;
            return this;
        }

        public OreBuilder dimensionEnd(Block block) {
            this.end = block;
            return this;
        }

        public OreBuilder miningOnly(Block stone, Block slate, Block netherrack, Block endStone) {
            this.mining = new MiningSpec(stone, slate, netherrack, endStone);
            return this;
        }

        public OreKeys rgtrOre() {
            OreKeys keys = rgtrOres(id);
            MiningSpec miningDim = mining != null ? mining : deriveMining();
            ORE_DEFINITIONS.add(new OreDefinitions(keys, overworld, overworldBiomeTag, nether, end, miningDim));
            return keys;
        }

        private MiningSpec deriveMining() {
            if (overworld == null && nether == null && end == null) return null;

            Block stone = null;
            Block slate = null;
            if (overworld != null) {
                switch (overworld.type()) {
                    case STONES -> {
                        stone = overworld.primary();
                        slate = overworld.secondary();
                    }
                    case SAND -> stone = overworld.primary();
                    case SLATE, SCULK -> slate = overworld.primary();
                }
            }
            return new MiningSpec(stone, slate, nether, end);
        }

        private OreKeys rgtrOres(String id) {
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
}