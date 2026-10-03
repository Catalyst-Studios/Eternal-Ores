package net.radzratz.eternalores.util.config;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.common.ModConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static net.radzratz.eternalores.util.EOUtils.capitalize;

public class EOWorldGenConfig {
    public static final EOWorldGenConfig CONFIG;
    public static final ModConfigSpec CONFIG_SPEC;

    public final OreGenerationConfig ores;

    static {
        Pair<EOWorldGenConfig, ModConfigSpec> pair = new ModConfigSpec.Builder().configure(EOWorldGenConfig::new);
        CONFIG = pair.getLeft();
        CONFIG_SPEC = pair.getRight();
    }

    private EOWorldGenConfig(ModConfigSpec.Builder builder) {
        builder.comment("""
                 Eternal Ores World Generation Config
                
                 This config allows you to Disable Eternal Ores ores, change the ore min/max spawn Heights, define if the ore
                 is rare or not, the possible amount of veins per chunk, whether the generation is uniform or triangle, and the vein size.
                
                 Overworld, Nether, End and Mining Dimension values are separated. So if you change aluminum in the overworld, the
                 one over the Mining Dimension will be left intact, and so forth.
                
                 Ancient Debris, Copper, Coal, Diamond, Emerald, Gold, Lapis, Quartz and Redstone values only affect the Mining Dimension.
                
                 If said ore is disabled, ore placement values can be safely ignored.
                 If said ore veins per chunk, or vein size are set to 0, ore generation toggle can be safely ignored.
                
                 However, we suggest you to disable said ore generation toggle and leave its placement as it is.
                
                 Each change requires a Game Restart.
                """).push("world_generation");

        this.ores = new OreGenerationConfig(builder);

        builder.pop();
    }

    public static class OreGenerationConfig {
        public final Map<String, ModConfigSpec.BooleanValue> enableToggles = new HashMap<>();
        public final Map<String, OrePlacementConfig> placement = new HashMap<>();

        // Mining dim int
        private static final int MIN_END = EOMiningDimensionConfig.MiningDimension.DEFAULT_BEDROCK_LEVEL + 1;
        private static final int MAX_END = EOMiningDimensionConfig.MiningDimension.DEFAULT_END_START - 1;

        // Nether layer: end Start -> nether Start -1 -> -128 to -65
        private static final int MIN_NET = EOMiningDimensionConfig.MiningDimension.DEFAULT_END_START;
        private static final int MAX_NET = EOMiningDimensionConfig.MiningDimension.DEFAULT_NETHER_START - 1;

        // Deepslate layer: nether Start -> deepslate Start -1 -> -64 to -1
        private static final int MIN_SLATE = EOMiningDimensionConfig.MiningDimension.DEFAULT_NETHER_START;
        private static final int MAX_SLATE = EOMiningDimensionConfig.MiningDimension.DEFAULT_DEEPSLATE_START - 1;

        // Stone layer: deepslate Start -> dirt Start -1 -> 0 to 154
        private static final int MIN_STONE = EOMiningDimensionConfig.MiningDimension.DEFAULT_DEEPSLATE_START;
        private static final int MAX_STONE = EOMiningDimensionConfig.MiningDimension.DEFAULT_DIRT_START - 1;

        private record OreDefaults(String id, float airExposure, boolean rare, int veinsPerChunk, int veinSize, boolean triangle, int minY, int maxY) {}

