package com.soggy.supergoober.events;

import com.soggy.supergoober.KeyMappings.ModKeyMappings;
import com.soggy.supergoober.SuperGoober;
import net.minecraft.client.KeyMapping;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;

@EventBusSubscriber(modid = SuperGoober.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEvents {
    //comment
    @SubscribeEvent
    public static void registerBindings(RegisterKeyMappingsEvent event)
    {
        event.register(ModKeyMappings.GodmodeMapping);
    }
}
