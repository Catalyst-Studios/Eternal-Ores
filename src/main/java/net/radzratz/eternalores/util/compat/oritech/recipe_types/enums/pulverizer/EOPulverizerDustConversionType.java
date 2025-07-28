package net.radzratz.eternalores.util.compat.oritech.recipe_types.enums.pulverizer;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.interfaces.IEOritechRecipeType;

public enum EOPulverizerDustConversionType implements IEOritechRecipeType
{
    ROD(1, 2, "rod_to_dust"),
    PLATE(1, 2, "plate_to_dust"),

    ORE_BLOCK(1, 2, "ore_block_to_raw"),

    GEM(1, 1, "gem_to_dust"),
    INGOT(1, 1, "ingot_to_dust"),
    BLOCK(1, 9, "block_to_dust");


    private final int inputCount;
    private final int  outputCount;
    private final String suffix;

    EOPulverizerDustConversionType(int inputCount, int outputCount, String suffix)
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
        return true;
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

    public record InputsDeco(TagKey<Item> plate, TagKey<Item> rod, Item outputDust) {}

    public record InputsIngot(TagKey<Item> ingotTag, Item outputDust) {}
    public record InputsGem(TagKey<Item> gemTag, Item outputDust) {}
    public record InputsBlock(TagKey<Item> blockTag, Item outputDust) {}

    public record InputsOreBlock(TagKey<Item> oreBlockTag, Item outputRaw) {}
}
