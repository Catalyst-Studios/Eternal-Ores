package net.radzratz.eternalores.util.compat.create.recipe_types;

import com.simibubi.create.content.kinetics.fan.processing.HauntingRecipe;
import com.simibubi.create.content.kinetics.fan.processing.SplashingRecipe;
import com.simibubi.create.content.processing.recipe.StandardProcessingRecipe;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.item.types.EOClumpItem;
import net.radzratz.eternalores.item.types.EODirtyDustItem;
import org.jetbrains.annotations.Nullable;

import java.util.HashSet;
import java.util.Set;

import static net.minecraft.world.item.Items.*;
import static net.radzratz.eternalores.util.EOMaterials.materialSets.*;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.itemTagInputs;
import static net.radzratz.eternalores.util.tags.item.EOItemTags.Dusts.*;

public class CTEOFanRecipes {
    private static void fan(RecipeOutput output, Object input, Item result, int resultCount, @Nullable Item byproduct, float byproductChance, String sfx, boolean isHaunt) {
        if (result == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        StandardProcessingRecipe.Builder<?> bldr;

        if (isHaunt) {
            bldr = new StandardProcessingRecipe.Builder<>(HauntingRecipe::new, EO(sfx));
        } else {
            bldr = new StandardProcessingRecipe.Builder<>(SplashingRecipe::new, EO(sfx));
        }

        bldr.require(itemTagInputs(input)).output(result, resultCount);

        if (byproduct != null) {
            bldr.output(byproductChance, byproduct);
        }

        bldr.withCondition(CREATE_MOD).build(yeet);
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        // Don't think this is necessary here, but YEET
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        // Prevents the generation of duplicate recipes on both main and outside loops
        Set<String> generatedFanRecipes = new HashSet<>();

        fan(yeet, PEAT_SET.COAL.get(), BIOMASS_SET.ITEM.get(), 1, null, 0f, "biomass", false);
        fan(yeet, DUSTS_BRICK, CLAY_BALL, 1, null, 0f, "clay", false);
        fan(yeet, DUSTS_BRICK, NETHER_BRICK, 1, null, 0f, "nether_brick", true);
        fan(yeet, SAPPHIRE_SET.GEM.get(), NECROTICARITE_SET.GEM.get(), 1, SOUL_SAND_SET.DUST.get(), 0.45f, "necroticarite", true);

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            if (item instanceof EODirtyDustItem) {
                if (generatedFanRecipes.add("create_washing_dirty_dust:" + mat) && out.DUST != null) {
                    fan(yeet, inp.DIRTY_DUST, out.DUST, 1, STONE_SET.SMALL_DUST.get(), 0.22f, id.DirtyDust(), false);
                }
            }

            if (item instanceof EOClumpItem) {
                if (generatedFanRecipes.add("create_washing_clump:" + mat) && out.DUST != null) {
                    fan(yeet, inp.CLUMP, out.DUST, 2, out.SMALL_DUST, 0.31f, id.Clump(), false);
                }
            }

            // Haunting... think of something really spooky while reading this...
        });
    }
}
