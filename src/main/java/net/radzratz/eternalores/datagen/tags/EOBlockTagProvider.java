package net.radzratz.eternalores.datagen.tags;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.IntrinsicHolderTagsProvider;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.block.EOBlockRegistry;
import net.radzratz.eternalores.datagen.tags.block.EOBlockTagEntries;
import net.radzratz.eternalores.datagen.tags.util.block.ITagBlockEntryProvider;
import net.radzratz.eternalores.datagen.tags.util.item.ITagEntryProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import static net.radzratz.eternalores.util.tags.block.ores.EOOreBlockTags.Blocks.B_URANINITE_ORE;

/**
 * Custom Block Tag Provider for Eternal Ores.
 *
 * This class extends the default BlockTagsProvider to enable tag registration
 * using a modular approach.
 * <p>
 * Instead of placing all tag assignments in this class directly,
 * we delegate them to separate entry classes implementing {@link ITagEntryProvider}.
 * <p>
 * This keeps the tag logic clean, manageable, and easy to scale
 * as more items and categories are added.
 * <p>
 * Entry classes are registered in the constructor and processed in {@code addTags()}.
 * A helper method {@code getBlockTag()} is exposed to allow controlled access
 * to the protected {@code tag(...)} method.
 */
@SuppressWarnings("all")
public class EOBlockTagProvider extends BlockTagsProvider
{
    /// Entry Provider List
    /**
     * List of tag entry modules that implement {@link ITagBlockEntryProvider}.
     * <p>
     * This allows splitting tag definitions across multiple classes based
     * on Block type or category (e.g., ores, storage_blocks), making tag management
     * more organized and scalable.
     */
    private final List<ITagBlockEntryProvider> entryProviders = new ArrayList<>();

    /**
     * Constructs the main Item Tag Provider for Eternal Ores.
     * <p>
     * Registers individual tag entry classes (implementing {@link ITagBlockEntryProvider})
     * into the entry provider list. These are processed later in {@link #addTags}.
     * <p>
     * This design keeps the tag definitions modular and avoids having
     * all tags hardcoded in a single class.
     */
    public EOBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper)
    {
        super(output, lookupProvider, EternalOres.id, existingFileHelper);

        /// Registers All Block Entries
        entryProviders.add(new EOBlockTagEntries());
    }

    /**
     * Grants controlled access to the protected {@code tag(TagKey<Block>)} method
     * from {@link IntrinsicHolderTagsProvider}, allowing external tag entry
     * classes to define and register tag content safely.
     */
    public IntrinsicHolderTagsProvider.IntrinsicTagAppender<Block> getBlockTag(TagKey<Block> tag)
    {
         return super.tag(tag);
    }

    /**
     * Main entry point for tag registration.
     * <p>
     * Previously, all tag assignments would be defined directly here
     * using {@code tag(...).add(...)} calls.
     * <p>
     * Now, each modular entry class is invoked through the {@code entryProviders} list,
     * allowing better separation of logic and easier maintenance.
     */
    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider)
    {
        for (ITagBlockEntryProvider tagProvider : entryProviders)
        {
            tagProvider.addTags(this, provider);
        }

        tag(B_URANINITE_ORE).add(EOBlockRegistry.DEEPSLATE_URANINITE_ORE_BLOCK.get());
        tag(B_URANINITE_ORE).add(EOBlockRegistry.URANINITE_ORE_BLOCK.get());
    }
}
