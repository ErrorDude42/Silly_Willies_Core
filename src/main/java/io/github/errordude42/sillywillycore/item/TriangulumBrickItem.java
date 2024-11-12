
package io.github.errordude42.sillywillycore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TriangulumBrickItem extends Item {
	public TriangulumBrickItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
