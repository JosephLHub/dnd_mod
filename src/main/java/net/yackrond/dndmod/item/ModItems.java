package net.yackrond.dndmod.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yackrond.dndmod.DnDMod;
import net.yackrond.dndmod.block.ModBlocks;
import net.yackrond.dndmod.item.custom.*;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DnDMod.MOD_ID);
    public static final RegistryObject<Item> MINIATURE_CLOAK = ITEMS.register("miniature_cloak", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§eResistance"),List.of(1), List.of("§eAbjuration")));
    public static final RegistryObject<Item> MINIATURE_BELL = ITEMS.register("miniature_bell", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§eAlarm"), List.of(1), List.of("§eAbjuration")));
    public static final RegistryObject<Item> SILVER_WIRE = ITEMS.register("silver_wire", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§eAlarm"), List.of(1), List.of("§eAbjuration")));
    public static final RegistryObject<Item> CURED_LEATHER = ITEMS.register("cured_leather", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§eMage Armour"), List.of(1), List.of("§eAbjuration")));
    public static final RegistryObject<Item> HOLY_WATER_BOTTLE = ITEMS.register("holy_water_bottle", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§eProtection from Evil and Good","§eMagic Circle", "§eDispel Evil and Good", "§2Wind Walk", "§2Regenerate"),
            List.of(1, 3, 5, 6, 7),
            List.of("§eAbjuration", "§eAbjuration", "§eAbjuration", "§2Transmutation", "§2Transmutation")));
    public static final RegistryObject<Item> SILVER_MIRROR = ITEMS.register("silver_mirror", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HOLY_TEXT = ITEMS.register("holy_text", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROPE = ITEMS.register("rope", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> CLOTH_STRIP = ITEMS.register("cloth_strip", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MISTLETOE_ASHES = ITEMS.register("mistletoe_ashes", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PAIR_OF_PLATINUM_RINGS = ITEMS.register("pair_of_platinum_rings", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INCENSE = ITEMS.register("incense", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> DISTASTEFUL_ITEM = ITEMS.register("distasteful_item", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> LEATHER_STRAP = ITEMS.register("leather_strap", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BROKEN_PORTAL_KEY = ITEMS.register("broken_portal_key", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PORTAL_KEY = ITEMS.register("portal_key", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> LEAD_SHEET = ITEMS.register("lead_sheet", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> COTTON = ITEMS.register("holy_text", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> CLOTH = ITEMS.register("cloth", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> DRUIDIC_MISTLETOE = ITEMS.register("druidic_mistletoe", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> PLATINUM_PLATED_DRAGON_SCALE = ITEMS.register("platinum_plated_dragon_scale", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> RARE_INCENSE = ITEMS.register("rare_incense", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> GLASS_BEAD = ITEMS.register("glass_bead", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> CRYSTAL_BEAD = ITEMS.register("crystal_bead", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> BURNING_INCENSE = ITEMS.register("burning_incense", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> VIAL_OF_BRIMSTONE_AND_OIL = ITEMS.register("vial_of_brimstone_and_oil", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> KNOTTED_STRING = ITEMS.register("knotted_string", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> VIAL_OF_UMBER_HULK_BLOOD = ITEMS.register("vial_of_umber_hulk_blood", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> SILVER_ROD = ITEMS.register("silver_rod", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> QUICKSILVER_BOTTLE = ITEMS.register("quicksilver_bottle", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> PHOSPHORUS = ITEMS.register("phosphorus", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OPAL = ITEMS.register("opal", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> MINIATURE_RELIQUARY = ITEMS.register("miniature_reliquary", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> SACRED_RELIC = ITEMS.register("sacred_relic", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> VELLUM_DEPICTION = ITEMS.register("vellum_depiction", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> CARVED_STATUETTE = ITEMS.register("carved_statuette", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> MITHRIL_ORB = ITEMS.register("mithril_orb", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> MITHRIL_CHAIN = ITEMS.register("mithril_chain", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> MINIATURE_JADE_PRISON = ITEMS.register("miniature_jade_prison", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> SOPORIFIC_HERBS = ITEMS.register("soporific_herbs", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> FLEA_IN_BOTTLE = ITEMS.register("flea_in_jar", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> HERBS = ITEMS.register("herbs", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> BRASS_BRAZIER = ITEMS.register("brass_brazier", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> PORK_RIND = ITEMS.register("pork_rind", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> BUTTER = ITEMS.register("butter", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> VIAL_OF_WATER = ITEMS.register("vial_of_water", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> VIAL_OF_QUICKSILVER = ITEMS.register("vial_of_quicksilver", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> GLASS_SLIVER = ITEMS.register("glass_sliver", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> DUST = ITEMS.register("dust", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> BRIMSTONE = ITEMS.register("brimstone", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> DECK_OF_CARDS = ITEMS.register("deck_of_cards", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> FUR = ITEMS.register("fur", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> FISH_TAIL = ITEMS.register("fish_tail", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> GILDED_ACORN = ITEMS.register("gilded_acorn", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> PICKLED_TENTACLE = ITEMS.register("pickled_tentacle", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> TENTACLE = ITEMS.register("tentacle", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> HOLY_SYMBOL = ITEMS.register("fur", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROTTEN_EGG = ITEMS.register("rotten_egg", () -> new Item(new Item.Properties().food(ModFoods.ROTTEN_EGG)));
    //public static final RegistryObject<Item> SKUNK_CABBAGE = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> GILDED_FLOWER = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> VIAL_OF_FRESH_HUMANOID_BLOOD = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> CRYSTAL_VIAL_OF_TEARS = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> HOLLY_BERRY = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> MINERAL_GOODS = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> SILVER_WHISTLE = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> PLATINUM_INLAID_VIAL_OF_EYEBALL = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> ORNATE_STONE = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> PEBBLE = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> ASH = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> GOLD_INLAID_VIAL = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> GRAIN = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> TALLOW = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> GOLDEN_RELIQUARY = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> DRAGON_INSIGNIA = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> GEM_INFUSED_RARE_INK = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> GEM_INFUSED_RARE_CHALK = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> GEM_ENCRUSTED_BOWL = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> RUBY_VIAL_OF_HUMANOID_BLOOD = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> THORNS = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> MINIATURE_IVORY_PORTAL = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> MINIATURE_SILVER_SPOON = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> ATTUNED_FORKED_METAL_ROD = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> CRYSTAL_PRISM = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> CLOTH_WRAPPED_FUR = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> SALT = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> PEARL = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> OWL_FEATHER = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> MARKED_STICKS = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> MARKED_BONES = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> COPPER_PIECE = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> WHITE_PEARL = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> BLOODHOUND_FUR = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> FORKED_TWIG = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> TALC = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> RAZORVINE_LEAF = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> GEM_ENCRUSTED_HORN = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> GLASS_EYE = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> SKUNK_CABBAGE = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> SKUNK_CABBAGE = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> SKUNK_CABBAGE = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> SKUNK_CABBAGE = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> SKUNK_CABBAGE = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> SKUNK_CABBAGE = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> SKUNK_CABBAGE = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> SKUNK_CABBAGE = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> SKUNK_CABBAGE = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> SKUNK_CABBAGE = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_PLATINUM = ITEMS.register("raw_platinum", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> PLATINUM_CHAIN = ITEMS.register("platinum_chain", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ADAMANT_INGOT = ITEMS.register("adamant_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ADAMANT_NUGGET = ITEMS.register("adamant_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ADAMANT = ITEMS.register("raw_adamant", () -> new Item(new Item.Properties()));
    //public static final RegistryObject<Item> ADAMANT_CHAIN = ITEMS.register("adamant_chain", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POWDERED_COPPER = ITEMS.register("powdered_copper", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHRYSOLITE = ITEMS.register("chrysolite", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SUNSTONE = ITEMS.register("sunstone", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> POWDERED_DIAMOND = ITEMS.register("powdered_diamond", () -> new SpellComponentItem(new Item.Properties(),
                    List.of("§eGlyph of Warding", "§eNondetection", "§eStoneskin", "§eGreater Restoration", "§eSymbol", "§2Sequester"),
                    List.of(3, 3, 4, 5, 7, 7),
                    List.of("§eAbjuration", "§eAbjuration", "§eAbjuration", "§eAbjuration", "§eAbjuration", "§2Transmutation")));
    public static final RegistryObject<Item> POWDERED_IRON = ITEMS.register("powdered_iron", () -> new SpellComponentItem(new Item.Properties(),
                    List.of("§eProtection from Evil and Good", "§eMagic Circle", "§eDispel Evil and Good", "§eAntimagic Field", "§9Flaming Sphere", "§4Gravity Fissure", "§2Enlarge/Reduce", "§2Reverse Gravity"),
                    List.of(1, 3, 5, 8, 2, 6, 2, 2, 7),
                    List.of("§eAbjuration", "§eAbjuration", "§eAbjuration", "§eAbjuration", "§9Conjuration", "§4Evocation", "§2Transmutation", "§2Transmutation")));
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
    public static final RegistryObject<Item> POWDERED_SUNSTONE = ITEMS.register("powdered_sunstone", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector", () -> new MetalDetectorItem(new Item.Properties().durability(100)));

    public static final RegistryObject<Item> OIL_BOTTLE = ITEMS.register("oil_bottle", () -> new FuelItem(new Item.Properties(), 3200));

    public static final RegistryObject<Item> YEW_SIGN = ITEMS.register("yew_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.YEW_SIGN.get(), ModBlocks.YEW_WALL_SIGN.get()));
    public static final RegistryObject<Item> YEW_HANGING_SIGN = ITEMS.register("yew_hanging_sign", () -> new HangingSignItem(ModBlocks.YEW_HANGING_SIGN.get(), ModBlocks.YEW_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

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
