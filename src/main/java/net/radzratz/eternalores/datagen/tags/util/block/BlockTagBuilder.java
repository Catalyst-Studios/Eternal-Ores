package net.radzratz.eternalores.datagen.tags.util.block;

import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.radzratz.eternalores.datagen.tags.EOBlockTagProvider;
import net.radzratz.eternalores.util.EOMaterialHelper;

import java.util.ArrayList;
import java.util.List;

import static net.radzratz.eternalores.util.EOUtils.C;

/**
 * Utility class for building and applying Block tags for a given registry entry.
 * <p>
 * Supports {@link Block} entries, and allows chaining tag additions before applying them to the provider.
 */
public class BlockTagBuilder
{
    private final Block block;
    private final String path;
    private final List<TagKey<Block>> tags = new ArrayList<>();
    private boolean addIndividual = false;
    private String individualFolder = "";

    /**
     * Constructs a new tag builder for the given registry holder.
     *
     * @param holder DeferredHolder of a Block
     * @throws IllegalArgumentException if the holder is not a Block
     */
    public BlockTagBuilder(DeferredHolder<?, ?> holder)
    {
        Object obj = holder.get();

        if (obj instanceof Item i) this.block = Block.byItem(i);

        else if (obj instanceof Block b) this.block = Block.byItem(b.asItem());

        else throw new IllegalArgumentException("Unsupported registry holder: " + obj.getClass());

        this.path = holder.getId().getPath();
    }

    /**
     * Adds a single item tag to be assigned to the Block.
     *
     * @param tag TagKey<Block> to assign
     * @return this builder instance for chaining
     */
    public BlockTagBuilder addTo(TagKey<Block> tag)
    {
        tags.add(tag);
        return this;
    }

    /**
     * Enables automatic individual tag assignment with a custom path prefix.
     *
     * @param folder Folder name used as the base path (e.g., "ores/")
     * @return this builder instance
     */
    public BlockTagBuilder addIndividual(String folder)
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
    public final <E extends Enum<E>> BlockTagBuilder addToEnum(E enumVal, TagKey<Block>... enumTags)
    {
        int index = enumVal.ordinal();

        if (index < enumTags.length)
            tags.add(enumTags[index]);
        return this;
    }

    /**
     * Applies all accumulated tags to the given provider.
     *
     * @param provider The main EOItemTagProvider
     */
    public void apply(EOBlockTagProvider provider)
    {
        tags.forEach(tag -> provider.getBlockTag(tag).add(block));

        if (addIndividual)
        {
            String material = EOMaterialHelper.extractMaterial(path);
            TagKey<Block> individualTag = TagKey.create(Registries.BLOCK, C(individualFolder + "/" + material));
            provider.getBlockTag(individualTag).add(block);
        }
    }
}
