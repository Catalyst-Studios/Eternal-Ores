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
                 
                  This config allows you to tweak the behaviour of certain recipes.
                 
                  Tweaks;
                  Empty at the moment, but soon.
                 
                  Mixins;
                  Immersive Engineering
                  - Tweaks the Metal Press Machine to use both IE and EO molds as a single input via Tag instead of a hardcoded Item.
                  - Displays 'c:tools/molds/mold_type' over their JEI Recipe Category, so players know they can use both molds equally.
                 
                  Each change requires a Game Restart. Preferably.
                 """).push("mixin_config");

        this.EO_TWEAKS = new EternalOresTweaks(bldr);

        bldr.pop();
    }

    public static class EternalOresTweaks {
        public final ModConfigSpec.BooleanValue ieMoldTagCompat;

        public EternalOresTweaks(ModConfigSpec.Builder bldr) {
            bldr.comment("Mixins").push("mixins");
            this.ieMoldTagCompat = bldr
                    .comment("Defines if the Metal Press Machine can use Tags as a Mold Input.")
                    .comment("This also defines if the tag 'c:tools/molds/mold_type' is shown over the Metal Press recipe category.")
                    .gameRestart()
                    .define("isIEMoldTagCompatEnabled", false);
            bldr.pop();
        }
    }
}
