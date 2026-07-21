package net.radzratz.eternalores.util.recipes.util;

import net.minecraft.core.Registry;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.util.EOMaterials;

import java.util.Comparator;

import static net.radzratz.eternalores.util.EOUtils.allItemEntries;
import static net.radzratz.eternalores.util.EOUtils.georeMod;
import static net.radzratz.eternalores.util.compat.geore.GEOreRegistry.allGeOreItemEntries;

public class EORecipeActions {
    @FunctionalInterface
    public interface RecipeActions {
        void accept(Item item, String path, String mat, EORecipeInputs inp, EORecipeOutputs out, EORecipePaths id);
    }

    public static void itemRecipeActions(Registry<Item> reg, RecipeActions action) {
        allItemEntries().sorted(Comparator.comparing(entry -> entry.getId().getPath())).forEach(entry -> {
            Item item = entry.get();
            String path = entry.getId().getPath();
            String mat = EOMaterials.extractMaterialName(path);

            EORecipeInputs inp = EORecipeInputs.fromPath(mat);
            EORecipeOutputs out = EORecipeOutputs.fromPath(mat, reg);
            EORecipePaths id = new EORecipePaths(mat);

            action.accept(item, path, mat, inp, out, id);
        });
    }

    public static void itemRecipeActionsGeOre(Registry<Item> reg, RecipeActions action) {
        if (georeMod) {
            allGeOreItemEntries().sorted(Comparator.comparing(entry -> entry.getId().getPath())).forEach(entry -> {
                Item item = entry.get();
                String path = entry.getId().getPath();
                String mat = EOMaterials.extractMaterialName(path);

                EORecipeInputs inp = EORecipeInputs.fromPath(mat);
                EORecipeOutputs out = EORecipeOutputs.fromPath(mat, reg);
                EORecipePaths id = new EORecipePaths(mat);

                action.accept(item, path, mat, inp, out, id);
            });
        }
    }
}
