package net.radzratz.eternalitems.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.radzratz.eternalitems.EternalItems;
import net.radzratz.eternalitems.block.ModBlocks;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class EternalBlockTagProvider extends BlockTagsProvider {
    public EternalBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, EternalItems.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
            //PICKAXE
            tag(BlockTags.MINEABLE_WITH_PICKAXE)
                    //ORE BLOCKS
                    .add(ModBlocks.ALUMINUM_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_ALUMINUM_ORE_BLOCK.get())
                    .add(ModBlocks.COBALT_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_COBALT_ORE_BLOCK.get())
                    .add(ModBlocks.FLUORITE_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_FLUORITE_ORE_BLOCK.get())
                    .add(ModBlocks.LEAD_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_LEAD_ORE_BLOCK.get())
                    .add(ModBlocks.NICKEL_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_NICKEL_ORE_BLOCK.get())
                    .add(ModBlocks.OSMIUM_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_OSMIUM_ORE_BLOCK.get())
                    .add(ModBlocks.PLATINUM_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_PLUTONIUM_ORE_BLOCK.get())
                    .add(ModBlocks.PLUTONIUM_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_PLATINUM_ORE_BLOCK.get())
                    .add(ModBlocks.SULFUR_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_SULFUR_ORE_BLOCK.get())
                    .add(ModBlocks.TIN_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_TIN_ORE_BLOCK.get())
                    .add(ModBlocks.URANIUM_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_URANIUM_ORE_BLOCK.get())
                    .add(ModBlocks.SILVER_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_SILVER_ORE_BLOCK.get())
                    //METAL BLOCKS
                    .add(ModBlocks.ALUMINUM_BLOCK.get())
                    .add(ModBlocks.BRONZE_BLOCK.get())
                    .add(ModBlocks.COBALT_BLOCK.get())
                    .add(ModBlocks.ELECTRUM_BLOCK.get())
                    .add(ModBlocks.ENDERIUM_BLOCK.get())
                    .add(ModBlocks.INVAR_BLOCK.get())
                    .add(ModBlocks.LEAD_BLOCK.get())
                    .add(ModBlocks.LUMIUM_BLOCK.get())
                    .add(ModBlocks.NICKEL_BLOCK.get())
                    .add(ModBlocks.OSMIUM_BLOCK.get())
                    .add(ModBlocks.PLATINUM_BLOCK.get())
                    .add(ModBlocks.PLUTONIUM_BLOCK.get())
                    .add(ModBlocks.TIN_BLOCK.get())
                    .add(ModBlocks.SIGNALUM_BLOCK.get())
                    .add(ModBlocks.ULTIMATITANIUM_BLOCK.get())
                    .add(ModBlocks.URANIUM_BLOCK.get())
                    .add(ModBlocks.SILVER_BLOCK.get())
                    //RAW ORE BLOCKS
                    .add(ModBlocks.RAW_ALUMINUM_BLOCK.get())
                    .add(ModBlocks.RAW_COBALT_BLOCK.get())
                    .add(ModBlocks.RAW_LEAD_BLOCK.get())
                    .add(ModBlocks.RAW_NICKEL_BLOCK.get())
                    .add(ModBlocks.RAW_OSMIUM_BLOCK.get())
                    .add(ModBlocks.RAW_PLATINUM_BLOCK.get())
                    .add(ModBlocks.RAW_PLUTONIUM_BLOCK.get())
                    .add(ModBlocks.RAW_SILVER_BLOCK.get())
                    .add(ModBlocks.SULFUR_BLOCK.get())
                    .add(ModBlocks.RAW_TIN_BLOCK.get())
                    .add(ModBlocks.RAW_URANIUM_BLOCK.get());

            tag(BlockTags.NEEDS_IRON_TOOL)
                    //ORE BLOCKS
                    .add(ModBlocks.ALUMINUM_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_ALUMINUM_ORE_BLOCK.get())
                    .add(ModBlocks.FLUORITE_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_FLUORITE_ORE_BLOCK.get())
                    .add(ModBlocks.NICKEL_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_NICKEL_ORE_BLOCK.get())
                    .add(ModBlocks.OSMIUM_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_OSMIUM_ORE_BLOCK.get())
                    .add(ModBlocks.SULFUR_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_SULFUR_ORE_BLOCK.get())
                    .add(ModBlocks.TIN_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_TIN_ORE_BLOCK.get())
                    .add(ModBlocks.SILVER_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_SILVER_ORE_BLOCK.get())
                    //METAL BLOCKS
                    .add(ModBlocks.ALUMINUM_BLOCK.get())
                    .add(ModBlocks.BRONZE_BLOCK.get())
                    .add(ModBlocks.COBALT_BLOCK.get())
                    .add(ModBlocks.ELECTRUM_BLOCK.get())
                    .add(ModBlocks.ENDERIUM_BLOCK.get())
                    .add(ModBlocks.INVAR_BLOCK.get())
                    .add(ModBlocks.LEAD_BLOCK.get())
                    .add(ModBlocks.LUMIUM_BLOCK.get())
                    .add(ModBlocks.NICKEL_BLOCK.get())
                    .add(ModBlocks.OSMIUM_BLOCK.get())
                    .add(ModBlocks.PLATINUM_BLOCK.get())
                    .add(ModBlocks.PLUTONIUM_BLOCK.get())
                    .add(ModBlocks.TIN_BLOCK.get())
                    .add(ModBlocks.SIGNALUM_BLOCK.get())
                    .add(ModBlocks.ULTIMATITANIUM_BLOCK.get())
                    .add(ModBlocks.URANIUM_BLOCK.get())
                    .add(ModBlocks.SILVER_BLOCK.get())
                    //RAW ORE BLOCKS
                    .add(ModBlocks.RAW_ALUMINUM_BLOCK.get())
                    .add(ModBlocks.RAW_COBALT_BLOCK.get())
                    .add(ModBlocks.RAW_LEAD_BLOCK.get())
                    .add(ModBlocks.RAW_NICKEL_BLOCK.get())
                    .add(ModBlocks.RAW_OSMIUM_BLOCK.get())
                    .add(ModBlocks.RAW_PLATINUM_BLOCK.get())
                    .add(ModBlocks.RAW_PLUTONIUM_BLOCK.get())
                    .add(ModBlocks.RAW_SILVER_BLOCK.get())
                    .add(ModBlocks.SULFUR_BLOCK.get())
                    .add(ModBlocks.RAW_TIN_BLOCK.get())
                    .add(ModBlocks.RAW_URANIUM_BLOCK.get());

            tag(BlockTags.NEEDS_DIAMOND_TOOL)
                    .add(ModBlocks.COBALT_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_COBALT_ORE_BLOCK.get())
                    .add(ModBlocks.LEAD_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_LEAD_ORE_BLOCK.get())
                    .add(ModBlocks.PLATINUM_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_PLATINUM_ORE_BLOCK.get())
                    .add(ModBlocks.PLUTONIUM_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_PLUTONIUM_ORE_BLOCK.get())
                    .add(ModBlocks.URANIUM_ORE_BLOCK.get())
                    .add(ModBlocks.DEEPSLATE_URANIUM_ORE_BLOCK.get());

    }
}
