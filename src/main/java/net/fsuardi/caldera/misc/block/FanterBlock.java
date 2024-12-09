
package net.fsuardi.caldera.misc.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

import net.fsuardi.caldera.misc.init.CalderamiscModFluids;

public class FanterBlock extends LiquidBlock {
	public FanterBlock() {
		super(() -> CalderamiscModFluids.FANTER.get(), BlockBehaviour.Properties.of().mapColor(MapColor.WATER).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}
