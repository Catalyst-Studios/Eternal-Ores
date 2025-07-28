package net.radzratz.eternalores.util.compat.oritech.recipe_types.enums.pulverizer;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.interfaces.IEOritechRecipeType;

public enum EOPulverizerRawOreByproductType implements IEOritechRecipeType
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

    @Override
    public boolean isCentrifuge() {
        return false;
    }

    @Override
    public boolean isCentrifugeFluid() {
        return false;
    }

    @Override
    public boolean isPulverizer() {
        return false;
    }

    @Override
    public boolean isPulverizerByproduct() {
        return true;
    }

    @Override
    public boolean isFoundryGem() {
        return false;
    }

    @Override
    public boolean isFoundryAlloy() {
        return false;
    }

    @Override
    public boolean isLaser() {
        return false;
    }

    @Override
    public boolean isAtomicForge() {
        return false;
    }

    @Override
    public boolean isRefinery() {
        return false;
    }

    @Override
    public boolean isFragment() {
        return false;
    }

    @Override
    public boolean isParticleAccel() {
        return false;
    }

    @Override
    public boolean isAssembler() {
        return false;
    }

    public record InputsByproduct(TagKey<Item> rawOre, Item outputDust, Item outputByproduct) {}
}
