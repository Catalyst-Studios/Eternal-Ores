package net.radzratz.eternalores.util.config;

import net.neoforged.neoforge.common.ModConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

import java.awt.*;
import java.util.*;
import java.util.List;

import static net.radzratz.eternalores.util.EOUtils.capitalize;

public class EOToolsConfig {
    public static final EOToolsConfig CFG;
    public static final ModConfigSpec CONFIG_SPEC;

    // Prospectors
    public final BasicProspectorConfig basicProspector;
    public final AdvancedProspectorConfig advancedProspector;
    public final ProspectorListAndColors prospectorListAndColors;

    // Tools
    public final HammerConfig hammers;
    public final WireCutterConfig wireCutters;
    public final GemCutterConfig gemCutter;
    public final TeleporterConfig teleporter;
    public final MoldConfig molds;

    static {
        Pair<EOToolsConfig, ModConfigSpec> pair = new ModConfigSpec.Builder().configure(EOToolsConfig::new);
        CFG = pair.getLeft();
        CONFIG_SPEC = pair.getRight();
    }

    private EOToolsConfig(ModConfigSpec.Builder bldr) {
        bldr.comment("""
                 Eternal Ores Tools Config.
                
                 Toggles and settings for all Eternal Ores tools:
                 Hammers, Wire Cutters, Gem Cutter, Molds, Teleporter and Prospectors.
                
                 This config does NOT unregister any tools - it only hides them
                 and disables their functionality. If they had one.
                
                 Each change requires a game restart. Except Prospector Lists, they update immediately.
                """).push("tools");

        bldr.comment("Prospector Settings").push("prospectors");

        this.basicProspector = new BasicProspectorConfig(bldr);
        this.advancedProspector = new AdvancedProspectorConfig(bldr);
        this.prospectorListAndColors = new ProspectorListAndColors(bldr);

        bldr.pop();

        bldr.comment("Teleporter").push("teleporter");

        this.teleporter = new TeleporterConfig(bldr);

        bldr.pop();

        bldr.comment("Tool Settings").push("tools");

        this.hammers = new HammerConfig(bldr);
        this.wireCutters = new WireCutterConfig(bldr);
        this.gemCutter = new GemCutterConfig(bldr);
        this.molds = new MoldConfig(bldr);

        bldr.pop();
    }

    public static class BasicProspectorConfig {
        public static final int DEFAULT_RADIUS = 48;
        public static final int MIN_RADIUS = 8;
        public static final int MAX_RADIUS = 96;
        public static final int DEFAULT_UPDATE_INTERVAL = 40;
        public static final int MIN_UPDATE_INTERVAL = 20;
        public static final int MAX_UPDATE_INTERVAL = 100;

        public final ModConfigSpec.IntValue defaultRadius;
        public final ModConfigSpec.IntValue overlayUpdateInterval;
        public final ModConfigSpec.BooleanValue showOverlay;
        public final ModConfigSpec.BooleanValue showDistanceColors;
        public final ModConfigSpec.BooleanValue enabled;

        public BasicProspectorConfig(ModConfigSpec.Builder bldr) {
            bldr.comment("Basic Prospector").push("basic");

            this.enabled = bldr
                    .comment("[Server] Enable the Basic Prospector item.")
                    .gameRestart()
                    .define("enabled", true);

            this.defaultRadius = bldr
                    .comment("[Server/Client] Scan radius in blocks. Default 48.")
                    .translation("config.eternalores.prospector.basic.radius")
                    .gameRestart()
                    .defineInRange("scanRadius", DEFAULT_RADIUS, MIN_RADIUS, MAX_RADIUS);

            this.overlayUpdateInterval = bldr
                    .comment("[Server] How often (in ticks) the overlay refreshes. Default 40 (2s).")
                    .translation("config.eternalores.prospector.basic.updateInterval")
                    .gameRestart()
                    .defineInRange("overlayUpdateInterval", DEFAULT_UPDATE_INTERVAL, MIN_UPDATE_INTERVAL, MAX_UPDATE_INTERVAL);

            this.showOverlay = bldr
                    .comment("[Client] Show the prospector overlay. Default true.")
                    .translation("config.eternalores.prospector.basic.showOverlay")
                    .define("showOverlay", true);

            this.showDistanceColors = bldr
                    .comment("[Client] Color-code distances in the overlay. Default true.")
                    .translation("config.eternalores.prospector.basic.showDistanceColors")
                    .define("showDistanceColors", true);

            bldr.pop();
        }

