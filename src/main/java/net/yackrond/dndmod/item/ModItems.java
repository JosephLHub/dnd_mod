package net.yackrond.dndmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yackrond.dndmod.DnDMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DnDMod.MOD_ID);

    public static final RegistryObject<Item> MINIATURE_CLOAK = ITEMS.register("miniature_cloak", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TINY_BELL = ITEMS.register("tiny_bell", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
