package net.radzratz.eternalores.util.recipes.duplicate_handler;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class EORawMaterialExtractor {
    private static final Pattern OUTPUT_KEY = Pattern.compile("(?i)result|results|output|outputs|secondaries|byproduct");

    private static final Set<String> EXCLUDED_KEYS = Set.of("slag");

    public record Extracted(Set<Item> items, Set<Fluid> fluids) {
        public boolean isEmpty() {
            return items.isEmpty() && fluids.isEmpty();
        }
    }

    public static Extracted extractInputs(JsonObject root) {
        return extractAll(root, false);
    }

    public static Extracted extractOutputs(JsonObject root) {
        return extractAll(root, true);
    }

    private static Extracted extractAll(JsonObject root, boolean wantOutput) {
        Set<Item> items = new HashSet<>();
        Set<Fluid> fluids = new HashSet<>();
        for (Map.Entry<String, JsonElement> entry : root.entrySet()) {
            if (isConditionsKey(entry.getKey()) || EXCLUDED_KEYS.contains(entry.getKey())) continue;
            boolean isOutputField = OUTPUT_KEY.matcher(entry.getKey()).find();
            if (isOutputField == wantOutput) {
                walk(entry.getValue(), items, fluids);
            }
        }
        return new Extracted(items, fluids);
    }

    private static void walk(JsonElement element, Set<Item> items, Set<Fluid> fluids) {
        if (element == null || element.isJsonNull()) return;

        if (element.isJsonObject()) {
            JsonObject obj = element.getAsJsonObject();

            boolean isFluidObject = obj.has("fluid") || obj.has("fluid_tag") || obj.has("amount");

            if (isFluidObject) {
                if (obj.has("fluid") && obj.get("fluid").isJsonPrimitive()) {
                    resolveFluidId(obj.get("fluid").getAsString(), fluids);
                }
                if (obj.has("fluid_tag") && obj.get("fluid_tag").isJsonPrimitive()) {
                    resolveFluidTag(obj.get("fluid_tag").getAsString(), fluids);
                } else if (!obj.has("fluid") && obj.has("tag") && obj.get("tag").isJsonPrimitive()) {
                    resolveFluidTag(obj.get("tag").getAsString(), fluids);
                }
                if (!obj.has("fluid") && obj.has("id") && obj.get("id").isJsonPrimitive()) {
                    resolveFluidId(obj.get("id").getAsString(), fluids);
                }
            } else {
                if (obj.has("tag") && obj.get("tag").isJsonPrimitive()) {
                    resolveItemTag(obj.get("tag").getAsString(), items);
                }
                String idField = obj.has("id") ? "id" : obj.has("item") ? "item" : null;
                if (idField != null && obj.get(idField).isJsonPrimitive()) {
                    resolveItemId(obj.get(idField).getAsString(), items);
                }
            }

            for (Map.Entry<String, JsonElement> entry : obj.entrySet()) {
                if (isConditionsKey(entry.getKey()) || EXCLUDED_KEYS.contains(entry.getKey())) continue;
                walk(entry.getValue(), items, fluids);
            }
        } else if (element.isJsonArray()) {
            for (JsonElement el : element.getAsJsonArray()) {
                walk(el, items, fluids);
            }
        }
    }

    private static boolean isConditionsKey(String key) {
        // apparently conditions were being detected, and made them logs throw a lot of noise
        // so we def make sure to not read these LMAO
        return key.equals("conditions") || key.endsWith(":conditions");
    }

    private static void resolveItemTag(String rawTag, Set<Item> out) {
        try {
            ResourceLocation loc = ResourceLocation.parse(rawTag);
            TagKey<Item> tagKey = TagKey.create(Registries.ITEM, loc);
            BuiltInRegistries.ITEM.getTag(tagKey).ifPresent(named -> named.forEach(holder -> out.add(holder.value())));
        } catch (Exception ignored) {}
    }

    private static void resolveItemId(String rawId, Set<Item> out) {
        try {
            ResourceLocation loc = ResourceLocation.parse(rawId);
            Item item = BuiltInRegistries.ITEM.get(loc);
            if (item != Items.AIR) out.add(item);
        } catch (Exception ignored) {}
    }

    private static void resolveFluidTag(String rawTag, Set<Fluid> out) {
        try {
            ResourceLocation loc = ResourceLocation.parse(rawTag);
            TagKey<Fluid> tagKey = TagKey.create(Registries.FLUID, loc);
            BuiltInRegistries.FLUID.getTag(tagKey).ifPresent(named -> named.forEach(holder -> out.add(holder.value())));
        } catch (Exception ignored) {}
    }

    private static void resolveFluidId(String rawId, Set<Fluid> out) {
        try {
            ResourceLocation loc = ResourceLocation.parse(rawId);
            Fluid fluid = BuiltInRegistries.FLUID.get(loc);
            if (fluid != Fluids.EMPTY) out.add(fluid);
        } catch (Exception ignored) {}
    }
}