package net.radzratz.eternalores.util.compat.powah.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DataMapProvider;
import org.jetbrains.annotations.NotNull;
import owmii.powah.recipe.ReactorFuel;

import java.util.concurrent.CompletableFuture;

import static net.radzratz.eternalores.block.EOBlockRegistry.URANINITE_BLOCK;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.tags.item.ingots.EOIngotTags.Items.TAG_URANINITE_INGOT;
import static net.radzratz.eternalores.util.tags.item.nuggets.EONuggetsTags.Items.NUGGET_URANINITE;

public class EOPowahMapProvider extends DataMapProvider
{
    public EOPowahMapProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider)
    {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void gather(HolderLookup.@NotNull Provider provider)
    {
        if (!powahMod) return;
        builder(ReactorFuel.DATA_MAP_TYPE)
                .add(TAG_URANINITE_INGOT, new ReactorFuel(100, 700), false)
                .add(NUGGET_URANINITE, new ReactorFuel(5, 700), false)
                .add(URANINITE_BLOCK.getId(), new ReactorFuel(1000, 1000), false)
                .build();
    }
}
