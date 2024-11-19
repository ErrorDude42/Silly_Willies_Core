
package io.github.errordude42.sillywillycore.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import io.github.errordude42.sillywillycore.procedures.GeoPortalFrameEntityWalksOnTheBlockProcedure;

public class GeoPortalFrameBlock extends Block {
	public GeoPortalFrameBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.NETHERITE_BLOCK).strength(10f, 20f).lightLevel(s -> 2).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
		super.stepOn(world, pos, blockstate, entity);
		GeoPortalFrameEntityWalksOnTheBlockProcedure.execute(world, entity);
	}
}
