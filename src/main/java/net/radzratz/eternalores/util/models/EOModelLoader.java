package net.radzratz.eternalores.util.models;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.block.model.BlockModel;
import net.minecraft.client.renderer.block.model.ItemOverrides;
import net.minecraft.client.renderer.block.model.ItemTransforms;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.model.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.client.ChunkRenderTypeSet;
import net.neoforged.neoforge.client.model.data.ModelData;
import net.neoforged.neoforge.client.model.geometry.IGeometryBakingContext;
import net.neoforged.neoforge.client.model.geometry.IGeometryLoader;
import net.neoforged.neoforge.client.model.geometry.IUnbakedGeometry;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.Reader;
import java.io.StringReader;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

import static net.radzratz.eternalores.util.EOUtils.EO;
import static net.radzratz.eternalores.util.EOUtils.MC;

public class EOModelLoader implements IGeometryLoader<EOModelLoader.EOGeometry> {
    public static final EOModelLoader INSTANCE = new EOModelLoader();

    private static final String[] CUBE_FACES = {"down", "up", "north", "south", "east", "west"};

    public record LayerData(String texture, boolean tint) {}

    @Override
    public @NotNull EOModelLoader.EOGeometry read(JsonObject json, @NotNull JsonDeserializationContext ctx) {
        String sourceNamespace = json.get("source_namespace").getAsString();
        String sourceBlockId = json.get("source_block_id").getAsString();
        int level = json.get("level").getAsInt();
        String modelOverride = json.has("model_override") ? json.get("model_override").getAsString() : null;

        List<LayerData> layers = null;
        if (json.has("layers")) {
            layers = new ArrayList<>();
            for (var el : json.getAsJsonArray("layers")) {
                JsonObject lo = el.getAsJsonObject();
                layers.add(new LayerData(lo.get("texture").getAsString(), lo.get("tint").getAsBoolean()));
            }
        }

        return new EOGeometry(sourceNamespace, sourceBlockId, level, modelOverride, layers);
    }

    public static class EOGeometry implements IUnbakedGeometry<EOGeometry> {
        private final String sourceNamespace;
        private final String sourceBlockId;
        private final int level;
        private final @Nullable String modelOverride;
        private final @Nullable List<LayerData> layers;

        private static final Map<ResourceLocation, Optional<String>> CUSTOM_LOADER_TEXTURE_CACHE = new ConcurrentHashMap<>();
        private static final Map<ResourceLocation, ChunkRenderTypeSet> RENDER_TYPE_CACHE = new ConcurrentHashMap<>();
        private static final Material[] OVERLAY_MATERIALS = new Material[10];
        private static volatile ItemTransforms CACHED_CUBE_TRANSFORMS = null;

        private record ParentBakeResult(@Nullable BakedModel model, boolean isSynthetic) {}

        public EOGeometry(String sourceNamespace, String sourceBlockId, int level, @Nullable String modelOverride, @Nullable List<LayerData> layers) {
            this.sourceNamespace = sourceNamespace;
            this.sourceBlockId = sourceBlockId;
            this.level = level;
            this.modelOverride = modelOverride;
            this.layers = layers;
        }

        public static void clearCaches() {
            CUSTOM_LOADER_TEXTURE_CACHE.clear();
            RENDER_TYPE_CACHE.clear();
            Arrays.fill(OVERLAY_MATERIALS, null);
            CACHED_CUBE_TRANSFORMS = null;
        }

        @Override
        public @NotNull BakedModel bake(@NotNull IGeometryBakingContext context, @NotNull ModelBaker baker, @NotNull Function<Material, TextureAtlasSprite> spriteGetter, @NotNull ModelState modelState, @NotNull ItemOverrides overrides) {
            ParentBakeResult parent = bakeParentModel(baker, spriteGetter, modelState);

            ItemTransforms transforms = resolveTransforms(parent, baker, spriteGetter, modelState);
            ChunkRenderTypeSet originalRenderTypes = resolveOriginalRenderTypes(parent, baker, spriteGetter, modelState);
            TextureAtlasSprite overlaySprite = resolveOverlaySprite(spriteGetter);

            return new EOBakedModels(parent.model(), overlaySprite, transforms, originalRenderTypes);
        }

