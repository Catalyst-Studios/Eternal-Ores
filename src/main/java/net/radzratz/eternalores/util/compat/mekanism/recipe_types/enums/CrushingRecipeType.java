package net.radzratz.eternalores.util.compat.mekanism.recipe_types.enums;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.util.compat.mekanism.recipe_types.interfaces.MekanismItemRecipeType;

public enum CrushingRecipeType implements MekanismItemRecipeType
{
    CLUMP(1, 1, "clump_to_dirty_dust"),
    PLATE(1, 2, "plate_to_dust"),
    ROD(1, 2, "rod_to_dust");

    private final int inputCount, outputCount;
    private final String suffix;

    CrushingRecipeType(int inputCount,
                       int outputCount,
                       String suffix)
    {
        this.inputCount = inputCount;
        this.outputCount = outputCount;
        this.suffix = suffix;
    }

    @Override
    public int inputCount()
    {
        return inputCount;
    }

    @Override
    public int outputCount()
    {
        return outputCount;
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
    public boolean isCrushing()
    {
        return true;
    }

    @Override
    public boolean isEnriching()
    {
        return false;
    }

    public record Inputs(Item clumpItem, Item outputDirtyDust)
    {}
    public record InputsDeconstruction(TagKey<Item> plate,
                                       TagKey<Item> rod,
                                       Item outputDust)
    {}
}
