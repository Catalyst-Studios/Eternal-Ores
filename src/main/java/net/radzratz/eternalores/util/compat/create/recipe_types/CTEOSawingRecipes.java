package net.radzratz.eternalores.util.compat.create.recipe_types;

import com.simibubi.create.content.kinetics.saw.CuttingRecipe;
import com.simibubi.create.content.processing.recipe.StandardProcessingRecipe;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.item.types.EOGemItem;
import net.radzratz.eternalores.item.types.EOIngotItem;
import net.radzratz.eternalores.item.types.EOWireItem;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;

import java.util.HashSet;
import java.util.Set;

import static net.minecraft.tags.ItemTags.WOODEN_SLABS;
import static net.radzratz.eternalores.util.EOMaterials.materialSets.WOOD_SET;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.*;

public class CTEOSawingRecipes {
    private static void saw(RecipeOutput output, Object input, Item result, int resultCount, String sfx) {
        if (result == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        StandardProcessingRecipe.Builder<CuttingRecipe> bldr =
                new StandardProcessingRecipe.Builder<>(CuttingRecipe::new, EO(sfx));

        bldr.require(itemTagInputs(input)).output(result, resultCount);

        bldr.withCondition(CREATE_MOD).build(yeet);
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        // Don't think this is necessary here, but YEET
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        // Prevents the generation of duplicate recipes on both main and outside loops
        Set<String> generatedSawingRecipes = new HashSet<>();

        EORecipePaths paths = new EORecipePaths("");

        saw(yeet, WOODEN_SLABS, WOOD_SET.PLATE.get(), 4, paths.Plate() + "wooden");
        saw(yeet, WOOD_SET.PLATE.get(), WOOD_SET.GEAR.get(), 1, paths.Gear() + "wooden");

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            // Rods
            if (item instanceof EOIngotItem || isVanillaIngot(inp.INGOT)) {
                if (generatedSawingRecipes.add("rod_ingot:" + mat) && out.ROD != null) {
                    saw(yeet, inp.INGOT, out.ROD, 1, id.Rod());
                }
            }

            if (item instanceof EOGemItem || isVanillaGem(inp.GEM)) {
                if (generatedSawingRecipes.add("rod_gem:" + mat) && out.ROD != null) {
                    saw(yeet, inp.GEM, out.ROD, 1, id.Rod());
                }
            }

            // Wires
            if (item instanceof EOWireItem) {
                if (generatedSawingRecipes.add("wires:" + mat) && out.WIRE != null) {
                    saw(yeet, inp.PLATE, out.WIRE, 2, id.Wire());
                }
            }
        });
    }
}
