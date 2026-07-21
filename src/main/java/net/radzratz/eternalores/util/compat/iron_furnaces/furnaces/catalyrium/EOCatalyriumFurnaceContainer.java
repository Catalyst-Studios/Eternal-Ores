package net.radzratz.eternalores.util.compat.iron_furnaces.furnaces.catalyrium;

import ironfurnaces.container.furnaces.BlockIronFurnaceContainerBase;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.radzratz.eternalores.util.compat.iron_furnaces.EOIronFurnaceRegistries;

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
public class EOCatalyriumFurnaceContainer extends BlockIronFurnaceContainerBase {
    public EOCatalyriumFurnaceContainer(int windowId, Level world, BlockPos pos, Inventory playerInventory, Player player) {
        super(EOIronFurnaceRegistries.CATALYRIUM_FURNACE.container().get(), windowId, world, pos, playerInventory, player);
        this.te = (EOCatalyriumFurnaceTile)world.getBlockEntity(pos);
    }
}
