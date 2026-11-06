package net.radzratz.eternalores.util.models;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.neoforged.fml.ModList;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforgespi.language.IModFileInfo;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.block.EOCompressedBlockRegistry;
import net.radzratz.eternalores.block.types.EOCompressedBlock;
import net.radzratz.eternalores.fluids.type.EOFluidBucketItem;
import net.radzratz.eternalores.fluids.type.EOFluidType;
import net.radzratz.eternalores.util.compat.geore.GeOreCompatRegistry;
import net.radzratz.eternalores.util.compat.iron_furnaces.IronFurnacesCompatRegistry;
import net.radzratz.eternalores.util.config.util.EOCompressedBlockEntry;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

import static net.radzratz.eternalores.util.EOUtils.*;

public class EOVirtualModels {
    private static final String NS = EternalOres.id;

    private static final String[] ITEM_DIRS = {
            "", "hammers/", "ingots/", "rods/", "nuggets/", "gems/", "gears/", "raw_materials/", "gem_cutters/", "misc/", "dusts/", "plates/",
            "dirty_dusts/", "clumps/", "shards/", "crystals/", "small_clumps/", "small_dusts/", "ore_gem/", "coals/", "enriched/", "blends/",
            "foils/", "wire_cutters/", "gem_shards/", "geoshards/", "upgrades/", "pebbles/", "pellets/"
    };

    private static final String[] BLOCK_DIRS = {
            "", "metal/", "gem/", "compressed/", "ore_stone/", "ore_deepslate/", "ore_nether/", "ore_end/", "ore_sand/", "raw_ore_block/",
            "dust_block/", "misc/", "coal_block/", "blast_furnace/", "smoker/", "furnace/", "crystal/", "budding/", "enriched_block/"
    };

    private static final String[] BUD_DIRS = {"buds/", "crystal/", "budding/", ""};

    private static Set<String> textures = Set.of();

    public static void addAll(Map<ResourceLocation, String> out) {
        textures = scanTextures();
        int compressed = addCompressed(out);
        int items = addItems(out);
        int blocks = addBlocks(out);

        EternalOres.LOG.info("[EOVirtualModels] {} compressed blocks, {} item models, {} blocks (model + blockstate), {} textures scanned.",
                compressed, items, blocks, textures.size());
    }

    private static int addItems(Map<ResourceLocation, String> out) {
        int[] n = {0};
        Stream.of(allItemEntries(),
                        georeMod ? GeOreCompatRegistry.allGeOreItemEntries() :
                                Stream.<DeferredHolder<Item, ? extends Item>>empty(),
                        ironFurnaceMod ? IronFurnacesCompatRegistry.allIronFurnacesItemEntries() :
                                Stream.<DeferredHolder<Item, ? extends Item>>empty())
                .flatMap(s -> s)
                .filter(DeferredHolder::isBound)
                .forEach(h -> {
                    if (item(out, h.get())) n[0]++;
                });
        return n[0];
    }

    private static int addBlocks(Map<ResourceLocation, String> out) {
        int[] n = {0};
        Stream.of(allBlockEntries(),
                        georeMod ? GeOreCompatRegistry.allGeOreBlockEntries() :
                                Stream.<DeferredHolder<Block, ? extends Block>>empty())
                .flatMap(s -> s)
                .filter(DeferredHolder::isBound)
                .forEach(h -> {
                    if (block(out, h.get())) n[0]++;
                });
        return n[0];
    }

    private static int addCompressed(Map<ResourceLocation, String> out) {
        JsonObject lang = new JsonObject();
        int[] n = {0};

        EOCompressedBlockRegistry.getAll().forEach((key, set) -> {
            EOCompressedBlockEntry entry = EOCompressedBlockRegistry.getEntry(key);
            if (entry == null) return;

            for (int lvl = 1; lvl <= 9; lvl++) {
                var holder = set.get(lvl);
                if (holder == null || !holder.isBound()) continue;

                String blockPath = "compressed_" + key + "_" + lvl + "x";

                put(out, "blockstates/", blockPath, simpleState(blockPath));
                put(out, "models/block/", blockPath, compressedBlockModel(entry, lvl));
                put(out, "models/item/", blockPath, blockItemModel(blockPath));
                lang.addProperty("block." + NS + "." + blockPath, compressedDisplayName(entry.blockId(), lvl));
                n[0]++;
            }
        });

        out.put(EO("lang/en_us.json"), lang.toString());
        return n[0];
    }

