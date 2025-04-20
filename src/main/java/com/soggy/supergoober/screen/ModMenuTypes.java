package com.soggy.supergoober.screen;

import com.soggy.supergoober.SuperGoober;
import com.soggy.supergoober.screen.custom.GodmodeMenu;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.network.IContainerFactory;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModMenuTypes {
    //comment
    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(Registries.MENU, SuperGoober.MODID);

    public static final DeferredHolder<MenuType<?>, MenuType<GodmodeMenu>> GODMODE_MENU = registerMenuType("godmode_menu");

    public static <T extends AbstractContainerMenu>DeferredHolder<MenuType<?>, MenuType<T>> registerMenuType(String name)
    {
        return MENUS.register(name,() -> null);
    }

    public static void register(IEventBus eventBus)
    {
        MENUS.register(eventBus);
    }
}
