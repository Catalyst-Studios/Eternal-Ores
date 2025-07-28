package net.radzratz.eternalores.util.compat.mekanism.recipe_types;

import mekanism.api.chemical.Chemical;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.neoforge.registries.DeferredItem;
import net.radzratz.eternalores.item.types.EODustItem;
import net.radzratz.eternalores.item.types.EOGemItem;
import net.radzratz.eternalores.util.compat.util.types.EOClumpItem;
import net.radzratz.eternalores.util.compat.mekanism.recipe_types.enums.*;
import net.radzratz.eternalores.util.compat.util.types.EOCrystalItem;
import net.radzratz.eternalores.util.compat.util.types.EODirtyDustItem;
import net.radzratz.eternalores.util.compat.util.types.EOShardItem;

import java.util.Map;

public class EOMekRecipes
{
    public static void registerCrystallizationRecipes(Map<String, EOCrystallizationType.Inputs> map, String name,
                                                      Chemical inputCleanSlurry, DeferredItem<EOCrystalItem> crystalOutput)
    {
        map.put(name, new EOCrystallizationType.Inputs(
                inputCleanSlurry, crystalOutput.get()
        ));
    }

    public static void registerDissolutionTrueRecipes(Map<String, EODissolutionType.Inputs> map, String name, TagKey<Item> rawOre,
                                                      TagKey<Item> rawBlock, TagKey<Item> oreBlock, Chemical dirtySlurrySupplier)
    {
        map.put(name, new EODissolutionType.Inputs(
                rawOre,
                rawBlock,
                oreBlock,
                dirtySlurrySupplier
        ));
    }

    public static void registerDissolutionRecipes(Map<String, EODissolutionType.InputsDiff> map, String name, TagKey<Item> rawOre,
                                                  TagKey<Item> rawBlock, Chemical dirtySlurrySupplier)
    {
        map.put(name, new EODissolutionType.InputsDiff(
                rawOre,
                rawBlock,
                dirtySlurrySupplier
        ));
    }

    public static void registerEnrichingDustRecipes(Map<String, EOEnrichingType.InputsDiff> map, String name, TagKey<Item> rawOre,
                                                    TagKey<Item> dirtyDustItem, TagKey<Item> rawBlock, DeferredItem<EODustItem> dirtyDustSupplier)
    {
        map.put(name, new EOEnrichingType.InputsDiff(
                rawOre,
                dirtyDustItem,
                rawBlock,
                dirtyDustSupplier.get()
        ));
    }

    public static void registerEnrichingDustTrueRecipes(Map<String, EOEnrichingType.Inputs> map, String name, TagKey<Item> rawOre,
                                                        TagKey<Item> dirtyDustItem, TagKey<Item> rawBlock, TagKey<Item> oreBlock, DeferredItem<EODustItem> dustSupplier)
    {
        map.put(name, new EOEnrichingType.Inputs(
                rawOre,
                dirtyDustItem,
                rawBlock,
                oreBlock,
                dustSupplier.get()
        ));
    }

    public static void registerEnrichingGemRecipes(Map<String, EOEnrichingType.InputsGem> map, String name,
                                                   TagKey<Item> oreBlock, DeferredItem<EOGemItem> gemSupplier)
    {
        map.put(name, new EOEnrichingType.InputsGem(
                oreBlock,
                gemSupplier.get()
        ));
    }

    public static void registerDecoRecipes(Map<String, EOCrushingType.InputsDeconstruction> map, String name,
                                           TagKey<Item> plateTag, TagKey<Item> rodTag, DeferredItem<EODustItem> dustSupplier)
    {
        map.put(name, new EOCrushingType.InputsDeconstruction(
                plateTag,
                rodTag,
                dustSupplier.get()
        ));
    }

    public static void registerDirtyDustRecipes(Map<String, EOCrushingType.Inputs> map, String name,
                                                TagKey<Item> clumpTag, DeferredItem<EODirtyDustItem> dirtyDustSupplier)
    {
        map.put(name, new EOCrushingType.Inputs(
                clumpTag,
                dirtyDustSupplier.get()
        ));
    }

    public static void registerMaterialCrushingRecipes(Map<String, EOCrushingType.InputsMaterials> map, String name,
                                                       TagKey<Item> materialTag, DeferredItem<EODustItem> dustSupplier)
    {
        map.put(name, new EOCrushingType.InputsMaterials(
                materialTag,
                dustSupplier.get()
        ));
    }

    public static void registerWashingRecipes(Map<String, EOWasherType.Inputs> map, String name, Chemical dirtySlurry,
                                              TagKey<Fluid> inputWater, Chemical cleanSlurrySupplier)
    {
        map.put(name, new EOWasherType.Inputs(
                dirtySlurry,
                inputWater,
                cleanSlurrySupplier
        ));
    }

    public static void registerInjectingTrueRecipes(Map<String, EOInjectionType.Inputs> map, String name, TagKey<Item> rawOre,
                                                    TagKey<Item> crystalItem, TagKey<Item> rawBlock, TagKey<Item> oreBlock, DeferredItem<EOShardItem> shardSupplier)
    {
        map.put(name, new EOInjectionType.Inputs(
                rawOre,
                crystalItem,
                rawBlock,
                oreBlock,
                shardSupplier.get()
        ));
    }

    public static void registerInjectingRecipes(Map<String, EOInjectionType.InputsDiff> map, String name, TagKey<Item> rawOre,
                                                TagKey<Item> crystalItem, TagKey<Item> rawBlock, DeferredItem<EOShardItem> shardSupplier)
    {
        map.put(name, new EOInjectionType.InputsDiff(
                rawOre,
                crystalItem,
                rawBlock,
                shardSupplier.get()
        ));
    }

    public static void registerPurificationRecipes(Map<String, EOPurificationType.InputsDiff> map, String name, TagKey<Item> rawOre,
                                                   TagKey<Item> shardItem, TagKey<Item> rawBlock, DeferredItem<EOClumpItem> clumpSupplier)
    {
        map.put(name, new EOPurificationType.InputsDiff(
                rawOre,
                shardItem,
                rawBlock,
                clumpSupplier.get()
        ));
    }

    public static void registerPurificationTrueRecipes(Map<String, EOPurificationType.Inputs> map, String name, TagKey<Item> rawOre,
                                                       TagKey<Item> shardItem, TagKey<Item> rawBlock, TagKey<Item> oreBlock, DeferredItem<EOClumpItem> clumpSupplier)
    {
        map.put(name, new EOPurificationType.Inputs(
                rawOre,
                shardItem,
                rawBlock,
                oreBlock,
                clumpSupplier.get()
        ));
    }
}
