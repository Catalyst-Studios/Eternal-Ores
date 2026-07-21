package net.radzratz.eternalores.util.tags.item.util;

import net.minecraft.core.HolderLookup;
import net.radzratz.eternalores.datagen.tags.EOItemTagProvider;

public interface ITagItemEntryProvider {
    void addTags(EOItemTagProvider provider, HolderLookup.Provider lookup);
}
