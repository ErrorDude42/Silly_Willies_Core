
package io.github.errordude42.sillywillycore.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

import io.github.errordude42.sillywillycore.init.SillyWillyCoreModFluids;

public class MeltedEntangulumFluidBlock extends LiquidBlock {
	public MeltedEntangulumFluidBlock() {
		super(() -> SillyWillyCoreModFluids.MELTED_ENTANGULUM_FLUID.get(),
				BlockBehaviour.Properties.of().mapColor(MapColor.FIRE).strength(100f).lightLevel(s -> 4).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}
