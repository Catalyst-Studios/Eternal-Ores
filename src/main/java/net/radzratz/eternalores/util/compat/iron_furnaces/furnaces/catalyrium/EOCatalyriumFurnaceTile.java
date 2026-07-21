package net.radzratz.eternalores.util.compat.iron_furnaces.furnaces.catalyrium;

import ironfurnaces.tileentity.furnaces.BlockIronFurnaceTileBase;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.common.ModConfigSpec;
import net.radzratz.eternalores.util.compat.iron_furnaces.EOIronFurnaceRegistries;
import org.jetbrains.annotations.Nullable;

import static net.radzratz.eternalores.util.compat.iron_furnaces.util.EOIronFurnaceConfig.*;

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
public class EOCatalyriumFurnaceTile extends BlockIronFurnaceTileBase {

    public EOCatalyriumFurnaceTile(BlockPos pos, BlockState state) {
        super(EOIronFurnaceRegistries.CATALYRIUM_FURNACE.tile().get(), pos, state);
    }

    @Override
    public String IgetName() {
        return "container.eternalores.catalyrium_furnace";
    }

    @Override
    public AbstractContainerMenu IcreateMenu(int i, Inventory playerInv, Player player) {
        return new EOCatalyriumFurnaceContainer(i, this.level, this.worldPosition, playerInv, player);
    }

    @Override
    public ModConfigSpec.IntValue getCookTimeConfig() {
        return speed;
    }

    @Override
    public int getGeneration() {
        return generation.get();
    }

    @Override
    public int getSpeed() {
        return speed.get();
    }

    @Override
    public int getFactorySpeed(int slot) {
        return factorySpeed.get();
    }

    @Override
    public void smeltItemMult(@Nullable RecipeHolder<?> recipe, int div) {
        super.smeltItemMult(recipe, smeltMult.get());
    }

    @Override
    public void smeltFactoryItemMult(@Nullable RecipeHolder<?> recipe, int slot, int div) {
        super.smeltFactoryItemMult(recipe, slot, factorySmeltMult.get());
    }

    public int getTier() {
        return tier.get();
    }
}
