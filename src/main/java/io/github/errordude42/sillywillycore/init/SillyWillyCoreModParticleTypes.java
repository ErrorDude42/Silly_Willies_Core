
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.errordude42.sillywillycore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import io.github.errordude42.sillywillycore.SillyWillyCoreMod;

public class SillyWillyCoreModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, SillyWillyCoreMod.MODID);
	public static final RegistryObject<SimpleParticleType> LIQUID_ENTANGULUM = REGISTRY.register("liquid_entangulum", () -> new SimpleParticleType(false));
}
