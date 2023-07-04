package net.wampelpampel.aq.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class AQTiers {
    public static final ForgeTier TURTLE = new ForgeTier(3, 2531, 3.0F,
            1.5F, 15, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(AQItems.TURTLE_INGOT.get()));


}
