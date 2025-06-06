package net.radzratz.eternalores.util.compat.mekanism.recipe_types.enums;

import mekanism.api.chemical.Chemical;
import mekanism.common.registration.impl.DeferredChemical;
import mekanism.common.registries.MekanismChemicals;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.util.compat.mekanism.recipe_types.interfaces.MekanismChemicalRecipeType;

public enum InjectorRecipeType implements MekanismChemicalRecipeType
{
    RAW_ORE(3, 8, 1, "raw_ore_to_shard"),
    SHARD(1, 1, 1, "crystal_to_shard"),
    RAW_BLOCK(1, 24, 2, "raw_block_to_shard"),
    ORE_BLOCK(1, 4, 1, "ore_block_to_shard");

    private final int inputCount, outputCount, hclAmount;
    private final String suffix;

    InjectorRecipeType(int inputCount,
                       int outputCount,
                       int hclAmount,
                       String suffix)
    {
        this.inputCount = inputCount;
        this.outputCount = outputCount;
        this.hclAmount = hclAmount;
        this.suffix = suffix;
    }

    public int inputCount()
    {
        return inputCount;
    }

    public int outputCount()
    {
        return outputCount;
    }

    public int chemicalAmount()
    {
        return hclAmount;
    }

    public String suffix()
    {
        return suffix;
    }

    public String folder()
    {
        return "shard";
    }

    public DeferredChemical<Chemical> chemical()
    {
        return MekanismChemicals.HYDROGEN_CHLORIDE;
    }

    public boolean isClump()
    {
        return false;
    }

    public record Inputs(TagKey<Item> rawOre,
                         TagKey<Item> crystal,
                         TagKey<Item> rawBlock,
                         TagKey<Item> oreBlock,
                         Item outputShard)
    {}

    public record InputsDiff(TagKey<Item> rawOre,
                         TagKey<Item> crystal,
                         TagKey<Item> rawBlock,
                         Item outputShard)
    {}
}
