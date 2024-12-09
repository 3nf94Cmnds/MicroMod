
package net.fsuardi.caldera.misc.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.fsuardi.caldera.misc.init.CalderamiscModFluids;

public class FanterItem extends BucketItem {
	public FanterItem() {
		super(CalderamiscModFluids.FANTER, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.EPIC));
	}
}
