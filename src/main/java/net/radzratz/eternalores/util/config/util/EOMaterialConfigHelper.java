package net.radzratz.eternalores.util.config.util;

import net.neoforged.neoforge.common.ModConfigSpec;

import java.util.HashMap;
import java.util.Map;

import static net.radzratz.eternalores.util.EOUtils.capitalize;

public class EOMaterialConfigHelper {
    /**
     * Feature enum defines all types of Features to be added on a Material Set
     */
    public enum Feature {
        @SuppressWarnings("all")
        SET(1 << 0, "Set", "Enable or Disable %s Material Set"),
        RAW(1 << 1, "Raw", "Enable or Disable Raw %s"),
        INGOT(1 << 2, "Ingot", "Enable or Disable %s Ingot"),
        DUST(1 << 3, "Dust", "Enable or Disable %s Dust"),
        SMALL_DUST(1 << 4, "SmallDust", "Enable or Disable %s Small Dust"),
        NUGGET(1 << 5, "Nugget", "Enable or Disable %s Nugget"),
        FOIL(1 << 6, "Foil", "Enable or Disable %s Foil"),
        PLATE(1 << 7, "Plate", "Enable or Disable %s Plate"),
        ROD(1 << 8, "Rod", "Enable or Disable %s Rod"),
        GEAR(1 << 9, "Gear", "Enable or Disable %s Gear"),
        WIRE(1 << 10, "Wire", "Enable or Disable %s Wire"),
        CLUMPS(1 << 11, "Clumps", "Enable or Disable %s Clumps"),
        SMALL_CLUMP(1 << 12, "SmallClump", "Enable or Disable %s Small Clump"),
        SHARD(1 << 13, "Shard", "Enable or Disable %s Shard"),
        CRYSTAL(1 << 14, "Crystal", "Enable or Disable %s Crystal"),
        DIRTY_DUST(1 << 15, "DirtyDust", "Enable or Disable %s Dirty Dust"),
        GEM(1 << 16, "Gem", "Enable or Disable %s Gem"),
        ORE_GEM(1 << 17, "OreGem", "Enable or Disable %s Ore Gem"),
        BLOCK(1 << 18, "Block", "Enable or Disable %s Block"),
        DUST_BLOCK(1 << 19, "DustBlock", "Enable or Disable %s Dust Block"),
        RAW_BLOCK(1 << 20, "RawBlock", "Enable or Disable %s Raw Block"),
        ORES(1 << 21, "Ores", "Enable or Disable %s Ores"),
        ENRICHED(1 << 22, "Enriched", "Enable or Disable Enriched %s"),
        ITEM(1 << 23, "Item", "Enable or Disable %s Item"),
        GEM_SHARD(1 << 24, "GemShard", "Enable or Disable %s Gem Shard"),
        PEBBLE(1 << 24, "Pebble", "Enable or Disable %s Pebble");

        public final int bit;
        public final String key;
        public final String comment;

        Feature(int bit, String key, String comment) {
            this.bit = bit;
            this.key = key;
            this.comment = comment;
        }
    }

    private final String materialName;
    private final String capitalized;
    private final int enabledFeatures;

    public EOMaterialConfigHelper(String materialName, int enabledFeaturesMask) {
        this.materialName = materialName;
        this.capitalized = capitalize(materialName);
        this.enabledFeatures = enabledFeaturesMask;
    }

    private final Map<Feature, ModConfigSpec.BooleanValue> configValues = new HashMap<>();

    public void configure(ModConfigSpec.Builder builder) {
        builder.comment("Eternal Ores " + capitalized + " Set").push(materialName);

        for (Feature feature : Feature.values()) {
            if (isFeatureEnabled(feature)) {
                String comment = "[Server] " + String.format(feature.comment, capitalized);
                String translation = "config.eternalores.base.material." + materialName + feature.key.toLowerCase();
                String configKey = "is" + capitalized + feature.key + "Disabled";

                ModConfigSpec.BooleanValue configValue = builder
                        .comment(comment)
                        .gameRestart()
                        .translation(translation)
                        .define(configKey, false);

                configValues.put(feature, configValue);
            }
        }

        builder.pop();
    }

    private boolean isFeatureEnabled(Feature feature) {
        return (enabledFeatures & feature.bit) != 0;
    }

    public boolean getMaterialSet() {
        return get(Feature.SET);
    }

    public boolean getRawMaterial() {
        return get(Feature.RAW);
    }

    public boolean getMaterialIngot() {
        return get(Feature.INGOT);
    }

    public boolean getMaterialDust() {
        return get(Feature.DUST);
    }

    public boolean getMaterialSmallDust() {
        return get(Feature.SMALL_DUST);
    }

