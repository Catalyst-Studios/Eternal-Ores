package net.radzratz.eternalores.util.compat.mekanism.recipe_types.interfaces;

import mekanism.api.chemical.Chemical;
import mekanism.common.registration.impl.DeferredChemical;

public interface MekanismChemicalRecipeType
{
        /// Different Interface for Item to Item recipe types that require chemicals
        int inputCount();
        int outputCount();
        int chemicalAmount();
        String suffix();
        String folder();
        DeferredChemical<Chemical> chemical();
        boolean isClump(); // true = purifying, false = injecting
}
