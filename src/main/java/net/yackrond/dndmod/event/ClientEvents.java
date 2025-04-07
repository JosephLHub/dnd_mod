package net.yackrond.dndmod.event;

import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.yackrond.dndmod.DnDMod;
import net.yackrond.dndmod.networking.ModMessages;
import net.yackrond.dndmod.networking.packet.ExampleC2SPacket;
import net.yackrond.dndmod.util.KeyBindings;

public class ClientEvents {
    @Mod.EventBusSubscriber(modid = DnDMod.MOD_ID, value = Dist.CLIENT)
    public static class ClientForgeEvents {
        @SubscribeEvent
        public static void onKeyInput(InputEvent.Key event) {
            if(KeyBindings.CASTING_KEY.consumeClick()) {
                ModMessages.sendToServer(new ExampleC2SPacket());
            }
        }
    }

    @Mod.EventBusSubscriber(modid = DnDMod.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModBusEvents {
        @SubscribeEvent
        public static void onKeyRegister(RegisterKeyMappingsEvent event) {
            event.register(KeyBindings.CASTING_KEY);
        }
    }
}
