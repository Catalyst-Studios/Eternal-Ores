package net.radzratz.eternalores.datagen.recipes.recipes;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.radzratz.eternalores.datagen.recipes.EOAdvancementYeeter;
import net.radzratz.eternalores.util.EOMaterialHelper;
import net.radzratz.eternalores.item.types.EOGemItem;
import net.radzratz.eternalores.item.types.EOIngotItem;
import net.radzratz.eternalores.item.types.EORawMaterialItem;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

import static net.radzratz.eternalores.util.EOMaterialHelper.*;
import static net.radzratz.eternalores.util.EOMaterialHelper.block;
import static net.radzratz.eternalores.util.EOUtils.C;
import static net.radzratz.eternalores.util.EOUtils.EO;
import static net.radzratz.eternalores.util.tags.item.EOItemsGeneralTags.*;

public class EOBlockRecipes extends RecipeProvider
{
    public EOBlockRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    public static void generate(RecipeOutput output, Stream<DeferredHolder<Item, ? extends Item>> allItems, Registry<Block> blockRegistry)
    {
        Set<String> generatedMaterials = new HashSet<>();

        RecipeOutput yeet = new EOAdvancementYeeter(output);

        List<String> compressedTypes = List.of("granite", "diorite", "andesite", "cobble", "dirt", "gravel", "sand");

        /// Material -> Block
        allItems.sorted(Comparator.comparing(entry -> entry.getId().getPath()))
                .forEach(entry ->
                {
                    Item item = entry.get();

                    String path = entry.getId().getPath();
                    String material = EOMaterialHelper.extractMaterial(path);

                    String mainPath = "blocks/";
                    String materialPath = "materials/";
                    String rawPath = mainPath + "raw_block/raw_";
                    String metalPath = mainPath + "metal/";
                    String gemPath = mainPath + "gem/";
                    String ingotPath = materialPath + "ingot/";
                    String gemP = materialPath + "gem/";
                    String rawP = materialPath + "raw_material/";

                    String g = "_gem";

                    String end = "_to_block";
                    String endI = "_from_block";

                    String h = "has_";
                    String hr = "has_raw_";

                    String p = "###";
                    char c = '#';

                    ResourceLocation blockId = EO( material + block);

                    // Raw Material -> Raw Material Block
                    switch (item)
                    {
                        case EORawMaterialItem rawMaterial ->
                        {
                            if (!generatedMaterials.add("raw:" + material)) return;

                            blockId = material.equals("sulfur")
                                    ? EO("sulfur_block")
                                    : EO(raw + material + block);

                            Block b = blockRegistry.getOptional(blockId).orElse(null);
                            if (b == null) return;

                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, b)
                                    .define(c, TagKey.create(Registries.ITEM, C(rawTag + material)))
                                    .pattern(p)
                                    .pattern(p)
                                    .pattern(p)
                                    .unlockedBy(hr + material, has(item))
                                    .save(yeet, EO( rawPath + material + end));

                            TagKey<Item> blockTag = TagKey.create(Registries.ITEM, C(storage + (material.equals("sulfur") ? "sulfur" : raw + material)));

                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, item, 9)
                                    .requires(blockTag)
                                    .unlockedBy(h + raw + material, has(blockTag))
                                    .save(yeet, EO(rawP + raw + material + endI));
                        }

                        // Ingot&Gem Material -> Material Block
                        case EOIngotItem ingotMaterial ->
                        {
                            if (!generatedMaterials.add("material:" + material)) return;

                            Block b = blockRegistry.getOptional(blockId).orElse(null);
                            if (b == null) return;

                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, b)
                                    .define(c, TagKey.create(Registries.ITEM, C(ingotTag + material)))
                                    .pattern(p)
                                    .pattern(p)
                                    .pattern(p)
                                    .unlockedBy(h + material, has(item))
                                    .save(yeet, EO(metalPath + material + end));

                            TagKey<Item> blockTag = TagKey.create(Registries.ITEM, C(storage + material));

                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, item, 9)
                                    .requires(blockTag)
                                    .unlockedBy(h + material + ingot, has(blockTag))
                                    .save(yeet, EO(ingotPath + material + ingot + endI));
                        }

                        case EOGemItem gemMaterial ->
                        {
                            if (!generatedMaterials.add("material:" + material)) return;

                            Block b = blockRegistry.getOptional(blockId).orElse(null);
                            if (b == null) return;

                            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, b)
                                    .define(c, TagKey.create(Registries.ITEM, C(gemTag + material)))
                                    .pattern(p)
                                    .pattern(p)
                                    .pattern(p)
                                    .unlockedBy(h + material, has(item))
                                    .save(yeet, EO(gemPath + material + end));

                            TagKey<Item> blockTag = TagKey.create(Registries.ITEM, C(storage + material));

                            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, item, 9)
                                    .requires(blockTag)
                                    .unlockedBy(h + gem + material, has(blockTag))
                                    .save(yeet, EO(gemP + material + g + endI));
                        }
                        default -> {}
                    }
                });

        for (String base : compressedTypes)
        {
            for (int i = 1; i < 9; i++)
            {
                String lower = "compressed_" + base + "_" + i + "x";
                String higher = "compressed_" + base + "_" + (i + 1 + "x");

                String material = EOMaterialHelper.extractMaterial(lower);
                String mainPath = "blocks/";
                String type = mainPath + "compressed/" + material;

                char c = '#';
                String p = "###";

                String f = "_from_";

                String h = "has_";

                ResourceLocation lowerId = EO(lower);
                ResourceLocation higherId = EO(higher);

                Block lowerBlock = blockRegistry.getOptional(lowerId).orElse(null);
                Block higherBlock = blockRegistry.getOptional(higherId).orElse(null);

                if (lowerBlock != null && higherBlock != null)
                {
                    // Shaped: 9x lower -> 1x higher
                    ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, higherBlock)
                            .define(c, lowerBlock.asItem())
                            .pattern(p)
                            .pattern(p)
                            .pattern(p)
                            .unlockedBy(h + lower, has(lowerBlock))
                            .save(yeet, EO(type + "/" + higher + f + lower));

                    // Shapeless: 1x higher -> 9x lower
                    ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, lowerBlock.asItem(), 9)
                            .requires(higherBlock.asItem())
                            .unlockedBy(h + higher, has(higherBlock))
                            .save(yeet, EO(type + "/" + lower + f + higher));
                }
            }
        }
    }
}
