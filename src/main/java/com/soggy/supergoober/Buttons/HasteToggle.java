package com.soggy.supergoober.Buttons;

import net.minecraft.client.gui.components.Button;
import net.minecraft.network.chat.Component;

public class HasteToggle extends Button {
    public HasteToggle(int x, int y, int width, int height, Component message, Button.OnPress onPress, Button.CreateNarration createNarration) {
        super(x, y, width, height, message, onPress, createNarration);
    }
    @Override
    public void onPress()
    {
        //Player gets permanent strength increase
    }
}