    public boolean getMaterialNugget() {
        return get(Feature.NUGGET);
    }

    public boolean getMaterialFoil() {
        return get(Feature.FOIL);
    }

    public boolean getMaterialPlate() {
        return get(Feature.PLATE);
    }

    public boolean getMaterialRod() {
        return get(Feature.ROD);
    }

    public boolean getMaterialGear() {
        return get(Feature.GEAR);
    }

    public boolean getMaterialWire() {
        return get(Feature.WIRE);
    }

    public boolean getMaterialClumps() {
        return get(Feature.CLUMPS);
    }

    public boolean getMaterialSmallClump() {
        return get(Feature.SMALL_CLUMP);
    }

    public boolean getMaterialShard() {
        return get(Feature.SHARD);
    }

    public boolean getMaterialCrystal() {
        return get(Feature.CRYSTAL);
    }

    public boolean getMaterialDirtyDust() {
        return get(Feature.DIRTY_DUST);
    }

    public boolean getMaterialGem() {
        return get(Feature.GEM);
    }

    public boolean getMaterialGemShard() {
        return get(Feature.GEM_SHARD);
    }

    public boolean getMaterialOreGem() {
        return get(Feature.ORE_GEM);
    }

    public boolean getMaterialBlock() {
        return get(Feature.BLOCK);
    }

    public boolean getMaterialDustBlock() {
        return get(Feature.DUST_BLOCK);
    }

    public boolean getMaterialRawBlock() {
        return get(Feature.RAW_BLOCK);
    }

    public boolean getMaterialOres() {
        return get(Feature.ORES);
    }

    public boolean getMaterialEnriched() {
        return get(Feature.ENRICHED);
    }

    public boolean getMaterialItem() {
        return get(Feature.ITEM);
    }

    public boolean getMaterialPebble() {
        return get(Feature.PEBBLE);
    }

    public boolean hasFeature(Feature feature) {
        return isFeatureEnabled(feature);
    }

    /**
     * Fetches each 'get' methods and assigns each its feature
     * @throws IllegalArgumentException If a feature is not enabled for said material set. In other words, a controlled failsafe
     * to my buffoonery of forgetting which material set added which feature LMAO
     */
    private boolean get(Feature feature) {
        if (!isFeatureEnabled(feature)) {
            throw new IllegalStateException(
                    "Feature '" + feature.key + "' not enabled for material '" + materialName + "'"
            );
        }

        ModConfigSpec.BooleanValue value = configValues.get(feature);
        if (value == null) {
            return false;
        }

        try {
            return !value.get();
        } catch (IllegalStateException e) {
            return true;
        }
    }

    public static int ALL_FEATURES = createMask(Feature.values());

    public static int NATURAL_METAL_FEATURES = createMask(
            Feature.SET, Feature.DUST, Feature.INGOT, Feature.RAW, Feature.SMALL_DUST, Feature.SMALL_CLUMP,
            Feature.RAW_BLOCK, Feature.BLOCK, Feature.PLATE, Feature.ROD, Feature.SHARD, Feature.CRYSTAL,
            Feature.NUGGET, Feature.DIRTY_DUST, Feature.CLUMPS, Feature.GEAR, Feature.DUST_BLOCK, Feature.FOIL,
            Feature.ORES, Feature.ORE_GEM, Feature.ENRICHED
    );

    public static int NATURAL_METAL_FEATURES_WITH_ITEM = createMask(
            Feature.SET, Feature.DUST, Feature.INGOT, Feature.RAW, Feature.SMALL_DUST, Feature.SMALL_CLUMP,
            Feature.RAW_BLOCK, Feature.BLOCK, Feature.PLATE, Feature.ROD, Feature.SHARD, Feature.CRYSTAL,
            Feature.NUGGET, Feature.DIRTY_DUST, Feature.CLUMPS, Feature.GEAR, Feature.DUST_BLOCK, Feature.FOIL,
            Feature.ORES, Feature.ORE_GEM, Feature.ENRICHED, Feature.ITEM
    );

    public static int NATURAL_METAL_FEATURES_GEAR_FOILESS = createMask(
            Feature.SET, Feature.DUST, Feature.INGOT, Feature.RAW, Feature.SMALL_DUST, Feature.SMALL_CLUMP,
            Feature.RAW_BLOCK, Feature.BLOCK, Feature.PLATE, Feature.ROD, Feature.SHARD, Feature.CRYSTAL,
            Feature.NUGGET, Feature.DIRTY_DUST, Feature.CLUMPS, Feature.DUST_BLOCK,
            Feature.ORES, Feature.ORE_GEM
    );

