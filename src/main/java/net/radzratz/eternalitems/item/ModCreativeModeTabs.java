package net.radzratz.eternalitems.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.radzratz.eternalitems.EternalItems;
import net.radzratz.eternalitems.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EternalItems.MOD_ID);

//INGOTS
    public static final Supplier<CreativeModeTab> ETERNAL_INGOTS_TAB = CREATIVE_MODE_TAB.register("eternal_ingots_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(Moditems.ETERNAL_DARK_INGOT.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(EternalItems.MOD_ID, "eternal_items_tab"))
                    .title(Component.translatable("creativetab.eternalitems.eternal_ingots"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Moditems.ALUMINUM_INGOT);
                        output.accept(Moditems.BRASS_INGOT);
                        output.accept(Moditems.BRONZE_INGOT);
                        output.accept(Moditems.COBALT_INGOT);
                        output.accept(Moditems.CONSTANTAN_INGOT);
                        output.accept(Moditems.ELECTRUM_INGOT);
                        output.accept(Moditems.ETERNAL_DARK_INGOT);
                        output.accept(Moditems.ETERNAL_LIGHT_INGOT);
                        output.accept(Moditems.ENDERIUM_INGOT);
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
                        output.accept(Moditems.ULTIMATITANIUM_INGOT);
                        output.accept(Moditems.URANIUM_INGOT);
                        output.accept(Moditems.ZINC_INGOT);
                    }).build());
//NUGGETS
    public static final Supplier<CreativeModeTab> ETERNAL_NUGGETS_TAB = CREATIVE_MODE_TAB.register("eternal_nuggets_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(Moditems.OSMIUM_NUGGET.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(EternalItems.MOD_ID, "eternal_items_tab"))
                    .title(Component.translatable("creativetab.eternalitems.eternal_nuggets"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Moditems.ALUMINUM_NUGGET);
                        output.accept(Moditems.BRASS_NUGGET);
                        output.accept(Moditems.BRONZE_NUGGET);
                        output.accept(Moditems.COBALT_NUGGET);
                        output.accept(Moditems.CONSTANTAN_NUGGET);
                        output.accept(Moditems.COPPER_NUGGET);
                        output.accept(Moditems.ELECTRUM_NUGGET);
                        output.accept(Moditems.ENDERIUM_NUGGET);
                        output.accept(Moditems.GRAPHITE_NUGGET);
                        output.accept(Moditems.INVAR_NUGGET);
                        output.accept(Moditems.LEAD_NUGGET);
                        output.accept(Moditems.LUMIUM_NUGGET);
                        output.accept(Moditems.NICKEL_NUGGET);
                        output.accept(Moditems.OSMIUM_NUGGET);
                        output.accept(Moditems.PLATINUM_NUGGET);
                        output.accept(Moditems.PLUTONIUM_NUGGET);
                        output.accept(Moditems.SIGNALUM_NUGGET);
                        output.accept(Moditems.SILVER_NUGGET);
                        output.accept(Moditems.TIN_NUGGET);
                        output.accept(Moditems.ULTIMATITANIUM_NUGGET);
                        output.accept(Moditems.URANIUM_NUGGET);
                        output.accept(Moditems.ZINC_NUGGET);
                    }).build());
