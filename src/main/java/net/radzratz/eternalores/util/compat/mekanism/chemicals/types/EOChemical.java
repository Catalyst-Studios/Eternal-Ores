package net.radzratz.eternalores.util.compat.mekanism.chemicals.types;

import mekanism.api.chemical.Chemical;
import mekanism.api.chemical.ChemicalBuilder;
import mekanism.common.registration.impl.DeferredChemical;
import mekanism.common.registration.impl.SlurryRegistryObject;

import java.util.function.BooleanSupplier;

public class EOChemical extends Chemical {
    private final BooleanSupplier individualToggle;
    private final BooleanSupplier globalToggle;
    private final int[] tintCycle;

    public EOChemical(ChemicalBuilder builder, BooleanSupplier individual, BooleanSupplier global) {
        super(builder);
        this.individualToggle = individual;
        this.globalToggle = global;
        this.tintCycle = null;
    }

    public EOChemical(ChemicalBuilder builder, BooleanSupplier individual, BooleanSupplier global, int... tintCycle) {
        super(builder);
        this.individualToggle = individual;
        this.globalToggle = global;
        this.tintCycle = tintCycle;
    }

    @Override
    public int getTint() {
        if (tintCycle == null || tintCycle.length == 0) return super.getTint();

        // Oscillates between tints every 1.5s per color, safe to call from the render thread
        long time = System.currentTimeMillis();
        float t = (time % (1500L * tintCycle.length)) / 1500f;
        int from = (int) t % tintCycle.length;
        int to = (from + 1) % tintCycle.length;
        float lerp = t - (int) t;

        // smoothly interpolates between the defined colors
        return lerpColor(tintCycle[from], tintCycle[to], lerp);
    }

    private int lerpColor(int a, int b, float t) {
        int r = (int) (((a >> 16) & 0xFF) * (1 - t) + ((b >> 16) & 0xFF) * t);
        int g = (int) (((a >> 8)  & 0xFF) * (1 - t) + ((b >> 8)  & 0xFF) * t);
        int bl = (int) (((a) & 0xFF) * (1 - t) + ((b) & 0xFF) * t);
        // linearly interpolates between two RRGGBB colors channel by channel
        return (r << 16) | (g << 8) | bl;
    }

    public boolean isEnabled() {
        return individualToggle.getAsBoolean() && globalToggle.getAsBoolean();
    }

    public static SlurryRegistryObject<EOChemical, EOChemical> ALUMINUM_SLURRY;
    public static SlurryRegistryObject<EOChemical, EOChemical> ARDITE_SLURRY;
    public static SlurryRegistryObject<EOChemical, EOChemical> CATALYRIUM_SLURRY;
    public static SlurryRegistryObject<EOChemical, EOChemical> COBALT_SLURRY;
    public static SlurryRegistryObject<EOChemical, EOChemical> GALLIUM_SLURRY;
    public static SlurryRegistryObject<EOChemical, EOChemical> IRIDIUM_SLURRY;
    public static SlurryRegistryObject<EOChemical, EOChemical> NICKEL_SLURRY;
    public static SlurryRegistryObject<EOChemical, EOChemical> PLATINUM_SLURRY;
    public static SlurryRegistryObject<EOChemical, EOChemical> SILVER_SLURRY;
    public static SlurryRegistryObject<EOChemical, EOChemical> TITANIUM_SLURRY;
    public static SlurryRegistryObject<EOChemical, EOChemical> TUNGSTEN_SLURRY;
    public static SlurryRegistryObject<EOChemical, EOChemical> ULTIMATITANIUM_SLURRY;
    public static SlurryRegistryObject<EOChemical, EOChemical> URANINITE_SLURRY;
    public static SlurryRegistryObject<EOChemical, EOChemical> ZINC_SLURRY;
    public static SlurryRegistryObject<EOChemical, EOChemical> SCULKITE_SLURRY;
    public static SlurryRegistryObject<EOChemical, EOChemical> BERYLLIUM_SLURRY;
    public static SlurryRegistryObject<EOChemical, EOChemical> MOLYBDENUM_SLURRY;
    public static SlurryRegistryObject<EOChemical, EOChemical> NEODYMIUM_SLURRY;
    public static SlurryRegistryObject<EOChemical, EOChemical> VANADIUM_SLURRY;

