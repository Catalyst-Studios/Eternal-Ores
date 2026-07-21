package net.radzratz.eternalores.util.config;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.common.ModConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

import java.util.HashMap;
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
                
                 Each change requires a Game Restart.
                """).push("world_generation");

        this.ores = new OreGenerationConfig(builder);

        builder.pop();
    }

    public static class OreGenerationConfig {
        public final Map<String, OrePlacementConfig> placement = new HashMap<>();

        public final ModConfigSpec.BooleanValue enableAluminumOverworld;
        public final ModConfigSpec.BooleanValue enableAluminumMining;
        public final ModConfigSpec.BooleanValue enableAmberOverworld;
        public final ModConfigSpec.BooleanValue enableAmberMining;
        public final ModConfigSpec.BooleanValue enableAnthraciteOverworld;
        public final ModConfigSpec.BooleanValue enableAnthraciteMining;
        public final ModConfigSpec.BooleanValue enableAncientDebrisMining;
        public final ModConfigSpec.BooleanValue enableApatiteOverworld;
        public final ModConfigSpec.BooleanValue enableApatiteMining;
        public final ModConfigSpec.BooleanValue enableArditeNether;
        public final ModConfigSpec.BooleanValue enableArditeMining;
        public final ModConfigSpec.BooleanValue enableBerylliumOverworld;
        public final ModConfigSpec.BooleanValue enableBerylliumMining;
        public final ModConfigSpec.BooleanValue enableBituminousOverworld;
        public final ModConfigSpec.BooleanValue enableBituminousMining;
        public final ModConfigSpec.BooleanValue enableCinnabarOverworld;
        public final ModConfigSpec.BooleanValue enableCinnabarNether;
        public final ModConfigSpec.BooleanValue enableCinnabarMining;
        public final ModConfigSpec.BooleanValue enableCoalMining;
        public final ModConfigSpec.BooleanValue enableCobaltOverworld;
        public final ModConfigSpec.BooleanValue enableCobaltNether;
        public final ModConfigSpec.BooleanValue enableCobaltMining;
        public final ModConfigSpec.BooleanValue enableCopperMining;
        public final ModConfigSpec.BooleanValue enableDiamondMining;
        public final ModConfigSpec.BooleanValue enableEmeraldMining;
        public final ModConfigSpec.BooleanValue enableFluoriteOverworld;
        public final ModConfigSpec.BooleanValue enableFluoriteEnd;
        public final ModConfigSpec.BooleanValue enableFluoriteMining;
        public final ModConfigSpec.BooleanValue enableGalliumOverworld;
        public final ModConfigSpec.BooleanValue enableGalliumNether;
        public final ModConfigSpec.BooleanValue enableGalliumMining;
        public final ModConfigSpec.BooleanValue enableGarnetOverworld;
        public final ModConfigSpec.BooleanValue enableGarnetNether;
        public final ModConfigSpec.BooleanValue enableGarnetMining;
        public final ModConfigSpec.BooleanValue enableGoldMining;
        public final ModConfigSpec.BooleanValue enableIridiumOverworld;
        public final ModConfigSpec.BooleanValue enableIridiumEnd;
        public final ModConfigSpec.BooleanValue enableIridiumMining;
        public final ModConfigSpec.BooleanValue enableIronMining;
        public final ModConfigSpec.BooleanValue enableJadeOverworld;
        public final ModConfigSpec.BooleanValue enableJadeNether;
        public final ModConfigSpec.BooleanValue enableJadeMining;
        public final ModConfigSpec.BooleanValue enableLapisMining;
        public final ModConfigSpec.BooleanValue enableLeadOverworld;
        public final ModConfigSpec.BooleanValue enableLeadEnd;
        public final ModConfigSpec.BooleanValue enableLeadMining;
        public final ModConfigSpec.BooleanValue enableLigniteOverworld;
        public final ModConfigSpec.BooleanValue enableLigniteMining;
        public final ModConfigSpec.BooleanValue enableMolybdenumOverworld;
        public final ModConfigSpec.BooleanValue enableMolybdenumNether;
        public final ModConfigSpec.BooleanValue enableMolybdenumEnd;
        public final ModConfigSpec.BooleanValue enableMolybdenumMining;
        public final ModConfigSpec.BooleanValue enableNecroticariteNether;
        public final ModConfigSpec.BooleanValue enableNecroticariteMining;
        public final ModConfigSpec.BooleanValue enableNeodymiumOverworld;
        public final ModConfigSpec.BooleanValue enableNeodymiumEnd;
        public final ModConfigSpec.BooleanValue enableNeodymiumMining;
        public final ModConfigSpec.BooleanValue enableNiterOverworld;
        public final ModConfigSpec.BooleanValue enableNiterMining;
        public final ModConfigSpec.BooleanValue enableNickelOverworld;
        public final ModConfigSpec.BooleanValue enableNickelNether;
        public final ModConfigSpec.BooleanValue enableNickelMining;
        public final ModConfigSpec.BooleanValue enableOnyxOverworld;
        public final ModConfigSpec.BooleanValue enableOnyxNether;
        public final ModConfigSpec.BooleanValue enableOnyxMining;
        public final ModConfigSpec.BooleanValue enableObsidianNether;
        public final ModConfigSpec.BooleanValue enableObsidianMining;
        public final ModConfigSpec.BooleanValue enableOsmiumOverworld;
        public final ModConfigSpec.BooleanValue enableOsmiumNether;
        public final ModConfigSpec.BooleanValue enableOsmiumMining;
        public final ModConfigSpec.BooleanValue enablePalladiumOverworld;
        public final ModConfigSpec.BooleanValue enablePalladiumEnd;
        public final ModConfigSpec.BooleanValue enablePalladiumMining;
        public final ModConfigSpec.BooleanValue enablePeatOverworld;
        public final ModConfigSpec.BooleanValue enablePeatMining;
        public final ModConfigSpec.BooleanValue enablePearlOverworld;
        public final ModConfigSpec.BooleanValue enablePearlMining;
        public final ModConfigSpec.BooleanValue enablePeridotOverworld;
        public final ModConfigSpec.BooleanValue enablePeridotNether;
        public final ModConfigSpec.BooleanValue enablePeridotMining;
        public final ModConfigSpec.BooleanValue enablePlatinumOverworld;
        public final ModConfigSpec.BooleanValue enablePlatinumEnd;
        public final ModConfigSpec.BooleanValue enablePlatinumMining;
        public final ModConfigSpec.BooleanValue enablePyroliteNether;
        public final ModConfigSpec.BooleanValue enablePyroliteEnd;
        public final ModConfigSpec.BooleanValue enablePyroliteMining;
        public final ModConfigSpec.BooleanValue enableQuartzMining;
        public final ModConfigSpec.BooleanValue enableRedstoneMining;
        public final ModConfigSpec.BooleanValue enableRubyOverworld;
        public final ModConfigSpec.BooleanValue enableRubyNether;
        public final ModConfigSpec.BooleanValue enableRubyMining;
        public final ModConfigSpec.BooleanValue enableSaltOverworld;
        public final ModConfigSpec.BooleanValue enableSaltMining;
        public final ModConfigSpec.BooleanValue enableSapphireOverworld;
        public final ModConfigSpec.BooleanValue enableSapphireEnd;
        public final ModConfigSpec.BooleanValue enableSapphireMining;
        public final ModConfigSpec.BooleanValue enableSculkiteOverworld;
        public final ModConfigSpec.BooleanValue enableSculkiteMining;
        public final ModConfigSpec.BooleanValue enableSilverOverworld;
        public final ModConfigSpec.BooleanValue enableSilverNether;
        public final ModConfigSpec.BooleanValue enableSilverMining;
        public final ModConfigSpec.BooleanValue enableSulfurOverworld;
        public final ModConfigSpec.BooleanValue enableSulfurNether;
        public final ModConfigSpec.BooleanValue enableSulfurMining;
        public final ModConfigSpec.BooleanValue enabledSpinelOverworld;
        public final ModConfigSpec.BooleanValue enabledSpinelNether;
        public final ModConfigSpec.BooleanValue enabledSpinelMining;
        public final ModConfigSpec.BooleanValue enableTanzaniteOverworld;
        public final ModConfigSpec.BooleanValue enableTanzaniteNether;
        public final ModConfigSpec.BooleanValue enableTanzaniteMining;
        public final ModConfigSpec.BooleanValue enableTitaniumOverworld;
        public final ModConfigSpec.BooleanValue enableTitaniumEnd;
        public final ModConfigSpec.BooleanValue enableTitaniumMining;
        public final ModConfigSpec.BooleanValue enableTinOverworld;
        public final ModConfigSpec.BooleanValue enableTinEnd;
        public final ModConfigSpec.BooleanValue enableTinMining;
        public final ModConfigSpec.BooleanValue enableTungstenOverworld;
        public final ModConfigSpec.BooleanValue enableTungstenEnd;
        public final ModConfigSpec.BooleanValue enableTungstenMining;
        public final ModConfigSpec.BooleanValue enableUltimatitaniumEnd;
        public final ModConfigSpec.BooleanValue enableUltimatitaniumMining;
        public final ModConfigSpec.BooleanValue enableUraniniteOverworld;
        public final ModConfigSpec.BooleanValue enableUraniniteNether;
        public final ModConfigSpec.BooleanValue enableUraniniteMining;
        public final ModConfigSpec.BooleanValue enableUraniumOverworld;
        public final ModConfigSpec.BooleanValue enableUraniumNether;
        public final ModConfigSpec.BooleanValue enableUraniumEnd;
        public final ModConfigSpec.BooleanValue enableUraniumMining;
        public final ModConfigSpec.BooleanValue enableVanadiumOverworld;
        public final ModConfigSpec.BooleanValue enableVanadiumEnd;
        public final ModConfigSpec.BooleanValue enableVanadiumMining;
        public final ModConfigSpec.BooleanValue enableZincOverworld;
        public final ModConfigSpec.BooleanValue enableZincMining;
        public final ModConfigSpec.BooleanValue enableZirconOverworld;
        public final ModConfigSpec.BooleanValue enableZirconNether;
        public final ModConfigSpec.BooleanValue enableZirconMining;

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

        public OreGenerationConfig(ModConfigSpec.Builder bldr) {
            bldr.comment("Ore Generation Toggles").push("ores");

            this.enableAluminumOverworld = oreToggleCfg(bldr, "aluminum_overworld");
            this.enableAluminumMining = oreToggleCfg(bldr, "aluminum_mining");
            this.enableAmberOverworld = oreToggleCfg(bldr, "amber_overworld");
            this.enableAmberMining = oreToggleCfg(bldr, "amber_mining");
            this.enableAnthraciteOverworld = oreToggleCfg(bldr, "anthracite_overworld");
            this.enableAnthraciteMining = oreToggleCfg(bldr, "anthracite_mining");
            this.enableAncientDebrisMining = oreToggleCfg(bldr, "ancient_debris_mining");
            this.enableApatiteOverworld = oreToggleCfg(bldr, "apatite_overworld");
            this.enableApatiteMining = oreToggleCfg(bldr, "apatite_mining");
            this.enableArditeNether = oreToggleCfg(bldr, "ardite_nether");
            this.enableArditeMining = oreToggleCfg(bldr, "ardite_mining");
            this.enableBerylliumOverworld = oreToggleCfg(bldr, "beryllium_overworld");
            this.enableBerylliumMining = oreToggleCfg(bldr, "beryllium_mining");
            this.enableBituminousOverworld = oreToggleCfg(bldr, "bituminous_overworld");
            this.enableBituminousMining = oreToggleCfg(bldr, "bituminous_mining");
            this.enableCinnabarOverworld = oreToggleCfg(bldr, "cinnabar_overworld");
            this.enableCinnabarNether = oreToggleCfg(bldr, "cinnabar_nether");
            this.enableCinnabarMining = oreToggleCfg(bldr, "cinnabar_mining");
            this.enableCoalMining = oreToggleCfg(bldr, "coal_mining");
            this.enableCobaltOverworld = oreToggleCfg(bldr, "cobalt_overworld");
            this.enableCobaltNether = oreToggleCfg(bldr, "cobalt_nether");
            this.enableCobaltMining = oreToggleCfg(bldr, "cobalt_mining");
            this.enableCopperMining = oreToggleCfg(bldr, "copper_mining");
            this.enableDiamondMining = oreToggleCfg(bldr, "diamond_mining");
            this.enableEmeraldMining = oreToggleCfg(bldr, "emerald_mining");
            this.enableFluoriteOverworld = oreToggleCfg(bldr, "fluorite_overworld");
            this.enableFluoriteEnd = oreToggleCfg(bldr, "fluorite_end");
            this.enableFluoriteMining = oreToggleCfg(bldr, "fluorite_mining");
            this.enableGalliumOverworld = oreToggleCfg(bldr, "gallium_overworld");
            this.enableGalliumNether = oreToggleCfg(bldr, "gallium_nether");
            this.enableGalliumMining = oreToggleCfg(bldr, "gallium_mining");
            this.enableGarnetOverworld = oreToggleCfg(bldr, "garnet_overworld");
            this.enableGarnetNether = oreToggleCfg(bldr, "garnet_nether");
            this.enableGarnetMining = oreToggleCfg(bldr, "garnet_mining");
            this.enableGoldMining = oreToggleCfg(bldr, "gold_mining");
            this.enableIridiumOverworld = oreToggleCfg(bldr, "iridium_overworld");
            this.enableIridiumEnd = oreToggleCfg(bldr, "iridium_end");
            this.enableIridiumMining = oreToggleCfg(bldr, "iridium_mining");
            this.enableIronMining = oreToggleCfg(bldr, "iron_mining");
            this.enableJadeOverworld = oreToggleCfg(bldr, "jade_overworld");
            this.enableJadeNether = oreToggleCfg(bldr, "jade_nether");
            this.enableJadeMining = oreToggleCfg(bldr, "jade_mining");
            this.enableLapisMining = oreToggleCfg(bldr, "lapis_mining");
            this.enableLeadOverworld = oreToggleCfg(bldr, "lead_overworld");
            this.enableLeadEnd = oreToggleCfg(bldr, "lead_end");
            this.enableLeadMining = oreToggleCfg(bldr, "lead_mining");
            this.enableLigniteOverworld = oreToggleCfg(bldr, "lignite_overworld");
            this.enableLigniteMining = oreToggleCfg(bldr, "lignite_mining");
            this.enableMolybdenumOverworld = oreToggleCfg(bldr, "molybdenum_overworld");
            this.enableMolybdenumNether = oreToggleCfg(bldr, "molybdenum_nether");
            this.enableMolybdenumEnd = oreToggleCfg(bldr, "molybdenum_end");
            this.enableMolybdenumMining = oreToggleCfg(bldr, "molybdenum_mining");
            this.enableNecroticariteNether = oreToggleCfg(bldr, "necroticarite_nether");
            this.enableNecroticariteMining = oreToggleCfg(bldr, "necroticarite_mining");
            this.enableNeodymiumOverworld = oreToggleCfg(bldr, "neodymium_overworld");
            this.enableNeodymiumEnd = oreToggleCfg(bldr, "neodymium_end");
            this.enableNeodymiumMining = oreToggleCfg(bldr, "neodymium_mining");
            this.enableNiterOverworld = oreToggleCfg(bldr, "niter_overworld");
            this.enableNiterMining = oreToggleCfg(bldr, "niter_mining");
            this.enableNickelOverworld = oreToggleCfg(bldr, "nickel_overworld");
            this.enableNickelNether = oreToggleCfg(bldr, "nickel_nether");
            this.enableNickelMining = oreToggleCfg(bldr, "nickel_mining");
            this.enableOnyxOverworld = oreToggleCfg(bldr, "onyx_overworld");
            this.enableOnyxNether = oreToggleCfg(bldr, "onyx_nether");
            this.enableOnyxMining = oreToggleCfg(bldr, "onyx_mining");
            this.enableObsidianNether = oreToggleCfg(bldr, "obsidian_nether");
            this.enableObsidianMining = oreToggleCfg(bldr, "obsidian_mining");
            this.enableOsmiumOverworld = oreToggleCfg(bldr, "osmium_overworld");
            this.enableOsmiumNether = oreToggleCfg(bldr, "osmium_nether");
            this.enableOsmiumMining = oreToggleCfg(bldr, "osmium_mining");
            this.enablePalladiumOverworld = oreToggleCfg(bldr, "palladium_overworld");
            this.enablePalladiumEnd = oreToggleCfg(bldr, "palladium_end");
            this.enablePalladiumMining = oreToggleCfg(bldr, "palladium_mining");
            this.enablePeatOverworld = oreToggleCfg(bldr, "peat_overworld");
            this.enablePeatMining = oreToggleCfg(bldr, "peat_mining");
            this.enablePearlOverworld = oreToggleCfg(bldr, "pearl_overworld");
            this.enablePearlMining = oreToggleCfg(bldr, "pearl_mining");
            this.enablePeridotOverworld = oreToggleCfg(bldr, "peridot_overworld");
            this.enablePeridotNether = oreToggleCfg(bldr, "peridot_nether");
            this.enablePeridotMining = oreToggleCfg(bldr, "peridot_mining");
            this.enablePlatinumOverworld = oreToggleCfg(bldr, "platinum_overworld");
            this.enablePlatinumEnd = oreToggleCfg(bldr, "platinum_end");
            this.enablePlatinumMining = oreToggleCfg(bldr, "platinum_mining");
            this.enablePyroliteNether = oreToggleCfg(bldr, "pyrolite_nether");
            this.enablePyroliteEnd = oreToggleCfg(bldr, "pyrolite_end");
            this.enablePyroliteMining = oreToggleCfg(bldr, "pyrolite_mining");
            this.enableQuartzMining = oreToggleCfg(bldr, "quartz_mining");
            this.enableRedstoneMining = oreToggleCfg(bldr, "redstone_mining");
            this.enableRubyOverworld = oreToggleCfg(bldr, "ruby_overworld");
            this.enableRubyNether = oreToggleCfg(bldr, "ruby_nether");
            this.enableRubyMining = oreToggleCfg(bldr, "ruby_mining");
            this.enableSaltOverworld = oreToggleCfg(bldr, "salt_overworld");
            this.enableSaltMining = oreToggleCfg(bldr, "salt_mining");
            this.enableSapphireOverworld = oreToggleCfg(bldr, "sapphire_overworld");
            this.enableSapphireEnd = oreToggleCfg(bldr, "sapphire_end");
            this.enableSapphireMining = oreToggleCfg(bldr, "sapphire_mining");
            this.enableSculkiteOverworld = oreToggleCfg(bldr, "sculkite_overworld");
            this.enableSculkiteMining = oreToggleCfg(bldr, "sculkite_mining");
            this.enableSilverOverworld = oreToggleCfg(bldr, "silver_overworld");
            this.enableSilverNether = oreToggleCfg(bldr, "silver_nether");
            this.enableSilverMining = oreToggleCfg(bldr, "silver_mining");
            this.enableSulfurOverworld = oreToggleCfg(bldr, "sulfur_overworld");
            this.enableSulfurNether = oreToggleCfg(bldr, "sulfur_nether");
            this.enableSulfurMining = oreToggleCfg(bldr, "sulfur_mining");
            this.enabledSpinelOverworld = oreToggleCfg(bldr, "spinel_overworld");
            this.enabledSpinelNether = oreToggleCfg(bldr, "spinel_nether");
            this.enabledSpinelMining = oreToggleCfg(bldr, "spinel_mining");
            this.enableTanzaniteOverworld = oreToggleCfg(bldr, "tanzanite_overworld");
            this.enableTanzaniteNether = oreToggleCfg(bldr, "tanzanite_nether");
            this.enableTanzaniteMining = oreToggleCfg(bldr, "tanzanite_mining");
            this.enableTitaniumOverworld = oreToggleCfg(bldr, "titanium_overworld");
            this.enableTitaniumEnd = oreToggleCfg(bldr, "titanium_end");
            this.enableTitaniumMining = oreToggleCfg(bldr, "titanium_mining");
            this.enableTinOverworld = oreToggleCfg(bldr, "tin_overworld");
            this.enableTinEnd = oreToggleCfg(bldr, "tin_end");
            this.enableTinMining = oreToggleCfg(bldr, "tin_mining");
            this.enableTungstenOverworld = oreToggleCfg(bldr, "tungsten_overworld");
            this.enableTungstenEnd = oreToggleCfg(bldr, "tungsten_end");
            this.enableTungstenMining = oreToggleCfg(bldr, "tungsten_mining");
            this.enableUltimatitaniumEnd = oreToggleCfg(bldr, "ultimatitanium_end");
            this.enableUltimatitaniumMining = oreToggleCfg(bldr, "ultimatitanium_mining");
            this.enableUraniniteOverworld = oreToggleCfg(bldr, "uraninite_overworld");
            this.enableUraniniteNether = oreToggleCfg(bldr, "uraninite_nether");
            this.enableUraniniteMining = oreToggleCfg(bldr, "uraninite_mining");
            this.enableUraniumOverworld = oreToggleCfg(bldr, "uranium_overworld");
            this.enableUraniumNether = oreToggleCfg(bldr, "uranium_nether");
            this.enableUraniumEnd = oreToggleCfg(bldr, "uranium_end");
            this.enableUraniumMining = oreToggleCfg(bldr, "uranium_mining");
            this.enableVanadiumOverworld = oreToggleCfg(bldr, "vanadium_overworld");
            this.enableVanadiumEnd = oreToggleCfg(bldr, "vanadium_end");
            this.enableVanadiumMining = oreToggleCfg(bldr, "vanadium_mining");
            this.enableZincOverworld = oreToggleCfg(bldr, "zinc_overworld");
            this.enableZincMining = oreToggleCfg(bldr, "zinc_mining");
            this.enableZirconOverworld = oreToggleCfg(bldr, "zircon_overworld");
            this.enableZirconNether = oreToggleCfg(bldr, "zircon_nether");
            this.enableZirconMining = oreToggleCfg(bldr, "zircon_mining");

            bldr.pop();

            bldr.comment("Ore Placement Values").push("ore_values");

            this.orePlacementCfg(bldr, "aluminum_overworld", 0.0f, false, 6, 7, false, -64, 90);
            this.orePlacementCfg(bldr, "aluminum_mining", 0.0f, false, 6, 7, false, MIN_SLATE, 155);
            this.orePlacementCfg(bldr, "amber_overworld", 0.0f, true, 3, 5, true, -64, 68);
            this.orePlacementCfg(bldr, "amber_mining", 0.0f, false, 3, 5, true, MIN_SLATE, 124);
            this.orePlacementCfg(bldr, "ancient_debris_mining", 0.0f, false, 5, 5, false, MIN_NET, MAX_NET);
            this.orePlacementCfg(bldr, "anthracite_overworld", 0.0f, false, 7, 5, false, -64, 85);
            this.orePlacementCfg(bldr, "anthracite_mining", 0.0f, false, 7, 5, false, MIN_SLATE, MAX_STONE);
            this.orePlacementCfg(bldr, "apatite_overworld", 0.0f, true, 5, 5, false, -64, 77);
            this.orePlacementCfg(bldr, "apatite_mining", 0.0f, false, 5, 5, false, MIN_SLATE, 128);
            this.orePlacementCfg(bldr, "ardite_nether", 0.0f, true, 6, 3, false, -64, 128);
            this.orePlacementCfg(bldr, "ardite_mining", 0.0f, false, 6, 5, false, MIN_NET, MAX_NET);
            this.orePlacementCfg(bldr, "beryllium_overworld", 0.0f, false, 8, 5, false, MIN_SLATE, 84);
            this.orePlacementCfg(bldr, "beryllium_mining", 0.0f, false, 8, 5, false, -64, 94);
            this.orePlacementCfg(bldr, "bituminous_overworld", 0.0f, false, 8, 7, false, -64, 94);
            this.orePlacementCfg(bldr, "bituminous_mining", 0.0f, false, 8, 7, false, MIN_SLATE, MAX_STONE);
            this.orePlacementCfg(bldr, "cinnabar_overworld", 0.0f, true, 8, 5, true, -61, 75);
            this.orePlacementCfg(bldr, "cinnabar_nether", 0.0f, true, 8, 5, true, -64, 128);
            this.orePlacementCfg(bldr, "cinnabar_mining", 0.0f, false, 8, 5, true, MIN_NET, 129);
            this.orePlacementCfg(bldr, "coal_mining", 0.0f, false, 8, 7, false, MIN_SLATE, MAX_STONE);
            this.orePlacementCfg(bldr, "cobalt_overworld", 0.0f, true, 6, 5, false, -64, 46);
            this.orePlacementCfg(bldr, "cobalt_nether", 0.0f, true, 6, 5, false, -64, 128);
            this.orePlacementCfg(bldr, "cobalt_mining", 0.0f, false, 6, 5,false, MIN_NET, 100);
            this.orePlacementCfg(bldr, "copper_mining", 0.0f, false, 7, 6, false, MIN_SLATE, MAX_STONE);
            this.orePlacementCfg(bldr, "diamond_mining", 0.0f, false, 7, 5, false, MIN_SLATE, 102);
            this.orePlacementCfg(bldr, "emerald_mining", 0.0f, false, 6, 4, false, MIN_SLATE, 102);
            this.orePlacementCfg(bldr, "fluorite_overworld", 0.0f, false, 6, 4, false, -61, 94);
            this.orePlacementCfg(bldr, "fluorite_end", 0.0f, false, 6, 4, false, -64, 102);
            this.orePlacementCfg(bldr, "fluorite_mining", 0.0f, false, 6, 4, false, MIN_END, 120);
            this.orePlacementCfg(bldr, "gallium_overworld", 0.0f, false, 7, 7, false, -59, 89);
            this.orePlacementCfg(bldr, "gallium_nether", 0.0f, false, 7, 7, false, -64, 128);
            this.orePlacementCfg(bldr, "gallium_mining", 0.0f, false, 7, 7, false, MIN_NET, MAX_STONE);
            this.orePlacementCfg(bldr, "garnet_overworld", 0.0f, true, 6, 4, true, -64, 65);
            this.orePlacementCfg(bldr, "garnet_nether", 0.0f, true, 6, 4, true, -64, 128);
            this.orePlacementCfg(bldr, "garnet_mining", 0.0f, false, 6, 4, true, MIN_NET, 106);
            this.orePlacementCfg(bldr, "gold_mining", 0.0f, false, 7, 5, false, MIN_NET, 108);
            this.orePlacementCfg(bldr, "jade_overworld", 0.0f, true, 5, 4, true, -52, 51);
            this.orePlacementCfg(bldr, "jade_nether", 0.0f, true, 5, 4, true, -64, 76);
            this.orePlacementCfg(bldr, "jade_mining", 0.0f, false, 5, 4, true, MIN_NET, 94);
            this.orePlacementCfg(bldr, "iridium_overworld", 0.0f, false, 6, 5, false, -64, 89);
            this.orePlacementCfg(bldr, "iridium_end", 0.0f, false, 6, 5, false, -64, 95);
            this.orePlacementCfg(bldr, "iridium_mining", 0.0f, false, 6, 5, false, MIN_END, 124);
            this.orePlacementCfg(bldr, "iron_mining", 0.0f, false, 8, 6, false, MIN_SLATE, MAX_STONE);
            this.orePlacementCfg(bldr, "lapis_mining", 0.0f, false, 7, 5, false, MIN_SLATE, 129);
            this.orePlacementCfg(bldr, "lead_overworld", 0.0f, false, 6, 5, false, -64, 79);
            this.orePlacementCfg(bldr, "lead_end", 0.0f, false, 6, 5, false, -64, 98);
            this.orePlacementCfg(bldr, "lead_mining", 0.0f, false, 6, 5, false, MIN_END, 139);
            this.orePlacementCfg(bldr, "lignite_overworld", 0.0f, false, 7, 7, false, -64, 91);
            this.orePlacementCfg(bldr, "lignite_mining", 0.0f, false, 7, 7, false, MIN_SLATE, MAX_STONE);
            this.orePlacementCfg(bldr, "molybdenum_overworld", 0.0f, false, 7, 7, false, -64, 138);
            this.orePlacementCfg(bldr, "molybdenum_nether", 0.0f, false, 7, 7, false, -64, MAX_STONE);
            this.orePlacementCfg(bldr, "molybdenum_end", 0.0f, false, 7, 7, false, -64, 129);
            this.orePlacementCfg(bldr, "molybdenum_mining", 0.0f, false, 7, 7, false, MIN_END, 120);
            this.orePlacementCfg(bldr, "necroticarite_nether", 0.0f, true, 5, 4, false, -64, 128);
            this.orePlacementCfg(bldr, "necroticarite_mining", 0.0f, false, 5, 4, false, MIN_NET, MAX_NET);
            this.orePlacementCfg(bldr, "neodymium_overworld", 0.0f, false, 4, 6, false, -64, 81);
            this.orePlacementCfg(bldr, "neodymium_end", 0.0f, false, 4, 6, false, -64, 120);
            this.orePlacementCfg(bldr, "neodymium_mining", 0.0f, false, 4, 6, false, MIN_END, 101);
            this.orePlacementCfg(bldr, "niter_overworld", 0.0f, false, 6, 6, false, -64, 84);
            this.orePlacementCfg(bldr, "niter_mining", 0.0f, false, 6, 6, false, MIN_SLATE, MAX_STONE);
            this.orePlacementCfg(bldr, "nickel_overworld", 0.0f, false, 7, 7, false, -64, 102);
            this.orePlacementCfg(bldr, "nickel_nether", 0.0f, false, 7, 7, false, -64, 124);
            this.orePlacementCfg(bldr, "nickel_mining", 0.0f, false, 7, 7, false, MIN_NET, MAX_STONE);
            this.orePlacementCfg(bldr, "obsidian_nether", 0.0f, true, 5, 5, false, -64, 128);
            this.orePlacementCfg(bldr, "obsidian_mining", 0.0f, false, 5, 5, false, MIN_NET, MAX_NET);
            this.orePlacementCfg(bldr, "onyx_overworld", 0.0f, true, 6, 5, true, -64, 98);
            this.orePlacementCfg(bldr, "onyx_nether", 0.0f, true, 6, 5, true, -64, 120);
            this.orePlacementCfg(bldr, "onyx_mining", 0.0f, false, 6, 5, true, MIN_NET, 107);
            this.orePlacementCfg(bldr, "osmium_overworld", 0.0f, false, 7, 6, false, -64, 101);
            this.orePlacementCfg(bldr, "osmium_nether", 0.0f, false, 7, 6, false, -64, 118);
            this.orePlacementCfg(bldr, "osmium_mining", 0.0f, false, 7, 6, false, MIN_NET, 142);
            this.orePlacementCfg(bldr, "palladium_overworld", 0.0f, false, 5, 5, false, -64, 89);
            this.orePlacementCfg(bldr, "palladium_end", 0.0f, false, 5, 5, false, -64, 129);
            this.orePlacementCfg(bldr, "palladium_mining", 0.0f, false, 5, 5, false, MIN_END, 107);
            this.orePlacementCfg(bldr, "peat_overworld", 0.0f, false, 8, 7, false, -64, 120);
            this.orePlacementCfg(bldr, "peat_mining", 0.0f, false, 6, 7, false, MIN_SLATE, MAX_STONE);
            this.orePlacementCfg(bldr, "pearl_overworld", 0.0f, true, 4, 3, true, 40, 90);
            this.orePlacementCfg(bldr, "pearl_mining", 0.0f, false, 4, 3, true, MIN_STONE, 109);
            this.orePlacementCfg(bldr, "peridot_overworld", 0.0f, true, 4, 4, true, -64, 71);
            this.orePlacementCfg(bldr, "peridot_nether", 0.0f, true, 4, 4, true, -64, 117);
            this.orePlacementCfg(bldr, "peridot_mining", 0.0f, false, 4, 4, true, MIN_NET, 109);
            this.orePlacementCfg(bldr, "platinum_overworld", 0.0f, false, 5, 5, false, -64, 76);
            this.orePlacementCfg(bldr, "platinum_end", 0.0f, false, 5, 5, false, -64, 70);
            this.orePlacementCfg(bldr, "platinum_mining", 0.0f, false, 5, 5, false, MIN_END, 138);
            this.orePlacementCfg(bldr, "pyrolite_nether", 0.0f, true, 4, 3, true, -64, 105);
            this.orePlacementCfg(bldr, "pyrolite_end", 0.0f, true, 4, 3, true, -64, 70);
            this.orePlacementCfg(bldr, "pyrolite_mining", 0.0f, false, 4, 3, true, MIN_END, MAX_NET);
            this.orePlacementCfg(bldr, "quartz_mining", 0.0f, false, 5, 5, false, MIN_NET, MAX_NET);
            this.orePlacementCfg(bldr, "redstone_mining", 0.0f, false, 7, 6, false, MIN_SLATE, 134);
            this.orePlacementCfg(bldr, "ruby_overworld", 0.0f, true, 6, 4, false, -60, 75);
            this.orePlacementCfg(bldr, "ruby_nether", 0.0f, true, 6, 4, false, -60, 90);
            this.orePlacementCfg(bldr, "ruby_mining", 0.0f, false, 6, 4, false, MIN_NET, 109);
            this.orePlacementCfg(bldr, "salt_overworld", 0.0f, false, 4, 5, false, 40, 90);
            this.orePlacementCfg(bldr, "salt_mining", 0.0f, false, 4, 5, false, MIN_STONE, 129);
            this.orePlacementCfg(bldr, "sapphire_overworld", 0.0f, true, 5, 4, false, -61, 71);
            this.orePlacementCfg(bldr, "sapphire_end", 0.0f, true, 5, 4, false, -64, 99);
            this.orePlacementCfg(bldr, "sapphire_mining", 0.0f, false, 5, 4, false, MIN_END, 105);
            this.orePlacementCfg(bldr, "sculkite_overworld", 0.0f, true, 3, 3, false, -61, 0);
            this.orePlacementCfg(bldr, "sculkite_mining", 0.0f, false, 3, 3, false, MIN_SLATE, MAX_SLATE);
            this.orePlacementCfg(bldr, "silver_overworld", 0.0f, false, 6, 6, false, -61, 90);
            this.orePlacementCfg(bldr, "silver_nether", 0.0f, false, 6, 6, false, -64, 128);
            this.orePlacementCfg(bldr, "silver_mining", 0.0f, false, 6, 6, false, MIN_NET, 139);
            this.orePlacementCfg(bldr, "sulfur_overworld", 0.0f, false, 6, 6, false, -64, 81);
            this.orePlacementCfg(bldr, "sulfur_nether", 0.0f, false, 6, 6, false, -64, 128);
            this.orePlacementCfg(bldr, "sulfur_mining", 0.0f, false, 6, 6, false, MIN_NET, 139);
            this.orePlacementCfg(bldr, "spinel_overworld", 0.0f, true, 5, 5, false, -64, 79);
            this.orePlacementCfg(bldr, "spinel_nether", 0.0f, false, 5, 5, false, -64, 139);
            this.orePlacementCfg(bldr, "spinel_mining", 0.0f, false, 5, 5, false, MIN_NET, 139);
            this.orePlacementCfg(bldr, "tanzanite_overworld", 0.0f, true, 5, 4, true, -64, 64);
            this.orePlacementCfg(bldr, "tanzanite_nether", 0.0f, true, 5, 4, true, -64, 94);
            this.orePlacementCfg(bldr, "tanzanite_mining", 0.0f, false, 5, 4, true, MIN_NET, 108);
            this.orePlacementCfg(bldr, "tin_overworld", 0.0f, false, 7, 6, false, -64, 91);
            this.orePlacementCfg(bldr, "tin_end", 0.0f, false, 7, 6, false, -64, 71);
            this.orePlacementCfg(bldr, "tin_mining", 0.0f, false, 7, 6, false, MIN_END, MAX_STONE);
            this.orePlacementCfg(bldr, "titanium_overworld", 0.0f, true, 5, 5, false, -64, 77);
            this.orePlacementCfg(bldr, "titanium_end", 0.0f, true, 5, 5, false, -64, 65);
            this.orePlacementCfg(bldr, "titanium_mining", 0.0f, false, 5, 5, false, MIN_END, 115);
            this.orePlacementCfg(bldr, "tungsten_overworld", 0.0f, true, 5, 5, false, -64, -1);
            this.orePlacementCfg(bldr, "tungsten_end", 0.0f, true, 5, 5, false, -64, 64);
            this.orePlacementCfg(bldr, "tungsten_mining", 0.0f, false, 5, 5, false, MIN_END, 119);
            this.orePlacementCfg(bldr, "ultimatitanium_end", 0.0f, true, 4, 4, false, -64, 64);
            this.orePlacementCfg(bldr, "ultimatitanium_mining", 0.0f, false, 4, 4, false, MIN_END, MAX_END);
            this.orePlacementCfg(bldr, "uraninite_overworld", 0.0f, false, 6, 5, false, -64, 89);
            this.orePlacementCfg(bldr, "uraninite_nether", 0.0f, false, 6, 5, false, -64, 128);
            this.orePlacementCfg(bldr, "uraninite_mining", 0.0f, false, 6, 5, false, MIN_NET, 138);
            this.orePlacementCfg(bldr, "uranium_overworld", 0.0f, false, 7, 5, false, -64, 84);
            this.orePlacementCfg(bldr, "uranium_nether", 0.0f, false, 7, 5, false, -64, 128);
            this.orePlacementCfg(bldr, "uranium_end", 0.0f, false, 7, 5, false, -64, 69);
            this.orePlacementCfg(bldr, "uranium_mining", 0.0f, false, 7, 5, false, MIN_END, 134);
            this.orePlacementCfg(bldr, "vanadium_overworld", 0.0f, false, 7, 5, false, -64, 79);
            this.orePlacementCfg(bldr, "vanadium_end", 0.0f, false, 7, 5, false, -64, 121);
            this.orePlacementCfg(bldr, "vanadium_mining", 0.0f, false, 7, 5, false, MIN_END, 115);
            this.orePlacementCfg(bldr, "zinc_overworld", 0.0f, false, 6, 6, false, -64, 98);
            this.orePlacementCfg(bldr, "zinc_mining", 0.0f, false, 6, 6, false, MIN_SLATE, MAX_STONE);
            this.orePlacementCfg(bldr, "zircon_overworld", 0.0f, true, 3, 6, true, -60, 46);
            this.orePlacementCfg(bldr, "zircon_nether", 0.0f, true, 3, 6, true, -64, 80);
            this.orePlacementCfg(bldr, "zircon_mining", 0.0f, false, 4, 6, true, MIN_NET, 104);

            bldr.pop();
        }

        public boolean isEnabled(ResourceLocation oreId) {
            return switch (oreId.getPath()) {
                case "aluminum_overworld" -> enableAluminumOverworld.get();
                case "aluminum_mining" -> enableAluminumMining.get();
                case "amber_overworld" -> enableAmberOverworld.get();
                case "amber_mining" -> enableAmberMining.get();
                case "anthracite_overworld" -> enableAnthraciteOverworld.get();
                case "anthracite_mining" -> enableAnthraciteMining.get();
                case "ancient_debris_mining" -> enableAncientDebrisMining.get();
                case "apatite_overworld" -> enableApatiteOverworld.get();
                case "apatite_mining" -> enableApatiteMining.get();
                case "ardite_nether" -> enableArditeNether.get();
                case "ardite_mining" -> enableArditeMining.get();
                case "beryllium_overworld" -> enableBerylliumOverworld.get();
                case "beryllium_mining" -> enableBerylliumMining.get();
                case "bituminous_overworld" -> enableBituminousOverworld.get();
                case "bituminous_mining" -> enableBituminousMining.get();
                case "cinnabar_overworld" -> enableCinnabarOverworld.get();
                case "cinnabar_nether" -> enableCinnabarNether.get();
                case "cinnabar_mining" -> enableCinnabarMining.get();
                case "coal_mining" -> enableCoalMining.get();
                case "cobalt_overworld" -> enableCobaltOverworld.get();
                case "cobalt_nether" -> enableCobaltNether.get();
                case "cobalt_mining" -> enableCobaltMining.get();
                case "copper_mining" -> enableCopperMining.get();
                case "diamond_mining" -> enableDiamondMining.get();
                case "emerald_mining" -> enableEmeraldMining.get();
                case "fluorite_overworld" -> enableFluoriteOverworld.get();
                case "fluorite_end" -> enableFluoriteEnd.get();
                case "fluorite_mining" -> enableFluoriteMining.get();
                case "gallium_overworld" -> enableGalliumOverworld.get();
                case "gallium_nether" -> enableGalliumNether.get();
                case "gallium_mining" -> enableGalliumMining.get();
                case "garnet_overworld" -> enableGarnetOverworld.get();
                case "garnet_nether" -> enableGarnetNether.get();
                case "garnet_mining" -> enableGarnetMining.get();
                case "gold_mining" -> enableGoldMining.get();
                case "iridium_overworld" -> enableIridiumOverworld.get();
                case "iridium_end" -> enableIridiumEnd.get();
                case "iridium_mining" -> enableIridiumMining.get();
                case "iron_mining" -> enableIronMining.get();
                case "jade_overworld" -> enableJadeOverworld.get();
                case "jade_nether" -> enableJadeNether.get();
                case "jade_mining" -> enableJadeMining.get();
                case "lapis_mining" -> enableLapisMining.get();
                case "lead_overworld" -> enableLeadOverworld.get();
                case "lead_end" -> enableLeadEnd.get();
                case "lead_mining" -> enableLeadMining.get();
                case "lignite_overworld" -> enableLigniteOverworld.get();
                case "lignite_mining" -> enableLigniteMining.get();
                case "molybdenum_overworld" -> enableMolybdenumOverworld.get();
                case "molybdenum_nether" -> enableMolybdenumNether.get();
                case "molybdenum_end" -> enableMolybdenumEnd.get();
                case "molybdenum_mining" -> enableMolybdenumMining.get();
                case "necroticarite_nether" -> enableNecroticariteNether.get();
                case "necroticarite_mining" -> enableNecroticariteMining.get();
                case "neodymium_overworld" -> enableNeodymiumOverworld.get();
                case "neodymium_end" -> enableNeodymiumEnd.get();
                case "neodymium_mining" -> enableNeodymiumMining.get();
                case "niter_overworld" -> enableNiterOverworld.get();
                case "niter_mining" -> enableNiterMining.get();
                case "nickel_overworld" -> enableNickelOverworld.get();
                case "nickel_nether" -> enableNickelNether.get();
                case "nickel_mining" -> enableNickelMining.get();
                case "onyx_overworld" -> enableOnyxOverworld.get();
                case "onyx_nether" -> enableOnyxNether.get();
                case "onyx_mining" -> enableOnyxMining.get();
                case "obsidian_nether" -> enableObsidianNether.get();
                case "obsidian_mining" -> enableObsidianMining.get();
                case "osmium_overworld" -> enableOsmiumOverworld.get();
                case "osmium_nether" -> enableOsmiumNether.get();
                case "osmium_mining" -> enableOsmiumMining.get();
                case "palladium_overworld" -> enablePalladiumOverworld.get();
                case "palladium_end" -> enablePalladiumEnd.get();
                case "palladium_mining" -> enablePalladiumMining.get();
                case "peat_overworld" -> enablePeatOverworld.get();
                case "peat_mining" -> enablePeatMining.get();
                case "pearl_overworld" -> enablePearlOverworld.get();
                case "pearl_mining" -> enablePearlMining.get();
                case "peridot_overworld" -> enablePeridotOverworld.get();
                case "peridot_nether" -> enablePeridotNether.get();
                case "peridot_mining" -> enablePeridotMining.get();
                case "platinum_overworld" -> enablePlatinumOverworld.get();
                case "platinum_end" -> enablePlatinumEnd.get();
                case "platinum_mining" -> enablePlatinumMining.get();
                case "pyrolite_nether" -> enablePyroliteNether.get();
                case "pyrolite_end" -> enablePyroliteEnd.get();
                case "pyrolite_mining" -> enablePyroliteMining.get();
                case "quartz_mining" -> enableQuartzMining.get();
                case "redstone_mining" -> enableRedstoneMining.get();
                case "ruby_overworld" -> enableRubyOverworld.get();
                case "ruby_nether" -> enableRubyNether.get();
                case "ruby_mining" -> enableRubyMining.get();
                case "salt_overworld" -> enableSaltOverworld.get();
                case "salt_mining" -> enableSaltMining.get();
                case "sapphire_overworld" -> enableSapphireOverworld.get();
                case "sapphire_end" -> enableSapphireEnd.get();
                case "sapphire_mining" -> enableSapphireMining.get();
                case "sculkite_overworld" -> enableSculkiteOverworld.get();
                case "sculkite_mining" -> enableSculkiteMining.get();
                case "silver_overworld" -> enableSilverOverworld.get();
                case "silver_nether" -> enableSilverNether.get();
                case "silver_mining" -> enableSilverMining.get();
                case "sulfur_overworld" -> enableSulfurOverworld.get();
                case "sulfur_nether" -> enableSulfurNether.get();
                case "sulfur_mining" -> enableSulfurMining.get();
                case "spinel_overworld" -> enabledSpinelOverworld.get();
                case "spinel_nether" -> enabledSpinelNether.get();
                case "spinel_mining" -> enabledSpinelMining.get();
                case "tanzanite_overworld" -> enableTanzaniteOverworld.get();
                case "tanzanite_nether" -> enableTanzaniteNether.get();
                case "tanzanite_mining" -> enableTanzaniteMining.get();
                case "titanium_overworld" -> enableTitaniumOverworld.get();
                case "titanium_end" -> enableTitaniumEnd.get();
                case "titanium_mining" -> enableTitaniumMining.get();
                case "tin_overworld" -> enableTinOverworld.get();
                case "tin_end" -> enableTinEnd.get();
                case "tin_mining" -> enableTinMining.get();
                case "tungsten_overworld" -> enableTungstenOverworld.get();
                case "tungsten_end" -> enableTungstenEnd.get();
                case "tungsten_mining" -> enableTungstenMining.get();
                case "ultimatitanium_end" -> enableUltimatitaniumEnd.get();
                case "ultimatitanium_mining" -> enableUltimatitaniumMining.get();
                case "uraninite_overworld" -> enableUraniniteOverworld.get();
                case "uraninite_nether" -> enableUraniniteNether.get();
                case "uraninite_mining" -> enableUraniniteMining.get();
                case "uranium_overworld" -> enableUraniumOverworld.get();
                case "uranium_nether" -> enableUraniumNether.get();
                case "uranium_end" -> enableUraniumEnd.get();
                case "uranium_mining" -> enableUraniumMining.get();
                case "vanadium_overworld" -> enableVanadiumOverworld.get();
                case "vanadium_end" -> enableVanadiumEnd.get();
                case "vanadium_mining" -> enableVanadiumMining.get();
                case "zinc_overworld" -> enableZincOverworld.get();
                case "zinc_mining" -> enableZincMining.get();
                case "zircon_overworld" -> enableZirconOverworld.get();
                case "zircon_nether" -> enableZirconNether.get();
                case "zircon_mining" -> enableZirconMining.get();

                default -> true;
            };
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

        @SuppressWarnings("all")
        private void orePlacementCfg(ModConfigSpec.Builder bldr, String id, float airExposure, boolean isRare,
                                     int veinsPerChunk, int veinSize, boolean isTriangle, int minHeight, int maxHeight) {
            placement.put(id, new OrePlacementConfig(bldr, id, airExposure, isRare, veinsPerChunk, veinSize, isTriangle, minHeight, maxHeight));
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
            bldr.push(name.toUpperCase());

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
