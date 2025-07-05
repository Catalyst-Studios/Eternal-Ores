package net.radzratz.eternalores.datagen.tags;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.block.EOBlocks;
import net.radzratz.eternalores.util.tags.EOCompressedBlockTags;
import net.radzratz.eternalores.util.tags.block.EOGeneralBlockTags;
import net.radzratz.eternalores.util.tags.block.ores.EOOreBlockTags;
import net.radzratz.eternalores.util.tags.block.storage_blocks.EOStorageGemBlockTags;
import net.radzratz.eternalores.util.tags.block.storage_blocks.EOStorageMetalBlockTags;
import net.radzratz.eternalores.util.tags.block.storage_blocks.EOStorageMiscBlockTags;
import net.radzratz.eternalores.util.tags.block.storage_blocks.EOStorageRawOreBlockTags;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("all")
public class EOBlockTagProvider extends BlockTagsProvider
{
    public EOBlockTagProvider(PackOutput output,
                              CompletableFuture<HolderLookup.Provider> lookupProvider,
                              @Nullable ExistingFileHelper existingFileHelper)
    {
        super(output, lookupProvider, EternalOres.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider)
    {
            //Individual Storage Blocks
            tag(EOStorageMetalBlockTags.Blocks.ALUMINUM_BLOCK_ST).add(EOBlocks.ALUMINUM_BLOCK.get());
            tag(EOStorageMetalBlockTags.Blocks.ARDITE_BLOCK_ST).add(EOBlocks.ARDITE_BLOCK.get());
            tag(EOStorageMetalBlockTags.Blocks.CATALYRIUM_BLOCK_ST).add(EOBlocks.CATALYRIUM_BLOCK.get());
            tag(EOStorageMetalBlockTags.Blocks.BLUE_STEEL_BLOCK_ST).add(EOBlocks.BLUE_STEEL_BLOCK.get());
            tag(EOStorageMetalBlockTags.Blocks.BRASS_BLOCK_ST).add(EOBlocks.BRASS_BLOCK.get());
            tag(EOStorageMetalBlockTags.Blocks.BRITANNIA_BLOCK_ST).add(EOBlocks.BRITANNIA_SILVER_BLOCK.get());
            tag(EOStorageMetalBlockTags.Blocks.BRONZE_BLOCK_ST).add(EOBlocks.BRONZE_BLOCK.get());
            tag(EOStorageMetalBlockTags.Blocks.CAST_IRON_BLOCK_ST).add(EOBlocks.CAST_IRON_BLOCK.get());
            tag(EOStorageMetalBlockTags.Blocks.CAST_STEEL_BLOCK_ST).add(EOBlocks.CAST_STEEL_BLOCK.get());
            tag(EOStorageMetalBlockTags.Blocks.COBALT_BLOCK_ST).add(EOBlocks.COBALT_BLOCK.get());
            tag(EOStorageMetalBlockTags.Blocks.CONSTANTAN_BLOCK_ST).add(EOBlocks.CONSTANTAN_BLOCK.get());
            tag(EOStorageMetalBlockTags.Blocks.ELECTRUM_BLOCK_ST).add(EOBlocks.ELECTRUM_BLOCK.get());
            tag(EOStorageMetalBlockTags.Blocks.ENDERIUM_BLOCK_ST).add(EOBlocks.ENDERIUM_BLOCK.get());
            tag(EOStorageMetalBlockTags.Blocks.GALLIUM_BLOCK_ST).add(EOBlocks.GALLIUM_BLOCK.get());
            tag(EOStorageMetalBlockTags.Blocks.INVAR_BLOCK_ST).add(EOBlocks.INVAR_BLOCK.get());
            tag(EOStorageMetalBlockTags.Blocks.IRIDIUM_BLOCK_ST).add(EOBlocks.IRIDIUM_BLOCK.get());
            tag(EOStorageMetalBlockTags.Blocks.LEAD_BLOCK_ST).add(EOBlocks.LEAD_BLOCK.get());
            tag(EOStorageMetalBlockTags.Blocks.LUMIUM_BLOCK_ST).add(EOBlocks.LUMIUM_BLOCK.get());
            tag(EOStorageMetalBlockTags.Blocks.NETHERSTEEL_BLOCK_ST).add(EOBlocks.NETHERSTEEL_BLOCK.get());
            tag(EOStorageMetalBlockTags.Blocks.NICKEL_BLOCK_ST).add(EOBlocks.NICKEL_BLOCK.get());
            tag(EOStorageMetalBlockTags.Blocks.OSMIUM_BLOCK_ST).add(EOBlocks.OSMIUM_BLOCK.get());
            tag(EOStorageMetalBlockTags.Blocks.PEWTER_BLOCK_ST).add(EOBlocks.PEWTER_BLOCK.get());
            tag(EOStorageMetalBlockTags.Blocks.PIG_IRON_BLOCK_ST).add(EOBlocks.PIG_IRON_BLOCK.get());
            tag(EOStorageMetalBlockTags.Blocks.PLATINUM_BLOCK_ST).add(EOBlocks.PLATINUM_BLOCK.get());
            tag(EOStorageMetalBlockTags.Blocks.ROSE_GOLD_BLOCK_ST).add(EOBlocks.ROSE_GOLD_BLOCK.get());
            tag(EOStorageMetalBlockTags.Blocks.SIGNALUM_BLOCK_ST).add(EOBlocks.SIGNALUM_BLOCK.get());
            tag(EOStorageMetalBlockTags.Blocks.SILVER_BLOCK_ST).add(EOBlocks.SILVER_BLOCK.get());
            tag(EOStorageMetalBlockTags.Blocks.SHADOWSTEEL_BLOCK_ST).add(EOBlocks.SHADOWSTEEL_BLOCK.get());
            tag(EOStorageMetalBlockTags.Blocks.STEEL_BLOCK_ST).add(EOBlocks.STEEL_BLOCK.get());
            tag(EOStorageMetalBlockTags.Blocks.TIN_BLOCK_ST).add(EOBlocks.TIN_BLOCK.get());
            tag(EOStorageMetalBlockTags.Blocks.TITANIUM_BLOCK_ST).add(EOBlocks.TITANIUM_BLOCK.get());
            tag(EOStorageMetalBlockTags.Blocks.URANINITE_BLOCK_ST).add(EOBlocks.URANINITE_BLOCK.get());
            tag(EOStorageMetalBlockTags.Blocks.URANIUM_BLOCK_ST).add(EOBlocks.URANIUM_BLOCK.get());
            tag(EOStorageMetalBlockTags.Blocks.WROUGHT_IRON_BLOCK_ST).add(EOBlocks.WROUGHT_IRON_BLOCK.get());
            tag(EOStorageMetalBlockTags.Blocks.ZINC_BLOCK_ST).add(EOBlocks.ZINC_BLOCK.get());

            tag(EOStorageGemBlockTags.Blocks.AMBER_BLOCK_ST).add(EOBlocks.AMBER_BLOCK.get());
            tag(EOStorageGemBlockTags.Blocks.APATITE_BLOCK_ST).add(EOBlocks.APATITE_BLOCK.get());
            tag(EOStorageGemBlockTags.Blocks.CINNABAR_BLOCK_ST).add(EOBlocks.CINNABAR_BLOCK.get());
            tag(EOStorageGemBlockTags.Blocks.FLUORITE_BLOCK_ST).add(EOBlocks.FLUORITE_BLOCK.get());
            tag(EOStorageGemBlockTags.Blocks.NITER_BLOCK_ST).add(EOBlocks.NITER_BLOCK.get());
            tag(EOStorageGemBlockTags.Blocks.ONYX_BLOCK_ST).add(EOBlocks.ONYX_BLOCK.get());
            tag(EOStorageGemBlockTags.Blocks.PERIDOT_BLOCK_ST).add(EOBlocks.PERIDOT_BLOCK.get());
            tag(EOStorageGemBlockTags.Blocks.RUBY_BLOCK_ST).add(EOBlocks.RUBY_BLOCK.get());
            tag(EOStorageGemBlockTags.Blocks.SAPPHIRE_BLOCK_ST).add(EOBlocks.SAPPHIRE_BLOCK.get());
            tag(EOStorageGemBlockTags.Blocks.NECROTICARITE_BLOCK_ST).add(EOBlocks.NECROTICARITE_BLOCK.get());

            tag(EOStorageMiscBlockTags.Blocks.NETHER_STAR_BLOCK_ST).add(EOBlocks.NETHER_STAR_BLOCK.get());

            tag(EOStorageRawOreBlockTags.Blocks.RAW_ALUMINUM_ST).add(EOBlocks.RAW_ALUMINUM_BLOCK.get());
            tag(EOStorageRawOreBlockTags.Blocks.RAW_ARDITE_ST).add(EOBlocks.RAW_ARDITE_BLOCK.get());
            tag(EOStorageRawOreBlockTags.Blocks.RAW_CATALYRIUM_ST).add(EOBlocks.RAW_CATALYRIUM_BLOCK.get());
            tag(EOStorageRawOreBlockTags.Blocks.RAW_COBALT_ST).add(EOBlocks.RAW_COBALT_BLOCK.get());
            tag(EOStorageRawOreBlockTags.Blocks.RAW_GALLIUM_ST).add(EOBlocks.RAW_GALLIUM_BLOCK.get());
            tag(EOStorageRawOreBlockTags.Blocks.RAW_IRIDIUM_ST).add(EOBlocks.RAW_IRIDIUM_BLOCK.get());
            tag(EOStorageRawOreBlockTags.Blocks.RAW_LEAD_ST).add(EOBlocks.RAW_LEAD_BLOCK.get());
            tag(EOStorageRawOreBlockTags.Blocks.RAW_NICKEL_ST).add(EOBlocks.RAW_NICKEL_BLOCK.get());
            tag(EOStorageRawOreBlockTags.Blocks.RAW_OSMIUM_ST).add(EOBlocks.RAW_OSMIUM_BLOCK.get());
            tag(EOStorageRawOreBlockTags.Blocks.RAW_PLATINUM_ST).add(EOBlocks.RAW_PLATINUM_BLOCK.get());
            tag(EOStorageRawOreBlockTags.Blocks.RAW_SILVER_ST).add(EOBlocks.RAW_SILVER_BLOCK.get());
            tag(EOStorageRawOreBlockTags.Blocks.SULFUR_ST).add(EOBlocks.SULFUR_BLOCK.get());
            tag(EOStorageRawOreBlockTags.Blocks.RAW_TIN_ST).add(EOBlocks.RAW_TIN_BLOCK.get());
            tag(EOStorageRawOreBlockTags.Blocks.RAW_URANINITE_ST).add(EOBlocks.RAW_URANINITE_BLOCK.get());
            tag(EOStorageRawOreBlockTags.Blocks.RAW_URANIUM_ST).add(EOBlocks.RAW_URANIUM_BLOCK.get());
            tag(EOStorageRawOreBlockTags.Blocks.RAW_ZINC_ST).add(EOBlocks.RAW_ZINC_BLOCK.get());

            //Gem Blocks
            tag(EOGeneralBlockTags.Blocks.GEM_BLOCK)
                    .add(EOBlocks.AMBER_BLOCK.get())
                    .add(EOBlocks.APATITE_BLOCK.get())
                    .add(EOBlocks.CINNABAR_BLOCK.get())
                    .add(EOBlocks.FLUORITE_BLOCK.get())
                    .add(EOBlocks.NECROTICARITE_BLOCK.get())
                    .add(EOBlocks.NITER_BLOCK.get())
                    .add(EOBlocks.ONYX_BLOCK.get())
                    .add(EOBlocks.PERIDOT_BLOCK.get())
                    .add(EOBlocks.RUBY_BLOCK.get())
                    .add(EOBlocks.SAPPHIRE_BLOCK.get());

            //Metal Blocks
            tag(EOGeneralBlockTags.Blocks.METAL_BLOCK)
                    .add(EOBlocks.ALUMINUM_BLOCK.get())
                    .add(EOBlocks.ARDITE_BLOCK.get())
                    .add(EOBlocks.BRASS_BLOCK.get())
                    .add(EOBlocks.BRONZE_BLOCK.get())
                    .add(EOBlocks.BRITANNIA_SILVER_BLOCK.get())
                    .add(EOBlocks.BLUE_STEEL_BLOCK.get())
                    .add(EOBlocks.CATALYRIUM_BLOCK.get())
                    .add(EOBlocks.CAST_IRON_BLOCK.get())
                    .add(EOBlocks.COBALT_BLOCK.get())
                    .add(EOBlocks.CONSTANTAN_BLOCK.get())
                    .add(EOBlocks.ELECTRUM_BLOCK.get())
                    .add(EOBlocks.ENDERIUM_BLOCK.get())
                    .add(EOBlocks.GALLIUM_BLOCK.get())
                    .add(EOBlocks.GRAPHITE_BLOCK.get())
                    .add(EOBlocks.INVAR_BLOCK.get())
                    .add(EOBlocks.IRIDIUM_BLOCK.get())
                    .add(EOBlocks.LEAD_BLOCK.get())
                    .add(EOBlocks.LUMIUM_BLOCK.get())
                    .add(EOBlocks.NETHERSTEEL_BLOCK.get())
                    .add(EOBlocks.NICKEL_BLOCK.get())
                    .add(EOBlocks.OSMIUM_BLOCK.get())
                    .add(EOBlocks.PEWTER_BLOCK.get())
                    .add(EOBlocks.PIG_IRON_BLOCK.get())
                    .add(EOBlocks.PLATINUM_BLOCK.get())
                    .add(EOBlocks.PLUTONIUM_BLOCK.get())
                    .add(EOBlocks.ROSE_GOLD_BLOCK.get())
                    .add(EOBlocks.SILVER_BLOCK.get())
                    .add(EOBlocks.SIGNALUM_BLOCK.get())
                    .add(EOBlocks.SHADOWSTEEL_BLOCK.get())
                    .add(EOBlocks.STEEL_BLOCK.get())
                    .add(EOBlocks.TIN_BLOCK.get())
                    .add(EOBlocks.TITANIUM_BLOCK.get())
                    .add(EOBlocks.ULTIMATITANIUM_BLOCK.get())
                    .add(EOBlocks.URANINITE_BLOCK.get())
                    .add(EOBlocks.URANIUM_BLOCK.get())
                    .add(EOBlocks.WROUGHT_IRON_BLOCK.get())
                    .add(EOBlocks.ZINC_BLOCK.get());

            //Raw Ore Blocks
            tag(EOGeneralBlockTags.Blocks.RAW_ORE_BLOCK)
                    .add(EOBlocks.RAW_ALUMINUM_BLOCK.get())
                    .add(EOBlocks.RAW_ARDITE_BLOCK.get())
                    .add(EOBlocks.RAW_CATALYRIUM_BLOCK.get())
                    .add(EOBlocks.RAW_COBALT_BLOCK.get())
                    .add(EOBlocks.RAW_IRIDIUM_BLOCK.get())
                    .add(EOBlocks.RAW_LEAD_BLOCK.get())
                    .add(EOBlocks.RAW_NICKEL_BLOCK.get())
                    .add(EOBlocks.RAW_OSMIUM_BLOCK.get())
                    .add(EOBlocks.RAW_PLATINUM_BLOCK.get())
                    .add(EOBlocks.RAW_PLUTONIUM_BLOCK.get())
                    .add(EOBlocks.RAW_SILVER_BLOCK.get())
                    .add(EOBlocks.SULFUR_BLOCK.get())
                    .add(EOBlocks.RAW_TIN_BLOCK.get())
                    .add(EOBlocks.RAW_URANINITE_BLOCK.get())
                    .add(EOBlocks.RAW_URANIUM_BLOCK.get())
                    .add(EOBlocks.RAW_ZINC_BLOCK.get())
                    .add(EOBlocks.RAW_GALLIUM_BLOCK.get());

            //Individual Ores Tag
            tag(EOOreBlockTags.Blocks.ALUMINUM_ORE_OW).add(EOBlocks.ALUMINUM_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.ALUMINUM_ORE_OW).add(EOBlocks.DEEPSLATE_ALUMINUM_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.ARDITE_ORE_NETHER).add(EOBlocks.ARDITE_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.AMBER_ORE_OW).add(EOBlocks.AMBER_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.AMBER_ORE_OW).add(EOBlocks.DEEPSLATE_AMBER_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.APATITE_ORE_OW).add(EOBlocks.APATITE_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.APATITE_ORE_OW).add(EOBlocks.DEEPSLATE_APATITE_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.CINNABAR_ORE_OW).add(EOBlocks.CINNABAR_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.CINNABAR_ORE_OW).add(EOBlocks.DEEPSLATE_CINNABAR_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.COBALT_ORE_OW).add(EOBlocks.COBALT_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.COBALT_ORE_OW).add(EOBlocks.DEEPSLATE_COBALT_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.FLUORITE_ORE_OW).add(EOBlocks.FLUORITE_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.FLUORITE_ORE_OW).add(EOBlocks.DEEPSLATE_FLUORITE_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.GALLIUM_ORE_OW).add(EOBlocks.GALLIUM_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.GALLIUM_ORE_OW).add(EOBlocks.DEEPSLATE_GALLIUM_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.IRIDIUM_ORE_OW).add(EOBlocks.IRIDIUM_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.IRIDIUM_ORE_OW).add(EOBlocks.DEEPSLATE_IRIDIUM_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.LEAD_ORE_OW).add(EOBlocks.LEAD_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.LEAD_ORE_OW).add(EOBlocks.DEEPSLATE_LEAD_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.NECROTICARITE_ORE_OW).add(EOBlocks.NECROTICARITE_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.NICKEL_ORE_OW).add(EOBlocks.NICKEL_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.NICKEL_ORE_OW).add(EOBlocks.DEEPSLATE_NICKEL_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.NITER_ORE_OW).add(EOBlocks.NITER_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.NITER_ORE_OW).add(EOBlocks.DEEPSLATE_NITER_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.OBSIDIAN_ORE_NETHER).add(EOBlocks.OBSIDIAN_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.ONYX_ORE_OW).add(EOBlocks.ONYX_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.ONYX_ORE_OW).add(EOBlocks.DEEPSLATE_ONYX_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.OSMIUM_ORE_OW).add(EOBlocks.OSMIUM_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.OSMIUM_ORE_OW).add(EOBlocks.DEEPSLATE_OSMIUM_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.PLATINUM_ORE_OW).add(EOBlocks.PLATINUM_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.PLATINUM_ORE_OW).add(EOBlocks.DEEPSLATE_PLATINUM_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.RUBY_ORE_OW).add(EOBlocks.RUBY_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.RUBY_ORE_OW).add(EOBlocks.DEEPSLATE_RUBY_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.SAPPHIRE_ORE_OW).add(EOBlocks.SAPPHIRE_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.SAPPHIRE_ORE_OW).add(EOBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.SILVER_ORE_OW).add(EOBlocks.SILVER_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.SILVER_ORE_OW).add(EOBlocks.DEEPSLATE_SILVER_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.SULFUR_ORE_OW).add(EOBlocks.SULFUR_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.SULFUR_ORE_OW).add(EOBlocks.DEEPSLATE_SULFUR_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.TIN_ORE_OW).add(EOBlocks.TIN_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.TIN_ORE_OW).add(EOBlocks.DEEPSLATE_TIN_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.URANINITE_ORE_OW).add(EOBlocks.URANINITE_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.URANINITE_ORE_OW).add(EOBlocks.DEEPSLATE_URANINITE_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.URANIUM_ORE_OW).add(EOBlocks.URANIUM_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.URANIUM_ORE_OW).add(EOBlocks.DEEPSLATE_URANIUM_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.ZINC_ORE_OW).add(EOBlocks.ZINC_ORE_BLOCK.get());
            tag(EOOreBlockTags.Blocks.ZINC_ORE_OW).add(EOBlocks.DEEPSLATE_ZINC_ORE_BLOCK.get());

            //Ores Tag
            tag(Tags.Blocks.ORES)
                    .add(EOBlocks.ALUMINUM_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_ALUMINUM_ORE_BLOCK.get())
                    .add(EOBlocks.AMBER_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_AMBER_ORE_BLOCK.get())
                    .add(EOBlocks.APATITE_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_APATITE_ORE_BLOCK.get())
                    .add(EOBlocks.ARDITE_ORE_BLOCK.get())
                    .add(EOBlocks.CINNABAR_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_CINNABAR_ORE_BLOCK.get())
                    .add(EOBlocks.COBALT_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_COBALT_ORE_BLOCK.get())
                    .add(EOBlocks.FLUORITE_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_FLUORITE_ORE_BLOCK.get())
                    .add(EOBlocks.GALLIUM_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_GALLIUM_ORE_BLOCK.get())
                    .add(EOBlocks.IRIDIUM_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_IRIDIUM_ORE_BLOCK.get())
                    .add(EOBlocks.LEAD_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_LEAD_ORE_BLOCK.get())
                    .add(EOBlocks.NECROTICARITE_ORE_BLOCK.get())
                    .add(EOBlocks.NICKEL_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_NICKEL_ORE_BLOCK.get())
                    .add(EOBlocks.NITER_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_NITER_ORE_BLOCK.get())
                    .add(EOBlocks.OBSIDIAN_ORE_BLOCK.get())
                    .add(EOBlocks.ONYX_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_ONYX_ORE_BLOCK.get())
                    .add(EOBlocks.OSMIUM_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_OSMIUM_ORE_BLOCK.get())
                    .add(EOBlocks.PERIDOT_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_PERIDOT_ORE_BLOCK.get())
                    .add(EOBlocks.PLATINUM_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_PLATINUM_ORE_BLOCK.get())
                    .add(EOBlocks.PLUTONIUM_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_PLUTONIUM_ORE_BLOCK.get())
                    .add(EOBlocks.RUBY_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_RUBY_ORE_BLOCK.get())
                    .add(EOBlocks.SAPPHIRE_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCK.get())
                    .add(EOBlocks.SILVER_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_SILVER_ORE_BLOCK.get())
                    .add(EOBlocks.SULFUR_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_SULFUR_ORE_BLOCK.get())
                    .add(EOBlocks.TIN_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_TIN_ORE_BLOCK.get())
                    .add(EOBlocks.URANINITE_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_URANINITE_ORE_BLOCK.get())
                    .add(EOBlocks.URANIUM_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_URANIUM_ORE_BLOCK.get())
                    .add(EOBlocks.ZINC_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_ZINC_ORE_BLOCK.get());

            //Ores in Ground Stone
            tag(Tags.Blocks.ORES_IN_GROUND_STONE)
                    .add(EOBlocks.ALUMINUM_ORE_BLOCK.get())
                    .add(EOBlocks.AMBER_ORE_BLOCK.get())
                    .add(EOBlocks.APATITE_ORE_BLOCK.get())
                    .add(EOBlocks.ARDITE_ORE_BLOCK.get())
                    .add(EOBlocks.CINNABAR_ORE_BLOCK.get())
                    .add(EOBlocks.COBALT_ORE_BLOCK.get())
                    .add(EOBlocks.FLUORITE_ORE_BLOCK.get())
                    .add(EOBlocks.GALLIUM_ORE_BLOCK.get())
                    .add(EOBlocks.IRIDIUM_ORE_BLOCK.get())
                    .add(EOBlocks.LEAD_ORE_BLOCK.get())
                    .add(EOBlocks.NICKEL_ORE_BLOCK.get())
                    .add(EOBlocks.NITER_ORE_BLOCK.get())
                    .add(EOBlocks.ONYX_ORE_BLOCK.get())
                    .add(EOBlocks.OSMIUM_ORE_BLOCK.get())
                    .add(EOBlocks.PLATINUM_ORE_BLOCK.get())
                    .add(EOBlocks.PLUTONIUM_ORE_BLOCK.get())
                    .add(EOBlocks.RUBY_ORE_BLOCK.get())
                    .add(EOBlocks.SAPPHIRE_ORE_BLOCK.get())
                    .add(EOBlocks.SULFUR_ORE_BLOCK.get())
                    .add(EOBlocks.TIN_ORE_BLOCK.get())
                    .add(EOBlocks.URANINITE_ORE_BLOCK.get())
                    .add(EOBlocks.URANIUM_ORE_BLOCK.get())
                    .add(EOBlocks.SILVER_ORE_BLOCK.get())
                    .add(EOBlocks.ZINC_ORE_BLOCK.get())
                    .add(EOBlocks.PERIDOT_ORE_BLOCK.get());

            //Ores in Ground Deepslate
            tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE)
                    .add(EOBlocks.DEEPSLATE_ALUMINUM_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_AMBER_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_APATITE_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_CINNABAR_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_COBALT_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_FLUORITE_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_IRIDIUM_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_LEAD_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_NICKEL_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_NITER_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_ONYX_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_OSMIUM_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_PLUTONIUM_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_PLATINUM_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_RUBY_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_SULFUR_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_TIN_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_URANINITE_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_URANIUM_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_SILVER_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_ZINC_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_GALLIUM_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_PERIDOT_ORE_BLOCK.get());

            //Ores in Ground Netherrack
            tag(Tags.Blocks.ORES_IN_GROUND_NETHERRACK)
                    .add(EOBlocks.ARDITE_ORE_BLOCK.get())
                    .add(EOBlocks.NECROTICARITE_ORE_BLOCK.get())
                    .add(EOBlocks.OBSIDIAN_ORE_BLOCK.get());

            //Storage Blocks
            tag(Tags.Blocks.STORAGE_BLOCKS)
                    .add(EOBlocks.ALUMINUM_BLOCK.get())
                    .add(EOBlocks.AMBER_BLOCK.get())
                    .add(EOBlocks.APATITE_BLOCK.get())
                    .add(EOBlocks.ARDITE_BLOCK.get())
                    .add(EOBlocks.BLUE_STEEL_BLOCK.get())
                    .add(EOBlocks.BRASS_BLOCK.get())
                    .add(EOBlocks.BRITANNIA_SILVER_BLOCK.get())
                    .add(EOBlocks.BRONZE_BLOCK.get())
                    .add(EOBlocks.CATALYRIUM_BLOCK.get())
                    .add(EOBlocks.CAST_IRON_BLOCK.get())
                    .add(EOBlocks.CAST_STEEL_BLOCK.get())
                    .add(EOBlocks.CINNABAR_BLOCK.get())
                    .add(EOBlocks.COBALT_BLOCK.get())
                    .add(EOBlocks.CONSTANTAN_BLOCK.get())
                    .add(EOBlocks.ELECTRUM_BLOCK.get())
                    .add(EOBlocks.ENDERIUM_BLOCK.get())
                    .add(EOBlocks.FLUORITE_BLOCK.get())
                    .add(EOBlocks.GALLIUM_BLOCK.get())
                    .add(EOBlocks.GRAPHITE_BLOCK.get())
                    .add(EOBlocks.INVAR_BLOCK.get())
                    .add(EOBlocks.IRIDIUM_BLOCK.get())
                    .add(EOBlocks.LEAD_BLOCK.get())
                    .add(EOBlocks.LUMIUM_BLOCK.get())
                    .add(EOBlocks.NECROTICARITE_BLOCK.get())
                    .add(EOBlocks.NETHERSTEEL_BLOCK.get())
                    .add(EOBlocks.NICKEL_BLOCK.get())
                    .add(EOBlocks.NITER_BLOCK.get())
                    .add(EOBlocks.ONYX_BLOCK.get())
                    .add(EOBlocks.OSMIUM_BLOCK.get())
                    .add(EOBlocks.PERIDOT_BLOCK.get())
                    .add(EOBlocks.PEWTER_BLOCK.get())
                    .add(EOBlocks.PIG_IRON_BLOCK.get())
                    .add(EOBlocks.PLATINUM_BLOCK.get())
                    .add(EOBlocks.PLUTONIUM_BLOCK.get())
                    .add(EOBlocks.ROSE_GOLD_BLOCK.get())
                    .add(EOBlocks.RUBY_BLOCK.get())
                    .add(EOBlocks.SAPPHIRE_BLOCK.get())
                    .add(EOBlocks.SIGNALUM_BLOCK.get())
                    .add(EOBlocks.SILVER_BLOCK.get())
                    .add(EOBlocks.SHADOWSTEEL_BLOCK.get())
                    .add(EOBlocks.STEEL_BLOCK.get())
                    .add(EOBlocks.SULFUR_BLOCK.get())
                    .add(EOBlocks.TIN_BLOCK.get())
                    .add(EOBlocks.TITANIUM_BLOCK.get())
                    .add(EOBlocks.URANINITE_BLOCK.get())
                    .add(EOBlocks.URANIUM_BLOCK.get())
                    .add(EOBlocks.WROUGHT_IRON_BLOCK.get())
                    .add(EOBlocks.ZINC_BLOCK.get())

                    .add(EOBlocks.NETHER_STAR_BLOCK.get())

                    .add(EOBlocks.RAW_ALUMINUM_BLOCK.get())
                    .add(EOBlocks.RAW_ARDITE_BLOCK.get())
                    .add(EOBlocks.RAW_CATALYRIUM_BLOCK.get())
                    .add(EOBlocks.RAW_COBALT_BLOCK.get())
                    .add(EOBlocks.RAW_GALLIUM_BLOCK.get())
                    .add(EOBlocks.RAW_IRIDIUM_BLOCK.get())
                    .add(EOBlocks.RAW_LEAD_BLOCK.get())
                    .add(EOBlocks.RAW_NICKEL_BLOCK.get())
                    .add(EOBlocks.RAW_OSMIUM_BLOCK.get())
                    .add(EOBlocks.RAW_PLATINUM_BLOCK.get())
                    .add(EOBlocks.RAW_PLUTONIUM_BLOCK.get())
                    .add(EOBlocks.RAW_SILVER_BLOCK.get())
                    .add(EOBlocks.RAW_TIN_BLOCK.get())
                    .add(EOBlocks.RAW_URANIUM_BLOCK.get())
                    .add(EOBlocks.RAW_URANINITE_BLOCK.get())
                    .add(EOBlocks.RAW_ZINC_BLOCK.get())

                    //COMPRESSED BLOCKS
                    .add(EOBlocks.ANDESITE_1.get())
                    .add(EOBlocks.ANDESITE_2.get())
                    .add(EOBlocks.ANDESITE_3.get())
                    .add(EOBlocks.ANDESITE_4.get())
                    .add(EOBlocks.ANDESITE_5.get())
                    .add(EOBlocks.ANDESITE_6.get())
                    .add(EOBlocks.ANDESITE_7.get())
                    .add(EOBlocks.ANDESITE_8.get())
                    .add(EOBlocks.ANDESITE_9.get())
                    .add(EOBlocks.COBBLE_1.get())
                    .add(EOBlocks.COBBLE_2.get())
                    .add(EOBlocks.COBBLE_3.get())
                    .add(EOBlocks.COBBLE_4.get())
                    .add(EOBlocks.COBBLE_5.get())
                    .add(EOBlocks.COBBLE_6.get())
                    .add(EOBlocks.COBBLE_7.get())
                    .add(EOBlocks.COBBLE_8.get())
                    .add(EOBlocks.COBBLE_9.get())
                    .add(EOBlocks.DIORITE_1.get())
                    .add(EOBlocks.DIORITE_2.get())
                    .add(EOBlocks.DIORITE_3.get())
                    .add(EOBlocks.DIORITE_4.get())
                    .add(EOBlocks.DIORITE_5.get())
                    .add(EOBlocks.DIORITE_6.get())
                    .add(EOBlocks.DIORITE_7.get())
                    .add(EOBlocks.DIORITE_8.get())
                    .add(EOBlocks.DIORITE_9.get())
                    .add(EOBlocks.DIRT_1.get())
                    .add(EOBlocks.DIRT_2.get())
                    .add(EOBlocks.DIRT_3.get())
                    .add(EOBlocks.DIRT_4.get())
                    .add(EOBlocks.DIRT_5.get())
                    .add(EOBlocks.DIRT_6.get())
                    .add(EOBlocks.DIRT_7.get())
                    .add(EOBlocks.DIRT_8.get())
                    .add(EOBlocks.DIRT_9.get())
                    .add(EOBlocks.GRANITE_1.get())
                    .add(EOBlocks.GRANITE_2.get())
                    .add(EOBlocks.GRANITE_3.get())
                    .add(EOBlocks.GRANITE_4.get())
                    .add(EOBlocks.GRANITE_5.get())
                    .add(EOBlocks.GRANITE_6.get())
                    .add(EOBlocks.GRANITE_7.get())
                    .add(EOBlocks.GRANITE_8.get())
                    .add(EOBlocks.GRANITE_9.get())
                    .add(EOBlocks.GRAVEL_1.get())
                    .add(EOBlocks.GRAVEL_2.get())
                    .add(EOBlocks.GRAVEL_3.get())
                    .add(EOBlocks.GRAVEL_4.get())
                    .add(EOBlocks.GRAVEL_5.get())
                    .add(EOBlocks.GRAVEL_6.get())
                    .add(EOBlocks.GRAVEL_7.get())
                    .add(EOBlocks.GRAVEL_8.get())
                    .add(EOBlocks.GRAVEL_9.get())
                    .add(EOBlocks.SAND_1.get())
                    .add(EOBlocks.SAND_2.get())
                    .add(EOBlocks.SAND_3.get())
                    .add(EOBlocks.SAND_4.get())
                    .add(EOBlocks.SAND_5.get())
                    .add(EOBlocks.SAND_6.get())
                    .add(EOBlocks.SAND_7.get())
                    .add(EOBlocks.SAND_8.get())
                    .add(EOBlocks.SAND_9.get());

            //SHOVEL TAGS
            tag(BlockTags.MINEABLE_WITH_SHOVEL)
                    .add(EOBlocks.SAND_1.get())
                    .add(EOBlocks.SAND_2.get())
                    .add(EOBlocks.SAND_3.get())
                    .add(EOBlocks.SAND_4.get())
                    .add(EOBlocks.SAND_5.get())
                    .add(EOBlocks.SAND_6.get())
                    .add(EOBlocks.SAND_7.get())
                    .add(EOBlocks.SAND_8.get())
                    .add(EOBlocks.SAND_9.get())

                    .add(EOBlocks.GRAVEL_1.get())
                    .add(EOBlocks.GRAVEL_2.get())
                    .add(EOBlocks.GRAVEL_3.get())
                    .add(EOBlocks.GRAVEL_4.get())
                    .add(EOBlocks.GRAVEL_5.get())
                    .add(EOBlocks.GRAVEL_6.get())
                    .add(EOBlocks.GRAVEL_7.get())
                    .add(EOBlocks.GRAVEL_8.get())
                    .add(EOBlocks.GRAVEL_9.get())

                    .add(EOBlocks.DIRT_1.get())
                    .add(EOBlocks.DIRT_2.get())
                    .add(EOBlocks.DIRT_3.get())
                    .add(EOBlocks.DIRT_4.get())
                    .add(EOBlocks.DIRT_5.get())
                    .add(EOBlocks.DIRT_6.get())
                    .add(EOBlocks.DIRT_7.get())
                    .add(EOBlocks.DIRT_8.get())
                    .add(EOBlocks.DIRT_9.get());

            //PICKAXE TAGS
            tag(BlockTags.MINEABLE_WITH_PICKAXE)
                    //ORE BLOCKS
                    .add(EOBlocks.ALUMINUM_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_ALUMINUM_ORE_BLOCK.get())
                    .add(EOBlocks.AMBER_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_AMBER_ORE_BLOCK.get())
                    .add(EOBlocks.APATITE_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_APATITE_ORE_BLOCK.get())
                    .add(EOBlocks.ARDITE_ORE_BLOCK.get())
                    .add(EOBlocks.CINNABAR_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_CINNABAR_ORE_BLOCK.get())
                    .add(EOBlocks.COBALT_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_COBALT_ORE_BLOCK.get())
                    .add(EOBlocks.FLUORITE_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_FLUORITE_ORE_BLOCK.get())
                    .add(EOBlocks.IRIDIUM_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_IRIDIUM_ORE_BLOCK.get())
                    .add(EOBlocks.LEAD_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_LEAD_ORE_BLOCK.get())
                    .add(EOBlocks.NECROTICARITE_ORE_BLOCK.get())
                    .add(EOBlocks.NICKEL_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_NICKEL_ORE_BLOCK.get())
                    .add(EOBlocks.NITER_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_NITER_ORE_BLOCK.get())
                    .add(EOBlocks.ONYX_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_ONYX_ORE_BLOCK.get())
                    .add(EOBlocks.OSMIUM_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_OSMIUM_ORE_BLOCK.get())
                    .add(EOBlocks.PLATINUM_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_PLUTONIUM_ORE_BLOCK.get())
                    .add(EOBlocks.PLUTONIUM_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_PLATINUM_ORE_BLOCK.get())
                    .add(EOBlocks.RUBY_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_RUBY_ORE_BLOCK.get())
                    .add(EOBlocks.SAPPHIRE_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCK.get())
                    .add(EOBlocks.SULFUR_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_SULFUR_ORE_BLOCK.get())
                    .add(EOBlocks.TIN_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_TIN_ORE_BLOCK.get())
                    .add(EOBlocks.URANIUM_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_URANIUM_ORE_BLOCK.get())
                    .add(EOBlocks.SILVER_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_SILVER_ORE_BLOCK.get())
                    .add(EOBlocks.ZINC_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_ZINC_ORE_BLOCK.get())
                    .add(EOBlocks.GALLIUM_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_GALLIUM_ORE_BLOCK.get())
                    .add(EOBlocks.PERIDOT_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_PERIDOT_ORE_BLOCK.get())
                    .add(EOBlocks.OBSIDIAN_ORE_BLOCK.get())
                    .add(EOBlocks.URANINITE_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_URANINITE_ORE_BLOCK.get())

                    //METAL BLOCKS
                    .add(EOBlocks.ALUMINUM_BLOCK.get())
                    .add(EOBlocks.ARDITE_BLOCK.get())
                    .add(EOBlocks.BRASS_BLOCK.get())
                    .add(EOBlocks.BRONZE_BLOCK.get())
                    .add(EOBlocks.BRITANNIA_SILVER_BLOCK.get())
                    .add(EOBlocks.BLUE_STEEL_BLOCK.get())
                    .add(EOBlocks.CATALYRIUM_BLOCK.get())
                    .add(EOBlocks.CAST_IRON_BLOCK.get())
                    .add(EOBlocks.CAST_STEEL_BLOCK.get())
                    .add(EOBlocks.COBALT_BLOCK.get())
                    .add(EOBlocks.CONSTANTAN_BLOCK.get())
                    .add(EOBlocks.ELECTRUM_BLOCK.get())
                    .add(EOBlocks.ENDERIUM_BLOCK.get())
                    .add(EOBlocks.GALLIUM_BLOCK.get())
                    .add(EOBlocks.GRAPHITE_BLOCK.get())
                    .add(EOBlocks.INVAR_BLOCK.get())
                    .add(EOBlocks.IRIDIUM_BLOCK.get())
                    .add(EOBlocks.LEAD_BLOCK.get())
                    .add(EOBlocks.LUMIUM_BLOCK.get())
                    .add(EOBlocks.NETHERSTEEL_BLOCK.get())
                    .add(EOBlocks.NICKEL_BLOCK.get())
                    .add(EOBlocks.OSMIUM_BLOCK.get())
                    .add(EOBlocks.PEWTER_BLOCK.get())
                    .add(EOBlocks.PIG_IRON_BLOCK.get())
                    .add(EOBlocks.PLATINUM_BLOCK.get())
                    .add(EOBlocks.PLUTONIUM_BLOCK.get())
                    .add(EOBlocks.ROSE_GOLD_BLOCK.get())
                    .add(EOBlocks.SILVER_BLOCK.get())
                    .add(EOBlocks.SIGNALUM_BLOCK.get())
                    .add(EOBlocks.SHADOWSTEEL_BLOCK.get())
                    .add(EOBlocks.STEEL_BLOCK.get())
                    .add(EOBlocks.TIN_BLOCK.get())
                    .add(EOBlocks.TITANIUM_BLOCK.get())
                    .add(EOBlocks.ULTIMATITANIUM_BLOCK.get())
                    .add(EOBlocks.URANINITE_BLOCK.get())
                    .add(EOBlocks.URANIUM_BLOCK.get())
                    .add(EOBlocks.WROUGHT_IRON_BLOCK.get())
                    .add(EOBlocks.ZINC_BLOCK.get())

                    //GEM BLOCKS
                    .add(EOBlocks.AMBER_BLOCK.get())
                    .add(EOBlocks.APATITE_BLOCK.get())
                    .add(EOBlocks.CINNABAR_BLOCK.get())
                    .add(EOBlocks.FLUORITE_BLOCK.get())
                    .add(EOBlocks.NECROTICARITE_BLOCK.get())
                    .add(EOBlocks.NITER_BLOCK.get())
                    .add(EOBlocks.ONYX_BLOCK.get())
                    .add(EOBlocks.PERIDOT_BLOCK.get())
                    .add(EOBlocks.RUBY_BLOCK.get())
                    .add(EOBlocks.SAPPHIRE_BLOCK.get())

                    //MISC BLOCKS
                    .add(EOBlocks.NETHER_STAR_BLOCK.get())

                    //RAW ORE BLOCKS
                    .add(EOBlocks.RAW_ALUMINUM_BLOCK.get())
                    .add(EOBlocks.RAW_ARDITE_BLOCK.get())
                    .add(EOBlocks.RAW_CATALYRIUM_BLOCK.get())
                    .add(EOBlocks.RAW_COBALT_BLOCK.get())
                    .add(EOBlocks.RAW_IRIDIUM_BLOCK.get())
                    .add(EOBlocks.RAW_LEAD_BLOCK.get())
                    .add(EOBlocks.RAW_NICKEL_BLOCK.get())
                    .add(EOBlocks.RAW_OSMIUM_BLOCK.get())
                    .add(EOBlocks.RAW_PLATINUM_BLOCK.get())
                    .add(EOBlocks.RAW_PLUTONIUM_BLOCK.get())
                    .add(EOBlocks.RAW_SILVER_BLOCK.get())
                    .add(EOBlocks.SULFUR_BLOCK.get())
                    .add(EOBlocks.RAW_TIN_BLOCK.get())
                    .add(EOBlocks.RAW_URANINITE_BLOCK.get())
                    .add(EOBlocks.RAW_URANIUM_BLOCK.get())
                    .add(EOBlocks.RAW_ZINC_BLOCK.get())
                    .add(EOBlocks.RAW_GALLIUM_BLOCK.get())

                    //COMPRESSED BLOCKS
                    .add(EOBlocks.COBBLE_1.get())
                    .add(EOBlocks.COBBLE_2.get())
                    .add(EOBlocks.COBBLE_3.get())
                    .add(EOBlocks.COBBLE_4.get())
                    .add(EOBlocks.COBBLE_5.get())
                    .add(EOBlocks.COBBLE_6.get())
                    .add(EOBlocks.COBBLE_7.get())
                    .add(EOBlocks.COBBLE_8.get())
                    .add(EOBlocks.COBBLE_9.get())

                    .add(EOBlocks.GRANITE_1.get())
                    .add(EOBlocks.GRANITE_2.get())
                    .add(EOBlocks.GRANITE_3.get())
                    .add(EOBlocks.GRANITE_4.get())
                    .add(EOBlocks.GRANITE_5.get())
                    .add(EOBlocks.GRANITE_6.get())
                    .add(EOBlocks.GRANITE_7.get())
                    .add(EOBlocks.GRANITE_8.get())
                    .add(EOBlocks.GRANITE_9.get())

                    .add(EOBlocks.DIORITE_1.get())
                    .add(EOBlocks.DIORITE_2.get())
                    .add(EOBlocks.DIORITE_3.get())
                    .add(EOBlocks.DIORITE_4.get())
                    .add(EOBlocks.DIORITE_5.get())
                    .add(EOBlocks.DIORITE_6.get())
                    .add(EOBlocks.DIORITE_7.get())
                    .add(EOBlocks.DIORITE_8.get())
                    .add(EOBlocks.DIORITE_9.get())

                    .add(EOBlocks.ANDESITE_1.get())
                    .add(EOBlocks.ANDESITE_2.get())
                    .add(EOBlocks.ANDESITE_3.get())
                    .add(EOBlocks.ANDESITE_4.get())
                    .add(EOBlocks.ANDESITE_5.get())
                    .add(EOBlocks.ANDESITE_6.get())
                    .add(EOBlocks.ANDESITE_7.get())
                    .add(EOBlocks.ANDESITE_8.get())
                    .add(EOBlocks.ANDESITE_9.get());

            tag(BlockTags.NEEDS_STONE_TOOL)
                    .add(EOBlocks.ALUMINUM_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_ALUMINUM_ORE_BLOCK.get())
                    .add(EOBlocks.TIN_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_TIN_ORE_BLOCK.get())
                    .add(EOBlocks.SULFUR_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_SULFUR_ORE_BLOCK.get());

            tag(BlockTags.NEEDS_IRON_TOOL)
                    //ORE BLOCKS
                    .add(EOBlocks.AMBER_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_AMBER_ORE_BLOCK.get())
                    .add(EOBlocks.APATITE_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_APATITE_ORE_BLOCK.get())
                    .add(EOBlocks.CINNABAR_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_CINNABAR_ORE_BLOCK.get())
                    .add(EOBlocks.FLUORITE_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_FLUORITE_ORE_BLOCK.get())
                    .add(EOBlocks.IRIDIUM_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_IRIDIUM_ORE_BLOCK.get())
                    .add(EOBlocks.LEAD_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_LEAD_ORE_BLOCK.get())
                    .add(EOBlocks.NICKEL_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_NICKEL_ORE_BLOCK.get())
                    .add(EOBlocks.NITER_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_NITER_ORE_BLOCK.get())
                    .add(EOBlocks.ONYX_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_ONYX_ORE_BLOCK.get())
                    .add(EOBlocks.OSMIUM_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_OSMIUM_ORE_BLOCK.get())
                    .add(EOBlocks.RUBY_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_RUBY_ORE_BLOCK.get())
                    .add(EOBlocks.SAPPHIRE_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCK.get())
                    .add(EOBlocks.SILVER_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_SILVER_ORE_BLOCK.get())
                    .add(EOBlocks.ZINC_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_ZINC_ORE_BLOCK.get())
                    .add(EOBlocks.GALLIUM_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_GALLIUM_ORE_BLOCK.get())
                    .add(EOBlocks.PERIDOT_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_PERIDOT_ORE_BLOCK.get())
                    .add(EOBlocks.URANIUM_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_URANIUM_ORE_BLOCK.get())
                    .add(EOBlocks.PLATINUM_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_PLATINUM_ORE_BLOCK.get())
                    .add(EOBlocks.URANINITE_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_URANINITE_ORE_BLOCK.get())

                    //METAL BLOCKS
                    .add(EOBlocks.ALUMINUM_BLOCK.get())
                    .add(EOBlocks.BRONZE_BLOCK.get())
                    .add(EOBlocks.CAST_IRON_BLOCK.get())
                    .add(EOBlocks.CAST_STEEL_BLOCK.get())
                    .add(EOBlocks.COBALT_BLOCK.get())
                    .add(EOBlocks.ELECTRUM_BLOCK.get())
                    .add(EOBlocks.ENDERIUM_BLOCK.get())
                    .add(EOBlocks.INVAR_BLOCK.get())
                    .add(EOBlocks.IRIDIUM_BLOCK.get())
                    .add(EOBlocks.LEAD_BLOCK.get())
                    .add(EOBlocks.LUMIUM_BLOCK.get())
                    .add(EOBlocks.NICKEL_BLOCK.get())
                    .add(EOBlocks.OSMIUM_BLOCK.get())
                    .add(EOBlocks.PLATINUM_BLOCK.get())
                    .add(EOBlocks.PLUTONIUM_BLOCK.get())
                    .add(EOBlocks.TIN_BLOCK.get())
                    .add(EOBlocks.SIGNALUM_BLOCK.get())
                    .add(EOBlocks.ULTIMATITANIUM_BLOCK.get())
                    .add(EOBlocks.URANIUM_BLOCK.get())
                    .add(EOBlocks.SILVER_BLOCK.get())
                    .add(EOBlocks.GRAPHITE_BLOCK.get())
                    .add(EOBlocks.CONSTANTAN_BLOCK.get())
                    .add(EOBlocks.BRASS_BLOCK.get())
                    .add(EOBlocks.ZINC_BLOCK.get())
                    .add(EOBlocks.STEEL_BLOCK.get())
                    .add(EOBlocks.BLUE_STEEL_BLOCK.get())
                    .add(EOBlocks.GALLIUM_BLOCK.get())
                    .add(EOBlocks.TITANIUM_BLOCK.get())
                    .add(EOBlocks.PEWTER_BLOCK.get())
                    .add(EOBlocks.ROSE_GOLD_BLOCK.get())
                    .add(EOBlocks.BRITANNIA_SILVER_BLOCK.get())
                    .add(EOBlocks.CAST_IRON_BLOCK.get())
                    .add(EOBlocks.URANINITE_BLOCK.get())
                    .add(EOBlocks.WROUGHT_IRON_BLOCK.get())
                    .add(EOBlocks.PIG_IRON_BLOCK.get())

                    //GEM BLOCKS
                    .add(EOBlocks.AMBER_BLOCK.get())
                    .add(EOBlocks.APATITE_BLOCK.get())
                    .add(EOBlocks.CINNABAR_BLOCK.get())
                    .add(EOBlocks.FLUORITE_BLOCK.get())
                    .add(EOBlocks.NITER_BLOCK.get())
                    .add(EOBlocks.ONYX_BLOCK.get())
                    .add(EOBlocks.PERIDOT_BLOCK.get())
                    .add(EOBlocks.RUBY_BLOCK.get())
                    .add(EOBlocks.SAPPHIRE_BLOCK.get())

                    //RAW ORE BLOCKS
                    .add(EOBlocks.RAW_ALUMINUM_BLOCK.get())
                    .add(EOBlocks.RAW_COBALT_BLOCK.get())
                    .add(EOBlocks.RAW_IRIDIUM_BLOCK.get())
                    .add(EOBlocks.RAW_LEAD_BLOCK.get())
                    .add(EOBlocks.RAW_NICKEL_BLOCK.get())
                    .add(EOBlocks.RAW_OSMIUM_BLOCK.get())
                    .add(EOBlocks.RAW_PLATINUM_BLOCK.get())
                    .add(EOBlocks.RAW_PLUTONIUM_BLOCK.get())
                    .add(EOBlocks.RAW_SILVER_BLOCK.get())
                    .add(EOBlocks.SULFUR_BLOCK.get())
                    .add(EOBlocks.RAW_TIN_BLOCK.get())
                    .add(EOBlocks.RAW_URANINITE_BLOCK.get())
                    .add(EOBlocks.RAW_URANIUM_BLOCK.get())
                    .add(EOBlocks.RAW_GALLIUM_BLOCK.get())
                    .add(EOBlocks.RAW_ZINC_BLOCK.get());

            tag(BlockTags.NEEDS_DIAMOND_TOOL)
                    .add(EOBlocks.ARDITE_BLOCK.get())
                    .add(EOBlocks.CATALYRIUM_BLOCK.get())
                    .add(EOBlocks.NECROTICARITE_BLOCK.get())

                    .add(EOBlocks.RAW_ARDITE_BLOCK.get())
                    .add(EOBlocks.RAW_CATALYRIUM_BLOCK.get())

                    .add(EOBlocks.ARDITE_ORE_BLOCK.get())
                    .add(EOBlocks.COBALT_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_COBALT_ORE_BLOCK.get())
                    .add(EOBlocks.PLUTONIUM_ORE_BLOCK.get())
                    .add(EOBlocks.DEEPSLATE_PLUTONIUM_ORE_BLOCK.get())
                    .add(EOBlocks.NECROTICARITE_ORE_BLOCK.get())
                    .add(EOBlocks.OBSIDIAN_ORE_BLOCK.get())

                    .add(EOBlocks.NETHER_STAR_BLOCK.get())
                    .add(EOBlocks.NETHERSTEEL_BLOCK.get())
                    .add(EOBlocks.SHADOWSTEEL_BLOCK.get());

            //Individual Compressed Tags
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_COBBLESTONE).add(EOBlocks.COBBLE_1.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_COBBLESTONE).add(EOBlocks.COBBLE_2.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_COBBLESTONE).add(EOBlocks.COBBLE_3.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_COBBLESTONE).add(EOBlocks.COBBLE_4.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_COBBLESTONE).add(EOBlocks.COBBLE_5.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_COBBLESTONE).add(EOBlocks.COBBLE_6.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_COBBLESTONE).add(EOBlocks.COBBLE_7.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_COBBLESTONE).add(EOBlocks.COBBLE_8.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_COBBLESTONE).add(EOBlocks.COBBLE_9.get());

