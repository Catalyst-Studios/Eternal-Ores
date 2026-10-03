package net.radzratz.eternalores.util.tags.fluid;

import net.minecraft.tags.FluidTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.material.Fluid;

import static net.radzratz.eternalores.util.EOUtils.*;

@SuppressWarnings("all")
public class EOFluidTags {
    public static class Compat {
        public static final TagKey<Fluid> NO_INFINITE_DRAINING = crteNoDrain("no_infinite_draining");
        public static final TagKey<Fluid> HOT_FLUID = crteHotFluid("hot_fluids");

        public static final TagKey<Fluid> EXCLUDE = crteEOTag("exclude");

        private static TagKey<Fluid> crteNoDrain(String name) {
            return FluidTags.create(CTE(name));
        }

        private static TagKey<Fluid> crteHotFluid(String name) {
            return FluidTags.create(SLAG(name));
        }

        private static TagKey<Fluid> crteEOTag(String name) {
            return FluidTags.create(EO(name));
        }
    }

    public static class Molten {
        public static final TagKey<Fluid> COBALT_MOLTEN = crteMolten("cobalt");
        public static final TagKey<Fluid> COPPER_MOLTEN = crteMolten("copper");
        public static final TagKey<Fluid> QUARTZ_MOLTEN = crteMolten("quartz");
        public static final TagKey<Fluid> DIAMOND_MOLTEN = crteMolten("diamond");
        public static final TagKey<Fluid> EMERALD_MOLTEN = crteMolten("emerald");
        public static final TagKey<Fluid> AMETHYST_MOLTEN = crteMolten("amethyst");
        public static final TagKey<Fluid> ALUMINUM_MOLTEN = crteMolten("aluminum");
        public static final TagKey<Fluid> ANCIENT_DEBRIS_MOLTEN = crteMolten("ancient_debris");
        public static final TagKey<Fluid> BRASS_MOLTEN = crteMolten("brass");
        public static final TagKey<Fluid> BRONZE_MOLTEN = crteMolten("bronze");
        public static final TagKey<Fluid> CONSTANTAN_MOLTEN = crteMolten("constantan");
        public static final TagKey<Fluid> ELECTRUM_MOLTEN = crteMolten("electrum");
        public static final TagKey<Fluid> ENDER_MOLTEN = crteMolten("ender_pearl");
        public static final TagKey<Fluid> ENDERIUM_MOLTEN = crteMolten("enderium");
        public static final TagKey<Fluid> GOLD_MOLTEN = crteMolten("gold");
        public static final TagKey<Fluid> INVAR_MOLTEN = crteMolten("invar");
        public static final TagKey<Fluid> IRIDIUM_MOLTEN = crteMolten("iridium");
        public static final TagKey<Fluid> IRON_MOLTEN = crteMolten("iron");
        public static final TagKey<Fluid> LAPIS_MOLTEN = crteMolten("lapis");
        public static final TagKey<Fluid> LEAD_MOLTEN = crteMolten("lead");
        public static final TagKey<Fluid> LUMIUM_MOLTEN = crteMolten("lumium");
        public static final TagKey<Fluid> NETHERITE_MOLTEN = crteMolten("netherite");
        public static final TagKey<Fluid> NICKEL_MOLTEN = crteMolten("nickel");
        public static final TagKey<Fluid> OBSIDIAN_MOLTEN = crteMolten("obsidian");
        public static final TagKey<Fluid> OSMIUM_MOLTEN = crteMolten("osmium");
        public static final TagKey<Fluid> PLATINUM_MOLTEN = crteMolten("platinum");
        public static final TagKey<Fluid> REDSTONE_MOLTEN = crteMolten("redstone");
        public static final TagKey<Fluid> SIGNALUM_MOLTEN = crteMolten("signalum");
        public static final TagKey<Fluid> SHULKER_SHELL_MOLTEN = crteMolten("shulker_shell");
        public static final TagKey<Fluid> STEEL_MOLTEN = crteMolten("steel");
        public static final TagKey<Fluid> TIN_MOLTEN = crteMolten("tin");
        public static final TagKey<Fluid> URANIUM_MOLTEN = crteMolten("uranium");
        public static final TagKey<Fluid> ZINC_MOLTEN = crteMolten("zinc");

        private static TagKey<Fluid> crteMolten(String name) {
            return FluidTags.create(C("molten_" + name));
        }
    }

    public static class Fluids {
        public static final TagKey<Fluid> COBALT_FLUID = crteFluid("cobalt");
        public static final TagKey<Fluid> COPPER_FLUID = crteFluid("copper");
        public static final TagKey<Fluid> BLOOD_FLUID = crteFluid("blood");

        private static TagKey<Fluid> crteFluid(String name) {
            return FluidTags.create(C(name));
        }
    }

    public static class Gases {
        private static TagKey<Fluid> crteGas(String name) {
            return FluidTags.create(C(name));
        }
    }

    public static class Chemicals {
        private static TagKey<Fluid> crteChem(String name) {
            return FluidTags.create(C(name));
        }
    }
}
