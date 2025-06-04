package net.radzratz.eternalores.util.compat.mekanism.datagen;

import mekanism.common.tags.MekanismTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.util.compat.mekanism.EternalOresMekanismCompat;
import net.radzratz.eternalores.util.compat.mekanism.tags.EternalOresItemMekTags;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class EternalOresMekanismTags extends ItemTagsProvider
{
    public EternalOresMekanismTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                   CompletableFuture<TagLookup<Block>> blockTags,
                                   @Nullable ExistingFileHelper existingFileHelper)
    {
        super(output, lookupProvider, blockTags, EternalOres.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider)
    {
        /// By C
        //Aluminum
        tag(EternalOresItemMekTags.Items.DIRTY_ALUMINUM_C).add(EternalOresMekanismCompat.ALUMINUM_DIRTY_DUST.get());
        tag(EternalOresItemMekTags.Items.CLUMP_ALUMINUM_C).add(EternalOresMekanismCompat.ALUMINUM_CLUMP.get());
        tag(EternalOresItemMekTags.Items.SHARD_ALUMINUM_C).add(EternalOresMekanismCompat.ALUMINUM_SHARD.get());
        tag(EternalOresItemMekTags.Items.CRYSTAL_ALUMINUM_C).add(EternalOresMekanismCompat.ALUMINUM_CRYSTAL.get());

        /// By Mekansim
        tag(MekanismTags.Items.DIRTY_DUSTS).add(EternalOresMekanismCompat.ALUMINUM_DIRTY_DUST.get());
        tag(MekanismTags.Items.CLUMPS).add(EternalOresMekanismCompat.ALUMINUM_CLUMP.get());
        tag(MekanismTags.Items.SHARDS).add(EternalOresMekanismCompat.ALUMINUM_SHARD.get());
        tag(MekanismTags.Items.CRYSTALS).add(EternalOresMekanismCompat.ALUMINUM_CRYSTAL.get());
    }
}
