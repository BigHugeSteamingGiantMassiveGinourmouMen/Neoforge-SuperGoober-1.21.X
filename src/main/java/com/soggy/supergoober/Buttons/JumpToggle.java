package com.soggy.supergoober.Buttons;

import net.minecraft.client.gui.components.Button;
import net.minecraft.network.chat.Component;

public class JumpToggle extends Button
{
    public JumpToggle(int x, int y, int width, int height, Component message, OnPress onPress, CreateNarration createNarration) {
        super(x, y, width, height, message, onPress, createNarration);
    }
    @Override
    public void onPress()
    {
        //Player gets permanent strength increase
    }
}
