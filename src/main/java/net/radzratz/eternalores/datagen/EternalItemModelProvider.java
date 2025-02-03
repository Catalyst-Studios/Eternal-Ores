package net.radzratz.eternalores.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.item.EternalGeneralItems;

public class EternalItemModelProvider extends ItemModelProvider {
    public EternalItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, EternalOres.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        System.out.println("Loading Item Model Provider");

        //HAMMERS
        basicItem(EternalGeneralItems.COBALT_HAMMER.get());
        basicItem(EternalGeneralItems.COPPER_HAMMER.get());
        basicItem(EternalGeneralItems.DIAMOND_HAMMER.get());
        //basicItem(EternalGeneralItems.ETERNAL_DARK_HAMMER.get());
        basicItem(EternalGeneralItems.IRON_HAMMER.get());
        basicItem(EternalGeneralItems.STONE_HAMMER.get());

        //GEM CUTTER
        basicItem(EternalGeneralItems.IRON_GEM_CUTTER.get());

        //RAW ORES
        basicItem(EternalGeneralItems.SULFUR.get());
        basicItem(EternalGeneralItems.RAW_ALUMINUM.get());
        basicItem(EternalGeneralItems.RAW_COBALT.get());
        basicItem(EternalGeneralItems.RAW_LEAD.get());
        basicItem(EternalGeneralItems.RAW_NICKEL.get());
        basicItem(EternalGeneralItems.RAW_OSMIUM.get());
        basicItem(EternalGeneralItems.RAW_PLATINUM.get());
        basicItem(EternalGeneralItems.RAW_PLUTONIUM.get());
        basicItem(EternalGeneralItems.RAW_SILVER.get());
        basicItem(EternalGeneralItems.RAW_TIN.get());
        basicItem(EternalGeneralItems.RAW_ULTIMATITANIUM.get());
        basicItem(EternalGeneralItems.RAW_URANIUM.get());
        basicItem(EternalGeneralItems.RAW_ZINC.get());
        basicItem(EternalGeneralItems.RAW_GALLIUM.get());

        //INGOTS
        basicItem(EternalGeneralItems.ALUMINUM_INGOT.get());
        basicItem(EternalGeneralItems.BRONZE_INGOT.get());
        basicItem(EternalGeneralItems.COBALT_INGOT.get());
        basicItem(EternalGeneralItems.CONSTANTAN_INGOT.get());
        basicItem(EternalGeneralItems.ELECTRUM_INGOT.get());
        basicItem(EternalGeneralItems.ENDERIUM_INGOT.get());
        basicItem(EternalGeneralItems.ETERNAL_DARK_INGOT.get());
        basicItem(EternalGeneralItems.ETERNAL_LIGHT_INGOT.get());
        basicItem(EternalGeneralItems.GRAPHITE_INGOT.get());
        basicItem(EternalGeneralItems.INVAR_INGOT.get());
        basicItem(EternalGeneralItems.LEAD_INGOT.get());
        basicItem(EternalGeneralItems.LUMIUM_INGOT.get());
        basicItem(EternalGeneralItems.NICKEL_INGOT.get());
        basicItem(EternalGeneralItems.OSMIUM_INGOT.get());
        basicItem(EternalGeneralItems.PLATINUM_INGOT.get());
        basicItem(EternalGeneralItems.PLUTONIUM_INGOT.get());
        basicItem(EternalGeneralItems.REDSTONE_INGOT.get());
        basicItem(EternalGeneralItems.SIGNALUM_INGOT.get());
        basicItem(EternalGeneralItems.SILVER_INGOT.get());
        basicItem(EternalGeneralItems.STEEL_INGOT.get());
        basicItem(EternalGeneralItems.TIN_INGOT.get());
        basicItem(EternalGeneralItems.ULTIMATITANIUM_INGOT.get());
        basicItem(EternalGeneralItems.URANIUM_INGOT.get());
        basicItem(EternalGeneralItems.ZINC_INGOT.get());
        basicItem(EternalGeneralItems.BRASS_INGOT.get());
        basicItem(EternalGeneralItems.BLUE_STEEL_INGOT.get());
        basicItem(EternalGeneralItems.GALLIUM_INGOT.get());
        basicItem(EternalGeneralItems.TITANIUM_INGOT.get());
        basicItem(EternalGeneralItems.PEWTER_INGOT.get());
        basicItem(EternalGeneralItems.ROSE_GOLD_INGOT.get());
        basicItem(EternalGeneralItems.BRITANNIA_SILVER_INGOT.get());