        private static final List<OreDefaults> DEFAULTS = List.of(
                new OreDefaults("aluminum_overworld", 0.0f, false, 6, 7, false, -64, 90),
                new OreDefaults("aluminum_mining", 0.0f, false, 6, 7, false, MIN_SLATE, 155),
                new OreDefaults("amber_overworld", 0.0f, true, 3, 5, true, -64, 68),
                new OreDefaults("amber_mining", 0.0f, false, 3, 5, true, MIN_SLATE, 124),
                new OreDefaults("ancient_debris_mining", 0.0f, false, 5, 5, false, MIN_NET, MAX_NET),
                new OreDefaults("anthracite_overworld", 0.0f, false, 7, 5, false, -64, 85),
                new OreDefaults("anthracite_mining", 0.0f, false, 7, 5, false, MIN_SLATE, MAX_STONE),
                new OreDefaults("apatite_overworld", 0.0f, true, 5, 5, false, -64, 77),
                new OreDefaults("apatite_mining", 0.0f, false, 5, 5, false, MIN_SLATE, 128),
                new OreDefaults("ardite_nether", 0.0f, true, 6, 3, false, -64, 128),
                new OreDefaults("ardite_mining", 0.0f, false, 6, 5, false, MIN_NET, MAX_NET),
                new OreDefaults("beryllium_overworld", 0.0f, false, 8, 5, false, MIN_SLATE, 84),
                new OreDefaults("beryllium_mining", 0.0f, false, 8, 5, false, -64, 94),
                new OreDefaults("bituminous_overworld", 0.0f, false, 8, 7, false, -64, 94),
                new OreDefaults("bituminous_mining", 0.0f, false, 8, 7, false, MIN_SLATE, MAX_STONE),
                new OreDefaults("cinnabar_overworld", 0.0f, true, 8, 5, true, -61, 75),
                new OreDefaults("cinnabar_nether", 0.0f, true, 8, 5, true, -64, 128),
                new OreDefaults("cinnabar_mining", 0.0f, false, 8, 5, true, MIN_NET, 129),
                new OreDefaults("coal_mining", 0.0f, false, 8, 7, false, MIN_SLATE, MAX_STONE),
                new OreDefaults("cobalt_overworld", 0.0f, true, 6, 5, false, -64, 46),
                new OreDefaults("cobalt_nether", 0.0f, true, 6, 5, false, -64, 128),
                new OreDefaults("cobalt_mining", 0.0f, false, 6, 5, false, MIN_NET, 100),
                new OreDefaults("copper_mining", 0.0f, false, 7, 6, false, MIN_SLATE, MAX_STONE),
                new OreDefaults("diamond_mining", 0.0f, false, 7, 5, false, MIN_SLATE, 102),
                new OreDefaults("emerald_mining", 0.0f, false, 6, 4, false, MIN_SLATE, 102),
                new OreDefaults("fluorite_overworld", 0.0f, false, 6, 4, false, -61, 94),
                new OreDefaults("fluorite_end", 0.0f, false, 6, 4, false, -64, 102),
                new OreDefaults("fluorite_mining", 0.0f, false, 6, 4, false, MIN_END, 120),
                new OreDefaults("gallium_overworld", 0.0f, false, 7, 7, false, -59, 89),
                new OreDefaults("gallium_nether", 0.0f, false, 7, 7, false, -64, 128),
                new OreDefaults("gallium_mining", 0.0f, false, 7, 7, false, MIN_NET, MAX_STONE),
                new OreDefaults("garnet_overworld", 0.0f, true, 6, 4, true, -64, 65),
                new OreDefaults("garnet_nether", 0.0f, true, 6, 4, true, -64, 128),
                new OreDefaults("garnet_mining", 0.0f, false, 6, 4, true, MIN_NET, 106),
                new OreDefaults("gold_mining", 0.0f, false, 7, 5, false, MIN_NET, 108),
                new OreDefaults("jade_overworld", 0.0f, true, 5, 4, true, -52, 51),
                new OreDefaults("jade_nether", 0.0f, true, 5, 4, true, -64, 76),
                new OreDefaults("jade_mining", 0.0f, false, 5, 4, true, MIN_NET, 94),
                new OreDefaults("iridium_overworld", 0.0f, false, 6, 5, false, -64, 89),
                new OreDefaults("iridium_end", 0.0f, false, 6, 5, false, -64, 95),
                new OreDefaults("iridium_mining", 0.0f, false, 6, 5, false, MIN_END, 124),
                new OreDefaults("iron_mining", 0.0f, false, 8, 6, false, MIN_SLATE, MAX_STONE),
                new OreDefaults("lapis_mining", 0.0f, false, 7, 5, false, MIN_SLATE, 129),
                new OreDefaults("lead_overworld", 0.0f, false, 6, 5, false, -64, 79),
                new OreDefaults("lead_end", 0.0f, false, 6, 5, false, -64, 98),
                new OreDefaults("lead_mining", 0.0f, false, 6, 5, false, MIN_END, 139),
                new OreDefaults("lignite_overworld", 0.0f, false, 7, 7, false, -64, 91),
                new OreDefaults("lignite_mining", 0.0f, false, 7, 7, false, MIN_SLATE, MAX_STONE),
                new OreDefaults("molybdenum_overworld", 0.0f, false, 7, 7, false, -64, 138),
                new OreDefaults("molybdenum_nether", 0.0f, false, 7, 7, false, -64, MAX_STONE),
                new OreDefaults("molybdenum_end", 0.0f, false, 7, 7, false, -64, 129),
                new OreDefaults("molybdenum_mining", 0.0f, false, 7, 7, false, MIN_END, 120),
                new OreDefaults("necroticarite_nether", 0.0f, true, 5, 4, false, -64, 128),
                new OreDefaults("necroticarite_mining", 0.0f, false, 5, 4, false, MIN_NET, MAX_NET),
                new OreDefaults("neodymium_overworld", 0.0f, false, 4, 6, false, -64, 81),
                new OreDefaults("neodymium_end", 0.0f, false, 4, 6, false, -64, 120),
                new OreDefaults("neodymium_mining", 0.0f, false, 4, 6, false, MIN_END, 101),
                new OreDefaults("niter_overworld", 0.0f, false, 6, 6, false, -64, 84),
                new OreDefaults("niter_mining", 0.0f, false, 6, 6, false, MIN_SLATE, MAX_STONE),
                new OreDefaults("nickel_overworld", 0.0f, false, 7, 7, false, -64, 102),
                new OreDefaults("nickel_nether", 0.0f, false, 7, 7, false, -64, 124),
                new OreDefaults("nickel_mining", 0.0f, false, 7, 7, false, MIN_NET, MAX_STONE),
                new OreDefaults("obsidian_nether", 0.0f, true, 5, 5, false, -64, 128),
                new OreDefaults("obsidian_mining", 0.0f, false, 5, 5, false, MIN_NET, MAX_NET),
                new OreDefaults("onyx_overworld", 0.0f, true, 6, 5, true, -64, 98),
                new OreDefaults("onyx_nether", 0.0f, true, 6, 5, true, -64, 120),
                new OreDefaults("onyx_mining", 0.0f, false, 6, 5, true, MIN_NET, 107),
                new OreDefaults("osmium_overworld", 0.0f, false, 7, 6, false, -64, 101),
                new OreDefaults("osmium_nether", 0.0f, false, 7, 6, false, -64, 118),
                new OreDefaults("osmium_mining", 0.0f, false, 7, 6, false, MIN_NET, 142),
                new OreDefaults("palladium_overworld", 0.0f, false, 5, 5, false, -64, 89),
                new OreDefaults("palladium_end", 0.0f, false, 5, 5, false, -64, 129),
                new OreDefaults("palladium_mining", 0.0f, false, 5, 5, false, MIN_END, 107),
                new OreDefaults("peat_overworld", 0.0f, false, 8, 7, false, -64, 120),
                new OreDefaults("peat_mining", 0.0f, false, 6, 7, false, MIN_SLATE, MAX_STONE),
                new OreDefaults("pearl_overworld", 0.0f, true, 4, 3, true, 40, 90),
                new OreDefaults("pearl_mining", 0.0f, false, 4, 3, true, MIN_STONE, 109),
                new OreDefaults("peridot_overworld", 0.0f, true, 4, 4, true, -64, 71),
                new OreDefaults("peridot_nether", 0.0f, true, 4, 4, true, -64, 117),
                new OreDefaults("peridot_mining", 0.0f, false, 4, 4, true, MIN_NET, 109),
                new OreDefaults("platinum_overworld", 0.0f, false, 5, 5, false, -64, 76),
                new OreDefaults("platinum_end", 0.0f, false, 5, 5, false, -64, 70),
                new OreDefaults("platinum_mining", 0.0f, false, 5, 5, false, MIN_END, 138),
                new OreDefaults("pyrolite_nether", 0.0f, true, 4, 3, true, -64, 105),
                new OreDefaults("pyrolite_end", 0.0f, true, 4, 3, true, -64, 70),
                new OreDefaults("pyrolite_mining", 0.0f, false, 4, 3, true, MIN_END, MAX_NET),
                new OreDefaults("quartz_mining", 0.0f, false, 5, 5, false, MIN_NET, MAX_NET),
                new OreDefaults("redstone_mining", 0.0f, false, 7, 6, false, MIN_SLATE, 134),
                new OreDefaults("ruby_overworld", 0.0f, true, 6, 4, false, -60, 75),
                new OreDefaults("ruby_nether", 0.0f, true, 6, 4, false, -60, 90),
                new OreDefaults("ruby_mining", 0.0f, false, 6, 4, false, MIN_NET, 109),
                new OreDefaults("salt_overworld", 0.0f, false, 4, 5, false, 40, 90),
                new OreDefaults("salt_mining", 0.0f, false, 4, 5, false, MIN_STONE, 129),
                new OreDefaults("sapphire_overworld", 0.0f, true, 5, 4, false, -61, 71),
                new OreDefaults("sapphire_end", 0.0f, true, 5, 4, false, -64, 99),
                new OreDefaults("sapphire_mining", 0.0f, false, 5, 4, false, MIN_END, 105),
                new OreDefaults("sculkite_overworld", 0.0f, true, 3, 3, false, -61, 0),
                new OreDefaults("sculkite_mining", 0.0f, false, 3, 3, false, MIN_SLATE, MAX_SLATE),
                new OreDefaults("silver_overworld", 0.0f, false, 6, 6, false, -61, 90),
                new OreDefaults("silver_nether", 0.0f, false, 6, 6, false, -64, 128),
                new OreDefaults("silver_mining", 0.0f, false, 6, 6, false, MIN_NET, 139),
                new OreDefaults("sulfur_overworld", 0.0f, false, 6, 6, false, -64, 81),
                new OreDefaults("sulfur_nether", 0.0f, false, 6, 6, false, -64, 128),
                new OreDefaults("sulfur_mining", 0.0f, false, 6, 6, false, MIN_NET, 139),
                new OreDefaults("spinel_overworld", 0.0f, true, 5, 5, false, -64, 79),
                new OreDefaults("spinel_nether", 0.0f, false, 5, 5, false, -64, 139),
                new OreDefaults("spinel_mining", 0.0f, false, 5, 5, false, MIN_NET, 139),
                new OreDefaults("tanzanite_overworld", 0.0f, true, 5, 4, true, -64, 64),
                new OreDefaults("tanzanite_nether", 0.0f, true, 5, 4, true, -64, 94),
                new OreDefaults("tanzanite_mining", 0.0f, false, 5, 4, true, MIN_NET, 108),
                new OreDefaults("tin_overworld", 0.0f, false, 7, 6, false, -64, 91),
                new OreDefaults("tin_end", 0.0f, false, 7, 6, false, -64, 71),
                new OreDefaults("tin_mining", 0.0f, false, 7, 6, false, MIN_END, MAX_STONE),
                new OreDefaults("titanium_overworld", 0.0f, true, 5, 5, false, -64, 77),
                new OreDefaults("titanium_end", 0.0f, true, 5, 5, false, -64, 65),
                new OreDefaults("titanium_mining", 0.0f, false, 5, 5, false, MIN_END, 115),
                new OreDefaults("tungsten_overworld", 0.0f, true, 5, 5, false, -64, -1),
                new OreDefaults("tungsten_end", 0.0f, true, 5, 5, false, -64, 64),
                new OreDefaults("tungsten_mining", 0.0f, false, 5, 5, false, MIN_END, 119),
                new OreDefaults("ultimatitanium_end", 0.0f, true, 4, 4, false, -64, 64),
                new OreDefaults("ultimatitanium_mining", 0.0f, false, 4, 4, false, MIN_END, MAX_END),
                new OreDefaults("uraninite_overworld", 0.0f, false, 6, 5, false, -64, 89),
                new OreDefaults("uraninite_nether", 0.0f, false, 6, 5, false, -64, 128),
                new OreDefaults("uraninite_mining", 0.0f, false, 6, 5, false, MIN_NET, 138),
                new OreDefaults("uranium_overworld", 0.0f, false, 7, 5, false, -64, 84),
                new OreDefaults("uranium_nether", 0.0f, false, 7, 5, false, -64, 128),
                new OreDefaults("uranium_end", 0.0f, false, 7, 5, false, -64, 69),
                new OreDefaults("uranium_mining", 0.0f, false, 7, 5, false, MIN_END, 134),
                new OreDefaults("vanadium_overworld", 0.0f, false, 7, 5, false, -64, 79),
                new OreDefaults("vanadium_end", 0.0f, false, 7, 5, false, -64, 121),
                new OreDefaults("vanadium_mining", 0.0f, false, 7, 5, false, MIN_END, 115),
                new OreDefaults("zinc_overworld", 0.0f, false, 6, 6, false, -64, 98),
                new OreDefaults("zinc_mining", 0.0f, false, 6, 6, false, MIN_SLATE, MAX_STONE),
                new OreDefaults("zircon_overworld", 0.0f, true, 3, 6, true, -60, 46),
                new OreDefaults("zircon_nether", 0.0f, true, 3, 6, true, -64, 80),
                new OreDefaults("zircon_mining", 0.0f, false, 4, 6, true, MIN_NET, 104)
        );

