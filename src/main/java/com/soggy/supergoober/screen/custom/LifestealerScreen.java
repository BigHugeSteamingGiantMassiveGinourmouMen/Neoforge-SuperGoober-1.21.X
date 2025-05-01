package com.soggy.supergoober.screen.custom;

import com.mojang.blaze3d.systems.RenderSystem;
import com.soggy.supergoober.Buttons.StrengthUp;
import com.soggy.supergoober.SuperGoober;
import com.soggy.supergoober.events.GameEvents;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.components.Tooltip;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Supplier;

public class LifestealerScreen extends Screen {
    public static final ResourceLocation GUI_TEXTURE = ResourceLocation.fromNamespaceAndPath(SuperGoober.MODID,"textures/gui/lifestealer_screen.png");

    public LifestealerScreen(Component title) {
        super(title);
    }

    @Override
    public void init() {
        super.init();
        Component message = Component.literal("StrengthUp");
        //look here first for errors (CreateNarration)
        Button.CreateNarration createNarration = new Button.CreateNarration() {
            @Override
            public MutableComponent createNarrationMessage(Supplier<MutableComponent> supplier) {
                return null;
            }
        };
        // Add widgets and precomputed values
        StrengthUp strButton = new StrengthUp(6,3,73,18,message,Button::onPress,createNarration); //look here second (onPress)
        this.addRenderableWidget(strButton);
    }
    // mouseX and mouseY indicate the scaled coordinates of where the cursor is in on the screen
    @Override
    public void render(GuiGraphics graphics, int mouseX, int mouseY, float partialTick) {
        // Background is typically rendered first
        //this.renderBackground(graphics, mouseX, mouseY, partialTick);
        //Render things here before widgets (background textures)
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, GUI_TEXTURE);

        int x = (width - 201) / 2;
        int y = (height - 186) / 2;

        graphics.blit(GUI_TEXTURE, x, y, 0, 0, 201, 186);
        // Then the widgets if this is a direct child of the Screen
        super.render(graphics, mouseX, mouseY, partialTick);

        // Render things after widgets (tooltips)
    }
    @Override
    public void onClose()
    {
        super.onClose();
        GameEvents.resetLifeScreen();
    }
}