        //NUGGETS
        basicItem(EternalGeneralItems.ALUMINUM_NUGGET.get());
        basicItem(EternalGeneralItems.BRONZE_NUGGET.get());
        basicItem(EternalGeneralItems.COBALT_NUGGET.get());
        basicItem(EternalGeneralItems.CONSTANTAN_NUGGET.get());
        basicItem(EternalGeneralItems.COPPER_NUGGET.get());
        basicItem(EternalGeneralItems.ELECTRUM_NUGGET.get());
        basicItem(EternalGeneralItems.ENDERIUM_NUGGET.get());
        basicItem(EternalGeneralItems.INVAR_NUGGET.get());
        basicItem(EternalGeneralItems.LEAD_NUGGET.get());
        basicItem(EternalGeneralItems.LUMIUM_NUGGET.get());
        basicItem(EternalGeneralItems.NICKEL_NUGGET.get());
        basicItem(EternalGeneralItems.OSMIUM_NUGGET.get());
        basicItem(EternalGeneralItems.PLATINUM_NUGGET.get());
        basicItem(EternalGeneralItems.PLUTONIUM_NUGGET.get());
        basicItem(EternalGeneralItems.TIN_NUGGET.get());
        basicItem(EternalGeneralItems.SIGNALUM_NUGGET.get());
        basicItem(EternalGeneralItems.SILVER_NUGGET.get());
        basicItem(EternalGeneralItems.ULTIMATITANIUM_NUGGET.get());
        basicItem(EternalGeneralItems.URANIUM_NUGGET.get());
        basicItem(EternalGeneralItems.ZINC_NUGGET.get());
        basicItem(EternalGeneralItems.GRAPHITE_NUGGET.get());
        basicItem(EternalGeneralItems.BRASS_NUGGET.get());
        basicItem(EternalGeneralItems.NETHERITE_NUGGET.get());
        basicItem(EternalGeneralItems.STEEL_NUGGET.get());
        basicItem(EternalGeneralItems.BLUE_STEEL_NUGGET.get());
        basicItem(EternalGeneralItems.GALLIUM_NUGGET.get());
        basicItem(EternalGeneralItems.TITANIUM_NUGGET.get());
        basicItem(EternalGeneralItems.PEWTER_NUGGET.get());
        basicItem(EternalGeneralItems.ROSE_GOLD_NUGGET.get());
        basicItem(EternalGeneralItems.BRITANNIA_SILVER_NUGGET.get());