        public OreGenerationConfig(ModConfigSpec.Builder bldr) {
            bldr.comment("Ore Generation Toggles").push("ores");

            for (OreDefaults d : DEFAULTS) {
                enableToggles.put(d.id(), oreToggleCfg(bldr, d.id()));
            }
            bldr.pop();

            bldr.comment("Ore Placement Values").push("ore_values");

            for (OreDefaults d : DEFAULTS) {
                placement.put(d.id(), new OrePlacementConfig(bldr, d.id(), d.airExposure(), d.rare(),
                        d.veinsPerChunk(), d.veinSize(), d.triangle(), d.minY(), d.maxY));
            }
            bldr.pop();
        }

        public boolean isEnabled(ResourceLocation oreId) {
            ModConfigSpec.BooleanValue toggle = enableToggles.get(oreId.getPath());
            return toggle == null || toggle.get();
        }

        private ModConfigSpec.BooleanValue oreToggleCfg(ModConfigSpec.Builder bldr, String id) {
            return bldr
                    .comment("[Server] Enable " + capitalize(id) + " ore generation.")
                    .translation("config.eternalores.worldgen.ores." + id)
                    .gameRestart()
                    .define(id, true);
        }

        public OrePlacementConfig get(ResourceLocation oreId) {
            return placement.get(oreId.getPath());
        }

