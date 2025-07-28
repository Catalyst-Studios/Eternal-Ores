package net.radzratz.eternalores.datagen.tags.util.block;

import net.minecraft.core.HolderLookup;
import net.radzratz.eternalores.datagen.tags.EOBlockTagProvider;

/**
 * Interface for modular Block Tag entry classes.
 * <p>
 * Classes implementing this interface define specific block tag entries (e.g., ores, storage_blocks, ores_in_ground),
 * and are invoked by the main {@link EOBlockTagProvider} to register their tags.
 * <p>
 * This modular approach promotes cleaner code organization and avoids bloating the main provider class.
 */
public interface ITagBlockEntryProvider
{
    /**
     * Called by {@link EOBlockTagProvider} to register all tags defined in this entry.
     *
     * @param provider The main block tag provider
     * @param lookup   The registry lookup context
     */
    void addTags(EOBlockTagProvider provider, HolderLookup.Provider lookup);
}
