
package io.github.errordude42.sillywillycore.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import io.github.errordude42.sillywillycore.init.SillyWillyCoreModItems;

public class TriangulumPickaxeItem extends PickaxeItem {
	public TriangulumPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 3024;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 28;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SillyWillyCoreModItems.REFINED_TRIANGULUM.get()));
			}
		}, 1, -2f, new Item.Properties().fireResistant());
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
