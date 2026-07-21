package net.radzratz.eternalores.util.compat.immersive_engineering;

import blusunrize.immersiveengineering.api.crafting.MetalPressRecipe;
import com.google.common.collect.ArrayListMultimap;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IIngredientAcceptor;
import mezz.jei.api.gui.builder.IRecipeSlotBuilder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeHolder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static net.radzratz.eternalores.util.EOUtils.IMMERSIVE_ENGINEERING;
import static net.radzratz.eternalores.util.config.EOTweaksConfig.CFG;

/**
 * File created and provided by; Titop
 */
@SuppressWarnings("null")
public class Press
{
    public static void handleMoldTags(ArrayListMultimap<Item, RecipeHolder<MetalPressRecipe>> recipesByMold)
    {
        if (!CFG.EO_TWEAKS.ieMoldTagCompat.getAsBoolean())
        {
            return;
        }

        // En Press.handleMoldTags — cambia solo el filter
        List<Item> moldsInRecipes = recipesByMold.keySet().stream()
                .parallel()
                .filter(item -> {
                    ResourceLocation id = BuiltInRegistries.ITEM.getKey(item);
                    if (id == null) return false;
                    // accepts molds from anywhere as long as they follow 'mold_type' naming convention
                    return id.getPath().startsWith("mold_");
                })
                .toList();

        for (Item ieMold : moldsInRecipes)
        {
            ResourceLocation id = BuiltInRegistries.ITEM.getKey(ieMold);

            //"mold_gear" -> "gear" "mold_rod" -> "rod"
            String moldType = id.getPath().substring(5);

            List<RecipeHolder<MetalPressRecipe>> currentRecipes = new ArrayList<>(recipesByMold.get(ieMold));
            if (currentRecipes.isEmpty())
            {
                continue;
            }

            TagKey<Item> toolsMoldsTag = TagKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.parse("c:tools/molds/" + moldType));
            TagKey<Item> commonMoldsTag = TagKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.parse("c:molds/" + moldType));

            applyRecipesToTag(recipesByMold, ieMold, currentRecipes, toolsMoldsTag);
            applyRecipesToTag(recipesByMold, ieMold, currentRecipes, commonMoldsTag);
        }
    }

    private static void applyRecipesToTag(ArrayListMultimap<Item, RecipeHolder<MetalPressRecipe>> recipesByMold,
                                          Item ieMold,
                                          List<RecipeHolder<MetalPressRecipe>> ieRecipes,
                                          TagKey<Item> tagKey)
    {
        BuiltInRegistries.ITEM.getTag(tagKey).ifPresent(namedHolders -> {
            for (var holder : namedHolders)
            {
                Item customMold = holder.value();

                if (customMold == ieMold)
                {
                    continue;
                }

                for (RecipeHolder<MetalPressRecipe> recipe : ieRecipes)
                {
                    if (recipesByMold.containsEntry(customMold, recipe))
                    {
                        continue;
                    }

                    recipesByMold.put(customMold, recipe);
                }
            }
        });
    }

    public static IIngredientAcceptor<?> handleJeiMoldSlot(IRecipeSlotBuilder builder, ItemStack originalStack)
    {
        if(!CFG.EO_TWEAKS.ieMoldTagCompat.getAsBoolean())
        {
            return builder.addItemStack(originalStack);
        }

        String moldType = null;
        ResourceLocation itemId = BuiltInRegistries.ITEM.getKey(originalStack.getItem());

        if(itemId != null && itemId.getNamespace().equals(IMMERSIVE_ENGINEERING) && itemId.getPath().startsWith("mold_"))
        {
            moldType = itemId.getPath().substring(5); // "mold_plate" -> "plate"
        }
        else
        {
            TagKey<Item> foundTag = originalStack.getTags()
                    .filter(tag -> tag.location().getNamespace().equals("c") && (tag.location().getPath().startsWith("molds/") || tag.location().getPath().startsWith("tools/molds/")))
                    .findFirst()
                    .orElse(null);

            if(foundTag != null)
            {
                String path = foundTag.location().getPath();
                moldType = path.startsWith("molds/") ? path.substring(6) : path.substring(12);
            }
        }

        if(moldType != null)
        {
            List<ItemStack> unifiedMolds = new ArrayList<>();
            Set<Item> addedItems = new HashSet<>();

            unifiedMolds.add(originalStack);
            addedItems.add(originalStack.getItem());

            ResourceLocation ieMoldId = ResourceLocation.parse("immersiveengineering:mold_" + moldType);
            BuiltInRegistries.ITEM.getOptional(ieMoldId).ifPresent(ieItem -> {
                if(!addedItems.contains(ieItem))
                {
                    unifiedMolds.add(new ItemStack(ieItem));
                    addedItems.add(ieItem);
                }
            });

            TagKey<Item> cMoldsTag = TagKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.parse("c:molds/" + moldType));
            TagKey<Item> cToolsMoldsTag = TagKey.create(BuiltInRegistries.ITEM.key(), ResourceLocation.parse("c:tools/molds/" + moldType));

            mergeTagIngredients(cMoldsTag, unifiedMolds, addedItems);
            mergeTagIngredients(cToolsMoldsTag, unifiedMolds, addedItems);

            return builder.addIngredients(VanillaTypes.ITEM_STACK, unifiedMolds);
        }

        return builder.addItemStack(originalStack);
    }

    private static void mergeTagIngredients(TagKey<Item> tagKey, List<ItemStack> list, Set<Item> added)
    {
        BuiltInRegistries.ITEM.getTag(tagKey).ifPresent(namedHolders -> {
            for(var holder : namedHolders)
            {
                Item item = holder.value();
                if(!added.contains(item))
                {
                    list.add(new ItemStack(item));
                    added.add(item);
                }
            }
        });
    }
}
