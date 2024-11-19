
package io.github.errordude42.sillywillycore.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class StructureTriangulumbricksBlock extends Block {
	public StructureTriangulumbricksBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(-1, 3600000).lightLevel(s -> 5));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
