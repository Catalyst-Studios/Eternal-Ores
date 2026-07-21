package net.radzratz.eternalores.util.compat.immersive_engineering;

import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeHolder;

import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;

/**
 * File created and provided by; Titop
 */
public class PressDeduplicator
{
    public static List<RecipeHolder<?>> deduplicate(List<RecipeHolder<?>> originalRecipes)
    {
        List<RecipeHolder<?>> uniqueRecipes = new ArrayList<>();
        Set<String> seenKeys = new HashSet<>();

        for(RecipeHolder<?> holder : originalRecipes)
        {
            Recipe<?> recipe = holder.value();

            //"plate", "rod", "gear"
            String moldType = extractMoldType(recipe);

            String inputsKey = recipe.getIngredients()
                    .stream()
                    .flatMap(ing ->
                            Arrays.stream(ing.getItems()))
                    .parallel()
                    .map(stack -> BuiltInRegistries.ITEM.getKey(stack.getItem()).toString())
                    .sorted()
                    .collect(Collectors.joining(","));

            String outputKey = "";
            if(Minecraft.getInstance().level != null)
            {
                ItemStack outputStack = recipe.getResultItem(Minecraft.getInstance().level.registryAccess());
                outputKey = BuiltInRegistries.ITEM.getKey(outputStack.getItem()).toString();
            }

            String uniqueKey = inputsKey + "->" + outputKey + "@" + moldType;

            if(!seenKeys.contains(uniqueKey))
            {
                seenKeys.add(uniqueKey);
                uniqueRecipes.add(holder);
            }
        }

        return uniqueRecipes;
    }

    private static String extractMoldType(Recipe<?> recipe)
    {
        Class<?> clazz = recipe.getClass();
        while(clazz != null)
        {
            try
            {
                Field moldField = clazz.getDeclaredField("mold");
                moldField.setAccessible(true);
                Object moldObj = moldField.get(recipe);

                if(moldObj != null)
                {
                    Item item = (moldObj instanceof ItemStack stack) ? stack.getItem() : (Item)moldObj;
                    ResourceLocation id = BuiltInRegistries.ITEM.getKey(item);
                    if(id != null)
                    {
                        String path = id.getPath();
                        if(path.startsWith("mold_"))
                            return path.substring(5);
                        if(path.endsWith("_mold"))
                            return path.substring(0, path.length() - 5);
                        return path;
                    }
                }
            }
            catch(NoSuchFieldException e)
            {
                clazz = clazz.getSuperclass();
            }
            catch(Exception e)
            {
                break;
            }
        }
        return "";
    }
}
