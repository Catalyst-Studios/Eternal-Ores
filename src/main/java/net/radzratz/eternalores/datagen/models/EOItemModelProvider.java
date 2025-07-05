package net.radzratz.eternalores.datagen.models;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.item.EOItems;
import net.radzratz.eternalores.util.compat.mekanism.EOMekCompatItems;
import org.jetbrains.annotations.NotNull;

public class EOItemModelProvider extends ItemModelProvider
{
    public EOItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper)
    {
        super(output, EternalOres.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels()
    {
        //HAMMERS
        basicItem(EOItems.COBALT_HAMMER.get());
        basicItem(EOItems.COPPER_HAMMER.get());
        basicItem(EOItems.DIAMOND_HAMMER.get());
        basicItem(EOItems.IRON_HAMMER.get());
        basicItem(EOItems.STONE_HAMMER.get());

        //GEM CUTTER
        basicItem(EOItems.IRON_GEM_CUTTER.get());

        basicItem(EOItems.FINDER.get());

        //RAW ORES
        basicItem(EOItems.SULFUR.get());
        basicItem(EOItems.RAW_ALUMINUM.get());
        basicItem(EOItems.RAW_ARDITE.get());
        basicItem(EOItems.RAW_COBALT.get());
        basicItem(EOItems.RAW_IRIDIUM.get());
        basicItem(EOItems.RAW_LEAD.get());
        basicItem(EOItems.RAW_NICKEL.get());
        basicItem(EOItems.RAW_OSMIUM.get());
        basicItem(EOItems.RAW_PLATINUM.get());
        basicItem(EOItems.RAW_PLUTONIUM.get());
        basicItem(EOItems.RAW_SILVER.get());
        basicItem(EOItems.RAW_TIN.get());
        basicItem(EOItems.RAW_ULTIMATITANIUM.get());
        basicItem(EOItems.RAW_URANIUM.get());
        basicItem(EOItems.RAW_ZINC.get());
        basicItem(EOItems.RAW_GALLIUM.get());
        basicItem(EOItems.RAW_URANINITE.get());
        basicItem(EOItems.RAW_CATALYRIUM.get());

        //INGOTS
        basicItem(EOItems.ALUMINUM_INGOT.get());
        basicItem(EOItems.ARDITE_INGOT.get());
        basicItem(EOItems.BRONZE_INGOT.get());
        basicItem(EOItems.COBALT_INGOT.get());
        basicItem(EOItems.CONSTANTAN_INGOT.get());
        basicItem(EOItems.ELECTRUM_INGOT.get());
        basicItem(EOItems.ENDERIUM_INGOT.get());
        basicItem(EOItems.ETERNAL_DARK_INGOT.get());
        basicItem(EOItems.ETERNAL_LIGHT_INGOT.get());
        basicItem(EOItems.GRAPHITE_INGOT.get());
        basicItem(EOItems.INVAR_INGOT.get());
        basicItem(EOItems.IRIDIUM_INGOT.get());
        basicItem(EOItems.LEAD_INGOT.get());
        basicItem(EOItems.LUMIUM_INGOT.get());
        basicItem(EOItems.NICKEL_INGOT.get());
        basicItem(EOItems.OSMIUM_INGOT.get());
        basicItem(EOItems.PLATINUM_INGOT.get());
        basicItem(EOItems.PLUTONIUM_INGOT.get());
        basicItem(EOItems.REDSTONE_INGOT.get());
        basicItem(EOItems.SIGNALUM_INGOT.get());
        basicItem(EOItems.SILVER_INGOT.get());
        basicItem(EOItems.STEEL_INGOT.get());
        basicItem(EOItems.TIN_INGOT.get());
        basicItem(EOItems.ULTIMATITANIUM_INGOT.get());
        basicItem(EOItems.URANIUM_INGOT.get());
        basicItem(EOItems.ZINC_INGOT.get());
        basicItem(EOItems.BRASS_INGOT.get());
        basicItem(EOItems.BLUE_STEEL_INGOT.get());
        basicItem(EOItems.GALLIUM_INGOT.get());
        basicItem(EOItems.TITANIUM_INGOT.get());
        basicItem(EOItems.PEWTER_INGOT.get());
        basicItem(EOItems.ROSE_GOLD_INGOT.get());
        basicItem(EOItems.BRITANNIA_SILVER_INGOT.get());
        basicItem(EOItems.CAST_IRON_INGOT.get());
        basicItem(EOItems.URANINITE_INGOT.get());
        basicItem(EOItems.CAST_STEEL_INGOT.get());
        basicItem(EOItems.WROUGHT_IRON_INGOT.get());
        basicItem(EOItems.NETHERSTEEL_INGOT.get());
        basicItem(EOItems.SHADOWSTEEL_INGOT.get());
        basicItem(EOItems.PIG_IRON_INGOT.get());
        basicItem(EOItems.MISSING_INGOT.get());
        basicItem(EOItems.CATALYRIUM_INGOT.get());

        //NUGGETS
        basicItem(EOItems.ALUMINUM_NUGGET.get());
        basicItem(EOItems.ARDITE_NUGGET.get());
        basicItem(EOItems.BRONZE_NUGGET.get());
        basicItem(EOItems.COBALT_NUGGET.get());
        basicItem(EOItems.CONSTANTAN_NUGGET.get());
        basicItem(EOItems.COPPER_NUGGET.get());
        basicItem(EOItems.ELECTRUM_NUGGET.get());
        basicItem(EOItems.ENDERIUM_NUGGET.get());
        basicItem(EOItems.INVAR_NUGGET.get());
        basicItem(EOItems.LEAD_NUGGET.get());
        basicItem(EOItems.LUMIUM_NUGGET.get());
        basicItem(EOItems.NICKEL_NUGGET.get());
        basicItem(EOItems.OSMIUM_NUGGET.get());
        basicItem(EOItems.PLATINUM_NUGGET.get());
        basicItem(EOItems.PLUTONIUM_NUGGET.get());
        basicItem(EOItems.TIN_NUGGET.get());
        basicItem(EOItems.SIGNALUM_NUGGET.get());
        basicItem(EOItems.SILVER_NUGGET.get());
        basicItem(EOItems.ULTIMATITANIUM_NUGGET.get());
        basicItem(EOItems.URANIUM_NUGGET.get());
        basicItem(EOItems.ZINC_NUGGET.get());
        basicItem(EOItems.GRAPHITE_NUGGET.get());
        basicItem(EOItems.BRASS_NUGGET.get());
        basicItem(EOItems.NETHERITE_NUGGET.get());
        basicItem(EOItems.STEEL_NUGGET.get());
        basicItem(EOItems.BLUE_STEEL_NUGGET.get());
        basicItem(EOItems.GALLIUM_NUGGET.get());
        basicItem(EOItems.TITANIUM_NUGGET.get());
        basicItem(EOItems.PEWTER_NUGGET.get());
        basicItem(EOItems.ROSE_GOLD_NUGGET.get());
        basicItem(EOItems.BRITANNIA_SILVER_NUGGET.get());
        basicItem(EOItems.IRIDIUM_NUGGET.get());
        basicItem(EOItems.CAST_IRON_NUGGET.get());
        basicItem(EOItems.URANINITE_NUGGET.get());
        basicItem(EOItems.CAST_STEEL_NUGGET.get());
        basicItem(EOItems.WROUGHT_IRON_NUGGET.get());
        basicItem(EOItems.NETHERSTEEL_NUGGET.get());
        basicItem(EOItems.SHADOWSTEEL_NUGGET.get());
        basicItem(EOItems.PIG_IRON_NUGGET.get());
        basicItem(EOItems.CATALYRIUM_NUGGET.get());

        //DUSTS
        basicItem(EOItems.ALUMINUM_DUST.get());
        basicItem(EOItems.ARDITE_DUST.get());
        basicItem(EOItems.BRONZE_DUST.get());
        basicItem(EOItems.COBALT_DUST.get());
        basicItem(EOItems.CONSTANTAN_DUST.get());
        basicItem(EOItems.COPPER_DUST.get());
        basicItem(EOItems.ELECTRUM_DUST.get());
        basicItem(EOItems.ENDERIUM_DUST.get());
        basicItem(EOItems.ENDER_DUST.get());
        basicItem(EOItems.FLUORITE_DUST.get());
        basicItem(EOItems.GOLD_DUST.get());
        basicItem(EOItems.INVAR_DUST.get());
        basicItem(EOItems.IRON_DUST.get());
        basicItem(EOItems.LEAD_DUST.get());
        basicItem(EOItems.LUMIUM_DUST.get());
        basicItem(EOItems.NICKEL_DUST.get());
        basicItem(EOItems.OSMIUM_DUST.get());
        basicItem(EOItems.PLATINUM_DUST.get());
        basicItem(EOItems.PLUTONIUM_DUST.get());
        basicItem(EOItems.SULFUR_DUST.get());
        basicItem(EOItems.TIN_DUST.get());
        basicItem(EOItems.SIGNALUM_DUST.get());
        basicItem(EOItems.SILVER_DUST.get());
        basicItem(EOItems.ULTIMATITANIUM_DUST.get());
        basicItem(EOItems.URANIUM_DUST.get());
        basicItem(EOItems.ZINC_DUST.get());
        basicItem(EOItems.BRASS_DUST.get());
        basicItem(EOItems.NETHERITE_DUST.get());
        basicItem(EOItems.GRAPHITE_DUST.get());
        basicItem(EOItems.STEEL_DUST.get());
        basicItem(EOItems.SAPPHIRE_DUST.get());
        basicItem(EOItems.COAL_DUST.get());
        basicItem(EOItems.APATITE_DUST.get());
        basicItem(EOItems.CINNABAR_DUST.get());
        basicItem(EOItems.RUBY_DUST.get());
        basicItem(EOItems.ONYX_DUST.get());
        basicItem(EOItems.AMBER_DUST.get());
        basicItem(EOItems.NITER_DUST.get());
        basicItem(EOItems.BLUE_STEEL_DUST.get());
        basicItem(EOItems.GALLIUM_DUST.get());
        basicItem(EOItems.EMERALD_DUST.get());
        basicItem(EOItems.DIAMOND_DUST.get());
        basicItem(EOItems.LAPIS_LAZULI_DUST.get());
        basicItem(EOItems.TITANIUM_DUST.get());
        basicItem(EOItems.QUARTZ_DUST.get());
        basicItem(EOItems.PERIDOT_DUST.get());
        basicItem(EOItems.OBSIDIAN_DUST.get());
        basicItem(EOItems.NETHERRACK_DUST.get());
        basicItem(EOItems.ENDSTONE_DUST.get());
        basicItem(EOItems.PEWTER_DUST.get());
        basicItem(EOItems.ROSE_GOLD_DUST.get());
        basicItem(EOItems.BRITANNIA_SILVER_DUST.get());
        basicItem(EOItems.IRIDIUM_DUST.get());
        basicItem(EOItems.CAST_IRON_DUST.get());
        basicItem(EOItems.URANINITE_DUST.get());
        basicItem(EOItems.CAST_STEEL_DUST.get());
        basicItem(EOItems.WROUGHT_IRON_DUST.get());
        basicItem(EOItems.NETHERSTEEL_DUST.get());
        basicItem(EOItems.SHADOWSTEEL_DUST.get());
        basicItem(EOItems.PIG_IRON_DUST.get());
        basicItem(EOItems.NECROTICARITE_DUST.get());
        basicItem(EOItems.SCULK_DUST.get());
        basicItem(EOItems.AMETHYST_DUST.get());
        basicItem(EOItems.NETHER_STAR_DUST.get());
        basicItem(EOItems.CATALYRIUM_DUST.get());
        basicItem(EOItems.TACHYARITE_DUST.get());
        basicItem(EOItems.QUANTIQUARITE_DUST.get());
        basicItem(EOItems.VOIDERITE_DUST.get());

        //RODS
        basicItem(EOItems.ROD_ALUMINUM.get());
        basicItem(EOItems.ROD_ARDITE.get());
        basicItem(EOItems.ROD_BRONZE.get());
        basicItem(EOItems.ROD_COBALT.get());
        basicItem(EOItems.ROD_CONSTANTAN.get());
        basicItem(EOItems.ROD_COPPER.get());
        basicItem(EOItems.ROD_ELECTRUM.get());
        basicItem(EOItems.ROD_ENDERIUM.get());
        basicItem(EOItems.ROD_GOLD.get());
        basicItem(EOItems.ROD_INVAR.get());
        basicItem(EOItems.ROD_IRON.get());
        basicItem(EOItems.ROD_LEAD.get());
        basicItem(EOItems.ROD_LUMIUM.get());
        basicItem(EOItems.ROD_NICKEL.get());
        basicItem(EOItems.ROD_OSMIUM.get());
        basicItem(EOItems.ROD_PLATINUM.get());
        basicItem(EOItems.ROD_PLUTONIUM.get());
        basicItem(EOItems.ROD_TIN.get());
        basicItem(EOItems.ROD_SILVER.get());
        basicItem(EOItems.ROD_SIGNALUM.get());
        basicItem(EOItems.ROD_ULTIMATITANIUM.get());
        basicItem(EOItems.ROD_URANIUM.get());
        basicItem(EOItems.ROD_ZINC.get());
        basicItem(EOItems.ROD_GRAPHITE.get());
        basicItem(EOItems.ROD_BRASS.get());
        basicItem(EOItems.ROD_NETHERITE.get());
        basicItem(EOItems.ROD_STEEL.get());
        basicItem(EOItems.ROD_SAPPHIRE.get());
        basicItem(EOItems.ROD_BLUE_STEEL.get());
        basicItem(EOItems.ROD_GALLIUM.get());
        basicItem(EOItems.ROD_TITANIUM.get());
        basicItem(EOItems.ROD_ROSE_GOLD.get());
        basicItem(EOItems.ROD_DIAMOND.get());
        basicItem(EOItems.ROD_IRIDIUM.get());
        basicItem(EOItems.ROD_CAST_IRON.get());
        basicItem(EOItems.ROD_CAST_STEEL.get());
        basicItem(EOItems.ROD_WROUGHT_IRON.get());
        basicItem(EOItems.ROD_NETHERSTEEL.get());
        basicItem(EOItems.ROD_SHADOWSTEEL.get());
        basicItem(EOItems.ROD_PIG_IRON.get());
        basicItem(EOItems.ROD_NECROTICARITE.get());
        basicItem(EOItems.ROD_CATALYRIUM.get());
        basicItem(EOItems.ROD_TACHYARITE.get());
        basicItem(EOItems.ROD_QUANTIQUARITE.get());
        basicItem(EOItems.ROD_VOIDERITE.get());

        //PLATES
        basicItem(EOItems.PLATE_ALUMINUM.get());
        basicItem(EOItems.PLATE_ARDITE.get());
        basicItem(EOItems.PLATE_BRONZE.get());
        basicItem(EOItems.PLATE_COBALT.get());
        basicItem(EOItems.PLATE_CONSTANTAN.get());
        basicItem(EOItems.PLATE_COPPER.get());
        basicItem(EOItems.PLATE_ELECTRUM.get());
        basicItem(EOItems.PLATE_ENDERIUM.get());
        basicItem(EOItems.PLATE_GOLD.get());
        basicItem(EOItems.PLATE_INVAR.get());
        basicItem(EOItems.PLATE_IRON.get());
        basicItem(EOItems.PLATE_LEAD.get());
        basicItem(EOItems.PLATE_LUMIUM.get());
        basicItem(EOItems.PLATE_NICKEL.get());
        basicItem(EOItems.PLATE_OSMIUM.get());
        basicItem(EOItems.PLATE_PLATINUM.get());
        basicItem(EOItems.PLATE_PLUTONIUM.get());
        basicItem(EOItems.PLATE_SIGNALUM.get());
        basicItem(EOItems.PLATE_SILVER.get());
        basicItem(EOItems.PLATE_TIN.get());
        basicItem(EOItems.PLATE_ULTIMATITANIUM.get());
        basicItem(EOItems.PLATE_URANIUM.get());
        basicItem(EOItems.PLATE_ZINC.get());
        basicItem(EOItems.PLATE_GRAPHITE.get());
        basicItem(EOItems.PLATE_BRASS.get());
        basicItem(EOItems.PLATE_NETHERITE.get());
        basicItem(EOItems.PLATE_STEEL.get());
        basicItem(EOItems.PLATE_SAPPHIRE.get());
        basicItem(EOItems.PLATE_BLUE_STEEL.get());
        basicItem(EOItems.PLATE_GALLIUM.get());
        basicItem(EOItems.PLATE_TITANIUM.get());
        basicItem(EOItems.PLATE_ROSE_GOLD.get());
        basicItem(EOItems.PLATE_IRIDIUM.get());
        basicItem(EOItems.PLATE_DIAMOND.get());
        basicItem(EOItems.PLATE_CAST_IRON.get());
        basicItem(EOItems.PLATE_CAST_STEEL.get());
        basicItem(EOItems.PLATE_WROUGHT_IRON.get());
        basicItem(EOItems.PLATE_NETHERSTEEL.get());
        basicItem(EOItems.PLATE_SHADOWSTEEL.get());
        basicItem(EOItems.PLATE_PIG_IRON.get());
        basicItem(EOItems.PLATE_NECROTICARITE.get());
        basicItem(EOItems.PLATE_CATALYRIUM.get());
        basicItem(EOItems.PLATE_QUANTIQUARITE.get());
        basicItem(EOItems.PLATE_TACHYARITE.get());
        basicItem(EOItems.PLATE_VOIDERITE.get());

        //GEARS
        basicItem(EOItems.GEAR_ALUMINUM.get());
        basicItem(EOItems.GEAR_ARDITE.get());
        basicItem(EOItems.GEAR_BRONZE.get());
        basicItem(EOItems.GEAR_COPPER.get());
        basicItem(EOItems.GEAR_DIAMOND.get());
        basicItem(EOItems.GEAR_ENDERIUM.get());
        basicItem(EOItems.GEAR_GOLD.get());
        basicItem(EOItems.GEAR_IRON.get());
        basicItem(EOItems.GEAR_LEAD.get());
        basicItem(EOItems.GEAR_OSMIUM.get());
        basicItem(EOItems.GEAR_STEEL.get());
        basicItem(EOItems.GEAR_TIN.get());
        basicItem(EOItems.ULTIMATE_GEAR.get());
        basicItem(EOItems.GEAR_NECROTICARITE.get());
        basicItem(EOItems.GEAR_CATALYRIUM.get());
        basicItem(EOItems.GEAR_VOIDERITE.get());
        basicItem(EOItems.GEAR_QUANTIQUARITE.get());
        basicItem(EOItems.GEAR_TACHYARITE.get());

        //GEMS
        basicItem(EOItems.FLUORITE.get());
        basicItem(EOItems.GEM_SAPPHIRE.get());
        basicItem(EOItems.GEM_ONYX.get());
        basicItem(EOItems.GEM_OBSIDIAN_SHARD.get());
        basicItem(EOItems.GEM_PERIDOT.get());
        basicItem(EOItems.GEM_RUBY.get());
        basicItem(EOItems.GEM_APATITE.get());
        basicItem(EOItems.GEM_CINNABAR.get());
        basicItem(EOItems.GEM_AMBER.get());
        basicItem(EOItems.GEM_NITER.get());
        basicItem(EOItems.GEM_TACHYARITE.get());
        basicItem(EOItems.GEM_VOIDERITE.get());
        basicItem(EOItems.GEM_QUANTIQUARITE.get());
        basicItem(EOItems.GEM_NECROTICARITE.get());

        //GEM SHARDS
        basicItem(EOItems.GEM_SAPPHIRE_SHARD.get());

        //Misc
        basicItem(EOItems.SILICON.get());

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
    }

    //This modifies the behavior of "basicItem" in ItemModelProvider by changing how it searches for item textures.
    //Instead of only looking in textures/item/, it now checks multiple possible paths dynamically.
    //
    //To add more custom texture paths, simply add a new path inside `possiblePaths` (e.g., basePath + "your_new_folder/" + itemName).
    //
    //If no specific texture is found, it defaults to textures/item/.
    //
    //Special case: If the texture is inside "rods/" or "hammers/", it applies the "handheld" parent model instead of "generated".
    //
    // If you want to add more item categories to use the "handheld" model,
    // simply add `|| path.contains("your_folder/")` right before the builder.
    //
    // Example:
    // if(path.contains("rods/") || path.contains("hammers/") || path.contains("your_folder/")) {
    //     builder = this.getBuilder(item.toString())
    //             .parent(new ModelFile.UncheckedModelFile("item/handheld"))
    //             .texture("layer0", ResourceLocation.fromNamespaceAndPath(item.getNamespace(), path));
    // }
    //
    // This ensures that any new item category added will automatically use the "handheld" model
    // instead of the default "generated" model.
    //
    //If no matching texture is found, it will use textures/item/item_name.png as a fallback.
    //
    //Why was this done?
    //
    //Simply because my adhd won this time

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
