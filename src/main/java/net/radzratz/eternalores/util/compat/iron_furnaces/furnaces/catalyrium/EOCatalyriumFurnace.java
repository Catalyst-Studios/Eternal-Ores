package net.radzratz.eternalores.util.compat.iron_furnaces.furnaces.catalyrium;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.radzratz.eternalores.util.compat.iron_furnaces.furnaces.EOIFurnacesFurnaceBlock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static net.radzratz.eternalores.util.compat.iron_furnaces.EOIronFurnaceRegistries.CATALYRIUM_FURNACE;
import static net.radzratz.eternalores.util.compat.iron_furnaces.util.EOIronFurnaceConfig.speed;

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
public class EOCatalyriumFurnace extends EOIFurnacesFurnaceBlock {
    public static String CFURNACE = "catalyrium_furnace";

    public EOCatalyriumFurnace(BlockBehaviour.Properties properties) {
        super(properties);
    }

    public void appendHoverText(@NotNull ItemStack stack, Item.@NotNull TooltipContext pContext, List<Component> tooltip, @NotNull TooltipFlag pTooltipFlag) {
        tooltip.add(Component.translatable("tooltip.ironfurnaces.cooktime")
                .append(Component.literal(" (" + getTime(stack) + ")")
                .withStyle(ChatFormatting.DARK_AQUA)));
    }

    private static int getTime(ItemStack stack) {
        Item item = stack.getItem();
        if (item == CATALYRIUM_FURNACE.item().get()) {
            return speed.get();
        }
        return getTime(stack);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(@NotNull Level level, @NotNull BlockState state, @NotNull BlockEntityType<T> type) {
        return createFurnaceTicker(level, type, CATALYRIUM_FURNACE.tile().get());
    }

    @Override
    @Nullable
    public BlockEntity newBlockEntity(@NotNull BlockPos blockPos, @NotNull BlockState blockState) {
        return new EOCatalyriumFurnaceTile(blockPos, blockState);
    }
}
