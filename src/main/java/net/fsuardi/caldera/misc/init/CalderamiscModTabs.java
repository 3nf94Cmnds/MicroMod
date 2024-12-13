
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.fsuardi.caldera.misc.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.fsuardi.caldera.misc.CalderamiscMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CalderamiscModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CalderamiscMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {

			tabData.accept(CalderamiscModItems.NULLIUM_ARMOR_HELMET.get());
			tabData.accept(CalderamiscModItems.NULLIUM_ARMOR_CHESTPLATE.get());
			tabData.accept(CalderamiscModItems.NULLIUM_ARMOR_LEGGINGS.get());
			tabData.accept(CalderamiscModItems.NULLIUM_ARMOR_BOOTS.get());
			tabData.accept(CalderamiscModItems.BRONZEARMOR_HELMET.get());
			tabData.accept(CalderamiscModItems.BRONZEARMOR_CHESTPLATE.get());
			tabData.accept(CalderamiscModItems.BRONZEARMOR_LEGGINGS.get());
			tabData.accept(CalderamiscModItems.BRONZEARMOR_BOOTS.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {

			tabData.accept(CalderamiscModItems.NULLIUM.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {

			tabData.accept(CalderamiscModItems.FANTER_BUCKET.get());

		}
	}
}
