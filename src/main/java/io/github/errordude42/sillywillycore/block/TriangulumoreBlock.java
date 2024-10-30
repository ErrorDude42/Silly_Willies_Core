
package io.github.errordude42.sillywillycore.block;

public class TriangulumoreBlock extends Block {
	public TriangulumoreBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(25f, 10f).lightLevel(s -> 4).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 12;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}
}
