package net.radzratz.eternalores.item.helpers;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.neoforge.registries.DeferredItem;
import net.radzratz.eternalores.item.special.destroyer.EOChunkDestroyer;
import net.radzratz.eternalores.item.special.prospectors.EOAdvProspector;
import net.radzratz.eternalores.item.special.prospectors.EOBasicProspector;
import net.radzratz.eternalores.item.special.teleporter.EOTeleporter;
import net.radzratz.eternalores.item.tools.*;
import net.radzratz.eternalores.item.types.*;
import net.radzratz.eternalores.item.types.EOSmallDustItem;
import net.radzratz.eternalores.item.special.ingots.EOUnstableIngot;

import java.util.function.BooleanSupplier;

import static net.radzratz.eternalores.util.EOSetRegistries.EO_ITEMS;
import static net.radzratz.eternalores.util.EOMaterials.materialPrefixSuffixes.*;

public class EOItemHelpers {

    public static DeferredItem<EOHammers> rgtrHammer(String name, int durability, TagKey<Item> repairMat, BooleanSupplier tool) {
        return EO_ITEMS.register(name, () -> new EOHammers(new Item.Properties(), durability, repairMat, tool));
    }

    public static DeferredItem<EOChunkDestroyer> rgtrFinder(String name) {
        return EO_ITEMS.register(name, () -> new EOChunkDestroyer(new Item.Properties().rarity(Rarity.EPIC).setNoRepair().stacksTo(1)));
    }

    public static DeferredItem<EOTeleporter> rgtrTeleporter(String name) {
        return EO_ITEMS.register(name, () -> new EOTeleporter(new Item.Properties().rarity(Rarity.EPIC).stacksTo(1)));
    }

    public static DeferredItem<EOMolds> rgtrMolds(String name, BooleanSupplier mold) {
        return EO_ITEMS.register(name, () -> new EOMolds(new Item.Properties().stacksTo(1), mold));
    }

    public static DeferredItem<EOGemCutter> rgtrCutter(String name, TagKey<Item> repairMat, int durability, BooleanSupplier tool) {
        return EO_ITEMS.register(name, () -> new EOGemCutter(new Item.Properties(), repairMat, durability, tool));
    }

