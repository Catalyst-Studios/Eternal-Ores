package net.radzratz.eternalores.item.special.destroyer;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.TagKey;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.registries.DeferredItem;
import net.radzratz.eternalores.util.lang.EOLangKeys;
import org.jetbrains.annotations.NotNull;

import java.util.List;

import static net.radzratz.eternalores.util.EOUtils.C;
import static net.radzratz.eternalores.util.config.EOTooltipConfig.CFG;

public class EOChunkDestroyer extends Item {
    public EOChunkDestroyer(Properties properties) {
        super(properties);
    }

    public static DeferredItem<EOChunkDestroyer> DESTROYA;

    @Override
    public @NotNull InteractionResult useOn(UseOnContext context) {
        if (!context.getLevel().isClientSide) {
            Player player = context.getPlayer();
            BlockPos pos = context.getClickedPos();
            Level level = context.getLevel();

            if (player == null) return InteractionResult.PASS;

            if (!player.isCreative()) {
                player.displayClientMessage(Component.translatable(EOLangKeys.FINDER_CREATIVE_ONLY).withStyle(ChatFormatting.RED), true);
                return InteractionResult.FAIL;
            }

            ChunkPos chunkPos = new ChunkPos(pos);
            clearChunk(level, chunkPos);

            player.displayClientMessage(Component.translatable(EOLangKeys.FINDER_CHUNK_DESTROYED).withStyle(ChatFormatting.RED), true);

            level.playSound(
                    null,
                    pos,
                    SoundEvents.ENDERMAN_TELEPORT,
                    SoundSource.PLAYERS,
                    0.5f,
                    0.5f
            );

            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext context, @NotNull List<Component> component, @NotNull TooltipFlag toolTip) {
        if (CFG.EO_TOOLTIPS.destroya.get()) {
            component.add(Component.translatable(EOLangKeys.FINDER_CHUNK_DESC).withStyle(ChatFormatting.YELLOW));
        }

        super.appendHoverText(stack, context, component, toolTip);
    }

    private void clearChunk(Level level, ChunkPos chunkPos) {
        int minY = level.getMinBuildHeight();
        int maxY = level.getMaxBuildHeight();

        TagKey<Block> oresTag = TagKey.create(Registries.BLOCK, C("ores"));

        List<Block> protectedBlocks = List.of(Blocks.BEDROCK, Blocks.END_PORTAL_FRAME, Blocks.END_PORTAL,
                Blocks.NETHER_PORTAL, Blocks.SPAWNER, Blocks.CHEST, Blocks.ENDER_CHEST, Blocks.SHULKER_BOX,
                Blocks.BARREL);

        for(int x = 0; x < 16; x++) {
            for(int z = 0; z < 16; z++) {
                for(int y = minY; y < maxY; y++) {
                    BlockPos pos = new BlockPos(chunkPos.getMinBlockX() + x, y, chunkPos.getMinBlockZ() + z);
                    BlockState state = level.getBlockState(pos);
                    Block block = state.getBlock();

                    if(!state.isAir() && !state.is(oresTag) && !protectedBlocks.contains(block)) {
                        level.setBlock(pos, Blocks.AIR.defaultBlockState(), Block.UPDATE_CLIENTS);
                    }
                }
            }
        }
    }
}
