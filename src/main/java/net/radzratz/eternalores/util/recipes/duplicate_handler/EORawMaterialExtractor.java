package net.radzratz.eternalores.util.recipes.duplicate_handler;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class EORawMaterialExtractor {
    private static final Pattern OUTPUT_KEY = Pattern.compile("(?i)result|output");

    public static Set<Item> extractInputItems(JsonObject root) {
        return extractItems(root, false);
    }

    public static Set<Item> extractOutputItems(JsonObject root) {
        return extractItems(root, true);
    }

    private static Set<Item> extractItems(JsonObject root, boolean wantOutput) {
        Set<Item> items = new HashSet<>();
        for (Map.Entry<String, JsonElement> entry : root.entrySet()) {
            boolean isOutputField = OUTPUT_KEY.matcher(entry.getKey()).find();
            if (isOutputField == wantOutput) {
                walk(entry.getValue(), items);
            }
        }
        return items;
    }

    private static void walk(JsonElement element, Set<Item> out) {
        if (element == null || element.isJsonNull()) return;

        if (element.isJsonObject()) {
            JsonObject obj = element.getAsJsonObject();

            if (obj.has("tag") && obj.get("tag").isJsonPrimitive()) {
                resolveTag(obj.get("tag").getAsString(), out);
            }
            String idField = obj.has("id") ? "id" : obj.has("item") ? "item" : null;
            if (idField != null && obj.get(idField).isJsonPrimitive()) {
                resolveId(obj.get(idField).getAsString(), out);
            }

            for (Map.Entry<String, JsonElement> entry : obj.entrySet()) {
                walk(entry.getValue(), out);
            }
        } else if (element.isJsonArray()) {
            for (JsonElement el : element.getAsJsonArray()) {
                walk(el, out);
            }
        }
    }

    private static void resolveTag(String rawTag, Set<Item> out) {
        try {
            ResourceLocation loc = ResourceLocation.parse(rawTag);
            TagKey<Item> tagKey = TagKey.create(Registries.ITEM, loc);
            BuiltInRegistries.ITEM.getTag(tagKey).ifPresent(named -> named.forEach(holder -> out.add(holder.value())));
        } catch (Exception ignored) {}
    }

    private static void resolveId(String rawId, Set<Item> out) {
        try {
            ResourceLocation loc = ResourceLocation.parse(rawId);
            Item item = BuiltInRegistries.ITEM.get(loc);
            if (item != net.minecraft.world.item.Items.AIR) out.add(item);
        } catch (Exception ignored) {}
    }
}