
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.errordude42.sillywillycore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import io.github.errordude42.sillywillycore.block.Wonder_oakWoodBlock;
import io.github.errordude42.sillywillycore.block.Wonder_oakStairsBlock;
import io.github.errordude42.sillywillycore.block.Wonder_oakSlabBlock;
import io.github.errordude42.sillywillycore.block.Wonder_oakPressurePlateBlock;
import io.github.errordude42.sillywillycore.block.Wonder_oakPlanksBlock;
import io.github.errordude42.sillywillycore.block.Wonder_oakLogBlock;
import io.github.errordude42.sillywillycore.block.Wonder_oakLeavesBlock;
import io.github.errordude42.sillywillycore.block.Wonder_oakFenceGateBlock;
import io.github.errordude42.sillywillycore.block.Wonder_oakFenceBlock;
import io.github.errordude42.sillywillycore.block.Wonder_oakButtonBlock;
import io.github.errordude42.sillywillycore.block.TriangulumoreDeepslateBlock;
import io.github.errordude42.sillywillycore.block.TriangulumoreBlock;
import io.github.errordude42.sillywillycore.block.TriangulumbricksBlock;
import io.github.errordude42.sillywillycore.block.StructureTriangulumbricksBlock;
import io.github.errordude42.sillywillycore.block.MeltedEntangulumFluidBlock;
import io.github.errordude42.sillywillycore.block.GeostoneBlock;
import io.github.errordude42.sillywillycore.block.GeometriusupBlock;
import io.github.errordude42.sillywillycore.block.GeometriusdownBlock;
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
	public static final RegistryObject<Block> GEOMETRIUSDOWN = REGISTRY.register("geometriusdown", () -> new GeometriusdownBlock());
	public static final RegistryObject<Block> GEOMETRIUSUP = REGISTRY.register("geometriusup", () -> new GeometriusupBlock());
	public static final RegistryObject<Block> WONDER_OAK_WOOD = REGISTRY.register("wonder_oak_wood", () -> new Wonder_oakWoodBlock());
	public static final RegistryObject<Block> WONDER_OAK_LOG = REGISTRY.register("wonder_oak_log", () -> new Wonder_oakLogBlock());
	public static final RegistryObject<Block> WONDER_OAK_PLANKS = REGISTRY.register("wonder_oak_planks", () -> new Wonder_oakPlanksBlock());
	public static final RegistryObject<Block> WONDER_OAK_LEAVES = REGISTRY.register("wonder_oak_leaves", () -> new Wonder_oakLeavesBlock());
	public static final RegistryObject<Block> WONDER_OAK_STAIRS = REGISTRY.register("wonder_oak_stairs", () -> new Wonder_oakStairsBlock());
	public static final RegistryObject<Block> WONDER_OAK_SLAB = REGISTRY.register("wonder_oak_slab", () -> new Wonder_oakSlabBlock());
	public static final RegistryObject<Block> WONDER_OAK_FENCE = REGISTRY.register("wonder_oak_fence", () -> new Wonder_oakFenceBlock());
	public static final RegistryObject<Block> WONDER_OAK_FENCE_GATE = REGISTRY.register("wonder_oak_fence_gate", () -> new Wonder_oakFenceGateBlock());
	public static final RegistryObject<Block> WONDER_OAK_PRESSURE_PLATE = REGISTRY.register("wonder_oak_pressure_plate", () -> new Wonder_oakPressurePlateBlock());
	public static final RegistryObject<Block> WONDER_OAK_BUTTON = REGISTRY.register("wonder_oak_button", () -> new Wonder_oakButtonBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