//RODS
    public static final Supplier<CreativeModeTab> ETERNAL_RODS_TAB = CREATIVE_MODE_TAB.register("eternal_rods_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(Moditems.ROD_OSMIUM.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(EternalItems.MOD_ID, "eternal_items_tab"))
                    .title(Component.translatable("creativetab.eternalitems.eternal_rods"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Moditems.ROD_ALUMINUM);
                        output.accept(Moditems.ROD_BRASS);
                        output.accept(Moditems.ROD_BRONZE);
                        output.accept(Moditems.ROD_COBALT);
                        output.accept(Moditems.ROD_CONSTANTAN);
                        output.accept(Moditems.ROD_COPPER);
                        output.accept(Moditems.ROD_ELECTRUM);
                        output.accept(Moditems.ROD_ENDERIUM);
                        output.accept(Moditems.ROD_GOLD);
                        output.accept(Moditems.ROD_GRAPHITE);
                        output.accept(Moditems.ROD_INVAR);
                        output.accept(Moditems.ROD_IRON);
                        output.accept(Moditems.ROD_LEAD);
                        output.accept(Moditems.ROD_LUMIUM);
                        output.accept(Moditems.ROD_NICKEL);
                        output.accept(Moditems.ROD_OSMIUM);
                        output.accept(Moditems.ROD_PLATINUM);
                        output.accept(Moditems.ROD_PLUTONIUM);
                        output.accept(Moditems.ROD_SIGNALUM);
                        output.accept(Moditems.ROD_SILVER);
                        output.accept(Moditems.ROD_TIN);
                        output.accept(Moditems.ROD_ULTIMATITANIUM);
                        output.accept(Moditems.ROD_URANIUM);
                        output.accept(Moditems.ROD_ZINC);
                    }).build());
//PLATES
    public static final Supplier<CreativeModeTab> ETERNAL_PLATES_TAB = CREATIVE_MODE_TAB.register("eternal_plates_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(Moditems.PLATE_OSMIUM.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(EternalItems.MOD_ID, "eternal_items_tab"))
                    .title(Component.translatable("creativetab.eternalitems.eternal_plates"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Moditems.PLATE_ALUMINUM);
                        output.accept(Moditems.PLATE_BRASS);
                        output.accept(Moditems.PLATE_BRONZE);
                        output.accept(Moditems.PLATE_COBALT);
                        output.accept(Moditems.PLATE_CONSTANTAN);
                        output.accept(Moditems.PLATE_COPPER);
                        output.accept(Moditems.PLATE_ELECTRUM);
                        output.accept(Moditems.PLATE_ENDERIUM);
                        output.accept(Moditems.PLATE_GOLD);
                        output.accept(Moditems.PLATE_GRAPHITE);
                        output.accept(Moditems.PLATE_INVAR);
                        output.accept(Moditems.PLATE_IRON);
                        output.accept(Moditems.PLATE_LEAD);
                        output.accept(Moditems.PLATE_LUMIUM);
                        output.accept(Moditems.PLATE_NICKEL);
                        output.accept(Moditems.PLATE_OSMIUM);
                        output.accept(Moditems.PLATE_PLATINUM);
                        output.accept(Moditems.PLATE_PLUTONIUM);
                        output.accept(Moditems.PLATE_SIGNALUM);
                        output.accept(Moditems.PLATE_SILVER);
                        output.accept(Moditems.PLATE_TIN);
                        output.accept(Moditems.PLATE_ULTIMATITANIUM);
                        output.accept(Moditems.PLATE_URANIUM);
                        output.accept(Moditems.PLATE_ZINC);
                    }).build());
//GEARS
    public static final Supplier<CreativeModeTab> ETERNAL_GEARS_TAB = CREATIVE_MODE_TAB.register("eternal_gears_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(Moditems.ULTIMATE_GEAR.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(EternalItems.MOD_ID, "eternal_items_tab"))
                    .title(Component.translatable("creativetab.eternalitems.eternal_gears"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Moditems.ULTIMATE_GEAR);
                    }).build());
//RAW ORES
    public static final Supplier<CreativeModeTab> ETERNAL_RAW_ORES_TAB = CREATIVE_MODE_TAB.register("eternal_raw_ores_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(Moditems.RAW_URANIUM.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(EternalItems.MOD_ID, "eternal_items_tab"))
                    .title(Component.translatable("creativetab.eternalitems.eternal_raw_ores"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Moditems.RAW_ALUMINUM);
                        output.accept(Moditems.RAW_COBALT);
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
                    }).build());
