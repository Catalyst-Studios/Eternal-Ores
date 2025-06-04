package net.radzratz.eternalores.util.compat.mekanism.recipe_types.enums;

import mekanism.api.chemical.Chemical;
import mekanism.common.registration.impl.DeferredChemical;
import mekanism.common.registries.MekanismChemicals;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.util.compat.mekanism.recipe_types.interfaces.MekanismChemicalRecipeType;

public enum PurificationRecipeType implements MekanismChemicalRecipeType
{
    RAW_ORE(1, 2, 1, "raw_ore_to_clump"),
    SHARD(1, 1, 1, "shard_to_clump"),
    RAW_BLOCK(1, 18, 2, "raw_block_to_clump"),
    ORE_BLOCK(1, 3, 1, "ore_block_to_clump");

    private final int inputCount, outputCount, oxygenAmount;
    private final String suffix;

    PurificationRecipeType(int inputCount,
                           int outputCount,
                           int oxygenAmount,
                           String suffix)
    {
        this.inputCount = inputCount;
        this.outputCount = outputCount;
        this.oxygenAmount = oxygenAmount;
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
        return oxygenAmount;
    }

    public String suffix()
    {
        return suffix;
    }

    public String folder()
    {
        return "clump";
    }

    public DeferredChemical<Chemical> chemical()
    {
        return MekanismChemicals.OXYGEN;
    }

    public boolean isClump()
    {
        return true;
    }

    public record Inputs(TagKey<Item> rawOre,
                         TagKey<Item> shard,
                         TagKey<Item> rawBlock,
                         TagKey<Item> oreBlock,
                         Item outputClump)
    {}
}
