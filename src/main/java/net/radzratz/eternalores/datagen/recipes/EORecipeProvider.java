package net.radzratz.eternalores.datagen.recipes;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.radzratz.eternalores.datagen.recipes.recipes.*;
import net.radzratz.eternalores.util.compat.actually_additions.recipe_types.EOAACrusherRecipes;
import net.radzratz.eternalores.util.compat.actually_additions.recipe_types.EOAAMiningLensRecipes;
import net.radzratz.eternalores.util.compat.ars_nouveau.recipe_types.EOImbuementChamber;
import net.radzratz.eternalores.util.compat.create.addons.craftsandadditions.EOAdRollingMillRecipes;
import net.radzratz.eternalores.util.compat.create.recipe_types.*;
import net.radzratz.eternalores.util.compat.enderio.recipe_types.EIEOAlloySmelterRecipes;
import net.radzratz.eternalores.util.compat.enderio.recipe_types.EIEOSagMillRecipes;
import net.radzratz.eternalores.util.compat.energized_power.recipe_types.*;
import net.radzratz.eternalores.util.compat.forbidden_arcanus.recipe_types.FAEOClibanoRecipes;
import net.radzratz.eternalores.util.compat.geore.datagen.GEOreRecipes;
import net.radzratz.eternalores.util.compat.immersive_engineering.recipe_types.*;
import net.radzratz.eternalores.util.compat.industrial_foregoing.recipe_types.EOreLaserDrillRecipes;
import net.radzratz.eternalores.util.compat.integrated_dynamics.recipe_types.EOSqueezerRecipes;
import net.radzratz.eternalores.util.compat.mekanism.addons.moremachine.recipe_types.EOMMLatheRecipes;
import net.radzratz.eternalores.util.compat.mekanism.addons.moremachine.recipe_types.EOMMRollingMillRecipes;
import net.radzratz.eternalores.util.compat.mekanism.addons.moremachine.recipe_types.EOMMStamperRecipes;
import net.radzratz.eternalores.util.compat.mekanism.recipe_types.*;
import net.radzratz.eternalores.util.compat.oritech.recipe_types.*;
import net.radzratz.eternalores.util.compat.powah.recipes.EOEnergizingRecipes;
import net.radzratz.eternalores.util.compat.powah.recipes.EOReactorRecipes;
import net.radzratz.eternalores.util.compat.railcraft.recipe_types.REOCrusherRecipes;
import net.radzratz.eternalores.util.compat.railcraft.recipe_types.REOMetalRollingRecipes;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class EORecipeProvider extends RecipeProvider {
    public EORecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput, HolderLookup.@NotNull Provider lookup) {
        var reg = BuiltInRegistries.ITEM;

        // Base Eternal Ores / Vanilla
        EOCraftingRecipes.generate(recipeOutput, reg);
        EOSmeltingRecipes.generate(recipeOutput, reg);

        // Mekanism
        EOMKCrusherRecipes.generate(recipeOutput, reg);
        EOMKEnrichingRecipes.generate(recipeOutput, reg);
        EOMKDissolutionRecipes.generate(recipeOutput, reg);
        EOMKWashingRecipes.generate(recipeOutput, reg);
        EOMKCrystallizerRecipes.generate(recipeOutput, reg);
        EOMKInjectingRecipes.generate(recipeOutput, reg);
        EOMKPurifyingRecipes.generate(recipeOutput, reg);
        EOMKInfusingRecipes.generateInfusion(recipeOutput, reg);
        EOMKInfusingRecipes.generateMetallurgic(recipeOutput);
        EOMKPrecisionSawmillRecipes.generate(recipeOutput);
        // MoreMachine
        EOMMStamperRecipes.generate(recipeOutput, reg);
        EOMMLatheRecipes.generate(recipeOutput, reg);
        EOMMRollingMillRecipes.generate(recipeOutput, reg);

        // Powah
        EOEnergizingRecipes.generate(recipeOutput);
        EOReactorRecipes.generate(recipeOutput);

        // Oritech
        EOTPulverizerRecipes.generate(recipeOutput, reg);
        EOTFoundryRecipes.generate(recipeOutput, reg);
        EOTAtomicForgeRecipes.generate(recipeOutput, reg);
        EOTCentrifugeRecipes.generate(recipeOutput, reg);
        EOTFragmentForgeRecipes.generate(recipeOutput, reg);
        EOTRefineryRecipes.generate(recipeOutput, reg);

        // Energized Power
        EEPPulverizerRecipes.generate(recipeOutput, reg);
        EEPCompressorRecipes.generate(recipeOutput, reg);
        EEPInductionRecipes.generate(recipeOutput, reg);
        EEPMetalPressRecipes.generate(recipeOutput, reg);
        EEPSawMill.generate(recipeOutput);

        // Actually Additions
        EOAACrusherRecipes.generate(recipeOutput, reg);
        EOAAMiningLensRecipes.generate(recipeOutput, reg);

        // EnderIO
        EIEOSagMillRecipes.generate(recipeOutput, reg);
        EIEOAlloySmelterRecipes.generate(recipeOutput, reg);

        // Create
        CTEOCrushingWheelRecipes.generate(recipeOutput, reg);
        CTEOMechanicalPressRecipes.generate(recipeOutput, reg);
        CTEOSawingRecipes.generate(recipeOutput, reg);
        CTEOMixingRecipes.generate(recipeOutput, reg);
        CTEOFanRecipes.generate(recipeOutput, reg);
        // Crafts and Additions
        EOAdRollingMillRecipes.generate(recipeOutput, reg);

        // Immersive Engineering
        IEOCrusherRecipes.generate(recipeOutput, reg);
        IEOKilnRecipes.generate(recipeOutput, reg);
        IEOMetalPressRecipes.generate(recipeOutput, reg);
        IEOArcFurnaceRecipes.generate(recipeOutput, reg);
        IEOMineralMixRecipes.generate(recipeOutput);
        IEOSawMillRecipes.generate(recipeOutput);

        // Forbidden and Arcanus
        FAEOClibanoRecipes.generate(recipeOutput, reg, lookup);

        // Industrial Foregoing
        EOreLaserDrillRecipes.generate(recipeOutput, reg);

        // Integrated Dynamics
        EOSqueezerRecipes.generate(recipeOutput, reg);

        // GeOres
        GEOreRecipes.generate(recipeOutput, reg);

        // RailCraft
        REOCrusherRecipes.generate(recipeOutput, reg);
        REOMetalRollingRecipes.generate(recipeOutput, reg);

        // Ars Nouveau
        EOImbuementChamber.generate(recipeOutput, reg);
    }
}
