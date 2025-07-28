package net.radzratz.eternalores.datagen.models;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.item.EOItemRegistry;
import net.radzratz.eternalores.util.compat.mekanism.item.EOMekCompatItems;
import net.radzratz.eternalores.util.compat.oritech.items.EOritechItemRegistry;
import org.jetbrains.annotations.NotNull;

public class EOItemModelProvider extends ItemModelProvider
{
    public EOItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper)
    {
        super(output, EternalOres.id, existingFileHelper);
    }

    @Override
    protected void registerModels()
    {
        //HAMMERS
        basicItem(EOItemRegistry.COBALT_HAMMER.get());
        basicItem(EOItemRegistry.COPPER_HAMMER.get());
        basicItem(EOItemRegistry.DIAMOND_HAMMER.get());
        basicItem(EOItemRegistry.IRON_HAMMER.get());
        basicItem(EOItemRegistry.STONE_HAMMER.get());

        //GEM CUTTER
        basicItem(EOItemRegistry.IRON_GEM_CUTTER.get());

        basicItem(EOItemRegistry.FINDER.get());

        //RAW ORES
        basicItem(EOItemRegistry.SULFUR.get());
        basicItem(EOItemRegistry.RAW_ALUMINUM.get());
        basicItem(EOItemRegistry.RAW_ARDITE.get());
        basicItem(EOItemRegistry.RAW_COBALT.get());
        basicItem(EOItemRegistry.RAW_IRIDIUM.get());
        basicItem(EOItemRegistry.RAW_LEAD.get());
        basicItem(EOItemRegistry.RAW_NICKEL.get());
        basicItem(EOItemRegistry.RAW_OSMIUM.get());
        basicItem(EOItemRegistry.RAW_PLATINUM.get());
        basicItem(EOItemRegistry.RAW_PLUTONIUM.get());
        basicItem(EOItemRegistry.RAW_SILVER.get());
        basicItem(EOItemRegistry.RAW_TIN.get());
        basicItem(EOItemRegistry.RAW_ULTIMATITANIUM.get());
        basicItem(EOItemRegistry.RAW_URANIUM.get());
        basicItem(EOItemRegistry.RAW_ZINC.get());
        basicItem(EOItemRegistry.RAW_GALLIUM.get());
        basicItem(EOItemRegistry.RAW_URANINITE.get());
        basicItem(EOItemRegistry.RAW_CATALYRIUM.get());
        basicItem(EOItemRegistry.RAW_TUNGSTEN.get());

        //INGOTS
        basicItem(EOItemRegistry.ALUMINUM_INGOT.get());
        basicItem(EOItemRegistry.ARDITE_INGOT.get());
        basicItem(EOItemRegistry.BRONZE_INGOT.get());
        basicItem(EOItemRegistry.COBALT_INGOT.get());
        basicItem(EOItemRegistry.CONSTANTAN_INGOT.get());
        basicItem(EOItemRegistry.ELECTRUM_INGOT.get());
        basicItem(EOItemRegistry.ENDERIUM_INGOT.get());
        basicItem(EOItemRegistry.ETERNAL_DARK_INGOT.get());
        basicItem(EOItemRegistry.ETERNAL_LIGHT_INGOT.get());
        basicItem(EOItemRegistry.GRAPHITE_INGOT.get());
        basicItem(EOItemRegistry.INVAR_INGOT.get());
        basicItem(EOItemRegistry.IRIDIUM_INGOT.get());
        basicItem(EOItemRegistry.LEAD_INGOT.get());
        basicItem(EOItemRegistry.LUMIUM_INGOT.get());
        basicItem(EOItemRegistry.NICKEL_INGOT.get());
        basicItem(EOItemRegistry.OSMIUM_INGOT.get());
        basicItem(EOItemRegistry.PLATINUM_INGOT.get());
        basicItem(EOItemRegistry.PLUTONIUM_INGOT.get());
        basicItem(EOItemRegistry.REDSTONE_INGOT.get());
        basicItem(EOItemRegistry.SIGNALUM_INGOT.get());
        basicItem(EOItemRegistry.SILVER_INGOT.get());
        basicItem(EOItemRegistry.STEEL_INGOT.get());
        basicItem(EOItemRegistry.TIN_INGOT.get());
        basicItem(EOItemRegistry.ULTIMATITANIUM_INGOT.get());
        basicItem(EOItemRegistry.URANIUM_INGOT.get());
        basicItem(EOItemRegistry.ZINC_INGOT.get());
        basicItem(EOItemRegistry.BRASS_INGOT.get());
        basicItem(EOItemRegistry.BLUE_STEEL_INGOT.get());
        basicItem(EOItemRegistry.GALLIUM_INGOT.get());
        basicItem(EOItemRegistry.TITANIUM_INGOT.get());
        basicItem(EOItemRegistry.PEWTER_INGOT.get());
        basicItem(EOItemRegistry.ROSE_GOLD_INGOT.get());
        basicItem(EOItemRegistry.BRITANNIA_SILVER_INGOT.get());
        basicItem(EOItemRegistry.CAST_IRON_INGOT.get());
        basicItem(EOItemRegistry.URANINITE_INGOT.get());
        basicItem(EOItemRegistry.CAST_STEEL_INGOT.get());
        basicItem(EOItemRegistry.WROUGHT_IRON_INGOT.get());
        basicItem(EOItemRegistry.NETHERSTEEL_INGOT.get());
        basicItem(EOItemRegistry.SHADOWSTEEL_INGOT.get());
        basicItem(EOItemRegistry.PIG_IRON_INGOT.get());
        basicItem(EOItemRegistry.MISSING_INGOT.get());
        basicItem(EOItemRegistry.CATALYRIUM_INGOT.get());
        basicItem(EOItemRegistry.TUNGSTEN_INGOT.get());
        basicItem(EOItemRegistry.SILICON_INGOT.get());

        //NUGGETS
        basicItem(EOItemRegistry.ALUMINUM_NUGGET.get());
        basicItem(EOItemRegistry.ARDITE_NUGGET.get());
        basicItem(EOItemRegistry.BRONZE_NUGGET.get());
        basicItem(EOItemRegistry.COBALT_NUGGET.get());
        basicItem(EOItemRegistry.CONSTANTAN_NUGGET.get());
        basicItem(EOItemRegistry.COPPER_NUGGET.get());
        basicItem(EOItemRegistry.ELECTRUM_NUGGET.get());
        basicItem(EOItemRegistry.ENDERIUM_NUGGET.get());
        basicItem(EOItemRegistry.INVAR_NUGGET.get());
        basicItem(EOItemRegistry.LEAD_NUGGET.get());
        basicItem(EOItemRegistry.LUMIUM_NUGGET.get());
        basicItem(EOItemRegistry.NICKEL_NUGGET.get());
        basicItem(EOItemRegistry.OSMIUM_NUGGET.get());
        basicItem(EOItemRegistry.PLATINUM_NUGGET.get());
        basicItem(EOItemRegistry.PLUTONIUM_NUGGET.get());
        basicItem(EOItemRegistry.TIN_NUGGET.get());
        basicItem(EOItemRegistry.SIGNALUM_NUGGET.get());
        basicItem(EOItemRegistry.SILVER_NUGGET.get());
        basicItem(EOItemRegistry.ULTIMATITANIUM_NUGGET.get());
        basicItem(EOItemRegistry.URANIUM_NUGGET.get());
        basicItem(EOItemRegistry.ZINC_NUGGET.get());
        basicItem(EOItemRegistry.GRAPHITE_NUGGET.get());
        basicItem(EOItemRegistry.BRASS_NUGGET.get());
        basicItem(EOItemRegistry.NETHERITE_NUGGET.get());
        basicItem(EOItemRegistry.STEEL_NUGGET.get());
        basicItem(EOItemRegistry.BLUE_STEEL_NUGGET.get());
        basicItem(EOItemRegistry.GALLIUM_NUGGET.get());
        basicItem(EOItemRegistry.TITANIUM_NUGGET.get());
        basicItem(EOItemRegistry.PEWTER_NUGGET.get());
        basicItem(EOItemRegistry.ROSE_GOLD_NUGGET.get());
        basicItem(EOItemRegistry.BRITANNIA_SILVER_NUGGET.get());
        basicItem(EOItemRegistry.IRIDIUM_NUGGET.get());
        basicItem(EOItemRegistry.CAST_IRON_NUGGET.get());
        basicItem(EOItemRegistry.URANINITE_NUGGET.get());
        basicItem(EOItemRegistry.CAST_STEEL_NUGGET.get());
        basicItem(EOItemRegistry.WROUGHT_IRON_NUGGET.get());
        basicItem(EOItemRegistry.NETHERSTEEL_NUGGET.get());
        basicItem(EOItemRegistry.SHADOWSTEEL_NUGGET.get());
        basicItem(EOItemRegistry.PIG_IRON_NUGGET.get());
        basicItem(EOItemRegistry.CATALYRIUM_NUGGET.get());
        basicItem(EOItemRegistry.TUNGSTEN_NUGGET.get());

        //DUSTS
        basicItem(EOItemRegistry.ALUMINUM_DUST.get());
        basicItem(EOItemRegistry.ARDITE_DUST.get());
        basicItem(EOItemRegistry.BRONZE_DUST.get());
        basicItem(EOItemRegistry.COBALT_DUST.get());
        basicItem(EOItemRegistry.CONSTANTAN_DUST.get());
        basicItem(EOItemRegistry.COPPER_DUST.get());
        basicItem(EOItemRegistry.ELECTRUM_DUST.get());
        basicItem(EOItemRegistry.ENDERIUM_DUST.get());
        basicItem(EOItemRegistry.ENDER_DUST.get());
        basicItem(EOItemRegistry.FLUORITE_DUST.get());
        basicItem(EOItemRegistry.GOLD_DUST.get());
        basicItem(EOItemRegistry.INVAR_DUST.get());
        basicItem(EOItemRegistry.IRON_DUST.get());
        basicItem(EOItemRegistry.LEAD_DUST.get());
        basicItem(EOItemRegistry.LUMIUM_DUST.get());
        basicItem(EOItemRegistry.NICKEL_DUST.get());
        basicItem(EOItemRegistry.OSMIUM_DUST.get());
        basicItem(EOItemRegistry.PLATINUM_DUST.get());
        basicItem(EOItemRegistry.PLUTONIUM_DUST.get());
        basicItem(EOItemRegistry.SULFUR_DUST.get());
        basicItem(EOItemRegistry.TIN_DUST.get());
        basicItem(EOItemRegistry.SIGNALUM_DUST.get());
        basicItem(EOItemRegistry.SILVER_DUST.get());
        basicItem(EOItemRegistry.ULTIMATITANIUM_DUST.get());
        basicItem(EOItemRegistry.URANIUM_DUST.get());
        basicItem(EOItemRegistry.ZINC_DUST.get());
        basicItem(EOItemRegistry.BRASS_DUST.get());
        basicItem(EOItemRegistry.NETHERITE_DUST.get());
        basicItem(EOItemRegistry.GRAPHITE_DUST.get());
        basicItem(EOItemRegistry.STEEL_DUST.get());
        basicItem(EOItemRegistry.SAPPHIRE_DUST.get());
        basicItem(EOItemRegistry.COAL_DUST.get());
        basicItem(EOItemRegistry.APATITE_DUST.get());
        basicItem(EOItemRegistry.CINNABAR_DUST.get());
        basicItem(EOItemRegistry.RUBY_DUST.get());
        basicItem(EOItemRegistry.ONYX_DUST.get());
        basicItem(EOItemRegistry.AMBER_DUST.get());
        basicItem(EOItemRegistry.NITER_DUST.get());
        basicItem(EOItemRegistry.BLUE_STEEL_DUST.get());
        basicItem(EOItemRegistry.GALLIUM_DUST.get());
        basicItem(EOItemRegistry.EMERALD_DUST.get());
        basicItem(EOItemRegistry.DIAMOND_DUST.get());
        basicItem(EOItemRegistry.LAPIS_LAZULI_DUST.get());
        basicItem(EOItemRegistry.TITANIUM_DUST.get());
        basicItem(EOItemRegistry.QUARTZ_DUST.get());
        basicItem(EOItemRegistry.PERIDOT_DUST.get());
        basicItem(EOItemRegistry.OBSIDIAN_DUST.get());
        basicItem(EOItemRegistry.NETHERRACK_DUST.get());
        basicItem(EOItemRegistry.ENDSTONE_DUST.get());
        basicItem(EOItemRegistry.PEWTER_DUST.get());
        basicItem(EOItemRegistry.ROSE_GOLD_DUST.get());
        basicItem(EOItemRegistry.BRITANNIA_SILVER_DUST.get());
        basicItem(EOItemRegistry.IRIDIUM_DUST.get());
        basicItem(EOItemRegistry.CAST_IRON_DUST.get());
        basicItem(EOItemRegistry.URANINITE_DUST.get());
        basicItem(EOItemRegistry.CAST_STEEL_DUST.get());
        basicItem(EOItemRegistry.WROUGHT_IRON_DUST.get());
        basicItem(EOItemRegistry.NETHERSTEEL_DUST.get());
        basicItem(EOItemRegistry.SHADOWSTEEL_DUST.get());
        basicItem(EOItemRegistry.PIG_IRON_DUST.get());
        basicItem(EOItemRegistry.NECROTICARITE_DUST.get());
        basicItem(EOItemRegistry.SCULK_DUST.get());
        basicItem(EOItemRegistry.AMETHYST_DUST.get());
        basicItem(EOItemRegistry.NETHER_STAR_DUST.get());
        basicItem(EOItemRegistry.CATALYRIUM_DUST.get());
        basicItem(EOItemRegistry.TACHYARITE_DUST.get());
        basicItem(EOItemRegistry.QUANTIQUARITE_DUST.get());
        basicItem(EOItemRegistry.VOIDERITE_DUST.get());
        basicItem(EOItemRegistry.TUNGSTEN_DUST.get());
        basicItem(EOItemRegistry.CARBON_BLEND.get());
        basicItem(EOItemRegistry.ENERGETIC_BLEND.get());
        basicItem(EOItemRegistry.ENDERGETIC_BLEND.get());
        basicItem(EOItemRegistry.SILICON_DUST.get());
        basicItem(EOItemRegistry.PRISMARINE_DUST.get());

        //RODS
        basicItem(EOItemRegistry.ROD_ALUMINUM.get());
        basicItem(EOItemRegistry.ROD_ARDITE.get());
        basicItem(EOItemRegistry.ROD_BRONZE.get());
        basicItem(EOItemRegistry.ROD_COBALT.get());
        basicItem(EOItemRegistry.ROD_CONSTANTAN.get());
        basicItem(EOItemRegistry.ROD_COPPER.get());
        basicItem(EOItemRegistry.ROD_ELECTRUM.get());
        basicItem(EOItemRegistry.ROD_ENDERIUM.get());
        basicItem(EOItemRegistry.ROD_GOLD.get());
        basicItem(EOItemRegistry.ROD_INVAR.get());
        basicItem(EOItemRegistry.ROD_IRON.get());
        basicItem(EOItemRegistry.ROD_LEAD.get());
        basicItem(EOItemRegistry.ROD_LUMIUM.get());
        basicItem(EOItemRegistry.ROD_NICKEL.get());
        basicItem(EOItemRegistry.ROD_OSMIUM.get());
        basicItem(EOItemRegistry.ROD_PLATINUM.get());
        basicItem(EOItemRegistry.ROD_PLUTONIUM.get());
        basicItem(EOItemRegistry.ROD_TIN.get());
        basicItem(EOItemRegistry.ROD_SILVER.get());
        basicItem(EOItemRegistry.ROD_SIGNALUM.get());
        basicItem(EOItemRegistry.ROD_ULTIMATITANIUM.get());
        basicItem(EOItemRegistry.ROD_URANIUM.get());
        basicItem(EOItemRegistry.ROD_ZINC.get());
        basicItem(EOItemRegistry.ROD_GRAPHITE.get());
        basicItem(EOItemRegistry.ROD_BRASS.get());
        basicItem(EOItemRegistry.ROD_NETHERITE.get());
        basicItem(EOItemRegistry.ROD_STEEL.get());
        basicItem(EOItemRegistry.ROD_SAPPHIRE.get());
        basicItem(EOItemRegistry.ROD_BLUE_STEEL.get());
        basicItem(EOItemRegistry.ROD_GALLIUM.get());
        basicItem(EOItemRegistry.ROD_TITANIUM.get());
        basicItem(EOItemRegistry.ROD_ROSE_GOLD.get());
        basicItem(EOItemRegistry.ROD_DIAMOND.get());
        basicItem(EOItemRegistry.ROD_IRIDIUM.get());
        basicItem(EOItemRegistry.ROD_CAST_IRON.get());
        basicItem(EOItemRegistry.ROD_CAST_STEEL.get());
        basicItem(EOItemRegistry.ROD_WROUGHT_IRON.get());
        basicItem(EOItemRegistry.ROD_NETHERSTEEL.get());
        basicItem(EOItemRegistry.ROD_SHADOWSTEEL.get());
        basicItem(EOItemRegistry.ROD_PIG_IRON.get());
        basicItem(EOItemRegistry.ROD_NECROTICARITE.get());
        basicItem(EOItemRegistry.ROD_CATALYRIUM.get());
        basicItem(EOItemRegistry.ROD_TACHYARITE.get());
        basicItem(EOItemRegistry.ROD_QUANTIQUARITE.get());
        basicItem(EOItemRegistry.ROD_VOIDERITE.get());
        basicItem(EOItemRegistry.ROD_TUNGSTEN.get());

        //PLATES
        basicItem(EOItemRegistry.PLATE_ALUMINUM.get());
        basicItem(EOItemRegistry.PLATE_ARDITE.get());
        basicItem(EOItemRegistry.PLATE_BRONZE.get());
        basicItem(EOItemRegistry.PLATE_COBALT.get());
        basicItem(EOItemRegistry.PLATE_CONSTANTAN.get());
        basicItem(EOItemRegistry.PLATE_COPPER.get());
        basicItem(EOItemRegistry.PLATE_ELECTRUM.get());
        basicItem(EOItemRegistry.PLATE_ENDERIUM.get());
        basicItem(EOItemRegistry.PLATE_GOLD.get());
        basicItem(EOItemRegistry.PLATE_INVAR.get());
        basicItem(EOItemRegistry.PLATE_IRON.get());
        basicItem(EOItemRegistry.PLATE_LEAD.get());
        basicItem(EOItemRegistry.PLATE_LUMIUM.get());
        basicItem(EOItemRegistry.PLATE_NICKEL.get());
        basicItem(EOItemRegistry.PLATE_OSMIUM.get());
        basicItem(EOItemRegistry.PLATE_PLATINUM.get());
        basicItem(EOItemRegistry.PLATE_PLUTONIUM.get());
        basicItem(EOItemRegistry.PLATE_SIGNALUM.get());
        basicItem(EOItemRegistry.PLATE_SILVER.get());
        basicItem(EOItemRegistry.PLATE_TIN.get());
        basicItem(EOItemRegistry.PLATE_ULTIMATITANIUM.get());
        basicItem(EOItemRegistry.PLATE_URANIUM.get());
        basicItem(EOItemRegistry.PLATE_ZINC.get());
        basicItem(EOItemRegistry.PLATE_GRAPHITE.get());
        basicItem(EOItemRegistry.PLATE_BRASS.get());
        basicItem(EOItemRegistry.PLATE_NETHERITE.get());
        basicItem(EOItemRegistry.PLATE_STEEL.get());
        basicItem(EOItemRegistry.PLATE_SAPPHIRE.get());
        basicItem(EOItemRegistry.PLATE_BLUE_STEEL.get());
        basicItem(EOItemRegistry.PLATE_GALLIUM.get());
        basicItem(EOItemRegistry.PLATE_TITANIUM.get());
        basicItem(EOItemRegistry.PLATE_ROSE_GOLD.get());
        basicItem(EOItemRegistry.PLATE_IRIDIUM.get());
        basicItem(EOItemRegistry.PLATE_DIAMOND.get());
        basicItem(EOItemRegistry.PLATE_CAST_IRON.get());
        basicItem(EOItemRegistry.PLATE_CAST_STEEL.get());
        basicItem(EOItemRegistry.PLATE_WROUGHT_IRON.get());
        basicItem(EOItemRegistry.PLATE_NETHERSTEEL.get());
        basicItem(EOItemRegistry.PLATE_SHADOWSTEEL.get());
        basicItem(EOItemRegistry.PLATE_PIG_IRON.get());
        basicItem(EOItemRegistry.PLATE_NECROTICARITE.get());
        basicItem(EOItemRegistry.PLATE_CATALYRIUM.get());
        basicItem(EOItemRegistry.PLATE_QUANTIQUARITE.get());
        basicItem(EOItemRegistry.PLATE_TACHYARITE.get());
        basicItem(EOItemRegistry.PLATE_VOIDERITE.get());
        basicItem(EOItemRegistry.PLATE_TUNGSTEN.get());

        //GEARS
        basicItem(EOItemRegistry.GEAR_ALUMINUM.get());
        basicItem(EOItemRegistry.GEAR_ARDITE.get());
        basicItem(EOItemRegistry.GEAR_BRONZE.get());
        basicItem(EOItemRegistry.GEAR_COPPER.get());
        basicItem(EOItemRegistry.GEAR_DIAMOND.get());
        basicItem(EOItemRegistry.GEAR_ENDERIUM.get());
        basicItem(EOItemRegistry.GEAR_GOLD.get());
        basicItem(EOItemRegistry.GEAR_IRON.get());
        basicItem(EOItemRegistry.GEAR_LEAD.get());
        basicItem(EOItemRegistry.GEAR_OSMIUM.get());
        basicItem(EOItemRegistry.GEAR_STEEL.get());
        basicItem(EOItemRegistry.GEAR_TIN.get());
        basicItem(EOItemRegistry.ULTIMATE_GEAR.get());
        basicItem(EOItemRegistry.GEAR_NECROTICARITE.get());
        basicItem(EOItemRegistry.GEAR_CATALYRIUM.get());
        basicItem(EOItemRegistry.GEAR_VOIDERITE.get());
        basicItem(EOItemRegistry.GEAR_QUANTIQUARITE.get());
        basicItem(EOItemRegistry.GEAR_TACHYARITE.get());

        //GEMS
        basicItem(EOItemRegistry.FLUORITE.get());
        basicItem(EOItemRegistry.GEM_SAPPHIRE.get());
        basicItem(EOItemRegistry.GEM_ONYX.get());
        basicItem(EOItemRegistry.GEM_OBSIDIAN_SHARD.get());
        basicItem(EOItemRegistry.GEM_PERIDOT.get());
        basicItem(EOItemRegistry.GEM_RUBY.get());
        basicItem(EOItemRegistry.GEM_APATITE.get());
        basicItem(EOItemRegistry.GEM_CINNABAR.get());
        basicItem(EOItemRegistry.GEM_AMBER.get());
        basicItem(EOItemRegistry.GEM_NITER.get());
        basicItem(EOItemRegistry.GEM_TACHYARITE.get());
        basicItem(EOItemRegistry.GEM_VOIDERITE.get());
        basicItem(EOItemRegistry.GEM_QUANTIQUARITE.get());
        basicItem(EOItemRegistry.GEM_NECROTICARITE.get());

        //GEM SHARDS
        basicItem(EOItemRegistry.GEM_SAPPHIRE_SHARD.get());

        //Misc
        basicItem(EOItemRegistry.SILICON.get());

        ///MekCompat
        basicItem(EOMekCompatItems.ALUMINUM_DIRTY_DUST.get());
        basicItem(EOMekCompatItems.ALUMINUM_CLUMP.get());
        basicItem(EOMekCompatItems.ALUMINUM_SHARD.get());
        basicItem(EOMekCompatItems.ALUMINUM_CRYSTAL.get());

        basicItem(EOMekCompatItems.ARDITE_DIRTY_DUST.get());
        basicItem(EOMekCompatItems.ARDITE_CLUMP.get());
        basicItem(EOMekCompatItems.ARDITE_SHARD.get());
        basicItem(EOMekCompatItems.ARDITE_CRYSTAL.get());

        basicItem(EOMekCompatItems.CATALYRIUM_DIRTY_DUST.get());
        basicItem(EOMekCompatItems.CATALYRIUM_CLUMP.get());
        basicItem(EOMekCompatItems.CATALYRIUM_SHARD.get());
        basicItem(EOMekCompatItems.CATALYRIUM_CRYSTAL.get());

        basicItem(EOMekCompatItems.COBALT_DIRTY_DUST.get());
        basicItem(EOMekCompatItems.COBALT_CLUMP.get());
        basicItem(EOMekCompatItems.COBALT_SHARD.get());
        basicItem(EOMekCompatItems.COBALT_CRYSTAL.get());

        basicItem(EOMekCompatItems.GALLIUM_DIRTY_DUST.get());
        basicItem(EOMekCompatItems.GALLIUM_CLUMP.get());
        basicItem(EOMekCompatItems.GALLIUM_SHARD.get());
        basicItem(EOMekCompatItems.GALLIUM_CRYSTAL.get());

        basicItem(EOMekCompatItems.IRIDIUM_DIRTY_DUST.get());
        basicItem(EOMekCompatItems.IRIDIUM_CLUMP.get());
        basicItem(EOMekCompatItems.IRIDIUM_SHARD.get());
        basicItem(EOMekCompatItems.IRIDIUM_CRYSTAL.get());

        basicItem(EOMekCompatItems.NICKEL_DIRTY_DUST.get());
        basicItem(EOMekCompatItems.NICKEL_CLUMP.get());
        basicItem(EOMekCompatItems.NICKEL_SHARD.get());
        basicItem(EOMekCompatItems.NICKEL_CRYSTAL.get());

        basicItem(EOMekCompatItems.PLATINUM_DIRTY_DUST.get());
        basicItem(EOMekCompatItems.PLATINUM_CLUMP.get());
        basicItem(EOMekCompatItems.PLATINUM_SHARD.get());
        basicItem(EOMekCompatItems.PLATINUM_CRYSTAL.get());

        basicItem(EOMekCompatItems.SILVER_DIRTY_DUST.get());
        basicItem(EOMekCompatItems.SILVER_CLUMP.get());
        basicItem(EOMekCompatItems.SILVER_SHARD.get());
        basicItem(EOMekCompatItems.SILVER_CRYSTAL.get());

        basicItem(EOMekCompatItems.URANINITE_DIRTY_DUST.get());
        basicItem(EOMekCompatItems.URANINITE_CLUMP.get());
        basicItem(EOMekCompatItems.URANINITE_SHARD.get());
        basicItem(EOMekCompatItems.URANINITE_CRYSTAL.get());

        basicItem(EOMekCompatItems.ZINC_DIRTY_DUST.get());
        basicItem(EOMekCompatItems.ZINC_CLUMP.get());
        basicItem(EOMekCompatItems.ZINC_SHARD.get());
        basicItem(EOMekCompatItems.ZINC_CRYSTAL.get());

        ///OritechCompat
        basicItem(EOritechItemRegistry.O_ALUMINUM_CLUMP.get());
        basicItem(EOritechItemRegistry.O_ALUMINUM_GEM.get());
        basicItem(EOritechItemRegistry.O_ALUMINUM_SMALL_CLUMP.get());
        basicItem(EOritechItemRegistry.O_ALUMINUM_SMALL_DUST.get());

        basicItem(EOritechItemRegistry.O_ARDITE_CLUMP.get());
        basicItem(EOritechItemRegistry.O_ARDITE_GEM.get());
        basicItem(EOritechItemRegistry.O_ARDITE_SMALL_CLUMP.get());
        basicItem(EOritechItemRegistry.O_ARDITE_SMALL_DUST.get());

        basicItem(EOritechItemRegistry.O_CATALYRIUM_CLUMP.get());
        basicItem(EOritechItemRegistry.O_CATALYRIUM_GEM.get());
        basicItem(EOritechItemRegistry.O_CATALYRIUM_SMALL_CLUMP.get());
        basicItem(EOritechItemRegistry.O_CATALYRIUM_SMALL_DUST.get());

        basicItem(EOritechItemRegistry.O_COBALT_CLUMP.get());
        basicItem(EOritechItemRegistry.O_COBALT_GEM.get());
        basicItem(EOritechItemRegistry.O_COBALT_SMALL_CLUMP.get());
        basicItem(EOritechItemRegistry.O_COBALT_SMALL_DUST.get());

        basicItem(EOritechItemRegistry.O_GALLIUM_CLUMP.get());
        basicItem(EOritechItemRegistry.O_GALLIUM_GEM.get());
        basicItem(EOritechItemRegistry.O_GALLIUM_SMALL_CLUMP.get());
        basicItem(EOritechItemRegistry.O_GALLIUM_SMALL_DUST.get());

        basicItem(EOritechItemRegistry.O_IRIDIUM_CLUMP.get());
        basicItem(EOritechItemRegistry.O_IRIDIUM_GEM.get());
        basicItem(EOritechItemRegistry.O_IRIDIUM_SMALL_CLUMP.get());
        basicItem(EOritechItemRegistry.O_IRIDIUM_SMALL_DUST.get());

        basicItem(EOritechItemRegistry.O_LEAD_CLUMP.get());
        basicItem(EOritechItemRegistry.O_LEAD_GEM.get());
        basicItem(EOritechItemRegistry.O_LEAD_SMALL_CLUMP.get());
        basicItem(EOritechItemRegistry.O_LEAD_SMALL_DUST.get());

        basicItem(EOritechItemRegistry.O_OSMIUM_CLUMP.get());
        basicItem(EOritechItemRegistry.O_OSMIUM_GEM.get());
        basicItem(EOritechItemRegistry.O_OSMIUM_SMALL_CLUMP.get());
        basicItem(EOritechItemRegistry.O_OSMIUM_SMALL_DUST.get());

        basicItem(EOritechItemRegistry.O_SILVER_CLUMP.get());
        basicItem(EOritechItemRegistry.O_SILVER_GEM.get());
        basicItem(EOritechItemRegistry.O_SILVER_SMALL_CLUMP.get());
        basicItem(EOritechItemRegistry.O_SILVER_SMALL_DUST.get());

        basicItem(EOritechItemRegistry.O_TIN_CLUMP.get());
        basicItem(EOritechItemRegistry.O_TIN_GEM.get());
        basicItem(EOritechItemRegistry.O_TIN_SMALL_CLUMP.get());
        basicItem(EOritechItemRegistry.O_TIN_SMALL_DUST.get());

        basicItem(EOritechItemRegistry.O_TUNGSTEN_CLUMP.get());
        basicItem(EOritechItemRegistry.O_TUNGSTEN_GEM.get());
        basicItem(EOritechItemRegistry.O_TUNGSTEN_SMALL_CLUMP.get());
        basicItem(EOritechItemRegistry.O_TUNGSTEN_SMALL_DUST.get());

        basicItem(EOritechItemRegistry.O_URANINITE_CLUMP.get());
        basicItem(EOritechItemRegistry.O_URANINITE_GEM.get());
        basicItem(EOritechItemRegistry.O_URANINITE_SMALL_CLUMP.get());
        basicItem(EOritechItemRegistry.O_URANINITE_SMALL_DUST.get());

        basicItem(EOritechItemRegistry.O_URANIUM_CLUMP.get());
        basicItem(EOritechItemRegistry.O_URANIUM_GEM.get());
        basicItem(EOritechItemRegistry.O_URANIUM_SMALL_CLUMP.get());
        basicItem(EOritechItemRegistry.O_URANIUM_SMALL_DUST.get());

        basicItem(EOritechItemRegistry.O_ZINC_CLUMP.get());
        basicItem(EOritechItemRegistry.O_ZINC_GEM.get());
        basicItem(EOritechItemRegistry.O_ZINC_SMALL_CLUMP.get());
        basicItem(EOritechItemRegistry.O_ZINC_SMALL_DUST.get());
    }

    /**This modifies the behavior of "basicItem" in ItemModelProvider by changing how it searches for item textures.
    * Instead of only looking in textures/item/, it now checks multiple possible paths dynamically.
    * <p>
    * To add more custom texture paths, simply add a new path inside `possiblePaths` (e.g., basePath + "your_new_folder/" + itemName).
    * <p>
    * If no specific texture is found, it defaults to textures/item/.
    * <p>
    * Special case: If the texture is inside "rods/" or "hammers/", it applies the "handheld" parent model instead of "generated".
    * <p>
    * If you want to add more item categories to use the "handheld" model,
    * simply add `|| path.contains("your_folder/")` right before the builder.
    * <p>
    * Example:
    * if(path.contains("rods/") || path.contains("hammers/") || path.contains("your_folder/")) {
    *     builder = this.getBuilder(item.toString())
    *             .parent(new ModelFile.UncheckedModelFile("item/handheld"))
    *             .texture("layer0", ResourceLocation.fromNamespaceAndPath(item.getNamespace(), path));
    * }
    * <p>
    * This ensures that any new item category added will automatically use the "handheld" model
    * instead of the default "generated" model.
    * <p>
    * If no matching texture is found, it will use textures/item/item_name.png as a fallback.
    * <p>
    * Why was this done?
    * <p>
    * Simply because my adhd won this time
     * */

    public @NotNull ItemModelBuilder basicItem(ResourceLocation item)
    {
        String itemName = item.getPath();
        String basePath = "item/";

        String[] possiblePaths =
                {
                basePath + itemName,
                basePath + "hammers/" + itemName,
                basePath + "ingots/" + itemName,
                basePath + "rods/" + itemName,
                basePath + "nuggets/" + itemName,
                basePath + "gems/" + itemName,
                basePath + "gears/" + itemName,
                basePath + "raw_materials/" + itemName,
                basePath + "gem_cutters/" + itemName,
                basePath + "misc/" + itemName,
                basePath + "dusts/" + itemName,
                basePath + "plates/" + itemName,
                basePath + "dirty_dusts/" + itemName,
                basePath + "clumps/" + itemName,
                basePath + "shards/" + itemName,
                basePath + "crystals/" + itemName,
                basePath + "small_clumps/" + itemName,
                basePath + "small_dusts/" + itemName,
                basePath + "ore_gem/" + itemName
        };

        ItemModelBuilder builder = null;

        for(String path : possiblePaths)
        {
            if(existingFileHelper.exists(ResourceLocation.fromNamespaceAndPath(item.getNamespace(), path), TEXTURE))
            {
                if(path.contains("rods/") || path.contains("hammers/"))
                {
                    builder = this.getBuilder(item.toString())
                            .parent(new ModelFile.UncheckedModelFile("item/handheld"))
                            .texture("layer0", ResourceLocation.fromNamespaceAndPath(item.getNamespace(), path));
                }
                else
                {
                    builder = this.getBuilder(item.toString())
                            .parent(new ModelFile.UncheckedModelFile("item/generated"))
                            .texture("layer0", ResourceLocation.fromNamespaceAndPath(item.getNamespace(), path));
                }
                break;
            }
        }
        if(builder == null)
        {
            builder = this.getBuilder(item.toString())
                    .parent(new ModelFile.UncheckedModelFile("item/generated"))
                    .texture("layer0", ResourceLocation.fromNamespaceAndPath(item.getNamespace(), basePath + itemName));
        }
        return builder;
    }
}
