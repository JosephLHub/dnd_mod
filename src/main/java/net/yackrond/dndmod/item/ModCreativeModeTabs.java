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
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MINIATURE_CLOAK.get()))
                    .title(Component.translatable("creativetab.dnd_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.MINIATURE_CLOAK.get());
                        pOutput.accept(ModItems.TINY_BELL.get());
                        pOutput.accept(ModItems.SILVER_INGOT.get());
                        pOutput.accept(ModItems.SILVER_NUGGET.get());
                        pOutput.accept(ModItems.RAW_SILVER.get());
                        pOutput.accept(ModItems.METAL_DETECTOR.get());

                        pOutput.accept(ModBlocks.SILVER_ORE.get());
                        pOutput.accept(ModBlocks.SILVER_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_SILVER_BLOCK.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_SILVER_ORE.get());

                        pOutput.accept(ModBlocks.PLATINUM_ORE.get());
                        pOutput.accept(ModBlocks.PLATINUM_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_PLATINUM_BLOCK.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_PLATINUM_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_PLATINUM_ORE.get());
                        pOutput.accept(ModBlocks.END_PLATINUM_ORE.get());
                        pOutput.accept(ModBlocks.SOUND_BLOCK.get());
                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
