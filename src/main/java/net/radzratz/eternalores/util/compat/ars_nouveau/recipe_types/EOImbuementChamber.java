package net.radzratz.eternalores.util.compat.ars_nouveau.recipe_types;

import com.hollingsworth.arsnouveau.common.crafting.recipes.ImbuementRecipe;
import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;

import static com.hollingsworth.arsnouveau.setup.registry.ItemsRegistry.*;
import static net.radzratz.eternalores.util.EOMaterials.materialSets.*;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipeInputs.*;
import static net.radzratz.eternalores.util.recipes.util.EORecipePaths.*;

public class EOImbuementChamber {
    @SuppressWarnings("all")
    private static void imbuement(RecipeOutput output, Object input, Item result, int source, String sfx) {
        if (result == null) return;

        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        ImbuementRecipe bldr = new ImbuementRecipe(sfx, itemTagInputs(input), new ItemStack(result, 1), source);

        yeet.withConditions(ARS_NOUVEAU_MOD).accept(EO(PATH.Imbue() + sfx), bldr, null);
    }

    public static void generate(RecipeOutput output, Registry<Item> ignoredReg) {
        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output);

        imbuement(yeet, LAPIS_SET.GEM_SHARD.get(), SOURCE_SET.GEM_SHARD.get(), 125, PATH.Gem() + "lapis");
        imbuement(yeet, AMETHYST_SET.GEM_SHARD.get(), SOURCE_SET.GEM_SHARD.get(), 125, PATH.Gem() + "amethyst");
    }
}
