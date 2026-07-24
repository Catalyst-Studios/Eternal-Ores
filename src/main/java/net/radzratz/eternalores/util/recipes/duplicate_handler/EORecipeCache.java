package net.radzratz.eternalores.util.recipes.duplicate_handler;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.SimplePreparableReloadListener;
import net.minecraft.util.profiling.ProfilerFiller;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

import static net.radzratz.eternalores.EternalOres.LOG;

public class EORecipeCache extends SimplePreparableReloadListener<Map<ResourceLocation, JsonObject>> {
    private static volatile Map<ResourceLocation, JsonObject> RAW_RECIPES = Map.of();

    public static JsonObject get(ResourceLocation id) {
        return RAW_RECIPES.get(id);
    }

    public static void clear()
    {
        if(!RAW_RECIPES.isEmpty())
        {
            int size = RAW_RECIPES.size();
            RAW_RECIPES = Map.of();
            LOG.info("[EORecipeCache] Free {} JSONs from RAM.", size);
        }
    }

    @Override
    protected @NotNull Map<ResourceLocation, JsonObject> prepare(ResourceManager manager, @NotNull ProfilerFiller profiler) {
        Map<ResourceLocation, JsonObject> map = new HashMap<>();
        manager.listResources("recipe", path -> path.getPath().endsWith(".json"))
                .forEach((fileLocation, resource) -> {
                    try (var reader = resource.openAsReader()) {
                        JsonElement el = JsonParser.parseReader(reader);
                        if (el.isJsonObject()) {
                            map.put(stripRecipePrefix(fileLocation), el.getAsJsonObject());
                        }
                    } catch (Exception ignored) {}
                });
        return map;
    }

    @Override
    protected void apply(Map<ResourceLocation, JsonObject> data, @NotNull ResourceManager manager, @NotNull ProfilerFiller profiler) {
        RAW_RECIPES = data;
        LOG.info("[EORecipeCache] Cached {} raw recipe JSONs.", data.size());
    }

    private static ResourceLocation stripRecipePrefix(ResourceLocation fileLoc) {
        String path = fileLoc.getPath();
        path = path.substring("recipe/".length(), path.length() - ".json".length());
        return ResourceLocation.fromNamespaceAndPath(fileLoc.getNamespace(), path);
    }
}