    private static JsonObject compressedBlockModel(EOCompressedBlockEntry entry, int level) {
        JsonObject root = new JsonObject();
        root.addProperty("parent", "minecraft:block/block");
        root.addProperty("loader", NS + ":compressed");
        root.addProperty("source_namespace", entry.namespace());
        root.addProperty("source_block_id", entry.blockId());
        root.addProperty("level", level);

        if (entry.modelOverride() != null) {
            root.addProperty("model_override", entry.modelOverride());
        }

        if (entry.layers() != null && !entry.layers().isEmpty()) {
            JsonArray layersArr = new JsonArray();
            for (var layer : entry.layers()) {
                JsonObject l = new JsonObject();
                l.addProperty("texture", layer.texture());
                l.addProperty("tint", layer.tint());
                layersArr.add(l);
            }
            root.add("layers", layersArr);
        }
        return root;
    }

    private static String compressedDisplayName(String blockId, int level) {
        String cleaned = blockId.replace("_block", "").replace("_", " ");
        StringBuilder sb = new StringBuilder();
        for (String w : cleaned.split(" ")) {
            if (w.isEmpty()) continue;
            sb.append(Character.toUpperCase(w.charAt(0))).append(w.substring(1)).append(" ");
        }
        return sb.toString().trim() + " " + level + "x";
    }

    private static boolean item(Map<ResourceLocation, String> out, Item item) {
        String id = BuiltInRegistries.ITEM.getKey(item).getPath();

        if (item instanceof EOFluidBucketItem bucket) {
            ResourceLocation fluid = BuiltInRegistries.FLUID.getKey(bucket.getFluid());
            JsonObject o = new JsonObject();
            o.addProperty("parent", "neoforge:item/bucket_drip");
            o.addProperty("fluid", fluid.toString());
            o.addProperty("loader", "neoforge:fluid_container");
            put(out, "models/item/", id, o);
            return true;
        }

        if (item instanceof BlockItem bi) {
            Block b = bi.getBlock();
            if (b instanceof EOCompressedBlock || b instanceof LiquidBlock) {
                return false;
            }
            if (b instanceof AmethystClusterBlock) {
                put(out, "models/item/", id, generated("item/generated", budTexture(id)));
                return true;
            }
            put(out, "models/item/", id, blockItemModel(id));
            return true;
        }

        put(out, "models/item/", id, basicItem(id));
        return true;
    }

    private static JsonObject basicItem(String id) {
        for (String dir : ITEM_DIRS) {
            String path = "item/" + dir + id;
            if (textures.contains(path)) {
                boolean handheld = path.contains("rods/") ||
                        path.contains("hammers/") ||
                        path.contains("gem_cutters") ||
                        path.contains("finder");
                return generated(handheld ? "item/handheld" : "item/generated", NS + ":" + path);
            }
        }
        return generated("item/generated", NS + ":item/" + id);
    }

    private static JsonObject generated(String parent, String layer0) {
        JsonObject o = new JsonObject();
        o.addProperty("parent", "minecraft:" + parent);
        JsonObject t = new JsonObject();
        t.addProperty("layer0", layer0);
        o.add("textures", t);
        return o;
    }

