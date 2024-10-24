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
        System.out.println("AE2 Recognized, Mod Compat Enabled, Multipress Initialized");
        Moditems.MULTIPRESS.get();
        System.out.print("Multipress Loaded, Loading AE2 Addons Compat");
        System.out.println("MegaCells Compat enabled");
        System.out.println("Applied Flux Compat enabled");
        System.out.println("ExtendedAE Compat enabled");
        System.out.println("Compat for AE2 and Addons Loaded Correctly");
    }

    public static void registerDummyItemAE2Items() {
        System.out.println("AE2 and addons Mod Compat disabled");
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
        System.out.println("Ars Nouveau Loaded, Loading Multipress, Dummy Source Manifestation should dissapear");
        Moditems.SOURCE_MANIFESTATION.get();
    }

    public static void registerDummyItemArsItems() {
        System.out.println("Ars Nouveau not loaded, Dummy Source Manifestation will replace Source Manifestation");
        Moditems.DUMMYPRESS.get();

    }
    //Mekanism
}