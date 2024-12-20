
package io.github.errordude42.sillywillycore.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import io.github.errordude42.sillywillycore.procedures.TriangulumTippedMaceLivingEntityIsHitWithToolProcedure;
import io.github.errordude42.sillywillycore.init.SillyWillyCoreModItems;

public class TriangulumTippedMaceItem extends SwordItem {
	public TriangulumTippedMaceItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SillyWillyCoreModItems.REFINED_TRIANGULUM.get()));
			}
		}, 3, -3.2f, new Item.Properties());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		TriangulumTippedMaceLivingEntityIsHitWithToolProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), sourceentity, itemstack);
		return retval;
	}
}
