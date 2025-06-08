package net.radzratz.eternalores.util.compat.mekanism.recipe_types.enums;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.util.compat.mekanism.recipe_types.interfaces.MekanismItemRecipeType;

public enum EnrichingRecipeType implements MekanismItemRecipeType
{
    RAW_ORE(3, 4, "raw_ore_to_dust"),
    DIRTY_DUST(1, 1, "dirty_dust_to_dust"),
    RAW_BLOCK(1, 12, "raw_block_to_dust"),
    ORE_BLOCK(1, 2, "ore_block_to_dust"),
    GEM_ORE_BLOCK(1, 2, "ore_block_to_gem");

    private final int inputCount, outputCount;
    private final String suffix;

    EnrichingRecipeType(int inputCount,
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
        return false;
    }

    @Override
    public boolean isEnriching()
    {
        return true;
    }

    public record Inputs(TagKey<Item> rawOre,
                         TagKey<Item> dirtyDustItem,
                         TagKey<Item> rawBlock,
                         TagKey<Item> oreBlock,
                         Item outputDust)
    {}
    public record InputsDiff(TagKey<Item> rawOre,
                         TagKey<Item> dirtyDustItem,
                         TagKey<Item> rawBlock,
                         Item outputDust)
    {}
    public record InputsGem(TagKey<Item> oreBlock,
                             Item outputGem)
    {}
}
