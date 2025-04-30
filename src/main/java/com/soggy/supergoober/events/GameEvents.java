package com.soggy.supergoober.events;

import com.soggy.supergoober.KeyMappings.ModKeyMappings;
import com.soggy.supergoober.SuperGoober;
import com.soggy.supergoober.screen.custom.LifestealerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ScreenEvent;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;

@EventBusSubscriber(modid = SuperGoober.MODID)
public class GameEvents {

    @SubscribeEvent
    public static void onPlayerTick(PlayerTickEvent.Post event)
    {
        Player p = event.getEntity();
        if(p.getTags().contains("Lifestealer") && !p.level().isClientSide()) {
            while (ModKeyMappings.LifestealerMapping.consumeClick()) {
                LifestealerScreen newLifeScreen = new LifestealerScreen(Component.literal("Lifestealer Screen"));
                newLifeScreen.init();
            }
        }
    }

}
