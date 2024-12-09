
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.fsuardi.caldera.misc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.fsuardi.caldera.misc.item.NulliumItem;
import net.fsuardi.caldera.misc.item.NulliumArmorItem;
import net.fsuardi.caldera.misc.item.FanterItem;
import net.fsuardi.caldera.misc.item.BronzearmorItem;
import net.fsuardi.caldera.misc.item.BronzeIngotItem;
import net.fsuardi.caldera.misc.CalderamiscMod;

public class CalderamiscModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CalderamiscMod.MODID);
	public static final RegistryObject<Item> NULLIUM = REGISTRY.register("nullium", () -> new NulliumItem());
	public static final RegistryObject<Item> NULLIUM_ARMOR_HELMET = REGISTRY.register("nullium_armor_helmet", () -> new NulliumArmorItem.Helmet());
	public static final RegistryObject<Item> NULLIUM_ARMOR_CHESTPLATE = REGISTRY.register("nullium_armor_chestplate", () -> new NulliumArmorItem.Chestplate());
	public static final RegistryObject<Item> NULLIUM_ARMOR_LEGGINGS = REGISTRY.register("nullium_armor_leggings", () -> new NulliumArmorItem.Leggings());
	public static final RegistryObject<Item> NULLIUM_ARMOR_BOOTS = REGISTRY.register("nullium_armor_boots", () -> new NulliumArmorItem.Boots());
	public static final RegistryObject<Item> FANTER_BUCKET = REGISTRY.register("fanter_bucket", () -> new FanterItem());
	public static final RegistryObject<Item> NULLIUM_BLOCK = block(CalderamiscModBlocks.NULLIUM_BLOCK);
	public static final RegistryObject<Item> BRONZE_INGOT = REGISTRY.register("bronze_ingot", () -> new BronzeIngotItem());
	public static final RegistryObject<Item> BRONZEARMOR_HELMET = REGISTRY.register("bronzearmor_helmet", () -> new BronzearmorItem.Helmet());
	public static final RegistryObject<Item> BRONZEARMOR_CHESTPLATE = REGISTRY.register("bronzearmor_chestplate", () -> new BronzearmorItem.Chestplate());
	public static final RegistryObject<Item> BRONZEARMOR_LEGGINGS = REGISTRY.register("bronzearmor_leggings", () -> new BronzearmorItem.Leggings());
	public static final RegistryObject<Item> BRONZEARMOR_BOOTS = REGISTRY.register("bronzearmor_boots", () -> new BronzearmorItem.Boots());
	public static final RegistryObject<Item> BRONZE_BLOCK = block(CalderamiscModBlocks.BRONZE_BLOCK);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
