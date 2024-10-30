
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.errordude42.sillywillycore.init;

import io.github.errordude42.sillywillycore.client.particle.LiquidEntangulumParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SillyWillyCoreModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(SillyWillyCoreModParticleTypes.LIQUID_ENTANGULUM.get(), LiquidEntangulumParticle::provider);
	}
}