//ORE DUST
    public static final Supplier<CreativeModeTab> ETERNAL_ORE_DUST_TAB = CREATIVE_MODE_TAB.register("eternal_ore_dust_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(Moditems.OSMIUM_DUST.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(EternalItems.MOD_ID, "eternal_items_tab"))
                    .title(Component.translatable("creativetab.eternalitems.eternal_ore_dust"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Moditems.ALUMINUM_DUST);
                        output.accept(Moditems.BRASS_DUST);
                        output.accept(Moditems.BRONZE_DUST);
                        output.accept(Moditems.COBALT_DUST);
                        output.accept(Moditems.CONSTANTAN_DUST);
                        output.accept(Moditems.COPPER_DUST);
                        output.accept(Moditems.ELECTRUM_DUST);
                        output.accept(Moditems.ENDER_DUST);
                        output.accept(Moditems.ENDERIUM_DUST);
                        output.accept(Moditems.FLUORITE_DUST);
                        output.accept(Moditems.GOLD_DUST);
                        output.accept(Moditems.INVAR_DUST);
                        output.accept(Moditems.IRON_DUST);
                        output.accept(Moditems.LEAD_DUST);
                        output.accept(Moditems.LUMIUM_DUST);
                        output.accept(Moditems.NICKEL_DUST);
                        output.accept(Moditems.OSMIUM_DUST);
                        output.accept(Moditems.PLATINUM_DUST);
                        output.accept(Moditems.PLUTONIUM_DUST);
                        output.accept(Moditems.SIGNALUM_DUST);
                        output.accept(Moditems.SILVER_DUST);
                        output.accept(Moditems.SULFUR_DUST);
                        output.accept(Moditems.TIN_DUST);
                        output.accept(Moditems.ULTIMATITANIUM_DUST);
                        output.accept(Moditems.URANIUM_DUST);
                        output.accept(Moditems.ZINC_DUST);
                    }).build());
//GEMS
    public static final Supplier<CreativeModeTab> ETERNAL_GEMS = CREATIVE_MODE_TAB.register("eternal_gems_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(Moditems.GEM_SAPPHIRE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(EternalItems.MOD_ID, "eternal_items_tabs"))
                    .title(Component.translatable("creativetab.eternalitems.eternal_gems"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Moditems.FLUORITE);
                        output.accept(Moditems.GEM_OBSIDIAN_SHARD);
                        output.accept(Moditems.GEM_ONYX);
                        output.accept(Moditems.GEM_RUBY);
                        output.accept(Moditems.GEM_PERIDOT);
                        output.accept(Moditems.GEM_SAPPHIRE);
                    }).build());
////BLOCKS
//ORE BLOCKS
    public static final Supplier<CreativeModeTab> ETERNAL_ORE_BLOCKS = CREATIVE_MODE_TAB.register("eternal_ore_blocks",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModBlocks.URANIUM_ORE_BLOCK.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(EternalItems.MOD_ID, "eternal_items_tab"))
                    .title(Component.translatable("creativetab.eternalitems.eternal_ore_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.ALUMINUM_ORE_BLOCK);
                        output.accept(ModBlocks.COBALT_ORE_BLOCK);
                        output.accept(ModBlocks.FLUORITE_ORE_BLOCK);
                        output.accept(ModBlocks.LEAD_ORE_BLOCK);
                        output.accept(ModBlocks.NICKEL_ORE_BLOCK);
                        output.accept(ModBlocks.URANIUM_ORE_BLOCK);
                        output.accept(ModBlocks.OSMIUM_ORE_BLOCK);
                        output.accept(ModBlocks.PLATINUM_ORE_BLOCK);
                        output.accept(ModBlocks.PLUTONIUM_ORE_BLOCK);
                        output.accept(ModBlocks.SILVER_ORE_BLOCK);
                        output.accept(ModBlocks.SULFUR_ORE_BLOCK);
                        output.accept(ModBlocks.TIN_ORE_BLOCK);
                        output.accept(ModBlocks.DEEPSLATE_ALUMINUM_ORE_BLOCK);
                        output.accept(ModBlocks.DEEPSLATE_COBALT_ORE_BLOCK);
                        output.accept(ModBlocks.DEEPSLATE_FLUORITE_ORE_BLOCK);
                        output.accept(ModBlocks.DEEPSLATE_LEAD_ORE_BLOCK);
                        output.accept(ModBlocks.DEEPSLATE_NICKEL_ORE_BLOCK);
                        output.accept(ModBlocks.DEEPSLATE_OSMIUM_ORE_BLOCK);
                        output.accept(ModBlocks.DEEPSLATE_PLATINUM_ORE_BLOCK);
                        output.accept(ModBlocks.DEEPSLATE_PLUTONIUM_ORE_BLOCK);
                        output.accept(ModBlocks.DEEPSLATE_SILVER_ORE_BLOCK);
                        output.accept(ModBlocks.DEEPSLATE_SULFUR_ORE_BLOCK);
                        output.accept(ModBlocks.DEEPSLATE_TIN_ORE_BLOCK);
                        output.accept(ModBlocks.DEEPSLATE_URANIUM_ORE_BLOCK);
                    }).build());
