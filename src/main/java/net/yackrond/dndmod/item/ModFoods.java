package net.yackrond.dndmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties ROTTEN_EGG = new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600), 0.5f).build();
}
