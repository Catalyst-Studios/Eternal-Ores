package net.radzratz.eternalores.util.config;

import net.neoforged.neoforge.common.ModConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class EOTweaksConfig {
    public static final EOTweaksConfig CFG;
    public static final ModConfigSpec CONFIG_SPEC;

    public final EternalOresTweaks EO_TWEAKS;

    static {
        Pair<EOTweaksConfig, ModConfigSpec> pair = new ModConfigSpec.Builder().configure(EOTweaksConfig::new);
        CFG = pair.getLeft();
        CONFIG_SPEC = pair.getRight();
    }

    private EOTweaksConfig(ModConfigSpec.Builder bldr) {
        bldr.comment("""
                  Eternal Ores Mixins and Tweaks Config.
                 
                  This config allows you to tweak the behaviour of certain machines, blocks and their inputs.

                  Immersive Engineering;
                  - Tweaks the Metal Press Machine to use both IE and EO molds as a single input via Tag instead of a hardcoded Item.
                  - Displays 'c:tools/molds/mold_type' over their JEI Recipe Category, so players know they can use both molds equally.
                 
                  Slag n' Embers;
                  - Tweaks the Casting Table Block to use both Slag n' Embers and EO molds as a single Cast Item, both sharing their
                    needed and assigned Data Components 'cast/type' for their specific recipes.
                  - Displays 'cast/type' tag over their JEI Recipe Category, so players know they can use both casts and molds equally.
                 
                  Each change requires a Game Restart.
                 """).push("mixin_config");

        this.EO_TWEAKS = new EternalOresTweaks(bldr);

        bldr.pop();
    }

    public static class EternalOresTweaks {
        public final ModConfigSpec.BooleanValue ieMoldTagCompat;
        public final ModConfigSpec.BooleanValue slagTableTweaks;

        public EternalOresTweaks(ModConfigSpec.Builder bldr) {
            bldr.comment("Immersive Engineering").push("ie");
            this.ieMoldTagCompat = bldr
                    .comment("Defines if the Metal Press Machine can use Tags as a Mold Input.")
                    .comment("This also defines if the tag 'c:tools/molds/mold_type' is shown over the Metal Press recipe category.")
                    .gameRestart()
                    .define("isIEMoldTagCompatEnabled", false);
            bldr.pop();

            bldr.comment("Slag n Embers").push("slag");
            this.slagTableTweaks = bldr
                    .comment("Defines if the Casting Table block can accept Eternal Ores molds as Casts.")
                    .comment("This also defines if Eternal Ores molds are shown on Casting Table recipe category")
                    .gameRestart()
                    .define("isSlagCastTableCompatEnabled", false);
            bldr.pop();
        }
    }
}
