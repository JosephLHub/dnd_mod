package net.yackrond.dndmod.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yackrond.dndmod.DnDMod;
import net.yackrond.dndmod.item.custom.FuelItem;
import net.yackrond.dndmod.item.custom.MetalDetectorItem;
import net.yackrond.dndmod.item.custom.ModToolTiers;
import net.yackrond.dndmod.item.custom.SpellComponentItem;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DnDMod.MOD_ID);
    public static final RegistryObject<Item> MINIATURE_CLOAK = ITEMS.register("miniature_cloak", () -> new SpellComponentItem(new Item.Properties(), List.of("§eResistance"), List.of(1), List.of("§eAbjuration")));
    public static final RegistryObject<Item> TINY_BELL = ITEMS.register("tiny_bell", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> FINE_SILVER_WIRE = ITEMS.register("fine_silver_wire", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> CURED_LEATHER = ITEMS.register("cured_leather", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> HOLY_WATER_BOTTLE = ITEMS.register("holy_water_bottle", () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_PLATINUM = ITEMS.register("raw_platinum", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ADAMANT_INGOT = ITEMS.register("adamant_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ADAMANT_NUGGET = ITEMS.register("adamant_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ADAMANT = ITEMS.register("raw_adamant", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHRYSOLITE = ITEMS.register("chrysolite", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> POWDERED_DIAMOND = ITEMS.register("powdered_diamond", () -> new SpellComponentItem(new Item.Properties(),
                    List.of("§eGlyph of Warding", "§eNondetection", "§eStoneskin", "§eGreater Restoration", "§eSymbol", "§6Sequester"),
                    List.of(3, 3, 4, 5, 7, 7),
                    List.of("§eAbjuration", "§eAbjuration", "§eAbjuration", "§eAbjuration", "§eAbjuration", "§6Transmutation")));
    public static final RegistryObject<Item> POWDERED_IRON = ITEMS.register("powdered_iron", () -> new SpellComponentItem(new Item.Properties(),
                    List.of("§eProtection from Evil and Good", "§eMagic Circle", "§eDispel Evil and Good", "§eAntimagic Field", "§9Flaming Sphere", "§4Gravity Fissure", "§6Enlarge/Reduce", "§6Reverse Gravity"),
                    List.of(1, 3, 5, 8, 2, 6, 2, 2, 7),
                    List.of("§eAbjuration", "§eAbjuration", "§eAbjuration", "§eAbjuration", "§9Conjuration", "§4Evocation", "§6Transmutation", "§6Transmutation", "§6Transmutation")));
    public static final RegistryObject<Item> POWDERED_GOLD = ITEMS.register("powdered_gold", () -> new SpellComponentItem(new Item.Properties(),
                    List.of("§eArcane Lock", "§6Immovable Object"),
                    List.of(2, 2),
                    List.of("§eAbjuration", "§6Transmutation")));
    public static final RegistryObject<Item> POWDERED_SILVER = ITEMS.register("powdered_silver", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POWDERED_PLATINUM = ITEMS.register("powdered_platinum", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POWDERED_ADAMANT = ITEMS.register("powdered_adamant", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POWDERED_RUBY = ITEMS.register("powdered_ruby", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POWDERED_SAPPHIRE = ITEMS.register("powdered_sapphire", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POWDERED_CHRYSOLITE = ITEMS.register("powdered_chrysolite", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POWDERED_EMERALD = ITEMS.register("powdered_emerald", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector", () -> new MetalDetectorItem(new Item.Properties().durability(100)));

    public static final RegistryObject<Item> ROTTEN_EGG = ITEMS.register("rotten_egg", () -> new Item(new Item.Properties().food(ModFoods.ROTTEN_EGG)));

    public static final RegistryObject<Item> OIL_BOTTLE = ITEMS.register("oil_bottle", () -> new FuelItem(new Item.Properties(), 3200));

//    public static final RegistryObject<Item> MODDED_SWORD = ITEMS.register("modded_sword",
//            () -> new SwordItem(ModToolTiers.ADAMANTIUM, 4, 2, new Item.Properties()));
//    public static final RegistryObject<Item> MODDED_PICKAXE = ITEMS.register("modded_pickaxe",
//            () -> new PickaxeItem(ModToolTiers.ADAMANTIUM, 4, 2, new Item.Properties()));
//    public static final RegistryObject<Item> MODDED_AXE = ITEMS.register("modded_axe",
//            () -> new AxeItem(ModToolTiers.ADAMANTIUM, 4, 2, new Item.Properties()));
//    public static final RegistryObject<Item> MODDED_SHOVEL = ITEMS.register("modded_shovel",
//            () -> new ShovelItem(ModToolTiers.ADAMANTIUM, 4, 2, new Item.Properties()));
//    public static final RegistryObject<Item> MODDED_HOE = ITEMS.register("modded_hoe",
//            () -> new HoeItem(ModToolTiers.ADAMANTIUM, 4, 2, new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
