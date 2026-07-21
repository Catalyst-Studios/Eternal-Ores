package net.radzratz.eternalores.mixin.immersiveengineering;

import blusunrize.immersiveengineering.common.util.compat.jei.JEIHelper;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.radzratz.eternalores.util.compat.immersive_engineering.PressDeduplicator;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.List;

/**
 * File created and provided by; Titop
 */
@Pseudo
@Mixin(value = JEIHelper.class, remap = false)
public class JEIHelperMixin
{
    @SuppressWarnings({"unchecked", "rawtypes"})
    @Redirect(
            method = "registerRecipes",
            at = @At(
                    value = "INVOKE",
                    target = "Lmezz/jei/api/registration/IRecipeRegistration;addRecipes(Lmezz/jei/api/recipe/RecipeType;Ljava/util/List;)V"
            )
    )
    private void onAddRecipes(IRecipeRegistration instance, RecipeType<?> recipeType, List<?> recipes) {
        if(recipeType != null && recipeType.getUid().getPath().equals("metal_press"))
        {
            recipes = PressDeduplicator.deduplicate((List<RecipeHolder<?>>) recipes);
        }

        instance.addRecipes((RecipeType) recipeType, recipes);
    }
}