//METAL BLOCKS
public static final Supplier<CreativeModeTab> ETERNAL_BLOCKS = CREATIVE_MODE_TAB.register("eternal_blocks",
        ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModBlocks.OSMIUM_BLOCK.get()))
                .withTabsBefore(ResourceLocation.fromNamespaceAndPath(EternalItems.MOD_ID, "eternal_items_tab"))
                .title(Component.translatable("creativetab.eternalitems.eternal_blocks"))
                .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.ALUMINUM_BLOCK);
                        output.accept(ModBlocks.BRASS_BLOCK);
                        output.accept(ModBlocks.BRONZE_BLOCK);
                        output.accept(ModBlocks.COBALT_BLOCK);
                        output.accept(ModBlocks.CONSTANTAN_BLOCK);
                        output.accept(ModBlocks.ELECTRUM_BLOCK);
                        output.accept(ModBlocks.ENDERIUM_BLOCK);
                        output.accept(ModBlocks.INVAR_BLOCK);
                        output.accept(ModBlocks.LEAD_BLOCK);
                        output.accept(ModBlocks.LUMIUM_BLOCK);
                        output.accept(ModBlocks.NICKEL_BLOCK);
                        output.accept(ModBlocks.OSMIUM_BLOCK);
                        output.accept(ModBlocks.PLATINUM_BLOCK);
                        output.accept(ModBlocks.PLUTONIUM_BLOCK);
                        output.accept(ModBlocks.SILVER_BLOCK);
                        output.accept(ModBlocks.SIGNALUM_BLOCK);
                        output.accept(ModBlocks.TIN_BLOCK);
                        output.accept(ModBlocks.ULTIMATITANIUM_BLOCK);
                        output.accept(ModBlocks.URANIUM_BLOCK);
                }).build());
//RAW ORE BLOCKS
    public static final Supplier<CreativeModeTab> ETERNAL_RAW_ORE_BLOCKS = CREATIVE_MODE_TAB.register("eternal_raw_ore_blocks",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModBlocks.RAW_OSMIUM_BLOCK.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(EternalItems.MOD_ID, "eternal_items_tab"))
                    .title(Component.translatable("creativetab.eternalitems.eternal_raw_ore_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.RAW_ALUMINUM_BLOCK);
                        output.accept(ModBlocks.RAW_COBALT_BLOCK);
                        output.accept(ModBlocks.RAW_LEAD_BLOCK);
                        output.accept(ModBlocks.RAW_NICKEL_BLOCK);
                        output.accept(ModBlocks.RAW_OSMIUM_BLOCK);
                        output.accept(ModBlocks.RAW_PLATINUM_BLOCK);
                        output.accept(ModBlocks.RAW_PLUTONIUM_BLOCK);
                        output.accept(ModBlocks.RAW_SILVER_BLOCK);
                        output.accept(ModBlocks.SULFUR_BLOCK);
                        output.accept(ModBlocks.RAW_TIN_BLOCK);
                        output.accept(ModBlocks.RAW_URANIUM_BLOCK);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