    public static int BIOMASS_FEATURE = createMask(
            Feature.SET, Feature.BLOCK, Feature.ITEM
    );

    public static int MOB_MATERIAL_FEATURES = createMask(
            Feature.SET, Feature.DUST, Feature.SMALL_DUST,
            Feature.BLOCK, Feature.DUST_BLOCK, Feature.ENRICHED
    );

    public static int MOB_MATERIAL_MINIMUM = createMask(
            Feature.SET, Feature.DUST, Feature.SMALL_DUST, Feature.BLOCK, Feature.DUST_BLOCK
    );

    public static int BLOCK_ONLY = createMask(
            Feature.SET, Feature.BLOCK
    );

    public static int UNSTABLE_SET = createMask(
            Feature.SET, Feature.ITEM, Feature.INGOT, Feature.NUGGET
    );

    public static int NATURAL_GEM_FEATURES = createMask(
            Feature.SET, Feature.DUST, Feature.GEM, Feature.SMALL_DUST, Feature.BLOCK, Feature.PLATE, Feature.ROD,
            Feature.GEAR, Feature.DUST_BLOCK, Feature.ORES, Feature.GEM_SHARD, Feature.ENRICHED
    );

    public static int METAL_WITHOUT_FEATURES = createMask(
            Feature.SET, Feature.INGOT, Feature.NUGGET, Feature.DUST, Feature.SMALL_DUST, Feature.BLOCK, Feature.DUST_BLOCK
    );

    public static int MINIMUM_FEATURES = createMask(
            Feature.SET, Feature.DUST, Feature.SMALL_DUST, Feature.DUST_BLOCK
    );

    public static int MINIMUM_FEATURES_BLOCK = createMask(
            Feature.SET, Feature.DUST, Feature.SMALL_DUST, Feature.BLOCK, Feature.DUST_BLOCK
    );

    public static int ONLY_DUST_FEATURES = createMask(
            Feature.SET, Feature.DUST, Feature.SMALL_DUST
    );

    public static int STONE_FEATURES = createMask(
            Feature.SET, Feature.DUST, Feature.SMALL_DUST, Feature.PLATE, Feature.ROD, Feature.GEAR, Feature.PEBBLE
    );

    public static int WOODEN_FEATURES = createMask(
            Feature.SET, Feature.DUST, Feature.PLATE, Feature.GEAR, Feature.DUST_BLOCK
    );

    public static int SULFUR_FEATURES = createMask(
            Feature.SET, Feature.ORES, Feature.RAW, Feature.DUST, Feature.SMALL_DUST, Feature.RAW_BLOCK, Feature.DUST_BLOCK
    );

    public static int HALIDE_FEATURES = createMask(
            Feature.SET, Feature.ORES, Feature.GEM, Feature.GEM_SHARD, Feature.DUST, Feature.SMALL_DUST, Feature.BLOCK, Feature.DUST_BLOCK
    );

    public static int GEO_FEATURES = createMask(
            Feature.SET, Feature.GEM, Feature.GEM_SHARD, Feature.ORES, Feature.DUST, Feature.SMALL_DUST, Feature.DUST_BLOCK, Feature.BLOCK, Feature.ENRICHED
    );

    public static int SALT_FEATURES = createMask(
            Feature.SET, Feature.ORES, Feature.DUST, Feature.SMALL_DUST, Feature.DUST_BLOCK
    );

    public static int CARBON_FEATURES = createMask(
            Feature.SET, Feature.GEM, Feature.DUST, Feature.SMALL_DUST, Feature.DUST_BLOCK, Feature.BLOCK, Feature.ORES
    );

    public static int COKE_FEATURES = createMask(
            Feature.SET, Feature.GEM, Feature.DUST, Feature.SMALL_DUST, Feature.DUST_BLOCK, Feature.BLOCK
    );

    public static int BLEND_FEATURES = createMask(
            Feature.SET, Feature.DUST, Feature.ENRICHED
    );

    public static int CATALYST_FEATURES = createMask(
            Feature.SET, Feature.DUST, Feature.INGOT, Feature.RAW, Feature.SMALL_DUST, Feature.SMALL_CLUMP,
            Feature.RAW_BLOCK, Feature.BLOCK, Feature.PLATE, Feature.ROD, Feature.SHARD, Feature.CRYSTAL,
            Feature.NUGGET, Feature.DIRTY_DUST, Feature.CLUMPS, Feature.GEAR, Feature.DUST_BLOCK, Feature.FOIL,
            Feature.ORE_GEM, Feature.ENRICHED
    );

