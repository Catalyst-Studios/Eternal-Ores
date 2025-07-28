package net.radzratz.eternalores.util.compat.oritech.recipe_types.enums;

import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.interfaces.IEOritechRecipeType;

public enum EOLaserCreationType implements IEOritechRecipeType
{
    BLOCK_TO_MATERIAL(1, 1, "raw_ore_block_to_block");

    private final int inputCount;
    private final int  outputCount;
    private final String suffix;

    EOLaserCreationType(int inputCount, int outputCount, String suffix)
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
        return "blocks";
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
        return false;
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
        return true;
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

    public record InputsOreBlock(TagKey<Block> oreBlockTag, Block outputBlock) {}
}
