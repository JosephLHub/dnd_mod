package net.yackrond.dndmod.recipe;

import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yackrond.dndmod.DnDMod;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALISERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, DnDMod.MOD_ID);

    public static final RegistryObject<RecipeSerializer<MaceratingRecipe>> MACERATING_SERIALISER = SERIALISERS.register("macerating", () ->
            MaceratingRecipe.Seraliser.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALISERS.register(eventBus);
    }
}
