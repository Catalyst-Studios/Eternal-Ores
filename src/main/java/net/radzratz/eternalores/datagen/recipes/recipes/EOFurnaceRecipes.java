package net.radzratz.eternalores.datagen.recipes.recipes;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.radzratz.eternalores.util.EOMaterialHelper;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Stream;

import static net.radzratz.eternalores.datagen.recipes.recipes.util.EOFurnaceEntries.*;
import static net.radzratz.eternalores.datagen.recipes.recipes.util.EOFurnaceType.*;
import static net.radzratz.eternalores.util.EOUtils.EO;

public class EOFurnaceRecipes extends RecipeProvider
{
    public EOFurnaceRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    public static void generate(RecipeOutput output, Stream<DeferredHolder<Item, ? extends Item>> allItems, Registry<Item> itemRegistry)
    {
        Set<String> processed = new HashSet<>();

        Function<String, Item> getBlock = material -> itemRegistry.getOptional(EO(material + "_block")).orElse(null);

        /// Special Raw Block Cases
        generateRawBlockToBlock(output, "gold", Items.GOLD_BLOCK);
        generateRawBlockToBlock(output, "iron", Items.IRON_BLOCK);
        generateRawBlockToBlock(output, "copper", Items.COPPER_BLOCK);

        allItems.sorted(Comparator.comparing(i -> i.getId().getPath()))
                .forEach(entry ->
                {
                    String path = entry.getId().getPath();
                    String material = EOMaterialHelper.extractMaterial(path);

                    /// Raw Block -> Material Block
                    if (path.startsWith("raw_") && path.endsWith("_block") && processed.add("rawblock:" + material))
                    {
                        String mat = material.replaceFirst("^raw_", "");

                        if (excludeMat.contains(mat)) return;

                        Item result = getBlock.apply(mat);
                        if (result != null) { generateRawBlockToBlock(output, mat, result); }
                    }

                    /// Ore Block -> Material
                    if (path.endsWith("_ore_block"))
                    {
                        String mat = path.replaceFirst("^(deepslate_|nether_|end_)?", "").replaceFirst("_ore_block$", "");

                        if (excludeMat.contains(mat)) return;

                        if (!path.equals(mat + "_ore_block")) return;

                        Item result = itemRegistry.getOptional(EO(mat + "_ingot")).orElse(null);

                        if (result == null) result = itemRegistry.getOptional(EO("gem_" + mat)).orElse(null);

                        if (result == null && specialCases.containsKey(mat)) result = itemRegistry.getOptional(EO(specialCases.get(mat))).orElse(null);

                        if (result == null) { return; }

                        generateOreBlockToMat(output, mat, result);
                    }

                    /// Raw Material -> Material
                    if (path.startsWith("raw_") && !path.endsWith("_block"))
                    {
                        String mat = EOMaterialHelper.extractMaterial(path);
                        if (excludeMat.contains(mat) || mat.equals("sulfur")) return;
                        if (!processed.add("raw:" + mat)) return;

                        Item result = itemRegistry.getOptional(EO(mat + "_ingot")).orElse(null);
                        if (result == null) { return; }

                        generateRawToMat(output, mat, result);
                    }

                    ///Material Dust -> Material
                    if (path.endsWith("_dust") && !path.contains("o_") && !path.contains("dirty_") && !path.endsWith("_small_dust"))
                    {
                        String mat = EOMaterialHelper.extractMaterial(path);

                        if (excludeDust.contains(mat)) return;
                        if (!processed.add("dust:" + mat)) return;

                        Item result;
                        ResourceLocation specialResult = dustSpecialCases.get(mat);

                        if (specialResult != null)
                        {
                            result = itemRegistry.getOptional(specialResult).orElse(null);
                        }
                            else
                        {
                            result = itemRegistry.getOptional(EO(mat + "_ingot")).orElseGet(() ->
                                    itemRegistry.getOptional(EO("gem_" + mat)).orElse(null));
                        }

                        if (result == null) { return; }

                        generateDustToMat(output, mat, result);
                    }
                });
    }
}
