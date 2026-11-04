package net.radzratz.eternalores.mixin.extendedae;

import appeng.core.definitions.AEBlocks;
import com.glodblock.github.extendedae.common.items.ItemEntroSeed;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.world.level.block.Block;
import net.radzratz.eternalores.util.config.EOTweaksConfig;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;

import static net.radzratz.eternalores.util.tags.block.EOBlockTags.StorageBlocks.*;

@Pseudo
@Mixin(value = ItemEntroSeed.class, remap = false)
public class ItemEntroSeedMixin {
    @ModifyExpressionValue(
            method = "useOn",
            at = @At(value = "INVOKE",
                    target = "Lnet/minecraft/world/level/block/state/BlockState;getBlock()Lnet/minecraft/world/level/block/Block;"),
            remap = false
    )
    private Block onUseOn(Block original) {
        if (!EOTweaksConfig.CFG.EO_TWEAKS.extendedAETweaks.get()) {
            return original;
        }
        return original.defaultBlockState().is(BLOCK_STORAGE_FLUIX)
                ? AEBlocks.FLUIX_BLOCK.block()
                : original;
    }
}
