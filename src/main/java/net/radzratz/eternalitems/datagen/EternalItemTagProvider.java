package net.radzratz.eternalitems.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.radzratz.eternalitems.EternalItems;
import net.radzratz.eternalitems.item.Moditems;
import net.radzratz.eternalitems.util.ModTags;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class EternalItemTagProvider extends ItemTagsProvider {
    public EternalItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                  CompletableFuture<TagLookup<Block>> blockTags,
                                  @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, EternalItems.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
                tag(ModTags.Items.COPPER_TOOLS)
                        .add(Moditems.COPPER_PICKAXE.get())
                        .add(Moditems.COPPER_SHOVEL.get())
                        .add(Moditems.COPPER_AXE.get())
                        .add(Moditems.COPPER_SWORD.get())
                        .add(Moditems.COPPER_HOE.get());

                tag(ModTags.Items.HAMMERS)
                        .add(Moditems.COPPER_HAMMER.get())
                        .add(Moditems.STONE_HAMMER.get())
                        .add(Moditems.DIAMOND_HAMMER.get())
                        .add(Moditems.IRON_HAMMER.get())
                        .add(Moditems.ETERNAL_DARK_HAMMER.get())
                        .add(Moditems.COBALT_HAMMER.get());

                tag(ModTags.Items.BONE_TOOLS)
                        .add(Moditems.BONE_KNIFE.get());

                tag(ModTags.Items.ETERNAL_DARK_TOOLS)
                        .add(Moditems.ETERNAL_DARK_PICKAXE.get())
                        .add(Moditems.ETERNAL_DARK_SWORD.get());
    }
}
