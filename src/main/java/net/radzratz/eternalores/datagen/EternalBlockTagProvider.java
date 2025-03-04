package net.radzratz.eternalores.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.block.EternalGeneralBlocks;
import net.radzratz.eternalores.util.tags.EternalCompressedBlockTags;
import net.radzratz.eternalores.util.tags.block.EternalGeneralBlockTags;
import net.radzratz.eternalores.util.tags.block.ores.EternalOreBlockTags;
import net.radzratz.eternalores.util.tags.block.storage_blocks.EternalStorageGemBlockTags;
import net.radzratz.eternalores.util.tags.block.storage_blocks.EternalStorageMetalBlockTags;
import net.radzratz.eternalores.util.tags.block.storage_blocks.EternalStorageRawOreBlockTags;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class EternalBlockTagProvider extends BlockTagsProvider {
    public EternalBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, EternalOres.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {

        System.out.println("Loading Block Tags");

            //Individual Storage Blocks
            tag(EternalStorageMetalBlockTags.Blocks.ALUMINUM_BLOCK_ST).add(EternalGeneralBlocks.ALUMINUM_BLOCK.get());
            tag(EternalStorageMetalBlockTags.Blocks.BLUE_STEEL_BLOCK_ST).add(EternalGeneralBlocks.BLUE_STEEL_BLOCK.get());
            tag(EternalStorageMetalBlockTags.Blocks.BRASS_BLOCK_ST).add(EternalGeneralBlocks.BRASS_BLOCK.get());
            tag(EternalStorageMetalBlockTags.Blocks.BRITANNIA_BLOCK_ST).add(EternalGeneralBlocks.BRITANNIA_SILVER_BLOCK.get());
            tag(EternalStorageMetalBlockTags.Blocks.BRONZE_BLOCK_ST).add(EternalGeneralBlocks.BRONZE_BLOCK.get());
            tag(EternalStorageMetalBlockTags.Blocks.CAST_IRON_BLOCK_ST).add(EternalGeneralBlocks.CAST_IRON_BLOCK.get());
            tag(EternalStorageMetalBlockTags.Blocks.CAST_STEEL_BLOCK_ST).add(EternalGeneralBlocks.CAST_STEEL_BLOCK.get());
            tag(EternalStorageMetalBlockTags.Blocks.COBALT_BLOCK_ST).add(EternalGeneralBlocks.COBALT_BLOCK.get());
            tag(EternalStorageMetalBlockTags.Blocks.CONSTANTAN_BLOCK_ST).add(EternalGeneralBlocks.CONSTANTAN_BLOCK.get());
            tag(EternalStorageMetalBlockTags.Blocks.ELECTRUM_BLOCK_ST).add(EternalGeneralBlocks.ELECTRUM_BLOCK.get());
            tag(EternalStorageMetalBlockTags.Blocks.ENDERIUM_BLOCK_ST).add(EternalGeneralBlocks.ENDERIUM_BLOCK.get());
            tag(EternalStorageMetalBlockTags.Blocks.GALLIUM_BLOCK_ST).add(EternalGeneralBlocks.GALLIUM_BLOCK.get());
            tag(EternalStorageMetalBlockTags.Blocks.INVAR_BLOCK_ST).add(EternalGeneralBlocks.INVAR_BLOCK.get());
            tag(EternalStorageMetalBlockTags.Blocks.IRIDIUM_BLOCK_ST).add(EternalGeneralBlocks.IRIDIUM_BLOCK.get());
            tag(EternalStorageMetalBlockTags.Blocks.LEAD_BLOCK_ST).add(EternalGeneralBlocks.LEAD_BLOCK.get());
            tag(EternalStorageMetalBlockTags.Blocks.LUMIUM_BLOCK_ST).add(EternalGeneralBlocks.LUMIUM_BLOCK.get());
            tag(EternalStorageMetalBlockTags.Blocks.NETHERSTEEL_BLOCK_ST).add(EternalGeneralBlocks.NETHERSTEEL_BLOCK.get());
            tag(EternalStorageMetalBlockTags.Blocks.NICKEL_BLOCK_ST).add(EternalGeneralBlocks.NICKEL_BLOCK.get());
            tag(EternalStorageMetalBlockTags.Blocks.OSMIUM_BLOCK_ST).add(EternalGeneralBlocks.OSMIUM_BLOCK.get());
            tag(EternalStorageMetalBlockTags.Blocks.PEWTER_BLOCK_ST).add(EternalGeneralBlocks.PEWTER_BLOCK.get());
            tag(EternalStorageMetalBlockTags.Blocks.PLATINUM_BLOCK_ST).add(EternalGeneralBlocks.PLATINUM_BLOCK.get());
            tag(EternalStorageMetalBlockTags.Blocks.ROSE_GOLD_BLOCK_ST).add(EternalGeneralBlocks.ROSE_GOLD_BLOCK.get());
            tag(EternalStorageMetalBlockTags.Blocks.SIGNALUM_BLOCK_ST).add(EternalGeneralBlocks.SIGNALUM_BLOCK.get());
            tag(EternalStorageMetalBlockTags.Blocks.SILVER_BLOCK_ST).add(EternalGeneralBlocks.SILVER_BLOCK.get());
            tag(EternalStorageMetalBlockTags.Blocks.SHADOWSTEEL_BLOCK_ST).add(EternalGeneralBlocks.SHADOWSTEEL_BLOCK.get());
            tag(EternalStorageMetalBlockTags.Blocks.STEEL_BLOCK_ST).add(EternalGeneralBlocks.STEEL_BLOCK.get());
            tag(EternalStorageMetalBlockTags.Blocks.TIN_BLOCK_ST).add(EternalGeneralBlocks.TIN_BLOCK.get());
            tag(EternalStorageMetalBlockTags.Blocks.TITANIUM_BLOCK_ST).add(EternalGeneralBlocks.TITANIUM_BLOCK.get());
            tag(EternalStorageMetalBlockTags.Blocks.URANINITE_BLOCK_ST).add(EternalGeneralBlocks.URANINITE_BLOCK.get());
            tag(EternalStorageMetalBlockTags.Blocks.URANIUM_BLOCK_ST).add(EternalGeneralBlocks.URANIUM_BLOCK.get());
            tag(EternalStorageMetalBlockTags.Blocks.WROUGHT_IRON_BLOCK_ST).add(EternalGeneralBlocks.WROUGHT_IRON_BLOCK.get());
            tag(EternalStorageMetalBlockTags.Blocks.ZINC_BLOCK_ST).add(EternalGeneralBlocks.ZINC_BLOCK.get());

            tag(EternalStorageGemBlockTags.Blocks.AMBER_BLOCK_ST).add(EternalGeneralBlocks.AMBER_BLOCK.get());
            tag(EternalStorageGemBlockTags.Blocks.APATITE_BLOCK_ST).add(EternalGeneralBlocks.APATITE_BLOCK.get());
            tag(EternalStorageGemBlockTags.Blocks.CINNABAR_BLOCK_ST).add(EternalGeneralBlocks.CINNABAR_BLOCK.get());
            tag(EternalStorageGemBlockTags.Blocks.FLUORITE_BLOCK_ST).add(EternalGeneralBlocks.FLUORITE_BLOCK.get());
            tag(EternalStorageGemBlockTags.Blocks.NITER_BLOCK_ST).add(EternalGeneralBlocks.NITER_BLOCK.get());
            tag(EternalStorageGemBlockTags.Blocks.ONYX_BLOCK_ST).add(EternalGeneralBlocks.ONYX_BLOCK.get());
            tag(EternalStorageGemBlockTags.Blocks.PERIDOT_BLOCK_ST).add(EternalGeneralBlocks.PERIDOT_BLOCK.get());
            tag(EternalStorageGemBlockTags.Blocks.RUBY_BLOCK_ST).add(EternalGeneralBlocks.RUBY_BLOCK.get());
            tag(EternalStorageGemBlockTags.Blocks.SAPPHIRE_BLOCK_ST).add(EternalGeneralBlocks.SAPPHIRE_BLOCK.get());

            tag(EternalStorageRawOreBlockTags.Blocks.RAW_ALUMINUM_ST).add(EternalGeneralBlocks.RAW_ALUMINUM_BLOCK.get());
            tag(EternalStorageRawOreBlockTags.Blocks.RAW_COBALT_ST).add(EternalGeneralBlocks.RAW_COBALT_BLOCK.get());
            tag(EternalStorageRawOreBlockTags.Blocks.RAW_GALLIUM_ST).add(EternalGeneralBlocks.RAW_GALLIUM_BLOCK.get());
            tag(EternalStorageRawOreBlockTags.Blocks.RAW_IRIDIUM_ST).add(EternalGeneralBlocks.RAW_IRIDIUM_BLOCK.get());
            tag(EternalStorageRawOreBlockTags.Blocks.RAW_LEAD_ST).add(EternalGeneralBlocks.RAW_LEAD_BLOCK.get());
            tag(EternalStorageRawOreBlockTags.Blocks.RAW_NICKEL_ST).add(EternalGeneralBlocks.RAW_NICKEL_BLOCK.get());
            tag(EternalStorageRawOreBlockTags.Blocks.RAW_OSMIUM_ST).add(EternalGeneralBlocks.RAW_OSMIUM_BLOCK.get());
            tag(EternalStorageRawOreBlockTags.Blocks.RAW_PLATINUM_ST).add(EternalGeneralBlocks.RAW_PLATINUM_BLOCK.get());
            tag(EternalStorageRawOreBlockTags.Blocks.RAW_SILVER_ST).add(EternalGeneralBlocks.RAW_SILVER_BLOCK.get());
            tag(EternalStorageRawOreBlockTags.Blocks.SULFUR_ST).add(EternalGeneralBlocks.SULFUR_BLOCK.get());
            tag(EternalStorageRawOreBlockTags.Blocks.RAW_TIN_ST).add(EternalGeneralBlocks.RAW_TIN_BLOCK.get());
            tag(EternalStorageRawOreBlockTags.Blocks.RAW_URANINITE_ST).add(EternalGeneralBlocks.RAW_URANINITE_BLOCK.get());
            tag(EternalStorageRawOreBlockTags.Blocks.RAW_URANIUM_ST).add(EternalGeneralBlocks.RAW_URANIUM_BLOCK.get());
            tag(EternalStorageRawOreBlockTags.Blocks.RAW_ZINC_ST).add(EternalGeneralBlocks.RAW_ZINC_BLOCK.get());

            //Gem Blocks
            tag(EternalGeneralBlockTags.Blocks.GEM_BLOCK)
                    .add(EternalGeneralBlocks.AMBER_BLOCK.get())
                    .add(EternalGeneralBlocks.APATITE_BLOCK.get())
                    .add(EternalGeneralBlocks.CINNABAR_BLOCK.get())
                    .add(EternalGeneralBlocks.FLUORITE_BLOCK.get())
                    .add(EternalGeneralBlocks.NITER_BLOCK.get())
                    .add(EternalGeneralBlocks.ONYX_BLOCK.get())
                    .add(EternalGeneralBlocks.PERIDOT_BLOCK.get())
                    .add(EternalGeneralBlocks.RUBY_BLOCK.get())
                    .add(EternalGeneralBlocks.SAPPHIRE_BLOCK.get());

            //Metal Blocks
            tag(EternalGeneralBlockTags.Blocks.METAL_BLOCK)
                    .add(EternalGeneralBlocks.ALUMINUM_BLOCK.get())
                    .add(EternalGeneralBlocks.BRASS_BLOCK.get())
                    .add(EternalGeneralBlocks.BRONZE_BLOCK.get())
                    .add(EternalGeneralBlocks.BRITANNIA_SILVER_BLOCK.get())
                    .add(EternalGeneralBlocks.BLUE_STEEL_BLOCK.get())
                    .add(EternalGeneralBlocks.CAST_IRON_BLOCK.get())
                    .add(EternalGeneralBlocks.COBALT_BLOCK.get())
                    .add(EternalGeneralBlocks.CONSTANTAN_BLOCK.get())
                    .add(EternalGeneralBlocks.ELECTRUM_BLOCK.get())
                    .add(EternalGeneralBlocks.ENDERIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.GALLIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.GRAPHITE_BLOCK.get())
                    .add(EternalGeneralBlocks.INVAR_BLOCK.get())
                    .add(EternalGeneralBlocks.IRIDIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.LEAD_BLOCK.get())
                    .add(EternalGeneralBlocks.LUMIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.NETHERSTEEL_BLOCK.get())
                    .add(EternalGeneralBlocks.NICKEL_BLOCK.get())
                    .add(EternalGeneralBlocks.OSMIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.PEWTER_BLOCK.get())
                    .add(EternalGeneralBlocks.PLATINUM_BLOCK.get())
                    .add(EternalGeneralBlocks.PLUTONIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.ROSE_GOLD_BLOCK.get())
                    .add(EternalGeneralBlocks.SILVER_BLOCK.get())
                    .add(EternalGeneralBlocks.SIGNALUM_BLOCK.get())
                    .add(EternalGeneralBlocks.SHADOWSTEEL_BLOCK.get())
                    .add(EternalGeneralBlocks.STEEL_BLOCK.get())
                    .add(EternalGeneralBlocks.TIN_BLOCK.get())
                    .add(EternalGeneralBlocks.TITANIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.ULTIMATITANIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.URANINITE_BLOCK.get())
                    .add(EternalGeneralBlocks.URANIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.WROUGHT_IRON_BLOCK.get())
                    .add(EternalGeneralBlocks.ZINC_BLOCK.get());

            //Raw Ore Blocks
            tag(EternalGeneralBlockTags.Blocks.RAW_ORE_BLOCK)
                    .add(EternalGeneralBlocks.RAW_ALUMINUM_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_COBALT_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_IRIDIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_LEAD_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_NICKEL_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_OSMIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_PLATINUM_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_PLUTONIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_SILVER_BLOCK.get())
                    .add(EternalGeneralBlocks.SULFUR_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_TIN_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_URANINITE_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_URANIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_ZINC_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_GALLIUM_BLOCK.get());

            //Individual Ores Tag
            tag(EternalOreBlockTags.Blocks.ALUMINUM_ORE_OW).add(EternalGeneralBlocks.ALUMINUM_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.ALUMINUM_ORE_OW).add(EternalGeneralBlocks.DEEPSLATE_ALUMINUM_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.AMBER_ORE_OW).add(EternalGeneralBlocks.AMBER_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.AMBER_ORE_OW).add(EternalGeneralBlocks.DEEPSLATE_AMBER_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.APATITE_ORE_OW).add(EternalGeneralBlocks.APATITE_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.APATITE_ORE_OW).add(EternalGeneralBlocks.DEEPSLATE_APATITE_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.CINNABAR_ORE_OW).add(EternalGeneralBlocks.CINNABAR_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.CINNABAR_ORE_OW).add(EternalGeneralBlocks.DEEPSLATE_CINNABAR_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.COBALT_ORE_OW).add(EternalGeneralBlocks.COBALT_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.COBALT_ORE_OW).add(EternalGeneralBlocks.DEEPSLATE_COBALT_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.FLUORITE_ORE_OW).add(EternalGeneralBlocks.FLUORITE_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.FLUORITE_ORE_OW).add(EternalGeneralBlocks.DEEPSLATE_FLUORITE_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.GALLIUM_ORE_OW).add(EternalGeneralBlocks.GALLIUM_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.GALLIUM_ORE_OW).add(EternalGeneralBlocks.DEEPSLATE_GALLIUM_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.IRIDIUM_ORE_OW).add(EternalGeneralBlocks.IRIDIUM_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.IRIDIUM_ORE_OW).add(EternalGeneralBlocks.DEEPSLATE_IRIDIUM_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.LEAD_ORE_OW).add(EternalGeneralBlocks.LEAD_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.LEAD_ORE_OW).add(EternalGeneralBlocks.DEEPSLATE_LEAD_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.NICKEL_ORE_OW).add(EternalGeneralBlocks.NICKEL_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.NICKEL_ORE_OW).add(EternalGeneralBlocks.DEEPSLATE_NICKEL_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.NITER_ORE_OW).add(EternalGeneralBlocks.NITER_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.NITER_ORE_OW).add(EternalGeneralBlocks.DEEPSLATE_NITER_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.OBSIDIAN_ORE_NETHER).add(EternalGeneralBlocks.OBSIDIAN_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.ONYX_ORE_OW).add(EternalGeneralBlocks.ONYX_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.ONYX_ORE_OW).add(EternalGeneralBlocks.DEEPSLATE_ONYX_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.OSMIUM_ORE_OW).add(EternalGeneralBlocks.OSMIUM_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.OSMIUM_ORE_OW).add(EternalGeneralBlocks.DEEPSLATE_OSMIUM_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.PLATINUM_ORE_OW).add(EternalGeneralBlocks.PLATINUM_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.PLATINUM_ORE_OW).add(EternalGeneralBlocks.DEEPSLATE_PLATINUM_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.RUBY_ORE_OW).add(EternalGeneralBlocks.RUBY_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.RUBY_ORE_OW).add(EternalGeneralBlocks.DEEPSLATE_RUBY_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.SAPPHIRE_ORE_OW).add(EternalGeneralBlocks.SAPPHIRE_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.SAPPHIRE_ORE_OW).add(EternalGeneralBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.SILVER_ORE_OW).add(EternalGeneralBlocks.SILVER_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.SILVER_ORE_OW).add(EternalGeneralBlocks.DEEPSLATE_SILVER_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.SULFUR_ORE_OW).add(EternalGeneralBlocks.SULFUR_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.SULFUR_ORE_OW).add(EternalGeneralBlocks.DEEPSLATE_SULFUR_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.TIN_ORE_OW).add(EternalGeneralBlocks.TIN_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.TIN_ORE_OW).add(EternalGeneralBlocks.DEEPSLATE_TIN_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.URANINITE_ORE_OW).add(EternalGeneralBlocks.URANINITE_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.URANINITE_ORE_OW).add(EternalGeneralBlocks.DEEPSLATE_URANINITE_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.URANIUM_ORE_OW).add(EternalGeneralBlocks.URANIUM_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.URANIUM_ORE_OW).add(EternalGeneralBlocks.DEEPSLATE_URANIUM_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.ZINC_ORE_OW).add(EternalGeneralBlocks.ZINC_ORE_BLOCK.get());
            tag(EternalOreBlockTags.Blocks.ZINC_ORE_OW).add(EternalGeneralBlocks.DEEPSLATE_ZINC_ORE_BLOCK.get());

            //Ores Tag
            tag(Tags.Blocks.ORES)
                    .add(EternalGeneralBlocks.ALUMINUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_ALUMINUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.AMBER_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_AMBER_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.APATITE_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_APATITE_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.CINNABAR_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_CINNABAR_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.COBALT_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_COBALT_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.FLUORITE_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_FLUORITE_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.GALLIUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_GALLIUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.IRIDIUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_IRIDIUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.LEAD_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_LEAD_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.NICKEL_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_NICKEL_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.NITER_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_NITER_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.OBSIDIAN_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.ONYX_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_ONYX_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.OSMIUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_OSMIUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.PERIDOT_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_PERIDOT_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.PLATINUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_PLATINUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.PLUTONIUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_PLUTONIUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.RUBY_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_RUBY_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.SAPPHIRE_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.SILVER_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_SILVER_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.SULFUR_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_SULFUR_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.TIN_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_TIN_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.URANINITE_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_URANINITE_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.URANIUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_URANIUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.ZINC_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_ZINC_ORE_BLOCK.get());

            //Ores in Ground Stone
            tag(Tags.Blocks.ORES_IN_GROUND_STONE)
                    .add(EternalGeneralBlocks.ALUMINUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.AMBER_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.APATITE_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.CINNABAR_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.COBALT_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.FLUORITE_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.GALLIUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.IRIDIUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.LEAD_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.NICKEL_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.NITER_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.ONYX_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.OSMIUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.PLATINUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.PLUTONIUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.RUBY_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.SAPPHIRE_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.SULFUR_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.TIN_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.URANINITE_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.URANIUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.SILVER_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.ZINC_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.PERIDOT_ORE_BLOCK.get());

            //Ores in Ground Deepslate
            tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE)
                    .add(EternalGeneralBlocks.DEEPSLATE_ALUMINUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_AMBER_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_APATITE_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_CINNABAR_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_COBALT_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_FLUORITE_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_IRIDIUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_LEAD_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_NICKEL_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_NITER_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_ONYX_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_OSMIUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_PLUTONIUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_PLATINUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_RUBY_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_SULFUR_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_TIN_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_URANINITE_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_URANIUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_SILVER_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_ZINC_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_GALLIUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_PERIDOT_ORE_BLOCK.get());

            //Ores in Ground Netherrack
            tag(Tags.Blocks.ORES_IN_GROUND_NETHERRACK)
                    .add(EternalGeneralBlocks.OBSIDIAN_ORE_BLOCK.get());

            //Storage Blocks
            tag(Tags.Blocks.STORAGE_BLOCKS)
                    .add(EternalGeneralBlocks.ALUMINUM_BLOCK.get())
                    .add(EternalGeneralBlocks.AMBER_BLOCK.get())
                    .add(EternalGeneralBlocks.APATITE_BLOCK.get())
                    .add(EternalGeneralBlocks.BLUE_STEEL_BLOCK.get())
                    .add(EternalGeneralBlocks.BRASS_BLOCK.get())
                    .add(EternalGeneralBlocks.BRITANNIA_SILVER_BLOCK.get())
                    .add(EternalGeneralBlocks.BRONZE_BLOCK.get())
                    .add(EternalGeneralBlocks.CAST_IRON_BLOCK.get())
                    .add(EternalGeneralBlocks.CAST_STEEL_BLOCK.get())
                    .add(EternalGeneralBlocks.CINNABAR_BLOCK.get())
                    .add(EternalGeneralBlocks.COBALT_BLOCK.get())
                    .add(EternalGeneralBlocks.CONSTANTAN_BLOCK.get())
                    .add(EternalGeneralBlocks.ELECTRUM_BLOCK.get())
                    .add(EternalGeneralBlocks.ENDERIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.FLUORITE_BLOCK.get())
                    .add(EternalGeneralBlocks.GALLIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.GRAPHITE_BLOCK.get())
                    .add(EternalGeneralBlocks.INVAR_BLOCK.get())
                    .add(EternalGeneralBlocks.IRIDIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.LEAD_BLOCK.get())
                    .add(EternalGeneralBlocks.LUMIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.NETHERSTEEL_BLOCK.get())
                    .add(EternalGeneralBlocks.NICKEL_BLOCK.get())
                    .add(EternalGeneralBlocks.NITER_BLOCK.get())
                    .add(EternalGeneralBlocks.ONYX_BLOCK.get())
                    .add(EternalGeneralBlocks.OSMIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.PERIDOT_BLOCK.get())
                    .add(EternalGeneralBlocks.PEWTER_BLOCK.get())
                    .add(EternalGeneralBlocks.PLATINUM_BLOCK.get())
                    .add(EternalGeneralBlocks.PLUTONIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.ROSE_GOLD_BLOCK.get())
                    .add(EternalGeneralBlocks.RUBY_BLOCK.get())
                    .add(EternalGeneralBlocks.SAPPHIRE_BLOCK.get())
                    .add(EternalGeneralBlocks.SIGNALUM_BLOCK.get())
                    .add(EternalGeneralBlocks.SILVER_BLOCK.get())
                    .add(EternalGeneralBlocks.SHADOWSTEEL_BLOCK.get())
                    .add(EternalGeneralBlocks.STEEL_BLOCK.get())
                    .add(EternalGeneralBlocks.SULFUR_BLOCK.get())
                    .add(EternalGeneralBlocks.TIN_BLOCK.get())
                    .add(EternalGeneralBlocks.TITANIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.URANINITE_BLOCK.get())
                    .add(EternalGeneralBlocks.URANIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.WROUGHT_IRON_BLOCK.get())
                    .add(EternalGeneralBlocks.ZINC_BLOCK.get())

                    .add(EternalGeneralBlocks.RAW_ALUMINUM_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_COBALT_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_GALLIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_IRIDIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_LEAD_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_NICKEL_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_OSMIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_PLATINUM_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_PLUTONIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_SILVER_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_TIN_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_URANIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_URANINITE_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_ZINC_BLOCK.get())

                    //COMPRESSED BLOCKS
                    .add(EternalGeneralBlocks.COBBLE_1.get())
                    .add(EternalGeneralBlocks.COBBLE_2.get())
                    .add(EternalGeneralBlocks.COBBLE_3.get())
                    .add(EternalGeneralBlocks.COBBLE_4.get())
                    .add(EternalGeneralBlocks.COBBLE_5.get())
                    .add(EternalGeneralBlocks.COBBLE_6.get())
                    .add(EternalGeneralBlocks.COBBLE_7.get())
                    .add(EternalGeneralBlocks.COBBLE_8.get())
                    .add(EternalGeneralBlocks.COBBLE_9.get());

            //PICKAXE TAGS
            tag(BlockTags.MINEABLE_WITH_PICKAXE)
                    //ORE BLOCKS
                    .add(EternalGeneralBlocks.ALUMINUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_ALUMINUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.AMBER_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_AMBER_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.APATITE_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_APATITE_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.CINNABAR_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_CINNABAR_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.COBALT_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_COBALT_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.FLUORITE_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_FLUORITE_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.IRIDIUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_IRIDIUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.LEAD_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_LEAD_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.NICKEL_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_NICKEL_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.NITER_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_NITER_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.ONYX_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_ONYX_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.OSMIUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_OSMIUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.PLATINUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_PLUTONIUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.PLUTONIUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_PLATINUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.RUBY_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_RUBY_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.SAPPHIRE_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.SULFUR_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_SULFUR_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.TIN_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_TIN_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.URANIUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_URANIUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.SILVER_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_SILVER_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.ZINC_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_ZINC_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.GALLIUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_GALLIUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.PERIDOT_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_PERIDOT_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.OBSIDIAN_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.URANINITE_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_URANINITE_ORE_BLOCK.get())

                    //METAL BLOCKS
                    .add(EternalGeneralBlocks.ALUMINUM_BLOCK.get())
                    .add(EternalGeneralBlocks.BRASS_BLOCK.get())
                    .add(EternalGeneralBlocks.BRONZE_BLOCK.get())
                    .add(EternalGeneralBlocks.BRITANNIA_SILVER_BLOCK.get())
                    .add(EternalGeneralBlocks.BLUE_STEEL_BLOCK.get())
                    .add(EternalGeneralBlocks.CAST_IRON_BLOCK.get())
                    .add(EternalGeneralBlocks.CAST_STEEL_BLOCK.get())
                    .add(EternalGeneralBlocks.COBALT_BLOCK.get())
                    .add(EternalGeneralBlocks.CONSTANTAN_BLOCK.get())
                    .add(EternalGeneralBlocks.ELECTRUM_BLOCK.get())
                    .add(EternalGeneralBlocks.ENDERIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.GALLIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.GRAPHITE_BLOCK.get())
                    .add(EternalGeneralBlocks.INVAR_BLOCK.get())
                    .add(EternalGeneralBlocks.IRIDIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.LEAD_BLOCK.get())
                    .add(EternalGeneralBlocks.LUMIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.NETHERSTEEL_BLOCK.get())
                    .add(EternalGeneralBlocks.NICKEL_BLOCK.get())
                    .add(EternalGeneralBlocks.OSMIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.PEWTER_BLOCK.get())
                    .add(EternalGeneralBlocks.PLATINUM_BLOCK.get())
                    .add(EternalGeneralBlocks.PLUTONIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.ROSE_GOLD_BLOCK.get())
                    .add(EternalGeneralBlocks.SILVER_BLOCK.get())
                    .add(EternalGeneralBlocks.SIGNALUM_BLOCK.get())
                    .add(EternalGeneralBlocks.SHADOWSTEEL_BLOCK.get())
                    .add(EternalGeneralBlocks.STEEL_BLOCK.get())
                    .add(EternalGeneralBlocks.TIN_BLOCK.get())
                    .add(EternalGeneralBlocks.TITANIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.ULTIMATITANIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.URANINITE_BLOCK.get())
                    .add(EternalGeneralBlocks.URANIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.WROUGHT_IRON_BLOCK.get())
                    .add(EternalGeneralBlocks.ZINC_BLOCK.get())

                    //GEM BLOCKS
                    .add(EternalGeneralBlocks.AMBER_BLOCK.get())
                    .add(EternalGeneralBlocks.APATITE_BLOCK.get())
                    .add(EternalGeneralBlocks.CINNABAR_BLOCK.get())
                    .add(EternalGeneralBlocks.FLUORITE_BLOCK.get())
                    .add(EternalGeneralBlocks.NITER_BLOCK.get())
                    .add(EternalGeneralBlocks.ONYX_BLOCK.get())
                    .add(EternalGeneralBlocks.PERIDOT_BLOCK.get())
                    .add(EternalGeneralBlocks.RUBY_BLOCK.get())
                    .add(EternalGeneralBlocks.SAPPHIRE_BLOCK.get())

                    //RAW ORE BLOCKS
                    .add(EternalGeneralBlocks.RAW_ALUMINUM_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_COBALT_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_IRIDIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_LEAD_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_NICKEL_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_OSMIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_PLATINUM_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_PLUTONIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_SILVER_BLOCK.get())
                    .add(EternalGeneralBlocks.SULFUR_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_TIN_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_URANINITE_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_URANIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_ZINC_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_GALLIUM_BLOCK.get())

                    //COMPRESSED BLOCKS
                    .add(EternalGeneralBlocks.COBBLE_1.get())
                    .add(EternalGeneralBlocks.COBBLE_2.get())
                    .add(EternalGeneralBlocks.COBBLE_3.get())
                    .add(EternalGeneralBlocks.COBBLE_4.get())
                    .add(EternalGeneralBlocks.COBBLE_5.get())
                    .add(EternalGeneralBlocks.COBBLE_6.get())
                    .add(EternalGeneralBlocks.COBBLE_7.get())
                    .add(EternalGeneralBlocks.COBBLE_8.get())
                    .add(EternalGeneralBlocks.COBBLE_9.get());

            tag(BlockTags.NEEDS_STONE_TOOL)
                    .add(EternalGeneralBlocks.ALUMINUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_ALUMINUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.TIN_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_TIN_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.SULFUR_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_SULFUR_ORE_BLOCK.get())

                    //COMPRESSED BLOCKS
                    .add(EternalGeneralBlocks.COBBLE_1.get())
                    .add(EternalGeneralBlocks.COBBLE_2.get())
                    .add(EternalGeneralBlocks.COBBLE_3.get())
                    .add(EternalGeneralBlocks.COBBLE_4.get())
                    .add(EternalGeneralBlocks.COBBLE_5.get())
                    .add(EternalGeneralBlocks.COBBLE_6.get())
                    .add(EternalGeneralBlocks.COBBLE_7.get())
                    .add(EternalGeneralBlocks.COBBLE_8.get())
                    .add(EternalGeneralBlocks.COBBLE_9.get());

            tag(BlockTags.NEEDS_IRON_TOOL)
                    //ORE BLOCKS
                    .add(EternalGeneralBlocks.AMBER_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_AMBER_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.APATITE_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_APATITE_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.CINNABAR_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_CINNABAR_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.FLUORITE_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_FLUORITE_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.IRIDIUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_IRIDIUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.LEAD_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_LEAD_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.NICKEL_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_NICKEL_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.NITER_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_NITER_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.ONYX_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_ONYX_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.OSMIUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_OSMIUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.RUBY_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_RUBY_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.SAPPHIRE_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.SILVER_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_SILVER_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.ZINC_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_ZINC_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.GALLIUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_GALLIUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.PERIDOT_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_PERIDOT_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.URANIUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_URANIUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.PLATINUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_PLATINUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.URANINITE_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_URANINITE_ORE_BLOCK.get())

                    //METAL BLOCKS
                    .add(EternalGeneralBlocks.ALUMINUM_BLOCK.get())
                    .add(EternalGeneralBlocks.BRONZE_BLOCK.get())
                    .add(EternalGeneralBlocks.CAST_IRON_BLOCK.get())
                    .add(EternalGeneralBlocks.CAST_STEEL_BLOCK.get())
                    .add(EternalGeneralBlocks.COBALT_BLOCK.get())
                    .add(EternalGeneralBlocks.ELECTRUM_BLOCK.get())
                    .add(EternalGeneralBlocks.ENDERIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.INVAR_BLOCK.get())
                    .add(EternalGeneralBlocks.IRIDIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.LEAD_BLOCK.get())
                    .add(EternalGeneralBlocks.LUMIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.NICKEL_BLOCK.get())
                    .add(EternalGeneralBlocks.OSMIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.PLATINUM_BLOCK.get())
                    .add(EternalGeneralBlocks.PLUTONIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.TIN_BLOCK.get())
                    .add(EternalGeneralBlocks.SIGNALUM_BLOCK.get())
                    .add(EternalGeneralBlocks.ULTIMATITANIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.URANIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.SILVER_BLOCK.get())
                    .add(EternalGeneralBlocks.GRAPHITE_BLOCK.get())
                    .add(EternalGeneralBlocks.CONSTANTAN_BLOCK.get())
                    .add(EternalGeneralBlocks.BRASS_BLOCK.get())
                    .add(EternalGeneralBlocks.ZINC_BLOCK.get())
                    .add(EternalGeneralBlocks.STEEL_BLOCK.get())
                    .add(EternalGeneralBlocks.BLUE_STEEL_BLOCK.get())
                    .add(EternalGeneralBlocks.GALLIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.TITANIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.PEWTER_BLOCK.get())
                    .add(EternalGeneralBlocks.ROSE_GOLD_BLOCK.get())
                    .add(EternalGeneralBlocks.BRITANNIA_SILVER_BLOCK.get())
                    .add(EternalGeneralBlocks.CAST_IRON_BLOCK.get())
                    .add(EternalGeneralBlocks.URANINITE_BLOCK.get())
                    .add(EternalGeneralBlocks.WROUGHT_IRON_BLOCK.get())

                    //GEM BLOCKS
                    .add(EternalGeneralBlocks.AMBER_BLOCK.get())
                    .add(EternalGeneralBlocks.APATITE_BLOCK.get())
                    .add(EternalGeneralBlocks.CINNABAR_BLOCK.get())
                    .add(EternalGeneralBlocks.FLUORITE_BLOCK.get())
                    .add(EternalGeneralBlocks.NITER_BLOCK.get())
                    .add(EternalGeneralBlocks.ONYX_BLOCK.get())
                    .add(EternalGeneralBlocks.PERIDOT_BLOCK.get())
                    .add(EternalGeneralBlocks.RUBY_BLOCK.get())
                    .add(EternalGeneralBlocks.SAPPHIRE_BLOCK.get())

                    //RAW ORE BLOCKS
                    .add(EternalGeneralBlocks.RAW_ALUMINUM_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_COBALT_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_IRIDIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_LEAD_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_NICKEL_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_OSMIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_PLATINUM_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_PLUTONIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_SILVER_BLOCK.get())
                    .add(EternalGeneralBlocks.SULFUR_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_TIN_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_URANINITE_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_URANIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_GALLIUM_BLOCK.get())
                    .add(EternalGeneralBlocks.RAW_ZINC_BLOCK.get());

            tag(BlockTags.NEEDS_DIAMOND_TOOL)
                    .add(EternalGeneralBlocks.COBALT_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_COBALT_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.PLUTONIUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.DEEPSLATE_PLUTONIUM_ORE_BLOCK.get())
                    .add(EternalGeneralBlocks.OBSIDIAN_ORE_BLOCK.get())

                    .add(EternalGeneralBlocks.NETHERSTEEL_BLOCK.get())
                    .add(EternalGeneralBlocks.SHADOWSTEEL_BLOCK.get());

            //Individual Compressed Tags
            tag(EternalCompressedBlockTags.Blocks.COMPRESSED_COBBLESTONE).add(EternalGeneralBlocks.COBBLE_1.get());
            tag(EternalCompressedBlockTags.Blocks.COMPRESSED_COBBLESTONE).add(EternalGeneralBlocks.COBBLE_2.get());
            tag(EternalCompressedBlockTags.Blocks.COMPRESSED_COBBLESTONE).add(EternalGeneralBlocks.COBBLE_3.get());
            tag(EternalCompressedBlockTags.Blocks.COMPRESSED_COBBLESTONE).add(EternalGeneralBlocks.COBBLE_4.get());
            tag(EternalCompressedBlockTags.Blocks.COMPRESSED_COBBLESTONE).add(EternalGeneralBlocks.COBBLE_5.get());
            tag(EternalCompressedBlockTags.Blocks.COMPRESSED_COBBLESTONE).add(EternalGeneralBlocks.COBBLE_6.get());
            tag(EternalCompressedBlockTags.Blocks.COMPRESSED_COBBLESTONE).add(EternalGeneralBlocks.COBBLE_7.get());
            tag(EternalCompressedBlockTags.Blocks.COMPRESSED_COBBLESTONE).add(EternalGeneralBlocks.COBBLE_8.get());
            tag(EternalCompressedBlockTags.Blocks.COMPRESSED_COBBLESTONE).add(EternalGeneralBlocks.COBBLE_9.get());
    }
}
