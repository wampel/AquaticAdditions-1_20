package net.wampelpampel.aq;

import com.mojang.logging.LogUtils;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.wampelpampel.aq.block.AQBlocks;
import net.wampelpampel.aq.item.AQItems;
import org.slf4j.Logger;
@Mod(AquaticAdditions.MOD_ID)
public class AquaticAdditions
{
    public static final String MOD_ID = "aq";
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);
    public static final RegistryObject<CreativeModeTab> AQ_TAB = CREATIVE_MODE_TABS.register("aq_tab", () -> CreativeModeTab.builder()
            .icon(() -> AQItems.TURTLE_CHESTPLATE.get().getDefaultInstance())
            .displayItems((parameters, output) -> {

                //Armor
                output.accept(AQItems.TURTLE_HELMET.get());
                output.accept(AQItems.TURTLE_CHESTPLATE.get());
                output.accept(AQItems.TURTLE_LEGGINS.get());
                output.accept(AQItems.TURTLE_BOOTS.get());

                output.accept(AQItems.VTURTLE_BOOTS.get());
                output.accept(AQItems.VTURTLE_LEGGINS.get());
                output.accept(AQItems.VTURTLE_CHESTPLATE.get());

                //Tools
                output.accept(AQItems.TURTLE_SWORD.get());
                output.accept(AQItems.TURTLE_PICKAXE.get());
                output.accept(AQItems.TURTLE_AXE.get());
                output.accept(AQItems.TURTLE_SHOVEL.get());
                output.accept(AQItems.TURTLE_HOE.get());

                //Rods
                output.accept(AQItems.IRON_FISHING_ROD.get());
                output.accept(AQItems.GOLD_FISHING_ROD.get());
                output.accept(AQItems.DIAMOND_FISHING_ROD.get());
                output.accept(AQItems.NETHERITE_FISHING_ROD.get());

                //Fish
                output.accept(AQItems.IRON_FISH.get());
                output.accept(AQItems.GOLD_FISH.get());
                output.accept(AQItems.DIAMOND_FISH.get());

                //Food
                output.accept(AQItems.TURTLE_APPLE.get());
                output.accept(AQItems.GOLDEN_FISH.get());

                //Materials
                output.accept(AQItems.TURTLE_INGOT.get());
                output.accept(AQItems.DIAMOND_NUGGET.get());

                //Blocks
                output.accept(AQBlocks.SCUTE_BLOCK.get());
                output.accept(AQBlocks.TURTLE_BLOCK.get());


            }).build());

    public AquaticAdditions()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);

        AQItems.register(modEventBus);
        AQBlocks.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
