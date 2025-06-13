package net.yackrond.dndmod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.network.chat.Component;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.PotionItem;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.yackrond.dndmod.DnDMod;
import net.yackrond.dndmod.block.ModBlocks;
import net.yackrond.dndmod.item.ModItems;
import net.yackrond.dndmod.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, DnDMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.YEW_LOG.get().asItem())
                .add(ModBlocks.YEW_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_YEW_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_YEW_WOOD.get().asItem());
        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.YEW_PLANKS.get().asItem());
        //TODO: add various wood items to 'wood'-requiring spells
        for (Item i : ForgeRegistries.ITEMS) {
            if (i.toString().contains("dye") || i.toString().contains("arrow") || i.toString().contains("sword") || i.toString().contains("axe")) {
                this.tag(ModTags.Items.SPELL_COMPONENT).add(i);
            }
            else if (i.isEdible()) {
                this.tag(ModTags.Items.SPELL_COMPONENT).add(i);
            }
        }
        for (Block i : ForgeRegistries.BLOCKS) {
            if (i.toString().contains("wool") || i.toString().contains("log")) {
                this.tag(ModTags.Items.SPELL_COMPONENT).add(i.asItem());
            }
        }
        this.tag(ModTags.Items.SPELL_COMPONENT)
                .add(ModBlocks.YEW_LOG.get().asItem())
                .add(Blocks.SPRUCE_SAPLING.asItem())
                .add(Items.DIAMOND)
                .add(Items.EMERALD)
                .add(Items.AMETHYST_SHARD)
                .add(Items.CHARCOAL)
                .add(Blocks.ICE.asItem())
                .add(Blocks.BRICKS.asItem())
                .add(Blocks.CALCITE.asItem())
                .add(Items.STRING)
                .add(Items.WHEAT)
                .add(Items.FEATHER)
                .add(Blocks.COBWEB.asItem())
                .add(Items.SUGAR)
                .add(Items.BOOK)
                .add(Items.EGG)
                .add(Items.BONE)
                .add(Items.GLASS_BOTTLE)
                .add(Items.SWEET_BERRIES)
                .add(Items.IRON_INGOT)
                .add(Items.HONEYCOMB)
                .add(Blocks.SAND.asItem())
                .add(Items.HONEY_BOTTLE)
                .add(Items.ROTTEN_FLESH)
                .add(Items.COAL)
                .add(Blocks.GRANITE.asItem())
                .add(Items.QUARTZ)
                .add(Blocks.DIRT.asItem())
                .add(Blocks.STONE.asItem())
                .add(Items.CLAY_BALL)
                .add(Items.FIRE_CHARGE)
                .add(Items.STICK)
                .add(Items.INK_SAC)
                .add(Blocks.SNOW_BLOCK.asItem())
                .add(Blocks.SPONGE.asItem())
                .add(Blocks.LODESTONE.asItem())
                .add(Blocks.OAK_WOOD.asItem())
                .add(Blocks.OBSIDIAN.asItem())
                .add(Blocks.SEA_PICKLE.asItem())
                .add(Items.KELP)
                .add(Items.LEAD)
                .add(Items.LEATHER)
                .add(Blocks.SEAGRASS.asItem())
                .add(Blocks.GRASS.asItem())
                .add(Blocks.VINE.asItem())
                .add(Blocks.FERN.asItem())
                .add(Blocks.BIG_DRIPLEAF.asItem())
                .add(Blocks.SMALL_DRIPLEAF.asItem())
                .add(Blocks.LILY_PAD.asItem())
                .add(Blocks.TINTED_GLASS.asItem())
                .add(Items.BAMBOO)
                .add(ModItems.MITHRIL_CHAIN.get())
                .add(ModItems.GOLD_CHAIN.get())
                .add(ModItems.SILVER_CHAIN.get())
                .add(ModItems.PLATINUM_CHAIN.get())
                .add(ModItems.ADAMANT_CHAIN.get())
                .add(Items.SUGAR_CANE);
    }
}
