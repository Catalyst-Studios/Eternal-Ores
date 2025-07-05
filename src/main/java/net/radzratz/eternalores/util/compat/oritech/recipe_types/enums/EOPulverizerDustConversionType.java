package net.radzratz.eternalores.util.compat.oritech.recipe_types.enums;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.interfaces.pulverizer.IPulverizerConversion;

public enum EOPulverizerDustConversionType implements IPulverizerConversion
{
    ROD(1, 2, "rod_to_dust"),
    PLATE(1, 2, "plate_to_dust");

    private final int inputCount;
    private final int  outputCount;
    private final String suffix;

    EOPulverizerDustConversionType(int inputCount,
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
        return "dust";
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

    public record InputsDeco(TagKey<Item> plate,
                                       TagKey<Item> rod,
                                       Item outputDust)
    {}
}
