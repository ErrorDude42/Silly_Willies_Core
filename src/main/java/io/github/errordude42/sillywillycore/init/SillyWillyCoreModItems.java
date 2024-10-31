
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.errordude42.sillywillycore.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import io.github.errordude42.sillywillycore.item.TriangulumSwordItem;
import io.github.errordude42.sillywillycore.item.TriangulumShovelItem;
import io.github.errordude42.sillywillycore.item.TriangulumPickaxeItem;
import io.github.errordude42.sillywillycore.item.TriangulumHoeItem;
import io.github.errordude42.sillywillycore.item.TriangulumAxeItem;
import io.github.errordude42.sillywillycore.item.RefinedTriangulumItem;
import io.github.errordude42.sillywillycore.item.RawTriangulumItem;
import io.github.errordude42.sillywillycore.item.RawEntangulumItem;
import io.github.errordude42.sillywillycore.item.MeltedEntangulumFluidItem;
import io.github.errordude42.sillywillycore.item.EntangulumspoolItem;
import io.github.errordude42.sillywillycore.item.EntangulumplateItem;
import io.github.errordude42.sillywillycore.item.EntangulumdustItem;
import io.github.errordude42.sillywillycore.item.DirtyentangulumItem;
import io.github.errordude42.sillywillycore.SillyWillyCoreMod;

public class SillyWillyCoreModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SillyWillyCoreMod.MODID);
	public static final RegistryObject<Item> RAW_TRIANGULUM = REGISTRY.register("raw_triangulum", () -> new RawTriangulumItem());
	public static final RegistryObject<Item> REFINED_TRIANGULUM = REGISTRY.register("refined_triangulum", () -> new RefinedTriangulumItem());
	public static final RegistryObject<Item> TRIANGULUMORE = block(SillyWillyCoreModBlocks.TRIANGULUMORE);
	public static final RegistryObject<Item> TRIANGULUMORE_DEEPSLATE = block(SillyWillyCoreModBlocks.TRIANGULUMORE_DEEPSLATE);
	public static final RegistryObject<Item> TRIANGULUM_PICKAXE = REGISTRY.register("triangulum_pickaxe", () -> new TriangulumPickaxeItem());
	public static final RegistryObject<Item> TRIANGULUM_AXE = REGISTRY.register("triangulum_axe", () -> new TriangulumAxeItem());
	public static final RegistryObject<Item> TRIANGULUM_SWORD = REGISTRY.register("triangulum_sword", () -> new TriangulumSwordItem());
	public static final RegistryObject<Item> TRIANGULUM_SHOVEL = REGISTRY.register("triangulum_shovel", () -> new TriangulumShovelItem());
	public static final RegistryObject<Item> TRIANGULUM_HOE = REGISTRY.register("triangulum_hoe", () -> new TriangulumHoeItem());
	public static final RegistryObject<Item> BLOCKRAWTRIANGULUM = block(SillyWillyCoreModBlocks.BLOCKRAWTRIANGULUM);
	public static final RegistryObject<Item> BLOCKOFRAWENTANGULUM = block(SillyWillyCoreModBlocks.BLOCKOFRAWENTANGULUM);
	public static final RegistryObject<Item> TRIANGULUMBRICKS = block(SillyWillyCoreModBlocks.TRIANGULUMBRICKS);
	public static final RegistryObject<Item> GEOSTONE = block(SillyWillyCoreModBlocks.GEOSTONE);
	public static final RegistryObject<Item> ENTANGULUMORE = block(SillyWillyCoreModBlocks.ENTANGULUMORE);
	public static final RegistryObject<Item> DIRTYENTANGULUM = REGISTRY.register("dirtyentangulum", () -> new DirtyentangulumItem());
	public static final RegistryObject<Item> ENTANGULUMDUST = REGISTRY.register("entangulumdust", () -> new EntangulumdustItem());
	public static final RegistryObject<Item> ENTANGULUMPLATE = REGISTRY.register("entangulumplate", () -> new EntangulumplateItem());
	public static final RegistryObject<Item> ENTANGULUMSPOOL = REGISTRY.register("entangulumspool", () -> new EntangulumspoolItem());
	public static final RegistryObject<Item> RAW_ENTANGULUM = REGISTRY.register("raw_entangulum", () -> new RawEntangulumItem());
	public static final RegistryObject<Item> MELTED_ENTANGULUM_FLUID_BUCKET = REGISTRY.register("melted_entangulum_fluid_bucket", () -> new MeltedEntangulumFluidItem());
	public static final RegistryObject<Item> STRUCTURE_TRIANGULUMBRICKS = block(SillyWillyCoreModBlocks.STRUCTURE_TRIANGULUMBRICKS);
	public static final RegistryObject<Item> GEOMETRIUSDOWN = block(SillyWillyCoreModBlocks.GEOMETRIUSDOWN);
	public static final RegistryObject<Item> GEOMETRIUSUP = block(SillyWillyCoreModBlocks.GEOMETRIUSUP);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
