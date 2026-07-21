package net.radzratz.eternalores.util.compat.enderio.recipe_types;

import com.enderio.enderio.content.machines.alloy.AlloySmeltingRecipe;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.common.crafting.SizedIngredient;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.item.types.EOIngotItem;
import net.radzratz.eternalores.util.recipes.types.EOCommonRecipes;
import net.radzratz.eternalores.item.types.EOrGemItem;
import net.radzratz.eternalores.util.recipes.util.EORecipePaths;
import org.jetbrains.annotations.Nullable;

import java.util.*;

import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActions;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.itemTagInputs;

public class EIEOAlloySmelterRecipes {
    private static final float XP = 0.5f;

    private static void smlt(RecipeOutput output, Object inp, int iCnt, Object inpT, int iTCnt, @Nullable Object inpTh, int iThCnt, Item rlt, int rCnt, int energy, String sfx) {
        RecipeOutput yeet = new EOAdvancementYeeter(output);
        EORecipePaths id = new EORecipePaths("");

        List<SizedIngredient> inputs = new ArrayList<>();

        if (inp != null) {
            inputs.add(new SizedIngredient(itemTagInputs(inp), iCnt));
        }

        if (inpT != null) {
            inputs.add(new SizedIngredient(itemTagInputs(inpT), iTCnt));
        }

        if (inpTh != null) {
            inputs.add(new SizedIngredient(itemTagInputs(inpTh), iThCnt));
        }

        AlloySmeltingRecipe recipe = new AlloySmeltingRecipe(inputs, new ItemStack(rlt, rCnt), energy, XP, false);

        yeet.accept(EO(id.ESmelter() + sfx.toLowerCase(Locale.ROOT)), recipe, null, ENDERIO_MOD);
    }

    public static void generate(RecipeOutput output, Registry<Item> reg) {
        // Don't think this is necessary here, but YEET
        RecipeOutput yeet = new EOAdvancementYeeter(output);

        // Prevents the generation of duplicate recipes on both main and outside loops
        // Not used in this case, but we keep it
        Set<String> generatedAlloySmelterRecipes = new HashSet<>();

        itemRecipeActions(reg, (item, path, mat, inp, out, id) -> {
            // Ore Gem -> Ingot / Dust
            if (item instanceof EOrGemItem) {
                if (generatedAlloySmelterRecipes.add("gem:" + mat) && out.DUST_INGOT != null) {
                    smlt(yeet, inp.ORE_GEM, 1, inp.ORE_GEM, 1, null, 0, out.DUST_INGOT, 3, 900, id.OreGem());
                }
            }

            // Alloys
            if (item instanceof EOIngotItem) {
                for (EOCommonRecipes.Alloys r : EOCommonRecipes.ALLOYS) {
                    if (r.input() != null && r.inputTwo() != null && r.inputThree() != null) {
                        if (generatedAlloySmelterRecipes.add("alloys/" + r.sfx())) {
                            smlt(yeet, r.input(), r.inputCount(), r.inputTwo(), r.inputTwoCount(), r.inputThree(), r.inputThreeCount(),
                                    r.result(), r.resultCount(), 1500, "alloys/" + r.sfx());
                        }
                    } else if (r.input() != null && r.inputTwo() != null) {
                        if (generatedAlloySmelterRecipes.add("alloys/" + r.sfx())) {
                            smlt(yeet, r.input(), r.inputCount(), r.inputTwo(), r.inputTwoCount(), null, 0,
                                    r.result(), r.resultCount(), 1500, "alloys/" + r.sfx());
                        }
                    }
                }
            }
        });
    }
}
