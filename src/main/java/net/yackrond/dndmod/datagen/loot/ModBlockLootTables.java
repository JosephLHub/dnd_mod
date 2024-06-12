package net.yackrond.dndmod.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import net.yackrond.dndmod.block.ModBlocks;
import net.yackrond.dndmod.item.ModItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {

    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.SILVER_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_SILVER_BLOCK.get());
        this.dropSelf(ModBlocks.PLATINUM_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_PLATINUM_BLOCK.get());
        this.dropSelf(ModBlocks.SOUND_BLOCK.get());

        this.add(ModBlocks.SILVER_ORE.get(), block -> createModdedOreDrops(ModBlocks.SILVER_ORE.get(), ModItems.RAW_SILVER.get(), 2.0F, 5.0F));
        this.add(ModBlocks.DEEPSLATE_SILVER_ORE.get(), block -> createModdedOreDrops(ModBlocks.DEEPSLATE_SILVER_ORE.get(), ModItems.RAW_SILVER.get(), 2.0F, 5.0F));
        this.add(ModBlocks.PLATINUM_ORE.get(), block -> createModdedOreDrops(ModBlocks.PLATINUM_ORE.get(), ModItems.RAW_PLATINUM.get(), 1.0F, 3.0F));
        this.add(ModBlocks.DEEPSLATE_PLATINUM_ORE.get(), block -> createModdedOreDrops(ModBlocks.DEEPSLATE_PLATINUM_ORE.get(), ModItems.RAW_PLATINUM.get(), 1.0F, 3.0F));
        this.add(ModBlocks.NETHER_PLATINUM_ORE.get(), block -> createModdedOreDrops(ModBlocks.NETHER_PLATINUM_ORE.get(), ModItems.RAW_PLATINUM.get(), 2.0F, 4.0F));
        this.add(ModBlocks.END_PLATINUM_ORE.get(), block -> createModdedOreDrops(ModBlocks.END_PLATINUM_ORE.get(), ModItems.RAW_PLATINUM.get(), 3.0F, 5.0F));
    }

    protected LootTable.Builder createModdedOreDrops(Block pBlock, Item item, float pMin, float pMax) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(pMin, pMax)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
