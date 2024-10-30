
package io.github.errordude42.sillywillycore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RefinedTriangulumItem extends Item {
	public RefinedTriangulumItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.EPIC));
	}
}
