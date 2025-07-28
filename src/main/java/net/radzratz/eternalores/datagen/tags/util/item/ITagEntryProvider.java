package net.radzratz.eternalores.datagen.tags.util.item;

import net.minecraft.core.HolderLookup;
import net.minecraft.resources.ResourceLocation;
import net.radzratz.eternalores.datagen.tags.EOItemTagProvider;

/**
 * Interface for modular Item Tag entry classes.
 * <p>
 * Classes implementing this interface define specific item tag entries (e.g., hammers, plates, rods),
 * and are invoked by the main {@link EOItemTagProvider} to register their tags.
 * <p>
 * This modular approach promotes cleaner code organization and avoids bloating the main provider class.
 */
public interface ITagEntryProvider
{
    /**
     * Called by {@link EOItemTagProvider} to register all tags defined in this entry.
     *
     * @param provider The main item tag provider
     * @param lookup   The registry lookup context
     */
    void addTags(EOItemTagProvider provider, HolderLookup.Provider lookup);
}