        public boolean isEnabled() {
            return enabled.get();
        }

        public int getScanRadius() {
            return defaultRadius.get();
        }

        public int getOverlayUpdateInterval() {
            return overlayUpdateInterval.get();
        }

        public boolean shouldShowOverlay() {
            return showOverlay.get();
        }

        public boolean shouldShowDistanceColors() {
            return showDistanceColors.get();
        }
    }

    public static class AdvancedProspectorConfig {
        public static final int DEFAULT_RADIUS = 32;
        public static final int MIN_RADIUS = 8;
        public static final int MAX_RADIUS = 128;
        public static final int DEFAULT_OVERLAY_DURATION_MS = 10000;
        public static final int MIN_OVERLAY_DURATION_MS = 2000;
        public static final int MAX_OVERLAY_DURATION_MS = 30000;

        public final ModConfigSpec.IntValue defaultRadius;
        public final ModConfigSpec.IntValue overlayDurationMs;
        public final ModConfigSpec.BooleanValue enabled;

        public AdvancedProspectorConfig(ModConfigSpec.Builder bldr) {
            bldr.comment("Advanced Prospector").push("advanced");

            this.enabled = bldr
                    .comment("[Server] Enable the Advanced Prospector item.")
                    .gameRestart()
                    .define("enabled", true);

            this.defaultRadius = bldr
                    .comment("[Client] X-ray scan radius in blocks. Default 32.")
                    .translation("config.eternalores.prospector.advanced.radius")
                    .defineInRange("scanRadius", DEFAULT_RADIUS, MIN_RADIUS, MAX_RADIUS);

            this.overlayDurationMs = bldr
                    .comment("[Client] How long (in ms) the X-ray overlay stays visible. Default 10000 (10s).")
                    .translation("config.eternalores.prospector.advanced.overlay")
                    .defineInRange("overlayDurationMs", DEFAULT_OVERLAY_DURATION_MS, MIN_OVERLAY_DURATION_MS, MAX_OVERLAY_DURATION_MS);

            bldr.pop();
        }

        public boolean isEnabled() {
            return enabled.get();
        }

        public int getOverlayRadius() {
            return defaultRadius.get();
        }

        public int getOverlayDurationMs() {
            return overlayDurationMs.get();
        }
    }

    public static class ProspectorListAndColors {
        public final ModConfigSpec.ConfigValue<List<? extends String>> oreList;
        public final ModConfigSpec.ConfigValue<List<? extends String>> blacklist;

        @SuppressWarnings("deprecation")
        public ProspectorListAndColors(ModConfigSpec.Builder b) {
            b.comment("Prospector Ore List and Colors").push("listAndColors");

            this.oreList = b
                    .comment("""
                             Detectable ores and their outline colors.
                            
                             Format: 'material_name:RRGGBB' (6-digit hex, no # symbol).
                             Example: 'iron:DCDCDC'
                             The ore is found via the tag 'c:ores/<material_name>', so any ore should be accepted into the list.
                             Edit carefully, each entry separated by a comma inside the brackets.
                            
                             If ya wonder why the unholy tarnation this section of the config looks horrible,
                             I blame .TOML cuz' it looks like it should over github and IDE, but hey at least it works right? RIGHT?
                            """)
                    .defineListAllowEmpty("ores", defaultOreList(),
                            entry -> entry instanceof String s && s.matches("[a-z_]+:[0-9A-Fa-f]{6}"));

            b.pop();

            b.push("blacklist");

            this.blacklist = b
                    .comment("""
                         Ores excluded from both prospectors.
                        
                         Format: plain material names, one per entry, e.g. 'iesnium'.
                         These cannot be linked, scanned, or added to the ore list above.
                        
                         'iesnium' ships blacklisted by default to protect Occultism's Divination Rod usage - remove it here if you want prospectors
                         to be able to track it.
                        
                         Edit carefully, each entry separated by a comma inside the brackets.
                        
                         Once said entry was deleted, you may now add it to list and colors.
                        """)
                    .defineListAllowEmpty("blacklist", defaultBlacklist(),
                            entry -> entry instanceof String s && s.matches("[a-z_]+"));

            b.pop();
        }

