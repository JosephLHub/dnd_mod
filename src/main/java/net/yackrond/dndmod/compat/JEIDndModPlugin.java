package net.yackrond.dndmod.compat;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;
import net.yackrond.dndmod.DnDMod;
import net.yackrond.dndmod.recipe.MaceratingRecipe;
import net.yackrond.dndmod.screen.MaceratorScreen;

import java.util.List;

@JeiPlugin
public class JEIDndModPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(DnDMod.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new MaceratingCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();

        List<MaceratingRecipe> maceratingRecipes = recipeManager.getAllRecipesFor(MaceratingRecipe.Type.INSTANCE);
        registration.addRecipes(MaceratingCategory.MACERATING_TYPE, maceratingRecipes);
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(MaceratorScreen.class, 73, 35, 38, 15, MaceratingCategory.MACERATING_TYPE);
    }
}
