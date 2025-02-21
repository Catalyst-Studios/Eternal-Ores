package net.radzratz.eternalores.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.block.EternalGeneralBlocks;
import net.radzratz.eternalores.item.EternalGeneralItems;
import net.radzratz.eternalores.util.tags.block.ores.EternalOreBlockTags;
import net.radzratz.eternalores.util.tags.block.storage_blocks.EternalStorageGemBlockTags;
import net.radzratz.eternalores.util.tags.block.storage_blocks.EternalStorageMetalBlockTags;
import net.radzratz.eternalores.util.tags.block.storage_blocks.EternalStorageRawOreBlockTags;
import net.radzratz.eternalores.util.tags.item.EternalItemsGeneralTags;
import net.radzratz.eternalores.util.tags.item.dusts.EternalGemDustsTags;
import net.radzratz.eternalores.util.tags.item.dusts.EternalMetalDustsTags;
import net.radzratz.eternalores.util.tags.item.dusts.EternalMiscDustsTags;
import net.radzratz.eternalores.util.tags.item.dusts.EternalStoneDustsTags;
import net.radzratz.eternalores.util.tags.item.gears.EternalGemGearTags;
import net.radzratz.eternalores.util.tags.item.gears.EternalMetalGearTags;
import net.radzratz.eternalores.util.tags.item.ingots.EternalIngotTags;
import net.radzratz.eternalores.util.tags.item.nuggets.EternalNuggetsTags;
import net.radzratz.eternalores.util.tags.item.ores.EternalOreBlockItemTags;
import net.radzratz.eternalores.util.tags.item.plates.EternalPlates;
import net.radzratz.eternalores.util.tags.item.rods.EternalGemRodsTags;
import net.radzratz.eternalores.util.tags.item.rods.EternalMetalRodsTags;
import net.radzratz.eternalores.util.tags.item.rods.EternalMiscRodsTags;
import net.radzratz.eternalores.util.tags.item.storage_blocks.EternalStorageGemBlockItemTags;
import net.radzratz.eternalores.util.tags.item.storage_blocks.EternalStorageMetalBlockItemTags;
import net.radzratz.eternalores.util.tags.item.storage_blocks.EternalStorageRawOreBlockItemTags;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class EternalItemTagProvider extends ItemTagsProvider {
    public EternalItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                  CompletableFuture<TagLookup<Block>> blockTags,
                                  @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, EternalOres.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {

        System.out.println("Loading Tool & Item Tags");

                //Tools
                tag(EternalItemsGeneralTags.Items.HAMMERS)
                        .add(EternalGeneralItems.COBALT_HAMMER.get())
                        .add(EternalGeneralItems.COPPER_HAMMER.get())
                        //.add(EternalGeneralItems.ETERNAL_DARK_HAMMER.get())
                        .add(EternalGeneralItems.DIAMOND_HAMMER.get())
                        .add(EternalGeneralItems.IRON_HAMMER.get())
                        .add(EternalGeneralItems.STONE_HAMMER.get());


                tag(EternalItemsGeneralTags.Items.GEM_CUTTER).add(EternalGeneralItems.IRON_GEM_CUTTER.get());

                //Plates
                tag(EternalItemsGeneralTags.Items.PLATES)
                        .add(EternalGeneralItems.PLATE_ALUMINUM.get())
                        .add(EternalGeneralItems.PLATE_BLUE_STEEL.get())
                        .add(EternalGeneralItems.PLATE_BRASS.get())
                        .add(EternalGeneralItems.PLATE_BRONZE.get())
                        .add(EternalGeneralItems.PLATE_COBALT.get())
                        .add(EternalGeneralItems.PLATE_CONSTANTAN.get())
                        .add(EternalGeneralItems.PLATE_COPPER.get())
                        .add(EternalGeneralItems.PLATE_ELECTRUM.get())
                        .add(EternalGeneralItems.PLATE_ENDERIUM.get())
                        .add(EternalGeneralItems.PLATE_GALLIUM.get())
                        .add(EternalGeneralItems.PLATE_GOLD.get())
                        .add(EternalGeneralItems.PLATE_GRAPHITE.get())
                        .add(EternalGeneralItems.PLATE_INVAR.get())
                        .add(EternalGeneralItems.PLATE_IRON.get())
                        .add(EternalGeneralItems.PLATE_LEAD.get())
                        .add(EternalGeneralItems.PLATE_LUMIUM.get())
                        .add(EternalGeneralItems.PLATE_NETHERITE.get())
                        .add(EternalGeneralItems.PLATE_NICKEL.get())
                        .add(EternalGeneralItems.PLATE_OSMIUM.get())
                        .add(EternalGeneralItems.PLATE_PLATINUM.get())
                        .add(EternalGeneralItems.PLATE_PLUTONIUM.get())
                        .add(EternalGeneralItems.PLATE_ROSE_GOLD.get())
                        .add(EternalGeneralItems.PLATE_SAPPHIRE.get())
                        .add(EternalGeneralItems.PLATE_SIGNALUM.get())
                        .add(EternalGeneralItems.PLATE_SILVER.get())
                        .add(EternalGeneralItems.PLATE_STEEL.get())
                        .add(EternalGeneralItems.PLATE_TIN.get())
                        .add(EternalGeneralItems.PLATE_TITANIUM.get())
                        .add(EternalGeneralItems.PLATE_ULTIMATITANIUM.get())
                        .add(EternalGeneralItems.PLATE_URANIUM.get())
                        .add(EternalGeneralItems.PLATE_ZINC.get());

                //Metal Plates
                tag(EternalItemsGeneralTags.Items.METAL_PLATES)
                        .add(EternalGeneralItems.PLATE_ALUMINUM.get())
                        .add(EternalGeneralItems.PLATE_BLUE_STEEL.get())
                        .add(EternalGeneralItems.PLATE_BRASS.get())
                        .add(EternalGeneralItems.PLATE_BRONZE.get())
                        .add(EternalGeneralItems.PLATE_COBALT.get())
                        .add(EternalGeneralItems.PLATE_CONSTANTAN.get())
                        .add(EternalGeneralItems.PLATE_COPPER.get())
                        .add(EternalGeneralItems.PLATE_ELECTRUM.get())
                        .add(EternalGeneralItems.PLATE_ENDERIUM.get())
                        .add(EternalGeneralItems.PLATE_GALLIUM.get())
                        .add(EternalGeneralItems.PLATE_GOLD.get())
                        .add(EternalGeneralItems.PLATE_INVAR.get())
                        .add(EternalGeneralItems.PLATE_IRON.get())
                        .add(EternalGeneralItems.PLATE_LEAD.get())
                        .add(EternalGeneralItems.PLATE_LUMIUM.get())
                        .add(EternalGeneralItems.PLATE_NETHERITE.get())
                        .add(EternalGeneralItems.PLATE_NICKEL.get())
                        .add(EternalGeneralItems.PLATE_OSMIUM.get())
                        .add(EternalGeneralItems.PLATE_PLATINUM.get())
                        .add(EternalGeneralItems.PLATE_ROSE_GOLD.get())
                        .add(EternalGeneralItems.PLATE_SIGNALUM.get())
                        .add(EternalGeneralItems.PLATE_SILVER.get())
                        .add(EternalGeneralItems.PLATE_STEEL.get())
                        .add(EternalGeneralItems.PLATE_TIN.get())
                        .add(EternalGeneralItems.PLATE_TITANIUM.get())
                        .add(EternalGeneralItems.PLATE_ULTIMATITANIUM.get())
                        .add(EternalGeneralItems.PLATE_URANIUM.get())
                        .add(EternalGeneralItems.PLATE_ZINC.get());

                //Gem Plates
                tag(EternalItemsGeneralTags.Items.GEM_PLATES)
                        .add(EternalGeneralItems.PLATE_SAPPHIRE.get());

                //Individual Plates

                tag(EternalPlates.Items.ALUMINUM_PLATE).add(EternalGeneralItems.PLATE_ALUMINUM.get());
                tag(EternalPlates.Items.ALUMINIUM_PLATE).add(EternalGeneralItems.PLATE_ALUMINUM.get());
                tag(EternalPlates.Items.BLUE_STEEL_PLATE).add(EternalGeneralItems.PLATE_BLUE_STEEL.get());
                tag(EternalPlates.Items.BRASS_PLATE).add(EternalGeneralItems.PLATE_BRASS.get());
                tag(EternalPlates.Items.BRONZE_PLATE).add(EternalGeneralItems.PLATE_BRONZE.get());
                tag(EternalPlates.Items.COBALT_PLATE).add(EternalGeneralItems.PLATE_COBALT.get());
                tag(EternalPlates.Items.CONSTANTAN_PLATE).add(EternalGeneralItems.PLATE_CONSTANTAN.get());
                tag(EternalPlates.Items.COPPER_PLATE).add(EternalGeneralItems.PLATE_COPPER.get());
                tag(EternalPlates.Items.ELECTRUM_PLATE).add(EternalGeneralItems.PLATE_ELECTRUM.get());
                tag(EternalPlates.Items.ENDERIUM_PLATE) .add(EternalGeneralItems.PLATE_ENDERIUM.get());
                tag(EternalPlates.Items.GALLIUM_PLATE).add(EternalGeneralItems.PLATE_GALLIUM.get());
                tag(EternalPlates.Items.GOLD_PLATE).add(EternalGeneralItems.PLATE_GOLD.get());
                tag(EternalPlates.Items.GRAPHITE_PLATE).add(EternalGeneralItems.PLATE_GRAPHITE.get());
                tag(EternalPlates.Items.INVAR_PLATE).add(EternalGeneralItems.PLATE_INVAR.get());
                tag(EternalPlates.Items.IRON_PLATE).add(EternalGeneralItems.PLATE_IRON.get());
                tag(EternalPlates.Items.LEAD_PLATE).add(EternalGeneralItems.PLATE_LEAD.get());
                tag(EternalPlates.Items.LUMIUM_PLATE).add(EternalGeneralItems.PLATE_LUMIUM.get());
                tag(EternalPlates.Items.NETHERITE_PLATE).add(EternalGeneralItems.PLATE_NETHERITE.get());
                tag(EternalPlates.Items.NICKEL_PLATE).add(EternalGeneralItems.PLATE_NICKEL.get());
                tag(EternalPlates.Items.OSMIUM_PLATE).add(EternalGeneralItems.PLATE_OSMIUM.get());
                tag(EternalPlates.Items.PLATINUM_PLATE).add(EternalGeneralItems.PLATE_PLATINUM.get());
                tag(EternalPlates.Items.PLUTONIUM_PLATE).add(EternalGeneralItems.PLATE_PLUTONIUM.get());
                tag(EternalPlates.Items.ROSE_GOLD_PLATE).add(EternalGeneralItems.PLATE_ROSE_GOLD.get());
                tag(EternalPlates.Items.SAPPHIRE_PLATE).add(EternalGeneralItems.PLATE_SAPPHIRE.get());
                tag(EternalPlates.Items.SIGNALUM_PLATE).add(EternalGeneralItems.PLATE_SIGNALUM.get());
                tag(EternalPlates.Items.SILVER_PLATE).add(EternalGeneralItems.PLATE_SILVER.get());
                tag(EternalPlates.Items.STEEL_PLATE).add(EternalGeneralItems.PLATE_STEEL.get());
                tag(EternalPlates.Items.TIN_PLATE).add(EternalGeneralItems.PLATE_TIN.get());
                tag(EternalPlates.Items.TITANIUM_PLATE).add(EternalGeneralItems.PLATE_TITANIUM.get());
                tag(EternalPlates.Items.ULTIMATITANIUM_PLATE).add(EternalGeneralItems.PLATE_ULTIMATITANIUM.get());
                tag(EternalPlates.Items.URANIUM_PLATE).add(EternalGeneralItems.PLATE_URANIUM.get());
                tag(EternalPlates.Items.ZINC_PLATE).add(EternalGeneralItems.PLATE_ZINC.get());

                //Misc
                tag(EternalItemsGeneralTags.Items.SILICON).add(EternalGeneralItems.SILICON.get());

                //Ingots
                tag(Tags.Items.INGOTS)
                        .add(EternalGeneralItems.ALUMINUM_INGOT.get())
                        .add(EternalGeneralItems.BLUE_STEEL_INGOT.get())
                        .add(EternalGeneralItems.BRASS_INGOT.get())
                        .add(EternalGeneralItems.BRITANNIA_SILVER_INGOT.get())
                        .add(EternalGeneralItems.BRONZE_INGOT.get())
                        .add(EternalGeneralItems.COBALT_INGOT.get())
                        .add(EternalGeneralItems.CONSTANTAN_INGOT.get())
                        .add(EternalGeneralItems.ELECTRUM_INGOT.get())
                        .add(EternalGeneralItems.ENDERIUM_INGOT.get())
                        .add(EternalGeneralItems.ETERNAL_DARK_INGOT.get())
                        .add(EternalGeneralItems.ETERNAL_LIGHT_INGOT.get())
                        .add(EternalGeneralItems.GALLIUM_INGOT.get())
                        .add(EternalGeneralItems.GRAPHITE_INGOT.get())
                        .add(EternalGeneralItems.INVAR_INGOT.get())
                        .add(EternalGeneralItems.LEAD_INGOT.get())
                        .add(EternalGeneralItems.LUMIUM_INGOT.get())
                        .add(EternalGeneralItems.NICKEL_INGOT.get())
                        .add(EternalGeneralItems.OSMIUM_INGOT.get())
                        .add(EternalGeneralItems.PEWTER_INGOT.get())
                        .add(EternalGeneralItems.PLATINUM_INGOT.get())
                        .add(EternalGeneralItems.PLUTONIUM_INGOT.get())
                        .add(EternalGeneralItems.REDSTONE_INGOT.get())
                        .add(EternalGeneralItems.ROSE_GOLD_INGOT.get())
                        .add(EternalGeneralItems.SIGNALUM_INGOT.get())
                        .add(EternalGeneralItems.SILVER_INGOT.get())
                        .add(EternalGeneralItems.STEEL_INGOT.get())
                        .add(EternalGeneralItems.TIN_INGOT.get())
                        .add(EternalGeneralItems.TITANIUM_INGOT.get())
                        .add(EternalGeneralItems.ULTIMATITANIUM_INGOT.get())
                        .add(EternalGeneralItems.URANIUM_INGOT.get())
                        .add(EternalGeneralItems.ZINC_INGOT.get());

                //Individual Ingots
                tag(EternalIngotTags.Items.ALUMINUM_INGOT).add(EternalGeneralItems.ALUMINUM_INGOT.get());
                tag(EternalIngotTags.Items.ALUMINIUM_INGOT).add(EternalGeneralItems.ALUMINUM_INGOT.get());
                tag(EternalIngotTags.Items.BLUE_STEEL_INGOT).add(EternalGeneralItems.BLUE_STEEL_INGOT.get());
                tag(EternalIngotTags.Items.BRASS_INGOT).add(EternalGeneralItems.BRASS_INGOT.get());
                tag(EternalIngotTags.Items.BRITANNIA_INGOT).add(EternalGeneralItems.BRITANNIA_SILVER_INGOT.get());
                tag(EternalIngotTags.Items.BRONZE_INGOT).add(EternalGeneralItems.BRONZE_INGOT.get());
                tag(EternalIngotTags.Items.COBALT_INGOT).add(EternalGeneralItems.COBALT_INGOT.get());
                tag(EternalIngotTags.Items.CONSTANTAN_INGOT).add(EternalGeneralItems.CONSTANTAN_INGOT.get());
                tag(EternalIngotTags.Items.ELECTRUM_INGOT).add(EternalGeneralItems.ELECTRUM_INGOT.get());
                tag(EternalIngotTags.Items.ENDERIUM_INGOT).add(EternalGeneralItems.ENDERIUM_INGOT.get());
                tag(EternalIngotTags.Items.ETERNAL_DARK_INGOT).add(EternalGeneralItems.ETERNAL_DARK_INGOT.get());
                tag(EternalIngotTags.Items.ETERNAL_LIGHT_INGOT).add(EternalGeneralItems.ETERNAL_LIGHT_INGOT.get());
                tag(EternalIngotTags.Items.GALLIUM_INGOT).add(EternalGeneralItems.GALLIUM_INGOT.get());
                tag(EternalIngotTags.Items.GRAPHITE_INGOT).add(EternalGeneralItems.GRAPHITE_INGOT.get());
                tag(EternalIngotTags.Items.INVAR_INGOT).add(EternalGeneralItems.INVAR_INGOT.get());
                tag(EternalIngotTags.Items.LEAD_INGOT).add(EternalGeneralItems.LEAD_INGOT.get());
                tag(EternalIngotTags.Items.LUMIUM_INGOT).add(EternalGeneralItems.LUMIUM_INGOT.get());
                tag(EternalIngotTags.Items.NICKEL_INGOT).add(EternalGeneralItems.NICKEL_INGOT.get());
                tag(EternalIngotTags.Items.OSMIUM_INGOT).add(EternalGeneralItems.OSMIUM_INGOT.get());
                tag(EternalIngotTags.Items.PEWTER_INGOT).add(EternalGeneralItems.PEWTER_INGOT.get());
                tag(EternalIngotTags.Items.PLATINUM_INGOT).add(EternalGeneralItems.PLATINUM_INGOT.get());
                tag(EternalIngotTags.Items.PLUTONIUM_INGOT).add(EternalGeneralItems.PLUTONIUM_INGOT.get());
                tag(EternalIngotTags.Items.REDSTONE_INGOT).add(EternalGeneralItems.REDSTONE_INGOT.get());
                tag(EternalIngotTags.Items.ROSE_GOLD_INGOT).add(EternalGeneralItems.ROSE_GOLD_INGOT.get());
                tag(EternalIngotTags.Items.SIGNALUM_INGOT).add(EternalGeneralItems.SIGNALUM_INGOT.get());
                tag(EternalIngotTags.Items.SILVER_INGOT).add(EternalGeneralItems.SILVER_INGOT.get());
                tag(EternalIngotTags.Items.STEEL_INGOT).add(EternalGeneralItems.STEEL_INGOT.get());
                tag(EternalIngotTags.Items.TIN_INGOT).add(EternalGeneralItems.TIN_INGOT.get());
                tag(EternalIngotTags.Items.TITANIUM_INGOT).add(EternalGeneralItems.TITANIUM_INGOT.get());
                tag(EternalIngotTags.Items.ULTIMATITANIUM_INGOT).add(EternalGeneralItems.ULTIMATITANIUM_INGOT.get());
                tag(EternalIngotTags.Items.URANIUM_INGOT).add(EternalGeneralItems.URANIUM_INGOT.get());
                tag(EternalIngotTags.Items.ZINC_INGOT).add(EternalGeneralItems.ZINC_INGOT.get());

                tag(Tags.Items.ORES)
                        .add(EternalGeneralBlocks.ALUMINUM_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.DEEPSLATE_ALUMINUM_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.AMBER_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.DEEPSLATE_AMBER_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.APATITE_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.DEEPSLATE_APATITE_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.CINNABAR_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.DEEPSLATE_CINNABAR_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.COBALT_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.DEEPSLATE_COBALT_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.FLUORITE_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.DEEPSLATE_FLUORITE_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.GALLIUM_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.DEEPSLATE_GALLIUM_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.LEAD_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.DEEPSLATE_LEAD_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.NICKEL_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.DEEPSLATE_NICKEL_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.NITER_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.DEEPSLATE_NITER_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.OBSIDIAN_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.ONYX_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.DEEPSLATE_ONYX_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.OSMIUM_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.DEEPSLATE_OSMIUM_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.PERIDOT_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.DEEPSLATE_PERIDOT_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.PLATINUM_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.DEEPSLATE_PLATINUM_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.PLUTONIUM_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.DEEPSLATE_PLUTONIUM_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.RUBY_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.DEEPSLATE_RUBY_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.SAPPHIRE_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.SILVER_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.DEEPSLATE_SILVER_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.SULFUR_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.DEEPSLATE_SULFUR_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.TIN_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.DEEPSLATE_TIN_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.URANIUM_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.DEEPSLATE_URANIUM_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.ZINC_ORE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.DEEPSLATE_ZINC_ORE_BLOCK.asItem());

                //Individual Ores (Item Tag)
                tag(EternalOreBlockItemTags.Items.ITEM_ALUMINUM_ORE_OW).add(EternalGeneralBlocks.ALUMINUM_ORE_BLOCK.asItem());
                tag(EternalOreBlockItemTags.Items.ITEM_ALUMINUM_ORE_OW).add(EternalGeneralBlocks.DEEPSLATE_ALUMINUM_ORE_BLOCK.asItem());
                tag(EternalOreBlockItemTags.Items.ITEM_AMBER_ORE_OW).add(EternalGeneralBlocks.AMBER_ORE_BLOCK.asItem());
                tag(EternalOreBlockItemTags.Items.ITEM_AMBER_ORE_OW).add(EternalGeneralBlocks.DEEPSLATE_AMBER_ORE_BLOCK.asItem());
                tag(EternalOreBlockItemTags.Items.ITEM_APATITE_ORE_OW).add(EternalGeneralBlocks.APATITE_ORE_BLOCK.asItem());
                tag(EternalOreBlockItemTags.Items.ITEM_APATITE_ORE_OW).add(EternalGeneralBlocks.DEEPSLATE_APATITE_ORE_BLOCK.asItem());
                tag(EternalOreBlockItemTags.Items.ITEM_CINNABAR_ORE_OW).add(EternalGeneralBlocks.CINNABAR_ORE_BLOCK.asItem());
                tag(EternalOreBlockItemTags.Items.ITEM_CINNABAR_ORE_OW).add(EternalGeneralBlocks.DEEPSLATE_CINNABAR_ORE_BLOCK.asItem());
                tag(EternalOreBlockItemTags.Items.ITEM_COBALT_ORE_OW).add(EternalGeneralBlocks.COBALT_ORE_BLOCK.asItem());
                tag(EternalOreBlockItemTags.Items.ITEM_COBALT_ORE_OW).add(EternalGeneralBlocks.DEEPSLATE_COBALT_ORE_BLOCK.asItem());
                tag(EternalOreBlockItemTags.Items.ITEM_FLUORITE_ORE_OW).add(EternalGeneralBlocks.FLUORITE_ORE_BLOCK.asItem());
                tag(EternalOreBlockItemTags.Items.ITEM_FLUORITE_ORE_OW).add(EternalGeneralBlocks.DEEPSLATE_FLUORITE_ORE_BLOCK.asItem());
                tag(EternalOreBlockItemTags.Items.ITEM_GALLIUM_ORE_OW).add(EternalGeneralBlocks.GALLIUM_ORE_BLOCK.asItem());
                tag(EternalOreBlockItemTags.Items.ITEM_GALLIUM_ORE_OW).add(EternalGeneralBlocks.DEEPSLATE_GALLIUM_ORE_BLOCK.asItem());
                tag(EternalOreBlockItemTags.Items.ITEM_LEAD_ORE_OW).add(EternalGeneralBlocks.LEAD_ORE_BLOCK.asItem());
                tag(EternalOreBlockItemTags.Items.ITEM_LEAD_ORE_OW).add(EternalGeneralBlocks.DEEPSLATE_LEAD_ORE_BLOCK.asItem());
                tag(EternalOreBlockItemTags.Items.ITEM_NICKEL_ORE_OW).add(EternalGeneralBlocks.NICKEL_ORE_BLOCK.asItem());
                tag(EternalOreBlockItemTags.Items.ITEM_NICKEL_ORE_OW).add(EternalGeneralBlocks.DEEPSLATE_NICKEL_ORE_BLOCK.asItem());
                tag(EternalOreBlockItemTags.Items.ITEM_NITER_ORE_OW).add(EternalGeneralBlocks.NITER_ORE_BLOCK.asItem());
                tag(EternalOreBlockItemTags.Items.ITEM_NITER_ORE_OW).add(EternalGeneralBlocks.DEEPSLATE_NITER_ORE_BLOCK.asItem());
                tag(EternalOreBlockItemTags.Items.ITEM_OBSIDIAN_ORE_NETHER).add(EternalGeneralBlocks.OBSIDIAN_ORE_BLOCK.asItem());
                tag(EternalOreBlockItemTags.Items.ITEM_ONYX_ORE_OW).add(EternalGeneralBlocks.ONYX_ORE_BLOCK.asItem());
                tag(EternalOreBlockItemTags.Items.ITEM_ONYX_ORE_OW).add(EternalGeneralBlocks.DEEPSLATE_ONYX_ORE_BLOCK.asItem());
                tag(EternalOreBlockItemTags.Items.ITEM_OSMIUM_ORE_OW).add(EternalGeneralBlocks.OSMIUM_ORE_BLOCK.asItem());
                tag(EternalOreBlockItemTags.Items.ITEM_OSMIUM_ORE_OW).add(EternalGeneralBlocks.DEEPSLATE_OSMIUM_ORE_BLOCK.asItem());
                tag(EternalOreBlockItemTags.Items.ITEM_PLATINUM_ORE_OW).add(EternalGeneralBlocks.PLATINUM_ORE_BLOCK.asItem());
                tag(EternalOreBlockItemTags.Items.ITEM_PLATINUM_ORE_OW).add(EternalGeneralBlocks.DEEPSLATE_PLATINUM_ORE_BLOCK.asItem());
                tag(EternalOreBlockItemTags.Items.ITEM_RUBY_ORE_OW).add(EternalGeneralBlocks.RUBY_ORE_BLOCK.asItem());
                tag(EternalOreBlockItemTags.Items.ITEM_RUBY_ORE_OW).add(EternalGeneralBlocks.DEEPSLATE_RUBY_ORE_BLOCK.asItem());
                tag(EternalOreBlockItemTags.Items.ITEM_SAPPHIRE_ORE_OW).add(EternalGeneralBlocks.SAPPHIRE_ORE_BLOCK.asItem());
                tag(EternalOreBlockItemTags.Items.ITEM_SAPPHIRE_ORE_OW).add(EternalGeneralBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCK.asItem());
                tag(EternalOreBlockItemTags.Items.ITEM_SILVER_ORE_OW).add(EternalGeneralBlocks.SILVER_ORE_BLOCK.asItem());
                tag(EternalOreBlockItemTags.Items.ITEM_SILVER_ORE_OW).add(EternalGeneralBlocks.DEEPSLATE_SILVER_ORE_BLOCK.asItem());
                tag(EternalOreBlockItemTags.Items.ITEM_SULFUR_ORE_OW).add(EternalGeneralBlocks.SULFUR_ORE_BLOCK.asItem());
                tag(EternalOreBlockItemTags.Items.ITEM_SULFUR_ORE_OW).add(EternalGeneralBlocks.DEEPSLATE_SULFUR_ORE_BLOCK.asItem());
                tag(EternalOreBlockItemTags.Items.ITEM_TIN_ORE_OW).add(EternalGeneralBlocks.TIN_ORE_BLOCK.asItem());
                tag(EternalOreBlockItemTags.Items.ITEM_TIN_ORE_OW).add(EternalGeneralBlocks.DEEPSLATE_TIN_ORE_BLOCK.asItem());
                tag(EternalOreBlockItemTags.Items.ITEM_URANIUM_ORE_OW).add(EternalGeneralBlocks.URANIUM_ORE_BLOCK.asItem());
                tag(EternalOreBlockItemTags.Items.ITEM_URANIUM_ORE_OW).add(EternalGeneralBlocks.DEEPSLATE_URANIUM_ORE_BLOCK.asItem());
                tag(EternalOreBlockItemTags.Items.ITEM_ZINC_ORE_OW).add(EternalGeneralBlocks.ZINC_ORE_BLOCK.asItem());
                tag(EternalOreBlockItemTags.Items.ITEM_ZINC_ORE_OW).add(EternalGeneralBlocks.DEEPSLATE_ZINC_ORE_BLOCK.asItem());

                //General Storage Blocks (Item Tag)
                tag(Tags.Items.STORAGE_BLOCKS)
                        .add(EternalGeneralBlocks.ALUMINUM_BLOCK.asItem())
                        .add(EternalGeneralBlocks.AMBER_BLOCK.asItem())
                        .add(EternalGeneralBlocks.APATITE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.BLUE_STEEL_BLOCK.asItem())
                        .add(EternalGeneralBlocks.BRASS_BLOCK.asItem())
                        .add(EternalGeneralBlocks.BRITANNIA_SILVER_BLOCK.asItem())
                        .add(EternalGeneralBlocks.BRONZE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.CINNABAR_BLOCK.asItem())
                        .add(EternalGeneralBlocks.COBALT_BLOCK.asItem())
                        .add(EternalGeneralBlocks.CONSTANTAN_BLOCK.asItem())
                        .add(EternalGeneralBlocks.ELECTRUM_BLOCK.asItem())
                        .add(EternalGeneralBlocks.ENDERIUM_BLOCK.asItem())
                        .add(EternalGeneralBlocks.FLUORITE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.GALLIUM_BLOCK.asItem())
                        .add(EternalGeneralBlocks.GRAPHITE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.INVAR_BLOCK.asItem())
                        .add(EternalGeneralBlocks.LEAD_BLOCK.asItem())
                        .add(EternalGeneralBlocks.LUMIUM_BLOCK.asItem())
                        .add(EternalGeneralBlocks.NICKEL_BLOCK.asItem())
                        .add(EternalGeneralBlocks.NITER_BLOCK.asItem())
                        .add(EternalGeneralBlocks.ONYX_BLOCK.asItem())
                        .add(EternalGeneralBlocks.OSMIUM_BLOCK.asItem())
                        .add(EternalGeneralBlocks.PERIDOT_BLOCK.asItem())
                        .add(EternalGeneralBlocks.PEWTER_BLOCK.asItem())
                        .add(EternalGeneralBlocks.PLATINUM_BLOCK.asItem())
                        .add(EternalGeneralBlocks.PLUTONIUM_BLOCK.asItem())
                        .add(EternalGeneralBlocks.ROSE_GOLD_BLOCK.asItem())
                        .add(EternalGeneralBlocks.RUBY_BLOCK.asItem())
                        .add(EternalGeneralBlocks.SAPPHIRE_BLOCK.asItem())
                        .add(EternalGeneralBlocks.SIGNALUM_BLOCK.asItem())
                        .add(EternalGeneralBlocks.SILVER_BLOCK.asItem())
                        .add(EternalGeneralBlocks.STEEL_BLOCK.asItem())
                        .add(EternalGeneralBlocks.SULFUR_BLOCK.asItem())
                        .add(EternalGeneralBlocks.TIN_BLOCK.asItem())
                        .add(EternalGeneralBlocks.TITANIUM_BLOCK.asItem())
                        .add(EternalGeneralBlocks.URANIUM_BLOCK.asItem())
                        .add(EternalGeneralBlocks.ZINC_BLOCK.asItem())

                        .add(EternalGeneralBlocks.RAW_ALUMINUM_BLOCK.asItem())
                        .add(EternalGeneralBlocks.RAW_COBALT_BLOCK.asItem())
                        .add(EternalGeneralBlocks.RAW_LEAD_BLOCK.asItem())
                        .add(EternalGeneralBlocks.RAW_NICKEL_BLOCK.asItem())
                        .add(EternalGeneralBlocks.RAW_OSMIUM_BLOCK.asItem())
                        .add(EternalGeneralBlocks.RAW_PLATINUM_BLOCK.asItem())
                        .add(EternalGeneralBlocks.RAW_PLUTONIUM_BLOCK.asItem())
                        .add(EternalGeneralBlocks.RAW_SILVER_BLOCK.asItem())
                        .add(EternalGeneralBlocks.RAW_TIN_BLOCK.asItem())
                        .add(EternalGeneralBlocks.RAW_URANIUM_BLOCK.asItem())
                        .add(EternalGeneralBlocks.RAW_ZINC_BLOCK.asItem());

            //Individual Storage Blocks (Item Tag)
            tag(EternalStorageMetalBlockItemTags.Blocks.ALUMINUM_BLOCK_ST_ITEM).add(EternalGeneralBlocks.ALUMINUM_BLOCK.asItem());
            tag(EternalStorageMetalBlockItemTags.Blocks.BLUE_STEEL_BLOCK_ST_ITEM).add(EternalGeneralBlocks.BLUE_STEEL_BLOCK.asItem());
            tag(EternalStorageMetalBlockItemTags.Blocks.BRASS_BLOCK_ST_ITEM).add(EternalGeneralBlocks.BRASS_BLOCK.asItem());
            tag(EternalStorageMetalBlockItemTags.Blocks.BRITANNIA_BLOCK_ST_ITEM).add(EternalGeneralBlocks.BRITANNIA_SILVER_BLOCK.asItem());
            tag(EternalStorageMetalBlockItemTags.Blocks.BRONZE_BLOCK_ST_ITEM).add(EternalGeneralBlocks.BRONZE_BLOCK.asItem());
            tag(EternalStorageMetalBlockItemTags.Blocks.COBALT_BLOCK_ST_ITEM).add(EternalGeneralBlocks.COBALT_BLOCK.asItem());
            tag(EternalStorageMetalBlockItemTags.Blocks.CONSTANTAN_BLOCK_ST_ITEM).add(EternalGeneralBlocks.CONSTANTAN_BLOCK.asItem());
            tag(EternalStorageMetalBlockItemTags.Blocks.ELECTRUM_BLOCK_ST_ITEM).add(EternalGeneralBlocks.ELECTRUM_BLOCK.asItem());
            tag(EternalStorageMetalBlockItemTags.Blocks.ENDERIUM_BLOCK_ST_ITEM).add(EternalGeneralBlocks.ENDERIUM_BLOCK.asItem());
            tag(EternalStorageMetalBlockItemTags.Blocks.GALLIUM_BLOCK_ST_ITEM).add(EternalGeneralBlocks.GALLIUM_BLOCK.asItem());
            tag(EternalStorageMetalBlockItemTags.Blocks.INVAR_BLOCK_ST_ITEM).add(EternalGeneralBlocks.INVAR_BLOCK.asItem());
            tag(EternalStorageMetalBlockItemTags.Blocks.LEAD_BLOCK_ST_ITEM).add(EternalGeneralBlocks.LEAD_BLOCK.asItem());
            tag(EternalStorageMetalBlockItemTags.Blocks.LUMIUM_BLOCK_ST_ITEM).add(EternalGeneralBlocks.LUMIUM_BLOCK.asItem());
            tag(EternalStorageMetalBlockItemTags.Blocks.NICKEL_BLOCK_ST_ITEM).add(EternalGeneralBlocks.NICKEL_BLOCK.asItem());
            tag(EternalStorageMetalBlockItemTags.Blocks.OSMIUM_BLOCK_ST_ITEM).add(EternalGeneralBlocks.OSMIUM_BLOCK.asItem());
            tag(EternalStorageMetalBlockItemTags.Blocks.PEWTER_BLOCK_ST_ITEM).add(EternalGeneralBlocks.PEWTER_BLOCK.asItem());
            tag(EternalStorageMetalBlockItemTags.Blocks.PLATINUM_BLOCK_ST_ITEM).add(EternalGeneralBlocks.PLATINUM_BLOCK.asItem());
            tag(EternalStorageMetalBlockItemTags.Blocks.ROSE_GOLD_BLOCK_ST_ITEM).add(EternalGeneralBlocks.ROSE_GOLD_BLOCK.asItem());
            tag(EternalStorageMetalBlockItemTags.Blocks.SIGNALUM_BLOCK_ST_ITEM).add(EternalGeneralBlocks.SIGNALUM_BLOCK.asItem());
            tag(EternalStorageMetalBlockItemTags.Blocks.SILVER_BLOCK_ST_ITEM).add(EternalGeneralBlocks.SILVER_BLOCK.asItem());
            tag(EternalStorageMetalBlockItemTags.Blocks.STEEL_BLOCK_ST_ITEM).add(EternalGeneralBlocks.STEEL_BLOCK.asItem());
            tag(EternalStorageMetalBlockItemTags.Blocks.TIN_BLOCK_ST_ITEM).add(EternalGeneralBlocks.TIN_BLOCK.asItem());
            tag(EternalStorageMetalBlockItemTags.Blocks.TITANIUM_BLOCK_ST_ITEM).add(EternalGeneralBlocks.TITANIUM_BLOCK.asItem());
            tag(EternalStorageMetalBlockItemTags.Blocks.URANIUM_BLOCK_ST_ITEM).add(EternalGeneralBlocks.URANIUM_BLOCK.asItem());
            tag(EternalStorageMetalBlockItemTags.Blocks.ZINC_BLOCK_ST_ITEM).add(EternalGeneralBlocks.ZINC_BLOCK.asItem());

            tag(EternalStorageGemBlockItemTags.Items.AMBER_BLOCK_ST_ITEM).add(EternalGeneralBlocks.AMBER_BLOCK.asItem());
            tag(EternalStorageGemBlockItemTags.Items.APATITE_BLOCK_ST_ITEM).add(EternalGeneralBlocks.APATITE_BLOCK.asItem());
            tag(EternalStorageGemBlockItemTags.Items.CINNABAR_BLOCK_ST_ITEM).add(EternalGeneralBlocks.CINNABAR_BLOCK.asItem());
            tag(EternalStorageGemBlockItemTags.Items.FLUORITE_BLOCK_ST_ITEM).add(EternalGeneralBlocks.FLUORITE_BLOCK.asItem());
            tag(EternalStorageGemBlockItemTags.Items.NITER_BLOCK_ST_ITEM).add(EternalGeneralBlocks.NITER_BLOCK.asItem());
            tag(EternalStorageGemBlockItemTags.Items.ONYX_BLOCK_ST_ITEM).add(EternalGeneralBlocks.ONYX_BLOCK.asItem());
            tag(EternalStorageGemBlockItemTags.Items.PERIDOT_BLOCK_ST_ITEM).add(EternalGeneralBlocks.PERIDOT_BLOCK.asItem());
            tag(EternalStorageGemBlockItemTags.Items.RUBY_BLOCK_ST_ITEM).add(EternalGeneralBlocks.RUBY_BLOCK.asItem());
            tag(EternalStorageGemBlockItemTags.Items.SAPPHIRE_BLOCK_ST_ITEM).add(EternalGeneralBlocks.SAPPHIRE_BLOCK.asItem());

            tag(EternalStorageRawOreBlockItemTags.Blocks.RAW_ALUMINUM_ST_ITEM).add(EternalGeneralBlocks.RAW_ALUMINUM_BLOCK.asItem());
            tag(EternalStorageRawOreBlockItemTags.Blocks.RAW_COBALT_ST_ITEM).add(EternalGeneralBlocks.RAW_COBALT_BLOCK.asItem());
            tag(EternalStorageRawOreBlockItemTags.Blocks.RAW_LEAD_ST_ITEM).add(EternalGeneralBlocks.RAW_LEAD_BLOCK.asItem());
            tag(EternalStorageRawOreBlockItemTags.Blocks.RAW_NICKEL_ST_ITEM).add(EternalGeneralBlocks.RAW_NICKEL_BLOCK.asItem());
            tag(EternalStorageRawOreBlockItemTags.Blocks.RAW_OSMIUM_ST_ITEM).add(EternalGeneralBlocks.RAW_OSMIUM_BLOCK.asItem());
            tag(EternalStorageRawOreBlockItemTags.Blocks.RAW_PLATINUM_ST_ITEM).add(EternalGeneralBlocks.RAW_PLATINUM_BLOCK.asItem());
            tag(EternalStorageRawOreBlockItemTags.Blocks.RAW_SILVER_ST_ITEM).add(EternalGeneralBlocks.RAW_SILVER_BLOCK.asItem());
            tag(EternalStorageRawOreBlockItemTags.Blocks.SULFUR_ST_ITEM).add(EternalGeneralBlocks.SULFUR_BLOCK.asItem());
            tag(EternalStorageRawOreBlockItemTags.Blocks.RAW_TIN_ST_ITEM).add(EternalGeneralBlocks.RAW_TIN_BLOCK.asItem());
            tag(EternalStorageRawOreBlockItemTags.Blocks.RAW_URANIUM_ST_ITEM).add(EternalGeneralBlocks.RAW_URANIUM_BLOCK.asItem());
            tag(EternalStorageRawOreBlockItemTags.Blocks.RAW_ZINC_ST_ITEM).add(EternalGeneralBlocks.RAW_ZINC_BLOCK.asItem());

                //General Nuggets
                tag(Tags.Items.NUGGETS)
                        .add(EternalGeneralItems.ALUMINUM_NUGGET.get())
                        .add(EternalGeneralItems.BLUE_STEEL_NUGGET.get())
                        .add(EternalGeneralItems.BRASS_NUGGET.get())
                        .add(EternalGeneralItems.BRITANNIA_SILVER_NUGGET.get())
                        .add(EternalGeneralItems.BRONZE_NUGGET.get())
                        .add(EternalGeneralItems.COBALT_NUGGET.get())
                        .add(EternalGeneralItems.CONSTANTAN_NUGGET.get())
                        .add(EternalGeneralItems.COPPER_NUGGET.get())
                        .add(EternalGeneralItems.ELECTRUM_NUGGET.get())
                        .add(EternalGeneralItems.ENDERIUM_NUGGET.get())
                        .add(EternalGeneralItems.GALLIUM_NUGGET.get())
                        .add(EternalGeneralItems.GRAPHITE_NUGGET.get())
                        .add(EternalGeneralItems.INVAR_NUGGET.get())
                        .add(EternalGeneralItems.LEAD_NUGGET.get())
                        .add(EternalGeneralItems.LUMIUM_NUGGET.get())
                        .add(EternalGeneralItems.NETHERITE_NUGGET.get())
                        .add(EternalGeneralItems.NICKEL_NUGGET.get())
                        .add(EternalGeneralItems.OSMIUM_NUGGET.get())
                        .add(EternalGeneralItems.PEWTER_NUGGET.get())
                        .add(EternalGeneralItems.PLATINUM_NUGGET.get())
                        .add(EternalGeneralItems.PLUTONIUM_NUGGET.get())
                        .add(EternalGeneralItems.ROSE_GOLD_NUGGET.get())
                        .add(EternalGeneralItems.SIGNALUM_NUGGET.get())
                        .add(EternalGeneralItems.STEEL_NUGGET.get())
                        .add(EternalGeneralItems.TIN_NUGGET.get())
                        .add(EternalGeneralItems.TITANIUM_NUGGET.get())
                        .add(EternalGeneralItems.ULTIMATITANIUM_NUGGET.get())
                        .add(EternalGeneralItems.URANIUM_NUGGET.get())
                        .add(EternalGeneralItems.ZINC_NUGGET.get());

                //Individual Nuggets
                tag(EternalNuggetsTags.Items.NUGGET_ALUMINUM).add(EternalGeneralItems.ALUMINUM_NUGGET.get());
                tag(EternalNuggetsTags.Items.NUGGET_BLUE_STEEL).add(EternalGeneralItems.BLUE_STEEL_NUGGET.get());
                tag(EternalNuggetsTags.Items.NUGGET_BRASS).add(EternalGeneralItems.BRASS_NUGGET.get());
                tag(EternalNuggetsTags.Items.NUGGET_BRITANNIA_SILVER).add(EternalGeneralItems.BRITANNIA_SILVER_NUGGET.get());
                tag(EternalNuggetsTags.Items.NUGGET_BRONZE).add(EternalGeneralItems.BRONZE_NUGGET.get());
                tag(EternalNuggetsTags.Items.NUGGET_COBALT).add(EternalGeneralItems.COBALT_NUGGET.get());
                tag(EternalNuggetsTags.Items.NUGGET_CONSTANTAN).add(EternalGeneralItems.CONSTANTAN_NUGGET.get());
                tag(EternalNuggetsTags.Items.NUGGET_COPPER).add(EternalGeneralItems.COPPER_NUGGET.get());
                tag(EternalNuggetsTags.Items.NUGGET_ELECTRUM).add(EternalGeneralItems.ELECTRUM_NUGGET.get());
                tag(EternalNuggetsTags.Items.NUGGET_ENDERIUM).add(EternalGeneralItems.ENDERIUM_NUGGET.get());
                tag(EternalNuggetsTags.Items.NUGGET_GALLIUM).add(EternalGeneralItems.GALLIUM_NUGGET.get());
                tag(EternalNuggetsTags.Items.NUGGET_GRAPHITE).add(EternalGeneralItems.GRAPHITE_NUGGET.get());
                tag(EternalNuggetsTags.Items.NUGGET_INVAR).add(EternalGeneralItems.INVAR_NUGGET.get());
                tag(EternalNuggetsTags.Items.NUGGET_LEAD).add(EternalGeneralItems.LEAD_NUGGET.get());
                tag(EternalNuggetsTags.Items.NUGGET_LUMIUM).add(EternalGeneralItems.LUMIUM_NUGGET.get());
                tag(EternalNuggetsTags.Items.NUGGET_NETHERITE).add(EternalGeneralItems.NETHERITE_NUGGET.get());
                tag(EternalNuggetsTags.Items.NUGGET_NICKEL).add(EternalGeneralItems.NICKEL_NUGGET.get());
                tag(EternalNuggetsTags.Items.NUGGET_OSMIUM).add(EternalGeneralItems.OSMIUM_NUGGET.get());
                tag(EternalNuggetsTags.Items.NUGGET_PEWTER).add(EternalGeneralItems.PEWTER_NUGGET.get());
                tag(EternalNuggetsTags.Items.NUGGET_PLATINUM).add(EternalGeneralItems.PLATINUM_NUGGET.get());
                tag(EternalNuggetsTags.Items.NUGGET_PLUTONIUM).add(EternalGeneralItems.PLUTONIUM_NUGGET.get());
                tag(EternalNuggetsTags.Items.NUGGET_ROSE_GOLD).add(EternalGeneralItems.ROSE_GOLD_NUGGET.get());
                tag(EternalNuggetsTags.Items.NUGGET_SIGNALUM).add(EternalGeneralItems.SIGNALUM_NUGGET.get());
                tag(EternalNuggetsTags.Items.NUGGET_STEEL).add(EternalGeneralItems.STEEL_NUGGET.get());
                tag(EternalNuggetsTags.Items.NUGGET_TIN).add(EternalGeneralItems.TIN_NUGGET.get());
                tag(EternalNuggetsTags.Items.NUGGET_TITANIUM).add(EternalGeneralItems.TITANIUM_NUGGET.get());
                tag(EternalNuggetsTags.Items.NUGGET_ULTIMATITANIUM).add(EternalGeneralItems.ULTIMATITANIUM_NUGGET.get());
                tag(EternalNuggetsTags.Items.NUGGET_URANIUM).add(EternalGeneralItems.URANIUM_NUGGET.get());
                tag(EternalNuggetsTags.Items.NUGGET_ZINC).add(EternalGeneralItems.ZINC_NUGGET.get());

                //General Rods
                tag(Tags.Items.RODS)
                        .add(EternalGeneralItems.ROD_ALUMINUM.get())
                        .add(EternalGeneralItems.ROD_BLUE_STEEL.get())
                        .add(EternalGeneralItems.ROD_BRASS.get())
                        .add(EternalGeneralItems.ROD_BRONZE.get())
                        .add(EternalGeneralItems.ROD_COBALT.get())
                        .add(EternalGeneralItems.ROD_CONSTANTAN.get())
                        .add(EternalGeneralItems.ROD_COPPER.get())
                        .add(EternalGeneralItems.ROD_ELECTRUM.get())
                        .add(EternalGeneralItems.ROD_ENDERIUM.get())
                        .add(EternalGeneralItems.ROD_GALLIUM.get())
                        .add(EternalGeneralItems.ROD_GOLD.get())
                        .add(EternalGeneralItems.ROD_GRAPHITE.get())
                        .add(EternalGeneralItems.ROD_INVAR.get())
                        .add(EternalGeneralItems.ROD_IRON.get())
                        .add(EternalGeneralItems.ROD_LEAD.get())
                        .add(EternalGeneralItems.ROD_LUMIUM.get())
                        .add(EternalGeneralItems.ROD_NETHERITE.get())
                        .add(EternalGeneralItems.ROD_NICKEL.get())
                        .add(EternalGeneralItems.ROD_OSMIUM.get())
                        .add(EternalGeneralItems.ROD_PLATINUM.get())
                        .add(EternalGeneralItems.ROD_PLUTONIUM.get())
                        .add(EternalGeneralItems.ROD_ROSE_GOLD.get())
                        .add(EternalGeneralItems.ROD_SAPPHIRE.get())
                        .add(EternalGeneralItems.ROD_SIGNALUM.get())
                        .add(EternalGeneralItems.ROD_SILVER.get())
                        .add(EternalGeneralItems.ROD_STEEL.get())
                        .add(EternalGeneralItems.ROD_TIN.get())
                        .add(EternalGeneralItems.ROD_TITANIUM.get())
                        .add(EternalGeneralItems.ROD_ULTIMATITANIUM.get())
                        .add(EternalGeneralItems.ROD_URANIUM.get())
                        .add(EternalGeneralItems.ROD_ZINC.get());

                //Metal Rods
                tag(EternalItemsGeneralTags.Items.METAL_RODS)
                        .add(EternalGeneralItems.ROD_ALUMINUM.get())
                        .add(EternalGeneralItems.ROD_BLUE_STEEL.get())
                        .add(EternalGeneralItems.ROD_BRASS.get())
                        .add(EternalGeneralItems.ROD_BRONZE.get())
                        .add(EternalGeneralItems.ROD_COBALT.get())
                        .add(EternalGeneralItems.ROD_CONSTANTAN.get())
                        .add(EternalGeneralItems.ROD_COPPER.get())
                        .add(EternalGeneralItems.ROD_ELECTRUM.get())
                        .add(EternalGeneralItems.ROD_ENDERIUM.get())
                        .add(EternalGeneralItems.ROD_GALLIUM.get())
                        .add(EternalGeneralItems.ROD_GOLD.get())
                        .add(EternalGeneralItems.ROD_INVAR.get())
                        .add(EternalGeneralItems.ROD_IRON.get())
                        .add(EternalGeneralItems.ROD_LEAD.get())
                        .add(EternalGeneralItems.ROD_LUMIUM.get())
                        .add(EternalGeneralItems.ROD_NETHERITE.get())
                        .add(EternalGeneralItems.ROD_NICKEL.get())
                        .add(EternalGeneralItems.ROD_OSMIUM.get())
                        .add(EternalGeneralItems.ROD_PLATINUM.get())
                        .add(EternalGeneralItems.ROD_ROSE_GOLD.get())
                        .add(EternalGeneralItems.ROD_SIGNALUM.get())
                        .add(EternalGeneralItems.ROD_SILVER.get())
                        .add(EternalGeneralItems.ROD_STEEL.get())
                        .add(EternalGeneralItems.ROD_TIN.get())
                        .add(EternalGeneralItems.ROD_TITANIUM.get())
                        .add(EternalGeneralItems.ROD_ULTIMATITANIUM.get())
                        .add(EternalGeneralItems.ROD_URANIUM.get())
                        .add(EternalGeneralItems.ROD_ZINC.get());

                //Gem Rods
                tag(EternalItemsGeneralTags.Items.GEM_RODS)
                        .add(EternalGeneralItems.ROD_SAPPHIRE.get());

                //Individual Rods
                tag(EternalMetalRodsTags.Items.ROD_ALUMINUM).add(EternalGeneralItems.ROD_ALUMINUM.get());
                tag(EternalMetalRodsTags.Items.ROD_BLUE_STEEL).add(EternalGeneralItems.ROD_BLUE_STEEL.get());
                tag(EternalMetalRodsTags.Items.ROD_BRASS).add(EternalGeneralItems.ROD_BRASS.get());
                tag(EternalMetalRodsTags.Items.ROD_BRONZE).add(EternalGeneralItems.ROD_BRONZE.get());
                tag(EternalMetalRodsTags.Items.ROD_COBALT).add(EternalGeneralItems.ROD_COBALT.get());
                tag(EternalMetalRodsTags.Items.ROD_CONSTANTAN).add(EternalGeneralItems.ROD_CONSTANTAN.get());
                tag(EternalMetalRodsTags.Items.ROD_COPPER).add(EternalGeneralItems.ROD_COPPER.get());
                tag(EternalMetalRodsTags.Items.ROD_ELECTRUM).add(EternalGeneralItems.ROD_ELECTRUM.get());
                tag(EternalMetalRodsTags.Items.ROD_ENDERIUM).add(EternalGeneralItems.ROD_ENDERIUM.get());
                tag(EternalMetalRodsTags.Items.ROD_GALLIUM).add(EternalGeneralItems.ROD_GALLIUM.get());
                tag(EternalMetalRodsTags.Items.ROD_GOLD).add(EternalGeneralItems.ROD_GOLD.get());
                tag(EternalMetalRodsTags.Items.ROD_INVAR).add(EternalGeneralItems.ROD_INVAR.get());
                tag(EternalMetalRodsTags.Items.ROD_IRON).add(EternalGeneralItems.ROD_IRON.get());
                tag(EternalMetalRodsTags.Items.ROD_LEAD).add(EternalGeneralItems.ROD_LEAD.get());
                tag(EternalMetalRodsTags.Items.ROD_LUMIUM).add(EternalGeneralItems.ROD_LUMIUM.get());
                tag(EternalMetalRodsTags.Items.ROD_NETHERITE).add(EternalGeneralItems.ROD_NETHERITE.get());
                tag(EternalMetalRodsTags.Items.ROD_NICKEL).add(EternalGeneralItems.ROD_NICKEL.get());
                tag(EternalMetalRodsTags.Items.ROD_OSMIUM).add(EternalGeneralItems.ROD_OSMIUM.get());
                tag(EternalMetalRodsTags.Items.ROD_PLATINUM).add(EternalGeneralItems.ROD_PLATINUM.get());
                tag(EternalMetalRodsTags.Items.ROD_ROSE_GOLD).add(EternalGeneralItems.ROD_ROSE_GOLD.get());
                tag(EternalMetalRodsTags.Items.ROD_SIGNALUM).add(EternalGeneralItems.ROD_SIGNALUM.get());
                tag(EternalMetalRodsTags.Items.ROD_SILVER).add(EternalGeneralItems.ROD_SILVER.get());
                tag(EternalMetalRodsTags.Items.ROD_STEEL).add(EternalGeneralItems.ROD_STEEL.get());
                tag(EternalMetalRodsTags.Items.ROD_TIN).add(EternalGeneralItems.ROD_TIN.get());
                tag(EternalMetalRodsTags.Items.ROD_TITANIUM).add(EternalGeneralItems.ROD_TITANIUM.get());
                tag(EternalMetalRodsTags.Items.ROD_ULTIMATITANIUM).add(EternalGeneralItems.ROD_ULTIMATITANIUM.get());
                tag(EternalMetalRodsTags.Items.ROD_URANIUM).add(EternalGeneralItems.ROD_URANIUM.get());
                tag(EternalMetalRodsTags.Items.ROD_ZINC).add(EternalGeneralItems.ROD_ZINC.get());

                tag(EternalGemRodsTags.Items.ROD_DIAMOND).add(EternalGeneralItems.ROD_DIAMOND.get());
                tag(EternalGemRodsTags.Items.ROD_SAPPHIRE).add(EternalGeneralItems.ROD_SAPPHIRE.get());

                tag(EternalMiscRodsTags.Items.ROD_GRAPHITE).add(EternalGeneralItems.ROD_GRAPHITE.get());

                //General Gears
                tag(EternalItemsGeneralTags.Items.GEARS)
                        .add(EternalGeneralItems.GEAR_ALUMINUM.get())
                        .add(EternalGeneralItems.GEAR_BRONZE.get())
                        .add(EternalGeneralItems.GEAR_COPPER.get())
                        .add(EternalGeneralItems.GEAR_DIAMOND.get())
                        .add(EternalGeneralItems.GEAR_ENDERIUM.get())
                        .add(EternalGeneralItems.GEAR_GOLD.get())
                        .add(EternalGeneralItems.GEAR_IRON.get())
                        .add(EternalGeneralItems.GEAR_LEAD.get())
                        .add(EternalGeneralItems.GEAR_OSMIUM.get())
                        .add(EternalGeneralItems.GEAR_STEEL.get())
                        .add(EternalGeneralItems.GEAR_TIN.get());

                //Metal Gears
                tag(EternalItemsGeneralTags.Items.METAL_GEARS)
                        .add(EternalGeneralItems.GEAR_ALUMINUM.get())
                        .add(EternalGeneralItems.GEAR_BRONZE.get())
                        .add(EternalGeneralItems.GEAR_COPPER.get())
                        .add(EternalGeneralItems.GEAR_ENDERIUM.get())
                        .add(EternalGeneralItems.GEAR_IRON.get())
                        .add(EternalGeneralItems.GEAR_GOLD.get())
                        .add(EternalGeneralItems.GEAR_LEAD.get())
                        .add(EternalGeneralItems.GEAR_OSMIUM.get())
                        .add(EternalGeneralItems.GEAR_STEEL.get())
                        .add(EternalGeneralItems.GEAR_TIN.get());

                //Gem Gears
                tag(EternalItemsGeneralTags.Items.GEM_GEARS)
                        .add(EternalGeneralItems.GEAR_DIAMOND.get());

                //Individual Gears
                tag(EternalMetalGearTags.Items.GEAR_ALUMINUM).add(EternalGeneralItems.GEAR_ALUMINUM.get());
                tag(EternalMetalGearTags.Items.GEAR_BRONZE).add(EternalGeneralItems.GEAR_BRONZE.get());
                tag(EternalMetalGearTags.Items.GEAR_COPPER).add(EternalGeneralItems.GEAR_COPPER.get());
                tag(EternalMetalGearTags.Items.GEAR_ENDERIUM).add(EternalGeneralItems.GEAR_ENDERIUM.get());
                tag(EternalMetalGearTags.Items.GEAR_IRON).add(EternalGeneralItems.GEAR_IRON.get());
                tag(EternalMetalGearTags.Items.GEAR_GOLD).add(EternalGeneralItems.GEAR_GOLD.get());
                tag(EternalMetalGearTags.Items.GEAR_LEAD).add(EternalGeneralItems.GEAR_LEAD.get());
                tag(EternalMetalGearTags.Items.GEAR_OSMIUM).add(EternalGeneralItems.GEAR_LEAD.get());
                tag(EternalMetalGearTags.Items.GEAR_STEEL).add(EternalGeneralItems.GEAR_STEEL.get());
                tag(EternalMetalGearTags.Items.GEAR_TIN).add(EternalGeneralItems.GEAR_TIN.get());

                tag(EternalGemGearTags.Items.GEAR_DIAMOND).add(EternalGeneralItems.GEAR_DIAMOND.get());

                //General Dusts
                tag(Tags.Items.DUSTS)
                        .add(EternalGeneralItems.ALUMINUM_DUST.get())
                        .add(EternalGeneralItems.AMBER_DUST.get())
                        .add(EternalGeneralItems.APATITE_DUST.get())
                        .add(EternalGeneralItems.BLUE_STEEL_DUST.get())
                        .add(EternalGeneralItems.BRASS_DUST.get())
                        .add(EternalGeneralItems.BRITANNIA_SILVER_DUST.get())
                        .add(EternalGeneralItems.BRONZE_DUST.get())
                        .add(EternalGeneralItems.CINNABAR_DUST.get())
                        .add(EternalGeneralItems.COAL_DUST.get())
                        .add(EternalGeneralItems.COBALT_DUST.get())
                        .add(EternalGeneralItems.CONSTANTAN_DUST.get())
                        .add(EternalGeneralItems.COPPER_DUST.get())
                        .add(EternalGeneralItems.DIAMOND_DUST.get())
                        .add(EternalGeneralItems.ELECTRUM_DUST.get())
                        .add(EternalGeneralItems.EMERALD_DUST.get())
                        .add(EternalGeneralItems.ENDER_DUST.get())
                        .add(EternalGeneralItems.ENDERIUM_DUST.get())
                        .add(EternalGeneralItems.ENDSTONE_DUST.get())
                        .add(EternalGeneralItems.FLUORITE_DUST.get())
                        .add(EternalGeneralItems.GALLIUM_DUST.get())
                        .add(EternalGeneralItems.GOLD_DUST.get())
                        .add(EternalGeneralItems.GRAPHITE_DUST.get())
                        .add(EternalGeneralItems.INVAR_DUST.get())
                        .add(EternalGeneralItems.IRON_DUST.get())
                        .add(EternalGeneralItems.LAPIS_LAZULI_DUST.get())
                        .add(EternalGeneralItems.LEAD_DUST.get())
                        .add(EternalGeneralItems.LUMIUM_DUST.get())
                        .add(EternalGeneralItems.NETHERITE_DUST.get())
                        .add(EternalGeneralItems.NETHERRACK_DUST.get())
                        .add(EternalGeneralItems.NICKEL_DUST.get())
                        .add(EternalGeneralItems.NITER_DUST.get())
                        .add(EternalGeneralItems.OBSIDIAN_DUST.get())
                        .add(EternalGeneralItems.ONYX_DUST.get())
                        .add(EternalGeneralItems.OSMIUM_DUST.get())
                        .add(EternalGeneralItems.PERIDOT_DUST.get())
                        .add(EternalGeneralItems.PEWTER_DUST.get())
                        .add(EternalGeneralItems.PLATINUM_DUST.get())
                        .add(EternalGeneralItems.PLUTONIUM_DUST.get())
                        .add(EternalGeneralItems.QUARTZ_DUST.get())
                        .add(EternalGeneralItems.ROSE_GOLD_DUST.get())
                        .add(EternalGeneralItems.RUBY_DUST.get())
                        .add(EternalGeneralItems.SAPPHIRE_DUST.get())
                        .add(EternalGeneralItems.SIGNALUM_DUST.get())
                        .add(EternalGeneralItems.SILVER_DUST.get())
                        .add(EternalGeneralItems.STEEL_DUST.get())
                        .add(EternalGeneralItems.SULFUR_DUST.get())
                        .add(EternalGeneralItems.TIN_DUST.get())
                        .add(EternalGeneralItems.TITANIUM_DUST.get())
                        .add(EternalGeneralItems.ULTIMATITANIUM_DUST.get())
                        .add(EternalGeneralItems.URANIUM_DUST.get())
                        .add(EternalGeneralItems.ZINC_DUST.get());

                //Metal Dusts
                tag(EternalItemsGeneralTags.Items.METAL_DUSTS)
                        .add(EternalGeneralItems.ALUMINUM_DUST.get())
                        .add(EternalGeneralItems.BLUE_STEEL_DUST.get())
                        .add(EternalGeneralItems.BRASS_DUST.get())
                        .add(EternalGeneralItems.BRITANNIA_SILVER_DUST.get())
                        .add(EternalGeneralItems.BRONZE_DUST.get())
                        .add(EternalGeneralItems.COBALT_DUST.get())
                        .add(EternalGeneralItems.CONSTANTAN_DUST.get())
                        .add(EternalGeneralItems.COPPER_DUST.get())
                        .add(EternalGeneralItems.ELECTRUM_DUST.get())
                        .add(EternalGeneralItems.ENDERIUM_DUST.get())
                        .add(EternalGeneralItems.GALLIUM_DUST.get())
                        .add(EternalGeneralItems.GOLD_DUST.get())
                        .add(EternalGeneralItems.GRAPHITE_DUST.get())
                        .add(EternalGeneralItems.INVAR_DUST.get())
                        .add(EternalGeneralItems.IRON_DUST.get())
                        .add(EternalGeneralItems.LEAD_DUST.get())
                        .add(EternalGeneralItems.LUMIUM_DUST.get())
                        .add(EternalGeneralItems.NETHERITE_DUST.get())
                        .add(EternalGeneralItems.NICKEL_DUST.get())
                        .add(EternalGeneralItems.OSMIUM_DUST.get())
                        .add(EternalGeneralItems.PEWTER_DUST.get())
                        .add(EternalGeneralItems.PLATINUM_DUST.get())
                        .add(EternalGeneralItems.PLUTONIUM_DUST.get())
                        .add(EternalGeneralItems.ROSE_GOLD_DUST.get())
                        .add(EternalGeneralItems.SIGNALUM_DUST.get())
                        .add(EternalGeneralItems.SILVER_DUST.get())
                        .add(EternalGeneralItems.STEEL_DUST.get())
                        .add(EternalGeneralItems.TIN_DUST.get())
                        .add(EternalGeneralItems.TITANIUM_DUST.get())
                        .add(EternalGeneralItems.ULTIMATITANIUM_DUST.get())
                        .add(EternalGeneralItems.URANIUM_DUST.get())
                        .add(EternalGeneralItems.ZINC_DUST.get());

                //Gem Dusts
                tag(EternalItemsGeneralTags.Items.GEM_DUSTS)
                        .add(EternalGeneralItems.AMBER_DUST.get())
                        .add(EternalGeneralItems.APATITE_DUST.get())
                        .add(EternalGeneralItems.CINNABAR_DUST.get())
                        .add(EternalGeneralItems.COAL_DUST.get())
                        .add(EternalGeneralItems.DIAMOND_DUST.get())
                        .add(EternalGeneralItems.EMERALD_DUST.get())
                        .add(EternalGeneralItems.FLUORITE_DUST.get())
                        .add(EternalGeneralItems.LAPIS_LAZULI_DUST.get())
                        .add(EternalGeneralItems.NITER_DUST.get())
                        .add(EternalGeneralItems.OBSIDIAN_DUST.get())
                        .add(EternalGeneralItems.ONYX_DUST.get())
                        .add(EternalGeneralItems.PERIDOT_DUST.get())
                        .add(EternalGeneralItems.QUARTZ_DUST.get())
                        .add(EternalGeneralItems.RUBY_DUST.get())
                        .add(EternalGeneralItems.SAPPHIRE_DUST.get())
                        .add(EternalGeneralItems.SULFUR_DUST.get());

                //Stone Dusts
                tag(EternalItemsGeneralTags.Items.STONE_DUSTS)
                        .add(EternalGeneralItems.ENDSTONE_DUST.get())
                        .add(EternalGeneralItems.NETHERRACK_DUST.get());

                //Individual Dusts
                tag(EternalMetalDustsTags.Items.DUST_ALUMINUM).add(EternalGeneralItems.ALUMINUM_DUST.get());
                tag(EternalMetalDustsTags.Items.DUST_BLUE_STEEL).add(EternalGeneralItems.BLUE_STEEL_DUST.get());
                tag(EternalMetalDustsTags.Items.DUST_BRASS).add(EternalGeneralItems.BRASS_DUST.get());
                tag(EternalMetalDustsTags.Items.DUST_BRITANNIA_SILVER).add(EternalGeneralItems.BRITANNIA_SILVER_DUST.get());
                tag(EternalMetalDustsTags.Items.DUST_BRONZE).add(EternalGeneralItems.BRONZE_DUST.get());
                tag(EternalMetalDustsTags.Items.DUST_COBALT).add(EternalGeneralItems.COBALT_DUST.get());
                tag(EternalMetalDustsTags.Items.DUST_CONSTANTAN).add(EternalGeneralItems.COBALT_DUST.get());
                tag(EternalMetalDustsTags.Items.DUST_COPPER).add(EternalGeneralItems.COPPER_DUST.get());
                tag(EternalMetalDustsTags.Items.DUST_ELECTRUM).add(EternalGeneralItems.ELECTRUM_DUST.get());
                tag(EternalMetalDustsTags.Items.DUST_ENDERIUM).add(EternalGeneralItems.ENDERIUM_DUST.get());
                tag(EternalMetalDustsTags.Items.DUST_GALLIUM).add(EternalGeneralItems.GALLIUM_DUST.get());
                tag(EternalMetalDustsTags.Items.DUST_GOLD).add(EternalGeneralItems.GOLD_DUST.get());
                tag(EternalMetalDustsTags.Items.DUST_INVAR).add(EternalGeneralItems.INVAR_DUST.get());
                tag(EternalMetalDustsTags.Items.DUST_IRON).add(EternalGeneralItems.IRON_DUST.get());
                tag(EternalMetalDustsTags.Items.DUST_LEAD).add(EternalGeneralItems.LEAD_DUST.get());
                tag(EternalMetalDustsTags.Items.DUST_LUMIUM).add(EternalGeneralItems.LUMIUM_DUST.get());
                tag(EternalMetalDustsTags.Items.DUST_NETHERITE).add(EternalGeneralItems.NETHERITE_DUST.get());
                tag(EternalMetalDustsTags.Items.DUST_NICKEL).add(EternalGeneralItems.NICKEL_DUST.get());
                tag(EternalMetalDustsTags.Items.DUST_OSMIUM).add(EternalGeneralItems.OSMIUM_DUST.get());
                tag(EternalMetalDustsTags.Items.DUST_PEWTER).add(EternalGeneralItems.PEWTER_DUST.get());
                tag(EternalMetalDustsTags.Items.DUST_PLATINUM).add(EternalGeneralItems.PLATINUM_DUST.get());
                tag(EternalMetalDustsTags.Items.DUST_ROSE_GOLD).add(EternalGeneralItems.ROSE_GOLD_DUST.get());
                tag(EternalMetalDustsTags.Items.DUST_SIGNALUM).add(EternalGeneralItems.SIGNALUM_DUST.get());
                tag(EternalMetalDustsTags.Items.DUST_SILVER).add(EternalGeneralItems.SILVER_DUST.get());
                tag(EternalMetalDustsTags.Items.DUST_STEEL).add(EternalGeneralItems.STEEL_DUST.get());
                tag(EternalMetalDustsTags.Items.DUST_TIN).add(EternalGeneralItems.TIN_DUST.get());
                tag(EternalMetalDustsTags.Items.DUST_TITANIUM).add(EternalGeneralItems.TITANIUM_DUST.get());
                tag(EternalMetalDustsTags.Items.DUST_ULTIMATITANIUM).add(EternalGeneralItems.ULTIMATITANIUM_DUST.get());
                tag(EternalMetalDustsTags.Items.DUST_URANIUM).add(EternalGeneralItems.URANIUM_DUST.get());
                tag(EternalMetalDustsTags.Items.DUST_ZINC).add(EternalGeneralItems.ZINC_DUST.get());

                tag(EternalGemDustsTags.Items.DUST_AMBER).add(EternalGeneralItems.AMBER_DUST.get());
                tag(EternalGemDustsTags.Items.DUST_APATITE).add(EternalGeneralItems.APATITE_DUST.get());
                tag(EternalGemDustsTags.Items.DUST_CINNABAR).add(EternalGeneralItems.CINNABAR_DUST.get());
                tag(EternalGemDustsTags.Items.DUST_COAL).add(EternalGeneralItems.COAL_DUST.get());
                tag(EternalGemDustsTags.Items.DUST_DIAMOND).add(EternalGeneralItems.DIAMOND_DUST.get());
                tag(EternalGemDustsTags.Items.DUST_EMERALD).add(EternalGeneralItems.EMERALD_DUST.get());
                tag(EternalGemDustsTags.Items.DUST_LAPIS).add(EternalGeneralItems.LAPIS_LAZULI_DUST.get());
                tag(EternalGemDustsTags.Items.DUST_NITER).add(EternalGeneralItems.NITER_DUST.get());
                tag(EternalGemDustsTags.Items.DUST_OBSIDIAN).add(EternalGeneralItems.OBSIDIAN_DUST.get());
                tag(EternalGemDustsTags.Items.DUST_ONYX).add(EternalGeneralItems.ONYX_DUST.get());
                tag(EternalGemDustsTags.Items.DUST_PERIDOT).add(EternalGeneralItems.PERIDOT_DUST.get());
                tag(EternalGemDustsTags.Items.DUST_QUARTZ).add(EternalGeneralItems.QUARTZ_DUST.get());
                tag(EternalGemDustsTags.Items.DUST_RUBY).add(EternalGeneralItems.RUBY_DUST.get());
                tag(EternalGemDustsTags.Items.DUST_SAPPHIRE).add(EternalGeneralItems.SAPPHIRE_DUST.get());
                tag(EternalGemDustsTags.Items.DUST_SULFUR).add(EternalGeneralItems.SULFUR_DUST.get());

                tag(EternalStoneDustsTags.Items.DUST_NETHERRACK).add(EternalGeneralItems.NETHERRACK_DUST.get());
                tag(EternalStoneDustsTags.Items.DUST_ENDSTONE).add(EternalGeneralItems.ENDSTONE_DUST.get());

                tag(EternalMiscDustsTags.Items.DUST_ENDER).add(EternalGeneralItems.ENDER_DUST.get());

                //Raw Ores
                tag(Tags.Items.RAW_MATERIALS)
                        .add(EternalGeneralItems.RAW_ALUMINUM.get())
                        .add(EternalGeneralItems.RAW_COBALT.get())
                        .add(EternalGeneralItems.RAW_GALLIUM.get())
                        .add(EternalGeneralItems.RAW_LEAD.get())
                        .add(EternalGeneralItems.RAW_NICKEL.get())
                        .add(EternalGeneralItems.RAW_OSMIUM.get())
                        .add(EternalGeneralItems.RAW_PLATINUM.get())
                        .add(EternalGeneralItems.RAW_PLUTONIUM.get())
                        .add(EternalGeneralItems.RAW_SILVER.get())
                        .add(EternalGeneralItems.SULFUR.get())
                        .add(EternalGeneralItems.RAW_TIN.get())
                        .add(EternalGeneralItems.RAW_ULTIMATITANIUM.get())
                        .add(EternalGeneralItems.RAW_URANIUM.get())
                        .add(EternalGeneralItems.RAW_ZINC.get());

                //Individual Raw Mats

                System.out.println("Finished Loading Tools and Item Tags");
    }
}
