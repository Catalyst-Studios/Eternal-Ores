package net.radzratz.eternalores.item.tools;

import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
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
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class EOFinder extends Item
{
    public EOFinder(Properties properties)
    {
        super(properties);
    }

    @Override
    public @NotNull InteractionResult useOn(UseOnContext context)
    {
        if(!context.getLevel().isClientSide)
        {
            Player player = context.getPlayer();
            BlockPos pos = context.getClickedPos();
            Level level = context.getLevel();

            if(player != null && player.isCreative())
            {
                ChunkPos chunkPos = new ChunkPos(pos);
                clearChunk(level, chunkPos);

                player.displayClientMessage(Component.literal("§c¡Chunk Be GONE!"), true);

                level.playSound(
                        null,
                        pos,
                        SoundEvents.ENDERMAN_TELEPORT,
                        SoundSource.PLAYERS,
                        1.0F,
                        0.5F
                );

                return InteractionResult.SUCCESS;
            }
        }
        return InteractionResult.PASS;
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack,
                                @NotNull TooltipContext context,
                                @NotNull List<Component> tooltipComponents,
                                @NotNull TooltipFlag tooltipFlag)
    {
        tooltipComponents.add(Component.literal(
                                            """
                                                 §7Yeets everything except ores and bedrock! Dev Tool Only.
                                                 """));
        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }

    private void clearChunk(Level level, ChunkPos chunkPos)
    {
        int minY = level.getMinBuildHeight();
        int maxY = level.getMaxBuildHeight();

        TagKey<Block> oresTag = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("c", "ores"));

        List<Block> protectedBlocks = List.of(
                Blocks.BEDROCK,
                Blocks.END_PORTAL_FRAME,
                Blocks.END_PORTAL,
                Blocks.NETHER_PORTAL,
                Blocks.SPAWNER,
                Blocks.CHEST,
                Blocks.ENDER_CHEST
        );

        for(int x = 0; x < 16; x++)
        {
            for(int z = 0; z < 16; z++)
            {
                for(int y = minY; y < maxY; y++)
                {
                    BlockPos pos = new BlockPos(chunkPos.getMinBlockX() + x, y, chunkPos.getMinBlockZ() + z);
                    BlockState state = level.getBlockState(pos);
                    Block block = state.getBlock();

                    if(!state.isAir() &&
                            !state.is(oresTag) &&
                            !protectedBlocks.contains(block))
                    {
                        level.setBlock(pos, Blocks.AIR.defaultBlockState(), Block.UPDATE_ALL_IMMEDIATE);
                    }
                }
            }
        }
    }
}
