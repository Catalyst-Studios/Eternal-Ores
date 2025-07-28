package net.radzratz.eternalores.datagen.recipes.recipes.util;

import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.radzratz.eternalores.datagen.recipes.EOAdvancementYeeter;

import java.util.concurrent.CompletableFuture;

import static net.radzratz.eternalores.util.EOUtils.C;
import static net.radzratz.eternalores.util.EOUtils.EO;

public class EOFurnaceType extends RecipeProvider
{
    public EOFurnaceType(PackOutput output, CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries);
    }

    public static void generateFurnaceRecipes(RecipeOutput output, String material, TagKey<Item> inputTag, Item result,
                                              ResourceLocation recipeBasePath, float xpSmelt, float xpBlast, int timeSmelt, int timeBlast)
    {
        String unlockName = "has_" + inputTag.location().getPath().replace('/', '_');

        RecipeOutput yeet = new EOAdvancementYeeter(output);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(inputTag), RecipeCategory.MISC, result, xpSmelt, timeSmelt)
                .unlockedBy(unlockName, inventoryTrigger(ItemPredicate.Builder.item().of(inputTag).build()))
                .save(yeet, EO(recipeBasePath.getPath() + "_smelt"));

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(inputTag), RecipeCategory.MISC, result, xpBlast, timeBlast)
                .unlockedBy(unlockName, inventoryTrigger(ItemPredicate.Builder.item().of(inputTag).build()))
                .save(yeet, EO(recipeBasePath.getPath() + "_blast"));
    }

    public static void generateRawBlockToBlock(RecipeOutput output, String material, Item result)
    {
        TagKey<Item> rawOreBlockTag = TagKey.create(Registries.ITEM, C("storage_blocks/raw_" + material));

        generateFurnaceRecipes(output, material, rawOreBlockTag, result, EO("furnace/block/raw_block/" + material + "_block_from_raw_block"),
                0.5f, 0.8f, 200, 100);
    }

    public static void generateDustToMat(RecipeOutput output, String material, Item result)
    {
        TagKey<Item> tag = TagKey.create(Registries.ITEM, C("dusts/" + material));

        generateFurnaceRecipes(output, material, tag, result, EO("furnace/item/dust/" + material + "_from_dust"),
                0.2f, 0.3f, 200, 100);
    }

    public static void generateRawToMat(RecipeOutput output, String material, Item result)
    {
        TagKey<Item> tag = TagKey.create(Registries.ITEM, C("raw_materials/" + material));

        generateFurnaceRecipes(output, material, tag, result, EO("furnace/item/raw_material/" + material + "_from_raw_" + material),
                0.6f, 0.9f, 200, 100);
    }

    public static void generateOreBlockToMat(RecipeOutput output, String material, Item result)
    {
        TagKey<Item> oreTag = TagKey.create(Registries.ITEM, C("ores/" + material));

        generateFurnaceRecipes(output, material, oreTag, result, EO("furnace/block/ore/" + material + "_from_ore_block"),
                0.5f, 0.8f, 200, 100);
    }
}
