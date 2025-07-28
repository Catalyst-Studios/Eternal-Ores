package net.radzratz.eternalores.datagen.tags.util.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.radzratz.eternalores.datagen.tags.EOItemTagProvider;
import net.radzratz.eternalores.util.EOMaterialHelper;

import java.util.ArrayList;
import java.util.List;

import static net.radzratz.eternalores.util.EOUtils.C;

/**
 * Utility class for building and applying item tags for a given registry entry.
 * <p>
 * Supports both {@link Item} and {@link Block} entries (converting blocks to their item form),
 * and allows chaining tag additions before applying them to the provider.
 */
@SuppressWarnings("all")
public class ItemTagBuilder
{
    private final Item item;
    private final String path;
    private final List<TagKey<Item>> tags = new ArrayList<>();
    private boolean addIndividual = false;
    private String individualFolder = "";

    /**
     * Constructs a new tag builder for the given registry holder.
     *
     * @param holder DeferredHolder of an Item or Block (converted to Item)
     * @throws IllegalArgumentException if the holder is not an Item or Block
     */
    public ItemTagBuilder(DeferredHolder<?, ?> holder)
    {
        Object obj = holder.get();

        if (obj instanceof Item i) this.item = i;

        else if (obj instanceof Block b) this.item = b.asItem();

        else throw new IllegalArgumentException("Unsupported registry holder: " + obj.getClass());

        this.path = holder.getId().getPath();
    }

    /**
     * Adds a single item tag to be assigned to the item.
     *
     * @param tag TagKey<Item> to assign
     * @return this builder instance for chaining
     */
    public ItemTagBuilder addTo(TagKey<Item> tag)
    {
        tags.add(tag);
        return this;
    }

    /**
     * Enables automatic individual tag assignment with a custom path prefix.
     *
     * @param folder Folder name used as the base path (e.g., "ingots/")
     * @return this builder instance
     */
    public ItemTagBuilder addIndividual(String folder)
    {
        this.addIndividual = true;
        this.individualFolder = folder;
        return this;
    }

    /**
     * Automatically assigns an enum-specific tag based on the ordinal of the enum value.
     *
     * @param enumVal   Enum instance representing type
     * @param enumTags  Tag array matching enum order
     * @return this builder instance
     */
    @SafeVarargs
    public final <E extends Enum<E>> ItemTagBuilder addToEnum(E enumVal, TagKey<Item>... enumTags)
    {
        int index = enumVal.ordinal();

        if (index >= 0 && index < enumTags.length)
            tags.add(enumTags[index]);
        return this;
    }

    /**
     * Applies all accumulated tags to the given provider.
     *
     * @param provider The main EOItemTagProvider
     */
    public void apply(EOItemTagProvider provider)
    {
        tags.forEach(tag -> provider.getItemTag(tag).add(item));

        if (addIndividual)
        {
            String material = EOMaterialHelper.extractMaterial(path);
            TagKey<Item> individualTag = TagKey.create(Registries.ITEM, C(individualFolder + "/" + material));
            provider.getItemTag(individualTag).add(item);
        }
    }
}
