package net.radzratz.eternalores.mixin.immersiveengineering;

import blusunrize.immersiveengineering.common.util.compat.jei.metalpress.MetalPressRecipeCategory;
import mezz.jei.api.gui.builder.IIngredientAcceptor;
import mezz.jei.api.gui.builder.IRecipeSlotBuilder;
import net.minecraft.world.item.ItemStack;
import net.radzratz.eternalores.util.compat.immersive_engineering.Press;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

/**
 * File created and provided by; Titop
 */
@Pseudo
@Mixin(value = MetalPressRecipeCategory.class, remap = false)
public class MetalPressCategoryMixin
{
    @Redirect(
            method = "setRecipe",
            at = @At(
                    value = "INVOKE",
                    target = "addItemStack"
            ),
            remap = false
    )
    private IIngredientAcceptor<?> onAddItemStack(IRecipeSlotBuilder instance, ItemStack stack)
    {
        return Press.handleJeiMoldSlot(instance, stack);
    }
}
