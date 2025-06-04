package net.radzratz.eternalores.util.compat.mekanism.recipe_types.interfaces;

public interface MekanismItemRecipeType
{
    /// Different Interface for Item to Item recipe types that don't use chemicals
    int inputCount();
    int outputCount();
    String suffix();
    String folder();
    boolean isCrushing();
    boolean isEnriching();
}
