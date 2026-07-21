package net.radzratz.eternalores.mixin.immersiveengineering;

import blusunrize.immersiveengineering.api.crafting.MetalPressRecipe;
import com.google.common.collect.ArrayListMultimap;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.level.Level;
import net.radzratz.eternalores.util.compat.immersive_engineering.Press;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 * File created and provided by; Titop
 */
@Pseudo
@Mixin(value = MetalPressRecipe.class, remap = false)
public class PressMixin
{
    @Inject(
            method = "getRecipesByMold(Lnet/minecraft/world/level/Level;)Lcom/google/common/collect/ArrayListMultimap;",
            at = @At("RETURN"),
            remap = false
    )
    private static void getRecipesByMold(Level level, CallbackInfoReturnable<ArrayListMultimap<Item, RecipeHolder<MetalPressRecipe>>> cir)
    {
        Press.handleMoldTags(cir.getReturnValue());
    }
}
