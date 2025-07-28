package net.radzratz.eternalores.datagen.tags;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.IntrinsicHolderTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.datagen.tags.items.EOItemTagEntries;
import net.radzratz.eternalores.datagen.tags.util.item.ITagEntryProvider;
import net.radzratz.eternalores.item.EOItemRegistry;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import static net.radzratz.eternalores.block.EOBlockRegistry.*;
import static net.radzratz.eternalores.util.tags.item.EOItemsGeneralTags.Items.*;
import static net.radzratz.eternalores.util.tags.item.ores.EOOreBlockItemTags.Items.*;

/**
 * Custom Item Tag Provider for Eternal Ores.
 *
 * This class extends the default ItemTagsProvider to enable tag registration
 * using a modular approach.
 * <p>
 * Instead of placing all tag assignments in this class directly,
 * we delegate them to separate entry classes implementing {@link ITagEntryProvider}.
 * <p>
 * This keeps the tag logic clean, manageable, and easy to scale
 * as more items and categories are added.
 * <p>
 * Entry classes are registered in the constructor and processed in {@code addTags()}.
 * A helper method {@code getItemTag()} is exposed to allow controlled access
 * to the protected {@code tag(...)} method.
 */
@SuppressWarnings("all")
public class EOItemTagProvider extends ItemTagsProvider
{
    /// Entry Provider List
    /**
     * List of tag entry modules that implement {@link ITagEntryProvider}.
     * <p>
     * This allows splitting tag definitions across multiple classes based
     * on item type or category (e.g., tools, plates), making tag management
     * more organized and scalable.
     */
    private final List<ITagEntryProvider> entryProviders = new ArrayList<>();

    /**
     * Constructs the main Item Tag Provider for Eternal Ores.
     * <p>
     * Registers individual tag entry classes (implementing {@link ITagEntryProvider})
     * into the entry provider list. These are processed later in {@link #addTags}.
     * <p>
     * This design keeps the tag definitions modular and avoids having
     * all tags hardcoded in a single class.
     */
    public EOItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                             CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper)
    {
        super(output, lookupProvider, blockTags, EternalOres.id, existingFileHelper);

        /// Registers All Item Entries including Blocks as Items
        entryProviders.add(new EOItemTagEntries());
    }

    /**
     * Grants controlled access to the protected {@code tag(TagKey<Item>)} method
     * from {@link IntrinsicHolderTagsProvider}, allowing external tag entry
     * classes to define and register tag content safely.
     */
    public IntrinsicHolderTagsProvider.IntrinsicTagAppender<Item> getItemTag(TagKey<Item> tag)
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
        for (ITagEntryProvider tagProvider : entryProviders)
        {
            tagProvider.addTags(this, provider);
        }

        /// Isolated entries that have a misc enum type, excluding the frickin' coal ofc and the ores/uraninite_regular tag
        tag(SCULK).add(Items.SCULK);
        tag(COAL).add(Items.COAL);
        tag(silicon).add(EOItemRegistry.SILICON.get());
        tag(silicon).add(EOItemRegistry.SILICON_INGOT.get());
        tag(I_URANINITE_ORE).add(URANINITE_ORE_BLOCK.get().asItem());
        tag(I_URANINITE_ORE).add(DEEPSLATE_URANINITE_ORE_BLOCK.get().asItem());
    }
}
