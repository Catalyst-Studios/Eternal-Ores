package net.radzratz.eternalores.datagen.recipes.recipetypes.creation.item.dust;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.radzratz.eternalores.item.EOItems;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static net.radzratz.eternalores.datagen.recipes.recipetypes.creation.item.dust.EODustDupeRecipe.generateHammerRecipes;

@SuppressWarnings("all")
public class EODustDupeEntries extends RecipeProvider implements IConditionBuilder
{
    public EODustDupeEntries(PackOutput output, CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput)
    {
        ///
        ///Materials to Dusts
        //Vanilla Ingots
        generateHammerRecipes(recipeOutput, "iron_ingot", Items.IRON_INGOT, EOItems.IRON_DUST.get());
        generateHammerRecipes(recipeOutput, "gold_ingot", Items.GOLD_INGOT, EOItems.GOLD_DUST.get());
        generateHammerRecipes(recipeOutput, "copper_ingot", Items.COPPER_INGOT, EOItems.COPPER_DUST.get());
        generateHammerRecipes(recipeOutput, "netherite_ingot", Items.NETHERITE_INGOT, EOItems.NETHERITE_DUST.get());

        //Vanilla Gems
        generateHammerRecipes(recipeOutput, "amethyst_gem", Items.AMETHYST_SHARD, EOItems.AMETHYST_DUST.get());
        generateHammerRecipes(recipeOutput, "amethyst_gem_block", Blocks.AMETHYST_BLOCK.asItem(), EOItems.AMETHYST_DUST.get());
        generateHammerRecipes(recipeOutput, "diamond_gem", Items.DIAMOND, EOItems.DIAMOND_DUST.get());
        generateHammerRecipes(recipeOutput, "emerald_gem", Items.EMERALD, EOItems.EMERALD_DUST.get());
        //coal is not a gem but close lel
        generateHammerRecipes(recipeOutput, "coal_gem", Items.COAL, EOItems.COAL_DUST.get());
        generateHammerRecipes(recipeOutput, "lapis_gem", Items.LAPIS_LAZULI, EOItems.LAPIS_LAZULI_DUST.get());
        generateHammerRecipes(recipeOutput, "quartz_gem", Items.QUARTZ, EOItems.QUARTZ_DUST.get());

        //Misc Vanilla
        generateHammerRecipes(recipeOutput, "sculk_block", Blocks.SCULK.asItem(), EOItems.SCULK_DUST.get());
        generateHammerRecipes(recipeOutput, "nether_star", Items.NETHER_STAR, EOItems.NETHER_STAR_DUST.get());

        //EO Ingots
        generateHammerRecipes(recipeOutput, "aluminum_ingot", EOItems.ALUMINUM_INGOT.get(), EOItems.ALUMINUM_DUST.get());
        generateHammerRecipes(recipeOutput, "ardite_ingot", EOItems.ARDITE_INGOT.get(), EOItems.ARDITE_DUST.get());
        generateHammerRecipes(recipeOutput, "blue_steel_ingot", EOItems.BLUE_STEEL_INGOT.get(), EOItems.BLUE_STEEL_DUST.get());
        generateHammerRecipes(recipeOutput, "brass_ingot", EOItems.BRASS_INGOT.get(), EOItems.BRASS_DUST.get());
        generateHammerRecipes(recipeOutput, "britannia_ingot", EOItems.BRITANNIA_SILVER_INGOT.get(), EOItems.BRITANNIA_SILVER_DUST.get());
        generateHammerRecipes(recipeOutput, "bronze_ingot", EOItems.BRONZE_INGOT.get(), EOItems.BRONZE_DUST.get());
        generateHammerRecipes(recipeOutput, "cast_iron_ingot", EOItems.CAST_IRON_INGOT.get(), EOItems.CAST_IRON_DUST.get());
        generateHammerRecipes(recipeOutput, "cast_steel_ingot", EOItems.CAST_STEEL_INGOT.get(), EOItems.CAST_STEEL_DUST.get());
        generateHammerRecipes(recipeOutput, "cobalt_ingot", EOItems.COBALT_INGOT.get(), EOItems.COBALT_DUST.get());
        generateHammerRecipes(recipeOutput, "constantan_ingot", EOItems.CONSTANTAN_INGOT.get(), EOItems.CONSTANTAN_DUST.get());
        generateHammerRecipes(recipeOutput, "electrum_ingot", EOItems.ELECTRUM_INGOT.get(), EOItems.ELECTRUM_DUST.get());
        generateHammerRecipes(recipeOutput, "enderium_ingot", EOItems.ENDERIUM_INGOT.get(), EOItems.ENDERIUM_DUST.get());
        generateHammerRecipes(recipeOutput, "gallium_ingot", EOItems.GALLIUM_INGOT.get(), EOItems.GALLIUM_DUST.get());
        generateHammerRecipes(recipeOutput, "invar_ingot", EOItems.INVAR_INGOT.get(), EOItems.INVAR_DUST.get());
        generateHammerRecipes(recipeOutput, "iridium_ingot", EOItems.IRIDIUM_INGOT.get(), EOItems.IRIDIUM_DUST.get());
        generateHammerRecipes(recipeOutput, "lead_ingot", EOItems.LEAD_INGOT.get(), EOItems.LEAD_DUST.get());
        generateHammerRecipes(recipeOutput, "lumium_ingot", EOItems.LUMIUM_INGOT.get(), EOItems.LUMIUM_DUST.get());
        generateHammerRecipes(recipeOutput, "nethersteel_ingot", EOItems.NETHERSTEEL_INGOT.get(), EOItems.NETHERSTEEL_DUST.get());
        generateHammerRecipes(recipeOutput, "nickel_ingot", EOItems.NICKEL_INGOT.get(), EOItems.NICKEL_DUST.get());
        generateHammerRecipes(recipeOutput, "osmium_ingot", EOItems.OSMIUM_INGOT.get(), EOItems.OSMIUM_DUST.get());
        generateHammerRecipes(recipeOutput, "pewter_ingot", EOItems.PEWTER_INGOT.get(), EOItems.PEWTER_DUST.get());
        generateHammerRecipes(recipeOutput, "pig_iron_ingot", EOItems.PIG_IRON_INGOT.get(), EOItems.PIG_IRON_DUST.get());
        generateHammerRecipes(recipeOutput, "platinum_ingot", EOItems.PLATINUM_INGOT.get(), EOItems.PLATINUM_DUST.get());
        generateHammerRecipes(recipeOutput, "plutonium_ingot", EOItems.PLUTONIUM_INGOT.get(), EOItems.PLUTONIUM_DUST.get());
        generateHammerRecipes(recipeOutput, "rose_gold_ingot", EOItems.ROSE_GOLD_INGOT.get(), EOItems.ROSE_GOLD_DUST.get());
        generateHammerRecipes(recipeOutput, "signalum_ingot", EOItems.SIGNALUM_INGOT.get(), EOItems.SIGNALUM_DUST.get());
        generateHammerRecipes(recipeOutput, "silver_ingot", EOItems.SILVER_INGOT.get(), EOItems.SILVER_DUST.get());
        generateHammerRecipes(recipeOutput, "shadowsteel_ingot", EOItems.SHADOWSTEEL_INGOT.get(), EOItems.SHADOWSTEEL_DUST.get());
        generateHammerRecipes(recipeOutput, "steel_ingot", EOItems.STEEL_INGOT.get(), EOItems.STEEL_DUST.get());
        generateHammerRecipes(recipeOutput, "tin_ingot", EOItems.TIN_INGOT.get(), EOItems.TIN_DUST.get());
        generateHammerRecipes(recipeOutput, "titanium_ingot", EOItems.TITANIUM_INGOT.get(), EOItems.TITANIUM_DUST.get());
        //generateHammerRecipes(recipeOutput, "tungsten_ingot", EOItems.TUNGSTEN_INGOT.get(), EOItems.TUNGSTEN_DUST.get());
        generateHammerRecipes(recipeOutput, "ultimatitanium_ingot", EOItems.ULTIMATITANIUM_INGOT.get(), EOItems.ULTIMATITANIUM_DUST.get());
        generateHammerRecipes(recipeOutput, "uraninite_ingot", EOItems.URANINITE_INGOT.get(), EOItems.URANINITE_DUST.get());
        generateHammerRecipes(recipeOutput, "uranium_ingot", EOItems.URANIUM_INGOT.get(), EOItems.URANIUM_DUST.get());
        generateHammerRecipes(recipeOutput, "wrought_iron_ingot", EOItems.WROUGHT_IRON_INGOT.get(), EOItems.WROUGHT_IRON_DUST.get());
        generateHammerRecipes(recipeOutput, "zinc_ingot", EOItems.ZINC_INGOT.get(), EOItems.ZINC_DUST.get());

        //Misc
        generateHammerRecipes(recipeOutput, "ender_misc", Items.ENDER_PEARL, EOItems.ENDER_DUST.get());
        generateHammerRecipes(recipeOutput, "endstone_misc", Blocks.END_STONE.asItem(), EOItems.ENDSTONE_DUST.get());
        generateHammerRecipes(recipeOutput, "netherrack_misc", Blocks.NETHERRACK.asItem(), EOItems.NETHERRACK_DUST.get());
        generateHammerRecipes(recipeOutput, "obsidian_misc1", Blocks.OBSIDIAN.asItem(), EOItems.OBSIDIAN_DUST.get());
        generateHammerRecipes(recipeOutput, "obsidian_misc2", Blocks.CRYING_OBSIDIAN.asItem(), EOItems.OBSIDIAN_DUST.get());

        //EO Gems
        generateHammerRecipes(recipeOutput, "amber_gem", EOItems.GEM_AMBER.get(), EOItems.AMBER_DUST.get());
        generateHammerRecipes(recipeOutput, "apatite_gem", EOItems.GEM_APATITE.get(), EOItems.APATITE_DUST.get());
        generateHammerRecipes(recipeOutput, "cinnabar_gem", EOItems.GEM_CINNABAR.get(), EOItems.CINNABAR_DUST.get());
        generateHammerRecipes(recipeOutput, "fluorite_gem", EOItems.FLUORITE.get(), EOItems.FLUORITE_DUST.get());
        generateHammerRecipes(recipeOutput, "necroticarite_gem", EOItems.GEM_NECROTICARITE.get(), EOItems.NECROTICARITE_DUST.get());
        generateHammerRecipes(recipeOutput, "niter_gem", EOItems.GEM_NITER.get(), EOItems.NITER_DUST.get());
        generateHammerRecipes(recipeOutput, "onyx_gem", EOItems.GEM_ONYX.get(), EOItems.ONYX_DUST.get());
        generateHammerRecipes(recipeOutput, "peridot_gem", EOItems.GEM_PERIDOT.get(), EOItems.PERIDOT_DUST.get());
        generateHammerRecipes(recipeOutput, "ruby_gem", EOItems.GEM_RUBY.get(), EOItems.RUBY_DUST.get());
        generateHammerRecipes(recipeOutput, "sapphire_gem", EOItems.GEM_SAPPHIRE.get(), EOItems.SAPPHIRE_DUST.get());
        generateHammerRecipes(recipeOutput, "sulfur_gem", EOItems.SULFUR.get(), EOItems.SULFUR_DUST.get());
    }
}