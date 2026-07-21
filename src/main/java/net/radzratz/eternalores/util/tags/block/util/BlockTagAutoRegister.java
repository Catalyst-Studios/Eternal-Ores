package net.radzratz.eternalores.util.tags.block.util;

import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.radzratz.eternalores.datagen.tags.EOBlockTagProvider;

public class BlockTagAutoRegister {
    private final EOBlockTagProvider provider;

    public BlockTagAutoRegister(EOBlockTagProvider provider) {
        this.provider = provider;
    }

    public void register(DeferredHolder<?, ?> entry, TagKey<Block> mainTag, boolean individual, boolean optional) {
        BlockTagBuilder builder = new BlockTagBuilder(entry).addTo(mainTag).setOptional(optional);

        if (individual) builder.addIndividual(mainTag.location().getPath());

        builder.apply(provider);
    }

    public void registerGeo(DeferredHolder<?, ?> entry, TagKey<Block> mainTag, boolean individual, boolean optional) {
        BlockTagBuilder builder = new BlockTagBuilder(entry).addTo(mainTag).setOptional(optional);

        if (individual) builder.addIndividual(mainTag.location().getPath());

        builder.applyGeOre(provider);
    }

    public void registerMC(DeferredHolder<?, ?> entry, TagKey<Block> mainTag, boolean individual, boolean optional) {
        BlockTagBuilder builder = new BlockTagBuilder(entry).addTo(mainTag).setOptional(optional);

        if (individual) builder.addIndividual(mainTag.location().getPath());

        builder.applyMC(provider);
    }

    public void registerPrefixedOnly(DeferredHolder<?, ?> entry, TagKey<Block> individualPrefixTag, boolean optional) {
        BlockTagBuilder builder = new BlockTagBuilder(entry)
                .setOptional(optional)
                .addIndividualPrefixed(individualPrefixTag);

        builder.apply(provider);
    }

    @SafeVarargs
    public final <E extends Enum<E>> void register(DeferredHolder<?, ?> entry, TagKey<Block> mainTag, E type, TagKey<Block>... enumTags) {
        BlockTagBuilder builder = new BlockTagBuilder(entry)
                .addTo(mainTag)
                .addToEnum(type, enumTags)
                .addIndividual(mainTag.location().getPath());

        builder.apply(provider);
    }

    @SafeVarargs
    public final <E extends Enum<E>> void registerWithoutIndividual(DeferredHolder<?, ?> entry, TagKey<Block> mainTag, E type, boolean optional, TagKey<Block>... enumTags) {
        BlockTagBuilder builder = new BlockTagBuilder(entry)
                .addTo(mainTag)
                .setOptional(optional)
                .addToEnum(type, enumTags);

        builder.apply(provider);
    }
}