            tag(EOCompressedBlockTags.Blocks.COMPRESSED_SAND).add(EOBlocks.SAND_1.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_SAND).add(EOBlocks.SAND_2.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_SAND).add(EOBlocks.SAND_3.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_SAND).add(EOBlocks.SAND_4.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_SAND).add(EOBlocks.SAND_5.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_SAND).add(EOBlocks.SAND_6.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_SAND).add(EOBlocks.SAND_7.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_SAND).add(EOBlocks.SAND_8.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_SAND).add(EOBlocks.SAND_9.get());

            tag(EOCompressedBlockTags.Blocks.COMPRESSED_DIRT).add(EOBlocks.DIRT_1.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_DIRT).add(EOBlocks.DIRT_2.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_DIRT).add(EOBlocks.DIRT_3.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_DIRT).add(EOBlocks.DIRT_4.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_DIRT).add(EOBlocks.DIRT_5.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_DIRT).add(EOBlocks.DIRT_6.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_DIRT).add(EOBlocks.DIRT_7.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_DIRT).add(EOBlocks.DIRT_8.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_DIRT).add(EOBlocks.DIRT_9.get());

            tag(EOCompressedBlockTags.Blocks.COMPRESSED_ANDESITE).add(EOBlocks.ANDESITE_1.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_ANDESITE).add(EOBlocks.ANDESITE_2.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_ANDESITE).add(EOBlocks.ANDESITE_3.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_ANDESITE).add(EOBlocks.ANDESITE_4.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_ANDESITE).add(EOBlocks.ANDESITE_5.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_ANDESITE).add(EOBlocks.ANDESITE_6.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_ANDESITE).add(EOBlocks.ANDESITE_7.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_ANDESITE).add(EOBlocks.ANDESITE_8.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_ANDESITE).add(EOBlocks.ANDESITE_9.get());

