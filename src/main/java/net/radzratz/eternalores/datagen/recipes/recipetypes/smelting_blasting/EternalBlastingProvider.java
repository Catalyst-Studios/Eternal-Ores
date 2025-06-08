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

public class EternalBlastingProvider extends RecipeProvider implements IConditionBuilder
{

    public EternalBlastingProvider(PackOutput output,
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

        //Blasting var
        generateRawOreToIngotBlasting(recipeOutput, "aluminum", EternalGeneralItems.RAW_ALUMINUM.get(), EternalGeneralItems.ALUMINUM_INGOT.get());
        generateRawOreToIngotBlasting(recipeOutput, "cobalt", EternalGeneralItems.RAW_COBALT.get(), EternalGeneralItems.COBALT_INGOT.get());
        generateRawOreToIngotBlasting(recipeOutput, "gallium", EternalGeneralItems.RAW_GALLIUM.get(), EternalGeneralItems.GALLIUM_INGOT.get());
        generateRawOreToIngotBlasting(recipeOutput, "iridium", EternalGeneralItems.RAW_IRIDIUM.get(), EternalGeneralItems.IRIDIUM_INGOT.get());
        generateRawOreToIngotBlasting(recipeOutput, "lead", EternalGeneralItems.RAW_LEAD.get(), EternalGeneralItems.LEAD_INGOT.get());
        generateRawOreToIngotBlasting(recipeOutput, "nickel", EternalGeneralItems.RAW_NICKEL.get(), EternalGeneralItems.NICKEL_INGOT.get());
        generateRawOreToIngotBlasting(recipeOutput, "osmium", EternalGeneralItems.RAW_OSMIUM.get(), EternalGeneralItems.OSMIUM_INGOT.get());
        generateRawOreToIngotBlasting(recipeOutput, "platinum", EternalGeneralItems.RAW_PLATINUM.get(), EternalGeneralItems.PLATINUM_INGOT.get());
        generateRawOreToIngotBlasting(recipeOutput, "plutonium", EternalGeneralItems.RAW_PLUTONIUM.get(), EternalGeneralItems.PLUTONIUM_INGOT.get());
        generateRawOreToIngotBlasting(recipeOutput, "silver", EternalGeneralItems.RAW_SILVER.get(), EternalGeneralItems.SILVER_INGOT.get());
        generateRawOreToIngotBlasting(recipeOutput, "tin", EternalGeneralItems.RAW_TIN.get(), EternalGeneralItems.TIN_INGOT.get());
        generateRawOreToIngotBlasting(recipeOutput, "ultimatitanium", EternalGeneralItems.RAW_ULTIMATITANIUM.get(), EternalGeneralItems.ULTIMATITANIUM_INGOT.get());
        generateRawOreToIngotBlasting(recipeOutput, "uraninite", EternalGeneralItems.RAW_URANINITE.get(), EternalGeneralItems.URANINITE_INGOT.get());
        generateRawOreToIngotBlasting(recipeOutput, "uranium", EternalGeneralItems.RAW_URANIUM.get(), EternalGeneralItems.URANIUM_INGOT.get());
        generateRawOreToIngotBlasting(recipeOutput, "zinc", EternalGeneralItems.RAW_ZINC.get(), EternalGeneralItems.ZINC_INGOT.get());

        ///
        //Vanilla Materials Blasting Var
        generateDustToMaterialBlasting(recipeOutput, "copper", EternalGeneralItems.COPPER_DUST.get(), Items.COPPER_INGOT);
        generateDustToMaterialBlasting(recipeOutput, "gold", EternalGeneralItems.GOLD_DUST.get(), Items.GOLD_INGOT);
        generateDustToMaterialBlasting(recipeOutput, "iron", EternalGeneralItems.IRON_DUST.get(), Items.IRON_INGOT);
        generateDustToMaterialBlasting(recipeOutput, "netherite", EternalGeneralItems.NETHERITE_DUST.get(), Items.NETHERITE_INGOT);

        generateDustToMaterialBlasting(recipeOutput, "diamond", EternalGeneralItems.DIAMOND_DUST.get(), Items.DIAMOND);
        generateDustToMaterialBlasting(recipeOutput, "emerald", EternalGeneralItems.EMERALD_DUST.get(), Items.EMERALD);
        generateDustToMaterialBlasting(recipeOutput, "lapis", EternalGeneralItems.LAPIS_LAZULI_DUST.get(), Items.LAPIS_LAZULI);

        //EO Materials
        generateDustToMaterialBlasting(recipeOutput, "aluminum", EternalGeneralItems.ALUMINUM_DUST.get(), EternalGeneralItems.ALUMINUM_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "blue_steel", EternalGeneralItems.BLUE_STEEL_DUST.get(), EternalGeneralItems.BLUE_STEEL_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "brass", EternalGeneralItems.BRASS_DUST.get(), EternalGeneralItems.BRASS_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "britannia_silver", EternalGeneralItems.BRITANNIA_SILVER_DUST.get(), EternalGeneralItems.BRITANNIA_SILVER_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "bronze", EternalGeneralItems.BRONZE_DUST.get(), EternalGeneralItems.BRONZE_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "cast_iron", EternalGeneralItems.CAST_IRON_DUST.get(), EternalGeneralItems.CAST_IRON_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "cast_steel", EternalGeneralItems.CAST_STEEL_DUST.get(), EternalGeneralItems.CAST_STEEL_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "cobalt", EternalGeneralItems.COBALT_DUST.get(), EternalGeneralItems.COBALT_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "constantan", EternalGeneralItems.CONSTANTAN_DUST.get(), EternalGeneralItems.CONSTANTAN_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "electrum", EternalGeneralItems.ELECTRUM_DUST.get(), EternalGeneralItems.ELECTRUM_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "enderium", EternalGeneralItems.ENDERIUM_DUST.get(), EternalGeneralItems.ENDERIUM_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "gallium", EternalGeneralItems.GALLIUM_DUST.get(), EternalGeneralItems.GALLIUM_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "graphite", EternalGeneralItems.GRAPHITE_DUST.get(), EternalGeneralItems.GRAPHITE_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "invar", EternalGeneralItems.INVAR_DUST.get(), EternalGeneralItems.INVAR_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "iridium", EternalGeneralItems.IRIDIUM_DUST.get(), EternalGeneralItems.IRIDIUM_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "lead", EternalGeneralItems.LEAD_DUST.get(), EternalGeneralItems.LEAD_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "lumium", EternalGeneralItems.LUMIUM_DUST.get(), EternalGeneralItems.LUMIUM_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "nethersteel", EternalGeneralItems.NETHERSTEEL_DUST.get(), EternalGeneralItems.NETHERSTEEL_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "nickel", EternalGeneralItems.NICKEL_DUST.get(), EternalGeneralItems.NICKEL_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "osmium", EternalGeneralItems.OSMIUM_DUST.get(), EternalGeneralItems.OSMIUM_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "pewter", EternalGeneralItems.PEWTER_DUST.get(), EternalGeneralItems.PEWTER_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "pig_iron", EternalGeneralItems.PIG_IRON_DUST.get(), EternalGeneralItems.PIG_IRON_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "platinum", EternalGeneralItems.PLATINUM_DUST.get(), EternalGeneralItems.PLATINUM_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "plutonium", EternalGeneralItems.PLUTONIUM_DUST.get(), EternalGeneralItems.PLUTONIUM_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "rose_gold", EternalGeneralItems.ROSE_GOLD_DUST.get(), EternalGeneralItems.ROSE_GOLD_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "signalum", EternalGeneralItems.SIGNALUM_DUST.get(), EternalGeneralItems.SIGNALUM_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "silver", EternalGeneralItems.SILVER_DUST.get(), EternalGeneralItems.SILVER_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "shadowsteel", EternalGeneralItems.SHADOWSTEEL_DUST.get(), EternalGeneralItems.SHADOWSTEEL_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "steel", EternalGeneralItems.STEEL_DUST.get(), EternalGeneralItems.STEEL_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "tin", EternalGeneralItems.TIN_DUST.get(), EternalGeneralItems.TIN_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "titanium", EternalGeneralItems.TITANIUM_DUST.get(), EternalGeneralItems.TITANIUM_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "ultimatitanium", EternalGeneralItems.ULTIMATITANIUM_DUST.get(), EternalGeneralItems.ULTIMATITANIUM_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "uraninite", EternalGeneralItems.URANINITE_DUST.get(), EternalGeneralItems.URANINITE_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "uranium", EternalGeneralItems.URANIUM_DUST.get(), EternalGeneralItems.URANIUM_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "wrought_iron", EternalGeneralItems.WROUGHT_IRON_DUST.get(), EternalGeneralItems.WROUGHT_IRON_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "zinc", EternalGeneralItems.ZINC_DUST.get(), EternalGeneralItems.ZINC_INGOT.get());

        generateDustToMaterialBlasting(recipeOutput, "amber", EternalGeneralItems.AMBER_DUST.get(), EternalGeneralItems.GEM_AMBER.get());
        generateDustToMaterialBlasting(recipeOutput, "apatite", EternalGeneralItems.APATITE_DUST.get(), EternalGeneralItems.GEM_APATITE.get());
        generateDustToMaterialBlasting(recipeOutput, "cinnabar", EternalGeneralItems.CINNABAR_DUST.get(), EternalGeneralItems.GEM_CINNABAR.get());
        generateDustToMaterialBlasting(recipeOutput, "necroticarite", EternalGeneralItems.NECROTICARITE_DUST.get(), EternalGeneralItems.GEM_NECROTICARITE.get());
        generateDustToMaterialBlasting(recipeOutput, "niter", EternalGeneralItems.NITER_DUST.get(), EternalGeneralItems.GEM_NITER.get());
        generateDustToMaterialBlasting(recipeOutput, "onyx", EternalGeneralItems.ONYX_DUST.get(), EternalGeneralItems.GEM_ONYX.get());
        generateDustToMaterialBlasting(recipeOutput, "peridot", EternalGeneralItems.PERIDOT_DUST.get(), EternalGeneralItems.GEM_PERIDOT.get());
        generateDustToMaterialBlasting(recipeOutput, "ruby", EternalGeneralItems.RUBY_DUST.get(), EternalGeneralItems.GEM_RUBY.get());
        generateDustToMaterialBlasting(recipeOutput, "sapphire", EternalGeneralItems.SAPPHIRE_DUST.get(), EternalGeneralItems.GEM_SAPPHIRE.get());

        ///
        //Blasting var
        generateRawBlockToMaterialBlasting(recipeOutput, "copper", Items.RAW_COPPER_BLOCK, Items.COPPER_BLOCK);
        generateRawBlockToMaterialBlasting(recipeOutput, "gold", Items.RAW_GOLD_BLOCK, Items.GOLD_BLOCK);
        generateRawBlockToMaterialBlasting(recipeOutput, "iron", Items.RAW_IRON_BLOCK, Items.IRON_BLOCK);

        //EO Materials
        generateRawBlockToMaterialBlasting(recipeOutput, "aluminum", EternalGeneralBlocks.RAW_ALUMINUM_BLOCK.asItem(), EternalGeneralBlocks.ALUMINUM_BLOCK.asItem());
        generateRawBlockToMaterialBlasting(recipeOutput, "cobalt", EternalGeneralBlocks.RAW_COBALT_BLOCK.asItem(), EternalGeneralBlocks.COBALT_BLOCK.asItem());
        generateRawBlockToMaterialBlasting(recipeOutput, "gallium", EternalGeneralBlocks.RAW_GALLIUM_BLOCK.asItem(), EternalGeneralBlocks.GALLIUM_BLOCK.asItem());
        generateRawBlockToMaterialBlasting(recipeOutput, "iridium", EternalGeneralBlocks.RAW_IRIDIUM_BLOCK.asItem(), EternalGeneralBlocks.IRIDIUM_BLOCK.asItem());
        generateRawBlockToMaterialBlasting(recipeOutput, "lead", EternalGeneralBlocks.RAW_LEAD_BLOCK.asItem(), EternalGeneralBlocks.LEAD_BLOCK.asItem());
        generateRawBlockToMaterialBlasting(recipeOutput, "nickel", EternalGeneralBlocks.RAW_NICKEL_BLOCK.asItem(), EternalGeneralBlocks.NICKEL_BLOCK.asItem());
        generateRawBlockToMaterialBlasting(recipeOutput, "osmium", EternalGeneralBlocks.RAW_OSMIUM_BLOCK.asItem(), EternalGeneralBlocks.OSMIUM_BLOCK.asItem());
        generateRawBlockToMaterialBlasting(recipeOutput, "platinum", EternalGeneralBlocks.RAW_PLATINUM_BLOCK.asItem(), EternalGeneralBlocks.PLATINUM_BLOCK.asItem());
        generateRawBlockToMaterialBlasting(recipeOutput, "plutonium", EternalGeneralBlocks.RAW_PLUTONIUM_BLOCK.asItem(), EternalGeneralBlocks.PLUTONIUM_BLOCK.asItem());
        generateRawBlockToMaterialBlasting(recipeOutput, "silver", EternalGeneralBlocks.RAW_SILVER_BLOCK.asItem(), EternalGeneralBlocks.SILVER_BLOCK.asItem());
        generateRawBlockToMaterialBlasting(recipeOutput, "tin", EternalGeneralBlocks.RAW_TIN_BLOCK.asItem(), EternalGeneralBlocks.TIN_BLOCK.asItem());
        //generateRawBlockToMaterialBlasting(recipeOutput, "ultimatitanium", EternalGeneralBlocks.RAW_ULTIMATITANIUM_BLOCK.asItem(), EternalGeneralBlocks.ULTIMATITANIUM_BLOCK.asItem());
        generateRawBlockToMaterialBlasting(recipeOutput, "uraninite", EternalGeneralBlocks.RAW_URANINITE_BLOCK.asItem(), EternalGeneralBlocks.URANINITE_BLOCK.asItem());
        generateRawBlockToMaterialBlasting(recipeOutput, "uranium", EternalGeneralBlocks.RAW_URANIUM_BLOCK.asItem(), EternalGeneralBlocks.URANIUM_BLOCK.asItem());
        generateRawBlockToMaterialBlasting(recipeOutput, "zinc", EternalGeneralBlocks.RAW_ZINC_BLOCK.asItem(), EternalGeneralBlocks.ZINC_BLOCK.asItem());

        ///
        //Blasting var
        generateOreBlockToMaterialBlasting(recipeOutput, "stone_aluminum", EternalGeneralBlocks.ALUMINUM_ORE_BLOCK.asItem(), EternalGeneralItems.ALUMINUM_INGOT.get());
        generateOreBlockToMaterialBlasting(recipeOutput, "deepslate_aluminum", EternalGeneralBlocks.DEEPSLATE_ALUMINUM_ORE_BLOCK.asItem(), EternalGeneralItems.ALUMINUM_INGOT.get());
        generateOreBlockToMaterialBlasting(recipeOutput, "stone_cobalt", EternalGeneralBlocks.COBALT_ORE_BLOCK.asItem(), EternalGeneralItems.COBALT_INGOT.get());
        generateOreBlockToMaterialBlasting(recipeOutput, "deepslate_cobalt", EternalGeneralBlocks.DEEPSLATE_COBALT_ORE_BLOCK.asItem(), EternalGeneralItems.COBALT_INGOT.get());
        generateOreBlockToMaterialBlasting(recipeOutput, "stone_gallium", EternalGeneralBlocks.GALLIUM_ORE_BLOCK.asItem(), EternalGeneralItems.GALLIUM_INGOT.get());
        generateOreBlockToMaterialBlasting(recipeOutput, "deepslate_gallium", EternalGeneralBlocks.DEEPSLATE_GALLIUM_ORE_BLOCK.asItem(), EternalGeneralItems.GALLIUM_INGOT.get());
        generateOreBlockToMaterialBlasting(recipeOutput, "stone_iridium", EternalGeneralBlocks.IRIDIUM_ORE_BLOCK.asItem(), EternalGeneralItems.IRIDIUM_INGOT.get());
        generateOreBlockToMaterialBlasting(recipeOutput, "deepslate_iridium", EternalGeneralBlocks.DEEPSLATE_IRIDIUM_ORE_BLOCK.asItem(), EternalGeneralItems.IRIDIUM_INGOT.get());
        generateOreBlockToMaterialBlasting(recipeOutput, "stone_lead", EternalGeneralBlocks.LEAD_ORE_BLOCK.asItem(), EternalGeneralItems.LEAD_INGOT.get());
        generateOreBlockToMaterialBlasting(recipeOutput, "deepslate_lead", EternalGeneralBlocks.DEEPSLATE_LEAD_ORE_BLOCK.asItem(), EternalGeneralItems.LEAD_INGOT.get());
        generateOreBlockToMaterialBlasting(recipeOutput, "stone_nickel", EternalGeneralBlocks.NICKEL_ORE_BLOCK.asItem(), EternalGeneralItems.NICKEL_INGOT.get());
        generateOreBlockToMaterialBlasting(recipeOutput, "deepslate_nickel", EternalGeneralBlocks.DEEPSLATE_NICKEL_ORE_BLOCK.asItem(), EternalGeneralItems.NICKEL_INGOT.get());
        generateOreBlockToMaterialBlasting(recipeOutput, "stone_osmium", EternalGeneralBlocks.OSMIUM_ORE_BLOCK.asItem(), EternalGeneralItems.OSMIUM_INGOT.get());
        generateOreBlockToMaterialBlasting(recipeOutput, "deepslate_osmium", EternalGeneralBlocks.DEEPSLATE_OSMIUM_ORE_BLOCK.asItem(), EternalGeneralItems.OSMIUM_INGOT.get());
        generateOreBlockToMaterialBlasting(recipeOutput, "stone_platinum", EternalGeneralBlocks.PLATINUM_ORE_BLOCK.asItem(), EternalGeneralItems.PLATINUM_INGOT.get());
        generateOreBlockToMaterialBlasting(recipeOutput, "deepslate_platinum", EternalGeneralBlocks.DEEPSLATE_PLATINUM_ORE_BLOCK.asItem(), EternalGeneralItems.PLATINUM_INGOT.get());
        generateOreBlockToMaterialBlasting(recipeOutput, "stone_silver", EternalGeneralBlocks.SILVER_ORE_BLOCK.asItem(), EternalGeneralItems.SILVER_INGOT.get());
        generateOreBlockToMaterialBlasting(recipeOutput, "deepslate_silver", EternalGeneralBlocks.DEEPSLATE_SILVER_ORE_BLOCK.asItem(), EternalGeneralItems.SILVER_INGOT.get());
        generateOreBlockToMaterialBlasting(recipeOutput, "stone_tin", EternalGeneralBlocks.TIN_ORE_BLOCK.asItem(), EternalGeneralItems.TIN_INGOT.get());
        generateOreBlockToMaterialBlasting(recipeOutput, "deepslate_tin", EternalGeneralBlocks.DEEPSLATE_TIN_ORE_BLOCK.asItem(), EternalGeneralItems.TIN_INGOT.get());
        generateOreBlockToMaterialBlasting(recipeOutput, "stone_uraninite", EternalGeneralBlocks.URANINITE_ORE_BLOCK.asItem(), EternalGeneralItems.URANINITE_INGOT.get());
        generateOreBlockToMaterialBlasting(recipeOutput, "deepslate_uraninite", EternalGeneralBlocks.DEEPSLATE_URANINITE_ORE_BLOCK.asItem(), EternalGeneralItems.URANINITE_INGOT.get());
        generateOreBlockToMaterialBlasting(recipeOutput, "stone_uranium", EternalGeneralBlocks.URANIUM_ORE_BLOCK.asItem(), EternalGeneralItems.URANIUM_INGOT.get());
        generateOreBlockToMaterialBlasting(recipeOutput, "deepslate_uranium", EternalGeneralBlocks.DEEPSLATE_URANIUM_ORE_BLOCK.asItem(), EternalGeneralItems.URANIUM_INGOT.get());
        generateOreBlockToMaterialBlasting(recipeOutput, "stone_zinc", EternalGeneralBlocks.ZINC_ORE_BLOCK.asItem(), EternalGeneralItems.ZINC_INGOT.get());
        generateOreBlockToMaterialBlasting(recipeOutput, "deepslate_zinc", EternalGeneralBlocks.DEEPSLATE_ZINC_ORE_BLOCK.asItem(), EternalGeneralItems.ZINC_INGOT.get());

        generateOreBlockToMaterialBlasting(recipeOutput, "stone_sulfur", EternalGeneralBlocks.SULFUR_ORE_BLOCK.asItem(), EternalGeneralItems.SULFUR.get());
        generateOreBlockToMaterialBlasting(recipeOutput, "deepslate_sulfur", EternalGeneralBlocks.DEEPSLATE_SULFUR_ORE_BLOCK.asItem(), EternalGeneralItems.SULFUR.get());

        generateOreBlockToMaterialBlasting(recipeOutput, "stone_amber", EternalGeneralBlocks.AMBER_ORE_BLOCK.asItem(), EternalGeneralItems.GEM_AMBER.get());
        generateOreBlockToMaterialBlasting(recipeOutput, "deepslate_amber", EternalGeneralBlocks.DEEPSLATE_AMBER_ORE_BLOCK.asItem(), EternalGeneralItems.GEM_AMBER.get());
        generateOreBlockToMaterialBlasting(recipeOutput, "stone_apatite", EternalGeneralBlocks.APATITE_ORE_BLOCK.asItem(), EternalGeneralItems.GEM_APATITE.get());
        generateOreBlockToMaterialBlasting(recipeOutput, "deepslate_apatite", EternalGeneralBlocks.DEEPSLATE_APATITE_ORE_BLOCK.asItem(), EternalGeneralItems.GEM_APATITE.get());
        generateOreBlockToMaterialBlasting(recipeOutput, "stone_cinnabar", EternalGeneralBlocks.CINNABAR_ORE_BLOCK.asItem(), EternalGeneralItems.GEM_CINNABAR.get());
        generateOreBlockToMaterialBlasting(recipeOutput, "deepslate_cinnabar", EternalGeneralBlocks.DEEPSLATE_CINNABAR_ORE_BLOCK.asItem(), EternalGeneralItems.GEM_CINNABAR.get());
        generateOreBlockToMaterialBlasting(recipeOutput, "stone_fluorite", EternalGeneralBlocks.FLUORITE_ORE_BLOCK.asItem(), EternalGeneralItems.FLUORITE.get());
        generateOreBlockToMaterialBlasting(recipeOutput, "deepslate_fluorite", EternalGeneralBlocks.DEEPSLATE_FLUORITE_ORE_BLOCK.asItem(), EternalGeneralItems.FLUORITE.get());
        generateOreBlockToMaterialBlasting(recipeOutput, "stone_niter", EternalGeneralBlocks.NITER_ORE_BLOCK.asItem(), EternalGeneralItems.GEM_NITER.get());
        generateOreBlockToMaterialBlasting(recipeOutput, "deepslate_niter", EternalGeneralBlocks.DEEPSLATE_NITER_ORE_BLOCK.asItem(), EternalGeneralItems.GEM_NITER.get());
        generateOreBlockToMaterialBlasting(recipeOutput, "nether_obsidian", EternalGeneralBlocks.OBSIDIAN_ORE_BLOCK.asItem(), EternalGeneralItems.GEM_OBSIDIAN_SHARD.get());
        generateOreBlockToMaterialBlasting(recipeOutput, "stone_ruby", EternalGeneralBlocks.RUBY_ORE_BLOCK.asItem(), EternalGeneralItems.GEM_RUBY.get());
        generateOreBlockToMaterialBlasting(recipeOutput, "deepslate_ruby", EternalGeneralBlocks.DEEPSLATE_RUBY_ORE_BLOCK.asItem(), EternalGeneralItems.GEM_RUBY.get());
        generateOreBlockToMaterialBlasting(recipeOutput, "stone_sapphire", EternalGeneralBlocks.SAPPHIRE_ORE_BLOCK.asItem(), EternalGeneralItems.GEM_SAPPHIRE.get());
        generateOreBlockToMaterialBlasting(recipeOutput, "deepslate_sapphire", EternalGeneralBlocks.DEEPSLATE_SAPPHIRE_ORE_BLOCK.asItem(), EternalGeneralItems.GEM_SAPPHIRE.get());

        generateOreBlockToMaterialBlasting(recipeOutput, "nether_necroticarite", EternalGeneralBlocks.NECROTICARITE_ORE_BLOCK.asItem(), EternalGeneralItems.GEM_NECROTICARITE.get());
    }
}
