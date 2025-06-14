package net.yackrond.dndmod.datagen;

import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yackrond.dndmod.DnDMod;
import net.yackrond.dndmod.block.ModBlocks;
import org.jetbrains.annotations.NotNull;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, DnDMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //METAL ORES
        blockWithItem(ModBlocks.SILVER_BLOCK);
        blockWithItem(ModBlocks.RAW_SILVER_BLOCK);
        blockWithItem(ModBlocks.SILVER_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_SILVER_ORE);
        blockWithItem(ModBlocks.NETHER_SILVER_ORE);
        blockWithItem(ModBlocks.END_SILVER_ORE);

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

        //GEM ORES
        blockWithItem(ModBlocks.RUBY_BLOCK);
        blockWithItem(ModBlocks.RUBY_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_RUBY_ORE);
        blockWithItem(ModBlocks.NETHER_RUBY_ORE);
        blockWithItem(ModBlocks.END_RUBY_ORE);

        blockWithItem(ModBlocks.SAPPHIRE_BLOCK);
        blockWithItem(ModBlocks.SAPPHIRE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.NETHER_SAPPHIRE_ORE);
        blockWithItem(ModBlocks.END_SAPPHIRE_ORE);

        blockWithItem(ModBlocks.CHRYSOLITE_BLOCK);
        blockWithItem(ModBlocks.CHRYSOLITE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_CHRYSOLITE_ORE);
        blockWithItem(ModBlocks.NETHER_CHRYSOLITE_ORE);
        blockWithItem(ModBlocks.END_CHRYSOLITE_ORE);

        blockWithItem(ModBlocks.SUNSTONE_BLOCK);
        blockWithItem(ModBlocks.SUNSTONE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_SUNSTONE_ORE);
        blockWithItem(ModBlocks.NETHER_SUNSTONE_ORE);
        blockWithItem(ModBlocks.END_SUNSTONE_ORE);

        //WOOD
        logBlock((RotatedPillarBlock) ModBlocks.YEW_LOG.get());
        axisBlock(((RotatedPillarBlock) ModBlocks.YEW_WOOD.get()), blockTexture(ModBlocks.YEW_LOG.get()), blockTexture(ModBlocks.YEW_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_YEW_LOG.get()), blockTexture(ModBlocks.STRIPPED_YEW_LOG.get()),
                new ResourceLocation(DnDMod.MOD_ID, "block/stripped_yew_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_YEW_WOOD.get()), blockTexture(ModBlocks.STRIPPED_YEW_LOG.get()), blockTexture(ModBlocks.STRIPPED_YEW_LOG.get()));

        blockItem(ModBlocks.YEW_LOG);
        blockItem(ModBlocks.YEW_WOOD);
        blockItem(ModBlocks.STRIPPED_YEW_LOG);
        blockItem(ModBlocks.STRIPPED_YEW_WOOD);
        leavesBlock(ModBlocks.YEW_LEAVES);
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

        signBlock(((StandingSignBlock) ModBlocks.YEW_SIGN.get()), ((WallSignBlock) ModBlocks.YEW_WALL_SIGN.get()), blockTexture(ModBlocks.YEW_PLANKS.get()));
        hangingSignBlock(ModBlocks.YEW_HANGING_SIGN.get(), ModBlocks.YEW_WALL_HANGING_SIGN.get(), blockTexture(ModBlocks.YEW_PLANKS.get()));
        saplingBlock(ModBlocks.YEW_SAPLING);

        blockItem(ModBlocks.MITHRIL_CHAIN);
        chainBlock(ModBlocks.MITHRIL_CHAIN.get(), blockTexture(ModBlocks.MITHRIL_CHAIN.get()));
        blockItem(ModBlocks.GOLD_CHAIN);
        chainBlock(ModBlocks.GOLD_CHAIN.get(), blockTexture(ModBlocks.GOLD_CHAIN.get()));
        blockItem(ModBlocks.SILVER_CHAIN);
        chainBlock(ModBlocks.SILVER_CHAIN.get(), blockTexture(ModBlocks.SILVER_CHAIN.get()));
        blockItem(ModBlocks.PLATINUM_CHAIN);
        chainBlock(ModBlocks.PLATINUM_CHAIN.get(), blockTexture(ModBlocks.PLATINUM_CHAIN.get()));
        blockItem(ModBlocks.ADAMANT_CHAIN);
        chainBlock(ModBlocks.ADAMANT_CHAIN.get(), blockTexture(ModBlocks.ADAMANT_CHAIN.get()));

        //MACHINES
        simpleBlockWithItem(ModBlocks.MACERATOR.get(), new ModelFile.UncheckedModelFile(modLoc("block/macerator")));
        blockWithItem(ModBlocks.SOUND_BLOCK);

    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void chainBlock(Block chainBlock, ResourceLocation loc) {
        ModelFile model = models().withExistingParent(chainBlock.asItem().toString(), mcLoc("block/chain"))
                .renderType("cutout_mipped")
                .texture("particle", loc)
                .texture("all", loc);

        getVariantBuilder(chainBlock).forAllStatesExcept(
                state -> ConfiguredModel.builder()
                        .modelFile(model)
                        .rotationX(state.getValue(BlockStateProperties.AXIS) != Direction.Axis.Y ? 90 : 0)
                        .rotationY(state.getValue(BlockStateProperties.AXIS) == Direction.Axis.X ? 90 : 0)
                        .build(),
                BlockStateProperties.WATERLOGGED
        );
    }

    private void hangingSignBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), texture);
        hangingSignBlock(signBlock, wallSignBlock, sign);
    }

    private void hangingSignBlock(Block signBlock, Block wallSignBlock, ModelFile sign) {
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
    }

    private String name(Block block) {
        return key(block).getPath();
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(),
                new ResourceLocation("minecraft:block/leaves"), "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(),
                new ModelFile.UncheckedModelFile(DnDMod.MOD_ID + ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