    private static boolean block(Map<ResourceLocation, String> out, Block block) {
        String id = BuiltInRegistries.BLOCK.getKey(block).getPath();

        switch (block) {
            case EOCompressedBlock ignoredCompressedBlock -> {
                return false;
            }
            case AmethystClusterBlock ignoredAmethystCluster -> {
                JsonObject m = new JsonObject();
                m.addProperty("parent", "minecraft:block/cross");
                m.addProperty("render_type", "minecraft:cutout");
                JsonObject t = new JsonObject();
                t.addProperty("cross", budTexture(id));
                m.add("textures", t);
                put(out, "models/block/", id, m);
                put(out, "blockstates/", id, budState(id));
                return true;
            }
            case LiquidBlock liquid -> {
                if (liquid.defaultBlockState().getFluidState().getType().getFluidType() instanceof EOFluidType type) {
                    String still = type.getStillTexture().toString();
                    JsonObject m = new JsonObject();
                    m.addProperty("parent", "minecraft:block/cube_all");
                    JsonObject t = new JsonObject();
                    t.addProperty("all", still);
                    t.addProperty("particle", still);
                    m.add("textures", t);
                    put(out, "models/block/", id, m);
                    put(out, "blockstates/", id, simpleState(id));
                    return true;
                }
                return false;
            }
            default -> {}
        }

        JsonObject m = new JsonObject();
        m.addProperty("parent", "minecraft:block/cube_all");
        JsonObject t = new JsonObject();
        t.addProperty("all", NS + ":" + blockTexturePath(id));
        m.add("textures", t);
        put(out, "models/block/", id, m);
        put(out, "blockstates/", id, simpleState(id));
        return true;
    }

    private static String blockTexturePath(String id) {
        for (String dir : BLOCK_DIRS) {
            String path = "block/" + dir + id;
            if (textures.contains(path)) {
                return path;
            }
        }
        return "block/" + id;
    }

    private static String budTexture(String id) {
        for (String dir : BUD_DIRS) {
            if (textures.contains("block/" + dir + id)) {
                return NS + ":block/" + dir + id;
            }
        }
        return NS + ":block/" + id;
    }

    private static JsonObject simpleState(String id) {
        JsonObject variants = new JsonObject();
        variants.add("", variant(NS + ":block/" + id, 0, 0));
        JsonObject root = new JsonObject();
        root.add("variants", variants);
        return root;
    }

    private static JsonObject blockItemModel(String id) {
        JsonObject o = new JsonObject();
        o.addProperty("parent", NS + ":block/" + id);
        return o;
    }

    private static JsonObject budState(String id) {
        String model = NS + ":block/" + id;
        JsonObject variants = new JsonObject();
        variants.add("facing=up", variant(model, 0, 0));
        variants.add("facing=down", variant(model, 180, 0));
        variants.add("facing=north", variant(model, 90, 0));
        variants.add("facing=south", variant(model, 90, 180));
        variants.add("facing=east", variant(model, 90, 90));
        variants.add("facing=west", variant(model, 90, 270));
        JsonObject root = new JsonObject();
        root.add("variants", variants);
        return root;
    }

    private static JsonObject variant(String model, int x, int y) {
        JsonObject v = new JsonObject();
        v.addProperty("model", model);
        if (x != 0) v.addProperty("x", x);
        if (y != 0) v.addProperty("y", y);
        return v;
    }

    private static void put(Map<ResourceLocation, String> out, String folder, String id, JsonObject json) {
        out.put(EO(folder + id + ".json"), json.toString());
    }

    private static Set<String> scanTextures() {
        Set<String> found = new HashSet<>();
        IModFileInfo info = ModList.get().getModFileById(NS);
        if (info == null) {
            EternalOres.LOG.error("[EOVirtualModels] Mod file '{}' not found; models will use fallback paths.", NS);
            return found;
        }
        Path root = info.getFile().findResource("assets", NS, "textures");
        try (Stream<Path> walk = Files.walk(root)) {
            walk.filter(p -> p.toString().endsWith(".png")).forEach(p -> {
                String rel = root.relativize(p).toString().replace('\\', '/');
                found.add(rel.substring(0, rel.length() - 4));
            });
        } catch (IOException | RuntimeException e) {
            EternalOres.LOG.error("[EOVirtualModels] Could not scan textures: {}", e.toString());
        }
        return found;
    }
}