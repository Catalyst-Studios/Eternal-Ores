package net.radzratz.eternalores.datagen.tags;

import appeng.core.definitions.AEBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.IntrinsicHolderTagsProvider;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.util.tags.block.EOBlockTagEntries;
import net.radzratz.eternalores.util.tags.block.util.ITagBlockEntryProvider;
import net.radzratz.eternalores.util.compat.geore.tags.GEOreBlockTagEntries;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import static net.minecraft.tags.BlockTags.MINEABLE_WITH_PICKAXE;
import static net.minecraft.world.level.block.Blocks.*;
import static net.radzratz.eternalores.util.EOMaterials.materialSets.*;
import static net.radzratz.eternalores.util.compat.iron_furnaces.EOIronFurnaceRegistries.CATALYRIUM_FURNACE;
import static net.radzratz.eternalores.util.tags.block.EOBlockTags.Common.*;
import static net.radzratz.eternalores.util.tags.block.EOBlockTags.DustBlocks.*;
import static net.radzratz.eternalores.util.tags.block.EOBlockTags.OreBlocks.*;
import static net.radzratz.eternalores.util.tags.block.EOBlockTags.StorageBlocks.*;

public class EOBlockTagProvider extends BlockTagsProvider {
    private final List<ITagBlockEntryProvider> entryProviders = new ArrayList<>();

    public EOBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, EternalOres.id, existingFileHelper);
        entryProviders.add(new EOBlockTagEntries());
        entryProviders.add(new GEOreBlockTagEntries());
    }

    public IntrinsicHolderTagsProvider.IntrinsicTagAppender<Block> getBlockTag(TagKey<Block> tag) {
         return super.tag(tag);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        tag(MINEABLE_WITH_PICKAXE).addOptional(CATALYRIUM_FURNACE.block().getId());

        for (ITagBlockEntryProvider tagProvider : entryProviders) {
            tagProvider.addTags(this, provider);
        }

        tag(MUSHROOM_BLOCKS).add(BROWN_MUSHROOM_BLOCK).add(RED_MUSHROOM_BLOCK).add(MUSHROOM_STEM);

        tag(BLOCK_STORAGE_COKE).add(COKE_SET.COAL_BLOCK.get());
        tag(BLOCK_STORAGE_COAL_COKE).add(COKE_SET.COAL_BLOCK.get());
        tag(BLOCK_STORAGE_SOURCE).add(SOURCE_SET.BLOCK.get());

        tag(BLOCK_DUST_COAL_COKE).add(COKE_SET.DUST_BLOCK.get());
        tag(BLOCK_DUST_COKE).add(COKE_SET.DUST_BLOCK.get());

        tag(BLOCK_URANINITE_ORE).add(URANINITE_SET.SLATE_ORE.get());
        tag(BLOCK_URANINITE_ORE).add(URANINITE_SET.ORE.get());

        tag(BLOCK_STORAGE_FLUIX).addOptional(AEBlocks.FLUIX_BLOCK.id());

        removal(BLOCK_STORAGE_COKE_COAL, COKE_SET.COAL_BLOCK.get());
        removal(BLOCK_DUST_COKE_COAL_R, COKE_SET.DUST_BLOCK.get());
        removal(BLOCK_STORAGE_FLUIX_R, FLUIX_SET.BLOCK.get());
        removal(BLOCK_STORAGE_SOURCE_R, SOURCE_SET.BLOCK.get());
    }

    private void removal(TagKey<Block> iTag, Block item) {
        tag(iTag).remove(item);
    }
}