    // Material Based Infusions
    public static DeferredChemical<EOChemical> INF_COPPER;
    public static DeferredChemical<EOChemical> INF_ALUMINUM;
    public static DeferredChemical<EOChemical> INF_AMETHYST;
    public static DeferredChemical<EOChemical> INF_ARDITE;
    public static DeferredChemical<EOChemical> INF_AURORIUM;
    public static DeferredChemical<EOChemical> INF_BISMUTH;
    public static DeferredChemical<EOChemical> INF_CATALYRIUM;
    public static DeferredChemical<EOChemical> INF_CERTUS;
    public static DeferredChemical<EOChemical> INF_COBALT;
    public static DeferredChemical<EOChemical> INF_COSMIC_MATTER;
    public static DeferredChemical<EOChemical> INF_CHROMIUM;
    public static DeferredChemical<EOChemical> INF_ELECTRUM;
    public static DeferredChemical<EOChemical> INF_ENDERIUM;
    public static DeferredChemical<EOChemical> INF_ETERNAL_DARK;
    public static DeferredChemical<EOChemical> INF_ETERNAL_LIGHT;
    public static DeferredChemical<EOChemical> INF_ETERNITY;
    public static DeferredChemical<EOChemical> INF_ETHERIUM;
    public static DeferredChemical<EOChemical> INF_GALLIUM;
    public static DeferredChemical<EOChemical> INF_GRAPHITE;
    public static DeferredChemical<EOChemical> INF_INVAR;
    public static DeferredChemical<EOChemical> INF_IRON;
    public static DeferredChemical<EOChemical> INF_IRIDIUM;
    public static DeferredChemical<EOChemical> INF_LEAD;
    public static DeferredChemical<EOChemical> INF_LUMIUM;
    public static DeferredChemical<EOChemical> INF_MANGANESE;
    public static DeferredChemical<EOChemical> INF_MOLYBDENUM;
    public static DeferredChemical<EOChemical> INF_NICKEL;
    public static DeferredChemical<EOChemical> INF_PLATINUM;
    public static DeferredChemical<EOChemical> INF_PLUTONIUM;
    public static DeferredChemical<EOChemical> INF_SCULKITE;
    public static DeferredChemical<EOChemical> INF_SIGNALUM;
    public static DeferredChemical<EOChemical> INF_SILICON;
    public static DeferredChemical<EOChemical> INF_SILVER;
    public static DeferredChemical<EOChemical> INF_SOURCE;
    public static DeferredChemical<EOChemical> INF_STELLARIUM;
    public static DeferredChemical<EOChemical> INF_TITANIUM;
    public static DeferredChemical<EOChemical> INF_TUNGSTEN;
    public static DeferredChemical<EOChemical> INF_ULTIMATITANIUM;
    public static DeferredChemical<EOChemical> INF_UNIVERSIUM;
    public static DeferredChemical<EOChemical> INF_URANINITE;
    public static DeferredChemical<EOChemical> INF_URANIUM;
    public static DeferredChemical<EOChemical> INF_VANADIUM;
    public static DeferredChemical<EOChemical> INF_ZINC;

    public static DeferredChemical<EOChemical> INF_EMERALD;
    public static DeferredChemical<EOChemical> INF_LAPIS;
    public static DeferredChemical<EOChemical> INF_PRISMARINE;
    public static DeferredChemical<EOChemical> INF_QUARTZ;
    public static DeferredChemical<EOChemical> INF_AMBER;
    public static DeferredChemical<EOChemical> INF_APATITE;
    public static DeferredChemical<EOChemical> INF_ARCANUM;
    public static DeferredChemical<EOChemical> INF_CINNABAR;
    public static DeferredChemical<EOChemical> INF_FLUIX;
    public static DeferredChemical<EOChemical> INF_GARNET;
    public static DeferredChemical<EOChemical> INF_JADE;
    public static DeferredChemical<EOChemical> INF_NECROTICARITE;
    public static DeferredChemical<EOChemical> INF_MONAZITE;
    public static DeferredChemical<EOChemical> INF_NITER;
    public static DeferredChemical<EOChemical> INF_OBSIDIAN;
    public static DeferredChemical<EOChemical> INF_ONYX;
    public static DeferredChemical<EOChemical> INF_PEARL;
    public static DeferredChemical<EOChemical> INF_PERIDOT;
    public static DeferredChemical<EOChemical> INF_PYROLITE;
    public static DeferredChemical<EOChemical> INF_QUANTIQUARITE;
    public static DeferredChemical<EOChemical> INF_RUBY;
    public static DeferredChemical<EOChemical> INF_SANGUIS;
    public static DeferredChemical<EOChemical> INF_SAPPHIRE;
    public static DeferredChemical<EOChemical> INF_SPECTRAL_BLUERITE;
    public static DeferredChemical<EOChemical> INF_TACHYARITE;
    public static DeferredChemical<EOChemical> INF_TANZANITE;
    public static DeferredChemical<EOChemical> INF_TEMICTETL;
    public static DeferredChemical<EOChemical> INF_VOIDERITE;
    public static DeferredChemical<EOChemical> INF_ZIRCON;

    // Blend Infusions
    public static DeferredChemical<EOChemical> INF_LOW_CARBON;
    public static DeferredChemical<EOChemical> INF_ENRICHED_CARBON;
    public static DeferredChemical<EOChemical> INF_ENERGETIC;
    public static DeferredChemical<EOChemical> INF_ENDERGETIC;
    public static DeferredChemical<EOChemical> INF_NETHER_ENRICHED;
    public static DeferredChemical<EOChemical> INF_SHADOW;

    // Vanilla-Non-Metal/Gem Based Infusions
    public static DeferredChemical<EOChemical> INF_ENDER;
    public static DeferredChemical<EOChemical> INF_BLAZE;
    public static DeferredChemical<EOChemical> INF_NETHER_STAR;
}