        public int getVeinsPerChunk(ResourceLocation oreId) {
            OrePlacementConfig cfg = get(oreId);
            return cfg != null ? cfg.veinsPerChunk.get() : 8;
        }

        public int getMinY(ResourceLocation oreId) {
            OrePlacementConfig cfg = get(oreId);
            return cfg != null ? cfg.minY.get() : -64;
        }

        public int getMaxY(ResourceLocation oreId) {
            OrePlacementConfig cfg = get(oreId);
            return cfg != null ? cfg.maxY.get() : 80;
        }

        public double getDiscardChance(ResourceLocation oreId) {
            OrePlacementConfig cfg = get(oreId);
            return cfg != null ? cfg.discardChance.get() : 0.0;
        }

        public boolean isRare(ResourceLocation oreId) {
            OrePlacementConfig cfg = get(oreId);
            return cfg != null && cfg.rare.get();
        }

        public boolean isTriangle(ResourceLocation oreId) {
            OrePlacementConfig cfg = get(oreId);
            return cfg != null && cfg.triangular.get();
        }

        public int getVeinSize(ResourceLocation oreId) {
            OrePlacementConfig cfg = get(oreId);
            return cfg != null ? cfg.veinSize.get() : 8;
        }

        public static boolean isOreEnabled(ResourceLocation oreId) {
            return CONFIG.ores.isEnabled(oreId);
        }
    }

