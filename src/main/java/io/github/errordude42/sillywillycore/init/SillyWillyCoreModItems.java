
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

import io.github.errordude42.sillywillycore.item.TriangulumUpgradeTemplateItem;
import io.github.errordude42.sillywillycore.item.TriangulumTippedMaceItem;
import io.github.errordude42.sillywillycore.item.TriangulumSwordItem;
import io.github.errordude42.sillywillycore.item.TriangulumShovelItem;
import io.github.errordude42.sillywillycore.item.TriangulumPlateItem;
import io.github.errordude42.sillywillycore.item.TriangulumPickaxeItem;
import io.github.errordude42.sillywillycore.item.TriangulumHoeItem;
import io.github.errordude42.sillywillycore.item.TriangulumBrickItem;
import io.github.errordude42.sillywillycore.item.TriangulumAxeItem;
import io.github.errordude42.sillywillycore.item.RefinedTriangulumItem;
import io.github.errordude42.sillywillycore.item.RawTriangulumItem;
import io.github.errordude42.sillywillycore.item.RawEntangulumItem;
import io.github.errordude42.sillywillycore.item.PlateMoldItem;
import io.github.errordude42.sillywillycore.item.MeltedEntangulumFluidItem;
import io.github.errordude42.sillywillycore.item.IncompleteEntangulumPlateItem;
import io.github.errordude42.sillywillycore.item.EntangulumspoolItem;
import io.github.errordude42.sillywillycore.item.EntangulumplateItem;
import io.github.errordude42.sillywillycore.item.EntangulumdustItem;
import io.github.errordude42.sillywillycore.item.EntangulumStringItem;
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
	public static final RegistryObject<Item> DIRTY_ENTANGULUM_DUST = REGISTRY.register("dirty_entangulum_dust", () -> new DirtyentangulumItem());
	public static final RegistryObject<Item> ENTANGULUM_DUST = REGISTRY.register("entangulum_dust", () -> new EntangulumdustItem());
	public static final RegistryObject<Item> ENTANGULUM_PLATE = REGISTRY.register("entangulum_plate", () -> new EntangulumplateItem());
	public static final RegistryObject<Item> ENTANGULUM_SPOOL = REGISTRY.register("entangulum_spool", () -> new EntangulumspoolItem());
	public static final RegistryObject<Item> RAW_ENTANGULUM = REGISTRY.register("raw_entangulum", () -> new RawEntangulumItem());
	public static final RegistryObject<Item> MELTED_ENTANGULUM_FLUID_BUCKET = REGISTRY.register("melted_entangulum_fluid_bucket", () -> new MeltedEntangulumFluidItem());
	public static final RegistryObject<Item> STRUCTURE_TRIANGULUMBRICKS = block(SillyWillyCoreModBlocks.STRUCTURE_TRIANGULUMBRICKS);
	public static final RegistryObject<Item> GEOMETRIUSDOWN = block(SillyWillyCoreModBlocks.GEOMETRIUSDOWN);
	public static final RegistryObject<Item> GEOMETRIUSUP = block(SillyWillyCoreModBlocks.GEOMETRIUSUP);
	public static final RegistryObject<Item> WONDER_OAK_WOOD = block(SillyWillyCoreModBlocks.WONDER_OAK_WOOD);
	public static final RegistryObject<Item> WONDER_OAK_LOG = block(SillyWillyCoreModBlocks.WONDER_OAK_LOG);
	public static final RegistryObject<Item> WONDER_OAK_PLANKS = block(SillyWillyCoreModBlocks.WONDER_OAK_PLANKS);
	public static final RegistryObject<Item> WONDER_OAK_LEAVES = block(SillyWillyCoreModBlocks.WONDER_OAK_LEAVES);
	public static final RegistryObject<Item> WONDER_OAK_STAIRS = block(SillyWillyCoreModBlocks.WONDER_OAK_STAIRS);
	public static final RegistryObject<Item> WONDER_OAK_SLAB = block(SillyWillyCoreModBlocks.WONDER_OAK_SLAB);
	public static final RegistryObject<Item> WONDER_OAK_FENCE = block(SillyWillyCoreModBlocks.WONDER_OAK_FENCE);
	public static final RegistryObject<Item> WONDER_OAK_FENCE_GATE = block(SillyWillyCoreModBlocks.WONDER_OAK_FENCE_GATE);
	public static final RegistryObject<Item> WONDER_OAK_PRESSURE_PLATE = block(SillyWillyCoreModBlocks.WONDER_OAK_PRESSURE_PLATE);
	public static final RegistryObject<Item> WONDER_OAK_BUTTON = block(SillyWillyCoreModBlocks.WONDER_OAK_BUTTON);
	public static final RegistryObject<Item> WONDER_OAK_SAPLING = block(SillyWillyCoreModBlocks.WONDER_OAK_SAPLING);
	public static final RegistryObject<Item> TRIANGULUM_TIPPED_MACE = REGISTRY.register("triangulum_tipped_mace", () -> new TriangulumTippedMaceItem());
	public static final RegistryObject<Item> ENTANGULUM_STRING = REGISTRY.register("entangulum_string", () -> new EntangulumStringItem());
	public static final RegistryObject<Item> PLATE_MOLD = REGISTRY.register("plate_mold", () -> new PlateMoldItem());
	public static final RegistryObject<Item> TRIANGULUM_PLATE = REGISTRY.register("triangulum_plate", () -> new TriangulumPlateItem());
	public static final RegistryObject<Item> TRIANGULUM_UPGRADE_TEMPLATE = REGISTRY.register("triangulum_upgrade_template", () -> new TriangulumUpgradeTemplateItem());
	public static final RegistryObject<Item> INCOMPLETE_ENTANGULUM_PLATE = REGISTRY.register("incomplete_entangulum_plate", () -> new IncompleteEntangulumPlateItem());
	public static final RegistryObject<Item> TRIANGULUM_BRICK = REGISTRY.register("triangulum_brick", () -> new TriangulumBrickItem());
	public static final RegistryObject<Item> SILT = block(SillyWillyCoreModBlocks.SILT);
	public static final RegistryObject<Item> TWISTED_GRASS = block(SillyWillyCoreModBlocks.TWISTED_GRASS);
	public static final RegistryObject<Item> TRIANGULUM_GEO_STONE = block(SillyWillyCoreModBlocks.TRIANGULUM_GEO_STONE);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
