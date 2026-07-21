package net.radzratz.eternalores.util.data;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.SharedConstants;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.AbstractPackResources;
import net.minecraft.server.packs.PackLocationInfo;
import net.minecraft.server.packs.PackResources;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.metadata.MetadataSectionSerializer;
import net.minecraft.server.packs.metadata.pack.PackMetadataSection;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraft.server.packs.resources.IoSupplier;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.block.EOCompressedBlockRegistry;
import net.radzratz.eternalores.block.types.enums.EOBlockTier;
import net.radzratz.eternalores.util.config.util.EOCompressedBlockEntry;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.Nullable;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.*;

import static net.radzratz.eternalores.util.EOUtils.*;

public class EODataPack extends AbstractPackResources {
    private final Map<ResourceLocation, String> resources = new LinkedHashMap<>();

    public EODataPack() {
        super(new PackLocationInfo(
                "eternalores:data_virtual",
                Component.literal("EternalOres Data Virtual Pack"),
                PackSource.BUILT_IN,
                Optional.empty()
        ));
        build();
    }

    @SuppressWarnings("all")
    public static Pack.ResourcesSupplier packResources() {
        EODataPack pack = new EODataPack();

        return new Pack.ResourcesSupplier() {
            @Override
            public PackResources openPrimary(PackLocationInfo info) {
                return pack;
            }

            @Override
            public PackResources openFull(PackLocationInfo info, Pack.Metadata metadata) {
                return pack;
            }
        };
    }

    private void build() {
        Map<ResourceLocation, List<ResourceLocation>> blockTagEntries = new LinkedHashMap<>();
        Map<ResourceLocation, List<ResourceLocation>> itemTagEntries = new LinkedHashMap<>();

        ResourceLocation pickaxeTag = ResourceLocation.withDefaultNamespace("tags/block/mineable/pickaxe.json");
        blockTagEntries.put(pickaxeTag, new ArrayList<>());

        ResourceLocation cBlockTag = C("tags/block/compressed_blocks.json");
        ResourceLocation cItemTag = C("tags/item/compressed_blocks.json");
        blockTagEntries.put(cBlockTag, new ArrayList<>());
        itemTagEntries.put(cItemTag, new ArrayList<>());

        int recipeCount = 0;

        for (var entrySet : EOCompressedBlockRegistry.getAll().entrySet()) {
            String key = entrySet.getKey();
            var set = entrySet.getValue();
            EOCompressedBlockEntry entry = EOCompressedBlockRegistry.getEntry(key);
            if (entry == null) continue;

            EOBlockTier tier = EOBlockTier.T_STONE;

            ResourceLocation origLoc = ResourceLocation.fromNamespaceAndPath(entry.namespace(), entry.blockId());
            Item originalItem = BuiltInRegistries.ITEM.get(origLoc);

            Item previousItem = originalItem != Items.AIR ? originalItem : null;
            ResourceLocation previousLoc = originalItem != Items.AIR ? origLoc : null;

            ResourceLocation cBlockPerMat = C("tags/block/compressed_blocks/" + key + ".json");
            ResourceLocation cItemPerMat = C("tags/item/compressed_blocks/" + key + ".json");
            blockTagEntries.put(cBlockPerMat, new ArrayList<>());
            itemTagEntries.put(cItemPerMat, new ArrayList<>());

            for (int lvl = 1; lvl <= 9; lvl++) {
                var holder = set.get(lvl);
                if (holder == null || !holder.isBound()) continue;

                ResourceLocation blockId = EO("compressed_" + key + "_" + lvl + "x");
                Item currentItem = holder.get().asItem();

                blockTagEntries.get(pickaxeTag).add(blockId);
                blockTagEntries.get(cBlockTag).add(blockId);
                itemTagEntries.get(cItemTag).add(blockId);

                ResourceLocation tierTagPath = tierTagPath(tier);
                blockTagEntries.computeIfAbsent(tierTagPath, k -> new ArrayList<>()).add(blockId);

                blockTagEntries.get(cBlockPerMat).add(blockId);
                itemTagEntries.get(cItemPerMat).add(blockId);

                if (previousItem != null) {
                    ResourceLocation compressLoc = EO("recipe/compressed/" + key + "_compress_" + lvl + "x.json");
                    resources.put(compressLoc, buildShapedRecipe(previousItem, blockId));
                    recipeCount++;

                    ResourceLocation decompressLoc = EO("recipe/compressed/" + key + "_decompress_" + lvl + "x.json");
                    resources.put(decompressLoc, buildShapelessRecipe(currentItem, previousLoc));
                    recipeCount++;
                }

                previousItem = currentItem;
                previousLoc = blockId;
            }
        }

        blockTagEntries.forEach((tagPath, blocks) -> {
            if (!blocks.isEmpty()) resources.put(tagPath, buildTagJson(blocks));
        });
        itemTagEntries.forEach((tagPath, items) -> {
            if (!items.isEmpty()) resources.put(tagPath, buildTagJson(items));
        });

        EternalOres.LOG.info("[EODataPack] Generated {} recipes, {} block tags, {} item tags ({} total resources).",
                recipeCount, blockTagEntries.size(), itemTagEntries.size(), resources.size());
    }

