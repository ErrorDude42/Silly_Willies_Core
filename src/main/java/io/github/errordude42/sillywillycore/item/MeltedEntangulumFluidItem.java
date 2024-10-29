
package io.github.errordude42.sillywillycore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import io.github.errordude42.sillywillycore.init.SillyWillyCoreModFluids;

public class MeltedEntangulumFluidItem extends BucketItem {
	public MeltedEntangulumFluidItem() {
		super(SillyWillyCoreModFluids.MELTED_ENTANGULUM_FLUID, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.EPIC));
	}
}
