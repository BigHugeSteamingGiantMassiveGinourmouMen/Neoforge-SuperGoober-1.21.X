package com.soggy.supergoober.entities;

import com.mojang.authlib.GameProfile;
import com.soggy.supergoober.screen.custom.GodmodeMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class GodmodePlayerEntity extends Player implements MenuProvider {

    public GodmodePlayerEntity(Level level, BlockPos pos, float yRot, GameProfile gameProfile) {
        super(level, pos, yRot, gameProfile);
    }

    @Override
    public boolean isSpectator() {
        return false;
    }

    @Override
    public boolean isCreative() {
        return false;
    }

    @Override
    public Component getDisplayName() {
        return Component.literal("Godmode");
    }

    @Override
    public @Nullable AbstractContainerMenu createMenu(int i, Inventory inventory, Player player) {
        return new GodmodeMenu(inventory, i);
    }
}
