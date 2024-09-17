package net.yackrond.dndmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.yackrond.dndmod.DnDMod;
import net.yackrond.dndmod.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DnDMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> DND_TAB = CREATIVE_MODE_TABS.register("dnd_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SILVER_INGOT.get()))
                    .title(Component.translatable("creativetab.dnd_tab")).displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SILVER_INGOT.get());
                        pOutput.accept(ModItems.SILVER_NUGGET.get());
                        pOutput.accept(ModItems.RAW_SILVER.get());
                        pOutput.accept(ModItems.METAL_DETECTOR.get());

                        pOutput.accept(ModBlocks.SILVER_ORE.get());
                        pOutput.accept(ModBlocks.SILVER_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_SILVER_BLOCK.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_SILVER_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_SILVER_ORE.get());
                        pOutput.accept(ModBlocks.END_SILVER_ORE.get());

                        pOutput.accept(ModBlocks.PLATINUM_ORE.get());
                        pOutput.accept(ModBlocks.PLATINUM_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_PLATINUM_BLOCK.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_PLATINUM_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_PLATINUM_ORE.get());
                        pOutput.accept(ModBlocks.END_PLATINUM_ORE.get());

                        pOutput.accept(ModBlocks.ADAMANT_ORE.get());
                        pOutput.accept(ModBlocks.ADAMANT_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_ADAMANT_BLOCK.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_ADAMANT_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_ADAMANT_ORE.get());
                        pOutput.accept(ModBlocks.END_ADAMANT_ORE.get());

                        pOutput.accept(ModBlocks.RUBY_ORE.get());
                        pOutput.accept(ModBlocks.RUBY_BLOCK.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_RUBY_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_RUBY_ORE.get());
                        pOutput.accept(ModBlocks.END_RUBY_ORE.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.END_SAPPHIRE_ORE.get());

                        pOutput.accept(ModBlocks.CHRYSOLITE_ORE.get());
                        pOutput.accept(ModBlocks.CHRYSOLITE_BLOCK.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_CHRYSOLITE_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_CHRYSOLITE_ORE.get());
                        pOutput.accept(ModBlocks.END_CHRYSOLITE_ORE.get());

                        pOutput.accept(ModBlocks.SOUND_BLOCK.get());
                        pOutput.accept(ModBlocks.SILVER_WALL.get());
                    }).build());
    public static final RegistryObject<CreativeModeTab> SPELL_COMPONENTS_TAB = CREATIVE_MODE_TABS.register("spell_components_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MINIATURE_CLOAK.get()))
            .title(Component.translatable("creativetab.spell_components_tab")).displayItems((pParameters, pOutput) -> {
                pOutput.accept(ModItems.MINIATURE_CLOAK.get());
                pOutput.accept(ModItems.TINY_BELL.get());
                pOutput.accept(ModItems.ROTTEN_EGG.get());
                pOutput.accept(ModItems.OIL_BOTTLE.get());

            }).build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
