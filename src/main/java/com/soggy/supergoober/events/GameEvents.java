package com.soggy.supergoober.events;

import com.mojang.blaze3d.vertex.MeshData;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.soggy.supergoober.KeyMappings.ModKeyMappings;
import com.soggy.supergoober.SuperGoober;
import com.soggy.supergoober.screen.custom.LifestealerScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ScreenEvent;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;

@EventBusSubscriber(modid = SuperGoober.MODID, bus = EventBusSubscriber.Bus.GAME)
public class GameEvents {
    private static boolean lifeScreenOpen = false;
    private static boolean eventCheck = false;
    @SubscribeEvent
    public static void onPlayerTick(PlayerTickEvent.Post event)
    {
        Player p = event.getEntity();



        if(!p.level().isClientSide()) return;

        if(!lifeScreenOpen) {
            if(!eventCheck) {
                System.out.println("THIS IS A VERY OBIVOUS PRINT LINE YOU DUMBASS");
                eventCheck = true;
            }
            LifestealerScreen newLifeScreen = new LifestealerScreen(Component.literal("Lifestealer Screen"));

            if (ModKeyMappings.LifestealerMapping.consumeClick()) {
                System.out.println(p.experienceLevel);
                Minecraft.getInstance().setScreen(newLifeScreen);
                lifeScreenOpen = true;
            }

        }
    }

    public static void resetLifeScreen()
    {
        lifeScreenOpen = false;
    }

}

