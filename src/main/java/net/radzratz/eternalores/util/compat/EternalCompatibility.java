package net.radzratz.eternalores.util.compat;

import net.neoforged.fml.ModList;

public class EternalCompatibility {

    //Mekanism mod Compat
    public static void checkOtherModsMekanism() {
        if (ModList.get().isLoaded("mekanism")) {
            registerRealItemMekanismItems();
        } else {
            registerDummyItemMekanismItems();
        }
    }
    public static void registerRealItemMekanismItems() {
        System.out.println("Mekanism Loaded. Registering Real Items.");
        //EternalGeneralItems.MULTIPRESS.get();
    }

    public static void registerDummyItemMekanismItems() {
        System.out.println("Mekanism not loaded, falling back to Dummy Items.");
        //EternalGeneralItems.DUMMYPRESS.get();
        System.out.println("Item, Slurry placeholders placed");
    }
}