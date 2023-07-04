package net.wampelpampel.aq.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.wampelpampel.aq.AquaticAdditions;

public class AQItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AquaticAdditions.MOD_ID);

    public static final RegistryObject<Item> TURTLE_INGOT = ITEMS.register("turtle_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DIAMOND_NUGGET = ITEMS.register("diamond_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DOLPHIN_FINN = ITEMS.register("dolphin_finn",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TURTLE_APPLE = ITEMS.register("turtle_apple",
            () -> new Item(new Item.Properties().food(AQFoods.TURTLE_APPLE)));

    public static final RegistryObject<Item> GOLDEN_FISH = ITEMS.register("golden_fish",
            () -> new Item(new Item.Properties().food(AQFoods.GOLDEN_FISH)));

    public static final RegistryObject<Item> GOLD_FISH = ITEMS.register("gold_fish",
            () -> new Item(new Item.Properties().food(AQFoods.ORE_FISH)));

    public static final RegistryObject<Item> IRON_FISH = ITEMS.register("iron_fish",
            () -> new Item(new Item.Properties().food(AQFoods.ORE_FISH)));

    public static final RegistryObject<Item> DIAMOND_FISH = ITEMS.register("diamond_fish",
            () -> new Item(new Item.Properties().food(AQFoods.ORE_FISH)));

    public static final RegistryObject<Item> TURTLE_SWORD= ITEMS.register("turtle_sword",
            () -> new SwordItem(AQTiers.TURTLE, 5, -2.6F, new Item.Properties()));

    public static final RegistryObject<Item> TURTLE_AXE= ITEMS.register("turtle_axe",
            () -> new AxeItem(AQTiers.TURTLE, 7, -3.1F, new Item.Properties()));

    public static final RegistryObject<Item> TURTLE_SHOVEL = ITEMS.register("turtle_shovel",
            () -> new ShovelItem(AQTiers.TURTLE, 4, -3.2F, new Item.Properties()));

    public static final RegistryObject<Item> TURTLE_PICKAXE = ITEMS.register("turtle_pickaxe",
            () -> new PickaxeItem(AQTiers.TURTLE, 3, -2.9F, new Item.Properties()));

    public static final RegistryObject<Item> TURTLE_HOE= ITEMS.register("turtle_hoe",
            () -> new HoeItem(AQTiers.TURTLE,-1, 0F, new Item.Properties()));


    public static final RegistryObject<Item> TURTLE_HELMET = ITEMS.register("turtle_helmet",
            () -> new ArmorItem(AQArmorMaterials.AQTURTLE, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> TURTLE_CHESTPLATE = ITEMS.register("turtle_chestplate",
            () -> new ArmorItem(AQArmorMaterials.AQTURTLE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> TURTLE_LEGGINS = ITEMS.register("turtle_leggins",
            () -> new ArmorItem(AQArmorMaterials.AQTURTLE, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> TURTLE_BOOTS = ITEMS.register("turtle_boots",
            () -> new ArmorItem(AQArmorMaterials.AQTURTLE, ArmorItem.Type.BOOTS, new Item.Properties()));


    public static final RegistryObject<Item> VTURTLE_CHESTPLATE = ITEMS.register("vturtle_chestplate",
            () -> new ArmorItem(AQArmorMaterials.VTURTLE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> VTURTLE_LEGGINS = ITEMS.register("vturtle_leggins",
            () -> new ArmorItem(AQArmorMaterials.VTURTLE, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> VTURTLE_BOOTS = ITEMS.register("vturtle_boots",
            () -> new ArmorItem(AQArmorMaterials.VTURTLE, ArmorItem.Type.BOOTS ,new Item.Properties()));

    public static final RegistryObject<Item> IRON_FISHING_ROD = ITEMS.register("iron_fishing_rod",
            () -> new FishingRodItem(new Item.Properties().stacksTo(1) .defaultDurability(64*3) .durability(64*3)));

    public static final RegistryObject<Item> GOLD_FISHING_ROD = ITEMS.register("gold_fishing_rod",
            () -> new FishingRodItem(new Item.Properties().stacksTo(1) .defaultDurability(64) .durability(64)));

    public static final RegistryObject<Item> DIAMOND_FISHING_ROD = ITEMS.register("diamond_fishing_rod",
            () -> new FishingRodItem(new Item.Properties().stacksTo(1) .defaultDurability(64*6) .durability(64*6)));

    public static final RegistryObject<Item> NETHERITE_FISHING_ROD = ITEMS.register("netherite_fishing_rod",
            () -> new FishingRodItem(new Item.Properties().stacksTo(1).defaultDurability(64*12).fireResistant().durability(64*12)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
