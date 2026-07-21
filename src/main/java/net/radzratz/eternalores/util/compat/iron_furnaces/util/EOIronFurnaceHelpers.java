package net.radzratz.eternalores.util.compat.iron_furnaces.util;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.network.IContainerFactory;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import static net.radzratz.eternalores.util.compat.iron_furnaces.EOIronFurnaceRegistries.*;

/*
 * Copyright 2025 pizzaatime and XenoMustache
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Source project: https://github.com/Qelifern/IronFurnacesNeoForge
 *
 * ---------------------------------------------------------------------------
 * Note by RadzRatz (2025):
 * - This file was created from scratch as a utility helper to group furnace
 *   registrations (block, item, block entity, menu) into a single record.
 *
 *   Its purpose is to keep the registration class clean and to ease the creation
 *   of any desired furnace.
 *
 *   It does not change the furnace behaviour in any way.
 *
 * - While this file could fall under the All Rights Reserved license of the
 *   Eternal Ores Mod, it is explicitly released under the Apache License 2.0,
 *   to allow others to easily reuse it.
 * ---------------------------------------------------------------------------
 */
public class EOIronFurnaceHelpers {
    /**
     * Unified record that groups the four deferred holders produced when
     * registering a furnace, so callers receive a single typed object instead
     * of managing four separate fields.
     * <p>
     * All holders are lazy - they resolve their values only after
     * NeoForge's registration events have fired.
     * </p>
     * @param <T> the {@link BlockEntity} type backing this furnace
     * @param <C> the {@link AbstractContainerMenu} type for this furnace's UI
     */
    public record FurnaceRegistration<T extends BlockEntity, C extends AbstractContainerMenu>(DeferredHolder<Block, ? extends Block> block,
            DeferredHolder<Item, ? extends Item> item, Supplier<BlockEntityType<T>> tile, Supplier<MenuType<C>> container) {}

    /**
     * Low-level furnace registration method.
     *
     * <p>Registers a Block, its BlockItem, its BlockEntity type, and its menu type
     * under the same {@code name} across four separate {@link DeferredRegister}s,
     * then bundles the results into a {@link FurnaceRegistration} record.</p>
     *
     * @param <T> BlockEntity type
     * @param <C> AbstractContainerMenu type
     * @param <B> Block type
     * @param name registry path shared by all four entries
     * @param block register for blocks
     * @param item register for items
     * @param tileBlock register for block entity types
     * @param containerMenu register for menu types
     * @param blockSupplier factory that produces the furnace {@link Block}
     * @param tFactory factory for the {@link BlockEntity}, matching {@link BlockEntityType.Builder#of}
     * @param cFactory NeoForge {@link IContainerFactory} for the menu
     * @return a {@link FurnaceRegistration} holding all four deferred holders
     */
    public static <T extends BlockEntity, C extends AbstractContainerMenu, B extends Block> FurnaceRegistration<T, C>
    registerFurnace(String name, DeferredRegister<Block> block, DeferredRegister<Item> item, DeferredRegister<BlockEntityType<?>> tileBlock, DeferredRegister<MenuType<?>> containerMenu,
                    Supplier<? extends B> blockSupplier, BiFunction<BlockPos, BlockState, T> tFactory, IContainerFactory<C> cFactory) {

        // Register the furnace block under the given name
        DeferredHolder<Block, ? extends Block> blocks = block.register(name, blockSupplier);

        // Register the BlockItem, lazily fetching the block instance from the holder
        DeferredHolder<Item, ? extends Item> items = item.register(name, () -> new BlockItem(blocks.get(), new Item.Properties()));

        @SuppressWarnings("all") // hides dataType anotated as NotNull warn
        // Register the BlockEntityType, binding it to the furnace block
        Supplier<BlockEntityType<T>> tiles = tileBlock.register(name, () -> BlockEntityType.Builder.of(tFactory::apply, blocks.get()).build(null));

        // Register the menu type using NeoForge's IMenuTypeExtension
        Supplier<MenuType<C>> containers = containerMenu.register(name, () -> IMenuTypeExtension.create(cFactory));

        // Bundle and return all four holders as a single typed record
        return new FurnaceRegistration<>(blocks, items, tiles, containers);
    }

