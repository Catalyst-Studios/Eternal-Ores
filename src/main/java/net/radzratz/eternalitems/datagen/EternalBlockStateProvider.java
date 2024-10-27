package net.radzratz.eternalitems.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.radzratz.eternalitems.EternalItems;
import net.radzratz.eternalitems.block.ModBlocks;

public class EternalBlockStateProvider extends BlockStateProvider {
    public EternalBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, EternalItems.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //METAL BLOCKS
        blockWithItem(ModBlocks.ALUMINUM_BLOCK);
        blockWithItem(ModBlocks.BRONZE_BLOCK);
        blockWithItem(ModBlocks.COBALT_BLOCK);
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

        //RAW BLOCKS
        blockWithItem(ModBlocks.RAW_ALUMINUM_BLOCK);
        blockWithItem(ModBlocks.RAW_COBALT_BLOCK);
        blockWithItem(ModBlocks.RAW_LEAD_BLOCK);
        blockWithItem(ModBlocks.RAW_NICKEL_BLOCK);
        blockWithItem(ModBlocks.RAW_OSMIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_PLATINUM_BLOCK);
        blockWithItem(ModBlocks.RAW_PLUTONIUM_BLOCK);
        blockWithItem(ModBlocks.SULFUR_BLOCK);
        blockWithItem(ModBlocks.RAW_TIN_BLOCK);
        blockWithItem(ModBlocks.RAW_URANIUM_BLOCK);

        //ORE BLOCKS
        //ALUMINUM
        blockWithItem(ModBlocks.ALUMINUM_ORE_BLOCK);
        //blockWithItem(ModBlocks.DEEPSLATE_ALUMINUM_ORE_BLOCK);
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

        //GEMS
        //FLUORITE
        blockWithItem(ModBlocks.FLUORITE_ORE_BLOCK);
        blockWithItem(ModBlocks.DEEPSLATE_FLUORITE_ORE_BLOCK);
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
