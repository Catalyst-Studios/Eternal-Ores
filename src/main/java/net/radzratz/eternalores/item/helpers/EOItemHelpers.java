package net.radzratz.eternalores.item.helpers;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.neoforge.registries.DeferredItem;
import net.radzratz.eternalores.item.types.*;
import net.radzratz.eternalores.item.tools.EOFinder;
import net.radzratz.eternalores.item.tools.EOGemCutter;
import net.radzratz.eternalores.item.tools.EOHammers;
import net.radzratz.eternalores.item.types.enums.EOMaterialFormType;

import static net.radzratz.eternalores.item.EOItemRegistry.ITEMS;

public class EOItemHelpers
{
    public static DeferredItem<EOHammers> registerHammer(String name, int durability)
    {
        return ITEMS.register(name, () -> new EOHammers(new Item.Properties(), durability));
    }

    public static DeferredItem<Item> registerFinder(String name, int durability)
    {
        return ITEMS.register(name, () -> new EOFinder(new Item.Properties().rarity(Rarity.EPIC).setNoRepair().stacksTo(1)));
    }

    public static DeferredItem<EOGemCutter> registerGemCutter(String name, int durability)
    {
        return ITEMS.register(name, () -> new EOGemCutter(new Item.Properties(), durability));
    }

    public static DeferredItem<Item> registerMiscItem(String name)
    {
        return ITEMS.register(name, () -> new Item(new Item.Properties()));
    }

    public static DeferredItem<EOIngotItem> registerIngotItem(String name)
    {
        return ITEMS.register(name, () -> new EOIngotItem(new Item.Properties()));
    }

    public static DeferredItem<EONuggetItem> registerNuggetItem(String name)
    {
        return ITEMS.register(name, () -> new EONuggetItem(new Item.Properties()));
    }

    public static DeferredItem<EORodItem> registerRodItem(String name, EOMaterialFormType type)
    {
        return ITEMS.register(name, () -> new EORodItem(type, new Item.Properties()));
    }

    public static DeferredItem<EOPlateItem> registerPlateItem(String name, EOMaterialFormType type)
    {
        return ITEMS.register(name, () -> new EOPlateItem(type, new Item.Properties()));
    }

    public static DeferredItem<EOGearItem> registerGearItem(String name, EOMaterialFormType type)
    {
        return ITEMS.register(name, () -> new EOGearItem(type, new Item.Properties()));
    }

    public static DeferredItem<EORawMaterialItem> registerRawItem(String name)
    {
        return ITEMS.register(name, () -> new EORawMaterialItem(new Item.Properties()));
    }

    public static DeferredItem<EODustItem> registerDustItem(String name, EOMaterialFormType type)
    {
        return ITEMS.register(name, () -> new EODustItem(type, new Item.Properties()));
    }

    public static DeferredItem<EOGemItem> registerGemItem(String name)
    {
        return ITEMS.register(name, () -> new EOGemItem(new Item.Properties()));
    }
}
