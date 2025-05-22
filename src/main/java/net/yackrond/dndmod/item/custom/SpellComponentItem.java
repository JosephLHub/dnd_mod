package net.yackrond.dndmod.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SpellComponentItem extends Item{
    private List<String> spellList;
    private final List<Integer> levels;
    private List<String> schools;

    //Spell School Colour Guide:
    // Abjuration = Yellow (§e)
    // Conjuration = Blue (§9)
    // Divination = Aqua (§b)
    // Enchantment = Light Purple (§d)
    // Evocation = Dark Red (§4)
    // Illusion = Dark Purple (§5)
    // Necromancy = Dark Grey (§8)
    // Transmutation = Dark Green (§2)

    public SpellComponentItem(Item.Properties pProperties, List<String> spellList, List<Integer> levels, List<String> schools) {
        super(pProperties);
        this.spellList = spellList;
        this.levels = levels;
        this.schools = schools;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if(Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.literal(""));
            for (int i = 0; i < spellList.size(); i++) {
                pTooltipComponents.add(Component.literal(String.format("Used to cast %s§f, a Level %d %s §fspell.", spellList.get(i), levels.get(i), schools.get(i))));
            }
        }
        else {
            pTooltipComponents.add(Component.literal("Press SHIFT for more info").withStyle(ChatFormatting.YELLOW));
        }
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
