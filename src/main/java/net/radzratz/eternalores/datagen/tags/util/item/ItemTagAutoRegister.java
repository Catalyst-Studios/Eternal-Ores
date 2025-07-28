package net.radzratz.eternalores.datagen.tags.util.item;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.radzratz.eternalores.datagen.tags.EOItemTagProvider;
import net.radzratz.eternalores.datagen.tags.items.EOItemTagEntries;

/**
 * Handles automatic registration of item tags based on item type and enum metadata.
 * <p>
 * Provides simplified `register` methods to reduce repeated logic inside {@link EOItemTagEntries}.
 */
public class ItemTagAutoRegister
{
    private final EOItemTagProvider provider;

    public ItemTagAutoRegister(EOItemTagProvider provider)
    {
        this.provider = provider;
    }

    /**
     * Registers a basic item with a main tag and optional individual tag.
     *
     * @param entry      The registry entry (DeferredHolder)
     * @param mainTag    The base tag to add the item to
     * @param individual If true, also adds an individual tag based on the mainTag path
     */
    public void register(DeferredHolder<?, ?> entry, TagKey<Item> mainTag, boolean individual)
    {
        ItemTagBuilder builder = new ItemTagBuilder(entry).addTo(mainTag);

        if (individual) builder.addIndividual(mainTag.location().getPath());

        builder.apply(provider);
    }

    /**
     * Registers an item with a main tag, enum-specific tag, and individual tag.
     *
     * @param entry     The registry entry
     * @param mainTag   The base tag
     * @param type      The enum type of the item
     * @param enumTags  The array of enum-specific tags matching the enum's ordinal
     * @param <E>       Enum type
     */
    @SafeVarargs
    public final <E extends Enum<E>> void register(DeferredHolder<?, ?> entry, TagKey<Item> mainTag, E type, TagKey<Item>... enumTags)
    {
        ItemTagBuilder builder = new ItemTagBuilder(entry)
                .addTo(mainTag)
                .addToEnum(type, enumTags)
                .addIndividual(mainTag.location().getPath());

        builder.apply(provider);
    }
}
