
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.errordude42.sillywillycore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import io.github.errordude42.sillywillycore.SillyWillyCoreMod;

public class SillyWillyCoreModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SillyWillyCoreMod.MODID);
	public static final RegistryObject<CreativeModeTab> STRUCTUREBLOCKS = REGISTRY.register("structureblocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.silly_willy_core.structureblocks")).icon(() -> new ItemStack(Blocks.STRUCTURE_BLOCK)).displayItems((parameters, tabData) -> {
				tabData.accept(SillyWillyCoreModBlocks.STRUCTURE_TRIANGULUMBRICKS.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> GEOMETERY_DIMENSION_BETA = REGISTRY.register("geometery_dimension_beta",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.silly_willy_core.geometery_dimension_beta")).icon(() -> new ItemStack(SillyWillyCoreModItems.REFINED_TRIANGULUM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SillyWillyCoreModBlocks.TRIANGULUMORE.get().asItem());
				tabData.accept(SillyWillyCoreModBlocks.TRIANGULUMORE_DEEPSLATE.get().asItem());
				tabData.accept(SillyWillyCoreModBlocks.TRIANGULUM_GEO_STONE.get().asItem());
				tabData.accept(SillyWillyCoreModItems.RAW_TRIANGULUM.get());
				tabData.accept(SillyWillyCoreModItems.REFINED_TRIANGULUM.get());
				tabData.accept(SillyWillyCoreModItems.TRIANGULUM_PLATE.get());
				tabData.accept(SillyWillyCoreModItems.TRIANGULUM_BRICK.get());
				tabData.accept(SillyWillyCoreModBlocks.BLOCKRAWTRIANGULUM.get().asItem());
				tabData.accept(SillyWillyCoreModBlocks.TRIANGULUMBRICKS.get().asItem());
				tabData.accept(SillyWillyCoreModItems.TRIANGULUM_UPGRADE_TEMPLATE.get());
				tabData.accept(SillyWillyCoreModItems.TRIANGULUM_PICKAXE.get());
				tabData.accept(SillyWillyCoreModItems.TRIANGULUM_AXE.get());
				tabData.accept(SillyWillyCoreModItems.TRIANGULUM_SWORD.get());
				tabData.accept(SillyWillyCoreModItems.TRIANGULUM_SHOVEL.get());
				tabData.accept(SillyWillyCoreModItems.TRIANGULUM_HOE.get());
				tabData.accept(SillyWillyCoreModBlocks.GEOMETRIUSDOWN.get().asItem());
				tabData.accept(SillyWillyCoreModBlocks.GEOMETRIUSUP.get().asItem());
				tabData.accept(SillyWillyCoreModBlocks.TWISTED_GRASS.get().asItem());
				tabData.accept(SillyWillyCoreModBlocks.SILT.get().asItem());
				tabData.accept(SillyWillyCoreModBlocks.GEOSTONE.get().asItem());
				tabData.accept(SillyWillyCoreModBlocks.ENTANGULUMORE.get().asItem());
				tabData.accept(SillyWillyCoreModBlocks.BLOCKOFRAWENTANGULUM.get().asItem());
				tabData.accept(SillyWillyCoreModItems.RAW_ENTANGULUM.get());
				tabData.accept(SillyWillyCoreModItems.DIRTY_ENTANGULUM_DUST.get());
				tabData.accept(SillyWillyCoreModItems.ENTANGULUM_DUST.get());
				tabData.accept(SillyWillyCoreModItems.PLATE_MOLD.get());
				tabData.accept(SillyWillyCoreModItems.ENTANGULUM_PLATE.get());
				tabData.accept(SillyWillyCoreModItems.ENTANGULUM_STRING.get());
				tabData.accept(SillyWillyCoreModItems.ENTANGULUM_SPOOL.get());
				tabData.accept(SillyWillyCoreModBlocks.WONDER_OAK_WOOD.get().asItem());
				tabData.accept(SillyWillyCoreModBlocks.WONDER_OAK_LOG.get().asItem());
				tabData.accept(SillyWillyCoreModBlocks.WONDER_OAK_PLANKS.get().asItem());
				tabData.accept(SillyWillyCoreModBlocks.WONDER_OAK_LEAVES.get().asItem());
				tabData.accept(SillyWillyCoreModBlocks.WONDER_OAK_SAPLING.get().asItem());
				tabData.accept(SillyWillyCoreModBlocks.WONDER_OAK_STAIRS.get().asItem());
				tabData.accept(SillyWillyCoreModBlocks.WONDER_OAK_SLAB.get().asItem());
				tabData.accept(SillyWillyCoreModBlocks.WONDER_OAK_FENCE.get().asItem());
				tabData.accept(SillyWillyCoreModBlocks.WONDER_OAK_FENCE_GATE.get().asItem());
				tabData.accept(SillyWillyCoreModBlocks.WONDER_OAK_PRESSURE_PLATE.get().asItem());
				tabData.accept(SillyWillyCoreModBlocks.WONDER_OAK_BUTTON.get().asItem());
				tabData.accept(SillyWillyCoreModItems.GEO_DIMENSION.get());
			})

					.build());
}
