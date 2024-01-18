package net.wampelpampel.aq.events;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.MinecartItem;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.living.LivingEquipmentChangeEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.wampelpampel.aq.AquaticAdditions;
import net.wampelpampel.aq.item.AQItems;

@Mod.EventBusSubscriber(modid = AquaticAdditions.MOD_ID)
public class AQEvents {

    @SubscribeEvent
    public static void boxer(AttackEntityEvent event) {
        if (event.getEntity().getMainHandItem().getItem() == AQItems.TURTLE_SWORD.get()) {
            if (event.getTarget().isAlive()) {

                Player player = event.getEntity();
                LivingEntity target = (LivingEntity) event.getTarget();

                target.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 3 * 20, 1));
            }
        }
    }

    @SubscribeEvent
    public static void conduitPowerWhileWearingTurtleArmor(LivingEquipmentChangeEvent event) {
        LivingEntity player = event.getEntity();
        ItemStack chestStack = event.getEntity().getItemBySlot(EquipmentSlot.CHEST);
        ItemStack headstack = event.getEntity().getItemBySlot(EquipmentSlot.HEAD);
        ItemStack footstack = event.getEntity().getItemBySlot(EquipmentSlot.FEET);
        ItemStack legstack = event.getEntity().getItemBySlot(EquipmentSlot.LEGS);
        if (chestStack.getItem() == AQItems.TURTLE_CHESTPLATE.get()) {
            if (headstack.getItem() == AQItems.TURTLE_HELMET.get()) {
                if (footstack.getItem() == AQItems.TURTLE_BOOTS.get()) {
                    if (legstack.getItem() == AQItems.TURTLE_LEGGINS.get()) {
                        player.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, Integer.MAX_VALUE, 0));
                        player.addEffect(new MobEffectInstance(MobEffects.CONDUIT_POWER, Integer.MAX_VALUE, 0));
                        player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, Integer.MAX_VALUE, 0));
                    }
                }
            }
        }
        if (chestStack.getItem() == AQItems.VTURTLE_CHESTPLATE.get()) {
            if (headstack.getItem() == Items.TURTLE_HELMET) {
                if (footstack.getItem() == AQItems.VTURTLE_BOOTS.get()) {
                    if (legstack.getItem() == AQItems.VTURTLE_LEGGINS.get()) {
                        player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, Integer.MAX_VALUE, 0));
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public static void turtleArmorRemoveEfeect(LivingEquipmentChangeEvent event) {
        ItemStack cheststack = event.getEntity().getItemBySlot(EquipmentSlot.CHEST);
        ItemStack headstack = event.getEntity().getItemBySlot(EquipmentSlot.HEAD);
        ItemStack legstack = event.getEntity().getItemBySlot(EquipmentSlot.LEGS);
        ItemStack footstack = event.getEntity().getItemBySlot(EquipmentSlot.FEET);
        LivingEntity player = event.getEntity();
        if (player.hasEffect(MobEffects.CONDUIT_POWER)) {
            if (!cheststack.getItem().equals(AQItems.TURTLE_CHESTPLATE.get())) {
                player.removeEffect(MobEffects.CONDUIT_POWER);
                player.removeEffect(MobEffects.DOLPHINS_GRACE);
                player.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
            }
            if (!headstack.getItem().equals(AQItems.TURTLE_HELMET.get())) {
                player.removeEffect(MobEffects.CONDUIT_POWER);
                player.removeEffect(MobEffects.DOLPHINS_GRACE);
                player.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
            }
            if (!legstack.getItem().equals(AQItems.TURTLE_LEGGINS.get())) {
                player.removeEffect(MobEffects.CONDUIT_POWER);
                player.removeEffect(MobEffects.DOLPHINS_GRACE);
                player.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
            }
            if (!footstack.getItem().equals(AQItems.TURTLE_BOOTS.get())) {
                player.removeEffect(MobEffects.CONDUIT_POWER);
                player.removeEffect(MobEffects.DOLPHINS_GRACE);
                player.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
            }
        }
        if (player.hasEffect(MobEffects.DAMAGE_RESISTANCE)) {
            if (!cheststack.getItem().equals(AQItems.VTURTLE_CHESTPLATE.get())) {
                player.removeEffect(MobEffects.DAMAGE_RESISTANCE);
            }
            if (!headstack.getItem().equals(Items.TURTLE_HELMET)) {
                player.removeEffect(MobEffects.DAMAGE_RESISTANCE);
            }
            if (!legstack.getItem().equals(AQItems.VTURTLE_LEGGINS.get())) {
                player.removeEffect(MobEffects.DAMAGE_RESISTANCE);
            }
            if (!footstack.getItem().equals(AQItems.VTURTLE_BOOTS.get())) {
                player.removeEffect(MobEffects.DAMAGE_RESISTANCE);
            }
        }
    }
}
