package net.radzratz.eternalores.util.compat.oritech.recipe_types.laser;

import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.radzratz.eternalores.block.types.EOBlock;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.enums.EOLaserCreationType;

import java.util.Map;
import java.util.function.Supplier;

public class EOLaserInputRegistry
{
    public static void registerRawBlockToBlockEngravingRecipes(Map<String, EOLaserCreationType.InputsOreBlock> map, String name,
                                                               TagKey<Block> oreBlockTag, DeferredBlock<EOBlock> output)
    {
        map.put(name, new EOLaserCreationType.InputsOreBlock(oreBlockTag, output.get()));
    }
    public static void registerRawBlockToBlockEngravingRecipesVar(Map<String, EOLaserCreationType.InputsOreBlock> map, String name,
                                                               TagKey<Block> oreBlockTag, Supplier<Block> output)
    {
        map.put(name, new EOLaserCreationType.InputsOreBlock(oreBlockTag, output.get()));
    }
}
