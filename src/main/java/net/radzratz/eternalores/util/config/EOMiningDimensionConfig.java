package net.radzratz.eternalores.util.config;

import net.neoforged.neoforge.common.ModConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class EOMiningDimensionConfig {
    public static final EOMiningDimensionConfig CONFIG;
    public static final ModConfigSpec CONFIG_SPEC;

    static {
        Pair<EOMiningDimensionConfig, ModConfigSpec> pair = new ModConfigSpec.Builder().configure(EOMiningDimensionConfig::new);
        CONFIG = pair.getLeft();
        CONFIG_SPEC = pair.getRight();
    }

    public final MiningDimension miningDimension;

    private EOMiningDimensionConfig(ModConfigSpec.Builder builder) {
        builder.comment("""
            Eternal Ores Mining Dimension Config.
            
            Controls the world generation layout of the Mining Dimension.
            Layer order (bottom to top): Bedrock → End Stone → Nether → Deepslate → Stone → Dirt → Grass → Air
            
            Each change requires a game restart AND either deleting the dimension data
            from the save folder or creating a new world.
            """)
                .push("mining_dimension");

        miningDimension = new MiningDimension(builder);
        builder.pop();
    }

    public static class MiningDimension {

        // Defaults
        public static final int DEFAULT_WORLD_TOP = 191;
        public static final int DEFAULT_GRASS_LEVEL = 160;
        public static final int DEFAULT_DIRT_START = 155;
        public static final int DEFAULT_STONE_START = 150;
        public static final int DEFAULT_DEEPSLATE_START = 64;
        public static final int DEFAULT_NETHER_START = -64;
        public static final int DEFAULT_END_START = -128;
        public static final int DEFAULT_BEDROCK_LEVEL = -192;

        public final ModConfigSpec.IntValue worldTop;
        public final ModConfigSpec.IntValue grassLevel;
        public final ModConfigSpec.IntValue dirtStart;
        public final ModConfigSpec.IntValue stoneStart;
        public final ModConfigSpec.IntValue bedrockLevel;
        public final ModConfigSpec.IntValue deepslateStart;
        public final ModConfigSpec.IntValue netherStart;
        public final ModConfigSpec.IntValue endStart;

        public MiningDimension(ModConfigSpec.Builder builder) {
            builder.comment("World Generation Settings").push("generation");

            this.worldTop = builder
                    .comment(
                            "[Server] Maximum build height of the Mining Dimension.",
                            "Default: 191"
                    )
                    .gameRestart()
                    .defineInRange("worldTop", DEFAULT_WORLD_TOP, 64, 320);

            this.grassLevel = builder
                    .comment(
                            "[Server] Y level of the grass block.",
                            "Players spawn at grassLevel + 1 (first air block above grass).",
                            "Default: 160"
                    )
                    .gameRestart()
                    .defineInRange("grassLevel", DEFAULT_GRASS_LEVEL, -64, 320);

            this.dirtStart = builder
                    .comment(
                            "[Server] Y level where the Dirt layer begins.",
                            "Dirt fills from dirtStart up to grassLevel - 1.",
                            "Default: 155  →  Dirt layer: 155 to 159 (5 blocks)"
                    )
                    .gameRestart()
                    .defineInRange("dirtStart", DEFAULT_DIRT_START, -256, 320);

            this.stoneStart = builder
                    .comment(
                            "[Server] Y level where the Stone layer begins.",
                            "Stone fills from stoneStart up to dirtStart - 1.",
                            "Default: 0  →  Stone layer: 0 to 154 (155 blocks)"
                    )
                    .gameRestart()
                    .defineInRange("stoneStart", DEFAULT_STONE_START, -256, 320);

            this.deepslateStart = builder
                    .comment(
                            "[Server] Y level where the Deepslate layer begins.",
                            "Deepslate fills from deepslateStart up to stoneStart - 1.",
                            "Default: 0  →  Deepslate layer: -64 to -1 (64 blocks)"
                    )
                    .gameRestart()
                    .defineInRange("deepslateStart", DEFAULT_DEEPSLATE_START, -256, 128);

            this.netherStart = builder
                    .comment(
                            "[Server] Y level where the Netherrack layer begins.",
                            "Netherrack fills from netherStart up to deepslateStart - 1.",
                            "Default: -64  →  Nether layer: -128 to -65 (64 blocks)"
                    )
                    .gameRestart()
                    .defineInRange("netherStart", DEFAULT_NETHER_START, -256, 64);

            this.endStart = builder
                    .comment(
                            "[Server] Y level where the End Stone layer begins.",
                            "End Stone fills from endStart up to netherStart - 1.",
                            "Default: -128  →  End Stone layer: -191 to -129 (63 blocks)"
                    )
                    .gameRestart()
                    .defineInRange("endStart", DEFAULT_END_START, -256, 0);

            this.bedrockLevel = builder
                    .comment(
                            "[Server] Y level of the bedrock floor.",
                            "Default: -192"
                    )
                    .gameRestart()
                    .defineInRange("bedrockLevel", DEFAULT_BEDROCK_LEVEL, -512, -64);

            builder.pop();
        }

        /**
         * Returns the safe spawn Y — first air block above the grass.
         * This is where players always appear when entering the dimension.
         */
        public int getSafeSpawnY() {
            return grassLevel.get() + 1;
        }
    }
}

