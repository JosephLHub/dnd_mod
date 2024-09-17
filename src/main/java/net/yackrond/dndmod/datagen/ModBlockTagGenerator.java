package net.yackrond.dndmod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.yackrond.dndmod.DnDMod;
import net.yackrond.dndmod.block.ModBlocks;
import net.yackrond.dndmod.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, DnDMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES).add(ModBlocks.SILVER_ORE.get()).addTag(Tags.Blocks.ORES);
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.SILVER_ORE.get(),
                        ModBlocks.RUBY_ORE.get(),
                        ModBlocks.SAPPHIRE_ORE.get(),
                        ModBlocks.CHRYSOLITE_ORE.get(),
                        ModBlocks.DEEPSLATE_RUBY_ORE.get(),
                        ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
                        ModBlocks.DEEPSLATE_CHRYSOLITE_ORE.get(),
                        ModBlocks.NETHER_RUBY_ORE.get(),
                        ModBlocks.NETHER_SAPPHIRE_ORE.get(),
                        ModBlocks.NETHER_CHRYSOLITE_ORE.get(),
                        ModBlocks.END_RUBY_ORE.get(),
                        ModBlocks.END_SAPPHIRE_ORE.get(),
                        ModBlocks.END_CHRYSOLITE_ORE.get(),
                        ModBlocks.RUBY_BLOCK.get(),
                        ModBlocks.SAPPHIRE_BLOCK.get(),
                        ModBlocks.CHRYSOLITE_BLOCK.get(),
                    ModBlocks.NETHER_SILVER_ORE.get(),
                    ModBlocks.END_SILVER_ORE.get(),
                    ModBlocks.DEEPSLATE_SILVER_ORE.get(),
                    ModBlocks.SILVER_BLOCK.get(),
                    ModBlocks.RAW_SILVER_BLOCK.get(),
                    ModBlocks.PLATINUM_ORE.get(),
                    ModBlocks.DEEPSLATE_PLATINUM_ORE.get(),
                    ModBlocks.NETHER_PLATINUM_ORE.get(),
                    ModBlocks.END_PLATINUM_ORE.get(),
                    ModBlocks.PLATINUM_BLOCK.get(),
                    ModBlocks.RAW_PLATINUM_BLOCK.get(),
                    ModBlocks.ADAMANT_ORE.get(),
                    ModBlocks.DEEPSLATE_ADAMANT_ORE.get(),
                    ModBlocks.NETHER_ADAMANT_ORE.get(),
                    ModBlocks.END_ADAMANT_ORE.get(),
                    ModBlocks.ADAMANT_BLOCK.get(),
                    ModBlocks.RAW_ADAMANT_BLOCK.get());
        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.SILVER_ORE.get(),
                    ModBlocks.RUBY_ORE.get(),
                    ModBlocks.SAPPHIRE_ORE.get(),
                    ModBlocks.CHRYSOLITE_ORE.get(),
                    ModBlocks.DEEPSLATE_RUBY_ORE.get(),
                    ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
                    ModBlocks.DEEPSLATE_CHRYSOLITE_ORE.get(),
                    ModBlocks.NETHER_RUBY_ORE.get(),
                    ModBlocks.NETHER_SAPPHIRE_ORE.get(),
                    ModBlocks.NETHER_CHRYSOLITE_ORE.get(),
                    ModBlocks.END_RUBY_ORE.get(),
                    ModBlocks.END_SAPPHIRE_ORE.get(),
                    ModBlocks.END_CHRYSOLITE_ORE.get(),
                    ModBlocks.RUBY_BLOCK.get(),
                    ModBlocks.SAPPHIRE_BLOCK.get(),
                    ModBlocks.CHRYSOLITE_BLOCK.get(),
                    ModBlocks.DEEPSLATE_SILVER_ORE.get(),
                    ModBlocks.NETHER_SILVER_ORE.get(),
                    ModBlocks.END_SILVER_ORE.get(),
                    ModBlocks.SILVER_BLOCK.get(),
                    ModBlocks.RAW_SILVER_BLOCK.get());
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.PLATINUM_ORE.get(),
                    ModBlocks.DEEPSLATE_PLATINUM_ORE.get(),
                    ModBlocks.NETHER_PLATINUM_ORE.get(),
                    ModBlocks.END_PLATINUM_ORE.get(),
                    ModBlocks.PLATINUM_BLOCK.get(),
                    ModBlocks.RAW_PLATINUM_BLOCK.get(),
                    ModBlocks.ADAMANT_ORE.get(),
                    ModBlocks.DEEPSLATE_ADAMANT_ORE.get(),
                    ModBlocks.NETHER_ADAMANT_ORE.get(),
                    ModBlocks.END_ADAMANT_ORE.get(),
                    ModBlocks.ADAMANT_BLOCK.get(),
                    ModBlocks.RAW_ADAMANT_BLOCK.get(),
                    ModBlocks.YEW_PLANKS.get());
        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.SOUND_BLOCK.get());

        this.tag(BlockTags.FENCES)
                .add(ModBlocks.YEW_FENCE.get());
        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.YEW_FENCE_GATE.get());
        this.tag(BlockTags.WALLS)
                .add(ModBlocks.SILVER_WALL.get());
    }
}
