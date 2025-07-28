package net.radzratz.eternalores.util.compat.oritech.recipe_types.pulverizer;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.radzratz.eternalores.item.types.EODustItem;
import net.radzratz.eternalores.item.types.EOGemItem;
import net.radzratz.eternalores.item.types.EORawMaterialItem;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.enums.pulverizer.EOPulverizerDustConversionType;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.enums.pulverizer.EOPulverizerRawOreByproductType;
import net.radzratz.eternalores.util.compat.util.types.EOSmallDustItem;

import java.util.Map;

public class EOPulverizerInputRegistry
{
    /// Deconstruction
    public static void registerDeconstructionRecipes(Map<String, EOPulverizerDustConversionType.InputsDeco> map, String name,
                                                     TagKey<Item> plateTag, TagKey<Item> rodTag, DeferredItem<EODustItem> output)
    {
        map.put(name, new EOPulverizerDustConversionType.InputsDeco(plateTag, rodTag, output.get()));
    }

    /// Ingots
    public static void registerIngotToDustRecipes(Map<String, EOPulverizerDustConversionType.InputsIngot> map, String name,
                                                  TagKey<Item> ingotTag, DeferredItem<EODustItem> output)
    {
        map.put(name, new EOPulverizerDustConversionType.InputsIngot(ingotTag, output.get()));
    }

    /// Gems
    public static void registerGemToDustRecipes(Map<String, EOPulverizerDustConversionType.InputsGem> map, String name,
                                                TagKey<Item> gemTag, DeferredItem<EODustItem> output)
    {
        map.put(name, new EOPulverizerDustConversionType.InputsGem(gemTag, output.get()));
    }

    /// Blocks
    public static void registerBlocksToDustRecipes(Map<String, EOPulverizerDustConversionType.InputsBlock> map, String name,
                                                   TagKey<Item> blockTag, DeferredItem<EODustItem> output)
    {
        map.put(name, new EOPulverizerDustConversionType.InputsBlock(blockTag, output.get()));
    }

    /// Ore Blocks
    public static void registerOreBlocksToRawRecipes(Map<String, EOPulverizerDustConversionType.InputsOreBlock> map, String name,
                                                     TagKey<Item> oreBlockTag, DeferredItem<EORawMaterialItem> output)
    {
        map.put(name, new EOPulverizerDustConversionType.InputsOreBlock(oreBlockTag, output.get()));
    }
    public static void registerOreBlocksToRawRecipesVar1(Map<String, EOPulverizerDustConversionType.InputsOreBlock> map, String name,
                                                     TagKey<Item> oreBlockTag, DeferredItem<EOGemItem> output)
    {
        map.put(name, new EOPulverizerDustConversionType.InputsOreBlock(oreBlockTag, output.get()));
    }

    /// Dust Byproduct
    public static void registerRawByproductRecipes(Map<String, EOPulverizerRawOreByproductType.InputsByproduct> map, String name,
                                                   TagKey<Item> rawOreTag, DeferredItem<EODustItem> outputDust, DeferredItem<EOSmallDustItem> outputByproduct)
    {
        map.put(name, new EOPulverizerRawOreByproductType.InputsByproduct(rawOreTag, outputDust.get(), outputByproduct.get()));
    }
}
