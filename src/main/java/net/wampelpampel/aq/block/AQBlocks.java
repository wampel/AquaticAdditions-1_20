package net.wampelpampel.aq.block;

import net.minecraft.client.resources.model.Material;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.MagmaBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.wampelpampel.aq.AquaticAdditions;
import net.wampelpampel.aq.item.AQItems;

import java.util.function.Supplier;

public class AQBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, AquaticAdditions.MOD_ID);

    //BLOCKS
    public static final RegistryObject<Block> SCUTE_BLOCK = registerBlock("scute_block",
            () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.BONE_BLOCK).requiresCorrectToolForDrops()
                    .strength(2f)));

    public static final RegistryObject<Block> TURTLE_BLOCK = registerBlock("turtle_block",
            () -> new Block(BlockBehaviour.Properties.of().requiresCorrectToolForDrops()
                    .strength(2f)));
    //---------------------------------
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return AQItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
