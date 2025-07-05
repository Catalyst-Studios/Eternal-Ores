package net.radzratz.eternalores.util.compat.mekanism.recipe_types.enums;

import mekanism.api.chemical.Chemical;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.util.compat.mekanism.recipe_types.interfaces.IEOMekFluidChemType;

public enum EOCrystallizationType implements IEOMekFluidChemType
{
    CLEAN_SLURRY(200, 1, "slurry_clean_to_crystal");

    private final int inputSlurry;
    private final int outputCrystal;
    private final String suffix;

    EOCrystallizationType(int inputSlurry,
                          int outputCrystal,
                          String suffix)
    {
        this.inputSlurry = inputSlurry;
        this.outputCrystal = outputCrystal;
        this.suffix = suffix;
    }

    /// Fluid EOPulverizerDustConversionType is ignored in this recipe type
    ///
    /// Returns 0 as null without causing nor throwing an exception
    @Override
    public int fluidAmount()
    {
        return 0;
    }

    @Override
    public String suffix()
    {
        return suffix;
    }

    @Override
    public String folder()
    {
        return "crystal";
    }

    @Override
    public int inputSlurry()
    {
        return inputSlurry;
    }

    /// This was created only for EOWasherType class, but as it goes from Chemical to Item...
    @Override
    public int outputSlurryClean()
    {
        return outputCrystal;
    }

    public record Inputs(Chemical inputCleanSlurry, Item crystalOutput)
    {}
}
