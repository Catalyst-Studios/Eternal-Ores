package net.radzratz.eternalores.util.compat.geore.blocks;

import com.shynieke.geore.config.GeOreConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BuddingAmethystBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.radzratz.eternalores.block.types.enums.EOBlockTier;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.Method;
import java.util.function.Supplier;

@SuppressWarnings("null")
public class GEOreBuddingBlock extends BuddingAmethystBlock
{
    private static final Direction[] DIRECTIONS = Direction.values();

    private final EOBlockTier tier;
    private final Supplier<? extends AmethystClusterBlock> smallSupplier;
    private final Supplier<? extends AmethystClusterBlock> mediumSupplier;
    private final Supplier<? extends AmethystClusterBlock> largeSupplier;
    private final Supplier<? extends AmethystClusterBlock> clusterSupplier;
    private final String oreName;

    public GEOreBuddingBlock(Properties properties, EOBlockTier tier,
                             Supplier<? extends AmethystClusterBlock> smallSupplier,
                             Supplier<? extends AmethystClusterBlock> mediumSupplier,
                             Supplier<? extends AmethystClusterBlock> largeSupplier,
                             Supplier<? extends AmethystClusterBlock> clusterSupplier,
                             String oreName) {
        super(properties);
        this.tier = tier;
        this.smallSupplier = smallSupplier;
        this.mediumSupplier = mediumSupplier;
        this.largeSupplier = largeSupplier;
        this.clusterSupplier = clusterSupplier;
        this.oreName = oreName;
    }

    public GEOreBuddingBlock(Properties properties, EOBlockTier tier,
                             Supplier<? extends AmethystClusterBlock> smallSupplier,
                             Supplier<? extends AmethystClusterBlock> mediumSupplier,
                             Supplier<? extends AmethystClusterBlock> largeSupplier,
                             Supplier<? extends AmethystClusterBlock> clusterSupplier) {
        this(properties, tier, smallSupplier, mediumSupplier, largeSupplier, clusterSupplier, tier.name().toLowerCase());
    }

    public EOBlockTier getTier()
    {
        return tier;
    }

    public String getOreName()
    {
        return oreName;
    }

    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        double growthRate = getGrowthRateCompat(this.oreName);
        if((double) random.nextFloat() < growthRate / 5.0D)
        {
            Direction direction = DIRECTIONS[random.nextInt(DIRECTIONS.length)];
            BlockPos blockpos = pos.relative(direction);
            BlockState blockstate = level.getBlockState(blockpos);
            Block block = null;

            if(canClusterGrowAtState(blockstate))
            {
                block = this.smallSupplier.get();
            }
            else if(blockstate.is(this.smallSupplier.get()) && blockstate.getValue(AmethystClusterBlock.FACING) == direction)
            {
                block = this.mediumSupplier.get();
            }
            else if(blockstate.is(this.mediumSupplier.get()) && blockstate.getValue(AmethystClusterBlock.FACING) == direction)
            {
                block = this.largeSupplier.get();
            }
            else if(blockstate.is(this.largeSupplier.get()) && blockstate.getValue(AmethystClusterBlock.FACING) == direction)
            {
                block = this.clusterSupplier.get();
            }

            if(block == null) return;
            
            BlockState budState = block.defaultBlockState()
                    .setValue(AmethystClusterBlock.FACING, direction)
                    .setValue(AmethystClusterBlock.WATERLOGGED, blockstate.getFluidState().getType() == Fluids.WATER);
            level.setBlockAndUpdate(blockpos, budState);
        }
    }

    private double getGrowthRateCompat(String name) {
        try
        {
            return GeOreConfig.COMMON.getGrowthRate(name);
        }
        catch(NoSuchMethodError | Exception e)
        {
            try
            {
                Method method = GeOreConfig.COMMON.getClass().getMethod("getGrowthRate");
                return (double) method.invoke(GeOreConfig.COMMON);
            }
            catch(Exception ex)
            {
                return 0.2D;
            }
        }
    }

    @Override
    public @Nullable PushReaction getPistonPushReaction(BlockState state)
    {
        try
        {
            if(GeOreConfig.COMMON.disablePistonPushForBuddingGeOre.get())
            {
                return PushReaction.BLOCK;
            }
        }
        catch(Throwable ignored)
        {
        }

        return super.getPistonPushReaction(state);
    }

    public static DeferredBlock<GEOreBuddingBlock> BUDDING_CATALYRIUM_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_ARDITE_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_BERYLLIUM_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_COBALT_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_GALLIUM_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_IRIDIUM_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_SCULKITE_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_TITANIUM_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_ULTIMATITANIUM_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_FLUORITE_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_APATITE_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_CINNABAR_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_GARNET_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_JADE_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_NECROTICARITE_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_NITER_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_OBSIDIAN_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_ONYX_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_PEARL_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_PERIDOT_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_PYROLITE_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_TANZANITE_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_ZIRCON_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_MOLYBDENUM_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_NEODYMIUM_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_SPINEL_BLOCK;
    public static DeferredBlock<GEOreBuddingBlock> BUDDING_PALLADIUM_BLOCK;
}
