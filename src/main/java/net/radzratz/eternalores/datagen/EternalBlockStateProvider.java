package net.radzratz.eternalores.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.block.EternalGeneralBlocks;

public class EternalBlockStateProvider extends BlockStateProvider {
    public EternalBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, EternalOres.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        System.out.println("Loading Block State");

        //COMPRESSED BLOCKS
        blockWithItem(EternalGeneralBlocks.COBBLE_1);
        blockWithItem(EternalGeneralBlocks.COBBLE_2);
        blockWithItem(EternalGeneralBlocks.COBBLE_3);
        blockWithItem(EternalGeneralBlocks.COBBLE_4);
        blockWithItem(EternalGeneralBlocks.COBBLE_5);
        blockWithItem(EternalGeneralBlocks.COBBLE_6);
        blockWithItem(EternalGeneralBlocks.COBBLE_7);
        blockWithItem(EternalGeneralBlocks.COBBLE_8);
        blockWithItem(EternalGeneralBlocks.COBBLE_9);

        //METAL BLOCKS
        blockWithItem(EternalGeneralBlocks.ALUMINUM_BLOCK);
        blockWithItem(EternalGeneralBlocks.BRONZE_BLOCK);
        blockWithItem(EternalGeneralBlocks.COBALT_BLOCK);
        blockWithItem(EternalGeneralBlocks.CONSTANTAN_BLOCK);
        blockWithItem(EternalGeneralBlocks.ELECTRUM_BLOCK);
        blockWithItem(EternalGeneralBlocks.ENDERIUM_BLOCK);
        blockWithItem(EternalGeneralBlocks.INVAR_BLOCK);
        blockWithItem(EternalGeneralBlocks.LEAD_BLOCK);
        blockWithItem(EternalGeneralBlocks.LUMIUM_BLOCK);
        blockWithItem(EternalGeneralBlocks.NICKEL_BLOCK);
        blockWithItem(EternalGeneralBlocks.OSMIUM_BLOCK);
        blockWithItem(EternalGeneralBlocks.PLATINUM_BLOCK);
        blockWithItem(EternalGeneralBlocks.PLUTONIUM_BLOCK);
        blockWithItem(EternalGeneralBlocks.TIN_BLOCK);
        blockWithItem(EternalGeneralBlocks.SIGNALUM_BLOCK);
        blockWithItem(EternalGeneralBlocks.URANIUM_BLOCK);
        blockWithItem(EternalGeneralBlocks.ULTIMATITANIUM_BLOCK);
        blockWithItem(EternalGeneralBlocks.SILVER_BLOCK);
        blockWithItem(EternalGeneralBlocks.GRAPHITE_BLOCK);
        blockWithItem(EternalGeneralBlocks.BRASS_BLOCK);
        blockWithItem(EternalGeneralBlocks.ZINC_BLOCK);
        blockWithItem(EternalGeneralBlocks.STEEL_BLOCK);
        blockWithItem(EternalGeneralBlocks.BLUE_STEEL_BLOCK);
        blockWithItem(EternalGeneralBlocks.GALLIUM_BLOCK);
        blockWithItem(EternalGeneralBlocks.TITANIUM_BLOCK);
        blockWithItem(EternalGeneralBlocks.PEWTER_BLOCK);
        blockWithItem(EternalGeneralBlocks.ROSE_GOLD_BLOCK);
        blockWithItem(EternalGeneralBlocks.BRITANNIA_SILVER_BLOCK);
        blockWithItem(EternalGeneralBlocks.IRIDIUM_BLOCK);
        blockWithItem(EternalGeneralBlocks.CAST_IRON_BLOCK);
        blockWithItem(EternalGeneralBlocks.URANINITE_BLOCK);
        blockWithItem(EternalGeneralBlocks.CAST_STEEL_BLOCK);
        blockWithItem(EternalGeneralBlocks.WROUGHT_IRON_BLOCK);
        blockWithItem(EternalGeneralBlocks.NETHERSTEEL_BLOCK);
        blockWithItem(EternalGeneralBlocks.SHADOWSTEEL_BLOCK);

        //GEM BLOCKS
        blockWithItem(EternalGeneralBlocks.SAPPHIRE_BLOCK);
        blockWithItem(EternalGeneralBlocks.FLUORITE_BLOCK);
        blockWithItem(EternalGeneralBlocks.APATITE_BLOCK);
        blockWithItem(EternalGeneralBlocks.CINNABAR_BLOCK);
        blockWithItem(EternalGeneralBlocks.AMBER_BLOCK);
        blockWithItem(EternalGeneralBlocks.NITER_BLOCK);
        blockWithItem(EternalGeneralBlocks.RUBY_BLOCK);
        blockWithItem(EternalGeneralBlocks.ONYX_BLOCK);
        blockWithItem(EternalGeneralBlocks.PERIDOT_BLOCK);

