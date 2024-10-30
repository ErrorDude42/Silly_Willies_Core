
package io.github.errordude42.sillywillycore.block;

public class GeostoneBlock extends Block {
	public GeostoneBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.DEEPSLATE).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
