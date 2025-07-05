package net.radzratz.eternalores.util.compat.oritech.recipe_types.enums;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.interfaces.pulverizer.IPulverizerConversion;

public enum EOPulverizerOreBlockToMaterialType implements IPulverizerConversion
{
    ORE_BLOCK(1, 2, "ore_block_to_raw");

    private final int inputCount;
    private final int  outputCount;
    private final String suffix;

    EOPulverizerOreBlockToMaterialType(int inputCount,
                                  int outputCount,
                                  String suffix)
    {
        this.inputCount = inputCount;
        this.outputCount = outputCount;
        this.suffix = suffix;
    }

    @Override
    public String suffix()
    {
        return suffix;
    }

    @Override
    public String folder()
    {
        return "block";
    }

    @Override
    public int inputs()
    {
        return inputCount;
    }

    @Override
    public int outputs()
    {
        return outputCount;
    }

    public record InputsOreBlock(TagKey<Item> oreBlockTag, Item outputRaw) {}
}
