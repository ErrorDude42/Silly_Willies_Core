package io.github.errordude42.sillywillycore.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class WonderOakSaplingOnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world) {
		double random = 0;
		if (!world.isClientSide()) {
			random = Mth.nextInt(RandomSource.create(), 1, 4);
		}
	}
}
