package net.radzratz.eternalitems.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;
import net.radzratz.eternalitems.EternalItems;
import net.radzratz.eternalitems.item.Moditems;

public class EternalItemModelProvider extends ItemModelProvider {
    public EternalItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, EternalItems.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //HAMMERS
        basicItem(Moditems.COBALT_HAMMER.get());
        basicItem(Moditems.COPPER_HAMMER.get());
        basicItem(Moditems.DIAMOND_HAMMER.get());
        //basicItem(Moditems.ETERNAL_DARK_HAMMER.get());
        basicItem(Moditems.IRON_HAMMER.get());
        basicItem(Moditems.STONE_HAMMER.get());
        //RAW ORES
        basicItem(Moditems.SULFUR.get());
        basicItem(Moditems.RAW_ALUMINUM.get());
        basicItem(Moditems.RAW_COBALT.get());
        basicItem(Moditems.RAW_LEAD.get());
        basicItem(Moditems.RAW_NICKEL.get());
        basicItem(Moditems.RAW_OSMIUM.get());
        basicItem(Moditems.RAW_PLATINUM.get());
        basicItem(Moditems.RAW_PLUTONIUM.get());
        basicItem(Moditems.RAW_SILVER.get());
        basicItem(Moditems.RAW_TIN.get());
        basicItem(Moditems.RAW_ULTIMATITANIUM.get());
        basicItem(Moditems.RAW_URANIUM.get());
        basicItem(Moditems.RAW_ZINC.get());
        //INGOTS
        basicItem(Moditems.ALUMINUM_INGOT.get());
        basicItem(Moditems.BRONZE_INGOT.get());
        basicItem(Moditems.COBALT_INGOT.get());
        basicItem(Moditems.CONSTANTAN_INGOT.get());
        basicItem(Moditems.ELECTRUM_INGOT.get());
        basicItem(Moditems.ENDERIUM_INGOT.get());
        basicItem(Moditems.ETERNAL_DARK_INGOT.get());
        basicItem(Moditems.ETERNAL_LIGHT_INGOT.get());
        basicItem(Moditems.GRAPHITE_INGOT.get());
        basicItem(Moditems.INVAR_INGOT.get());
        basicItem(Moditems.LEAD_INGOT.get());
        basicItem(Moditems.LUMIUM_INGOT.get());
        basicItem(Moditems.NICKEL_INGOT.get());
        basicItem(Moditems.OSMIUM_INGOT.get());
        basicItem(Moditems.PLATINUM_INGOT.get());
        basicItem(Moditems.PLUTONIUM_INGOT.get());
        basicItem(Moditems.REDSTONE_INGOT.get());
        basicItem(Moditems.SIGNALUM_INGOT.get());
        basicItem(Moditems.SILVER_INGOT.get());
        basicItem(Moditems.STEEL_INGOT.get());
        basicItem(Moditems.TIN_INGOT.get());
        basicItem(Moditems.ULTIMATITANIUM_INGOT.get());
        basicItem(Moditems.URANIUM_INGOT.get());
        basicItem(Moditems.ZINC_INGOT.get());
        basicItem(Moditems.BRASS_INGOT.get());
        //NUGGETS
        basicItem(Moditems.ALUMINUM_NUGGET.get());
        basicItem(Moditems.BRONZE_NUGGET.get());
        basicItem(Moditems.COBALT_NUGGET.get());
        basicItem(Moditems.CONSTANTAN_NUGGET.get());
        basicItem(Moditems.COPPER_NUGGET.get());
        basicItem(Moditems.ELECTRUM_NUGGET.get());
        basicItem(Moditems.ENDERIUM_NUGGET.get());
        basicItem(Moditems.INVAR_NUGGET.get());
        basicItem(Moditems.LEAD_NUGGET.get());
        basicItem(Moditems.LUMIUM_NUGGET.get());
        basicItem(Moditems.NICKEL_NUGGET.get());
        basicItem(Moditems.OSMIUM_NUGGET.get());
        basicItem(Moditems.PLATINUM_NUGGET.get());
        basicItem(Moditems.PLUTONIUM_NUGGET.get());
        basicItem(Moditems.TIN_NUGGET.get());
        basicItem(Moditems.SIGNALUM_NUGGET.get());
        basicItem(Moditems.SILVER_NUGGET.get());
        basicItem(Moditems.ULTIMATITANIUM_NUGGET.get());
        basicItem(Moditems.URANIUM_NUGGET.get());
        basicItem(Moditems.ZINC_NUGGET.get());
        basicItem(Moditems.GRAPHITE_NUGGET.get());
        basicItem(Moditems.BRASS_NUGGET.get());
        //DUSTS
        basicItem(Moditems.ALUMINUM_DUST.get());
        basicItem(Moditems.BRONZE_DUST.get());
        basicItem(Moditems.COBALT_DUST.get());
        basicItem(Moditems.CONSTANTAN_DUST.get());
        basicItem(Moditems.COPPER_DUST.get());
        basicItem(Moditems.ELECTRUM_DUST.get());
        basicItem(Moditems.ENDERIUM_DUST.get());
        basicItem(Moditems.ENDER_DUST.get());
        basicItem(Moditems.FLUORITE_DUST.get());
        basicItem(Moditems.GOLD_DUST.get());
        basicItem(Moditems.INVAR_DUST.get());
        basicItem(Moditems.IRON_DUST.get());
        basicItem(Moditems.LEAD_DUST.get());
        basicItem(Moditems.LUMIUM_DUST.get());
        basicItem(Moditems.NICKEL_DUST.get());
        basicItem(Moditems.OSMIUM_DUST.get());
        basicItem(Moditems.PLATINUM_DUST.get());
        basicItem(Moditems.PLUTONIUM_DUST.get());
        basicItem(Moditems.SULFUR_DUST.get());
        basicItem(Moditems.TIN_DUST.get());
        basicItem(Moditems.SIGNALUM_DUST.get());
        basicItem(Moditems.SILVER_DUST.get());
        basicItem(Moditems.ULTIMATITANIUM_DUST.get());
        basicItem(Moditems.URANIUM_DUST.get());
        basicItem(Moditems.ZINC_DUST.get());
        basicItem(Moditems.BRASS_DUST.get());
        //RODS
        handheldItem(Moditems.ROD_ALUMINUM);
        handheldItem(Moditems.ROD_BRONZE);
        handheldItem(Moditems.ROD_COBALT);
        handheldItem(Moditems.ROD_CONSTANTAN);
        handheldItem(Moditems.ROD_COPPER);
        handheldItem(Moditems.ROD_ELECTRUM);
        handheldItem(Moditems.ROD_ENDERIUM);
        handheldItem(Moditems.ROD_GOLD);
        handheldItem(Moditems.ROD_INVAR);
        handheldItem(Moditems.ROD_IRON);
        handheldItem(Moditems.ROD_LEAD);
        handheldItem(Moditems.ROD_LUMIUM);
        handheldItem(Moditems.ROD_NICKEL);
        handheldItem(Moditems.ROD_OSMIUM);
        handheldItem(Moditems.ROD_PLATINUM);
        handheldItem(Moditems.ROD_PLUTONIUM);
        handheldItem(Moditems.ROD_TIN);
        handheldItem(Moditems.ROD_SILVER);
        handheldItem(Moditems.ROD_SIGNALUM);
        handheldItem(Moditems.ROD_ULTIMATITANIUM);
        handheldItem(Moditems.ROD_URANIUM);
        handheldItem(Moditems.ROD_ZINC);
        handheldItem(Moditems.ROD_GRAPHITE);
        handheldItem(Moditems.ROD_BRASS);
        //PLATES
        basicItem(Moditems.PLATE_ALUMINUM.get());
        basicItem(Moditems.PLATE_BRONZE.get());
        basicItem(Moditems.PLATE_COBALT.get());
        basicItem(Moditems.PLATE_CONSTANTAN.get());
        basicItem(Moditems.PLATE_COPPER.get());
        basicItem(Moditems.PLATE_ELECTRUM.get());
        basicItem(Moditems.PLATE_ENDERIUM.get());
        basicItem(Moditems.PLATE_GOLD.get());
        basicItem(Moditems.PLATE_INVAR.get());
        basicItem(Moditems.PLATE_IRON.get());
        basicItem(Moditems.PLATE_LEAD.get());
        basicItem(Moditems.PLATE_LUMIUM.get());
        basicItem(Moditems.PLATE_NICKEL.get());
        basicItem(Moditems.PLATE_OSMIUM.get());
        basicItem(Moditems.PLATE_PLATINUM.get());
        basicItem(Moditems.PLATE_PLUTONIUM.get());
        basicItem(Moditems.PLATE_SIGNALUM.get());
        basicItem(Moditems.PLATE_SILVER.get());
        basicItem(Moditems.PLATE_TIN.get());
        basicItem(Moditems.PLATE_ULTIMATITANIUM.get());
        basicItem(Moditems.PLATE_URANIUM.get());
        basicItem(Moditems.PLATE_ZINC.get());
        basicItem(Moditems.PLATE_GRAPHITE.get());
        basicItem(Moditems.PLATE_BRASS.get());
        //GEARS
        basicItem(Moditems.ULTIMATE_GEAR.get());
        //GEMS
        basicItem(Moditems.FLUORITE.get());
        basicItem(Moditems.GEM_SAPPHIRE.get());
        basicItem(Moditems.GEM_ONYX.get());
        basicItem(Moditems.GEM_OBSIDIAN_SHARD.get());
        basicItem(Moditems.GEM_PERIDOT.get());
        basicItem(Moditems.GEM_RUBY.get());
    }

    private void handheldItem(DeferredItem<?> item) {
        withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(EternalItems.MOD_ID, "item/" + item.getId().getPath()));
    }
}
