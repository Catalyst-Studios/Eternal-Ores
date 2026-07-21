package net.radzratz.eternalores.util.tags.block.util;

import net.minecraft.core.HolderLookup;
import net.radzratz.eternalores.datagen.tags.EOBlockTagProvider;

public interface ITagBlockEntryProvider {
    void addTags(EOBlockTagProvider provider, HolderLookup.Provider lookup);
}
