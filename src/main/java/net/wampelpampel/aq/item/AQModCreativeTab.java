package net.wampelpampel.aq.item;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.wampelpampel.aq.AquaticAdditions;
/*
@Mod.EventBusSubscriber(modid = AquaticAdditions.MOD_ID, bus=Mod.EventBusSubscriber.Bus.MOD)
public class AQModCreativeTab {
    public static CreativeModeTab AQ_TAB;
    @SubscribeEvent
        public static void registerCreativeModTabs(CreativeModeTabEvent.Register event) {
        AQ_TAB = event.registerCreativeModeTab(new ResourceLocation(AquaticAdditions.MOD_ID, "aq_tab"),
                builder -> builder.icon(() -> new ItemStack(AQItems.TURTLE_CHESTPLATE.get()))
                        .title(Component.translatable("creativemodetab.aq_tab")));
    }


}
 */