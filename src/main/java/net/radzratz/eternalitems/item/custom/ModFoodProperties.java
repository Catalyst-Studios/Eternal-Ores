package net.radzratz.eternalitems.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties COOKED_APPLE = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(2.50f)
            .effect(()-> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 160), 0.50f)
            .effect(()-> new MobEffectInstance(MobEffects.DIG_SPEED, 160), 0.50f)
            .build();

    public static final FoodProperties COOKED_CARROT = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(2.50f)
            .build();

}
