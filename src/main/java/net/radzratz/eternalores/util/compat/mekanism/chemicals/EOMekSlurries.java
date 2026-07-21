package net.radzratz.eternalores.util.compat.mekanism.chemicals;

import mekanism.api.chemical.Chemical;
import mekanism.api.chemical.ChemicalBuilder;
import mekanism.common.registration.impl.ChemicalDeferredRegister;
import mekanism.common.registration.impl.DeferredChemical;
import mekanism.common.registration.impl.SlurryRegistryObject;
import mekanism.common.registries.MekanismChemicals;
import mekanism.common.resource.PrimaryResource;
import net.neoforged.bus.api.IEventBus;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.util.compat.mekanism.chemicals.types.EOChemical;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BooleanSupplier;

import static net.radzratz.eternalores.util.compat.mekanism.chemicals.types.EOChemical.*;
import static net.radzratz.eternalores.util.config.EOChemicalsConfig.CFG;

public class EOMekSlurries {
    public static final ChemicalDeferredRegister EO_SLURRYS = new ChemicalDeferredRegister(EternalOres.id);

    static {
        ALUMINUM_SLURRY = rgtrSlurry("aluminum", 0xFF947a7a, CFG.chemicalSet.aluminumSlurry, CFG.chemicalSet.allSlurry);
        ARDITE_SLURRY = rgtrSlurry("ardite", 0xFFd66113, CFG.chemicalSet.arditeSlurry, CFG.chemicalSet.allSlurry);
        BERYLLIUM_SLURRY = rgtrSlurry("beryllium", 0xFF8acaa8, CFG.chemicalSet.berylliumSlurry, CFG.chemicalSet.allSlurry);
        CATALYRIUM_SLURRY = rgtrSlurryAnim("catalyrium", 0xFF7f1f00, CFG.chemicalSet.catalyriumSlurry, CFG.chemicalSet.allSlurry, 0x1f2843, 0x7f1f00);
        COBALT_SLURRY = rgtrSlurry("cobalt", 0xFF7ca5a5, CFG.chemicalSet.cobaltSlurry, CFG.chemicalSet.allSlurry);
        GALLIUM_SLURRY = rgtrSlurry("gallium", 0xFF3e4650, CFG.chemicalSet.galliumSlurry, CFG.chemicalSet.allSlurry);
        IRIDIUM_SLURRY = rgtrSlurry("iridium", 0xFFb6b5b1, CFG.chemicalSet.iridiumSlurry, CFG.chemicalSet.allSlurry);
        MOLYBDENUM_SLURRY = rgtrSlurry("molybdenum", 0xFFc1e7f2, CFG.chemicalSet.molybdenumSlurry, CFG.chemicalSet.allSlurry);
        NEODYMIUM_SLURRY = rgtrSlurry("neodymium", 0xFFc5aab8, CFG.chemicalSet.neodymium, CFG.chemicalSet.allSlurry);
        NICKEL_SLURRY = rgtrSlurry("nickel", 0xFFc7c1c1, CFG.chemicalSet.nickelSlurry, CFG.chemicalSet.allSlurry);
        PLATINUM_SLURRY = rgtrSlurry("platinum", 0xFF7e786d, CFG.chemicalSet.platinumSlurry, CFG.chemicalSet.allSlurry);
        SCULKITE_SLURRY = rgtrSlurry("sculkite", 0xFF009295, CFG.chemicalSet.sculkiteSlurry, CFG.chemicalSet.allSlurry);
        SILVER_SLURRY = rgtrSlurry("silver", 0xFFa49f9f, CFG.chemicalSet.silverSlurry, CFG.chemicalSet.allSlurry);
        TITANIUM_SLURRY = rgtrSlurry("titanium", 0xFFffd4fd, CFG.chemicalSet.titaniumSlurry, CFG.chemicalSet.allSlurry);
        TUNGSTEN_SLURRY = rgtrSlurry("tungsten", 0xFF91a7eb, CFG.chemicalSet.tungstenSlurry, CFG.chemicalSet.allSlurry);
        ULTIMATITANIUM_SLURRY = rgtrSlurry("ultimatitanium", 0xFFbfa7c6, CFG.chemicalSet.ultimatitaniumSlurry, CFG.chemicalSet.allSlurry);
        URANINITE_SLURRY = rgtrSlurry("uraninite", 0xFF85bf65, CFG.chemicalSet.uraniniteSlurry, CFG.chemicalSet.allSlurry);
        VANADIUM_SLURRY = rgtrSlurry("vanadium", 0xFF636984, CFG.chemicalSet.vanadiumSlurry, CFG.chemicalSet.allSlurry);
        ZINC_SLURRY = rgtrSlurry("zinc", 0xFFa49f9f, CFG.chemicalSet.zincSlurry, CFG.chemicalSet.allSlurry);
    }