    public static int VANILLA_METAL_FEATURES = createMask(
            Feature.SET, Feature.PLATE, Feature.ROD, Feature.GEAR, Feature.WIRE, Feature.DUST, Feature.DUST_BLOCK,
            Feature.DIRTY_DUST, Feature.FOIL, Feature.ORE_GEM, Feature.CLUMPS, Feature.SMALL_DUST, Feature.SMALL_CLUMP,
            Feature.SHARD, Feature.CRYSTAL, Feature.ENRICHED
    );

    public static int VANILLA_METAL_SPECIAL_FEATURES = createMask(
            Feature.SET, Feature.PLATE, Feature.ROD, Feature.GEAR, Feature.WIRE, Feature.DUST, Feature.DUST_BLOCK,
            Feature.DIRTY_DUST, Feature.FOIL, Feature.ORE_GEM, Feature.CLUMPS, Feature.SMALL_DUST, Feature.SMALL_CLUMP,
            Feature.NUGGET, Feature.SHARD, Feature.CRYSTAL, Feature.ENRICHED
    );

    public static int NETHERITE_FEATURES = createMask(
            Feature.SET, Feature.PLATE, Feature.ROD, Feature.GEAR, Feature.WIRE, Feature.DUST, Feature.DUST_BLOCK,
            Feature.FOIL, Feature.SMALL_DUST, Feature.NUGGET, Feature.ENRICHED
    );

    public static int VANILLA_GEM_FEATURES = createMask(
            Feature.SET, Feature.GEM, Feature.PLATE, Feature.ROD, Feature.GEAR, Feature.DUST, Feature.DUST_BLOCK,
            Feature.SMALL_DUST, Feature.GEM_SHARD, Feature.ENRICHED
    );

    public static int VANILLA_GEM_FEATURES_BLOCK = createMask(
            Feature.SET, Feature.GEM, Feature.PLATE, Feature.ROD, Feature.GEAR, Feature.DUST, Feature.DUST_BLOCK,
            Feature.SMALL_DUST, Feature.GEM_SHARD, Feature.ENRICHED, Feature.BLOCK
    );

    public static int ALLOY_FEATURES = createMask(
            Feature.SET, Feature.INGOT, Feature.NUGGET, Feature.DUST, Feature.SMALL_DUST, Feature.PLATE, Feature.ROD,
            Feature.GEAR, Feature.FOIL, Feature.BLOCK, Feature.DUST_BLOCK, Feature.ENRICHED
    );

    public static int ALLOY_FEATURES_WITHOUT_GEAR = createMask(
            Feature.SET, Feature.INGOT, Feature.NUGGET, Feature.DUST, Feature.SMALL_DUST, Feature.PLATE, Feature.ROD,
            Feature.FOIL, Feature.BLOCK, Feature.DUST_BLOCK, Feature.ENRICHED
    );

    public static int ALLOY_FEATURES_WITHOUT_FOIL = createMask(
            Feature.SET, Feature.ITEM, Feature.INGOT, Feature.NUGGET, Feature.DUST, Feature.SMALL_DUST, Feature.PLATE, Feature.ROD,
            Feature.GEAR, Feature.BLOCK, Feature.DUST_BLOCK, Feature.ENRICHED
    );

    public static int ALLOY_FEATURES_WITHOUT_FOIL_GEAR = createMask(
            Feature.SET, Feature.ITEM, Feature.INGOT, Feature.NUGGET, Feature.DUST, Feature.SMALL_DUST, Feature.PLATE, Feature.ROD,
            Feature.BLOCK, Feature.DUST_BLOCK
    );

    public static int ALLOY_FEATURES_WITHOUT_PLATE_ROD = createMask(
            Feature.SET, Feature.ITEM, Feature.INGOT, Feature.NUGGET, Feature.DUST, Feature.SMALL_DUST, Feature.PLATE, Feature.FOIL,
            Feature.BLOCK, Feature.DUST_BLOCK
    );

    public static int SILICON_FEATURES = createMask(
            Feature.SET, Feature.INGOT, Feature.NUGGET, Feature.DUST, Feature.SMALL_DUST, Feature.PLATE, Feature.ROD,
            Feature.GEAR, Feature.FOIL, Feature.BLOCK, Feature.DUST_BLOCK, Feature.ITEM, Feature.ENRICHED
    );

    public static int UNNATURAL_GEM_FEATURES = createMask(
            Feature.SET, Feature.DUST, Feature.SMALL_DUST, Feature.PLATE, Feature.ROD, Feature.GEAR, Feature.FOIL,
            Feature.BLOCK, Feature.DUST_BLOCK, Feature.GEM, Feature.GEM_SHARD, Feature.ENRICHED
    );

    public static int createMask(Feature... features) {
        int mask = 0;
        for (Feature f : features) mask |= f.bit;
        return mask;
    }
}
