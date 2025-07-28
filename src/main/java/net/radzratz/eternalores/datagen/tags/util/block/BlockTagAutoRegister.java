package net.radzratz.eternalores.datagen.tags.util.block;

import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.radzratz.eternalores.datagen.tags.EOBlockTagProvider;
import net.radzratz.eternalores.datagen.tags.block.EOBlockTagEntries;

/**
 * Handles automatic registration of block tags based on type and enum metadata.
 * <p>
 * Provides simplified `register` methods to reduce repeated logic inside {@link EOBlockTagEntries}.
 */
public class BlockTagAutoRegister
{
    private final EOBlockTagProvider provider;

    public BlockTagAutoRegister(EOBlockTagProvider provider)
    {
        this.provider = provider;
    }

    /**
     * Registers a basic block with a main tag and optional individual tag.
     *
     * @param entry      The registry entry (DeferredHolder)
     * @param mainTag    The base tag to add the block to
     * @param individual If true, also adds an individual tag based on the mainTag path
     */
    public void register(DeferredHolder<?, ?> entry, TagKey<Block> mainTag, boolean individual)
    {
        BlockTagBuilder builder = new BlockTagBuilder(entry).addTo(mainTag);

        if (individual) builder.addIndividual(mainTag.location().getPath());

        builder.apply(provider);
    }

    /**
     * Registers a block with a main tag, enum-specific tag, and individual tag.
     *
     * @param entry     The registry entry
     * @param mainTag   The base tag
     * @param type      The enum type of the block
     * @param enumTags  The array of enum-specific tags matching the enum's ordinal
     * @param <E>       Enum type
     */
    @SafeVarargs
    public final <E extends Enum<E>> void register(DeferredHolder<?, ?> entry, TagKey<Block> mainTag, E type, TagKey<Block>... enumTags)
    {
        BlockTagBuilder builder = new BlockTagBuilder(entry)
                .addTo(mainTag)
                .addToEnum(type, enumTags)
                .addIndividual(mainTag.location().getPath());

        builder.apply(provider);
    }
}
