
package net.fsuardi.caldera.misc.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.fsuardi.caldera.misc.init.CalderamiscModItems;
import net.fsuardi.caldera.misc.init.CalderamiscModFluids;
import net.fsuardi.caldera.misc.init.CalderamiscModFluidTypes;
import net.fsuardi.caldera.misc.init.CalderamiscModBlocks;

public abstract class FanterFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> CalderamiscModFluidTypes.FANTER_TYPE.get(), () -> CalderamiscModFluids.FANTER.get(), () -> CalderamiscModFluids.FLOWING_FANTER.get())
			.explosionResistance(100f).tickRate(1).slopeFindDistance(1).bucket(() -> CalderamiscModItems.FANTER_BUCKET.get()).block(() -> (LiquidBlock) CalderamiscModBlocks.FANTER.get());

	private FanterFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.CRIT;
	}

	public static class Source extends FanterFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends FanterFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
