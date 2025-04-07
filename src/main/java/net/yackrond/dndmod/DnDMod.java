package net.yackrond.dndmod;

import com.mojang.logging.LogUtils;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.yackrond.dndmod.block.ModBlocks;
import net.yackrond.dndmod.block.entity.ModBlockEntities;
import net.yackrond.dndmod.item.ModCreativeModeTabs;
import net.yackrond.dndmod.item.ModItems;
import net.yackrond.dndmod.networking.ModMessages;
import net.yackrond.dndmod.recipe.ModRecipes;
import net.yackrond.dndmod.screen.MaceratorScreen;
import net.yackrond.dndmod.screen.ModMenuTypes;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(DnDMod.MOD_ID)
public class DnDMod
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "dndmod";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public DnDMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModBlockEntities.register(modEventBus);
        ModMenuTypes.register(modEventBus);

        ModRecipes.register(modEventBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ModMessages.register();
        });

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.YEW_LOG);
            event.accept(ModBlocks.YEW_WOOD);
            event.accept(ModBlocks.STRIPPED_YEW_LOG);
            event.accept(ModBlocks.STRIPPED_YEW_WOOD);
            event.accept(ModBlocks.YEW_LEAVES);
            event.accept(ModBlocks.YEW_PLANKS);
            event.accept(ModBlocks.YEW_STAIRS);
            event.accept(ModBlocks.YEW_SLAB);
            event.accept(ModBlocks.YEW_FENCE);
            event.accept(ModBlocks.YEW_FENCE_GATE);
            event.accept(ModBlocks.YEW_DOOR);
            event.accept(ModBlocks.YEW_TRAPDOOR);
            event.accept(ModBlocks.YEW_PRESSURE_PLATE);
            event.accept(ModBlocks.YEW_BUTTON);

        }
        else if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.SILVER_INGOT);
            event.accept(ModItems.SILVER_NUGGET);
            event.accept(ModItems.RAW_SILVER);
            event.accept(ModItems.PLATINUM_INGOT);
            event.accept(ModItems.PLATINUM_NUGGET);
            event.accept(ModItems.RAW_PLATINUM);
            event.accept(ModItems.ADAMANT_INGOT);
            event.accept(ModItems.ADAMANT_NUGGET);
            event.accept(ModItems.RAW_ADAMANT);
            event.accept(ModItems.RUBY);
            event.accept(ModItems.SAPPHIRE);
            event.accept(ModItems.CHRYSOLITE);
            event.accept(ModItems.SUNSTONE);
            event.accept(ModItems.POWDERED_DIAMOND);
            event.accept(ModItems.POWDERED_EMERALD);
            event.accept(ModItems.POWDERED_IRON);
            event.accept(ModItems.POWDERED_GOLD);
            event.accept(ModItems.POWDERED_SILVER);
            event.accept(ModItems.POWDERED_PLATINUM);
            event.accept(ModItems.POWDERED_ADAMANT);
            event.accept(ModItems.POWDERED_RUBY);
            event.accept(ModItems.POWDERED_SAPPHIRE);
            event.accept(ModItems.POWDERED_CHRYSOLITE);
            event.accept(ModItems.POWDERED_SUNSTONE);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            MenuScreens.register(ModMenuTypes.MACERATING_MENU.get(), MaceratorScreen::new);
        }
    }
}
