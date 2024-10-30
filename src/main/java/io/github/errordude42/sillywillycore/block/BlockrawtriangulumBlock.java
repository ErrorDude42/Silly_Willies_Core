
package io.github.errordude42.sillywillycore.block;

public class BlockrawtriangulumBlock extends Block {
	public BlockrawtriangulumBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
