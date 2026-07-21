package net.radzratz.eternalores.util.models;

import com.mojang.math.Transformation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.block.model.*;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.client.resources.model.ModelState;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.client.ChunkRenderTypeSet;
import net.neoforged.neoforge.client.extensions.IBakedModelExtension;
import net.neoforged.neoforge.client.model.data.ModelData;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3f;

import java.util.ArrayList;
import java.util.List;

public class EOBakedModels implements BakedModel, IBakedModelExtension {
    private static final FaceBakery FACE_BAKERY = new FaceBakery();

    private static final Vector3f FROM = new Vector3f(0f, 0f, 0f);
    private static final Vector3f TO = new Vector3f(16f, 16f, 16f);
    private static final BlockFaceUV UV = new BlockFaceUV(new float[]{0f, 0f, 16f, 16f}, 0);

    private final @Nullable BakedModel model;
    private final @Nullable TextureAtlasSprite overlay;
    private final ItemTransforms transforms;
    private final ChunkRenderTypeSet renderTypes;
    private final List<BakedQuad>[] overlayQuads;

    @SuppressWarnings("unchecked")
    public EOBakedModels(@Nullable BakedModel model, @Nullable TextureAtlasSprite overlay, ItemTransforms transforms, ChunkRenderTypeSet renderTypes) {
        this.model = model;
        this.overlay = overlay;
        this.transforms = transforms;
        this.renderTypes = renderTypes;
        this.overlayQuads = new List[6];
        for (Direction dir : Direction.values()) {
            List<BakedQuad> list = new ArrayList<>(1);
            if (overlay != null) list.add(bakeOverlayFace(dir, overlay));
            overlayQuads[dir.ordinal()] = list;
        }
    }

    private static BakedQuad bakeOverlayFace(Direction dir, TextureAtlasSprite sprite) {
        BlockElementFace face = new BlockElementFace(dir, -1, sprite.contents().name().toString(), UV);
        return FACE_BAKERY.bakeQuad(FROM, TO, face, sprite, dir, modelIdentity(), null, true);
    }

    @SuppressWarnings("all")
    private static ModelState modelIdentity() {
        return new ModelState() {
            @Override public Transformation getRotation() {
                return Transformation.identity();
            }

            @Override
            public boolean isUvLocked() {
                return false;
            }
        };
    }

    @SuppressWarnings("deprecation")
    @Override
    public List<BakedQuad> getQuads(@Nullable BlockState state, @Nullable Direction side, RandomSource rand) {
        List<BakedQuad> parentQuads = model != null ? model.getQuads(state, side, rand) : List.of();
        if (overlay == null || side == null) {
            return parentQuads;
        }
        // merge real model quads with the pre-baked overlay quad for this face
        List<BakedQuad> result = new ArrayList<>(parentQuads.size() + 1);
        result.addAll(parentQuads);
        result.addAll(overlayQuads[side.ordinal()]);
        return result;
    }

    @Override
    public ChunkRenderTypeSet getRenderTypes(@Nullable BlockState state, RandomSource rand, ModelData data) {
        for (RenderType rt : renderTypes) {
            if (rt == RenderType.translucent()
                    || rt == RenderType.cutout()
                    || rt == RenderType.cutoutMipped()) {
                return renderTypes;
            }
        }
        return ChunkRenderTypeSet.of(RenderType.cutout());
    }

    @Override
    public List<RenderType> getRenderTypes(ItemStack stack, boolean fabulous) {
        if (model != null) {
            return model.getRenderTypes(stack, fabulous);
        }
        return List.of(RenderType.cutout());
    }

    @Override
    public boolean useAmbientOcclusion() {
        return model == null || model.useAmbientOcclusion();
    }

    @Override
    public boolean isGui3d() {
        return model == null || model.isGui3d();
    }

    @Override
    public boolean usesBlockLight() {
        return model == null || model.usesBlockLight();
    }

    @Override
    public boolean isCustomRenderer() {
        return model != null && model.isCustomRenderer();
    }

    @Override
    public TextureAtlasSprite getParticleIcon() {
        return model != null ? model.getParticleIcon() : overlay;
    }

    @Override
    public ItemOverrides getOverrides() {
        return model != null ? model.getOverrides() : ItemOverrides.EMPTY;
    }

    @Override
    public ItemTransforms getTransforms() {
        return transforms;
    }
}