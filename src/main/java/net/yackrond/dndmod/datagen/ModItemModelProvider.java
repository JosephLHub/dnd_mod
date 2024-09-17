package net.yackrond.dndmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yackrond.dndmod.DnDMod;
import net.yackrond.dndmod.block.ModBlocks;
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

        simpleItem(ModItems.ADAMANT_INGOT);
        simpleItem(ModItems.ADAMANT_NUGGET);
        simpleItem(ModItems.RAW_ADAMANT);

        simpleItem(ModItems.SILVER_INGOT);
        simpleItem(ModItems.SILVER_NUGGET);
        simpleItem(ModItems.RAW_SILVER);

        simpleItem(ModItems.RUBY);
        simpleItem(ModItems.SAPPHIRE);
        simpleItem(ModItems.CHRYSOLITE);

        simpleItem(ModItems.POWDERED_DIAMOND);
        simpleItem(ModItems.POWDERED_EMERALD);
        simpleItem(ModItems.POWDERED_IRON);
        simpleItem(ModItems.POWDERED_GOLD);
        simpleItem(ModItems.POWDERED_SILVER);
        simpleItem(ModItems.POWDERED_PLATINUM);
        simpleItem(ModItems.POWDERED_ADAMANT);
        simpleItem(ModItems.POWDERED_RUBY);
        simpleItem(ModItems.POWDERED_SAPPHIRE);
        simpleItem(ModItems.POWDERED_CHRYSOLITE);

        simpleBlockItem(ModBlocks.YEW_DOOR);
        fenceItem(ModBlocks.YEW_FENCE, ModBlocks.YEW_PLANKS);
        buttonItem(ModBlocks.YEW_BUTTON, ModBlocks.YEW_PLANKS);
        wallItem(ModBlocks.SILVER_WALL, ModBlocks.SILVER_BLOCK);

        evenSimplerBlockItem(ModBlocks.YEW_STAIRS);
        evenSimplerBlockItem(ModBlocks.YEW_SLAB);
        evenSimplerBlockItem(ModBlocks.YEW_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.YEW_FENCE_GATE);

        trapdoorItem(ModBlocks.YEW_TRAPDOOR);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(DnDMod.MOD_ID, "item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(DnDMod.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }
    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }
    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", new ResourceLocation(DnDMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }
    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture", new ResourceLocation(DnDMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }
    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", new ResourceLocation(DnDMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(), new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(DnDMod.MOD_ID, "item/" + item.getId().getPath()));
    }
}
