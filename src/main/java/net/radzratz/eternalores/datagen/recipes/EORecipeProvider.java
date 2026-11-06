package net.radzratz.eternalores.datagen.recipes;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.radzratz.eternalores.datagen.recipes.recipes.*;
import net.radzratz.eternalores.util.compat.actually_additions.ActuallyAdditionsCompatRecipes;
import net.radzratz.eternalores.util.compat.ars_nouveau.ArsNouveauCompatRecipes;
import net.radzratz.eternalores.util.compat.create.CreateCompatRecipes;
import net.radzratz.eternalores.util.compat.create.CraftsAndAdditionsCompatRecipes;
import net.radzratz.eternalores.util.compat.enderio.EnderIOCompatRecipes;
import net.radzratz.eternalores.util.compat.energized_power.EnergizedPowerCompatRecipes;
import net.radzratz.eternalores.util.compat.excessive_utilities.ExcessiveUtilitiesCompatRecipes;
import net.radzratz.eternalores.util.compat.forbidden_arcanus.ForbiddenArcanusCompatRecipes;
import net.radzratz.eternalores.util.compat.geore.GeOreCompatRecipes;
import net.radzratz.eternalores.util.compat.hephaestus_forge.HephaestusForgeCompatRecipes;
import net.radzratz.eternalores.util.compat.immersive_engineering.ImmersiveEngineeringCompatRecipes;
import net.radzratz.eternalores.util.compat.industrial_foregoing.IndustrialForegoingCompatRecipes;
import net.radzratz.eternalores.util.compat.integrated_dynamics.IntegratedDynamicsCompatRecipes;
import net.radzratz.eternalores.util.compat.mekanism.MekanismCompatRecipes;
import net.radzratz.eternalores.util.compat.mekanism.MoreMachineCompatRecipes;
import net.radzratz.eternalores.util.compat.oritech.OritechCompatRecipes;
import net.radzratz.eternalores.util.compat.powah.PowahCompatRecipes;
import net.radzratz.eternalores.util.compat.prodbees.ProductiveBeesCompatRecipes;
import net.radzratz.eternalores.util.compat.railcraft.RailcraftCompatRecipes;
import net.radzratz.eternalores.util.compat.slag_n_embers.SlagEmbersCompatRecipes;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class EORecipeProvider extends RecipeProvider {
    public EORecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput, HolderLookup.@NotNull Provider lookup) {
        var reg = BuiltInRegistries.ITEM;
        var fluidReg = BuiltInRegistries.FLUID;

        // Base Eternal Ores / Vanilla
        EOCraftingRecipes.generate(recipeOutput, reg);
        EOSmeltingRecipes.generate(recipeOutput, reg);

        MekanismCompatRecipes.generate(recipeOutput, reg);
        MoreMachineCompatRecipes.generate(recipeOutput, reg);
        PowahCompatRecipes.generate(recipeOutput);
        OritechCompatRecipes.generate(recipeOutput, reg);
        EnergizedPowerCompatRecipes.generate(recipeOutput, reg);
        ActuallyAdditionsCompatRecipes.generate(recipeOutput, reg);
        EnderIOCompatRecipes.generate(recipeOutput, reg);
        CreateCompatRecipes.generate(recipeOutput, reg);
        CraftsAndAdditionsCompatRecipes.generate(recipeOutput, reg);
        ImmersiveEngineeringCompatRecipes.generate(recipeOutput, reg);
        ForbiddenArcanusCompatRecipes.generate(recipeOutput, reg, lookup);
        IndustrialForegoingCompatRecipes.generate(recipeOutput, reg);
        IntegratedDynamicsCompatRecipes.generate(recipeOutput, reg);
        GeOreCompatRecipes.generate(recipeOutput, reg);
        RailcraftCompatRecipes.generate(recipeOutput, reg);
        ArsNouveauCompatRecipes.generate(recipeOutput, reg);
        ExcessiveUtilitiesCompatRecipes.generate(recipeOutput, reg);
        HephaestusForgeCompatRecipes.generate(recipeOutput, reg, fluidReg);
        SlagEmbersCompatRecipes.generate(recipeOutput, reg, fluidReg);
        ProductiveBeesCompatRecipes.generate(recipeOutput);
    }
}
