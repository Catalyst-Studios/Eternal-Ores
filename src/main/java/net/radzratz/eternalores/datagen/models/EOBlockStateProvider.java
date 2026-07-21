package net.radzratz.eternalores.datagen.models;

import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.*;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.block.types.EOCompressedBlock;
import org.jetbrains.annotations.NotNull;


import static net.neoforged.neoforge.client.model.generators.ModelProvider.TEXTURE;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.EOUtils.allBlockEntries;
import static net.radzratz.eternalores.util.compat.geore.GEOreRegistry.allGeOreBlockEntries;

public class EOBlockStateProvider extends BlockStateProvider {
    private final ExistingFileHelper exFileHelper;

    public EOBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, EternalOres.id, exFileHelper);
        this.exFileHelper = exFileHelper;
    }

    @Override
    protected void registerStatesAndModels() {
        allBlockEntries()
                .map(entry -> (DeferredBlock<?>) entry)
                .forEach(this::itemBlock);

        if (georeMod) {
            allGeOreBlockEntries()
                    .map(entry -> (DeferredBlock<?>) entry)
                    .forEach(this::itemBlock);
        }
    }

    private void itemBlock(DeferredBlock<?> deferredBlock) {
        Block block = deferredBlock.get();
        ResourceLocation id = BuiltInRegistries.BLOCK.getKey(block);

        if (block instanceof EOCompressedBlock) return;

        if (block instanceof AmethystClusterBlock) {
            georeBudBlock(id, block);
        } else {
            simpleBlockWithItem(block, basicBlock(id));
        }
    }

    private void georeBudBlock(ResourceLocation id, Block block) {
        ResourceLocation texture = resolveTexture(id);

        BlockModelBuilder model = models()
                .getBuilder(id.toString())
                .parent(new ModelFile.UncheckedModelFile("minecraft:block/cross"))
                .renderType("minecraft:cutout")
                .texture("cross", texture);

        getVariantBuilder(block)
                .partialState()
                .with(AmethystClusterBlock.FACING, Direction.UP)
                .modelForState()
                .modelFile(model).addModel()
                .partialState()
                .with(AmethystClusterBlock.FACING, Direction.DOWN)
                .modelForState()
                .modelFile(model).rotationX(180).addModel()
                .partialState()
                .with(AmethystClusterBlock.FACING, Direction.NORTH)
                .modelForState()
                .modelFile(model).rotationX(90).addModel()
                .partialState()
                .with(AmethystClusterBlock.FACING, Direction.SOUTH)
                .modelForState()
                .modelFile(model).rotationX(90).rotationY(180).addModel()
                .partialState()
                .with(AmethystClusterBlock.FACING, Direction.EAST)
                .modelForState()
                .modelFile(model).rotationX(90).rotationY(90).addModel()
                .partialState()
                .with(AmethystClusterBlock.FACING, Direction.WEST)
                .modelForState()
                .modelFile(model).rotationX(90).rotationY(270).addModel();

        itemModels().getBuilder(id.getPath())
                .parent(new ModelFile.UncheckedModelFile("minecraft:item/generated"))
                .texture("layer0", texture);
    }

    private @NotNull BlockModelBuilder basicBlock(ResourceLocation block) {
        String name = block.getPath();
        String basePath = "block/";

        String[] possiblePaths = {
                basePath + name,
                basePath + "metal/" + name,
                basePath + "gem/" + name,
                basePath + "compressed/" + name,
                basePath + "ore_stone/" + name,
                basePath + "ore_deepslate/" + name,
                basePath + "ore_nether/" + name,
                basePath + "ore_end/" + name,
                basePath + "ore_sand/" + name,
                basePath + "raw_ore_block/" + name,
                basePath + "dust_block/" + name,
                basePath + "misc/" + name,
                basePath + "coal_block/" + name,
                basePath + "blast_furnace/" + name,
                basePath + "smoker/" + name,
                basePath + "furnace/" + name,
                basePath + "crystal/" + name,
                basePath + "budding/" + name
        };

        BlockModelBuilder builder = null;

        for (String path : possiblePaths) {
            ResourceLocation texture = ResourceLocation.fromNamespaceAndPath(block.getNamespace(), path);
            if (exFileHelper.exists(texture, TEXTURE)) {
                builder = this.models().getBuilder(block.toString())
                        .parent(new ModelFile.UncheckedModelFile("block/cube_all"))
                        .texture("all", texture);
                break;
            }
        }

        if (builder == null) {
            ResourceLocation fallback = ResourceLocation.fromNamespaceAndPath(block.getNamespace(), basePath + name);
            builder = this.models().getBuilder(block.toString())
                    .parent(new ModelFile.UncheckedModelFile("block/cube_all"))
                    .texture("all", fallback);
        }

        return builder;
    }

    private ResourceLocation resolveTexture(ResourceLocation id) {
        String name = id.getPath();
        String[] possiblePaths = {
                "block/buds/" + name,
                "block/crystal/" + name,
                "block/budding/" + name,
                "block/" + name
        };

        for (String path : possiblePaths) {
            ResourceLocation texture = ResourceLocation.fromNamespaceAndPath(id.getNamespace(), path);
            if (exFileHelper.exists(texture, PackType.CLIENT_RESOURCES, ".png", "textures")) {
                return texture;
            }
        }

        return ResourceLocation.fromNamespaceAndPath(id.getNamespace(), "block/" + name);
    }
}
