
package io.github.errordude42.sillywillycore.block;

public class StructureTriangulumbricksBlock extends Block {
	public StructureTriangulumbricksBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
