package net.radzratz.eternalores.util.config;

import net.neoforged.neoforge.common.ModConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class EOEventsConfig {
    public static final EOEventsConfig CFG;
    public static final ModConfigSpec CONFIG_SPEC;

    public final EOEvents EO_EVENTS;

    static {
        Pair<EOEventsConfig, ModConfigSpec> pair = new ModConfigSpec.Builder().configure(EOEventsConfig::new);
        CFG = pair.getLeft();
        CONFIG_SPEC = pair.getRight();
    }

    private EOEventsConfig(ModConfigSpec.Builder bldr) {
        bldr.comment("""
                      Eternal Ores Events config.
                     
                      This config allows you to disable item or block events.
                     
                      Like the Unstable Ingot explosion or EO's Redstone Block emitting signal, etc.
                     
                      Each change requires a game restart. Preferably.
                     """).push("events");

        this.EO_EVENTS = new EOEvents(bldr);

        bldr.pop();
    }

    public static class EOEvents {
        public final ModConfigSpec.BooleanValue redstoneEmission;
        public final ModConfigSpec.IntValue redstoneEmissionLevel;
        public final ModConfigSpec.BooleanValue canConnectToRedstone;

        public final ModConfigSpec.BooleanValue unstableExplosion;
        public final ModConfigSpec.BooleanValue unstableDeletion;
        public final ModConfigSpec.BooleanValue unstableStorage;

        public final ModConfigSpec.BooleanValue pebbleThrow;
        public final ModConfigSpec.IntValue pebbleDamage;

        public EOEvents(ModConfigSpec.Builder bldr) {
            bldr.push("redstone_block");
            this.redstoneEmission = bldr
                    .comment("[Server] Defines if Eternal Ores Redstone Block emmit a redstone signal")
                    .gameRestart()
                    .define("doesRedstoneBlockEmmitSignal", true);

            this.redstoneEmissionLevel = bldr
                    .comment("[Server] Defines the Redstone level emission of Eternal Ores Redstone Block")
                    .gameRestart()
                    .defineInRange("redstoneLevelEmission", 15, 0, 30);

            this.canConnectToRedstone = bldr
                    .comment("[Server] Defines if Eternal Ores Redstone Block can connect to redstone")
                    .gameRestart()
                    .define("doesRedstoneBlockConnectToRedstone", true);
            bldr.pop();

            bldr.push("unstable_ingot");
            this.unstableExplosion = bldr
                    .comment("[Server] Defines if the Unstable Ingot should explode. False by default.")
                    .gameRestart()
                    .define("isUnstableExplosionEnable", false);

            this.unstableDeletion = bldr
                    .comment("[Server] Defines if the Unstable Ingot should get deleted after being crafted by external sources, aka autocrafting or crafters")
                    .comment("This ingot has a special data component, which gets assigned if the item was crafted or not.")
                    .gameRestart()
                    .define("isUnstableDeletionEnable", false);

            this.unstableStorage = bldr
                    .comment("[Server] Defines if the Unstable Ingot can be stored in any container block, chests, bundles, etc.")
                    .gameRestart()
                    .define("isUnstableStorageEnable", false);
            bldr.pop();

            bldr.push("pebbles");
            this.pebbleThrow = bldr
                    .comment("[Server] Defines if players can throw pebbles at anyone... yep, thrown em at your buddies hehe.")
                    .define("canPebblesBeThrown", true);

            this.pebbleDamage = bldr
                    .comment("[Server] Defines the amount of damage pebbles can deal... nope, max damage will not go past 10, and I will not be convinced by anything or anyone to increase it.")
                    .defineInRange("pebbleDamage", 1, 0, 10);
            bldr.pop();
        }
    }
}
