package net.yackrond.dndmod.item;

import net.minecraft.world.food.Foods;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Blocks;
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
    public static final RegistryObject<Item> SILVER_MIRROR = ITEMS.register("silver_mirror", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§eSanctuary", "§4Wall of Light"),
            List.of(1, 5),
            List.of("§eAbjuration", "§4Evocation")));
    public static final RegistryObject<Item> HOLY_TEXT = ITEMS.register("holy_text", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§eShield of Faith"), List.of(1), List.of("§eAbjuration")));
    public static final RegistryObject<Item> ROPE = ITEMS.register("rope", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§eSnare"), List.of(1), List.of("§eAbjuration")));
    public static final RegistryObject<Item> CLOTH_STRIP = ITEMS.register("cloth_strip", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§eAid", "§2Gaseous Form"),
            List.of(2, 3),
            List.of("§eAbjuration", "§2Transmutation")));
    public static final RegistryObject<Item> MISTLETOE_ASHES = ITEMS.register("mistletoe_ashes", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§ePass Without Trace"), List.of(2), List.of("§eAbjuration")));
    public static final RegistryObject<Item> LINKED_PLATINUM_RINGS = ITEMS.register("linked_platinum_rings", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§eWarding Bond"), List.of(2), List.of("§eAbjuration")));
    public static final RegistryObject<Item> INCENSE = ITEMS.register("incense", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§eGlyph of Warding", "§9Find Familiar", "§bDivination", "§bCommune", "§4Hallow"),
            List.of(3, 1, 4, 5, 5, 5),
            List.of("§eAbjuration", "§9Conjuration", "§bDivination", "§bDivination", "§4Evocation")));
    //public static final RegistryObject<Item> DISTASTEFUL_ITEM = ITEMS.register("distasteful_item", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEATHER_STRAP = ITEMS.register("leather_strap", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§eFreedom of Movement"), List.of(4), List.of("§eAbjuration")));
    public static final RegistryObject<Item> BROKEN_PORTAL_KEY = ITEMS.register("broken_portal_key", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§eGate Seal"), List.of(4), List.of("§eAbjuration")));
    public static final RegistryObject<Item> PORTAL_KEY = ITEMS.register("portal_key", () -> new Item(new Item.Properties())); //TODO: Make this fancy
    public static final RegistryObject<Item> LEAD_SHEET = ITEMS.register("lead_sheet", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§eMordenkainen’s Private Sanctum"), List.of(4), List.of("§eAbjuration")));
    public static final RegistryObject<Item> COTTON = ITEMS.register("cotton", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§eMordenkainen’s Private Sanctum"), List.of(4), List.of("§eAbjuration")));
    public static final RegistryObject<Item> CLOTH = ITEMS.register("cloth", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§eMordenkainen’s Private Sanctum"), List.of(4), List.of("§eAbjuration")));
    public static final RegistryObject<Item> GOLD_TINGED_FULL_MOON_MISTLETOE = ITEMS.register("gold_tinged_full_moon_mistletoe", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§eDruid Grove"), List.of(6), List.of("§eAbjuration")));
    public static final RegistryObject<Item> PLATINUM_PLATED_DRAGON_SCALE = ITEMS.register("platinum_plated_dragon_scale", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§eFizban’s Platinum Shield"), List.of(6), List.of("§eAbjuration")));
    public static final RegistryObject<Item> RARE_INCENSE = ITEMS.register("rare_incense", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§eGlyph of Warding", "§eForbiddance", "§9Find Familiar", "§bDivination", "§bCommune", "§bLegend Lore", "§4Hallow"),
            List.of(3, 6, 1, 4, 5, 5, 5),
            List.of("§eAbjuration", "§eAbjuration", "§9Conjuration", "§bDivination", "§bDivination", "§bDivination", "§4Evocation")));
    public static final RegistryObject<Item> GLASS_ORB = ITEMS.register("glass_orb", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§eGlobe of Invulnerability", "§dFeeblemind"),
            List.of(6, 8),
            List.of("§eAbjuration", "§dEnchantment")));
    public static final RegistryObject<Item> AMETHYST_ORB = ITEMS.register("amethyst_orb", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§eGlobe of Invulnerability", "§dFeeblemind", "§4Leomund's Tiny Hut", "§4Otiluke's Freezing Sphere"),
            List.of(6, 8, 3, 6),
            List.of("§eAbjuration", "§dEnchantment", "§4Evocation", "§4Evocation")));
    public static final RegistryObject<Item> BURNING_INCENSE = ITEMS.register("burning_incense", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§eGlyph of Warding", "§eGuards and Wards", "§9Conjure Elemental", "§5Hypnotic Pattern", "§8Speak with Dead", "§2Control Weather"),
            List.of(3, 6, 5, 3, 3, 8),
            List.of("§eAbjuration", "§eAbjuration", "§9Conjuration", "§5Illusion", "§8Necromancy", "§2Transmutation")));
    public static final RegistryObject<Item> VIAL_OF_BRIMSTONE_AND_PITCH = ITEMS.register("vial_of_brimstone_and_pitch", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§eGuards and Wards"), List.of(6), List.of("§eAbjuration"))); //TODO: implement all vial contents with all types of vial, except unique contents with special vials
    public static final RegistryObject<Item> VIAL_OF_UMBER_HULK_BLOOD = ITEMS.register("vial_of_umber_hulk_blood", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§eGuards and Wards"), List.of(6), List.of("§eAbjuration")));
    public static final RegistryObject<Item> SILVER_ROD = ITEMS.register("silver_rod", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§eGuards and Wards"), List.of(6), List.of("§eAbjuration")));
    public static final RegistryObject<Item> QUICKSILVER_BOTTLE = ITEMS.register("quicksilver_bottle", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§eSymbol"), List.of(7), List.of("§eAbjuration")));
    public static final RegistryObject<Item> PHOSPHORUS = ITEMS.register("phosphorus", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§eSymbol", "§9Conjure Elemental", "§4Dancing Lights", "§4Fire Shield", "§4Wall of Fire"),
            List.of(7, 5, 0, 4, 4),
            List.of("§eAbjuration", "§9Conjuration", "§4Evocation", "§4Evocation", "§4Evocation")));
    public static final RegistryObject<Item> OPAL = ITEMS.register("opal", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§ePlanar Binding", "§eSymbol", "§dIncite Greed", "§2Darkvision"),
            List.of(5, 7, 3, 2),
            List.of("§eAbjuration", "§eAbjuration", "§dEnchantment", "§2Transmutation")));
    public static final RegistryObject<Item> VELLUM = ITEMS.register("vellum", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§eImprisonment"), List.of(9), List.of("§eAbjuration")));
    public static final RegistryObject<Item> MITHRIL_ORB = ITEMS.register("mithril_orb", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§eImprisonment"), List.of(9), List.of("§eAbjuration")));
    public static final RegistryObject<Item> MINIATURE_JADE_PRISON = ITEMS.register("miniature_jade_prison", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§eImprisonment"), List.of(9), List.of("§eAbjuration")));
    public static final RegistryObject<Item> SOPORIFIC_HERBS = ITEMS.register("soporific_herbs", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§eImprisonment"), List.of(9), List.of("§eAbjuration")));
    public static final RegistryObject<Item> ADAMANTINE_INGOT = ITEMS.register("adamantine_ingot", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§eInvulnerability"), List.of(9), List.of("§eAbjuration")));
    public static final RegistryObject<Item> FLEA_IN_BOTTLE = ITEMS.register("flea_in_bottle", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Infestation"), List.of(0), List.of("§9Conjuration")));
    public static final RegistryObject<Item> MIXED_HERBS = ITEMS.register("mixed_herbs", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Find Familiar","§4Hallow"),
            List.of(1, 5),
            List.of("§9Conjuration", "§9Evocation")));
    public static final RegistryObject<Item> BRASS_BRAZIER = ITEMS.register("brass_brazier", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Find Familiar"), List.of(1), List.of("§9Conjuration")));
    public static final RegistryObject<Item> TALLOW = ITEMS.register("tallow", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Grease", "§9Flaming Sphere", "§9Insect Plague"),
            List.of(1, 2, 5),
            List.of("§9Conjuration", "§9Conjuration", "§9Conjuration")));
    public static final RegistryObject<Item> BUTTER = ITEMS.register("butter", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Grease"), List.of(1), List.of("§9Conjuration")));
    public static final RegistryObject<Item> VIAL_OF_WATER = ITEMS.register("vial_of_water", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Ice Knife", "§9Sleet Storm", "§9Tidal Wave", "§9Watery Sphere", "§4Rime's Binding Ice", "§4Wall of Water", "§4Ice Storm", "§2Create or Destroy Water", "§2Control Water"),
            List.of(1, 3, 3, 4, 2, 3, 4, 1, 4),
            List.of("§9Conjuration", "§9Conjuration", "§9Conjuration", "§9Conjuration", "§4Evocation", "§4Evocation", "§4Evocation", "§2Transmutation", "§2Transmutation")));
    public static final RegistryObject<Item> VIAL_OF_QUICKSILVER = ITEMS.register("vial_of_quicksilver", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Tenser's Floating Disk", "§2Create Magen", "§2True Polymorph"),
            List.of(1, 7, 9),
            List.of("§9Conjuration", "§2Transmutation", "§2Transmutation")));
    public static final RegistryObject<Item> GLASS_SHARD = ITEMS.register("glass_shard", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Cloud of Daggers"), List.of(2), List.of("§9Conjuration")));
    public static final RegistryObject<Item> DUST = ITEMS.register("dust", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Dust Devil", "§9Sleet Storm", "§4Ice Storm", "§2Control Water", "§2Disintegrate"),
            List.of(2, 3, 4, 4, 6),
            List.of("§9Conjuration", "§9Conjuration", "§4Evocation", "§2Transmutation", "§2Transmutation")));
    public static final RegistryObject<Item> BRIMSTONE = ITEMS.register("brimstone", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Flaming Sphere", "§9Conjure Elemental", "§4Flame Strike"),
            List.of(2, 5, 5),
            List.of("§9Conjuration", "§9Conjuration", "§4Evocation")));
    public static final RegistryObject<Item> DECK_OF_CARDS = ITEMS.register("deck_of_cards", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Spray of Cards"), List.of(2), List.of("§9Conjuration")));
    public static final RegistryObject<Item> FOX_FUR = ITEMS.register("fox_fur", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Summon Beast", "§4Lightning Bolt", "§4Chain Lightning", "§2Enhance Ability"),
            List.of(2, 3, 6, 2),
            List.of("§9Conjuration", "§4Evocation", "§4Evocation", "§2Transmutation")));
    public static final RegistryObject<Item> FISH_TAIL = ITEMS.register("fish_tail", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Summon Beast"), List.of(2), List.of("§9Conjuration")));
    public static final RegistryObject<Item> GILDED_ACORN = ITEMS.register("gilded_acorn", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Summon Beast"), List.of(2), List.of("§9Conjuration")));
    public static final RegistryObject<Item> PICKLED_TENTACLE = ITEMS.register("pickled_tentacle", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Hunger of Hadar", "§9Summon Aberration"),
            List.of(3, 4),
            List.of("§9Conjuration", "§9Conjuration")));
    public static final RegistryObject<Item> TENTACLE = ITEMS.register("tentacle", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Evard's Black Tentacles"), List.of(4), List.of("§9Conjuration")));
    public static final RegistryObject<Item> HOLY_SYMBOL = ITEMS.register("holy_symbol", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Spirit Guardians", "§9Temple of the Gods", "§4Word of Radiance"),
            List.of(3, 7, 0),
            List.of("§9Conjuration", "§9Conjuration", "§4Evocation")));
    public static final RegistryObject<Item> ROTTEN_EGG = ITEMS.register("rotten_egg", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Stinking Cloud", "§4Tasha's Caustic Brew"),
            List.of(3, 1),
            List.of("§9Conjuration", "§4Evocation"))); //TODO: make SpellFood class
    public static final RegistryObject<Item> SKUNK_CABBAGE = ITEMS.register("skunk_cabbage", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Stinking Cloud"), List.of(3), List.of("§9Conjuration")));
    public static final RegistryObject<Item> GILDED_FLOWER = ITEMS.register("gilded_flower", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Summon Fey"), List.of(3), List.of("§9Conjuration")));
    public static final RegistryObject<Item> VIAL_OF_FRESH_BLOOD = ITEMS.register("vial_of_fresh_blood", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Summon Lesser Demons", "§9Summon Greater Demon", "§dBane", "§4Dark Star", "§8Animate Dead"),
            List.of(3, 4, 1, 8, 3),
            List.of("§9Conjuration", "§9Conjuration", "§dEnchantment", "§4Evocation", "§8Necromancy")));
    public static final RegistryObject<Item> VIAL_OF_BLOOD = ITEMS.register("vial_of_blood", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§dBane", "§4Dark Star", "§8Animate Dead"),
            List.of(1, 8, 3),
            List.of("§dEnchantment", "§4Evocation", "§8Necromancy")));
    public static final RegistryObject<Item> AMETHYST_VIAL_OF_TEARS = ITEMS.register("amethyst_vial_of_tears", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Summon Shadowspawn"), List.of(3), List.of("§9Conjuration")));
    //public static final RegistryObject<Item> MINERAL_GOODS = ITEMS.register("skunk_cabbage", () -> new Item(new Item.Properties())); //TODO: figure out
    public static final RegistryObject<Item> ORNATE_STONE = ITEMS.register("ornate_stone", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Summon Construct"), List.of(4), List.of("§9Conjuration")));
    public static final RegistryObject<Item> LOCKBOX = ITEMS.register("lockbox", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Summon Construct"), List.of(4), List.of("§9Conjuration")));
    public static final RegistryObject<Item> SILVER_WHISTLE = ITEMS.register("silver_whistle", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Mordenkainen's Faithful Hound"), List.of(4), List.of("§9Conjuration")));
    public static final RegistryObject<Item> PLATINUM_VIAL_OF_EYEBALL = ITEMS.register("platinum_vial_of_eyeball", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Summon Aberration"), List.of(4), List.of("§9Conjuration")));
    public static final RegistryObject<Item> MINIATURE_ORNATE_CHEST = ITEMS.register("miniature_ornate_chest", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Leomund's Secret Chest"), List.of(4), List.of("§9Conjuration")));
    public static final RegistryObject<Item> PEBBLE = ITEMS.register("pebble", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Summon Elemental"), List.of(4), List.of("§9Conjuration")));
    public static final RegistryObject<Item> ASH = ITEMS.register("ash", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Summon Elemental", "§bComprehend Languages", "§2Create Homunculus"),
            List.of(4, 1, 6),
            List.of("§9Conjuration", "§bDivination", "§2Transmutation")));
    public static final RegistryObject<Item> GOLD_VIAL = ITEMS.register("gold_vial", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Summon Elemental"), List.of(4), List.of("§9Conjuration")));
    public static final RegistryObject<Item> GRAIN = ITEMS.register("grain", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Insect Plague"), List.of(5), List.of("§9Conjuration")));
    public static final RegistryObject<Item> RELIQUARY = ITEMS.register("reliquary", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§eHoly Aura", "§9Summon Celestial"),
            List.of(8, 5),
            List.of("§eAbjuration", "§9Conjuration")));
    //TODO: implement a relic as part of the crafting recipe
    public static final RegistryObject<Item> DRAGON_INSIGNIA = ITEMS.register("dragon_insignia", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Summon Draconic Spirit"), List.of(5), List.of("§9Conjuration")));
    public static final RegistryObject<Item> GEM_INFUSED_INK = ITEMS.register("gem_infused_ink", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Teleportation Circle"), List.of(5), List.of("§9Conjuration")));
    public static final RegistryObject<Item> GEM_INFUSED_CHALK = ITEMS.register("gem_infused_chalk", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Teleportation Circle"), List.of(5), List.of("§9Conjuration")));
    public static final RegistryObject<Item> GEM_ENCRUSTED_BOWL = ITEMS.register("gem_encrusted_bowl", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Heroes' Feast"), List.of(6), List.of("§9Conjuration")));
    public static final RegistryObject<Item> RUBY_VIAL_OF_BLOOD = ITEMS.register("ruby_vial_of_blood", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Summon Fiend", "§dBane", "§4Dark Star", "§8Animate Dead"),
            List.of(6, 1, 8, 3),
            List.of("§9Conjuration", "§dEnchantment", "§4Evocation", "§8Necromancy")));
    public static final RegistryObject<Item> RUBY_VIAL_OF_FRESH_BLOOD = ITEMS.register("ruby_vial_of_fresh_blood", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Summon Lesser Demons", "§9Summon Greater Demon", "§9Summon Fiend", "§dBane", "§4Dark Star", "§8Animate Dead"),
            List.of(3, 4, 6, 1, 8, 3),
            List.of("§9Conjuration", "§9Conjuration", "§9Conjuration", "§dEnchantment", "§4Evocation", "§8Necromancy")));
    public static final RegistryObject<Item> THORNY_TWIG = ITEMS.register("thorny_twig", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Wall of Thorns", "§2Thorn Whip", "§2Spike Growth"),
            List.of(6, 0, 2),
            List.of("§9Conjuration", "§2Transmutation", "§2Transmutation")));
    public static final RegistryObject<Item> MINIATURE_IVORY_PORTAL = ITEMS.register("miniature_ivory_portal", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Mordenkainen's Magnificent Mansion"), List.of(7), List.of("§9Conjuration")));
    public static final RegistryObject<Item> SILVER_SPOON = ITEMS.register("silver_spoon", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Mordenkainen's Magnificent Mansion"), List.of(7), List.of("§9Conjuration")));
    public static final RegistryObject<Item> OVERWORLD_ATTUNED_TUNING_FORK = ITEMS.register("overworld_attuned_tuning_fork", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Plane Shift", "§bFind the Path"),
            List.of(7, 6),
            List.of("§9Conjuration", "§bDivination")));
    public static final RegistryObject<Item> NETHER_ATTUNED_TUNING_FORK = ITEMS.register("nether_attuned_tuning_fork", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Plane Shift", "§bFind the Path"),
            List.of(7, 6),
            List.of("§9Conjuration", "§bDivination")));
    public static final RegistryObject<Item> END_ATTUNED_TUNING_FORK = ITEMS.register("end_attuned_tuning_fork", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Plane Shift", "§bFind the Path"),
            List.of(7, 6),
            List.of("§9Conjuration", "§bDivination")));
    public static final RegistryObject<Item> AMETHYST_PRISM = ITEMS.register("amethyst_prism", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Reality Break"), List.of(8), List.of("§9Conjuration")));
    public static final RegistryObject<Item> DIAMOND_PRISM = ITEMS.register("diamond_prism", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Reality Break"), List.of(8), List.of("§9Conjuration")));
    public static final RegistryObject<Item> EMERALD_PRISM = ITEMS.register("emerald_prism", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Reality Break"), List.of(8), List.of("§9Conjuration")));
    public static final RegistryObject<Item> RUBY_PRISM = ITEMS.register("ruby_prism", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Reality Break"), List.of(8), List.of("§9Conjuration")));
    public static final RegistryObject<Item> SAPPHIRE_PRISM = ITEMS.register("sapphire_prism", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Reality Break"), List.of(8), List.of("§9Conjuration")));
    public static final RegistryObject<Item> CLOTH_WRAPPED_FUR = ITEMS.register("cloth_wrapped_fur", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§bBeast Bond"), List.of(1), List.of("§bDivination")));
    public static final RegistryObject<Item> SALT = ITEMS.register("salt", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§bComprehend Languages", "§8Gentle Repose"),
            List.of(1, 2),
            List.of("§bDivination", "§8Necromancy")));
    public static final RegistryObject<Item> PEARL = ITEMS.register("pearl", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§ePlanar Binding", "§bIdentify", "§bFortune's Favour"),
            List.of(5, 1, 2),
            List.of("§eAbjuration", "§bDivination", "§bDivination")));
    public static final RegistryObject<Item> OWL_FEATHER = ITEMS.register("owl_feather", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Summon Beast", "§bIdentify", "§dTasha's Hideous Laughter", "§2Feather Fall", "§2Enhance Ability", "§2Fly"),
            List.of(2, 1, 1, 1, 2, 3),
            List.of("§9Conjuration", "§bDivination", "§dEnchantment", "§2Transmutation", "§2Transmutation", "§2Transmutation")));
    public static final RegistryObject<Item> MARKED_STICK = ITEMS.register("marked_stick", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§bAugury"), List.of(2), List.of("§bDivination")));
    public static final RegistryObject<Item> MARKED_BONE = ITEMS.register("marked_bone", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§bAugury"), List.of(2), List.of("§bDivination")));
    public static final RegistryObject<Item> COPPER_PIECE = ITEMS.register("copper_piece", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§bDetect Thoughts", "§dJim's Glowing Coin", "§8Gentle Repose"),
            List.of(2, 2, 2),
            List.of("§bDivination", "§dEnchantment", "§8Necromancy")));
    public static final RegistryObject<Item> BLOODHOUND_FUR = ITEMS.register("bloodhound_fur", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Summon Beast", "§bLocate Animals or Plants", "§bLocate Creature", "§4Lightning Bolt", "§4Chain Lightning", "§2Enhance Ability"),
            List.of(2, 2, 4, 3, 6, 2),
            List.of("§9Conjuration", "§bDivination", "§bDivination", "§4Evocation", "§4Evocation", "§2Transmutation")));
    public static final RegistryObject<Item> TUNING_FORK = ITEMS.register("tuning_fork", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§bLocate Object", "§bFind the Path"),
            List.of(2, 6),
            List.of("§bDivination", "§bDivination"))); //TODO: for 'Find the Path' and other spells requiring a location/monster-specific item to produce a specific effect, ignore as SpellComponent and handle within spell logic
    public static final RegistryObject<Item> TALC = ITEMS.register("talc", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§bSee Invisibility"), List.of(2), List.of("§bDivination")));
    public static final RegistryObject<Item> GEM_ENCRUSTED_HORN = ITEMS.register("gem_encrusted_horn", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§bClairvoyance"), List.of(3), List.of("§bDivination")));
    public static final RegistryObject<Item> GLASS_EYE = ITEMS.register("glass_eye", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§bClairvoyance"), List.of(3), List.of("§bDivination")));
    public static final RegistryObject<Item> MINIATURE_CLAY_ZIGGURAT = ITEMS.register("miniature_clay_ziggurat", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§bTongues"), List.of(3), List.of("§bDivination")));
    public static final RegistryObject<Item> BAT_FUR = ITEMS.register("bat_fur", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Summon Beast", "§bArcane Eye", "§4Darkness", "§4Lightning Bolt", "§4Chain Lightning", "§2Enhance Ability"),
            List.of(2, 4, 3, 6, 2),
            List.of("§9Conjuration", "§bDivination", "§4Evocation", "§4Evocation", "§4Evocation", "§2Transmutation")));
    public static final RegistryObject<Item> VIAL_OF_HOLY_WATER = ITEMS.register("vial_of_holy_water", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§bForbiddance", "§bCommune", "§dBless", "§8True Resurrection"),
            List.of(6, 5, 1, 9),
            List.of("§eAbjuration", "§bDivination", "§dEnchantment", "§8Necromancy")));
    public static final RegistryObject<Item> VIAL_OF_UNHOLY_WATER = ITEMS.register("vial_of_unholy_water", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§bCommune"), List.of(5), List.of("§bDivination")));
    public static final RegistryObject<Item> IVORY_STRIP = ITEMS.register("ivory_strip", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§bLegend Lore"), List.of(5), List.of("§bDivination")));
    public static final RegistryObject<Item> OWL_EGG = ITEMS.register("owl_egg", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§bRary's Telepathic Bond"), List.of(5), List.of("§bDivination")));
    public static final RegistryObject<Item> HUMMINGBIRD_EGG = ITEMS.register("hummingbird_egg", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§bRary's Telepathic Bond"), List.of(5), List.of("§bDivination")));
    public static final RegistryObject<Item> FOCUS = ITEMS.register("focus", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§bScrying"), List.of(5), List.of("§bDivination")));
    public static final RegistryObject<Item> VIAL_OF_EYE_OINTMENT = ITEMS.register("vial_of_eye_ointment", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§bTrue Seeing"), List.of(6), List.of("§bDivination")));
    public static final RegistryObject<Item> HUMMINGBIRD_FEATHER = ITEMS.register("hummingbird_feather", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§9Summon Beast", "§bForesight", "§dTasha's Hideous Laughter", "§4Wind Wall", "§2Feather Fall", "§2Enhance Ability", "§2Fly"),
            List.of(2, 9, 1, 1, 2, 3),
            List.of("§9Conjuration", "§bDivination", "§dEnchantment", "§4Evocation", "§2Transmutation", "§2Transmutation", "§2Transmutation")));
    public static final RegistryObject<Item> PETRIFIED_NEWT_EYE = ITEMS.register("petrified_newt_eye", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§dHex"), List.of(1), List.of("§dEnchantment")));
    public static final RegistryObject<Item> ROSE_PETAL = ITEMS.register("rose_petal", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§dSleep"), List.of(1), List.of("§dEnchantment")));
    public static final RegistryObject<Item> CRICKET_IN_BOTTLE = ITEMS.register("cricket_in_bottle", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§dSleep", "§2Jump"),
            List.of(1, 1),
            List.of("§dEnchantment", "§2Transmutation")));
    public static final RegistryObject<Item> TINY_TART = ITEMS.register("tiny_tart", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§dTasha's Hideous Laughter"), List.of(1), List.of("§dEnchantment")));
    public static final RegistryObject<Item> SILVER_PIECE = ITEMS.register("silver_piece", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§dJim's Glowing Coin"), List.of(2), List.of("§dEnchantment")));
    public static final RegistryObject<Item> GOLD_PIECE = ITEMS.register("gold_piece", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§dGift of Gab", "§dJim's Glowing Coin", "§4Jim's Magic Missile"),
            List.of(2, 2, 1),
            List.of("§dEnchantment", "§dEnchantment", "§4Evocation")));
    public static final RegistryObject<Item> PLATINUM_PIECE = ITEMS.register("platinum_piece", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§dJim's Glowing Coin"), List.of(2), List.of("§dEnchantment")));
    public static final RegistryObject<Item> SNAKE_TONGUE = ITEMS.register("snake_tongue", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§dSuggestion", "§dMass Suggestion"),
            List.of(2, 6),
            List.of("§dEnchantment", "§dEnchantment")));
    public static final RegistryObject<Item> VIAL_OF_SWEET_OIL = ITEMS.register("vial_of_sweet_oil", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§dSuggestion", "§dMass Suggestion"),
            List.of(2, 6),
            List.of("§dEnchantment", "§dEnchantment")));
    //public static final RegistryObject<Item> ROGUE_CARD = ITEMS.register("rogue_card", () -> new SpellComponentItem(new Item.Properties(),
    //            List.of("§dEnchantment"), List.of(5), List.of("§dEnchantment")));
    public static final RegistryObject<Item> ACORN = ITEMS.register("acorn", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§dConfusion"), List.of(4), List.of("§dEnchantment")));
    public static final RegistryObject<Item> VINEGAR_SOAKED_SALT = ITEMS.register("vinegar_soaked_salt", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§dAntipathy/Sympathy"), List.of(8), List.of("§dEnchantment")));
    public static final RegistryObject<Item> VIAL_OF_HONEY = ITEMS.register("vial_of_honey", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§dAntipathy/Sympathy"), List.of(8), List.of("§dEnchantment")));
    public static final RegistryObject<Item> CLAY_ORB = ITEMS.register("clay_orb", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§dFeeblemind"), List.of(8), List.of("§dEnchantment")));
    public static final RegistryObject<Item> DIAMOND_ORB = ITEMS.register("diamond_orb", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§eGlobe of Invulnerability", "§dFeeblemind", "§4Leomund's Tiny Hut", "§4Otiluke's Freezing Sphere"),
            List.of(6, 8, 3, 6),
            List.of("§eAbjuration", "§dEnchantment", "§4Evocation", "§4Evocation")));
    public static final RegistryObject<Item> EMERALD_ORB = ITEMS.register("emerald_orb", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§eGlobe of Invulnerability", "§dFeeblemind", "§4Leomund's Tiny Hut", "§4Otiluke's Freezing Sphere"),
            List.of(6, 8, 3, 6),
            List.of("§eAbjuration", "§dEnchantment", "§4Evocation", "§4Evocation")));
    public static final RegistryObject<Item> RUBY_ORB = ITEMS.register("ruby_orb", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§eGlobe of Invulnerability", "§dFeeblemind", "§4Leomund's Tiny Hut", "§4Otiluke's Freezing Sphere"),
            List.of(6, 8, 3, 6),
            List.of("§eAbjuration", "§dEnchantment", "§4Evocation", "§4Evocation")));
    public static final RegistryObject<Item> SAPPHIRE_ORB = ITEMS.register("sapphire_orb", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§eGlobe of Invulnerability", "§dFeeblemind", "§4Leomund's Tiny Hut", "§4Otiluke's Freezing Sphere"),
            List.of(6, 8, 3, 6),
            List.of("§eAbjuration", "§dEnchantment", "§4Evocation", "§4Evocation")));
    public static final RegistryObject<Item> GLOWWORM_IN_BOTTLE = ITEMS.register("glowworm_in_bottle", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§4Dancing Lights"), List.of(0), List.of("§4Evocation")));
    public static final RegistryObject<Item> FIREFLY_IN_BOTTLE = ITEMS.register("firefly_in_bottle", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§4Light", "§4Fire Shield"),
            List.of(0, 4),
            List.of("§4Evocation", "§4Evocation")));
    public static final RegistryObject<Item> PHOSPHORESCENT_MOSS = ITEMS.register("phosphorescent_moss", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§4Light"), List.of(0), List.of("§4Evocation")));
    public static final RegistryObject<Item> FULGUROUS_TWIG = ITEMS.register("fulgurous_twig", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§4Witch Bolt"), List.of(1), List.of("§4Evocation")));
    public static final RegistryObject<Item> RED_DRAGON_SCALE = ITEMS.register("red_dragon_scale", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§4Aganazzar's Scorcher"), List.of(2), List.of("§4Evocation")));
    public static final RegistryObject<Item> VIAL_OF_PITCH = ITEMS.register("vial_of_pitch", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§4Darkness", "§2Spider Climb"),
            List.of(2, 2),
            List.of("§4Evocation", "§2Transmutation")));
    public static final RegistryObject<Item> SUMAC_BERRY = ITEMS.register("sumac_berry", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§4Flame Blade"), List.of(2), List.of("§4Evocation")));
    public static final RegistryObject<Item> PEANUT = ITEMS.register("peanut", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§4Gust of Wind"), List.of(2), List.of("§4Evocation")));
    public static final RegistryObject<Item> POWDERED_RHUBARB = ITEMS.register("powdered_rhubarb", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§4Melf's Acid Arrow"), List.of(2), List.of("§4Evocation")));
    public static final RegistryObject<Item> SNAKE_STOMACH = ITEMS.register("snake_stomach", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§4Melf's Acid Arrow"), List.of(2), List.of("§4Evocation")));
    public static final RegistryObject<Item> MOONSEED_SEEDS = ITEMS.register("moonseed_seeds", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§4Moonbeam"), List.of(2), List.of("§4Evocation")));
    public static final RegistryObject<Item> OPALESCENT_FELDSPAR_CHUNK = ITEMS.register("opalescent_feldspar_chunk", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§4Moonbeam"), List.of(2), List.of("§4Evocation")));
    //public static final RegistryObject<Item> MICA_CHIP = ITEMS.register("aaaaaaaaaaaaa", () -> new SpellComponentItem(new Item.Properties(),
    //            List.of("§4AAAAAAAAA"), List.of(1), List.of("§4Evocation"))); TODO: maybe implement with nether quartz instead
    public static final RegistryObject<Item> FLAMMABLE_ORB = ITEMS.register("flammable_orb", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§4Fireball", "§4Delayed Blast Fireball"),
            List.of(3, 7),
            List.of("§4Evocation", "§4Evocation")));
    public static final RegistryObject<Item> AMBER_ROD = ITEMS.register("amber_rod", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§4Lightning Bolt", "§4Chain Lightning"),
            List.of(3, 6),
            List.of("§4Evocation", "§4Evocation")));
    public static final RegistryObject<Item> AMETHYST_ROD = ITEMS.register("amethyst_rod", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§4Lightning Bolt", "§4Chain Lightning", "§2Create Spelljamming Helm"),
            List.of(3, 6, 5),
            List.of("§4Evocation", "§4Evocation", "§2Transmutation")));
    public static final RegistryObject<Item> GLASS_ROD = ITEMS.register("glass_rod", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§4Lightning Bolt", "§4Chain Lightning"),
            List.of(3, 6),
            List.of("§4Evocation", "§4Evocation")));
    public static final RegistryObject<Item> EXPLOSIVE_ORB = ITEMS.register("explosive_orb", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§4Melf's Minute Meteors"), List.of(3), List.of("§4Evocation")));
    public static final RegistryObject<Item> COPPER_WIRE = ITEMS.register("copper_wire", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§4Sending", "§2Message"),
            List.of(3, 0),
            List.of("§4Evocation", "§2Transmutation")));
    public static final RegistryObject<Item> PAPER_FAN = ITEMS.register("paper_fan", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§4Wind Wall"), List.of(3), List.of("§4Evocation")));
    public static final RegistryObject<Item> BLACK_PEARL = ITEMS.register("black_pearl", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§ePlanar Binding", "§4Gravity Sinkhole"),
            List.of(5, 4),
            List.of("§eAbjuration", "§4Evocation")));
    public static final RegistryObject<Item> GLASS_HALF_ORB = ITEMS.register("glass_half_orb", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§4Otiluke's Resilient Sphere"), List.of(4), List.of("§4Evocation")));
    public static final RegistryObject<Item> GUM_ARABIC_HALF_ORB = ITEMS.register("gum_arabic_half_orb", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§4Otiluke's Resilient Sphere"), List.of(4), List.of("§4Evocation")));
    public static final RegistryObject<Item> VIAL_OF_SLUG_BILE = ITEMS.register("vial_of_slug_bile", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§4Vitriolic Sphere"), List.of(4), List.of("§4Evocation")));
    public static final RegistryObject<Item> SNAKESKIN_GLOVE = ITEMS.register("snakeskin_glove", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§4Bigby's Hand"), List.of(5), List.of("§4Evocation")));
    public static final RegistryObject<Item> AMETHYST_CONE = ITEMS.register("amethyst_cone", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§4Cone of Cold"), List.of(5), List.of("§4Evocation")));
    public static final RegistryObject<Item> GLASS_CONE = ITEMS.register("glass_cone", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§4Cone of Cold"), List.of(5), List.of("§4Evocation")));
    public static final RegistryObject<Item> SUNBURST_PENDANT = ITEMS.register("sunburst_pendant", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§4Dawn"), List.of(5), List.of("§4Evocation")));
    public static final RegistryObject<Item> PAPER_CONE = ITEMS.register("paper_cone", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§4Maelstrom"), List.of(5), List.of("§4Evocation")));
    public static final RegistryObject<Item> LEAF_CONE = ITEMS.register("leaf_cone", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§4Maelstrom"), List.of(5), List.of("§4Evocation")));
    public static final RegistryObject<Item> SILVER_PIN = ITEMS.register("silver_pin", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§4Chain Lightning"), List.of(6), List.of("§4Evocation")));
    //public static final RegistryObject<Item> GEM_ENCRUSTED_IVORY_STATUETTE = ITEMS.register("aaaaaaaaaaaaa", () -> new SpellComponentItem(new Item.Properties(),
    //            List.of("§4AAAAAAAAA"), List.of(1), List.of("§4Evocation")));
    public static final RegistryObject<Item> MAGNIFYING_GLASS = ITEMS.register("magnifying_glass", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§4Sunbeam"), List.of(6), List.of("§4Evocation")));
    public static final RegistryObject<Item> ORNAMENTAL_SWORD = ITEMS.register("ornamental_sword", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§4Mordenkainen's Sword"), List.of(7), List.of("§4Evocation")));
    public static final RegistryObject<Item> ONYX = ITEMS.register("onyx", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§ePlanar Binding", "§4Dark Star", "§dIncite Greed", "§8Create Undead"),
            List.of(5, 8, 3, 6),
            List.of("§eAbjuration", "§4Evocation", "§dEnchantment", "§8Necromancy")));
    public static final RegistryObject<Item> VIAL_OF_PITCH_AND_QUICKSILVER = ITEMS.register("vial_of_pitch_and_quicksilver", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§4Maddening Darkness"), List.of(8), List.of("§4Evocation")));
    public static final RegistryObject<Item> LINKED_SILVER_RINGS = ITEMS.register("linked_silver_rings", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§4Telepathy"), List.of(8), List.of("§4Evocation")));
    public static final RegistryObject<Item> IRON_STAR = ITEMS.register("iron_star", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§4Ravenous Void"), List.of(9), List.of("§4Evocation")));
    public static final RegistryObject<Item> LEAD_BASED_INK_BOTTLE = ITEMS.register("lead_based_ink_bottle", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§5Illusory Script"), List.of(1), List.of("§5Illusion")));
    public static final RegistryObject<Item> EYELASH_IN_GUM_ARABIC = ITEMS.register("eyelash_in_gum_arabic", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§5Invisibility"), List.of(2), List.of("§5Illusion")));
    public static final RegistryObject<Item> POWDERED_JADE = ITEMS.register("powdered_jade", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§5Magic Mouth", "§5Programmed Illusion"),
            List.of(2, 6),
            List.of("§5Illusion", "§5Illusion")));
    public static final RegistryObject<Item> APPLE_PIE_CRUST = ITEMS.register("apple_pie_crust", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§5Nathair's Mischief"), List.of(2), List.of("§5Illusion")));
    public static final RegistryObject<Item> SILK = ITEMS.register("silk", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§5Nystul's Magic Aura"), List.of(2), List.of("§5Illusion")));
    public static final RegistryObject<Item> CHICKEN_HEART = ITEMS.register("chicken_heart", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§5Fear"), List.of(3), List.of("§5Illusion")));
    public static final RegistryObject<Item> SOPORIFIC_QUILL = ITEMS.register("soporific_quill", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§5Dream"), List.of(5), List.of("§5Illusion")));
    public static final RegistryObject<Item> MINIATURE_PLAYER = ITEMS.register("miniature_player", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§5Project Image", "§2Create Magen"),
            List.of(7, 7),
            List.of("§5Illusion", "§2Transmutation")));
    //public static final RegistryObject<Item> ALCOHOL = ITEMS.register("aaaaaaaaaaaaa", () -> new SpellComponentItem(new Item.Properties(),
    //            List.of("§8AAAAAAAAA"), List.of(1), List.of("§8Necromancy"))); //TODO: make types of alcohol
    //public static final RegistryObject<Item> WITHERED_TWISTING_VINE = ITEMS.register("aaaaaaaaaaaaa", () -> new SpellComponentItem(new Item.Properties(),
    //            List.of("§8AAAAAAAAA"), List.of(1), List.of("§8Necromancy"))); //TODO: maybe make into block?
    public static final RegistryObject<Item> UNDEAD_EYE_IN_DIAMOND = ITEMS.register("undead_eye_in_diamond", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§8Shadow of Moil"), List.of(4), List.of("§8Necromancy")));
    //public static final RegistryObject<Item> REAPER_CARD = ITEMS.register("aaaaaaaaaaaaa", () -> new SpellComponentItem(new Item.Properties(),
    //            List.of("§8AAAAAAAAA"), List.of(1), List.of("§8Necromancy")));
    public static final RegistryObject<Item> BROKEN_BONE = ITEMS.register("broken_bone", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§8Negative Energy Flood"), List.of(5), List.of("§8Necromancy")));
    public static final RegistryObject<Item> BLACK_SILK = ITEMS.register("black_silk", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§8Negative Energy Flood"), List.of(5), List.of("§8Necromancy")));
    public static final RegistryObject<Item> POWDERED_BLACK_PEARL = ITEMS.register("powdered_black_pearl", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§8Circle of Death"), List.of(6), List.of("§8Necromancy")));
    public static final RegistryObject<Item> POT_OF_GRAVE_DIRT = ITEMS.register("pot_of_grave_dirt", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§8Create Undead"), List.of(6), List.of("§8Necromancy")));
    public static final RegistryObject<Item> POT_OF_BRACKISH_WATER = ITEMS.register("pot_of_brackish_water", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§8Create Undead"), List.of(6), List.of("§8Necromancy")));
    public static final RegistryObject<Item> MINIATURE_SILVER_CAGE = ITEMS.register("miniature_silver_cage", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§8Soul Cage"), List.of(6), List.of("§8Necromancy")));
    public static final RegistryObject<Item> PLATINUM_WIRE = ITEMS.register("platinum_wire", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§8Tether Essence"), List.of(7), List.of("§8Necromancy")));
    public static final RegistryObject<Item> ORNATE_SILVER_INGOT = ITEMS.register("ornate_silver_ingot", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§8Astral Projection"), List.of(9), List.of("§8Necromancy")));
    public static final RegistryObject<Item> DIAMANTINE_HOURGLASS = ITEMS.register("diamantine_hourglass", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§8Time Ravage"), List.of(9), List.of("§8Necromancy")));
    public static final RegistryObject<Item> MISTLETOE = ITEMS.register("mistletoe", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§2Shillelagh", "§2Goodberry"),
            List.of(0, 1),
            List.of("§2Transmutation", "§2Transmutation")));
    public static final RegistryObject<Item> SHAMROCK = ITEMS.register("shamrock", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§2Shillelagh"), List.of(0), List.of("§2Transmutation")));
    public static final RegistryObject<Item> DRIED_CARROT = ITEMS.register("dried_carrot", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§2Darkvision"), List.of(2), List.of("§2Transmutation")));
    public static final RegistryObject<Item> HOT_PEPPER = ITEMS.register("hot_pepper", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§2Dragon's Breath"), List.of(2), List.of("§2Transmutation")));
    public static final RegistryObject<Item> GOLD_HOOK = ITEMS.register("gold_hook", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§2Levitate"), List.of(2), List.of("§2Transmutation"))); //TODO: crafting recipe of gold hook must involve gold wire
    public static final RegistryObject<Item> MINIATURE_CLAY_HAND = ITEMS.register("miniature_clay_hand", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§2Maximillian's Earthen Grasp"), List.of(2), List.of("§2Transmutation")));
    public static final RegistryObject<Item> POWDERED_CORN = ITEMS.register("powdered_corn", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§2Rope Trick"), List.of(2), List.of("§2Transmutation")));
    public static final RegistryObject<Item> TWISTED_PAPER = ITEMS.register("twisted_paper", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§2Rope Trick"), List.of(2), List.of("§2Transmutation")));
    public static final RegistryObject<Item> SPIDER_IN_BOTTLE = ITEMS.register("spider_in_bottle", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§2Spider Climb"), List.of(2), List.of("§2Transmutation")));
    public static final RegistryObject<Item> SMOKE_IN_BOTTLE = ITEMS.register("smoke_in_bottle", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§2Gaseous Form", "§2True Polymorph"),
            List.of(3, 9),
            List.of("§2Transmutation", "§2Transmutation")));
    public static final RegistryObject<Item> LIQUORICE_ROOT = ITEMS.register("liquorice_root", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§2Haste"), List.of(3), List.of("§2Transmutation")));
    public static final RegistryObject<Item> VIAL_OF_MOLASSES = ITEMS.register("vial_of_molasses", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§2Slow"), List.of(3), List.of("§2Transmutation")));
    public static final RegistryObject<Item> CORK = ITEMS.register("cork", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§2Water Walk"), List.of(3), List.of("§2Transmutation")));
    public static final RegistryObject<Item> COCOON = ITEMS.register("cocoon", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§2Polymorph", "§2Mass Polymorph"),
            List.of(4, 9),
            List.of("§2Transmutation", "§2Transmutation")));
    public static final RegistryObject<Item> SESAME_SEEDS = ITEMS.register("sesame_seeds", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§2Passwall"), List.of(5), List.of("§2Transmutation")));
    //TODO: for 'reincarnate' sort out what the rare oils & unguents are to be
    public static final RegistryObject<Item> QUIVER = ITEMS.register("quiver", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§2Swift Quiver"), List.of(5), List.of("§2Transmutation")));
    public static final RegistryObject<Item> MANDRAKE_ROOT = ITEMS.register("mandrake_root", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§2Create Homunculus"), List.of(6), List.of("§2Transmutation")));
    //public static final RegistryObject<Item> GEM_ENCRUSTED_DAGGER = ITEMS.register("aaaaaaaaaaaaa", () -> new SpellComponentItem(new Item.Properties(),
    //            List.of("§2AAAAAAAAA"), List.of(1), List.of("§2Transmutation")));
    public static final RegistryObject<Item> IRON_BLADE = ITEMS.register("iron_blade", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§2Move Earth"), List.of(6), List.of("§2Transmutation")));
    public static final RegistryObject<Item> BAG_OF_SOILS = ITEMS.register("bag_of_soils", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§2Move Earth"), List.of(6), List.of("§2Transmutation")));
    public static final RegistryObject<Item> OUTER_PLANES_INSIGNIA = ITEMS.register("outer_planes_insignia", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§2Tasha's Otherworldly Guise"), List.of(6), List.of("§2Transmutation")));
    public static final RegistryObject<Item> ORNATE_AMETHYST_ROD = ITEMS.register("ornate_amethyst_rod", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§2Create Magen"), List.of(7), List.of("§2Transmutation")));
    //TODO: maybe implement dragon statuette as block?
    //public static final RegistryObject<Item> DRAGON_STATUETTE = ITEMS.register("aaaaaaaaaaaaa", () -> new SpellComponentItem(new Item.Properties(),
    //            List.of("§2AAAAAAAAA"), List.of(1), List.of("§2Transmutation")));
    public static final RegistryObject<Item> PRAYER_WHEEL = ITEMS.register("prayer_wheel", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§2Regenerate"), List.of(7), List.of("§2Transmutation")));
    public static final RegistryObject<Item> POT_OF_DEBRIS = ITEMS.register("pot_of_debris", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§2Control Weather"), List.of(8), List.of("§2Transmutation")));
    public static final RegistryObject<Item> JADE_CIRCLET = ITEMS.register("jade_circlet", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§2Shapechange"), List.of(9), List.of("§2Transmutation")));
    public static final RegistryObject<Item> GUM_ARABIC = ITEMS.register("gum_arabic", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§2True Polymorph"), List.of(9), List.of("§2Transmutation")));


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

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§ePlanar Binding", "§9Infernal Calling", "§dIncite Greed", "§8Astral Projection"),
            List.of(5, 5, 3, 9),
            List.of("§eAbjuration", "§9Conjuration", "§dEnchantment", "§8Necromancy")));
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§ePlanar Binding", "§9Drawmij's Instant Summons", "§dIncite Greed"),
            List.of(5, 6, 3),
            List.of("§eAbjuration", "§9Conjuration", "§dEnchantment")));
    public static final RegistryObject<Item> CHRYSOLITE = ITEMS.register("chrysolite", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§ePlanar Binding", "§dIncite Greed"),
            List.of(5, 3),
            List.of("§eAbjuration", "§dEnchantment")));
    public static final RegistryObject<Item> SUNSTONE = ITEMS.register("sunstone", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§ePlanar Binding", "§dIncite Greed", "§4Sunburst"),
            List.of(5, 3, 8),
            List.of("§eAbjuration", "§dEnchantment", "§4Evocation")));

    public static final RegistryObject<Item> POWDERED_DIAMOND = ITEMS.register("powdered_diamond", () -> new SpellComponentItem(new Item.Properties(),
                    List.of("§eGlyph of Warding", "§eNondetection", "§eStoneskin", "§eGreater Restoration", "§eSymbol", "§4Wall of Force", "§2Sequester"),
                    List.of(3, 3, 4, 5, 7, 5, 7),
                    List.of("§eAbjuration", "§eAbjuration", "§eAbjuration", "§eAbjuration", "§eAbjuration", "§4Evocation", "§2Transmutation")));
    public static final RegistryObject<Item> POWDERED_IRON = ITEMS.register("powdered_iron", () -> new SpellComponentItem(new Item.Properties(),
                    List.of("§eProtection from Evil and Good", "§eMagic Circle", "§eDispel Evil and Good", "§eAntimagic Field", "§9Flaming Sphere", "§4Gravity Fissure", "§2Enlarge/Reduce", "§2Reverse Gravity"),
                    List.of(1, 3, 5, 8, 2, 6, 2, 2, 7),
                    List.of("§eAbjuration", "§eAbjuration", "§eAbjuration", "§eAbjuration", "§9Conjuration", "§4Evocation", "§2Transmutation", "§2Transmutation")));
    public static final RegistryObject<Item> POWDERED_GOLD = ITEMS.register("powdered_gold", () -> new SpellComponentItem(new Item.Properties(),
                    List.of("§eArcane Lock", "§6Immovable Object"),
                    List.of(2, 2),
                    List.of("§eAbjuration", "§6Transmutation")));
    public static final RegistryObject<Item> POWDERED_SILVER = ITEMS.register("powdered_silver", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§eProtection from Evil and Good", "§eMagic Circle", "§eDispel Evil and Good", "§bSee Invisibility", "§4Ceremony"),
            List.of(1, 3, 5, 2, 1),
            List.of("§eAbjuration", "§eAbjuration", "§eAbjuration", "§bDivination", "§4Evocation")));
    public static final RegistryObject<Item> POWDERED_PLATINUM = ITEMS.register("powdered_platinum", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POWDERED_ADAMANT = ITEMS.register("powdered_adamant", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POWDERED_RUBY = ITEMS.register("powdered_ruby", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§eForbiddance", "§4Continual Flame", "§4Forcecage", "§5Simulacrum", "§2Sequester"),
            List.of(6, 2, 7, 7, 7),
            List.of("§eAbjuration", "§4Evocation", "§4Evocation", "§5Illusion", "§2Transmutation")));
    public static final RegistryObject<Item> POWDERED_SAPPHIRE = ITEMS.register("powdered_sapphire", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§2Sequester"), List.of(7), List.of("§2Transmutation")));
    public static final RegistryObject<Item> POWDERED_CHRYSOLITE = ITEMS.register("powdered_chrysolite", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§eMordenkainen’s Private Sanctum"), List.of(4), List.of("§eAbjuration")));
    public static final RegistryObject<Item> POWDERED_EMERALD = ITEMS.register("powdered_emerald", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§2Sequester"), List.of(7), List.of("§2Transmutation")));
    public static final RegistryObject<Item> POWDERED_SUNSTONE = ITEMS.register("powdered_sunstone", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POWDERED_AMETHYST = ITEMS.register("powdered_amethyst", () -> new SpellComponentItem(new Item.Properties(),
            List.of("§4Wall of Force"), List.of(5), List.of("§4Evocation")));

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector", () -> new MetalDetectorItem(new Item.Properties().durability(100)));

    public static final RegistryObject<Item> OIL_BOTTLE = ITEMS.register("oil_bottle", () -> new FuelItem(new Item.Properties(), 3200));

    public static final RegistryObject<Item> YEW_SIGN = ITEMS.register("yew_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.YEW_SIGN.get(), ModBlocks.YEW_WALL_SIGN.get()));
    public static final RegistryObject<Item> YEW_HANGING_SIGN = ITEMS.register("yew_hanging_sign", () -> new HangingSignItem(ModBlocks.YEW_HANGING_SIGN.get(), ModBlocks.YEW_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> MITHRIL_CHAIN = ITEMS.register("mithril_chain", () -> new BlockItem(ModBlocks.MITHRIL_CHAIN.get(), new Item.Properties()));
    public static final RegistryObject<Item> GOLD_CHAIN = ITEMS.register("gold_chain", () -> new BlockItem(ModBlocks.GOLD_CHAIN.get(), new Item.Properties()));
    public static final RegistryObject<Item> SILVER_CHAIN = ITEMS.register("silver_chain", () -> new BlockItem(ModBlocks.SILVER_CHAIN.get(), new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_CHAIN = ITEMS.register("platinum_chain", () -> new BlockItem(ModBlocks.PLATINUM_CHAIN.get(), new Item.Properties()));
    public static final RegistryObject<Item> ADAMANT_CHAIN = ITEMS.register("adamant_chain", () -> new BlockItem(ModBlocks.ADAMANT_CHAIN.get(), new Item.Properties()));
    public static final RegistryObject<Item> RAZORVINE = ITEMS.register("razorvine", () -> new BlockItem(ModBlocks.RAZORVINE.get(), new Item.Properties()));

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
