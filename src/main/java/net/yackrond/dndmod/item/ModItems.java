package net.yackrond.dndmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yackrond.dndmod.DnDMod;
import net.yackrond.dndmod.item.custom.FuelItem;
import net.yackrond.dndmod.item.custom.MetalDetectorItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DnDMod.MOD_ID);
    public static final RegistryObject<Item> MINIATURE_CLOAK = ITEMS.register("miniature_cloak", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TINY_BELL = ITEMS.register("tiny_bell", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_PLATINUM = ITEMS.register("raw_platinum", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ADAMANT_INGOT = ITEMS.register("adamant_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ADAMANT = ITEMS.register("raw_adamant", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ADAMANT_NUGGET = ITEMS.register("adamant_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POWDERED_DIAMOND = ITEMS.register("powdered_diamond", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POWDERED_IRON = ITEMS.register("powdered_iron", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POWDERED_GOLD = ITEMS.register("powdered_gold", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POWDERED_SILVER = ITEMS.register("powdered_silver", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POWDERED_PLATINUM = ITEMS.register("powdered_platinum", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POWDERED_ADAMANT = ITEMS.register("powdered_adamant", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector", () -> new MetalDetectorItem(new Item.Properties().durability(100)));
    public static final RegistryObject<Item> ROTTEN_EGG = ITEMS.register("rotten_egg", () -> new Item(new Item.Properties().food(ModFoods.ROTTEN_EGG)));
    public static final RegistryObject<Item> OIL_BOTTLE = ITEMS.register("oil_bottle", () -> new FuelItem(new Item.Properties(), 3200));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
