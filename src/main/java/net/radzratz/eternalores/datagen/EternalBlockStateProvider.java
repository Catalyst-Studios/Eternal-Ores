package net.radzratz.eternalores.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.block.ModBlocks;

public class EternalBlockStateProvider extends BlockStateProvider {
    public EternalBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, EternalOres.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        System.out.println("Loading Block State");

        //METAL BLOCKS
        blockWithItem(ModBlocks.ALUMINUM_BLOCK);
        blockWithItem(ModBlocks.BRONZE_BLOCK);
        blockWithItem(ModBlocks.COBALT_BLOCK);
        blockWithItem(ModBlocks.CONSTANTAN_BLOCK);
        blockWithItem(ModBlocks.ELECTRUM_BLOCK);
        blockWithItem(ModBlocks.ENDERIUM_BLOCK);
        blockWithItem(ModBlocks.INVAR_BLOCK);
        blockWithItem(ModBlocks.LEAD_BLOCK);
        blockWithItem(ModBlocks.LUMIUM_BLOCK);
        blockWithItem(ModBlocks.NICKEL_BLOCK);
        blockWithItem(ModBlocks.OSMIUM_BLOCK);
        blockWithItem(ModBlocks.PLATINUM_BLOCK);
        blockWithItem(ModBlocks.PLUTONIUM_BLOCK);
        blockWithItem(ModBlocks.TIN_BLOCK);
        blockWithItem(ModBlocks.SIGNALUM_BLOCK);
        blockWithItem(ModBlocks.URANIUM_BLOCK);
        blockWithItem(ModBlocks.ULTIMATITANIUM_BLOCK);
        blockWithItem(ModBlocks.SILVER_BLOCK);
        blockWithItem(ModBlocks.GRAPHITE_BLOCK);
        blockWithItem(ModBlocks.BRASS_BLOCK);
        blockWithItem(ModBlocks.ZINC_BLOCK);
        blockWithItem(ModBlocks.STEEL_BLOCK);
        blockWithItem(ModBlocks.BLUE_STEEL_BLOCK);
        blockWithItem(ModBlocks.GALLIUM_BLOCK);
        blockWithItem(ModBlocks.TITANIUM_BLOCK);
        blockWithItem(ModBlocks.PEWTER_BLOCK);
        blockWithItem(ModBlocks.ROSE_GOLD_BLOCK);
        blockWithItem(ModBlocks.BRITANNIA_SILVER_BLOCK);

        //GEM BLOCKS
        blockWithItem(ModBlocks.SAPPHIRE_BLOCK);
        blockWithItem(ModBlocks.FLUORITE_BLOCK);
        blockWithItem(ModBlocks.APATITE_BLOCK);
        blockWithItem(ModBlocks.CINNABAR_BLOCK);
        blockWithItem(ModBlocks.AMBER_BLOCK);
        blockWithItem(ModBlocks.NITER_BLOCK);
        blockWithItem(ModBlocks.RUBY_BLOCK);
        blockWithItem(ModBlocks.ONYX_BLOCK);
        blockWithItem(ModBlocks.PERIDOT_BLOCK);

        //RAW BLOCKS
        blockWithItem(ModBlocks.RAW_ALUMINUM_BLOCK);
        blockWithItem(ModBlocks.RAW_COBALT_BLOCK);
        blockWithItem(ModBlocks.RAW_LEAD_BLOCK);
        blockWithItem(ModBlocks.RAW_NICKEL_BLOCK);
        blockWithItem(ModBlocks.RAW_OSMIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_PLATINUM_BLOCK);
        blockWithItem(ModBlocks.RAW_PLUTONIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_SILVER_BLOCK);
        blockWithItem(ModBlocks.SULFUR_BLOCK);
        blockWithItem(ModBlocks.RAW_TIN_BLOCK);
        blockWithItem(ModBlocks.RAW_URANIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_ZINC_BLOCK);
        blockWithItem(ModBlocks.RAW_GALLIUM_BLOCK);

        //ORE BLOCKS
        //ALUMINUM
        blockWithItem(ModBlocks.ALUMINUM_ORE_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_ALUMINUM_ORE_BLOCK);
        //COBALT
        blockWithItem(ModBlocks.COBALT_ORE_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_COBALT_ORE_BLOCK);
        //LEAD
        blockWithItem(ModBlocks.LEAD_ORE_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_LEAD_ORE_BLOCK);
        //NICKEL
        blockWithItem(ModBlocks.NICKEL_ORE_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_NICKEL_ORE_BLOCK);
        //OSMIUM
        blockWithItem(ModBlocks.OSMIUM_ORE_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_OSMIUM_ORE_BLOCK);
        //PLATINUM
        blockWithItem(ModBlocks.PLATINUM_ORE_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_PLATINUM_ORE_BLOCK);
        //PLUTONIUM
        blockWithItem(ModBlocks.PLUTONIUM_ORE_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_PLUTONIUM_ORE_BLOCK);
        //SULFUR
        blockWithItem(ModBlocks.SULFUR_ORE_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_SULFUR_ORE_BLOCK);
        //TIN
        blockWithItem(ModBlocks.TIN_ORE_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_TIN_ORE_BLOCK);
        //URANIUM
        blockWithItem(ModBlocks.URANIUM_ORE_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_URANIUM_ORE_BLOCK);
        //SILVER
        blockWithItem(ModBlocks.SILVER_ORE_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_SILVER_ORE_BLOCK);
        //ZINC
        blockWithItem(ModBlocks.ZINC_ORE_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_ZINC_ORE_BLOCK);
        //GALLIUM
        blockWithItem(ModBlocks.GALLIUM_ORE_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_GALLIUM_ORE_BLOCK);

        //GEMS
        //FLUORITE
        blockWithItem(ModBlocks.FLUORITE_ORE_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_FLUORITE_ORE_BLOCK);
        //SAPPHIRE
        blockWithItem(ModBlocks.SAPPHIRE_ORE_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCK);
        //APATITE
        blockWithItem(ModBlocks.APATITE_ORE_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_APATITE_ORE_BLOCK);
        //CINNABAR
        blockWithItem(ModBlocks.CINNABAR_ORE_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_CINNABAR_ORE_BLOCK);
        //AMBER
        blockWithItem(ModBlocks.AMBER_ORE_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_AMBER_ORE_BLOCK);
        //ONYX
        blockWithItem(ModBlocks.ONYX_ORE_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_ONYX_ORE_BLOCK);
        //NITER
        blockWithItem(ModBlocks.NITER_ORE_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_NITER_ORE_BLOCK);
        //RUBY
        blockWithItem(ModBlocks.RUBY_ORE_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_RUBY_ORE_BLOCK);
        //PERIDOT
        blockWithItem(ModBlocks.PERIDOT_ORE_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_PERIDOT_ORE_BLOCK);
        //
        blockWithItem(ModBlocks.OBSIDIAN_ORE_BLOCK);
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