        // default ore list shipped with the mod
        @SuppressWarnings("all")
        private static List<String> defaultOreList() {
            return List.of(
                    "allthemodium:f2a61d",
                    "aluminum:C8C8C8",
                    "amber:FFA040",
                    "anthracite_coal:141414",
                    "antimony:d2d2d2",
                    "apatite:64C8FF",
                    "arcane_crystal:a6e4ff",
                    "ardite:C83200",
                    "bauxite:C8C8C8",
                    "beryllium:8acaa8",
                    "bituminous_coal:1E1E1E",
                    "black_quartz:1A1A1A",
                    "cinnabar:FF3232",
                    "coal:222222",
                    "cobalt:2B4BFF",
                    "copper:B8733B",
                    "diamond:00CFFF",
                    "dimensional_shard:d0f7f6",
                    "draconium:8c62b2",
                    "emerald:00FF6A",
                    "fluorite:C8FFC8",
                    "gallium:9696FF",
                    "garnet:C80000",
                    "gold:FFD700",
                    "inferium:17a600",
                    "iridium:7878C8",
                    "iron:DCDCDC",
                    "jade:00C850",
                    "lapis:1B4CC0",
                    "lead:646478",
                    "lignite_coal:2D1A00",
                    "molybdenum:B8C4D0",
                    "monazite:FFD264",
                    "necroticarite:6400C8",
                    "neodymium:C89CFF",
                    "netherite_scrap:4A3B3B",
                    "nickel:C8C896",
                    "niter:F0F0E0",
                    "obsidian:280040",
                    "onyx:141414",
                    "osmium:aeced8",
                    "palladium:DCE6F0",
                    "pearl:FFF5EE",
                    "peat_coal:3C2800",
                    "peridot:96E600",
                    "platinum:E0E0F0",
                    "power:fff733",
                    "prosperity:E6FFF7",
                    "pyrolite:FF6400",
                    "quartz:F5F0E8",
                    "redstone:FF2200",
                    "replica:6373ca",
                    "ruby:FF0040",
                    "runic:cbcfe2",
                    "sal_ammonia:f0b5ff",
                    "salt:F5F5F5",
                    "salt_peter:a6e4ff",
                    "sapphire:0040FF",
                    "sculkite:00C8C8",
                    "silver:E6E6E6",
                    "soulium:885d3e",
                    "spinel:FF5A8A",
                    "stellarite:aab59f",
                    "sulfur:f5e458",
                    "tanzanite:4000FF",
                    "tin:969696",
                    "titanium:A0B4C8",
                    "tungsten:505050",
                    "ultimatitanium:D2EEFF",
                    "unobtainium:ea84f5",
                    "uraninite:78C878",
                    "uranium:00FF64",
                    "vibranium:73ffb9",
                    "xychrorium:87c4f0",
                    "zinc:B4B4C8",
                    "zircon:E8D4FF"
            );
        }

        private static List<String> defaultBlacklist() {
            return List.of("iesnium");
        }

        public Set<String> getBlacklist() {
            return Set.copyOf(blacklist.get());
        }

        public Map<String, Color> getMaterialColors() {
            Set<String> bl = getBlacklist();
            Map<String, Color> map = new LinkedHashMap<>();
            for (String entry : oreList.get()) {
                String[] parts = entry.split(":");
                if (parts.length != 2 || bl.contains(parts[0])) continue;
                try {
                    int hex = Integer.parseInt(parts[1], 16);
                    map.put(parts[0], new Color((hex >> 16) & 0xFF, (hex >> 8) & 0xFF, hex & 0xFF));
                } catch (NumberFormatException ignored) {}
            }
            return map;
        }

        public List<String> getMaterials() {
            Set<String> bl = getBlacklist();
            return oreList.get().stream()
                    .map(s -> s.split(":")[0])
                    .filter(m -> !bl.contains(m))
                    .toList();
        }
    }

    public static class HammerConfig {
        public final SingleHammerConfig cobalt;
        public final SingleHammerConfig copper;
        public final SingleHammerConfig stone;
        public final SingleHammerConfig diamond;
        public final SingleHammerConfig iron;

        public HammerConfig(ModConfigSpec.Builder b) {
            b.comment("Hammer Settings").push("hammers");

            this.cobalt = new SingleHammerConfig(b, "cobalt", 1024);
            this.copper = new SingleHammerConfig(b, "copper", 128);
            this.stone = new SingleHammerConfig(b, "stone", 64);
            this.diamond = new SingleHammerConfig(b, "diamond", 512);
            this.iron = new SingleHammerConfig(b, "iron", 256);

            b.pop();
        }
    }

