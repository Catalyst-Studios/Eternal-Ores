package net.radzratz.eternalores.util.compat.oritech.recipe_types.enums;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.interfaces.pulverizer.IPulverizerConversion;

public enum EOPulverizerOreFormToDustType implements IPulverizerConversion
{
    GEM(1, 1, "gem_to_dust"),
    INGOT(1, 1, "ingot_to_dust"),
    BLOCK(1, 9, "block_to_dust");

    private final int inputCount;
    private final int  outputCount;
    private final String suffix;

    EOPulverizerOreFormToDustType(int inputCount,
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

    public record InputsIngot(TagKey<Item> ingotTag, Item outputDust) {}
    public record InputsGem(TagKey<Item> gemTag, Item outputDust) {}
    public record InputsBlock(TagKey<Item> blockTag, Item outputDust) {}
}
