
package io.github.errordude42.sillywillycore.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EntangulumspoolItem extends Item {
	public EntangulumspoolItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.EPIC));
	}
}
