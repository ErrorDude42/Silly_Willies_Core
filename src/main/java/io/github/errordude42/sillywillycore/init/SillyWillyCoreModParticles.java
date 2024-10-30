
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.errordude42.sillywillycore.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import io.github.errordude42.sillywillycore.client.particle.LiquidEntangulumParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SillyWillyCoreModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(SillyWillyCoreModParticleTypes.LIQUID_ENTANGULUM.get(), LiquidEntangulumParticle::provider);
	}
}
