package net.radzratz.eternalores.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.radzratz.eternalores.block.EternalGeneralBlocks;
import net.radzratz.eternalores.item.EternalGeneralItems;
import org.jetbrains.annotations.NotNull;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class EternalRecipeProvider extends RecipeProvider implements IConditionBuilder {

    private static final Set<String> EXCLUDED_MAT_DUPE_RECIPES = Set.of(
            "netherite",
            "apatite",
            "fluorite",
            "amber",
            "diamond",
            "emerald",
            "brass",
            "blue_steel",
            "britannia",
            "bronze",
            "constantan",
            "electrum",
            "coal",
            "ender",
            "endstone",
            "netherrack",
            "invar",
            "lapis",
            "cinnabar",
            "lumium",
            "niter",
            "obsidian",
            "peridot",
            "pewter",
            "plutonium",
            "quartz",
            "rose_gold",
            "ruby",
            "sapphire",
            "signalum",
            "steel",
            "titanium",
            "enderium"
    );

    public EternalRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput)
    {
        ///Materials to Dusts
        //Vanilla Ingots
        generateHammerRecipes(recipeOutput, "iron_ingot", Items.IRON_INGOT, EternalGeneralItems.IRON_DUST.get());
        generateHammerRecipes(recipeOutput, "gold_ingot", Items.GOLD_INGOT, EternalGeneralItems.GOLD_DUST.get());
        generateHammerRecipes(recipeOutput, "copper_ingot", Items.COPPER_INGOT, EternalGeneralItems.COPPER_DUST.get());
        generateHammerRecipes(recipeOutput, "netherite_ingot", Items.NETHERITE_INGOT, EternalGeneralItems.NETHERITE_DUST.get());

        //Vanilla Gems
        generateHammerRecipes(recipeOutput, "diamond_gem", Items.DIAMOND, EternalGeneralItems.DIAMOND_DUST.get());
        generateHammerRecipes(recipeOutput, "emerald_gem", Items.EMERALD, EternalGeneralItems.EMERALD_DUST.get());
        //coal is not a gem but close lel
        generateHammerRecipes(recipeOutput, "coal_gem", Items.COAL, EternalGeneralItems.COAL_DUST.get());
        generateHammerRecipes(recipeOutput, "lapis_gem", Items.LAPIS_LAZULI, EternalGeneralItems.LAPIS_LAZULI_DUST.get());
        generateHammerRecipes(recipeOutput, "quartz_gem", Items.QUARTZ, EternalGeneralItems.QUARTZ_DUST.get());

        //EO Ingots
        generateHammerRecipes(recipeOutput, "aluminum_ingot", EternalGeneralItems.ALUMINUM_INGOT.get(), EternalGeneralItems.ALUMINUM_DUST.get());
        generateHammerRecipes(recipeOutput, "blue_steel_ingot", EternalGeneralItems.BLUE_STEEL_INGOT.get(), EternalGeneralItems.BLUE_STEEL_DUST.get());
        generateHammerRecipes(recipeOutput, "brass_ingot", EternalGeneralItems.BRASS_INGOT.get(), EternalGeneralItems.BRASS_DUST.get());
        generateHammerRecipes(recipeOutput, "britannia_ingot", EternalGeneralItems.BRITANNIA_SILVER_INGOT.get(), EternalGeneralItems.BRITANNIA_SILVER_DUST.get());
        generateHammerRecipes(recipeOutput, "bronze_ingot", EternalGeneralItems.BRONZE_INGOT.get(), EternalGeneralItems.BRONZE_DUST.get());
        generateHammerRecipes(recipeOutput, "cobalt_ingot", EternalGeneralItems.COBALT_INGOT.get(), EternalGeneralItems.COBALT_DUST.get());
        generateHammerRecipes(recipeOutput, "constantan_ingot", EternalGeneralItems.CONSTANTAN_INGOT.get(), EternalGeneralItems.CONSTANTAN_DUST.get());
        generateHammerRecipes(recipeOutput, "electrum_ingot", EternalGeneralItems.ELECTRUM_INGOT.get(), EternalGeneralItems.ELECTRUM_DUST.get());
        generateHammerRecipes(recipeOutput, "enderium_ingot", EternalGeneralItems.ENDERIUM_INGOT.get(), EternalGeneralItems.ENDERIUM_DUST.get());
        generateHammerRecipes(recipeOutput, "gallium_ingot", EternalGeneralItems.GALLIUM_INGOT.get(), EternalGeneralItems.GALLIUM_DUST.get());
        generateHammerRecipes(recipeOutput, "invar_ingot", EternalGeneralItems.INVAR_INGOT.get(), EternalGeneralItems.INVAR_DUST.get());
        generateHammerRecipes(recipeOutput, "iridium_ingot", EternalGeneralItems.IRIDIUM_INGOT.get(), EternalGeneralItems.IRIDIUM_DUST.get());
        generateHammerRecipes(recipeOutput, "lead_ingot", EternalGeneralItems.LEAD_INGOT.get(), EternalGeneralItems.LEAD_DUST.get());
        generateHammerRecipes(recipeOutput, "lumium_ingot", EternalGeneralItems.LUMIUM_INGOT.get(), EternalGeneralItems.LUMIUM_DUST.get());
        generateHammerRecipes(recipeOutput, "nickel_ingot", EternalGeneralItems.NICKEL_INGOT.get(), EternalGeneralItems.NICKEL_DUST.get());
        generateHammerRecipes(recipeOutput, "osmium_ingot", EternalGeneralItems.OSMIUM_INGOT.get(), EternalGeneralItems.OSMIUM_DUST.get());
        generateHammerRecipes(recipeOutput, "pewter_ingot", EternalGeneralItems.PEWTER_INGOT.get(), EternalGeneralItems.PEWTER_DUST.get());
        generateHammerRecipes(recipeOutput, "platinum_ingot", EternalGeneralItems.PLATINUM_INGOT.get(), EternalGeneralItems.PLATINUM_DUST.get());
        generateHammerRecipes(recipeOutput, "plutonium_ingot", EternalGeneralItems.PLUTONIUM_INGOT.get(), EternalGeneralItems.PLUTONIUM_DUST.get());
        generateHammerRecipes(recipeOutput, "rose_gold_ingot", EternalGeneralItems.ROSE_GOLD_INGOT.get(), EternalGeneralItems.ROSE_GOLD_DUST.get());
        generateHammerRecipes(recipeOutput, "signalum_ingot", EternalGeneralItems.SIGNALUM_INGOT.get(), EternalGeneralItems.SIGNALUM_DUST.get());
        generateHammerRecipes(recipeOutput, "silver_ingot", EternalGeneralItems.SILVER_INGOT.get(), EternalGeneralItems.SILVER_DUST.get());
        generateHammerRecipes(recipeOutput, "steel_ingot", EternalGeneralItems.STEEL_INGOT.get(), EternalGeneralItems.STEEL_DUST.get());
        generateHammerRecipes(recipeOutput, "tin_ingot", EternalGeneralItems.TIN_INGOT.get(), EternalGeneralItems.TIN_DUST.get());
        generateHammerRecipes(recipeOutput, "titanium_ingot", EternalGeneralItems.TITANIUM_INGOT.get(), EternalGeneralItems.TITANIUM_DUST.get());
        //generateHammerRecipes(recipeOutput, "tungsten_ingot", EternalGeneralItems.TUNGSTEN_INGOT.get(), EternalGeneralItems.TUNGSTEN_DUST.get());
        generateHammerRecipes(recipeOutput, "ultimatitanium_ingot", EternalGeneralItems.ULTIMATITANIUM_INGOT.get(), EternalGeneralItems.ULTIMATITANIUM_DUST.get());
        generateHammerRecipes(recipeOutput, "uranium_ingot", EternalGeneralItems.URANIUM_INGOT.get(), EternalGeneralItems.URANIUM_DUST.get());
        generateHammerRecipes(recipeOutput, "zinc_ingot", EternalGeneralItems.ZINC_INGOT.get(), EternalGeneralItems.ZINC_DUST.get());

        //Misc
        generateHammerRecipes(recipeOutput, "ender_misc", Items.ENDER_PEARL, EternalGeneralItems.ENDER_DUST.get());
        generateHammerRecipes(recipeOutput, "endstone_misc", Blocks.END_STONE.asItem(), EternalGeneralItems.ENDSTONE_DUST.get());
        generateHammerRecipes(recipeOutput, "netherrack_misc", Blocks.NETHERRACK.asItem(), EternalGeneralItems.NETHERRACK_DUST.get());
        generateHammerRecipes(recipeOutput, "obsidian_misc1", Blocks.OBSIDIAN.asItem(), EternalGeneralItems.OBSIDIAN_DUST.get());
        generateHammerRecipes(recipeOutput, "obsidian_misc2", Blocks.CRYING_OBSIDIAN.asItem(), EternalGeneralItems.OBSIDIAN_DUST.get());

        //EO Gems
        generateHammerRecipes(recipeOutput, "amber_gem", EternalGeneralItems.GEM_AMBER.get(), EternalGeneralItems.AMBER_DUST.get());
        generateHammerRecipes(recipeOutput, "apatite_gem", EternalGeneralItems.GEM_APATITE.get(), EternalGeneralItems.APATITE_DUST.get());
        generateHammerRecipes(recipeOutput, "cinnabar_gem", EternalGeneralItems.GEM_CINNABAR.get(), EternalGeneralItems.CINNABAR_DUST.get());
        generateHammerRecipes(recipeOutput, "fluorite_gem", EternalGeneralItems.FLUORITE.get(), EternalGeneralItems.FLUORITE_DUST.get());
        generateHammerRecipes(recipeOutput, "niter_gem", EternalGeneralItems.GEM_NITER.get(), EternalGeneralItems.NITER_DUST.get());
        generateHammerRecipes(recipeOutput, "onyx_gem", EternalGeneralItems.GEM_ONYX.get(), EternalGeneralItems.ONYX_DUST.get());
        generateHammerRecipes(recipeOutput, "peridot_gem", EternalGeneralItems.GEM_PERIDOT.get(), EternalGeneralItems.PERIDOT_DUST.get());
        generateHammerRecipes(recipeOutput, "ruby_gem", EternalGeneralItems.GEM_RUBY.get(), EternalGeneralItems.RUBY_DUST.get());
        generateHammerRecipes(recipeOutput, "sapphire_gem", EternalGeneralItems.GEM_SAPPHIRE.get(), EternalGeneralItems.SAPPHIRE_DUST.get());
        generateHammerRecipes(recipeOutput, "sulfur_gem", EternalGeneralItems.SULFUR.get(), EternalGeneralItems.SULFUR_DUST.get());

        ///Materials to Plates
        generateIngotPlateRecipe(recipeOutput, "iron", EternalGeneralItems.PLATE_IRON.get());
        generateIngotPlateRecipe(recipeOutput, "gold", EternalGeneralItems.PLATE_GOLD.get());
        generateIngotPlateRecipe(recipeOutput, "copper", EternalGeneralItems.PLATE_COPPER.get());
        generateIngotPlateRecipe(recipeOutput, "netherite", EternalGeneralItems.PLATE_NETHERITE.get());

        generateGemPlateRecipe(recipeOutput, "diamond", EternalGeneralItems.PLATE_DIAMOND.get());

        //EO Mats
        generateIngotPlateRecipe(recipeOutput, "aluminum", EternalGeneralItems.PLATE_ALUMINUM.get());
        generateIngotPlateRecipe(recipeOutput, "blue_steel", EternalGeneralItems.PLATE_BLUE_STEEL.get());
        generateIngotPlateRecipe(recipeOutput, "brass", EternalGeneralItems.PLATE_BRASS.get());
        generateIngotPlateRecipe(recipeOutput, "bronze", EternalGeneralItems.PLATE_BRONZE.get());
        generateIngotPlateRecipe(recipeOutput, "cobalt", EternalGeneralItems.PLATE_COBALT.get());
        generateIngotPlateRecipe(recipeOutput, "constantan", EternalGeneralItems.PLATE_CONSTANTAN.get());
        generateIngotPlateRecipe(recipeOutput, "electrum", EternalGeneralItems.PLATE_ELECTRUM.get());
        generateIngotPlateRecipe(recipeOutput, "enderium", EternalGeneralItems.PLATE_ENDERIUM.get());
        generateIngotPlateRecipe(recipeOutput, "gallium", EternalGeneralItems.PLATE_GALLIUM.get());
        generateIngotPlateRecipe(recipeOutput, "graphite", EternalGeneralItems.PLATE_GRAPHITE.get());
        generateIngotPlateRecipe(recipeOutput, "invar", EternalGeneralItems.PLATE_INVAR.get());
        generateIngotPlateRecipe(recipeOutput, "iridium", EternalGeneralItems.PLATE_IRIDIUM.get());
        generateIngotPlateRecipe(recipeOutput, "lead", EternalGeneralItems.PLATE_LEAD.get());
        generateIngotPlateRecipe(recipeOutput, "lumium", EternalGeneralItems.PLATE_LUMIUM.get());
        generateIngotPlateRecipe(recipeOutput, "nickel", EternalGeneralItems.PLATE_NICKEL.get());
        generateIngotPlateRecipe(recipeOutput, "osmium", EternalGeneralItems.PLATE_OSMIUM.get());
        generateIngotPlateRecipe(recipeOutput, "platinum", EternalGeneralItems.PLATE_PLATINUM.get());
        generateIngotPlateRecipe(recipeOutput, "plutonium", EternalGeneralItems.PLATE_PLUTONIUM.get());
        generateIngotPlateRecipe(recipeOutput, "rose_gold", EternalGeneralItems.PLATE_ROSE_GOLD.get());
        generateIngotPlateRecipe(recipeOutput, "signalum", EternalGeneralItems.PLATE_SIGNALUM.get());
        generateIngotPlateRecipe(recipeOutput, "silver", EternalGeneralItems.PLATE_SILVER.get());
        generateIngotPlateRecipe(recipeOutput, "steel", EternalGeneralItems.PLATE_STEEL.get());
        generateIngotPlateRecipe(recipeOutput, "tin", EternalGeneralItems.PLATE_TIN.get());
        generateIngotPlateRecipe(recipeOutput, "titanium", EternalGeneralItems.PLATE_TITANIUM.get());
        //generateIngotPlateRecipe(recipeOutput, "tungsten", EternalGeneralItems.PLATE_TUNGSTEN.get());
        generateIngotPlateRecipe(recipeOutput, "ultimatitanium", EternalGeneralItems.PLATE_ULTIMATITANIUM.get());
        generateIngotPlateRecipe(recipeOutput, "uranium", EternalGeneralItems.PLATE_URANIUM.get());
        generateIngotPlateRecipe(recipeOutput, "zinc", EternalGeneralItems.PLATE_ZINC.get());

        generateGemPlateRecipe(recipeOutput, "sapphire", EternalGeneralItems.PLATE_SAPPHIRE.get());

        ///Materials to Rods
        generateIngotRodsRecipe(recipeOutput, "iron", EternalGeneralItems.ROD_IRON.get());
        generateIngotRodsRecipe(recipeOutput, "gold", EternalGeneralItems.ROD_GOLD.get());
        generateIngotRodsRecipe(recipeOutput, "copper", EternalGeneralItems.ROD_COPPER.get());
        generateIngotRodsRecipe(recipeOutput, "netherite", EternalGeneralItems.ROD_NETHERITE.get());

        generateGemRodsRecipe(recipeOutput, "diamond", EternalGeneralItems.ROD_DIAMOND.get());

        //EO Mats
        generateIngotRodsRecipe(recipeOutput, "aluminum", EternalGeneralItems.ROD_ALUMINUM.get());
        generateIngotRodsRecipe(recipeOutput, "blue_steel", EternalGeneralItems.ROD_BLUE_STEEL.get());
        generateIngotRodsRecipe(recipeOutput, "brass", EternalGeneralItems.ROD_BRASS.get());
        generateIngotRodsRecipe(recipeOutput, "bronze", EternalGeneralItems.ROD_BRONZE.get());
        generateIngotRodsRecipe(recipeOutput, "cobalt", EternalGeneralItems.ROD_COBALT.get());
        generateIngotRodsRecipe(recipeOutput, "constantan", EternalGeneralItems.ROD_CONSTANTAN.get());
        generateIngotRodsRecipe(recipeOutput, "electrum", EternalGeneralItems.ROD_ELECTRUM.get());
        generateIngotRodsRecipe(recipeOutput, "enderium", EternalGeneralItems.ROD_ENDERIUM.get());
        generateIngotRodsRecipe(recipeOutput, "gallium", EternalGeneralItems.ROD_GALLIUM.get());
        generateIngotRodsRecipe(recipeOutput, "graphite", EternalGeneralItems.ROD_GRAPHITE.get());
        generateIngotRodsRecipe(recipeOutput, "invar", EternalGeneralItems.ROD_INVAR.get());
        generateIngotRodsRecipe(recipeOutput, "iridium", EternalGeneralItems.ROD_IRIDIUM.get());
        generateIngotRodsRecipe(recipeOutput, "lead", EternalGeneralItems.ROD_LEAD.get());
        generateIngotRodsRecipe(recipeOutput, "lumium", EternalGeneralItems.ROD_LUMIUM.get());
        generateIngotRodsRecipe(recipeOutput, "nickel", EternalGeneralItems.ROD_NICKEL.get());
        generateIngotRodsRecipe(recipeOutput, "osmium", EternalGeneralItems.ROD_OSMIUM.get());
        generateIngotRodsRecipe(recipeOutput, "platinum", EternalGeneralItems.ROD_PLATINUM.get());
        generateIngotRodsRecipe(recipeOutput, "plutonium", EternalGeneralItems.ROD_PLUTONIUM.get());
        generateIngotRodsRecipe(recipeOutput, "rose_gold", EternalGeneralItems.ROD_ROSE_GOLD.get());
        generateIngotRodsRecipe(recipeOutput, "signalum", EternalGeneralItems.ROD_SIGNALUM.get());
        generateIngotRodsRecipe(recipeOutput, "silver", EternalGeneralItems.ROD_SILVER.get());
        generateIngotRodsRecipe(recipeOutput, "steel", EternalGeneralItems.ROD_STEEL.get());
        generateIngotRodsRecipe(recipeOutput, "tin", EternalGeneralItems.ROD_TIN.get());
        generateIngotRodsRecipe(recipeOutput, "titanium", EternalGeneralItems.ROD_TITANIUM.get());
        //generateIngotRodsRecipe(recipeOutput, "tungsten", EternalGeneralItems.ROD_TUNGSTEN.get());
        generateIngotRodsRecipe(recipeOutput, "ultimatitanium", EternalGeneralItems.ROD_ULTIMATITANIUM.get());
        generateIngotRodsRecipe(recipeOutput, "uranium", EternalGeneralItems.ROD_URANIUM.get());
        generateIngotRodsRecipe(recipeOutput, "zinc", EternalGeneralItems.ROD_ZINC.get());

        generateGemRodsRecipe(recipeOutput, "sapphire", EternalGeneralItems.ROD_SAPPHIRE.get());

        ///Blocks to Materials
        //Block to Ingot/Gem
        generateBlockToIngotMaterialRecipe(recipeOutput, "aluminum", EternalGeneralBlocks.ALUMINUM_BLOCK.asItem(), EternalGeneralItems.ALUMINUM_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "blue_steel", EternalGeneralBlocks.BLUE_STEEL_BLOCK.asItem(), EternalGeneralItems.BLUE_STEEL_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "brass", EternalGeneralBlocks.BRASS_BLOCK.asItem(), EternalGeneralItems.BRASS_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "britannia", EternalGeneralBlocks.BRITANNIA_SILVER_BLOCK.asItem(), EternalGeneralItems.BRITANNIA_SILVER_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "bronze", EternalGeneralBlocks.BRONZE_BLOCK.asItem(), EternalGeneralItems.BRONZE_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "cobalt", EternalGeneralBlocks.COBALT_BLOCK.asItem(), EternalGeneralItems.COBALT_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "constantan", EternalGeneralBlocks.CONSTANTAN_BLOCK.asItem(), EternalGeneralItems.CONSTANTAN_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "electrum", EternalGeneralBlocks.ELECTRUM_BLOCK.asItem(), EternalGeneralItems.ELECTRUM_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "enderium", EternalGeneralBlocks.ENDERIUM_BLOCK.asItem(), EternalGeneralItems.ENDERIUM_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "gallium", EternalGeneralBlocks.GALLIUM_BLOCK.asItem(), EternalGeneralItems.GALLIUM_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "graphite", EternalGeneralBlocks.GRAPHITE_BLOCK.asItem(), EternalGeneralItems.GRAPHITE_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "invar", EternalGeneralBlocks.INVAR_BLOCK.asItem(), EternalGeneralItems.INVAR_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "iridium", EternalGeneralBlocks.IRIDIUM_BLOCK.asItem(), EternalGeneralItems.IRIDIUM_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "lead", EternalGeneralBlocks.LEAD_BLOCK.asItem(), EternalGeneralItems.LEAD_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "lumium", EternalGeneralBlocks.LUMIUM_BLOCK.asItem(), EternalGeneralItems.LUMIUM_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "nickel", EternalGeneralBlocks.NICKEL_BLOCK.asItem(), EternalGeneralItems.NICKEL_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "osmium", EternalGeneralBlocks.OSMIUM_BLOCK.asItem(), EternalGeneralItems.OSMIUM_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "pewter", EternalGeneralBlocks.PEWTER_BLOCK.asItem(), EternalGeneralItems.PEWTER_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "platinum", EternalGeneralBlocks.PLATINUM_BLOCK.asItem(), EternalGeneralItems.PLATINUM_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "plutonium", EternalGeneralBlocks.PLUTONIUM_BLOCK.asItem(), EternalGeneralItems.PLUTONIUM_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "rose_gold", EternalGeneralBlocks.ROSE_GOLD_BLOCK.asItem(), EternalGeneralItems.ROSE_GOLD_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "signalum", EternalGeneralBlocks.SIGNALUM_BLOCK.asItem(), EternalGeneralItems.SIGNALUM_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "silver", EternalGeneralBlocks.SILVER_BLOCK.asItem(), EternalGeneralItems.SILVER_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "steel", EternalGeneralBlocks.STEEL_BLOCK.asItem(), EternalGeneralItems.STEEL_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "tin", EternalGeneralBlocks.TIN_BLOCK.asItem(), EternalGeneralItems.TIN_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "titanium", EternalGeneralBlocks.TITANIUM_BLOCK.asItem(), EternalGeneralItems.TITANIUM_INGOT.get());
        //generateBlockToIngotMaterialRecipe(recipeOutput, "tungsten", EternalGeneralBlocks.TUNGSTEN_BLOCK.asItem(), EternalGeneralItems.TUNGSTEN_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "ultimatitanium", EternalGeneralBlocks.ULTIMATITANIUM_BLOCK.asItem(), EternalGeneralItems.ULTIMATITANIUM_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "uranium", EternalGeneralBlocks.URANIUM_BLOCK.asItem(), EternalGeneralItems.URANIUM_INGOT.get());
        generateBlockToIngotMaterialRecipe(recipeOutput, "zinc", EternalGeneralBlocks.ZINC_BLOCK.asItem(), EternalGeneralItems.ZINC_INGOT.get());

        generateBlockToGemMaterialRecipe(recipeOutput, "amber", EternalGeneralBlocks.AMBER_BLOCK.asItem(), EternalGeneralItems.GEM_AMBER.get());
        generateBlockToGemMaterialRecipe(recipeOutput, "apatite", EternalGeneralBlocks.APATITE_BLOCK.asItem(), EternalGeneralItems.GEM_APATITE.get());
        generateBlockToGemMaterialRecipe(recipeOutput, "cinnabar", EternalGeneralBlocks.CINNABAR_BLOCK.asItem(), EternalGeneralItems.GEM_CINNABAR.get());
        generateBlockToGemMaterialRecipe(recipeOutput, "fluorite", EternalGeneralBlocks.FLUORITE_BLOCK.asItem(), EternalGeneralItems.FLUORITE.get());
        generateBlockToGemMaterialRecipe(recipeOutput, "niter", EternalGeneralBlocks.NITER_BLOCK.asItem(), EternalGeneralItems.GEM_NITER.get());
        generateBlockToGemMaterialRecipe(recipeOutput, "onyx", EternalGeneralBlocks.ONYX_BLOCK.asItem(), EternalGeneralItems.GEM_ONYX.get());
        generateBlockToGemMaterialRecipe(recipeOutput, "peridot", EternalGeneralBlocks.PERIDOT_BLOCK.asItem(), EternalGeneralItems.GEM_PERIDOT.get());
        generateBlockToGemMaterialRecipe(recipeOutput, "ruby", EternalGeneralBlocks.RUBY_BLOCK.asItem(), EternalGeneralItems.GEM_RUBY.get());
        generateBlockToGemMaterialRecipe(recipeOutput, "sapphire", EternalGeneralBlocks.SAPPHIRE_BLOCK.asItem(), EternalGeneralItems.GEM_SAPPHIRE.get());

        //Raw Ore Block to Raw Material
        generateBlockToRawMaterialRecipe(recipeOutput, "aluminum", EternalGeneralBlocks.RAW_ALUMINUM_BLOCK.asItem(), EternalGeneralItems.RAW_ALUMINUM.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "cobalt", EternalGeneralBlocks.RAW_COBALT_BLOCK.asItem(), EternalGeneralItems.RAW_COBALT.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "gallium", EternalGeneralBlocks.RAW_GALLIUM_BLOCK.asItem(), EternalGeneralItems.RAW_GALLIUM.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "iridium", EternalGeneralBlocks.RAW_IRIDIUM_BLOCK.asItem(), EternalGeneralItems.RAW_IRIDIUM.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "lead", EternalGeneralBlocks.RAW_LEAD_BLOCK.asItem(), EternalGeneralItems.RAW_LEAD.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "nickel", EternalGeneralBlocks.RAW_NICKEL_BLOCK.asItem(), EternalGeneralItems.RAW_NICKEL.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "osmium", EternalGeneralBlocks.RAW_OSMIUM_BLOCK.asItem(), EternalGeneralItems.RAW_OSMIUM.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "platinum", EternalGeneralBlocks.RAW_PLATINUM_BLOCK.asItem(), EternalGeneralItems.RAW_PLATINUM.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "plutonium", EternalGeneralBlocks.RAW_PLUTONIUM_BLOCK.asItem(), EternalGeneralItems.RAW_PLUTONIUM.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "silver", EternalGeneralBlocks.RAW_SILVER_BLOCK.asItem(), EternalGeneralItems.RAW_SILVER.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "sulfur", EternalGeneralBlocks.SULFUR_BLOCK.asItem(), EternalGeneralItems.SULFUR.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "tin", EternalGeneralBlocks.RAW_TIN_BLOCK.asItem(), EternalGeneralItems.RAW_TIN.get());
        //generateBlockToRawMaterialRecipe(recipeOutput, "tungsten", EternalGeneralBlocks.RAW_TUNGSTEN_BLOCK.asItem(), EternalGeneralItems.RAW_TUNGSTEN.get());
        //generateBlockToRawMaterialRecipe(recipeOutput, "ultimatitanium", EternalGeneralBlocks.RAW_ULTIMATITANIUM_BLOCK.asItem(), EternalGeneralItems.RAW_ULTIMATITANIUM.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "uranium", EternalGeneralBlocks.RAW_URANIUM_BLOCK.asItem(), EternalGeneralItems.RAW_URANIUM.get());
        generateBlockToRawMaterialRecipe(recipeOutput, "zinc", EternalGeneralBlocks.RAW_ZINC_BLOCK.asItem(), EternalGeneralItems.RAW_ZINC.get());

        ///Materials to Block
        //Raw Ore to Block
        generateRawMaterialToBlockRecipe(recipeOutput, "aluminum", EternalGeneralItems.RAW_ALUMINUM.get(), EternalGeneralBlocks.RAW_ALUMINUM_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "cobalt", EternalGeneralItems.RAW_COBALT.get(), EternalGeneralBlocks.RAW_COBALT_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "gallium", EternalGeneralItems.RAW_GALLIUM.get(), EternalGeneralBlocks.RAW_GALLIUM_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "iridium", EternalGeneralItems.RAW_IRIDIUM.get(), EternalGeneralBlocks.RAW_IRIDIUM_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "lead", EternalGeneralItems.RAW_LEAD.get(), EternalGeneralBlocks.RAW_LEAD_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "nickel", EternalGeneralItems.RAW_NICKEL.get(), EternalGeneralBlocks.RAW_NICKEL_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "osmium", EternalGeneralItems.RAW_OSMIUM.get(), EternalGeneralBlocks.RAW_OSMIUM_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "platinum", EternalGeneralItems.RAW_PLATINUM.get(), EternalGeneralBlocks.RAW_PLATINUM_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "plutonium", EternalGeneralItems.RAW_PLUTONIUM.get(), EternalGeneralBlocks.RAW_PLUTONIUM_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "silver", EternalGeneralItems.RAW_SILVER.get(), EternalGeneralBlocks.RAW_SILVER_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "sulfur", EternalGeneralItems.SULFUR.get(), EternalGeneralBlocks.SULFUR_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "tin", EternalGeneralItems.RAW_TIN.get(), EternalGeneralBlocks.RAW_TIN_BLOCK.asItem());
        //generateRawMaterialToBlockRecipe(recipeOutput, "tungsten", EternalGeneralItems.RAW_TUNGSTEN.get(), EternalGeneralBlocks.RAW_TUNGSTEN_BLOCK.asItem());
        //generateRawMaterialToBlockRecipe(recipeOutput, "ultimatitanium", EternalGeneralItems.RAW_ULTIMATITANIUM.get(), EternalGeneralBlocks.RAW_ULTIMATITANIUM_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "uranium", EternalGeneralItems.RAW_URANIUM.get(), EternalGeneralBlocks.RAW_URANIUM_BLOCK.asItem());
        generateRawMaterialToBlockRecipe(recipeOutput, "zinc", EternalGeneralItems.RAW_ZINC.get(), EternalGeneralBlocks.RAW_ZINC_BLOCK.asItem());

        //Ingot/Gem to Block
        generateIngotToBlockRecipe(recipeOutput, "aluminum", EternalGeneralItems.ALUMINUM_INGOT.get(), EternalGeneralBlocks.ALUMINUM_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "blue_steel", EternalGeneralItems.BLUE_STEEL_INGOT.get(), EternalGeneralBlocks.BLUE_STEEL_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "brass", EternalGeneralItems.BRASS_INGOT.get(), EternalGeneralBlocks.BRASS_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "britannia", EternalGeneralItems.BRITANNIA_SILVER_INGOT.get(), EternalGeneralBlocks.BRITANNIA_SILVER_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "bronze", EternalGeneralItems.BRONZE_INGOT.get(), EternalGeneralBlocks.BRONZE_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "cobalt", EternalGeneralItems.COBALT_INGOT.get(), EternalGeneralBlocks.COBALT_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "constantan", EternalGeneralItems.CONSTANTAN_INGOT.get(), EternalGeneralBlocks.CONSTANTAN_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "electrum", EternalGeneralItems.ELECTRUM_INGOT.get(), EternalGeneralBlocks.ELECTRUM_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "enderium", EternalGeneralItems.ENDERIUM_INGOT.get(), EternalGeneralBlocks.ENDERIUM_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "gallium", EternalGeneralItems.GALLIUM_INGOT.get(), EternalGeneralBlocks.GALLIUM_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "graphite", EternalGeneralItems.GRAPHITE_INGOT.get(), EternalGeneralBlocks.GRAPHITE_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "invar", EternalGeneralItems.INVAR_INGOT.get(), EternalGeneralBlocks.INVAR_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "iridium", EternalGeneralItems.IRIDIUM_INGOT.get(), EternalGeneralBlocks.IRIDIUM_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "lead", EternalGeneralItems.LEAD_INGOT.get(), EternalGeneralBlocks.LEAD_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "lumium", EternalGeneralItems.LUMIUM_INGOT.get(), EternalGeneralBlocks.LUMIUM_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "nickel", EternalGeneralItems.NICKEL_INGOT.get(), EternalGeneralBlocks.NICKEL_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "osmium", EternalGeneralItems.OSMIUM_INGOT.get(), EternalGeneralBlocks.OSMIUM_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "pewter", EternalGeneralItems.PEWTER_INGOT.get(), EternalGeneralBlocks.PEWTER_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "platinum", EternalGeneralItems.PLATINUM_INGOT.get(), EternalGeneralBlocks.PLATINUM_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "plutonium", EternalGeneralItems.PLUTONIUM_INGOT.get(), EternalGeneralBlocks.PLUTONIUM_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "rose_gold", EternalGeneralItems.ROSE_GOLD_INGOT.get(), EternalGeneralBlocks.ROSE_GOLD_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "signalum", EternalGeneralItems.SIGNALUM_INGOT.get(), EternalGeneralBlocks.SIGNALUM_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "silver", EternalGeneralItems.SILVER_INGOT.get(), EternalGeneralBlocks.SILVER_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "steel", EternalGeneralItems.STEEL_INGOT.get(), EternalGeneralBlocks.STEEL_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "tin", EternalGeneralItems.TIN_INGOT.get(), EternalGeneralBlocks.TIN_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "titanium", EternalGeneralItems.TITANIUM_INGOT.get(), EternalGeneralBlocks.TITANIUM_BLOCK.asItem());
        //generateIngotToBlockRecipe(recipeOutput, "tungsten", EternalGeneralItems.TUNGSTEN_INGOT.get(), EternalGeneralBlocks.TUNGSTEN_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "ultimatitanium", EternalGeneralItems.ULTIMATITANIUM_INGOT.get(), EternalGeneralBlocks.ULTIMATITANIUM_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "uranium", EternalGeneralItems.URANIUM_INGOT.get(), EternalGeneralBlocks.URANIUM_BLOCK.asItem());
        generateIngotToBlockRecipe(recipeOutput, "zinc", EternalGeneralItems.ZINC_INGOT.get(), EternalGeneralBlocks.ZINC_BLOCK.asItem());

        generateGemToBlockRecipe(recipeOutput, "amber", EternalGeneralItems.GEM_AMBER.get(), EternalGeneralBlocks.AMBER_BLOCK.asItem());
        generateGemToBlockRecipe(recipeOutput, "apatite", EternalGeneralItems.GEM_APATITE.get(), EternalGeneralBlocks.APATITE_BLOCK.asItem());
        generateGemToBlockRecipe(recipeOutput, "cinnabar", EternalGeneralItems.GEM_CINNABAR.get(), EternalGeneralBlocks.CINNABAR_BLOCK.asItem());
        generateGemToBlockRecipe(recipeOutput, "fluorite", EternalGeneralItems.FLUORITE.get(), EternalGeneralBlocks.FLUORITE_BLOCK.asItem());
        generateGemToBlockRecipe(recipeOutput, "niter", EternalGeneralItems.GEM_NITER.get(), EternalGeneralBlocks.NITER_BLOCK.asItem());
        generateGemToBlockRecipe(recipeOutput, "onyx", EternalGeneralItems.GEM_ONYX.get(), EternalGeneralBlocks.ONYX_BLOCK.asItem());
        generateGemToBlockRecipe(recipeOutput, "peridot", EternalGeneralItems.GEM_PERIDOT.get(), EternalGeneralBlocks.PERIDOT_BLOCK.asItem());
        generateGemToBlockRecipe(recipeOutput, "ruby", EternalGeneralItems.GEM_RUBY.get(), EternalGeneralBlocks.RUBY_BLOCK.asItem());
        generateGemToBlockRecipe(recipeOutput, "sapphire", EternalGeneralItems.GEM_SAPPHIRE.get(), EternalGeneralBlocks.SAPPHIRE_BLOCK.asItem());

        ///Materials to Nuggets
        //Vanilla Mats
        generateIngotToNuggetRecipe(recipeOutput, "copper", Items.COPPER_INGOT, EternalGeneralItems.COPPER_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "netherite", Items.NETHERITE_INGOT, EternalGeneralItems.NETHERITE_NUGGET.get());

        //EO Mats
        generateIngotToNuggetRecipe(recipeOutput, "aluminum", EternalGeneralItems.ALUMINUM_INGOT.get(), EternalGeneralItems.ALUMINUM_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "blue_steel", EternalGeneralItems.BLUE_STEEL_INGOT.get(), EternalGeneralItems.BLUE_STEEL_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "brass", EternalGeneralItems.BRASS_INGOT.get(), EternalGeneralItems.BRASS_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "britannia", EternalGeneralItems.BRITANNIA_SILVER_INGOT.get(), EternalGeneralItems.BRITANNIA_SILVER_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "bronze", EternalGeneralItems.BRONZE_INGOT.get(), EternalGeneralItems.BRONZE_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "cobalt", EternalGeneralItems.COBALT_INGOT.get(), EternalGeneralItems.COBALT_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "constantan", EternalGeneralItems.CONSTANTAN_INGOT.get(), EternalGeneralItems.CONSTANTAN_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "electrum", EternalGeneralItems.ELECTRUM_INGOT.get(), EternalGeneralItems.ELECTRUM_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "enderium", EternalGeneralItems.ENDERIUM_INGOT.get(), EternalGeneralItems.ENDERIUM_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "gallium", EternalGeneralItems.GALLIUM_INGOT.get(), EternalGeneralItems.GALLIUM_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "graphite", EternalGeneralItems.GRAPHITE_INGOT.get(), EternalGeneralItems.GRAPHITE_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "invar", EternalGeneralItems.INVAR_INGOT.get(), EternalGeneralItems.INVAR_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "iridium", EternalGeneralItems.IRIDIUM_INGOT.get(), EternalGeneralItems.IRIDIUM_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "lead", EternalGeneralItems.LEAD_INGOT.get(), EternalGeneralItems.LEAD_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "lumium", EternalGeneralItems.LUMIUM_INGOT.get(), EternalGeneralItems.LUMIUM_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "nickel", EternalGeneralItems.NICKEL_INGOT.get(), EternalGeneralItems.NICKEL_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "osmium", EternalGeneralItems.OSMIUM_INGOT.get(), EternalGeneralItems.OSMIUM_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "pewter", EternalGeneralItems.PEWTER_INGOT.get(), EternalGeneralItems.PEWTER_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "platinum", EternalGeneralItems.PLATINUM_INGOT.get(), EternalGeneralItems.PLATINUM_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "plutonium", EternalGeneralItems.PLUTONIUM_INGOT.get(), EternalGeneralItems.PLUTONIUM_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "rose_gold", EternalGeneralItems.ROSE_GOLD_INGOT.get(), EternalGeneralItems.ROSE_GOLD_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "signalum", EternalGeneralItems.SIGNALUM_INGOT.get(), EternalGeneralItems.SIGNALUM_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "silver", EternalGeneralItems.SILVER_INGOT.get(), EternalGeneralItems.SILVER_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "steel", EternalGeneralItems.STEEL_INGOT.get(), EternalGeneralItems.STEEL_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "tin", EternalGeneralItems.TIN_INGOT.get(), EternalGeneralItems.TIN_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "titanium", EternalGeneralItems.TITANIUM_INGOT.get(), EternalGeneralItems.TITANIUM_NUGGET.get());
        //generateIngotToNuggetRecipe(recipeOutput, "tungsten", EternalGeneralItems.TUNGSTEN_INGOT.get(), EternalGeneralItems.TUNGSTEN_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "ultimatitanium", EternalGeneralItems.ULTIMATITANIUM_INGOT.get(), EternalGeneralItems.ULTIMATITANIUM_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "uranium", EternalGeneralItems.URANIUM_INGOT.get(), EternalGeneralItems.URANIUM_NUGGET.get());
        generateIngotToNuggetRecipe(recipeOutput, "zinc", EternalGeneralItems.ZINC_INGOT.get(), EternalGeneralItems.ZINC_NUGGET.get());

        ///Materials to Ingots
        //Vanilla Mats
        generateNuggetToIngotRecipe(recipeOutput, "copper", EternalGeneralItems.COPPER_NUGGET.get(), Items.COPPER_INGOT);
        generateNuggetToIngotRecipe(recipeOutput, "netherite", EternalGeneralItems.NETHERITE_NUGGET.get(), Items.NETHERITE_INGOT);

        //EO Mats
        generateNuggetToIngotRecipe(recipeOutput, "aluminum", EternalGeneralItems.ALUMINUM_NUGGET.get(), EternalGeneralItems.ALUMINUM_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "blue_steel", EternalGeneralItems.BLUE_STEEL_NUGGET.get(), EternalGeneralItems.BLUE_STEEL_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "brass", EternalGeneralItems.BRASS_NUGGET.get(), EternalGeneralItems.BRASS_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "britannia", EternalGeneralItems.BRITANNIA_SILVER_NUGGET.get(), EternalGeneralItems.BRITANNIA_SILVER_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "bronze", EternalGeneralItems.BRONZE_NUGGET.get(), EternalGeneralItems.BRONZE_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "cobalt", EternalGeneralItems.COBALT_NUGGET.get(), EternalGeneralItems.COBALT_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "constantan", EternalGeneralItems.CONSTANTAN_NUGGET.get(), EternalGeneralItems.CONSTANTAN_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "electrum", EternalGeneralItems.ELECTRUM_NUGGET.get(), EternalGeneralItems.ELECTRUM_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "enderium", EternalGeneralItems.ENDERIUM_NUGGET.get(), EternalGeneralItems.ENDERIUM_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "gallium", EternalGeneralItems.GALLIUM_NUGGET.get(), EternalGeneralItems.GALLIUM_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "graphite", EternalGeneralItems.GRAPHITE_NUGGET.get(), EternalGeneralItems.GRAPHITE_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "invar", EternalGeneralItems.INVAR_NUGGET.get(), EternalGeneralItems.INVAR_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "iridium", EternalGeneralItems.IRIDIUM_NUGGET.get(), EternalGeneralItems.IRIDIUM_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "lead", EternalGeneralItems.LEAD_NUGGET.get(), EternalGeneralItems.LEAD_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "lumium", EternalGeneralItems.LUMIUM_NUGGET.get(), EternalGeneralItems.LUMIUM_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "nickel", EternalGeneralItems.NICKEL_NUGGET.get(), EternalGeneralItems.NICKEL_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "osmium", EternalGeneralItems.OSMIUM_NUGGET.get(), EternalGeneralItems.OSMIUM_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "pewter", EternalGeneralItems.PEWTER_NUGGET.get(), EternalGeneralItems.PEWTER_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "platinum", EternalGeneralItems.PLATINUM_NUGGET.get(), EternalGeneralItems.PLATINUM_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "plutonium", EternalGeneralItems.PLUTONIUM_NUGGET.get(), EternalGeneralItems.PLUTONIUM_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "rose_gold", EternalGeneralItems.ROSE_GOLD_NUGGET.get(), EternalGeneralItems.ROSE_GOLD_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "signalum", EternalGeneralItems.SIGNALUM_NUGGET.get(), EternalGeneralItems.SIGNALUM_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "silver", EternalGeneralItems.SILVER_NUGGET.get(), EternalGeneralItems.SILVER_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "steel", EternalGeneralItems.STEEL_NUGGET.get(), EternalGeneralItems.STEEL_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "tin", EternalGeneralItems.TIN_NUGGET.get(), EternalGeneralItems.TIN_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "titanium", EternalGeneralItems.TITANIUM_NUGGET.get(), EternalGeneralItems.TITANIUM_INGOT.get());
        //generateNuggetToIngotRecipe(recipeOutput, "tungsten", EternalGeneralItems.TUNGSTEN_NUGGET.get(), EternalGeneralItems.TUNGSTEN_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "ultimatitanium", EternalGeneralItems.ULTIMATITANIUM_NUGGET.get(), EternalGeneralItems.ULTIMATITANIUM_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "uranium", EternalGeneralItems.URANIUM_NUGGET.get(), EternalGeneralItems.URANIUM_INGOT.get());
        generateNuggetToIngotRecipe(recipeOutput, "zinc", EternalGeneralItems.ZINC_NUGGET.get(), EternalGeneralItems.ZINC_INGOT.get());

        ///Plates/Rods to Dust
        //Vanilla Mats
        generateRodPlateToDustRecipe(recipeOutput, "iron", EternalGeneralItems.PLATE_IRON.get(), EternalGeneralItems.ROD_IRON.get(), EternalGeneralItems.IRON_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "gold", EternalGeneralItems.PLATE_GOLD.get(), EternalGeneralItems.ROD_GOLD.get(), EternalGeneralItems.GOLD_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "copper", EternalGeneralItems.PLATE_COPPER.get(), EternalGeneralItems.ROD_COPPER.get(), EternalGeneralItems.COPPER_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "netherite", EternalGeneralItems.PLATE_NETHERITE.get(), EternalGeneralItems.ROD_NETHERITE.get(), EternalGeneralItems.NETHERITE_DUST.get());

        generateRodPlateToDustRecipe(recipeOutput, "diamond", EternalGeneralItems.PLATE_DIAMOND.get(), EternalGeneralItems.ROD_DIAMOND.get(), EternalGeneralItems.DIAMOND_DUST.get());

        //EO Mats
        generateRodPlateToDustRecipe(recipeOutput, "aluminum", EternalGeneralItems.PLATE_ALUMINUM.get(), EternalGeneralItems.ROD_ALUMINUM.get(), EternalGeneralItems.ALUMINUM_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "blue_steel", EternalGeneralItems.PLATE_BLUE_STEEL.get(), EternalGeneralItems.ROD_BLUE_STEEL.get(), EternalGeneralItems.BLUE_STEEL_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "brass", EternalGeneralItems.PLATE_BRASS.get(), EternalGeneralItems.ROD_BRASS.get(), EternalGeneralItems.BRASS_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "bronze", EternalGeneralItems.PLATE_BRONZE.get(), EternalGeneralItems.ROD_BRONZE.get(), EternalGeneralItems.BRONZE_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "cobalt", EternalGeneralItems.PLATE_COBALT.get(), EternalGeneralItems.ROD_COBALT.get(), EternalGeneralItems.COBALT_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "constantan", EternalGeneralItems.PLATE_CONSTANTAN.get(), EternalGeneralItems.ROD_CONSTANTAN.get(), EternalGeneralItems.CONSTANTAN_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "electrum", EternalGeneralItems.PLATE_ELECTRUM.get(), EternalGeneralItems.ROD_ELECTRUM.get(), EternalGeneralItems.ELECTRUM_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "enderium", EternalGeneralItems.PLATE_ENDERIUM.get(), EternalGeneralItems.ROD_ENDERIUM.get(), EternalGeneralItems.ENDERIUM_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "gallium", EternalGeneralItems.PLATE_GALLIUM.get(), EternalGeneralItems.ROD_GALLIUM.get(), EternalGeneralItems.GALLIUM_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "graphite", EternalGeneralItems.PLATE_GRAPHITE.get(), EternalGeneralItems.ROD_GRAPHITE.get(), EternalGeneralItems.GRAPHITE_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "invar", EternalGeneralItems.PLATE_INVAR.get(), EternalGeneralItems.ROD_INVAR.get(), EternalGeneralItems.INVAR_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "iridium", EternalGeneralItems.ROD_IRIDIUM.get(), EternalGeneralItems.PLATE_IRIDIUM.get(), EternalGeneralItems.IRIDIUM_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "lead", EternalGeneralItems.PLATE_LEAD.get(), EternalGeneralItems.ROD_LEAD.get(), EternalGeneralItems.LEAD_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "lumium", EternalGeneralItems.PLATE_LUMIUM.get(), EternalGeneralItems.ROD_LUMIUM.get(), EternalGeneralItems.LUMIUM_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "nickel", EternalGeneralItems.PLATE_NICKEL.get(), EternalGeneralItems.ROD_NICKEL.get(), EternalGeneralItems.NICKEL_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "osmium", EternalGeneralItems.PLATE_OSMIUM.get(), EternalGeneralItems.ROD_OSMIUM.get(), EternalGeneralItems.OSMIUM_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "platinum", EternalGeneralItems.PLATE_PLATINUM.get(), EternalGeneralItems.ROD_PLATINUM.get(), EternalGeneralItems.PLATINUM_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "plutonium", EternalGeneralItems.PLATE_PLUTONIUM.get(), EternalGeneralItems.ROD_PLUTONIUM.get(), EternalGeneralItems.PLUTONIUM_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "rose_gold", EternalGeneralItems.PLATE_ROSE_GOLD.get(), EternalGeneralItems.ROD_ROSE_GOLD.get(), EternalGeneralItems.ROSE_GOLD_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "signalum", EternalGeneralItems.PLATE_SIGNALUM.get(), EternalGeneralItems.ROD_SIGNALUM.get(), EternalGeneralItems.SIGNALUM_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "silver", EternalGeneralItems.PLATE_SILVER.get(), EternalGeneralItems.ROD_SILVER.get(), EternalGeneralItems.SILVER_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "steel", EternalGeneralItems.PLATE_STEEL.get(), EternalGeneralItems.ROD_STEEL.get(), EternalGeneralItems.STEEL_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "tin", EternalGeneralItems.PLATE_TIN.get(), EternalGeneralItems.ROD_TIN.get(), EternalGeneralItems.TIN_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "titanium", EternalGeneralItems.PLATE_TITANIUM.get(), EternalGeneralItems.ROD_TITANIUM.get(), EternalGeneralItems.TITANIUM_DUST.get());
        //generateRodPlateToDustRecipe(recipeOutput, "tungsten", EternalGeneralItems.PLATE_TUNGSTEN.get(), EternalGeneralItems.ROD_TUNGSTEN.get(), EternalGeneralItems.TUNGSTEN_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "ultimatitanium", EternalGeneralItems.PLATE_ULTIMATITANIUM.get(), EternalGeneralItems.ROD_ULTIMATITANIUM.get(), EternalGeneralItems.ULTIMATITANIUM_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "uranium", EternalGeneralItems.PLATE_URANIUM.get(), EternalGeneralItems.ROD_URANIUM.get(),EternalGeneralItems.URANIUM_DUST.get());
        generateRodPlateToDustRecipe(recipeOutput, "zinc", EternalGeneralItems.PLATE_ZINC.get(), EternalGeneralItems.ROD_ZINC.get(), EternalGeneralItems.ZINC_DUST.get());

        generateRodPlateToDustRecipe(recipeOutput, "sapphire", EternalGeneralItems.PLATE_SAPPHIRE.get(), EternalGeneralItems.ROD_SAPPHIRE.get(), EternalGeneralItems.SAPPHIRE_DUST.get());

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
        generateRawOreToIngotBlasting(recipeOutput, "uranium", EternalGeneralItems.RAW_URANIUM.get(), EternalGeneralItems.URANIUM_INGOT.get());
        generateRawOreToIngotBlasting(recipeOutput, "zinc", EternalGeneralItems.RAW_ZINC.get(), EternalGeneralItems.ZINC_INGOT.get());

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
        generateDustToMaterialFurnace(recipeOutput, "nickel", EternalGeneralItems.NICKEL_DUST.get(), EternalGeneralItems.NICKEL_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "osmium", EternalGeneralItems.OSMIUM_DUST.get(), EternalGeneralItems.OSMIUM_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "pewter", EternalGeneralItems.PEWTER_DUST.get(), EternalGeneralItems.PEWTER_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "platinum", EternalGeneralItems.PLATINUM_DUST.get(), EternalGeneralItems.PLATINUM_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "plutonium", EternalGeneralItems.PLUTONIUM_DUST.get(), EternalGeneralItems.PLUTONIUM_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "rose_gold", EternalGeneralItems.ROSE_GOLD_DUST.get(), EternalGeneralItems.ROSE_GOLD_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "signalum", EternalGeneralItems.SIGNALUM_DUST.get(), EternalGeneralItems.SIGNALUM_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "silver", EternalGeneralItems.SILVER_DUST.get(), EternalGeneralItems.SILVER_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "steel", EternalGeneralItems.STEEL_DUST.get(), EternalGeneralItems.STEEL_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "tin", EternalGeneralItems.TIN_DUST.get(), EternalGeneralItems.TIN_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "titanium", EternalGeneralItems.TITANIUM_DUST.get(), EternalGeneralItems.TITANIUM_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "ultimatitanium", EternalGeneralItems.ULTIMATITANIUM_DUST.get(), EternalGeneralItems.ULTIMATITANIUM_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "uranium", EternalGeneralItems.URANIUM_DUST.get(), EternalGeneralItems.URANIUM_INGOT.get());
        generateDustToMaterialFurnace(recipeOutput, "zinc", EternalGeneralItems.ZINC_DUST.get(), EternalGeneralItems.ZINC_INGOT.get());

        generateDustToMaterialFurnace(recipeOutput, "amber", EternalGeneralItems.AMBER_DUST.get(), EternalGeneralItems.GEM_AMBER.get());
        generateDustToMaterialFurnace(recipeOutput, "apatite", EternalGeneralItems.APATITE_DUST.get(), EternalGeneralItems.GEM_APATITE.get());
        generateDustToMaterialFurnace(recipeOutput, "cinnabar", EternalGeneralItems.CINNABAR_DUST.get(), EternalGeneralItems.GEM_CINNABAR.get());
        generateDustToMaterialFurnace(recipeOutput, "niter", EternalGeneralItems.NITER_DUST.get(), EternalGeneralItems.GEM_NITER.get());
        generateDustToMaterialFurnace(recipeOutput, "onyx", EternalGeneralItems.ONYX_DUST.get(), EternalGeneralItems.GEM_ONYX.get());
        generateDustToMaterialFurnace(recipeOutput, "peridot", EternalGeneralItems.PERIDOT_DUST.get(), EternalGeneralItems.GEM_PERIDOT.get());
        generateDustToMaterialFurnace(recipeOutput, "ruby", EternalGeneralItems.RUBY_DUST.get(), EternalGeneralItems.GEM_RUBY.get());
        generateDustToMaterialFurnace(recipeOutput, "sapphire", EternalGeneralItems.SAPPHIRE_DUST.get(), EternalGeneralItems.GEM_SAPPHIRE.get());

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
        generateDustToMaterialBlasting(recipeOutput, "nickel", EternalGeneralItems.NICKEL_DUST.get(), EternalGeneralItems.NICKEL_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "osmium", EternalGeneralItems.OSMIUM_DUST.get(), EternalGeneralItems.OSMIUM_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "pewter", EternalGeneralItems.PEWTER_DUST.get(), EternalGeneralItems.PEWTER_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "platinum", EternalGeneralItems.PLATINUM_DUST.get(), EternalGeneralItems.PLATINUM_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "plutonium", EternalGeneralItems.PLUTONIUM_DUST.get(), EternalGeneralItems.PLUTONIUM_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "rose_gold", EternalGeneralItems.ROSE_GOLD_DUST.get(), EternalGeneralItems.ROSE_GOLD_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "signalum", EternalGeneralItems.SIGNALUM_DUST.get(), EternalGeneralItems.SIGNALUM_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "silver", EternalGeneralItems.SILVER_DUST.get(), EternalGeneralItems.SILVER_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "steel", EternalGeneralItems.STEEL_DUST.get(), EternalGeneralItems.STEEL_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "tin", EternalGeneralItems.TIN_DUST.get(), EternalGeneralItems.TIN_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "titanium", EternalGeneralItems.TITANIUM_DUST.get(), EternalGeneralItems.TITANIUM_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "ultimatitanium", EternalGeneralItems.ULTIMATITANIUM_DUST.get(), EternalGeneralItems.ULTIMATITANIUM_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "uranium", EternalGeneralItems.URANIUM_DUST.get(), EternalGeneralItems.URANIUM_INGOT.get());
        generateDustToMaterialBlasting(recipeOutput, "zinc", EternalGeneralItems.ZINC_DUST.get(), EternalGeneralItems.ZINC_INGOT.get());

        generateDustToMaterialBlasting(recipeOutput, "amber", EternalGeneralItems.AMBER_DUST.get(), EternalGeneralItems.GEM_AMBER.get());
        generateDustToMaterialBlasting(recipeOutput, "apatite", EternalGeneralItems.APATITE_DUST.get(), EternalGeneralItems.GEM_APATITE.get());
        generateDustToMaterialBlasting(recipeOutput, "cinnabar", EternalGeneralItems.CINNABAR_DUST.get(), EternalGeneralItems.GEM_CINNABAR.get());
        generateDustToMaterialBlasting(recipeOutput, "niter", EternalGeneralItems.NITER_DUST.get(), EternalGeneralItems.GEM_NITER.get());
        generateDustToMaterialBlasting(recipeOutput, "onyx", EternalGeneralItems.ONYX_DUST.get(), EternalGeneralItems.GEM_ONYX.get());
        generateDustToMaterialBlasting(recipeOutput, "peridot", EternalGeneralItems.PERIDOT_DUST.get(), EternalGeneralItems.GEM_PERIDOT.get());
        generateDustToMaterialBlasting(recipeOutput, "ruby", EternalGeneralItems.RUBY_DUST.get(), EternalGeneralItems.GEM_RUBY.get());
        generateDustToMaterialBlasting(recipeOutput, "sapphire", EternalGeneralItems.SAPPHIRE_DUST.get(), EternalGeneralItems.GEM_SAPPHIRE.get());

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
        generateRawBlockToMaterialFurnace(recipeOutput, "uranium", EternalGeneralBlocks.RAW_URANIUM_BLOCK.asItem(), EternalGeneralBlocks.URANIUM_BLOCK.asItem());
        generateRawBlockToMaterialFurnace(recipeOutput, "zinc", EternalGeneralBlocks.RAW_ZINC_BLOCK.asItem(), EternalGeneralBlocks.ZINC_BLOCK.asItem());

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
        generateRawBlockToMaterialBlasting(recipeOutput, "uranium", EternalGeneralBlocks.RAW_URANIUM_BLOCK.asItem(), EternalGeneralBlocks.URANIUM_BLOCK.asItem());
        generateRawBlockToMaterialBlasting(recipeOutput, "zinc", EternalGeneralBlocks.RAW_ZINC_BLOCK.asItem(), EternalGeneralBlocks.ZINC_BLOCK.asItem());
    }

    ///Materials to Dusts
    private void generateHammerRecipes(@NotNull RecipeOutput recipeOutput, String material, Item input, Item dust)
    {
        boolean isIngot = material.endsWith("_ingot");
        boolean isGem = material.endsWith("_gem");
        boolean isMisc = !isIngot && !isGem;

        String baseMaterial = material.replace("_ingot", "").replace("_gem", "");

        //Ingot/Gem/Misc -> Dust (1x)
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, dust, 1)
                .requires(input)
                .requires(ItemTags.create(ResourceLocation.fromNamespaceAndPath("eternalores","tools/hammers")))
                .unlockedBy("has_" + material, has(input))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", material + "_to_dust"));

        //Raw Materials -> Dust (2x)
        if(isIngot && !EXCLUDED_MAT_DUPE_RECIPES.contains(baseMaterial)) {
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, dust, 2)
                    .requires(ItemTags.create(ResourceLocation.parse("c:raw_materials/" + baseMaterial)))
                    .requires(ItemTags.create(ResourceLocation.fromNamespaceAndPath("eternalores","tools/hammers")))
                    .unlockedBy("has_" + baseMaterial + "_raw", has(ItemTags.create(ResourceLocation.parse("c:raw_materials/" + baseMaterial))))
                    .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", baseMaterial + "_raw_to_dust"));
        }
    }

    ///Materials to Plates
    private void generateIngotPlateRecipe(@NotNull RecipeOutput recipeOutput, String material, Item plate)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, plate, 1)
                .pattern(" H ")
                .pattern(" I ")
                .pattern(" I ")
                .define('I', ItemTags.create(ResourceLocation.parse("c:ingots/" + material)))
                .define('H', ItemTags.create(ResourceLocation.fromNamespaceAndPath("eternalores","tools/hammers")))
                .unlockedBy("has_" + material + "_ingot", has(ItemTags.create(ResourceLocation.parse("c:ingots/" + material))))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", material + "_plate"));
    }

    private void generateGemPlateRecipe(@NotNull RecipeOutput recipeOutput, String material, Item plate)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, plate, 1)
                .pattern(" H ")
                .pattern(" I ")
                .pattern(" I ")
                .define('I', ItemTags.create(ResourceLocation.parse("c:gems/" + material)))
                .define('H', ItemTags.create(ResourceLocation.fromNamespaceAndPath("eternalores","tools/gem_cutter")))
                .unlockedBy("has_" + material + "_ingot", has(ItemTags.create(ResourceLocation.parse("c:gems/" + material))))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", material + "_plate"));
    }

    ///Materials to Rods
    private void generateIngotRodsRecipe(@NotNull RecipeOutput recipeOutput, String material, Item rod)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, rod, 1)
                .pattern("H  ")
                .pattern(" I ")
                .pattern("  I")
                .define('I', ItemTags.create(ResourceLocation.parse("c:ingots/" + material)))
                .define('H', ItemTags.create(ResourceLocation.fromNamespaceAndPath("eternalores","tools/hammers")))
                .unlockedBy("has_" + material + "_ingot", has(ItemTags.create(ResourceLocation.parse("c:ingots/" + material))))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", material + "_rod"));
    }

    private void generateGemRodsRecipe(@NotNull RecipeOutput recipeOutput, String material, Item rod)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, rod, 1)
                .pattern("H  ")
                .pattern(" I ")
                .pattern("  I")
                .define('I', ItemTags.create(ResourceLocation.parse("c:gems/" + material)))
                .define('H', ItemTags.create(ResourceLocation.fromNamespaceAndPath("eternalores","tools/gem_cutter")))
                .unlockedBy("has_" + material + "_ingot", has(ItemTags.create(ResourceLocation.parse("c:gems/" + material))))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", material + "_rod"));
    }

    ///Blocks to Materials
    private void generateBlockToIngotMaterialRecipe(@NotNull RecipeOutput recipeOutput, String material, Item block, Item ingot)
    {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ingot, 9)
                .requires(block)
                .unlockedBy("has_" + material + "_block", has(block))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", material + "_block_to_ingot"));
    }
    private void generateBlockToGemMaterialRecipe(@NotNull RecipeOutput recipeOutput, String material, Item block, Item gem)
    {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, gem, 9)
                .requires(block)
                .unlockedBy("has_" + material + "_block", has(block))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", material + "_block_to_gem"));
    }
    private void generateBlockToRawMaterialRecipe(@NotNull RecipeOutput recipeOutput, String material, Item block, Item raw)
    {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, raw, 9)
                .requires(block)
                .unlockedBy("has_" + material + "_block", has(block))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", material + "_raw_block_to_ore"));
    }

    ///Materials to Blocks
    private void generateIngotToBlockRecipe(@NotNull RecipeOutput recipeOutput, String material, Item ingot, Item block)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, block, 1)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ingot)
                .unlockedBy("has_" + material + "_ingot", has(ingot))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", material + "_ingot_to_block"));
    }
    private void generateGemToBlockRecipe(@NotNull RecipeOutput recipeOutput, String material, Item gem, Item block)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, block, 1)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', gem)
                .unlockedBy("has_" + material + "_ingot", has(gem))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", material + "_gem_to_block"));
    }
    private void generateRawMaterialToBlockRecipe(@NotNull RecipeOutput recipeOutput, String material, Item raw, Item block)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, block, 1)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', raw)
                .unlockedBy("has_" + material + "_ingot", has(raw))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", material + "_raw_to_block"));
    }

    ///Materials to Nuggets
    private void generateIngotToNuggetRecipe(@NotNull RecipeOutput recipeOutput, String material, Item ingot, Item nugget) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, nugget, 9)
                .requires(ingot)
                .unlockedBy("has_" + material + "_ingot", has(ingot))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", material + "_ingot_to_nugget"));
    }

    ///Material to Ingot
    private void generateNuggetToIngotRecipe(@NotNull RecipeOutput recipeOutput, String material, Item nugget, Item ingot) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ingot, 1)
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', nugget)
                .unlockedBy("has_" + material + "_nugget", has(nugget))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", material + "_nugget_to_ingot"));
    }

    ///Rod/Plate to Material
    private void generateRodPlateToDustRecipe(@NotNull RecipeOutput recipeOutput, String material, Item rod, Item plate, Item dust) {
        // Rod -> 2 Dusts
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, dust, 2)
                .requires(rod)
                .requires(ItemTags.create(ResourceLocation.fromNamespaceAndPath("eternalores","tools/hammers")))
                .unlockedBy("has_" + material + "_rod", has(rod))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", material + "_rod_to_dust_deconstruction"));

        // Plate -> 2 Dusts
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, dust, 2)
                .requires(plate)
                .requires(ItemTags.create(ResourceLocation.fromNamespaceAndPath("eternalores","tools/hammers")))
                .unlockedBy("has_" + material + "_plate", has(plate))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", material + "_plate_to_dust_deconstruction"));
    }

    ///Raw Material to Ingot Furnace/Blasting
    private void generateRawOreToIngotFurnace(@NotNull RecipeOutput recipeOutput, String material, Item rawOre, Item ingot) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(rawOre), RecipeCategory.MISC, ingot, 0.7f, 200)
                .unlockedBy("has_" + material + "_raw", has(rawOre))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", material + "_raw_to_ingot_furnace"));
    }
    private void generateRawOreToIngotBlasting(@NotNull RecipeOutput recipeOutput, String material, Item rawOre, Item ingot) {
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(rawOre), RecipeCategory.MISC, ingot, 0.7f, 100)
                .unlockedBy("has_" + material + "_raw", has(rawOre))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", material + "_raw_to_ingot_blasting"));
    }

    ///Dust to Material Furnace/Blasting
    private void generateDustToMaterialFurnace(@NotNull RecipeOutput recipeOutput, String material, Item dust, Item output) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(dust), RecipeCategory.MISC, output, 0.7f, 200)
                .unlockedBy("has_" + material + "_dust", has(dust))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", material + "_dust_to_material_furnace"));
    }
    private void generateDustToMaterialBlasting(@NotNull RecipeOutput recipeOutput, String material, Item dust, Item output) {
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(dust), RecipeCategory.MISC, output, 0.7f, 100)
                .unlockedBy("has_" + material + "_dust", has(dust))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", material + "_dust_to_material_blasting"));
    }

    ///Raw Ore Block to Block Furnace/Blasting
    private void generateRawBlockToMaterialFurnace(@NotNull RecipeOutput recipeOutput, String material, Item rawBlock, Item output) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(rawBlock), RecipeCategory.MISC, output, 0.7f, 200)
                .unlockedBy("has_" + material + "_raw_block", has(rawBlock))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", material + "_raw_block_to_material_furnace"));
    }
    private void generateRawBlockToMaterialBlasting(@NotNull RecipeOutput recipeOutput, String material, Item rawBlock, Item output) {
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(rawBlock), RecipeCategory.MISC, output, 0.7f, 100)
                .unlockedBy("has_" + material + "_raw_block", has(rawBlock))
                .save(recipeOutput, ResourceLocation.fromNamespaceAndPath("eternalores", material + "_raw_block_to_material_blasting"));
    }
}