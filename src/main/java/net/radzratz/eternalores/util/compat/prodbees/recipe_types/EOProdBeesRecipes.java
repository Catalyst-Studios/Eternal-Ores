package net.radzratz.eternalores.util.compat.prodbees.recipe_types;

import cy.jdkdigital.productivebees.common.crafting.conditions.BeeExistsCondition;
import cy.jdkdigital.productivebees.common.crafting.ingredient.BeeIngredient;
import cy.jdkdigital.productivebees.common.crafting.ingredient.ComponentIngredient;
import cy.jdkdigital.productivebees.common.recipe.*;
import cy.jdkdigital.productivebees.init.*;
import cy.jdkdigital.productivebees.util.BeeCreator;
import cy.jdkdigital.productivelib.common.recipe.TagOutputRecipe;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.fluids.FluidStack;
import net.neoforged.neoforge.fluids.crafting.SizedFluidIngredient;
import net.radzratz.eternalores.util.compat.prodbees.EOProdBeesBuilder;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.compat.prodbees.EOProdBeesBuilder.getBee;
import static net.radzratz.eternalores.util.recipes.util.EORecipePaths.*;

public class EOProdBeesRecipes {
    public static void generate(RecipeOutput output) {
        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        EOProdBeesBuilder.BEES.forEach(bee -> {
            conversion(yeet, bee);
            centrifuge(yeet, bee);
            beehive(yeet, bee);
            breeding(yeet, bee);
        });
    }

    private static void conversion(EOAdvancementYeeter yeet, EOProdBeesBuilder.EOBee bee) {
        EOProdBeesBuilder.Conversion from = bee.from();
        if (from == null) return;

        ResourceLocation source = ResourceLocation.parse(from.source());
        Ingredient food = from.item().startsWith("#")
                ? Ingredient.of(TagKey.create(Registries.ITEM, ResourceLocation.parse(from.item().substring(1))))
                : Ingredient.of(getBee(BuiltInRegistries.ITEM, ResourceLocation.parse(from.item())));
        BeeConversionRecipe recipe = new BeeConversionRecipe(beeIngredient(source), beeIngredient(bee.beeId()), food, from.chance());

        yeet.withConditions(PBEES_MOD, new BeeExistsCondition(source), new BeeExistsCondition(bee.beeId()))
                .accept(EO(PATH.PBeeConversion() + bee.id()), recipe, null);
    }

    private static void centrifuge(EOAdvancementYeeter yeet, EOProdBeesBuilder.EOBee bee) {
        EOProdBeesBuilder.Output o = bee.output();
        int min = o.min();
        int max = o.max();

        ItemStack combStack = new ItemStack(ModItems.CONFIGURABLE_HONEYCOMB.get());
        BeeCreator.setType(bee.beeId(), combStack);

        List<TagOutputRecipe.ChancedOutput> results = new ArrayList<>(List.of(new TagOutputRecipe.ChancedOutput(Ingredient.of(ModTags.Common.WAXES), 1, 1, 1f)));
        FluidStack fluid = new FluidStack(ModFluids.HONEY, 100);

        if (o.isFluid()) {
            fluid = new FluidStack(getBee(BuiltInRegistries.FLUID, o.id()), min);
        } else {
            results.add(new TagOutputRecipe.ChancedOutput(Ingredient.of(getBee(BuiltInRegistries.ITEM, o.id())), min, max, o.chance()));
        }

        CentrifugeRecipe recipe = new CentrifugeRecipe(ComponentIngredient.of(combStack), results, SizedFluidIngredient.of(fluid), 0);

        yeet.withConditions(PBEES_MOD, new BeeExistsCondition(bee.beeId())).accept(EO(PATH.PBeeCentrifuge() + bee.id() + "_honeycomb"), recipe, null);
    }

    private static void beehive(EOAdvancementYeeter yeet, EOProdBeesBuilder.EOBee bee) {
        ItemStack combStack = new ItemStack(ModItems.CONFIGURABLE_HONEYCOMB.get());
        BeeCreator.setType(bee.beeId(), combStack);

        List<TagOutputRecipe.ChancedOutput> results = List.of(
                new TagOutputRecipe.ChancedOutput(ComponentIngredient.of(combStack), 1, 1, 1f),
                new TagOutputRecipe.ChancedOutput(Ingredient.of(TagKey.create(Registries.ITEM,
                        ResourceLocation.fromNamespaceAndPath("c", "pollens"))), 1, 1, 0.05f)
        );

        AdvancedBeehiveRecipe recipe = new AdvancedBeehiveRecipe(beeIngredient(bee.beeId()), results);

        yeet.withConditions(PBEES_MOD, new BeeExistsCondition(bee.beeId())).accept(EO(PATH.PBeeHive() + bee.id()), recipe, null);
    }

    private static void breeding(EOAdvancementYeeter yeet, EOProdBeesBuilder.EOBee bee) {
        EOProdBeesBuilder.Breeding breed = bee.breed();
        if (breed == null) return;

        ResourceLocation parent1 = ResourceLocation.parse(breed.parent1());
        ResourceLocation parent2 = ResourceLocation.parse(breed.parent2());
        BeeBreedingRecipe recipe = new BeeBreedingRecipe(beeIngredient(parent1), beeIngredient(parent2),
                beeIngredient(bee.beeId()), breed.parentDeathChance());

        yeet.withConditions(PBEES_MOD, new BeeExistsCondition(parent1), new BeeExistsCondition(parent2), new BeeExistsCondition(bee.beeId()))
                .accept(EO(PATH.PBreeding() + bee.id()), recipe, null);
    }

    private static Supplier<BeeIngredient> beeIngredient(ResourceLocation id) {
        BeeIngredient ing = new BeeIngredient(ModEntities.CONFIGURABLE_BEE.get(), id, true);
        return () -> ing;
    }
}