    public static DeferredItem<EOBasicProspector> rgtrProspector(String name, BooleanSupplier enabled) {
        return EO_ITEMS.register(name, () -> new EOBasicProspector(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON), enabled));
    }

    public static DeferredItem<EOAdvProspector> rgtrAdvProspector(String name, BooleanSupplier enabled) {
        return EO_ITEMS.register(name, () -> new EOAdvProspector(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC), enabled));
    }

    public static DeferredItem<EOWireCutter> rgtrWCutter(String name, int durability, TagKey<Item> repairMat, BooleanSupplier enabled) {
        return EO_ITEMS.register(name, () -> new EOWireCutter(new Item.Properties(), durability, repairMat, enabled));
    }

    public static DeferredItem<EOItems> rgtrMisc(String name, BooleanSupplier mat, BooleanSupplier set) {
        return EO_ITEMS.register(name, () -> new EOItems(new Item.Properties(), mat, set));
    }

    public static DeferredItem<EOCoalItem> rgtrCoal(String name, int burnTime, BooleanSupplier materialSet, BooleanSupplier enabled) {
        return EO_ITEMS.register(name, () -> new EOCoalItem(new Item.Properties(), burnTime, materialSet, enabled));
    }

    public static DeferredItem<EORawMaterialItem> rgtrRaw(String name, BooleanSupplier materialSet, BooleanSupplier enabled) {
        return EO_ITEMS.register(name, () -> new EORawMaterialItem(new Item.Properties(), materialSet, enabled));
    }

    public static DeferredItem<EOIngotItem> rgtrIngot(String name, BooleanSupplier materialSet, BooleanSupplier enabled) {
        return EO_ITEMS.register(name + INGOT, () -> new EOIngotItem(new Item.Properties(), materialSet, enabled));
    }

    public static DeferredItem<EOUnstableIngot> rgtrUnstableIngot(String name, BooleanSupplier materialSet, BooleanSupplier enabled) {
        return EO_ITEMS.register(name + INGOT, () -> new EOUnstableIngot(new Item.Properties(), materialSet, enabled));
    }

    public static DeferredItem<EOGemItem> rgtrGem(String name, BooleanSupplier materialSet, BooleanSupplier enabled) {
        return EO_ITEMS.register(name, () -> new EOGemItem(new Item.Properties(), materialSet, enabled));
    }

    public static DeferredItem<EONuggetItem> rgtrNugget(String name, BooleanSupplier materialSet, BooleanSupplier enabled) {
        return EO_ITEMS.register(name, () -> new EONuggetItem(new Item.Properties(), materialSet, enabled));
    }

    public static DeferredItem<EOGemShardItem> rgtrShards(String name, BooleanSupplier materialSet, BooleanSupplier enabled) {
        return EO_ITEMS.register(name, () -> new EOGemShardItem(new Item.Properties(), materialSet, enabled));
    }

    public static DeferredItem<EODustItem> rgtrDust(String name,BooleanSupplier materialSet, BooleanSupplier enabled) {
        return EO_ITEMS.register(name, () -> new EODustItem(new Item.Properties(), materialSet, enabled));
    }

    public static DeferredItem<EODustItem> rgtrDust(String name, int burnTIme, BooleanSupplier materialSet, BooleanSupplier enabled) {
        return EO_ITEMS.register(name, () -> new EODustItem(new Item.Properties(), burnTIme, materialSet, enabled));
    }

    public static DeferredItem<EOSmallDustItem> rgtrSmallDust(String name, BooleanSupplier materialSet, BooleanSupplier enabled) {
        return EO_ITEMS.register(name, () -> new EOSmallDustItem(new Item.Properties(), materialSet, enabled));
    }

    public static DeferredItem<EOSmallDustItem> rgtrSmallDust(String name, int burnTime, BooleanSupplier materialSet, BooleanSupplier enabled) {
        return EO_ITEMS.register(name, () -> new EOSmallDustItem(new Item.Properties(), burnTime, materialSet, enabled));
    }

    public static DeferredItem<EOPlateItem> rgtrPlate(String name, BooleanSupplier materialSet, BooleanSupplier enabled) {
        return EO_ITEMS.register(name, () -> new EOPlateItem(new Item.Properties(), materialSet, enabled));
    }

    public static DeferredItem<EORodItem> rgtrRod(String name, BooleanSupplier materialSet, BooleanSupplier enabled) {
        return EO_ITEMS.register(name, () -> new EORodItem(new Item.Properties(), materialSet, enabled));
    }

    public static DeferredItem<EOGearItem> rgtrGear(String name, BooleanSupplier materialSet, BooleanSupplier enabled) {
        return EO_ITEMS.register(name, () -> new EOGearItem(new Item.Properties(), materialSet, enabled));
    }

    public static DeferredItem<EOFoilItem> rgtrFoil(String name, BooleanSupplier materialSet, BooleanSupplier enabled) {
        return EO_ITEMS.register(name, () -> new EOFoilItem(new Item.Properties(), materialSet, enabled));
    }

    public static DeferredItem<EOBlends> rgtrBlend(String name, BooleanSupplier materialSet, BooleanSupplier enabled) {
        return EO_ITEMS.register(name, () -> new EOBlends(new Item.Properties(), materialSet, enabled));
    }

    public static DeferredItem<EOPebbleItem> rgtrPebble(String name, BooleanSupplier materialSet, BooleanSupplier individual) {
        return EO_ITEMS.register(name, () -> new EOPebbleItem(new Item.Properties(), materialSet, individual));
    }

    public static DeferredItem<EODirtyDustItem> rgtrDirtyDust(String name, BooleanSupplier materialSet, BooleanSupplier enabled) {
        return EO_ITEMS.register(DIRTY + name + DUST, () -> new EODirtyDustItem(new Item.Properties(), materialSet, enabled));
    }

    public static DeferredItem<EOClumpItem> rgtrClumps(String name, BooleanSupplier materialSet, BooleanSupplier enabled) {
        return EO_ITEMS.register(name, () -> new EOClumpItem(new Item.Properties(), materialSet, enabled));
    }

    public static DeferredItem<EOShardItem> rgtrMetalShards(String name, BooleanSupplier materialSet, BooleanSupplier enabled) {
        return EO_ITEMS.register(name, () -> new EOShardItem(new Item.Properties(), materialSet, enabled));
    }

    public static DeferredItem<EOCrystalItem> rgrtCrystals(String name, BooleanSupplier materialSet, BooleanSupplier enabled) {
        return EO_ITEMS.register(name, () -> new EOCrystalItem(new Item.Properties(), materialSet, enabled));
    }

    public static DeferredItem<EOEnrichedItems> rgtrEnriched(String name, BooleanSupplier materialSet, BooleanSupplier enabled) {
        return EO_ITEMS.register(name, () -> new EOEnrichedItems(new Item.Properties(), materialSet, enabled));
    }

    public static DeferredItem<EOrGemItem> rgtrOreGems(String name, BooleanSupplier materialSet, BooleanSupplier enabled) {
        return EO_ITEMS.register(name, () -> new EOrGemItem(new Item.Properties(), materialSet, enabled));
    }

    public static DeferredItem<EOSmallClumpItem> rgtrSmallClumps(String name, BooleanSupplier materialSet, BooleanSupplier enabled) {
        return EO_ITEMS.register(name, () -> new EOSmallClumpItem(new Item.Properties(), materialSet, enabled));
    }
}
