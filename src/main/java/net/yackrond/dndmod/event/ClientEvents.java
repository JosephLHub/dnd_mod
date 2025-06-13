package net.yackrond.dndmod.event;

import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.yackrond.dndmod.DnDMod;
import net.yackrond.dndmod.networking.ModMessages;
import net.yackrond.dndmod.networking.packet.ExampleC2SPacket;
import net.yackrond.dndmod.util.KeyBindings;
import net.yackrond.dndmod.util.ModTags;

import java.util.List;

public class ClientEvents {
    @Mod.EventBusSubscriber(modid = DnDMod.MOD_ID, value = Dist.CLIENT)
    public static class ClientForgeEvents {
        @SubscribeEvent
        public static void onKeyInput(InputEvent.Key event) {
            if (KeyBindings.CASTING_KEY.consumeClick()) {
                ModMessages.sendToServer(new ExampleC2SPacket());
            }
        }
    }

    @Mod.EventBusSubscriber(modid = DnDMod.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModBusEvents {
        @SubscribeEvent
        public static void onKeyRegister(RegisterKeyMappingsEvent event) {
            event.register(KeyBindings.CASTING_KEY);
        }
    }

    @Mod.EventBusSubscriber(modid = DnDMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
    public static class TooltipEvents {
        @SubscribeEvent
        public static void onItemTooltip(ItemTooltipEvent event) {
            ItemStack itemStack = event.getItemStack();
            List<Component> itemTooltip = event.getToolTip();
            event.getToolTip().add(Component.literal(itemStack.getItem().toString())); //Uncomment to check vanilla item names for the below switch-case
//            for (Item i : ForgeRegistries.ITEMS) {
//                if (i.toString().contains("dye")) {
//                    event.getToolTip().add(Component.literal(i.toString()));
//                }
//            }
            if (itemStack.is(ModTags.Items.SPELL_COMPONENT) || itemStack.getDescriptionId().equals("item.minecraft.potion.effect.water")) {
                if (Screen.hasShiftDown()) {
                    switch (itemStack.getItem().toString()) {
                        case "potion":
                            event.getToolTip().add(Component.literal("Used to cast §eArmour of Agathys§f, a Level 1 §eAbjuration §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §9Summon Elemental§f, a Level 4 §9Conjuration §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §9Conjure Elemental§f, a Level 5 §9Conjuration §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §2Transmute Rock§f, a Level 5 §2Transmutation §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §2Flesh to Stone§f, a Level 6 §2Transmutation §fspell."));
                            break;
                        case "spruce_sapling":
                            event.getToolTip().add(Component.literal("Used to cast §ePass without Trace§f, a Level 2 §eAbjuration §fspell."));
                            break;
                        case "calcite":
                            event.getToolTip().add(Component.literal("Used to cast §2Flesh to Stone§f, a Level 6 §2Transmutation §fspell."));
                            break;
                        case "wheat":
                            event.getToolTip().add(Component.literal("Used to cast §4Whirlwind§f, a Level 7 §4Evocation §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §2Water Breathing§f, a Level 3 §2Transmutation §fspell."));
                            break;
                        case "white_dye":
                        case "orange_dye":
                        case "magenta_dye":
                        case "light_blue_dye":
                        case "yellow_dye":
                        case "lime_dye":
                        case "pink_dye":
                        case "gray_dye":
                        case "light_gray_dye":
                        case "cyan_dye":
                        case "purple_dye":
                        case "blue_dye":
                        case "brown_dye":
                        case "red_dye":
                        case "green_dye":
                        case "black_dye":
                            event.getToolTip().add(Component.literal("Used to cast §dFriends§f, a Level 0 §dEnchantment §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §5Color Spray§f, a Level 1 §5Illusion §fspell."));
                            break;
                        case "beef":
                        case "porkchop":
                        case "mutton":
                        case "chicken":
                        case "rabbit":
                        case "cod":
                        case "salmon":
                        case "tropical_fish":
                        case "pufferfish":
                            event.getToolTip().add(Component.literal("Used to cast §dAnimal Friendship§f, a Level 1 §dEnchantment §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §dAnimal Messenger§f, a Level 2 §dEnchantment §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §8Animate Dead§f, a Level 3 §8Necromancy §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §8Clone§f, a Level 8 §8Necromancy §fspell."));
                            break;
                        case "apple":
                        case "golden_apple":
                        case "enchanted_golden_apple":
                        case "melon_slice":
                        case "glow_berries":
                        case "chorus_fruit":
                        case "carrot":
                        case "golden_carrot":
                        case "potato":
                        case "baked_potato":
                        case "poisonous_potato":
                        case "beetroot":
                        case "dried_kelp":
                        case "cooked_beef":
                        case "cooked_porkchop":
                        case "cooked_mutton":
                        case "cooked_chicken":
                        case "cooked_rabbit":
                        case "cooked_cod":
                        case "cooked_salmon":
                        case "bread":
                        case "cookie":
                        case "cake":
                        case "pumpkin_pie":
                        case "spider_eye":
                        case "mushroom_stew":
                        case "beetroot_soup":
                        case "rabbit_stew":
                        case "suspicious_stew":
                        case "honey_bottle":
                            event.getToolTip().add(Component.literal("Used to cast §dAnimal Friendship§f, a Level 1 §dEnchantment §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §dAnimal Messenger§f, a Level 2 §dEnchantment §fspell."));
                            break;
                        case "glass_bottle":
                            event.getToolTip().add(Component.literal("Used to cast §9Summon Elemental§f, a Level 4 §9Conjuration §fspell."));
                            break;
                        case "tinted_glass":
                            event.getToolTip().add(Component.literal("Used to cast §eMordenkainen’s Private Sanctum§f, a Level 4 §eAbjuration §fspell."));
                            break;
                        case "diamond":
                            event.getToolTip().add(Component.literal("Used to cast §ePlanar Binding§f, a Level 5 §eAbjuration §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §9Mighty Fortress§f, a Level 8 §9Conjuration §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §9Gate§f, a Level 9 §9Conjuration §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §dIncite Greed§f, a Level 3 §dEnchantment §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §4Chromatic Orb§f, a Level 1 §4Evocation §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §8Revivify§f, a Level 3 §8Necromancy §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §8Raise Dead§f, a Level 5 §8Necromancy §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §8Resurrection§f, a Level 7 §8Necromancy §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §8Clone§f, a Level 8 §8Necromancy §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §8True Resurrection§f, a Level 9 §8Necromancy §fspell."));
                            break;
                        case "sweet_berries":
                            event.getToolTip().add(Component.literal("Used to cast §9Conjure Woodland Beings§f, a Level 4 §9Conjuration §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §dAnimal Friendship§f, a Level 1 §dEnchantment §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §dAnimal Messenger§f, a Level 2 §dEnchantment §fspell."));
                            break;
                        case "emerald":
                            event.getToolTip().add(Component.literal("Used to cast §ePlanar Binding§f, a Level 5 §eAbjuration §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §dIncite Greed§f, a Level 3 §dEnchantment §fspell."));
                            break;
                        case "amethyst_shard":
                            event.getToolTip().add(Component.literal("Used to cast §ePlanar Binding§f, a Level 5 §eAbjuration §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §dIncite Greed§f, a Level 3 §dEnchantment §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §2Darkvision§f, a Level 2 §2Transmutation §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §2Awaken§f, a Level 5 §2Transmutation §fspell."));
                            break;
                        case "charcoal":
                            event.getToolTip().add(Component.literal("Used to cast §9Find Familiar§f, a Level 1 §9Conjuration §fspell."));
                            break;
                        case "leather":
                            event.getToolTip().add(Component.literal("Used to cast §2Tenser's Transformation§f, a Level 6 §2Transmutation §fspell."));
                            break;
                        case "ice":
                            event.getToolTip().add(Component.literal("Used to cast §9Ice Knife§f, a Level 1 §9Conjuration §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §4Snilloc's Snowball Storm§f, a Level 2 §4Evocation §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §5Simulacrum§f, a Level 7 §5Illusion §fspell."));
                            break;
                        case "string":
                            event.getToolTip().add(Component.literal("Used to cast §eGuards and Wards§f, a Level 6 §eAbjuration §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §9Unseen Servant§f, a Level 1 §9Conjuration §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §9Mordenkainen's Faithful Hound§f, a Level 4 §9Conjuration §fspell."));
                            break;
                        case "feather":
                            event.getToolTip().add(Component.literal("Used to cast §9Summon Beast§f, a Level 2 §9Conjuration §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §dTasha's Hideous Laughter§f, a Level 1 §dEnchantment §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §5Fear§f, a Level 3 §5Illusion §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §2Feather Fall§f, a Level 1 §2Transmutation §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §2Enhance Ability§f, a Level 2 §2Transmutation §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §2Fly§f, a Level 3 §2Transmutation §fspell."));
                            break;
                        case "cobweb":
                            event.getToolTip().add(Component.literal("Used to cast §9Web§f, a Level 2 §9Conjuration §fspell."));
                            break;
                        case "bricks":
                            event.getToolTip().add(Component.literal("Used to cast §9Galder's Tower§f, a Level 3 §9Conjuration §fspell."));
                            break;
                        case "arrow":
                        case "spectral_arrow":
                        case "tipped_arrow":
                            event.getToolTip().add(Component.literal("Used to cast §9Conjure Barrage§f, a Level 3 §9Conjuration §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §9Conjure Volley§f, a Level 5 §9Conjuration §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §2Cordon of Arrows§f, a Level 2 §2Transmutation §fspell."));
                            break;
                        case "sugar":
                            event.getToolTip().add(Component.literal("Used to cast §9Insect Plague§f, a Level 5 §9Conjuration §fspell."));
                            break;
                        case "book":
                            event.getToolTip().add(Component.literal("Used to cast §bBorrowed Knowledge§f, a Level 2 §bDivination §fspell."));
                            break;
                        case "egg":
                            event.getToolTip().add(Component.literal("Used to cast §bRary's Telepathic Bond§f, a Level 5 §bDivination §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §4Bigby's Hand§f, a Level 5 §4Evocation §fspell."));
                            break;
                        case "bone":
                            event.getToolTip().add(Component.literal("Used to cast §9Mordenkainen's Faithful Hound§f, a Level 4 §9Conjuration §fspell."));
                            break;
                        case "iron_ingot":
                            event.getToolTip().add(Component.literal("Used to cast §dHold Person§f, a Level 2 §dEnchantment §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §dHold Monster§f, a Level 5 §dEnchantment §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §2Heat Metal§f, a Level 2 §2Transmutation §fspell."));
                            break;
                        case "honeycomb":
                            event.getToolTip().add(Component.literal("Used to cast §dSuggestion§f, a Level 2 §dEnchantment §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §dMass Suggestion§f, a Level 6 §dEnchantment §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §5Magic Mouth§f, a Level 2 §5Illusion §fspell."));
                            break;
                        case "sand":
                            event.getToolTip().add(Component.literal("Used to cast §9Conjure Elemental§f, a Level 5 §9Conjuration §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §dSleep§f, a Level 1 §dEnchantment §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §dCatnap§f, a Level 3 §dEnchantment §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §4Wall of Sand§f, a Level 3 §4Evocation §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §5Dream§f, a Level 5 §5Illusion §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §2Create or Destroy Water§f, a Level 1 §2Transmutation §fspell."));
                            break;
                        case "rotten_flesh":
                            event.getToolTip().add(Component.literal("Used to cast §dAnimal Friendship§f, a Level 1 §dEnchantment §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §dAnimal Messenger§f, a Level 2 §dEnchantment §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §4Tasha's Caustic Brew§f, a Level 1 §4Evocation §fspell."));
                            break;
                        case "coal":
                            event.getToolTip().add(Component.literal("Used to cast §4Darkness§f, a Level 2 §4Evocation §fspell."));
                            break;
                        case "wooden_sword":
                        case "stone_sword":
                        case "gold_sword":
                        case "iron_sword":
                        case "diamond_sword":
                        case "netherite_sword":
                        case "wooden_axe":
                        case "stone_axe":
                        case "gold_axe":
                        case "iron_axe":
                        case "diamond_axe":
                        case "netherite_axe":
                            event.getToolTip().add(Component.literal("Used to cast §9Steel Wind Strike§f, a Level 5 §9Conjuration §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §4Booming Blade§f, a Level 0 §4Evocation §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §4Green-Flame Blade§f, a Level 0 §4Evocation §fspell."));
                            break;
                        case "granite":
                            event.getToolTip().add(Component.literal("Used to cast §4Wall of Stone§f, a Level 5 §4Evocation §fspell."));
                            break;
                        case "quartz":
                            event.getToolTip().add(Component.literal("Used to cast §9Conjure Elemental§f, a Level 5 §9Conjuration §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §4Wall of Ice§f, a Level 6 §4Evocation §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §2Darkvision§f, a Level 2 §2Transmutation §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §2Awaken§f, a Level 5 §2Transmutation §fspell."));
                            break;
                        case "dirt":
                            event.getToolTip().add(Component.literal("Used to cast §4Earthquake§f, a Level 8 §4Evocation §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §2Longstrider§f, a Level 1 §2Transmutation §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §2Flesh to Stone§f, a Level 6 §2Transmutation §fspell."));
                            break;
                        case "stone":
                            event.getToolTip().add(Component.literal("Used to cast §9Galder's Tower§f, a Level 3 §9Conjuration §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §4Earthquake§f, a Level 8 §4Evocation §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §5Hallucinatory Terrain§f, a Level 4 §5Illusion §fspell."));
                            break;
                        case "clay_ball":
                            event.getToolTip().add(Component.literal("Used to cast §9Conjure Elemental§f, a Level 5 §9Conjuration §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §4Earthquake§f, a Level 8 §4Evocation §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §2Transmute Rock§f, a Level 5 §2Transmutation §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §2Create Homunculus§f, a Level 6 §2Transmutation §fspell."));
                            break;
                        case "fire_charge":
                            event.getToolTip().add(Component.literal("Used to cast §4Sunburst§f, a Level 8 §4Evocation §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §2Heat Metal§f, a Level 2 §2Transmutation §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §2Wind Walk§f, a Level 6 §2Transmutation §fspell."));
                            break;
                        case "stick":
                            event.getToolTip().add(Component.literal("Used to cast §9Unseen Servant§f, a Level 1 §9Conjuration §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §9Galder's Tower§f, a Level 3 §9Conjuration §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §5Hallucinatory Terrain§f, a Level 4 §5Illusion §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §2Shillelagh§f, a Level 0 §2Transmutation §fspell."));
                            break;
                        case "lead":
                            event.getToolTip().add(Component.literal("Used to cast §2Levitate§f, a Level 2 §2Transmutation §fspell."));
                            break;
                        case "ink_sac":
                            event.getToolTip().add(Component.literal("Used to cast §5Dream§f, a Level 5 §5Illusion §fspell."));
                            break;
                        case "snow_block":
                            event.getToolTip().add(Component.literal("Used to cast §5Simulacrum§f, a Level 7 §5Illusion §fspell."));
                            break;
                        case "sponge":
                            event.getToolTip().add(Component.literal("Used to cast §8Abi-Dalzim's Horrid Writing§f, a Level 8 §8Necromancy §fspell."));
                            break;
                        case "white_wool":
                        case "orange_wool":
                        case "magenta_wool":
                        case "light_blue_wool":
                        case "yellow_wool":
                        case "lime_wool":
                        case "pink_wool":
                        case "gray_wool":
                        case "light_gray_wool":
                        case "cyan_wool":
                        case "purple_wool":
                        case "blue_wool":
                        case "brown_wool":
                        case "green_wool":
                        case "red_wool":
                        case "black_wool":
                            event.getToolTip().add(Component.literal("Used to cast §5Minor Illusion§f, a Level 0 §5Illusion §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §5Silent Image§f, a Level 1 §5Illusion §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §5Phantasmal Force§f, a Level 2 §5Illusion §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §5Major Image§f, a Level 3 §5Illusion §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §5Programmed Illusion§f, a Level 6 §5Illusion §fspell."));
                            break;
                        case "lodestone":
                            event.getToolTip().add(Component.literal("Used to cast §2Mending§f, a Level 0 §2Transmutation §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §2Disintegrate§f, a Level 6 §2Transmutation §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §2Reverse Gravity§f, a Level 7 §2Transmutation §fspell."));
                            break;
                        case "oak_wood":
                            event.getToolTip().add(Component.literal("Used to cast §2Barkskin§f, a Level 2 §2Transmutation §fspell."));
                            break;
                        case "obsidian":
                            event.getToolTip().add(Component.literal("Used to cast §2Erupting Earth§f, a Level 3 §2Transmutation §fspell."));
                            break;
                        case "grass":
                        case "fern":
                        case "bamboo":
                        case "big_dripleaf":
                        case "small_dripleaf":
                        case "lily_pad":
                        case "seagrass":
                        case "kelp":
                        case "sea_pickle":
                        case "vine":
                            event.getToolTip().add(Component.literal("Used to cast §5Hallucinatory Terrain§f, a Level 4 §5Illusion §fspell."));
                            break;
                        case "sugar_cane":
                            event.getToolTip().add(Component.literal("Used to cast §5Hallucinatory Terrain§f, a Level 4 §5Illusion §fspell."));
                            event.getToolTip().add(Component.literal("Used to cast §2Water Breathing§f, a Level 3 §2Transmutation §fspell."));
                            break;
                        case "mithril_chain":
                        case "gold_chain":
                        case "silver_chain":
                        case "platinum_chain":
                        case "adamant_chain":
                            event.getToolTip().add(Component.literal("Used to cast §eImprisonment§f, a Level 9 §eAbjuration §fspell."));
                            break;
                    }
                }
                else {
                    event.getToolTip().add(Component.literal("Press SHIFT for more info").withStyle(ChatFormatting.YELLOW));
                }
            }
        }
    }
}
