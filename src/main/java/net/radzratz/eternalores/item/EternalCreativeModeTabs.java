package net.radzratz.eternalores.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.block.EternalGeneralBlocks;

import java.util.function.Supplier;

public class EternalCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EternalOres.MOD_ID);

//Eternal Items Tab
public static final Supplier<CreativeModeTab> ETERNAL_ORES = CREATIVE_MODE_TAB.register("eternal_ores_tab",
        ()-> CreativeModeTab.builder().icon(()-> new ItemStack(EternalGeneralItems.ETERNAL_DARK_INGOT.get()))
                .withTabsBefore(ResourceLocation.fromNamespaceAndPath(EternalOres.MOD_ID, "eternal_ores"))
                .title(Component.translatable("creativetab.eternalores.eternal_ores"))
                .displayItems((itemDisplayParameters, output) -> {

                    System.out.println("Loading Custom Creative Tab");

                    //STONE ORES
                    output.accept(EternalGeneralBlocks.ALUMINUM_ORE_BLOCK);
                    output.accept(EternalGeneralBlocks.AMBER_ORE_BLOCK);
                    output.accept(EternalGeneralBlocks.APATITE_ORE_BLOCK);
                    output.accept(EternalGeneralBlocks.CINNABAR_ORE_BLOCK);
                    output.accept(EternalGeneralBlocks.COBALT_ORE_BLOCK);
                    output.accept(EternalGeneralBlocks.FLUORITE_ORE_BLOCK);
                    output.accept(EternalGeneralBlocks.GALLIUM_ORE_BLOCK);
                    output.accept(EternalGeneralBlocks.LEAD_ORE_BLOCK);
                    output.accept(EternalGeneralBlocks.NICKEL_ORE_BLOCK);
                    output.accept(EternalGeneralBlocks.NITER_ORE_BLOCK);
                    output.accept(EternalGeneralBlocks.ONYX_ORE_BLOCK);
                    output.accept(EternalGeneralBlocks.OSMIUM_ORE_BLOCK);
                    output.accept(EternalGeneralBlocks.PERIDOT_ORE_BLOCK);
                    output.accept(EternalGeneralBlocks.PLATINUM_ORE_BLOCK);
                    output.accept(EternalGeneralBlocks.PLUTONIUM_ORE_BLOCK);
                    output.accept(EternalGeneralBlocks.RUBY_ORE_BLOCK);
                    output.accept(EternalGeneralBlocks.SAPPHIRE_ORE_BLOCK);
                    output.accept(EternalGeneralBlocks.SILVER_ORE_BLOCK);
                    output.accept(EternalGeneralBlocks.SULFUR_ORE_BLOCK);
                    output.accept(EternalGeneralBlocks.TIN_ORE_BLOCK);
                    output.accept(EternalGeneralBlocks.URANIUM_ORE_BLOCK);
                    output.accept(EternalGeneralBlocks.ZINC_ORE_BLOCK);
                    //DEEPSLATE ORES
                    output.accept(EternalGeneralBlocks.DEEPSLATE_ALUMINUM_ORE_BLOCK);
                    output.accept(EternalGeneralBlocks.DEEPSLATE_AMBER_ORE_BLOCK);
                    output.accept(EternalGeneralBlocks.DEEPSLATE_APATITE_ORE_BLOCK);
                    output.accept(EternalGeneralBlocks.DEEPSLATE_CINNABAR_ORE_BLOCK);
                    output.accept(EternalGeneralBlocks.DEEPSLATE_COBALT_ORE_BLOCK);
                    output.accept(EternalGeneralBlocks.DEEPSLATE_FLUORITE_ORE_BLOCK);
                    output.accept(EternalGeneralBlocks.DEEPSLATE_GALLIUM_ORE_BLOCK);
                    output.accept(EternalGeneralBlocks.DEEPSLATE_LEAD_ORE_BLOCK);
                    output.accept(EternalGeneralBlocks.DEEPSLATE_NICKEL_ORE_BLOCK);
                    output.accept(EternalGeneralBlocks.DEEPSLATE_NITER_ORE_BLOCK);
                    output.accept(EternalGeneralBlocks.DEEPSLATE_ONYX_ORE_BLOCK);
                    output.accept(EternalGeneralBlocks.DEEPSLATE_OSMIUM_ORE_BLOCK);
                    output.accept(EternalGeneralBlocks.DEEPSLATE_PERIDOT_ORE_BLOCK);
                    output.accept(EternalGeneralBlocks.DEEPSLATE_PLATINUM_ORE_BLOCK);
                    output.accept(EternalGeneralBlocks.DEEPSLATE_PLUTONIUM_ORE_BLOCK);
                    output.accept(EternalGeneralBlocks.DEEPSLATE_RUBY_ORE_BLOCK);
                    output.accept(EternalGeneralBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCK);
                    output.accept(EternalGeneralBlocks.DEEPSLATE_SILVER_ORE_BLOCK);
                    output.accept(EternalGeneralBlocks.DEEPSLATE_SULFUR_ORE_BLOCK);
                    output.accept(EternalGeneralBlocks.DEEPSLATE_TIN_ORE_BLOCK);
                    output.accept(EternalGeneralBlocks.DEEPSLATE_URANIUM_ORE_BLOCK);
                    output.accept(EternalGeneralBlocks.DEEPSLATE_ZINC_ORE_BLOCK);
                    //NETHER ORES W.I.P
                    output.accept(EternalGeneralBlocks.OBSIDIAN_ORE_BLOCK);
                    //END ORES W.I.P
                    //RAW ORE BLOCKS
                    output.accept(EternalGeneralBlocks.RAW_ALUMINUM_BLOCK);
                    output.accept(EternalGeneralBlocks.RAW_COBALT_BLOCK);
                    output.accept(EternalGeneralBlocks.RAW_GALLIUM_BLOCK);
                    output.accept(EternalGeneralBlocks.RAW_LEAD_BLOCK);
                    output.accept(EternalGeneralBlocks.RAW_NICKEL_BLOCK);
                    output.accept(EternalGeneralBlocks.RAW_OSMIUM_BLOCK);
                    output.accept(EternalGeneralBlocks.RAW_PLATINUM_BLOCK);
                    output.accept(EternalGeneralBlocks.RAW_PLUTONIUM_BLOCK);
                    output.accept(EternalGeneralBlocks.RAW_SILVER_BLOCK);
                    output.accept(EternalGeneralBlocks.SULFUR_BLOCK);
                    output.accept(EternalGeneralBlocks.RAW_TIN_BLOCK);
                    output.accept(EternalGeneralBlocks.RAW_URANIUM_BLOCK);
                    output.accept(EternalGeneralBlocks.RAW_ZINC_BLOCK);
                    //METAL AND GEM BLOCKS
                    output.accept(EternalGeneralBlocks.ALUMINUM_BLOCK);
                    output.accept(EternalGeneralBlocks.AMBER_BLOCK);
                    output.accept(EternalGeneralBlocks.APATITE_BLOCK);
                    output.accept(EternalGeneralBlocks.BLUE_STEEL_BLOCK);
                    output.accept(EternalGeneralBlocks.BRASS_BLOCK);
                    output.accept(EternalGeneralBlocks.BRITANNIA_SILVER_BLOCK);
                    output.accept(EternalGeneralBlocks.BRONZE_BLOCK);
                    output.accept(EternalGeneralBlocks.CINNABAR_BLOCK);
                    output.accept(EternalGeneralBlocks.COBALT_BLOCK);
                    output.accept(EternalGeneralBlocks.CONSTANTAN_BLOCK);
                    output.accept(EternalGeneralBlocks.ELECTRUM_BLOCK);
                    output.accept(EternalGeneralBlocks.ENDERIUM_BLOCK);
                    output.accept(EternalGeneralBlocks.FLUORITE_BLOCK);
                    output.accept(EternalGeneralBlocks.GALLIUM_BLOCK);
                    output.accept(EternalGeneralBlocks.GRAPHITE_BLOCK);
                    output.accept(EternalGeneralBlocks.INVAR_BLOCK);
                    output.accept(EternalGeneralBlocks.LEAD_BLOCK);
                    output.accept(EternalGeneralBlocks.LUMIUM_BLOCK);
                    output.accept(EternalGeneralBlocks.NICKEL_BLOCK);
                    output.accept(EternalGeneralBlocks.NITER_BLOCK);
                    output.accept(EternalGeneralBlocks.ONYX_BLOCK);
                    output.accept(EternalGeneralBlocks.OSMIUM_BLOCK);
                    output.accept(EternalGeneralBlocks.PERIDOT_BLOCK);
                    output.accept(EternalGeneralBlocks.PEWTER_BLOCK);
                    output.accept(EternalGeneralBlocks.PLATINUM_BLOCK);
                    output.accept(EternalGeneralBlocks.PLUTONIUM_BLOCK);
                    output.accept(EternalGeneralBlocks.ROSE_GOLD_BLOCK);
                    output.accept(EternalGeneralBlocks.RUBY_BLOCK);
                    output.accept(EternalGeneralBlocks.SAPPHIRE_BLOCK);
                    output.accept(EternalGeneralBlocks.SIGNALUM_BLOCK);
                    output.accept(EternalGeneralBlocks.SILVER_BLOCK);
                    output.accept(EternalGeneralBlocks.STEEL_BLOCK);
                    output.accept(EternalGeneralBlocks.TIN_BLOCK);
                    output.accept(EternalGeneralBlocks.TITANIUM_BLOCK);
                    output.accept(EternalGeneralBlocks.ULTIMATITANIUM_BLOCK);
                    output.accept(EternalGeneralBlocks.URANIUM_BLOCK);
                    output.accept(EternalGeneralBlocks.ZINC_BLOCK);
                    //RAW ORES
                    output.accept(EternalGeneralItems.RAW_ALUMINUM);
                    output.accept(EternalGeneralItems.RAW_COBALT);
                    output.accept(EternalGeneralItems.RAW_GALLIUM);
                    output.accept(EternalGeneralItems.RAW_LEAD);
                    output.accept(EternalGeneralItems.RAW_NICKEL);
                    output.accept(EternalGeneralItems.RAW_OSMIUM);
                    output.accept(EternalGeneralItems.RAW_PLATINUM);
                    output.accept(EternalGeneralItems.RAW_PLUTONIUM);
                    output.accept(EternalGeneralItems.RAW_SILVER);
                    output.accept(EternalGeneralItems.SULFUR);
                    output.accept(EternalGeneralItems.RAW_TIN);
                    output.accept(EternalGeneralItems.RAW_ULTIMATITANIUM);
                    output.accept(EternalGeneralItems.RAW_URANIUM);
                    output.accept(EternalGeneralItems.RAW_ZINC);
                    //INGOTS
                    output.accept(EternalGeneralItems.ALUMINUM_INGOT);
                    output.accept(EternalGeneralItems.BLUE_STEEL_INGOT);
                    output.accept(EternalGeneralItems.BRASS_INGOT);
                    output.accept(EternalGeneralItems.BRITANNIA_SILVER_INGOT);
                    output.accept(EternalGeneralItems.BRONZE_INGOT);
                    output.accept(EternalGeneralItems.COBALT_INGOT);
                    output.accept(EternalGeneralItems.CONSTANTAN_INGOT);
                    output.accept(EternalGeneralItems.ELECTRUM_INGOT);
                    output.accept(EternalGeneralItems.ETERNAL_DARK_INGOT);
                    output.accept(EternalGeneralItems.ETERNAL_LIGHT_INGOT);
                    output.accept(EternalGeneralItems.ENDERIUM_INGOT);
                    output.accept(EternalGeneralItems.GALLIUM_INGOT);
                    output.accept(EternalGeneralItems.GRAPHITE_INGOT);
                    output.accept(EternalGeneralItems.INVAR_INGOT);
                    output.accept(EternalGeneralItems.LEAD_INGOT);
                    output.accept(EternalGeneralItems.LUMIUM_INGOT);
                    output.accept(EternalGeneralItems.NICKEL_INGOT);
                    output.accept(EternalGeneralItems.OSMIUM_INGOT);
                    output.accept(EternalGeneralItems.PEWTER_INGOT);
                    output.accept(EternalGeneralItems.PLATINUM_INGOT);
                    output.accept(EternalGeneralItems.PLUTONIUM_INGOT);
                    output.accept(EternalGeneralItems.REDSTONE_INGOT);
                    output.accept(EternalGeneralItems.ROSE_GOLD_INGOT);
                    output.accept(EternalGeneralItems.SIGNALUM_INGOT);
                    output.accept(EternalGeneralItems.SILVER_INGOT);
                    output.accept(EternalGeneralItems.STEEL_INGOT);
                    output.accept(EternalGeneralItems.TIN_INGOT);
                    output.accept(EternalGeneralItems.TITANIUM_INGOT);
                    output.accept(EternalGeneralItems.ULTIMATITANIUM_INGOT);
                    output.accept(EternalGeneralItems.URANIUM_INGOT);
                    output.accept(EternalGeneralItems.ZINC_INGOT);
                    //NUGGETS
                    output.accept(EternalGeneralItems.ALUMINUM_NUGGET);
                    output.accept(EternalGeneralItems.BLUE_STEEL_NUGGET);
                    output.accept(EternalGeneralItems.BRASS_NUGGET);
                    output.accept(EternalGeneralItems.BRITANNIA_SILVER_NUGGET);
                    output.accept(EternalGeneralItems.BRONZE_NUGGET);
                    output.accept(EternalGeneralItems.COBALT_NUGGET);
                    output.accept(EternalGeneralItems.CONSTANTAN_NUGGET);
                    output.accept(EternalGeneralItems.COPPER_NUGGET);
                    output.accept(EternalGeneralItems.ELECTRUM_NUGGET);
                    output.accept(EternalGeneralItems.ENDERIUM_NUGGET);
                    output.accept(EternalGeneralItems.GALLIUM_NUGGET);
                    output.accept(EternalGeneralItems.GRAPHITE_NUGGET);
                    output.accept(EternalGeneralItems.INVAR_NUGGET);
                    output.accept(EternalGeneralItems.LEAD_NUGGET);
                    output.accept(EternalGeneralItems.LUMIUM_NUGGET);
                    output.accept(EternalGeneralItems.NETHERITE_NUGGET);
                    output.accept(EternalGeneralItems.NICKEL_NUGGET);
                    output.accept(EternalGeneralItems.OSMIUM_NUGGET);
                    output.accept(EternalGeneralItems.PEWTER_NUGGET);
                    output.accept(EternalGeneralItems.PLATINUM_NUGGET);
                    output.accept(EternalGeneralItems.PLUTONIUM_NUGGET);
                    output.accept(EternalGeneralItems.ROSE_GOLD_NUGGET);
                    output.accept(EternalGeneralItems.SIGNALUM_NUGGET);
                    output.accept(EternalGeneralItems.SILVER_NUGGET);
                    output.accept(EternalGeneralItems.STEEL_NUGGET);
                    output.accept(EternalGeneralItems.TIN_NUGGET);
                    output.accept(EternalGeneralItems.TITANIUM_NUGGET);
                    output.accept(EternalGeneralItems.ULTIMATITANIUM_NUGGET);
                    output.accept(EternalGeneralItems.URANIUM_NUGGET);
                    output.accept(EternalGeneralItems.ZINC_NUGGET);
                    //GEMS
                    output.accept(EternalGeneralItems.GEM_AMBER);
                    output.accept(EternalGeneralItems.GEM_APATITE);
                    output.accept(EternalGeneralItems.GEM_CINNABAR);
                    output.accept(EternalGeneralItems.FLUORITE);
                    output.accept(EternalGeneralItems.GEM_NITER);
                    output.accept(EternalGeneralItems.GEM_ONYX);
                    output.accept(EternalGeneralItems.GEM_PERIDOT);
                    output.accept(EternalGeneralItems.GEM_RUBY);
                    output.accept(EternalGeneralItems.GEM_SAPPHIRE);
                    //GEM SHARDS W.I.P
                    output.accept(EternalGeneralItems.GEM_SAPPHIRE_SHARD);
                    output.accept(EternalGeneralItems.GEM_OBSIDIAN_SHARD);
                    //DUSTS
                    output.accept(EternalGeneralItems.ALUMINUM_DUST);
                    output.accept(EternalGeneralItems.AMBER_DUST);
                    output.accept(EternalGeneralItems.APATITE_DUST);
                    output.accept(EternalGeneralItems.BLUE_STEEL_DUST);
                    output.accept(EternalGeneralItems.BRASS_DUST);
                    output.accept(EternalGeneralItems.BRITANNIA_SILVER_DUST);
                    output.accept(EternalGeneralItems.BRONZE_DUST);
                    output.accept(EternalGeneralItems.COAL_DUST);
                    output.accept(EternalGeneralItems.COBALT_DUST);
                    output.accept(EternalGeneralItems.CONSTANTAN_DUST);
                    output.accept(EternalGeneralItems.COPPER_DUST);
                    output.accept(EternalGeneralItems.DIAMOND_DUST);
                    output.accept(EternalGeneralItems.ELECTRUM_DUST);
                    output.accept(EternalGeneralItems.EMERALD_DUST);
                    output.accept(EternalGeneralItems.ENDER_DUST);
                    output.accept(EternalGeneralItems.ENDERIUM_DUST);
                    output.accept(EternalGeneralItems.ENDSTONE_DUST);
                    output.accept(EternalGeneralItems.FLUORITE_DUST);
                    output.accept(EternalGeneralItems.GALLIUM_DUST);
                    output.accept(EternalGeneralItems.GOLD_DUST);
                    output.accept(EternalGeneralItems.GRAPHITE_DUST);
                    output.accept(EternalGeneralItems.INVAR_DUST);
                    output.accept(EternalGeneralItems.IRON_DUST);
                    output.accept(EternalGeneralItems.LAPIS_LAZULI_DUST);
                    output.accept(EternalGeneralItems.LEAD_DUST);
                    output.accept(EternalGeneralItems.LUMIUM_DUST);
                    output.accept(EternalGeneralItems.NETHERITE_DUST);
                    output.accept(EternalGeneralItems.NETHERRACK_DUST);
                    output.accept(EternalGeneralItems.NICKEL_DUST);
                    output.accept(EternalGeneralItems.NITER_DUST);
                    output.accept(EternalGeneralItems.OBSIDIAN_DUST);
                    output.accept(EternalGeneralItems.ONYX_DUST);
                    output.accept(EternalGeneralItems.OSMIUM_DUST);
                    output.accept(EternalGeneralItems.PERIDOT_DUST);
                    output.accept(EternalGeneralItems.PEWTER_DUST);
                    output.accept(EternalGeneralItems.PLATINUM_DUST);
                    output.accept(EternalGeneralItems.PLUTONIUM_DUST);
                    output.accept(EternalGeneralItems.QUARTZ_DUST);
                    output.accept(EternalGeneralItems.ROSE_GOLD_DUST);
                    output.accept(EternalGeneralItems.RUBY_DUST);
                    output.accept(EternalGeneralItems.SAPPHIRE_DUST);
                    output.accept(EternalGeneralItems.SIGNALUM_DUST);
                    output.accept(EternalGeneralItems.SILVER_DUST);
                    output.accept(EternalGeneralItems.SULFUR_DUST);
                    output.accept(EternalGeneralItems.STEEL_DUST);
                    output.accept(EternalGeneralItems.TIN_DUST);
                    output.accept(EternalGeneralItems.TITANIUM_DUST);
                    output.accept(EternalGeneralItems.ULTIMATITANIUM_DUST);
                    output.accept(EternalGeneralItems.URANIUM_DUST);
                    output.accept(EternalGeneralItems.ZINC_DUST);
                    //PLATES
                    output.accept(EternalGeneralItems.PLATE_ALUMINUM);
                    output.accept(EternalGeneralItems.PLATE_BLUE_STEEL);
                    output.accept(EternalGeneralItems.PLATE_BRASS);
                    output.accept(EternalGeneralItems.PLATE_BRONZE);
                    output.accept(EternalGeneralItems.PLATE_COBALT);
                    output.accept(EternalGeneralItems.PLATE_CONSTANTAN);
                    output.accept(EternalGeneralItems.PLATE_COPPER);
                    output.accept(EternalGeneralItems.PLATE_ELECTRUM);
                    output.accept(EternalGeneralItems.PLATE_ENDERIUM);
                    output.accept(EternalGeneralItems.PLATE_GALLIUM);
                    output.accept(EternalGeneralItems.PLATE_GOLD);
                    output.accept(EternalGeneralItems.PLATE_GRAPHITE);
                    output.accept(EternalGeneralItems.PLATE_INVAR);
                    output.accept(EternalGeneralItems.PLATE_IRON);
                    output.accept(EternalGeneralItems.PLATE_LEAD);
                    output.accept(EternalGeneralItems.PLATE_LUMIUM);
                    output.accept(EternalGeneralItems.PLATE_NETHERITE);
                    output.accept(EternalGeneralItems.PLATE_NICKEL);
                    output.accept(EternalGeneralItems.PLATE_OSMIUM);
                    output.accept(EternalGeneralItems.PLATE_PLATINUM);
                    output.accept(EternalGeneralItems.PLATE_PLUTONIUM);
                    output.accept(EternalGeneralItems.PLATE_ROSE_GOLD);
                    output.accept(EternalGeneralItems.PLATE_SAPPHIRE);
                    output.accept(EternalGeneralItems.PLATE_SIGNALUM);
                    output.accept(EternalGeneralItems.PLATE_SILVER);
                    output.accept(EternalGeneralItems.PLATE_STEEL);
                    output.accept(EternalGeneralItems.PLATE_TIN);
                    output.accept(EternalGeneralItems.PLATE_TITANIUM);
                    output.accept(EternalGeneralItems.PLATE_ULTIMATITANIUM);
                    output.accept(EternalGeneralItems.PLATE_URANIUM);
                    output.accept(EternalGeneralItems.PLATE_ZINC);
                    //RODS
                    output.accept(EternalGeneralItems.ROD_ALUMINUM);
                    output.accept(EternalGeneralItems.ROD_BLUE_STEEL);
                    output.accept(EternalGeneralItems.ROD_BRASS);
                    output.accept(EternalGeneralItems.ROD_BRONZE);
                    output.accept(EternalGeneralItems.ROD_COBALT);
                    output.accept(EternalGeneralItems.ROD_CONSTANTAN);
                    output.accept(EternalGeneralItems.ROD_COPPER);
                    output.accept(EternalGeneralItems.ROD_DIAMOND);
                    output.accept(EternalGeneralItems.ROD_ELECTRUM);
                    output.accept(EternalGeneralItems.ROD_ENDERIUM);
                    output.accept(EternalGeneralItems.ROD_GALLIUM);
                    output.accept(EternalGeneralItems.ROD_GOLD);
                    output.accept(EternalGeneralItems.ROD_GRAPHITE);
                    output.accept(EternalGeneralItems.ROD_INVAR);
                    output.accept(EternalGeneralItems.ROD_IRON);
                    output.accept(EternalGeneralItems.ROD_LEAD);
                    output.accept(EternalGeneralItems.ROD_LUMIUM);
                    output.accept(EternalGeneralItems.ROD_NETHERITE);
                    output.accept(EternalGeneralItems.ROD_NICKEL);
                    output.accept(EternalGeneralItems.ROD_OSMIUM);
                    output.accept(EternalGeneralItems.ROD_PLATINUM);
                    output.accept(EternalGeneralItems.ROD_PLUTONIUM);
                    output.accept(EternalGeneralItems.ROD_ROSE_GOLD);
                    output.accept(EternalGeneralItems.ROD_SAPPHIRE);
                    output.accept(EternalGeneralItems.ROD_SIGNALUM);
                    output.accept(EternalGeneralItems.ROD_SILVER);
                    output.accept(EternalGeneralItems.ROD_STEEL);
                    output.accept(EternalGeneralItems.ROD_TIN);
                    output.accept(EternalGeneralItems.ROD_TITANIUM);
                    output.accept(EternalGeneralItems.ROD_ULTIMATITANIUM);
                    output.accept(EternalGeneralItems.ROD_URANIUM);
                    output.accept(EternalGeneralItems.ROD_ZINC);
                    //GEARS
                    output.accept(EternalGeneralItems.GEAR_ALUMINUM);
                    output.accept(EternalGeneralItems.GEAR_BRONZE);
                    output.accept(EternalGeneralItems.GEAR_COPPER);
                    output.accept(EternalGeneralItems.GEAR_DIAMOND);
                    output.accept(EternalGeneralItems.GEAR_ENDERIUM);
                    output.accept(EternalGeneralItems.GEAR_GOLD);
                    output.accept(EternalGeneralItems.GEAR_IRON);
                    output.accept(EternalGeneralItems.GEAR_LEAD);
                    output.accept(EternalGeneralItems.GEAR_OSMIUM);
                    output.accept(EternalGeneralItems.GEAR_STEEL);
                    output.accept(EternalGeneralItems.GEAR_TIN);
                    output.accept(EternalGeneralItems.ULTIMATE_GEAR);
                    //TOOLS
                    output.accept(EternalGeneralItems.COBALT_HAMMER);
                    output.accept(EternalGeneralItems.COPPER_HAMMER);
                    output.accept(EternalGeneralItems.DIAMOND_HAMMER);
                    output.accept(EternalGeneralItems.IRON_HAMMER);
                    output.accept(EternalGeneralItems.STONE_HAMMER);
                    output.accept(EternalGeneralItems.IRON_GEM_CUTTER);
                    //CREATE COMPAT ITEMS W.I.P
                    //MEK COMPAT ITEMS W.I.P
                }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
