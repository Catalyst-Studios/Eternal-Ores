package net.radzratz.eternalores.util.compat.oritech.recipe_types.enums.foundry;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.interfaces.IEOritechRecipeType;

public enum EOFoundryCreationType implements IEOritechRecipeType
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
    public int outputs()
    {
        return outputCount;
    }

    @Override
    public boolean isCentrifuge()
    {
        return false;
    }

    @Override
    public boolean isCentrifugeFluid()
    {
        return false;
    }

    @Override
    public boolean isPulverizer()
    {
        return false;
    }

    @Override
    public boolean isPulverizerByproduct()
    {
        return false;
    }

    @Override
    public boolean isFoundryGem()
    {
        return false;
    }

    @Override
    public boolean isFoundryAlloy()
    {
        return true;
    }

    @Override
    public boolean isLaser()
    {
        return false;
    }

    @Override
    public boolean isAtomicForge()
    {
        return false;
    }

    @Override
    public boolean isRefinery()
    {
        return false;
    }

    @Override
    public boolean isFragment()
    {
        return false;
    }

    @Override
    public boolean isParticleAccel()
    {
        return false;
    }

    @Override
    public boolean isAssembler()
    {
        return false;
    }

    public record InputsAlloyDust(TagKey<Item> itemTagOne, TagKey<Item> itemTagTwo, Item outputIngot) {}
}
