package net.radzratz.eternalores.util.compat.mekanism.datagen;

import mekanism.common.tags.MekanismTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.util.compat.mekanism.item.EOMekCompatItems;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class EOMekanismTagProvider extends ItemTagsProvider
{
    public EOMekanismTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                 CompletableFuture<TagLookup<Block>> blockTags,
                                 @Nullable ExistingFileHelper existingFileHelper)
    {
        super(output, lookupProvider, blockTags, EternalOres.id, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider)
    {
        /// By Mekansim
        tag(MekanismTags.Items.DIRTY_DUSTS).add(EOMekCompatItems.ALUMINUM_DIRTY_DUST.get());
        tag(MekanismTags.Items.CLUMPS).add(EOMekCompatItems.ALUMINUM_CLUMP.get());
        tag(MekanismTags.Items.SHARDS).add(EOMekCompatItems.ALUMINUM_SHARD.get());
        tag(MekanismTags.Items.CRYSTALS).add(EOMekCompatItems.ALUMINUM_CRYSTAL.get());

        tag(MekanismTags.Items.DIRTY_DUSTS).add(EOMekCompatItems.CATALYRIUM_DIRTY_DUST.get());
        tag(MekanismTags.Items.CLUMPS).add(EOMekCompatItems.CATALYRIUM_CLUMP.get());
        tag(MekanismTags.Items.SHARDS).add(EOMekCompatItems.CATALYRIUM_SHARD.get());
        tag(MekanismTags.Items.CRYSTALS).add(EOMekCompatItems.CATALYRIUM_CRYSTAL.get());

        tag(MekanismTags.Items.DIRTY_DUSTS).add(EOMekCompatItems.COBALT_DIRTY_DUST.get());
        tag(MekanismTags.Items.CLUMPS).add(EOMekCompatItems.COBALT_CLUMP.get());
        tag(MekanismTags.Items.SHARDS).add(EOMekCompatItems.COBALT_SHARD.get());
        tag(MekanismTags.Items.CRYSTALS).add(EOMekCompatItems.COBALT_CRYSTAL.get());

        tag(MekanismTags.Items.DIRTY_DUSTS).add(EOMekCompatItems.GALLIUM_DIRTY_DUST.get());
        tag(MekanismTags.Items.CLUMPS).add(EOMekCompatItems.GALLIUM_CLUMP.get());
        tag(MekanismTags.Items.SHARDS).add(EOMekCompatItems.GALLIUM_SHARD.get());
        tag(MekanismTags.Items.CRYSTALS).add(EOMekCompatItems.GALLIUM_CRYSTAL.get());

        tag(MekanismTags.Items.DIRTY_DUSTS).add(EOMekCompatItems.IRIDIUM_DIRTY_DUST.get());
        tag(MekanismTags.Items.CLUMPS).add(EOMekCompatItems.IRIDIUM_CLUMP.get());
        tag(MekanismTags.Items.SHARDS).add(EOMekCompatItems.IRIDIUM_SHARD.get());
        tag(MekanismTags.Items.CRYSTALS).add(EOMekCompatItems.IRIDIUM_CRYSTAL.get());

        tag(MekanismTags.Items.DIRTY_DUSTS).add(EOMekCompatItems.NICKEL_DIRTY_DUST.get());
        tag(MekanismTags.Items.CLUMPS).add(EOMekCompatItems.NICKEL_CLUMP.get());
        tag(MekanismTags.Items.SHARDS).add(EOMekCompatItems.NICKEL_SHARD.get());
        tag(MekanismTags.Items.CRYSTALS).add(EOMekCompatItems.NICKEL_CRYSTAL.get());

        tag(MekanismTags.Items.DIRTY_DUSTS).add(EOMekCompatItems.PLATINUM_DIRTY_DUST.get());
        tag(MekanismTags.Items.CLUMPS).add(EOMekCompatItems.PLATINUM_CLUMP.get());
        tag(MekanismTags.Items.SHARDS).add(EOMekCompatItems.PLATINUM_SHARD.get());
        tag(MekanismTags.Items.CRYSTALS).add(EOMekCompatItems.PLATINUM_CRYSTAL.get());

        tag(MekanismTags.Items.DIRTY_DUSTS).add(EOMekCompatItems.SILVER_DIRTY_DUST.get());
        tag(MekanismTags.Items.CLUMPS).add(EOMekCompatItems.SILVER_CLUMP.get());
        tag(MekanismTags.Items.SHARDS).add(EOMekCompatItems.SILVER_SHARD.get());
        tag(MekanismTags.Items.CRYSTALS).add(EOMekCompatItems.SILVER_CRYSTAL.get());

        tag(MekanismTags.Items.DIRTY_DUSTS).add(EOMekCompatItems.URANINITE_DIRTY_DUST.get());
        tag(MekanismTags.Items.CLUMPS).add(EOMekCompatItems.URANINITE_CLUMP.get());
        tag(MekanismTags.Items.SHARDS).add(EOMekCompatItems.URANINITE_SHARD.get());
        tag(MekanismTags.Items.CRYSTALS).add(EOMekCompatItems.URANINITE_CRYSTAL.get());

        tag(MekanismTags.Items.DIRTY_DUSTS).add(EOMekCompatItems.ZINC_DIRTY_DUST.get());
        tag(MekanismTags.Items.CLUMPS).add(EOMekCompatItems.ZINC_CLUMP.get());
        tag(MekanismTags.Items.SHARDS).add(EOMekCompatItems.ZINC_SHARD.get());
        tag(MekanismTags.Items.CRYSTALS).add(EOMekCompatItems.ZINC_CRYSTAL.get());
    }
}