            tag(EOCompressedBlockTags.Blocks.COMPRESSED_GRAVEL).add(EOBlocks.GRAVEL_1.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_GRAVEL).add(EOBlocks.GRAVEL_2.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_GRAVEL).add(EOBlocks.GRAVEL_3.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_GRAVEL).add(EOBlocks.GRAVEL_4.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_GRAVEL).add(EOBlocks.GRAVEL_5.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_GRAVEL).add(EOBlocks.GRAVEL_6.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_GRAVEL).add(EOBlocks.GRAVEL_7.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_GRAVEL).add(EOBlocks.GRAVEL_8.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_GRAVEL).add(EOBlocks.GRAVEL_9.get());

            tag(EOCompressedBlockTags.Blocks.COMPRESSED_GRANITE).add(EOBlocks.GRANITE_1.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_GRANITE).add(EOBlocks.GRANITE_2.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_GRANITE).add(EOBlocks.GRANITE_3.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_GRANITE).add(EOBlocks.GRANITE_4.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_GRANITE).add(EOBlocks.GRANITE_5.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_GRANITE).add(EOBlocks.GRANITE_6.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_GRANITE).add(EOBlocks.GRANITE_7.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_GRANITE).add(EOBlocks.GRANITE_8.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_GRANITE).add(EOBlocks.GRANITE_9.get());

            tag(EOCompressedBlockTags.Blocks.COMPRESSED_DIORITE).add(EOBlocks.DIORITE_1.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_DIORITE).add(EOBlocks.DIORITE_2.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_DIORITE).add(EOBlocks.DIORITE_3.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_DIORITE).add(EOBlocks.DIORITE_4.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_DIORITE).add(EOBlocks.DIORITE_5.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_DIORITE).add(EOBlocks.DIORITE_6.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_DIORITE).add(EOBlocks.DIORITE_7.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_DIORITE).add(EOBlocks.DIORITE_8.get());
            tag(EOCompressedBlockTags.Blocks.COMPRESSED_DIORITE).add(EOBlocks.DIORITE_9.get());
    }
}
