package net.yackrond.dndmod.compat;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.yackrond.dndmod.DnDMod;
import net.yackrond.dndmod.block.ModBlocks;
import net.yackrond.dndmod.recipe.MaceratingRecipe;
import org.jetbrains.annotations.Nullable;

public class MaceratingCategory implements IRecipeCategory<MaceratingRecipe> {
    public static final ResourceLocation UID = new ResourceLocation(DnDMod.MOD_ID, "macerating");
    public static final ResourceLocation TEXTURE = new ResourceLocation(DnDMod.MOD_ID, "textures/gui/macerator_gui.png");

    public static final RecipeType<MaceratingRecipe> MACERATING_TYPE = new RecipeType<>(UID, MaceratingRecipe.class);

    private final IDrawable background;
    private final IDrawable icon;

    public MaceratingCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ModBlocks.MACERATOR.get()));
    }

    @Override
    public RecipeType<MaceratingRecipe> getRecipeType() {
        return MACERATING_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.translatable("block.dndmod.macerator");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public @Nullable IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, MaceratingRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 56, 35).addIngredients(recipe.getIngredients().get(0));

        builder.addSlot(RecipeIngredientRole.OUTPUT, 116, 35).addItemStack(recipe.getResultItem(null));

    }
}
