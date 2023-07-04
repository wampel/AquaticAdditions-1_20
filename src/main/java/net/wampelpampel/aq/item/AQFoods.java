package net.wampelpampel.aq.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class AQFoods {
    public static final FoodProperties TURTLE_APPLE = new FoodProperties.Builder()
            .nutrition(2)
            .saturationMod(8.2F)
            .alwaysEat()

            .effect(() ->  new MobEffectInstance(MobEffects.ABSORPTION, 180*20, 3), 1.0F)
            .effect(() ->  new MobEffectInstance(MobEffects.REGENERATION, 180*20, 3), 1.0F)
            .effect(() ->  new MobEffectInstance(MobEffects.NIGHT_VISION, 5*20, 2), 1.0F)
            .effect(() ->  new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 8*20, 1), 1.0F)
            .effect(() ->  new MobEffectInstance(MobEffects.WATER_BREATHING, 15*20, 1), 1.0F)
            .build();
    public static final FoodProperties GOLDEN_FISH = new FoodProperties.Builder()
            .nutrition(7)
            .saturationMod(14.4F)
            .build();

    public static final FoodProperties ORE_FISH = new FoodProperties.Builder()
            .nutrition(1)
            .saturationMod(0F)
            .effect(() ->  new MobEffectInstance(MobEffects.POISON, 20*20, 1), 1.0F)
            .build();
}
