
package io.github.errordude42.sillywillycore.block;

public class BlockofrawentangulumBlock extends Block {
	public BlockofrawentangulumBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
