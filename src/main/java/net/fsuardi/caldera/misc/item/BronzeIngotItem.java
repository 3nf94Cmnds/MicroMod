
package net.fsuardi.caldera.misc.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BronzeIngotItem extends Item {
	public BronzeIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}