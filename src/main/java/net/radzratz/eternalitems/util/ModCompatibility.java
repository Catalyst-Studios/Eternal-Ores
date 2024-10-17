package net.radzratz.eternalitems.util;

import net.neoforged.fml.ModList;
import net.radzratz.eternalitems.item.Moditems;

public class ModCompatibility {

    //Applied Energistics 2 Compatibility
    public static void checkOtherModsAppliedEnergistics2() {
        if (ModList.get().isLoaded("ae2")) {
            registerRealItemAE2Items();
        } else {
            registerDummyItemAE2Items();
        }
    }

    public static void registerRealItemAE2Items() {
        System.out.println("AE2 Loaded, Loading Multipress, DummyPress should dissapear");
        Moditems.MULTIPRESS.get();
    }

    public static void registerDummyItemAE2Items() {
        System.out.println("AE2 not loaded, DummyPress will replace Multipress");
        Moditems.DUMMYPRESS.get();
    }

    //Ars Nouveau
    public static void checkOtherModsArsNouveau() {
        if (ModList.get().isLoaded("ars_nouveau")) {
            registerRealItemArsItems();
        } else {
            registerDummyItemArsItems();
        }
    }

    public static void registerRealItemArsItems() {
        System.out.println("AE2 Loaded, Loading Multipress, DummyPress should dissapear");
        Moditems.MULTIPRESS.get();
    }

    public static void registerDummyItemArsItems() {
        System.out.println("Ars Nouveau not loaded, Dummy Source Manifestation will replace Source Manifestation");
        Moditems.DUMMYPRESS.get();

    }
    //Mekanism
}