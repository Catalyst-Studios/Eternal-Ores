package net.radzratz.eternalores.datagen.recipes.recipetypes.smelting_blasting;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.radzratz.eternalores.block.EOBlocks;
import net.radzratz.eternalores.item.EOItems;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static net.radzratz.eternalores.datagen.recipes.recipetypes.smelting_blasting.EOFurnaceRecipe.*;

public class EOSmeltingEntries extends RecipeProvider implements IConditionBuilder
{
    public EOSmeltingEntries(PackOutput output,
                             CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput)
    {
        ///Raw Material to Ingot Furnace/Blasting
        generateRawOreToIngotFurnace(recipeOutput, "aluminum", EOItems.RAW_ALUMINUM.get(), EOItems.ALUMINUM_INGOT.get());
        generateRawOreToIngotFurnace(recipeOutput, "cobalt", EOItems.RAW_COBALT.get(), EOItems.COBALT_INGOT.get());
        generateRawOreToIngotFurnace(recipeOutput, "gallium", EOItems.RAW_GALLIUM.get(), EOItems.GALLIUM_INGOT.get());
        generateRawOreToIngotFurnace(recipeOutput, "iridium", EOItems.RAW_IRIDIUM.get(), EOItems.IRIDIUM_INGOT.get());
        generateRawOreToIngotFurnace(recipeOutput, "lead", EOItems.RAW_LEAD.get(), EOItems.LEAD_INGOT.get());
        generateRawOreToIngotFurnace(recipeOutput, "nickel", EOItems.RAW_NICKEL.get(), EOItems.NICKEL_INGOT.get());
        generateRawOreToIngotFurnace(recipeOutput, "osmium", EOItems.RAW_OSMIUM.get(), EOItems.OSMIUM_INGOT.get());
        generateRawOreToIngotFurnace(recipeOutput, "platinum", EOItems.RAW_PLATINUM.get(), EOItems.PLATINUM_INGOT.get());
        generateRawOreToIngotFurnace(recipeOutput, "plutonium", EOItems.RAW_PLUTONIUM.get(), EOItems.PLUTONIUM_INGOT.get());
        generateRawOreToIngotFurnace(recipeOutput, "silver", EOItems.RAW_SILVER.get(), EOItems.SILVER_INGOT.get());
        generateRawOreToIngotFurnace(recipeOutput, "tin", EOItems.RAW_TIN.get(), EOItems.TIN_INGOT.get());
        generateRawOreToIngotFurnace(recipeOutput, "ultimatitanium", EOItems.RAW_ULTIMATITANIUM.get(), EOItems.ULTIMATITANIUM_INGOT.get());
        generateRawOreToIngotFurnace(recipeOutput, "uraninite", EOItems.RAW_URANINITE.get(), EOItems.URANINITE_INGOT.get());
        generateRawOreToIngotFurnace(recipeOutput, "uranium", EOItems.RAW_URANIUM.get(), EOItems.URANIUM_INGOT.get());
        generateRawOreToIngotFurnace(recipeOutput, "zinc", EOItems.RAW_ZINC.get(), EOItems.ZINC_INGOT.get());

        ///Dust to Material Furnace/Blasting
        //Vanilla Materials
        generateDustToMaterialFurnace(recipeOutput, "copper", EOItems.COPPER_DUST.get(), Items.COPPER_INGOT);
        generateDustToMaterialFurnace(recipeOutput, "gold", EOItems.GOLD_DUST.get(), Items.GOLD_INGOT);
        generateDustToMaterialFurnace(recipeOutput, "iron", EOItems.IRON_DUST.get(), Items.IRON_INGOT);
        generateDustToMaterialFurnace(recipeOutput, "netherite", EOItems.NETHERITE_DUST.get(), Items.NETHERITE_INGOT);

        generateDustToMaterialFurnace(recipeOutput, "diamond", EOItems.DIAMOND_DUST.get(), Items.DIAMOND);
        generateDustToMaterialFurnace(recipeOutput, "emerald", EOItems.EMERALD_DUST.get(), Items.EMERALD);
        generateDustToMaterialFurnace(recipeOutput, "lapis", EOItems.LAPIS_LAZULI_DUST.get(), Items.LAPIS_LAZULI);

        //EO Materials
        generateDustToMaterialFurnace(recipeOutput, "aluminum", EOItems.ALUMINUM_DUST.get(), EOItems.ALUMINUM_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "blue_steel", EOItems.BLUE_STEEL_DUST.get(), EOItems.BLUE_STEEL_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "brass", EOItems.BRASS_DUST.get(), EOItems.BRASS_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "britannia_silver", EOItems.BRITANNIA_SILVER_DUST.get(), EOItems.BRITANNIA_SILVER_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "bronze", EOItems.BRONZE_DUST.get(), EOItems.BRONZE_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "cast_iron", EOItems.CAST_IRON_DUST.get(), EOItems.CAST_IRON_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "cast_steel", EOItems.CAST_STEEL_DUST.get(), EOItems.CAST_STEEL_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "cobalt", EOItems.COBALT_DUST.get(), EOItems.COBALT_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "constantan", EOItems.CONSTANTAN_DUST.get(), EOItems.CONSTANTAN_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "electrum", EOItems.ELECTRUM_DUST.get(), EOItems.ELECTRUM_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "enderium", EOItems.ENDERIUM_DUST.get(), EOItems.ENDERIUM_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "gallium", EOItems.GALLIUM_DUST.get(), EOItems.GALLIUM_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "graphite", EOItems.GRAPHITE_DUST.get(), EOItems.GRAPHITE_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "invar", EOItems.INVAR_DUST.get(), EOItems.INVAR_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "iridium", EOItems.IRIDIUM_DUST.get(), EOItems.IRIDIUM_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "lead", EOItems.LEAD_DUST.get(), EOItems.LEAD_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "lumium", EOItems.LUMIUM_DUST.get(), EOItems.LUMIUM_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "nethersteel", EOItems.NETHERSTEEL_DUST.get(), EOItems.NETHERSTEEL_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "nickel", EOItems.NICKEL_DUST.get(), EOItems.NICKEL_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "osmium", EOItems.OSMIUM_DUST.get(), EOItems.OSMIUM_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "pewter", EOItems.PEWTER_DUST.get(), EOItems.PEWTER_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "pig_iron", EOItems.PIG_IRON_DUST.get(), EOItems.PIG_IRON_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "platinum", EOItems.PLATINUM_DUST.get(), EOItems.PLATINUM_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "plutonium", EOItems.PLUTONIUM_DUST.get(), EOItems.PLUTONIUM_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "rose_gold", EOItems.ROSE_GOLD_DUST.get(), EOItems.ROSE_GOLD_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "signalum", EOItems.SIGNALUM_DUST.get(), EOItems.SIGNALUM_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "silver", EOItems.SILVER_DUST.get(), EOItems.SILVER_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "shadowsteel", EOItems.SHADOWSTEEL_DUST.get(), EOItems.SHADOWSTEEL_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "steel", EOItems.STEEL_DUST.get(), EOItems.STEEL_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "tin", EOItems.TIN_DUST.get(), EOItems.TIN_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "titanium", EOItems.TITANIUM_DUST.get(), EOItems.TITANIUM_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "ultimatitanium", EOItems.ULTIMATITANIUM_DUST.get(), EOItems.ULTIMATITANIUM_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "uraninite", EOItems.URANINITE_DUST.get(), EOItems.URANINITE_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "uranium", EOItems.URANIUM_DUST.get(), EOItems.URANIUM_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "wrought_iron", EOItems.WROUGHT_IRON_DUST.get(), EOItems.WROUGHT_IRON_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "zinc", EOItems.ZINC_DUST.get(), EOItems.ZINC_INGOT.get());

        generateDustToMaterialFurnace(recipeOutput, "amber", EOItems.AMBER_DUST.get(), EOItems.GEM_AMBER.get());
        generateDustToMaterialFurnace(recipeOutput, "apatite", EOItems.APATITE_DUST.get(), EOItems.GEM_APATITE.get());
        generateDustToMaterialFurnace(recipeOutput, "cinnabar", EOItems.CINNABAR_DUST.get(), EOItems.GEM_CINNABAR.get());
        generateDustToMaterialFurnace(recipeOutput, "necroticarite", EOItems.NECROTICARITE_DUST.get(), EOItems.GEM_NECROTICARITE.get());
        generateDustToMaterialFurnace(recipeOutput, "niter", EOItems.NITER_DUST.get(), EOItems.GEM_NITER.get());
        generateDustToMaterialFurnace(recipeOutput, "onyx", EOItems.ONYX_DUST.get(), EOItems.GEM_ONYX.get());
        generateDustToMaterialFurnace(recipeOutput, "peridot", EOItems.PERIDOT_DUST.get(), EOItems.GEM_PERIDOT.get());
        generateDustToMaterialFurnace(recipeOutput, "ruby", EOItems.RUBY_DUST.get(), EOItems.GEM_RUBY.get());
        generateDustToMaterialFurnace(recipeOutput, "sapphire", EOItems.SAPPHIRE_DUST.get(), EOItems.GEM_SAPPHIRE.get());

        ///Raw Ore Block to Block Furnace/Blasting
        //Vanilla Materials
        generateRawBlockToMaterialFurnace(recipeOutput, "copper", Items.RAW_COPPER_BLOCK, Items.COPPER_BLOCK);
        generateRawBlockToMaterialFurnace(recipeOutput, "gold", Items.RAW_GOLD_BLOCK, Items.GOLD_BLOCK);
        generateRawBlockToMaterialFurnace(recipeOutput, "iron", Items.RAW_IRON_BLOCK, Items.IRON_BLOCK);

        //EO Materials
        generateRawBlockToMaterialFurnace(recipeOutput, "aluminum", EOBlocks.RAW_ALUMINUM_BLOCK.asItem(), EOBlocks.ALUMINUM_BLOCK.asItem());
        generateRawBlockToMaterialFurnace(recipeOutput, "cobalt", EOBlocks.RAW_COBALT_BLOCK.asItem(), EOBlocks.COBALT_BLOCK.asItem());
        generateRawBlockToMaterialFurnace(recipeOutput, "gallium", EOBlocks.RAW_GALLIUM_BLOCK.asItem(), EOBlocks.GALLIUM_BLOCK.asItem());
        generateRawBlockToMaterialFurnace(recipeOutput, "iridium", EOBlocks.RAW_IRIDIUM_BLOCK.asItem(), EOBlocks.IRIDIUM_BLOCK.asItem());
        generateRawBlockToMaterialFurnace(recipeOutput, "lead", EOBlocks.RAW_LEAD_BLOCK.asItem(), EOBlocks.LEAD_BLOCK.asItem());
        generateRawBlockToMaterialFurnace(recipeOutput, "nickel", EOBlocks.RAW_NICKEL_BLOCK.asItem(), EOBlocks.NICKEL_BLOCK.asItem());
        generateRawBlockToMaterialFurnace(recipeOutput, "osmium", EOBlocks.RAW_OSMIUM_BLOCK.asItem(), EOBlocks.OSMIUM_BLOCK.asItem());
        generateRawBlockToMaterialFurnace(recipeOutput, "platinum", EOBlocks.RAW_PLATINUM_BLOCK.asItem(), EOBlocks.PLATINUM_BLOCK.asItem());
        generateRawBlockToMaterialFurnace(recipeOutput, "plutonium", EOBlocks.RAW_PLUTONIUM_BLOCK.asItem(), EOBlocks.PLUTONIUM_BLOCK.asItem());
        generateRawBlockToMaterialFurnace(recipeOutput, "silver", EOBlocks.RAW_SILVER_BLOCK.asItem(), EOBlocks.SILVER_BLOCK.asItem());
        generateRawBlockToMaterialFurnace(recipeOutput, "tin", EOBlocks.RAW_TIN_BLOCK.asItem(), EOBlocks.TIN_BLOCK.asItem());
        //generateRawBlockToMaterialFurnace(recipeOutput, "ultimatitanium", EOBlocks.RAW_ULTIMATITANIUM_BLOCK.asItem(), EOBlocks.ULTIMATITANIUM_BLOCK.asItem());
        generateRawBlockToMaterialFurnace(recipeOutput, "uraninite", EOBlocks.RAW_URANINITE_BLOCK.asItem(), EOBlocks.URANINITE_BLOCK.asItem());
        generateRawBlockToMaterialFurnace(recipeOutput, "uranium", EOBlocks.RAW_URANIUM_BLOCK.asItem(), EOBlocks.URANIUM_BLOCK.asItem());
        generateRawBlockToMaterialFurnace(recipeOutput, "zinc", EOBlocks.RAW_ZINC_BLOCK.asItem(), EOBlocks.ZINC_BLOCK.asItem());

        ///Ore Block to Material Smelting
        generateOreBlockToMaterialFurnace(recipeOutput, "stone_aluminum", EOBlocks.ALUMINUM_ORE_BLOCK.asItem(), EOItems.ALUMINUM_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "deepslate_aluminum", EOBlocks.DEEPSLATE_ALUMINUM_ORE_BLOCK.asItem(), EOItems.ALUMINUM_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "stone_cobalt", EOBlocks.COBALT_ORE_BLOCK.asItem(), EOItems.COBALT_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "deepslate_cobalt", EOBlocks.DEEPSLATE_COBALT_ORE_BLOCK.asItem(), EOItems.COBALT_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "stone_gallium", EOBlocks.GALLIUM_ORE_BLOCK.asItem(), EOItems.GALLIUM_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "deepslate_gallium", EOBlocks.DEEPSLATE_GALLIUM_ORE_BLOCK.asItem(), EOItems.GALLIUM_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "stone_iridium", EOBlocks.IRIDIUM_ORE_BLOCK.asItem(), EOItems.IRIDIUM_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "deepslate_iridium", EOBlocks.DEEPSLATE_IRIDIUM_ORE_BLOCK.asItem(), EOItems.IRIDIUM_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "stone_lead", EOBlocks.LEAD_ORE_BLOCK.asItem(), EOItems.LEAD_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "deepslate_lead", EOBlocks.DEEPSLATE_LEAD_ORE_BLOCK.asItem(), EOItems.LEAD_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "stone_nickel", EOBlocks.NICKEL_ORE_BLOCK.asItem(), EOItems.NICKEL_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "deepslate_nickel", EOBlocks.DEEPSLATE_NICKEL_ORE_BLOCK.asItem(), EOItems.NICKEL_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "stone_osmium", EOBlocks.OSMIUM_ORE_BLOCK.asItem(), EOItems.OSMIUM_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "deepslate_osmium", EOBlocks.DEEPSLATE_OSMIUM_ORE_BLOCK.asItem(), EOItems.OSMIUM_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "stone_platinum", EOBlocks.PLATINUM_ORE_BLOCK.asItem(), EOItems.PLATINUM_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "deepslate_platinum", EOBlocks.DEEPSLATE_PLATINUM_ORE_BLOCK.asItem(), EOItems.PLATINUM_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "stone_silver", EOBlocks.SILVER_ORE_BLOCK.asItem(), EOItems.SILVER_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "deepslate_silver", EOBlocks.DEEPSLATE_SILVER_ORE_BLOCK.asItem(), EOItems.SILVER_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "stone_tin", EOBlocks.TIN_ORE_BLOCK.asItem(), EOItems.TIN_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "deepslate_tin", EOBlocks.DEEPSLATE_TIN_ORE_BLOCK.asItem(), EOItems.TIN_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "stone_uranium", EOBlocks.URANIUM_ORE_BLOCK.asItem(), EOItems.URANIUM_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "deepslate_uranium", EOBlocks.DEEPSLATE_URANIUM_ORE_BLOCK.asItem(), EOItems.URANIUM_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "stone_uraninite", EOBlocks.URANINITE_ORE_BLOCK.asItem(), EOItems.URANINITE_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "deepslate_uraninite", EOBlocks.DEEPSLATE_URANINITE_ORE_BLOCK.asItem(), EOItems.URANINITE_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "stone_zinc", EOBlocks.ZINC_ORE_BLOCK.asItem(), EOItems.ZINC_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "deepslate_zinc", EOBlocks.DEEPSLATE_ZINC_ORE_BLOCK.asItem(), EOItems.ZINC_INGOT.get());

        generateOreBlockToMaterialFurnace(recipeOutput, "stone_sulfur", EOBlocks.SULFUR_ORE_BLOCK.asItem(), EOItems.SULFUR.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "deepslate_sulfur", EOBlocks.DEEPSLATE_SULFUR_ORE_BLOCK.asItem(), EOItems.SULFUR.get());

        generateOreBlockToMaterialFurnace(recipeOutput, "stone_amber", EOBlocks.AMBER_ORE_BLOCK.asItem(), EOItems.GEM_AMBER.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "deepslate_amber", EOBlocks.DEEPSLATE_AMBER_ORE_BLOCK.asItem(), EOItems.GEM_AMBER.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "stone_apatite", EOBlocks.APATITE_ORE_BLOCK.asItem(), EOItems.GEM_APATITE.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "deepslate_apatite", EOBlocks.DEEPSLATE_APATITE_ORE_BLOCK.asItem(), EOItems.GEM_APATITE.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "stone_cinnabar", EOBlocks.CINNABAR_ORE_BLOCK.asItem(), EOItems.GEM_CINNABAR.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "deepslate_cinnabar", EOBlocks.DEEPSLATE_CINNABAR_ORE_BLOCK.asItem(), EOItems.GEM_CINNABAR.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "stone_fluorite", EOBlocks.FLUORITE_ORE_BLOCK.asItem(), EOItems.FLUORITE.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "deepslate_fluorite", EOBlocks.DEEPSLATE_FLUORITE_ORE_BLOCK.asItem(), EOItems.FLUORITE.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "stone_niter", EOBlocks.NITER_ORE_BLOCK.asItem(), EOItems.GEM_NITER.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "deepslate_niter", EOBlocks.DEEPSLATE_NITER_ORE_BLOCK.asItem(), EOItems.GEM_NITER.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "nether_obsidian", EOBlocks.OBSIDIAN_ORE_BLOCK.asItem(), EOItems.GEM_OBSIDIAN_SHARD.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "stone_ruby", EOBlocks.RUBY_ORE_BLOCK.asItem(), EOItems.GEM_RUBY.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "deepslate_ruby", EOBlocks.DEEPSLATE_RUBY_ORE_BLOCK.asItem(), EOItems.GEM_RUBY.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "stone_sapphire", EOBlocks.SAPPHIRE_ORE_BLOCK.asItem(), EOItems.GEM_SAPPHIRE.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "deepslate_sapphire", EOBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCK.asItem(), EOItems.GEM_SAPPHIRE.get());

        generateOreBlockToMaterialFurnace(recipeOutput, "nether_necroticarite", EOBlocks.NECROTICARITE_ORE_BLOCK.asItem(), EOItems.GEM_NECROTICARITE.get());
    }
}