    public static class OrePlacementConfig {
        public final ModConfigSpec.DoubleValue discardChance;
        public final ModConfigSpec.BooleanValue rare;
        public final ModConfigSpec.IntValue veinsPerChunk;
        public final ModConfigSpec.IntValue veinSize;
        public final ModConfigSpec.BooleanValue triangular;
        public final ModConfigSpec.IntValue minY;
        public final ModConfigSpec.IntValue maxY;

        public OrePlacementConfig(ModConfigSpec.Builder bldr, String name, float air, boolean isRare, int defVeins, int defSize, boolean isTriangle, int defMin, int defMax) {
            bldr.push(capitalize(name));

            this.discardChance = bldr
                    .comment("Chance to discard ore block when exposed to air")
                    .gameRestart()
                    .defineInRange("discardChanceOnAirExposure", air, 0.0, 1.0);

            this.rare = bldr
                    .comment("Use rare placement instead of common")
                    .gameRestart()
                    .define("rare", isRare);

            this.veinsPerChunk = bldr
                    .comment("Veins per chunk")
                    .gameRestart()
                    .defineInRange("veinsPerChunk", defVeins, 0, 16);

            this.veinSize = bldr
                    .comment("Define Ore vein size")
                    .gameRestart()
                    .defineInRange("veinSize", defSize, 0, 32);

            this.triangular = bldr
                    .comment("Use triangular height distribution")
                    .gameRestart()
                    .define("triangular", isTriangle);

            this.minY = bldr
                    .comment("Minimum generation height")
                    .gameRestart()
                    .defineInRange("minY", defMin, -512, 512);

            this.maxY = bldr
                    .comment("Maximum generation height")
                    .gameRestart()
                    .defineInRange("maxY", defMax, -512, 512);

            bldr.pop();
        }
    }
}
