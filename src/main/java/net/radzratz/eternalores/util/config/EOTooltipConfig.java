package net.radzratz.eternalores.util.config;

import net.neoforged.neoforge.common.ModConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class EOTooltipConfig {
    public static final EOTooltipConfig CFG;
    public static final ModConfigSpec CONFIG_SPEC;

    public final EOToolTips EO_TOOLTIPS;

    static {
        Pair<EOTooltipConfig, ModConfigSpec> pair = new ModConfigSpec.Builder().configure(EOTooltipConfig::new);
        CFG = pair.getLeft();
        CONFIG_SPEC = pair.getRight();
    }

    private EOTooltipConfig(ModConfigSpec.Builder bldr) {
        bldr.comment("""
                      Eternal Ores tooltip config.
                     
                      This config allows you to disable all assigned Material or Tool tooltips or descriptions.
                     
                      Each change requires a world restart.
                     """).push("tooltips");

        this.EO_TOOLTIPS = new EOToolTips(bldr);

        bldr.pop();
    }

    public static class EOToolTips {
        public final ModConfigSpec.BooleanValue prospectorTooltips;
        public final ModConfigSpec.BooleanValue advancedProspectorTooltips;

        public final ModConfigSpec.BooleanValue destroya;

        public final ModConfigSpec.BooleanValue teleporter;

        public final ModConfigSpec.BooleanValue unstableDesc;
        public final ModConfigSpec.BooleanValue unstableTimer;

        public final ModConfigSpec.BooleanValue temictetlGem;
        public final ModConfigSpec.BooleanValue temictetlShard;
        public final ModConfigSpec.BooleanValue temictetlRod;
        public final ModConfigSpec.BooleanValue temictetlPlate;
        public final ModConfigSpec.BooleanValue temictetlGear;
        public final ModConfigSpec.BooleanValue temictetlEnriched;
        public final ModConfigSpec.BooleanValue temictetlDust;
        public final ModConfigSpec.BooleanValue temictetlSmallDust;
        public final ModConfigSpec.BooleanValue temictetlBlock;
        public final ModConfigSpec.BooleanValue temictetlDustBlock;

        public final ModConfigSpec.BooleanValue metalGearMold;
        public final ModConfigSpec.BooleanValue exoticButter;
        public final ModConfigSpec.BooleanValue nickelback;

        public final ModConfigSpec.BooleanValue compressionAmount;

        public EOToolTips(ModConfigSpec.Builder bldr) {
            bldr.push("prospectors");
            this.prospectorTooltips = bldr.worldRestart().define("isProspectorTooltipsEnabled", true);
            this.advancedProspectorTooltips = bldr.worldRestart().define("isAdvancedProspectorTooltipsEnabled", true);
            bldr.pop();

            bldr.push("finder");
            this.destroya = bldr.worldRestart().define("isFinderTooltipsEnabled", true);
            bldr.pop();

            bldr.push("teleporter");
            this.teleporter = bldr.worldRestart().define("isTeleporterTooltipEnabled", true);
            bldr.pop();

            bldr.push("unstable_ingot");
            this.unstableDesc = bldr.worldRestart().define("isUnstableWarningsEnabled", true);
            this.unstableTimer = bldr.worldRestart().define("isUnstableTimerEnabled", true);
            bldr.pop();

            bldr.push("temictetl");
            this.temictetlGem = bldr.worldRestart().define("isTemictetlGemDescEnabled", true);
            this.temictetlShard = bldr.worldRestart().define("isTemictetlGemShardDescEnabled", true);
            this.temictetlRod = bldr.worldRestart().define("isTemictetlRodDescEnabled", true);
            this.temictetlPlate = bldr.worldRestart().define("isTemictetlPlateDescEnabled", true);
            this.temictetlGear = bldr.worldRestart().define("isTemictetlGearDescEnabled", true);
            this.temictetlEnriched = bldr.worldRestart().define("isTemictetlEnrichedDescEnabled", true);
            this.temictetlDust = bldr.worldRestart().define("isTemictetlDustDescEnabled", true);
            this.temictetlSmallDust = bldr.worldRestart().define("isTemictetlSmallDustDescEnabled", true);
            this.temictetlBlock = bldr.worldRestart().define("isTemictetlBlockDescEnabled", true);
            this.temictetlDustBlock = bldr.worldRestart().define("isTemictetlDustBlockDescEnabled", true);
            bldr.pop();

            bldr.push("not_so_funny");
            this.metalGearMold = bldr.worldRestart().define("isMetalGearReferenceEnabled", true);
            this.exoticButter = bldr.worldRestart().define("isExoticButterEnabled", true);
            this.nickelback = bldr.worldRestart().define("isNickelbackEnabled", true);
            bldr.pop();

            bldr.push("compressed");
            this.compressionAmount = bldr.worldRestart().define("isCompressionAmountEnabled", true);
            bldr.pop();
        }
    }
}
