package net.radzratz.eternalores.datagen.tags;

import mekanism.api.MekanismAPITags;
import mekanism.api.chemical.Chemical;
import mekanism.api.datagen.tag.ChemicalTagsProvider;
import mekanism.common.registration.impl.SlurryRegistryObject;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.util.compat.mekanism.chemicals.EOMekSlurries;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class EOChemicalTagProvider extends ChemicalTagsProvider {

    public EOChemicalTagProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, lookupProvider, EternalOres.id, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        registerAll();
    }

    private void registerAll() {
        TagAppender<Chemical> dirty = this.tag(MekanismAPITags.Chemicals.DIRTY);
        TagAppender<Chemical> clean = this.tag(MekanismAPITags.Chemicals.CLEAN);

        Map<String, SlurryRegistryObject<? extends Chemical, ? extends Chemical>> map = EOMekSlurries.getSlurryMap();

        for (Map.Entry<String, SlurryRegistryObject<? extends Chemical, ? extends Chemical>> e : map.entrySet()) {
            SlurryRegistryObject<? extends Chemical, ? extends Chemical> slurry = e.getValue();
            if (slurry == null) continue;

            ResourceLocation dirtyId = slurry.getId();
            var cleanSlurry = slurry.getCleanSlurry();

            dirty.addOptional(dirtyId);

            ResourceLocation cleanId = cleanSlurry.getId();
            clean.addOptional(cleanId);
        }
    }
}
