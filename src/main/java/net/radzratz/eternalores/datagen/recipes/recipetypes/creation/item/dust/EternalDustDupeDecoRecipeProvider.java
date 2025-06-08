package net.radzratz.eternalores.datagen.recipes.recipetypes.creation.item.dust;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.radzratz.eternalores.item.EternalGeneralItems;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

import static net.radzratz.eternalores.datagen.recipes.recipetypes.creation.item.dust.DustDupeDecoEntries.generateHammerRecipes;

@SuppressWarnings("all")
public class EternalDustDupeDecoRecipeProvider extends RecipeProvider implements IConditionBuilder
{
    public EternalDustDupeDecoRecipeProvider(PackOutput output,
                                             CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput)
    {
        ///
        ///Materials to Dusts
        //Vanilla Ingots
        generateHammerRecipes(recipeOutput, "iron_ingot", Items.IRON_INGOT, EternalGeneralItems.IRON_DUST.get());
        generateHammerRecipes(recipeOutput, "gold_ingot", Items.GOLD_INGOT, EternalGeneralItems.GOLD_DUST.get());
        generateHammerRecipes(recipeOutput, "copper_ingot", Items.COPPER_INGOT, EternalGeneralItems.COPPER_DUST.get());
        generateHammerRecipes(recipeOutput, "netherite_ingot", Items.NETHERITE_INGOT, EternalGeneralItems.NETHERITE_DUST.get());

        //Vanilla Gems
        generateHammerRecipes(recipeOutput, "amethyst_gem", Items.AMETHYST_SHARD, EternalGeneralItems.AMETHYST_DUST.get());
        generateHammerRecipes(recipeOutput, "amethyst_gem_block", Blocks.AMETHYST_BLOCK.asItem(), EternalGeneralItems.AMETHYST_DUST.get());
        generateHammerRecipes(recipeOutput, "diamond_gem", Items.DIAMOND, EternalGeneralItems.DIAMOND_DUST.get());
        generateHammerRecipes(recipeOutput, "emerald_gem", Items.EMERALD, EternalGeneralItems.EMERALD_DUST.get());
        //coal is not a gem but close lel
        generateHammerRecipes(recipeOutput, "coal_gem", Items.COAL, EternalGeneralItems.COAL_DUST.get());
        generateHammerRecipes(recipeOutput, "lapis_gem", Items.LAPIS_LAZULI, EternalGeneralItems.LAPIS_LAZULI_DUST.get());
        generateHammerRecipes(recipeOutput, "quartz_gem", Items.QUARTZ, EternalGeneralItems.QUARTZ_DUST.get());

        //Misc Vanilla
        generateHammerRecipes(recipeOutput, "sculk_block", Blocks.SCULK.asItem(), EternalGeneralItems.SCULK_DUST.get());
        generateHammerRecipes(recipeOutput, "nether_star", Items.NETHER_STAR, EternalGeneralItems.NETHER_STAR_DUST.get());

        //EO Ingots
        generateHammerRecipes(recipeOutput, "aluminum_ingot", EternalGeneralItems.ALUMINUM_INGOT.get(), EternalGeneralItems.ALUMINUM_DUST.get());
        generateHammerRecipes(recipeOutput, "blue_steel_ingot", EternalGeneralItems.BLUE_STEEL_INGOT.get(), EternalGeneralItems.BLUE_STEEL_DUST.get());
        generateHammerRecipes(recipeOutput, "brass_ingot", EternalGeneralItems.BRASS_INGOT.get(), EternalGeneralItems.BRASS_DUST.get());
        generateHammerRecipes(recipeOutput, "britannia_ingot", EternalGeneralItems.BRITANNIA_SILVER_INGOT.get(), EternalGeneralItems.BRITANNIA_SILVER_DUST.get());
        generateHammerRecipes(recipeOutput, "bronze_ingot", EternalGeneralItems.BRONZE_INGOT.get(), EternalGeneralItems.BRONZE_DUST.get());
        generateHammerRecipes(recipeOutput, "cast_iron_ingot", EternalGeneralItems.CAST_IRON_INGOT.get(), EternalGeneralItems.CAST_IRON_DUST.get());
        generateHammerRecipes(recipeOutput, "cast_steel_ingot", EternalGeneralItems.CAST_STEEL_INGOT.get(), EternalGeneralItems.CAST_STEEL_DUST.get());
        generateHammerRecipes(recipeOutput, "cobalt_ingot", EternalGeneralItems.COBALT_INGOT.get(), EternalGeneralItems.COBALT_DUST.get());
        generateHammerRecipes(recipeOutput, "constantan_ingot", EternalGeneralItems.CONSTANTAN_INGOT.get(), EternalGeneralItems.CONSTANTAN_DUST.get());
        generateHammerRecipes(recipeOutput, "electrum_ingot", EternalGeneralItems.ELECTRUM_INGOT.get(), EternalGeneralItems.ELECTRUM_DUST.get());
        generateHammerRecipes(recipeOutput, "enderium_ingot", EternalGeneralItems.ENDERIUM_INGOT.get(), EternalGeneralItems.ENDERIUM_DUST.get());
        generateHammerRecipes(recipeOutput, "gallium_ingot", EternalGeneralItems.GALLIUM_INGOT.get(), EternalGeneralItems.GALLIUM_DUST.get());
        generateHammerRecipes(recipeOutput, "invar_ingot", EternalGeneralItems.INVAR_INGOT.get(), EternalGeneralItems.INVAR_DUST.get());
        generateHammerRecipes(recipeOutput, "iridium_ingot", EternalGeneralItems.IRIDIUM_INGOT.get(), EternalGeneralItems.IRIDIUM_DUST.get());
        generateHammerRecipes(recipeOutput, "lead_ingot", EternalGeneralItems.LEAD_INGOT.get(), EternalGeneralItems.LEAD_DUST.get());
        generateHammerRecipes(recipeOutput, "lumium_ingot", EternalGeneralItems.LUMIUM_INGOT.get(), EternalGeneralItems.LUMIUM_DUST.get());
        generateHammerRecipes(recipeOutput, "nethersteel_ingot", EternalGeneralItems.NETHERSTEEL_INGOT.get(), EternalGeneralItems.NETHERSTEEL_DUST.get());
        generateHammerRecipes(recipeOutput, "nickel_ingot", EternalGeneralItems.NICKEL_INGOT.get(), EternalGeneralItems.NICKEL_DUST.get());
        generateHammerRecipes(recipeOutput, "osmium_ingot", EternalGeneralItems.OSMIUM_INGOT.get(), EternalGeneralItems.OSMIUM_DUST.get());
        generateHammerRecipes(recipeOutput, "pewter_ingot", EternalGeneralItems.PEWTER_INGOT.get(), EternalGeneralItems.PEWTER_DUST.get());
        generateHammerRecipes(recipeOutput, "pig_iron_ingot", EternalGeneralItems.PIG_IRON_INGOT.get(), EternalGeneralItems.PIG_IRON_DUST.get());
        generateHammerRecipes(recipeOutput, "platinum_ingot", EternalGeneralItems.PLATINUM_INGOT.get(), EternalGeneralItems.PLATINUM_DUST.get());
        generateHammerRecipes(recipeOutput, "plutonium_ingot", EternalGeneralItems.PLUTONIUM_INGOT.get(), EternalGeneralItems.PLUTONIUM_DUST.get());
        generateHammerRecipes(recipeOutput, "rose_gold_ingot", EternalGeneralItems.ROSE_GOLD_INGOT.get(), EternalGeneralItems.ROSE_GOLD_DUST.get());
        generateHammerRecipes(recipeOutput, "signalum_ingot", EternalGeneralItems.SIGNALUM_INGOT.get(), EternalGeneralItems.SIGNALUM_DUST.get());
        generateHammerRecipes(recipeOutput, "silver_ingot", EternalGeneralItems.SILVER_INGOT.get(), EternalGeneralItems.SILVER_DUST.get());
        generateHammerRecipes(recipeOutput, "shadowsteel_ingot", EternalGeneralItems.SHADOWSTEEL_INGOT.get(), EternalGeneralItems.SHADOWSTEEL_DUST.get());
        generateHammerRecipes(recipeOutput, "steel_ingot", EternalGeneralItems.STEEL_INGOT.get(), EternalGeneralItems.STEEL_DUST.get());
        generateHammerRecipes(recipeOutput, "tin_ingot", EternalGeneralItems.TIN_INGOT.get(), EternalGeneralItems.TIN_DUST.get());
        generateHammerRecipes(recipeOutput, "titanium_ingot", EternalGeneralItems.TITANIUM_INGOT.get(), EternalGeneralItems.TITANIUM_DUST.get());
        //generateHammerRecipes(recipeOutput, "tungsten_ingot", EternalGeneralItems.TUNGSTEN_INGOT.get(), EternalGeneralItems.TUNGSTEN_DUST.get());
        generateHammerRecipes(recipeOutput, "ultimatitanium_ingot", EternalGeneralItems.ULTIMATITANIUM_INGOT.get(), EternalGeneralItems.ULTIMATITANIUM_DUST.get());
        generateHammerRecipes(recipeOutput, "uraninite_ingot", EternalGeneralItems.URANINITE_INGOT.get(), EternalGeneralItems.URANINITE_DUST.get());
        generateHammerRecipes(recipeOutput, "uranium_ingot", EternalGeneralItems.URANIUM_INGOT.get(), EternalGeneralItems.URANIUM_DUST.get());
        generateHammerRecipes(recipeOutput, "wrought_iron_ingot", EternalGeneralItems.WROUGHT_IRON_INGOT.get(), EternalGeneralItems.WROUGHT_IRON_DUST.get());
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
        generateHammerRecipes(recipeOutput, "necroticarite_gem", EternalGeneralItems.GEM_NECROTICARITE.get(), EternalGeneralItems.NECROTICARITE_DUST.get());
        generateHammerRecipes(recipeOutput, "niter_gem", EternalGeneralItems.GEM_NITER.get(), EternalGeneralItems.NITER_DUST.get());
        generateHammerRecipes(recipeOutput, "onyx_gem", EternalGeneralItems.GEM_ONYX.get(), EternalGeneralItems.ONYX_DUST.get());
        generateHammerRecipes(recipeOutput, "peridot_gem", EternalGeneralItems.GEM_PERIDOT.get(), EternalGeneralItems.PERIDOT_DUST.get());
        generateHammerRecipes(recipeOutput, "ruby_gem", EternalGeneralItems.GEM_RUBY.get(), EternalGeneralItems.RUBY_DUST.get());
        generateHammerRecipes(recipeOutput, "sapphire_gem", EternalGeneralItems.GEM_SAPPHIRE.get(), EternalGeneralItems.SAPPHIRE_DUST.get());
        generateHammerRecipes(recipeOutput, "sulfur_gem", EternalGeneralItems.SULFUR.get(), EternalGeneralItems.SULFUR_DUST.get());
    }
}