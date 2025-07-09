package net.radzratz.eternalores.util.compat.oritech.recipe_types.enums;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.interfaces.pulverizer.IPulverizerConversion;

public enum EOPulverizerRawOreByproductType implements IPulverizerConversion
{
    RAW_ORE(1, 1, 3,"raw_to_dust_byproduct");

    private final int inputCount;
    private final int  outputCount;
    private final int  outputByproduct;
    private final String suffix;

    EOPulverizerRawOreByproductType(int inputCount, int outputCount, int outputByproduct, String suffix)
    {
        this.inputCount = inputCount;
        this.outputCount = outputCount;
        this.outputByproduct = outputByproduct;
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

    public int outputsByproduct()
    {
        return outputByproduct;
    }

    public record InputsByproduct(TagKey<Item> rawOre, Item outputDust, Item outputByproduct) {}
}