        //RAW BLOCKS
        blockWithItem(EternalGeneralBlocks.RAW_ALUMINUM_BLOCK);
        blockWithItem(EternalGeneralBlocks.RAW_COBALT_BLOCK);
        blockWithItem(EternalGeneralBlocks.RAW_LEAD_BLOCK);
        blockWithItem(EternalGeneralBlocks.RAW_NICKEL_BLOCK);
        blockWithItem(EternalGeneralBlocks.RAW_OSMIUM_BLOCK);
        blockWithItem(EternalGeneralBlocks.RAW_PLATINUM_BLOCK);
        blockWithItem(EternalGeneralBlocks.RAW_PLUTONIUM_BLOCK);
        blockWithItem(EternalGeneralBlocks.RAW_SILVER_BLOCK);
        blockWithItem(EternalGeneralBlocks.SULFUR_BLOCK);
        blockWithItem(EternalGeneralBlocks.RAW_TIN_BLOCK);
        blockWithItem(EternalGeneralBlocks.RAW_URANIUM_BLOCK);
        blockWithItem(EternalGeneralBlocks.RAW_ZINC_BLOCK);
        blockWithItem(EternalGeneralBlocks.RAW_GALLIUM_BLOCK);
        blockWithItem(EternalGeneralBlocks.RAW_IRIDIUM_BLOCK);
        blockWithItem(EternalGeneralBlocks.RAW_URANINITE_BLOCK);

        //ORE BLOCKS
        //ALUMINUM
        blockWithItem(EternalGeneralBlocks.ALUMINUM_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_ALUMINUM_ORE_BLOCK);
        //COBALT
        blockWithItem(EternalGeneralBlocks.COBALT_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_COBALT_ORE_BLOCK);
        //LEAD
        blockWithItem(EternalGeneralBlocks.LEAD_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_LEAD_ORE_BLOCK);
        //NICKEL
        blockWithItem(EternalGeneralBlocks.NICKEL_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_NICKEL_ORE_BLOCK);
        //OSMIUM
        blockWithItem(EternalGeneralBlocks.OSMIUM_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_OSMIUM_ORE_BLOCK);
        //PLATINUM
        blockWithItem(EternalGeneralBlocks.PLATINUM_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_PLATINUM_ORE_BLOCK);
        //PLUTONIUM
        blockWithItem(EternalGeneralBlocks.PLUTONIUM_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_PLUTONIUM_ORE_BLOCK);
        //SULFUR
        blockWithItem(EternalGeneralBlocks.SULFUR_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_SULFUR_ORE_BLOCK);
        //TIN
        blockWithItem(EternalGeneralBlocks.TIN_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_TIN_ORE_BLOCK);
        //URANIUM
        blockWithItem(EternalGeneralBlocks.URANIUM_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_URANIUM_ORE_BLOCK);
        //SILVER
        blockWithItem(EternalGeneralBlocks.SILVER_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_SILVER_ORE_BLOCK);
        //ZINC
        blockWithItem(EternalGeneralBlocks.ZINC_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_ZINC_ORE_BLOCK);
        //GALLIUM
        blockWithItem(EternalGeneralBlocks.GALLIUM_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_GALLIUM_ORE_BLOCK);
        //IRIDIUM
        blockWithItem(EternalGeneralBlocks.IRIDIUM_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_IRIDIUM_ORE_BLOCK);
        //URANINITE
        blockWithItem(EternalGeneralBlocks.URANINITE_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_URANINITE_ORE_BLOCK);

        //GEMS
        //FLUORITE
        blockWithItem(EternalGeneralBlocks.FLUORITE_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_FLUORITE_ORE_BLOCK);
        //SAPPHIRE
        blockWithItem(EternalGeneralBlocks.SAPPHIRE_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCK);
        //APATITE
        blockWithItem(EternalGeneralBlocks.APATITE_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_APATITE_ORE_BLOCK);
        //CINNABAR
        blockWithItem(EternalGeneralBlocks.CINNABAR_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_CINNABAR_ORE_BLOCK);
        //AMBER
        blockWithItem(EternalGeneralBlocks.AMBER_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_AMBER_ORE_BLOCK);
        //ONYX
        blockWithItem(EternalGeneralBlocks.ONYX_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_ONYX_ORE_BLOCK);
        //NITER
        blockWithItem(EternalGeneralBlocks.NITER_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_NITER_ORE_BLOCK);
        //RUBY
        blockWithItem(EternalGeneralBlocks.RUBY_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_RUBY_ORE_BLOCK);
        //PERIDOT
        blockWithItem(EternalGeneralBlocks.PERIDOT_ORE_BLOCK);
        blockWithItem(EternalGeneralBlocks.DEEPSLATE_PERIDOT_ORE_BLOCK);
        //
        blockWithItem(EternalGeneralBlocks.OBSIDIAN_ORE_BLOCK);
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
