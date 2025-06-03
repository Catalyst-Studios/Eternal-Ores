package net.radzratz.eternalores.util.compat;

import net.neoforged.fml.ModList;

public class EternalCompatibility
{

    //Mekanism mod Compat
    public static void checkOtherModsMekanism()
    {
        if(ModList.get().isLoaded("mekanism"))
        {
            registerRealItemMekanismItems();
        }
        else
        {
            registerDummyItemMekanismItems();
        }
    }
    public static void registerRealItemMekanismItems()
    {
    }

    public static void registerDummyItemMekanismItems()
    {
    }
}