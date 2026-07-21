package net.radzratz.eternalores.util.tags.item.util;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.radzratz.eternalores.datagen.tags.EOItemTagProvider;
import net.radzratz.eternalores.util.EOMaterials;

import java.util.ArrayList;
import java.util.List;

import static net.radzratz.eternalores.util.EOUtils.*;

public class ItemTagBuilder {
    private final Item item;
    private final String path;
    private final List<TagKey<Item>> tags = new ArrayList<>();
    private boolean optional = false;
    private boolean addIndividual = false;
    private String individualFolder = "";
    private boolean addIndividualPrefix = false;
    private TagKey<Item> individualPrefixTag = null;

    public ItemTagBuilder(DeferredHolder<?, ?> holder) {
        Object obj = holder.get();

        if (obj instanceof Item i) this.item = i;

        else if (obj instanceof Block b) this.item = b.asItem();

        else throw new IllegalArgumentException("Unsupported registry holder: " + obj.getClass());

        this.path = holder.getId().getPath();
    }

    public ItemTagBuilder setOptional(boolean optional) {
        this.optional = optional;
        return this;
    }

    public ItemTagBuilder addTo(TagKey<Item> tag) {
        tags.add(tag);
        return this;
    }

    public ItemTagBuilder addIndividual(String folder) {
        this.addIndividual = true;
        this.individualFolder = folder;
        return this;
    }

    public ItemTagBuilder addIndividualPrefixed(TagKey<Item> prefixTag) {
        this.addIndividualPrefix = true;
        this.individualPrefixTag = prefixTag;
        return this;
    }

    @SafeVarargs
    public final <E extends Enum<E>> ItemTagBuilder addToEnum(E enumVal, TagKey<Item>... enumTags) {
        int index = enumVal.ordinal();

        if (index >= 0 && index < enumTags.length)
            tags.add(enumTags[index]);

        return this;
    }

    public void apply(EOItemTagProvider provider) {
        if (optional) {
            tags.forEach(tag -> provider.getItemTag(tag).addOptional(BuiltInRegistries.ITEM.getKey(item)));
        } else {
            tags.forEach(tag -> provider.getItemTag(tag).add(item));
        }

        if (addIndividual) {
            String material = EOMaterials.extractMaterialName(path);
            TagKey<Item> individualTag = TagKey.create(Registries.ITEM, C(individualFolder + "/" + material));
            if (optional) provider.getItemTag(individualTag).addOptional(BuiltInRegistries.ITEM.getKey(item));
            else provider.getItemTag(individualTag).add(item);
        }

        if (addIndividualPrefix) {
            String material = EOMaterials.extractMaterialName(path);
            String prefix = individualPrefixTag.location().getPath() + "_";
            TagKey<Item> individualTag = TagKey.create(Registries.ITEM, C(prefix + material));
            if (optional) provider.getItemTag(individualTag).addOptional(BuiltInRegistries.ITEM.getKey(item));
            else provider.getItemTag(individualTag).add(item);
        }
    }

    public void applyMC(EOItemTagProvider provider) {
        if (optional) {
            tags.forEach(tag -> provider.getItemTag(tag).addOptional(BuiltInRegistries.ITEM.getKey(item)));
        } else {
            tags.forEach(tag -> provider.getItemTag(tag).add(item));
        }

        if (addIndividual) {
            String material = EOMaterials.extractMaterialName(path);
            TagKey<Item> individualTag = TagKey.create(Registries.ITEM, MC(individualFolder + "/" + material));
            if (optional) provider.getItemTag(individualTag).addOptional(BuiltInRegistries.ITEM.getKey(item));
            else provider.getItemTag(individualTag).add(item);
        }
    }

    public void applyGeOre(EOItemTagProvider provider) {
        if (optional) {
            tags.forEach(tag -> provider.getItemTag(tag).addOptional(BuiltInRegistries.ITEM.getKey(item)));
        } else {
            tags.forEach(tag -> provider.getItemTag(tag).add(item));
        }

        if (addIndividual) {
            String material = EOMaterials.extractMaterialName(path);
            TagKey<Item> individualTag = TagKey.create(Registries.ITEM, GEO(individualFolder + "/" + material));
            if (optional) provider.getItemTag(individualTag).addOptional(BuiltInRegistries.ITEM.getKey(item));
            else provider.getItemTag(individualTag).add(item);
        }
    }

    public void applyCTE(EOItemTagProvider provider) {
        if (optional) {
            tags.forEach(tag -> provider.getItemTag(tag).addOptional(BuiltInRegistries.ITEM.getKey(item)));
        } else {
            tags.forEach(tag -> provider.getItemTag(tag).add(item));
        }

        if (addIndividual) {
            String material = EOMaterials.extractMaterialName(path);
            TagKey<Item> individualTag = TagKey.create(Registries.ITEM, CTE(individualFolder + "/" + material));
            if (optional) provider.getItemTag(individualTag).addOptional(BuiltInRegistries.ITEM.getKey(item));
            else provider.getItemTag(individualTag).add(item);
        }
    }

    public void applyMek(EOItemTagProvider provider) {
        if (optional) {
            tags.forEach(tag -> provider.getItemTag(tag).addOptional(BuiltInRegistries.ITEM.getKey(item)));
        } else {
            tags.forEach(tag -> provider.getItemTag(tag).add(item));
        }

        if (addIndividual) {
            String material = EOMaterials.extractMaterialName(path);
            TagKey<Item> individualTag = TagKey.create(Registries.ITEM, MEK(individualFolder + "/" + material));
            if (optional) provider.getItemTag(individualTag).addOptional(BuiltInRegistries.ITEM.getKey(item));
            else provider.getItemTag(individualTag).add(item);
        }
    }
}
