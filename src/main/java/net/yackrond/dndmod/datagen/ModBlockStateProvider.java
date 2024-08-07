package net.yackrond.dndmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.yackrond.dndmod.DnDMod;
import net.yackrond.dndmod.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, DnDMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.PLATINUM_BLOCK);
        blockWithItem(ModBlocks.RAW_PLATINUM_BLOCK);
        blockWithItem(ModBlocks.PLATINUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_PLATINUM_ORE);
        blockWithItem(ModBlocks.NETHER_PLATINUM_ORE);
        blockWithItem(ModBlocks.END_PLATINUM_ORE);

        blockWithItem(ModBlocks.ADAMANT_BLOCK);
        blockWithItem(ModBlocks.RAW_ADAMANT_BLOCK);
        blockWithItem(ModBlocks.ADAMANT_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_ADAMANT_ORE);
        blockWithItem(ModBlocks.NETHER_ADAMANT_ORE);
        blockWithItem(ModBlocks.END_ADAMANT_ORE);

        blockWithItem(ModBlocks.SILVER_BLOCK);
        blockWithItem(ModBlocks.RAW_SILVER_BLOCK);
        blockWithItem(ModBlocks.SILVER_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_SILVER_ORE);

        blockWithItem(ModBlocks.YEW_PLANKS);
        stairsBlock(((StairBlock) ModBlocks.YEW_STAIRS.get()), blockTexture(ModBlocks.YEW_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.YEW_SLAB.get()), blockTexture(ModBlocks.YEW_PLANKS.get()), blockTexture(ModBlocks.YEW_PLANKS.get()));
        buttonBlock(((ButtonBlock) ModBlocks.YEW_BUTTON.get()), blockTexture(ModBlocks.YEW_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.YEW_PRESSURE_PLATE.get()), blockTexture(ModBlocks.YEW_PLANKS.get()));
        fenceBlock(((FenceBlock) ModBlocks.YEW_FENCE.get()), blockTexture(ModBlocks.YEW_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.YEW_FENCE_GATE.get()), blockTexture(ModBlocks.YEW_PLANKS.get()));
        wallBlock(((WallBlock) ModBlocks.SILVER_WALL.get()), blockTexture(ModBlocks.SILVER_BLOCK.get()));

        doorBlockWithRenderType(((DoorBlock) ModBlocks.YEW_DOOR.get()), modLoc("block/yew_door_bottom"), modLoc("block/yew_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.YEW_TRAPDOOR.get()), modLoc("block/yew_trapdoor"), true, "cutout");

        blockWithItem(ModBlocks.SOUND_BLOCK);

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
