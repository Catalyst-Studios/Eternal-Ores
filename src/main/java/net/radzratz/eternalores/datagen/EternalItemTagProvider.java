package net.radzratz.eternalores.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.item.EternalGeneralItems;
import net.radzratz.eternalores.util.tags.item.EternalItemsGeneralTags;
import net.radzratz.eternalores.util.tags.item.dusts.EternalGemDustsTags;
import net.radzratz.eternalores.util.tags.item.dusts.EternalMetalDustsTags;
import net.radzratz.eternalores.util.tags.item.dusts.EternalMiscDustsTags;
import net.radzratz.eternalores.util.tags.item.dusts.EternalStoneDustsTags;
import net.radzratz.eternalores.util.tags.item.gears.EternalGemGearTags;
import net.radzratz.eternalores.util.tags.item.gears.EternalMetalGearTags;
import net.radzratz.eternalores.util.tags.item.nuggets.EternalNuggetsTags;
import net.radzratz.eternalores.util.tags.item.rods.EternalGemRodsTags;
import net.radzratz.eternalores.util.tags.item.rods.EternalMetalRodsTags;
import net.radzratz.eternalores.util.tags.item.rods.EternalMiscRodsTags;
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
                        .add(EternalGeneralItems.GEAR_IRON.get())
                        .add(EternalGeneralItems.GEAR_LEAD.get())
                        .add(EternalGeneralItems.GEAR_STEEL.get())
                        .add(EternalGeneralItems.GEAR_TIN.get());

                //Metal Gears
                tag(EternalItemsGeneralTags.Items.METAL_GEARS)
                        .add(EternalGeneralItems.GEAR_ALUMINUM.get())
                        .add(EternalGeneralItems.GEAR_BRONZE.get())
                        .add(EternalGeneralItems.GEAR_COPPER.get())
                        .add(EternalGeneralItems.GEAR_ENDERIUM.get())
                        .add(EternalGeneralItems.GEAR_IRON.get())
                        .add(EternalGeneralItems.GEAR_LEAD.get())
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
                tag(EternalMetalGearTags.Items.GEAR_LEAD).add(EternalGeneralItems.GEAR_LEAD.get());
                tag(EternalMetalGearTags.Items.GEAR_STEEL).add(EternalGeneralItems.GEAR_STEEL.get());
                tag(EternalMetalGearTags.Items.GEAR_LEAD).add(EternalGeneralItems.GEAR_LEAD.get());

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

                System.out.println("Finished Loading Tools and Item Tags");
    }
}
