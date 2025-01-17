package net.radzratz.eternalores.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.item.Moditems;
import net.radzratz.eternalores.util.ModTags;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class EternalItemTagProvider extends ItemTagsProvider {
    public EternalItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                  CompletableFuture<TagLookup<Block>> blockTags,
                                  @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, EternalOres.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {

        System.out.println("Loading Custom Tool Tags");

                tag(ModTags.Items.HAMMERS)
                        .add(Moditems.COPPER_HAMMER.get())
                        .add(Moditems.STONE_HAMMER.get())
                        .add(Moditems.DIAMOND_HAMMER.get())
                        .add(Moditems.IRON_HAMMER.get())
                        //.add(Moditems.ETERNAL_DARK_HAMMER.get())
                        .add(Moditems.COBALT_HAMMER.get());

                tag(ModTags.Items.GEMCUTTER)
                        .add(Moditems.IRON_GEM_CUTTER.get());

    }
}
