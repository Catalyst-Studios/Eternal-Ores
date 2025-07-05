package net.radzratz.eternalores.datagen.tags;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.block.EOBlocks;
import net.radzratz.eternalores.item.EOItems;
import net.radzratz.eternalores.util.tags.EOCompressedBlockTags;
import net.radzratz.eternalores.util.tags.item.EOItemsGeneralTags;
import net.radzratz.eternalores.util.tags.item.dusts.EOGemDustsTags;
import net.radzratz.eternalores.util.tags.item.dusts.EOMetalDustsTags;
import net.radzratz.eternalores.util.tags.item.dusts.EOMiscDustsTags;
import net.radzratz.eternalores.util.tags.item.dusts.EOStoneDustsTags;
import net.radzratz.eternalores.util.tags.item.gears.EOGemGearTags;
import net.radzratz.eternalores.util.tags.item.gears.EOMetalGearTags;
import net.radzratz.eternalores.util.tags.item.gems.EOGemTags;
import net.radzratz.eternalores.util.tags.item.ingots.EOIngotTags;
import net.radzratz.eternalores.util.tags.item.nuggets.EONuggetsTags;
import net.radzratz.eternalores.util.tags.item.ores.EOOreBlockItemTags;
import net.radzratz.eternalores.util.tags.item.plates.EOPlates;
import net.radzratz.eternalores.util.tags.item.raw_materials.EORawMaterialTags;
import net.radzratz.eternalores.util.tags.item.rods.EOGemRodsTags;
import net.radzratz.eternalores.util.tags.item.rods.EOMetalRodsTags;
import net.radzratz.eternalores.util.tags.item.rods.EOMiscRodsTags;
import net.radzratz.eternalores.util.tags.item.storage_blocks.EOStorageGemBlockItemTags;
import net.radzratz.eternalores.util.tags.item.storage_blocks.EOStorageMetalBlockItemTags;
import net.radzratz.eternalores.util.tags.item.storage_blocks.EOStorageMiscBlockItemTags;
import net.radzratz.eternalores.util.tags.item.storage_blocks.EOStorageRawOreBlockItemTags;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("all")
public class EOItemTagProvider extends ItemTagsProvider
{
    public EOItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                             CompletableFuture<TagLookup<Block>> blockTags,
                             @Nullable ExistingFileHelper existingFileHelper)
    {
        super(output, lookupProvider, blockTags, EternalOres.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider)
    {
                tag(EOItemsGeneralTags.Items.COAL).add(Items.COAL.asItem());

                //Tools
                tag(EOItemsGeneralTags.Items.HAMMERS)
                        .add(EOItems.COBALT_HAMMER.get())
                        .add(EOItems.COPPER_HAMMER.get())
                        .add(EOItems.DIAMOND_HAMMER.get())
                        .add(EOItems.IRON_HAMMER.get())
                        .add(EOItems.STONE_HAMMER.get());


                tag(EOItemsGeneralTags.Items.GEM_CUTTER).add(EOItems.IRON_GEM_CUTTER.get());

                //Plates
                tag(EOItemsGeneralTags.Items.PLATES)
                        .add(EOItems.PLATE_ALUMINUM.get())
                        .add(EOItems.PLATE_ARDITE.get())
                        .add(EOItems.PLATE_BLUE_STEEL.get())
                        .add(EOItems.PLATE_BRASS.get())
                        .add(EOItems.PLATE_BRONZE.get())
                        .add(EOItems.PLATE_CATALYRIUM.get())
                        .add(EOItems.PLATE_CAST_IRON.get())
                        .add(EOItems.PLATE_CAST_STEEL.get())
                        .add(EOItems.PLATE_COBALT.get())
                        .add(EOItems.PLATE_CONSTANTAN.get())
                        .add(EOItems.PLATE_COPPER.get())
                        .add(EOItems.PLATE_DIAMOND.get())
                        .add(EOItems.PLATE_ELECTRUM.get())
                        .add(EOItems.PLATE_ENDERIUM.get())
                        .add(EOItems.PLATE_GALLIUM.get())
                        .add(EOItems.PLATE_GOLD.get())
                        .add(EOItems.PLATE_GRAPHITE.get())
                        .add(EOItems.PLATE_INVAR.get())
                        .add(EOItems.PLATE_IRON.get())
                        .add(EOItems.PLATE_LEAD.get())
                        .add(EOItems.PLATE_LUMIUM.get())
                        .add(EOItems.PLATE_NECROTICARITE.get())
                        .add(EOItems.PLATE_NETHERITE.get())
                        .add(EOItems.PLATE_NETHERSTEEL.get())
                        .add(EOItems.PLATE_NICKEL.get())
                        .add(EOItems.PLATE_OSMIUM.get())
                        .add(EOItems.PLATE_PIG_IRON.get())
                        .add(EOItems.PLATE_PLATINUM.get())
                        .add(EOItems.PLATE_PLUTONIUM.get())
                        .add(EOItems.PLATE_QUANTIQUARITE.get())
                        .add(EOItems.PLATE_ROSE_GOLD.get())
                        .add(EOItems.PLATE_SAPPHIRE.get())
                        .add(EOItems.PLATE_SIGNALUM.get())
                        .add(EOItems.PLATE_SILVER.get())
                        .add(EOItems.PLATE_SHADOWSTEEL.get())
                        .add(EOItems.PLATE_STEEL.get())
                        .add(EOItems.PLATE_TACHYARITE.get())
                        .add(EOItems.PLATE_TIN.get())
                        .add(EOItems.PLATE_TITANIUM.get())
                        .add(EOItems.PLATE_ULTIMATITANIUM.get())
                        .add(EOItems.PLATE_URANIUM.get())
                        .add(EOItems.PLATE_VOIDERITE.get())
                        .add(EOItems.PLATE_WROUGHT_IRON.get())
                        .add(EOItems.PLATE_ZINC.get());

                //Metal Plates
                tag(EOItemsGeneralTags.Items.METAL_PLATES)
                        .add(EOItems.PLATE_ALUMINUM.get())
                        .add(EOItems.PLATE_ARDITE.get())
                        .add(EOItems.PLATE_BLUE_STEEL.get())
                        .add(EOItems.PLATE_BRASS.get())
                        .add(EOItems.PLATE_BRONZE.get())
                        .add(EOItems.PLATE_CATALYRIUM.get())
                        .add(EOItems.PLATE_CAST_IRON.get())
                        .add(EOItems.PLATE_CAST_STEEL.get())
                        .add(EOItems.PLATE_COBALT.get())
                        .add(EOItems.PLATE_CONSTANTAN.get())
                        .add(EOItems.PLATE_COPPER.get())
                        .add(EOItems.PLATE_ELECTRUM.get())
                        .add(EOItems.PLATE_ENDERIUM.get())
                        .add(EOItems.PLATE_GALLIUM.get())
                        .add(EOItems.PLATE_GOLD.get())
                        .add(EOItems.PLATE_INVAR.get())
                        .add(EOItems.PLATE_IRIDIUM.get())
                        .add(EOItems.PLATE_IRON.get())
                        .add(EOItems.PLATE_LEAD.get())
                        .add(EOItems.PLATE_LUMIUM.get())
                        .add(EOItems.PLATE_NETHERITE.get())
                        .add(EOItems.PLATE_NETHERSTEEL.get())
                        .add(EOItems.PLATE_NICKEL.get())
                        .add(EOItems.PLATE_OSMIUM.get())
                        .add(EOItems.PLATE_PIG_IRON.get())
                        .add(EOItems.PLATE_PLATINUM.get())
                        .add(EOItems.PLATE_ROSE_GOLD.get())
                        .add(EOItems.PLATE_SIGNALUM.get())
                        .add(EOItems.PLATE_SILVER.get())
                        .add(EOItems.PLATE_SHADOWSTEEL.get())
                        .add(EOItems.PLATE_STEEL.get())
                        .add(EOItems.PLATE_TIN.get())
                        .add(EOItems.PLATE_TITANIUM.get())
                        .add(EOItems.PLATE_ULTIMATITANIUM.get())
                        .add(EOItems.PLATE_URANIUM.get())
                        .add(EOItems.PLATE_WROUGHT_IRON.get())
                        .add(EOItems.PLATE_ZINC.get());

                //Gem Plates
                tag(EOItemsGeneralTags.Items.GEM_PLATES)
                        .add(EOItems.PLATE_DIAMOND.get())
                        .add(EOItems.PLATE_NECROTICARITE.get())
                        .add(EOItems.PLATE_SAPPHIRE.get())
                        .add(EOItems.PLATE_QUANTIQUARITE.get())
                        .add(EOItems.PLATE_TACHYARITE.get())
                        .add(EOItems.PLATE_VOIDERITE.get());

                //Individual Plates

                tag(EOPlates.Items.ALUMINUM_PLATE).add(EOItems.PLATE_ALUMINUM.get());
                tag(EOPlates.Items.ALUMINIUM_PLATE).add(EOItems.PLATE_ALUMINUM.get());
                tag(EOPlates.Items.ARDITE_PLATE).add(EOItems.PLATE_ARDITE.get());
                tag(EOPlates.Items.BLUE_STEEL_PLATE).add(EOItems.PLATE_BLUE_STEEL.get());
                tag(EOPlates.Items.BRASS_PLATE).add(EOItems.PLATE_BRASS.get());
                tag(EOPlates.Items.BRONZE_PLATE).add(EOItems.PLATE_BRONZE.get());
                tag(EOPlates.Items.CATALYRIUM_PLATE).add(EOItems.PLATE_CATALYRIUM.get());
                tag(EOPlates.Items.CAST_IRON_PLATE).add(EOItems.PLATE_CAST_IRON.get());
                tag(EOPlates.Items.CAST_STEEL_PLATE).add(EOItems.PLATE_CAST_STEEL.get());
                tag(EOPlates.Items.COBALT_PLATE).add(EOItems.PLATE_COBALT.get());
                tag(EOPlates.Items.CONSTANTAN_PLATE).add(EOItems.PLATE_CONSTANTAN.get());
                tag(EOPlates.Items.COPPER_PLATE).add(EOItems.PLATE_COPPER.get());
                tag(EOPlates.Items.DIAMOND_PLATE).add(EOItems.PLATE_DIAMOND.get());
                tag(EOPlates.Items.ELECTRUM_PLATE).add(EOItems.PLATE_ELECTRUM.get());
                tag(EOPlates.Items.ENDERIUM_PLATE) .add(EOItems.PLATE_ENDERIUM.get());
                tag(EOPlates.Items.GALLIUM_PLATE).add(EOItems.PLATE_GALLIUM.get());
                tag(EOPlates.Items.GOLD_PLATE).add(EOItems.PLATE_GOLD.get());
                tag(EOPlates.Items.GRAPHITE_PLATE).add(EOItems.PLATE_GRAPHITE.get());
                tag(EOPlates.Items.INVAR_PLATE).add(EOItems.PLATE_INVAR.get());
                tag(EOPlates.Items.IRIDIUM_PLATE).add(EOItems.PLATE_IRIDIUM.get());
                tag(EOPlates.Items.IRON_PLATE).add(EOItems.PLATE_IRON.get());
                tag(EOPlates.Items.LEAD_PLATE).add(EOItems.PLATE_LEAD.get());
                tag(EOPlates.Items.LUMIUM_PLATE).add(EOItems.PLATE_LUMIUM.get());
                tag(EOPlates.Items.NECROTICARITE_PLATE).add(EOItems.PLATE_NECROTICARITE.get());
                tag(EOPlates.Items.NETHERITE_PLATE).add(EOItems.PLATE_NETHERITE.get());
                tag(EOPlates.Items.NETHERSTEEL_PLATE).add(EOItems.PLATE_NETHERSTEEL.get());
                tag(EOPlates.Items.NICKEL_PLATE).add(EOItems.PLATE_NICKEL.get());
                tag(EOPlates.Items.OSMIUM_PLATE).add(EOItems.PLATE_OSMIUM.get());
                tag(EOPlates.Items.PIG_IRON_PLATE).add(EOItems.PLATE_PIG_IRON.get());
                tag(EOPlates.Items.PLATINUM_PLATE).add(EOItems.PLATE_PLATINUM.get());
                tag(EOPlates.Items.PLUTONIUM_PLATE).add(EOItems.PLATE_PLUTONIUM.get());
                tag(EOPlates.Items.ROSE_GOLD_PLATE).add(EOItems.PLATE_ROSE_GOLD.get());
                tag(EOPlates.Items.SAPPHIRE_PLATE).add(EOItems.PLATE_SAPPHIRE.get());
                tag(EOPlates.Items.SIGNALUM_PLATE).add(EOItems.PLATE_SIGNALUM.get());
                tag(EOPlates.Items.SILVER_PLATE).add(EOItems.PLATE_SILVER.get());
                tag(EOPlates.Items.SHADOWSTEEL_PLATE).add(EOItems.PLATE_SHADOWSTEEL.get());
                tag(EOPlates.Items.STEEL_PLATE).add(EOItems.PLATE_STEEL.get());
                tag(EOPlates.Items.TIN_PLATE).add(EOItems.PLATE_TIN.get());
                tag(EOPlates.Items.TITANIUM_PLATE).add(EOItems.PLATE_TITANIUM.get());
                tag(EOPlates.Items.ULTIMATITANIUM_PLATE).add(EOItems.PLATE_ULTIMATITANIUM.get());
                tag(EOPlates.Items.URANIUM_PLATE).add(EOItems.PLATE_URANIUM.get());
                tag(EOPlates.Items.WROUGHT_IRON_PLATE).add(EOItems.PLATE_WROUGHT_IRON.get());
                tag(EOPlates.Items.ZINC_PLATE).add(EOItems.PLATE_ZINC.get());
                tag(EOPlates.Items.QUANTIQUARITE_PLATE).add(EOItems.PLATE_QUANTIQUARITE.get());
                tag(EOPlates.Items.TACHYARITE_PLATE).add(EOItems.PLATE_TACHYARITE.get());
                tag(EOPlates.Items.VOIDERITE_PLATE).add(EOItems.PLATE_VOIDERITE.get());

                //Misc
                tag(EOItemsGeneralTags.Items.SILICON).add(EOItems.SILICON.get());

                //Ingots
                tag(Tags.Items.INGOTS)
                        .add(EOItems.ALUMINUM_INGOT.get())
                        .add(EOItems.ARDITE_INGOT.get())
                        .add(EOItems.BLUE_STEEL_INGOT.get())
                        .add(EOItems.BRASS_INGOT.get())
                        .add(EOItems.BRITANNIA_SILVER_INGOT.get())
                        .add(EOItems.BRONZE_INGOT.get())
                        .add(EOItems.CATALYRIUM_INGOT.get())
                        .add(EOItems.CAST_IRON_INGOT.get())
                        .add(EOItems.CAST_STEEL_INGOT.get())
                        .add(EOItems.COBALT_INGOT.get())
                        .add(EOItems.CONSTANTAN_INGOT.get())
                        .add(EOItems.ELECTRUM_INGOT.get())
                        .add(EOItems.ENDERIUM_INGOT.get())
                        .add(EOItems.ETERNAL_DARK_INGOT.get())
                        .add(EOItems.ETERNAL_LIGHT_INGOT.get())
                        .add(EOItems.GALLIUM_INGOT.get())
                        .add(EOItems.GRAPHITE_INGOT.get())
                        .add(EOItems.INVAR_INGOT.get())
                        .add(EOItems.IRIDIUM_INGOT.get())
                        .add(EOItems.LEAD_INGOT.get())
                        .add(EOItems.LUMIUM_INGOT.get())
                        .add(EOItems.MISSING_INGOT.get())
                        .add(EOItems.NETHERSTEEL_INGOT.get())
                        .add(EOItems.NICKEL_INGOT.get())
                        .add(EOItems.OSMIUM_INGOT.get())
                        .add(EOItems.PEWTER_INGOT.get())
                        .add(EOItems.PIG_IRON_INGOT.get())
                        .add(EOItems.PLATINUM_INGOT.get())
                        .add(EOItems.PLUTONIUM_INGOT.get())
                        .add(EOItems.REDSTONE_INGOT.get())
                        .add(EOItems.ROSE_GOLD_INGOT.get())
                        .add(EOItems.SIGNALUM_INGOT.get())
                        .add(EOItems.SILVER_INGOT.get())
                        .add(EOItems.SHADOWSTEEL_INGOT.get())
                        .add(EOItems.STEEL_INGOT.get())
                        .add(EOItems.TIN_INGOT.get())
                        .add(EOItems.TITANIUM_INGOT.get())
                        .add(EOItems.ULTIMATITANIUM_INGOT.get())
                        .add(EOItems.URANINITE_INGOT.get())
                        .add(EOItems.URANIUM_INGOT.get())
                        .add(EOItems.WROUGHT_IRON_INGOT.get())
                        .add(EOItems.ZINC_INGOT.get());

                //Individual Ingots
                tag(EOIngotTags.Items.ALUMINUM_INGOT).add(EOItems.ALUMINUM_INGOT.get());
                tag(EOIngotTags.Items.ALUMINIUM_INGOT).add(EOItems.ALUMINUM_INGOT.get());
                tag(EOIngotTags.Items.ARDITE_INGOT).add(EOItems.ARDITE_INGOT.get());
                tag(EOIngotTags.Items.BLUE_STEEL_INGOT).add(EOItems.BLUE_STEEL_INGOT.get());
                tag(EOIngotTags.Items.BRASS_INGOT).add(EOItems.BRASS_INGOT.get());
                tag(EOIngotTags.Items.BRITANNIA_INGOT).add(EOItems.BRITANNIA_SILVER_INGOT.get());
                tag(EOIngotTags.Items.BRONZE_INGOT).add(EOItems.BRONZE_INGOT.get());
                tag(EOIngotTags.Items.CATALYRIUM_INGOT).add(EOItems.CATALYRIUM_INGOT.get());
                tag(EOIngotTags.Items.CAST_IRON_INGOT).add(EOItems.CAST_IRON_INGOT.get());
                tag(EOIngotTags.Items.CAST_STEEL_INGOT).add(EOItems.CAST_STEEL_INGOT.get());
                tag(EOIngotTags.Items.COBALT_INGOT).add(EOItems.COBALT_INGOT.get());
                tag(EOIngotTags.Items.CONSTANTAN_INGOT).add(EOItems.CONSTANTAN_INGOT.get());
                tag(EOIngotTags.Items.ELECTRUM_INGOT).add(EOItems.ELECTRUM_INGOT.get());
                tag(EOIngotTags.Items.ENDERIUM_INGOT).add(EOItems.ENDERIUM_INGOT.get());
                tag(EOIngotTags.Items.ETERNAL_DARK_INGOT).add(EOItems.ETERNAL_DARK_INGOT.get());
                tag(EOIngotTags.Items.ETERNAL_LIGHT_INGOT).add(EOItems.ETERNAL_LIGHT_INGOT.get());
                tag(EOIngotTags.Items.GALLIUM_INGOT).add(EOItems.GALLIUM_INGOT.get());
                tag(EOIngotTags.Items.GRAPHITE_INGOT).add(EOItems.GRAPHITE_INGOT.get());
                tag(EOIngotTags.Items.INVAR_INGOT).add(EOItems.INVAR_INGOT.get());
                tag(EOIngotTags.Items.IRIDIUM_INGOT).add(EOItems.IRIDIUM_INGOT.get());
                tag(EOIngotTags.Items.LEAD_INGOT).add(EOItems.LEAD_INGOT.get());
                tag(EOIngotTags.Items.LUMIUM_INGOT).add(EOItems.LUMIUM_INGOT.get());
                tag(EOIngotTags.Items.NETHERSTEEL_INGOT).add(EOItems.NETHERSTEEL_INGOT.get());
                tag(EOIngotTags.Items.NICKEL_INGOT).add(EOItems.NICKEL_INGOT.get());
                tag(EOIngotTags.Items.OSMIUM_INGOT).add(EOItems.OSMIUM_INGOT.get());
                tag(EOIngotTags.Items.PEWTER_INGOT).add(EOItems.PEWTER_INGOT.get());
                tag(EOIngotTags.Items.PIG_IRON_INGOT).add(EOItems.PIG_IRON_INGOT.get());
                tag(EOIngotTags.Items.PLATINUM_INGOT).add(EOItems.PLATINUM_INGOT.get());
                tag(EOIngotTags.Items.PLUTONIUM_INGOT).add(EOItems.PLUTONIUM_INGOT.get());
                tag(EOIngotTags.Items.REDSTONE_INGOT).add(EOItems.REDSTONE_INGOT.get());
                tag(EOIngotTags.Items.ROSE_GOLD_INGOT).add(EOItems.ROSE_GOLD_INGOT.get());
                tag(EOIngotTags.Items.SIGNALUM_INGOT).add(EOItems.SIGNALUM_INGOT.get());
                tag(EOIngotTags.Items.SILVER_INGOT).add(EOItems.SILVER_INGOT.get());
                tag(EOIngotTags.Items.SHADOWSTEEL_INGOT).add(EOItems.SHADOWSTEEL_INGOT.get());
                tag(EOIngotTags.Items.STEEL_INGOT).add(EOItems.STEEL_INGOT.get());
                tag(EOIngotTags.Items.TIN_INGOT).add(EOItems.TIN_INGOT.get());
                tag(EOIngotTags.Items.TITANIUM_INGOT).add(EOItems.TITANIUM_INGOT.get());
                tag(EOIngotTags.Items.ULTIMATITANIUM_INGOT).add(EOItems.ULTIMATITANIUM_INGOT.get());
                tag(EOIngotTags.Items.URANINITE_INGOT).add(EOItems.URANINITE_INGOT.get());
                tag(EOIngotTags.Items.URANIUM_INGOT).add(EOItems.URANIUM_INGOT.get());
                tag(EOIngotTags.Items.WROUGHT_IRON_INGOT).add(EOItems.WROUGHT_IRON_INGOT.get());
                tag(EOIngotTags.Items.ZINC_INGOT).add(EOItems.ZINC_INGOT.get());

                tag(Tags.Items.ORES)
                        .add(EOBlocks.ALUMINUM_ORE_BLOCK.asItem())
                        .add(EOBlocks.DEEPSLATE_ALUMINUM_ORE_BLOCK.asItem())
                        .add(EOBlocks.AMBER_ORE_BLOCK.asItem())
                        .add(EOBlocks.DEEPSLATE_AMBER_ORE_BLOCK.asItem())
                        .add(EOBlocks.APATITE_ORE_BLOCK.asItem())
                        .add(EOBlocks.DEEPSLATE_APATITE_ORE_BLOCK.asItem())
                        .add(EOBlocks.ARDITE_ORE_BLOCK.asItem())
                        .add(EOBlocks.CINNABAR_ORE_BLOCK.asItem())
                        .add(EOBlocks.DEEPSLATE_CINNABAR_ORE_BLOCK.asItem())
                        .add(EOBlocks.COBALT_ORE_BLOCK.asItem())
                        .add(EOBlocks.DEEPSLATE_COBALT_ORE_BLOCK.asItem())
                        .add(EOBlocks.FLUORITE_ORE_BLOCK.asItem())
                        .add(EOBlocks.DEEPSLATE_FLUORITE_ORE_BLOCK.asItem())
                        .add(EOBlocks.GALLIUM_ORE_BLOCK.asItem())
                        .add(EOBlocks.DEEPSLATE_GALLIUM_ORE_BLOCK.asItem())
                        .add(EOBlocks.IRIDIUM_ORE_BLOCK.asItem())
                        .add(EOBlocks.DEEPSLATE_IRIDIUM_ORE_BLOCK.asItem())
                        .add(EOBlocks.LEAD_ORE_BLOCK.asItem())
                        .add(EOBlocks.DEEPSLATE_LEAD_ORE_BLOCK.asItem())
                        .add(EOBlocks.NECROTICARITE_ORE_BLOCK.asItem())
                        .add(EOBlocks.NICKEL_ORE_BLOCK.asItem())
                        .add(EOBlocks.DEEPSLATE_NICKEL_ORE_BLOCK.asItem())
                        .add(EOBlocks.NITER_ORE_BLOCK.asItem())
                        .add(EOBlocks.DEEPSLATE_NITER_ORE_BLOCK.asItem())
                        .add(EOBlocks.OBSIDIAN_ORE_BLOCK.asItem())
                        .add(EOBlocks.ONYX_ORE_BLOCK.asItem())
                        .add(EOBlocks.DEEPSLATE_ONYX_ORE_BLOCK.asItem())
                        .add(EOBlocks.OSMIUM_ORE_BLOCK.asItem())
                        .add(EOBlocks.DEEPSLATE_OSMIUM_ORE_BLOCK.asItem())
                        .add(EOBlocks.PERIDOT_ORE_BLOCK.asItem())
                        .add(EOBlocks.DEEPSLATE_PERIDOT_ORE_BLOCK.asItem())
                        .add(EOBlocks.PLATINUM_ORE_BLOCK.asItem())
                        .add(EOBlocks.DEEPSLATE_PLATINUM_ORE_BLOCK.asItem())
                        .add(EOBlocks.PLUTONIUM_ORE_BLOCK.asItem())
                        .add(EOBlocks.DEEPSLATE_PLUTONIUM_ORE_BLOCK.asItem())
                        .add(EOBlocks.RUBY_ORE_BLOCK.asItem())
                        .add(EOBlocks.DEEPSLATE_RUBY_ORE_BLOCK.asItem())
                        .add(EOBlocks.SAPPHIRE_ORE_BLOCK.asItem())
                        .add(EOBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCK.asItem())
                        .add(EOBlocks.SILVER_ORE_BLOCK.asItem())
                        .add(EOBlocks.DEEPSLATE_SILVER_ORE_BLOCK.asItem())
                        .add(EOBlocks.SULFUR_ORE_BLOCK.asItem())
                        .add(EOBlocks.DEEPSLATE_SULFUR_ORE_BLOCK.asItem())
                        .add(EOBlocks.TIN_ORE_BLOCK.asItem())
                        .add(EOBlocks.DEEPSLATE_TIN_ORE_BLOCK.asItem())
                        .add(EOBlocks.URANINITE_ORE_BLOCK.asItem())
                        .add(EOBlocks.DEEPSLATE_URANINITE_ORE_BLOCK.asItem())
                        .add(EOBlocks.URANIUM_ORE_BLOCK.asItem())
                        .add(EOBlocks.DEEPSLATE_URANIUM_ORE_BLOCK.asItem())
                        .add(EOBlocks.ZINC_ORE_BLOCK.asItem())
                        .add(EOBlocks.DEEPSLATE_ZINC_ORE_BLOCK.asItem());

                //Individual Ores (Item Tag)
                tag(EOOreBlockItemTags.Items.ITEM_ALUMINUM_ORE_OW).add(EOBlocks.ALUMINUM_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_ALUMINUM_ORE_OW).add(EOBlocks.DEEPSLATE_ALUMINUM_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_AMBER_ORE_OW).add(EOBlocks.AMBER_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_AMBER_ORE_OW).add(EOBlocks.DEEPSLATE_AMBER_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_APATITE_ORE_OW).add(EOBlocks.APATITE_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_APATITE_ORE_OW).add(EOBlocks.DEEPSLATE_APATITE_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_ARDITE_ORE_NETHER).add(EOBlocks.ARDITE_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_CINNABAR_ORE_OW).add(EOBlocks.CINNABAR_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_CINNABAR_ORE_OW).add(EOBlocks.DEEPSLATE_CINNABAR_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_COBALT_ORE_OW).add(EOBlocks.COBALT_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_COBALT_ORE_OW).add(EOBlocks.DEEPSLATE_COBALT_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_FLUORITE_ORE_OW).add(EOBlocks.FLUORITE_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_FLUORITE_ORE_OW).add(EOBlocks.DEEPSLATE_FLUORITE_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_GALLIUM_ORE_OW).add(EOBlocks.GALLIUM_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_GALLIUM_ORE_OW).add(EOBlocks.DEEPSLATE_GALLIUM_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_IRIDIUM_ORE_OW).add(EOBlocks.IRIDIUM_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_IRIDIUM_ORE_OW).add(EOBlocks.DEEPSLATE_IRIDIUM_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_LEAD_ORE_OW).add(EOBlocks.LEAD_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_LEAD_ORE_OW).add(EOBlocks.DEEPSLATE_LEAD_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_NECROTICARITE_ORE_NETHER).add(EOBlocks.NECROTICARITE_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_NICKEL_ORE_OW).add(EOBlocks.NICKEL_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_NICKEL_ORE_OW).add(EOBlocks.DEEPSLATE_NICKEL_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_NITER_ORE_OW).add(EOBlocks.NITER_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_NITER_ORE_OW).add(EOBlocks.DEEPSLATE_NITER_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_OBSIDIAN_ORE_NETHER).add(EOBlocks.OBSIDIAN_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_ONYX_ORE_OW).add(EOBlocks.ONYX_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_ONYX_ORE_OW).add(EOBlocks.DEEPSLATE_ONYX_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_OSMIUM_ORE_OW).add(EOBlocks.OSMIUM_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_OSMIUM_ORE_OW).add(EOBlocks.DEEPSLATE_OSMIUM_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_PLATINUM_ORE_OW).add(EOBlocks.PLATINUM_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_PLATINUM_ORE_OW).add(EOBlocks.DEEPSLATE_PLATINUM_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_PERIDOT_ORE_OW).add(EOBlocks.PERIDOT_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_PERIDOT_ORE_OW).add(EOBlocks.DEEPSLATE_PERIDOT_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_RUBY_ORE_OW).add(EOBlocks.RUBY_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_RUBY_ORE_OW).add(EOBlocks.DEEPSLATE_RUBY_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_SAPPHIRE_ORE_OW).add(EOBlocks.SAPPHIRE_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_SAPPHIRE_ORE_OW).add(EOBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_SILVER_ORE_OW).add(EOBlocks.SILVER_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_SILVER_ORE_OW).add(EOBlocks.DEEPSLATE_SILVER_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_SULFUR_ORE_OW).add(EOBlocks.SULFUR_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_SULFUR_ORE_OW).add(EOBlocks.DEEPSLATE_SULFUR_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_TIN_ORE_OW).add(EOBlocks.TIN_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_TIN_ORE_OW).add(EOBlocks.DEEPSLATE_TIN_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_URANINITE_ORE_OW).add(EOBlocks.URANINITE_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_URANINITE_ORE_OW).add(EOBlocks.DEEPSLATE_URANINITE_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_URANIUM_ORE_OW).add(EOBlocks.URANIUM_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_URANIUM_ORE_OW).add(EOBlocks.DEEPSLATE_URANIUM_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_ZINC_ORE_OW).add(EOBlocks.ZINC_ORE_BLOCK.asItem());
                tag(EOOreBlockItemTags.Items.ITEM_ZINC_ORE_OW).add(EOBlocks.DEEPSLATE_ZINC_ORE_BLOCK.asItem());

                //General Storage Blocks (Item Tag)
                tag(Tags.Items.STORAGE_BLOCKS)
                        .add(EOBlocks.ALUMINUM_BLOCK.asItem())
                        .add(EOBlocks.AMBER_BLOCK.asItem())
                        .add(EOBlocks.APATITE_BLOCK.asItem())
                        .add(EOBlocks.ARDITE_BLOCK.asItem())
                        .add(EOBlocks.BLUE_STEEL_BLOCK.asItem())
                        .add(EOBlocks.BRASS_BLOCK.asItem())
                        .add(EOBlocks.BRITANNIA_SILVER_BLOCK.asItem())
                        .add(EOBlocks.BRONZE_BLOCK.asItem())
                        .add(EOBlocks.CATALYRIUM_BLOCK.asItem())
                        .add(EOBlocks.CAST_IRON_BLOCK.asItem())
                        .add(EOBlocks.CAST_STEEL_BLOCK.asItem())
                        .add(EOBlocks.CINNABAR_BLOCK.asItem())
                        .add(EOBlocks.COBALT_BLOCK.asItem())
                        .add(EOBlocks.CONSTANTAN_BLOCK.asItem())
                        .add(EOBlocks.ELECTRUM_BLOCK.asItem())
                        .add(EOBlocks.ENDERIUM_BLOCK.asItem())
                        .add(EOBlocks.FLUORITE_BLOCK.asItem())
                        .add(EOBlocks.GALLIUM_BLOCK.asItem())
                        .add(EOBlocks.GRAPHITE_BLOCK.asItem())
                        .add(EOBlocks.INVAR_BLOCK.asItem())
                        .add(EOBlocks.IRIDIUM_BLOCK.asItem())
                        .add(EOBlocks.LEAD_BLOCK.asItem())
                        .add(EOBlocks.LUMIUM_BLOCK.asItem())
                        .add(EOBlocks.NECROTICARITE_BLOCK.asItem())
                        .add(EOBlocks.NETHER_STAR_BLOCK.asItem())
                        .add(EOBlocks.NETHERSTEEL_BLOCK.asItem())
                        .add(EOBlocks.NICKEL_BLOCK.asItem())
                        .add(EOBlocks.NITER_BLOCK.asItem())
                        .add(EOBlocks.ONYX_BLOCK.asItem())
                        .add(EOBlocks.OSMIUM_BLOCK.asItem())
                        .add(EOBlocks.PERIDOT_BLOCK.asItem())
                        .add(EOBlocks.PEWTER_BLOCK.asItem())
                        .add(EOBlocks.PIG_IRON_BLOCK.asItem())
                        .add(EOBlocks.PLATINUM_BLOCK.asItem())
                        .add(EOBlocks.PLUTONIUM_BLOCK.asItem())
                        .add(EOBlocks.ROSE_GOLD_BLOCK.asItem())
                        .add(EOBlocks.RUBY_BLOCK.asItem())
                        .add(EOBlocks.SAPPHIRE_BLOCK.asItem())
                        .add(EOBlocks.SIGNALUM_BLOCK.asItem())
                        .add(EOBlocks.SILVER_BLOCK.asItem())
                        .add(EOBlocks.SHADOWSTEEL_BLOCK.asItem())
                        .add(EOBlocks.STEEL_BLOCK.asItem())
                        .add(EOBlocks.SULFUR_BLOCK.asItem())
                        .add(EOBlocks.TIN_BLOCK.asItem())
                        .add(EOBlocks.TITANIUM_BLOCK.asItem())
                        .add(EOBlocks.URANINITE_BLOCK.asItem())
                        .add(EOBlocks.URANIUM_BLOCK.asItem())
                        .add(EOBlocks.WROUGHT_IRON_BLOCK.asItem())
                        .add(EOBlocks.ZINC_BLOCK.asItem())

                        .add(EOBlocks.RAW_ALUMINUM_BLOCK.asItem())
                        .add(EOBlocks.RAW_ARDITE_BLOCK.asItem())
                        .add(EOBlocks.RAW_CATALYRIUM_BLOCK.asItem())
                        .add(EOBlocks.RAW_COBALT_BLOCK.asItem())
                        .add(EOBlocks.RAW_GALLIUM_BLOCK.asItem())
                        .add(EOBlocks.RAW_IRIDIUM_BLOCK.asItem())
                        .add(EOBlocks.RAW_LEAD_BLOCK.asItem())
                        .add(EOBlocks.RAW_NICKEL_BLOCK.asItem())
                        .add(EOBlocks.RAW_OSMIUM_BLOCK.asItem())
                        .add(EOBlocks.RAW_PLATINUM_BLOCK.asItem())
                        .add(EOBlocks.RAW_PLUTONIUM_BLOCK.asItem())
                        .add(EOBlocks.RAW_SILVER_BLOCK.asItem())
                        .add(EOBlocks.RAW_TIN_BLOCK.asItem())
                        .add(EOBlocks.RAW_URANINITE_BLOCK.asItem())
                        .add(EOBlocks.RAW_URANIUM_BLOCK.asItem())
                        .add(EOBlocks.RAW_ZINC_BLOCK.asItem())

                        //COMPRESSED BLOCKS
                        .add(EOBlocks.COBBLE_1.get().asItem())
                        .add(EOBlocks.COBBLE_2.get().asItem())
                        .add(EOBlocks.COBBLE_3.get().asItem())
                        .add(EOBlocks.COBBLE_4.get().asItem())
                        .add(EOBlocks.COBBLE_5.get().asItem())
                        .add(EOBlocks.COBBLE_6.get().asItem())
                        .add(EOBlocks.COBBLE_7.get().asItem())
                        .add(EOBlocks.COBBLE_8.get().asItem())
                        .add(EOBlocks.COBBLE_9.get().asItem())

                        .add(EOBlocks.GRANITE_1.get().asItem())
                        .add(EOBlocks.GRANITE_2.get().asItem())
                        .add(EOBlocks.GRANITE_3.get().asItem())
                        .add(EOBlocks.GRANITE_4.get().asItem())
                        .add(EOBlocks.GRANITE_5.get().asItem())
                        .add(EOBlocks.GRANITE_6.get().asItem())
                        .add(EOBlocks.GRANITE_7.get().asItem())
                        .add(EOBlocks.GRANITE_8.get().asItem())
                        .add(EOBlocks.GRANITE_9.get().asItem())

                        .add(EOBlocks.GRAVEL_1.get().asItem())
                        .add(EOBlocks.GRAVEL_2.get().asItem())
                        .add(EOBlocks.GRAVEL_3.get().asItem())
                        .add(EOBlocks.GRAVEL_4.get().asItem())
                        .add(EOBlocks.GRAVEL_5.get().asItem())
                        .add(EOBlocks.GRAVEL_6.get().asItem())
                        .add(EOBlocks.GRAVEL_7.get().asItem())
                        .add(EOBlocks.GRAVEL_8.get().asItem())
                        .add(EOBlocks.GRAVEL_9.get().asItem())

                        .add(EOBlocks.SAND_1.get().asItem())
                        .add(EOBlocks.SAND_2.get().asItem())
                        .add(EOBlocks.SAND_3.get().asItem())
                        .add(EOBlocks.SAND_4.get().asItem())
                        .add(EOBlocks.SAND_5.get().asItem())
                        .add(EOBlocks.SAND_6.get().asItem())
                        .add(EOBlocks.SAND_7.get().asItem())
                        .add(EOBlocks.SAND_8.get().asItem())
                        .add(EOBlocks.SAND_9.get().asItem())

                        .add(EOBlocks.DIORITE_1.get().asItem())
                        .add(EOBlocks.DIORITE_2.get().asItem())
                        .add(EOBlocks.DIORITE_3.get().asItem())
                        .add(EOBlocks.DIORITE_4.get().asItem())
                        .add(EOBlocks.DIORITE_5.get().asItem())
                        .add(EOBlocks.DIORITE_6.get().asItem())
                        .add(EOBlocks.DIORITE_7.get().asItem())
                        .add(EOBlocks.DIORITE_8.get().asItem())
                        .add(EOBlocks.DIORITE_9.get().asItem())

                        .add(EOBlocks.DIRT_1.get().asItem())
                        .add(EOBlocks.DIRT_2.get().asItem())
                        .add(EOBlocks.DIRT_3.get().asItem())
                        .add(EOBlocks.DIRT_4.get().asItem())
                        .add(EOBlocks.DIRT_5.get().asItem())
                        .add(EOBlocks.DIRT_6.get().asItem())
                        .add(EOBlocks.DIRT_7.get().asItem())
                        .add(EOBlocks.DIRT_8.get().asItem())
                        .add(EOBlocks.DIRT_9.get().asItem())

                        .add(EOBlocks.ANDESITE_1.get().asItem())
                        .add(EOBlocks.ANDESITE_2.get().asItem())
                        .add(EOBlocks.ANDESITE_3.get().asItem())
                        .add(EOBlocks.ANDESITE_4.get().asItem())
                        .add(EOBlocks.ANDESITE_5.get().asItem())
                        .add(EOBlocks.ANDESITE_6.get().asItem())
                        .add(EOBlocks.ANDESITE_7.get().asItem())
                        .add(EOBlocks.ANDESITE_8.get().asItem())
                        .add(EOBlocks.ANDESITE_9.get().asItem());

            //Individual Storage Blocks (Item Tag)
            tag(EOStorageMetalBlockItemTags.Items.ALUMINUM_BLOCK_ST_ITEM).add(EOBlocks.ALUMINUM_BLOCK.asItem());
            tag(EOStorageMetalBlockItemTags.Items.ARDITE_BLOCK_ST_ITEM).add(EOBlocks.ARDITE_BLOCK.asItem());
            tag(EOStorageMetalBlockItemTags.Items.BLUE_STEEL_BLOCK_ST_ITEM).add(EOBlocks.BLUE_STEEL_BLOCK.asItem());
            tag(EOStorageMetalBlockItemTags.Items.BRASS_BLOCK_ST_ITEM).add(EOBlocks.BRASS_BLOCK.asItem());
            tag(EOStorageMetalBlockItemTags.Items.BRITANNIA_BLOCK_ST_ITEM).add(EOBlocks.BRITANNIA_SILVER_BLOCK.asItem());
            tag(EOStorageMetalBlockItemTags.Items.BRONZE_BLOCK_ST_ITEM).add(EOBlocks.BRONZE_BLOCK.asItem());
            tag(EOStorageMetalBlockItemTags.Items.CATALYRIUM_BLOCK_ST_ITEM).add(EOBlocks.CATALYRIUM_BLOCK.asItem());
            tag(EOStorageMetalBlockItemTags.Items.CAST_IRON_BLOCK_ST_ITEM).add(EOBlocks.CAST_IRON_BLOCK.asItem());
            tag(EOStorageMetalBlockItemTags.Items.CAST_STEEL_BLOCK_ST_ITEM).add(EOBlocks.CAST_STEEL_BLOCK.asItem());
            tag(EOStorageMetalBlockItemTags.Items.COBALT_BLOCK_ST_ITEM).add(EOBlocks.COBALT_BLOCK.asItem());
            tag(EOStorageMetalBlockItemTags.Items.CONSTANTAN_BLOCK_ST_ITEM).add(EOBlocks.CONSTANTAN_BLOCK.asItem());
            tag(EOStorageMetalBlockItemTags.Items.ELECTRUM_BLOCK_ST_ITEM).add(EOBlocks.ELECTRUM_BLOCK.asItem());
            tag(EOStorageMetalBlockItemTags.Items.ENDERIUM_BLOCK_ST_ITEM).add(EOBlocks.ENDERIUM_BLOCK.asItem());
            tag(EOStorageMetalBlockItemTags.Items.GALLIUM_BLOCK_ST_ITEM).add(EOBlocks.GALLIUM_BLOCK.asItem());
            tag(EOStorageMetalBlockItemTags.Items.INVAR_BLOCK_ST_ITEM).add(EOBlocks.INVAR_BLOCK.asItem());
            tag(EOStorageMetalBlockItemTags.Items.IRIDIUM_BLOCK_ST_ITEM).add(EOBlocks.IRIDIUM_BLOCK.asItem());
            tag(EOStorageMetalBlockItemTags.Items.LEAD_BLOCK_ST_ITEM).add(EOBlocks.LEAD_BLOCK.asItem());
            tag(EOStorageMetalBlockItemTags.Items.LUMIUM_BLOCK_ST_ITEM).add(EOBlocks.LUMIUM_BLOCK.asItem());
            tag(EOStorageMetalBlockItemTags.Items.NETHERSTEEL_BLOCK_ST_ITEM).add(EOBlocks.NETHERSTEEL_BLOCK.asItem());
            tag(EOStorageMetalBlockItemTags.Items.NICKEL_BLOCK_ST_ITEM).add(EOBlocks.NICKEL_BLOCK.asItem());
            tag(EOStorageMetalBlockItemTags.Items.OSMIUM_BLOCK_ST_ITEM).add(EOBlocks.OSMIUM_BLOCK.asItem());
            tag(EOStorageMetalBlockItemTags.Items.PEWTER_BLOCK_ST_ITEM).add(EOBlocks.PEWTER_BLOCK.asItem());
            tag(EOStorageMetalBlockItemTags.Items.PIG_IRON_BLOCK_ST_ITEM).add(EOBlocks.PIG_IRON_BLOCK.asItem());
            tag(EOStorageMetalBlockItemTags.Items.PLATINUM_BLOCK_ST_ITEM).add(EOBlocks.PLATINUM_BLOCK.asItem());
            tag(EOStorageMetalBlockItemTags.Items.ROSE_GOLD_BLOCK_ST_ITEM).add(EOBlocks.ROSE_GOLD_BLOCK.asItem());
            tag(EOStorageMetalBlockItemTags.Items.SIGNALUM_BLOCK_ST_ITEM).add(EOBlocks.SIGNALUM_BLOCK.asItem());
            tag(EOStorageMetalBlockItemTags.Items.SILVER_BLOCK_ST_ITEM).add(EOBlocks.SILVER_BLOCK.asItem());
            tag(EOStorageMetalBlockItemTags.Items.SHADOWSTEEL_BLOCK_ST_ITEM).add(EOBlocks.SHADOWSTEEL_BLOCK.asItem());
            tag(EOStorageMetalBlockItemTags.Items.STEEL_BLOCK_ST_ITEM).add(EOBlocks.STEEL_BLOCK.asItem());
            tag(EOStorageMetalBlockItemTags.Items.TIN_BLOCK_ST_ITEM).add(EOBlocks.TIN_BLOCK.asItem());
            tag(EOStorageMetalBlockItemTags.Items.TITANIUM_BLOCK_ST_ITEM).add(EOBlocks.TITANIUM_BLOCK.asItem());
            tag(EOStorageMetalBlockItemTags.Items.URANINITE_BLOCK_ST_ITEM).add(EOBlocks.URANINITE_BLOCK.asItem());
            tag(EOStorageMetalBlockItemTags.Items.URANIUM_BLOCK_ST_ITEM).add(EOBlocks.URANIUM_BLOCK.asItem());
            tag(EOStorageMetalBlockItemTags.Items.WROUGHT_IRON_BLOCK_ST_ITEM).add(EOBlocks.WROUGHT_IRON_BLOCK.asItem());
            tag(EOStorageMetalBlockItemTags.Items.ZINC_BLOCK_ST_ITEM).add(EOBlocks.ZINC_BLOCK.asItem());

            tag(EOStorageGemBlockItemTags.Items.AMBER_BLOCK_ST_ITEM).add(EOBlocks.AMBER_BLOCK.asItem());
            tag(EOStorageGemBlockItemTags.Items.APATITE_BLOCK_ST_ITEM).add(EOBlocks.APATITE_BLOCK.asItem());
            tag(EOStorageGemBlockItemTags.Items.CINNABAR_BLOCK_ST_ITEM).add(EOBlocks.CINNABAR_BLOCK.asItem());
            tag(EOStorageGemBlockItemTags.Items.FLUORITE_BLOCK_ST_ITEM).add(EOBlocks.FLUORITE_BLOCK.asItem());
            tag(EOStorageGemBlockItemTags.Items.NECROTICARITE_BLOCK_ST_ITEM).add(EOBlocks.NECROTICARITE_BLOCK.asItem());
            tag(EOStorageGemBlockItemTags.Items.NITER_BLOCK_ST_ITEM).add(EOBlocks.NITER_BLOCK.asItem());
            tag(EOStorageGemBlockItemTags.Items.ONYX_BLOCK_ST_ITEM).add(EOBlocks.ONYX_BLOCK.asItem());
            tag(EOStorageGemBlockItemTags.Items.PERIDOT_BLOCK_ST_ITEM).add(EOBlocks.PERIDOT_BLOCK.asItem());
            tag(EOStorageGemBlockItemTags.Items.RUBY_BLOCK_ST_ITEM).add(EOBlocks.RUBY_BLOCK.asItem());
            tag(EOStorageGemBlockItemTags.Items.SAPPHIRE_BLOCK_ST_ITEM).add(EOBlocks.SAPPHIRE_BLOCK.asItem());

            tag(EOStorageRawOreBlockItemTags.Items.RAW_ALUMINUM_ST_ITEM).add(EOBlocks.RAW_ALUMINUM_BLOCK.asItem());
            tag(EOStorageRawOreBlockItemTags.Items.RAW_ARDITE_ST_ITEM).add(EOBlocks.RAW_ARDITE_BLOCK.asItem());
            tag(EOStorageRawOreBlockItemTags.Items.RAW_CATALYRIUM_ST_ITEM).add(EOBlocks.RAW_CATALYRIUM_BLOCK.asItem());
            tag(EOStorageRawOreBlockItemTags.Items.RAW_COBALT_ST_ITEM).add(EOBlocks.RAW_COBALT_BLOCK.asItem());
            tag(EOStorageRawOreBlockItemTags.Items.RAW_GALLIUM_ST_ITEM).add(EOBlocks.RAW_GALLIUM_BLOCK.asItem());
            tag(EOStorageRawOreBlockItemTags.Items.RAW_IRIDIUM_ST_ITEM).add(EOBlocks.RAW_IRIDIUM_BLOCK.asItem());
            tag(EOStorageRawOreBlockItemTags.Items.RAW_LEAD_ST_ITEM).add(EOBlocks.RAW_LEAD_BLOCK.asItem());
            tag(EOStorageRawOreBlockItemTags.Items.RAW_NICKEL_ST_ITEM).add(EOBlocks.RAW_NICKEL_BLOCK.asItem());
            tag(EOStorageRawOreBlockItemTags.Items.RAW_OSMIUM_ST_ITEM).add(EOBlocks.RAW_OSMIUM_BLOCK.asItem());
            tag(EOStorageRawOreBlockItemTags.Items.RAW_PLATINUM_ST_ITEM).add(EOBlocks.RAW_PLATINUM_BLOCK.asItem());
            tag(EOStorageRawOreBlockItemTags.Items.RAW_SILVER_ST_ITEM).add(EOBlocks.RAW_SILVER_BLOCK.asItem());
            tag(EOStorageRawOreBlockItemTags.Items.SULFUR_ST_ITEM).add(EOBlocks.SULFUR_BLOCK.asItem());
            tag(EOStorageRawOreBlockItemTags.Items.RAW_TIN_ST_ITEM).add(EOBlocks.RAW_TIN_BLOCK.asItem());
            tag(EOStorageRawOreBlockItemTags.Items.RAW_URANINITE_ST_ITEM).add(EOBlocks.RAW_URANINITE_BLOCK.asItem());
            tag(EOStorageRawOreBlockItemTags.Items.RAW_URANIUM_ST_ITEM).add(EOBlocks.RAW_URANIUM_BLOCK.asItem());
            tag(EOStorageRawOreBlockItemTags.Items.RAW_ZINC_ST_ITEM).add(EOBlocks.RAW_ZINC_BLOCK.asItem());

            tag(EOStorageMiscBlockItemTags.Items.NETHER_STAR_BLOCK_ST_ITEM).add(EOBlocks.NETHER_STAR_BLOCK.asItem());

                //General Nuggets
                tag(Tags.Items.NUGGETS)
                        .add(EOItems.ALUMINUM_NUGGET.get())
                        .add(EOItems.ARDITE_NUGGET.get())
                        .add(EOItems.BLUE_STEEL_NUGGET.get())
                        .add(EOItems.BRASS_NUGGET.get())
                        .add(EOItems.BRITANNIA_SILVER_NUGGET.get())
                        .add(EOItems.BRONZE_NUGGET.get())
                        .add(EOItems.CATALYRIUM_NUGGET.get())
                        .add(EOItems.CAST_IRON_NUGGET.get())
                        .add(EOItems.CAST_STEEL_NUGGET.get())
                        .add(EOItems.COBALT_NUGGET.get())
                        .add(EOItems.CONSTANTAN_NUGGET.get())
                        .add(EOItems.COPPER_NUGGET.get())
                        .add(EOItems.ELECTRUM_NUGGET.get())
                        .add(EOItems.ENDERIUM_NUGGET.get())
                        .add(EOItems.GALLIUM_NUGGET.get())
                        .add(EOItems.GRAPHITE_NUGGET.get())
                        .add(EOItems.INVAR_NUGGET.get())
                        .add(EOItems.IRIDIUM_NUGGET.get())
                        .add(EOItems.LEAD_NUGGET.get())
                        .add(EOItems.LUMIUM_NUGGET.get())
                        .add(EOItems.NETHERITE_NUGGET.get())
                        .add(EOItems.NETHERSTEEL_NUGGET.get())
                        .add(EOItems.NICKEL_NUGGET.get())
                        .add(EOItems.OSMIUM_NUGGET.get())
                        .add(EOItems.PEWTER_NUGGET.get())
                        .add(EOItems.PIG_IRON_NUGGET.get())
                        .add(EOItems.PLATINUM_NUGGET.get())
                        .add(EOItems.PLUTONIUM_NUGGET.get())
                        .add(EOItems.ROSE_GOLD_NUGGET.get())
                        .add(EOItems.SIGNALUM_NUGGET.get())
                        .add(EOItems.SHADOWSTEEL_NUGGET.get())
                        .add(EOItems.STEEL_NUGGET.get())
                        .add(EOItems.TIN_NUGGET.get())
                        .add(EOItems.TITANIUM_NUGGET.get())
                        .add(EOItems.ULTIMATITANIUM_NUGGET.get())
                        .add(EOItems.URANINITE_NUGGET.get())
                        .add(EOItems.URANIUM_NUGGET.get())
                        .add(EOItems.WROUGHT_IRON_NUGGET.get())
                        .add(EOItems.ZINC_NUGGET.get());

                //Individual Nuggets
                tag(EONuggetsTags.Items.NUGGET_ALUMINUM).add(EOItems.ALUMINUM_NUGGET.get());
                tag(EONuggetsTags.Items.NUGGET_ARDITE).add(EOItems.ARDITE_NUGGET.get());
                tag(EONuggetsTags.Items.NUGGET_BLUE_STEEL).add(EOItems.BLUE_STEEL_NUGGET.get());
                tag(EONuggetsTags.Items.NUGGET_BRASS).add(EOItems.BRASS_NUGGET.get());
                tag(EONuggetsTags.Items.NUGGET_BRITANNIA_SILVER).add(EOItems.BRITANNIA_SILVER_NUGGET.get());
                tag(EONuggetsTags.Items.NUGGET_BRONZE).add(EOItems.BRONZE_NUGGET.get());
                tag(EONuggetsTags.Items.NUGGET_CATALYRIUM).add(EOItems.CATALYRIUM_NUGGET.get());
                tag(EONuggetsTags.Items.NUGGET_CAST_IRON).add(EOItems.CAST_IRON_NUGGET.get());
                tag(EONuggetsTags.Items.NUGGET_CAST_STEEL).add(EOItems.CAST_STEEL_NUGGET.get());
                tag(EONuggetsTags.Items.NUGGET_COBALT).add(EOItems.COBALT_NUGGET.get());
                tag(EONuggetsTags.Items.NUGGET_CONSTANTAN).add(EOItems.CONSTANTAN_NUGGET.get());
                tag(EONuggetsTags.Items.NUGGET_COPPER).add(EOItems.COPPER_NUGGET.get());
                tag(EONuggetsTags.Items.NUGGET_ELECTRUM).add(EOItems.ELECTRUM_NUGGET.get());
                tag(EONuggetsTags.Items.NUGGET_ENDERIUM).add(EOItems.ENDERIUM_NUGGET.get());
                tag(EONuggetsTags.Items.NUGGET_GALLIUM).add(EOItems.GALLIUM_NUGGET.get());
                tag(EONuggetsTags.Items.NUGGET_GRAPHITE).add(EOItems.GRAPHITE_NUGGET.get());
                tag(EONuggetsTags.Items.NUGGET_INVAR).add(EOItems.INVAR_NUGGET.get());
                tag(EONuggetsTags.Items.NUGGET_IRIDIUM).add(EOItems.IRIDIUM_NUGGET.get());
                tag(EONuggetsTags.Items.NUGGET_LEAD).add(EOItems.LEAD_NUGGET.get());
                tag(EONuggetsTags.Items.NUGGET_LUMIUM).add(EOItems.LUMIUM_NUGGET.get());
                tag(EONuggetsTags.Items.NUGGET_NETHERITE).add(EOItems.NETHERITE_NUGGET.get());
                tag(EONuggetsTags.Items.NUGGET_NETHERSTEEL).add(EOItems.NETHERSTEEL_NUGGET.get());
                tag(EONuggetsTags.Items.NUGGET_NICKEL).add(EOItems.NICKEL_NUGGET.get());
                tag(EONuggetsTags.Items.NUGGET_OSMIUM).add(EOItems.OSMIUM_NUGGET.get());
                tag(EONuggetsTags.Items.NUGGET_PEWTER).add(EOItems.PEWTER_NUGGET.get());
                tag(EONuggetsTags.Items.NUGGET_PIG_IRON).add(EOItems.PIG_IRON_NUGGET.get());
                tag(EONuggetsTags.Items.NUGGET_PLATINUM).add(EOItems.PLATINUM_NUGGET.get());
                tag(EONuggetsTags.Items.NUGGET_PLUTONIUM).add(EOItems.PLUTONIUM_NUGGET.get());
                tag(EONuggetsTags.Items.NUGGET_ROSE_GOLD).add(EOItems.ROSE_GOLD_NUGGET.get());
                tag(EONuggetsTags.Items.NUGGET_SIGNALUM).add(EOItems.SIGNALUM_NUGGET.get());
                tag(EONuggetsTags.Items.NUGGET_SHADOWSTEEL).add(EOItems.SHADOWSTEEL_NUGGET.get());
                tag(EONuggetsTags.Items.NUGGET_STEEL).add(EOItems.STEEL_NUGGET.get());
                tag(EONuggetsTags.Items.NUGGET_TIN).add(EOItems.TIN_NUGGET.get());
                tag(EONuggetsTags.Items.NUGGET_TITANIUM).add(EOItems.TITANIUM_NUGGET.get());
                tag(EONuggetsTags.Items.NUGGET_ULTIMATITANIUM).add(EOItems.ULTIMATITANIUM_NUGGET.get());
                tag(EONuggetsTags.Items.NUGGET_URANINITE).add(EOItems.URANINITE_NUGGET.get());
                tag(EONuggetsTags.Items.NUGGET_URANIUM).add(EOItems.URANIUM_NUGGET.get());
                tag(EONuggetsTags.Items.NUGGET_WROUGHT_IRON).add(EOItems.WROUGHT_IRON_NUGGET.get());
                tag(EONuggetsTags.Items.NUGGET_ZINC).add(EOItems.ZINC_NUGGET.get());

                //General Rods
                tag(Tags.Items.RODS)
                        .add(EOItems.ROD_ALUMINUM.get())
                        .add(EOItems.ROD_ARDITE.get())
                        .add(EOItems.ROD_BLUE_STEEL.get())
                        .add(EOItems.ROD_BRASS.get())
                        .add(EOItems.ROD_BRONZE.get())
                        .add(EOItems.ROD_CATALYRIUM.get())
                        .add(EOItems.ROD_CAST_IRON.get())
                        .add(EOItems.ROD_CAST_STEEL.get())
                        .add(EOItems.ROD_COBALT.get())
                        .add(EOItems.ROD_CONSTANTAN.get())
                        .add(EOItems.ROD_COPPER.get())
                        .add(EOItems.ROD_ELECTRUM.get())
                        .add(EOItems.ROD_ENDERIUM.get())
                        .add(EOItems.ROD_GALLIUM.get())
                        .add(EOItems.ROD_GOLD.get())
                        .add(EOItems.ROD_GRAPHITE.get())
                        .add(EOItems.ROD_INVAR.get())
                        .add(EOItems.ROD_IRIDIUM.get())
                        .add(EOItems.ROD_IRON.get())
                        .add(EOItems.ROD_LEAD.get())
                        .add(EOItems.ROD_LUMIUM.get())
                        .add(EOItems.ROD_NECROTICARITE.get())
                        .add(EOItems.ROD_NETHERITE.get())
                        .add(EOItems.ROD_NETHERSTEEL.get())
                        .add(EOItems.ROD_NICKEL.get())
                        .add(EOItems.ROD_OSMIUM.get())
                        .add(EOItems.ROD_PIG_IRON.get())
                        .add(EOItems.ROD_PLATINUM.get())
                        .add(EOItems.ROD_PLUTONIUM.get())
                        .add(EOItems.ROD_QUANTIQUARITE.get())
                        .add(EOItems.ROD_ROSE_GOLD.get())
                        .add(EOItems.ROD_SAPPHIRE.get())
                        .add(EOItems.ROD_SIGNALUM.get())
                        .add(EOItems.ROD_SILVER.get())
                        .add(EOItems.ROD_SHADOWSTEEL.get())
                        .add(EOItems.ROD_STEEL.get())
                        .add(EOItems.ROD_TACHYARITE.get())
                        .add(EOItems.ROD_TIN.get())
                        .add(EOItems.ROD_TITANIUM.get())
                        .add(EOItems.ROD_ULTIMATITANIUM.get())
                        .add(EOItems.ROD_URANIUM.get())
                        .add(EOItems.ROD_VOIDERITE.get())
                        .add(EOItems.ROD_WROUGHT_IRON.get())
                        .add(EOItems.ROD_ZINC.get());

                //Metal Rods
                tag(EOItemsGeneralTags.Items.METAL_RODS)
                        .add(EOItems.ROD_ALUMINUM.get())
                        .add(EOItems.ROD_ARDITE.get())
                        .add(EOItems.ROD_BLUE_STEEL.get())
                        .add(EOItems.ROD_BRASS.get())
                        .add(EOItems.ROD_BRONZE.get())
                        .add(EOItems.ROD_CATALYRIUM.get())
                        .add(EOItems.ROD_CAST_IRON.get())
                        .add(EOItems.ROD_CAST_STEEL.get())
                        .add(EOItems.ROD_COBALT.get())
                        .add(EOItems.ROD_CONSTANTAN.get())
                        .add(EOItems.ROD_COPPER.get())
                        .add(EOItems.ROD_ELECTRUM.get())
                        .add(EOItems.ROD_ENDERIUM.get())
                        .add(EOItems.ROD_GALLIUM.get())
                        .add(EOItems.ROD_GOLD.get())
                        .add(EOItems.ROD_INVAR.get())
                        .add(EOItems.ROD_IRIDIUM.get())
                        .add(EOItems.ROD_IRON.get())
                        .add(EOItems.ROD_LEAD.get())
                        .add(EOItems.ROD_LUMIUM.get())
                        .add(EOItems.ROD_NETHERITE.get())
                        .add(EOItems.ROD_NETHERSTEEL.get())
                        .add(EOItems.ROD_NICKEL.get())
                        .add(EOItems.ROD_OSMIUM.get())
                        .add(EOItems.ROD_PIG_IRON.get())
                        .add(EOItems.ROD_PLATINUM.get())
                        .add(EOItems.ROD_PLUTONIUM.get())
                        .add(EOItems.ROD_ROSE_GOLD.get())
                        .add(EOItems.ROD_SIGNALUM.get())
                        .add(EOItems.ROD_SILVER.get())
                        .add(EOItems.ROD_SHADOWSTEEL.get())
                        .add(EOItems.ROD_STEEL.get())
                        .add(EOItems.ROD_TIN.get())
                        .add(EOItems.ROD_TITANIUM.get())
                        .add(EOItems.ROD_ULTIMATITANIUM.get())
                        .add(EOItems.ROD_URANIUM.get())
                        .add(EOItems.ROD_WROUGHT_IRON.get())
                        .add(EOItems.ROD_ZINC.get());

                //Gem Rods
                tag(EOItemsGeneralTags.Items.GEM_RODS)
                        .add(EOItems.ROD_DIAMOND.get())
                        .add(EOItems.ROD_NECROTICARITE.get())
                        .add(EOItems.ROD_SAPPHIRE.get())
                        .add(EOItems.ROD_QUANTIQUARITE.get())
                        .add(EOItems.ROD_TACHYARITE.get())
                        .add(EOItems.ROD_VOIDERITE.get());

                //Individual Rods
                tag(EOMetalRodsTags.Items.ROD_ALUMINUM).add(EOItems.ROD_ALUMINUM.get());
                tag(EOMetalRodsTags.Items.ROD_ARDITE).add(EOItems.ROD_ARDITE.get());
                tag(EOMetalRodsTags.Items.ROD_BLUE_STEEL).add(EOItems.ROD_BLUE_STEEL.get());
                tag(EOMetalRodsTags.Items.ROD_BRASS).add(EOItems.ROD_BRASS.get());
                tag(EOMetalRodsTags.Items.ROD_BRONZE).add(EOItems.ROD_BRONZE.get());
                tag(EOMetalRodsTags.Items.ROD_CATALYRIUM).add(EOItems.ROD_CATALYRIUM.get());
                tag(EOMetalRodsTags.Items.ROD_CAST_IRON).add(EOItems.ROD_CAST_IRON.get());
                tag(EOMetalRodsTags.Items.ROD_CAST_STEEL).add(EOItems.ROD_CAST_STEEL.get());
                tag(EOMetalRodsTags.Items.ROD_COBALT).add(EOItems.ROD_COBALT.get());
                tag(EOMetalRodsTags.Items.ROD_CONSTANTAN).add(EOItems.ROD_CONSTANTAN.get());
                tag(EOMetalRodsTags.Items.ROD_COPPER).add(EOItems.ROD_COPPER.get());
                tag(EOMetalRodsTags.Items.ROD_ELECTRUM).add(EOItems.ROD_ELECTRUM.get());
                tag(EOMetalRodsTags.Items.ROD_ENDERIUM).add(EOItems.ROD_ENDERIUM.get());
                tag(EOMetalRodsTags.Items.ROD_GALLIUM).add(EOItems.ROD_GALLIUM.get());
                tag(EOMetalRodsTags.Items.ROD_GOLD).add(EOItems.ROD_GOLD.get());
                tag(EOMetalRodsTags.Items.ROD_INVAR).add(EOItems.ROD_INVAR.get());
                tag(EOMetalRodsTags.Items.ROD_IRIDIUM).add(EOItems.ROD_IRIDIUM.get());
                tag(EOMetalRodsTags.Items.ROD_IRON).add(EOItems.ROD_IRON.get());
                tag(EOMetalRodsTags.Items.ROD_LEAD).add(EOItems.ROD_LEAD.get());
                tag(EOMetalRodsTags.Items.ROD_LUMIUM).add(EOItems.ROD_LUMIUM.get());
                tag(EOMetalRodsTags.Items.ROD_NETHERITE).add(EOItems.ROD_NETHERITE.get());
                tag(EOMetalRodsTags.Items.ROD_NETHERSTEEL).add(EOItems.ROD_NETHERSTEEL.get());
                tag(EOMetalRodsTags.Items.ROD_NICKEL).add(EOItems.ROD_NICKEL.get());
                tag(EOMetalRodsTags.Items.ROD_OSMIUM).add(EOItems.ROD_OSMIUM.get());
                tag(EOMetalRodsTags.Items.ROD_PIG_IRON).add(EOItems.ROD_PIG_IRON.get());
                tag(EOMetalRodsTags.Items.ROD_PLATINUM).add(EOItems.ROD_PLATINUM.get());
                tag(EOMetalRodsTags.Items.ROD_PLUTONIUM).add(EOItems.ROD_PLUTONIUM.get());
                tag(EOMetalRodsTags.Items.ROD_ROSE_GOLD).add(EOItems.ROD_ROSE_GOLD.get());
                tag(EOMetalRodsTags.Items.ROD_SIGNALUM).add(EOItems.ROD_SIGNALUM.get());
                tag(EOMetalRodsTags.Items.ROD_SILVER).add(EOItems.ROD_SILVER.get());
                tag(EOMetalRodsTags.Items.ROD_SHADOWSTEEL).add(EOItems.ROD_SHADOWSTEEL.get());
                tag(EOMetalRodsTags.Items.ROD_STEEL).add(EOItems.ROD_STEEL.get());
                tag(EOMetalRodsTags.Items.ROD_TIN).add(EOItems.ROD_TIN.get());
                tag(EOMetalRodsTags.Items.ROD_TITANIUM).add(EOItems.ROD_TITANIUM.get());
                tag(EOMetalRodsTags.Items.ROD_ULTIMATITANIUM).add(EOItems.ROD_ULTIMATITANIUM.get());
                tag(EOMetalRodsTags.Items.ROD_URANIUM).add(EOItems.ROD_URANIUM.get());
                tag(EOMetalRodsTags.Items.ROD_WROUGHT_IRON).add(EOItems.ROD_WROUGHT_IRON.get());
                tag(EOMetalRodsTags.Items.ROD_ZINC).add(EOItems.ROD_ZINC.get());

                tag(EOGemRodsTags.Items.ROD_DIAMOND).add(EOItems.ROD_DIAMOND.get());
                tag(EOGemRodsTags.Items.ROD_NECROTICARITE).add(EOItems.ROD_NECROTICARITE.get());
                tag(EOGemRodsTags.Items.ROD_SAPPHIRE).add(EOItems.ROD_SAPPHIRE.get());
                tag(EOGemRodsTags.Items.ROD_QUANTIQUARITE).add(EOItems.ROD_QUANTIQUARITE.get());
                tag(EOGemRodsTags.Items.ROD_TACHYARITE).add(EOItems.ROD_TACHYARITE.get());
                tag(EOGemRodsTags.Items.ROD_VOIDERITE).add(EOItems.ROD_VOIDERITE.get());

                tag(EOMiscRodsTags.Items.ROD_GRAPHITE).add(EOItems.ROD_GRAPHITE.get());

                //General Gears
                tag(EOItemsGeneralTags.Items.GEARS)
                        .add(EOItems.GEAR_ALUMINUM.get())
                        .add(EOItems.GEAR_ARDITE.get())
                        .add(EOItems.GEAR_BRONZE.get())
                        .add(EOItems.GEAR_CATALYRIUM.get())
                        .add(EOItems.GEAR_COPPER.get())
                        .add(EOItems.GEAR_DIAMOND.get())
                        .add(EOItems.GEAR_ENDERIUM.get())
                        .add(EOItems.GEAR_GOLD.get())
                        .add(EOItems.GEAR_IRON.get())
                        .add(EOItems.GEAR_LEAD.get())
                        .add(EOItems.GEAR_NECROTICARITE.get())
                        .add(EOItems.GEAR_OSMIUM.get())
                        .add(EOItems.GEAR_QUANTIQUARITE.get())
                        .add(EOItems.GEAR_STEEL.get())
                        .add(EOItems.GEAR_TACHYARITE.get())
                        .add(EOItems.GEAR_TIN.get())
                        .add(EOItems.GEAR_VOIDERITE.get());

                //Metal Gears
                tag(EOItemsGeneralTags.Items.METAL_GEARS)
                        .add(EOItems.GEAR_ALUMINUM.get())
                        .add(EOItems.GEAR_ARDITE.get())
                        .add(EOItems.GEAR_BRONZE.get())
                        .add(EOItems.GEAR_CATALYRIUM.get())
                        .add(EOItems.GEAR_COPPER.get())
                        .add(EOItems.GEAR_ENDERIUM.get())
                        .add(EOItems.GEAR_IRON.get())
                        .add(EOItems.GEAR_GOLD.get())
                        .add(EOItems.GEAR_LEAD.get())
                        .add(EOItems.GEAR_OSMIUM.get())
                        .add(EOItems.GEAR_STEEL.get())
                        .add(EOItems.GEAR_TIN.get());

                //Gem Gears
                tag(EOItemsGeneralTags.Items.GEM_GEARS)
                        .add(EOItems.GEAR_DIAMOND.get())
                        .add(EOItems.GEAR_NECROTICARITE.get())
                        .add(EOItems.GEAR_QUANTIQUARITE.get())
                        .add(EOItems.GEAR_TACHYARITE.get())
                        .add(EOItems.GEAR_VOIDERITE.get());

                //Individual Gears
                tag(EOMetalGearTags.Items.GEAR_ALUMINUM).add(EOItems.GEAR_ALUMINUM.get());
                tag(EOMetalGearTags.Items.GEAR_ARDITE).add(EOItems.GEAR_ARDITE.get());
                tag(EOMetalGearTags.Items.GEAR_BRONZE).add(EOItems.GEAR_BRONZE.get());
                tag(EOMetalGearTags.Items.GEAR_CATALYRIUM).add(EOItems.GEAR_CATALYRIUM.get());
                tag(EOMetalGearTags.Items.GEAR_COPPER).add(EOItems.GEAR_COPPER.get());
                tag(EOMetalGearTags.Items.GEAR_ENDERIUM).add(EOItems.GEAR_ENDERIUM.get());
                tag(EOMetalGearTags.Items.GEAR_IRON).add(EOItems.GEAR_IRON.get());
                tag(EOMetalGearTags.Items.GEAR_GOLD).add(EOItems.GEAR_GOLD.get());
                tag(EOMetalGearTags.Items.GEAR_LEAD).add(EOItems.GEAR_LEAD.get());
                tag(EOMetalGearTags.Items.GEAR_OSMIUM).add(EOItems.GEAR_LEAD.get());
                tag(EOMetalGearTags.Items.GEAR_STEEL).add(EOItems.GEAR_STEEL.get());
                tag(EOMetalGearTags.Items.GEAR_TIN).add(EOItems.GEAR_TIN.get());

                tag(EOGemGearTags.Items.GEAR_DIAMOND).add(EOItems.GEAR_DIAMOND.get());
                tag(EOGemGearTags.Items.GEAR_NECROTICARITE).add(EOItems.GEAR_NECROTICARITE.get());
                tag(EOGemGearTags.Items.GEAR_TACHYARITE).add(EOItems.GEAR_TACHYARITE.get());
                tag(EOGemGearTags.Items.GEAR_QUANTIQUARITE).add(EOItems.GEAR_QUANTIQUARITE.get());
                tag(EOGemGearTags.Items.GEAR_VOIDERITE).add(EOItems.GEAR_VOIDERITE.get());

                //General Dusts
                tag(Tags.Items.DUSTS)
                        .add(EOItems.ALUMINUM_DUST.get())
                        .add(EOItems.ARDITE_DUST.get())
                        .add(EOItems.AMBER_DUST.get())
                        .add(EOItems.AMETHYST_DUST.get())
                        .add(EOItems.APATITE_DUST.get())
                        .add(EOItems.BLUE_STEEL_DUST.get())
                        .add(EOItems.BRASS_DUST.get())
                        .add(EOItems.BRITANNIA_SILVER_DUST.get())
                        .add(EOItems.BRONZE_DUST.get())
                        .add(EOItems.CATALYRIUM_DUST.get())
                        .add(EOItems.CAST_IRON_DUST.get())
                        .add(EOItems.CAST_STEEL_DUST.get())
                        .add(EOItems.CINNABAR_DUST.get())
                        .add(EOItems.COAL_DUST.get())
                        .add(EOItems.COBALT_DUST.get())
                        .add(EOItems.CONSTANTAN_DUST.get())
                        .add(EOItems.COPPER_DUST.get())
                        .add(EOItems.DIAMOND_DUST.get())
                        .add(EOItems.ELECTRUM_DUST.get())
                        .add(EOItems.EMERALD_DUST.get())
                        .add(EOItems.ENDER_DUST.get())
                        .add(EOItems.ENDERIUM_DUST.get())
                        .add(EOItems.ENDSTONE_DUST.get())
                        .add(EOItems.FLUORITE_DUST.get())
                        .add(EOItems.GALLIUM_DUST.get())
                        .add(EOItems.GOLD_DUST.get())
                        .add(EOItems.GRAPHITE_DUST.get())
                        .add(EOItems.INVAR_DUST.get())
                        .add(EOItems.IRIDIUM_DUST.get())
                        .add(EOItems.IRON_DUST.get())
                        .add(EOItems.LAPIS_LAZULI_DUST.get())
                        .add(EOItems.LEAD_DUST.get())
                        .add(EOItems.LUMIUM_DUST.get())
                        .add(EOItems.NECROTICARITE_DUST.get())
                        .add(EOItems.NETHER_STAR_DUST.get())
                        .add(EOItems.NETHERITE_DUST.get())
                        .add(EOItems.NETHERRACK_DUST.get())
                        .add(EOItems.NETHERSTEEL_DUST.get())
                        .add(EOItems.NICKEL_DUST.get())
                        .add(EOItems.NITER_DUST.get())
                        .add(EOItems.OBSIDIAN_DUST.get())
                        .add(EOItems.ONYX_DUST.get())
                        .add(EOItems.OSMIUM_DUST.get())
                        .add(EOItems.PERIDOT_DUST.get())
                        .add(EOItems.PEWTER_DUST.get())
                        .add(EOItems.PIG_IRON_DUST.get())
                        .add(EOItems.PLATINUM_DUST.get())
                        .add(EOItems.PLUTONIUM_DUST.get())
                        .add(EOItems.QUANTIQUARITE_DUST.get())
                        .add(EOItems.QUARTZ_DUST.get())
                        .add(EOItems.ROSE_GOLD_DUST.get())
                        .add(EOItems.RUBY_DUST.get())
                        .add(EOItems.SAPPHIRE_DUST.get())
                        .add(EOItems.SCULK_DUST.get())
                        .add(EOItems.SIGNALUM_DUST.get())
                        .add(EOItems.SILVER_DUST.get())
                        .add(EOItems.SHADOWSTEEL_DUST.get())
                        .add(EOItems.STEEL_DUST.get())
                        .add(EOItems.SULFUR_DUST.get())
                        .add(EOItems.TACHYARITE_DUST.get())
                        .add(EOItems.TIN_DUST.get())
                        .add(EOItems.TITANIUM_DUST.get())
                        .add(EOItems.ULTIMATITANIUM_DUST.get())
                        .add(EOItems.URANINITE_DUST.get())
                        .add(EOItems.URANIUM_DUST.get())
                        .add(EOItems.VOIDERITE_DUST.get())
                        .add(EOItems.WROUGHT_IRON_DUST.get())
                        .add(EOItems.ZINC_DUST.get());

                //Metal Dusts
                tag(EOItemsGeneralTags.Items.METAL_DUSTS)
                        .add(EOItems.ALUMINUM_DUST.get())
                        .add(EOItems.ARDITE_DUST.get())
                        .add(EOItems.BLUE_STEEL_DUST.get())
                        .add(EOItems.BRASS_DUST.get())
                        .add(EOItems.BRITANNIA_SILVER_DUST.get())
                        .add(EOItems.BRONZE_DUST.get())
                        .add(EOItems.CATALYRIUM_DUST.get())
                        .add(EOItems.CAST_IRON_DUST.get())
                        .add(EOItems.CAST_STEEL_DUST.get())
                        .add(EOItems.COBALT_DUST.get())
                        .add(EOItems.CONSTANTAN_DUST.get())
                        .add(EOItems.COPPER_DUST.get())
                        .add(EOItems.ELECTRUM_DUST.get())
                        .add(EOItems.ENDERIUM_DUST.get())
                        .add(EOItems.GALLIUM_DUST.get())
                        .add(EOItems.GOLD_DUST.get())
                        .add(EOItems.GRAPHITE_DUST.get())
                        .add(EOItems.INVAR_DUST.get())
                        .add(EOItems.IRIDIUM_DUST.get())
                        .add(EOItems.IRON_DUST.get())
                        .add(EOItems.LEAD_DUST.get())
                        .add(EOItems.LUMIUM_DUST.get())
                        .add(EOItems.NETHERITE_DUST.get())
                        .add(EOItems.NETHERSTEEL_DUST.get())
                        .add(EOItems.NICKEL_DUST.get())
                        .add(EOItems.OSMIUM_DUST.get())
                        .add(EOItems.PEWTER_DUST.get())
                        .add(EOItems.PIG_IRON_DUST.get())
                        .add(EOItems.PLATINUM_DUST.get())
                        .add(EOItems.PLUTONIUM_DUST.get())
                        .add(EOItems.ROSE_GOLD_DUST.get())
                        .add(EOItems.SIGNALUM_DUST.get())
                        .add(EOItems.SILVER_DUST.get())
                        .add(EOItems.SHADOWSTEEL_DUST.get())
                        .add(EOItems.STEEL_DUST.get())
                        .add(EOItems.TIN_DUST.get())
                        .add(EOItems.TITANIUM_DUST.get())
                        .add(EOItems.ULTIMATITANIUM_DUST.get())
                        .add(EOItems.URANINITE_DUST.get())
                        .add(EOItems.URANIUM_DUST.get())
                        .add(EOItems.WROUGHT_IRON_DUST.get())
                        .add(EOItems.ZINC_DUST.get());

                //Gem Dusts
                tag(EOItemsGeneralTags.Items.GEM_DUSTS)
                        .add(EOItems.AMBER_DUST.get())
                        .add(EOItems.AMETHYST_DUST.get())
                        .add(EOItems.APATITE_DUST.get())
                        .add(EOItems.CINNABAR_DUST.get())
                        .add(EOItems.COAL_DUST.get())
                        .add(EOItems.DIAMOND_DUST.get())
                        .add(EOItems.EMERALD_DUST.get())
                        .add(EOItems.FLUORITE_DUST.get())
                        .add(EOItems.LAPIS_LAZULI_DUST.get())
                        .add(EOItems.NECROTICARITE_DUST.get())
                        .add(EOItems.NITER_DUST.get())
                        .add(EOItems.OBSIDIAN_DUST.get())
                        .add(EOItems.ONYX_DUST.get())
                        .add(EOItems.PERIDOT_DUST.get())
                        .add(EOItems.QUANTIQUARITE_DUST.get())
                        .add(EOItems.QUARTZ_DUST.get())
                        .add(EOItems.RUBY_DUST.get())
                        .add(EOItems.SAPPHIRE_DUST.get())
                        .add(EOItems.SULFUR_DUST.get())
                        .add(EOItems.TACHYARITE_DUST.get())
                        .add(EOItems.VOIDERITE_DUST.get());

                //Stone Dusts
                tag(EOItemsGeneralTags.Items.STONE_DUSTS)
                        .add(EOItems.ENDSTONE_DUST.get())
                        .add(EOItems.NETHERRACK_DUST.get());

                //Individual Dusts
                tag(EOMetalDustsTags.Items.DUST_ALUMINUM).add(EOItems.ALUMINUM_DUST.get());
                tag(EOMetalDustsTags.Items.DUST_ARDITE).add(EOItems.ARDITE_DUST.get());
                tag(EOMetalDustsTags.Items.DUST_BLUE_STEEL).add(EOItems.BLUE_STEEL_DUST.get());
                tag(EOMetalDustsTags.Items.DUST_BRASS).add(EOItems.BRASS_DUST.get());
                tag(EOMetalDustsTags.Items.DUST_BRITANNIA_SILVER).add(EOItems.BRITANNIA_SILVER_DUST.get());
                tag(EOMetalDustsTags.Items.DUST_BRONZE).add(EOItems.BRONZE_DUST.get());
                tag(EOMetalDustsTags.Items.DUST_CATALYRIUM).add(EOItems.CATALYRIUM_DUST.get());
                tag(EOMetalDustsTags.Items.DUST_CAST_IRON).add(EOItems.CAST_IRON_DUST.get());
                tag(EOMetalDustsTags.Items.DUST_CAST_STEEL).add(EOItems.CAST_STEEL_DUST.get());
                tag(EOMetalDustsTags.Items.DUST_COBALT).add(EOItems.COBALT_DUST.get());
                tag(EOMetalDustsTags.Items.DUST_CONSTANTAN).add(EOItems.CONSTANTAN_DUST.get());
                tag(EOMetalDustsTags.Items.DUST_COPPER).add(EOItems.COPPER_DUST.get());
                tag(EOMetalDustsTags.Items.DUST_ELECTRUM).add(EOItems.ELECTRUM_DUST.get());
                tag(EOMetalDustsTags.Items.DUST_ENDERIUM).add(EOItems.ENDERIUM_DUST.get());
                tag(EOMetalDustsTags.Items.DUST_GALLIUM).add(EOItems.GALLIUM_DUST.get());
                tag(EOMetalDustsTags.Items.DUST_GOLD).add(EOItems.GOLD_DUST.get());
                tag(EOMetalDustsTags.Items.DUST_INVAR).add(EOItems.INVAR_DUST.get());
                tag(EOMetalDustsTags.Items.DUST_IRIDIUM).add(EOItems.IRIDIUM_DUST.get());
                tag(EOMetalDustsTags.Items.DUST_IRON).add(EOItems.IRON_DUST.get());
                tag(EOMetalDustsTags.Items.DUST_LEAD).add(EOItems.LEAD_DUST.get());
                tag(EOMetalDustsTags.Items.DUST_LUMIUM).add(EOItems.LUMIUM_DUST.get());
                tag(EOMetalDustsTags.Items.DUST_NETHERITE).add(EOItems.NETHERITE_DUST.get());
                tag(EOMetalDustsTags.Items.DUST_NETHERSTEEL).add(EOItems.NETHERSTEEL_DUST.get());
                tag(EOMetalDustsTags.Items.DUST_NICKEL).add(EOItems.NICKEL_DUST.get());
                tag(EOMetalDustsTags.Items.DUST_OSMIUM).add(EOItems.OSMIUM_DUST.get());
                tag(EOMetalDustsTags.Items.DUST_PEWTER).add(EOItems.PEWTER_DUST.get());
                tag(EOMetalDustsTags.Items.DUST_PIG_IRON).add(EOItems.PIG_IRON_DUST.get());
                tag(EOMetalDustsTags.Items.DUST_PLATINUM).add(EOItems.PLATINUM_DUST.get());
                tag(EOMetalDustsTags.Items.DUST_ROSE_GOLD).add(EOItems.ROSE_GOLD_DUST.get());
                tag(EOMetalDustsTags.Items.DUST_SIGNALUM).add(EOItems.SIGNALUM_DUST.get());
                tag(EOMetalDustsTags.Items.DUST_SILVER).add(EOItems.SILVER_DUST.get());
                tag(EOMetalDustsTags.Items.DUST_SHADOWSTEEL).add(EOItems.SHADOWSTEEL_DUST.get());
                tag(EOMetalDustsTags.Items.DUST_STEEL).add(EOItems.STEEL_DUST.get());
                tag(EOMetalDustsTags.Items.DUST_TIN).add(EOItems.TIN_DUST.get());
                tag(EOMetalDustsTags.Items.DUST_TITANIUM).add(EOItems.TITANIUM_DUST.get());
                tag(EOMetalDustsTags.Items.DUST_ULTIMATITANIUM).add(EOItems.ULTIMATITANIUM_DUST.get());
                tag(EOMetalDustsTags.Items.DUST_URANINITE).add(EOItems.URANINITE_DUST.get());
                tag(EOMetalDustsTags.Items.DUST_URANIUM).add(EOItems.URANIUM_DUST.get());
                tag(EOMetalDustsTags.Items.DUST_WROUGHT_IRON).add(EOItems.WROUGHT_IRON_DUST.get());
                tag(EOMetalDustsTags.Items.DUST_ZINC).add(EOItems.ZINC_DUST.get());

                tag(EOGemDustsTags.Items.DUST_AMBER).add(EOItems.AMBER_DUST.get());
                tag(EOGemDustsTags.Items.DUST_AMETHYST).add(EOItems.AMETHYST_DUST.get());
                tag(EOGemDustsTags.Items.DUST_APATITE).add(EOItems.APATITE_DUST.get());
                tag(EOGemDustsTags.Items.DUST_CINNABAR).add(EOItems.CINNABAR_DUST.get());
                tag(EOGemDustsTags.Items.DUST_COAL).add(EOItems.COAL_DUST.get());
                tag(EOGemDustsTags.Items.DUST_DIAMOND).add(EOItems.DIAMOND_DUST.get());
                tag(EOGemDustsTags.Items.DUST_EMERALD).add(EOItems.EMERALD_DUST.get());
                tag(EOGemDustsTags.Items.DUST_FLUORITE).add(EOItems.FLUORITE_DUST.get());
                tag(EOGemDustsTags.Items.DUST_LAPIS).add(EOItems.LAPIS_LAZULI_DUST.get());
                tag(EOGemDustsTags.Items.DUST_NECROTICARITE).add(EOItems.NECROTICARITE_DUST.get());
                tag(EOGemDustsTags.Items.DUST_NITER).add(EOItems.NITER_DUST.get());
                tag(EOGemDustsTags.Items.DUST_OBSIDIAN).add(EOItems.OBSIDIAN_DUST.get());
                tag(EOGemDustsTags.Items.DUST_ONYX).add(EOItems.ONYX_DUST.get());
                tag(EOGemDustsTags.Items.DUST_PERIDOT).add(EOItems.PERIDOT_DUST.get());
                tag(EOGemDustsTags.Items.DUST_QUARTZ).add(EOItems.QUARTZ_DUST.get());
                tag(EOGemDustsTags.Items.DUST_RUBY).add(EOItems.RUBY_DUST.get());
                tag(EOGemDustsTags.Items.DUST_SAPPHIRE).add(EOItems.SAPPHIRE_DUST.get());
                tag(EOGemDustsTags.Items.DUST_SULFUR).add(EOItems.SULFUR_DUST.get());
                tag(EOGemDustsTags.Items.DUST_QUANTIQUARITE).add(EOItems.QUANTIQUARITE_DUST.get());
                tag(EOGemDustsTags.Items.DUST_TACHYARITE).add(EOItems.TACHYARITE_DUST.get());
                tag(EOGemDustsTags.Items.DUST_VOIDERITE).add(EOItems.VOIDERITE_DUST.get());

                tag(EOStoneDustsTags.Items.DUST_NETHERRACK).add(EOItems.NETHERRACK_DUST.get());
                tag(EOStoneDustsTags.Items.DUST_ENDSTONE).add(EOItems.ENDSTONE_DUST.get());

                tag(EOMiscDustsTags.Items.DUST_ENDER).add(EOItems.ENDER_DUST.get());
                tag(EOMiscDustsTags.Items.DUST_NETHER_STAR).add(EOItems.NETHER_STAR_DUST.get());
                tag(EOMiscDustsTags.Items.DUST_SCULK).add(EOItems.SCULK_DUST.get());

                //Gems
                tag(Tags.Items.GEMS)
                        .add(EOItems.GEM_AMBER.get())
                        .add(EOItems.GEM_APATITE.get())
                        .add(EOItems.GEM_CINNABAR.get())
                        .add(EOItems.FLUORITE.get())
                        .add(EOItems.GEM_NECROTICARITE.get())
                        .add(EOItems.GEM_NITER.get())
                        .add(EOItems.GEM_OBSIDIAN_SHARD.get())
                        .add(EOItems.GEM_ONYX.get())
                        .add(EOItems.GEM_PERIDOT.get())
                        .add(EOItems.GEM_QUANTIQUARITE.get())
                        .add(EOItems.GEM_RUBY.get())
                        .add(EOItems.GEM_SAPPHIRE.get())
                        .add(EOItems.GEM_TACHYARITE.get())
                        .add(EOItems.GEM_VOIDERITE.get());

                //Individual Gem Tags
                tag(EOGemTags.Items.GEM_AMBER).add(EOItems.GEM_AMBER.get());
                tag(EOGemTags.Items.GEM_APATITE).add(EOItems.GEM_APATITE.get());
                tag(EOGemTags.Items.GEM_CINNABAR).add(EOItems.GEM_CINNABAR.get());
                tag(EOGemTags.Items.GEM_FLUORITE).add(EOItems.FLUORITE.get());
                tag(EOGemTags.Items.GEM_NECROTICARITE).add(EOItems.GEM_NECROTICARITE.get());
                tag(EOGemTags.Items.GEM_NITER).add(EOItems.GEM_NITER.get());
                tag(EOGemTags.Items.GEM_OBSIDIAN).add(EOItems.GEM_OBSIDIAN_SHARD.get());
                tag(EOGemTags.Items.GEM_ONYX).add(EOItems.GEM_ONYX.get());
                tag(EOGemTags.Items.GEM_PERIDOT).add(EOItems.GEM_PERIDOT.get());
                tag(EOGemTags.Items.GEM_RUBY).add(EOItems.GEM_RUBY.get());
                tag(EOGemTags.Items.GEM_SAPPHIRE).add(EOItems.GEM_SAPPHIRE.get());
                tag(EOGemTags.Items.GEM_QUANTIQUARITE).add(EOItems.GEM_QUANTIQUARITE.get());
                tag(EOGemTags.Items.GEM_TACHYARITE).add(EOItems.GEM_TACHYARITE.get());
                tag(EOGemTags.Items.GEM_VOIDERITE).add(EOItems.GEM_VOIDERITE.get());

                //Ores In Ground Item Tags
                //Stone
                tag(Tags.Items.ORES_IN_GROUND_STONE).add(EOBlocks.ALUMINUM_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_STONE).add(EOBlocks.AMBER_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_STONE).add(EOBlocks.APATITE_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_STONE).add(EOBlocks.CINNABAR_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_STONE).add(EOBlocks.COBALT_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_STONE).add(EOBlocks.FLUORITE_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_STONE).add(EOBlocks.GALLIUM_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_STONE).add(EOBlocks.IRIDIUM_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_STONE).add(EOBlocks.LEAD_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_STONE).add(EOBlocks.NICKEL_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_STONE).add(EOBlocks.NITER_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_STONE).add(EOBlocks.ONYX_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_STONE).add(EOBlocks.OSMIUM_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_STONE).add(EOBlocks.PERIDOT_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_STONE).add(EOBlocks.PLATINUM_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_STONE).add(EOBlocks.PLUTONIUM_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_STONE).add(EOBlocks.SAPPHIRE_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_STONE).add(EOBlocks.SILVER_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_STONE).add(EOBlocks.SULFUR_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_STONE).add(EOBlocks.TIN_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_STONE).add(EOBlocks.URANINITE_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_STONE).add(EOBlocks.URANIUM_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_STONE).add(EOBlocks.ZINC_ORE_BLOCK.asItem());
                //Deepslate
                tag(Tags.Items.ORES_IN_GROUND_DEEPSLATE).add(EOBlocks.DEEPSLATE_ALUMINUM_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_DEEPSLATE).add(EOBlocks.DEEPSLATE_AMBER_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_DEEPSLATE).add(EOBlocks.DEEPSLATE_APATITE_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_DEEPSLATE).add(EOBlocks.DEEPSLATE_CINNABAR_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_DEEPSLATE).add(EOBlocks.DEEPSLATE_COBALT_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_DEEPSLATE).add(EOBlocks.DEEPSLATE_FLUORITE_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_DEEPSLATE).add(EOBlocks.DEEPSLATE_GALLIUM_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_DEEPSLATE).add(EOBlocks.DEEPSLATE_IRIDIUM_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_DEEPSLATE).add(EOBlocks.DEEPSLATE_LEAD_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_DEEPSLATE).add(EOBlocks.DEEPSLATE_NICKEL_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_DEEPSLATE).add(EOBlocks.DEEPSLATE_NITER_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_DEEPSLATE).add(EOBlocks.DEEPSLATE_ONYX_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_DEEPSLATE).add(EOBlocks.DEEPSLATE_OSMIUM_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_DEEPSLATE).add(EOBlocks.DEEPSLATE_PERIDOT_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_DEEPSLATE).add(EOBlocks.DEEPSLATE_PLATINUM_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_DEEPSLATE).add(EOBlocks.DEEPSLATE_PLUTONIUM_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_DEEPSLATE).add(EOBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_DEEPSLATE).add(EOBlocks.DEEPSLATE_SILVER_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_DEEPSLATE).add(EOBlocks.DEEPSLATE_SULFUR_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_DEEPSLATE).add(EOBlocks.DEEPSLATE_TIN_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_DEEPSLATE).add(EOBlocks.DEEPSLATE_URANINITE_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_DEEPSLATE).add(EOBlocks.DEEPSLATE_URANIUM_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_DEEPSLATE).add(EOBlocks.DEEPSLATE_ZINC_ORE_BLOCK.asItem());
                //Netherrack
                tag(Tags.Items.ORES_IN_GROUND_NETHERRACK).add(EOBlocks.ARDITE_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_NETHERRACK).add(EOBlocks.NECROTICARITE_ORE_BLOCK.asItem());
                tag(Tags.Items.ORES_IN_GROUND_NETHERRACK).add(EOBlocks.OBSIDIAN_ORE_BLOCK.asItem());

                //Raw Ores
                tag(Tags.Items.RAW_MATERIALS)
                        .add(EOItems.RAW_ALUMINUM.get())
                        .add(EOItems.RAW_ARDITE.get())
                        .add(EOItems.RAW_CATALYRIUM.get())
                        .add(EOItems.RAW_COBALT.get())
                        .add(EOItems.RAW_GALLIUM.get())
                        .add(EOItems.RAW_IRIDIUM.get())
                        .add(EOItems.RAW_LEAD.get())
                        .add(EOItems.RAW_NICKEL.get())
                        .add(EOItems.RAW_OSMIUM.get())
                        .add(EOItems.RAW_PLATINUM.get())
                        .add(EOItems.RAW_PLUTONIUM.get())
                        .add(EOItems.RAW_SILVER.get())
                        .add(EOItems.SULFUR.get())
                        .add(EOItems.RAW_TIN.get())
                        .add(EOItems.RAW_ULTIMATITANIUM.get())
                        .add(EOItems.RAW_URANINITE.get())
                        .add(EOItems.RAW_URANIUM.get())
                        .add(EOItems.RAW_ZINC.get());

                //Individual Raw Mats
                tag(EORawMaterialTags.RAW_ALUMINUM).add(EOItems.RAW_ALUMINUM.get());
                tag(EORawMaterialTags.RAW_ALUMINIUM).add(EOItems.RAW_ALUMINUM.get());
                tag(EORawMaterialTags.RAW_ARDITE).add(EOItems.RAW_ARDITE.get());
                tag(EORawMaterialTags.RAW_CATALYRIUM).add(EOItems.RAW_CATALYRIUM.get());
                tag(EORawMaterialTags.RAW_COBALT).add(EOItems.RAW_COBALT.get());
                tag(EORawMaterialTags.RAW_GALLIUM).add(EOItems.RAW_GALLIUM.get());
                tag(EORawMaterialTags.RAW_IRIDIUM).add(EOItems.RAW_IRIDIUM.get());
                tag(EORawMaterialTags.RAW_LEAD).add(EOItems.RAW_LEAD.get());
                tag(EORawMaterialTags.RAW_NICKEL).add(EOItems.RAW_NICKEL.get());
                tag(EORawMaterialTags.RAW_OSMIUM).add(EOItems.RAW_OSMIUM.get());
                tag(EORawMaterialTags.RAW_PLATINUM).add(EOItems.RAW_PLATINUM.get());
                tag(EORawMaterialTags.RAW_PLUTONIUM).add(EOItems.RAW_PLUTONIUM.get());
                tag(EORawMaterialTags.RAW_SILVER).add(EOItems.RAW_SILVER.get());
                tag(EORawMaterialTags.SULFUR).add(EOItems.SULFUR.get());
                tag(EORawMaterialTags.RAW_TIN).add(EOItems.RAW_TIN.get());
                tag(EORawMaterialTags.RAW_ULTIMATITANIUM).add(EOItems.RAW_ULTIMATITANIUM.get());
                tag(EORawMaterialTags.RAW_URANINITE).add(EOItems.RAW_URANINITE.get());
                tag(EORawMaterialTags.RAW_URANIUM).add(EOItems.RAW_URANIUM.get());
                tag(EORawMaterialTags.RAW_ZINC).add(EOItems.RAW_ZINC.get());

                tag(EOItemsGeneralTags.Items.SCULK).add(Items.SCULK);

                //Compressed Blocks Storage Blocks (Item tags)
                tag(EOCompressedBlockTags.Items.COMPRESSED_COBBLESTONE).add(EOBlocks.COBBLE_1.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_COBBLESTONE).add(EOBlocks.COBBLE_2.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_COBBLESTONE).add(EOBlocks.COBBLE_3.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_COBBLESTONE).add(EOBlocks.COBBLE_4.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_COBBLESTONE).add(EOBlocks.COBBLE_5.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_COBBLESTONE).add(EOBlocks.COBBLE_6.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_COBBLESTONE).add(EOBlocks.COBBLE_7.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_COBBLESTONE).add(EOBlocks.COBBLE_8.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_COBBLESTONE).add(EOBlocks.COBBLE_9.get().asItem());

                tag(EOCompressedBlockTags.Items.COMPRESSED_SAND).add(EOBlocks.SAND_1.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_SAND).add(EOBlocks.SAND_2.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_SAND).add(EOBlocks.SAND_3.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_SAND).add(EOBlocks.SAND_4.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_SAND).add(EOBlocks.SAND_5.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_SAND).add(EOBlocks.SAND_6.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_SAND).add(EOBlocks.SAND_7.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_SAND).add(EOBlocks.SAND_8.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_SAND).add(EOBlocks.SAND_9.get().asItem());

                tag(EOCompressedBlockTags.Items.COMPRESSED_DIRT).add(EOBlocks.DIRT_1.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_DIRT).add(EOBlocks.DIRT_2.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_DIRT).add(EOBlocks.DIRT_3.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_DIRT).add(EOBlocks.DIRT_4.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_DIRT).add(EOBlocks.DIRT_5.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_DIRT).add(EOBlocks.DIRT_6.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_DIRT).add(EOBlocks.DIRT_7.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_DIRT).add(EOBlocks.DIRT_8.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_DIRT).add(EOBlocks.DIRT_9.get().asItem());

                tag(EOCompressedBlockTags.Items.COMPRESSED_ANDESITE).add(EOBlocks.ANDESITE_1.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_ANDESITE).add(EOBlocks.ANDESITE_2.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_ANDESITE).add(EOBlocks.ANDESITE_3.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_ANDESITE).add(EOBlocks.ANDESITE_4.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_ANDESITE).add(EOBlocks.ANDESITE_5.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_ANDESITE).add(EOBlocks.ANDESITE_6.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_ANDESITE).add(EOBlocks.ANDESITE_7.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_ANDESITE).add(EOBlocks.ANDESITE_8.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_ANDESITE).add(EOBlocks.ANDESITE_9.get().asItem());

                tag(EOCompressedBlockTags.Items.COMPRESSED_GRAVEL).add(EOBlocks.GRAVEL_1.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_GRAVEL).add(EOBlocks.GRAVEL_2.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_GRAVEL).add(EOBlocks.GRAVEL_3.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_GRAVEL).add(EOBlocks.GRAVEL_4.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_GRAVEL).add(EOBlocks.GRAVEL_5.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_GRAVEL).add(EOBlocks.GRAVEL_6.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_GRAVEL).add(EOBlocks.GRAVEL_7.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_GRAVEL).add(EOBlocks.GRAVEL_8.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_GRAVEL).add(EOBlocks.GRAVEL_9.get().asItem());

                tag(EOCompressedBlockTags.Items.COMPRESSED_GRANITE).add(EOBlocks.GRANITE_1.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_GRANITE).add(EOBlocks.GRANITE_2.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_GRANITE).add(EOBlocks.GRANITE_3.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_GRANITE).add(EOBlocks.GRANITE_4.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_GRANITE).add(EOBlocks.GRANITE_5.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_GRANITE).add(EOBlocks.GRANITE_6.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_GRANITE).add(EOBlocks.GRANITE_7.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_GRANITE).add(EOBlocks.GRANITE_8.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_GRANITE).add(EOBlocks.GRANITE_9.get().asItem());

                tag(EOCompressedBlockTags.Items.COMPRESSED_DIORITE).add(EOBlocks.DIORITE_1.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_DIORITE).add(EOBlocks.DIORITE_2.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_DIORITE).add(EOBlocks.DIORITE_3.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_DIORITE).add(EOBlocks.DIORITE_4.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_DIORITE).add(EOBlocks.DIORITE_5.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_DIORITE).add(EOBlocks.DIORITE_6.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_DIORITE).add(EOBlocks.DIORITE_7.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_DIORITE).add(EOBlocks.DIORITE_8.get().asItem());
                tag(EOCompressedBlockTags.Items.COMPRESSED_DIORITE).add(EOBlocks.DIORITE_9.get().asItem());
    }
}
