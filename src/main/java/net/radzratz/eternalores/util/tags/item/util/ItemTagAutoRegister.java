package net.radzratz.eternalores.util.tags.item.util;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.radzratz.eternalores.datagen.tags.EOItemTagProvider;

public class ItemTagAutoRegister {
    private final EOItemTagProvider provider;

    public ItemTagAutoRegister(EOItemTagProvider provider) {
        this.provider = provider;
    }

    public void register(DeferredHolder<?, ?> entry, TagKey<Item> mainTag, boolean individual, boolean optional) {
        ItemTagBuilder builder = new ItemTagBuilder(entry)
                .addTo(mainTag)
                .setOptional(optional);

        if (individual) builder.addIndividual(mainTag.location().getPath());

        builder.apply(provider);
    }

    public void registerPrefixedOnly(DeferredHolder<?, ?> entry, TagKey<Item> individualPrefixTag, boolean optional) {
        ItemTagBuilder builder = new ItemTagBuilder(entry)
                .setOptional(optional)
                .addIndividualPrefixed(individualPrefixTag);

        builder.apply(provider);
    }

    public void registerMC(DeferredHolder<?, ?> entry, TagKey<Item> mainTag, boolean individual, boolean optional) {
        ItemTagBuilder builder = new ItemTagBuilder(entry).addTo(mainTag).setOptional(optional);

        if (individual) builder
                .addIndividual(mainTag.location().getPath());

        builder.applyMC(provider);
    }

    public void registerGeOre(DeferredHolder<?, ?> entry, TagKey<Item> mainTag, boolean individual, boolean optional) {
        ItemTagBuilder builder = new ItemTagBuilder(entry).addTo(mainTag).setOptional(optional);

        if (individual) builder
                .addIndividual(mainTag.location().getPath());

        builder.applyGeOre(provider);
    }

    public void registerCreate(DeferredHolder<?, ?> entry, TagKey<Item> mainTag, boolean individual, boolean optional) {
        ItemTagBuilder builder = new ItemTagBuilder(entry).addTo(mainTag).setOptional(optional);

        if (individual) builder
                .addIndividual(mainTag.location().getPath());

        builder.applyCTE(provider);
    }

    public void registerMek(DeferredHolder<?, ?> entry, TagKey<Item> mainTag, boolean individual, boolean optional) {
        ItemTagBuilder builder = new ItemTagBuilder(entry).addTo(mainTag).setOptional(optional);

        if (individual) builder
                .addIndividual(mainTag.location().getPath());

        builder.applyMek(provider);
    }

    @SafeVarargs
    public final <E extends Enum<E>> void register(DeferredHolder<?, ?> entry, TagKey<Item> mainTag, E type, TagKey<Item>... enumTags) {
        ItemTagBuilder builder = new ItemTagBuilder(entry)
                .addTo(mainTag)
                .addToEnum(type, enumTags)
                .addIndividual(mainTag.location().getPath());

        builder.apply(provider);
    }
}
