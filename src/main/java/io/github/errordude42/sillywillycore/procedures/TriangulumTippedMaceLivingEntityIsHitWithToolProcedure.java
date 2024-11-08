package io.github.errordude42.sillywillycore.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class TriangulumTippedMaceLivingEntityIsHitWithToolProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity sourceentity, ItemStack itemstack) {
		if (sourceentity == null)
			return;
		if (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z)) && world.getLevelData().isThundering()
				&& (sourceentity instanceof Player _plrCldRem3 ? _plrCldRem3.getCooldowns().getCooldownPercent(itemstack.getItem(), 0f) * 100 : 0) <= 0.8) {
			if (world instanceof ServerLevel _level) {
				LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
				entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));;
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