        //DUSTS
        basicItem(EternalGeneralItems.ALUMINUM_DUST.get());
        basicItem(EternalGeneralItems.BRONZE_DUST.get());
        basicItem(EternalGeneralItems.COBALT_DUST.get());
        basicItem(EternalGeneralItems.CONSTANTAN_DUST.get());
        basicItem(EternalGeneralItems.COPPER_DUST.get());
        basicItem(EternalGeneralItems.ELECTRUM_DUST.get());
        basicItem(EternalGeneralItems.ENDERIUM_DUST.get());
        basicItem(EternalGeneralItems.ENDER_DUST.get());
        basicItem(EternalGeneralItems.FLUORITE_DUST.get());
        basicItem(EternalGeneralItems.GOLD_DUST.get());
        basicItem(EternalGeneralItems.INVAR_DUST.get());
        basicItem(EternalGeneralItems.IRON_DUST.get());
        basicItem(EternalGeneralItems.LEAD_DUST.get());
        basicItem(EternalGeneralItems.LUMIUM_DUST.get());
        basicItem(EternalGeneralItems.NICKEL_DUST.get());
        basicItem(EternalGeneralItems.OSMIUM_DUST.get());
        basicItem(EternalGeneralItems.PLATINUM_DUST.get());
        basicItem(EternalGeneralItems.PLUTONIUM_DUST.get());
        basicItem(EternalGeneralItems.SULFUR_DUST.get());
        basicItem(EternalGeneralItems.TIN_DUST.get());
        basicItem(EternalGeneralItems.SIGNALUM_DUST.get());
        basicItem(EternalGeneralItems.SILVER_DUST.get());
        basicItem(EternalGeneralItems.ULTIMATITANIUM_DUST.get());
        basicItem(EternalGeneralItems.URANIUM_DUST.get());
        basicItem(EternalGeneralItems.ZINC_DUST.get());
        basicItem(EternalGeneralItems.BRASS_DUST.get());
        basicItem(EternalGeneralItems.NETHERITE_DUST.get());
        basicItem(EternalGeneralItems.GRAPHITE_DUST.get());
        basicItem(EternalGeneralItems.STEEL_DUST.get());
        basicItem(EternalGeneralItems.SAPPHIRE_DUST.get());
        basicItem(EternalGeneralItems.COAL_DUST.get());
        basicItem(EternalGeneralItems.APATITE_DUST.get());
        basicItem(EternalGeneralItems.CINNABAR_DUST.get());
        basicItem(EternalGeneralItems.RUBY_DUST.get());
        basicItem(EternalGeneralItems.ONYX_DUST.get());
        basicItem(EternalGeneralItems.AMBER_DUST.get());
        basicItem(EternalGeneralItems.NITER_DUST.get());
        basicItem(EternalGeneralItems.BLUE_STEEL_DUST.get());
        basicItem(EternalGeneralItems.GALLIUM_DUST.get());
        basicItem(EternalGeneralItems.EMERALD_DUST.get());
        basicItem(EternalGeneralItems.DIAMOND_DUST.get());
        basicItem(EternalGeneralItems.LAPIS_LAZULI_DUST.get());
        basicItem(EternalGeneralItems.TITANIUM_DUST.get());
        basicItem(EternalGeneralItems.QUARTZ_DUST.get());
        basicItem(EternalGeneralItems.PERIDOT_DUST.get());
        basicItem(EternalGeneralItems.OBSIDIAN_DUST.get());
        basicItem(EternalGeneralItems.NETHERRACK_DUST.get());
        basicItem(EternalGeneralItems.ENDSTONE_DUST.get());
        basicItem(EternalGeneralItems.PEWTER_DUST.get());
        basicItem(EternalGeneralItems.ROSE_GOLD_DUST.get());
        basicItem(EternalGeneralItems.BRITANNIA_SILVER_DUST.get());

        //RODS
        handheldItem(EternalGeneralItems.ROD_ALUMINUM);
        handheldItem(EternalGeneralItems.ROD_BRONZE);
        handheldItem(EternalGeneralItems.ROD_COBALT);
        handheldItem(EternalGeneralItems.ROD_CONSTANTAN);
        handheldItem(EternalGeneralItems.ROD_COPPER);
        handheldItem(EternalGeneralItems.ROD_ELECTRUM);
        handheldItem(EternalGeneralItems.ROD_ENDERIUM);
        handheldItem(EternalGeneralItems.ROD_GOLD);
        handheldItem(EternalGeneralItems.ROD_INVAR);
        handheldItem(EternalGeneralItems.ROD_IRON);
        handheldItem(EternalGeneralItems.ROD_LEAD);
        handheldItem(EternalGeneralItems.ROD_LUMIUM);
        handheldItem(EternalGeneralItems.ROD_NICKEL);
        handheldItem(EternalGeneralItems.ROD_OSMIUM);
        handheldItem(EternalGeneralItems.ROD_PLATINUM);
        handheldItem(EternalGeneralItems.ROD_PLUTONIUM);
        handheldItem(EternalGeneralItems.ROD_TIN);
        handheldItem(EternalGeneralItems.ROD_SILVER);
        handheldItem(EternalGeneralItems.ROD_SIGNALUM);
        handheldItem(EternalGeneralItems.ROD_ULTIMATITANIUM);
        handheldItem(EternalGeneralItems.ROD_URANIUM);
        handheldItem(EternalGeneralItems.ROD_ZINC);
        handheldItem(EternalGeneralItems.ROD_GRAPHITE);
        handheldItem(EternalGeneralItems.ROD_BRASS);
        handheldItem(EternalGeneralItems.ROD_NETHERITE);
        handheldItem(EternalGeneralItems.ROD_STEEL);
        handheldItem(EternalGeneralItems.ROD_SAPPHIRE);
        handheldItem(EternalGeneralItems.ROD_BLUE_STEEL);
        handheldItem(EternalGeneralItems.ROD_GALLIUM);
        handheldItem(EternalGeneralItems.ROD_TITANIUM);
        handheldItem(EternalGeneralItems.ROD_ROSE_GOLD);
        handheldItem(EternalGeneralItems.ROD_DIAMOND);

