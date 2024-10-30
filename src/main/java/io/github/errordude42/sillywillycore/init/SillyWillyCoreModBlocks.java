
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.errordude42.sillywillycore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import io.github.errordude42.sillywillycore.block.TriangulumoreDeepslateBlock;
import io.github.errordude42.sillywillycore.block.TriangulumoreBlock;
import io.github.errordude42.sillywillycore.block.TriangulumbricksBlock;
import io.github.errordude42.sillywillycore.block.StructureTriangulumbricksBlock;
import io.github.errordude42.sillywillycore.block.MeltedEntangulumFluidBlock;
import io.github.errordude42.sillywillycore.block.GeostoneBlock;
import io.github.errordude42.sillywillycore.block.EntangulumoreBlock;
import io.github.errordude42.sillywillycore.block.BlockrawtriangulumBlock;
import io.github.errordude42.sillywillycore.block.BlockofrawentangulumBlock;
import io.github.errordude42.sillywillycore.SillyWillyCoreMod;

public class SillyWillyCoreModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SillyWillyCoreMod.MODID);
	public static final RegistryObject<Block> TRIANGULUMORE = REGISTRY.register("triangulumore", () -> new TriangulumoreBlock());
	public static final RegistryObject<Block> TRIANGULUMORE_DEEPSLATE = REGISTRY.register("triangulumore_deepslate", () -> new TriangulumoreDeepslateBlock());
	public static final RegistryObject<Block> BLOCKRAWTRIANGULUM = REGISTRY.register("blockrawtriangulum", () -> new BlockrawtriangulumBlock());
	public static final RegistryObject<Block> BLOCKOFRAWENTANGULUM = REGISTRY.register("blockofrawentangulum", () -> new BlockofrawentangulumBlock());
	public static final RegistryObject<Block> TRIANGULUMBRICKS = REGISTRY.register("triangulumbricks", () -> new TriangulumbricksBlock());
	public static final RegistryObject<Block> GEOSTONE = REGISTRY.register("geostone", () -> new GeostoneBlock());
	public static final RegistryObject<Block> ENTANGULUMORE = REGISTRY.register("entangulumore", () -> new EntangulumoreBlock());
	public static final RegistryObject<Block> MELTED_ENTANGULUM_FLUID = REGISTRY.register("melted_entangulum_fluid", () -> new MeltedEntangulumFluidBlock());
	public static final RegistryObject<Block> STRUCTURE_TRIANGULUMBRICKS = REGISTRY.register("structure_triangulumbricks", () -> new StructureTriangulumbricksBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
