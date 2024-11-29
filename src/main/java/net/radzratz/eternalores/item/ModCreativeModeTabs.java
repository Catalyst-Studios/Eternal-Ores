package net.radzratz.eternalores.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EternalOres.MOD_ID);

//Eternal Items Tab
public static final Supplier<CreativeModeTab> ETERNAL_ORES = CREATIVE_MODE_TAB.register("eternal_ores_tab",
        ()-> CreativeModeTab.builder().icon(()-> new ItemStack(Moditems.ETERNAL_DARK_INGOT.get()))
                .withTabsBefore(ResourceLocation.fromNamespaceAndPath(EternalOres.MOD_ID, "eternal_ores"))
                .title(Component.translatable("creativetab.eternalores.eternal_ores"))
                .displayItems((itemDisplayParameters, output) -> {
                    //STONE ORES
                    output.accept(ModBlocks.ALUMINUM_ORE_BLOCK);
                    output.accept(ModBlocks.AMBER_ORE_BLOCK);
                    output.accept(ModBlocks.APATITE_ORE_BLOCK);
                    output.accept(ModBlocks.CINNABAR_ORE_BLOCK);
                    output.accept(ModBlocks.COBALT_ORE_BLOCK);
                    output.accept(ModBlocks.FLUORITE_ORE_BLOCK);
                    output.accept(ModBlocks.GALLIUM_ORE_BLOCK);
                    output.accept(ModBlocks.LEAD_ORE_BLOCK);
                    output.accept(ModBlocks.NICKEL_ORE_BLOCK);
                    output.accept(ModBlocks.NITER_ORE_BLOCK);
                    output.accept(ModBlocks.ONYX_ORE_BLOCK);
                    output.accept(ModBlocks.OSMIUM_ORE_BLOCK);
                    output.accept(ModBlocks.PERIDOT_ORE_BLOCK);
                    output.accept(ModBlocks.PLATINUM_ORE_BLOCK);
                    output.accept(ModBlocks.PLUTONIUM_ORE_BLOCK);
                    output.accept(ModBlocks.RUBY_ORE_BLOCK);
                    output.accept(ModBlocks.SAPPHIRE_ORE_BLOCK);
                    output.accept(ModBlocks.SILVER_ORE_BLOCK);
                    output.accept(ModBlocks.SULFUR_ORE_BLOCK);
                    output.accept(ModBlocks.TIN_ORE_BLOCK);
                    output.accept(ModBlocks.URANIUM_ORE_BLOCK);
                    output.accept(ModBlocks.ZINC_ORE_BLOCK);
                    //DEEPSLATE ORES
                    output.accept(ModBlocks.DEEPSLATE_ALUMINUM_ORE_BLOCK);
                    output.accept(ModBlocks.DEEPSLATE_AMBER_ORE_BLOCK);
                    output.accept(ModBlocks.DEEPSLATE_APATITE_ORE_BLOCK);
                    output.accept(ModBlocks.DEEPSLATE_CINNABAR_ORE_BLOCK);
                    output.accept(ModBlocks.DEEPSLATE_COBALT_ORE_BLOCK);
                    output.accept(ModBlocks.DEEPSLATE_FLUORITE_ORE_BLOCK);
                    output.accept(ModBlocks.DEEPSLATE_GALLIUM_ORE_BLOCK);
                    output.accept(ModBlocks.DEEPSLATE_LEAD_ORE_BLOCK);
                    output.accept(ModBlocks.DEEPSLATE_NICKEL_ORE_BLOCK);
                    output.accept(ModBlocks.DEEPSLATE_NITER_ORE_BLOCK);
                    output.accept(ModBlocks.DEEPSLATE_ONYX_ORE_BLOCK);
                    output.accept(ModBlocks.DEEPSLATE_OSMIUM_ORE_BLOCK);
                    output.accept(ModBlocks.DEEPSLATE_PERIDOT_ORE_BLOCK);
                    output.accept(ModBlocks.DEEPSLATE_PLATINUM_ORE_BLOCK);
                    output.accept(ModBlocks.DEEPSLATE_PLUTONIUM_ORE_BLOCK);
                    output.accept(ModBlocks.DEEPSLATE_RUBY_ORE_BLOCK);
                    output.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCK);
                    output.accept(ModBlocks.DEEPSLATE_SILVER_ORE_BLOCK);
                    output.accept(ModBlocks.DEEPSLATE_SULFUR_ORE_BLOCK);
                    output.accept(ModBlocks.DEEPSLATE_TIN_ORE_BLOCK);
                    output.accept(ModBlocks.DEEPSLATE_URANIUM_ORE_BLOCK);
                    output.accept(ModBlocks.DEEPSLATE_ZINC_ORE_BLOCK);
                    //NETHER ORES W.I.P
                    //END ORES W.I.P
                    //RAW ORE BLOCKS
                    output.accept(ModBlocks.RAW_ALUMINUM_BLOCK);
                    output.accept(ModBlocks.RAW_COBALT_BLOCK);
                    output.accept(ModBlocks.RAW_GALLIUM_BLOCK);
                    output.accept(ModBlocks.RAW_LEAD_BLOCK);
                    output.accept(ModBlocks.RAW_NICKEL_BLOCK);
                    output.accept(ModBlocks.RAW_OSMIUM_BLOCK);
                    output.accept(ModBlocks.RAW_PLATINUM_BLOCK);
                    output.accept(ModBlocks.RAW_PLUTONIUM_BLOCK);
                    output.accept(ModBlocks.RAW_SILVER_BLOCK);
                    output.accept(ModBlocks.SULFUR_BLOCK);
                    output.accept(ModBlocks.RAW_TIN_BLOCK);
                    output.accept(ModBlocks.RAW_URANIUM_BLOCK);
                    output.accept(ModBlocks.RAW_ZINC_BLOCK);
                    //METAL AND GEM BLOCKS
                    output.accept(ModBlocks.ALUMINUM_BLOCK);
                    output.accept(ModBlocks.AMBER_BLOCK);
                    output.accept(ModBlocks.APATITE_BLOCK);
                    output.accept(ModBlocks.BLUE_STEEL_BLOCK);
                    output.accept(ModBlocks.BRASS_BLOCK);
                    output.accept(ModBlocks.BRONZE_BLOCK);
                    output.accept(ModBlocks.CINNABAR_BLOCK);
                    output.accept(ModBlocks.COBALT_BLOCK);
                    output.accept(ModBlocks.CONSTANTAN_BLOCK);
                    output.accept(ModBlocks.ELECTRUM_BLOCK);
                    output.accept(ModBlocks.ENDERIUM_BLOCK);
                    output.accept(ModBlocks.FLUORITE_BLOCK);
                    output.accept(ModBlocks.GALLIUM_BLOCK);
                    output.accept(ModBlocks.GRAPHITE_BLOCK);
                    output.accept(ModBlocks.INVAR_BLOCK);
                    output.accept(ModBlocks.LEAD_BLOCK);
                    output.accept(ModBlocks.LUMIUM_BLOCK);
                    output.accept(ModBlocks.NICKEL_BLOCK);
                    output.accept(ModBlocks.NITER_BLOCK);
                    output.accept(ModBlocks.ONYX_BLOCK);
                    output.accept(ModBlocks.OSMIUM_BLOCK);
                    output.accept(ModBlocks.PERIDOT_BLOCK);
                    output.accept(ModBlocks.PLATINUM_BLOCK);
                    output.accept(ModBlocks.PLUTONIUM_BLOCK);
                    output.accept(ModBlocks.RUBY_BLOCK);
                    output.accept(ModBlocks.SAPPHIRE_BLOCK);
                    output.accept(ModBlocks.SIGNALUM_BLOCK);
                    output.accept(ModBlocks.SILVER_BLOCK);
                    output.accept(ModBlocks.STEEL_BLOCK);
                    output.accept(ModBlocks.TIN_BLOCK);
                    output.accept(ModBlocks.TITANIUM_BLOCK);
                    output.accept(ModBlocks.ULTIMATITANIUM_BLOCK);
                    output.accept(ModBlocks.URANIUM_BLOCK);
                    output.accept(ModBlocks.ZINC_BLOCK);
                    //RAW ORES
                    output.accept(Moditems.RAW_ALUMINUM);
                    output.accept(Moditems.RAW_COBALT);
                    output.accept(Moditems.RAW_GALLIUM);
                    output.accept(Moditems.RAW_LEAD);
                    output.accept(Moditems.RAW_NICKEL);
                    output.accept(Moditems.RAW_OSMIUM);
                    output.accept(Moditems.RAW_PLATINUM);
                    output.accept(Moditems.RAW_PLUTONIUM);
                    output.accept(Moditems.RAW_SILVER);
                    output.accept(Moditems.SULFUR);
                    output.accept(Moditems.RAW_TIN);
                    output.accept(Moditems.RAW_ULTIMATITANIUM);
                    output.accept(Moditems.RAW_URANIUM);
                    output.accept(Moditems.RAW_ZINC);
                    //INGOTS
                    output.accept(Moditems.ALUMINUM_INGOT);
                    output.accept(Moditems.BLUE_STEEL_INGOT);
                    output.accept(Moditems.BRASS_INGOT);
                    output.accept(Moditems.BRONZE_INGOT);
                    output.accept(Moditems.COBALT_INGOT);
                    output.accept(Moditems.CONSTANTAN_INGOT);
                    output.accept(Moditems.ELECTRUM_INGOT);
                    output.accept(Moditems.ETERNAL_DARK_INGOT);
                    output.accept(Moditems.ETERNAL_LIGHT_INGOT);
                    output.accept(Moditems.ENDERIUM_INGOT);
                    output.accept(Moditems.GALLIUM_INGOT);
                    output.accept(Moditems.GRAPHITE_INGOT);
                    output.accept(Moditems.INVAR_INGOT);
                    output.accept(Moditems.LEAD_INGOT);
                    output.accept(Moditems.LUMIUM_INGOT);
                    output.accept(Moditems.NICKEL_INGOT);
                    output.accept(Moditems.OSMIUM_INGOT);
                    output.accept(Moditems.PLATINUM_INGOT);
                    output.accept(Moditems.PLUTONIUM_INGOT);
                    output.accept(Moditems.REDSTONE_INGOT);
                    output.accept(Moditems.SIGNALUM_INGOT);
                    output.accept(Moditems.SILVER_INGOT);
                    output.accept(Moditems.STEEL_INGOT);
                    output.accept(Moditems.TIN_INGOT);
                    output.accept(Moditems.TITANIUM_INGOT);
                    output.accept(Moditems.ULTIMATITANIUM_INGOT);
                    output.accept(Moditems.URANIUM_INGOT);
                    output.accept(Moditems.ZINC_INGOT);
                    //NUGGETS
                    output.accept(Moditems.ALUMINUM_NUGGET);
                    output.accept(Moditems.BLUE_STEEL_NUGGET);
                    output.accept(Moditems.BRASS_NUGGET);
                    output.accept(Moditems.BRONZE_NUGGET);
                    output.accept(Moditems.COBALT_NUGGET);
                    output.accept(Moditems.CONSTANTAN_NUGGET);
                    output.accept(Moditems.COPPER_NUGGET);
                    output.accept(Moditems.ELECTRUM_NUGGET);
                    output.accept(Moditems.ENDERIUM_NUGGET);
                    output.accept(Moditems.GALLIUM_NUGGET);
                    output.accept(Moditems.GRAPHITE_NUGGET);
                    output.accept(Moditems.INVAR_NUGGET);
                    output.accept(Moditems.LEAD_NUGGET);
                    output.accept(Moditems.LUMIUM_NUGGET);
                    output.accept(Moditems.NETHERITE_NUGGET);
                    output.accept(Moditems.NICKEL_NUGGET);
                    output.accept(Moditems.OSMIUM_NUGGET);
                    output.accept(Moditems.PLATINUM_NUGGET);
                    output.accept(Moditems.PLUTONIUM_NUGGET);
                    output.accept(Moditems.SIGNALUM_NUGGET);
                    output.accept(Moditems.SILVER_NUGGET);
                    output.accept(Moditems.STEEL_NUGGET);
                    output.accept(Moditems.TIN_NUGGET);
                    output.accept(Moditems.TITANIUM_NUGGET);
                    output.accept(Moditems.ULTIMATITANIUM_NUGGET);
                    output.accept(Moditems.URANIUM_NUGGET);
                    output.accept(Moditems.ZINC_NUGGET);
                    //GEMS
                    output.accept(Moditems.GEM_AMBER);
                    output.accept(Moditems.GEM_APATITE);
                    output.accept(Moditems.GEM_CINNABAR);
                    output.accept(Moditems.FLUORITE);
                    output.accept(Moditems.GEM_NITER);
                    output.accept(Moditems.GEM_ONYX);
                    output.accept(Moditems.GEM_PERIDOT);
                    output.accept(Moditems.GEM_RUBY);
                    output.accept(Moditems.GEM_SAPPHIRE);
                    //GEM SHARDS W.I.P
                    output.accept(Moditems.GEM_SAPPHIRE_SHARD);
                    output.accept(Moditems.GEM_OBSIDIAN_SHARD);
                    //DUSTS
                    output.accept(Moditems.ALUMINUM_DUST);
                    output.accept(Moditems.AMBER_DUST);
                    output.accept(Moditems.APATITE_DUST);
                    output.accept(Moditems.BLUE_STEEL_DUST);
                    output.accept(Moditems.BRASS_DUST);
                    output.accept(Moditems.BRONZE_DUST);
                    output.accept(Moditems.COAL_DUST);
                    output.accept(Moditems.COBALT_DUST);
                    output.accept(Moditems.CONSTANTAN_DUST);
                    output.accept(Moditems.COPPER_DUST);
                    output.accept(Moditems.DIAMOND_DUST);
                    output.accept(Moditems.ELECTRUM_DUST);
                    output.accept(Moditems.EMERALD_DUST);
                    output.accept(Moditems.ENDER_DUST);
                    output.accept(Moditems.ENDERIUM_DUST);
                    output.accept(Moditems.FLUORITE_DUST);
                    output.accept(Moditems.GALLIUM_DUST);
                    output.accept(Moditems.GOLD_DUST);
                    output.accept(Moditems.GRAPHITE_DUST);
                    output.accept(Moditems.INVAR_DUST);
                    output.accept(Moditems.IRON_DUST);
                    output.accept(Moditems.LAPIS_LAZULI_DUST);
                    output.accept(Moditems.LEAD_DUST);
                    output.accept(Moditems.LUMIUM_DUST);
                    output.accept(Moditems.NETHERITE_DUST);
                    output.accept(Moditems.NICKEL_DUST);
                    output.accept(Moditems.NITER_DUST);
                    output.accept(Moditems.OBSIDIAN_DUST);
                    output.accept(Moditems.ONYX_DUST);
                    output.accept(Moditems.OSMIUM_DUST);
                    output.accept(Moditems.PERIDOT_DUST);
                    output.accept(Moditems.PLATINUM_DUST);
                    output.accept(Moditems.PLUTONIUM_DUST);
                    output.accept(Moditems.QUARTZ_DUST);
                    output.accept(Moditems.RUBY_DUST);
                    output.accept(Moditems.SAPPHIRE_DUST);
                    output.accept(Moditems.SIGNALUM_DUST);
                    output.accept(Moditems.SILVER_DUST);
                    output.accept(Moditems.SULFUR_DUST);
                    output.accept(Moditems.STEEL_DUST);
                    output.accept(Moditems.TIN_DUST);
                    output.accept(Moditems.TITANIUM_DUST);
                    output.accept(Moditems.ULTIMATITANIUM_DUST);
                    output.accept(Moditems.URANIUM_DUST);
                    output.accept(Moditems.ZINC_DUST);
                    //PLATES
                    output.accept(Moditems.PLATE_ALUMINUM);
                    output.accept(Moditems.PLATE_BLUE_STEEL);
                    output.accept(Moditems.PLATE_BRASS);
                    output.accept(Moditems.PLATE_BRONZE);
                    output.accept(Moditems.PLATE_COBALT);
                    output.accept(Moditems.PLATE_CONSTANTAN);
                    output.accept(Moditems.PLATE_COPPER);
                    output.accept(Moditems.PLATE_ELECTRUM);
                    output.accept(Moditems.PLATE_ENDERIUM);
                    output.accept(Moditems.PLATE_GALLIUM);
                    output.accept(Moditems.PLATE_GOLD);
                    output.accept(Moditems.PLATE_GRAPHITE);
                    output.accept(Moditems.PLATE_INVAR);
                    output.accept(Moditems.PLATE_IRON);
                    output.accept(Moditems.PLATE_LEAD);
                    output.accept(Moditems.PLATE_LUMIUM);
                    output.accept(Moditems.PLATE_NETHERITE);
                    output.accept(Moditems.PLATE_NICKEL);
                    output.accept(Moditems.PLATE_OSMIUM);
                    output.accept(Moditems.PLATE_PLATINUM);
                    output.accept(Moditems.PLATE_PLUTONIUM);
                    output.accept(Moditems.PLATE_SAPPHIRE);
                    output.accept(Moditems.PLATE_SIGNALUM);
                    output.accept(Moditems.PLATE_SILVER);
                    output.accept(Moditems.PLATE_STEEL);
                    output.accept(Moditems.PLATE_TIN);
                    output.accept(Moditems.PLATE_TITANIUM);
                    output.accept(Moditems.PLATE_ULTIMATITANIUM);
                    output.accept(Moditems.PLATE_URANIUM);
                    output.accept(Moditems.PLATE_ZINC);
                    //RODS
                    output.accept(Moditems.ROD_ALUMINUM);
                    output.accept(Moditems.ROD_BLUE_STEEL);
                    output.accept(Moditems.ROD_BRASS);
                    output.accept(Moditems.ROD_BRONZE);
                    output.accept(Moditems.ROD_COBALT);
                    output.accept(Moditems.ROD_CONSTANTAN);
                    output.accept(Moditems.ROD_COPPER);
                    output.accept(Moditems.ROD_ELECTRUM);
                    output.accept(Moditems.ROD_ENDERIUM);
                    output.accept(Moditems.ROD_GALLIUM);
                    output.accept(Moditems.ROD_GOLD);
                    output.accept(Moditems.ROD_GRAPHITE);
                    output.accept(Moditems.ROD_INVAR);
                    output.accept(Moditems.ROD_IRON);
                    output.accept(Moditems.ROD_LEAD);
                    output.accept(Moditems.ROD_LUMIUM);
                    output.accept(Moditems.ROD_NETHERITE);
                    output.accept(Moditems.ROD_NICKEL);
                    output.accept(Moditems.ROD_OSMIUM);
                    output.accept(Moditems.ROD_PLATINUM);
                    output.accept(Moditems.ROD_PLUTONIUM);
                    output.accept(Moditems.ROD_SAPPHIRE);
                    output.accept(Moditems.ROD_SIGNALUM);
                    output.accept(Moditems.ROD_SILVER);
                    output.accept(Moditems.ROD_STEEL);
                    output.accept(Moditems.ROD_TIN);
                    output.accept(Moditems.ROD_TITANIUM);
                    output.accept(Moditems.ROD_ULTIMATITANIUM);
                    output.accept(Moditems.ROD_URANIUM);
                    output.accept(Moditems.ROD_ZINC);
                    //GEARS W.I.P
                    output.accept(Moditems.ULTIMATE_GEAR);
                    //TOOLS
                    output.accept(Moditems.COBALT_HAMMER);
                    output.accept(Moditems.COPPER_HAMMER);
                    output.accept(Moditems.DIAMOND_HAMMER);
                    output.accept(Moditems.IRON_HAMMER);
                    output.accept(Moditems.STONE_HAMMER);
                    output.accept(Moditems.IRON_GEM_CUTTER);
                    //CREATE COMPAT ITEMS W.I.P
                    //MEK COMPAT ITEMS W.I.P
                }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
