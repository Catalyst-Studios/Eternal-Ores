package net.radzratz.eternalitems.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
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
        //ITEMS
        basicItem(Moditems.ANGELS_STRING.get());
        basicItem(Moditems.BLACK_HOLE.get());
        basicItem(Moditems.CAPACITOR.get());
        basicItem(Moditems.DEMONIC_HEART.get());
        basicItem(Moditems.GREGTASTIC_ATOMIC_PHD.get());
        basicItem(Moditems.DUMMYPRESS.get());
        basicItem(Moditems.MULTIPRESS.get());
        basicItem(Moditems.RATZ_HEAD.get());
        basicItem(Moditems.UNDEAD_HAND.get());
        basicItem(Moditems.SOURCE_MANIFESTATION.get());
        basicItem(Moditems.ANTIMATTER_FUSE.get());
        basicItem(Moditems.COMET_SHARD.get());
        basicItem(Moditems.FORGOTTEN_SEA_COIN.get());
        basicItem(Moditems.ETERNAL_VORTEX.get());
        basicItem(Moditems.GODS_TEAR.get());
        basicItem(Moditems.DEVILS_TOOTH.get());
        basicItem(Moditems.SERAPHIMS_FEATHER.get());
        basicItem(Moditems.FLATHEAD_SCREWDRIVER.get());
        basicItem(Moditems.CROSSHEAD_SCREWDRIVER.get());
        basicItem(Moditems.FANG.get());
        basicItem(Moditems.SILICON.get());
        basicItem(Moditems.DRAGONS_SCALE.get());
        handheldItem(Moditems.WRENCH);
        //FOODS
        basicItem(Moditems.COOKED_APPLE.get());
        basicItem(Moditems.COOKED_CARROT.get());
        //HAMMERS
        basicItem(Moditems.COBALT_HAMMER.get());
        basicItem(Moditems.COPPER_HAMMER.get());
        //RAW ORES
        basicItem(Moditems.SULFUR.get());
        basicItem(Moditems.RAW_ALUMINUM.get());
        basicItem(Moditems.RAW_COBALT.get());
        basicItem(Moditems.RAW_LEAD.get());
        basicItem(Moditems.RAW_NICKEL.get());
        basicItem(Moditems.RAW_OSMIUM.get());
        basicItem(Moditems.RAW_PLATINUM.get());
        basicItem(Moditems.RAW_SILVER.get());
        basicItem(Moditems.RAW_TIN.get());
        basicItem(Moditems.RAW_URANIUM.get());
        basicItem(Moditems.RAW_ZINC.get());
        //FUELS
        basicItem(Moditems.TINY_CHARCOAL.get());
        basicItem(Moditems.TINY_COAL.get());
        //INGOTS
        basicItem(Moditems.ALUMINUM_INGOT.get());
        basicItem(Moditems.COBALT_INGOT.get());
        basicItem(Moditems.ETERNAL_DARK_INGOT.get());
        basicItem(Moditems.ETERNAL_LIGHT_INGOT.get());
        basicItem(Moditems.GRAPHITE_INGOT.get());
        basicItem(Moditems.LEAD_INGOT.get());
        basicItem(Moditems.NICKEL_INGOT.get());
        basicItem(Moditems.OSMIUM_INGOT.get());
        basicItem(Moditems.PLATINUM_INGOT.get());
        basicItem(Moditems.STEEL_INGOT.get());
        basicItem(Moditems.TIN_INGOT.get());
        basicItem(Moditems.ULTIMATITANIUM_INGOT.get());
        basicItem(Moditems.URANIUM_INGOT.get());
        basicItem(Moditems.ZINC_INGOT.get());
        //NUGGETS
        basicItem(Moditems.ALUMINUM_NUGGET.get());
        basicItem(Moditems.COBALT_NUGGET.get());
        basicItem(Moditems.COPPER_NUGGET.get());
        basicItem(Moditems.LEAD_NUGGET.get());
        basicItem(Moditems.NICKEL_NUGGET.get());
        basicItem(Moditems.OSMIUM_NUGGET.get());
        basicItem(Moditems.PLATINUM_NUGGET.get());
        basicItem(Moditems.TIN_NUGGET.get());
        basicItem(Moditems.ULTIMATITANIUM_NUGGET.get());
        basicItem(Moditems.URANIUM_NUGGET.get());
        basicItem(Moditems.ZINC_NUGGET.get());
        //DUSTS
        basicItem(Moditems.ALUMINUM_DUST.get());
        basicItem(Moditems.COBALT_DUST.get());
        basicItem(Moditems.COPPER_DUST.get());
        basicItem(Moditems.FLUORITE_DUST.get());
        basicItem(Moditems.GOLD_DUST.get());
        basicItem(Moditems.IRON_DUST.get());
        basicItem(Moditems.LEAD_DUST.get());
        basicItem(Moditems.NICKEL_DUST.get());
        basicItem(Moditems.OSMIUM_DUST.get());
        basicItem(Moditems.PLATINUM_DUST.get());
        basicItem(Moditems.SULFUR_DUST.get());
        basicItem(Moditems.TIN_DUST.get());
        basicItem(Moditems.ULTIMATITANIUM_DUST.get());
        basicItem(Moditems.URANIUM_DUST.get());
        basicItem(Moditems.ZINC_DUST.get());
        //RODS
        basicItem(Moditems.ROD_ALUMINUM.get());
        basicItem(Moditems.ROD_COBALT.get());
        basicItem(Moditems.ROD_COPPER.get());
        basicItem(Moditems.ROD_GOLD.get());
        basicItem(Moditems.ROD_IRON.get());
        basicItem(Moditems.ROD_LEAD.get());
        basicItem(Moditems.ROD_NICKEL.get());
        basicItem(Moditems.ROD_OSMIUM.get());
        basicItem(Moditems.ROD_PLATINUM.get());
        basicItem(Moditems.ROD_TIN.get());
        basicItem(Moditems.ROD_ULTIMATITANIUM.get());
        basicItem(Moditems.ROD_URANIUM.get());
        basicItem(Moditems.ROD_ZINC.get());
        //PLATES
        basicItem(Moditems.PLATE_ALUMINUM.get());
        basicItem(Moditems.PLATE_COBALT.get());
        basicItem(Moditems.PLATE_COPPER.get());
        basicItem(Moditems.PLATE_GOLD.get());
        basicItem(Moditems.PLATE_IRON.get());
        basicItem(Moditems.PLATE_LEAD.get());
        basicItem(Moditems.PLATE_NICKEL.get());
        basicItem(Moditems.PLATE_OSMIUM.get());
        basicItem(Moditems.PLATE_PLATINUM.get());
        basicItem(Moditems.PLATE_TIN.get());
        basicItem(Moditems.PLATE_ULTIMATITANIUM.get());
        basicItem(Moditems.PLATE_URANIUM.get());
        basicItem(Moditems.PLATE_ZINC.get());
        //GEARS
        basicItem(Moditems.ULTIMATE_GEAR.get());
        //TOOLS
        handheldItem(Moditems.ETERNAL_DARK_PICKAXE);
        handheldItem(Moditems.COPPER_AXE);
        handheldItem(Moditems.COPPER_PICKAXE);
        handheldItem(Moditems.COPPER_SHOVEL);
        handheldItem(Moditems.COPPER_HOE);
        //SWORDS
        handheldItem(Moditems.ETERNAL_DARK_SWORD);
        handheldItem(Moditems.COPPER_SWORD);
        handheldItem(Moditems.BONE_KNIFE);
        //GEMS
        basicItem(Moditems.FLUORITE.get());
        basicItem(Moditems.GEM_SAPPHIRE.get());
        basicItem(Moditems.GEM_ONYX.get());
        basicItem(Moditems.GEM_OBSIDIAN_SHARD.get());
        basicItem(Moditems.GEM_PERIDOT.get());
        basicItem(Moditems.GEM_RUBY.get());
    }

    private ItemModelBuilder handheldItem(DeferredItem<?> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(EternalItems.MOD_ID, "item/" + item.getId().getPath()));
    }
}
