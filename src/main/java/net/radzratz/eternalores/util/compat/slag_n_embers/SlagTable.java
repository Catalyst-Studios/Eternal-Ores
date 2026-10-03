package net.radzratz.eternalores.util.compat.slag_n_embers;

import dev.lopyluna.slag.register.AllDataComponents;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static net.radzratz.eternalores.util.EOUtils.*;

public final class SlagTable {
    private static final Map<TagKey<Item>, List<Item>> BY_CAST_TYPE = new HashMap<>();

    public static Item.Properties withDefaultCastType(Item.Properties properties, TagKey<Item> castTag) {
        if (!slag_n_embers_mod) return properties;
        return properties.component(AllDataComponents.CAST_TYPE.get(), castTag);
    }

    public static void register(TagKey<Item> castType, Item mold) {
        BY_CAST_TYPE.computeIfAbsent(castType, k -> new ArrayList<>()).add(mold);
    }

    public static List<Item> getMoldsFor(TagKey<Item> castType) {
        return BY_CAST_TYPE.getOrDefault(castType, List.of());
    }
}