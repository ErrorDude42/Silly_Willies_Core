
package io.github.errordude42.sillywillycore.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleOptions;

import io.github.errordude42.sillywillycore.init.SillyWillyCoreModParticleTypes;
import io.github.errordude42.sillywillycore.init.SillyWillyCoreModItems;
import io.github.errordude42.sillywillycore.init.SillyWillyCoreModFluids;
import io.github.errordude42.sillywillycore.init.SillyWillyCoreModFluidTypes;
import io.github.errordude42.sillywillycore.init.SillyWillyCoreModBlocks;

public abstract class MeltedEntangulumFluidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> SillyWillyCoreModFluidTypes.MELTED_ENTANGULUM_FLUID_TYPE.get(), () -> SillyWillyCoreModFluids.MELTED_ENTANGULUM_FLUID.get(),
			() -> SillyWillyCoreModFluids.FLOWING_MELTED_ENTANGULUM_FLUID.get()).explosionResistance(100f).tickRate(15).slopeFindDistance(3).bucket(() -> SillyWillyCoreModItems.MELTED_ENTANGULUM_FLUID_BUCKET.get())
			.block(() -> (LiquidBlock) SillyWillyCoreModBlocks.MELTED_ENTANGULUM_FLUID.get());

	private MeltedEntangulumFluidFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return (SimpleParticleType) (SillyWillyCoreModParticleTypes.LIQUID_ENTANGULUM.get());
	}

	public static class Source extends MeltedEntangulumFluidFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends MeltedEntangulumFluidFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
