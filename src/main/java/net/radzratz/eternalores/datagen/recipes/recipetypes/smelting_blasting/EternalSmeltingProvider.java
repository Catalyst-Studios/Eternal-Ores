package net.radzratz.eternalores.datagen.recipes.recipetypes.smelting_blasting;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.radzratz.eternalores.block.EternalGeneralBlocks;
import net.radzratz.eternalores.item.EternalGeneralItems;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static net.radzratz.eternalores.datagen.recipes.recipetypes.smelting_blasting.SmeltingBlastingRecipeEntries.*;

public class EternalSmeltingProvider extends RecipeProvider implements IConditionBuilder
{
    public EternalSmeltingProvider(PackOutput output,
                                   CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput)
    {
        ///Raw Material to Ingot Furnace/Blasting
        generateRawOreToIngotFurnace(recipeOutput, "aluminum", EternalGeneralItems.RAW_ALUMINUM.get(), EternalGeneralItems.ALUMINUM_INGOT.get());
        generateRawOreToIngotFurnace(recipeOutput, "cobalt", EternalGeneralItems.RAW_COBALT.get(), EternalGeneralItems.COBALT_INGOT.get());
        generateRawOreToIngotFurnace(recipeOutput, "gallium", EternalGeneralItems.RAW_GALLIUM.get(), EternalGeneralItems.GALLIUM_INGOT.get());
        generateRawOreToIngotFurnace(recipeOutput, "iridium", EternalGeneralItems.RAW_IRIDIUM.get(), EternalGeneralItems.IRIDIUM_INGOT.get());
        generateRawOreToIngotFurnace(recipeOutput, "lead", EternalGeneralItems.RAW_LEAD.get(), EternalGeneralItems.LEAD_INGOT.get());
        generateRawOreToIngotFurnace(recipeOutput, "nickel", EternalGeneralItems.RAW_NICKEL.get(), EternalGeneralItems.NICKEL_INGOT.get());
        generateRawOreToIngotFurnace(recipeOutput, "osmium", EternalGeneralItems.RAW_OSMIUM.get(), EternalGeneralItems.OSMIUM_INGOT.get());
        generateRawOreToIngotFurnace(recipeOutput, "platinum", EternalGeneralItems.RAW_PLATINUM.get(), EternalGeneralItems.PLATINUM_INGOT.get());
        generateRawOreToIngotFurnace(recipeOutput, "plutonium", EternalGeneralItems.RAW_PLUTONIUM.get(), EternalGeneralItems.PLUTONIUM_INGOT.get());
        generateRawOreToIngotFurnace(recipeOutput, "silver", EternalGeneralItems.RAW_SILVER.get(), EternalGeneralItems.SILVER_INGOT.get());
        generateRawOreToIngotFurnace(recipeOutput, "tin", EternalGeneralItems.RAW_TIN.get(), EternalGeneralItems.TIN_INGOT.get());
        generateRawOreToIngotFurnace(recipeOutput, "ultimatitanium", EternalGeneralItems.RAW_ULTIMATITANIUM.get(), EternalGeneralItems.ULTIMATITANIUM_INGOT.get());
        generateRawOreToIngotFurnace(recipeOutput, "uraninite", EternalGeneralItems.RAW_URANINITE.get(), EternalGeneralItems.URANINITE_INGOT.get());
        generateRawOreToIngotFurnace(recipeOutput, "uranium", EternalGeneralItems.RAW_URANIUM.get(), EternalGeneralItems.URANIUM_INGOT.get());
        generateRawOreToIngotFurnace(recipeOutput, "zinc", EternalGeneralItems.RAW_ZINC.get(), EternalGeneralItems.ZINC_INGOT.get());

        ///Dust to Material Furnace/Blasting
        //Vanilla Materials
        generateDustToMaterialFurnace(recipeOutput, "copper", EternalGeneralItems.COPPER_DUST.get(), Items.COPPER_INGOT);
        generateDustToMaterialFurnace(recipeOutput, "gold", EternalGeneralItems.GOLD_DUST.get(), Items.GOLD_INGOT);
        generateDustToMaterialFurnace(recipeOutput, "iron", EternalGeneralItems.IRON_DUST.get(), Items.IRON_INGOT);
        generateDustToMaterialFurnace(recipeOutput, "netherite", EternalGeneralItems.NETHERITE_DUST.get(), Items.NETHERITE_INGOT);

        generateDustToMaterialFurnace(recipeOutput, "diamond", EternalGeneralItems.DIAMOND_DUST.get(), Items.DIAMOND);
        generateDustToMaterialFurnace(recipeOutput, "emerald", EternalGeneralItems.EMERALD_DUST.get(), Items.EMERALD);
        generateDustToMaterialFurnace(recipeOutput, "lapis", EternalGeneralItems.LAPIS_LAZULI_DUST.get(), Items.LAPIS_LAZULI);

        //EO Materials
        generateDustToMaterialFurnace(recipeOutput, "aluminum", EternalGeneralItems.ALUMINUM_DUST.get(), EternalGeneralItems.ALUMINUM_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "blue_steel", EternalGeneralItems.BLUE_STEEL_DUST.get(), EternalGeneralItems.BLUE_STEEL_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "brass", EternalGeneralItems.BRASS_DUST.get(), EternalGeneralItems.BRASS_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "britannia_silver", EternalGeneralItems.BRITANNIA_SILVER_DUST.get(), EternalGeneralItems.BRITANNIA_SILVER_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "bronze", EternalGeneralItems.BRONZE_DUST.get(), EternalGeneralItems.BRONZE_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "cast_iron", EternalGeneralItems.CAST_IRON_DUST.get(), EternalGeneralItems.CAST_IRON_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "cast_steel", EternalGeneralItems.CAST_STEEL_DUST.get(), EternalGeneralItems.CAST_STEEL_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "cobalt", EternalGeneralItems.COBALT_DUST.get(), EternalGeneralItems.COBALT_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "constantan", EternalGeneralItems.CONSTANTAN_DUST.get(), EternalGeneralItems.CONSTANTAN_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "electrum", EternalGeneralItems.ELECTRUM_DUST.get(), EternalGeneralItems.ELECTRUM_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "enderium", EternalGeneralItems.ENDERIUM_DUST.get(), EternalGeneralItems.ENDERIUM_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "gallium", EternalGeneralItems.GALLIUM_DUST.get(), EternalGeneralItems.GALLIUM_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "graphite", EternalGeneralItems.GRAPHITE_DUST.get(), EternalGeneralItems.GRAPHITE_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "invar", EternalGeneralItems.INVAR_DUST.get(), EternalGeneralItems.INVAR_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "iridium", EternalGeneralItems.IRIDIUM_DUST.get(), EternalGeneralItems.IRIDIUM_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "lead", EternalGeneralItems.LEAD_DUST.get(), EternalGeneralItems.LEAD_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "lumium", EternalGeneralItems.LUMIUM_DUST.get(), EternalGeneralItems.LUMIUM_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "nethersteel", EternalGeneralItems.NETHERSTEEL_DUST.get(), EternalGeneralItems.NETHERSTEEL_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "nickel", EternalGeneralItems.NICKEL_DUST.get(), EternalGeneralItems.NICKEL_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "osmium", EternalGeneralItems.OSMIUM_DUST.get(), EternalGeneralItems.OSMIUM_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "pewter", EternalGeneralItems.PEWTER_DUST.get(), EternalGeneralItems.PEWTER_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "pig_iron", EternalGeneralItems.PIG_IRON_DUST.get(), EternalGeneralItems.PIG_IRON_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "platinum", EternalGeneralItems.PLATINUM_DUST.get(), EternalGeneralItems.PLATINUM_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "plutonium", EternalGeneralItems.PLUTONIUM_DUST.get(), EternalGeneralItems.PLUTONIUM_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "rose_gold", EternalGeneralItems.ROSE_GOLD_DUST.get(), EternalGeneralItems.ROSE_GOLD_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "signalum", EternalGeneralItems.SIGNALUM_DUST.get(), EternalGeneralItems.SIGNALUM_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "silver", EternalGeneralItems.SILVER_DUST.get(), EternalGeneralItems.SILVER_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "shadowsteel", EternalGeneralItems.SHADOWSTEEL_DUST.get(), EternalGeneralItems.SHADOWSTEEL_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "steel", EternalGeneralItems.STEEL_DUST.get(), EternalGeneralItems.STEEL_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "tin", EternalGeneralItems.TIN_DUST.get(), EternalGeneralItems.TIN_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "titanium", EternalGeneralItems.TITANIUM_DUST.get(), EternalGeneralItems.TITANIUM_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "ultimatitanium", EternalGeneralItems.ULTIMATITANIUM_DUST.get(), EternalGeneralItems.ULTIMATITANIUM_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "uraninite", EternalGeneralItems.URANINITE_DUST.get(), EternalGeneralItems.URANINITE_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "uranium", EternalGeneralItems.URANIUM_DUST.get(), EternalGeneralItems.URANIUM_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "wrought_iron", EternalGeneralItems.WROUGHT_IRON_DUST.get(), EternalGeneralItems.WROUGHT_IRON_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "zinc", EternalGeneralItems.ZINC_DUST.get(), EternalGeneralItems.ZINC_INGOT.get());

        generateDustToMaterialFurnace(recipeOutput, "amber", EternalGeneralItems.AMBER_DUST.get(), EternalGeneralItems.GEM_AMBER.get());
        generateDustToMaterialFurnace(recipeOutput, "apatite", EternalGeneralItems.APATITE_DUST.get(), EternalGeneralItems.GEM_APATITE.get());
        generateDustToMaterialFurnace(recipeOutput, "cinnabar", EternalGeneralItems.CINNABAR_DUST.get(), EternalGeneralItems.GEM_CINNABAR.get());
        generateDustToMaterialFurnace(recipeOutput, "necroticarite", EternalGeneralItems.NECROTICARITE_DUST.get(), EternalGeneralItems.GEM_NECROTICARITE.get());
        generateDustToMaterialFurnace(recipeOutput, "niter", EternalGeneralItems.NITER_DUST.get(), EternalGeneralItems.GEM_NITER.get());
        generateDustToMaterialFurnace(recipeOutput, "onyx", EternalGeneralItems.ONYX_DUST.get(), EternalGeneralItems.GEM_ONYX.get());
        generateDustToMaterialFurnace(recipeOutput, "peridot", EternalGeneralItems.PERIDOT_DUST.get(), EternalGeneralItems.GEM_PERIDOT.get());
        generateDustToMaterialFurnace(recipeOutput, "ruby", EternalGeneralItems.RUBY_DUST.get(), EternalGeneralItems.GEM_RUBY.get());
        generateDustToMaterialFurnace(recipeOutput, "sapphire", EternalGeneralItems.SAPPHIRE_DUST.get(), EternalGeneralItems.GEM_SAPPHIRE.get());

        ///Raw Ore Block to Block Furnace/Blasting
        //Vanilla Materials
        generateRawBlockToMaterialFurnace(recipeOutput, "copper", Items.RAW_COPPER_BLOCK, Items.COPPER_BLOCK);
        generateRawBlockToMaterialFurnace(recipeOutput, "gold", Items.RAW_GOLD_BLOCK, Items.GOLD_BLOCK);
        generateRawBlockToMaterialFurnace(recipeOutput, "iron", Items.RAW_IRON_BLOCK, Items.IRON_BLOCK);

        //EO Materials
        generateRawBlockToMaterialFurnace(recipeOutput, "aluminum", EternalGeneralBlocks.RAW_ALUMINUM_BLOCK.asItem(), EternalGeneralBlocks.ALUMINUM_BLOCK.asItem());
        generateRawBlockToMaterialFurnace(recipeOutput, "cobalt", EternalGeneralBlocks.RAW_COBALT_BLOCK.asItem(), EternalGeneralBlocks.COBALT_BLOCK.asItem());
        generateRawBlockToMaterialFurnace(recipeOutput, "gallium", EternalGeneralBlocks.RAW_GALLIUM_BLOCK.asItem(), EternalGeneralBlocks.GALLIUM_BLOCK.asItem());
        generateRawBlockToMaterialFurnace(recipeOutput, "iridium", EternalGeneralBlocks.RAW_IRIDIUM_BLOCK.asItem(), EternalGeneralBlocks.IRIDIUM_BLOCK.asItem());
        generateRawBlockToMaterialFurnace(recipeOutput, "lead", EternalGeneralBlocks.RAW_LEAD_BLOCK.asItem(), EternalGeneralBlocks.LEAD_BLOCK.asItem());
        generateRawBlockToMaterialFurnace(recipeOutput, "nickel", EternalGeneralBlocks.RAW_NICKEL_BLOCK.asItem(), EternalGeneralBlocks.NICKEL_BLOCK.asItem());
        generateRawBlockToMaterialFurnace(recipeOutput, "osmium", EternalGeneralBlocks.RAW_OSMIUM_BLOCK.asItem(), EternalGeneralBlocks.OSMIUM_BLOCK.asItem());
        generateRawBlockToMaterialFurnace(recipeOutput, "platinum", EternalGeneralBlocks.RAW_PLATINUM_BLOCK.asItem(), EternalGeneralBlocks.PLATINUM_BLOCK.asItem());
        generateRawBlockToMaterialFurnace(recipeOutput, "plutonium", EternalGeneralBlocks.RAW_PLUTONIUM_BLOCK.asItem(), EternalGeneralBlocks.PLUTONIUM_BLOCK.asItem());
        generateRawBlockToMaterialFurnace(recipeOutput, "silver", EternalGeneralBlocks.RAW_SILVER_BLOCK.asItem(), EternalGeneralBlocks.SILVER_BLOCK.asItem());
        generateRawBlockToMaterialFurnace(recipeOutput, "tin", EternalGeneralBlocks.RAW_TIN_BLOCK.asItem(), EternalGeneralBlocks.TIN_BLOCK.asItem());
        //generateRawBlockToMaterialFurnace(recipeOutput, "ultimatitanium", EternalGeneralBlocks.RAW_ULTIMATITANIUM_BLOCK.asItem(), EternalGeneralBlocks.ULTIMATITANIUM_BLOCK.asItem());
        generateRawBlockToMaterialFurnace(recipeOutput, "uraninite", EternalGeneralBlocks.RAW_URANINITE_BLOCK.asItem(), EternalGeneralBlocks.URANINITE_BLOCK.asItem());
        generateRawBlockToMaterialFurnace(recipeOutput, "uranium", EternalGeneralBlocks.RAW_URANIUM_BLOCK.asItem(), EternalGeneralBlocks.URANIUM_BLOCK.asItem());
        generateRawBlockToMaterialFurnace(recipeOutput, "zinc", EternalGeneralBlocks.RAW_ZINC_BLOCK.asItem(), EternalGeneralBlocks.ZINC_BLOCK.asItem());

        ///Ore Block to Material Smelting
        generateOreBlockToMaterialFurnace(recipeOutput, "stone_aluminum", EternalGeneralBlocks.ALUMINUM_ORE_BLOCK.asItem(), EternalGeneralItems.ALUMINUM_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "deepslate_aluminum", EternalGeneralBlocks.DEEPSLATE_ALUMINUM_ORE_BLOCK.asItem(), EternalGeneralItems.ALUMINUM_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "stone_cobalt", EternalGeneralBlocks.COBALT_ORE_BLOCK.asItem(), EternalGeneralItems.COBALT_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "deepslate_cobalt", EternalGeneralBlocks.DEEPSLATE_COBALT_ORE_BLOCK.asItem(), EternalGeneralItems.COBALT_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "stone_gallium", EternalGeneralBlocks.GALLIUM_ORE_BLOCK.asItem(), EternalGeneralItems.GALLIUM_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "deepslate_gallium", EternalGeneralBlocks.DEEPSLATE_GALLIUM_ORE_BLOCK.asItem(), EternalGeneralItems.GALLIUM_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "stone_iridium", EternalGeneralBlocks.IRIDIUM_ORE_BLOCK.asItem(), EternalGeneralItems.IRIDIUM_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "deepslate_iridium", EternalGeneralBlocks.DEEPSLATE_IRIDIUM_ORE_BLOCK.asItem(), EternalGeneralItems.IRIDIUM_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "stone_lead", EternalGeneralBlocks.LEAD_ORE_BLOCK.asItem(), EternalGeneralItems.LEAD_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "deepslate_lead", EternalGeneralBlocks.DEEPSLATE_LEAD_ORE_BLOCK.asItem(), EternalGeneralItems.LEAD_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "stone_nickel", EternalGeneralBlocks.NICKEL_ORE_BLOCK.asItem(), EternalGeneralItems.NICKEL_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "deepslate_nickel", EternalGeneralBlocks.DEEPSLATE_NICKEL_ORE_BLOCK.asItem(), EternalGeneralItems.NICKEL_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "stone_osmium", EternalGeneralBlocks.OSMIUM_ORE_BLOCK.asItem(), EternalGeneralItems.OSMIUM_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "deepslate_osmium", EternalGeneralBlocks.DEEPSLATE_OSMIUM_ORE_BLOCK.asItem(), EternalGeneralItems.OSMIUM_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "stone_platinum", EternalGeneralBlocks.PLATINUM_ORE_BLOCK.asItem(), EternalGeneralItems.PLATINUM_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "deepslate_platinum", EternalGeneralBlocks.DEEPSLATE_PLATINUM_ORE_BLOCK.asItem(), EternalGeneralItems.PLATINUM_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "stone_silver", EternalGeneralBlocks.SILVER_ORE_BLOCK.asItem(), EternalGeneralItems.SILVER_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "deepslate_silver", EternalGeneralBlocks.DEEPSLATE_SILVER_ORE_BLOCK.asItem(), EternalGeneralItems.SILVER_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "stone_tin", EternalGeneralBlocks.TIN_ORE_BLOCK.asItem(), EternalGeneralItems.TIN_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "deepslate_tin", EternalGeneralBlocks.DEEPSLATE_TIN_ORE_BLOCK.asItem(), EternalGeneralItems.TIN_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "stone_uranium", EternalGeneralBlocks.URANIUM_ORE_BLOCK.asItem(), EternalGeneralItems.URANIUM_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "deepslate_uranium", EternalGeneralBlocks.DEEPSLATE_URANIUM_ORE_BLOCK.asItem(), EternalGeneralItems.URANIUM_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "stone_uraninite", EternalGeneralBlocks.URANINITE_ORE_BLOCK.asItem(), EternalGeneralItems.URANINITE_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "deepslate_uraninite", EternalGeneralBlocks.DEEPSLATE_URANINITE_ORE_BLOCK.asItem(), EternalGeneralItems.URANINITE_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "stone_zinc", EternalGeneralBlocks.ZINC_ORE_BLOCK.asItem(), EternalGeneralItems.ZINC_INGOT.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "deepslate_zinc", EternalGeneralBlocks.DEEPSLATE_ZINC_ORE_BLOCK.asItem(), EternalGeneralItems.ZINC_INGOT.get());

        generateOreBlockToMaterialFurnace(recipeOutput, "stone_sulfur", EternalGeneralBlocks.SULFUR_ORE_BLOCK.asItem(), EternalGeneralItems.SULFUR.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "deepslate_sulfur", EternalGeneralBlocks.DEEPSLATE_SULFUR_ORE_BLOCK.asItem(), EternalGeneralItems.SULFUR.get());

        generateOreBlockToMaterialFurnace(recipeOutput, "stone_amber", EternalGeneralBlocks.AMBER_ORE_BLOCK.asItem(), EternalGeneralItems.GEM_AMBER.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "deepslate_amber", EternalGeneralBlocks.DEEPSLATE_AMBER_ORE_BLOCK.asItem(), EternalGeneralItems.GEM_AMBER.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "stone_apatite", EternalGeneralBlocks.APATITE_ORE_BLOCK.asItem(), EternalGeneralItems.GEM_APATITE.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "deepslate_apatite", EternalGeneralBlocks.DEEPSLATE_APATITE_ORE_BLOCK.asItem(), EternalGeneralItems.GEM_APATITE.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "stone_cinnabar", EternalGeneralBlocks.CINNABAR_ORE_BLOCK.asItem(), EternalGeneralItems.GEM_CINNABAR.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "deepslate_cinnabar", EternalGeneralBlocks.DEEPSLATE_CINNABAR_ORE_BLOCK.asItem(), EternalGeneralItems.GEM_CINNABAR.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "stone_fluorite", EternalGeneralBlocks.FLUORITE_ORE_BLOCK.asItem(), EternalGeneralItems.FLUORITE.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "deepslate_fluorite", EternalGeneralBlocks.DEEPSLATE_FLUORITE_ORE_BLOCK.asItem(), EternalGeneralItems.FLUORITE.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "stone_niter", EternalGeneralBlocks.NITER_ORE_BLOCK.asItem(), EternalGeneralItems.GEM_NITER.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "deepslate_niter", EternalGeneralBlocks.DEEPSLATE_NITER_ORE_BLOCK.asItem(), EternalGeneralItems.GEM_NITER.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "nether_obsidian", EternalGeneralBlocks.OBSIDIAN_ORE_BLOCK.asItem(), EternalGeneralItems.GEM_OBSIDIAN_SHARD.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "stone_ruby", EternalGeneralBlocks.RUBY_ORE_BLOCK.asItem(), EternalGeneralItems.GEM_RUBY.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "deepslate_ruby", EternalGeneralBlocks.DEEPSLATE_RUBY_ORE_BLOCK.asItem(), EternalGeneralItems.GEM_RUBY.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "stone_sapphire", EternalGeneralBlocks.SAPPHIRE_ORE_BLOCK.asItem(), EternalGeneralItems.GEM_SAPPHIRE.get());
        generateOreBlockToMaterialFurnace(recipeOutput, "deepslate_sapphire", EternalGeneralBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCK.asItem(), EternalGeneralItems.GEM_SAPPHIRE.get());

        generateOreBlockToMaterialFurnace(recipeOutput, "nether_necroticarite", EternalGeneralBlocks.NECROTICARITE_ORE_BLOCK.asItem(), EternalGeneralItems.GEM_NECROTICARITE.get());
    }
}
