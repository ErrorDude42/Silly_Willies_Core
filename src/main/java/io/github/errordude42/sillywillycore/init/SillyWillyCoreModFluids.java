
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package io.github.errordude42.sillywillycore.init;

import io.github.errordude42.sillywillycore.fluid.MeltedEntangulumFluidFluid;
import io.github.errordude42.sillywillycore.SillyWillyCoreMod;

public class SillyWillyCoreModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, SillyWillyCoreMod.MODID);
	public static final RegistryObject<FlowingFluid> MELTED_ENTANGULUM_FLUID = REGISTRY.register("melted_entangulum_fluid", () -> new MeltedEntangulumFluidFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_MELTED_ENTANGULUM_FLUID = REGISTRY.register("flowing_melted_entangulum_fluid", () -> new MeltedEntangulumFluidFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(MELTED_ENTANGULUM_FLUID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_MELTED_ENTANGULUM_FLUID.get(), RenderType.translucent());
		}
	}
}
