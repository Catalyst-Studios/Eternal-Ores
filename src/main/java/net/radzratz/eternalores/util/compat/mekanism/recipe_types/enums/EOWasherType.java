package net.radzratz.eternalores.util.compat.mekanism.recipe_types.enums;

import mekanism.api.chemical.Chemical;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.material.Fluid;
import net.radzratz.eternalores.util.compat.mekanism.recipe_types.interfaces.IEOMekFluidChemType;

public enum EOWasherType implements IEOMekFluidChemType
{
    DIRTY_SLURRY(5, 1, 1,"slurry_dirty_to_clean");

    private final int fluidAmount;
    private final int inputSlurry;
    private final int outputSlurryClean;
    private final String suffix;

    EOWasherType(int fluidAmount,
                 int inputSlurry,
                 int outputSlurryClean,
                 String suffix)
    {
        this.fluidAmount = fluidAmount;
        this.inputSlurry = inputSlurry;
        this.outputSlurryClean = outputSlurryClean;
        this.suffix = suffix;
    }

    @Override
    public int fluidAmount()
    {
        return fluidAmount;
    }

    @Override
    public String suffix()
    {
        return suffix;
    }

    @Override
    public String folder()
    {
        return "clean_slurry";
    }

    @Override
    public int inputSlurry()
    {
        return inputSlurry;
    }

    @Override
    public int outputSlurryClean()
    {
        return outputSlurryClean;
    }

    public record Inputs(Chemical inputDirtySlurry,
                         TagKey<Fluid> inputWater,
                         Chemical outputCleanSlurry)
    {}
}