    private ResourceLocation tierTagPath(EOBlockTier tier) {
        return switch (tier) {
            case T_WOOD -> NEO("tags/block/needs_wood_tool.json");
            case T_STONE -> MC("tags/block/needs_stone_tool.json");
            case T_IRON -> MC("tags/block/needs_iron_tool.json");
            case T_DIAMOND -> MC("tags/block/needs_diamond_tool.json");
            case T_NETHERITE -> NEO("tags/block/needs_netherite_tool.json");
        };
    }

    private String buildTagJson(List<ResourceLocation> values) {
        JsonObject root = new JsonObject();
        root.addProperty("replace", false);
        JsonArray arr = new JsonArray();
        for (ResourceLocation loc : values) arr.add(loc.toString());
        root.add("values", arr);
        return root.toString();
    }

    private String buildShapedRecipe(Item ingredient, ResourceLocation resultLoc) {
        JsonObject root = new JsonObject();
        root.addProperty("type", "minecraft:crafting_shaped");
        root.addProperty("category", "misc");
        JsonArray pattern = new JsonArray();
        pattern.add("XXX");
        pattern.add("XXX");
        pattern.add("XXX");
        root.add("pattern", pattern);

        JsonObject key = new JsonObject();
        JsonObject xDef = new JsonObject();
        xDef.addProperty("item", BuiltInRegistries.ITEM.getKey(ingredient).toString());
        key.add("X", xDef);
        root.add("key", key);

        JsonObject result = new JsonObject();
        result.addProperty("id", resultLoc.toString());
        result.addProperty("count", 1);
        root.add("result", result);

        return root.toString();
    }

    private String buildShapelessRecipe(Item ingredient, ResourceLocation resultLoc) {
        JsonObject root = new JsonObject();
        root.addProperty("type", "minecraft:crafting_shapeless");
        root.addProperty("category", "misc");

        JsonArray ingredients = new JsonArray();
        JsonObject ingredientObj = new JsonObject();
        ingredientObj.addProperty("item", BuiltInRegistries.ITEM.getKey(ingredient).toString());
        ingredients.add(ingredientObj);
        root.add("ingredients", ingredients);

        JsonObject result = new JsonObject();
        result.addProperty("id", resultLoc.toString());
        result.addProperty("count", 9);
        root.add("result", result);

        return root.toString();
    }

    @SuppressWarnings("all")
    @Override
    public @Nullable IoSupplier<InputStream> getRootResource(String... paths) {
        return null;
    }

    @SuppressWarnings("all")
    @Override
    public @Nullable IoSupplier<InputStream> getResource(PackType type, ResourceLocation location) {
        if (type != PackType.SERVER_DATA) return null;
        String json = resources.get(location);
        if (json == null) return null;
        byte[] bytes = json.getBytes(StandardCharsets.UTF_8);
        return () -> new ByteArrayInputStream(bytes);
    }

    @SuppressWarnings("all")
    @Override
    public void listResources(PackType type, String namespace, String prefix, ResourceOutput output) {
        if (type != PackType.SERVER_DATA) return;
        resources.forEach((loc, json) -> {
            if (loc.getNamespace().equals(namespace) && loc.getPath().startsWith(prefix)) {
                byte[] bytes = json.getBytes(StandardCharsets.UTF_8);
                output.accept(loc, () -> new ByteArrayInputStream(bytes));
            }
        });
    }

    @SuppressWarnings("all")
    @Override
    public Set<String> getNamespaces(PackType type) {
        if (type != PackType.SERVER_DATA) return Set.of();
        return Set.of("minecraft", "neoforge", "c", EternalOres.id);
    }

    @SuppressWarnings("unchecked")
    @Override
    public @Nullable <T> T getMetadataSection(MetadataSectionSerializer<T> serializer) {
        if (serializer == PackMetadataSection.TYPE) {
            return (T) new PackMetadataSection(
                    Component.literal("EternalOres Virtual Pack"),
                    SharedConstants.getCurrentVersion().getPackVersion(PackType.SERVER_DATA),
                    Optional.empty()
            );
        }
        return null;
    }

    @SuppressWarnings("all")
    @Override
    public String packId() {
        return "eternalores:data_virtual";
    }

    @Override
    public void close() {}
}