    /**
     * Simplified container factory for EO furnaces.
     *
     * <p>
     * Replaces the raw {@link IContainerFactory} signature
     * {@code (windowId, playerInv, extraData)} with the values that EO furnace
     * containers actually need, hiding the {@code extraData.readBlockPos()} call
     * and the {@code playerInv.player} unwrapping from every registration site.
     * </p>
     * @param <C> the {@link AbstractContainerMenu} type to create
     */
    @FunctionalInterface
    public interface EOContainerFactory<C extends AbstractContainerMenu> {
        /**
         * Creates a container menu instance.
         *
         * @param windowId sync id assigned by the server for this menu session
         * @param level the level where the furnace block entity lives
         * @param pos position of the furnace block entity
         * @param playerInv the player's inventory
         * @param player the player opening the furnace
         * @return a new container menu bound to the given furnace
         */
        C crte(int windowId, Level level, BlockPos pos, Inventory playerInv, Player player);
    }

    /**
     * High-level shorthand for registering EO Iron Furnaces compat entries.
     * <p>
     * Pre-bakes three things that are identical across all EO furnaces:
     * </p>
     * <ol>
     *   <li>The target {@link DeferredRegister}s ({@code FURNACE_BLOCK},
     *       {@code FURNACE_ITEM}, {@code FURNACE_TILE}, {@code FURNACE_CONTAINER}).</li>
     *   <li>The block {@link BlockBehaviour.Properties}, always copied from
     *       {@link Blocks#IRON_BLOCK}.</li>
     *   <li>The {@link IContainerFactory} boilerplate — {@code extraData.readBlockPos()}
     *       and {@code playerInv.player} unwrapping.</li>
     * </ol>
     *
     * <p>Usage example where the constructor references act as the factories:</p>
     * <pre>{@code
     * CATALYRIUM_FURNACE = EOIronFurnaceHelpers.register("catalyrium_furnace",
     *         EOCatalyriumFurnace::new, // Function<Properties, Block>
     *         EOCatalyriumFurnaceTile::new, // BiFunction<BlockPos, BlockState, Tile>
     *         EOCatalyriumFurnaceContainer::new); // EOContainerFactory
     * }</pre>
     *
     * @param <T> BlockEntity type
     * @param <C> AbstractContainerMenu type
     * @param <B> Block type
     * @param name registry path shared by block, item, tile and container
     * @param blockFactory receives pre-built {@link BlockBehaviour.Properties} and returns the furnace {@link Block}
     * @param tileFactory standard {@link BlockEntityType} factory
     * @param containerFactory simplified factory — only the values containers need
     * @return a {@link FurnaceRegistration} with all four holders
     */
    public static <T extends BlockEntity, C extends AbstractContainerMenu, B extends Block> FurnaceRegistration<T, C> register(
            String name, Function<BlockBehaviour.Properties, B> blockFactory, BiFunction<BlockPos, BlockState, T> tileFactory, EOContainerFactory<C> containerFactory) {
        return EOIronFurnaceHelpers.registerFurnace(name, FURNACE_BLOCK, FURNACE_ITEM, FURNACE_TILE, FURNACE_CONTAINER,
                // Properties are always copied from IRON_BLOCK - no need to repeat at each call site
                () -> blockFactory.apply(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)), tileFactory,
                // Unwrap extraData once here so EOContainerFactory implementations
                // never need to interact with FriendlyByteBuf directly
                (windowId, playerInv, extraData) -> containerFactory.crte(
                        windowId,
                        playerInv.player.level(),
                        extraData.readBlockPos(),
                        playerInv,
                        playerInv.player));
    }
}
