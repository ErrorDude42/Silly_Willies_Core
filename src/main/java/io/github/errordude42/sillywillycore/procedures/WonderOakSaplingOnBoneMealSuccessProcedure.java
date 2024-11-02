package io.github.errordude42.sillywillycore.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class WonderOakSaplingOnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double random = 0;
		if (!world.isClientSide()) {
			random = Mth.nextInt(RandomSource.create(), 1, 3);
			if (random == 1) {
				WonderTreeVar1Procedure.execute(world, x, y, z);
			} else if (random == 2) {
				WonderTreeVar2Procedure.execute(world, x, y, z);
			} else if (random == 3) {
				WonderTreeVar3Procedure.execute(world, x, y, z);
			}
		}
	}
}
