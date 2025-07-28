package net.radzratz.eternalores.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.block.EOBlockRegistry;
import net.radzratz.eternalores.util.compat.mekanism.item.EOMekCompatItems;
import net.radzratz.eternalores.util.compat.oritech.items.EOritechItemRegistry;

import java.util.function.Supplier;

@SuppressWarnings("all")
public class EOCreativeModeTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EternalOres.id);

public static final Supplier<CreativeModeTab> EO_STONE_ORES = CREATIVE_MODE_TAB.register("eternal_ores_tab_1",
        ()-> CreativeModeTab.builder()
                .icon(()-> new ItemStack(EOBlockRegistry.ALUMINUM_ORE_BLOCK.get()))
                .title(Component.translatable("creativetab.eternalores.stone_ores"))
                .displayItems((itemDisplayParameters, output) ->
                {
                    ///STONE ORES
                    output.accept(EOBlockRegistry.ALUMINUM_ORE_BLOCK);
                    output.accept(EOBlockRegistry.AMBER_ORE_BLOCK);
                    output.accept(EOBlockRegistry.APATITE_ORE_BLOCK);
                    output.accept(EOBlockRegistry.CINNABAR_ORE_BLOCK);
                    output.accept(EOBlockRegistry.COBALT_ORE_BLOCK);
                    output.accept(EOBlockRegistry.FLUORITE_ORE_BLOCK);
                    output.accept(EOBlockRegistry.GALLIUM_ORE_BLOCK);
                    output.accept(EOBlockRegistry.IRIDIUM_ORE_BLOCK);
                    output.accept(EOBlockRegistry.LEAD_ORE_BLOCK);
                    output.accept(EOBlockRegistry.NICKEL_ORE_BLOCK);
                    output.accept(EOBlockRegistry.NITER_ORE_BLOCK);
                    output.accept(EOBlockRegistry.ONYX_ORE_BLOCK);
                    output.accept(EOBlockRegistry.OSMIUM_ORE_BLOCK);
                    output.accept(EOBlockRegistry.PERIDOT_ORE_BLOCK);
                    output.accept(EOBlockRegistry.PLATINUM_ORE_BLOCK);
                    output.accept(EOBlockRegistry.PLUTONIUM_ORE_BLOCK);
                    output.accept(EOBlockRegistry.RUBY_ORE_BLOCK);
                    output.accept(EOBlockRegistry.SAPPHIRE_ORE_BLOCK);
                    output.accept(EOBlockRegistry.SILVER_ORE_BLOCK);
                    output.accept(EOBlockRegistry.SULFUR_ORE_BLOCK);
                    output.accept(EOBlockRegistry.TIN_ORE_BLOCK);
                    output.accept(EOBlockRegistry.URANINITE_ORE_BLOCK);
                    output.accept(EOBlockRegistry.URANIUM_ORE_BLOCK);
                    output.accept(EOBlockRegistry.ZINC_ORE_BLOCK);
                }).build());

    public static final Supplier<CreativeModeTab> EO_SLATE_ORES = CREATIVE_MODE_TAB.register("eternal_ores_tab_2",
            ()-> CreativeModeTab.builder()
                    .icon(()-> new ItemStack(EOBlockRegistry.DEEPSLATE_ALUMINUM_ORE_BLOCK.get()))
                    .title(Component.translatable("creativetab.eternalores.slate_ores"))
                    .displayItems((itemDisplayParameters, output) ->
                    {
                        output.accept(EOBlockRegistry.DEEPSLATE_ALUMINUM_ORE_BLOCK);
                        output.accept(EOBlockRegistry.DEEPSLATE_AMBER_ORE_BLOCK);
                        output.accept(EOBlockRegistry.DEEPSLATE_APATITE_ORE_BLOCK);
                        output.accept(EOBlockRegistry.DEEPSLATE_CINNABAR_ORE_BLOCK);
                        output.accept(EOBlockRegistry.DEEPSLATE_COBALT_ORE_BLOCK);
                        output.accept(EOBlockRegistry.DEEPSLATE_FLUORITE_ORE_BLOCK);
                        output.accept(EOBlockRegistry.DEEPSLATE_GALLIUM_ORE_BLOCK);
                        output.accept(EOBlockRegistry.DEEPSLATE_IRIDIUM_ORE_BLOCK);
                        output.accept(EOBlockRegistry.DEEPSLATE_LEAD_ORE_BLOCK);
                        output.accept(EOBlockRegistry.DEEPSLATE_NICKEL_ORE_BLOCK);
                        output.accept(EOBlockRegistry.DEEPSLATE_NITER_ORE_BLOCK);
                        output.accept(EOBlockRegistry.DEEPSLATE_ONYX_ORE_BLOCK);
                        output.accept(EOBlockRegistry.DEEPSLATE_OSMIUM_ORE_BLOCK);
                        output.accept(EOBlockRegistry.DEEPSLATE_PERIDOT_ORE_BLOCK);
                        output.accept(EOBlockRegistry.DEEPSLATE_PLATINUM_ORE_BLOCK);
                        output.accept(EOBlockRegistry.DEEPSLATE_PLUTONIUM_ORE_BLOCK);
                        output.accept(EOBlockRegistry.DEEPSLATE_RUBY_ORE_BLOCK);
                        output.accept(EOBlockRegistry.DEEPSLATE_SAPPHIRE_ORE_BLOCK);
                        output.accept(EOBlockRegistry.DEEPSLATE_SILVER_ORE_BLOCK);
                        output.accept(EOBlockRegistry.DEEPSLATE_SULFUR_ORE_BLOCK);
                        output.accept(EOBlockRegistry.DEEPSLATE_TIN_ORE_BLOCK);
                        output.accept(EOBlockRegistry.TUNGSTEN_ORE_BLOCK);
                        output.accept(EOBlockRegistry.DEEPSLATE_URANINITE_ORE_BLOCK);
                        output.accept(EOBlockRegistry.DEEPSLATE_URANIUM_ORE_BLOCK);
                        output.accept(EOBlockRegistry.DEEPSLATE_ZINC_ORE_BLOCK);
                    }).build());

    public static final Supplier<CreativeModeTab> EO_NETHER_ORES = CREATIVE_MODE_TAB.register("eternal_ores_tab_3",
            ()-> CreativeModeTab.builder()
                    .icon(()-> new ItemStack(EOBlockRegistry.ARDITE_ORE_BLOCK.get()))
                    .title(Component.translatable("creativetab.eternalores.nether_ores"))
                    .displayItems((itemDisplayParameters, output) ->
                    {
                        output.accept(EOBlockRegistry.ARDITE_ORE_BLOCK);
                        output.accept(EOBlockRegistry.NECROTICARITE_ORE_BLOCK);
                        output.accept(EOBlockRegistry.OBSIDIAN_ORE_BLOCK);
                    }).build());

    public static final Supplier<CreativeModeTab> EO_RAW_BLOCKS = CREATIVE_MODE_TAB.register("eternal_ores_tab_4",
            ()-> CreativeModeTab.builder()
                    .icon(()-> new ItemStack(EOBlockRegistry.RAW_CATALYRIUM_BLOCK.get()))
                    .title(Component.translatable("creativetab.eternalores.raw_blocks"))
                    .displayItems((itemDisplayParameters, output) ->
                    {
                        output.accept(EOBlockRegistry.RAW_ALUMINUM_BLOCK);
                        output.accept(EOBlockRegistry.RAW_ARDITE_BLOCK);
                        output.accept(EOBlockRegistry.RAW_CATALYRIUM_BLOCK);
                        output.accept(EOBlockRegistry.RAW_COBALT_BLOCK);
                        output.accept(EOBlockRegistry.RAW_GALLIUM_BLOCK);
                        output.accept(EOBlockRegistry.RAW_IRIDIUM_BLOCK);
                        output.accept(EOBlockRegistry.RAW_LEAD_BLOCK);
                        output.accept(EOBlockRegistry.RAW_NICKEL_BLOCK);
                        output.accept(EOBlockRegistry.RAW_OSMIUM_BLOCK);
                        output.accept(EOBlockRegistry.RAW_PLATINUM_BLOCK);
                        output.accept(EOBlockRegistry.RAW_PLUTONIUM_BLOCK);
                        output.accept(EOBlockRegistry.RAW_SILVER_BLOCK);
                        output.accept(EOBlockRegistry.SULFUR_BLOCK);
                        output.accept(EOBlockRegistry.RAW_TIN_BLOCK);
                        output.accept(EOBlockRegistry.RAW_TUNGSTEN_BLOCK);
                        output.accept(EOBlockRegistry.RAW_URANINITE_BLOCK);
                        output.accept(EOBlockRegistry.RAW_URANIUM_BLOCK);
                        output.accept(EOBlockRegistry.RAW_ZINC_BLOCK);
                    }).build());

    public static final Supplier<CreativeModeTab> EO_BLOCKS = CREATIVE_MODE_TAB.register("eternal_ores_tab_5",
            ()-> CreativeModeTab.builder()
                    .icon(()-> new ItemStack(EOBlockRegistry.CATALYRIUM_BLOCK.get()))
                    .title(Component.translatable("creativetab.eternalores.blocks"))
                    .displayItems((itemDisplayParameters, output) ->
                    {
                        output.accept(EOBlockRegistry.ALUMINUM_BLOCK);
                        output.accept(EOBlockRegistry.AMBER_BLOCK);
                        output.accept(EOBlockRegistry.APATITE_BLOCK);
                        output.accept(EOBlockRegistry.ARDITE_BLOCK);
                        output.accept(EOBlockRegistry.BLUE_STEEL_BLOCK);
                        output.accept(EOBlockRegistry.BRASS_BLOCK);
                        output.accept(EOBlockRegistry.BRITANNIA_SILVER_BLOCK);
                        output.accept(EOBlockRegistry.BRONZE_BLOCK);
                        output.accept(EOBlockRegistry.CATALYRIUM_BLOCK);
                        output.accept(EOBlockRegistry.CAST_IRON_BLOCK);
                        output.accept(EOBlockRegistry.CAST_STEEL_BLOCK);
                        output.accept(EOBlockRegistry.CINNABAR_BLOCK);
                        output.accept(EOBlockRegistry.COBALT_BLOCK);
                        output.accept(EOBlockRegistry.CONSTANTAN_BLOCK);
                        output.accept(EOBlockRegistry.ELECTRUM_BLOCK);
                        output.accept(EOBlockRegistry.ENDERIUM_BLOCK);
                        output.accept(EOBlockRegistry.FLUORITE_BLOCK);
                        output.accept(EOBlockRegistry.GALLIUM_BLOCK);
                        output.accept(EOBlockRegistry.GRAPHITE_BLOCK);
                        output.accept(EOBlockRegistry.INVAR_BLOCK);
                        output.accept(EOBlockRegistry.IRIDIUM_BLOCK);
                        output.accept(EOBlockRegistry.LEAD_BLOCK);
                        output.accept(EOBlockRegistry.LUMIUM_BLOCK);
                        output.accept(EOBlockRegistry.NETHER_STAR_BLOCK);
                        output.accept(EOBlockRegistry.NECROTICARITE_BLOCK);
                        output.accept(EOBlockRegistry.NETHERSTEEL_BLOCK);
                        output.accept(EOBlockRegistry.NICKEL_BLOCK);
                        output.accept(EOBlockRegistry.NITER_BLOCK);
                        output.accept(EOBlockRegistry.ONYX_BLOCK);
                        output.accept(EOBlockRegistry.OSMIUM_BLOCK);
                        output.accept(EOBlockRegistry.PERIDOT_BLOCK);
                        output.accept(EOBlockRegistry.PEWTER_BLOCK);
                        output.accept(EOBlockRegistry.PIG_IRON_BLOCK);
                        output.accept(EOBlockRegistry.PLATINUM_BLOCK);
                        output.accept(EOBlockRegistry.PLUTONIUM_BLOCK);
                        output.accept(EOBlockRegistry.ROSE_GOLD_BLOCK);
                        output.accept(EOBlockRegistry.RUBY_BLOCK);
                        output.accept(EOBlockRegistry.SAPPHIRE_BLOCK);
                        output.accept(EOBlockRegistry.SIGNALUM_BLOCK);
                        output.accept(EOBlockRegistry.SILICON_BLOCK);
                        output.accept(EOBlockRegistry.SILVER_BLOCK);
                        output.accept(EOBlockRegistry.SHADOWSTEEL_BLOCK);
                        output.accept(EOBlockRegistry.STEEL_BLOCK);
                        output.accept(EOBlockRegistry.TIN_BLOCK);
                        output.accept(EOBlockRegistry.TITANIUM_BLOCK);
                        output.accept(EOBlockRegistry.TUNGSTEN_BLOCK);
                        output.accept(EOBlockRegistry.ULTIMATITANIUM_BLOCK);
                        output.accept(EOBlockRegistry.URANINITE_BLOCK);
                        output.accept(EOBlockRegistry.URANIUM_BLOCK);
                        output.accept(EOBlockRegistry.WROUGHT_IRON_BLOCK);
                        output.accept(EOBlockRegistry.ZINC_BLOCK);
                    }).build());

    public static final Supplier<CreativeModeTab> EO_COMPRESSED_BLOCKS = CREATIVE_MODE_TAB.register("eternal_ores_tab_6",
            ()-> CreativeModeTab.builder()
                    .icon(()-> new ItemStack(EOBlockRegistry.COBBLE_9.get()))
                    .title(Component.translatable("creativetab.eternalores.compressed"))
                    .displayItems((itemDisplayParameters, output) ->
                    {
                        output.accept(EOBlockRegistry.ANDESITE_1);
                        output.accept(EOBlockRegistry.ANDESITE_2);
                        output.accept(EOBlockRegistry.ANDESITE_3);
                        output.accept(EOBlockRegistry.ANDESITE_4);
                        output.accept(EOBlockRegistry.ANDESITE_5);
                        output.accept(EOBlockRegistry.ANDESITE_6);
                        output.accept(EOBlockRegistry.ANDESITE_7);
                        output.accept(EOBlockRegistry.ANDESITE_8);
                        output.accept(EOBlockRegistry.ANDESITE_9);
                        output.accept(EOBlockRegistry.COBBLE_1);
                        output.accept(EOBlockRegistry.COBBLE_2);
                        output.accept(EOBlockRegistry.COBBLE_3);
                        output.accept(EOBlockRegistry.COBBLE_4);
                        output.accept(EOBlockRegistry.COBBLE_5);
                        output.accept(EOBlockRegistry.COBBLE_6);
                        output.accept(EOBlockRegistry.COBBLE_7);
                        output.accept(EOBlockRegistry.COBBLE_8);
                        output.accept(EOBlockRegistry.COBBLE_9);
                        output.accept(EOBlockRegistry.DIORITE_1);
                        output.accept(EOBlockRegistry.DIORITE_2);
                        output.accept(EOBlockRegistry.DIORITE_3);
                        output.accept(EOBlockRegistry.DIORITE_4);
                        output.accept(EOBlockRegistry.DIORITE_5);
                        output.accept(EOBlockRegistry.DIORITE_6);
                        output.accept(EOBlockRegistry.DIORITE_7);
                        output.accept(EOBlockRegistry.DIORITE_8);
                        output.accept(EOBlockRegistry.DIORITE_9);
                        output.accept(EOBlockRegistry.DIRT_1);
                        output.accept(EOBlockRegistry.DIRT_2);
                        output.accept(EOBlockRegistry.DIRT_3);
                        output.accept(EOBlockRegistry.DIRT_4);
                        output.accept(EOBlockRegistry.DIRT_5);
                        output.accept(EOBlockRegistry.DIRT_6);
                        output.accept(EOBlockRegistry.DIRT_7);
                        output.accept(EOBlockRegistry.DIRT_8);
                        output.accept(EOBlockRegistry.DIRT_9);
                        output.accept(EOBlockRegistry.GRANITE_1);
                        output.accept(EOBlockRegistry.GRANITE_2);
                        output.accept(EOBlockRegistry.GRANITE_3);
                        output.accept(EOBlockRegistry.GRANITE_4);
                        output.accept(EOBlockRegistry.GRANITE_5);
                        output.accept(EOBlockRegistry.GRANITE_6);
                        output.accept(EOBlockRegistry.GRANITE_7);
                        output.accept(EOBlockRegistry.GRANITE_8);
                        output.accept(EOBlockRegistry.GRANITE_9);
                        output.accept(EOBlockRegistry.GRAVEL_1);
                        output.accept(EOBlockRegistry.GRAVEL_2);
                        output.accept(EOBlockRegistry.GRAVEL_3);
                        output.accept(EOBlockRegistry.GRAVEL_4);
                        output.accept(EOBlockRegistry.GRAVEL_5);
                        output.accept(EOBlockRegistry.GRAVEL_6);
                        output.accept(EOBlockRegistry.GRAVEL_7);
                        output.accept(EOBlockRegistry.GRAVEL_8);
                        output.accept(EOBlockRegistry.GRAVEL_9);
                        output.accept(EOBlockRegistry.SAND_1);
                        output.accept(EOBlockRegistry.SAND_2);
                        output.accept(EOBlockRegistry.SAND_3);
                        output.accept(EOBlockRegistry.SAND_4);
                        output.accept(EOBlockRegistry.SAND_5);
                        output.accept(EOBlockRegistry.SAND_6);
                        output.accept(EOBlockRegistry.SAND_7);
                        output.accept(EOBlockRegistry.SAND_8);
                        output.accept(EOBlockRegistry.SAND_9);
                    }).build());

    public static final Supplier<CreativeModeTab> EO_RAW_MATERIALS = CREATIVE_MODE_TAB.register("eternal_ores_tab_7",
            ()-> CreativeModeTab.builder()
                    .icon(()-> new ItemStack(EOItemRegistry.RAW_CATALYRIUM.get()))
                    .title(Component.translatable("creativetab.eternalores.raw_ores"))
                    .displayItems((itemDisplayParameters, output) ->
                    {
                        output.accept(EOItemRegistry.RAW_ALUMINUM);
                        output.accept(EOItemRegistry.RAW_ARDITE);
                        output.accept(EOItemRegistry.RAW_CATALYRIUM);
                        output.accept(EOItemRegistry.RAW_COBALT);
                        output.accept(EOItemRegistry.RAW_GALLIUM);
                        output.accept(EOItemRegistry.RAW_IRIDIUM);
                        output.accept(EOItemRegistry.RAW_LEAD);
                        output.accept(EOItemRegistry.RAW_NICKEL);
                        output.accept(EOItemRegistry.RAW_OSMIUM);
                        output.accept(EOItemRegistry.RAW_PLATINUM);
                        output.accept(EOItemRegistry.RAW_PLUTONIUM);
                        output.accept(EOItemRegistry.RAW_SILVER);
                        output.accept(EOItemRegistry.SULFUR);
                        output.accept(EOItemRegistry.RAW_TIN);
                        output.accept(EOItemRegistry.RAW_TUNGSTEN);
                        output.accept(EOItemRegistry.RAW_ULTIMATITANIUM);
                        output.accept(EOItemRegistry.RAW_URANINITE);
                        output.accept(EOItemRegistry.RAW_URANIUM);
                        output.accept(EOItemRegistry.RAW_ZINC);
                    }).build());

    public static final Supplier<CreativeModeTab> EO_MATERIALS = CREATIVE_MODE_TAB.register("eternal_ores_tab_8",
            ()-> CreativeModeTab.builder()
                    .icon(()-> new ItemStack(EOItemRegistry.MISSING_INGOT.get()))
                    .title(Component.translatable("creativetab.eternalores.materials"))
                    .displayItems((itemDisplayParameters, output) ->
                    {
                        output.accept(EOItemRegistry.ALUMINUM_INGOT);
                        output.accept(EOItemRegistry.ARDITE_INGOT);
                        output.accept(EOItemRegistry.BLUE_STEEL_INGOT);
                        output.accept(EOItemRegistry.BRASS_INGOT);
                        output.accept(EOItemRegistry.BRITANNIA_SILVER_INGOT);
                        output.accept(EOItemRegistry.BRONZE_INGOT);
                        output.accept(EOItemRegistry.CATALYRIUM_INGOT);
                        output.accept(EOItemRegistry.CAST_IRON_INGOT);
                        output.accept(EOItemRegistry.CAST_STEEL_INGOT);
                        output.accept(EOItemRegistry.COBALT_INGOT);
                        output.accept(EOItemRegistry.CONSTANTAN_INGOT);
                        output.accept(EOItemRegistry.ELECTRUM_INGOT);
                        output.accept(EOItemRegistry.ETERNAL_DARK_INGOT);
                        output.accept(EOItemRegistry.ETERNAL_LIGHT_INGOT);
                        output.accept(EOItemRegistry.ENDERIUM_INGOT);
                        output.accept(EOItemRegistry.GALLIUM_INGOT);
                        output.accept(EOItemRegistry.GRAPHITE_INGOT);
                        output.accept(EOItemRegistry.INVAR_INGOT);
                        output.accept(EOItemRegistry.IRIDIUM_INGOT);
                        output.accept(EOItemRegistry.LEAD_INGOT);
                        output.accept(EOItemRegistry.LUMIUM_INGOT);
                        output.accept(EOItemRegistry.MISSING_INGOT);
                        output.accept(EOItemRegistry.NETHERSTEEL_INGOT);
                        output.accept(EOItemRegistry.NICKEL_INGOT);
                        output.accept(EOItemRegistry.OSMIUM_INGOT);
                        output.accept(EOItemRegistry.PEWTER_INGOT);
                        output.accept(EOItemRegistry.PIG_IRON_INGOT);
                        output.accept(EOItemRegistry.PLATINUM_INGOT);
                        output.accept(EOItemRegistry.PLUTONIUM_INGOT);
                        output.accept(EOItemRegistry.REDSTONE_INGOT);
                        output.accept(EOItemRegistry.ROSE_GOLD_INGOT);
                        output.accept(EOItemRegistry.SIGNALUM_INGOT);
                        output.accept(EOItemRegistry.SILICON_INGOT);
                        output.accept(EOItemRegistry.SILVER_INGOT);
                        output.accept(EOItemRegistry.SHADOWSTEEL_INGOT);
                        output.accept(EOItemRegistry.STEEL_INGOT);
                        output.accept(EOItemRegistry.TIN_INGOT);
                        output.accept(EOItemRegistry.TITANIUM_INGOT);
                        output.accept(EOItemRegistry.TUNGSTEN_INGOT);
                        output.accept(EOItemRegistry.ULTIMATITANIUM_INGOT);
                        output.accept(EOItemRegistry.URANINITE_INGOT);
                        output.accept(EOItemRegistry.URANIUM_INGOT);
                        output.accept(EOItemRegistry.WROUGHT_IRON_INGOT);
                        output.accept(EOItemRegistry.ZINC_INGOT);
                        output.accept(EOItemRegistry.GEM_AMBER);
                        output.accept(EOItemRegistry.GEM_APATITE);
                        output.accept(EOItemRegistry.GEM_CINNABAR);
                        output.accept(EOItemRegistry.FLUORITE);
                        output.accept(EOItemRegistry.GEM_NECROTICARITE);
                        output.accept(EOItemRegistry.GEM_NITER);
                        output.accept(EOItemRegistry.GEM_OBSIDIAN_SHARD);
                        output.accept(EOItemRegistry.GEM_ONYX);
                        output.accept(EOItemRegistry.GEM_PERIDOT);
                        output.accept(EOItemRegistry.GEM_QUANTIQUARITE);
                        output.accept(EOItemRegistry.GEM_RUBY);
                        output.accept(EOItemRegistry.GEM_SAPPHIRE);
                        output.accept(EOItemRegistry.GEM_TACHYARITE);
                        output.accept(EOItemRegistry.GEM_VOIDERITE);
                        output.accept(EOItemRegistry.SILICON);
                    }).build());

    public static final Supplier<CreativeModeTab> EO_NUGGETS = CREATIVE_MODE_TAB.register("eternal_ores_tab_9",
            ()-> CreativeModeTab.builder()
                    .icon(()-> new ItemStack(EOItemRegistry.CATALYRIUM_NUGGET.get()))
                    .title(Component.translatable("creativetab.eternalores.nuggets"))
                    .displayItems((itemDisplayParameters, output) ->
                    {
                        output.accept(EOItemRegistry.ALUMINUM_NUGGET);
                        output.accept(EOItemRegistry.ARDITE_NUGGET);
                        output.accept(EOItemRegistry.BLUE_STEEL_NUGGET);
                        output.accept(EOItemRegistry.BRASS_NUGGET);
                        output.accept(EOItemRegistry.BRITANNIA_SILVER_NUGGET);
                        output.accept(EOItemRegistry.BRONZE_NUGGET);
                        output.accept(EOItemRegistry.CATALYRIUM_NUGGET);
                        output.accept(EOItemRegistry.CAST_IRON_NUGGET);
                        output.accept(EOItemRegistry.CAST_STEEL_NUGGET);
                        output.accept(EOItemRegistry.COBALT_NUGGET);
                        output.accept(EOItemRegistry.CONSTANTAN_NUGGET);
                        output.accept(EOItemRegistry.COPPER_NUGGET);
                        output.accept(EOItemRegistry.ELECTRUM_NUGGET);
                        output.accept(EOItemRegistry.ENDERIUM_NUGGET);
                        output.accept(EOItemRegistry.GALLIUM_NUGGET);
                        output.accept(EOItemRegistry.GRAPHITE_NUGGET);
                        output.accept(EOItemRegistry.INVAR_NUGGET);
                        output.accept(EOItemRegistry.IRIDIUM_NUGGET);
                        output.accept(EOItemRegistry.LEAD_NUGGET);
                        output.accept(EOItemRegistry.LUMIUM_NUGGET);
                        output.accept(EOItemRegistry.NETHERITE_NUGGET);
                        output.accept(EOItemRegistry.NETHERSTEEL_NUGGET);
                        output.accept(EOItemRegistry.NICKEL_NUGGET);
                        output.accept(EOItemRegistry.OSMIUM_NUGGET);
                        output.accept(EOItemRegistry.PEWTER_NUGGET);
                        output.accept(EOItemRegistry.PIG_IRON_NUGGET);
                        output.accept(EOItemRegistry.PLATINUM_NUGGET);
                        output.accept(EOItemRegistry.PLUTONIUM_NUGGET);
                        output.accept(EOItemRegistry.ROSE_GOLD_NUGGET);
                        output.accept(EOItemRegistry.SIGNALUM_NUGGET);
                        output.accept(EOItemRegistry.SILVER_NUGGET);
                        output.accept(EOItemRegistry.SHADOWSTEEL_NUGGET);
                        output.accept(EOItemRegistry.STEEL_NUGGET);
                        output.accept(EOItemRegistry.TIN_NUGGET);
                        output.accept(EOItemRegistry.TITANIUM_NUGGET);
                        output.accept(EOItemRegistry.TUNGSTEN_NUGGET);
                        output.accept(EOItemRegistry.ULTIMATITANIUM_NUGGET);
                        output.accept(EOItemRegistry.URANINITE_NUGGET);
                        output.accept(EOItemRegistry.URANIUM_NUGGET);
                        output.accept(EOItemRegistry.WROUGHT_IRON_NUGGET);
                        output.accept(EOItemRegistry.ZINC_NUGGET);
                    }).build());

    public static final Supplier<CreativeModeTab> EO_DUSTS = CREATIVE_MODE_TAB.register("eternal_ores_tab_10",
            ()-> CreativeModeTab.builder()
                    .icon(()-> new ItemStack(EOItemRegistry.CATALYRIUM_DUST.get()))
                    .title(Component.translatable("creativetab.eternalores.dusts"))
                    .displayItems((itemDisplayParameters, output) ->
                    {
                        output.accept(EOItemRegistry.ALUMINUM_DUST);
                        output.accept(EOItemRegistry.AMBER_DUST);
                        output.accept(EOItemRegistry.AMETHYST_DUST);
                        output.accept(EOItemRegistry.APATITE_DUST);
                        output.accept(EOItemRegistry.ARDITE_DUST);
                        output.accept(EOItemRegistry.BLUE_STEEL_DUST);
                        output.accept(EOItemRegistry.BRASS_DUST);
                        output.accept(EOItemRegistry.BRITANNIA_SILVER_DUST);
                        output.accept(EOItemRegistry.BRONZE_DUST);
                        output.accept(EOItemRegistry.CATALYRIUM_DUST);
                        output.accept(EOItemRegistry.CAST_IRON_DUST);
                        output.accept(EOItemRegistry.CAST_STEEL_DUST);
                        output.accept(EOItemRegistry.CARBON_BLEND);
                        output.accept(EOItemRegistry.COAL_DUST);
                        output.accept(EOItemRegistry.COBALT_DUST);
                        output.accept(EOItemRegistry.CONSTANTAN_DUST);
                        output.accept(EOItemRegistry.COPPER_DUST);
                        output.accept(EOItemRegistry.DIAMOND_DUST);
                        output.accept(EOItemRegistry.ELECTRUM_DUST);
                        output.accept(EOItemRegistry.EMERALD_DUST);
                        output.accept(EOItemRegistry.ENERGETIC_BLEND);
                        output.accept(EOItemRegistry.ENDER_DUST);
                        output.accept(EOItemRegistry.ENDERGETIC_BLEND);
                        output.accept(EOItemRegistry.ENDERIUM_DUST);
                        output.accept(EOItemRegistry.ENDSTONE_DUST);
                        output.accept(EOItemRegistry.FLUORITE_DUST);
                        output.accept(EOItemRegistry.GALLIUM_DUST);
                        output.accept(EOItemRegistry.GOLD_DUST);
                        output.accept(EOItemRegistry.GRAPHITE_DUST);
                        output.accept(EOItemRegistry.INVAR_DUST);
                        output.accept(EOItemRegistry.IRIDIUM_DUST);
                        output.accept(EOItemRegistry.IRON_DUST);
                        output.accept(EOItemRegistry.LAPIS_LAZULI_DUST);
                        output.accept(EOItemRegistry.LEAD_DUST);
                        output.accept(EOItemRegistry.LUMIUM_DUST);
                        output.accept(EOItemRegistry.NECROTICARITE_DUST);
                        output.accept(EOItemRegistry.NETHER_STAR_DUST);
                        output.accept(EOItemRegistry.NETHERITE_DUST);
                        output.accept(EOItemRegistry.NETHERRACK_DUST);
                        output.accept(EOItemRegistry.NETHERSTEEL_DUST);
                        output.accept(EOItemRegistry.NICKEL_DUST);
                        output.accept(EOItemRegistry.NITER_DUST);
                        output.accept(EOItemRegistry.OBSIDIAN_DUST);
                        output.accept(EOItemRegistry.ONYX_DUST);
                        output.accept(EOItemRegistry.OSMIUM_DUST);
                        output.accept(EOItemRegistry.PERIDOT_DUST);
                        output.accept(EOItemRegistry.PEWTER_DUST);
                        output.accept(EOItemRegistry.PIG_IRON_DUST);
                        output.accept(EOItemRegistry.PLATINUM_DUST);
                        output.accept(EOItemRegistry.PLUTONIUM_DUST);
                        output.accept(EOItemRegistry.PRISMARINE_DUST);
                        output.accept(EOItemRegistry.QUANTIQUARITE_DUST);
                        output.accept(EOItemRegistry.QUARTZ_DUST);
                        output.accept(EOItemRegistry.ROSE_GOLD_DUST);
                        output.accept(EOItemRegistry.RUBY_DUST);
                        output.accept(EOItemRegistry.SAPPHIRE_DUST);
                        output.accept(EOItemRegistry.SCULK_DUST);
                        output.accept(EOItemRegistry.SHADOWSTEEL_DUST);
                        output.accept(EOItemRegistry.SIGNALUM_DUST);
                        output.accept(EOItemRegistry.SILICON_DUST);
                        output.accept(EOItemRegistry.SILVER_DUST);
                        output.accept(EOItemRegistry.STEEL_DUST);
                        output.accept(EOItemRegistry.SULFUR_DUST);
                        output.accept(EOItemRegistry.TACHYARITE_DUST);
                        output.accept(EOItemRegistry.TIN_DUST);
                        output.accept(EOItemRegistry.TITANIUM_DUST);
                        output.accept(EOItemRegistry.TUNGSTEN_DUST);
                        output.accept(EOItemRegistry.ULTIMATITANIUM_DUST);
                        output.accept(EOItemRegistry.URANINITE_DUST);
                        output.accept(EOItemRegistry.URANIUM_DUST);
                        output.accept(EOItemRegistry.VOIDERITE_DUST);
                        output.accept(EOItemRegistry.WROUGHT_IRON_DUST);
                        output.accept(EOItemRegistry.ZINC_DUST);
                    }).build());

    public static final Supplier<CreativeModeTab> EO_PLATE = CREATIVE_MODE_TAB.register("eternal_ores_tab_11",
            ()-> CreativeModeTab.builder()
                    .icon(()-> new ItemStack(EOItemRegistry.PLATE_CATALYRIUM.get()))
                    .title(Component.translatable("creativetab.eternalores.plates"))
                    .displayItems((itemDisplayParameters, output) ->
                    {
                        output.accept(EOItemRegistry.PLATE_ALUMINUM);
                        output.accept(EOItemRegistry.PLATE_ARDITE);
                        output.accept(EOItemRegistry.PLATE_BLUE_STEEL);
                        output.accept(EOItemRegistry.PLATE_BRASS);
                        output.accept(EOItemRegistry.PLATE_BRONZE);
                        output.accept(EOItemRegistry.PLATE_CATALYRIUM);
                        output.accept(EOItemRegistry.PLATE_CAST_IRON);
                        output.accept(EOItemRegistry.PLATE_CAST_STEEL);
                        output.accept(EOItemRegistry.PLATE_COBALT);
                        output.accept(EOItemRegistry.PLATE_CONSTANTAN);
                        output.accept(EOItemRegistry.PLATE_COPPER);
                        output.accept(EOItemRegistry.PLATE_DIAMOND);
                        output.accept(EOItemRegistry.PLATE_ELECTRUM);
                        output.accept(EOItemRegistry.PLATE_ENDERIUM);
                        output.accept(EOItemRegistry.PLATE_GALLIUM);
                        output.accept(EOItemRegistry.PLATE_GOLD);
                        output.accept(EOItemRegistry.PLATE_GRAPHITE);
                        output.accept(EOItemRegistry.PLATE_INVAR);
                        output.accept(EOItemRegistry.PLATE_IRIDIUM);
                        output.accept(EOItemRegistry.PLATE_IRON);
                        output.accept(EOItemRegistry.PLATE_LEAD);
                        output.accept(EOItemRegistry.PLATE_LUMIUM);
                        output.accept(EOItemRegistry.PLATE_NECROTICARITE);
                        output.accept(EOItemRegistry.PLATE_NETHERITE);
                        output.accept(EOItemRegistry.PLATE_NETHERSTEEL);
                        output.accept(EOItemRegistry.PLATE_NICKEL);
                        output.accept(EOItemRegistry.PLATE_OSMIUM);
                        output.accept(EOItemRegistry.PLATE_PIG_IRON);
                        output.accept(EOItemRegistry.PLATE_PLATINUM);
                        output.accept(EOItemRegistry.PLATE_PLUTONIUM);
                        output.accept(EOItemRegistry.PLATE_QUANTIQUARITE);
                        output.accept(EOItemRegistry.PLATE_ROSE_GOLD);
                        output.accept(EOItemRegistry.PLATE_SAPPHIRE);
                        output.accept(EOItemRegistry.PLATE_SHADOWSTEEL);
                        output.accept(EOItemRegistry.PLATE_SIGNALUM);
                        output.accept(EOItemRegistry.PLATE_SILVER);
                        output.accept(EOItemRegistry.PLATE_STEEL);
                        output.accept(EOItemRegistry.PLATE_TACHYARITE);
                        output.accept(EOItemRegistry.PLATE_TIN);
                        output.accept(EOItemRegistry.PLATE_TITANIUM);
                        output.accept(EOItemRegistry.PLATE_TUNGSTEN);
                        output.accept(EOItemRegistry.PLATE_ULTIMATITANIUM);
                        output.accept(EOItemRegistry.PLATE_URANIUM);
                        output.accept(EOItemRegistry.PLATE_VOIDERITE);
                        output.accept(EOItemRegistry.PLATE_WROUGHT_IRON);
                        output.accept(EOItemRegistry.PLATE_ZINC);
                    }).build());

    public static final Supplier<CreativeModeTab> EO_RODS = CREATIVE_MODE_TAB.register("eternal_ores_tab_12",
            ()-> CreativeModeTab.builder()
                    .icon(()-> new ItemStack(EOItemRegistry.ROD_CATALYRIUM.get()))
                    .title(Component.translatable("creativetab.eternalores.rods"))
                    .displayItems((itemDisplayParameters, output) ->
                    {
                        output.accept(EOItemRegistry.ROD_ALUMINUM);
                        output.accept(EOItemRegistry.ROD_ARDITE);
                        output.accept(EOItemRegistry.ROD_BLUE_STEEL);
                        output.accept(EOItemRegistry.ROD_BRASS);
                        output.accept(EOItemRegistry.ROD_BRONZE);
                        output.accept(EOItemRegistry.ROD_CATALYRIUM);
                        output.accept(EOItemRegistry.ROD_CAST_IRON);
                        output.accept(EOItemRegistry.ROD_CAST_STEEL);
                        output.accept(EOItemRegistry.ROD_COBALT);
                        output.accept(EOItemRegistry.ROD_CONSTANTAN);
                        output.accept(EOItemRegistry.ROD_COPPER);
                        output.accept(EOItemRegistry.ROD_DIAMOND);
                        output.accept(EOItemRegistry.ROD_ELECTRUM);
                        output.accept(EOItemRegistry.ROD_ENDERIUM);
                        output.accept(EOItemRegistry.ROD_GALLIUM);
                        output.accept(EOItemRegistry.ROD_GOLD);
                        output.accept(EOItemRegistry.ROD_GRAPHITE);
                        output.accept(EOItemRegistry.ROD_INVAR);
                        output.accept(EOItemRegistry.ROD_IRIDIUM);
                        output.accept(EOItemRegistry.ROD_IRON);
                        output.accept(EOItemRegistry.ROD_LEAD);
                        output.accept(EOItemRegistry.ROD_LUMIUM);
                        output.accept(EOItemRegistry.ROD_NECROTICARITE);
                        output.accept(EOItemRegistry.ROD_NETHERITE);
                        output.accept(EOItemRegistry.ROD_NETHERSTEEL);
                        output.accept(EOItemRegistry.ROD_NICKEL);
                        output.accept(EOItemRegistry.ROD_OSMIUM);
                        output.accept(EOItemRegistry.ROD_PIG_IRON);
                        output.accept(EOItemRegistry.ROD_PLATINUM);
                        output.accept(EOItemRegistry.ROD_PLUTONIUM);
                        output.accept(EOItemRegistry.ROD_QUANTIQUARITE);
                        output.accept(EOItemRegistry.ROD_ROSE_GOLD);
                        output.accept(EOItemRegistry.ROD_SAPPHIRE);
                        output.accept(EOItemRegistry.ROD_SHADOWSTEEL);
                        output.accept(EOItemRegistry.ROD_SIGNALUM);
                        output.accept(EOItemRegistry.ROD_SILVER);
                        output.accept(EOItemRegistry.ROD_STEEL);
                        output.accept(EOItemRegistry.ROD_TACHYARITE);
                        output.accept(EOItemRegistry.ROD_TIN);
                        output.accept(EOItemRegistry.ROD_TITANIUM);
                        output.accept(EOItemRegistry.ROD_TUNGSTEN);
                        output.accept(EOItemRegistry.ROD_ULTIMATITANIUM);
                        output.accept(EOItemRegistry.ROD_URANIUM);
                        output.accept(EOItemRegistry.ROD_VOIDERITE);
                        output.accept(EOItemRegistry.ROD_WROUGHT_IRON);
                        output.accept(EOItemRegistry.ROD_ZINC);
                    }).build());

    public static final Supplier<CreativeModeTab> EO_GEARS = CREATIVE_MODE_TAB.register("eternal_ores_tab_13",
            ()-> CreativeModeTab.builder()
                    .icon(()-> new ItemStack(EOItemRegistry.GEAR_CATALYRIUM.get()))
                    .title(Component.translatable("creativetab.eternalores.gears"))
                    .displayItems((itemDisplayParameters, output) ->
                    {
                        output.accept(EOItemRegistry.GEAR_ALUMINUM);
                        output.accept(EOItemRegistry.GEAR_ARDITE);
                        output.accept(EOItemRegistry.GEAR_BRONZE);
                        output.accept(EOItemRegistry.GEAR_CATALYRIUM);
                        output.accept(EOItemRegistry.GEAR_COPPER);
                        output.accept(EOItemRegistry.GEAR_DIAMOND);
                        output.accept(EOItemRegistry.GEAR_ENDERIUM);
                        output.accept(EOItemRegistry.GEAR_GOLD);
                        output.accept(EOItemRegistry.GEAR_IRON);
                        output.accept(EOItemRegistry.GEAR_LEAD);
                        output.accept(EOItemRegistry.GEAR_NECROTICARITE);
                        output.accept(EOItemRegistry.GEAR_OSMIUM);
                        output.accept(EOItemRegistry.GEAR_QUANTIQUARITE);
                        output.accept(EOItemRegistry.GEAR_STEEL);
                        output.accept(EOItemRegistry.GEAR_TACHYARITE);
                        output.accept(EOItemRegistry.GEAR_TIN);
                        output.accept(EOItemRegistry.GEAR_TUNGSTEN);
                        output.accept(EOItemRegistry.GEAR_VOIDERITE);
                        output.accept(EOItemRegistry.ULTIMATE_GEAR);
                    }).build());

    public static final Supplier<CreativeModeTab> EO_TOOLS = CREATIVE_MODE_TAB.register("eternal_ores_tab_14",
            ()-> CreativeModeTab.builder()
                    .icon(()-> new ItemStack(EOItemRegistry.COBALT_HAMMER.get()))
                    .title(Component.translatable("creativetab.eternalores.tools"))
                    .displayItems((itemDisplayParameters, output) ->
                    {
                        output.accept(EOItemRegistry.COBALT_HAMMER);
                        output.accept(EOItemRegistry.COPPER_HAMMER);
                        output.accept(EOItemRegistry.DIAMOND_HAMMER);
                        output.accept(EOItemRegistry.IRON_HAMMER);
                        output.accept(EOItemRegistry.STONE_HAMMER);
                        output.accept(EOItemRegistry.IRON_GEM_CUTTER);
                        output.accept(EOItemRegistry.FINDER);
                    }).build());

    public static final Supplier<CreativeModeTab> EO_ORITECH = CREATIVE_MODE_TAB.register("eternal_ores_tab_15",
            ()-> CreativeModeTab.builder()
                    .icon(()-> new ItemStack(EOritechItemRegistry.O_CATALYRIUM_CLUMP.get()))
                    .title(Component.translatable("creativetab.eternalores.oritech"))
                    .displayItems((itemDisplayParameters, output) ->
                    {
                        //Clumps
                        output.accept(EOritechItemRegistry.O_ALUMINUM_CLUMP);
                        output.accept(EOritechItemRegistry.O_ARDITE_CLUMP);
                        output.accept(EOritechItemRegistry.O_CATALYRIUM_CLUMP);
                        output.accept(EOritechItemRegistry.O_COBALT_CLUMP);
                        output.accept(EOritechItemRegistry.O_GALLIUM_CLUMP);
                        output.accept(EOritechItemRegistry.O_IRIDIUM_CLUMP);
                        output.accept(EOritechItemRegistry.O_LEAD_CLUMP);
                        output.accept(EOritechItemRegistry.O_OSMIUM_CLUMP);
                        output.accept(EOritechItemRegistry.O_SILVER_CLUMP);
                        output.accept(EOritechItemRegistry.O_TIN_CLUMP);
                        output.accept(EOritechItemRegistry.O_TUNGSTEN_CLUMP);
                        output.accept(EOritechItemRegistry.O_URANINITE_CLUMP);
                        output.accept(EOritechItemRegistry.O_URANIUM_CLUMP);
                        output.accept(EOritechItemRegistry.O_ZINC_CLUMP);
                        //Gem
                        output.accept(EOritechItemRegistry.O_ALUMINUM_GEM);
                        output.accept(EOritechItemRegistry.O_ARDITE_GEM);
                        output.accept(EOritechItemRegistry.O_CATALYRIUM_GEM);
                        output.accept(EOritechItemRegistry.O_COBALT_GEM);
                        output.accept(EOritechItemRegistry.O_GALLIUM_GEM);
                        output.accept(EOritechItemRegistry.O_IRIDIUM_GEM);
                        output.accept(EOritechItemRegistry.O_LEAD_GEM);
                        output.accept(EOritechItemRegistry.O_OSMIUM_GEM);
                        output.accept(EOritechItemRegistry.O_SILVER_GEM);
                        output.accept(EOritechItemRegistry.O_TIN_GEM);
                        output.accept(EOritechItemRegistry.O_TUNGSTEN_GEM);
                        output.accept(EOritechItemRegistry.O_URANINITE_GEM);
                        output.accept(EOritechItemRegistry.O_URANIUM_GEM);
                        output.accept(EOritechItemRegistry.O_ZINC_GEM);
                        //Small Clump
                        output.accept(EOritechItemRegistry.O_ALUMINUM_SMALL_CLUMP);
                        output.accept(EOritechItemRegistry.O_ARDITE_SMALL_CLUMP);
                        output.accept(EOritechItemRegistry.O_CATALYRIUM_SMALL_CLUMP);
                        output.accept(EOritechItemRegistry.O_COBALT_SMALL_CLUMP);
                        output.accept(EOritechItemRegistry.O_GALLIUM_SMALL_CLUMP);
                        output.accept(EOritechItemRegistry.O_IRIDIUM_SMALL_CLUMP);
                        output.accept(EOritechItemRegistry.O_LEAD_SMALL_CLUMP);
                        output.accept(EOritechItemRegistry.O_OSMIUM_SMALL_CLUMP);
                        output.accept(EOritechItemRegistry.O_SILVER_SMALL_CLUMP);
                        output.accept(EOritechItemRegistry.O_TIN_SMALL_CLUMP);
                        output.accept(EOritechItemRegistry.O_TUNGSTEN_SMALL_CLUMP);
                        output.accept(EOritechItemRegistry.O_URANINITE_SMALL_CLUMP);
                        output.accept(EOritechItemRegistry.O_URANIUM_SMALL_CLUMP);
                        output.accept(EOritechItemRegistry.O_ZINC_SMALL_CLUMP);
                        //Small Dust
                        output.accept(EOritechItemRegistry.O_ALUMINUM_SMALL_DUST);
                        output.accept(EOritechItemRegistry.O_ARDITE_SMALL_DUST);
                        output.accept(EOritechItemRegistry.O_CATALYRIUM_SMALL_DUST);
                        output.accept(EOritechItemRegistry.O_COBALT_SMALL_DUST);
                        output.accept(EOritechItemRegistry.O_GALLIUM_SMALL_DUST);
                        output.accept(EOritechItemRegistry.O_IRIDIUM_SMALL_DUST);
                        output.accept(EOritechItemRegistry.O_LEAD_SMALL_DUST);
                        output.accept(EOritechItemRegistry.O_OSMIUM_SMALL_DUST);
                        output.accept(EOritechItemRegistry.O_SILVER_SMALL_DUST);
                        output.accept(EOritechItemRegistry.O_TIN_SMALL_DUST);
                        output.accept(EOritechItemRegistry.O_TUNGSTEN_SMALL_DUST);
                        output.accept(EOritechItemRegistry.O_URANINITE_SMALL_DUST);
                        output.accept(EOritechItemRegistry.O_URANIUM_SMALL_DUST);
                        output.accept(EOritechItemRegistry.O_ZINC_SMALL_DUST);
                    }).build());

    public static final Supplier<CreativeModeTab> EO_MEKANISM = CREATIVE_MODE_TAB.register("eternal_ores_tab_16",
            ()-> CreativeModeTab.builder()
                    .icon(()-> new ItemStack(EOMekCompatItems.CATALYRIUM_CLUMP.get()))
                    .title(Component.translatable("creativetab.eternalores.mekanism"))
                    .displayItems((itemDisplayParameters, output) ->
                    {
                        //Dirty Dusts
                        output.accept(EOMekCompatItems.ALUMINUM_DIRTY_DUST);
                        output.accept(EOMekCompatItems.ARDITE_DIRTY_DUST);
                        output.accept(EOMekCompatItems.CATALYRIUM_DIRTY_DUST);
                        output.accept(EOMekCompatItems.COBALT_DIRTY_DUST);
                        output.accept(EOMekCompatItems.GALLIUM_DIRTY_DUST);
                        output.accept(EOMekCompatItems.IRIDIUM_DIRTY_DUST);
                        output.accept(EOMekCompatItems.NICKEL_DIRTY_DUST);
                        output.accept(EOMekCompatItems.PLATINUM_DIRTY_DUST);
                        output.accept(EOMekCompatItems.SILVER_DIRTY_DUST);
                        output.accept(EOMekCompatItems.URANINITE_DIRTY_DUST);
                        output.accept(EOMekCompatItems.ZINC_DIRTY_DUST);
                        //Clumps
                        output.accept(EOMekCompatItems.ALUMINUM_CLUMP);
                        output.accept(EOMekCompatItems.ARDITE_CLUMP);
                        output.accept(EOMekCompatItems.CATALYRIUM_CLUMP);
                        output.accept(EOMekCompatItems.COBALT_CLUMP);
                        output.accept(EOMekCompatItems.GALLIUM_CLUMP);
                        output.accept(EOMekCompatItems.IRIDIUM_CLUMP);
                        output.accept(EOMekCompatItems.NICKEL_CLUMP);
                        output.accept(EOMekCompatItems.PLATINUM_CLUMP);
                        output.accept(EOMekCompatItems.SILVER_CLUMP);
                        output.accept(EOMekCompatItems.URANINITE_CLUMP);
                        output.accept(EOMekCompatItems.ZINC_CLUMP);
                        //Shards
                        output.accept(EOMekCompatItems.ALUMINUM_SHARD);
                        output.accept(EOMekCompatItems.ARDITE_SHARD);
                        output.accept(EOMekCompatItems.CATALYRIUM_SHARD);
                        output.accept(EOMekCompatItems.COBALT_SHARD);
                        output.accept(EOMekCompatItems.GALLIUM_SHARD);
                        output.accept(EOMekCompatItems.IRIDIUM_SHARD);
                        output.accept(EOMekCompatItems.NICKEL_SHARD);
                        output.accept(EOMekCompatItems.PLATINUM_SHARD);
                        output.accept(EOMekCompatItems.SILVER_SHARD);
                        output.accept(EOMekCompatItems.URANINITE_SHARD);
                        output.accept(EOMekCompatItems.ZINC_SHARD);
                        //Crystals
                        output.accept(EOMekCompatItems.ALUMINUM_CRYSTAL);
                        output.accept(EOMekCompatItems.ARDITE_CRYSTAL);
                        output.accept(EOMekCompatItems.CATALYRIUM_CRYSTAL);
                        output.accept(EOMekCompatItems.COBALT_CRYSTAL);
                        output.accept(EOMekCompatItems.GALLIUM_CRYSTAL);
                        output.accept(EOMekCompatItems.IRIDIUM_CRYSTAL);
                        output.accept(EOMekCompatItems.NICKEL_CRYSTAL);
                        output.accept(EOMekCompatItems.PLATINUM_CRYSTAL);
                        output.accept(EOMekCompatItems.SILVER_CRYSTAL);
                        output.accept(EOMekCompatItems.URANINITE_CRYSTAL);
                        output.accept(EOMekCompatItems.ZINC_CRYSTAL);
                    }).build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
