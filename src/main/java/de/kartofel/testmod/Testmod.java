package de.kartofel.testmod;

import de.kartofel.testmod.core.init.BlockInit;
import de.kartofel.testmod.core.init.ItemInit;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("testmod")
@Mod.EventBusSubscriber(modid = Testmod.Mod_ID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class Testmod {

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String Mod_ID ="testmod";

    public Testmod() {

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        BlockInit.BLOCKS.register(bus);
        ItemInit.ITEMS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block ->{
            event.getRegistry().register(new BlockItem(block, new Item.Properties().group(ItemGroup.REDSTONE))
                    .setRegistryName(block.getRegistryName()));
        } );
    }

}
