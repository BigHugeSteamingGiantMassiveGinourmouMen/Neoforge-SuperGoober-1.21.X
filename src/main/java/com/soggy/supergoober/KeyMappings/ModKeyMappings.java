package com.soggy.supergoober.KeyMappings;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.neoforged.neoforge.client.settings.KeyConflictContext;
import net.neoforged.neoforge.client.settings.KeyModifier;
import org.lwjgl.glfw.GLFW;

public final class ModKeyMappings {

    //works in any screen
    //"F" key default map
    //changed in misc category of settings
    public static final KeyMapping LifestealerMapping = new KeyMapping("Lifestealer Permanent Upgrades", KeyConflictContext.UNIVERSAL,InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_F,"key.categories.misc");
    //comment
}
