package net.radzratz.eternalores.util.config;

import net.neoforged.neoforge.common.ModConfigSpec;
import net.radzratz.eternalores.fluids.type.EOFluidType;
import org.apache.commons.lang3.tuple.Pair;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import static net.radzratz.eternalores.util.EOUtils.*;

public class EOFluidsConfig {
    public static final EOFluidsConfig CFG;
    public static final ModConfigSpec CONFIG_SPEC;

    public final EOFluidSet fluidSet;

    static {
        Pair<EOFluidsConfig, ModConfigSpec> pair = new ModConfigSpec.Builder().configure(EOFluidsConfig::new);
        CFG = pair.getLeft();
        CONFIG_SPEC = pair.getRight();
    }

    private EOFluidsConfig(ModConfigSpec.Builder bldr) {
        bldr.comment("""
                 Eternal Ores Fluids Config.
                
                 This config allows you to disable any of Eternal Ores added Fluids, Molten Types, Gases, Chemical,
                 Plasmas or Cryogenics.
                
                 One thing to clarify, these gases/chemicals are not Mekanism-Like-Types, they are plain Fluids, like
                 Modern Industrialization or GregTech's.
                
                 Disabling any Fluid within this config, prevents players from using these, hides them automatically from any
                 recipe viewer.
                
                 This config does not unregister any Fluid, it only toggles any function they had, if they had one.
                
                 Each change requires a Game Restart.
                """).push("fluids_config");

        this.fluidSet = new EOFluidSet(bldr);

        bldr.pop();
    }

    public static class EOFluidSet {
        public final ModConfigSpec.BooleanValue allMolten;
        public final ModConfigSpec.BooleanValue allFluids;
        public final ModConfigSpec.BooleanValue allGases;
        public final ModConfigSpec.BooleanValue allChemicals;

        private final Map<String, ModConfigSpec.BooleanValue> entries = new HashMap<>();

        public EOFluidSet(ModConfigSpec.Builder bldr) {
            bldr.comment("Molten Materials").push("moltens");
            this.allMolten = allToggle(bldr, "all_moltens");
            registerCategory(bldr, EOFluidType.FluidTypes.MOLTEN);
            bldr.pop();

            bldr.comment("Fluid Materials").push("fluids");
            this.allFluids = allToggle(bldr, "all_fluids");
            registerCategory(bldr, EOFluidType.FluidTypes.FLUID);
            bldr.pop();

            bldr.comment("Gases").push("gases");
            this.allGases = allToggle(bldr, "all_gases");
            registerCategory(bldr, EOFluidType.FluidTypes.GAS);
            bldr.pop();

            bldr.comment("Chemicals").push("chemicals");
            this.allChemicals = allToggle(bldr, "all_chemicals");
            registerCategory(bldr, EOFluidType.FluidTypes.CHEMICAL);
            bldr.pop();
        }

        private void registerCategory(ModConfigSpec.Builder bldr, EOFluidType.FluidTypes category) {
            allFluidSourceEntries()
                    .filter(entry -> entry.getId().getPath().startsWith(category.prefix + "_"))
                    .sorted(Comparator.comparing(entry -> entry.getId().getPath()))
                    .forEach(entry -> {
                        String path = entry.getId().getPath();
                        entries.put(path, fluidToggle(bldr, path));
                    });
        }

        private ModConfigSpec.BooleanValue allToggle(ModConfigSpec.Builder bldr, String id) {
            return bldr
                    .comment("[Server] Enable/Disable all fluids in this category.")
                    .translation("config.eternalores.fluids." + id)
                    .gameRestart()
                    .define(id, true);
        }

        private ModConfigSpec.BooleanValue fluidToggle(ModConfigSpec.Builder bldr, String id) {
            return bldr
                    .comment("[Server] Enable/Disable " + replaceUnderscoreWithCapitalization(id) + ".")
                    .translation("config.eternalores.fluids." + id)
                    .gameRestart()
                    .define("is" + replaceUnderscoreWithCapitalization(id) + "Enabled", true);
        }

        public boolean isEnabled(EOFluidType.FluidTypes category, String path) {
            boolean categoryEnabled = switch (category) {
                case MOLTEN -> allMolten.get();
                case FLUID -> allFluids.get();
                case GAS -> allGases.get();
                case CHEMICAL -> allChemicals.get();
            };
            if (!categoryEnabled) return false;

            ModConfigSpec.BooleanValue value = entries.get(path);
            return value == null || value.get();
        }
    }
}