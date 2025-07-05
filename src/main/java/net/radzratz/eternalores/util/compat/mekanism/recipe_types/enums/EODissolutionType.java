package net.radzratz.eternalores.util.compat.mekanism.recipe_types.enums;

import mekanism.api.chemical.Chemical;
import mekanism.common.registration.impl.DeferredChemical;
import mekanism.common.registries.MekanismChemicals;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.util.compat.mekanism.recipe_types.interfaces.IEOMekChemType;

public enum EODissolutionType implements IEOMekChemType
{
    RAW_ORE(3, 1, 2000, "raw_ore_to_dirty_slurry"),
    RAW_BLOCK(1, 2, 6000, "raw_block_to_dirty_slurry"),
    ORE_BLOCK(1, 1, 1000, "ore_block_to_dirty_slurry");

    private final int inputCount, outputCount, slfAmount;
    private final String suffix;

    EODissolutionType(int inputCount,
                      int slfAmount,
                      int outputCount,
                      String suffix)
    {
        this.inputCount = inputCount;
        this.slfAmount = slfAmount;
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
    public int chemicalAmount()
    {
        return slfAmount;
    }

    @Override
    public String suffix()
    {
        return suffix;
    }

    @Override
    public String folder()
    {
        return "dirty_slurry";
    }

    @Override
    public DeferredChemical<Chemical> chemical()
    {
        return MekanismChemicals.SULFURIC_ACID;
    }

    @Override
    public boolean isClump()
    {
        return false;
    }

    public record Inputs(TagKey<Item> rawOre,
                         TagKey<Item> rawBlock,
                         TagKey<Item> oreBlock,
                         Chemical outputDirtySlurry)
    {}

    public record InputsDiff(TagKey<Item> rawOre,
                             TagKey<Item> rawBlock,
                             Chemical outputDirtySlurry)
    {}
}