    private static Map<String, SlurryRegistryObject<? extends Chemical, ? extends Chemical>> SLURRY_MAP;

    public static SlurryRegistryObject<EOChemical, EOChemical> rgtrSlurry(String baseName, int tint, BooleanSupplier ind, BooleanSupplier gen) {
        DeferredChemical<EOChemical> dirty = EO_SLURRYS.register("dirty_" + baseName,
                () -> new EOChemical(ChemicalBuilder.dirtySlurry().tint(tint), ind, gen));

        DeferredChemical<EOChemical> clean = EO_SLURRYS.register("clean_" + baseName,
                () -> new EOChemical(ChemicalBuilder.cleanSlurry().tint(tint), ind, gen));
        return new SlurryRegistryObject<>(dirty, clean);
    }

    public static SlurryRegistryObject<EOChemical, EOChemical> rgtrSlurryAnim(String baseName, int baseTint, BooleanSupplier ind, BooleanSupplier gen, int... tintCycle) {
        DeferredChemical<EOChemical> dirty = EO_SLURRYS.register("dirty_" + baseName,
                () -> new EOChemical(ChemicalBuilder.dirtySlurry().tint(baseTint), ind, gen, tintCycle));

        DeferredChemical<EOChemical> clean = EO_SLURRYS.register("clean_" + baseName,
                () -> new EOChemical(ChemicalBuilder.cleanSlurry().tint(baseTint), ind, gen, tintCycle));
        return new SlurryRegistryObject<>(dirty, clean);
    }

    public static Map<String, SlurryRegistryObject<? extends Chemical, ? extends Chemical>> getSlurryMap() {
        if (SLURRY_MAP == null) {
            SLURRY_MAP = new HashMap<>();

            for (PrimaryResource resource : PrimaryResource.values()) {
                SLURRY_MAP.put(
                        resource.getRegistrySuffix(),
                        MekanismChemicals.PROCESSED_RESOURCES.get(resource)
                );
            }

            SLURRY_MAP.put("aluminum", ALUMINUM_SLURRY);
            SLURRY_MAP.put("ardite", ARDITE_SLURRY);
            SLURRY_MAP.put("catalyrium", CATALYRIUM_SLURRY);
            SLURRY_MAP.put("cobalt", COBALT_SLURRY);
            SLURRY_MAP.put("gallium", GALLIUM_SLURRY);
            SLURRY_MAP.put("iridium", IRIDIUM_SLURRY);
            SLURRY_MAP.put("nickel", NICKEL_SLURRY);
            SLURRY_MAP.put("platinum", PLATINUM_SLURRY);
            SLURRY_MAP.put("silver", SILVER_SLURRY);
            SLURRY_MAP.put("titanium", TITANIUM_SLURRY);
            SLURRY_MAP.put("tungsten", TUNGSTEN_SLURRY);
            SLURRY_MAP.put("ultimatitanium", ULTIMATITANIUM_SLURRY);
            SLURRY_MAP.put("uraninite", URANINITE_SLURRY);
            SLURRY_MAP.put("zinc", ZINC_SLURRY);
            SLURRY_MAP.put("sculkite", SCULKITE_SLURRY);
            SLURRY_MAP.put("beryllium", BERYLLIUM_SLURRY);
            SLURRY_MAP.put("molybdenum", MOLYBDENUM_SLURRY);
            SLURRY_MAP.put("vanadium", VANADIUM_SLURRY);
            SLURRY_MAP.put("neodymium", NEODYMIUM_SLURRY);
        }
        return SLURRY_MAP;
    }

    public static void rgtr(IEventBus eventBus) {
        EO_SLURRYS.register(eventBus);
    }
}
