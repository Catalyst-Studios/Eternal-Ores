package net.radzratz.eternalores.util.compat.mekanism.datagen;

import mekanism.common.tags.MekanismTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.util.compat.mekanism.EOMekCompatItems;
import net.radzratz.eternalores.util.compat.mekanism.tags.EOItemMekTags;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class EOMekanismTagProvider extends ItemTagsProvider
{
    public EOMekanismTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                 CompletableFuture<TagLookup<Block>> blockTags,
                                 @Nullable ExistingFileHelper existingFileHelper)
    {
        super(output, lookupProvider, blockTags, EternalOres.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider)
    {
        /// By C
        tag(EOItemMekTags.Items.DIRTY_ALUMINUM_C).add(EOMekCompatItems.ALUMINUM_DIRTY_DUST.get());
        tag(EOItemMekTags.Items.CLUMP_ALUMINUM_C).add(EOMekCompatItems.ALUMINUM_CLUMP.get());
        tag(EOItemMekTags.Items.SHARD_ALUMINUM_C).add(EOMekCompatItems.ALUMINUM_SHARD.get());
        tag(EOItemMekTags.Items.CRYSTAL_ALUMINUM_C).add(EOMekCompatItems.ALUMINUM_CRYSTAL.get());

        tag(EOItemMekTags.Items.DIRTY_ARDITE_C).add(EOMekCompatItems.ARDITE_DIRTY_DUST.get());
        tag(EOItemMekTags.Items.CLUMP_ARDITE_C).add(EOMekCompatItems.ARDITE_CLUMP.get());
        tag(EOItemMekTags.Items.SHARD_ARDITE_C).add(EOMekCompatItems.ARDITE_SHARD.get());
        tag(EOItemMekTags.Items.CRYSTAL_ARDITE_C).add(EOMekCompatItems.ARDITE_CRYSTAL.get());

        tag(EOItemMekTags.Items.DIRTY_CATALYRIUM_C).add(EOMekCompatItems.CATALYRIUM_DIRTY_DUST.get());
        tag(EOItemMekTags.Items.CLUMP_CATALYRIUM_C).add(EOMekCompatItems.CATALYRIUM_CLUMP.get());
        tag(EOItemMekTags.Items.SHARD_CATALYRIUM_C).add(EOMekCompatItems.CATALYRIUM_SHARD.get());
        tag(EOItemMekTags.Items.CRYSTAL_CATALYRIUM_C).add(EOMekCompatItems.CATALYRIUM_CRYSTAL.get());

        tag(EOItemMekTags.Items.DIRTY_COBALT_C).add(EOMekCompatItems.COBALT_DIRTY_DUST.get());
        tag(EOItemMekTags.Items.CLUMP_COBALT_C).add(EOMekCompatItems.COBALT_CLUMP.get());
        tag(EOItemMekTags.Items.SHARD_COBALT_C).add(EOMekCompatItems.COBALT_SHARD.get());
        tag(EOItemMekTags.Items.CRYSTAL_COBALT_C).add(EOMekCompatItems.COBALT_CRYSTAL.get());

        tag(EOItemMekTags.Items.DIRTY_GALLIUM_C).add(EOMekCompatItems.GALLIUM_DIRTY_DUST.get());
        tag(EOItemMekTags.Items.CLUMP_GALLIUM_C).add(EOMekCompatItems.GALLIUM_CLUMP.get());
        tag(EOItemMekTags.Items.SHARD_GALLIUM_C).add(EOMekCompatItems.GALLIUM_SHARD.get());
        tag(EOItemMekTags.Items.CRYSTAL_GALLIUM_C).add(EOMekCompatItems.GALLIUM_CRYSTAL.get());

        tag(EOItemMekTags.Items.DIRTY_IRIDIUM_C).add(EOMekCompatItems.IRIDIUM_DIRTY_DUST.get());
        tag(EOItemMekTags.Items.CLUMP_IRIDIUM_C).add(EOMekCompatItems.IRIDIUM_CLUMP.get());
        tag(EOItemMekTags.Items.SHARD_IRIDIUM_C).add(EOMekCompatItems.IRIDIUM_SHARD.get());
        tag(EOItemMekTags.Items.CRYSTAL_IRIDIUM_C).add(EOMekCompatItems.IRIDIUM_CRYSTAL.get());

        tag(EOItemMekTags.Items.DIRTY_NICKEL_C).add(EOMekCompatItems.NICKEL_DIRTY_DUST.get());
        tag(EOItemMekTags.Items.CLUMP_NICKEL_C).add(EOMekCompatItems.NICKEL_CLUMP.get());
        tag(EOItemMekTags.Items.SHARD_NICKEL_C).add(EOMekCompatItems.NICKEL_SHARD.get());
        tag(EOItemMekTags.Items.CRYSTAL_NICKEL_C).add(EOMekCompatItems.NICKEL_CRYSTAL.get());

        tag(EOItemMekTags.Items.DIRTY_PLATINUM_C).add(EOMekCompatItems.PLATINUM_DIRTY_DUST.get());
        tag(EOItemMekTags.Items.CLUMP_PLATINUM_C).add(EOMekCompatItems.PLATINUM_CLUMP.get());
        tag(EOItemMekTags.Items.SHARD_PLATINUM_C).add(EOMekCompatItems.PLATINUM_SHARD.get());
        tag(EOItemMekTags.Items.CRYSTAL_PLATINUM_C).add(EOMekCompatItems.PLATINUM_CRYSTAL.get());

        tag(EOItemMekTags.Items.DIRTY_SILVER_C).add(EOMekCompatItems.SILVER_DIRTY_DUST.get());
        tag(EOItemMekTags.Items.CLUMP_SILVER_C).add(EOMekCompatItems.SILVER_CLUMP.get());
        tag(EOItemMekTags.Items.SHARD_SILVER_C).add(EOMekCompatItems.SILVER_SHARD.get());
        tag(EOItemMekTags.Items.CRYSTAL_SILVER_C).add(EOMekCompatItems.SILVER_CRYSTAL.get());

        tag(EOItemMekTags.Items.DIRTY_URANINITE_C).add(EOMekCompatItems.URANINITE_DIRTY_DUST.get());
        tag(EOItemMekTags.Items.CLUMP_URANINITE_C).add(EOMekCompatItems.URANINITE_CLUMP.get());
        tag(EOItemMekTags.Items.SHARD_URANINITE_C).add(EOMekCompatItems.URANINITE_SHARD.get());
        tag(EOItemMekTags.Items.CRYSTAL_URANINITE_C).add(EOMekCompatItems.URANINITE_CRYSTAL.get());

        tag(EOItemMekTags.Items.DIRTY_ZINC_C).add(EOMekCompatItems.ZINC_DIRTY_DUST.get());
        tag(EOItemMekTags.Items.CLUMP_ZINC_C).add(EOMekCompatItems.ZINC_CLUMP.get());
        tag(EOItemMekTags.Items.SHARD_ZINC_C).add(EOMekCompatItems.ZINC_SHARD.get());
        tag(EOItemMekTags.Items.CRYSTAL_ZINC_C).add(EOMekCompatItems.ZINC_CRYSTAL.get());

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