    public static class SingleHammerConfig {
        private final ModConfigSpec.BooleanValue enabled;
        private final ModConfigSpec.IntValue durability;
        private final ModConfigSpec.BooleanValue easyRepair;
        private final ModConfigSpec.BooleanValue normalRepair;
        private final ModConfigSpec.IntValue durabilityPerMaterial;

        public SingleHammerConfig(ModConfigSpec.Builder bldr, String id, int defDur) {
            bldr.comment(capitalize(id) + " Hammer").push(id + "_hammer");

            this.enabled = bldr
                    .comment("[Server] Enable the " + capitalize(id) + " Hammer.")
                    .gameRestart()
                    .define("enabled", true);

            this.durability = bldr
                    .comment("[Server] Max durability. Default " + defDur + ".")
                    .gameRestart()
                    .defineInRange("durability", defDur, 32, 4096);

            this.easyRepair = bldr
                    .comment("[Server] Allow this hammer to be repaired in a crafting table.")
                    .gameRestart()
                    .define("repairEnabled", true);

            this.normalRepair = bldr
                    .comment("[Server] Allow this hammer to be repaired.")
                    .gameRestart()
                    .define("isNormalRepairEnabled", true);

            this.durabilityPerMaterial = bldr
                    .comment("[Server] Durability restored per repair material. Default 30.")
                    .gameRestart()
                    .defineInRange("durabilityPerMaterial", 30, 1, 512);

            bldr.pop();
        }

        public boolean isEnabled() {
            return enabled.get();
        }

        public int getDurability() {
            try {
                return durability.get();
            } catch (IllegalStateException e) {
                return durability.getDefault();
            }
        }

        public boolean getEasyRepair() {
            return easyRepair.get();
        }

        public boolean getNormalRepair() {
            return normalRepair.get();
        }

        public int getDurabilityPerMaterial() {
            return durabilityPerMaterial.get();
        }
    }

    public static class GemCutterConfig {
        public final SingleGemCutterConfig copper;
        public final SingleGemCutterConfig gold;
        public final SingleGemCutterConfig iron;
        public final SingleGemCutterConfig netherite;

        public GemCutterConfig(ModConfigSpec.Builder bldr) {
            bldr.comment("Gem Cutter Settings").push("gem_cutter");

            this.copper = new SingleGemCutterConfig(bldr, "copper", 64);
            this.gold = new SingleGemCutterConfig(bldr, "stone", 128);
            this.iron = new SingleGemCutterConfig(bldr, "iron", 256);
            this.netherite = new SingleGemCutterConfig(bldr, "netherite", 512);

            bldr.pop();
        }
    }

    public static class SingleGemCutterConfig {
        private final ModConfigSpec.BooleanValue enabled;
        private final ModConfigSpec.IntValue durability;
        private final ModConfigSpec.BooleanValue easyRepair;
        private final ModConfigSpec.BooleanValue normalRepair;
        private final ModConfigSpec.IntValue durabilityPerMaterial;

        public SingleGemCutterConfig(ModConfigSpec.Builder bldr, String id, int defDur) {
            bldr.comment(capitalize(id) + " Cutter").push(id + "_cutter");

            this.enabled = bldr
                    .comment("[Server] Enable the " + capitalize(id) + " Gem Cutter.")
                    .gameRestart()
                    .define("enabled", true);

            this.durability = bldr
                    .comment("[Server] Max durability. Default " + defDur + ".")
                    .gameRestart()
                    .defineInRange("durability", defDur, 32, 4096);

            this.easyRepair = bldr
                    .comment("[Server] Allow this gem cutter to be repaired in a crafting table.")
                    .gameRestart()
                    .define("repairEnabled", true);

            this.normalRepair = bldr
                    .comment("[Server] Allow this gem cutter to be repaired.")
                    .gameRestart()
                    .define("isNormalRepairEnabled", true);

            this.durabilityPerMaterial = bldr
                    .comment("[Server] Durability restored per repair material. Default 30.")
                    .gameRestart()
                    .defineInRange("durabilityPerMaterial", 30, 1, 512);

            bldr.pop();
        }

        public boolean isEnabled() {
            return enabled.get();
        }

        public int getDurability() {
            try {
                return durability.get();
            } catch (IllegalStateException e) {
                return durability.getDefault();
            }
        }

        public boolean getEasyRepair() {
            return easyRepair.get();
        }

        public boolean getNormalRepair() {
            return normalRepair.get();
        }

        public int getDurabilityPerMaterial() {
            return durabilityPerMaterial.get();
        }
    }

