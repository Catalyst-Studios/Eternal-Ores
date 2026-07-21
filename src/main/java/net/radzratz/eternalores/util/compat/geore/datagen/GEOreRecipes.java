package net.radzratz.eternalores.util.compat.geore.datagen;

import net.minecraft.core.Registry;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.radzratz.eternalores.util.recipes.util.EOAdvancementYeeter;
import net.radzratz.eternalores.util.compat.geore.blocks.GEOreShardBlock;
import net.radzratz.eternalores.util.compat.geore.item.GEOreShardItem;

import java.util.HashSet;
import java.util.Set;

import static net.radzratz.eternalores.datagen.recipes.recipes.EOSmeltingRecipes.furnaceAndBlasting;
import static net.radzratz.eternalores.datagen.recipes.recipes.EOCraftingRecipes.shaped;
import static net.radzratz.eternalores.datagen.recipes.recipes.EOCraftingRecipes.shapeless;
import static net.radzratz.eternalores.util.EOMaterials.materialSets.FLUORITE_SET;
import static net.radzratz.eternalores.util.EOUtils.GEORE_MOD;
import static net.radzratz.eternalores.util.recipes.util.EORecipeActions.itemRecipeActionsGeOre;

public class GEOreRecipes {
    public static void generate(RecipeOutput output, Registry<Item> reg) {
        EOAdvancementYeeter yeet = new EOAdvancementYeeter(output.withConditions(GEORE_MOD));

        Set<String> generatedGeOreRecipes = new HashSet<>();

        itemRecipeActionsGeOre(reg, (item, path, mat, inp, out, id) -> {
            if (item instanceof GEOreShardItem) {
                // Shards -> Ingot/Dust - Gem
                if (generatedGeOreRecipes.add("smelting_geo_shard:" + mat)) {
                    Item result = null;

                    if (out.GEM != null) {
                        result = out.GEM;
                    } else if (mat.equals("fluorite")) {
                        result = FLUORITE_SET.GEM.get();
                    } else if (out.DUST_INGOT != null) {
                        result = out.DUST_INGOT;
                    }

                    if (result == null) return;

                    furnaceAndBlasting(yeet, inp.GEOSHARDS, result, 1.0f, 1.5f, 300, 150, id.Geo());
                }
            }

            // Block -> Shards
            if (item instanceof BlockItem b && b.getBlock() instanceof GEOreShardBlock) {
                if (generatedGeOreRecipes.add("crafting_geo_shard:" + mat) && out.GEOSHARDS != null) {
                    shapeless(yeet, inp.GEOSHARD_BLOCKS, null, out.GEOSHARDS, 4, id.Shards());
                }

                // Shards -> Block
                if (generatedGeOreRecipes.add("crafting_geo_shard_block:" + mat) && out.GEOSHARD_BLOCK != null) {
                    shaped(yeet, inp.GEOSHARDS, null, out.GEOSHARD_BLOCK, 1, id.ShardBlock(), "fours");
                }
            }
        });
    }
}