        private ParentBakeResult bakeParentModel(ModelBaker baker, Function<Material, TextureAtlasSprite> spriteGetter, ModelState modelState) {
            if (layers != null && !layers.isEmpty()) {
                return new ParentBakeResult(bakeLayeredCube(layers, baker, spriteGetter, modelState), true);
            }

            String modelNamespace = sourceNamespace;
            String modelPath = sourceBlockId;
            if (modelOverride != null) {
                int idx = modelOverride.indexOf(':');
                if (idx == -1) modelPath = modelOverride;
                else { modelNamespace = modelOverride.substring(0, idx); modelPath = modelOverride.substring(idx + 1); }
            }

            String fallbackTexture = tryExtractStaticTextureFromCustomLoader(modelNamespace, modelPath);
            if (fallbackTexture != null) {
                return new ParentBakeResult(
                        bakeLayeredCube(List.of(new LayerData(fallbackTexture, false)), baker, spriteGetter, modelState),
                        true
                );
            }

            ResourceLocation parentModelLoc = ResourceLocation.fromNamespaceAndPath(modelNamespace, "block/" + modelPath);
            return new ParentBakeResult(baker.bake(parentModelLoc, modelState, spriteGetter), false);
        }

        @Nullable
        private String tryExtractStaticTextureFromCustomLoader(String namespace, String path) {
            ResourceLocation key = ResourceLocation.fromNamespaceAndPath(namespace, "models/block/" + path + ".json");
            return CUSTOM_LOADER_TEXTURE_CACHE.computeIfAbsent(key, loc -> {
                try {
                    var resource = Minecraft.getInstance().getResourceManager().getResource(loc);
                    if (resource.isEmpty()) return Optional.empty();
                    try (var reader = resource.get().openAsReader()) {
                        JsonObject json = JsonParser.parseReader(reader).getAsJsonObject();
                        if (!json.has("loader")) return Optional.empty(); // not a custom loader, nothing to extract
                        JsonObject textures = json.getAsJsonObject("textures");
                        if (textures == null) return Optional.empty();
                        for (String key2 : List.of("texture_single", "texture_connected", "particle")) {
                            if (textures.has(key2)) return Optional.of(textures.get(key2).getAsString());
                        }
                        return Optional.empty();
                    }
                } catch (Exception e) {
                    return Optional.empty();
                }
            }).orElse(null);
        }

        @SuppressWarnings("deprecation")
        private ItemTransforms resolveTransforms(ParentBakeResult parent, ModelBaker baker, Function<Material, TextureAtlasSprite> spriteGetter, ModelState modelState) {
            if (!parent.isSynthetic() && parent.model() != null) {
                return parent.model().getTransforms();
            }
            if (CACHED_CUBE_TRANSFORMS == null) {
                BakedModel cube = baker.bake(MC("block/cube_all"), modelState, spriteGetter);
                CACHED_CUBE_TRANSFORMS = cube != null ? cube.getTransforms() : ItemTransforms.NO_TRANSFORMS;
            }
            return CACHED_CUBE_TRANSFORMS;
        }

        private ChunkRenderTypeSet resolveOriginalRenderTypes(ParentBakeResult parent, ModelBaker baker, Function<Material, TextureAtlasSprite> spriteGetter, ModelState modelState) {
            ResourceLocation origLoc = ResourceLocation.fromNamespaceAndPath(sourceNamespace, sourceBlockId);

            ChunkRenderTypeSet cached = RENDER_TYPE_CACHE.get(origLoc);
            if (cached != null) return cached;

            ChunkRenderTypeSet computed = computeOriginalRenderTypes(origLoc, parent, baker, spriteGetter, modelState);
            RENDER_TYPE_CACHE.put(origLoc, computed);
            return computed;
        }

