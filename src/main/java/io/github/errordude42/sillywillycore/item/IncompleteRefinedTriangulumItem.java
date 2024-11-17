
package io.github.errordude42.sillywillycore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class IncompleteRefinedTriangulumItem extends Item {
	public IncompleteRefinedTriangulumItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));
	}
}
