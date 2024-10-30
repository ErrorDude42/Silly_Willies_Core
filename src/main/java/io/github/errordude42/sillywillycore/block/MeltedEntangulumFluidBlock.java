
package io.github.errordude42.sillywillycore.block;

import io.github.errordude42.sillywillycore.init.SillyWillyCoreModFluids;

public class MeltedEntangulumFluidBlock extends LiquidBlock {
	public MeltedEntangulumFluidBlock() {
		super(() -> SillyWillyCoreModFluids.MELTED_ENTANGULUM_FLUID.get(),
				BlockBehaviour.Properties.of().mapColor(MapColor.WATER).strength(100f).lightLevel(s -> 4).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}
