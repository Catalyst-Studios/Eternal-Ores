package net.radzratz.eternalores.util.compat.oritech.recipe_types.pulverizer;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.enums.EOPulverizerDustConversionType;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.enums.EOPulverizerOreBlockToMaterialType;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.enums.EOPulverizerOreFormToDustType;

import java.util.Map;
import java.util.function.Supplier;

public class EOPulverizerInputRegistry
{
    /// Deconstruction
    public static void registerDeconstructionRecipes(Map<String, EOPulverizerDustConversionType.InputsDeco> map, String name,
                                                     TagKey<Item> plateTag, TagKey<Item> rodTag, Supplier<Item> output)
    {
        map.put(name, new EOPulverizerDustConversionType.InputsDeco(plateTag, rodTag, output.get()));
    }

    /// Ingots
    public static void registerIngotToDustRecipes(Map<String, EOPulverizerOreFormToDustType.InputsIngot> map, String name,
                                                  TagKey<Item> ingotTag, Supplier<Item> output)
    {
        map.put(name, new EOPulverizerOreFormToDustType.InputsIngot(ingotTag, output.get()));
    }

    /// Gems
    public static void registerGemToDustRecipes(Map<String, EOPulverizerOreFormToDustType.InputsGem> map, String name,
                                                TagKey<Item> gemTag, Supplier<Item> output)
    {
        map.put(name, new EOPulverizerOreFormToDustType.InputsGem(gemTag, output.get()));
    }

    /// Blocks
    public static void registerBlocksToDustRecipes(Map<String, EOPulverizerOreFormToDustType.InputsBlock> map, String name,
                                                   TagKey<Item> blockTag, Supplier<Item> output)
    {
        map.put(name, new EOPulverizerOreFormToDustType.InputsBlock(blockTag, output.get()));
    }

    /// Ore Blocks
    public static void registerOreBlocksToRawRecipes(Map<String, EOPulverizerOreBlockToMaterialType.InputsOreBlock> map, String name,
                                                   TagKey<Item> oreBlockTag, Supplier<Item> output)
    {
        map.put(name, new EOPulverizerOreBlockToMaterialType.InputsOreBlock(oreBlockTag, output.get()));
    }
}
