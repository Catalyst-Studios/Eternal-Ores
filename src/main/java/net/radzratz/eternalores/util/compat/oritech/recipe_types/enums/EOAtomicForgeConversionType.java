package net.radzratz.eternalores.util.compat.oritech.recipe_types.enums;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.interfaces.IEOritechRecipeType;

public enum EOAtomicForgeConversionType implements IEOritechRecipeType
{
    ORE_GEM_TO_DUST(1, 2, 2,"gem_to_dust_engraving");

    private final int inputCount;
    private final int inputFluxite;
    private final int  outputCount;
    private final String suffix;

    EOAtomicForgeConversionType(int inputCount, int inputFluxite, int outputCount, String suffix)
    {
        this.inputCount = inputCount;
        this.inputFluxite = inputFluxite;
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
        return "ore_gem";
    }

    @Override
    public int inputs()
    {
        return inputCount;
    }

    public int inputFluxite()
    {
        return inputFluxite;
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
        return false;
    }

    @Override
    public boolean isLaser()
    {
        return false;
    }

    @Override
    public boolean isAtomicForge()
    {
        return true;
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

    public record InputsOreGem(TagKey<Item> oreGemTag, TagKey<Item> inputFluxite, Item outputItem) {}
}
