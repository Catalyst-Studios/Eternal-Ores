package net.radzratz.eternalores.util.tags.fluid.util;

import net.minecraft.core.HolderLookup;
import net.radzratz.eternalores.datagen.tags.EOFluidTagProvider;

public interface ITagFluidProvider {
    void addTags(EOFluidTagProvider provider, HolderLookup.Provider lookup);
}
