package net.radzratz.eternalores.util.compat.mekanism.datagen;

import mekanism.common.tags.MekanismTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.fml.ModList;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.util.compat.mekanism.EternalOresMekanismCompatItems;
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
        tag(EternalOresItemMekTags.Items.DIRTY_ALUMINUM_C).add(EternalOresMekanismCompatItems.ALUMINUM_DIRTY_DUST.get());
        tag(EternalOresItemMekTags.Items.CLUMP_ALUMINUM_C).add(EternalOresMekanismCompatItems.ALUMINUM_CLUMP.get());
        tag(EternalOresItemMekTags.Items.SHARD_ALUMINUM_C).add(EternalOresMekanismCompatItems.ALUMINUM_SHARD.get());
        tag(EternalOresItemMekTags.Items.CRYSTAL_ALUMINUM_C).add(EternalOresMekanismCompatItems.ALUMINUM_CRYSTAL.get());

        tag(EternalOresItemMekTags.Items.DIRTY_CATALYRIUM_C).add(EternalOresMekanismCompatItems.CATALYRIUM_DIRTY_DUST.get());
        tag(EternalOresItemMekTags.Items.CLUMP_CATALYRIUM_C).add(EternalOresMekanismCompatItems.CATALYRIUM_CLUMP.get());
        tag(EternalOresItemMekTags.Items.SHARD_CATALYRIUM_C).add(EternalOresMekanismCompatItems.CATALYRIUM_SHARD.get());
        tag(EternalOresItemMekTags.Items.CRYSTAL_CATALYRIUM_C).add(EternalOresMekanismCompatItems.CATALYRIUM_CRYSTAL.get());

        tag(EternalOresItemMekTags.Items.DIRTY_COBALT_C).add(EternalOresMekanismCompatItems.COBALT_DIRTY_DUST.get());
        tag(EternalOresItemMekTags.Items.CLUMP_COBALT_C).add(EternalOresMekanismCompatItems.COBALT_CLUMP.get());
        tag(EternalOresItemMekTags.Items.SHARD_COBALT_C).add(EternalOresMekanismCompatItems.COBALT_SHARD.get());
        tag(EternalOresItemMekTags.Items.CRYSTAL_COBALT_C).add(EternalOresMekanismCompatItems.COBALT_CRYSTAL.get());

        tag(EternalOresItemMekTags.Items.DIRTY_GALLIUM_C).add(EternalOresMekanismCompatItems.GALLIUM_DIRTY_DUST.get());
        tag(EternalOresItemMekTags.Items.CLUMP_GALLIUM_C).add(EternalOresMekanismCompatItems.GALLIUM_CLUMP.get());
        tag(EternalOresItemMekTags.Items.SHARD_GALLIUM_C).add(EternalOresMekanismCompatItems.GALLIUM_SHARD.get());
        tag(EternalOresItemMekTags.Items.CRYSTAL_GALLIUM_C).add(EternalOresMekanismCompatItems.GALLIUM_CRYSTAL.get());

        tag(EternalOresItemMekTags.Items.DIRTY_IRIDIUM_C).add(EternalOresMekanismCompatItems.IRIDIUM_DIRTY_DUST.get());
        tag(EternalOresItemMekTags.Items.CLUMP_IRIDIUM_C).add(EternalOresMekanismCompatItems.IRIDIUM_CLUMP.get());
        tag(EternalOresItemMekTags.Items.SHARD_IRIDIUM_C).add(EternalOresMekanismCompatItems.IRIDIUM_SHARD.get());
        tag(EternalOresItemMekTags.Items.CRYSTAL_IRIDIUM_C).add(EternalOresMekanismCompatItems.IRIDIUM_CRYSTAL.get());

        tag(EternalOresItemMekTags.Items.DIRTY_NICKEL_C).add(EternalOresMekanismCompatItems.NICKEL_DIRTY_DUST.get());
        tag(EternalOresItemMekTags.Items.CLUMP_NICKEL_C).add(EternalOresMekanismCompatItems.NICKEL_CLUMP.get());
        tag(EternalOresItemMekTags.Items.SHARD_NICKEL_C).add(EternalOresMekanismCompatItems.NICKEL_SHARD.get());
        tag(EternalOresItemMekTags.Items.CRYSTAL_NICKEL_C).add(EternalOresMekanismCompatItems.NICKEL_CRYSTAL.get());

        tag(EternalOresItemMekTags.Items.DIRTY_PLATINUM_C).add(EternalOresMekanismCompatItems.PLATINUM_DIRTY_DUST.get());
        tag(EternalOresItemMekTags.Items.CLUMP_PLATINUM_C).add(EternalOresMekanismCompatItems.PLATINUM_CLUMP.get());
        tag(EternalOresItemMekTags.Items.SHARD_PLATINUM_C).add(EternalOresMekanismCompatItems.PLATINUM_SHARD.get());
        tag(EternalOresItemMekTags.Items.CRYSTAL_PLATINUM_C).add(EternalOresMekanismCompatItems.PLATINUM_CRYSTAL.get());

        tag(EternalOresItemMekTags.Items.DIRTY_SILVER_C).add(EternalOresMekanismCompatItems.SILVER_DIRTY_DUST.get());
        tag(EternalOresItemMekTags.Items.CLUMP_SILVER_C).add(EternalOresMekanismCompatItems.SILVER_CLUMP.get());
        tag(EternalOresItemMekTags.Items.SHARD_SILVER_C).add(EternalOresMekanismCompatItems.SILVER_SHARD.get());
        tag(EternalOresItemMekTags.Items.CRYSTAL_SILVER_C).add(EternalOresMekanismCompatItems.SILVER_CRYSTAL.get());

        tag(EternalOresItemMekTags.Items.DIRTY_URANINITE_C).add(EternalOresMekanismCompatItems.URANINITE_DIRTY_DUST.get());
        tag(EternalOresItemMekTags.Items.CLUMP_URANINITE_C).add(EternalOresMekanismCompatItems.URANINITE_CLUMP.get());
        tag(EternalOresItemMekTags.Items.SHARD_URANINITE_C).add(EternalOresMekanismCompatItems.URANINITE_SHARD.get());
        tag(EternalOresItemMekTags.Items.CRYSTAL_URANINITE_C).add(EternalOresMekanismCompatItems.URANINITE_CRYSTAL.get());

        tag(EternalOresItemMekTags.Items.DIRTY_ZINC_C).add(EternalOresMekanismCompatItems.ZINC_DIRTY_DUST.get());
        tag(EternalOresItemMekTags.Items.CLUMP_ZINC_C).add(EternalOresMekanismCompatItems.ZINC_CLUMP.get());
        tag(EternalOresItemMekTags.Items.SHARD_ZINC_C).add(EternalOresMekanismCompatItems.ZINC_SHARD.get());
        tag(EternalOresItemMekTags.Items.CRYSTAL_ZINC_C).add(EternalOresMekanismCompatItems.ZINC_CRYSTAL.get());

        /// By Mekansim
        tag(MekanismTags.Items.DIRTY_DUSTS).add(EternalOresMekanismCompatItems.ALUMINUM_DIRTY_DUST.get());
        tag(MekanismTags.Items.CLUMPS).add(EternalOresMekanismCompatItems.ALUMINUM_CLUMP.get());
        tag(MekanismTags.Items.SHARDS).add(EternalOresMekanismCompatItems.ALUMINUM_SHARD.get());
        tag(MekanismTags.Items.CRYSTALS).add(EternalOresMekanismCompatItems.ALUMINUM_CRYSTAL.get());

        tag(MekanismTags.Items.DIRTY_DUSTS).add(EternalOresMekanismCompatItems.CATALYRIUM_DIRTY_DUST.get());
        tag(MekanismTags.Items.CLUMPS).add(EternalOresMekanismCompatItems.CATALYRIUM_CLUMP.get());
        tag(MekanismTags.Items.SHARDS).add(EternalOresMekanismCompatItems.CATALYRIUM_SHARD.get());
        tag(MekanismTags.Items.CRYSTALS).add(EternalOresMekanismCompatItems.CATALYRIUM_CRYSTAL.get());

        tag(MekanismTags.Items.DIRTY_DUSTS).add(EternalOresMekanismCompatItems.COBALT_DIRTY_DUST.get());
        tag(MekanismTags.Items.CLUMPS).add(EternalOresMekanismCompatItems.COBALT_CLUMP.get());
        tag(MekanismTags.Items.SHARDS).add(EternalOresMekanismCompatItems.COBALT_SHARD.get());
        tag(MekanismTags.Items.CRYSTALS).add(EternalOresMekanismCompatItems.COBALT_CRYSTAL.get());

        tag(MekanismTags.Items.DIRTY_DUSTS).add(EternalOresMekanismCompatItems.GALLIUM_DIRTY_DUST.get());
        tag(MekanismTags.Items.CLUMPS).add(EternalOresMekanismCompatItems.GALLIUM_CLUMP.get());
        tag(MekanismTags.Items.SHARDS).add(EternalOresMekanismCompatItems.GALLIUM_SHARD.get());
        tag(MekanismTags.Items.CRYSTALS).add(EternalOresMekanismCompatItems.GALLIUM_CRYSTAL.get());

        tag(MekanismTags.Items.DIRTY_DUSTS).add(EternalOresMekanismCompatItems.IRIDIUM_DIRTY_DUST.get());
        tag(MekanismTags.Items.CLUMPS).add(EternalOresMekanismCompatItems.IRIDIUM_CLUMP.get());
        tag(MekanismTags.Items.SHARDS).add(EternalOresMekanismCompatItems.IRIDIUM_SHARD.get());
        tag(MekanismTags.Items.CRYSTALS).add(EternalOresMekanismCompatItems.IRIDIUM_CRYSTAL.get());

        tag(MekanismTags.Items.DIRTY_DUSTS).add(EternalOresMekanismCompatItems.NICKEL_DIRTY_DUST.get());
        tag(MekanismTags.Items.CLUMPS).add(EternalOresMekanismCompatItems.NICKEL_CLUMP.get());
        tag(MekanismTags.Items.SHARDS).add(EternalOresMekanismCompatItems.NICKEL_SHARD.get());
        tag(MekanismTags.Items.CRYSTALS).add(EternalOresMekanismCompatItems.NICKEL_CRYSTAL.get());

        tag(MekanismTags.Items.DIRTY_DUSTS).add(EternalOresMekanismCompatItems.PLATINUM_DIRTY_DUST.get());
        tag(MekanismTags.Items.CLUMPS).add(EternalOresMekanismCompatItems.PLATINUM_CLUMP.get());
        tag(MekanismTags.Items.SHARDS).add(EternalOresMekanismCompatItems.PLATINUM_SHARD.get());
        tag(MekanismTags.Items.CRYSTALS).add(EternalOresMekanismCompatItems.PLATINUM_CRYSTAL.get());

        tag(MekanismTags.Items.DIRTY_DUSTS).add(EternalOresMekanismCompatItems.SILVER_DIRTY_DUST.get());
        tag(MekanismTags.Items.CLUMPS).add(EternalOresMekanismCompatItems.SILVER_CLUMP.get());
        tag(MekanismTags.Items.SHARDS).add(EternalOresMekanismCompatItems.SILVER_SHARD.get());
        tag(MekanismTags.Items.CRYSTALS).add(EternalOresMekanismCompatItems.SILVER_CRYSTAL.get());

        tag(MekanismTags.Items.DIRTY_DUSTS).add(EternalOresMekanismCompatItems.URANINITE_DIRTY_DUST.get());
        tag(MekanismTags.Items.CLUMPS).add(EternalOresMekanismCompatItems.URANINITE_CLUMP.get());
        tag(MekanismTags.Items.SHARDS).add(EternalOresMekanismCompatItems.URANINITE_SHARD.get());
        tag(MekanismTags.Items.CRYSTALS).add(EternalOresMekanismCompatItems.URANINITE_CRYSTAL.get());

        tag(MekanismTags.Items.DIRTY_DUSTS).add(EternalOresMekanismCompatItems.ZINC_DIRTY_DUST.get());
        tag(MekanismTags.Items.CLUMPS).add(EternalOresMekanismCompatItems.ZINC_CLUMP.get());
        tag(MekanismTags.Items.SHARDS).add(EternalOresMekanismCompatItems.ZINC_SHARD.get());
        tag(MekanismTags.Items.CRYSTALS).add(EternalOresMekanismCompatItems.ZINC_CRYSTAL.get());
    }
}
