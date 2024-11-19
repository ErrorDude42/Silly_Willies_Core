package io.github.errordude42.sillywillycore.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import io.github.errordude42.sillywillycore.SillyWillyCoreMod;

public class GeoPortalFrameEntityWalksOnTheBlockProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player) {
			SillyWillyCoreMod.queueServerWork(20, () -> {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Message"), false);
			});
			SillyWillyCoreMod.queueServerWork(20, () -> {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Message"), false);
			});
			SillyWillyCoreMod.queueServerWork(20, () -> {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Message"), false);
			});
			SillyWillyCoreMod.queueServerWork(20, () -> {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Message"), false);
			});
			SillyWillyCoreMod.queueServerWork(20, () -> {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Message"), false);
			});
			SillyWillyCoreMod.queueServerWork(20, () -> {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Message"), false);
			});
			SillyWillyCoreMod.queueServerWork(20, () -> {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Message"), false);
			});
			SillyWillyCoreMod.queueServerWork(20, () -> {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Message"), false);
			});
			SillyWillyCoreMod.queueServerWork(20, () -> {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Message"), false);
			});
			SillyWillyCoreMod.queueServerWork(20, () -> {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Message"), false);
			});
			SillyWillyCoreMod.queueServerWork(200, () -> {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Message"), false);
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("tp time"), false);
			});
		}
	}
}
