
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package io.github.errordude42.sillywillycore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import io.github.errordude42.sillywillycore.fluid.types.MeltedEntangulumFluidFluidType;
import io.github.errordude42.sillywillycore.SillyWillyCoreMod;

public class SillyWillyCoreModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, SillyWillyCoreMod.MODID);
	public static final RegistryObject<FluidType> MELTED_ENTANGULUM_FLUID_TYPE = REGISTRY.register("melted_entangulum_fluid", () -> new MeltedEntangulumFluidFluidType());
}
