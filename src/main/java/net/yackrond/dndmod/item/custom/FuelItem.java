package net.yackrond.dndmod.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class FuelItem extends Item {
    private int burnTime = 0;
    private List<String> spellList;
    private List<Integer> levels;
    private List<String> schools;
    public FuelItem(Properties pProperties, int burnTime) {
        super(pProperties);
        this.burnTime = burnTime;
    }

    public FuelItem(Properties pProperties, int burnTime, List<String> spellList, List<Integer> levels, List<String> schools) {
        super(pProperties);
        this.burnTime = burnTime;
        this.spellList = spellList;
        this.levels = levels;
        this.schools = schools;
    }


    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return this.burnTime;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if(this.spellList != null) {
            if(Screen.hasShiftDown()) {
                pTooltipComponents.add(Component.literal(""));
                for (int i = 0; i < spellList.size(); i++) {
                    pTooltipComponents.add(Component.literal(String.format("Used to cast %s§f, a Level %d %s §fspell.", spellList.get(i), levels.get(i), schools.get(i))));
                }
            }
            else {
                pTooltipComponents.add(Component.literal("Press SHIFT for more info").withStyle(ChatFormatting.YELLOW));
            }
        }
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
