package io.github.errordude42.sillywillycore.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class WonderOakSaplingBlockValidPlacementConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		return (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("minecraft:logs"))) && true;
	}
}
