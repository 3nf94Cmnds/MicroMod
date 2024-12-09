
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.fsuardi.caldera.misc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.fsuardi.caldera.misc.block.NulliumBlockBlock;
import net.fsuardi.caldera.misc.block.FanterBlock;
import net.fsuardi.caldera.misc.block.BronzeBlockBlock;
import net.fsuardi.caldera.misc.CalderamiscMod;

public class CalderamiscModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CalderamiscMod.MODID);
	public static final RegistryObject<Block> FANTER = REGISTRY.register("fanter", () -> new FanterBlock());
	public static final RegistryObject<Block> NULLIUM_BLOCK = REGISTRY.register("nullium_block", () -> new NulliumBlockBlock());
	public static final RegistryObject<Block> BRONZE_BLOCK = REGISTRY.register("bronze_block", () -> new BronzeBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
