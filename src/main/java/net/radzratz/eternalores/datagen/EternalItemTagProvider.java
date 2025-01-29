package net.radzratz.eternalores.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.item.Moditems;
import net.radzratz.eternalores.util.tags.item.EternalItemsGeneralTags;
import net.radzratz.eternalores.util.tags.item.dusts.EternalGemDusts;
import net.radzratz.eternalores.util.tags.item.dusts.EternalMetalDusts;
import net.radzratz.eternalores.util.tags.item.dusts.EternalMiscDusts;
import net.radzratz.eternalores.util.tags.item.dusts.EternalStoneDusts;
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

        System.out.println("Loading Custom Tool & Item Tags");

                //Tools
                tag(EternalItemsGeneralTags.Items.HAMMERS)
                        .add(Moditems.COBALT_HAMMER.get())
                        .add(Moditems.COPPER_HAMMER.get())
                        //.add(Moditems.ETERNAL_DARK_HAMMER.get())
                        .add(Moditems.DIAMOND_HAMMER.get())
                        .add(Moditems.IRON_HAMMER.get())
                        .add(Moditems.STONE_HAMMER.get());


                tag(EternalItemsGeneralTags.Items.GEM_CUTTER)
                        .add(Moditems.IRON_GEM_CUTTER.get());

                //General Dusts
                tag(Tags.Items.DUSTS)
                        .add(Moditems.ALUMINUM_DUST.get())
                        .add(Moditems.AMBER_DUST.get())
                        .add(Moditems.APATITE_DUST.get())
                        .add(Moditems.BLUE_STEEL_DUST.get())
                        .add(Moditems.BRASS_DUST.get())
                        .add(Moditems.BRITANNIA_SILVER_DUST.get())
                        .add(Moditems.BRONZE_DUST.get())
                        .add(Moditems.CINNABAR_DUST.get())
                        .add(Moditems.COAL_DUST.get())
                        .add(Moditems.COBALT_DUST.get())
                        .add(Moditems.CONSTANTAN_DUST.get())
                        .add(Moditems.COPPER_DUST.get())
                        .add(Moditems.DIAMOND_DUST.get())
                        .add(Moditems.ELECTRUM_DUST.get())
                        .add(Moditems.EMERALD_DUST.get())
                        .add(Moditems.ENDER_DUST.get())
                        .add(Moditems.ENDERIUM_DUST.get())
                        .add(Moditems.ENDSTONE_DUST.get())
                        .add(Moditems.FLUORITE_DUST.get())
                        .add(Moditems.GALLIUM_DUST.get())
                        .add(Moditems.GOLD_DUST.get())
                        .add(Moditems.GRAPHITE_DUST.get())
                        .add(Moditems.INVAR_DUST.get())
                        .add(Moditems.IRON_DUST.get())
                        .add(Moditems.LAPIS_LAZULI_DUST.get())
                        .add(Moditems.LEAD_DUST.get())
                        .add(Moditems.LUMIUM_DUST.get())
                        .add(Moditems.NETHERITE_DUST.get())
                        .add(Moditems.NETHERRACK_DUST.get())
                        .add(Moditems.NICKEL_DUST.get())
                        .add(Moditems.NITER_DUST.get())
                        .add(Moditems.OBSIDIAN_DUST.get())
                        .add(Moditems.ONYX_DUST.get())
                        .add(Moditems.OSMIUM_DUST.get())
                        .add(Moditems.PERIDOT_DUST.get())
                        .add(Moditems.PEWTER_DUST.get())
                        .add(Moditems.PLATINUM_DUST.get())
                        .add(Moditems.PLUTONIUM_DUST.get())
                        .add(Moditems.QUARTZ_DUST.get())
                        .add(Moditems.ROSE_GOLD_DUST.get())
                        .add(Moditems.RUBY_DUST.get())
                        .add(Moditems.SAPPHIRE_DUST.get())
                        .add(Moditems.SIGNALUM_DUST.get())
                        .add(Moditems.SILVER_DUST.get())
                        .add(Moditems.STEEL_DUST.get())
                        .add(Moditems.SULFUR_DUST.get())
                        .add(Moditems.TIN_DUST.get())
                        .add(Moditems.TITANIUM_DUST.get())
                        .add(Moditems.ULTIMATITANIUM_DUST.get())
                        .add(Moditems.URANIUM_DUST.get())
                        .add(Moditems.ZINC_DUST.get());

                //Metal Dusts
                tag(EternalItemsGeneralTags.Items.METAL_DUSTS)
                        .add(Moditems.ALUMINUM_DUST.get())
                        .add(Moditems.BLUE_STEEL_DUST.get())
                        .add(Moditems.BRASS_DUST.get())
                        .add(Moditems.BRITANNIA_SILVER_DUST.get())
                        .add(Moditems.BRONZE_DUST.get())
                        .add(Moditems.COBALT_DUST.get())
                        .add(Moditems.CONSTANTAN_DUST.get())
                        .add(Moditems.COPPER_DUST.get())
                        .add(Moditems.ELECTRUM_DUST.get())
                        .add(Moditems.ENDERIUM_DUST.get())
                        .add(Moditems.GALLIUM_DUST.get())
                        .add(Moditems.GOLD_DUST.get())
                        .add(Moditems.GRAPHITE_DUST.get())
                        .add(Moditems.INVAR_DUST.get())
                        .add(Moditems.IRON_DUST.get())
                        .add(Moditems.LEAD_DUST.get())
                        .add(Moditems.LUMIUM_DUST.get())
                        .add(Moditems.NETHERITE_DUST.get())
                        .add(Moditems.NICKEL_DUST.get())
                        .add(Moditems.OSMIUM_DUST.get())
                        .add(Moditems.PEWTER_DUST.get())
                        .add(Moditems.PLATINUM_DUST.get())
                        .add(Moditems.PLUTONIUM_DUST.get())
                        .add(Moditems.ROSE_GOLD_DUST.get())
                        .add(Moditems.SIGNALUM_DUST.get())
                        .add(Moditems.SILVER_DUST.get())
                        .add(Moditems.STEEL_DUST.get())
                        .add(Moditems.TIN_DUST.get())
                        .add(Moditems.TITANIUM_DUST.get())
                        .add(Moditems.ULTIMATITANIUM_DUST.get())
                        .add(Moditems.URANIUM_DUST.get())
                        .add(Moditems.ZINC_DUST.get());

                //Gem Dusts
                tag(EternalItemsGeneralTags.Items.GEM_DUSTS)
                        .add(Moditems.AMBER_DUST.get())
                        .add(Moditems.APATITE_DUST.get())
                        .add(Moditems.CINNABAR_DUST.get())
                        .add(Moditems.COAL_DUST.get())
                        .add(Moditems.DIAMOND_DUST.get())
                        .add(Moditems.EMERALD_DUST.get())
                        .add(Moditems.FLUORITE_DUST.get())
                        .add(Moditems.LAPIS_LAZULI_DUST.get())
                        .add(Moditems.NITER_DUST.get())
                        .add(Moditems.OBSIDIAN_DUST.get())
                        .add(Moditems.ONYX_DUST.get())
                        .add(Moditems.PERIDOT_DUST.get())
                        .add(Moditems.QUARTZ_DUST.get())
                        .add(Moditems.RUBY_DUST.get())
                        .add(Moditems.SAPPHIRE_DUST.get())
                        .add(Moditems.SULFUR_DUST.get());

                //Stone Dusts
                tag(EternalItemsGeneralTags.Items.STONE_DUSTS)
                        .add(Moditems.ENDSTONE_DUST.get())
                        .add(Moditems.NETHERRACK_DUST.get());

                //Individual Dusts
                tag(EternalMetalDusts.Items.DUST_ALUMINUM).add(Moditems.ALUMINUM_DUST.get());
                tag(EternalMetalDusts.Items.DUST_BLUE_STEEL).add(Moditems.BLUE_STEEL_DUST.get());
                tag(EternalMetalDusts.Items.DUST_BRASS).add(Moditems.BRASS_DUST.get());
                tag(EternalMetalDusts.Items.DUST_BRITANNIA_SILVER).add(Moditems.BRITANNIA_SILVER_DUST.get());
                tag(EternalMetalDusts.Items.DUST_BRONZE).add(Moditems.BRONZE_DUST.get());
                tag(EternalMetalDusts.Items.DUST_COBALT).add(Moditems.COBALT_DUST.get());
                tag(EternalMetalDusts.Items.DUST_CONSTANTAN).add(Moditems.COBALT_DUST.get());
                tag(EternalMetalDusts.Items.DUST_COPPER).add(Moditems.COPPER_DUST.get());
                tag(EternalMetalDusts.Items.DUST_ELECTRUM).add(Moditems.ELECTRUM_DUST.get());
                tag(EternalMetalDusts.Items.DUST_ENDERIUM).add(Moditems.ENDERIUM_DUST.get());
                tag(EternalMetalDusts.Items.DUST_GALLIUM).add(Moditems.GALLIUM_DUST.get());
                tag(EternalMetalDusts.Items.DUST_GOLD).add(Moditems.GOLD_DUST.get());
                tag(EternalMetalDusts.Items.DUST_INVAR).add(Moditems.INVAR_DUST.get());
                tag(EternalMetalDusts.Items.DUST_IRON).add(Moditems.IRON_DUST.get());
                tag(EternalMetalDusts.Items.DUST_LEAD).add(Moditems.LEAD_DUST.get());
                tag(EternalMetalDusts.Items.DUST_LUMIUM).add(Moditems.LUMIUM_DUST.get());
                tag(EternalMetalDusts.Items.DUST_NETHERITE).add(Moditems.NETHERITE_DUST.get());
                tag(EternalMetalDusts.Items.DUST_NICKEL).add(Moditems.NICKEL_DUST.get());
                tag(EternalMetalDusts.Items.DUST_OSMIUM).add(Moditems.OSMIUM_DUST.get());
                tag(EternalMetalDusts.Items.DUST_PEWTER).add(Moditems.PEWTER_DUST.get());
                tag(EternalMetalDusts.Items.DUST_PLATINUM).add(Moditems.PLATINUM_DUST.get());
                tag(EternalMetalDusts.Items.DUST_ROSE_GOLD).add(Moditems.ROSE_GOLD_DUST.get());
                tag(EternalMetalDusts.Items.DUST_SIGNALUM).add(Moditems.SIGNALUM_DUST.get());
                tag(EternalMetalDusts.Items.DUST_SILVER).add(Moditems.SILVER_DUST.get());
                tag(EternalMetalDusts.Items.DUST_STEEL).add(Moditems.STEEL_DUST.get());
                tag(EternalMetalDusts.Items.DUST_TIN).add(Moditems.TIN_DUST.get());
                tag(EternalMetalDusts.Items.DUST_TITANIUM).add(Moditems.TITANIUM_DUST.get());
                tag(EternalMetalDusts.Items.DUST_ULTIMATITANIUM).add(Moditems.ULTIMATITANIUM_DUST.get());
                tag(EternalMetalDusts.Items.DUST_URANIUM).add(Moditems.URANIUM_DUST.get());
                tag(EternalMetalDusts.Items.DUST_ZINC).add(Moditems.ZINC_DUST.get());

                tag(EternalGemDusts.Items.DUST_AMBER).add(Moditems.AMBER_DUST.get());
                tag(EternalGemDusts.Items.DUST_APATITE).add(Moditems.APATITE_DUST.get());
                tag(EternalGemDusts.Items.DUST_CINNABAR).add(Moditems.CINNABAR_DUST.get());
                tag(EternalGemDusts.Items.DUST_COAL).add(Moditems.COAL_DUST.get());
                tag(EternalGemDusts.Items.DUST_DIAMOND).add(Moditems.DIAMOND_DUST.get());
                tag(EternalGemDusts.Items.DUST_EMERALD).add(Moditems.EMERALD_DUST.get());
                tag(EternalGemDusts.Items.DUST_LAPIS).add(Moditems.LAPIS_LAZULI_DUST.get());
                tag(EternalGemDusts.Items.DUST_NITER).add(Moditems.NITER_DUST.get());
                tag(EternalGemDusts.Items.DUST_OBSIDIAN).add(Moditems.OBSIDIAN_DUST.get());
                tag(EternalGemDusts.Items.DUST_ONYX).add(Moditems.ONYX_DUST.get());
                tag(EternalGemDusts.Items.DUST_PERIDOT).add(Moditems.PERIDOT_DUST.get());
                tag(EternalGemDusts.Items.DUST_QUARTZ).add(Moditems.QUARTZ_DUST.get());
                tag(EternalGemDusts.Items.DUST_RUBY).add(Moditems.RUBY_DUST.get());
                tag(EternalGemDusts.Items.DUST_SAPPHIRE).add(Moditems.SAPPHIRE_DUST.get());
                tag(EternalGemDusts.Items.DUST_SULFUR).add(Moditems.SULFUR_DUST.get());

                tag(EternalStoneDusts.Items.DUST_NETHERRACK).add(Moditems.NETHERRACK_DUST.get());
                tag(EternalStoneDusts.Items.DUST_ENDSTONE).add(Moditems.ENDSTONE_DUST.get());

                tag(EternalMiscDusts.Items.DUST_ENDER).add(Moditems.ENDER_DUST.get());

                //Raw Ores
                tag(Tags.Items.RAW_MATERIALS)
                        .add(Moditems.RAW_ALUMINUM.get())
                        .add(Moditems.RAW_COBALT.get())
                        .add(Moditems.RAW_GALLIUM.get())
                        .add(Moditems.RAW_LEAD.get())
                        .add(Moditems.RAW_NICKEL.get())
                        .add(Moditems.RAW_OSMIUM.get())
                        .add(Moditems.RAW_PLATINUM.get())
                        .add(Moditems.RAW_PLUTONIUM.get())
                        .add(Moditems.RAW_SILVER.get())
                        .add(Moditems.SULFUR.get())
                        .add(Moditems.RAW_TIN.get())
                        .add(Moditems.RAW_ULTIMATITANIUM.get())
                        .add(Moditems.RAW_URANIUM.get())
                        .add(Moditems.RAW_ZINC.get());

    }
}
