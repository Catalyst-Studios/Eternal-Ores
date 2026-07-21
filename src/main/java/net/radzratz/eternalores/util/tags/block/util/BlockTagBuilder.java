package net.radzratz.eternalores.util.tags.block.util;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.radzratz.eternalores.datagen.tags.EOBlockTagProvider;
import net.radzratz.eternalores.util.EOMaterials;

import java.util.ArrayList;
import java.util.List;

import static net.radzratz.eternalores.util.EOUtils.*;

public class BlockTagBuilder {
    private final Block block;
    private final String path;
    private final List<TagKey<Block>> tags = new ArrayList<>();
    private boolean addIndividual = false;
    private boolean optional = false;
    private String individualFolder = "";
    private boolean addIndividualPrefix = false;
    private TagKey<Block> individualPrefixTag = null;

    public BlockTagBuilder(DeferredHolder<?, ?> holder) {
        Object obj = holder.get();

        if (obj instanceof Item i) this.block = Block.byItem(i);

        else if (obj instanceof Block b) this.block = Block.byItem(b.asItem());

        else throw new IllegalArgumentException("Unsupported registry holder: " + obj.getClass());

        this.path = holder.getId().getPath();
    }

    public BlockTagBuilder setOptional(boolean optional) {
        this.optional = optional;
        return this;
    }

    public BlockTagBuilder addTo(TagKey<Block> tag) {
        tags.add(tag);
        return this;
    }

    public BlockTagBuilder addIndividual(String folder) {
        this.addIndividual = true;
        this.individualFolder = folder;
        return this;
    }

    public BlockTagBuilder addIndividualPrefixed(TagKey<Block> prefixTag) {
        this.addIndividualPrefix = true;
        this.individualPrefixTag = prefixTag;
        return this;
    }

    @SafeVarargs
    public final <E extends Enum<E>> BlockTagBuilder addToEnum(E enumVal, TagKey<Block>... enumTags) {
        int index = enumVal.ordinal();

        if (index < enumTags.length)
            tags.add(enumTags[index]);
        return this;
    }

    public void apply(EOBlockTagProvider provider) {
        if (optional) {
            tags.forEach(tag -> provider.getBlockTag(tag).addOptional(BuiltInRegistries.BLOCK.getKey(block)));
        } else {
            tags.forEach(tag -> provider.getBlockTag(tag).add(block));
        }

        if (addIndividual) {
            String material = EOMaterials.extractMaterialName(path);
            TagKey<Block> individualTag = TagKey.create(Registries.BLOCK, C(individualFolder + "/" + material));
            if (optional) provider.getBlockTag(individualTag).addOptional(BuiltInRegistries.BLOCK.getKey(block));
            else provider.getBlockTag(individualTag).add(block);
        }

        if (addIndividualPrefix) {
            String material = EOMaterials.extractMaterialName(path);
            String prefix = individualPrefixTag.location().getPath() + "_";
            TagKey<Block> individualTag = TagKey.create(Registries.BLOCK, C(prefix + material));
            if (optional) provider.getBlockTag(individualTag).addOptional(BuiltInRegistries.BLOCK.getKey(block));
            else provider.getBlockTag(individualTag).add(block);
        }
    }

    public void applyGeOre(EOBlockTagProvider provider) {
        if (optional) {
            tags.forEach(tag -> provider.getBlockTag(tag).addOptional(BuiltInRegistries.BLOCK.getKey(block)));
        } else {
            tags.forEach(tag -> provider.getBlockTag(tag).add(block));
        }

        if (addIndividual) {
            String material = EOMaterials.extractMaterialName(path);
            TagKey<Block> individualTag = TagKey.create(Registries.BLOCK, GEO(individualFolder + "/" + material));
            if (optional) provider.getBlockTag(individualTag).addOptional(BuiltInRegistries.BLOCK.getKey(block));
            else provider.getBlockTag(individualTag).add(block);
        }
    }

    public void applyMC(EOBlockTagProvider provider) {
        if (optional) {
            tags.forEach(tag -> provider.getBlockTag(tag).addOptional(BuiltInRegistries.BLOCK.getKey(block)));
        } else {
            tags.forEach(tag -> provider.getBlockTag(tag).add(block));
        }

        if (addIndividual) {
            String material = EOMaterials.extractMaterialName(path);
            TagKey<Block> individualTag = TagKey.create(Registries.BLOCK, MC(individualFolder + "/" + material));
            if (optional) provider.getBlockTag(individualTag).addOptional(BuiltInRegistries.BLOCK.getKey(block));
            else provider.getBlockTag(individualTag).add(block);
        }
    }
}