        @SuppressWarnings("deprecation")
        private ChunkRenderTypeSet computeOriginalRenderTypes(ResourceLocation origLoc, ParentBakeResult parent, ModelBaker baker, Function<Material, TextureAtlasSprite> spriteGetter, ModelState modelState) {
            Block originalBlock = BuiltInRegistries.BLOCK.get(origLoc);
            if (originalBlock == Blocks.AIR) return ChunkRenderTypeSet.of(RenderType.solid());

            boolean noOcclusion = !originalBlock.defaultBlockState().canOcclude();

            BakedModel trueBaked = !parent.isSynthetic()
                    ? parent.model()
                    : baker.bake(ResourceLocation.fromNamespaceAndPath(origLoc.getNamespace(), "block/" + origLoc.getPath()), modelState, spriteGetter);

            if (trueBaked != null) {
                try {
                    ChunkRenderTypeSet queried = trueBaked.getRenderTypes(originalBlock.defaultBlockState(), RandomSource.create(42), ModelData.EMPTY);
                    boolean onlySolid = true;
                    for (RenderType rt : queried) {
                        if (rt != RenderType.solid()) { onlySolid = false; break; }
                    }
                    if (!(noOcclusion && onlySolid)) return queried;
                } catch (Exception ignored) {}
            }

            if (noOcclusion) return ChunkRenderTypeSet.of(RenderType.translucent());
            return ChunkRenderTypeSet.of(ItemBlockRenderTypes.getChunkRenderType(originalBlock.defaultBlockState()));
        }

        @SuppressWarnings("deprecation")
        private TextureAtlasSprite resolveOverlaySprite(Function<Material, TextureAtlasSprite> spriteGetter) {
            Material mat = OVERLAY_MATERIALS[level];
            if (mat == null) {
                mat = new Material(TextureAtlas.LOCATION_BLOCKS, EO("block/compressed/overlay_" + level + "x"));
                OVERLAY_MATERIALS[level] = mat;
            }
            return spriteGetter.apply(mat);
        }

        @SuppressWarnings("all")
        private static @Nullable BakedModel bakeLayeredCube(List<LayerData> layers, ModelBaker baker, Function<Material, TextureAtlasSprite> spriteGetter, ModelState modelState) {
            JsonObject root = new JsonObject();
            root.addProperty("parent", "minecraft:block/block");
            root.addProperty("ambientocclusion", false);

            JsonObject textures = new JsonObject();
            JsonArray elements = new JsonArray();

            for (int i = 0; i < layers.size(); i++) {
                String texKey = "layer" + i;
                textures.addProperty(texKey, layers.get(i).texture());
                elements.add(buildCubeElement(texKey, layers.get(i).tint()));
            }
            textures.addProperty("particle", layers.get(0).texture());

            root.add("textures", textures);
            root.add("elements", elements);

            return bakeFromJson(root, baker, spriteGetter, modelState);
        }

        private static JsonObject buildCubeElement(String texKey, boolean tint) {
            JsonObject el = new JsonObject();
            el.add("from", floatArray(0, 0, 0));
            el.add("to", floatArray(16, 16, 16));

            JsonObject faces = new JsonObject();
            for (String dir : CUBE_FACES) {
                JsonObject face = new JsonObject();
                face.addProperty("texture", "#" + texKey);
                face.addProperty("cullface", dir);
                if (tint) face.addProperty("tintindex", 0);
                faces.add(dir, face);
            }
            el.add("faces", faces);
            return el;
        }

        private static JsonArray floatArray(float... values) {
            JsonArray arr = new JsonArray();
            for (float v : values) arr.add(v);
            return arr;
        }

        private static @Nullable BakedModel bakeFromJson(JsonObject root, ModelBaker baker, Function<Material, TextureAtlasSprite> spriteGetter, ModelState modelState) {
            try (Reader r = new StringReader(root.toString())) {
                BlockModel parsed = BlockModel.fromStream(r);
                return baker.bakeUncached(parsed, modelState, spriteGetter);
            } catch (Exception e) {
                return null;
            }
        }

        @Override
        public void resolveParents(@NotNull Function<ResourceLocation, UnbakedModel> modelGetter, @NotNull IGeometryBakingContext context) {}
    }
}