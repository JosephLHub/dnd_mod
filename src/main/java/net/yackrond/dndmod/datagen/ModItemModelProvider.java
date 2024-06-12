package net.yackrond.dndmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.yackrond.dndmod.DnDMod;
import net.yackrond.dndmod.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, DnDMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.METAL_DETECTOR);

        simpleItem(ModItems.MINIATURE_CLOAK);
        simpleItem(ModItems.OIL_BOTTLE);
        simpleItem(ModItems.TINY_BELL);
        simpleItem(ModItems.ROTTEN_EGG);

        simpleItem(ModItems.PLATINUM_INGOT);
        simpleItem(ModItems.PLATINUM_NUGGET);
        simpleItem(ModItems.RAW_PLATINUM);

        simpleItem(ModItems.SILVER_INGOT);
        simpleItem(ModItems.SILVER_NUGGET);
        simpleItem(ModItems.RAW_SILVER);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(DnDMod.MOD_ID, "item/" + item.getId().getPath()));
    }
}