    public static class WireCutterConfig {
        public final WireCutterSettings copper;
        public final WireCutterSettings iron;
        public final WireCutterSettings gold;
        public final WireCutterSettings diamond;
        public final WireCutterSettings cobalt;

        public WireCutterConfig(ModConfigSpec.Builder bldr) {
            bldr.comment("Wire Cutter Settings").push("wire_cutters");

            this.copper = new WireCutterSettings(bldr, "copper", 64);
            this.iron = new WireCutterSettings(bldr, "iron", 128);
            this.gold = new WireCutterSettings(bldr, "gold", 256);
            this.diamond = new WireCutterSettings(bldr, "diamond", 512);
            this.cobalt = new WireCutterSettings(bldr, "cobalt", 1024);

            bldr.pop();
        }
    }

    public static class TeleporterConfig {
        private final ModConfigSpec.BooleanValue enabled;

        public TeleporterConfig(ModConfigSpec.Builder b) {
            b.comment("Mining Dimension Teleporter Settings").push("teleporter");

            this.enabled = b
                    .comment("[Server] Enable the Mining Dimension Teleporter.")
                    .gameRestart()
                    .define("enabled", true);

            b.pop();
        }

        public boolean isEnabled() {
            return enabled.get();
        }
    }

    public static class MoldConfig {
        public final ModConfigSpec.BooleanValue plate;
        public final ModConfigSpec.BooleanValue foil;
        public final ModConfigSpec.BooleanValue rod;
        public final ModConfigSpec.BooleanValue gear;

        public MoldConfig(ModConfigSpec.Builder b) {
            b.comment("Mold Settings").push("molds");

            this.plate = mold(b, "plate");
            this.foil = mold(b, "foil");
            this.rod = mold(b, "rod");
            this.gear = mold(b, "gear");

            b.pop();
        }

        private ModConfigSpec.BooleanValue mold(ModConfigSpec.Builder b, String id) {
            return b.comment("[Server] Enable the " + capitalize(id) + " Mold.")
                    .gameRestart()
                    .define(id + "_mold_enabled", true);
        }

        public boolean plateEnabled() {
            return plate.get();
        }

        public boolean foilEnabled() {
            return foil.get();
        }

        public boolean rodEnabled() {
            return rod.get();
        }

        public boolean gearEnabled() {
            return gear.get();
        }
    }

    public static class WireCutterSettings {
        private final ModConfigSpec.BooleanValue enabled;
        private final ModConfigSpec.IntValue durability;
        private final ModConfigSpec.BooleanValue easyRepair;
        private final ModConfigSpec.BooleanValue normalRepair;
        private final ModConfigSpec.IntValue durabilityPerMaterial;

        public WireCutterSettings(ModConfigSpec.Builder bldr, String id, int defDur) {
            bldr.comment(capitalize(id) + " Cutter").push(id + "_cutter");

            this.enabled = bldr
                    .comment("[Server] Enable the " + capitalize(id) + " Wire Cutter.")
                    .gameRestart()
                    .define("enabled", true);

            this.durability = bldr
                    .comment("[Server] Max durability. Default " + defDur + ".")
                    .gameRestart()
                    .defineInRange("durability", defDur, 32, 4096);

            this.easyRepair = bldr
                    .comment("[Server] Allow this gem cutter to be repaired in a crafting table.")
                    .gameRestart()
                    .define("repairEnabled", true);

            this.normalRepair = bldr
                    .comment("[Server] Allow this gem cutter to be repaired.")
                    .gameRestart()
                    .define("isNormalRepairEnabled", true);

            this.durabilityPerMaterial = bldr
                    .comment("[Server] Durability restored per repair material. Default 30.")
                    .gameRestart()
                    .defineInRange("durabilityPerMaterial", 30, 1, 512);

            bldr.pop();
        }

        public boolean isEnabled() {
            return enabled.get();
        }

        public int getDurability() {
            try {
                return durability.get();
            } catch (IllegalStateException e) {
                return durability.getDefault();
            }
        }

        public boolean getEasyRepair() {
            return easyRepair.get();
        }

        public boolean getNormalRepair() {
            return normalRepair.get();
        }

        public int getDurabilityPerMaterial() {
            return durabilityPerMaterial.get();
        }
    }

    public static int getScanRadius() {
        return CFG.basicProspector.getScanRadius();
    }

    public static int getOverlayRadius() {
        return CFG.advancedProspector.getOverlayRadius();
    }
}
