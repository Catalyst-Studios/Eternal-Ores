package net.radzratz.eternalitems.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.FurnaceFuel;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;
import net.radzratz.eternalitems.item.Moditems;

import java.util.concurrent.CompletableFuture;

public class EternalMapProvider extends DataMapProvider {
    protected EternalMapProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void gather() {
        this.builder(NeoForgeDataMaps.FURNACE_FUELS)
                .add(Moditems.TINY_COAL.getId(), new FurnaceFuel(200), false)
                .add(Moditems.TINY_CHARCOAL.getId(), new FurnaceFuel(200), false);
    }
}
