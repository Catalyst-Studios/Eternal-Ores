package net.radzratz.eternalores.util.tags.fluid.util;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.radzratz.eternalores.datagen.tags.EOFluidTagProvider;

import java.util.ArrayList;
import java.util.List;

import static net.radzratz.eternalores.util.EOUtils.C;

public class FluidTagBuilder {
    private final Fluid fluid;
    private final List<TagKey<Fluid>> tags = new ArrayList<>();
    private boolean optional = false;
    private boolean addIndividualFlat = false;
    private String flatPrefix = "";

    public FluidTagBuilder(DeferredHolder<?, ?> holder) {
        Object obj = holder.get();
        if (obj instanceof Fluid f) this.fluid = f;
        else throw new IllegalArgumentException("Unsupported registry holder: " + obj.getClass());
    }

    public FluidTagBuilder setOptional(boolean optional) {
        this.optional = optional;
        return this;
    }

    public FluidTagBuilder addTo(TagKey<Fluid> tag) {
        tags.add(tag);
        return this;
    }

    public FluidTagBuilder addIndividualFlat(String flatName) {
        this.addIndividualFlat = true;
        this.flatPrefix = flatName;
        return this;
    }

    public void apply(EOFluidTagProvider provider) {
        if (optional) {
            tags.forEach(tag -> provider.getFluidTags(tag).addOptional(BuiltInRegistries.FLUID.getKey(fluid)));
        } else {
            tags.forEach(tag -> provider.getFluidTags(tag).add(fluid));
        }

        if (addIndividualFlat) {
            TagKey<Fluid> flatTag = TagKey.create(Registries.FLUID, C(flatPrefix));
            if (optional) provider.getFluidTags(flatTag).addOptional(BuiltInRegistries.FLUID.getKey(fluid));
            else provider.getFluidTags(flatTag).add(fluid);
        }
    }

    public void applyExternal(EOFluidTagProvider provider) {
        if (optional) {
            tags.forEach(tag -> provider.getFluidTags(tag).addOptional(BuiltInRegistries.FLUID.getKey(fluid)));
        } else {
            tags.forEach(tag -> provider.getFluidTags(tag).add(fluid));
        }
    }
}