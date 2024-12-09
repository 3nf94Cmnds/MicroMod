
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.fsuardi.caldera.misc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.fsuardi.caldera.misc.fluid.FanterFluid;
import net.fsuardi.caldera.misc.CalderamiscMod;

public class CalderamiscModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, CalderamiscMod.MODID);
	public static final RegistryObject<FlowingFluid> FANTER = REGISTRY.register("fanter", () -> new FanterFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_FANTER = REGISTRY.register("flowing_fanter", () -> new FanterFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(FANTER.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_FANTER.get(), RenderType.translucent());
		}
	}
}
