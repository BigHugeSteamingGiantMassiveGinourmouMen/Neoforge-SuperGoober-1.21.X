package com.soggy.supergoober.Buttons;

import net.minecraft.client.gui.components.Button;
import net.minecraft.network.chat.Component;

public class NightVision extends Button{
    public NightVision(int x, int y, int width, int height, Component message, Button.OnPress onPress, CreateNarration createNarration) {
        super(x, y, width, height, message, onPress, createNarration);
    }
    @Override
    public void onPress()
    {
        //Player gets permanent night vision
    }
}
