
package io.github.errordude42.sillywillycore.item;

import io.github.errordude42.sillywillycore.init.SillyWillyCoreModItems;

public class TriangulumSwordItem extends SwordItem {
	public TriangulumSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 3024;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 14f;
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
		}, 3, -1f, new Item.Properties().fireResistant());
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