        //PLATES
        basicItem(EternalGeneralItems.PLATE_ALUMINUM.get());
        basicItem(EternalGeneralItems.PLATE_BRONZE.get());
        basicItem(EternalGeneralItems.PLATE_COBALT.get());
        basicItem(EternalGeneralItems.PLATE_CONSTANTAN.get());
        basicItem(EternalGeneralItems.PLATE_COPPER.get());
        basicItem(EternalGeneralItems.PLATE_ELECTRUM.get());
        basicItem(EternalGeneralItems.PLATE_ENDERIUM.get());
        basicItem(EternalGeneralItems.PLATE_GOLD.get());
        basicItem(EternalGeneralItems.PLATE_INVAR.get());
        basicItem(EternalGeneralItems.PLATE_IRON.get());
        basicItem(EternalGeneralItems.PLATE_LEAD.get());
        basicItem(EternalGeneralItems.PLATE_LUMIUM.get());
        basicItem(EternalGeneralItems.PLATE_NICKEL.get());
        basicItem(EternalGeneralItems.PLATE_OSMIUM.get());
        basicItem(EternalGeneralItems.PLATE_PLATINUM.get());
        basicItem(EternalGeneralItems.PLATE_PLUTONIUM.get());
        basicItem(EternalGeneralItems.PLATE_SIGNALUM.get());
        basicItem(EternalGeneralItems.PLATE_SILVER.get());
        basicItem(EternalGeneralItems.PLATE_TIN.get());
        basicItem(EternalGeneralItems.PLATE_ULTIMATITANIUM.get());
        basicItem(EternalGeneralItems.PLATE_URANIUM.get());
        basicItem(EternalGeneralItems.PLATE_ZINC.get());
        basicItem(EternalGeneralItems.PLATE_GRAPHITE.get());
        basicItem(EternalGeneralItems.PLATE_BRASS.get());
        basicItem(EternalGeneralItems.PLATE_NETHERITE.get());
        basicItem(EternalGeneralItems.PLATE_STEEL.get());
        basicItem(EternalGeneralItems.PLATE_SAPPHIRE.get());
        basicItem(EternalGeneralItems.PLATE_BLUE_STEEL.get());
        basicItem(EternalGeneralItems.PLATE_GALLIUM.get());
        basicItem(EternalGeneralItems.PLATE_TITANIUM.get());
        basicItem(EternalGeneralItems.PLATE_ROSE_GOLD.get());

        //GEARS
        basicItem(EternalGeneralItems.GEAR_ALUMINUM.get());
        basicItem(EternalGeneralItems.GEAR_BRONZE.get());
        basicItem(EternalGeneralItems.GEAR_COPPER.get());
        basicItem(EternalGeneralItems.GEAR_DIAMOND.get());
        basicItem(EternalGeneralItems.GEAR_ENDERIUM.get());
        basicItem(EternalGeneralItems.GEAR_GOLD.get());
        basicItem(EternalGeneralItems.GEAR_IRON.get());
        basicItem(EternalGeneralItems.GEAR_LEAD.get());
        basicItem(EternalGeneralItems.GEAR_OSMIUM.get());
        basicItem(EternalGeneralItems.GEAR_STEEL.get());
        basicItem(EternalGeneralItems.GEAR_TIN.get());
        basicItem(EternalGeneralItems.ULTIMATE_GEAR.get());

        //GEMS
        basicItem(EternalGeneralItems.FLUORITE.get());
        basicItem(EternalGeneralItems.GEM_SAPPHIRE.get());
        basicItem(EternalGeneralItems.GEM_ONYX.get());
        basicItem(EternalGeneralItems.GEM_OBSIDIAN_SHARD.get());
        basicItem(EternalGeneralItems.GEM_PERIDOT.get());
        basicItem(EternalGeneralItems.GEM_RUBY.get());
        basicItem(EternalGeneralItems.GEM_APATITE.get());
        basicItem(EternalGeneralItems.GEM_CINNABAR.get());
        basicItem(EternalGeneralItems.GEM_AMBER.get());
        basicItem(EternalGeneralItems.GEM_NITER.get());

        //GEM SHARDS
        basicItem(EternalGeneralItems.GEM_SAPPHIRE_SHARD.get());
    }

    private void handheldItem(DeferredItem<?> item) {
        withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(EternalOres.MOD_ID, "item/" + item.getId().getPath()));
    }
}
