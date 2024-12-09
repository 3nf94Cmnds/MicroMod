
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.fsuardi.caldera.misc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.fsuardi.caldera.misc.fluid.types.FanterFluidType;
import net.fsuardi.caldera.misc.CalderamiscMod;

public class CalderamiscModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CalderamiscMod.MODID);
	public static final RegistryObject<FluidType> FANTER_TYPE = REGISTRY.register("fanter", () -> new FanterFluidType());
}
