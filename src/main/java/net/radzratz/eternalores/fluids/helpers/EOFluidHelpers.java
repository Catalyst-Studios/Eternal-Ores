package net.radzratz.eternalores.fluids.helpers;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.radzratz.eternalores.fluids.type.EOFluidBucketItem;
import net.radzratz.eternalores.fluids.type.EOFluidType;
import net.radzratz.eternalores.fluids.type.EOHazardousLiquidBlocks;
import net.radzratz.eternalores.util.EOSetRegistries;
import org.jetbrains.annotations.Nullable;

import java.util.function.IntSupplier;

import static net.radzratz.eternalores.util.EOMaterials.materialRegistrar.getTint;
import static net.radzratz.eternalores.util.EOSetRegistries.*;

public class EOFluidHelpers {
    public static DeferredHolder<Fluid, BaseFlowingFluid.Source> rgtrFluid(String name, IntSupplier tint, boolean hazardous) {
        return rgtr(name, EOFluidType.FluidTypes.FLUID, tint, null, hazardous);
    }
    public static DeferredHolder<Fluid, BaseFlowingFluid.Source> rgtrFluid(String name, IntSupplier tint, String customTexture, boolean hazardous) {
        return rgtr(name, EOFluidType.FluidTypes.FLUID, tint, customTexture, hazardous);
    }

    // all molten types are hazardous for... obvious reasons
    public static DeferredHolder<Fluid, BaseFlowingFluid.Source> rgtrMolten(String name, IntSupplier tint) {
        return rgtr(name, EOFluidType.FluidTypes.MOLTEN, tint, null, true);
    }
    public static DeferredHolder<Fluid, BaseFlowingFluid.Source> rgtrMolten(String name, IntSupplier tint, String customTexture) {
        return rgtr(name, EOFluidType.FluidTypes.MOLTEN, tint, customTexture, true);
    }

    public static DeferredHolder<Fluid, BaseFlowingFluid.Source> rgtrGas(String name, IntSupplier tint, boolean hazardous) {
        return rgtr(name, EOFluidType.FluidTypes.GAS, tint, null, hazardous);
    }
    public static DeferredHolder<Fluid, BaseFlowingFluid.Source> rgtrGas(String name, IntSupplier tint, String customTexture, boolean hazardous) {
        return rgtr(name, EOFluidType.FluidTypes.GAS, tint, customTexture, hazardous);
    }

    public static DeferredHolder<Fluid, BaseFlowingFluid.Source> rgtrChem(String name, IntSupplier tint, boolean hazardous) {
        return rgtr(name, EOFluidType.FluidTypes.CHEMICAL, tint, null, hazardous);
    }
    public static DeferredHolder<Fluid, BaseFlowingFluid.Source> rgtrChem(String name, IntSupplier tint, String customTexture, boolean hazardous) {
        return rgtr(name, EOFluidType.FluidTypes.CHEMICAL, tint, customTexture, hazardous);
    }

    private static class Ref<T> {
        T value;
    }

    private static DeferredHolder<Fluid, BaseFlowingFluid.Source> rgtr(String name, EOFluidType.FluidTypes types,
                                                                       @Nullable IntSupplier tint, @Nullable String customTexture, boolean hazardous) {
        String id = types.prefix + "_" + name;

        IntSupplier effectiveTint = tint != null ? tint : getTint(name);

        DeferredHolder<FluidType, FluidType> type =
                EO_FLUID_TYPES.register(id, () -> new EOFluidType(types.baseProps(), types, id, customTexture, effectiveTint, hazardous));

        Ref<DeferredHolder<Fluid, BaseFlowingFluid.Source>> sourceRef = new Ref<>();
        Ref<DeferredHolder<Fluid, BaseFlowingFluid.Flowing>> flowingRef = new Ref<>();
        Ref<DeferredHolder<Block, EOHazardousLiquidBlocks>> blockRef = new Ref<>();
        Ref<DeferredHolder<Item, EOFluidBucketItem>> bucketRef = new Ref<>();

        DeferredHolder<Fluid, BaseFlowingFluid.Source> source = EO_FLUIDS.register(id, () ->
                new BaseFlowingFluid.Source(new BaseFlowingFluid.Properties(type, sourceRef.value, flowingRef.value)
                        .bucket(bucketRef.value)
                        .block(blockRef.value)));
        sourceRef.value = source;

        flowingRef.value = EO_FLUIDS.register(id + "_flowing", () ->
                new BaseFlowingFluid.Flowing(new BaseFlowingFluid.Properties(type, sourceRef.value, flowingRef.value)
                        .bucket(bucketRef.value)
                        .block(blockRef.value)));

        blockRef.value = EOSetRegistries.EO_BLOCKS.register(id, () ->
                new EOHazardousLiquidBlocks(sourceRef.value.get(),
                        BlockBehaviour.Properties.of()
                                .mapColor(MapColor.COLOR_LIGHT_BLUE)
                                .replaceable()
                                .noCollission()
                                .strength(100.0f)
                                .noLootTable()
                                .liquid()
                                .sound(SoundType.EMPTY)
                                .pushReaction(PushReaction.DESTROY)
                )
        );

        bucketRef.value = EOSetRegistries.EO_ITEMS.register(id + "_bucket", () ->
                new EOFluidBucketItem(sourceRef.value.get(),
                        new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET)));

        return source;
    }
}