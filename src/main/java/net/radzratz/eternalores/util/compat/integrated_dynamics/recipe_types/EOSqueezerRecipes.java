package net.radzratz.eternalores.util.compat.integrated_dynamics.recipe_types;

import com.mojang.datafixers.util.Either;
import net.minecraft.core.NonNullList;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.radzratz.eternalores.block.types.EOreBlock;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import org.apache.commons.lang3.tuple.Pair;
import org.cyclops.integrateddynamics.core.recipe.type.RecipeMechanicalSqueezer;
import org.cyclops.integrateddynamics.core.recipe.type.RecipeSqueezer;
import org.jetbrains.annotations.Nullable;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static net.minecraft.tags.ItemTags.*;
import static net.minecraft.world.item.Items.*;
import static net.radzratz.eternalores.util.EOMaterials.materialNames.*;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipePaths.PATH;

public class EOSqueezerRecipes {
    @SuppressWarnings("all")
    private static void squeezer(RecipeOutput output, Object input, Item result, int resultCount, float resultChance, @Nullable Item byproduct,
                                 int byproductCount, float byproductChance, @Nullable Item extraResult, int extraResultCount, float extraChance, String sfx) {
        if (result == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        NonNullList<RecipeSqueezer.IngredientChance> outputs = NonNullList.create();

        outputs.add(new RecipeSqueezer.IngredientChance(Either.left(Pair.of(new ItemStack(result, resultCount), resultChance))));

        if (byproduct != null) {
            outputs.add(new RecipeSqueezer.IngredientChance(Either.left(Pair.of(new ItemStack(byproduct, byproductCount), byproductChance))));
        }

        if (extraResult != null) {
            outputs.add(new RecipeSqueezer.IngredientChance(Either.left(Pair.of(new ItemStack(extraResult, extraResultCount), extraChance))));
        }

        RecipeSqueezer bldr = new RecipeSqueezer(itemTagInputs(input), outputs, Optional.empty());

        yeet.withConditions(INTEGRATED_DYNAMICS_MOD).accept(EO(PATH.INTEGSqueezer() + sfx), bldr, null);
    }

    @SuppressWarnings("all")
    private static void squeezer(RecipeOutput output, Object input, Item result, int resultCount, float resultChance, @Nullable Item byproduct,
                                 int byproductCount, float byproductChance, @Nullable Item extraResult, int extraResultCount, float extraChance, int duration, String sfx) {
        if (result == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        NonNullList<RecipeMechanicalSqueezer.IngredientChance> outputs = NonNullList.create();

        outputs.add(new RecipeMechanicalSqueezer.IngredientChance(Either.left(Pair.of(new ItemStack(result, resultCount), resultChance))));

        if (byproduct != null) {
            outputs.add(new RecipeMechanicalSqueezer.IngredientChance(Either.left(Pair.of(new ItemStack(byproduct, byproductCount), byproductChance))));
        }

        if (extraResult != null) {
            outputs.add(new RecipeMechanicalSqueezer.IngredientChance(Either.left(Pair.of(new ItemStack(extraResult, extraResultCount), extraChance))));
        }

        RecipeSqueezer bldr = new RecipeMechanicalSqueezer(itemTagInputs(input), outputs, Optional.empty(), duration);

        yeet.withConditions(INTEGRATED_DYNAMICS_MOD).accept(EO(PATH.INTEGSqueezer() + sfx), bldr, null);
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        Set<String> generatedSqueezerRecipes = new HashSet<>();

        squeezer(yeet, REDSTONE_ORES, REDSTONE, 8, 1.0f, REDSTONE, 2,
                0.5f, REDSTONE, 2, 0.5f, "dusts/" + REDSTONE_ID + "_manual");
        squeezer(yeet, REDSTONE_ORES, REDSTONE, 12, 1.0f, REDSTONE, 2,
                0.50f, REDSTONE, 2, 0.15f, 4, "dusts/" + REDSTONE_ID + "_mechanical");
        squeezer(yeet, COPPER_ORES, RAW_COPPER, 2, 1.0f, RAW_COPPER, 1,
                0.25f, RAW_COPPER, 1, 0.15f, "raw/" + COPPER_ID + "_manual");
        squeezer(yeet, COPPER_ORES, RAW_COPPER, 3, 1.0f, RAW_COPPER, 2,
                0.50f, RAW_COPPER, 2, 0.35f, 4, "raw/" + COPPER_ID + "_mechanical");
        squeezer(yeet, IRON_ORES, RAW_IRON, 2, 1.0f, RAW_IRON, 1,
                0.25f, RAW_IRON, 1, 0.15f, "raw/" + IRON_ID + "_manual");
        squeezer(yeet, IRON_ORES, RAW_IRON, 3, 1.0f, RAW_IRON, 2,
                0.50f, RAW_IRON, 2, 0.35f, 4, "raw/" + IRON_ID + "_mechanical");
        squeezer(yeet, GOLD_ORES, RAW_GOLD, 2, 1.0f, RAW_GOLD, 1,
                0.25f, RAW_GOLD, 1, 0.15f, "raw/" + GOLD_ID + "_manual");
        squeezer(yeet, GOLD_ORES, RAW_GOLD, 3, 1.0f, RAW_GOLD, 2,
                0.50f, RAW_GOLD, 2, 0.35f, 4, "raw/" + GOLD_ID + "_mechanical");

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            if (item instanceof BlockItem b && b.getBlock() instanceof EOreBlock || isVanillaOre(inp.ORE)) {
                if (generatedSqueezerRecipes.add("squeezer_ores_raw:" + mat) && out.RAW != null) {
                    squeezer(yeet, inp.ORE, out.RAW, 2, 1.0f, out.RAW, 1,
                            0.35f, out.RAW, 1, 0.15f, id.Raw() + "_manual");
                    squeezer(yeet, inp.ORE, out.RAW, 3, 1.0f, out.RAW, 2,
                            0.50f, out.RAW, 2, 0.35f, 4, id.Raw() + "_mechanical");
                } else if (generatedSqueezerRecipes.add("squeezer_ores_gem:" + mat) && out.GEM != null) {
                    squeezer(yeet, inp.ORE, out.GEM, 2, 1.0f, out.GEM, 1,
                            0.25f, out.GEM, 1, 0.15f, id.Gem() + "_manual");

                    squeezer(yeet, inp.ORE, out.GEM, 3, 1.0f, out.GEM, 2,
                            0.50f, out.GEM, 2, 0.35f, 4, id.Gem() + "_mechanical");
                }
            }
        });
    }
}
