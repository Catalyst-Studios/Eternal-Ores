package net.radzratz.eternalores.util.tags.fluid.util;

import net.minecraft.tags.TagKey;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.radzratz.eternalores.datagen.tags.EOFluidTagProvider;

public class FluidTagAutoRegister {
    private final EOFluidTagProvider provider;

    public FluidTagAutoRegister(EOFluidTagProvider provider) {
        this.provider = provider;
    }

    public void register(DeferredHolder<?, ?> entry, TagKey<Fluid> mainTag, boolean optional) {
        new FluidTagBuilder(entry)
                .addTo(mainTag)
                .setOptional(optional)
                .apply(provider);
    }

    public void registerFlat(DeferredHolder<?, ?> entry, String flatTagName, boolean optional) {
        new FluidTagBuilder(entry)
                .setOptional(optional)
                .addIndividualFlat(flatTagName)
                .apply(provider);
    }

    public void registerExternal(DeferredHolder<?, ?> entry, TagKey<Fluid> mainTag, boolean optional) {
        new FluidTagBuilder(entry)
                .addTo(mainTag)
                .setOptional(optional)
                .applyExternal(provider);
    }
}