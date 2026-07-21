package net.radzratz.eternalores.util.compat.iron_furnaces;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.Container;
import net.minecraft.world.WorldlyContainer;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.neoforge.items.wrapper.InvWrapper;
import net.neoforged.neoforge.items.wrapper.SidedInvWrapper;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.radzratz.eternalores.EternalOres;
import net.radzratz.eternalores.util.compat.iron_furnaces.furnaces.catalyrium.*;
import net.radzratz.eternalores.util.compat.iron_furnaces.upgrades.types.EOCatalyriumUpgrade;
import net.radzratz.eternalores.util.compat.iron_furnaces.util.EOIronFurnaceHelpers;
import net.radzratz.eternalores.util.compat.iron_furnaces.util.EOIronFurnaceConfig;

import java.util.Collection;
import java.util.stream.Stream;

import static net.radzratz.eternalores.EternalOres.configs;
import static net.radzratz.eternalores.util.EOUtils.*;
import static net.radzratz.eternalores.util.compat.iron_furnaces.upgrades.types.EOCatalyriumUpgrade.uCat;

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
 * Source: https://github.com/Qelifern/IronFurnacesNeoForge
 *
 */
public class EOIronFurnaceRegistries {
    public static final DeferredRegister<Block> FURNACE_BLOCK = DeferredRegister.create(BuiltInRegistries.BLOCK, EternalOres.id);
    public static final DeferredRegister<Item> FURNACE_ITEM = DeferredRegister.create(BuiltInRegistries.ITEM, EternalOres.id);
    public static final DeferredRegister<BlockEntityType<?>> FURNACE_TILE = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, IRON_FURNACES);
    public static final DeferredRegister<MenuType<?>> FURNACE_CONTAINER = DeferredRegister.create(BuiltInRegistries.MENU, IRON_FURNACES);

    public static final DeferredHolder<Item, EOCatalyriumUpgrade> CATALYRIUM_UPGRADE;

    public static final EOIronFurnaceHelpers.FurnaceRegistration<EOCatalyriumFurnaceTile, EOCatalyriumFurnaceContainer> CATALYRIUM_FURNACE;

    static {
        CATALYRIUM_FURNACE = EOIronFurnaceHelpers.register("catalyrium_furnace", EOCatalyriumFurnace::new, EOCatalyriumFurnaceTile::new, EOCatalyriumFurnaceContainer::new);

        CATALYRIUM_UPGRADE = FURNACE_ITEM.register(uCat, () -> new EOCatalyriumUpgrade(new Item.Properties()));
    }

    public static Stream<DeferredHolder<Item, ? extends Item>> allIronFurnacesItemEntries() {
        return Stream.of(FURNACE_ITEM.getEntries()).flatMap(Collection::stream);
    }

    public static Stream<DeferredHolder<Block, ? extends Block>> allIronFurnacesBlockEntries() {
        return Stream.of(FURNACE_BLOCK.getEntries()).flatMap(Collection::stream);
    }

    public static void init(final RegisterMenuScreensEvent event) {
        event.register(CATALYRIUM_FURNACE.container().get(), EOCatalyriumFurnaceScreen::new);
    }

    public static void capabilities(RegisterCapabilitiesEvent evt) {
        evt.registerBlock(Capabilities.ItemHandler.BLOCK, (level, pos, state, be, side) -> be instanceof Container container ? (side == null
                                ? new InvWrapper(container) : new SidedInvWrapper((WorldlyContainer) container, side)) : null, CATALYRIUM_FURNACE.block().get());

        evt.registerBlock(Capabilities.EnergyStorage.BLOCK, (level, pos, state, be, side) ->
                        be instanceof EOCatalyriumFurnaceTile furnace ? furnace.energyStorage : null, CATALYRIUM_FURNACE.block().get());
    }

    public static void rgtr(IEventBus bus, ModContainer mCont) {
        FURNACE_BLOCK.register(bus);
        FURNACE_ITEM.register(bus);
        FURNACE_CONTAINER.register(bus);
        FURNACE_TILE.register(bus);
        bus.addListener(EOIronFurnaceRegistries::init);
        bus.addListener(EOIronFurnaceRegistries::capabilities);
        configs(mCont, EOIronFurnaceConfig.spec, "/furnace-settings");
    }
}
