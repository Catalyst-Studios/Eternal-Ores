package net.radzratz.eternalores.util.compat.oritech.recipe_types.enums;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.interfaces.foundry.IFoundryCreation;

public enum EOFoundryCreationType implements IFoundryCreation
{
    ALLOYS_INGOTS(2, 1, "alloy_creation");

    private final int inputCount;
    private final int  outputCount;
    private final String suffix;

    EOFoundryCreationType(int inputCount, int outputCount, String suffix)
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
        return "alloys";
    }

    @Override
    public int inputs()
    {
        return inputCount;
    }

    @Override
    public int output()
    {
        return outputCount;
    }

    public record InputsAlloyDust(TagKey<Item> itemTagOne, TagKey<Item> itemTagTwo, Item outputIngot) {}
}
