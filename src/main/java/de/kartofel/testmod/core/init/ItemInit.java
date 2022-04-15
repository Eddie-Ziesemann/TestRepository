package de.kartofel.testmod.core.init;

import de.kartofel.testmod.Testmod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Testmod.Mod_ID);

    public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item", ()-> new Item(new Item.Properties().group(ItemGroup.REDSTONE)));
}
